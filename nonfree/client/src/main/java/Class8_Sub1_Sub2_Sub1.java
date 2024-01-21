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

@OriginalClass("client!GPLGZASP")
public final class Class8_Sub1_Sub2_Sub1 extends Class8_Sub1_Sub2 {

	@OriginalMember(owner = "client!GPLGZASP", name = "w", descriptor = "Z")
	private boolean aBoolean40 = true;

	@OriginalMember(owner = "client!GPLGZASP", name = "x", descriptor = "I")
	private int anInt189 = 534;

	@OriginalMember(owner = "client!GPLGZASP", name = "y", descriptor = "I")
	private int anInt190 = -81;

	@OriginalMember(owner = "client!GPLGZASP", name = "z", descriptor = "Z")
	private boolean aBoolean41 = false;

	@OriginalMember(owner = "client!GPLGZASP", name = "A", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!GPLGZASP", name = "B", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!GPLGZASP", name = "C", descriptor = "[I")
	public int[] anIntArray41;

	@OriginalMember(owner = "client!GPLGZASP", name = "H", descriptor = "I")
	public int anInt195;

	@OriginalMember(owner = "client!GPLGZASP", name = "D", descriptor = "I")
	public int anInt191;

	@OriginalMember(owner = "client!GPLGZASP", name = "I", descriptor = "I")
	public int anInt196;

	@OriginalMember(owner = "client!GPLGZASP", name = "E", descriptor = "I")
	public int anInt192;

	@OriginalMember(owner = "client!GPLGZASP", name = "G", descriptor = "I")
	private int anInt194;

	@OriginalMember(owner = "client!GPLGZASP", name = "F", descriptor = "I")
	private int anInt193;

