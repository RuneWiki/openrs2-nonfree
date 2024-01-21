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

@OriginalClass("client!EFVUNBHT")
public final class Class1_Sub1_Sub2_Sub2 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!EFVUNBHT", name = "x", descriptor = "I")
	private int anInt277 = -29787;

	@OriginalMember(owner = "client!EFVUNBHT", name = "y", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!EFVUNBHT", name = "z", descriptor = "I")
	private int anInt278 = 7;

	@OriginalMember(owner = "client!EFVUNBHT", name = "A", descriptor = "I")
	private int anInt279 = -32457;

	@OriginalMember(owner = "client!EFVUNBHT", name = "B", descriptor = "B")
	private byte aByte2 = 3;

	@OriginalMember(owner = "client!EFVUNBHT", name = "C", descriptor = "I")
	private int anInt280 = 850;

	@OriginalMember(owner = "client!EFVUNBHT", name = "D", descriptor = "B")
	private byte aByte3 = -55;

	@OriginalMember(owner = "client!EFVUNBHT", name = "E", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!EFVUNBHT", name = "F", descriptor = "I")
	private int anInt281 = 398;

	@OriginalMember(owner = "client!EFVUNBHT", name = "G", descriptor = "[I")
	public int[] anIntArray33;

	@OriginalMember(owner = "client!EFVUNBHT", name = "L", descriptor = "I")
	public int anInt286;

	@OriginalMember(owner = "client!EFVUNBHT", name = "H", descriptor = "I")
	public int anInt282;

	@OriginalMember(owner = "client!EFVUNBHT", name = "M", descriptor = "I")
	public int anInt287;

	@OriginalMember(owner = "client!EFVUNBHT", name = "I", descriptor = "I")
	public int anInt283;

	@OriginalMember(owner = "client!EFVUNBHT", name = "K", descriptor = "I")
	private int anInt285;

	@OriginalMember(owner = "client!EFVUNBHT", name = "J", descriptor = "I")
	private int anInt284;

	@OriginalMember(owner = "client!EFVUNBHT", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray33 = new int[arg0 * arg1];
		this.anInt282 = this.anInt286 = arg0;
		this.anInt283 = this.anInt287 = arg1;
		this.anInt284 = this.anInt285 = 0;
	}

	@OriginalMember(owner = "client!EFVUNBHT", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(32) Image local32 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(37) MediaTracker local37 = new MediaTracker(arg1);
			local37.addImage(local32, 0);
			local37.waitForAll();
			this.anInt282 = local32.getWidth(arg1);
			this.anInt283 = local32.getHeight(arg1);
			this.anInt286 = this.anInt282;
			this.anInt287 = this.anInt283;
			this.anInt284 = 0;
			this.anInt285 = 0;
			this.anIntArray33 = new int[this.anInt282 * this.anInt283];
			@Pc(91) PixelGrabber local91 = new PixelGrabber(local32, 0, 0, this.anInt282, this.anInt283, this.anIntArray33, 0, this.anInt282);
			local91.grabPixels();
		} catch (@Pc(96) Exception local96) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!EFVUNBHT", name = "<init>", descriptor = "(Lclient!HBJEXSJX;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) Class13 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(46) Class1_Sub1_Sub3 local46 = new Class1_Sub1_Sub3(arg0.method278(arg1 + ".dat", null), 0);
		@Pc(55) Class1_Sub1_Sub3 local55 = new Class1_Sub1_Sub3(arg0.method278("index.dat", null), 0);
		local55.anInt301 = local46.method157();
		this.anInt286 = local55.method157();
		this.anInt287 = local55.method157();
		@Pc(70) int local70 = local55.method155();
		@Pc(73) int[] local73 = new int[local70];
		for (@Pc(75) int local75 = 0; local75 < local70 - 1; local75++) {
			local73[local75 + 1] = local55.method159();
			if (local73[local75 + 1] == 0) {
				local73[local75 + 1] = 1;
			}
		}
		for (@Pc(110) int local110 = 0; local110 < arg2; local110++) {
			local55.anInt301 += 2;
			local46.anInt301 += local55.method157() * local55.method157();
			local55.anInt301++;
		}
		this.anInt284 = local55.method155();
		this.anInt285 = local55.method155();
		this.anInt282 = local55.method157();
		this.anInt283 = local55.method157();
		@Pc(157) int local157 = local55.method155();
		@Pc(163) int local163 = this.anInt282 * this.anInt283;
		this.anIntArray33 = new int[local163];
		@Pc(171) int local171;
		if (local157 == 0) {
			for (local171 = 0; local171 < local163; local171++) {
				this.anIntArray33[local171] = local73[local46.method155()];
			}
		} else if (local157 == 1) {
			for (local171 = 0; local171 < this.anInt282; local171++) {
				for (@Pc(195) int local195 = 0; local195 < this.anInt283; local195++) {
					this.anIntArray33[local171 + local195 * this.anInt282] = local73[local46.method155()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!EFVUNBHT", name = "c", descriptor = "(I)V")
	public void method124() {
		try {
			Class1_Sub1_Sub2.method346(this.anInt282, this.anInt283, this.anIntArray33);
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("41957, " + -186 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EFVUNBHT", name = "a", descriptor = "(IIIB)V")
	public void method125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray33.length; local7++) {
				@Pc(14) int local14 = this.anIntArray33[local7];
				if (local14 != 0) {
					@Pc(22) int local22 = local14 >> 16 & 0xFF;
					local22 += arg2;
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
					this.anIntArray33[local7] = (local22 << 16) + (local44 << 8) + local64;
				}
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("87366, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -108 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EFVUNBHT", name = "d", descriptor = "(I)V")
	public void method126(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) int[] local8 = new int[this.anInt286 * this.anInt287];
			for (@Pc(10) int local10 = 0; local10 < this.anInt283; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt282; local14++) {
					local8[(local10 + this.anInt285) * this.anInt286 + local14 + this.anInt284] = this.anIntArray33[local10 * this.anInt282 + local14];
				}
			}
			this.anIntArray33 = local8;
			this.anInt282 = this.anInt286;
			this.anInt283 = this.anInt287;
			this.anInt284 = 0;
			if (arg0 == this.anInt279) {
				this.anInt285 = 0;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("47021, " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EFVUNBHT", name = "a", descriptor = "(III)V")
	public void method127(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt284;
			arg0 += this.anInt285;
			@Pc(15) int local15 = arg1 + arg0 * Class1_Sub1_Sub2.anInt550;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt283;
			@Pc(23) int local23 = this.anInt282;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt550 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg0 < Class1_Sub1_Sub2.anInt552) {
				local36 = Class1_Sub1_Sub2.anInt552 - arg0;
				local20 -= local36;
				arg0 = Class1_Sub1_Sub2.anInt552;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub1_Sub2.anInt550;
			}
			if (arg0 + local20 > Class1_Sub1_Sub2.anInt553) {
				local20 -= arg0 + local20 - Class1_Sub1_Sub2.anInt553;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt554) {
				local36 = Class1_Sub1_Sub2.anInt554 - arg1;
				local23 -= local36;
				arg1 = Class1_Sub1_Sub2.anInt554;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg1 + local23 > Class1_Sub1_Sub2.anInt555) {
				local36 = arg1 + local23 - Class1_Sub1_Sub2.anInt555;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method128(local23, local17, local20, this.anIntArray33, local15, local27, Class1_Sub1_Sub2.anIntArray86, local29);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("89640, " + -812 + ", " + arg0 + ", " + arg1 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EFVUNBHT", name = "a", descriptor = "(III[IIII[II)V")
	private void method128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(6) int local6 = -(arg0 >> 2);
			@Pc(11) int local11 = -(arg0 & 0x3);
			for (@Pc(14) int local14 = -arg2; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					arg6[arg4++] = arg3[arg1++];
					arg6[arg4++] = arg3[arg1++];
					arg6[arg4++] = arg3[arg1++];
					arg6[arg4++] = arg3[arg1++];
				}
				for (@Pc(57) int local57 = local11; local57 < 0; local57++) {
					arg6[arg4++] = arg3[arg1++];
				}
				arg4 += arg5;
				arg1 += arg7;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("43544, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 5 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EFVUNBHT", name = "b", descriptor = "(III)V")
	public void method129(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt284;
			arg1 += this.anInt285;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt550;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt283;
			@Pc(23) int local23 = this.anInt282;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt550 - local23;
			@Pc(29) int local29 = 0;
			@Pc(45) int local45;
			if (arg1 < Class1_Sub1_Sub2.anInt552) {
				local45 = Class1_Sub1_Sub2.anInt552 - arg1;
				local20 -= local45;
				arg1 = Class1_Sub1_Sub2.anInt552;
				local17 = local45 * local23 + 0;
				local15 += local45 * Class1_Sub1_Sub2.anInt550;
			}
			if (arg1 + local20 > Class1_Sub1_Sub2.anInt553) {
				local20 -= arg1 + local20 - Class1_Sub1_Sub2.anInt553;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt554) {
				local45 = Class1_Sub1_Sub2.anInt554 - arg0;
				local23 -= local45;
				arg0 = Class1_Sub1_Sub2.anInt554;
				local17 += local45;
				local15 += local45;
				local29 = local45 + 0;
				local27 += local45;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt555) {
				local45 = arg0 + local23 - Class1_Sub1_Sub2.anInt555;
				local23 -= local45;
				local29 += local45;
				local27 += local45;
			}
			if (local23 > 0 && local20 > 0) {
				this.method130(Class1_Sub1_Sub2.anIntArray86, this.anIntArray33, local17, local15, local23, local20, local27, local29);
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("9948, " + 1 + ", " + arg0 + ", " + arg1 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EFVUNBHT", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method130(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!EFVUNBHT", name = "a", descriptor = "(IIIZ)V")
	public void method131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg1 += this.anInt284;
			arg0 += this.anInt285;
			@Pc(18) int local18 = arg1 + arg0 * Class1_Sub1_Sub2.anInt550;
			@Pc(20) int local20 = 0;
			@Pc(23) int local23 = this.anInt283;
			@Pc(26) int local26 = this.anInt282;
			@Pc(30) int local30 = Class1_Sub1_Sub2.anInt550 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg0 < Class1_Sub1_Sub2.anInt552) {
				local39 = Class1_Sub1_Sub2.anInt552 - arg0;
				local23 -= local39;
				arg0 = Class1_Sub1_Sub2.anInt552;
				local20 = local39 * local26 + 0;
				local18 += local39 * Class1_Sub1_Sub2.anInt550;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt553) {
				local23 -= arg0 + local23 - Class1_Sub1_Sub2.anInt553;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt554) {
				local39 = Class1_Sub1_Sub2.anInt554 - arg1;
				local26 -= local39;
				arg1 = Class1_Sub1_Sub2.anInt554;
				local20 += local39;
				local18 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg1 + local26 > Class1_Sub1_Sub2.anInt555) {
				local39 = arg1 + local26 - Class1_Sub1_Sub2.anInt555;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method132(local18, local20, 0, this.anIntArray33, local23, local30, local26, Class1_Sub1_Sub2.anIntArray86, local32);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("71423, " + arg0 + ", " + arg1 + ", " + 128 + ", " + false + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EFVUNBHT", name = "a", descriptor = "(IIII[IIIII[II)V")
	private void method132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) int[] arg7, @OriginalArg(10) int arg8) {
		try {
			for (@Pc(13) int local13 = -arg4; local13 < 0; local13++) {
				for (@Pc(18) int local18 = -arg6; local18 < 0; local18++) {
					@Pc(25) int local25 = arg3[arg1++];
					if (local25 == 0) {
						arg0++;
					} else {
						@Pc(31) int local31 = arg7[arg0];
						arg7[arg0++] = ((local25 & 0xFF00FF) * 128 + (local31 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local25 & 0xFF00) * 128 + (local31 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg0 += arg5;
				arg1 += arg8;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("85712, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 128 + ", " + arg7 + ", " + arg8 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EFVUNBHT", name = "a", descriptor = "(I[IIII[IZIIII)V")
	public void method133(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(16) int local16 = -arg0 / 2;
				@Pc(21) int local21 = -arg4 / 2;
				@Pc(30) int local30 = (int) (Math.sin((double) arg8 / 326.11D) * 65536.0D);
				@Pc(39) int local39 = (int) (Math.cos((double) arg8 / 326.11D) * 65536.0D);
				@Pc(45) int local45 = local30 * arg6 >> 8;
				@Pc(51) int local51 = local39 * arg6 >> 8;
				@Pc(63) int local63 = (arg3 << 16) + local21 * local45 + local16 * local51;
				@Pc(75) int local75 = (arg9 << 16) + (local21 * local51 - local16 * local45);
				@Pc(81) int local81 = arg2 + arg7 * Class1_Sub1_Sub2.anInt550;
				for (@Pc(83) int local83 = 0; local83 < arg4; local83++) {
					@Pc(89) int local89 = arg5[local83];
					@Pc(93) int local93 = local81 + local89;
					@Pc(99) int local99 = local63 + local51 * local89;
					@Pc(105) int local105 = local75 - local45 * local89;
					for (@Pc(110) int local110 = -arg1[local83]; local110 < 0; local110++) {
						Class1_Sub1_Sub2.anIntArray86[local93++] = this.anIntArray33[(local99 >> 16) + (local105 >> 16) * this.anInt282];
						local99 += local51;
						local105 -= local45;
					}
					local63 += local45;
					local75 += local51;
					local81 += Class1_Sub1_Sub2.anInt550;
				}
			} catch (@Pc(158) Exception local158) {
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("12482, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + true + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EFVUNBHT", name = "a", descriptor = "(IIIIIDIII)V")
	public void method134(@OriginalArg(2) int arg0, @OriginalArg(5) double arg1, @OriginalArg(7) int arg2, @OriginalArg(8) int arg3) {
		try {
			@Pc(5) boolean local5 = false;
			try {
				@Pc(21) int local21 = (int) (Math.sin(arg1) * 65536.0D);
				@Pc(27) int local27 = (int) (Math.cos(arg1) * 65536.0D);
				@Pc(33) int local33 = local21 * 256 >> 8;
				@Pc(39) int local39 = local27 * 256 >> 8;
				@Pc(51) int local51 = local33 * -10 + local39 * -10 + 983040;
				@Pc(63) int local63 = local39 * -10 + 983040 - local33 * -10;
				@Pc(69) int local69 = arg3 + arg2 * Class1_Sub1_Sub2.anInt550;
				for (@Pc(71) int local71 = 0; local71 < 20; local71++) {
					@Pc(75) int local75 = local69;
					@Pc(77) int local77 = local51;
					@Pc(79) int local79 = local63;
					for (@Pc(82) int local82 = -20; local82 < 0; local82++) {
						@Pc(98) int local98 = this.anIntArray33[(local77 >> 16) + (local79 >> 16) * this.anInt282];
						if (local98 == 0) {
							local75++;
						} else {
							Class1_Sub1_Sub2.anIntArray86[local75++] = local98;
						}
						local77 += local39;
						local79 -= local33;
					}
					local51 += local33;
					local63 += local39;
					local69 += Class1_Sub1_Sub2.anInt550;
				}
			} catch (@Pc(137) Exception local137) {
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("1678, " + 15 + ", " + 20 + ", " + arg0 + ", " + 20 + ", " + 15 + ", " + arg1 + ", " + 256 + ", " + arg2 + ", " + arg3 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EFVUNBHT", name = "a", descriptor = "(Lclient!MRCVLIXG;IIB)V")
	public void method135(@OriginalArg(0) Class1_Sub1_Sub2_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.aByte3 == -55) {
				arg1 += this.anInt284;
				arg2 += this.anInt285;
				@Pc(20) int local20 = arg1 + arg2 * Class1_Sub1_Sub2.anInt550;
				@Pc(22) int local22 = 0;
				@Pc(25) int local25 = this.anInt283;
				@Pc(28) int local28 = this.anInt282;
				@Pc(32) int local32 = Class1_Sub1_Sub2.anInt550 - local28;
				@Pc(34) int local34 = 0;
				@Pc(41) int local41;
				if (arg2 < Class1_Sub1_Sub2.anInt552) {
					local41 = Class1_Sub1_Sub2.anInt552 - arg2;
					local25 -= local41;
					arg2 = Class1_Sub1_Sub2.anInt552;
					local22 = local41 * local28 + 0;
					local20 += local41 * Class1_Sub1_Sub2.anInt550;
				}
				if (arg2 + local25 > Class1_Sub1_Sub2.anInt553) {
					local25 -= arg2 + local25 - Class1_Sub1_Sub2.anInt553;
				}
				if (arg1 < Class1_Sub1_Sub2.anInt554) {
					local41 = Class1_Sub1_Sub2.anInt554 - arg1;
					local28 -= local41;
					arg1 = Class1_Sub1_Sub2.anInt554;
					local22 += local41;
					local20 += local41;
					local34 = local41 + 0;
					local32 += local41;
				}
				if (arg1 + local28 > Class1_Sub1_Sub2.anInt555) {
					local41 = arg1 + local28 - Class1_Sub1_Sub2.anInt555;
					local28 -= local41;
					local34 += local41;
					local32 += local41;
				}
				if (local28 > 0 && local25 > 0) {
					this.method136(local20, local34, local28, Class1_Sub1_Sub2.anIntArray86, local32, 0, local25, this.anIntArray33, arg0.aByteArray11, local22);
				}
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("78726, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -55 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EFVUNBHT", name = "a", descriptor = "(III[IIIII[I[BI)V")
	private void method136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) byte[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = -(arg2 >> 2);
			@Pc(14) int local14 = -(arg2 & 0x3);
			for (@Pc(17) int local17 = -arg6; local17 < 0; local17++) {
				@Pc(28) int local28;
				for (@Pc(21) int local21 = local9; local21 < 0; local21++) {
					local28 = arg7[arg9++];
					if (local28 != 0 && arg8[arg0] == 0) {
						arg3[arg0++] = local28;
					} else {
						arg0++;
					}
					local28 = arg7[arg9++];
					if (local28 != 0 && arg8[arg0] == 0) {
						arg3[arg0++] = local28;
					} else {
						arg0++;
					}
					local28 = arg7[arg9++];
					if (local28 != 0 && arg8[arg0] == 0) {
						arg3[arg0++] = local28;
					} else {
						arg0++;
					}
					local28 = arg7[arg9++];
					if (local28 != 0 && arg8[arg0] == 0) {
						arg3[arg0++] = local28;
					} else {
						arg0++;
					}
				}
				for (@Pc(104) int local104 = local14; local104 < 0; local104++) {
					local28 = arg7[arg9++];
					if (local28 != 0 && arg8[arg0] == 0) {
						arg3[arg0++] = local28;
					} else {
						arg0++;
					}
				}
				arg0 += arg4;
				arg9 += arg1;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("5831, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}
