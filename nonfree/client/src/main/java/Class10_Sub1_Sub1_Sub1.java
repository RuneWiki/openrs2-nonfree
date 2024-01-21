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

@OriginalClass("client!EPQDEJTO")
public final class Class10_Sub1_Sub1_Sub1 extends Class10_Sub1_Sub1 {

	@OriginalMember(owner = "client!EPQDEJTO", name = "w", descriptor = "I")
	private int anInt98 = -235;

	@OriginalMember(owner = "client!EPQDEJTO", name = "x", descriptor = "Z")
	private boolean aBoolean27 = true;

	@OriginalMember(owner = "client!EPQDEJTO", name = "y", descriptor = "B")
	private byte aByte8 = 5;

	@OriginalMember(owner = "client!EPQDEJTO", name = "z", descriptor = "I")
	private int anInt99 = -3539;

	@OriginalMember(owner = "client!EPQDEJTO", name = "A", descriptor = "I")
	private int anInt100 = -766;

	@OriginalMember(owner = "client!EPQDEJTO", name = "B", descriptor = "I")
	private int anInt101 = -766;

	@OriginalMember(owner = "client!EPQDEJTO", name = "C", descriptor = "I")
	private int anInt102 = 1;

	@OriginalMember(owner = "client!EPQDEJTO", name = "D", descriptor = "Z")
	private boolean aBoolean28 = true;

	@OriginalMember(owner = "client!EPQDEJTO", name = "E", descriptor = "Z")
	private boolean aBoolean29 = false;

	@OriginalMember(owner = "client!EPQDEJTO", name = "F", descriptor = "Z")
	private boolean aBoolean30 = false;

	@OriginalMember(owner = "client!EPQDEJTO", name = "G", descriptor = "Z")
	private boolean aBoolean31 = true;

	@OriginalMember(owner = "client!EPQDEJTO", name = "H", descriptor = "I")
	private int anInt103 = 3600;

	@OriginalMember(owner = "client!EPQDEJTO", name = "I", descriptor = "[I")
	public int[] anIntArray37;

	@OriginalMember(owner = "client!EPQDEJTO", name = "N", descriptor = "I")
	public int anInt108;

	@OriginalMember(owner = "client!EPQDEJTO", name = "J", descriptor = "I")
	public int anInt104;

	@OriginalMember(owner = "client!EPQDEJTO", name = "O", descriptor = "I")
	public int anInt109;

	@OriginalMember(owner = "client!EPQDEJTO", name = "K", descriptor = "I")
	public int anInt105;

	@OriginalMember(owner = "client!EPQDEJTO", name = "M", descriptor = "I")
	private int anInt107;

	@OriginalMember(owner = "client!EPQDEJTO", name = "L", descriptor = "I")
	private int anInt106;

