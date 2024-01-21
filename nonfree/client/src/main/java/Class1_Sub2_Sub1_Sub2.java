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

@OriginalClass("client!QEHNWGKD")
public final class Class1_Sub2_Sub1_Sub2 extends Class1_Sub2_Sub1 {

	@OriginalMember(owner = "client!QEHNWGKD", name = "D", descriptor = "I")
	private int anInt559;

	@OriginalMember(owner = "client!QEHNWGKD", name = "x", descriptor = "Z")
	private boolean aBoolean119 = true;

	@OriginalMember(owner = "client!QEHNWGKD", name = "y", descriptor = "I")
	private int anInt555 = -921;

	@OriginalMember(owner = "client!QEHNWGKD", name = "z", descriptor = "I")
	private int anInt556 = -44900;

	@OriginalMember(owner = "client!QEHNWGKD", name = "A", descriptor = "I")
	private int anInt557 = -359;

	@OriginalMember(owner = "client!QEHNWGKD", name = "B", descriptor = "Z")
	private boolean aBoolean120 = true;

	@OriginalMember(owner = "client!QEHNWGKD", name = "C", descriptor = "I")
	private int anInt558 = -40510;

	@OriginalMember(owner = "client!QEHNWGKD", name = "E", descriptor = "Z")
	private boolean aBoolean121 = true;

	@OriginalMember(owner = "client!QEHNWGKD", name = "F", descriptor = "[I")
	public int[] anIntArray136;

	@OriginalMember(owner = "client!QEHNWGKD", name = "K", descriptor = "I")
	public int anInt564;

	@OriginalMember(owner = "client!QEHNWGKD", name = "G", descriptor = "I")
	public int anInt560;

	@OriginalMember(owner = "client!QEHNWGKD", name = "L", descriptor = "I")
	public int anInt565;

	@OriginalMember(owner = "client!QEHNWGKD", name = "H", descriptor = "I")
	public int anInt561;

	@OriginalMember(owner = "client!QEHNWGKD", name = "J", descriptor = "I")
	private int anInt563;

	@OriginalMember(owner = "client!QEHNWGKD", name = "I", descriptor = "I")
	private int anInt562;

