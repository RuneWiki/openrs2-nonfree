import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class1_Sub3_Sub2_Sub2 extends Class1_Sub3_Sub2 {

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
	private int anInt320;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "Z")
	private boolean aBoolean79 = true;

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
	private int anInt321 = 6;

	@OriginalMember(owner = "client!gb", name = "y", descriptor = "[I")
	public int[] anIntArray129;

	@OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
	public int anInt326;

	@OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
	public int anInt322;

	@OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
	private int anInt327;

	@OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
	public int anInt323;

	@OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
	private int anInt325;

	@OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
	private int anInt324;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(III)V")
	public Class1_Sub3_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray129 = new int[arg0 * arg1];
		this.anInt322 = this.anInt326 = arg0;
		this.anInt323 = this.anInt327 = arg1;
		this.anInt324 = this.anInt325 = 0;
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([BLjava/awt/Component;I)V")
	public Class1_Sub3_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(20) Image local20 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(25) MediaTracker local25 = new MediaTracker(arg1);
			local25.addImage(local20, 0);
			local25.waitForAll();
			this.anInt322 = local20.getWidth(arg1);
			this.anInt323 = local20.getHeight(arg1);
			this.anInt326 = this.anInt322;
			this.anInt327 = this.anInt323;
			this.anInt324 = 0;
			this.anInt325 = 0;
			this.anIntArray129 = new int[this.anInt322 * this.anInt323];
			@Pc(79) PixelGrabber local79 = new PixelGrabber(local20, 0, 0, this.anInt322, this.anInt323, this.anIntArray129, 0, this.anInt322);
			local79.grabPixels();
		} catch (@Pc(84) Exception local84) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Ljava/lang/String;IILclient!tb;)V")
	public Class1_Sub3_Sub2_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class34 arg3) {
		@Pc(29) Class1_Sub3_Sub3 local29 = new Class1_Sub3_Sub3(arg3.method428(null, arg0 + ".dat"), (byte) 63);
		@Pc(39) Class1_Sub3_Sub3 local39 = new Class1_Sub3_Sub3(arg3.method428(null, "index.dat"), (byte) 63);
		local39.anInt394 = local29.method333();
		this.anInt326 = local39.method333();
		this.anInt327 = local39.method333();
		@Pc(54) int local54 = local39.method331();
		@Pc(57) int[] local57 = new int[local54];
		for (@Pc(63) int local63 = 0; local63 < local54 - 1; local63++) {
			local57[local63 + 1] = local39.method335();
			if (local57[local63 + 1] == 0) {
				local57[local63 + 1] = 1;
			}
		}
		for (@Pc(97) int local97 = 0; local97 < arg2; local97++) {
			local39.anInt394 += 2;
			local29.anInt394 += local39.method333() * local39.method333();
			local39.anInt394++;
		}
		this.anInt324 = local39.method331();
		this.anInt325 = local39.method331();
		this.anInt322 = local39.method333();
		this.anInt323 = local39.method333();
		@Pc(144) int local144 = local39.method331();
		@Pc(150) int local150 = this.anInt322 * this.anInt323;
		this.anIntArray129 = new int[local150];
		@Pc(158) int local158;
		if (local144 == 0) {
			for (local158 = 0; local158 < local150; local158++) {
				this.anIntArray129[local158] = local57[local29.method331()];
			}
		} else if (local144 == 1) {
			for (local158 = 0; local158 < this.anInt322; local158++) {
				for (@Pc(182) int local182 = 0; local182 < this.anInt323; local182++) {
					this.anIntArray129[local158 + local182 * this.anInt322] = local57[local29.method331()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
	public void method233() {
		Class1_Sub3_Sub2.method266(this.aBoolean79, this.anInt322, this.anIntArray129, this.anInt323);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZII)V")
	public void method234(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 += this.anInt324;
		arg0 += this.anInt325;
		@Pc(15) int local15 = arg1 + arg0 * Class1_Sub3_Sub2.anInt367;
		@Pc(17) int local17 = 0;
		@Pc(25) int local25 = this.anInt323;
		@Pc(28) int local28 = this.anInt322;
		@Pc(32) int local32 = Class1_Sub3_Sub2.anInt367 - local28;
		@Pc(34) int local34 = 0;
		@Pc(41) int local41;
		if (arg0 < Class1_Sub3_Sub2.anInt369) {
			local41 = Class1_Sub3_Sub2.anInt369 - arg0;
			local25 -= local41;
			arg0 = Class1_Sub3_Sub2.anInt369;
			local17 = local41 * local28;
			local15 += local41 * Class1_Sub3_Sub2.anInt367;
		}
		if (arg0 + local25 > Class1_Sub3_Sub2.anInt370) {
			local25 -= arg0 + local25 - Class1_Sub3_Sub2.anInt370;
		}
		if (arg1 < Class1_Sub3_Sub2.anInt371) {
			local41 = Class1_Sub3_Sub2.anInt371 - arg1;
			local28 -= local41;
			arg1 = Class1_Sub3_Sub2.anInt371;
			local17 += local41;
			local15 += local41;
			local34 = local41;
			local32 += local41;
		}
		if (arg1 + local28 > Class1_Sub3_Sub2.anInt372) {
			local41 = arg1 + local28 - Class1_Sub3_Sub2.anInt372;
			local28 -= local41;
			local34 += local41;
			local32 += local41;
		}
		if (local28 > 0 && local25 > 0) {
			this.method235(local28, local34, this.anInt320, Class1_Sub3_Sub2.anIntArray153, local15, local32, this.anIntArray129, local17, local25);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III[III[III)V")
	private void method235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(6) int local6 = -(arg0 >> 2);
		if (arg2 != 0) {
			this.anInt320 = -483;
		}
		@Pc(16) int local16 = -(arg0 & 0x3);
		for (@Pc(19) int local19 = -arg8; local19 < 0; local19++) {
			for (@Pc(23) int local23 = local6; local23 < 0; local23++) {
				arg3[arg4++] = arg6[arg7++];
				arg3[arg4++] = arg6[arg7++];
				arg3[arg4++] = arg6[arg7++];
				arg3[arg4++] = arg6[arg7++];
			}
			for (@Pc(62) int local62 = local16; local62 < 0; local62++) {
				arg3[arg4++] = arg6[arg7++];
			}
			arg4 += arg5;
			arg7 += arg1;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZI)V")
	public void method236(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 += this.anInt324;
		arg1 += this.anInt325;
		@Pc(18) int local18 = arg0 + arg1 * Class1_Sub3_Sub2.anInt367;
		@Pc(20) int local20 = 0;
		@Pc(23) int local23 = this.anInt323;
		@Pc(26) int local26 = this.anInt322;
		@Pc(30) int local30 = Class1_Sub3_Sub2.anInt367 - local26;
		@Pc(32) int local32 = 0;
		@Pc(39) int local39;
		if (arg1 < Class1_Sub3_Sub2.anInt369) {
			local39 = Class1_Sub3_Sub2.anInt369 - arg1;
			local23 -= local39;
			arg1 = Class1_Sub3_Sub2.anInt369;
			local20 = local39 * local26;
			local18 += local39 * Class1_Sub3_Sub2.anInt367;
		}
		if (arg1 + local23 > Class1_Sub3_Sub2.anInt370) {
			local23 -= arg1 + local23 - Class1_Sub3_Sub2.anInt370;
		}
		if (arg0 < Class1_Sub3_Sub2.anInt371) {
			local39 = Class1_Sub3_Sub2.anInt371 - arg0;
			local26 -= local39;
			arg0 = Class1_Sub3_Sub2.anInt371;
			local20 += local39;
			local18 += local39;
			local32 = local39;
			local30 += local39;
		}
		if (arg0 + local26 > Class1_Sub3_Sub2.anInt372) {
			local39 = arg0 + local26 - Class1_Sub3_Sub2.anInt372;
			local26 -= local39;
			local32 += local39;
			local30 += local39;
		}
		if (local26 > 0 && local23 > 0) {
			this.method237(Class1_Sub3_Sub2.anIntArray153, this.anIntArray129, local20, local18, local26, local23, local30, local32);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method237(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII)V")
	public void method238(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 += this.anInt324;
		arg1 += this.anInt325;
		@Pc(24) int local24 = arg0 + arg1 * Class1_Sub3_Sub2.anInt367;
		@Pc(26) int local26 = 0;
		@Pc(29) int local29 = this.anInt323;
		@Pc(32) int local32 = this.anInt322;
		@Pc(36) int local36 = Class1_Sub3_Sub2.anInt367 - local32;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45;
		if (arg1 < Class1_Sub3_Sub2.anInt369) {
			local45 = Class1_Sub3_Sub2.anInt369 - arg1;
			local29 -= local45;
			arg1 = Class1_Sub3_Sub2.anInt369;
			local26 = local45 * local32;
			local24 += local45 * Class1_Sub3_Sub2.anInt367;
		}
		if (arg1 + local29 > Class1_Sub3_Sub2.anInt370) {
			local29 -= arg1 + local29 - Class1_Sub3_Sub2.anInt370;
		}
		if (arg0 < Class1_Sub3_Sub2.anInt371) {
			local45 = Class1_Sub3_Sub2.anInt371 - arg0;
			local32 -= local45;
			arg0 = Class1_Sub3_Sub2.anInt371;
			local26 += local45;
			local24 += local45;
			local38 = local45;
			local36 += local45;
		}
		if (arg0 + local32 > Class1_Sub3_Sub2.anInt372) {
			local45 = arg0 + local32 - Class1_Sub3_Sub2.anInt372;
			local32 -= local45;
			local38 += local45;
			local36 += local45;
		}
		if (local32 > 0 && local29 > 0) {
			this.method239(this.anIntArray129, local24, local38, local26, local36, Class1_Sub3_Sub2.anIntArray153, local29, local32);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([IIIIIII[IIIB)V")
	private void method239(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7) {
		for (@Pc(14) int local14 = -arg6; local14 < 0; local14++) {
			for (@Pc(19) int local19 = -arg7; local19 < 0; local19++) {
				@Pc(26) int local26 = arg0[arg3++];
				if (local26 == 0) {
					arg1++;
				} else {
					@Pc(32) int local32 = arg5[arg1];
					arg5[arg1++] = ((local26 & 0xFF00FF) * 128 + (local32 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local26 & 0xFF00) * 128 + (local32 & 0xFF00) * 128 & 0xFF0000) >> 8;
				}
			}
			arg1 += arg4;
			arg3 += arg2;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIII[II[II)V")
	public void method240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(16) int local16 = -arg6 / 2;
			@Pc(21) int local21 = -arg4 / 2;
			@Pc(30) int local30 = (int) (Math.sin((double) arg3 / 326.11D) * 65536.0D);
			@Pc(39) int local39 = (int) (Math.cos((double) arg3 / 326.11D) * 65536.0D);
			@Pc(51) int local51 = (arg1 << 16) + local21 * local30 + local16 * local39;
			@Pc(63) int local63 = (arg2 << 16) + (local21 * local39 - local16 * local30);
			@Pc(69) int local69 = arg0 + arg8 * Class1_Sub3_Sub2.anInt367;
			for (@Pc(71) int local71 = 0; local71 < arg4; local71++) {
				@Pc(77) int local77 = arg7[local71];
				@Pc(81) int local81 = local69 + local77;
				@Pc(87) int local87 = local51 + local39 * local77;
				@Pc(93) int local93 = local63 - local30 * local77;
				for (@Pc(98) int local98 = -arg5[local71]; local98 < 0; local98++) {
					Class1_Sub3_Sub2.anIntArray153[local81++] = this.anIntArray129[(local87 >> 16) + (local93 >> 16) * this.anInt322];
					local87 += local39;
					local93 -= local30;
				}
				local51 += local30;
				local63 += local39;
				local69 += Class1_Sub3_Sub2.anInt367;
			}
		} catch (@Pc(146) Exception local146) {
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!hb;III)V")
	public void method241(@OriginalArg(0) Class1_Sub3_Sub2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		arg1 += this.anInt324;
		arg2 += this.anInt325;
		@Pc(18) int local18 = arg1 + arg2 * Class1_Sub3_Sub2.anInt367;
		@Pc(20) int local20 = 0;
		@Pc(23) int local23 = this.anInt323;
		@Pc(26) int local26 = this.anInt322;
		@Pc(30) int local30 = Class1_Sub3_Sub2.anInt367 - local26;
		@Pc(32) int local32 = 0;
		@Pc(39) int local39;
		if (arg2 < Class1_Sub3_Sub2.anInt369) {
			local39 = Class1_Sub3_Sub2.anInt369 - arg2;
			local23 -= local39;
			arg2 = Class1_Sub3_Sub2.anInt369;
			local20 = local39 * local26;
			local18 += local39 * Class1_Sub3_Sub2.anInt367;
		}
		if (arg2 + local23 > Class1_Sub3_Sub2.anInt370) {
			local23 -= arg2 + local23 - Class1_Sub3_Sub2.anInt370;
		}
		if (arg1 < Class1_Sub3_Sub2.anInt371) {
			local39 = Class1_Sub3_Sub2.anInt371 - arg1;
			local26 -= local39;
			arg1 = Class1_Sub3_Sub2.anInt371;
			local20 += local39;
			local18 += local39;
			local32 = local39;
			local30 += local39;
		}
		if (arg1 + local26 > Class1_Sub3_Sub2.anInt372) {
			local39 = arg1 + local26 - Class1_Sub3_Sub2.anInt372;
			local26 -= local39;
			local32 += local39;
			local30 += local39;
		}
		if (local26 > 0 && local23 > 0) {
			this.method242(Class1_Sub3_Sub2.anIntArray153, local20, local23, local32, local18, local30, this.anIntArray129, arg0.aByteArray3, local26);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([IIIIZIII[I[BI)V")
	private void method242(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int[] arg6, @OriginalArg(9) byte[] arg7, @OriginalArg(10) int arg8) {
		@Pc(6) int local6 = -(arg8 >> 2);
		@Pc(11) int local11 = -(arg8 & 0x3);
		for (@Pc(14) int local14 = -arg2; local14 < 0; local14++) {
			@Pc(25) int local25;
			for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
				local25 = arg6[arg1++];
				if (local25 != 0 && arg7[arg4] == 0) {
					arg0[arg4++] = local25;
				} else {
					arg4++;
				}
				local25 = arg6[arg1++];
				if (local25 != 0 && arg7[arg4] == 0) {
					arg0[arg4++] = local25;
				} else {
					arg4++;
				}
				local25 = arg6[arg1++];
				if (local25 != 0 && arg7[arg4] == 0) {
					arg0[arg4++] = local25;
				} else {
					arg4++;
				}
				local25 = arg6[arg1++];
				if (local25 != 0 && arg7[arg4] == 0) {
					arg0[arg4++] = local25;
				} else {
					arg4++;
				}
			}
			for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
				local25 = arg6[arg1++];
				if (local25 != 0 && arg7[arg4] == 0) {
					arg0[arg4++] = local25;
				} else {
					arg4++;
				}
			}
			arg4 += arg5;
			arg1 += arg3;
		}
	}
}