	@OriginalMember(owner = "client!EPQDEJTO", name = "<init>", descriptor = "(II)V")
	public Class10_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray37 = new int[arg0 * arg1];
		this.anInt104 = this.anInt108 = arg0;
		this.anInt105 = this.anInt109 = arg1;
		this.anInt106 = this.anInt107 = 0;
	}

	@OriginalMember(owner = "client!EPQDEJTO", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class10_Sub1_Sub1_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(41) Image local41 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(46) MediaTracker local46 = new MediaTracker(arg1);
			local46.addImage(local41, 0);
			local46.waitForAll();
			this.anInt104 = local41.getWidth(arg1);
			this.anInt105 = local41.getHeight(arg1);
			this.anInt108 = this.anInt104;
			this.anInt109 = this.anInt105;
			this.anInt106 = 0;
			this.anInt107 = 0;
			this.anIntArray37 = new int[this.anInt104 * this.anInt105];
			@Pc(100) PixelGrabber local100 = new PixelGrabber(local41, 0, 0, this.anInt104, this.anInt105, this.anIntArray37, 0, this.anInt104);
			local100.grabPixels();
		} catch (@Pc(105) Exception local105) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!EPQDEJTO", name = "<init>", descriptor = "(Lclient!ATJMVOZR;Ljava/lang/String;I)V")
	public Class10_Sub1_Sub1_Sub1(@OriginalArg(0) Class2 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(55) Class10_Sub1_Sub3 local55 = new Class10_Sub1_Sub3(true, arg0.method2(arg1 + ".dat", null));
		@Pc(64) Class10_Sub1_Sub3 local64 = new Class10_Sub1_Sub3(true, arg0.method2("index.dat", null));
		local64.anInt428 = local55.method313();
		this.anInt108 = local64.method313();
		this.anInt109 = local64.method313();
		@Pc(79) int local79 = local64.method311();
		@Pc(82) int[] local82 = new int[local79];
		for (@Pc(84) int local84 = 0; local84 < local79 - 1; local84++) {
			local82[local84 + 1] = local64.method315();
			if (local82[local84 + 1] == 0) {
				local82[local84 + 1] = 1;
			}
		}
		for (@Pc(119) int local119 = 0; local119 < arg2; local119++) {
			local64.anInt428 += 2;
			local55.anInt428 += local64.method313() * local64.method313();
			local64.anInt428++;
		}
		this.anInt106 = local64.method311();
		this.anInt107 = local64.method311();
		this.anInt104 = local64.method313();
		this.anInt105 = local64.method313();
		@Pc(166) int local166 = local64.method311();
		@Pc(172) int local172 = this.anInt104 * this.anInt105;
		this.anIntArray37 = new int[local172];
		@Pc(180) int local180;
		if (local166 == 0) {
			for (local180 = 0; local180 < local172; local180++) {
				this.anIntArray37[local180] = local82[local55.method311()];
			}
		} else if (local166 == 1) {
			for (local180 = 0; local180 < this.anInt104; local180++) {
				for (@Pc(204) int local204 = 0; local204 < this.anInt105; local204++) {
					this.anIntArray37[local180 + local204 * this.anInt104] = local82[local55.method311()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!EPQDEJTO", name = "a", descriptor = "(Z)V")
	public void method73() {
		try {
			Class10_Sub1_Sub1.method494(this.aBoolean31, this.anInt104, this.anInt105, this.anIntArray37);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("36129, " + false + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPQDEJTO", name = "a", descriptor = "(IIII)V")
	public void method74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray37.length; local3++) {
				@Pc(10) int local10 = this.anIntArray37[local3];
				if (local10 != 0) {
					@Pc(18) int local18 = local10 >> 16 & 0xFF;
					local18 += arg2;
					if (local18 < 1) {
						local18 = 1;
					} else if (local18 > 255) {
						local18 = 255;
					}
					@Pc(40) int local40 = local10 >> 8 & 0xFF;
					local40 += arg1;
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
					this.anIntArray37[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
			if (this.anInt98 != -235) {
				this.aBoolean31 = !this.aBoolean31;
			}
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("43992, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -235 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPQDEJTO", name = "b", descriptor = "(I)V")
	public void method75() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt108 * this.anInt109];
			for (@Pc(10) int local10 = 0; local10 < this.anInt105; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt104; local14++) {
					local8[(local10 + this.anInt107) * this.anInt108 + local14 + this.anInt106] = this.anIntArray37[local10 * this.anInt104 + local14];
				}
			}
			this.anIntArray37 = local8;
			this.anInt104 = this.anInt108;
			this.anInt105 = this.anInt109;
			this.anInt106 = 0;
			this.anInt107 = 0;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("81290, " + 1790 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPQDEJTO", name = "a", descriptor = "(III)V")
	public void method76(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt106;
			arg0 += this.anInt107;
			@Pc(15) int local15 = arg1 + arg0 * Class10_Sub1_Sub1.anInt674;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt105;
			@Pc(23) int local23 = this.anInt104;
			@Pc(27) int local27 = Class10_Sub1_Sub1.anInt674 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg0 < Class10_Sub1_Sub1.anInt676) {
				local36 = Class10_Sub1_Sub1.anInt676 - arg0;
				local20 -= local36;
				arg0 = Class10_Sub1_Sub1.anInt676;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class10_Sub1_Sub1.anInt674;
			}
			if (arg0 + local20 > Class10_Sub1_Sub1.anInt677) {
				local20 -= arg0 + local20 - Class10_Sub1_Sub1.anInt677;
			}
			if (arg1 < Class10_Sub1_Sub1.anInt678) {
				local36 = Class10_Sub1_Sub1.anInt678 - arg1;
				local23 -= local36;
				arg1 = Class10_Sub1_Sub1.anInt678;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg1 + local23 > Class10_Sub1_Sub1.anInt679) {
				local36 = arg1 + local23 - Class10_Sub1_Sub1.anInt679;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method77(local23, local27, local20, this.anIntArray37, local17, local29, local15, Class10_Sub1_Sub1.anIntArray178);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("71094, " + arg0 + ", " + -192 + ", " + arg1 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPQDEJTO", name = "a", descriptor = "(III[IIIIB[I)V")
	private void method77(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int[] arg7) {
		try {
			@Pc(6) int local6 = -(arg0 >> 2);
			@Pc(17) int local17 = -(arg0 & 0x3);
			for (@Pc(20) int local20 = -arg2; local20 < 0; local20++) {
				for (@Pc(24) int local24 = local6; local24 < 0; local24++) {
					arg7[arg6++] = arg3[arg4++];
					arg7[arg6++] = arg3[arg4++];
					arg7[arg6++] = arg3[arg4++];
					arg7[arg6++] = arg3[arg4++];
				}
				for (@Pc(63) int local63 = local17; local63 < 0; local63++) {
					arg7[arg6++] = arg3[arg4++];
				}
				arg6 += arg1;
				arg4 += arg5;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("73293, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + -39 + ", " + arg7 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPQDEJTO", name = "b", descriptor = "(III)V")
	public void method78(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg1 += this.anInt106;
			arg0 += this.anInt107;
			@Pc(18) int local18 = arg1 + arg0 * Class10_Sub1_Sub1.anInt674;
			@Pc(20) int local20 = 0;
			@Pc(23) int local23 = this.anInt105;
			@Pc(26) int local26 = this.anInt104;
			@Pc(30) int local30 = Class10_Sub1_Sub1.anInt674 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg0 < Class10_Sub1_Sub1.anInt676) {
				local39 = Class10_Sub1_Sub1.anInt676 - arg0;
				local23 -= local39;
				arg0 = Class10_Sub1_Sub1.anInt676;
				local20 = local39 * local26 + 0;
				local18 += local39 * Class10_Sub1_Sub1.anInt674;
			}
			if (arg0 + local23 > Class10_Sub1_Sub1.anInt677) {
				local23 -= arg0 + local23 - Class10_Sub1_Sub1.anInt677;
			}
			if (arg1 < Class10_Sub1_Sub1.anInt678) {
				local39 = Class10_Sub1_Sub1.anInt678 - arg1;
				local26 -= local39;
				arg1 = Class10_Sub1_Sub1.anInt678;
				local20 += local39;
				local18 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg1 + local26 > Class10_Sub1_Sub1.anInt679) {
				local39 = arg1 + local26 - Class10_Sub1_Sub1.anInt679;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method79(Class10_Sub1_Sub1.anIntArray178, this.anIntArray37, local20, local18, local26, local23, local30, local32);
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("82148, " + arg0 + ", " + arg1 + ", " + -488 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPQDEJTO", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method79(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!EPQDEJTO", name = "b", descriptor = "(IIII)V")
	public void method80(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt106;
			arg1 += this.anInt107;
			@Pc(15) int local15 = arg0 + arg1 * Class10_Sub1_Sub1.anInt674;
			@Pc(17) int local17 = 0;
			@Pc(23) int local23 = this.anInt105;
			@Pc(26) int local26 = this.anInt104;
			@Pc(30) int local30 = Class10_Sub1_Sub1.anInt674 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg1 < Class10_Sub1_Sub1.anInt676) {
				local39 = Class10_Sub1_Sub1.anInt676 - arg1;
				local23 -= local39;
				arg1 = Class10_Sub1_Sub1.anInt676;
				local17 = local39 * local26 + 0;
				local15 += local39 * Class10_Sub1_Sub1.anInt674;
			}
			if (arg1 + local23 > Class10_Sub1_Sub1.anInt677) {
				local23 -= arg1 + local23 - Class10_Sub1_Sub1.anInt677;
			}
			if (arg0 < Class10_Sub1_Sub1.anInt678) {
				local39 = Class10_Sub1_Sub1.anInt678 - arg0;
				local26 -= local39;
				arg0 = Class10_Sub1_Sub1.anInt678;
				local17 += local39;
				local15 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg0 + local26 > Class10_Sub1_Sub1.anInt679) {
				local39 = arg0 + local26 - Class10_Sub1_Sub1.anInt679;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method81(local26, local32, 0, local30, local17, this.anInt100, local15, local23, Class10_Sub1_Sub1.anIntArray178, this.anIntArray37);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("57053, " + 0 + ", " + arg0 + ", " + arg1 + ", " + 128 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPQDEJTO", name = "a", descriptor = "(IIIIIIIII[I[I)V")
	private void method81(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int[] arg9) {
		try {
			for (@Pc(8) int local8 = -arg7; local8 < 0; local8++) {
				for (@Pc(13) int local13 = -arg0; local13 < 0; local13++) {
					@Pc(20) int local20 = arg9[arg4++];
					if (local20 == 0) {
						arg6++;
					} else {
						@Pc(26) int local26 = arg8[arg6];
						arg8[arg6++] = ((local20 & 0xFF00FF) * 128 + (local26 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local20 & 0xFF00) * 128 + (local26 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg6 += arg3;
				arg4 += arg1;
			}
			if (arg5 >= 0) {
				this.aBoolean27 = !this.aBoolean27;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("92686, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 128 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPQDEJTO", name = "a", descriptor = "(IIIII[IIII[II)V")
	public void method82(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(5) boolean local5 = false;
			try {
				@Pc(10) int local10 = -arg4 / 2;
				@Pc(15) int local15 = -arg2 / 2;
				@Pc(24) int local24 = (int) (Math.sin((double) arg7 / 326.11D) * 65536.0D);
				@Pc(33) int local33 = (int) (Math.cos((double) arg7 / 326.11D) * 65536.0D);
				@Pc(39) int local39 = local24 * arg8 >> 8;
				@Pc(45) int local45 = local33 * arg8 >> 8;
				@Pc(57) int local57 = (arg3 << 16) + local15 * local39 + local10 * local45;
				@Pc(69) int local69 = (arg10 << 16) + (local15 * local45 - local10 * local39);
				@Pc(75) int local75 = arg6 + arg0 * Class10_Sub1_Sub1.anInt674;
				for (@Pc(77) int local77 = 0; local77 < arg2; local77++) {
					@Pc(83) int local83 = arg9[local77];
					@Pc(87) int local87 = local75 + local83;
					@Pc(93) int local93 = local57 + local45 * local83;
					@Pc(99) int local99 = local69 - local39 * local83;
					for (@Pc(104) int local104 = -arg5[local77]; local104 < 0; local104++) {
						Class10_Sub1_Sub1.anIntArray178[local87++] = this.anIntArray37[(local93 >> 16) + (local99 >> 16) * this.anInt104];
						local93 += local45;
						local99 -= local39;
					}
					local57 += local39;
					local69 += local45;
					local75 += Class10_Sub1_Sub1.anInt674;
				}
			} catch (@Pc(152) Exception local152) {
			}
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("77040, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPQDEJTO", name = "a", descriptor = "(IIIIIIIDI)V")
	public void method83(@OriginalArg(2) int arg0, @OriginalArg(5) int arg1, @OriginalArg(7) double arg2, @OriginalArg(8) int arg3) {
		try {
			if (arg1 == -30658) {
				try {
					@Pc(21) int local21 = (int) (Math.sin(arg2) * 65536.0D);
					@Pc(27) int local27 = (int) (Math.cos(arg2) * 65536.0D);
					@Pc(33) int local33 = local21 * 256 >> 8;
					@Pc(39) int local39 = local27 * 256 >> 8;
					@Pc(51) int local51 = local33 * -10 + local39 * -10 + 983040;
					@Pc(63) int local63 = local39 * -10 + 983040 - local33 * -10;
					@Pc(69) int local69 = arg0 + arg3 * Class10_Sub1_Sub1.anInt674;
					for (@Pc(71) int local71 = 0; local71 < 20; local71++) {
						@Pc(75) int local75 = local69;
						@Pc(77) int local77 = local51;
						@Pc(79) int local79 = local63;
						for (@Pc(82) int local82 = -20; local82 < 0; local82++) {
							@Pc(98) int local98 = this.anIntArray37[(local77 >> 16) + (local79 >> 16) * this.anInt104];
							if (local98 == 0) {
								local75++;
							} else {
								Class10_Sub1_Sub1.anIntArray178[local75++] = local98;
							}
							local77 += local39;
							local79 -= local33;
						}
						local51 += local33;
						local63 += local39;
						local69 += Class10_Sub1_Sub1.anInt674;
					}
				} catch (@Pc(137) Exception local137) {
				}
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("73715, " + 256 + ", " + 15 + ", " + arg0 + ", " + 15 + ", " + 20 + ", " + arg1 + ", " + 20 + ", " + arg2 + ", " + arg3 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPQDEJTO", name = "a", descriptor = "(Lclient!WRRBQEHV;III)V")
	public void method84(@OriginalArg(0) Class10_Sub1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			arg2 += this.anInt106;
			arg1 += this.anInt107;
			@Pc(19) int local19 = arg2 + arg1 * Class10_Sub1_Sub1.anInt674;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt105;
			@Pc(27) int local27 = this.anInt104;
			@Pc(31) int local31 = Class10_Sub1_Sub1.anInt674 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg1 < Class10_Sub1_Sub1.anInt676) {
				local40 = Class10_Sub1_Sub1.anInt676 - arg1;
				local24 -= local40;
				arg1 = Class10_Sub1_Sub1.anInt676;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class10_Sub1_Sub1.anInt674;
			}
			if (arg1 + local24 > Class10_Sub1_Sub1.anInt677) {
				local24 -= arg1 + local24 - Class10_Sub1_Sub1.anInt677;
			}
			if (arg2 < Class10_Sub1_Sub1.anInt678) {
				local40 = Class10_Sub1_Sub1.anInt678 - arg2;
				local27 -= local40;
				arg2 = Class10_Sub1_Sub1.anInt678;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg2 + local27 > Class10_Sub1_Sub1.anInt679) {
				local40 = arg2 + local27 - Class10_Sub1_Sub1.anInt679;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method85(local19, local31, this.anIntArray37, local27, Class10_Sub1_Sub1.anIntArray178, arg0.aByteArray16, local24, local21, 0, local33);
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("61194, " + arg0 + ", " + arg1 + ", " + -49993 + ", " + arg2 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPQDEJTO", name = "a", descriptor = "(II[II[I[BIIIII)V")
	private void method85(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(6) int local6 = -(arg3 >> 2);
			@Pc(22) int local22 = -(arg3 & 0x3);
			for (@Pc(25) int local25 = -arg6; local25 < 0; local25++) {
				@Pc(36) int local36;
				for (@Pc(29) int local29 = local6; local29 < 0; local29++) {
					local36 = arg2[arg7++];
					if (local36 != 0 && arg5[arg0] == 0) {
						arg4[arg0++] = local36;
					} else {
						arg0++;
					}
					local36 = arg2[arg7++];
					if (local36 != 0 && arg5[arg0] == 0) {
						arg4[arg0++] = local36;
					} else {
						arg0++;
					}
					local36 = arg2[arg7++];
					if (local36 != 0 && arg5[arg0] == 0) {
						arg4[arg0++] = local36;
					} else {
						arg0++;
					}
					local36 = arg2[arg7++];
					if (local36 != 0 && arg5[arg0] == 0) {
						arg4[arg0++] = local36;
					} else {
						arg0++;
					}
				}
				for (@Pc(112) int local112 = local22; local112 < 0; local112++) {
					local36 = arg2[arg7++];
					if (local36 != 0 && arg5[arg0] == 0) {
						arg4[arg0++] = local36;
					} else {
						arg0++;
					}
				}
				arg0 += arg1;
				arg7 += arg9;
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("75394, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 40303 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}
}
