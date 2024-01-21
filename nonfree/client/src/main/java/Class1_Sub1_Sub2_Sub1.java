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

@OriginalClass("client!OMAKLDKI")
public final class Class1_Sub1_Sub2_Sub1 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!OMAKLDKI", name = "w", descriptor = "I")
	private int anInt409 = 6;

	@OriginalMember(owner = "client!OMAKLDKI", name = "x", descriptor = "Z")
	private boolean aBoolean82 = true;

	@OriginalMember(owner = "client!OMAKLDKI", name = "y", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!OMAKLDKI", name = "z", descriptor = "I")
	private int anInt410 = -653;

	@OriginalMember(owner = "client!OMAKLDKI", name = "A", descriptor = "B")
	private byte aByte6 = 9;

	@OriginalMember(owner = "client!OMAKLDKI", name = "B", descriptor = "I")
	private int anInt411 = 726;

	@OriginalMember(owner = "client!OMAKLDKI", name = "C", descriptor = "B")
	private byte aByte7 = 0;

	@OriginalMember(owner = "client!OMAKLDKI", name = "D", descriptor = "Z")
	private boolean aBoolean84 = true;

	@OriginalMember(owner = "client!OMAKLDKI", name = "E", descriptor = "B")
	private byte aByte8 = 5;

	@OriginalMember(owner = "client!OMAKLDKI", name = "F", descriptor = "Z")
	private boolean aBoolean85 = true;

	@OriginalMember(owner = "client!OMAKLDKI", name = "G", descriptor = "I")
	private int anInt412 = -22770;

	@OriginalMember(owner = "client!OMAKLDKI", name = "H", descriptor = "[I")
	public int[] anIntArray128;

	@OriginalMember(owner = "client!OMAKLDKI", name = "M", descriptor = "I")
	public int anInt417;

	@OriginalMember(owner = "client!OMAKLDKI", name = "I", descriptor = "I")
	public int anInt413;

	@OriginalMember(owner = "client!OMAKLDKI", name = "N", descriptor = "I")
	public int anInt418;

	@OriginalMember(owner = "client!OMAKLDKI", name = "J", descriptor = "I")
	public int anInt414;

	@OriginalMember(owner = "client!OMAKLDKI", name = "L", descriptor = "I")
	private int anInt416;

	@OriginalMember(owner = "client!OMAKLDKI", name = "K", descriptor = "I")
	private int anInt415;

	@OriginalMember(owner = "client!OMAKLDKI", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray128 = new int[arg0 * arg1];
		this.anInt413 = this.anInt417 = arg0;
		this.anInt414 = this.anInt418 = arg1;
		this.anInt415 = this.anInt416 = 0;
	}

	@OriginalMember(owner = "client!OMAKLDKI", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub2_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(38) Image local38 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(43) MediaTracker local43 = new MediaTracker(arg1);
			local43.addImage(local38, 0);
			local43.waitForAll();
			this.anInt413 = local38.getWidth(arg1);
			this.anInt414 = local38.getHeight(arg1);
			this.anInt417 = this.anInt413;
			this.anInt418 = this.anInt414;
			this.anInt415 = 0;
			this.anInt416 = 0;
			this.anIntArray128 = new int[this.anInt413 * this.anInt414];
			@Pc(97) PixelGrabber local97 = new PixelGrabber(local38, 0, 0, this.anInt413, this.anInt414, this.anIntArray128, 0, this.anInt413);
			local97.grabPixels();
		} catch (@Pc(102) Exception local102) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!OMAKLDKI", name = "<init>", descriptor = "(Lclient!WEMOPWVJ;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub1(@OriginalArg(0) Class43 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(52) Class1_Sub1_Sub4 local52 = new Class1_Sub1_Sub4(arg0.method515(arg1 + ".dat", null), true);
		@Pc(61) Class1_Sub1_Sub4 local61 = new Class1_Sub1_Sub4(arg0.method515("index.dat", null), true);
		local61.anInt624 = local52.method407();
		this.anInt417 = local61.method407();
		this.anInt418 = local61.method407();
		@Pc(76) int local76 = local61.method405();
		@Pc(79) int[] local79 = new int[local76];
		for (@Pc(81) int local81 = 0; local81 < local76 - 1; local81++) {
			local79[local81 + 1] = local61.method409();
			if (local79[local81 + 1] == 0) {
				local79[local81 + 1] = 1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < arg2; local116++) {
			local61.anInt624 += 2;
			local52.anInt624 += local61.method407() * local61.method407();
			local61.anInt624++;
		}
		this.anInt415 = local61.method405();
		this.anInt416 = local61.method405();
		this.anInt413 = local61.method407();
		this.anInt414 = local61.method407();
		@Pc(163) int local163 = local61.method405();
		@Pc(169) int local169 = this.anInt413 * this.anInt414;
		this.anIntArray128 = new int[local169];
		@Pc(177) int local177;
		if (local163 == 0) {
			for (local177 = 0; local177 < local169; local177++) {
				this.anIntArray128[local177] = local79[local52.method405()];
			}
		} else if (local163 == 1) {
			for (local177 = 0; local177 < this.anInt413; local177++) {
				for (@Pc(201) int local201 = 0; local201 < this.anInt414; local201++) {
					this.anIntArray128[local177 + local201 * this.anInt413] = local79[local52.method405()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!OMAKLDKI", name = "c", descriptor = "(I)V")
	public void method247() {
		try {
			Class1_Sub1_Sub2.method553(this.anIntArray128, this.anInt413, this.anInt414);
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("88701, " + -439 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OMAKLDKI", name = "a", descriptor = "(IIII)V")
	public void method248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray128.length; local13++) {
				@Pc(20) int local20 = this.anIntArray128[local13];
				if (local20 != 0) {
					@Pc(28) int local28 = local20 >> 16 & 0xFF;
					local28 += arg2;
					if (local28 < 1) {
						local28 = 1;
					} else if (local28 > 255) {
						local28 = 255;
					}
					@Pc(50) int local50 = local20 >> 8 & 0xFF;
					local50 += arg1;
					if (local50 < 1) {
						local50 = 1;
					} else if (local50 > 255) {
						local50 = 255;
					}
					@Pc(70) int local70 = local20 & 0xFF;
					local70 += arg0;
					if (local70 < 1) {
						local70 = 1;
					} else if (local70 > 255) {
						local70 = 255;
					}
					this.anIntArray128[local13] = (local28 << 16) + (local50 << 8) + local70;
				}
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("62528, " + arg0 + ", " + arg1 + ", " + -879 + ", " + arg2 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OMAKLDKI", name = "d", descriptor = "(I)V")
	public void method249() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt417 * this.anInt418];
			for (@Pc(10) int local10 = 0; local10 < this.anInt414; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt413; local14++) {
					local8[(local10 + this.anInt416) * this.anInt417 + local14 + this.anInt415] = this.anIntArray128[local10 * this.anInt413 + local14];
				}
			}
			this.anIntArray128 = local8;
			this.anInt413 = this.anInt417;
			this.anInt414 = this.anInt418;
			this.anInt415 = 0;
			this.anInt416 = 0;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("57457, " + 812 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OMAKLDKI", name = "a", descriptor = "(III)V")
	public void method250(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt415;
			arg1 += this.anInt416;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt787;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt414;
			@Pc(23) int local23 = this.anInt413;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt787 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class1_Sub1_Sub2.anInt789) {
				local36 = Class1_Sub1_Sub2.anInt789 - arg1;
				local20 -= local36;
				arg1 = Class1_Sub1_Sub2.anInt789;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub1_Sub2.anInt787;
			}
			if (arg1 + local20 > Class1_Sub1_Sub2.anInt790) {
				local20 -= arg1 + local20 - Class1_Sub1_Sub2.anInt790;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt791) {
				local36 = Class1_Sub1_Sub2.anInt791 - arg0;
				local23 -= local36;
				arg0 = Class1_Sub1_Sub2.anInt791;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt792) {
				local36 = arg0 + local23 - Class1_Sub1_Sub2.anInt792;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method251(local15, local27, local17, local29, this.anIntArray128, local20, local23, Class1_Sub1_Sub2.anIntArray208);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("79299, " + 8 + ", " + arg0 + ", " + arg1 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OMAKLDKI", name = "a", descriptor = "(IIII[IIII[I)V")
	private void method251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7) {
		try {
			@Pc(6) int local6 = -(arg6 >> 2);
			@Pc(20) int local20 = -(arg6 & 0x3);
			for (@Pc(23) int local23 = -arg5; local23 < 0; local23++) {
				for (@Pc(27) int local27 = local6; local27 < 0; local27++) {
					arg7[arg0++] = arg4[arg2++];
					arg7[arg0++] = arg4[arg2++];
					arg7[arg0++] = arg4[arg2++];
					arg7[arg0++] = arg4[arg2++];
				}
				for (@Pc(66) int local66 = local20; local66 < 0; local66++) {
					arg7[arg0++] = arg4[arg2++];
				}
				arg0 += arg1;
				arg2 += arg3;
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("2585, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -750 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OMAKLDKI", name = "a", descriptor = "(IIB)V")
	public void method252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg1 += this.anInt415;
			arg0 += this.anInt416;
			@Pc(24) int local24 = arg1 + arg0 * Class1_Sub1_Sub2.anInt787;
			@Pc(26) int local26 = 0;
			@Pc(29) int local29 = this.anInt414;
			@Pc(32) int local32 = this.anInt413;
			@Pc(36) int local36 = Class1_Sub1_Sub2.anInt787 - local32;
			@Pc(38) int local38 = 0;
			@Pc(45) int local45;
			if (arg0 < Class1_Sub1_Sub2.anInt789) {
				local45 = Class1_Sub1_Sub2.anInt789 - arg0;
				local29 -= local45;
				arg0 = Class1_Sub1_Sub2.anInt789;
				local26 = local45 * local32 + 0;
				local24 += local45 * Class1_Sub1_Sub2.anInt787;
			}
			if (arg0 + local29 > Class1_Sub1_Sub2.anInt790) {
				local29 -= arg0 + local29 - Class1_Sub1_Sub2.anInt790;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt791) {
				local45 = Class1_Sub1_Sub2.anInt791 - arg1;
				local32 -= local45;
				arg1 = Class1_Sub1_Sub2.anInt791;
				local26 += local45;
				local24 += local45;
				local38 = local45 + 0;
				local36 += local45;
			}
			if (arg1 + local32 > Class1_Sub1_Sub2.anInt792) {
				local45 = arg1 + local32 - Class1_Sub1_Sub2.anInt792;
				local32 -= local45;
				local38 += local45;
				local36 += local45;
			}
			if (local32 > 0 && local29 > 0) {
				this.method253(Class1_Sub1_Sub2.anIntArray208, this.anIntArray128, local26, local24, local32, local29, local36, local38);
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("48859, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OMAKLDKI", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method253(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!OMAKLDKI", name = "b", descriptor = "(IIII)V")
	public void method254(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt415;
			arg0 += this.anInt416;
			@Pc(15) int local15 = arg1 + arg0 * Class1_Sub1_Sub2.anInt787;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt414;
			@Pc(23) int local23 = this.anInt413;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt787 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg0 < Class1_Sub1_Sub2.anInt789) {
				local36 = Class1_Sub1_Sub2.anInt789 - arg0;
				local20 -= local36;
				arg0 = Class1_Sub1_Sub2.anInt789;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub1_Sub2.anInt787;
			}
			if (arg0 + local20 > Class1_Sub1_Sub2.anInt790) {
				local20 -= arg0 + local20 - Class1_Sub1_Sub2.anInt790;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt791) {
				local36 = Class1_Sub1_Sub2.anInt791 - arg1;
				local23 -= local36;
				arg1 = Class1_Sub1_Sub2.anInt791;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg1 + local23 > Class1_Sub1_Sub2.anInt792) {
				local36 = arg1 + local23 - Class1_Sub1_Sub2.anInt792;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method255(local23, local15, Class1_Sub1_Sub2.anIntArray208, 0, local17, this.anInt410, local20, local29, local27, this.anIntArray128);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("16754, " + 36640 + ", " + arg0 + ", " + arg1 + ", " + 128 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OMAKLDKI", name = "a", descriptor = "(II[IIIIIIII[I)V")
	private void method255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9) {
		try {
			if (arg5 < 0) {
				for (@Pc(11) int local11 = -arg6; local11 < 0; local11++) {
					for (@Pc(16) int local16 = -arg0; local16 < 0; local16++) {
						@Pc(23) int local23 = arg9[arg4++];
						if (local23 == 0) {
							arg1++;
						} else {
							@Pc(29) int local29 = arg2[arg1];
							arg2[arg1++] = ((local23 & 0xFF00FF) * 128 + (local29 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local23 & 0xFF00) * 128 + (local29 & 0xFF00) * 128 & 0xFF0000) >> 8;
						}
					}
					arg1 += arg8;
					arg4 += arg7;
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("79993, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 128 + ", " + arg8 + ", " + arg9 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OMAKLDKI", name = "a", descriptor = "(III[IIII[IIII)V")
	public void method256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(15) int local15 = -arg0 / 2;
				@Pc(20) int local20 = -arg7 / 2;
				@Pc(29) int local29 = (int) (Math.sin((double) arg5 / 326.11D) * 65536.0D);
				@Pc(38) int local38 = (int) (Math.cos((double) arg5 / 326.11D) * 65536.0D);
				@Pc(44) int local44 = local29 * arg8 >> 8;
				@Pc(50) int local50 = local38 * arg8 >> 8;
				@Pc(62) int local62 = (arg3 << 16) + local20 * local44 + local15 * local50;
				@Pc(74) int local74 = (arg9 << 16) + (local20 * local50 - local15 * local44);
				@Pc(80) int local80 = arg4 + arg1 * Class1_Sub1_Sub2.anInt787;
				for (@Pc(82) int local82 = 0; local82 < arg7; local82++) {
					@Pc(88) int local88 = arg6[local82];
					@Pc(92) int local92 = local80 + local88;
					@Pc(98) int local98 = local62 + local50 * local88;
					@Pc(104) int local104 = local74 - local44 * local88;
					for (@Pc(109) int local109 = -arg2[local82]; local109 < 0; local109++) {
						Class1_Sub1_Sub2.anIntArray208[local92++] = this.anIntArray128[(local98 >> 16) + (local104 >> 16) * this.anInt413];
						local98 += local50;
						local104 -= local44;
					}
					local62 += local44;
					local74 += local50;
					local80 += Class1_Sub1_Sub2.anInt787;
				}
			} catch (@Pc(157) Exception local157) {
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("59850, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OMAKLDKI", name = "a", descriptor = "(ZIIIIIDII)V")
	public void method257(@OriginalArg(2) int arg0, @OriginalArg(6) double arg1, @OriginalArg(8) int arg2) {
		try {
			try {
				@Pc(22) int local22 = (int) (Math.sin(arg1) * 65536.0D);
				@Pc(28) int local28 = (int) (Math.cos(arg1) * 65536.0D);
				@Pc(34) int local34 = local22 * 256 >> 8;
				@Pc(40) int local40 = local28 * 256 >> 8;
				@Pc(52) int local52 = local34 * -10 + local40 * -10 + 983040;
				@Pc(64) int local64 = local40 * -10 + 983040 - local34 * -10;
				@Pc(70) int local70 = arg0 + arg2 * Class1_Sub1_Sub2.anInt787;
				for (@Pc(72) int local72 = 0; local72 < 20; local72++) {
					@Pc(76) int local76 = local70;
					@Pc(78) int local78 = local52;
					@Pc(80) int local80 = local64;
					for (@Pc(83) int local83 = -20; local83 < 0; local83++) {
						@Pc(99) int local99 = this.anIntArray128[(local78 >> 16) + (local80 >> 16) * this.anInt413];
						if (local99 == 0) {
							local76++;
						} else {
							Class1_Sub1_Sub2.anIntArray208[local76++] = local99;
						}
						local78 += local40;
						local80 -= local34;
					}
					local52 += local34;
					local64 += local40;
					local70 += Class1_Sub1_Sub2.anInt787;
				}
			} catch (@Pc(138) Exception local138) {
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("95077, " + true + ", " + 15 + ", " + arg0 + ", " + 20 + ", " + 20 + ", " + 15 + ", " + arg1 + ", " + 256 + ", " + arg2 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OMAKLDKI", name = "a", descriptor = "(ZIILclient!ZXDQRRNS;)V")
	public void method258(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub2_Sub4 arg2) {
		try {
			arg1 += this.anInt415;
			arg0 += this.anInt416;
			@Pc(24) int local24 = arg1 + arg0 * Class1_Sub1_Sub2.anInt787;
			@Pc(26) int local26 = 0;
			@Pc(29) int local29 = this.anInt414;
			@Pc(32) int local32 = this.anInt413;
			@Pc(36) int local36 = Class1_Sub1_Sub2.anInt787 - local32;
			@Pc(38) int local38 = 0;
			@Pc(45) int local45;
			if (arg0 < Class1_Sub1_Sub2.anInt789) {
				local45 = Class1_Sub1_Sub2.anInt789 - arg0;
				local29 -= local45;
				arg0 = Class1_Sub1_Sub2.anInt789;
				local26 = local45 * local32 + 0;
				local24 += local45 * Class1_Sub1_Sub2.anInt787;
			}
			if (arg0 + local29 > Class1_Sub1_Sub2.anInt790) {
				local29 -= arg0 + local29 - Class1_Sub1_Sub2.anInt790;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt791) {
				local45 = Class1_Sub1_Sub2.anInt791 - arg1;
				local32 -= local45;
				arg1 = Class1_Sub1_Sub2.anInt791;
				local26 += local45;
				local24 += local45;
				local38 = local45 + 0;
				local36 += local45;
			}
			if (arg1 + local32 > Class1_Sub1_Sub2.anInt792) {
				local45 = arg1 + local32 - Class1_Sub1_Sub2.anInt792;
				local32 -= local45;
				local38 += local45;
				local36 += local45;
			}
			if (local32 > 0 && local29 > 0) {
				this.method259(Class1_Sub1_Sub2.anIntArray208, 0, local24, local29, arg2.aByteArray20, local32, local26, this.anIntArray128, local38, local36);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("81460, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OMAKLDKI", name = "a", descriptor = "([IIBII[BII[III)V")
	private void method259(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			if (this.aByte8 != 5) {
				this.aBoolean83 = !this.aBoolean83;
			}
			@Pc(18) int local18 = -(arg5 >> 2);
			@Pc(23) int local23 = -(arg5 & 0x3);
			for (@Pc(26) int local26 = -arg3; local26 < 0; local26++) {
				@Pc(37) int local37;
				for (@Pc(30) int local30 = local18; local30 < 0; local30++) {
					local37 = arg7[arg6++];
					if (local37 != 0 && arg4[arg2] == 0) {
						arg0[arg2++] = local37;
					} else {
						arg2++;
					}
					local37 = arg7[arg6++];
					if (local37 != 0 && arg4[arg2] == 0) {
						arg0[arg2++] = local37;
					} else {
						arg2++;
					}
					local37 = arg7[arg6++];
					if (local37 != 0 && arg4[arg2] == 0) {
						arg0[arg2++] = local37;
					} else {
						arg2++;
					}
					local37 = arg7[arg6++];
					if (local37 != 0 && arg4[arg2] == 0) {
						arg0[arg2++] = local37;
					} else {
						arg2++;
					}
				}
				for (@Pc(113) int local113 = local23; local113 < 0; local113++) {
					local37 = arg7[arg6++];
					if (local37 != 0 && arg4[arg2] == 0) {
						arg0[arg2++] = local37;
					} else {
						arg2++;
					}
				}
				arg2 += arg9;
				arg6 += arg8;
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("51071, " + arg0 + ", " + arg1 + ", " + 5 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}
}