	@OriginalMember(owner = "client!QEHNWGKD", name = "<init>", descriptor = "(II)V")
	public Class1_Sub2_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray136 = new int[arg0 * arg1];
		this.anInt560 = this.anInt564 = arg0;
		this.anInt561 = this.anInt565 = arg1;
		this.anInt562 = this.anInt563 = 0;
	}

	@OriginalMember(owner = "client!QEHNWGKD", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub2_Sub1_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(26) Image local26 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(31) MediaTracker local31 = new MediaTracker(arg1);
			local31.addImage(local26, 0);
			local31.waitForAll();
			this.anInt560 = local26.getWidth(arg1);
			this.anInt561 = local26.getHeight(arg1);
			this.anInt564 = this.anInt560;
			this.anInt565 = this.anInt561;
			this.anInt562 = 0;
			this.anInt563 = 0;
			this.anIntArray136 = new int[this.anInt560 * this.anInt561];
			@Pc(85) PixelGrabber local85 = new PixelGrabber(local26, 0, 0, this.anInt560, this.anInt561, this.anIntArray136, 0, this.anInt560);
			local85.grabPixels();
		} catch (@Pc(90) Exception local90) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!QEHNWGKD", name = "<init>", descriptor = "(Lclient!NXFIIFAD;Ljava/lang/String;I)V")
	public Class1_Sub2_Sub1_Sub2(@OriginalArg(0) Class31 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(40) Class1_Sub2_Sub3 local40 = new Class1_Sub2_Sub3(arg0.method352(arg1 + ".dat", null), -670);
		@Pc(49) Class1_Sub2_Sub3 local49 = new Class1_Sub2_Sub3(arg0.method352("index.dat", null), -670);
		local49.anInt474 = local40.method309();
		this.anInt564 = local49.method309();
		this.anInt565 = local49.method309();
		@Pc(64) int local64 = local49.method307();
		@Pc(67) int[] local67 = new int[local64];
		for (@Pc(69) int local69 = 0; local69 < local64 - 1; local69++) {
			local67[local69 + 1] = local49.method311();
			if (local67[local69 + 1] == 0) {
				local67[local69 + 1] = 1;
			}
		}
		for (@Pc(104) int local104 = 0; local104 < arg2; local104++) {
			local49.anInt474 += 2;
			local40.anInt474 += local49.method309() * local49.method309();
			local49.anInt474++;
		}
		this.anInt562 = local49.method307();
		this.anInt563 = local49.method307();
		this.anInt560 = local49.method309();
		this.anInt561 = local49.method309();
		@Pc(151) int local151 = local49.method307();
		@Pc(157) int local157 = this.anInt560 * this.anInt561;
		this.anIntArray136 = new int[local157];
		@Pc(165) int local165;
		if (local151 == 0) {
			for (local165 = 0; local165 < local157; local165++) {
				this.anIntArray136[local165] = local67[local40.method307()];
			}
		} else if (local151 == 1) {
			for (local165 = 0; local165 < this.anInt560; local165++) {
				for (@Pc(189) int local189 = 0; local189 < this.anInt561; local189++) {
					this.anIntArray136[local165 + local189 * this.anInt560] = local67[local40.method307()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!QEHNWGKD", name = "b", descriptor = "(I)V")
	public void method387() {
		try {
			Class1_Sub2_Sub1.method530(this.anIntArray136, this.anInt560, this.anInt561);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("65557, " + -921 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QEHNWGKD", name = "a", descriptor = "(IIIZ)V")
	public void method388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(8) int local8 = 0; local8 < this.anIntArray136.length; local8++) {
				@Pc(15) int local15 = this.anIntArray136[local8];
				if (local15 != 0) {
					@Pc(23) int local23 = local15 >> 16 & 0xFF;
					local23 += arg1;
					if (local23 < 1) {
						local23 = 1;
					} else if (local23 > 255) {
						local23 = 255;
					}
					@Pc(45) int local45 = local15 >> 8 & 0xFF;
					local45 += arg0;
					if (local45 < 1) {
						local45 = 1;
					} else if (local45 > 255) {
						local45 = 255;
					}
					@Pc(65) int local65 = local15 & 0xFF;
					local65 += arg2;
					if (local65 < 1) {
						local65 = 1;
					} else if (local65 > 255) {
						local65 = 255;
					}
					this.anIntArray136[local8] = (local23 << 16) + (local45 << 8) + local65;
				}
			}
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("20855, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QEHNWGKD", name = "a", descriptor = "(Z)V")
	public void method389() {
		try {
			@Pc(18) int[] local18 = new int[this.anInt564 * this.anInt565];
			for (@Pc(20) int local20 = 0; local20 < this.anInt561; local20++) {
				for (@Pc(24) int local24 = 0; local24 < this.anInt560; local24++) {
					local18[(local20 + this.anInt563) * this.anInt564 + local24 + this.anInt562] = this.anIntArray136[local20 * this.anInt560 + local24];
				}
			}
			this.anIntArray136 = local18;
			this.anInt560 = this.anInt564;
			this.anInt561 = this.anInt565;
			this.anInt562 = 0;
			this.anInt563 = 0;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("41166, " + false + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QEHNWGKD", name = "a", descriptor = "(BII)V")
	public void method390(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt562;
			arg1 += this.anInt563;
			@Pc(19) int local19 = arg0 + arg1 * Class1_Sub2_Sub1.anInt710;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt561;
			@Pc(27) int local27 = this.anInt560;
			@Pc(31) int local31 = Class1_Sub2_Sub1.anInt710 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg1 < Class1_Sub2_Sub1.anInt712) {
				local40 = Class1_Sub2_Sub1.anInt712 - arg1;
				local24 -= local40;
				arg1 = Class1_Sub2_Sub1.anInt712;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class1_Sub2_Sub1.anInt710;
			}
			if (arg1 + local24 > Class1_Sub2_Sub1.anInt713) {
				local24 -= arg1 + local24 - Class1_Sub2_Sub1.anInt713;
			}
			if (arg0 < Class1_Sub2_Sub1.anInt714) {
				local40 = Class1_Sub2_Sub1.anInt714 - arg0;
				local27 -= local40;
				arg0 = Class1_Sub2_Sub1.anInt714;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg0 + local27 > Class1_Sub2_Sub1.anInt715) {
				local40 = arg0 + local27 - Class1_Sub2_Sub1.anInt715;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method391(local24, local33, local21, local31, this.anIntArray136, Class1_Sub2_Sub1.anIntArray198, local27, local19);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("98044, " + -21 + ", " + arg0 + ", " + arg1 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QEHNWGKD", name = "a", descriptor = "(IIIBI[I[III)V")
	private void method391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(12) int local12 = -(arg6 >> 2);
			@Pc(17) int local17 = -(arg6 & 0x3);
			for (@Pc(20) int local20 = -arg0; local20 < 0; local20++) {
				for (@Pc(24) int local24 = local12; local24 < 0; local24++) {
					arg5[arg7++] = arg4[arg2++];
					arg5[arg7++] = arg4[arg2++];
					arg5[arg7++] = arg4[arg2++];
					arg5[arg7++] = arg4[arg2++];
				}
				for (@Pc(63) int local63 = local17; local63 < 0; local63++) {
					arg5[arg7++] = arg4[arg2++];
				}
				arg7 += arg3;
				arg2 += arg1;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("23933, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 8 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QEHNWGKD", name = "a", descriptor = "(III)V")
	public void method392(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt562;
			arg0 += this.anInt563;
			@Pc(15) int local15 = arg1 + arg0 * Class1_Sub2_Sub1.anInt710;
			@Pc(17) int local17 = 0;
			@Pc(30) int local30 = this.anInt561;
			@Pc(33) int local33 = this.anInt560;
			@Pc(37) int local37 = Class1_Sub2_Sub1.anInt710 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg0 < Class1_Sub2_Sub1.anInt712) {
				local46 = Class1_Sub2_Sub1.anInt712 - arg0;
				local30 -= local46;
				arg0 = Class1_Sub2_Sub1.anInt712;
				local17 = local46 * local33 + 0;
				local15 += local46 * Class1_Sub2_Sub1.anInt710;
			}
			if (arg0 + local30 > Class1_Sub2_Sub1.anInt713) {
				local30 -= arg0 + local30 - Class1_Sub2_Sub1.anInt713;
			}
			if (arg1 < Class1_Sub2_Sub1.anInt714) {
				local46 = Class1_Sub2_Sub1.anInt714 - arg1;
				local33 -= local46;
				arg1 = Class1_Sub2_Sub1.anInt714;
				local17 += local46;
				local15 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg1 + local33 > Class1_Sub2_Sub1.anInt715) {
				local46 = arg1 + local33 - Class1_Sub2_Sub1.anInt715;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method393(Class1_Sub2_Sub1.anIntArray198, this.anIntArray136, local17, local15, local33, local30, local37, local39);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("84623, " + 48946 + ", " + arg0 + ", " + arg1 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QEHNWGKD", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method393(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!QEHNWGKD", name = "a", descriptor = "(ZIII)V")
	public void method394(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		try {
			arg0 += this.anInt562;
			arg1 += this.anInt563;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub2_Sub1.anInt710;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt561;
			@Pc(23) int local23 = this.anInt560;
			@Pc(27) int local27 = Class1_Sub2_Sub1.anInt710 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class1_Sub2_Sub1.anInt712) {
				local36 = Class1_Sub2_Sub1.anInt712 - arg1;
				local20 -= local36;
				arg1 = Class1_Sub2_Sub1.anInt712;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub2_Sub1.anInt710;
			}
			if (arg1 + local20 > Class1_Sub2_Sub1.anInt713) {
				local20 -= arg1 + local20 - Class1_Sub2_Sub1.anInt713;
			}
			if (arg0 < Class1_Sub2_Sub1.anInt714) {
				local36 = Class1_Sub2_Sub1.anInt714 - arg0;
				local23 -= local36;
				arg0 = Class1_Sub2_Sub1.anInt714;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class1_Sub2_Sub1.anInt715) {
				local36 = arg0 + local23 - Class1_Sub2_Sub1.anInt715;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method395(local27, local23, local29, local20, Class1_Sub2_Sub1.anIntArray198, local15, local17, 0, this.anIntArray136);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("20234, " + true + ", " + 128 + ", " + arg0 + ", " + arg1 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QEHNWGKD", name = "a", descriptor = "(IIIIII[IIII[I)V")
	private void method395(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int[] arg8) {
		try {
			for (@Pc(12) int local12 = -arg3; local12 < 0; local12++) {
				for (@Pc(17) int local17 = -arg1; local17 < 0; local17++) {
					@Pc(24) int local24 = arg8[arg6++];
					if (local24 == 0) {
						arg5++;
					} else {
						@Pc(30) int local30 = arg4[arg5];
						arg4[arg5++] = ((local24 & 0xFF00FF) * 128 + (local30 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local24 & 0xFF00) * 128 + (local30 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg5 += arg0;
				arg6 += arg2;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("91781, " + arg0 + ", " + 128 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 35947 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QEHNWGKD", name = "a", descriptor = "(IIIZII[II[III)V")
	public void method396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(16) int local16 = -arg0 / 2;
				@Pc(21) int local21 = -arg8 / 2;
				@Pc(30) int local30 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
				@Pc(39) int local39 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
				@Pc(45) int local45 = local30 * arg3 >> 8;
				@Pc(51) int local51 = local39 * arg3 >> 8;
				@Pc(63) int local63 = (arg1 << 16) + local21 * local45 + local16 * local51;
				@Pc(75) int local75 = (arg2 << 16) + (local21 * local51 - local16 * local45);
				@Pc(81) int local81 = arg9 + arg4 * Class1_Sub2_Sub1.anInt710;
				for (@Pc(83) int local83 = 0; local83 < arg8; local83++) {
					@Pc(89) int local89 = arg5[local83];
					@Pc(93) int local93 = local81 + local89;
					@Pc(99) int local99 = local63 + local51 * local89;
					@Pc(105) int local105 = local75 - local45 * local89;
					for (@Pc(110) int local110 = -arg7[local83]; local110 < 0; local110++) {
						Class1_Sub2_Sub1.anIntArray198[local93++] = this.anIntArray136[(local99 >> 16) + (local105 >> 16) * this.anInt560];
						local99 += local51;
						local105 -= local45;
					}
					local63 += local45;
					local75 += local51;
					local81 += Class1_Sub2_Sub1.anInt710;
				}
			} catch (@Pc(158) Exception local158) {
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("95901, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QEHNWGKD", name = "a", descriptor = "(IIIIIIDII)V")
	public void method397(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(6) double arg2) {
		try {
			try {
				@Pc(26) int local26 = (int) (Math.sin(arg2) * 65536.0D);
				@Pc(32) int local32 = (int) (Math.cos(arg2) * 65536.0D);
				@Pc(38) int local38 = local26 * 256 >> 8;
				@Pc(44) int local44 = local32 * 256 >> 8;
				@Pc(56) int local56 = local38 * -10 + local44 * -10 + 983040;
				@Pc(68) int local68 = local44 * -10 + 983040 - local38 * -10;
				@Pc(74) int local74 = arg1 + arg0 * Class1_Sub2_Sub1.anInt710;
				for (@Pc(76) int local76 = 0; local76 < 20; local76++) {
					@Pc(80) int local80 = local74;
					@Pc(82) int local82 = local56;
					@Pc(84) int local84 = local68;
					for (@Pc(87) int local87 = -20; local87 < 0; local87++) {
						@Pc(103) int local103 = this.anIntArray136[(local82 >> 16) + (local84 >> 16) * this.anInt560];
						if (local103 == 0) {
							local80++;
						} else {
							Class1_Sub2_Sub1.anIntArray198[local80++] = local103;
						}
						local82 += local44;
						local84 -= local38;
					}
					local56 += local38;
					local68 += local44;
					local74 += Class1_Sub2_Sub1.anInt710;
				}
			} catch (@Pc(142) Exception local142) {
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("12262, " + arg0 + ", " + 20 + ", " + 256 + ", " + arg1 + ", " + 15 + ", " + 20 + ", " + arg2 + ", " + 0 + ", " + 15 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QEHNWGKD", name = "a", descriptor = "(Lclient!BVXAXAEI;IIZ)V")
	public void method398(@OriginalArg(0) Class1_Sub2_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		try {
			arg1 += this.anInt562;
			arg2 += this.anInt563;
			@Pc(15) int local15 = arg1 + arg2 * Class1_Sub2_Sub1.anInt710;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt561;
			@Pc(23) int local23 = this.anInt560;
			@Pc(27) int local27 = Class1_Sub2_Sub1.anInt710 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg2 < Class1_Sub2_Sub1.anInt712) {
				local36 = Class1_Sub2_Sub1.anInt712 - arg2;
				local20 -= local36;
				arg2 = Class1_Sub2_Sub1.anInt712;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub2_Sub1.anInt710;
			}
			if (arg2 + local20 > Class1_Sub2_Sub1.anInt713) {
				local20 -= arg2 + local20 - Class1_Sub2_Sub1.anInt713;
			}
			if (arg1 < Class1_Sub2_Sub1.anInt714) {
				local36 = Class1_Sub2_Sub1.anInt714 - arg1;
				local23 -= local36;
				arg1 = Class1_Sub2_Sub1.anInt714;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg1 + local23 > Class1_Sub2_Sub1.anInt715) {
				local36 = arg1 + local23 - Class1_Sub2_Sub1.anInt715;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method399(arg0.aByteArray1, local17, 0, Class1_Sub2_Sub1.anIntArray198, this.anInt558, local23, local15, local29, this.anIntArray136, local27, local20);
				if (arg3) {
					;
				}
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("8462, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QEHNWGKD", name = "a", descriptor = "([BII[IIIII[III)V")
	private void method399(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			if (arg4 != -40510) {
				this.aBoolean121 = !this.aBoolean121;
			}
			@Pc(17) int local17 = -(arg5 >> 2);
			@Pc(22) int local22 = -(arg5 & 0x3);
			for (@Pc(25) int local25 = -arg10; local25 < 0; local25++) {
				@Pc(36) int local36;
				for (@Pc(29) int local29 = local17; local29 < 0; local29++) {
					local36 = arg8[arg1++];
					if (local36 != 0 && arg0[arg6] == 0) {
						arg3[arg6++] = local36;
					} else {
						arg6++;
					}
					local36 = arg8[arg1++];
					if (local36 != 0 && arg0[arg6] == 0) {
						arg3[arg6++] = local36;
					} else {
						arg6++;
					}
					local36 = arg8[arg1++];
					if (local36 != 0 && arg0[arg6] == 0) {
						arg3[arg6++] = local36;
					} else {
						arg6++;
					}
					local36 = arg8[arg1++];
					if (local36 != 0 && arg0[arg6] == 0) {
						arg3[arg6++] = local36;
					} else {
						arg6++;
					}
				}
				for (@Pc(112) int local112 = local22; local112 < 0; local112++) {
					local36 = arg8[arg1++];
					if (local36 != 0 && arg0[arg6] == 0) {
						arg3[arg6++] = local36;
					} else {
						arg6++;
					}
				}
				arg6 += arg9;
				arg1 += arg7;
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("58991, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}
}
