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

@OriginalClass("client!INVDQNJU")
public final class Class8_Sub1_Sub1_Sub3 extends Class8_Sub1_Sub1 {

	@OriginalMember(owner = "client!INVDQNJU", name = "C", descriptor = "I")
	private int anInt304 = -5004;

	@OriginalMember(owner = "client!INVDQNJU", name = "D", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!INVDQNJU", name = "E", descriptor = "I")
	private int anInt305 = 7;

	@OriginalMember(owner = "client!INVDQNJU", name = "F", descriptor = "I")
	private int anInt306 = 104;

	@OriginalMember(owner = "client!INVDQNJU", name = "G", descriptor = "I")
	private int anInt307 = 2;

	@OriginalMember(owner = "client!INVDQNJU", name = "H", descriptor = "I")
	private int anInt308 = 44822;

	@OriginalMember(owner = "client!INVDQNJU", name = "I", descriptor = "Z")
	private boolean aBoolean84 = false;

	@OriginalMember(owner = "client!INVDQNJU", name = "J", descriptor = "I")
	private int anInt309 = 1;

	@OriginalMember(owner = "client!INVDQNJU", name = "K", descriptor = "[I")
	public int[] anIntArray49;

	@OriginalMember(owner = "client!INVDQNJU", name = "P", descriptor = "I")
	public int anInt314;

	@OriginalMember(owner = "client!INVDQNJU", name = "L", descriptor = "I")
	public int anInt310;

	@OriginalMember(owner = "client!INVDQNJU", name = "Q", descriptor = "I")
	public int anInt315;

	@OriginalMember(owner = "client!INVDQNJU", name = "M", descriptor = "I")
	public int anInt311;

	@OriginalMember(owner = "client!INVDQNJU", name = "O", descriptor = "I")
	private int anInt313;

	@OriginalMember(owner = "client!INVDQNJU", name = "N", descriptor = "I")
	private int anInt312;

	@OriginalMember(owner = "client!INVDQNJU", name = "<init>", descriptor = "(II)V")
	public Class8_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray49 = new int[arg0 * arg1];
		this.anInt310 = this.anInt314 = arg0;
		this.anInt311 = this.anInt315 = arg1;
		this.anInt312 = this.anInt313 = 0;
	}

