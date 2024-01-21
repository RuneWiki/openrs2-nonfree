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

@OriginalClass("client!IBHVCUAH")
public final class Class6_Sub2_Sub2_Sub1 extends Class6_Sub2_Sub2 {

	@OriginalMember(owner = "client!IBHVCUAH", name = "F", descriptor = "I")
	private int anInt152;

	@OriginalMember(owner = "client!IBHVCUAH", name = "z", descriptor = "I")
	private int anInt148 = -752;

	@OriginalMember(owner = "client!IBHVCUAH", name = "A", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!IBHVCUAH", name = "B", descriptor = "I")
	private int anInt149 = -870;

	@OriginalMember(owner = "client!IBHVCUAH", name = "C", descriptor = "I")
	private int anInt150 = 737;

	@OriginalMember(owner = "client!IBHVCUAH", name = "D", descriptor = "Z")
	private boolean aBoolean61 = true;

	@OriginalMember(owner = "client!IBHVCUAH", name = "E", descriptor = "I")
	private int anInt151 = 33605;

	@OriginalMember(owner = "client!IBHVCUAH", name = "G", descriptor = "[I")
	public int[] anIntArray40;

	@OriginalMember(owner = "client!IBHVCUAH", name = "L", descriptor = "I")
	public int anInt157;

	@OriginalMember(owner = "client!IBHVCUAH", name = "H", descriptor = "I")
	public int anInt153;

	@OriginalMember(owner = "client!IBHVCUAH", name = "M", descriptor = "I")
	public int anInt158;

	@OriginalMember(owner = "client!IBHVCUAH", name = "I", descriptor = "I")
	public int anInt154;

	@OriginalMember(owner = "client!IBHVCUAH", name = "K", descriptor = "I")
	private int anInt156;

	@OriginalMember(owner = "client!IBHVCUAH", name = "J", descriptor = "I")
	private int anInt155;

	@OriginalMember(owner = "client!IBHVCUAH", name = "<init>", descriptor = "(II)V")
	public Class6_Sub2_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray40 = new int[arg0 * arg1];
		this.anInt153 = this.anInt157 = arg0;
		this.anInt154 = this.anInt158 = arg1;
		this.anInt155 = this.anInt156 = 0;
	}

