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

@OriginalClass("client!TPUDHOHI")
public final class Class8_Sub1_Sub2_Sub2 extends Class8_Sub1_Sub2 {

	@OriginalMember(owner = "client!TPUDHOHI", name = "x", descriptor = "Z")
	private boolean aBoolean138 = false;

	@OriginalMember(owner = "client!TPUDHOHI", name = "y", descriptor = "I")
	private int anInt602 = -255;

	@OriginalMember(owner = "client!TPUDHOHI", name = "z", descriptor = "B")
	private byte aByte12 = 7;

	@OriginalMember(owner = "client!TPUDHOHI", name = "A", descriptor = "I")
	private int anInt603 = 9;

	@OriginalMember(owner = "client!TPUDHOHI", name = "B", descriptor = "Z")
	private boolean aBoolean139 = false;

	@OriginalMember(owner = "client!TPUDHOHI", name = "C", descriptor = "Z")
	private boolean aBoolean140 = false;

	@OriginalMember(owner = "client!TPUDHOHI", name = "D", descriptor = "I")
	private int anInt604 = 7320;

	@OriginalMember(owner = "client!TPUDHOHI", name = "E", descriptor = "[I")
	public int[] anIntArray174;

	@OriginalMember(owner = "client!TPUDHOHI", name = "J", descriptor = "I")
	public int anInt609;

	@OriginalMember(owner = "client!TPUDHOHI", name = "F", descriptor = "I")
	public int anInt605;

	@OriginalMember(owner = "client!TPUDHOHI", name = "K", descriptor = "I")
	public int anInt610;

	@OriginalMember(owner = "client!TPUDHOHI", name = "G", descriptor = "I")
	public int anInt606;

	@OriginalMember(owner = "client!TPUDHOHI", name = "I", descriptor = "I")
	private int anInt608;

	@OriginalMember(owner = "client!TPUDHOHI", name = "H", descriptor = "I")
	private int anInt607;

