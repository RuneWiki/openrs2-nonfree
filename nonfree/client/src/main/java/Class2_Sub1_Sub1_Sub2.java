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

@OriginalClass("client!BISLJVZR")
public final class Class2_Sub1_Sub1_Sub2 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!BISLJVZR", name = "z", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!BISLJVZR", name = "B", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!BISLJVZR", name = "C", descriptor = "I")
	private int anInt59 = 4;

	@OriginalMember(owner = "client!BISLJVZR", name = "D", descriptor = "Z")
	private boolean aBoolean38 = false;

	@OriginalMember(owner = "client!BISLJVZR", name = "E", descriptor = "I")
	private int anInt60 = 39072;

	@OriginalMember(owner = "client!BISLJVZR", name = "F", descriptor = "B")
	private byte aByte10 = 1;

	@OriginalMember(owner = "client!BISLJVZR", name = "G", descriptor = "Z")
	private boolean aBoolean39 = false;

	@OriginalMember(owner = "client!BISLJVZR", name = "H", descriptor = "[I")
	public int[] anIntArray10;

	@OriginalMember(owner = "client!BISLJVZR", name = "M", descriptor = "I")
	public int anInt65;

	@OriginalMember(owner = "client!BISLJVZR", name = "I", descriptor = "I")
	public int anInt61;

	@OriginalMember(owner = "client!BISLJVZR", name = "N", descriptor = "I")
	public int anInt66;

	@OriginalMember(owner = "client!BISLJVZR", name = "J", descriptor = "I")
	public int anInt62;

	@OriginalMember(owner = "client!BISLJVZR", name = "L", descriptor = "I")
	private int anInt64;

	@OriginalMember(owner = "client!BISLJVZR", name = "K", descriptor = "I")
	private int anInt63;

	@OriginalMember(owner = "client!BISLJVZR", name = "<init>", descriptor = "(II)V")
	public Class2_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray10 = new int[arg0 * arg1];
		this.anInt61 = this.anInt65 = arg0;
		this.anInt62 = this.anInt66 = arg1;
		this.anInt63 = this.anInt64 = 0;
	}

	@OriginalMember(owner = "client!BISLJVZR", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class2_Sub1_Sub1_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(26) Image local26 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(31) MediaTracker local31 = new MediaTracker(arg1);
			local31.addImage(local26, 0);
			local31.waitForAll();
			this.anInt61 = local26.getWidth(arg1);
			this.anInt62 = local26.getHeight(arg1);
			this.anInt65 = this.anInt61;
			this.anInt66 = this.anInt62;
			this.anInt63 = 0;
			this.anInt64 = 0;
			this.anIntArray10 = new int[this.anInt61 * this.anInt62];
			@Pc(85) PixelGrabber local85 = new PixelGrabber(local26, 0, 0, this.anInt61, this.anInt62, this.anIntArray10, 0, this.anInt61);
			local85.grabPixels();
		} catch (@Pc(90) Exception local90) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!BISLJVZR", name = "<init>", descriptor = "(Lclient!SMIVAFST;Ljava/lang/String;I)V")
	public Class2_Sub1_Sub1_Sub2(@OriginalArg(0) Class35 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(40) Class2_Sub1_Sub2 local40 = new Class2_Sub1_Sub2(arg0.method485(arg1 + ".dat", null), (byte) 3);
		@Pc(49) Class2_Sub1_Sub2 local49 = new Class2_Sub1_Sub2(arg0.method485("index.dat", null), (byte) 3);
		local49.anInt81 = local40.method96();
		this.anInt65 = local49.method96();
		this.anInt66 = local49.method96();
		@Pc(64) int local64 = local49.method94();
		@Pc(67) int[] local67 = new int[local64];
		for (@Pc(69) int local69 = 0; local69 < local64 - 1; local69++) {
			local67[local69 + 1] = local49.method98();
			if (local67[local69 + 1] == 0) {
				local67[local69 + 1] = 1;
			}
		}
		for (@Pc(104) int local104 = 0; local104 < arg2; local104++) {
			local49.anInt81 += 2;
			local40.anInt81 += local49.method96() * local49.method96();
			local49.anInt81++;
		}
		this.anInt63 = local49.method94();
		this.anInt64 = local49.method94();
		this.anInt61 = local49.method96();
		this.anInt62 = local49.method96();
		@Pc(151) int local151 = local49.method94();
		@Pc(157) int local157 = this.anInt61 * this.anInt62;
		this.anIntArray10 = new int[local157];
		@Pc(165) int local165;
		if (local151 == 0) {
			for (local165 = 0; local165 < local157; local165++) {
				this.anIntArray10[local165] = local67[local40.method94()];
			}
		} else if (local151 == 1) {
			for (local165 = 0; local165 < this.anInt61; local165++) {
				for (@Pc(189) int local189 = 0; local189 < this.anInt62; local189++) {
					this.anIntArray10[local165 + local189 * this.anInt61] = local67[local40.method94()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!BISLJVZR", name = "b", descriptor = "(I)V")
	public void method64(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			Class2_Sub1_Sub1.method273(this.anIntArray10, this.anInt62, this.anInt61);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("49961, " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISLJVZR", name = "a", descriptor = "(IIIZ)V")
	public void method65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray10.length; local3++) {
				@Pc(10) int local10 = this.anIntArray10[local3];
				if (local10 != 0) {
					@Pc(18) int local18 = local10 >> 16 & 0xFF;
					local18 += arg0;
					if (local18 < 1) {
						local18 = 1;
					} else if (local18 > 255) {
						local18 = 255;
					}
					@Pc(40) int local40 = local10 >> 8 & 0xFF;
					local40 += arg2;
					if (local40 < 1) {
						local40 = 1;
					} else if (local40 > 255) {
						local40 = 255;
					}
					@Pc(60) int local60 = local10 & 0xFF;
					local60 += arg1;
					if (local60 < 1) {
						local60 = 1;
					} else if (local60 > 255) {
						local60 = 255;
					}
					this.anIntArray10[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("72237, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISLJVZR", name = "c", descriptor = "(I)V")
	public void method66() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt65 * this.anInt66];
			for (@Pc(20) int local20 = 0; local20 < this.anInt62; local20++) {
				for (@Pc(24) int local24 = 0; local24 < this.anInt61; local24++) {
					local8[(local20 + this.anInt64) * this.anInt65 + local24 + this.anInt63] = this.anIntArray10[local20 * this.anInt61 + local24];
				}
			}
			this.anIntArray10 = local8;
			this.anInt61 = this.anInt65;
			this.anInt62 = this.anInt66;
			this.anInt63 = 0;
			this.anInt64 = 0;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("27379, " + 0 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISLJVZR", name = "a", descriptor = "(III)V")
	public void method67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			arg2 += this.anInt63;
			arg0 += this.anInt64;
			@Pc(19) int local19 = arg2 + arg0 * Class2_Sub1_Sub1.anInt281;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt62;
			@Pc(27) int local27 = this.anInt61;
			@Pc(31) int local31 = Class2_Sub1_Sub1.anInt281 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg0 < Class2_Sub1_Sub1.anInt283) {
				local40 = Class2_Sub1_Sub1.anInt283 - arg0;
				local24 -= local40;
				arg0 = Class2_Sub1_Sub1.anInt283;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class2_Sub1_Sub1.anInt281;
			}
			if (arg0 + local24 > Class2_Sub1_Sub1.anInt284) {
				local24 -= arg0 + local24 - Class2_Sub1_Sub1.anInt284;
			}
			if (arg2 < Class2_Sub1_Sub1.anInt285) {
				local40 = Class2_Sub1_Sub1.anInt285 - arg2;
				local27 -= local40;
				arg2 = Class2_Sub1_Sub1.anInt285;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg2 + local27 > Class2_Sub1_Sub1.anInt286) {
				local40 = arg2 + local27 - Class2_Sub1_Sub1.anInt286;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method68(local31, local33, local27, local21, local19, this.anIntArray10, local24, Class2_Sub1_Sub1.anIntArray68);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("6223, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISLJVZR", name = "a", descriptor = "(IIIIII[II[I)V")
	private void method68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7) {
		try {
			@Pc(16) int local16 = -(arg2 >> 2);
			@Pc(21) int local21 = -(arg2 & 0x3);
			for (@Pc(24) int local24 = -arg6; local24 < 0; local24++) {
				for (@Pc(28) int local28 = local16; local28 < 0; local28++) {
					arg7[arg4++] = arg5[arg3++];
					arg7[arg4++] = arg5[arg3++];
					arg7[arg4++] = arg5[arg3++];
					arg7[arg4++] = arg5[arg3++];
				}
				for (@Pc(67) int local67 = local21; local67 < 0; local67++) {
					arg7[arg4++] = arg5[arg3++];
				}
				arg4 += arg0;
				arg3 += arg1;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("96330, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 4313 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISLJVZR", name = "a", descriptor = "(IBI)V")
	public void method69(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt63;
			arg0 += this.anInt64;
			@Pc(15) int local15 = arg1 + arg0 * Class2_Sub1_Sub1.anInt281;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt62;
			@Pc(23) int local23 = this.anInt61;
			@Pc(27) int local27 = Class2_Sub1_Sub1.anInt281 - local23;
			@Pc(29) int local29 = 0;
			@Pc(50) int local50;
			if (arg0 < Class2_Sub1_Sub1.anInt283) {
				local50 = Class2_Sub1_Sub1.anInt283 - arg0;
				local20 -= local50;
				arg0 = Class2_Sub1_Sub1.anInt283;
				local17 = local50 * local23 + 0;
				local15 += local50 * Class2_Sub1_Sub1.anInt281;
			}
			if (arg0 + local20 > Class2_Sub1_Sub1.anInt284) {
				local20 -= arg0 + local20 - Class2_Sub1_Sub1.anInt284;
			}
			if (arg1 < Class2_Sub1_Sub1.anInt285) {
				local50 = Class2_Sub1_Sub1.anInt285 - arg1;
				local23 -= local50;
				arg1 = Class2_Sub1_Sub1.anInt285;
				local17 += local50;
				local15 += local50;
				local29 = local50 + 0;
				local27 += local50;
			}
			if (arg1 + local23 > Class2_Sub1_Sub1.anInt286) {
				local50 = arg1 + local23 - Class2_Sub1_Sub1.anInt286;
				local23 -= local50;
				local29 += local50;
				local27 += local50;
			}
			if (local23 > 0 && local20 > 0) {
				this.method70(Class2_Sub1_Sub1.anIntArray68, this.anIntArray10, local17, local15, local23, local20, local27, local29);
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("37879, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISLJVZR", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method70(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!BISLJVZR", name = "a", descriptor = "(IIZI)V")
	public void method71(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		try {
			arg1 += this.anInt63;
			arg0 += this.anInt64;
			@Pc(24) int local24 = arg1 + arg0 * Class2_Sub1_Sub1.anInt281;
			@Pc(26) int local26 = 0;
			@Pc(29) int local29 = this.anInt62;
			@Pc(32) int local32 = this.anInt61;
			@Pc(36) int local36 = Class2_Sub1_Sub1.anInt281 - local32;
			@Pc(38) int local38 = 0;
			@Pc(45) int local45;
			if (arg0 < Class2_Sub1_Sub1.anInt283) {
				local45 = Class2_Sub1_Sub1.anInt283 - arg0;
				local29 -= local45;
				arg0 = Class2_Sub1_Sub1.anInt283;
				local26 = local45 * local32 + 0;
				local24 += local45 * Class2_Sub1_Sub1.anInt281;
			}
			if (arg0 + local29 > Class2_Sub1_Sub1.anInt284) {
				local29 -= arg0 + local29 - Class2_Sub1_Sub1.anInt284;
			}
			if (arg1 < Class2_Sub1_Sub1.anInt285) {
				local45 = Class2_Sub1_Sub1.anInt285 - arg1;
				local32 -= local45;
				arg1 = Class2_Sub1_Sub1.anInt285;
				local26 += local45;
				local24 += local45;
				local38 = local45 + 0;
				local36 += local45;
			}
			if (arg1 + local32 > Class2_Sub1_Sub1.anInt286) {
				local45 = arg1 + local32 - Class2_Sub1_Sub1.anInt286;
				local32 -= local45;
				local38 += local45;
				local36 += local45;
			}
			if (local32 > 0 && local29 > 0) {
				this.method72(local24, local26, Class2_Sub1_Sub1.anIntArray68, local32, local38, local36, this.anIntArray10, 0, local29);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("9119, " + arg0 + ", " + 128 + ", " + true + ", " + arg1 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISLJVZR", name = "a", descriptor = "(III[IIII[IIII)V")
	private void method72(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		try {
			for (@Pc(8) int local8 = -arg8; local8 < 0; local8++) {
				for (@Pc(13) int local13 = -arg3; local13 < 0; local13++) {
					@Pc(20) int local20 = arg6[arg1++];
					if (local20 == 0) {
						arg0++;
					} else {
						@Pc(26) int local26 = arg2[arg0];
						arg2[arg0++] = ((local20 & 0xFF00FF) * 128 + (local26 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local20 & 0xFF00) * 128 + (local26 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg0 += arg5;
				arg1 += arg4;
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("47790, " + -957 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 128 + ", " + arg7 + ", " + arg8 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISLJVZR", name = "a", descriptor = "(IZ[IIIIII[III)V")
	public void method73(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(16) int local16 = -arg9 / 2;
				@Pc(21) int local21 = -arg6 / 2;
				@Pc(30) int local30 = (int) (Math.sin((double) arg4 / 326.11D) * 65536.0D);
				@Pc(39) int local39 = (int) (Math.cos((double) arg4 / 326.11D) * 65536.0D);
				@Pc(45) int local45 = local30 * arg0 >> 8;
				@Pc(51) int local51 = local39 * arg0 >> 8;
				@Pc(63) int local63 = (arg8 << 16) + local21 * local45 + local16 * local51;
				@Pc(75) int local75 = (arg2 << 16) + (local21 * local51 - local16 * local45);
				@Pc(81) int local81 = arg5 + arg3 * Class2_Sub1_Sub1.anInt281;
				for (@Pc(83) int local83 = 0; local83 < arg6; local83++) {
					@Pc(89) int local89 = arg7[local83];
					@Pc(93) int local93 = local81 + local89;
					@Pc(99) int local99 = local63 + local51 * local89;
					@Pc(105) int local105 = local75 - local45 * local89;
					for (@Pc(110) int local110 = -arg1[local83]; local110 < 0; local110++) {
						Class2_Sub1_Sub1.anIntArray68[local93++] = this.anIntArray10[(local99 >> 16) + (local105 >> 16) * this.anInt61];
						local99 += local51;
						local105 -= local45;
					}
					local63 += local45;
					local75 += local51;
					local81 += Class2_Sub1_Sub1.anInt281;
				}
			} catch (@Pc(158) Exception local158) {
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("92353, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISLJVZR", name = "a", descriptor = "(IIIIIIIDI)V")
	public void method74(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(7) double arg2) {
		try {
			try {
				@Pc(27) int local27 = (int) (Math.sin(arg2) * 65536.0D);
				@Pc(33) int local33 = (int) (Math.cos(arg2) * 65536.0D);
				@Pc(39) int local39 = local27 * 256 >> 8;
				@Pc(45) int local45 = local33 * 256 >> 8;
				@Pc(57) int local57 = local39 * -10 + local45 * -10 + 983040;
				@Pc(69) int local69 = local45 * -10 + 983040 - local39 * -10;
				@Pc(75) int local75 = arg1 + arg0 * Class2_Sub1_Sub1.anInt281;
				for (@Pc(77) int local77 = 0; local77 < 20; local77++) {
					@Pc(81) int local81 = local75;
					@Pc(83) int local83 = local57;
					@Pc(85) int local85 = local69;
					for (@Pc(88) int local88 = -20; local88 < 0; local88++) {
						@Pc(104) int local104 = this.anIntArray10[(local83 >> 16) + (local85 >> 16) * this.anInt61];
						if (local104 == 0) {
							local81++;
						} else {
							Class2_Sub1_Sub1.anIntArray68[local81++] = local104;
						}
						local83 += local45;
						local85 -= local39;
					}
					local57 += local39;
					local69 += local45;
					local75 += Class2_Sub1_Sub1.anInt281;
				}
			} catch (@Pc(143) Exception local143) {
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("37633, " + 460 + ", " + 15 + ", " + arg0 + ", " + 15 + ", " + arg1 + ", " + 20 + ", " + 256 + ", " + arg2 + ", " + 20 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISLJVZR", name = "a", descriptor = "(IBLclient!KYEPSAQL;I)V")
	public void method75(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub4 arg1, @OriginalArg(3) int arg2) {
		try {
			arg0 += this.anInt63;
			arg2 += this.anInt64;
			@Pc(15) int local15 = arg0 + arg2 * Class2_Sub1_Sub1.anInt281;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt62;
			@Pc(23) int local23 = this.anInt61;
			@Pc(27) int local27 = Class2_Sub1_Sub1.anInt281 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg2 < Class2_Sub1_Sub1.anInt283) {
				local36 = Class2_Sub1_Sub1.anInt283 - arg2;
				local20 -= local36;
				arg2 = Class2_Sub1_Sub1.anInt283;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class2_Sub1_Sub1.anInt281;
			}
			if (arg2 + local20 > Class2_Sub1_Sub1.anInt284) {
				local20 -= arg2 + local20 - Class2_Sub1_Sub1.anInt284;
			}
			if (arg0 < Class2_Sub1_Sub1.anInt285) {
				local36 = Class2_Sub1_Sub1.anInt285 - arg0;
				local23 -= local36;
				arg0 = Class2_Sub1_Sub1.anInt285;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class2_Sub1_Sub1.anInt286) {
				local36 = arg0 + local23 - Class2_Sub1_Sub1.anInt286;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method76(local27, local15, Class2_Sub1_Sub1.anIntArray68, this.anIntArray10, local23, local17, 0, local29, arg1.aByteArray10, local20);
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("9575, " + arg0 + ", " + -105 + ", " + arg1 + ", " + arg2 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISLJVZR", name = "a", descriptor = "(II[II[IIIII[BI)V")
	private void method76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(6) int local6 = -(arg4 >> 2);
			@Pc(14) int local14 = -(arg4 & 0x3);
			for (@Pc(17) int local17 = -arg9; local17 < 0; local17++) {
				@Pc(28) int local28;
				for (@Pc(21) int local21 = local6; local21 < 0; local21++) {
					local28 = arg3[arg5++];
					if (local28 != 0 && arg8[arg1] == 0) {
						arg2[arg1++] = local28;
					} else {
						arg1++;
					}
					local28 = arg3[arg5++];
					if (local28 != 0 && arg8[arg1] == 0) {
						arg2[arg1++] = local28;
					} else {
						arg1++;
					}
					local28 = arg3[arg5++];
					if (local28 != 0 && arg8[arg1] == 0) {
						arg2[arg1++] = local28;
					} else {
						arg1++;
					}
					local28 = arg3[arg5++];
					if (local28 != 0 && arg8[arg1] == 0) {
						arg2[arg1++] = local28;
					} else {
						arg1++;
					}
				}
				for (@Pc(104) int local104 = local14; local104 < 0; local104++) {
					local28 = arg3[arg5++];
					if (local28 != 0 && arg8[arg1] == 0) {
						arg2[arg1++] = local28;
					} else {
						arg1++;
					}
				}
				arg1 += arg0;
				arg5 += arg7;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("32716, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}
