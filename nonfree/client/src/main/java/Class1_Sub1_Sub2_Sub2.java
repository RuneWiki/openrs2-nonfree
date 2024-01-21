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

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
	private int anInt612 = 35985;

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
	private int anInt613 = 743;

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
	private int anInt614 = -24;

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "Z")
	private boolean aBoolean152 = false;

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "[I")
	public int[] anIntArray200;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
	public int anInt619;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
	public int anInt615;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
	public int anInt620;

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
	public int anInt616;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
	private int anInt618;

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
	private int anInt617;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray200 = new int[arg0 * arg1];
		this.anInt615 = this.anInt619 = arg0;
		this.anInt616 = this.anInt620 = arg1;
		this.anInt617 = this.anInt618 = 0;
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(17) Image local17 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(22) MediaTracker local22 = new MediaTracker(arg1);
			local22.addImage(local17, 0);
			local22.waitForAll();
			this.anInt615 = local17.getWidth(arg1);
			this.anInt616 = local17.getHeight(arg1);
			this.anInt619 = this.anInt615;
			this.anInt620 = this.anInt616;
			this.anInt617 = 0;
			this.anInt618 = 0;
			this.anIntArray200 = new int[this.anInt615 * this.anInt616];
			@Pc(76) PixelGrabber local76 = new PixelGrabber(local17, 0, 0, this.anInt615, this.anInt616, this.anIntArray200, 0, this.anInt615);
			local76.grabPixels();
		} catch (@Pc(81) Exception local81) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!yb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) Class48 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(31) Class1_Sub1_Sub3 local31 = new Class1_Sub1_Sub3(arg0.method689(arg1 + ".dat", null), true);
		@Pc(40) Class1_Sub1_Sub3 local40 = new Class1_Sub1_Sub3(arg0.method689("index.dat", null), true);
		local40.anInt766 = local31.method505();
		this.anInt619 = local40.method505();
		this.anInt620 = local40.method505();
		@Pc(55) int local55 = local40.method503();
		@Pc(58) int[] local58 = new int[local55];
		for (@Pc(60) int local60 = 0; local60 < local55 - 1; local60++) {
			local58[local60 + 1] = local40.method507();
			if (local58[local60 + 1] == 0) {
				local58[local60 + 1] = 1;
			}
		}
		for (@Pc(95) int local95 = 0; local95 < arg2; local95++) {
			local40.anInt766 += 2;
			local31.anInt766 += local40.method505() * local40.method505();
			local40.anInt766++;
		}
		this.anInt617 = local40.method503();
		this.anInt618 = local40.method503();
		this.anInt615 = local40.method505();
		this.anInt616 = local40.method505();
		@Pc(142) int local142 = local40.method503();
		@Pc(148) int local148 = this.anInt615 * this.anInt616;
		this.anIntArray200 = new int[local148];
		@Pc(156) int local156;
		if (local142 == 0) {
			for (local156 = 0; local156 < local148; local156++) {
				this.anIntArray200[local156] = local58[local31.method503()];
			}
		} else if (local142 == 1) {
			for (local156 = 0; local156 < this.anInt615; local156++) {
				for (@Pc(180) int local180 = 0; local180 < this.anInt616; local180++) {
					this.anIntArray200[local156 + local180 * this.anInt615] = local58[local31.method503()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
	public void method370() {
		try {
			Class1_Sub1_Sub2.method457(this.anInt614, this.anIntArray200, this.anInt615, this.anInt616);
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("92999, " + 0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIB)V")
	public void method371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			if (arg3 == -38) {
				for (@Pc(7) int local7 = 0; local7 < this.anIntArray200.length; local7++) {
					@Pc(14) int local14 = this.anIntArray200[local7];
					if (local14 != 0) {
						@Pc(22) int local22 = local14 >> 16 & 0xFF;
						local22 += arg1;
						if (local22 < 1) {
							local22 = 1;
						} else if (local22 > 255) {
							local22 = 255;
						}
						@Pc(44) int local44 = local14 >> 8 & 0xFF;
						local44 += arg2;
						if (local44 < 1) {
							local44 = 1;
						} else if (local44 > 255) {
							local44 = 255;
						}
						@Pc(64) int local64 = local14 & 0xFF;
						local64 += arg0;
						if (local64 < 1) {
							local64 = 1;
						} else if (local64 > 255) {
							local64 = 255;
						}
						this.anIntArray200[local7] = (local22 << 16) + (local44 << 8) + local64;
					}
				}
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("50148, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
	public void method372() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt619 * this.anInt620];
			for (@Pc(10) int local10 = 0; local10 < this.anInt616; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt615; local14++) {
					local8[(local10 + this.anInt618) * this.anInt619 + local14 + this.anInt617] = this.anIntArray200[local10 * this.anInt615 + local14];
				}
			}
			this.anIntArray200 = local8;
			this.anInt615 = this.anInt619;
			this.anInt616 = this.anInt620;
			this.anInt617 = 0;
			this.anInt618 = 0;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("40114, " + false + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	public void method373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg1 += this.anInt617;
			arg0 += this.anInt618;
			@Pc(15) int local15 = arg1 + arg0 * Class1_Sub1_Sub2.anInt721;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt616;
			@Pc(23) int local23 = this.anInt615;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt721 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg0 < Class1_Sub1_Sub2.anInt723) {
				local36 = Class1_Sub1_Sub2.anInt723 - arg0;
				local20 -= local36;
				arg0 = Class1_Sub1_Sub2.anInt723;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub1_Sub2.anInt721;
			}
			if (arg0 + local20 > Class1_Sub1_Sub2.anInt724) {
				local20 -= arg0 + local20 - Class1_Sub1_Sub2.anInt724;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt725) {
				local36 = Class1_Sub1_Sub2.anInt725 - arg1;
				local23 -= local36;
				arg1 = Class1_Sub1_Sub2.anInt725;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg1 + local23 > Class1_Sub1_Sub2.anInt726) {
				local36 = arg1 + local23 - Class1_Sub1_Sub2.anInt726;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method374(local29, local27, 875, local23, Class1_Sub1_Sub2.anIntArray218, local17, this.anIntArray200, local20, local15);
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("75580, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII[II[III)V")
	private void method374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			@Pc(6) int local6 = -(arg3 >> 2);
			@Pc(10) boolean local10 = false;
			@Pc(15) int local15 = -(arg3 & 0x3);
			for (@Pc(18) int local18 = -arg7; local18 < 0; local18++) {
				for (@Pc(22) int local22 = local6; local22 < 0; local22++) {
					arg4[arg8++] = arg6[arg5++];
					arg4[arg8++] = arg6[arg5++];
					arg4[arg8++] = arg6[arg5++];
					arg4[arg8++] = arg6[arg5++];
				}
				for (@Pc(61) int local61 = local15; local61 < 0; local61++) {
					arg4[arg8++] = arg6[arg5++];
				}
				arg8 += arg1;
				arg5 += arg0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("94900, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BII)V")
	public void method375(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt617;
			arg1 += this.anInt618;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt721;
			@Pc(17) int local17 = 0;
			@Pc(27) int local27 = this.anInt616;
			@Pc(30) int local30 = this.anInt615;
			@Pc(34) int local34 = Class1_Sub1_Sub2.anInt721 - local30;
			@Pc(36) int local36 = 0;
			@Pc(43) int local43;
			if (arg1 < Class1_Sub1_Sub2.anInt723) {
				local43 = Class1_Sub1_Sub2.anInt723 - arg1;
				local27 -= local43;
				arg1 = Class1_Sub1_Sub2.anInt723;
				local17 = local43 * local30 + 0;
				local15 += local43 * Class1_Sub1_Sub2.anInt721;
			}
			if (arg1 + local27 > Class1_Sub1_Sub2.anInt724) {
				local27 -= arg1 + local27 - Class1_Sub1_Sub2.anInt724;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt725) {
				local43 = Class1_Sub1_Sub2.anInt725 - arg0;
				local30 -= local43;
				arg0 = Class1_Sub1_Sub2.anInt725;
				local17 += local43;
				local15 += local43;
				local36 = local43 + 0;
				local34 += local43;
			}
			if (arg0 + local30 > Class1_Sub1_Sub2.anInt726) {
				local43 = arg0 + local30 - Class1_Sub1_Sub2.anInt726;
				local30 -= local43;
				local36 += local43;
				local34 += local43;
			}
			if (local30 > 0 && local27 > 0) {
				this.method376(Class1_Sub1_Sub2.anIntArray218, this.anIntArray200, local17, local15, local30, local27, local34, local36);
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("18343, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method376(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V")
	public void method377(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			arg0 += this.anInt617;
			arg1 += this.anInt618;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt721;
			@Pc(17) int local17 = 0;
			if (arg2 != 23391) {
				this.anInt614 = 148;
			}
			@Pc(26) int local26 = this.anInt616;
			@Pc(29) int local29 = this.anInt615;
			@Pc(33) int local33 = Class1_Sub1_Sub2.anInt721 - local29;
			@Pc(35) int local35 = 0;
			@Pc(42) int local42;
			if (arg1 < Class1_Sub1_Sub2.anInt723) {
				local42 = Class1_Sub1_Sub2.anInt723 - arg1;
				local26 -= local42;
				arg1 = Class1_Sub1_Sub2.anInt723;
				local17 = local42 * local29 + 0;
				local15 += local42 * Class1_Sub1_Sub2.anInt721;
			}
			if (arg1 + local26 > Class1_Sub1_Sub2.anInt724) {
				local26 -= arg1 + local26 - Class1_Sub1_Sub2.anInt724;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt725) {
				local42 = Class1_Sub1_Sub2.anInt725 - arg0;
				local29 -= local42;
				arg0 = Class1_Sub1_Sub2.anInt725;
				local17 += local42;
				local15 += local42;
				local35 = local42 + 0;
				local33 += local42;
			}
			if (arg0 + local29 > Class1_Sub1_Sub2.anInt726) {
				local42 = arg0 + local29 - Class1_Sub1_Sub2.anInt726;
				local29 -= local42;
				local35 += local42;
				local33 += local42;
			}
			if (local29 > 0 && local26 > 0) {
				this.method378(Class1_Sub1_Sub2.anIntArray218, 0, local29, local33, local35, local26, local15, this.anIntArray200, local17);
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("36279, " + arg0 + ", " + 128 + ", " + arg1 + ", " + arg2 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([IIBIIIIII[II)V")
	private void method378(@OriginalArg(0) int[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int[] arg7, @OriginalArg(10) int arg8) {
		try {
			for (@Pc(14) int local14 = -arg5; local14 < 0; local14++) {
				for (@Pc(19) int local19 = -arg2; local19 < 0; local19++) {
					@Pc(26) int local26 = arg7[arg8++];
					if (local26 == 0) {
						arg6++;
					} else {
						@Pc(32) int local32 = arg0[arg6];
						arg0[arg6++] = ((local26 & 0xFF00FF) * 128 + (local32 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local26 & 0xFF00) * 128 + (local32 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg6 += arg3;
				arg8 += arg4;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("58045, " + arg0 + ", " + 128 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII[II[IIII)V")
	public void method379(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(16) int local16 = -arg5 / 2;
				@Pc(21) int local21 = -arg9 / 2;
				@Pc(30) int local30 = (int) (Math.sin((double) arg1 / 326.11D) * 65536.0D);
				@Pc(39) int local39 = (int) (Math.cos((double) arg1 / 326.11D) * 65536.0D);
				@Pc(45) int local45 = local30 * arg0 >> 8;
				@Pc(51) int local51 = local39 * arg0 >> 8;
				@Pc(63) int local63 = (arg2 << 16) + local21 * local45 + local16 * local51;
				@Pc(75) int local75 = (arg3 << 16) + (local21 * local51 - local16 * local45);
				@Pc(81) int local81 = arg8 + arg7 * Class1_Sub1_Sub2.anInt721;
				for (@Pc(83) int local83 = 0; local83 < arg9; local83++) {
					@Pc(89) int local89 = arg4[local83];
					@Pc(93) int local93 = local81 + local89;
					@Pc(99) int local99 = local63 + local51 * local89;
					@Pc(105) int local105 = local75 - local45 * local89;
					for (@Pc(110) int local110 = -arg6[local83]; local110 < 0; local110++) {
						Class1_Sub1_Sub2.anIntArray218[local93++] = this.anIntArray200[(local99 >> 16) + (local105 >> 16) * this.anInt615];
						local99 += local51;
						local105 -= local45;
					}
					local63 += local45;
					local75 += local51;
					local81 += Class1_Sub1_Sub2.anInt721;
				}
			} catch (@Pc(158) Exception local158) {
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("80561, " + arg0 + ", " + 9271 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IDZIIIIII)V")
	public void method380(@OriginalArg(1) double arg0, @OriginalArg(3) int arg1, @OriginalArg(6) int arg2) {
		try {
			try {
				@Pc(22) int local22 = (int) (Math.sin(arg0) * 65536.0D);
				@Pc(28) int local28 = (int) (Math.cos(arg0) * 65536.0D);
				@Pc(34) int local34 = local22 * 256 >> 8;
				@Pc(40) int local40 = local28 * 256 >> 8;
				@Pc(52) int local52 = local34 * -10 + local40 * -10 + 983040;
				@Pc(64) int local64 = local40 * -10 + 983040 - local34 * -10;
				@Pc(70) int local70 = arg2 + arg1 * Class1_Sub1_Sub2.anInt721;
				for (@Pc(72) int local72 = 0; local72 < 20; local72++) {
					@Pc(76) int local76 = local70;
					@Pc(78) int local78 = local52;
					@Pc(80) int local80 = local64;
					for (@Pc(83) int local83 = -20; local83 < 0; local83++) {
						@Pc(99) int local99 = this.anIntArray200[(local78 >> 16) + (local80 >> 16) * this.anInt615];
						if (local99 == 0) {
							local76++;
						} else {
							Class1_Sub1_Sub2.anIntArray218[local76++] = local99;
						}
						local78 += local40;
						local80 -= local34;
					}
					local52 += local34;
					local64 += local40;
					local70 += Class1_Sub1_Sub2.anInt721;
				}
			} catch (@Pc(138) Exception local138) {
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("42907, " + 20 + ", " + arg0 + ", " + false + ", " + arg1 + ", " + 15 + ", " + 20 + ", " + arg2 + ", " + 15 + ", " + 256 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILclient!jb;I)V")
	public void method381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub2_Sub3 arg2) {
		try {
			arg1 += this.anInt617;
			arg0 += this.anInt618;
			@Pc(22) int local22 = arg1 + arg0 * Class1_Sub1_Sub2.anInt721;
			@Pc(24) int local24 = 0;
			@Pc(27) int local27 = this.anInt616;
			@Pc(30) int local30 = this.anInt615;
			@Pc(34) int local34 = Class1_Sub1_Sub2.anInt721 - local30;
			@Pc(36) int local36 = 0;
			@Pc(43) int local43;
			if (arg0 < Class1_Sub1_Sub2.anInt723) {
				local43 = Class1_Sub1_Sub2.anInt723 - arg0;
				local27 -= local43;
				arg0 = Class1_Sub1_Sub2.anInt723;
				local24 = local43 * local30 + 0;
				local22 += local43 * Class1_Sub1_Sub2.anInt721;
			}
			if (arg0 + local27 > Class1_Sub1_Sub2.anInt724) {
				local27 -= arg0 + local27 - Class1_Sub1_Sub2.anInt724;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt725) {
				local43 = Class1_Sub1_Sub2.anInt725 - arg1;
				local30 -= local43;
				arg1 = Class1_Sub1_Sub2.anInt725;
				local24 += local43;
				local22 += local43;
				local36 = local43 + 0;
				local34 += local43;
			}
			if (arg1 + local30 > Class1_Sub1_Sub2.anInt726) {
				local43 = arg1 + local30 - Class1_Sub1_Sub2.anInt726;
				local30 -= local43;
				local36 += local43;
				local34 += local43;
			}
			if (local30 > 0 && local27 > 0) {
				this.method382(local30, local27, local22, local34, this.anIntArray200, arg2.aByteArray7, 0, Class1_Sub1_Sub2.anIntArray218, local36, local24);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("24522, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII[I[BI[IIII)V")
	private void method382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(10) int local10 = -(arg0 >> 2);
			@Pc(15) int local15 = -(arg0 & 0x3);
			for (@Pc(18) int local18 = -arg1; local18 < 0; local18++) {
				@Pc(29) int local29;
				for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
					local29 = arg4[arg9++];
					if (local29 != 0 && arg5[arg2] == 0) {
						arg7[arg2++] = local29;
					} else {
						arg2++;
					}
					local29 = arg4[arg9++];
					if (local29 != 0 && arg5[arg2] == 0) {
						arg7[arg2++] = local29;
					} else {
						arg2++;
					}
					local29 = arg4[arg9++];
					if (local29 != 0 && arg5[arg2] == 0) {
						arg7[arg2++] = local29;
					} else {
						arg2++;
					}
					local29 = arg4[arg9++];
					if (local29 != 0 && arg5[arg2] == 0) {
						arg7[arg2++] = local29;
					} else {
						arg2++;
					}
				}
				for (@Pc(105) int local105 = local15; local105 < 0; local105++) {
					local29 = arg4[arg9++];
					if (local29 != 0 && arg5[arg2] == 0) {
						arg7[arg2++] = local29;
					} else {
						arg2++;
					}
				}
				arg2 += arg3;
				arg9 += arg8;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("79232, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + -6210 + ", " + arg9 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}
}
