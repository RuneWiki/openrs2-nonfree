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

@OriginalClass("client!jb")
public final class Class1_Sub1_Sub2_Sub2 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
	private int anInt676 = 2;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
	private int anInt677 = 859;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "B")
	private byte aByte31 = -107;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "Z")
	private boolean aBoolean163 = true;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
	private int anInt678 = 2;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "Z")
	private boolean aBoolean164 = false;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "[I")
	public int[] anIntArray210;

	@OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
	public int anInt683;

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
	public int anInt679;

	@OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
	public int anInt684;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
	public int anInt680;

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
	private int anInt682;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
	private int anInt681;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray210 = new int[arg0 * arg1];
		this.anInt679 = this.anInt683 = arg0;
		this.anInt680 = this.anInt684 = arg1;
		this.anInt681 = this.anInt682 = 0;
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(23) Image local23 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(28) MediaTracker local28 = new MediaTracker(arg1);
			local28.addImage(local23, 0);
			local28.waitForAll();
			this.anInt679 = local23.getWidth(arg1);
			this.anInt680 = local23.getHeight(arg1);
			this.anInt683 = this.anInt679;
			this.anInt684 = this.anInt680;
			this.anInt681 = 0;
			this.anInt682 = 0;
			this.anIntArray210 = new int[this.anInt679 * this.anInt680];
			@Pc(82) PixelGrabber local82 = new PixelGrabber(local23, 0, 0, this.anInt679, this.anInt680, this.anIntArray210, 0, this.anInt679);
			local82.grabPixels();
		} catch (@Pc(87) Exception local87) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!yb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) Class48 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(arg0.method678(arg1 + ".dat", null), 337);
		@Pc(46) Class1_Sub1_Sub3 local46 = new Class1_Sub1_Sub3(arg0.method678("index.dat", null), 337);
		local46.anInt768 = local37.method500();
		this.anInt683 = local46.method500();
		this.anInt684 = local46.method500();
		@Pc(61) int local61 = local46.method498();
		@Pc(64) int[] local64 = new int[local61];
		for (@Pc(66) int local66 = 0; local66 < local61 - 1; local66++) {
			local64[local66 + 1] = local46.method502();
			if (local64[local66 + 1] == 0) {
				local64[local66 + 1] = 1;
			}
		}
		for (@Pc(101) int local101 = 0; local101 < arg2; local101++) {
			local46.anInt768 += 2;
			local37.anInt768 += local46.method500() * local46.method500();
			local46.anInt768++;
		}
		this.anInt681 = local46.method498();
		this.anInt682 = local46.method498();
		this.anInt679 = local46.method500();
		this.anInt680 = local46.method500();
		@Pc(148) int local148 = local46.method498();
		@Pc(154) int local154 = this.anInt679 * this.anInt680;
		this.anIntArray210 = new int[local154];
		@Pc(162) int local162;
		if (local148 == 0) {
			for (local162 = 0; local162 < local154; local162++) {
				this.anIntArray210[local162] = local64[local37.method498()];
			}
		} else if (local148 == 1) {
			for (local162 = 0; local162 < this.anInt679; local162++) {
				for (@Pc(186) int local186 = 0; local186 < this.anInt680; local186++) {
					this.anIntArray210[local162 + local186 * this.anInt679] = local64[local37.method498()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
	public void method401() {
		try {
			Class1_Sub1_Sub2.method453(this.anIntArray210, this.anInt679, this.anInt680);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("39486, " + 3 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
	public void method402(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray210.length; local7++) {
				@Pc(14) int local14 = this.anIntArray210[local7];
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
					this.anIntArray210[local7] = (local22 << 16) + (local44 << 8) + local64;
				}
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("29603, " + 7 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
	public void method403() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt683 * this.anInt684];
			for (@Pc(10) int local10 = 0; local10 < this.anInt680; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt679; local14++) {
					local8[(local10 + this.anInt682) * this.anInt683 + local14 + this.anInt681] = this.anIntArray210[local10 * this.anInt679 + local14];
				}
			}
			this.anIntArray210 = local8;
			this.anInt679 = this.anInt683;
			this.anInt680 = this.anInt684;
			this.anInt681 = 0;
			this.anInt682 = 0;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("6079, " + 9 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZ)V")
	public void method404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt681;
			arg1 += this.anInt682;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt734;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt680;
			@Pc(23) int local23 = this.anInt679;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt734 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class1_Sub1_Sub2.anInt736) {
				local36 = Class1_Sub1_Sub2.anInt736 - arg1;
				local20 -= local36;
				arg1 = Class1_Sub1_Sub2.anInt736;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub1_Sub2.anInt734;
			}
			if (arg1 + local20 > Class1_Sub1_Sub2.anInt737) {
				local20 -= arg1 + local20 - Class1_Sub1_Sub2.anInt737;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt738) {
				local36 = Class1_Sub1_Sub2.anInt738 - arg0;
				local23 -= local36;
				arg0 = Class1_Sub1_Sub2.anInt738;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt739) {
				local36 = arg0 + local23 - Class1_Sub1_Sub2.anInt739;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method405(Class1_Sub1_Sub2.anIntArray213, local15, local20, local27, local17, this.anIntArray210, local29, local23);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("58261, " + arg0 + ", " + arg1 + ", " + false + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([IIBIII[III)V")
	private void method405(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(6) int local6 = -(arg7 >> 2);
			@Pc(11) int local11 = -(arg7 & 0x3);
			for (@Pc(14) int local14 = -arg2; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					arg0[arg1++] = arg5[arg4++];
					arg0[arg1++] = arg5[arg4++];
					arg0[arg1++] = arg5[arg4++];
					arg0[arg1++] = arg5[arg4++];
				}
				for (@Pc(57) int local57 = local11; local57 < 0; local57++) {
					arg0[arg1++] = arg5[arg4++];
				}
				arg1 += arg3;
				arg4 += arg6;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("64105, " + arg0 + ", " + arg1 + ", " + 3 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	public void method406(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt681;
			arg0 += this.anInt682;
			@Pc(24) int local24 = arg1 + arg0 * Class1_Sub1_Sub2.anInt734;
			@Pc(26) int local26 = 0;
			@Pc(29) int local29 = this.anInt680;
			@Pc(32) int local32 = this.anInt679;
			@Pc(36) int local36 = Class1_Sub1_Sub2.anInt734 - local32;
			@Pc(38) int local38 = 0;
			@Pc(45) int local45;
			if (arg0 < Class1_Sub1_Sub2.anInt736) {
				local45 = Class1_Sub1_Sub2.anInt736 - arg0;
				local29 -= local45;
				arg0 = Class1_Sub1_Sub2.anInt736;
				local26 = local45 * local32 + 0;
				local24 += local45 * Class1_Sub1_Sub2.anInt734;
			}
			if (arg0 + local29 > Class1_Sub1_Sub2.anInt737) {
				local29 -= arg0 + local29 - Class1_Sub1_Sub2.anInt737;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt738) {
				local45 = Class1_Sub1_Sub2.anInt738 - arg1;
				local32 -= local45;
				arg1 = Class1_Sub1_Sub2.anInt738;
				local26 += local45;
				local24 += local45;
				local38 = local45 + 0;
				local36 += local45;
			}
			if (arg1 + local32 > Class1_Sub1_Sub2.anInt739) {
				local45 = arg1 + local32 - Class1_Sub1_Sub2.anInt739;
				local32 -= local45;
				local38 += local45;
				local36 += local45;
			}
			if (local32 > 0 && local29 > 0) {
				this.method407(Class1_Sub1_Sub2.anIntArray213, this.anIntArray210, local26, local24, local32, local29, local36, local38);
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("40930, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method407(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(IIII)V")
	public void method408(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		try {
			arg0 += this.anInt681;
			arg1 += this.anInt682;
			@Pc(25) int local25 = arg0 + arg1 * Class1_Sub1_Sub2.anInt734;
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = this.anInt680;
			@Pc(33) int local33 = this.anInt679;
			@Pc(37) int local37 = Class1_Sub1_Sub2.anInt734 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg1 < Class1_Sub1_Sub2.anInt736) {
				local46 = Class1_Sub1_Sub2.anInt736 - arg1;
				local30 -= local46;
				arg1 = Class1_Sub1_Sub2.anInt736;
				local27 = local46 * local33 + 0;
				local25 += local46 * Class1_Sub1_Sub2.anInt734;
			}
			if (arg1 + local30 > Class1_Sub1_Sub2.anInt737) {
				local30 -= arg1 + local30 - Class1_Sub1_Sub2.anInt737;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt738) {
				local46 = Class1_Sub1_Sub2.anInt738 - arg0;
				local33 -= local46;
				arg0 = Class1_Sub1_Sub2.anInt738;
				local27 += local46;
				local25 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg0 + local33 > Class1_Sub1_Sub2.anInt739) {
				local46 = arg0 + local33 - Class1_Sub1_Sub2.anInt739;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method409(local39, local25, 0, local33, Class1_Sub1_Sub2.anIntArray213, local37, local27, local30, this.anIntArray210);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("67494, " + 128 + ", " + arg0 + ", " + 25372 + ", " + arg1 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIII[IZIII[I)V")
	private void method409(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int[] arg8) {
		try {
			for (@Pc(8) int local8 = -arg7; local8 < 0; local8++) {
				for (@Pc(13) int local13 = -arg3; local13 < 0; local13++) {
					@Pc(20) int local20 = arg8[arg6++];
					if (local20 == 0) {
						arg1++;
					} else {
						@Pc(26) int local26 = arg4[arg1];
						arg4[arg1++] = ((local20 & 0xFF00FF) * 128 + (local26 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local20 & 0xFF00) * 128 + (local26 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg1 += arg5;
				arg6 += arg0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("55645, " + arg0 + ", " + 128 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[IIIIIII[III)V")
	public void method410(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(15) int local15 = -arg4 / 2;
				@Pc(20) int local20 = -arg3 / 2;
				@Pc(29) int local29 = (int) (Math.sin((double) arg8 / 326.11D) * 65536.0D);
				@Pc(38) int local38 = (int) (Math.cos((double) arg8 / 326.11D) * 65536.0D);
				@Pc(44) int local44 = local29 * arg9 >> 8;
				@Pc(50) int local50 = local38 * arg9 >> 8;
				@Pc(62) int local62 = (arg2 << 16) + local20 * local44 + local15 * local50;
				@Pc(74) int local74 = (arg5 << 16) + (local20 * local50 - local15 * local44);
				@Pc(80) int local80 = arg6 + arg0 * Class1_Sub1_Sub2.anInt734;
				for (@Pc(82) int local82 = 0; local82 < arg3; local82++) {
					@Pc(88) int local88 = arg7[local82];
					@Pc(92) int local92 = local80 + local88;
					@Pc(98) int local98 = local62 + local50 * local88;
					@Pc(104) int local104 = local74 - local44 * local88;
					for (@Pc(109) int local109 = -arg1[local82]; local109 < 0; local109++) {
						Class1_Sub1_Sub2.anIntArray213[local92++] = this.anIntArray210[(local98 >> 16) + (local104 >> 16) * this.anInt679];
						local98 += local50;
						local104 -= local44;
					}
					local62 += local44;
					local74 += local50;
					local80 += Class1_Sub1_Sub2.anInt734;
				}
			} catch (@Pc(157) Exception local157) {
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("3058, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 859 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIDIIIB)V")
	public void method411(@OriginalArg(2) int arg0, @OriginalArg(4) double arg1, @OriginalArg(6) int arg2) {
		try {
			if (this.aByte31 == -107) {
				try {
					@Pc(22) int local22 = (int) (Math.sin(arg1) * 65536.0D);
					@Pc(28) int local28 = (int) (Math.cos(arg1) * 65536.0D);
					@Pc(34) int local34 = local22 * 256 >> 8;
					@Pc(40) int local40 = local28 * 256 >> 8;
					@Pc(52) int local52 = local34 * -10 + local40 * -10 + 983040;
					@Pc(64) int local64 = local40 * -10 + 983040 - local34 * -10;
					@Pc(70) int local70 = arg0 + arg2 * Class1_Sub1_Sub2.anInt734;
					for (@Pc(72) int local72 = 0; local72 < 20; local72++) {
						@Pc(76) int local76 = local70;
						@Pc(78) int local78 = local52;
						@Pc(80) int local80 = local64;
						for (@Pc(83) int local83 = -20; local83 < 0; local83++) {
							@Pc(99) int local99 = this.anIntArray210[(local78 >> 16) + (local80 >> 16) * this.anInt679];
							if (local99 == 0) {
								local76++;
							} else {
								Class1_Sub1_Sub2.anIntArray213[local76++] = local99;
							}
							local78 += local40;
							local80 -= local34;
						}
						local52 += local34;
						local64 += local40;
						local70 += Class1_Sub1_Sub2.anInt734;
					}
				} catch (@Pc(138) Exception local138) {
				}
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("32500, " + 256 + ", " + 15 + ", " + arg0 + ", " + 20 + ", " + arg1 + ", " + 15 + ", " + arg2 + ", " + 20 + ", " + -107 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBILclient!kb;)V")
	public void method412(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1_Sub2_Sub3 arg3) {
		try {
			@Pc(6) boolean local6 = false;
			arg2 += this.anInt681;
			arg0 += this.anInt682;
			@Pc(31) int local31 = arg2 + arg0 * Class1_Sub1_Sub2.anInt734;
			@Pc(33) int local33 = 0;
			@Pc(36) int local36 = this.anInt680;
			@Pc(39) int local39 = this.anInt679;
			@Pc(43) int local43 = Class1_Sub1_Sub2.anInt734 - local39;
			@Pc(45) int local45 = 0;
			@Pc(52) int local52;
			if (arg0 < Class1_Sub1_Sub2.anInt736) {
				local52 = Class1_Sub1_Sub2.anInt736 - arg0;
				local36 -= local52;
				arg0 = Class1_Sub1_Sub2.anInt736;
				local33 = local52 * local39 + 0;
				local31 += local52 * Class1_Sub1_Sub2.anInt734;
			}
			if (arg0 + local36 > Class1_Sub1_Sub2.anInt737) {
				local36 -= arg0 + local36 - Class1_Sub1_Sub2.anInt737;
			}
			if (arg2 < Class1_Sub1_Sub2.anInt738) {
				local52 = Class1_Sub1_Sub2.anInt738 - arg2;
				local39 -= local52;
				arg2 = Class1_Sub1_Sub2.anInt738;
				local33 += local52;
				local31 += local52;
				local45 = local52 + 0;
				local43 += local52;
			}
			if (arg2 + local39 > Class1_Sub1_Sub2.anInt739) {
				local52 = arg2 + local39 - Class1_Sub1_Sub2.anInt739;
				local39 -= local52;
				local45 += local52;
				local43 += local52;
			}
			if (local39 > 0 && local36 > 0) {
				this.method413(local45, local31, Class1_Sub1_Sub2.anIntArray213, local43, this.anIntArray210, local39, 0, local33, arg3.aByteArray7, local36, 770);
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("37058, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[II[IIII[BII)V")
	private void method413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(6) int local6 = -(arg5 >> 2);
			@Pc(11) int local11 = -(arg5 & 0x3);
			@Pc(15) boolean local15 = false;
			for (@Pc(18) int local18 = -arg9; local18 < 0; local18++) {
				@Pc(29) int local29;
				for (@Pc(22) int local22 = local6; local22 < 0; local22++) {
					local29 = arg4[arg7++];
					if (local29 != 0 && arg8[arg1] == 0) {
						arg2[arg1++] = local29;
					} else {
						arg1++;
					}
					local29 = arg4[arg7++];
					if (local29 != 0 && arg8[arg1] == 0) {
						arg2[arg1++] = local29;
					} else {
						arg1++;
					}
					local29 = arg4[arg7++];
					if (local29 != 0 && arg8[arg1] == 0) {
						arg2[arg1++] = local29;
					} else {
						arg1++;
					}
					local29 = arg4[arg7++];
					if (local29 != 0 && arg8[arg1] == 0) {
						arg2[arg1++] = local29;
					} else {
						arg1++;
					}
				}
				for (@Pc(105) int local105 = local11; local105 < 0; local105++) {
					local29 = arg4[arg7++];
					if (local29 != 0 && arg8[arg1] == 0) {
						arg2[arg1++] = local29;
					} else {
						arg1++;
					}
				}
				arg1 += arg3;
				arg7 += arg0;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("88265, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}
}
