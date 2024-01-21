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

	@OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
	private int anInt626;

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
	private int anInt620 = 1525;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
	private int anInt621 = 864;

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "Z")
	private boolean aBoolean172 = false;

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "Z")
	private boolean aBoolean173 = false;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "B")
	private byte aByte25 = 5;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
	private int anInt622 = 545;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
	private int anInt623 = 8;

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
	private int anInt624 = 8;

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
	private int anInt625 = -957;

	@OriginalMember(owner = "client!ib", name = "K", descriptor = "Z")
	private boolean aBoolean174 = false;

	@OriginalMember(owner = "client!ib", name = "L", descriptor = "[I")
	public int[] anIntArray208;

	@OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
	public int anInt631;

	@OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
	public int anInt627;

	@OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
	public int anInt632;

	@OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
	public int anInt628;

	@OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
	private int anInt630;

	@OriginalMember(owner = "client!ib", name = "O", descriptor = "I")
	private int anInt629;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray208 = new int[arg0 * arg1];
		this.anInt627 = this.anInt631 = arg0;
		this.anInt628 = this.anInt632 = arg1;
		this.anInt629 = this.anInt630 = 0;
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(35) Image local35 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(40) MediaTracker local40 = new MediaTracker(arg1);
			local40.addImage(local35, 0);
			local40.waitForAll();
			this.anInt627 = local35.getWidth(arg1);
			this.anInt628 = local35.getHeight(arg1);
			this.anInt631 = this.anInt627;
			this.anInt632 = this.anInt628;
			this.anInt629 = 0;
			this.anInt630 = 0;
			this.anIntArray208 = new int[this.anInt627 * this.anInt628];
			@Pc(94) PixelGrabber local94 = new PixelGrabber(local35, 0, 0, this.anInt627, this.anInt628, this.anIntArray208, 0, this.anInt627);
			local94.grabPixels();
		} catch (@Pc(99) Exception local99) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!xb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) Class47 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(49) Class1_Sub1_Sub3 local49 = new Class1_Sub1_Sub3(arg0.method666(arg1 + ".dat", null), (byte) -93);
		@Pc(58) Class1_Sub1_Sub3 local58 = new Class1_Sub1_Sub3(arg0.method666("index.dat", null), (byte) -93);
		local58.anInt720 = local49.method482();
		this.anInt631 = local58.method482();
		this.anInt632 = local58.method482();
		@Pc(73) int local73 = local58.method480();
		@Pc(76) int[] local76 = new int[local73];
		for (@Pc(78) int local78 = 0; local78 < local73 - 1; local78++) {
			local76[local78 + 1] = local58.method484();
			if (local76[local78 + 1] == 0) {
				local76[local78 + 1] = 1;
			}
		}
		for (@Pc(113) int local113 = 0; local113 < arg2; local113++) {
			local58.anInt720 += 2;
			local49.anInt720 += local58.method482() * local58.method482();
			local58.anInt720++;
		}
		this.anInt629 = local58.method480();
		this.anInt630 = local58.method480();
		this.anInt627 = local58.method482();
		this.anInt628 = local58.method482();
		@Pc(160) int local160 = local58.method480();
		@Pc(166) int local166 = this.anInt627 * this.anInt628;
		this.anIntArray208 = new int[local166];
		@Pc(174) int local174;
		if (local160 == 0) {
			for (local174 = 0; local174 < local166; local174++) {
				this.anIntArray208[local174] = local76[local49.method480()];
			}
		} else if (local160 == 1) {
			for (local174 = 0; local174 < this.anInt627; local174++) {
				for (@Pc(198) int local198 = 0; local198 < this.anInt628; local198++) {
					this.anIntArray208[local174 + local198 * this.anInt627] = local76[local49.method480()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	public void method386(@OriginalArg(0) int arg0) {
		try {
			Class1_Sub1_Sub2.method434(this.anInt627, this.anInt628, (byte) 7, this.anIntArray208);
			if (arg0 < 1 || arg0 > 1) {
				this.anInt626 = -2;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("12876, " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V")
	public void method387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray208.length; local12++) {
				@Pc(19) int local19 = this.anIntArray208[local12];
				if (local19 != 0) {
					@Pc(27) int local27 = local19 >> 16 & 0xFF;
					local27 += arg2;
					if (local27 < 1) {
						local27 = 1;
					} else if (local27 > 255) {
						local27 = 255;
					}
					@Pc(49) int local49 = local19 >> 8 & 0xFF;
					local49 += arg0;
					if (local49 < 1) {
						local49 = 1;
					} else if (local49 > 255) {
						local49 = 255;
					}
					@Pc(69) int local69 = local19 & 0xFF;
					local69 += arg1;
					if (local69 < 1) {
						local69 = 1;
					} else if (local69 > 255) {
						local69 = 255;
					}
					this.anIntArray208[local12] = (local27 << 16) + (local49 << 8) + local69;
				}
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("51736, " + arg0 + ", " + arg1 + ", " + 3 + ", " + arg2 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)V")
	public void method388() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt631 * this.anInt632];
			for (@Pc(10) int local10 = 0; local10 < this.anInt628; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt627; local14++) {
					local8[(local10 + this.anInt630) * this.anInt631 + local14 + this.anInt629] = this.anIntArray208[local10 * this.anInt627 + local14];
				}
			}
			this.anIntArray208 = local8;
			this.anInt627 = this.anInt631;
			this.anInt628 = this.anInt632;
			this.anInt629 = 0;
			this.anInt630 = 0;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("59359, " + true + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIZ)V")
	public void method389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt629;
			arg1 += this.anInt630;
			@Pc(24) int local24 = arg0 + arg1 * Class1_Sub1_Sub2.anInt675;
			@Pc(26) int local26 = 0;
			@Pc(29) int local29 = this.anInt628;
			@Pc(32) int local32 = this.anInt627;
			@Pc(36) int local36 = Class1_Sub1_Sub2.anInt675 - local32;
			@Pc(38) int local38 = 0;
			@Pc(45) int local45;
			if (arg1 < Class1_Sub1_Sub2.anInt677) {
				local45 = Class1_Sub1_Sub2.anInt677 - arg1;
				local29 -= local45;
				arg1 = Class1_Sub1_Sub2.anInt677;
				local26 = local45 * local32 + 0;
				local24 += local45 * Class1_Sub1_Sub2.anInt675;
			}
			if (arg1 + local29 > Class1_Sub1_Sub2.anInt678) {
				local29 -= arg1 + local29 - Class1_Sub1_Sub2.anInt678;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt679) {
				local45 = Class1_Sub1_Sub2.anInt679 - arg0;
				local32 -= local45;
				arg0 = Class1_Sub1_Sub2.anInt679;
				local26 += local45;
				local24 += local45;
				local38 = local45 + 0;
				local36 += local45;
			}
			if (arg0 + local32 > Class1_Sub1_Sub2.anInt680) {
				local45 = arg0 + local32 - Class1_Sub1_Sub2.anInt680;
				local32 -= local45;
				local38 += local45;
				local36 += local45;
			}
			if (local32 > 0 && local29 > 0) {
				this.method390(local24, local26, this.anIntArray208, local32, local29, Class1_Sub1_Sub2.anIntArray213, local36, local38);
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("28907, " + arg0 + ", " + arg1 + ", " + true + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIZ[III[III)V")
	private void method390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(6) int local6 = -(arg3 >> 2);
			@Pc(21) int local21 = -(arg3 & 0x3);
			for (@Pc(24) int local24 = -arg4; local24 < 0; local24++) {
				for (@Pc(28) int local28 = local6; local28 < 0; local28++) {
					arg5[arg0++] = arg2[arg1++];
					arg5[arg0++] = arg2[arg1++];
					arg5[arg0++] = arg2[arg1++];
					arg5[arg0++] = arg2[arg1++];
				}
				for (@Pc(67) int local67 = local21; local67 < 0; local67++) {
					arg5[arg0++] = arg2[arg1++];
				}
				arg0 += arg6;
				arg1 += arg7;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("57524, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	public void method391(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt629;
			arg1 += this.anInt630;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt675;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt628;
			@Pc(23) int local23 = this.anInt627;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt675 - local23;
			@Pc(29) int local29 = 0;
			@Pc(45) int local45;
			if (arg1 < Class1_Sub1_Sub2.anInt677) {
				local45 = Class1_Sub1_Sub2.anInt677 - arg1;
				local20 -= local45;
				arg1 = Class1_Sub1_Sub2.anInt677;
				local17 = local45 * local23 + 0;
				local15 += local45 * Class1_Sub1_Sub2.anInt675;
			}
			if (arg1 + local20 > Class1_Sub1_Sub2.anInt678) {
				local20 -= arg1 + local20 - Class1_Sub1_Sub2.anInt678;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt679) {
				local45 = Class1_Sub1_Sub2.anInt679 - arg0;
				local23 -= local45;
				arg0 = Class1_Sub1_Sub2.anInt679;
				local17 += local45;
				local15 += local45;
				local29 = local45 + 0;
				local27 += local45;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt680) {
				local45 = arg0 + local23 - Class1_Sub1_Sub2.anInt680;
				local23 -= local45;
				local29 += local45;
				local27 += local45;
			}
			if (local23 > 0 && local20 > 0) {
				this.method392(Class1_Sub1_Sub2.anIntArray213, this.anIntArray208, local17, local15, local23, local20, local27, local29);
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("61247, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method392(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(IIII)V")
	public void method393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg1 += this.anInt629;
			arg0 += this.anInt630;
			@Pc(21) int local21 = arg1 + arg0 * Class1_Sub1_Sub2.anInt675;
			@Pc(23) int local23 = 0;
			@Pc(26) int local26 = this.anInt628;
			@Pc(29) int local29 = this.anInt627;
			@Pc(33) int local33 = Class1_Sub1_Sub2.anInt675 - local29;
			@Pc(35) int local35 = 0;
			@Pc(42) int local42;
			if (arg0 < Class1_Sub1_Sub2.anInt677) {
				local42 = Class1_Sub1_Sub2.anInt677 - arg0;
				local26 -= local42;
				arg0 = Class1_Sub1_Sub2.anInt677;
				local23 = local42 * local29 + 0;
				local21 += local42 * Class1_Sub1_Sub2.anInt675;
			}
			if (arg0 + local26 > Class1_Sub1_Sub2.anInt678) {
				local26 -= arg0 + local26 - Class1_Sub1_Sub2.anInt678;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt679) {
				local42 = Class1_Sub1_Sub2.anInt679 - arg1;
				local29 -= local42;
				arg1 = Class1_Sub1_Sub2.anInt679;
				local23 += local42;
				local21 += local42;
				local35 = local42 + 0;
				local33 += local42;
			}
			if (arg1 + local29 > Class1_Sub1_Sub2.anInt680) {
				local42 = arg1 + local29 - Class1_Sub1_Sub2.anInt680;
				local29 -= local42;
				local35 += local42;
				local33 += local42;
			}
			if (local29 > 0 && local26 > 0) {
				this.method394(local33, local21, 0, local23, Class1_Sub1_Sub2.anIntArray213, this.anIntArray208, local35, local26, local29);
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("80920, " + arg0 + ", " + arg1 + ", " + 7 + ", " + 128 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII[I[IIIIII)V")
	private void method394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(11) int local11 = -arg7; local11 < 0; local11++) {
				for (@Pc(16) int local16 = -arg8; local16 < 0; local16++) {
					@Pc(23) int local23 = arg5[arg3++];
					if (local23 == 0) {
						arg1++;
					} else {
						@Pc(29) int local29 = arg4[arg1];
						arg4[arg1++] = ((local23 & 0xFF00FF) * 128 + (local29 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local23 & 0xFF00) * 128 + (local29 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg1 += arg0;
				arg3 += arg6;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("7054, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 0 + ", " + arg7 + ", " + arg8 + ", " + 128 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III[IB[IIIIII)V")
	public void method395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(10) int local10 = -arg5 / 2;
				@Pc(15) int local15 = -arg2 / 2;
				@Pc(24) int local24 = (int) (Math.sin((double) arg7 / 326.11D) * 65536.0D);
				@Pc(33) int local33 = (int) (Math.cos((double) arg7 / 326.11D) * 65536.0D);
				@Pc(39) int local39 = local24 * arg6 >> 8;
				@Pc(45) int local45 = local33 * arg6 >> 8;
				@Pc(57) int local57 = (arg9 << 16) + local15 * local39 + local10 * local45;
				@Pc(69) int local69 = (arg8 << 16) + (local15 * local45 - local10 * local39);
				@Pc(75) int local75 = arg1 + arg0 * Class1_Sub1_Sub2.anInt675;
				for (@Pc(77) int local77 = 0; local77 < arg2; local77++) {
					@Pc(83) int local83 = arg4[local77];
					@Pc(87) int local87 = local75 + local83;
					@Pc(93) int local93 = local57 + local45 * local83;
					@Pc(99) int local99 = local69 - local39 * local83;
					for (@Pc(104) int local104 = -arg3[local77]; local104 < 0; local104++) {
						Class1_Sub1_Sub2.anIntArray213[local87++] = this.anIntArray208[(local93 >> 16) + (local99 >> 16) * this.anInt627];
						local93 += local45;
						local99 -= local39;
					}
					local57 += local39;
					local69 += local45;
					local75 += Class1_Sub1_Sub2.anInt675;
				}
			} catch (@Pc(152) Exception local152) {
			}
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("47884, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 6 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIDIII)V")
	public void method396(@OriginalArg(5) double arg0, @OriginalArg(7) int arg1, @OriginalArg(8) int arg2) {
		try {
			try {
				@Pc(27) int local27 = (int) (Math.sin(arg0) * 65536.0D);
				@Pc(33) int local33 = (int) (Math.cos(arg0) * 65536.0D);
				@Pc(39) int local39 = local27 * 256 >> 8;
				@Pc(45) int local45 = local33 * 256 >> 8;
				@Pc(57) int local57 = local39 * -10 + local45 * -10 + 983040;
				@Pc(69) int local69 = local45 * -10 + 983040 - local39 * -10;
				@Pc(75) int local75 = arg1 + arg2 * Class1_Sub1_Sub2.anInt675;
				for (@Pc(77) int local77 = 0; local77 < 20; local77++) {
					@Pc(81) int local81 = local75;
					@Pc(83) int local83 = local57;
					@Pc(85) int local85 = local69;
					for (@Pc(88) int local88 = -20; local88 < 0; local88++) {
						@Pc(104) int local104 = this.anIntArray208[(local83 >> 16) + (local85 >> 16) * this.anInt627];
						if (local104 == 0) {
							local81++;
						} else {
							Class1_Sub1_Sub2.anIntArray213[local81++] = local104;
						}
						local83 += local45;
						local85 -= local39;
					}
					local57 += local39;
					local69 += local45;
					local75 += Class1_Sub1_Sub2.anInt675;
				}
			} catch (@Pc(143) Exception local143) {
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("40048, " + 256 + ", " + 20 + ", " + 859 + ", " + 20 + ", " + 15 + ", " + arg0 + ", " + 15 + ", " + arg1 + ", " + arg2 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIILclient!jb;)V")
	public void method397(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub2_Sub3 arg2) {
		try {
			arg0 += this.anInt629;
			arg1 += this.anInt630;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt675;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt628;
			@Pc(23) int local23 = this.anInt627;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt675 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class1_Sub1_Sub2.anInt677) {
				local36 = Class1_Sub1_Sub2.anInt677 - arg1;
				local20 -= local36;
				arg1 = Class1_Sub1_Sub2.anInt677;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub1_Sub2.anInt675;
			}
			if (arg1 + local20 > Class1_Sub1_Sub2.anInt678) {
				local20 -= arg1 + local20 - Class1_Sub1_Sub2.anInt678;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt679) {
				local36 = Class1_Sub1_Sub2.anInt679 - arg0;
				local23 -= local36;
				arg0 = Class1_Sub1_Sub2.anInt679;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt680) {
				local36 = arg0 + local23 - Class1_Sub1_Sub2.anInt680;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method398(local20, this.anInt625, local27, local29, local17, this.anIntArray208, 0, arg2.aByteArray7, Class1_Sub1_Sub2.anIntArray213, local23, local15);
			}
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("95028, " + arg0 + ", " + 4 + ", " + arg1 + ", " + arg2 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII[II[B[III)V")
	private void method398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(6) int local6 = -(arg9 >> 2);
			@Pc(11) int local11 = -(arg9 & 0x3);
			for (@Pc(14) int local14 = -arg0; local14 < 0; local14++) {
				@Pc(25) int local25;
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					local25 = arg5[arg4++];
					if (local25 != 0 && arg7[arg10] == 0) {
						arg8[arg10++] = local25;
					} else {
						arg10++;
					}
					local25 = arg5[arg4++];
					if (local25 != 0 && arg7[arg10] == 0) {
						arg8[arg10++] = local25;
					} else {
						arg10++;
					}
					local25 = arg5[arg4++];
					if (local25 != 0 && arg7[arg10] == 0) {
						arg8[arg10++] = local25;
					} else {
						arg10++;
					}
					local25 = arg5[arg4++];
					if (local25 != 0 && arg7[arg10] == 0) {
						arg8[arg10++] = local25;
					} else {
						arg10++;
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					local25 = arg5[arg4++];
					if (local25 != 0 && arg7[arg10] == 0) {
						arg8[arg10++] = local25;
					} else {
						arg10++;
					}
				}
				arg10 += arg2;
				arg4 += arg3;
			}
			if (arg1 < 0) {
				;
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("47944, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}
}