	@OriginalMember(owner = "client!GPLGZASP", name = "<init>", descriptor = "(II)V")
	public Class8_Sub1_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray41 = new int[arg0 * arg1];
		this.anInt191 = this.anInt195 = arg0;
		this.anInt192 = this.anInt196 = arg1;
		this.anInt193 = this.anInt194 = 0;
	}

	@OriginalMember(owner = "client!GPLGZASP", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class8_Sub1_Sub2_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(23) Image local23 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(28) MediaTracker local28 = new MediaTracker(arg1);
			local28.addImage(local23, 0);
			local28.waitForAll();
			this.anInt191 = local23.getWidth(arg1);
			this.anInt192 = local23.getHeight(arg1);
			this.anInt195 = this.anInt191;
			this.anInt196 = this.anInt192;
			this.anInt193 = 0;
			this.anInt194 = 0;
			this.anIntArray41 = new int[this.anInt191 * this.anInt192];
			@Pc(82) PixelGrabber local82 = new PixelGrabber(local23, 0, 0, this.anInt191, this.anInt192, this.anIntArray41, 0, this.anInt191);
			local82.grabPixels();
		} catch (@Pc(87) Exception local87) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!GPLGZASP", name = "<init>", descriptor = "(Lclient!AWEEREDT;Ljava/lang/String;I)V")
	public Class8_Sub1_Sub2_Sub1(@OriginalArg(0) Class2 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(37) Class8_Sub1_Sub3 local37 = new Class8_Sub1_Sub3(arg0.method14(arg1 + ".dat", null), 713);
		@Pc(46) Class8_Sub1_Sub3 local46 = new Class8_Sub1_Sub3(arg0.method14("index.dat", null), 713);
		local46.anInt239 = local37.method154();
		this.anInt195 = local46.method154();
		this.anInt196 = local46.method154();
		@Pc(61) int local61 = local46.method152();
		@Pc(64) int[] local64 = new int[local61];
		for (@Pc(66) int local66 = 0; local66 < local61 - 1; local66++) {
			local64[local66 + 1] = local46.method156();
			if (local64[local66 + 1] == 0) {
				local64[local66 + 1] = 1;
			}
		}
		for (@Pc(95) int local95 = 0; local95 < arg2; local95++) {
			local46.anInt239 += 2;
			local37.anInt239 += local46.method154() * local46.method154();
			local46.anInt239++;
		}
		this.anInt193 = local46.method152();
		this.anInt194 = local46.method152();
		this.anInt191 = local46.method154();
		this.anInt192 = local46.method154();
		@Pc(142) int local142 = local46.method152();
		@Pc(148) int local148 = this.anInt191 * this.anInt192;
		this.anIntArray41 = new int[local148];
		@Pc(156) int local156;
		if (local142 == 0) {
			for (local156 = 0; local156 < local148; local156++) {
				this.anIntArray41[local156] = local64[local37.method152()];
			}
		} else if (local142 == 1) {
			for (local156 = 0; local156 < this.anInt191; local156++) {
				for (@Pc(180) int local180 = 0; local180 < this.anInt192; local180++) {
					this.anIntArray41[local156 + local180 * this.anInt191] = local64[local37.method152()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!GPLGZASP", name = "c", descriptor = "(I)V")
	public void method112() {
		try {
			Class8_Sub1_Sub2.method545(this.anInt191, this.anInt192, this.anIntArray41);
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("83614, " + 0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GPLGZASP", name = "a", descriptor = "(IIII)V")
	public void method113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 < 0) {
				for (@Pc(8) int local8 = 0; local8 < this.anIntArray41.length; local8++) {
					@Pc(15) int local15 = this.anIntArray41[local8];
					if (local15 != 0) {
						@Pc(23) int local23 = local15 >> 16 & 0xFF;
						local23 += arg0;
						if (local23 < 1) {
							local23 = 1;
						} else if (local23 > 255) {
							local23 = 255;
						}
						@Pc(45) int local45 = local15 >> 8 & 0xFF;
						local45 += arg1;
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
						this.anIntArray41[local8] = (local23 << 16) + (local45 << 8) + local65;
					}
				}
			}
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("54692, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GPLGZASP", name = "a", descriptor = "(Z)V")
	public void method114() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt195 * this.anInt196];
			for (@Pc(10) int local10 = 0; local10 < this.anInt192; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt191; local14++) {
					local8[(local10 + this.anInt194) * this.anInt195 + local14 + this.anInt193] = this.anIntArray41[local10 * this.anInt191 + local14];
				}
			}
			this.anIntArray41 = local8;
			this.anInt191 = this.anInt195;
			this.anInt192 = this.anInt196;
			this.anInt193 = 0;
			this.anInt194 = 0;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("36638, " + true + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GPLGZASP", name = "a", descriptor = "(IZI)V")
	public void method115(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt193;
			arg1 += this.anInt194;
			@Pc(18) int local18 = arg0 + arg1 * Class8_Sub1_Sub2.anInt806;
			@Pc(20) int local20 = 0;
			@Pc(23) int local23 = this.anInt192;
			@Pc(26) int local26 = this.anInt191;
			@Pc(30) int local30 = Class8_Sub1_Sub2.anInt806 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg1 < Class8_Sub1_Sub2.anInt808) {
				local39 = Class8_Sub1_Sub2.anInt808 - arg1;
				local23 -= local39;
				arg1 = Class8_Sub1_Sub2.anInt808;
				local20 = local39 * local26 + 0;
				local18 += local39 * Class8_Sub1_Sub2.anInt806;
			}
			if (arg1 + local23 > Class8_Sub1_Sub2.anInt809) {
				local23 -= arg1 + local23 - Class8_Sub1_Sub2.anInt809;
			}
			if (arg0 < Class8_Sub1_Sub2.anInt810) {
				local39 = Class8_Sub1_Sub2.anInt810 - arg0;
				local26 -= local39;
				arg0 = Class8_Sub1_Sub2.anInt810;
				local20 += local39;
				local18 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg0 + local26 > Class8_Sub1_Sub2.anInt811) {
				local39 = arg0 + local26 - Class8_Sub1_Sub2.anInt811;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method116(Class8_Sub1_Sub2.anIntArray201, local26, local23, 668, local20, this.anIntArray41, local30, local32, local18);
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("3783, " + arg0 + ", " + false + ", " + arg1 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GPLGZASP", name = "a", descriptor = "([IIIII[IIII)V")
	private void method116(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(10) int local10 = -(arg1 >> 2);
			@Pc(15) int local15 = -(arg1 & 0x3);
			for (@Pc(18) int local18 = -arg2; local18 < 0; local18++) {
				for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
					arg0[arg8++] = arg5[arg4++];
					arg0[arg8++] = arg5[arg4++];
					arg0[arg8++] = arg5[arg4++];
					arg0[arg8++] = arg5[arg4++];
				}
				for (@Pc(61) int local61 = local15; local61 < 0; local61++) {
					arg0[arg8++] = arg5[arg4++];
				}
				arg8 += arg6;
				arg4 += arg7;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("20965, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GPLGZASP", name = "a", descriptor = "(III)V")
	public void method117(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt193;
			arg0 += this.anInt194;
			@Pc(26) int local26 = arg1 + arg0 * Class8_Sub1_Sub2.anInt806;
			@Pc(28) int local28 = 0;
			@Pc(31) int local31 = this.anInt192;
			@Pc(34) int local34 = this.anInt191;
			@Pc(38) int local38 = Class8_Sub1_Sub2.anInt806 - local34;
			@Pc(40) int local40 = 0;
			@Pc(47) int local47;
			if (arg0 < Class8_Sub1_Sub2.anInt808) {
				local47 = Class8_Sub1_Sub2.anInt808 - arg0;
				local31 -= local47;
				arg0 = Class8_Sub1_Sub2.anInt808;
				local28 = local47 * local34 + 0;
				local26 += local47 * Class8_Sub1_Sub2.anInt806;
			}
			if (arg0 + local31 > Class8_Sub1_Sub2.anInt809) {
				local31 -= arg0 + local31 - Class8_Sub1_Sub2.anInt809;
			}
			if (arg1 < Class8_Sub1_Sub2.anInt810) {
				local47 = Class8_Sub1_Sub2.anInt810 - arg1;
				local34 -= local47;
				arg1 = Class8_Sub1_Sub2.anInt810;
				local28 += local47;
				local26 += local47;
				local40 = local47 + 0;
				local38 += local47;
			}
			if (arg1 + local34 > Class8_Sub1_Sub2.anInt811) {
				local47 = arg1 + local34 - Class8_Sub1_Sub2.anInt811;
				local34 -= local47;
				local40 += local47;
				local38 += local47;
			}
			if (local34 > 0 && local31 > 0) {
				this.method118(Class8_Sub1_Sub2.anIntArray201, this.anIntArray41, local28, local26, local34, local31, local38, local40);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("45764, " + -40219 + ", " + arg0 + ", " + arg1 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GPLGZASP", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method118(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!GPLGZASP", name = "a", descriptor = "(IIIZ)V")
	public void method119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		try {
			arg1 += this.anInt193;
			arg0 += this.anInt194;
			if (arg2) {
				this.anInt189 = 452;
			}
			@Pc(20) int local20 = arg1 + arg0 * Class8_Sub1_Sub2.anInt806;
			@Pc(22) int local22 = 0;
			@Pc(25) int local25 = this.anInt192;
			@Pc(28) int local28 = this.anInt191;
			@Pc(32) int local32 = Class8_Sub1_Sub2.anInt806 - local28;
			@Pc(34) int local34 = 0;
			@Pc(41) int local41;
			if (arg0 < Class8_Sub1_Sub2.anInt808) {
				local41 = Class8_Sub1_Sub2.anInt808 - arg0;
				local25 -= local41;
				arg0 = Class8_Sub1_Sub2.anInt808;
				local22 = local41 * local28 + 0;
				local20 += local41 * Class8_Sub1_Sub2.anInt806;
			}
			if (arg0 + local25 > Class8_Sub1_Sub2.anInt809) {
				local25 -= arg0 + local25 - Class8_Sub1_Sub2.anInt809;
			}
			if (arg1 < Class8_Sub1_Sub2.anInt810) {
				local41 = Class8_Sub1_Sub2.anInt810 - arg1;
				local28 -= local41;
				arg1 = Class8_Sub1_Sub2.anInt810;
				local22 += local41;
				local20 += local41;
				local34 = local41 + 0;
				local32 += local41;
			}
			if (arg1 + local28 > Class8_Sub1_Sub2.anInt811) {
				local41 = arg1 + local28 - Class8_Sub1_Sub2.anInt811;
				local28 -= local41;
				local34 += local41;
				local32 += local41;
			}
			if (local28 > 0 && local25 > 0) {
				this.method120(local20, local25, local34, local28, local22, local32, Class8_Sub1_Sub2.anIntArray201, this.anIntArray41, 0, (byte) 1);
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("1468, " + arg0 + ", " + arg1 + ", " + 128 + ", " + arg2 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GPLGZASP", name = "a", descriptor = "(IIIIIII[I[IIB)V")
	private void method120(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte arg9) {
		try {
			for (@Pc(8) int local8 = -arg1; local8 < 0; local8++) {
				for (@Pc(13) int local13 = -arg3; local13 < 0; local13++) {
					@Pc(20) int local20 = arg7[arg4++];
					if (local20 == 0) {
						arg0++;
					} else {
						@Pc(26) int local26 = arg6[arg0];
						arg6[arg0++] = ((local20 & 0xFF00FF) * 128 + (local26 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local20 & 0xFF00) * 128 + (local26 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg0 += arg5;
				arg4 += arg2;
			}
			@Pc(81) boolean local81 = false;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("72683, " + arg0 + ", " + 128 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GPLGZASP", name = "a", descriptor = "(III[II[IIIIII)V")
	public void method121(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(15) int local15 = -arg5 / 2;
				@Pc(20) int local20 = -arg6 / 2;
				@Pc(29) int local29 = (int) (Math.sin((double) arg9 / 326.11D) * 65536.0D);
				@Pc(38) int local38 = (int) (Math.cos((double) arg9 / 326.11D) * 65536.0D);
				@Pc(44) int local44 = local29 * arg1 >> 8;
				@Pc(50) int local50 = local38 * arg1 >> 8;
				@Pc(62) int local62 = (arg7 << 16) + local20 * local44 + local15 * local50;
				@Pc(74) int local74 = (arg8 << 16) + (local20 * local50 - local15 * local44);
				@Pc(80) int local80 = arg0 + arg3 * Class8_Sub1_Sub2.anInt806;
				for (@Pc(82) int local82 = 0; local82 < arg6; local82++) {
					@Pc(88) int local88 = arg4[local82];
					@Pc(92) int local92 = local80 + local88;
					@Pc(98) int local98 = local62 + local50 * local88;
					@Pc(104) int local104 = local74 - local44 * local88;
					for (@Pc(109) int local109 = -arg2[local82]; local109 < 0; local109++) {
						Class8_Sub1_Sub2.anIntArray201[local92++] = this.anIntArray41[(local98 >> 16) + (local104 >> 16) * this.anInt191];
						local98 += local50;
						local104 -= local44;
					}
					local62 += local44;
					local74 += local50;
					local80 += Class8_Sub1_Sub2.anInt806;
				}
			} catch (@Pc(157) Exception local157) {
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("8870, " + arg0 + ", " + 235 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GPLGZASP", name = "a", descriptor = "(IIIIZIDII)V")
	public void method122(@OriginalArg(4) boolean arg0, @OriginalArg(5) int arg1, @OriginalArg(6) double arg2, @OriginalArg(8) int arg3) {
		try {
			if (arg0) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			try {
				@Pc(26) int local26 = (int) (Math.sin(arg2) * 65536.0D);
				@Pc(32) int local32 = (int) (Math.cos(arg2) * 65536.0D);
				@Pc(38) int local38 = local26 * 256 >> 8;
				@Pc(44) int local44 = local32 * 256 >> 8;
				@Pc(56) int local56 = local38 * -10 + local44 * -10 + 983040;
				@Pc(68) int local68 = local44 * -10 + 983040 - local38 * -10;
				@Pc(74) int local74 = arg1 + arg3 * Class8_Sub1_Sub2.anInt806;
				for (@Pc(76) int local76 = 0; local76 < 20; local76++) {
					@Pc(80) int local80 = local74;
					@Pc(82) int local82 = local56;
					@Pc(84) int local84 = local68;
					for (@Pc(87) int local87 = -20; local87 < 0; local87++) {
						@Pc(103) int local103 = this.anIntArray41[(local82 >> 16) + (local84 >> 16) * this.anInt191];
						if (local103 == 0) {
							local80++;
						} else {
							Class8_Sub1_Sub2.anIntArray201[local80++] = local103;
						}
						local82 += local44;
						local84 -= local38;
					}
					local56 += local38;
					local68 += local44;
					local74 += Class8_Sub1_Sub2.anInt806;
				}
			} catch (@Pc(142) Exception local142) {
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("48147, " + 256 + ", " + 15 + ", " + 20 + ", " + 20 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 15 + ", " + arg3 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GPLGZASP", name = "a", descriptor = "(IBILclient!SFVBUBEZ;)V")
	public void method123(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class8_Sub1_Sub2_Sub2 arg2) {
		try {
			arg0 += this.anInt193;
			arg1 += this.anInt194;
			@Pc(15) int local15 = arg0 + arg1 * Class8_Sub1_Sub2.anInt806;
			@Pc(17) int local17 = 0;
			@Pc(24) int local24 = this.anInt192;
			@Pc(27) int local27 = this.anInt191;
			@Pc(31) int local31 = Class8_Sub1_Sub2.anInt806 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg1 < Class8_Sub1_Sub2.anInt808) {
				local40 = Class8_Sub1_Sub2.anInt808 - arg1;
				local24 -= local40;
				arg1 = Class8_Sub1_Sub2.anInt808;
				local17 = local40 * local27 + 0;
				local15 += local40 * Class8_Sub1_Sub2.anInt806;
			}
			if (arg1 + local24 > Class8_Sub1_Sub2.anInt809) {
				local24 -= arg1 + local24 - Class8_Sub1_Sub2.anInt809;
			}
			if (arg0 < Class8_Sub1_Sub2.anInt810) {
				local40 = Class8_Sub1_Sub2.anInt810 - arg0;
				local27 -= local40;
				arg0 = Class8_Sub1_Sub2.anInt810;
				local17 += local40;
				local15 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg0 + local27 > Class8_Sub1_Sub2.anInt811) {
				local40 = arg0 + local27 - Class8_Sub1_Sub2.anInt811;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method124(local27, local17, local15, local33, local31, this.anIntArray41, Class8_Sub1_Sub2.anIntArray201, local24, arg2.aByteArray19, 0);
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("54740, " + arg0 + ", " + 52 + ", " + arg1 + ", " + arg2 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GPLGZASP", name = "a", descriptor = "(IIIII[II[II[BI)V")
	private void method124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(16) int local16 = -(arg0 >> 2);
			@Pc(21) int local21 = -(arg0 & 0x3);
			for (@Pc(24) int local24 = -arg7; local24 < 0; local24++) {
				@Pc(35) int local35;
				for (@Pc(28) int local28 = local16; local28 < 0; local28++) {
					local35 = arg5[arg1++];
					if (local35 != 0 && arg8[arg2] == 0) {
						arg6[arg2++] = local35;
					} else {
						arg2++;
					}
					local35 = arg5[arg1++];
					if (local35 != 0 && arg8[arg2] == 0) {
						arg6[arg2++] = local35;
					} else {
						arg2++;
					}
					local35 = arg5[arg1++];
					if (local35 != 0 && arg8[arg2] == 0) {
						arg6[arg2++] = local35;
					} else {
						arg2++;
					}
					local35 = arg5[arg1++];
					if (local35 != 0 && arg8[arg2] == 0) {
						arg6[arg2++] = local35;
					} else {
						arg2++;
					}
				}
				for (@Pc(111) int local111 = local21; local111 < 0; local111++) {
					local35 = arg5[arg1++];
					if (local35 != 0 && arg8[arg2] == 0) {
						arg6[arg2++] = local35;
					} else {
						arg2++;
					}
				}
				arg2 += arg4;
				arg1 += arg3;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("77676, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -16955 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}
}