	@OriginalMember(owner = "client!INVDQNJU", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class8_Sub1_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(29) Image local29 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(34) MediaTracker local34 = new MediaTracker(arg1);
			local34.addImage(local29, 0);
			local34.waitForAll();
			this.anInt310 = local29.getWidth(arg1);
			this.anInt311 = local29.getHeight(arg1);
			this.anInt314 = this.anInt310;
			this.anInt315 = this.anInt311;
			this.anInt312 = 0;
			this.anInt313 = 0;
			this.anIntArray49 = new int[this.anInt310 * this.anInt311];
			@Pc(88) PixelGrabber local88 = new PixelGrabber(local29, 0, 0, this.anInt310, this.anInt311, this.anIntArray49, 0, this.anInt310);
			local88.grabPixels();
		} catch (@Pc(93) Exception local93) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!INVDQNJU", name = "<init>", descriptor = "(Lclient!XRWUKRPO;Ljava/lang/String;I)V")
	public Class8_Sub1_Sub1_Sub3(@OriginalArg(0) Class45 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(43) Class8_Sub1_Sub3 local43 = new Class8_Sub1_Sub3(arg0.method553(arg1 + ".dat", null), -49015);
		@Pc(52) Class8_Sub1_Sub3 local52 = new Class8_Sub1_Sub3(arg0.method553("index.dat", null), -49015);
		local52.anInt253 = local43.method167();
		this.anInt314 = local52.method167();
		this.anInt315 = local52.method167();
		@Pc(67) int local67 = local52.method165();
		@Pc(70) int[] local70 = new int[local67];
		for (@Pc(72) int local72 = 0; local72 < local67 - 1; local72++) {
			local70[local72 + 1] = local52.method169();
			if (local70[local72 + 1] == 0) {
				local70[local72 + 1] = 1;
			}
		}
		for (@Pc(107) int local107 = 0; local107 < arg2; local107++) {
			local52.anInt253 += 2;
			local43.anInt253 += local52.method167() * local52.method167();
			local52.anInt253++;
		}
		this.anInt312 = local52.method165();
		this.anInt313 = local52.method165();
		this.anInt310 = local52.method167();
		this.anInt311 = local52.method167();
		@Pc(154) int local154 = local52.method165();
		@Pc(160) int local160 = this.anInt310 * this.anInt311;
		this.anIntArray49 = new int[local160];
		@Pc(168) int local168;
		if (local154 == 0) {
			for (local168 = 0; local168 < local160; local168++) {
				this.anIntArray49[local168] = local70[local43.method165()];
			}
		} else if (local154 == 1) {
			for (local168 = 0; local168 < this.anInt310; local168++) {
				for (@Pc(192) int local192 = 0; local192 < this.anInt311; local192++) {
					this.anIntArray49[local168 + local192 * this.anInt310] = local70[local43.method165()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!INVDQNJU", name = "c", descriptor = "(I)V")
	public void method262() {
		try {
			Class8_Sub1_Sub1.method502(this.anInt311, this.anInt310, this.anIntArray49);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("13402, " + 1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!INVDQNJU", name = "a", descriptor = "(IIIB)V")
	public void method263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray49.length; local13++) {
				@Pc(20) int local20 = this.anIntArray49[local13];
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
					this.anIntArray49[local13] = (local28 << 16) + (local50 << 8) + local70;
				}
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("7877, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -77 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!INVDQNJU", name = "a", descriptor = "(Z)V")
	public void method264() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt314 * this.anInt315];
			for (@Pc(10) int local10 = 0; local10 < this.anInt311; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt310; local14++) {
					local8[(local10 + this.anInt313) * this.anInt314 + local14 + this.anInt312] = this.anIntArray49[local10 * this.anInt310 + local14];
				}
			}
			this.anIntArray49 = local8;
			this.anInt310 = this.anInt314;
			this.anInt311 = this.anInt315;
			this.anInt312 = 0;
			this.anInt313 = 0;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("40132, " + false + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!INVDQNJU", name = "a", descriptor = "(IIB)V")
	public void method265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt312;
			arg1 += this.anInt313;
			@Pc(19) int local19 = arg0 + arg1 * Class8_Sub1_Sub1.anInt734;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt311;
			@Pc(27) int local27 = this.anInt310;
			@Pc(31) int local31 = Class8_Sub1_Sub1.anInt734 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg1 < Class8_Sub1_Sub1.anInt736) {
				local40 = Class8_Sub1_Sub1.anInt736 - arg1;
				local24 -= local40;
				arg1 = Class8_Sub1_Sub1.anInt736;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class8_Sub1_Sub1.anInt734;
			}
			if (arg1 + local24 > Class8_Sub1_Sub1.anInt737) {
				local24 -= arg1 + local24 - Class8_Sub1_Sub1.anInt737;
			}
			if (arg0 < Class8_Sub1_Sub1.anInt738) {
				local40 = Class8_Sub1_Sub1.anInt738 - arg0;
				local27 -= local40;
				arg0 = Class8_Sub1_Sub1.anInt738;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg0 + local27 > Class8_Sub1_Sub1.anInt739) {
				local40 = arg0 + local27 - Class8_Sub1_Sub1.anInt739;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method266(Class8_Sub1_Sub1.anIntArray157, this.anIntArray49, local21, local31, local19, local27, local33, local24);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("24654, " + arg0 + ", " + arg1 + ", " + -73 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!INVDQNJU", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method266(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(6) int local6 = -(arg5 >> 2);
			@Pc(11) int local11 = -(arg5 & 0x3);
			for (@Pc(14) int local14 = -arg7; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					arg0[arg4++] = arg1[arg2++];
					arg0[arg4++] = arg1[arg2++];
					arg0[arg4++] = arg1[arg2++];
					arg0[arg4++] = arg1[arg2++];
				}
				for (@Pc(57) int local57 = local11; local57 < 0; local57++) {
					arg0[arg4++] = arg1[arg2++];
				}
				arg4 += arg3;
				arg2 += arg6;
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("76545, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 495 + ", " + arg7 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!INVDQNJU", name = "a", descriptor = "(III)V")
	public void method267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg0 += this.anInt312;
			arg2 += this.anInt313;
			@Pc(13) boolean local13 = false;
			@Pc(19) int local19 = arg0 + arg2 * Class8_Sub1_Sub1.anInt734;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt311;
			@Pc(27) int local27 = this.anInt310;
			@Pc(31) int local31 = Class8_Sub1_Sub1.anInt734 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg2 < Class8_Sub1_Sub1.anInt736) {
				local40 = Class8_Sub1_Sub1.anInt736 - arg2;
				local24 -= local40;
				arg2 = Class8_Sub1_Sub1.anInt736;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class8_Sub1_Sub1.anInt734;
			}
			if (arg2 + local24 > Class8_Sub1_Sub1.anInt737) {
				local24 -= arg2 + local24 - Class8_Sub1_Sub1.anInt737;
			}
			if (arg0 < Class8_Sub1_Sub1.anInt738) {
				local40 = Class8_Sub1_Sub1.anInt738 - arg0;
				local27 -= local40;
				arg0 = Class8_Sub1_Sub1.anInt738;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg0 + local27 > Class8_Sub1_Sub1.anInt739) {
				local40 = arg0 + local27 - Class8_Sub1_Sub1.anInt739;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method268(Class8_Sub1_Sub1.anIntArray157, this.anIntArray49, local21, local19, local27, local24, local31, local33);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("68989, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!INVDQNJU", name = "b", descriptor = "([I[IIIIIIII)V")
	private void method268(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!INVDQNJU", name = "a", descriptor = "(IIZI)V")
	public void method269(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		try {
			arg0 += this.anInt312;
			arg1 += this.anInt313;
			@Pc(15) int local15 = arg0 + arg1 * Class8_Sub1_Sub1.anInt734;
			@Pc(17) int local17 = 0;
			@Pc(30) int local30 = this.anInt311;
			@Pc(33) int local33 = this.anInt310;
			@Pc(37) int local37 = Class8_Sub1_Sub1.anInt734 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg1 < Class8_Sub1_Sub1.anInt736) {
				local46 = Class8_Sub1_Sub1.anInt736 - arg1;
				local30 -= local46;
				arg1 = Class8_Sub1_Sub1.anInt736;
				local17 = local46 * local33 + 0;
				local15 += local46 * Class8_Sub1_Sub1.anInt734;
			}
			if (arg1 + local30 > Class8_Sub1_Sub1.anInt737) {
				local30 -= arg1 + local30 - Class8_Sub1_Sub1.anInt737;
			}
			if (arg0 < Class8_Sub1_Sub1.anInt738) {
				local46 = Class8_Sub1_Sub1.anInt738 - arg0;
				local33 -= local46;
				arg0 = Class8_Sub1_Sub1.anInt738;
				local17 += local46;
				local15 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg0 + local33 > Class8_Sub1_Sub1.anInt739) {
				local46 = arg0 + local33 - Class8_Sub1_Sub1.anInt739;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method270(this.anIntArray49, Class8_Sub1_Sub1.anIntArray157, local39, local17, local33, 0, local15, local30, local37);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("47180, " + 128 + ", " + arg0 + ", " + true + ", " + arg1 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!INVDQNJU", name = "a", descriptor = "([I[IIIIIIIIII)V")
	private void method270(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(8) int local8 = -arg7; local8 < 0; local8++) {
				for (@Pc(13) int local13 = -arg4; local13 < 0; local13++) {
					@Pc(20) int local20 = arg0[arg3++];
					if (local20 == 0) {
						arg6++;
					} else {
						@Pc(26) int local26 = arg1[arg6];
						arg1[arg6++] = ((local20 & 0xFF00FF) * 128 + (local26 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local20 & 0xFF00) * 128 + (local26 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg6 += arg8;
				arg3 += arg2;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("51975, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 197 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 128 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!INVDQNJU", name = "a", descriptor = "([IIIIII[IIIII)V")
	public void method271(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(12) int local12 = -arg9 / 2;
				@Pc(17) int local17 = -arg3 / 2;
				@Pc(26) int local26 = (int) (Math.sin((double) arg4 / 326.11D) * 65536.0D);
				@Pc(35) int local35 = (int) (Math.cos((double) arg4 / 326.11D) * 65536.0D);
				@Pc(41) int local41 = local26 * arg6 >> 8;
				@Pc(47) int local47 = local35 * arg6 >> 8;
				@Pc(59) int local59 = (arg2 << 16) + local17 * local41 + local12 * local47;
				@Pc(71) int local71 = (arg7 << 16) + (local17 * local47 - local12 * local41);
				@Pc(77) int local77 = arg8 + arg1 * Class8_Sub1_Sub1.anInt734;
				for (@Pc(79) int local79 = 0; local79 < arg3; local79++) {
					@Pc(85) int local85 = arg0[local79];
					@Pc(89) int local89 = local77 + local85;
					@Pc(95) int local95 = local59 + local47 * local85;
					@Pc(101) int local101 = local71 - local41 * local85;
					for (@Pc(106) int local106 = -arg5[local79]; local106 < 0; local106++) {
						Class8_Sub1_Sub1.anIntArray157[local89++] = this.anIntArray49[(local95 >> 16) + (local101 >> 16) * this.anInt310];
						local95 += local47;
						local101 -= local41;
					}
					local59 += local41;
					local71 += local47;
					local77 += Class8_Sub1_Sub1.anInt734;
				}
			} catch (@Pc(154) Exception local154) {
			}
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("78210, " + arg0 + ", " + arg1 + ", " + 1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!INVDQNJU", name = "a", descriptor = "(IIIIIDIII)V")
	public void method272(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) double arg2) {
		try {
			if (this.anInt307 != 2) {
				this.anInt307 = 125;
			}
			try {
				@Pc(24) int local24 = (int) (Math.sin(arg2) * 65536.0D);
				@Pc(30) int local30 = (int) (Math.cos(arg2) * 65536.0D);
				@Pc(36) int local36 = local24 * 256 >> 8;
				@Pc(42) int local42 = local30 * 256 >> 8;
				@Pc(54) int local54 = local36 * -10 + local42 * -10 + 983040;
				@Pc(66) int local66 = local42 * -10 + 983040 - local36 * -10;
				@Pc(72) int local72 = arg0 + arg1 * Class8_Sub1_Sub1.anInt734;
				for (@Pc(74) int local74 = 0; local74 < 20; local74++) {
					@Pc(78) int local78 = local72;
					@Pc(80) int local80 = local54;
					@Pc(82) int local82 = local66;
					for (@Pc(85) int local85 = -20; local85 < 0; local85++) {
						@Pc(101) int local101 = this.anIntArray49[(local80 >> 16) + (local82 >> 16) * this.anInt310];
						if (local101 == 0) {
							local78++;
						} else {
							Class8_Sub1_Sub1.anIntArray157[local78++] = local101;
						}
						local80 += local42;
						local82 -= local36;
					}
					local54 += local36;
					local66 += local42;
					local72 += Class8_Sub1_Sub1.anInt734;
				}
			} catch (@Pc(140) Exception local140) {
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("16959, " + 20 + ", " + 256 + ", " + arg0 + ", " + 2 + ", " + arg1 + ", " + arg2 + ", " + 20 + ", " + 15 + ", " + 15 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!INVDQNJU", name = "a", descriptor = "(Lclient!VUMXQDFQ;IIZ)V")
	public void method273(@OriginalArg(0) Class8_Sub1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg1 += this.anInt312;
			arg2 += this.anInt313;
			@Pc(20) int local20 = arg1 + arg2 * Class8_Sub1_Sub1.anInt734;
			@Pc(22) int local22 = 0;
			@Pc(25) int local25 = this.anInt311;
			@Pc(28) int local28 = this.anInt310;
			@Pc(32) int local32 = Class8_Sub1_Sub1.anInt734 - local28;
			@Pc(34) int local34 = 0;
			@Pc(41) int local41;
			if (arg2 < Class8_Sub1_Sub1.anInt736) {
				local41 = Class8_Sub1_Sub1.anInt736 - arg2;
				local25 -= local41;
				arg2 = Class8_Sub1_Sub1.anInt736;
				local22 = local41 * local28 + 0;
				local20 += local41 * Class8_Sub1_Sub1.anInt734;
			}
			if (arg2 + local25 > Class8_Sub1_Sub1.anInt737) {
				local25 -= arg2 + local25 - Class8_Sub1_Sub1.anInt737;
			}
			if (arg1 < Class8_Sub1_Sub1.anInt738) {
				local41 = Class8_Sub1_Sub1.anInt738 - arg1;
				local28 -= local41;
				arg1 = Class8_Sub1_Sub1.anInt738;
				local22 += local41;
				local20 += local41;
				local34 = local41 + 0;
				local32 += local41;
			}
			if (arg1 + local28 > Class8_Sub1_Sub1.anInt739) {
				local41 = arg1 + local28 - Class8_Sub1_Sub1.anInt739;
				local28 -= local41;
				local34 += local41;
				local32 += local41;
			}
			if (local28 > 0 && local25 > 0) {
				this.method274(0, Class8_Sub1_Sub1.anIntArray157, local28, local25, arg0.aByteArray18, local22, this.anIntArray49, local34, local20, local32);
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("62559, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!INVDQNJU", name = "a", descriptor = "(I[IIII[BI[IIII)V")
	private void method274(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(6) int local6 = -(arg2 >> 2);
			@Pc(11) int local11 = -(arg2 & 0x3);
			if (this.anInt308 != 44822) {
				this.anInt306 = 430;
			}
			for (@Pc(21) int local21 = -arg3; local21 < 0; local21++) {
				@Pc(32) int local32;
				for (@Pc(25) int local25 = local6; local25 < 0; local25++) {
					local32 = arg6[arg5++];
					if (local32 != 0 && arg4[arg8] == 0) {
						arg1[arg8++] = local32;
					} else {
						arg8++;
					}
					local32 = arg6[arg5++];
					if (local32 != 0 && arg4[arg8] == 0) {
						arg1[arg8++] = local32;
					} else {
						arg8++;
					}
					local32 = arg6[arg5++];
					if (local32 != 0 && arg4[arg8] == 0) {
						arg1[arg8++] = local32;
					} else {
						arg8++;
					}
					local32 = arg6[arg5++];
					if (local32 != 0 && arg4[arg8] == 0) {
						arg1[arg8++] = local32;
					} else {
						arg8++;
					}
				}
				for (@Pc(108) int local108 = local11; local108 < 0; local108++) {
					local32 = arg6[arg5++];
					if (local32 != 0 && arg4[arg8] == 0) {
						arg1[arg8++] = local32;
					} else {
						arg8++;
					}
				}
				arg8 += arg9;
				arg5 += arg7;
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("35014, " + arg0 + ", " + arg1 + ", " + 44822 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}
}