	@OriginalMember(owner = "client!TPUDHOHI", name = "<init>", descriptor = "(II)V")
	public Class8_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray174 = new int[arg0 * arg1];
		this.anInt605 = this.anInt609 = arg0;
		this.anInt606 = this.anInt610 = arg1;
		this.anInt607 = this.anInt608 = 0;
	}

	@OriginalMember(owner = "client!TPUDHOHI", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class8_Sub1_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(26) Image local26 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(31) MediaTracker local31 = new MediaTracker(arg1);
			local31.addImage(local26, 0);
			local31.waitForAll();
			this.anInt605 = local26.getWidth(arg1);
			this.anInt606 = local26.getHeight(arg1);
			this.anInt609 = this.anInt605;
			this.anInt610 = this.anInt606;
			this.anInt607 = 0;
			this.anInt608 = 0;
			this.anIntArray174 = new int[this.anInt605 * this.anInt606];
			@Pc(85) PixelGrabber local85 = new PixelGrabber(local26, 0, 0, this.anInt605, this.anInt606, this.anIntArray174, 0, this.anInt605);
			local85.grabPixels();
		} catch (@Pc(90) Exception local90) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!TPUDHOHI", name = "<init>", descriptor = "(Lclient!SXKKBWPU;Ljava/lang/String;I)V")
	public Class8_Sub1_Sub2_Sub2(@OriginalArg(0) Class35 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(40) Class8_Sub1_Sub3 local40 = new Class8_Sub1_Sub3(arg0.method364(arg1 + ".dat", null), -631);
		@Pc(49) Class8_Sub1_Sub3 local49 = new Class8_Sub1_Sub3(arg0.method364("index.dat", null), -631);
		local49.anInt620 = local40.method408();
		this.anInt609 = local49.method408();
		this.anInt610 = local49.method408();
		@Pc(64) int local64 = local49.method406();
		@Pc(67) int[] local67 = new int[local64];
		for (@Pc(69) int local69 = 0; local69 < local64 - 1; local69++) {
			local67[local69 + 1] = local49.method410();
			if (local67[local69 + 1] == 0) {
				local67[local69 + 1] = 1;
			}
		}
		for (@Pc(104) int local104 = 0; local104 < arg2; local104++) {
			local49.anInt620 += 2;
			local40.anInt620 += local49.method408() * local49.method408();
			local49.anInt620++;
		}
		this.anInt607 = local49.method406();
		this.anInt608 = local49.method406();
		this.anInt605 = local49.method408();
		this.anInt606 = local49.method408();
		@Pc(151) int local151 = local49.method406();
		@Pc(157) int local157 = this.anInt605 * this.anInt606;
		this.anIntArray174 = new int[local157];
		@Pc(165) int local165;
		if (local151 == 0) {
			for (local165 = 0; local165 < local157; local165++) {
				this.anIntArray174[local165] = local67[local40.method406()];
			}
		} else if (local151 == 1) {
			for (local165 = 0; local165 < this.anInt605; local165++) {
				for (@Pc(189) int local189 = 0; local189 < this.anInt606; local189++) {
					this.anIntArray174[local165 + local189 * this.anInt605] = local67[local40.method406()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!TPUDHOHI", name = "a", descriptor = "(B)V")
	public void method379(@OriginalArg(0) byte arg0) {
		try {
			Class8_Sub1_Sub2.method548(this.anInt606, this.anInt605, this.anIntArray174);
			@Pc(12) boolean local12 = false;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("59464, " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPUDHOHI", name = "a", descriptor = "(IIII)V")
	public void method380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray174.length; local14++) {
				@Pc(21) int local21 = this.anIntArray174[local14];
				if (local21 != 0) {
					@Pc(29) int local29 = local21 >> 16 & 0xFF;
					local29 += arg2;
					if (local29 < 1) {
						local29 = 1;
					} else if (local29 > 255) {
						local29 = 255;
					}
					@Pc(51) int local51 = local21 >> 8 & 0xFF;
					local51 += arg0;
					if (local51 < 1) {
						local51 = 1;
					} else if (local51 > 255) {
						local51 = 255;
					}
					@Pc(71) int local71 = local21 & 0xFF;
					local71 += arg1;
					if (local71 < 1) {
						local71 = 1;
					} else if (local71 > 255) {
						local71 = 255;
					}
					this.anIntArray174[local14] = (local29 << 16) + (local51 << 8) + local71;
				}
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("14372, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 3 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPUDHOHI", name = "c", descriptor = "(I)V")
	public void method381() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt609 * this.anInt610];
			for (@Pc(10) int local10 = 0; local10 < this.anInt606; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt605; local14++) {
					local8[(local10 + this.anInt608) * this.anInt609 + local14 + this.anInt607] = this.anIntArray174[local10 * this.anInt605 + local14];
				}
			}
			this.anIntArray174 = local8;
			this.anInt605 = this.anInt609;
			this.anInt606 = this.anInt610;
			this.anInt607 = 0;
			this.anInt608 = 0;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("71108, " + 4 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPUDHOHI", name = "a", descriptor = "(III)V")
	public void method382(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt607;
			arg0 += this.anInt608;
			@Pc(15) int local15 = arg1 + arg0 * Class8_Sub1_Sub2.anInt786;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt606;
			@Pc(23) int local23 = this.anInt605;
			@Pc(27) int local27 = Class8_Sub1_Sub2.anInt786 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg0 < Class8_Sub1_Sub2.anInt788) {
				local36 = Class8_Sub1_Sub2.anInt788 - arg0;
				local20 -= local36;
				arg0 = Class8_Sub1_Sub2.anInt788;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class8_Sub1_Sub2.anInt786;
			}
			if (arg0 + local20 > Class8_Sub1_Sub2.anInt789) {
				local20 -= arg0 + local20 - Class8_Sub1_Sub2.anInt789;
			}
			if (arg1 < Class8_Sub1_Sub2.anInt790) {
				local36 = Class8_Sub1_Sub2.anInt790 - arg1;
				local23 -= local36;
				arg1 = Class8_Sub1_Sub2.anInt790;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg1 + local23 > Class8_Sub1_Sub2.anInt791) {
				local36 = arg1 + local23 - Class8_Sub1_Sub2.anInt791;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method383(local20, Class8_Sub1_Sub2.anIntArray204, this.anIntArray174, local15, local27, local23, local17, local29);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("84260, " + -30434 + ", " + arg0 + ", " + arg1 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPUDHOHI", name = "a", descriptor = "(I[I[IIIIIII)V")
	private void method383(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(6) int local6 = -(arg5 >> 2);
			@Pc(11) int local11 = -(arg5 & 0x3);
			for (@Pc(17) int local17 = -arg0; local17 < 0; local17++) {
				for (@Pc(21) int local21 = local6; local21 < 0; local21++) {
					arg1[arg3++] = arg2[arg6++];
					arg1[arg3++] = arg2[arg6++];
					arg1[arg3++] = arg2[arg6++];
					arg1[arg3++] = arg2[arg6++];
				}
				for (@Pc(60) int local60 = local11; local60 < 0; local60++) {
					arg1[arg3++] = arg2[arg6++];
				}
				arg3 += arg4;
				arg6 += arg7;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("16267, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 0 + ", " + arg7 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPUDHOHI", name = "b", descriptor = "(III)V")
	public void method384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt607;
			arg1 += this.anInt608;
			@Pc(15) int local15 = arg0 + arg1 * Class8_Sub1_Sub2.anInt786;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt606;
			@Pc(23) int local23 = this.anInt605;
			@Pc(27) int local27 = Class8_Sub1_Sub2.anInt786 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class8_Sub1_Sub2.anInt788) {
				local36 = Class8_Sub1_Sub2.anInt788 - arg1;
				local20 -= local36;
				arg1 = Class8_Sub1_Sub2.anInt788;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class8_Sub1_Sub2.anInt786;
			}
			if (arg1 + local20 > Class8_Sub1_Sub2.anInt789) {
				local20 -= arg1 + local20 - Class8_Sub1_Sub2.anInt789;
			}
			if (arg0 < Class8_Sub1_Sub2.anInt790) {
				local36 = Class8_Sub1_Sub2.anInt790 - arg0;
				local23 -= local36;
				arg0 = Class8_Sub1_Sub2.anInt790;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class8_Sub1_Sub2.anInt791) {
				local36 = arg0 + local23 - Class8_Sub1_Sub2.anInt791;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method385(Class8_Sub1_Sub2.anIntArray204, this.anIntArray174, local17, local15, local23, local20, local27, local29);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("3715, " + arg0 + ", " + arg1 + ", " + 714 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPUDHOHI", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method385(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!TPUDHOHI", name = "a", descriptor = "(IIIZ)V")
	public void method386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg1 += this.anInt607;
			arg0 += this.anInt608;
			@Pc(18) int local18 = arg1 + arg0 * Class8_Sub1_Sub2.anInt786;
			@Pc(20) int local20 = 0;
			@Pc(23) int local23 = this.anInt606;
			@Pc(26) int local26 = this.anInt605;
			@Pc(30) int local30 = Class8_Sub1_Sub2.anInt786 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg0 < Class8_Sub1_Sub2.anInt788) {
				local39 = Class8_Sub1_Sub2.anInt788 - arg0;
				local23 -= local39;
				arg0 = Class8_Sub1_Sub2.anInt788;
				local20 = local39 * local26 + 0;
				local18 += local39 * Class8_Sub1_Sub2.anInt786;
			}
			if (arg0 + local23 > Class8_Sub1_Sub2.anInt789) {
				local23 -= arg0 + local23 - Class8_Sub1_Sub2.anInt789;
			}
			if (arg1 < Class8_Sub1_Sub2.anInt790) {
				local39 = Class8_Sub1_Sub2.anInt790 - arg1;
				local26 -= local39;
				arg1 = Class8_Sub1_Sub2.anInt790;
				local20 += local39;
				local18 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg1 + local26 > Class8_Sub1_Sub2.anInt791) {
				local39 = arg1 + local26 - Class8_Sub1_Sub2.anInt791;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method387(local30, local20, this.anIntArray174, local23, Class8_Sub1_Sub2.anIntArray204, local26, local32, 0, local18);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("8441, " + arg0 + ", " + arg1 + ", " + 128 + ", " + true + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPUDHOHI", name = "a", descriptor = "(II[II[IIIIIII)V")
	private void method387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int arg8) {
		try {
			for (@Pc(17) int local17 = -arg3; local17 < 0; local17++) {
				for (@Pc(22) int local22 = -arg5; local22 < 0; local22++) {
					@Pc(29) int local29 = arg2[arg1++];
					if (local29 == 0) {
						arg8++;
					} else {
						@Pc(35) int local35 = arg4[arg8];
						arg4[arg8++] = ((local29 & 0xFF00FF) * 128 + (local35 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local29 & 0xFF00) * 128 + (local35 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg8 += arg0;
				arg1 += arg6;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("45817, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 128 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 659 + ", " + arg8 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPUDHOHI", name = "a", descriptor = "(I[IIIIIIIB[II)V")
	public void method388(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(6) boolean local6 = false;
			try {
				@Pc(16) int local16 = -arg5 / 2;
				@Pc(21) int local21 = -arg4 / 2;
				@Pc(30) int local30 = (int) (Math.sin((double) arg10 / 326.11D) * 65536.0D);
				@Pc(39) int local39 = (int) (Math.cos((double) arg10 / 326.11D) * 65536.0D);
				@Pc(45) int local45 = local30 * arg3 >> 8;
				@Pc(51) int local51 = local39 * arg3 >> 8;
				@Pc(63) int local63 = (arg2 << 16) + local21 * local45 + local16 * local51;
				@Pc(75) int local75 = (arg6 << 16) + (local21 * local51 - local16 * local45);
				@Pc(81) int local81 = arg0 + arg7 * Class8_Sub1_Sub2.anInt786;
				for (@Pc(83) int local83 = 0; local83 < arg4; local83++) {
					@Pc(89) int local89 = arg1[local83];
					@Pc(93) int local93 = local81 + local89;
					@Pc(99) int local99 = local63 + local51 * local89;
					@Pc(105) int local105 = local75 - local45 * local89;
					for (@Pc(110) int local110 = -arg9[local83]; local110 < 0; local110++) {
						Class8_Sub1_Sub2.anIntArray204[local93++] = this.anIntArray174[(local99 >> 16) + (local105 >> 16) * this.anInt605];
						local99 += local51;
						local105 -= local45;
					}
					local63 += local45;
					local75 += local51;
					local81 += Class8_Sub1_Sub2.anInt786;
				}
			} catch (@Pc(158) Exception local158) {
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("52933, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPUDHOHI", name = "a", descriptor = "(IIIDIIIII)V")
	public void method389(@OriginalArg(3) double arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2, @OriginalArg(7) int arg3) {
		try {
			if (arg1 < 4 || arg1 > 4) {
				this.anInt603 = 274;
			}
			try {
				@Pc(26) int local26 = (int) (Math.sin(arg0) * 65536.0D);
				@Pc(32) int local32 = (int) (Math.cos(arg0) * 65536.0D);
				@Pc(38) int local38 = local26 * 256 >> 8;
				@Pc(44) int local44 = local32 * 256 >> 8;
				@Pc(56) int local56 = local38 * -10 + local44 * -10 + 983040;
				@Pc(68) int local68 = local44 * -10 + 983040 - local38 * -10;
				@Pc(74) int local74 = arg2 + arg3 * Class8_Sub1_Sub2.anInt786;
				for (@Pc(76) int local76 = 0; local76 < 20; local76++) {
					@Pc(80) int local80 = local74;
					@Pc(82) int local82 = local56;
					@Pc(84) int local84 = local68;
					for (@Pc(87) int local87 = -20; local87 < 0; local87++) {
						@Pc(103) int local103 = this.anIntArray174[(local82 >> 16) + (local84 >> 16) * this.anInt605];
						if (local103 == 0) {
							local80++;
						} else {
							Class8_Sub1_Sub2.anIntArray204[local80++] = local103;
						}
						local82 += local44;
						local84 -= local38;
					}
					local56 += local38;
					local68 += local44;
					local74 += Class8_Sub1_Sub2.anInt786;
				}
			} catch (@Pc(142) Exception local142) {
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("71181, " + 20 + ", " + 256 + ", " + 15 + ", " + arg0 + ", " + 20 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 15 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPUDHOHI", name = "a", descriptor = "(IILclient!VCTXURSE;B)V")
	public void method390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8_Sub1_Sub2_Sub3 arg2) {
		try {
			arg1 += this.anInt607;
			arg0 += this.anInt608;
			@Pc(15) int local15 = arg1 + arg0 * Class8_Sub1_Sub2.anInt786;
			@Pc(17) int local17 = 0;
			@Pc(24) int local24 = this.anInt606;
			@Pc(27) int local27 = this.anInt605;
			@Pc(31) int local31 = Class8_Sub1_Sub2.anInt786 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg0 < Class8_Sub1_Sub2.anInt788) {
				local40 = Class8_Sub1_Sub2.anInt788 - arg0;
				local24 -= local40;
				arg0 = Class8_Sub1_Sub2.anInt788;
				local17 = local40 * local27 + 0;
				local15 += local40 * Class8_Sub1_Sub2.anInt786;
			}
			if (arg0 + local24 > Class8_Sub1_Sub2.anInt789) {
				local24 -= arg0 + local24 - Class8_Sub1_Sub2.anInt789;
			}
			if (arg1 < Class8_Sub1_Sub2.anInt790) {
				local40 = Class8_Sub1_Sub2.anInt790 - arg1;
				local27 -= local40;
				arg1 = Class8_Sub1_Sub2.anInt790;
				local17 += local40;
				local15 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg1 + local27 > Class8_Sub1_Sub2.anInt791) {
				local40 = arg1 + local27 - Class8_Sub1_Sub2.anInt791;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method391(548, local33, 0, local15, local31, local17, this.anIntArray174, arg2.aByteArray15, local27, local24, Class8_Sub1_Sub2.anIntArray204);
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("66267, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 4 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPUDHOHI", name = "a", descriptor = "(IIIIII[I[BII[I)V")
	private void method391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10) {
		try {
			@Pc(6) int local6 = -(arg8 >> 2);
			@Pc(11) int local11 = -(arg8 & 0x3);
			for (@Pc(14) int local14 = -arg9; local14 < 0; local14++) {
				@Pc(25) int local25;
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					local25 = arg6[arg5++];
					if (local25 != 0 && arg7[arg3] == 0) {
						arg10[arg3++] = local25;
					} else {
						arg3++;
					}
					local25 = arg6[arg5++];
					if (local25 != 0 && arg7[arg3] == 0) {
						arg10[arg3++] = local25;
					} else {
						arg3++;
					}
					local25 = arg6[arg5++];
					if (local25 != 0 && arg7[arg3] == 0) {
						arg10[arg3++] = local25;
					} else {
						arg3++;
					}
					local25 = arg6[arg5++];
					if (local25 != 0 && arg7[arg3] == 0) {
						arg10[arg3++] = local25;
					} else {
						arg3++;
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					local25 = arg6[arg5++];
					if (local25 != 0 && arg7[arg3] == 0) {
						arg10[arg3++] = local25;
					} else {
						arg3++;
					}
				}
				arg3 += arg4;
				arg5 += arg1;
			}
			@Pc(140) boolean local140 = false;
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("22300, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}
}
