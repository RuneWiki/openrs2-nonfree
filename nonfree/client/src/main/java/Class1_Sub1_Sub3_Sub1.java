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

@OriginalClass("client!CUKAGIIJ")
public final class Class1_Sub1_Sub3_Sub1 extends Class1_Sub1_Sub3 {

	@OriginalMember(owner = "client!CUKAGIIJ", name = "F", descriptor = "I")
	private int anInt190;

	@OriginalMember(owner = "client!CUKAGIIJ", name = "z", descriptor = "I")
	private int anInt188 = -288;

	@OriginalMember(owner = "client!CUKAGIIJ", name = "A", descriptor = "B")
	private byte aByte9 = -27;

	@OriginalMember(owner = "client!CUKAGIIJ", name = "B", descriptor = "B")
	private byte aByte10 = -27;

	@OriginalMember(owner = "client!CUKAGIIJ", name = "C", descriptor = "I")
	private int anInt189 = -514;

	@OriginalMember(owner = "client!CUKAGIIJ", name = "D", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!CUKAGIIJ", name = "E", descriptor = "Z")
	private boolean aBoolean45 = true;

	@OriginalMember(owner = "client!CUKAGIIJ", name = "G", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!CUKAGIIJ", name = "H", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!CUKAGIIJ", name = "I", descriptor = "[I")
	public int[] anIntArray22;

	@OriginalMember(owner = "client!CUKAGIIJ", name = "N", descriptor = "I")
	public int anInt195;

	@OriginalMember(owner = "client!CUKAGIIJ", name = "J", descriptor = "I")
	public int anInt191;

	@OriginalMember(owner = "client!CUKAGIIJ", name = "O", descriptor = "I")
	public int anInt196;

	@OriginalMember(owner = "client!CUKAGIIJ", name = "K", descriptor = "I")
	public int anInt192;

	@OriginalMember(owner = "client!CUKAGIIJ", name = "M", descriptor = "I")
	private int anInt194;

	@OriginalMember(owner = "client!CUKAGIIJ", name = "L", descriptor = "I")
	private int anInt193;

	@OriginalMember(owner = "client!CUKAGIIJ", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray22 = new int[arg0 * arg1];
		this.anInt191 = this.anInt195 = arg0;
		this.anInt192 = this.anInt196 = arg1;
		this.anInt193 = this.anInt194 = 0;
	}

	@OriginalMember(owner = "client!CUKAGIIJ", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub3_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(29) Image local29 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(34) MediaTracker local34 = new MediaTracker(arg1);
			local34.addImage(local29, 0);
			local34.waitForAll();
			this.anInt191 = local29.getWidth(arg1);
			this.anInt192 = local29.getHeight(arg1);
			this.anInt195 = this.anInt191;
			this.anInt196 = this.anInt192;
			this.anInt193 = 0;
			this.anInt194 = 0;
			this.anIntArray22 = new int[this.anInt191 * this.anInt192];
			@Pc(88) PixelGrabber local88 = new PixelGrabber(local29, 0, 0, this.anInt191, this.anInt192, this.anIntArray22, 0, this.anInt191);
			local88.grabPixels();
		} catch (@Pc(93) Exception local93) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!CUKAGIIJ", name = "<init>", descriptor = "(Lclient!VSUYIIVA;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub3_Sub1(@OriginalArg(0) Class42 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(43) Class1_Sub1_Sub2 local43 = new Class1_Sub1_Sub2(arg0.method539(arg1 + ".dat", null), 792);
		@Pc(52) Class1_Sub1_Sub2 local52 = new Class1_Sub1_Sub2(arg0.method539("index.dat", null), 792);
		local52.anInt153 = local43.method61();
		this.anInt195 = local52.method61();
		this.anInt196 = local52.method61();
		@Pc(67) int local67 = local52.method59();
		@Pc(70) int[] local70 = new int[local67];
		for (@Pc(72) int local72 = 0; local72 < local67 - 1; local72++) {
			local70[local72 + 1] = local52.method63();
			if (local70[local72 + 1] == 0) {
				local70[local72 + 1] = 1;
			}
		}
		for (@Pc(107) int local107 = 0; local107 < arg2; local107++) {
			local52.anInt153 += 2;
			local43.anInt153 += local52.method61() * local52.method61();
			local52.anInt153++;
		}
		this.anInt193 = local52.method59();
		this.anInt194 = local52.method59();
		this.anInt191 = local52.method61();
		this.anInt192 = local52.method61();
		@Pc(154) int local154 = local52.method59();
		@Pc(160) int local160 = this.anInt191 * this.anInt192;
		this.anIntArray22 = new int[local160];
		@Pc(168) int local168;
		if (local154 == 0) {
			for (local168 = 0; local168 < local160; local168++) {
				this.anIntArray22[local168] = local70[local43.method59()];
			}
		} else if (local154 == 1) {
			for (local168 = 0; local168 < this.anInt191; local168++) {
				for (@Pc(192) int local192 = 0; local192 < this.anInt192; local192++) {
					this.anIntArray22[local168 + local192 * this.anInt191] = local70[local43.method59()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!CUKAGIIJ", name = "b", descriptor = "(I)V")
	public void method133(@OriginalArg(0) int arg0) {
		try {
			Class1_Sub1_Sub3.method509(this.anInt191, this.anInt192, this.anIntArray22);
			if (arg0 != -3747) {
				this.aBoolean47 = !this.aBoolean47;
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("84461, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CUKAGIIJ", name = "a", descriptor = "(IIBI)V")
	public void method134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray22.length; local3++) {
				@Pc(10) int local10 = this.anIntArray22[local3];
				if (local10 != 0) {
					@Pc(18) int local18 = local10 >> 16 & 0xFF;
					local18 += arg1;
					if (local18 < 1) {
						local18 = 1;
					} else if (local18 > 255) {
						local18 = 255;
					}
					@Pc(40) int local40 = local10 >> 8 & 0xFF;
					local40 += arg3;
					if (local40 < 1) {
						local40 = 1;
					} else if (local40 > 255) {
						local40 = 255;
					}
					@Pc(60) int local60 = local10 & 0xFF;
					local60 += arg0;
					if (local60 < 1) {
						local60 = 1;
					} else if (local60 > 255) {
						local60 = 255;
					}
					this.anIntArray22[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
			if (arg2 == 3) {
				@Pc(100) boolean local100 = false;
			} else {
				this.anInt188 = 455;
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("5266, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CUKAGIIJ", name = "c", descriptor = "(I)V")
	public void method135() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt195 * this.anInt196];
			for (@Pc(10) int local10 = 0; local10 < this.anInt192; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt191; local14++) {
					local8[(local10 + this.anInt194) * this.anInt195 + local14 + this.anInt193] = this.anIntArray22[local10 * this.anInt191 + local14];
				}
			}
			this.anIntArray22 = local8;
			this.anInt191 = this.anInt195;
			this.anInt192 = this.anInt196;
			this.anInt193 = 0;
			this.anInt194 = 0;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("80111, " + -229 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CUKAGIIJ", name = "a", descriptor = "(BII)V")
	public void method136(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg2 += this.anInt193;
			@Pc(9) boolean local9 = false;
			arg1 += this.anInt194;
			@Pc(23) int local23 = arg2 + arg1 * Class1_Sub1_Sub3.anInt735;
			@Pc(25) int local25 = 0;
			@Pc(28) int local28 = this.anInt192;
			@Pc(31) int local31 = this.anInt191;
			@Pc(35) int local35 = Class1_Sub1_Sub3.anInt735 - local31;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44;
			if (arg1 < Class1_Sub1_Sub3.anInt737) {
				local44 = Class1_Sub1_Sub3.anInt737 - arg1;
				local28 -= local44;
				arg1 = Class1_Sub1_Sub3.anInt737;
				local25 = local44 * local31 + 0;
				local23 += local44 * Class1_Sub1_Sub3.anInt735;
			}
			if (arg1 + local28 > Class1_Sub1_Sub3.anInt738) {
				local28 -= arg1 + local28 - Class1_Sub1_Sub3.anInt738;
			}
			if (arg2 < Class1_Sub1_Sub3.anInt739) {
				local44 = Class1_Sub1_Sub3.anInt739 - arg2;
				local31 -= local44;
				arg2 = Class1_Sub1_Sub3.anInt739;
				local25 += local44;
				local23 += local44;
				local37 = local44 + 0;
				local35 += local44;
			}
			if (arg2 + local31 > Class1_Sub1_Sub3.anInt740) {
				local44 = arg2 + local31 - Class1_Sub1_Sub3.anInt740;
				local31 -= local44;
				local37 += local44;
				local35 += local44;
			}
			if (local31 > 0 && local28 > 0) {
				this.method137(local28, Class1_Sub1_Sub3.anIntArray176, local37, this.anIntArray22, local35, local31, local25, local23);
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("91362, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CUKAGIIJ", name = "a", descriptor = "(I[II[IIIIII)V")
	private void method137(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(11) int local11 = -(arg5 >> 2);
			@Pc(16) int local16 = -(arg5 & 0x3);
			for (@Pc(19) int local19 = -arg0; local19 < 0; local19++) {
				for (@Pc(23) int local23 = local11; local23 < 0; local23++) {
					arg1[arg7++] = arg3[arg6++];
					arg1[arg7++] = arg3[arg6++];
					arg1[arg7++] = arg3[arg6++];
					arg1[arg7++] = arg3[arg6++];
				}
				for (@Pc(62) int local62 = local16; local62 < 0; local62++) {
					arg1[arg7++] = arg3[arg6++];
				}
				arg7 += arg4;
				arg6 += arg2;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("55208, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + arg6 + ", " + arg7 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CUKAGIIJ", name = "a", descriptor = "(III)V")
	public void method138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt193;
			arg1 += this.anInt194;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub3.anInt735;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt192;
			@Pc(23) int local23 = this.anInt191;
			@Pc(27) int local27 = Class1_Sub1_Sub3.anInt735 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class1_Sub1_Sub3.anInt737) {
				local36 = Class1_Sub1_Sub3.anInt737 - arg1;
				local20 -= local36;
				arg1 = Class1_Sub1_Sub3.anInt737;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub1_Sub3.anInt735;
			}
			if (arg1 + local20 > Class1_Sub1_Sub3.anInt738) {
				local20 -= arg1 + local20 - Class1_Sub1_Sub3.anInt738;
			}
			if (arg0 < Class1_Sub1_Sub3.anInt739) {
				local36 = Class1_Sub1_Sub3.anInt739 - arg0;
				local23 -= local36;
				arg0 = Class1_Sub1_Sub3.anInt739;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class1_Sub1_Sub3.anInt740) {
				local36 = arg0 + local23 - Class1_Sub1_Sub3.anInt740;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method139(Class1_Sub1_Sub3.anIntArray176, this.anIntArray22, local17, local15, local23, local20, local27, local29);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("91958, " + arg0 + ", " + arg1 + ", " + 9 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CUKAGIIJ", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method139(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!CUKAGIIJ", name = "a", descriptor = "(IIII)V")
	public void method140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg1 += this.anInt193;
			arg0 += this.anInt194;
			@Pc(24) int local24 = arg1 + arg0 * Class1_Sub1_Sub3.anInt735;
			@Pc(26) int local26 = 0;
			@Pc(29) int local29 = this.anInt192;
			@Pc(32) int local32 = this.anInt191;
			@Pc(36) int local36 = Class1_Sub1_Sub3.anInt735 - local32;
			@Pc(38) int local38 = 0;
			@Pc(45) int local45;
			if (arg0 < Class1_Sub1_Sub3.anInt737) {
				local45 = Class1_Sub1_Sub3.anInt737 - arg0;
				local29 -= local45;
				arg0 = Class1_Sub1_Sub3.anInt737;
				local26 = local45 * local32 + 0;
				local24 += local45 * Class1_Sub1_Sub3.anInt735;
			}
			if (arg0 + local29 > Class1_Sub1_Sub3.anInt738) {
				local29 -= arg0 + local29 - Class1_Sub1_Sub3.anInt738;
			}
			if (arg1 < Class1_Sub1_Sub3.anInt739) {
				local45 = Class1_Sub1_Sub3.anInt739 - arg1;
				local32 -= local45;
				arg1 = Class1_Sub1_Sub3.anInt739;
				local26 += local45;
				local24 += local45;
				local38 = local45 + 0;
				local36 += local45;
			}
			if (arg1 + local32 > Class1_Sub1_Sub3.anInt740) {
				local45 = arg1 + local32 - Class1_Sub1_Sub3.anInt740;
				local32 -= local45;
				local38 += local45;
				local36 += local45;
			}
			if (local32 > 0 && local29 > 0) {
				this.method141(this.anIntArray22, local36, local32, 0, Class1_Sub1_Sub3.anIntArray176, local24, local26, local38, local29);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("90666, " + arg0 + ", " + arg1 + ", " + 128 + ", " + 593 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CUKAGIIJ", name = "a", descriptor = "([IIII[IIIIIII)V")
	private void method141(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		try {
			for (@Pc(8) int local8 = -arg8; local8 < 0; local8++) {
				for (@Pc(13) int local13 = -arg2; local13 < 0; local13++) {
					@Pc(20) int local20 = arg0[arg6++];
					if (local20 == 0) {
						arg5++;
					} else {
						@Pc(26) int local26 = arg4[arg5];
						arg4[arg5++] = ((local20 & 0xFF00FF) * 128 + (local26 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local20 & 0xFF00) * 128 + (local26 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg5 += arg1;
				arg6 += arg7;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("98423, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -514 + ", " + arg5 + ", " + 128 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CUKAGIIJ", name = "a", descriptor = "([III[IIIIIIII)V")
	public void method142(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(17) int local17 = -arg8 / 2;
				@Pc(22) int local22 = -arg7 / 2;
				@Pc(31) int local31 = (int) (Math.sin((double) arg5 / 326.11D) * 65536.0D);
				@Pc(40) int local40 = (int) (Math.cos((double) arg5 / 326.11D) * 65536.0D);
				@Pc(46) int local46 = local31 * arg4 >> 8;
				@Pc(52) int local52 = local40 * arg4 >> 8;
				@Pc(64) int local64 = (arg1 << 16) + local22 * local46 + local17 * local52;
				@Pc(76) int local76 = (arg6 << 16) + (local22 * local52 - local17 * local46);
				@Pc(82) int local82 = arg3 + arg9 * Class1_Sub1_Sub3.anInt735;
				for (@Pc(84) int local84 = 0; local84 < arg7; local84++) {
					@Pc(90) int local90 = arg2[local84];
					@Pc(94) int local94 = local82 + local90;
					@Pc(100) int local100 = local64 + local52 * local90;
					@Pc(106) int local106 = local76 - local46 * local90;
					for (@Pc(111) int local111 = -arg0[local84]; local111 < 0; local111++) {
						Class1_Sub1_Sub3.anIntArray176[local94++] = this.anIntArray22[(local100 >> 16) + (local106 >> 16) * this.anInt191];
						local100 += local52;
						local106 -= local46;
					}
					local64 += local46;
					local76 += local52;
					local82 += Class1_Sub1_Sub3.anInt735;
				}
			} catch (@Pc(159) Exception local159) {
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("23540, " + arg0 + ", " + 7 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CUKAGIIJ", name = "a", descriptor = "(IIIDIIIII)V")
	public void method143(@OriginalArg(1) int arg0, @OriginalArg(3) double arg1, @OriginalArg(8) int arg2) {
		try {
			try {
				@Pc(27) int local27 = (int) (Math.sin(arg1) * 65536.0D);
				@Pc(33) int local33 = (int) (Math.cos(arg1) * 65536.0D);
				@Pc(39) int local39 = local27 * 256 >> 8;
				@Pc(45) int local45 = local33 * 256 >> 8;
				@Pc(57) int local57 = local39 * -10 + local45 * -10 + 983040;
				@Pc(69) int local69 = local45 * -10 + 983040 - local39 * -10;
				@Pc(75) int local75 = arg2 + arg0 * Class1_Sub1_Sub3.anInt735;
				for (@Pc(77) int local77 = 0; local77 < 20; local77++) {
					@Pc(81) int local81 = local75;
					@Pc(83) int local83 = local57;
					@Pc(85) int local85 = local69;
					for (@Pc(88) int local88 = -20; local88 < 0; local88++) {
						@Pc(104) int local104 = this.anIntArray22[(local83 >> 16) + (local85 >> 16) * this.anInt191];
						if (local104 == 0) {
							local81++;
						} else {
							Class1_Sub1_Sub3.anIntArray176[local81++] = local104;
						}
						local83 += local45;
						local85 -= local39;
					}
					local57 += local39;
					local69 += local45;
					local75 += Class1_Sub1_Sub3.anInt735;
				}
			} catch (@Pc(143) Exception local143) {
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("79927, " + 20 + ", " + arg0 + ", " + 20 + ", " + arg1 + ", " + 15 + ", " + 256 + ", " + 0 + ", " + 15 + ", " + arg2 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CUKAGIIJ", name = "a", descriptor = "(Lclient!FDCAWVRL;III)V")
	public void method144(@OriginalArg(0) Class1_Sub1_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			arg2 += this.anInt193;
			arg1 += this.anInt194;
			@Pc(15) int local15 = arg2 + arg1 * Class1_Sub1_Sub3.anInt735;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt192;
			@Pc(23) int local23 = this.anInt191;
			@Pc(27) int local27 = Class1_Sub1_Sub3.anInt735 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class1_Sub1_Sub3.anInt737) {
				local36 = Class1_Sub1_Sub3.anInt737 - arg1;
				local20 -= local36;
				arg1 = Class1_Sub1_Sub3.anInt737;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub1_Sub3.anInt735;
			}
			if (arg1 + local20 > Class1_Sub1_Sub3.anInt738) {
				local20 -= arg1 + local20 - Class1_Sub1_Sub3.anInt738;
			}
			if (arg2 < Class1_Sub1_Sub3.anInt739) {
				local36 = Class1_Sub1_Sub3.anInt739 - arg2;
				local23 -= local36;
				arg2 = Class1_Sub1_Sub3.anInt739;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg2 + local23 > Class1_Sub1_Sub3.anInt740) {
				local36 = arg2 + local23 - Class1_Sub1_Sub3.anInt740;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method145(local23, 0, this.anIntArray22, arg0.aByteArray2, local20, local17, Class1_Sub1_Sub3.anIntArray176, local27, local29, local15);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("23061, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CUKAGIIJ", name = "a", descriptor = "(II[I[BII[IIIII)V")
	private void method145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(6) int local6 = -(arg0 >> 2);
			@Pc(11) int local11 = -(arg0 & 0x3);
			if (this.anInt190 != 0) {
				this.anInt190 = -120;
			}
			for (@Pc(21) int local21 = -arg4; local21 < 0; local21++) {
				@Pc(32) int local32;
				for (@Pc(25) int local25 = local6; local25 < 0; local25++) {
					local32 = arg2[arg5++];
					if (local32 != 0 && arg3[arg9] == 0) {
						arg6[arg9++] = local32;
					} else {
						arg9++;
					}
					local32 = arg2[arg5++];
					if (local32 != 0 && arg3[arg9] == 0) {
						arg6[arg9++] = local32;
					} else {
						arg9++;
					}
					local32 = arg2[arg5++];
					if (local32 != 0 && arg3[arg9] == 0) {
						arg6[arg9++] = local32;
					} else {
						arg9++;
					}
					local32 = arg2[arg5++];
					if (local32 != 0 && arg3[arg9] == 0) {
						arg6[arg9++] = local32;
					} else {
						arg9++;
					}
				}
				for (@Pc(108) int local108 = local11; local108 < 0; local108++) {
					local32 = arg2[arg5++];
					if (local32 != 0 && arg3[arg9] == 0) {
						arg6[arg9++] = local32;
					} else {
						arg9++;
					}
				}
				arg9 += arg7;
				arg5 += arg8;
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("82816, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 0 + ", " + arg9 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}
}
