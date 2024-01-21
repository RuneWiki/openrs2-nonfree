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

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
	private int anInt649 = -398;

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
	private int anInt650 = 48925;

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "B")
	private byte aByte22 = 4;

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
	private int anInt651 = -32563;

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "B")
	private byte aByte23 = 57;

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "[I")
	public int[] anIntArray208;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
	public int anInt656;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
	public int anInt652;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
	public int anInt657;

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
	public int anInt653;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
	private int anInt655;

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
	private int anInt654;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray208 = new int[arg0 * arg1];
		this.anInt652 = this.anInt656 = arg0;
		this.anInt653 = this.anInt657 = arg1;
		this.anInt654 = this.anInt655 = 0;
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(20) Image local20 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(25) MediaTracker local25 = new MediaTracker(arg1);
			local25.addImage(local20, 0);
			local25.waitForAll();
			this.anInt652 = local20.getWidth(arg1);
			this.anInt653 = local20.getHeight(arg1);
			this.anInt656 = this.anInt652;
			this.anInt657 = this.anInt653;
			this.anInt654 = 0;
			this.anInt655 = 0;
			this.anIntArray208 = new int[this.anInt652 * this.anInt653];
			@Pc(79) PixelGrabber local79 = new PixelGrabber(local20, 0, 0, this.anInt652, this.anInt653, this.anIntArray208, 0, this.anInt652);
			local79.grabPixels();
		} catch (@Pc(84) Exception local84) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!xb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) Class47 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(34) Class1_Sub1_Sub3 local34 = new Class1_Sub1_Sub3(arg0.method666(arg1 + ".dat", null), 58);
		@Pc(43) Class1_Sub1_Sub3 local43 = new Class1_Sub1_Sub3(arg0.method666("index.dat", null), 58);
		local43.anInt742 = local34.method482();
		this.anInt656 = local43.method482();
		this.anInt657 = local43.method482();
		@Pc(58) int local58 = local43.method480();
		@Pc(61) int[] local61 = new int[local58];
		for (@Pc(63) int local63 = 0; local63 < local58 - 1; local63++) {
			local61[local63 + 1] = local43.method484();
			if (local61[local63 + 1] == 0) {
				local61[local63 + 1] = 1;
			}
		}
		for (@Pc(92) int local92 = 0; local92 < arg2; local92++) {
			local43.anInt742 += 2;
			local34.anInt742 += local43.method482() * local43.method482();
			local43.anInt742++;
		}
		this.anInt654 = local43.method480();
		this.anInt655 = local43.method480();
		this.anInt652 = local43.method482();
		this.anInt653 = local43.method482();
		@Pc(139) int local139 = local43.method480();
		@Pc(145) int local145 = this.anInt652 * this.anInt653;
		this.anIntArray208 = new int[local145];
		@Pc(153) int local153;
		if (local139 == 0) {
			for (local153 = 0; local153 < local145; local153++) {
				this.anIntArray208[local153] = local61[local34.method480()];
			}
		} else if (local139 == 1) {
			for (local153 = 0; local153 < this.anInt652; local153++) {
				for (@Pc(177) int local177 = 0; local177 < this.anInt653; local177++) {
					this.anIntArray208[local153 + local177 * this.anInt652] = local61[local34.method480()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public void method386() {
		try {
			if (this.aByte22 == 4) {
				Class1_Sub1_Sub2.method434(this.anInt652, 501, this.anInt653, this.anIntArray208);
			}
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("94013, " + 4 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V")
	public void method387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray208.length; local13++) {
				@Pc(20) int local20 = this.anIntArray208[local13];
				if (local20 != 0) {
					@Pc(28) int local28 = local20 >> 16 & 0xFF;
					local28 += arg0;
					if (local28 < 1) {
						local28 = 1;
					} else if (local28 > 255) {
						local28 = 255;
					}
					@Pc(50) int local50 = local20 >> 8 & 0xFF;
					local50 += arg2;
					if (local50 < 1) {
						local50 = 1;
					} else if (local50 > 255) {
						local50 = 255;
					}
					@Pc(70) int local70 = local20 & 0xFF;
					local70 += arg1;
					if (local70 < 1) {
						local70 = 1;
					} else if (local70 > 255) {
						local70 = 255;
					}
					this.anIntArray208[local13] = (local28 << 16) + (local50 << 8) + local70;
				}
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("28348, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -45258 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public void method388() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt656 * this.anInt657];
			for (@Pc(10) int local10 = 0; local10 < this.anInt653; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt652; local14++) {
					local8[(local10 + this.anInt655) * this.anInt656 + local14 + this.anInt654] = this.anIntArray208[local10 * this.anInt652 + local14];
				}
			}
			this.anIntArray208 = local8;
			if (this.anInt651 == -32563) {
				this.anInt652 = this.anInt656;
				this.anInt653 = this.anInt657;
				this.anInt654 = 0;
				this.anInt655 = 0;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("40912, " + -32563 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	public void method389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0 == -1127) {
				arg2 += this.anInt654;
				arg1 += this.anInt655;
				@Pc(19) int local19 = arg2 + arg1 * Class1_Sub1_Sub2.anInt696;
				@Pc(21) int local21 = 0;
				@Pc(24) int local24 = this.anInt653;
				@Pc(27) int local27 = this.anInt652;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt696 - local27;
				@Pc(33) int local33 = 0;
				@Pc(40) int local40;
				if (arg1 < Class1_Sub1_Sub2.anInt698) {
					local40 = Class1_Sub1_Sub2.anInt698 - arg1;
					local24 -= local40;
					arg1 = Class1_Sub1_Sub2.anInt698;
					local21 = local40 * local27 + 0;
					local19 += local40 * Class1_Sub1_Sub2.anInt696;
				}
				if (arg1 + local24 > Class1_Sub1_Sub2.anInt699) {
					local24 -= arg1 + local24 - Class1_Sub1_Sub2.anInt699;
				}
				if (arg2 < Class1_Sub1_Sub2.anInt700) {
					local40 = Class1_Sub1_Sub2.anInt700 - arg2;
					local27 -= local40;
					arg2 = Class1_Sub1_Sub2.anInt700;
					local21 += local40;
					local19 += local40;
					local33 = local40 + 0;
					local31 += local40;
				}
				if (arg2 + local27 > Class1_Sub1_Sub2.anInt701) {
					local40 = arg2 + local27 - Class1_Sub1_Sub2.anInt701;
					local27 -= local40;
					local33 += local40;
					local31 += local40;
				}
				if (local27 > 0 && local24 > 0) {
					this.method390(local21, local33, local19, local24, Class1_Sub1_Sub2.anIntArray213, this.anIntArray208, local31, local27);
				}
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("95424, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII[II[III)V")
	private void method390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(11) int local11 = -(arg7 >> 2);
			@Pc(16) int local16 = -(arg7 & 0x3);
			for (@Pc(19) int local19 = -arg3; local19 < 0; local19++) {
				for (@Pc(23) int local23 = local11; local23 < 0; local23++) {
					arg4[arg2++] = arg5[arg0++];
					arg4[arg2++] = arg5[arg0++];
					arg4[arg2++] = arg5[arg0++];
					arg4[arg2++] = arg5[arg0++];
				}
				for (@Pc(62) int local62 = local16; local62 < 0; local62++) {
					arg4[arg2++] = arg5[arg0++];
				}
				arg2 += arg6;
				arg0 += arg1;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("19668, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 820 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZII)V")
	public void method391(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt654;
			arg1 += this.anInt655;
			@Pc(18) int local18 = arg0 + arg1 * Class1_Sub1_Sub2.anInt696;
			@Pc(20) int local20 = 0;
			@Pc(23) int local23 = this.anInt653;
			@Pc(26) int local26 = this.anInt652;
			@Pc(30) int local30 = Class1_Sub1_Sub2.anInt696 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg1 < Class1_Sub1_Sub2.anInt698) {
				local39 = Class1_Sub1_Sub2.anInt698 - arg1;
				local23 -= local39;
				arg1 = Class1_Sub1_Sub2.anInt698;
				local20 = local39 * local26 + 0;
				local18 += local39 * Class1_Sub1_Sub2.anInt696;
			}
			if (arg1 + local23 > Class1_Sub1_Sub2.anInt699) {
				local23 -= arg1 + local23 - Class1_Sub1_Sub2.anInt699;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt700) {
				local39 = Class1_Sub1_Sub2.anInt700 - arg0;
				local26 -= local39;
				arg0 = Class1_Sub1_Sub2.anInt700;
				local20 += local39;
				local18 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg0 + local26 > Class1_Sub1_Sub2.anInt701) {
				local39 = arg0 + local26 - Class1_Sub1_Sub2.anInt701;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method392(Class1_Sub1_Sub2.anIntArray213, this.anIntArray208, local20, local18, local26, local23, local30, local32);
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("74100, " + true + ", " + arg0 + ", " + arg1 + ", " + local141.toString());
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

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIZ)V")
	public void method393(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt654;
			arg1 += this.anInt655;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt696;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt653;
			@Pc(23) int local23 = this.anInt652;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt696 - local23;
			@Pc(29) int local29 = 0;
			@Pc(45) int local45;
			if (arg1 < Class1_Sub1_Sub2.anInt698) {
				local45 = Class1_Sub1_Sub2.anInt698 - arg1;
				local20 -= local45;
				arg1 = Class1_Sub1_Sub2.anInt698;
				local17 = local45 * local23 + 0;
				local15 += local45 * Class1_Sub1_Sub2.anInt696;
			}
			if (arg1 + local20 > Class1_Sub1_Sub2.anInt699) {
				local20 -= arg1 + local20 - Class1_Sub1_Sub2.anInt699;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt700) {
				local45 = Class1_Sub1_Sub2.anInt700 - arg0;
				local23 -= local45;
				arg0 = Class1_Sub1_Sub2.anInt700;
				local17 += local45;
				local15 += local45;
				local29 = local45 + 0;
				local27 += local45;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt701) {
				local45 = arg0 + local23 - Class1_Sub1_Sub2.anInt701;
				local23 -= local45;
				local29 += local45;
				local27 += local45;
			}
			if (local23 > 0 && local20 > 0) {
				this.method394(local15, this.anIntArray208, local29, local20, local17, Class1_Sub1_Sub2.anIntArray213, local23, local27, 0);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("52228, " + 128 + ", " + arg0 + ", " + arg1 + ", " + true + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I[IIII[IIIIII)V")
	private void method394(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(12) int local12 = -arg3; local12 < 0; local12++) {
				for (@Pc(17) int local17 = -arg6; local17 < 0; local17++) {
					@Pc(24) int local24 = arg1[arg4++];
					if (local24 == 0) {
						arg0++;
					} else {
						@Pc(30) int local30 = arg5[arg0];
						arg5[arg0++] = ((local24 & 0xFF00FF) * 128 + (local30 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local24 & 0xFF00) * 128 + (local30 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg0 += arg7;
				arg4 += arg2;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("91658, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 128 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 28593 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII[III[IIII)V")
	public void method395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(5) boolean local5 = false;
			try {
				@Pc(10) int local10 = -arg5 / 2;
				@Pc(15) int local15 = -arg8 / 2;
				@Pc(24) int local24 = (int) (Math.sin((double) arg9 / 326.11D) * 65536.0D);
				@Pc(33) int local33 = (int) (Math.cos((double) arg9 / 326.11D) * 65536.0D);
				@Pc(39) int local39 = local24 * arg10 >> 8;
				@Pc(45) int local45 = local33 * arg10 >> 8;
				@Pc(57) int local57 = (arg6 << 16) + local15 * local39 + local10 * local45;
				@Pc(69) int local69 = (arg2 << 16) + (local15 * local45 - local10 * local39);
				@Pc(75) int local75 = arg1 + arg3 * Class1_Sub1_Sub2.anInt696;
				for (@Pc(77) int local77 = 0; local77 < arg8; local77++) {
					@Pc(83) int local83 = arg7[local77];
					@Pc(87) int local87 = local75 + local83;
					@Pc(93) int local93 = local57 + local45 * local83;
					@Pc(99) int local99 = local69 - local39 * local83;
					for (@Pc(104) int local104 = -arg4[local77]; local104 < 0; local104++) {
						Class1_Sub1_Sub2.anIntArray213[local87++] = this.anIntArray208[(local93 >> 16) + (local99 >> 16) * this.anInt652];
						local93 += local45;
						local99 -= local39;
					}
					local57 += local39;
					local69 += local45;
					local75 += Class1_Sub1_Sub2.anInt696;
				}
			} catch (@Pc(152) Exception local152) {
			}
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("77908, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIID)V")
	public void method396(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(8) double arg2) {
		try {
			try {
				@Pc(26) int local26 = (int) (Math.sin(arg2) * 65536.0D);
				@Pc(32) int local32 = (int) (Math.cos(arg2) * 65536.0D);
				@Pc(38) int local38 = local26 * 256 >> 8;
				@Pc(44) int local44 = local32 * 256 >> 8;
				@Pc(56) int local56 = local38 * -10 + local44 * -10 + 983040;
				@Pc(68) int local68 = local44 * -10 + 983040 - local38 * -10;
				@Pc(74) int local74 = arg0 + arg1 * Class1_Sub1_Sub2.anInt696;
				for (@Pc(76) int local76 = 0; local76 < 20; local76++) {
					@Pc(80) int local80 = local74;
					@Pc(82) int local82 = local56;
					@Pc(84) int local84 = local68;
					for (@Pc(87) int local87 = -20; local87 < 0; local87++) {
						@Pc(103) int local103 = this.anIntArray208[(local82 >> 16) + (local84 >> 16) * this.anInt652];
						if (local103 == 0) {
							local80++;
						} else {
							Class1_Sub1_Sub2.anIntArray213[local80++] = local103;
						}
						local82 += local44;
						local84 -= local38;
					}
					local56 += local38;
					local68 += local44;
					local74 += Class1_Sub1_Sub2.anInt696;
				}
			} catch (@Pc(142) Exception local142) {
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("83874, " + 15 + ", " + 15 + ", " + 256 + ", " + arg0 + ", " + arg1 + ", " + 20 + ", " + -940 + ", " + 20 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!jb;IIB)V")
	public void method397(@OriginalArg(0) Class1_Sub1_Sub2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg2 += this.anInt654;
			arg1 += this.anInt655;
			@Pc(15) int local15 = arg2 + arg1 * Class1_Sub1_Sub2.anInt696;
			@Pc(17) int local17 = 0;
			@Pc(30) int local30 = this.anInt653;
			@Pc(33) int local33 = this.anInt652;
			@Pc(37) int local37 = Class1_Sub1_Sub2.anInt696 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg1 < Class1_Sub1_Sub2.anInt698) {
				local46 = Class1_Sub1_Sub2.anInt698 - arg1;
				local30 -= local46;
				arg1 = Class1_Sub1_Sub2.anInt698;
				local17 = local46 * local33 + 0;
				local15 += local46 * Class1_Sub1_Sub2.anInt696;
			}
			if (arg1 + local30 > Class1_Sub1_Sub2.anInt699) {
				local30 -= arg1 + local30 - Class1_Sub1_Sub2.anInt699;
			}
			if (arg2 < Class1_Sub1_Sub2.anInt700) {
				local46 = Class1_Sub1_Sub2.anInt700 - arg2;
				local33 -= local46;
				arg2 = Class1_Sub1_Sub2.anInt700;
				local17 += local46;
				local15 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg2 + local33 > Class1_Sub1_Sub2.anInt701) {
				local46 = arg2 + local33 - Class1_Sub1_Sub2.anInt701;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method398(local17, 0, this.anIntArray208, Class1_Sub1_Sub2.anIntArray213, arg0.aByteArray7, local39, local37, local30, local33, (byte) 5, local15);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("72747, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -63 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II[I[I[BIIIIBI)V")
	private void method398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(20) int local20 = -(arg8 >> 2);
			@Pc(25) int local25 = -(arg8 & 0x3);
			for (@Pc(28) int local28 = -arg7; local28 < 0; local28++) {
				@Pc(39) int local39;
				for (@Pc(32) int local32 = local20; local32 < 0; local32++) {
					local39 = arg2[arg0++];
					if (local39 != 0 && arg4[arg10] == 0) {
						arg3[arg10++] = local39;
					} else {
						arg10++;
					}
					local39 = arg2[arg0++];
					if (local39 != 0 && arg4[arg10] == 0) {
						arg3[arg10++] = local39;
					} else {
						arg10++;
					}
					local39 = arg2[arg0++];
					if (local39 != 0 && arg4[arg10] == 0) {
						arg3[arg10++] = local39;
					} else {
						arg10++;
					}
					local39 = arg2[arg0++];
					if (local39 != 0 && arg4[arg10] == 0) {
						arg3[arg10++] = local39;
					} else {
						arg10++;
					}
				}
				for (@Pc(115) int local115 = local25; local115 < 0; local115++) {
					local39 = arg2[arg0++];
					if (local39 != 0 && arg4[arg10] == 0) {
						arg3[arg10++] = local39;
					} else {
						arg10++;
					}
				}
				arg10 += arg6;
				arg0 += arg5;
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("15070, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}
}
