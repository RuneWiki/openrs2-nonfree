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

@OriginalClass("client!NDGQUJMA")
public final class Class2_Sub1_Sub3_Sub2 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!NDGQUJMA", name = "w", descriptor = "Z")
	private boolean aBoolean106 = false;

	@OriginalMember(owner = "client!NDGQUJMA", name = "x", descriptor = "Z")
	private boolean aBoolean107 = true;

	@OriginalMember(owner = "client!NDGQUJMA", name = "y", descriptor = "Z")
	private boolean aBoolean108 = false;

	@OriginalMember(owner = "client!NDGQUJMA", name = "z", descriptor = "I")
	private int anInt462 = 4;

	@OriginalMember(owner = "client!NDGQUJMA", name = "A", descriptor = "I")
	private int anInt463 = -406;

	@OriginalMember(owner = "client!NDGQUJMA", name = "B", descriptor = "B")
	private byte aByte23 = 9;

	@OriginalMember(owner = "client!NDGQUJMA", name = "C", descriptor = "Z")
	private boolean aBoolean109 = true;

	@OriginalMember(owner = "client!NDGQUJMA", name = "D", descriptor = "[I")
	public int[] anIntArray63;

	@OriginalMember(owner = "client!NDGQUJMA", name = "I", descriptor = "I")
	public int anInt468;

	@OriginalMember(owner = "client!NDGQUJMA", name = "E", descriptor = "I")
	public int anInt464;

	@OriginalMember(owner = "client!NDGQUJMA", name = "J", descriptor = "I")
	public int anInt469;

	@OriginalMember(owner = "client!NDGQUJMA", name = "F", descriptor = "I")
	public int anInt465;

	@OriginalMember(owner = "client!NDGQUJMA", name = "H", descriptor = "I")
	private int anInt467;

	@OriginalMember(owner = "client!NDGQUJMA", name = "G", descriptor = "I")
	private int anInt466;

	@OriginalMember(owner = "client!NDGQUJMA", name = "<init>", descriptor = "(II)V")
	public Class2_Sub1_Sub3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray63 = new int[arg0 * arg1];
		this.anInt464 = this.anInt468 = arg0;
		this.anInt465 = this.anInt469 = arg1;
		this.anInt466 = this.anInt467 = 0;
	}

	@OriginalMember(owner = "client!NDGQUJMA", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class2_Sub1_Sub3_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(26) Image local26 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(31) MediaTracker local31 = new MediaTracker(arg1);
			local31.addImage(local26, 0);
			local31.waitForAll();
			this.anInt464 = local26.getWidth(arg1);
			this.anInt465 = local26.getHeight(arg1);
			this.anInt468 = this.anInt464;
			this.anInt469 = this.anInt465;
			this.anInt466 = 0;
			this.anInt467 = 0;
			this.anIntArray63 = new int[this.anInt464 * this.anInt465];
			@Pc(85) PixelGrabber local85 = new PixelGrabber(local26, 0, 0, this.anInt464, this.anInt465, this.anIntArray63, 0, this.anInt464);
			local85.grabPixels();
		} catch (@Pc(90) Exception local90) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!NDGQUJMA", name = "<init>", descriptor = "(Lclient!VSQMPWOM;Ljava/lang/String;I)V")
	public Class2_Sub1_Sub3_Sub2(@OriginalArg(0) Class39 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(40) Class2_Sub1_Sub2 local40 = new Class2_Sub1_Sub2(arg0.method489(arg1 + ".dat", null), -990);
		@Pc(49) Class2_Sub1_Sub2 local49 = new Class2_Sub1_Sub2(arg0.method489("index.dat", null), -990);
		local49.anInt123 = local40.method81();
		this.anInt468 = local49.method81();
		this.anInt469 = local49.method81();
		@Pc(64) int local64 = local49.method79();
		@Pc(67) int[] local67 = new int[local64];
		for (@Pc(69) int local69 = 0; local69 < local64 - 1; local69++) {
			local67[local69 + 1] = local49.method83();
			if (local67[local69 + 1] == 0) {
				local67[local69 + 1] = 1;
			}
		}
		for (@Pc(104) int local104 = 0; local104 < arg2; local104++) {
			local49.anInt123 += 2;
			local40.anInt123 += local49.method81() * local49.method81();
			local49.anInt123++;
		}
		this.anInt466 = local49.method79();
		this.anInt467 = local49.method79();
		this.anInt464 = local49.method81();
		this.anInt465 = local49.method81();
		@Pc(151) int local151 = local49.method79();
		@Pc(157) int local157 = this.anInt464 * this.anInt465;
		this.anIntArray63 = new int[local157];
		@Pc(165) int local165;
		if (local151 == 0) {
			for (local165 = 0; local165 < local157; local165++) {
				this.anIntArray63[local165] = local67[local40.method79()];
			}
		} else if (local151 == 1) {
			for (local165 = 0; local165 < this.anInt464; local165++) {
				for (@Pc(189) int local189 = 0; local189 < this.anInt465; local189++) {
					this.anIntArray63[local165 + local189 * this.anInt464] = local67[local40.method79()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!NDGQUJMA", name = "b", descriptor = "(I)V")
	public void method272() {
		try {
			Class2_Sub1_Sub3.method383(this.anInt465, this.anIntArray63, this.anInt464);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("34676, " + -19705 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NDGQUJMA", name = "a", descriptor = "(IIII)V")
	public void method273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray63.length; local3++) {
				@Pc(10) int local10 = this.anIntArray63[local3];
				if (local10 != 0) {
					@Pc(18) int local18 = local10 >> 16 & 0xFF;
					local18 += arg0;
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
					this.anIntArray63[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
			@Pc(99) boolean local99 = false;
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("88534, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NDGQUJMA", name = "c", descriptor = "(I)V")
	public void method274() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt468 * this.anInt469];
			for (@Pc(10) int local10 = 0; local10 < this.anInt465; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt464; local14++) {
					local8[(local10 + this.anInt467) * this.anInt468 + local14 + this.anInt466] = this.anIntArray63[local10 * this.anInt464 + local14];
				}
			}
			this.anIntArray63 = local8;
			this.anInt464 = this.anInt468;
			this.anInt465 = this.anInt469;
			this.anInt466 = 0;
			this.anInt467 = 0;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("70901, " + -31455 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NDGQUJMA", name = "a", descriptor = "(III)V")
	public void method275(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt466;
			arg0 += this.anInt467;
			@Pc(25) int local25 = arg1 + arg0 * Class2_Sub1_Sub3.anInt555;
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = this.anInt465;
			@Pc(33) int local33 = this.anInt464;
			@Pc(37) int local37 = Class2_Sub1_Sub3.anInt555 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg0 < Class2_Sub1_Sub3.anInt557) {
				local46 = Class2_Sub1_Sub3.anInt557 - arg0;
				local30 -= local46;
				arg0 = Class2_Sub1_Sub3.anInt557;
				local27 = local46 * local33 + 0;
				local25 += local46 * Class2_Sub1_Sub3.anInt555;
			}
			if (arg0 + local30 > Class2_Sub1_Sub3.anInt558) {
				local30 -= arg0 + local30 - Class2_Sub1_Sub3.anInt558;
			}
			if (arg1 < Class2_Sub1_Sub3.anInt559) {
				local46 = Class2_Sub1_Sub3.anInt559 - arg1;
				local33 -= local46;
				arg1 = Class2_Sub1_Sub3.anInt559;
				local27 += local46;
				local25 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg1 + local33 > Class2_Sub1_Sub3.anInt560) {
				local46 = arg1 + local33 - Class2_Sub1_Sub3.anInt560;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method276(local33, Class2_Sub1_Sub3.anIntArray93, local30, this.anIntArray63, local37, local25, this.anInt462, local27, local39);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("55384, " + arg0 + ", " + 298 + ", " + arg1 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NDGQUJMA", name = "a", descriptor = "(I[II[IIIIII)V")
	private void method276(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			@Pc(6) int local6 = -(arg0 >> 2);
			@Pc(11) int local11 = -(arg0 & 0x3);
			@Pc(16) int local16;
			if (arg6 != 4) {
				for (local16 = 1; local16 > 0; local16++) {
				}
			}
			for (local16 = -arg2; local16 < 0; local16++) {
				for (@Pc(28) int local28 = local6; local28 < 0; local28++) {
					arg1[arg5++] = arg3[arg7++];
					arg1[arg5++] = arg3[arg7++];
					arg1[arg5++] = arg3[arg7++];
					arg1[arg5++] = arg3[arg7++];
				}
				for (@Pc(67) int local67 = local11; local67 < 0; local67++) {
					arg1[arg5++] = arg3[arg7++];
				}
				arg5 += arg4;
				arg7 += arg8;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("67900, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NDGQUJMA", name = "a", descriptor = "(IBI)V")
	public void method277(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt466;
			arg0 += this.anInt467;
			@Pc(19) int local19 = arg1 + arg0 * Class2_Sub1_Sub3.anInt555;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt465;
			@Pc(27) int local27 = this.anInt464;
			@Pc(31) int local31 = Class2_Sub1_Sub3.anInt555 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg0 < Class2_Sub1_Sub3.anInt557) {
				local40 = Class2_Sub1_Sub3.anInt557 - arg0;
				local24 -= local40;
				arg0 = Class2_Sub1_Sub3.anInt557;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class2_Sub1_Sub3.anInt555;
			}
			if (arg0 + local24 > Class2_Sub1_Sub3.anInt558) {
				local24 -= arg0 + local24 - Class2_Sub1_Sub3.anInt558;
			}
			if (arg1 < Class2_Sub1_Sub3.anInt559) {
				local40 = Class2_Sub1_Sub3.anInt559 - arg1;
				local27 -= local40;
				arg1 = Class2_Sub1_Sub3.anInt559;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg1 + local27 > Class2_Sub1_Sub3.anInt560) {
				local40 = arg1 + local27 - Class2_Sub1_Sub3.anInt560;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method278(Class2_Sub1_Sub3.anIntArray93, this.anIntArray63, local21, local19, local27, local24, local31, local33);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("71128, " + arg0 + ", " + 3 + ", " + arg1 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NDGQUJMA", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method278(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!NDGQUJMA", name = "a", descriptor = "(IIBI)V")
	public void method279(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		try {
			arg1 += this.anInt466;
			arg0 += this.anInt467;
			@Pc(15) int local15 = arg1 + arg0 * Class2_Sub1_Sub3.anInt555;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt465;
			@Pc(23) int local23 = this.anInt464;
			@Pc(27) int local27 = Class2_Sub1_Sub3.anInt555 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg0 < Class2_Sub1_Sub3.anInt557) {
				local36 = Class2_Sub1_Sub3.anInt557 - arg0;
				local20 -= local36;
				arg0 = Class2_Sub1_Sub3.anInt557;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class2_Sub1_Sub3.anInt555;
			}
			if (arg0 + local20 > Class2_Sub1_Sub3.anInt558) {
				local20 -= arg0 + local20 - Class2_Sub1_Sub3.anInt558;
			}
			if (arg1 < Class2_Sub1_Sub3.anInt559) {
				local36 = Class2_Sub1_Sub3.anInt559 - arg1;
				local23 -= local36;
				arg1 = Class2_Sub1_Sub3.anInt559;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg1 + local23 > Class2_Sub1_Sub3.anInt560) {
				local36 = arg1 + local23 - Class2_Sub1_Sub3.anInt560;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method280(this.anInt463, local20, 0, local17, local15, this.anIntArray63, Class2_Sub1_Sub3.anIntArray93, local27, local29, local23);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("61601, " + 128 + ", " + arg0 + ", " + 1 + ", " + arg1 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NDGQUJMA", name = "a", descriptor = "(IIIIII[I[IIII)V")
	private void method280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			if (arg0 != -406) {
				this.aBoolean108 = !this.aBoolean108;
			}
			for (@Pc(19) int local19 = -arg1; local19 < 0; local19++) {
				for (@Pc(24) int local24 = -arg9; local24 < 0; local24++) {
					@Pc(31) int local31 = arg5[arg3++];
					if (local31 == 0) {
						arg4++;
					} else {
						@Pc(37) int local37 = arg6[arg4];
						arg6[arg4++] = ((local31 & 0xFF00FF) * 128 + (local37 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local31 & 0xFF00) * 128 + (local37 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg4 += arg7;
				arg3 += arg8;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("66010, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 128 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NDGQUJMA", name = "a", descriptor = "(I[IIIII[IIIII)V")
	public void method281(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(16) int local16 = -arg9 / 2;
				@Pc(21) int local21 = -arg6 / 2;
				@Pc(30) int local30 = (int) (Math.sin((double) arg2 / 326.11D) * 65536.0D);
				@Pc(39) int local39 = (int) (Math.cos((double) arg2 / 326.11D) * 65536.0D);
				@Pc(45) int local45 = local30 * arg4 >> 8;
				@Pc(51) int local51 = local39 * arg4 >> 8;
				@Pc(63) int local63 = (arg1 << 16) + local21 * local45 + local16 * local51;
				@Pc(75) int local75 = (arg8 << 16) + (local21 * local51 - local16 * local45);
				@Pc(81) int local81 = arg7 + arg3 * Class2_Sub1_Sub3.anInt555;
				for (@Pc(83) int local83 = 0; local83 < arg6; local83++) {
					@Pc(89) int local89 = arg5[local83];
					@Pc(93) int local93 = local81 + local89;
					@Pc(99) int local99 = local63 + local51 * local89;
					@Pc(105) int local105 = local75 - local45 * local89;
					for (@Pc(110) int local110 = -arg0[local83]; local110 < 0; local110++) {
						Class2_Sub1_Sub3.anIntArray93[local93++] = this.anIntArray63[(local99 >> 16) + (local105 >> 16) * this.anInt464];
						local99 += local51;
						local105 -= local45;
					}
					local63 += local45;
					local75 += local51;
					local81 += Class2_Sub1_Sub3.anInt555;
				}
			} catch (@Pc(158) Exception local158) {
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("35832, " + 454 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NDGQUJMA", name = "a", descriptor = "(IIIDIIIII)V")
	public void method282(@OriginalArg(0) int arg0, @OriginalArg(3) double arg1, @OriginalArg(8) int arg2) {
		try {
			try {
				@Pc(27) int local27 = (int) (Math.sin(arg1) * 65536.0D);
				@Pc(33) int local33 = (int) (Math.cos(arg1) * 65536.0D);
				@Pc(39) int local39 = local27 * 256 >> 8;
				@Pc(45) int local45 = local33 * 256 >> 8;
				@Pc(57) int local57 = local39 * -10 + local45 * -10 + 983040;
				@Pc(69) int local69 = local45 * -10 + 983040 - local39 * -10;
				@Pc(75) int local75 = arg2 + arg0 * Class2_Sub1_Sub3.anInt555;
				for (@Pc(77) int local77 = 0; local77 < 20; local77++) {
					@Pc(81) int local81 = local75;
					@Pc(83) int local83 = local57;
					@Pc(85) int local85 = local69;
					for (@Pc(88) int local88 = -20; local88 < 0; local88++) {
						@Pc(104) int local104 = this.anIntArray63[(local83 >> 16) + (local85 >> 16) * this.anInt464];
						if (local104 == 0) {
							local81++;
						} else {
							Class2_Sub1_Sub3.anIntArray93[local81++] = local104;
						}
						local83 += local45;
						local85 -= local39;
					}
					local57 += local39;
					local69 += local45;
					local75 += Class2_Sub1_Sub3.anInt555;
				}
			} catch (@Pc(143) Exception local143) {
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("64463, " + arg0 + ", " + 0 + ", " + 15 + ", " + arg1 + ", " + 20 + ", " + 15 + ", " + 20 + ", " + 256 + ", " + arg2 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NDGQUJMA", name = "a", descriptor = "(IIILclient!RAOZRSKX;)V")
	public void method283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub3_Sub4 arg2) {
		try {
			arg0 += this.anInt466;
			arg1 += this.anInt467;
			@Pc(24) int local24 = arg0 + arg1 * Class2_Sub1_Sub3.anInt555;
			@Pc(26) int local26 = 0;
			@Pc(29) int local29 = this.anInt465;
			@Pc(32) int local32 = this.anInt464;
			@Pc(36) int local36 = Class2_Sub1_Sub3.anInt555 - local32;
			@Pc(38) int local38 = 0;
			@Pc(45) int local45;
			if (arg1 < Class2_Sub1_Sub3.anInt557) {
				local45 = Class2_Sub1_Sub3.anInt557 - arg1;
				local29 -= local45;
				arg1 = Class2_Sub1_Sub3.anInt557;
				local26 = local45 * local32 + 0;
				local24 += local45 * Class2_Sub1_Sub3.anInt555;
			}
			if (arg1 + local29 > Class2_Sub1_Sub3.anInt558) {
				local29 -= arg1 + local29 - Class2_Sub1_Sub3.anInt558;
			}
			if (arg0 < Class2_Sub1_Sub3.anInt559) {
				local45 = Class2_Sub1_Sub3.anInt559 - arg0;
				local32 -= local45;
				arg0 = Class2_Sub1_Sub3.anInt559;
				local26 += local45;
				local24 += local45;
				local38 = local45 + 0;
				local36 += local45;
			}
			if (arg0 + local32 > Class2_Sub1_Sub3.anInt560) {
				local45 = arg0 + local32 - Class2_Sub1_Sub3.anInt560;
				local32 -= local45;
				local38 += local45;
				local36 += local45;
			}
			if (local32 > 0 && local29 > 0) {
				this.method284(local32, Class2_Sub1_Sub3.anIntArray93, local24, this.anIntArray63, local36, local38, arg2.aByteArray14, local29, local26, 0);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("53801, " + arg0 + ", " + 961 + ", " + arg1 + ", " + arg2 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NDGQUJMA", name = "a", descriptor = "(I[II[III[BIIII)V")
	private void method284(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(16) int local16 = -(arg0 >> 2);
			@Pc(21) int local21 = -(arg0 & 0x3);
			for (@Pc(24) int local24 = -arg7; local24 < 0; local24++) {
				@Pc(35) int local35;
				for (@Pc(28) int local28 = local16; local28 < 0; local28++) {
					local35 = arg3[arg8++];
					if (local35 != 0 && arg6[arg2] == 0) {
						arg1[arg2++] = local35;
					} else {
						arg2++;
					}
					local35 = arg3[arg8++];
					if (local35 != 0 && arg6[arg2] == 0) {
						arg1[arg2++] = local35;
					} else {
						arg2++;
					}
					local35 = arg3[arg8++];
					if (local35 != 0 && arg6[arg2] == 0) {
						arg1[arg2++] = local35;
					} else {
						arg2++;
					}
					local35 = arg3[arg8++];
					if (local35 != 0 && arg6[arg2] == 0) {
						arg1[arg2++] = local35;
					} else {
						arg2++;
					}
				}
				for (@Pc(111) int local111 = local21; local111 < 0; local111++) {
					local35 = arg3[arg8++];
					if (local35 != 0 && arg6[arg2] == 0) {
						arg1[arg2++] = local35;
					} else {
						arg2++;
					}
				}
				arg2 += arg4;
				arg8 += arg5;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("42906, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 0 + ", " + arg9 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}
}