	@OriginalMember(owner = "client!IBHVCUAH", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class6_Sub2_Sub2_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(23) Image local23 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(28) MediaTracker local28 = new MediaTracker(arg1);
			local28.addImage(local23, 0);
			local28.waitForAll();
			this.anInt153 = local23.getWidth(arg1);
			this.anInt154 = local23.getHeight(arg1);
			this.anInt157 = this.anInt153;
			this.anInt158 = this.anInt154;
			this.anInt155 = 0;
			this.anInt156 = 0;
			this.anIntArray40 = new int[this.anInt153 * this.anInt154];
			@Pc(82) PixelGrabber local82 = new PixelGrabber(local23, 0, 0, this.anInt153, this.anInt154, this.anIntArray40, 0, this.anInt153);
			local82.grabPixels();
		} catch (@Pc(87) Exception local87) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!IBHVCUAH", name = "<init>", descriptor = "(Lclient!RVLWVPJQ;Ljava/lang/String;I)V")
	public Class6_Sub2_Sub2_Sub1(@OriginalArg(0) Class36 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(37) Class6_Sub2_Sub3 local37 = new Class6_Sub2_Sub3(741, arg0.method381(arg1 + ".dat", null));
		@Pc(46) Class6_Sub2_Sub3 local46 = new Class6_Sub2_Sub3(741, arg0.method381("index.dat", null));
		local46.anInt609 = local37.method404();
		this.anInt157 = local46.method404();
		this.anInt158 = local46.method404();
		@Pc(61) int local61 = local46.method402();
		@Pc(64) int[] local64 = new int[local61];
		for (@Pc(66) int local66 = 0; local66 < local61 - 1; local66++) {
			local64[local66 + 1] = local46.method406();
			if (local64[local66 + 1] == 0) {
				local64[local66 + 1] = 1;
			}
		}
		for (@Pc(101) int local101 = 0; local101 < arg2; local101++) {
			local46.anInt609 += 2;
			local37.anInt609 += local46.method404() * local46.method404();
			local46.anInt609++;
		}
		this.anInt155 = local46.method402();
		this.anInt156 = local46.method402();
		this.anInt153 = local46.method404();
		this.anInt154 = local46.method404();
		@Pc(148) int local148 = local46.method402();
		@Pc(154) int local154 = this.anInt153 * this.anInt154;
		this.anIntArray40 = new int[local154];
		@Pc(162) int local162;
		if (local148 == 0) {
			for (local162 = 0; local162 < local154; local162++) {
				this.anIntArray40[local162] = local64[local37.method402()];
			}
		} else if (local148 == 1) {
			for (local162 = 0; local162 < this.anInt153; local162++) {
				for (@Pc(186) int local186 = 0; local186 < this.anInt154; local186++) {
					this.anIntArray40[local162 + local186 * this.anInt153] = local64[local37.method402()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!IBHVCUAH", name = "a", descriptor = "(Z)V")
	public void method132() {
		try {
			Class6_Sub2_Sub2.method514(this.aBoolean61, this.anIntArray40, this.anInt154, this.anInt153);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("59972, " + true + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBHVCUAH", name = "a", descriptor = "(IBII)V")
	public void method133(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 == 85) {
				for (@Pc(7) int local7 = 0; local7 < this.anIntArray40.length; local7++) {
					@Pc(14) int local14 = this.anIntArray40[local7];
					if (local14 != 0) {
						@Pc(22) int local22 = local14 >> 16 & 0xFF;
						local22 += arg3;
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
						local64 += arg2;
						if (local64 < 1) {
							local64 = 1;
						} else if (local64 > 255) {
							local64 = 255;
						}
						this.anIntArray40[local7] = (local22 << 16) + (local44 << 8) + local64;
					}
				}
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("97973, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBHVCUAH", name = "b", descriptor = "(Z)V")
	public void method134() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt157 * this.anInt158];
			for (@Pc(10) int local10 = 0; local10 < this.anInt154; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt153; local14++) {
					local8[(local10 + this.anInt156) * this.anInt157 + local14 + this.anInt155] = this.anIntArray40[local10 * this.anInt153 + local14];
				}
			}
			this.anIntArray40 = local8;
			this.anInt153 = this.anInt157;
			this.anInt154 = this.anInt158;
			this.anInt155 = 0;
			this.anInt156 = 0;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("19602, " + true + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBHVCUAH", name = "a", descriptor = "(IBI)V")
	public void method135(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt155;
			arg1 += this.anInt156;
			@Pc(15) int local15 = arg0 + arg1 * Class6_Sub2_Sub2.anInt758;
			@Pc(17) int local17 = 0;
			@Pc(24) int local24 = this.anInt154;
			@Pc(27) int local27 = this.anInt153;
			@Pc(31) int local31 = Class6_Sub2_Sub2.anInt758 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg1 < Class6_Sub2_Sub2.anInt760) {
				local40 = Class6_Sub2_Sub2.anInt760 - arg1;
				local24 -= local40;
				arg1 = Class6_Sub2_Sub2.anInt760;
				local17 = local40 * local27 + 0;
				local15 += local40 * Class6_Sub2_Sub2.anInt758;
			}
			if (arg1 + local24 > Class6_Sub2_Sub2.anInt761) {
				local24 -= arg1 + local24 - Class6_Sub2_Sub2.anInt761;
			}
			if (arg0 < Class6_Sub2_Sub2.anInt762) {
				local40 = Class6_Sub2_Sub2.anInt762 - arg0;
				local27 -= local40;
				arg0 = Class6_Sub2_Sub2.anInt762;
				local17 += local40;
				local15 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg0 + local27 > Class6_Sub2_Sub2.anInt763) {
				local40 = arg0 + local27 - Class6_Sub2_Sub2.anInt763;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method136(local17, local31, local15, Class6_Sub2_Sub2.anIntArray206, local24, local27, local33, this.anIntArray40);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("52836, " + arg0 + ", " + -76 + ", " + arg1 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBHVCUAH", name = "a", descriptor = "(IIZI[IIII[I)V")
	private void method136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7) {
		try {
			@Pc(6) int local6 = -(arg5 >> 2);
			@Pc(14) int local14 = -(arg5 & 0x3);
			for (@Pc(17) int local17 = -arg4; local17 < 0; local17++) {
				for (@Pc(21) int local21 = local6; local21 < 0; local21++) {
					arg3[arg2++] = arg7[arg0++];
					arg3[arg2++] = arg7[arg0++];
					arg3[arg2++] = arg7[arg0++];
					arg3[arg2++] = arg7[arg0++];
				}
				for (@Pc(60) int local60 = local14; local60 < 0; local60++) {
					arg3[arg2++] = arg7[arg0++];
				}
				arg2 += arg1;
				arg0 += arg6;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("62872, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBHVCUAH", name = "a", descriptor = "(III)V")
	public void method137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 >= 0) {
				this.anInt151 = 353;
			}
			arg0 += this.anInt155;
			arg1 += this.anInt156;
			@Pc(20) int local20 = arg0 + arg1 * Class6_Sub2_Sub2.anInt758;
			@Pc(22) int local22 = 0;
			@Pc(25) int local25 = this.anInt154;
			@Pc(28) int local28 = this.anInt153;
			@Pc(32) int local32 = Class6_Sub2_Sub2.anInt758 - local28;
			@Pc(34) int local34 = 0;
			@Pc(41) int local41;
			if (arg1 < Class6_Sub2_Sub2.anInt760) {
				local41 = Class6_Sub2_Sub2.anInt760 - arg1;
				local25 -= local41;
				arg1 = Class6_Sub2_Sub2.anInt760;
				local22 = local41 * local28 + 0;
				local20 += local41 * Class6_Sub2_Sub2.anInt758;
			}
			if (arg1 + local25 > Class6_Sub2_Sub2.anInt761) {
				local25 -= arg1 + local25 - Class6_Sub2_Sub2.anInt761;
			}
			if (arg0 < Class6_Sub2_Sub2.anInt762) {
				local41 = Class6_Sub2_Sub2.anInt762 - arg0;
				local28 -= local41;
				arg0 = Class6_Sub2_Sub2.anInt762;
				local22 += local41;
				local20 += local41;
				local34 = local41 + 0;
				local32 += local41;
			}
			if (arg0 + local28 > Class6_Sub2_Sub2.anInt763) {
				local41 = arg0 + local28 - Class6_Sub2_Sub2.anInt763;
				local28 -= local41;
				local34 += local41;
				local32 += local41;
			}
			if (local28 > 0 && local25 > 0) {
				this.method138(Class6_Sub2_Sub2.anIntArray206, this.anIntArray40, local22, local20, local28, local25, local32, local34);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("48776, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBHVCUAH", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method138(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!IBHVCUAH", name = "a", descriptor = "(ZIII)V")
	public void method139(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		try {
			arg0 += this.anInt155;
			arg1 += this.anInt156;
			@Pc(18) int local18 = arg0 + arg1 * Class6_Sub2_Sub2.anInt758;
			@Pc(20) int local20 = 0;
			@Pc(23) int local23 = this.anInt154;
			@Pc(26) int local26 = this.anInt153;
			@Pc(30) int local30 = Class6_Sub2_Sub2.anInt758 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg1 < Class6_Sub2_Sub2.anInt760) {
				local39 = Class6_Sub2_Sub2.anInt760 - arg1;
				local23 -= local39;
				arg1 = Class6_Sub2_Sub2.anInt760;
				local20 = local39 * local26 + 0;
				local18 += local39 * Class6_Sub2_Sub2.anInt758;
			}
			if (arg1 + local23 > Class6_Sub2_Sub2.anInt761) {
				local23 -= arg1 + local23 - Class6_Sub2_Sub2.anInt761;
			}
			if (arg0 < Class6_Sub2_Sub2.anInt762) {
				local39 = Class6_Sub2_Sub2.anInt762 - arg0;
				local26 -= local39;
				arg0 = Class6_Sub2_Sub2.anInt762;
				local20 += local39;
				local18 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg0 + local26 > Class6_Sub2_Sub2.anInt763) {
				local39 = arg0 + local26 - Class6_Sub2_Sub2.anInt763;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method140(local20, local30, local18, local23, 0, Class6_Sub2_Sub2.anIntArray206, this.anIntArray40, local32, local26);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("27865, " + false + ", " + arg0 + ", " + 128 + ", " + arg1 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBHVCUAH", name = "a", descriptor = "(IIIII[III[III)V")
	private void method140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(8) int[] arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		try {
			for (@Pc(14) int local14 = -arg3; local14 < 0; local14++) {
				for (@Pc(19) int local19 = -arg8; local19 < 0; local19++) {
					@Pc(26) int local26 = arg6[arg0++];
					if (local26 == 0) {
						arg2++;
					} else {
						@Pc(32) int local32 = arg5[arg2];
						arg5[arg2++] = ((local26 & 0xFF00FF) * 128 + (local32 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local26 & 0xFF00) * 128 + (local32 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg2 += arg1;
				arg0 += arg7;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("96713, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -16065 + ", " + 128 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBHVCUAH", name = "a", descriptor = "(III[IIB[IIIII)V")
	public void method141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			if (arg5 == 1) {
				@Pc(6) boolean local6 = false;
			} else {
				this.aBoolean61 = !this.aBoolean61;
			}
			try {
				@Pc(21) int local21 = -arg0 / 2;
				@Pc(26) int local26 = -arg1 / 2;
				@Pc(35) int local35 = (int) (Math.sin((double) arg4 / 326.11D) * 65536.0D);
				@Pc(44) int local44 = (int) (Math.cos((double) arg4 / 326.11D) * 65536.0D);
				@Pc(50) int local50 = local35 * arg9 >> 8;
				@Pc(56) int local56 = local44 * arg9 >> 8;
				@Pc(68) int local68 = (arg2 << 16) + local26 * local50 + local21 * local56;
				@Pc(80) int local80 = (arg7 << 16) + (local26 * local56 - local21 * local50);
				@Pc(86) int local86 = arg10 + arg8 * Class6_Sub2_Sub2.anInt758;
				for (@Pc(88) int local88 = 0; local88 < arg1; local88++) {
					@Pc(94) int local94 = arg6[local88];
					@Pc(98) int local98 = local86 + local94;
					@Pc(104) int local104 = local68 + local56 * local94;
					@Pc(110) int local110 = local80 - local50 * local94;
					for (@Pc(115) int local115 = -arg3[local88]; local115 < 0; local115++) {
						Class6_Sub2_Sub2.anIntArray206[local98++] = this.anIntArray40[(local104 >> 16) + (local110 >> 16) * this.anInt153];
						local104 += local56;
						local110 -= local50;
					}
					local68 += local50;
					local80 += local56;
					local86 += Class6_Sub2_Sub2.anInt758;
				}
			} catch (@Pc(163) Exception local163) {
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("83426, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBHVCUAH", name = "a", descriptor = "(DBIIIIIII)V")
	public void method142(@OriginalArg(0) double arg0, @OriginalArg(3) int arg1, @OriginalArg(7) int arg2) {
		try {
			try {
				@Pc(27) int local27 = (int) (Math.sin(arg0) * 65536.0D);
				@Pc(33) int local33 = (int) (Math.cos(arg0) * 65536.0D);
				@Pc(39) int local39 = local27 * 256 >> 8;
				@Pc(45) int local45 = local33 * 256 >> 8;
				@Pc(57) int local57 = local39 * -10 + local45 * -10 + 983040;
				@Pc(69) int local69 = local45 * -10 + 983040 - local39 * -10;
				@Pc(75) int local75 = arg2 + arg1 * Class6_Sub2_Sub2.anInt758;
				for (@Pc(77) int local77 = 0; local77 < 20; local77++) {
					@Pc(81) int local81 = local75;
					@Pc(83) int local83 = local57;
					@Pc(85) int local85 = local69;
					for (@Pc(88) int local88 = -20; local88 < 0; local88++) {
						@Pc(104) int local104 = this.anIntArray40[(local83 >> 16) + (local85 >> 16) * this.anInt153];
						if (local104 == 0) {
							local81++;
						} else {
							Class6_Sub2_Sub2.anIntArray206[local81++] = local104;
						}
						local83 += local45;
						local85 -= local39;
					}
					local57 += local39;
					local69 += local45;
					local75 += Class6_Sub2_Sub2.anInt758;
				}
			} catch (@Pc(143) Exception local143) {
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("58858, " + arg0 + ", " + 126 + ", " + 15 + ", " + arg1 + ", " + 256 + ", " + 15 + ", " + 20 + ", " + arg2 + ", " + 20 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBHVCUAH", name = "a", descriptor = "(ZILclient!XHDQQNIR;I)V")
	public void method143(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub2_Sub4 arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) int local3;
			if (!arg0) {
				for (local3 = 1; local3 > 0; local3++) {
				}
			}
			arg3 += this.anInt155;
			arg1 += this.anInt156;
			local3 = arg3 + arg1 * Class6_Sub2_Sub2.anInt758;
			@Pc(26) int local26 = 0;
			@Pc(29) int local29 = this.anInt154;
			@Pc(32) int local32 = this.anInt153;
			@Pc(36) int local36 = Class6_Sub2_Sub2.anInt758 - local32;
			@Pc(38) int local38 = 0;
			@Pc(45) int local45;
			if (arg1 < Class6_Sub2_Sub2.anInt760) {
				local45 = Class6_Sub2_Sub2.anInt760 - arg1;
				local29 -= local45;
				arg1 = Class6_Sub2_Sub2.anInt760;
				local26 = local45 * local32 + 0;
				local3 += local45 * Class6_Sub2_Sub2.anInt758;
			}
			if (arg1 + local29 > Class6_Sub2_Sub2.anInt761) {
				local29 -= arg1 + local29 - Class6_Sub2_Sub2.anInt761;
			}
			if (arg3 < Class6_Sub2_Sub2.anInt762) {
				local45 = Class6_Sub2_Sub2.anInt762 - arg3;
				local32 -= local45;
				arg3 = Class6_Sub2_Sub2.anInt762;
				local26 += local45;
				local3 += local45;
				local38 = local45 + 0;
				local36 += local45;
			}
			if (arg3 + local32 > Class6_Sub2_Sub2.anInt763) {
				local45 = arg3 + local32 - Class6_Sub2_Sub2.anInt763;
				local32 -= local45;
				local38 += local45;
				local36 += local45;
			}
			if (local32 > 0 && local29 > 0) {
				this.method144(this.anInt150, arg2.aByteArray20, local3, local29, this.anIntArray40, local38, local36, Class6_Sub2_Sub2.anIntArray206, 0, local26, local32);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("32578, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBHVCUAH", name = "a", descriptor = "(I[BII[III[IIII)V")
	private void method144(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			if (arg0 > 0) {
				@Pc(9) int local9 = -(arg10 >> 2);
				@Pc(14) int local14 = -(arg10 & 0x3);
				for (@Pc(17) int local17 = -arg3; local17 < 0; local17++) {
					@Pc(28) int local28;
					for (@Pc(21) int local21 = local9; local21 < 0; local21++) {
						local28 = arg4[arg9++];
						if (local28 != 0 && arg1[arg2] == 0) {
							arg7[arg2++] = local28;
						} else {
							arg2++;
						}
						local28 = arg4[arg9++];
						if (local28 != 0 && arg1[arg2] == 0) {
							arg7[arg2++] = local28;
						} else {
							arg2++;
						}
						local28 = arg4[arg9++];
						if (local28 != 0 && arg1[arg2] == 0) {
							arg7[arg2++] = local28;
						} else {
							arg2++;
						}
						local28 = arg4[arg9++];
						if (local28 != 0 && arg1[arg2] == 0) {
							arg7[arg2++] = local28;
						} else {
							arg2++;
						}
					}
					for (@Pc(104) int local104 = local14; local104 < 0; local104++) {
						local28 = arg4[arg9++];
						if (local28 != 0 && arg1[arg2] == 0) {
							arg7[arg2++] = local28;
						} else {
							arg2++;
						}
					}
					arg2 += arg6;
					arg9 += arg5;
				}
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("68560, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}
