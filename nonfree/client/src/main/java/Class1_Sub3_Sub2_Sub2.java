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

@OriginalClass("client!hb")
public final class Class1_Sub3_Sub2_Sub2 extends Class1_Sub3_Sub2 {

	@OriginalMember(owner = "client!hb", name = "w", descriptor = "B")
	private static byte aByte36 = 4;

	@OriginalMember(owner = "client!hb", name = "y", descriptor = "I")
	private int anInt449;

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "Z")
	private boolean aBoolean109 = false;

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "Z")
	private boolean aBoolean110 = true;

	@OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
	private int anInt450 = 5;

	@OriginalMember(owner = "client!hb", name = "B", descriptor = "[I")
	public int[] anIntArray148;

	@OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
	public int anInt455;

	@OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
	public int anInt451;

	@OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
	public int anInt456;

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
	public int anInt452;

	@OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
	private int anInt454;

	@OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
	private int anInt453;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(II)V")
	public Class1_Sub3_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray148 = new int[arg0 * arg1];
		this.anInt451 = this.anInt455 = arg0;
		this.anInt452 = this.anInt456 = arg1;
		this.anInt453 = this.anInt454 = 0;
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub3_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(14) Image local14 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(19) MediaTracker local19 = new MediaTracker(arg1);
			local19.addImage(local14, 0);
			local19.waitForAll();
			this.anInt451 = local14.getWidth(arg1);
			this.anInt452 = local14.getHeight(arg1);
			this.anInt455 = this.anInt451;
			this.anInt456 = this.anInt452;
			this.anInt453 = 0;
			this.anInt454 = 0;
			this.anIntArray148 = new int[this.anInt451 * this.anInt452];
			@Pc(73) PixelGrabber local73 = new PixelGrabber(local14, 0, 0, this.anInt451, this.anInt452, this.anIntArray148, 0, this.anInt451);
			local73.grabPixels();
		} catch (@Pc(78) Exception local78) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!ub;Ljava/lang/String;I)V")
	public Class1_Sub3_Sub2_Sub2(@OriginalArg(0) Class39 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(29) Class1_Sub3_Sub3 local29 = new Class1_Sub3_Sub3(arg0.method528(aByte36, arg1 + ".dat", null), 0);
		@Pc(39) Class1_Sub3_Sub3 local39 = new Class1_Sub3_Sub3(arg0.method528(aByte36, "index.dat", null), 0);
		local39.anInt548 = local29.method385();
		this.anInt455 = local39.method385();
		this.anInt456 = local39.method385();
		@Pc(54) int local54 = local39.method383();
		@Pc(57) int[] local57 = new int[local54];
		for (@Pc(59) int local59 = 0; local59 < local54 - 1; local59++) {
			local57[local59 + 1] = local39.method387();
			if (local57[local59 + 1] == 0) {
				local57[local59 + 1] = 1;
			}
		}
		for (@Pc(88) int local88 = 0; local88 < arg2; local88++) {
			local39.anInt548 += 2;
			local29.anInt548 += local39.method385() * local39.method385();
			local39.anInt548++;
		}
		this.anInt453 = local39.method383();
		this.anInt454 = local39.method383();
		this.anInt451 = local39.method385();
		this.anInt452 = local39.method385();
		@Pc(135) int local135 = local39.method383();
		@Pc(141) int local141 = this.anInt451 * this.anInt452;
		this.anIntArray148 = new int[local141];
		@Pc(149) int local149;
		if (local135 == 0) {
			for (local149 = 0; local149 < local141; local149++) {
				this.anIntArray148[local149] = local57[local29.method383()];
			}
		} else if (local135 == 1) {
			for (local149 = 0; local149 < this.anInt451; local149++) {
				for (@Pc(173) int local173 = 0; local173 < this.anInt452; local173++) {
					this.anIntArray148[local149 + local173 * this.anInt451] = local57[local29.method383()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public void method316() {
		try {
			Class1_Sub3_Sub2.method350(this.anIntArray148, this.anInt451, this.anInt452, (byte) 6);
			if (this.anInt449 != 0) {
				this.anInt450 = -430;
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("94763, " + 0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIZ)V")
	public void method317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg1 += this.anInt453;
			arg0 += this.anInt454;
			@Pc(15) int local15 = arg1 + arg0 * Class1_Sub3_Sub2.anInt516;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt452;
			@Pc(23) int local23 = this.anInt451;
			@Pc(27) int local27 = Class1_Sub3_Sub2.anInt516 - local23;
			@Pc(29) int local29 = 0;
			@Pc(41) int local41;
			if (arg0 < Class1_Sub3_Sub2.anInt518) {
				local41 = Class1_Sub3_Sub2.anInt518 - arg0;
				local20 -= local41;
				arg0 = Class1_Sub3_Sub2.anInt518;
				local17 = local41 * local23 + 0;
				local15 += local41 * Class1_Sub3_Sub2.anInt516;
			}
			if (arg0 + local20 > Class1_Sub3_Sub2.anInt519) {
				local20 -= arg0 + local20 - Class1_Sub3_Sub2.anInt519;
			}
			if (arg1 < Class1_Sub3_Sub2.anInt520) {
				local41 = Class1_Sub3_Sub2.anInt520 - arg1;
				local23 -= local41;
				arg1 = Class1_Sub3_Sub2.anInt520;
				local17 += local41;
				local15 += local41;
				local29 = local41 + 0;
				local27 += local41;
			}
			if (arg1 + local23 > Class1_Sub3_Sub2.anInt521) {
				local41 = arg1 + local23 - Class1_Sub3_Sub2.anInt521;
				local23 -= local41;
				local29 += local41;
				local27 += local41;
			}
			if (local23 > 0 && local20 > 0) {
				this.method318(local20, local29, local27, local15, (byte) 5, this.anIntArray148, local17, Class1_Sub3_Sub2.anIntArray178, local23);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("69143, " + arg0 + ", " + arg1 + ", " + true + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIB[II[II)V")
	private void method318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8) {
		try {
			@Pc(6) int local6 = -(arg8 >> 2);
			@Pc(11) int local11 = -(arg8 & 0x3);
			for (@Pc(14) int local14 = -arg0; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					arg7[arg3++] = arg5[arg6++];
					arg7[arg3++] = arg5[arg6++];
					arg7[arg3++] = arg5[arg6++];
					arg7[arg3++] = arg5[arg6++];
				}
				for (@Pc(57) int local57 = local11; local57 < 0; local57++) {
					arg7[arg3++] = arg5[arg6++];
				}
				arg3 += arg2;
				arg6 += arg1;
			}
			@Pc(86) boolean local86 = false;
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("88217, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZI)V")
	public void method319(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt453;
			arg0 += this.anInt454;
			@Pc(15) int local15 = arg1 + arg0 * Class1_Sub3_Sub2.anInt516;
			@Pc(17) int local17 = 0;
			@Pc(23) int local23 = this.anInt452;
			@Pc(26) int local26 = this.anInt451;
			@Pc(30) int local30 = Class1_Sub3_Sub2.anInt516 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg0 < Class1_Sub3_Sub2.anInt518) {
				local39 = Class1_Sub3_Sub2.anInt518 - arg0;
				local23 -= local39;
				arg0 = Class1_Sub3_Sub2.anInt518;
				local17 = local39 * local26 + 0;
				local15 += local39 * Class1_Sub3_Sub2.anInt516;
			}
			if (arg0 + local23 > Class1_Sub3_Sub2.anInt519) {
				local23 -= arg0 + local23 - Class1_Sub3_Sub2.anInt519;
			}
			if (arg1 < Class1_Sub3_Sub2.anInt520) {
				local39 = Class1_Sub3_Sub2.anInt520 - arg1;
				local26 -= local39;
				arg1 = Class1_Sub3_Sub2.anInt520;
				local17 += local39;
				local15 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg1 + local26 > Class1_Sub3_Sub2.anInt521) {
				local39 = arg1 + local26 - Class1_Sub3_Sub2.anInt521;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method320(Class1_Sub3_Sub2.anIntArray178, this.anIntArray148, local17, local15, local26, local23, local30, local32);
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("20359, " + arg0 + ", " + true + ", " + arg1 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method320(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIZI)V")
	public void method321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			try {
				@Pc(5) int local5 = this.anInt451;
				@Pc(8) int local8 = this.anInt452;
				@Pc(10) int local10 = 0;
				@Pc(12) int local12 = 0;
				@Pc(27) int local27 = this.anInt455;
				@Pc(30) int local30 = this.anInt456;
				@Pc(36) int local36 = (local27 << 16) / 22;
				@Pc(42) int local42 = (local30 << 16) / 22;
				arg2 = (this.anInt453 * 22 + local27 - 1) / local27 + 5;
				arg1 = (this.anInt454 * 22 + local30 - 1) / local30 + 5;
				if (this.anInt453 * 22 % local27 != 0) {
					local10 = (local27 - this.anInt453 * 22 % local27 << 16) / 22;
				}
				if (this.anInt454 * 22 % local30 != 0) {
					local12 = (local30 - this.anInt454 * 22 % local30 << 16) / 22;
				}
				arg0 = (this.anInt451 - (local10 >> 16)) * 22 / local27;
				arg3 = (this.anInt452 - (local12 >> 16)) * 22 / local30;
				@Pc(136) int local136 = arg2 + arg1 * Class1_Sub3_Sub2.anInt516;
				@Pc(140) int local140 = Class1_Sub3_Sub2.anInt516 - arg0;
				@Pc(147) int local147;
				if (arg1 < Class1_Sub3_Sub2.anInt518) {
					local147 = Class1_Sub3_Sub2.anInt518 - arg1;
					arg3 -= local147;
					arg1 = 0;
					local136 += local147 * Class1_Sub3_Sub2.anInt516;
					local12 += local42 * local147;
				}
				if (arg1 + arg3 > Class1_Sub3_Sub2.anInt519) {
					arg3 -= arg1 + arg3 - Class1_Sub3_Sub2.anInt519;
				}
				if (arg2 < Class1_Sub3_Sub2.anInt520) {
					local147 = Class1_Sub3_Sub2.anInt520 - arg2;
					arg0 -= local147;
					arg2 = 0;
					local136 += local147;
					local10 += local36 * local147;
					local140 += local147;
				}
				if (arg2 + arg0 > Class1_Sub3_Sub2.anInt521) {
					local147 = arg2 + arg0 - Class1_Sub3_Sub2.anInt521;
					arg0 -= local147;
					local140 += local147;
				}
				this.method322(local42, local12, arg3, local10, arg0, Class1_Sub3_Sub2.anIntArray178, local36, this.anIntArray148, local140, 0, local5, local136);
			} catch (@Pc(242) Exception local242) {
				System.out.println("error in sprite clipping routine");
			}
		} catch (@Pc(247) RuntimeException local247) {
			signlink.reporterror("23238, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + local247.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZIIII[II[IIIII)V")
	private void method322(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		try {
			try {
				@Pc(13) int local13 = arg3;
				for (@Pc(16) int local16 = -arg2; local16 < 0; local16++) {
					@Pc(24) int local24 = (arg1 >> 16) * arg10;
					for (@Pc(27) int local27 = -arg4; local27 < 0; local27++) {
						@Pc(37) int local37 = arg7[(arg3 >> 16) + local24];
						if (local37 == 0) {
							arg11++;
						} else {
							arg5[arg11++] = local37;
						}
						arg3 += arg6;
					}
					arg1 += arg0;
					arg3 = local13;
					arg11 += arg8;
				}
			} catch (@Pc(69) Exception local69) {
				System.out.println("error in plot_scale");
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("81296, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIZ)V")
	public void method323(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt453;
			arg1 += this.anInt454;
			@Pc(18) int local18 = arg0 + arg1 * Class1_Sub3_Sub2.anInt516;
			@Pc(20) int local20 = 0;
			@Pc(23) int local23 = this.anInt452;
			@Pc(26) int local26 = this.anInt451;
			@Pc(30) int local30 = Class1_Sub3_Sub2.anInt516 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg1 < Class1_Sub3_Sub2.anInt518) {
				local39 = Class1_Sub3_Sub2.anInt518 - arg1;
				local23 -= local39;
				arg1 = Class1_Sub3_Sub2.anInt518;
				local20 = local39 * local26 + 0;
				local18 += local39 * Class1_Sub3_Sub2.anInt516;
			}
			if (arg1 + local23 > Class1_Sub3_Sub2.anInt519) {
				local23 -= arg1 + local23 - Class1_Sub3_Sub2.anInt519;
			}
			if (arg0 < Class1_Sub3_Sub2.anInt520) {
				local39 = Class1_Sub3_Sub2.anInt520 - arg0;
				local26 -= local39;
				arg0 = Class1_Sub3_Sub2.anInt520;
				local20 += local39;
				local18 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg0 + local26 > Class1_Sub3_Sub2.anInt521) {
				local39 = arg0 + local26 - Class1_Sub3_Sub2.anInt521;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method324(local20, local18, local30, this.anIntArray148, Class1_Sub3_Sub2.anIntArray178, local26, local32, local23, 0);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("90224, " + arg0 + ", " + 128 + ", " + arg1 + ", " + false + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BIII[I[IIIIII)V")
	private void method324(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(8) int local8 = -arg7; local8 < 0; local8++) {
				for (@Pc(13) int local13 = -arg5; local13 < 0; local13++) {
					@Pc(20) int local20 = arg3[arg0++];
					if (local20 == 0) {
						arg1++;
					} else {
						@Pc(26) int local26 = arg4[arg1];
						arg4[arg1++] = ((local20 & 0xFF00FF) * 128 + (local26 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local20 & 0xFF00) * 128 + (local26 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg1 += arg2;
				arg0 += arg6;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("95610, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 128 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([IIIIIII[IIII)V")
	public void method325(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(9) int local9 = -arg9 / 2;
				@Pc(14) int local14 = -arg1 / 2;
				@Pc(23) int local23 = (int) (Math.sin((double) arg8 / 326.11D) * 65536.0D);
				@Pc(32) int local32 = (int) (Math.cos((double) arg8 / 326.11D) * 65536.0D);
				@Pc(38) int local38 = local23 * arg2 >> 8;
				@Pc(44) int local44 = local32 * arg2 >> 8;
				@Pc(56) int local56 = (arg5 << 16) + local14 * local38 + local9 * local44;
				@Pc(68) int local68 = (arg3 << 16) + (local14 * local44 - local9 * local38);
				@Pc(74) int local74 = arg6 + arg4 * Class1_Sub3_Sub2.anInt516;
				for (@Pc(76) int local76 = 0; local76 < arg1; local76++) {
					@Pc(82) int local82 = arg7[local76];
					@Pc(86) int local86 = local74 + local82;
					@Pc(92) int local92 = local56 + local44 * local82;
					@Pc(98) int local98 = local68 - local38 * local82;
					for (@Pc(103) int local103 = -arg0[local76]; local103 < 0; local103++) {
						Class1_Sub3_Sub2.anIntArray178[local86++] = this.anIntArray148[(local92 >> 16) + (local98 >> 16) * this.anInt451];
						local92 += local44;
						local98 -= local38;
					}
					local56 += local38;
					local68 += local44;
					local74 += Class1_Sub3_Sub2.anInt516;
				}
			} catch (@Pc(151) Exception local151) {
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("68469, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 0 + ", " + arg8 + ", " + arg9 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!ib;II)V")
	public void method326(@OriginalArg(1) Class1_Sub3_Sub2_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			arg2 += this.anInt453;
			arg1 += this.anInt454;
			@Pc(18) int local18 = arg2 + arg1 * Class1_Sub3_Sub2.anInt516;
			@Pc(20) int local20 = 0;
			@Pc(23) int local23 = this.anInt452;
			@Pc(26) int local26 = this.anInt451;
			@Pc(30) int local30 = Class1_Sub3_Sub2.anInt516 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg1 < Class1_Sub3_Sub2.anInt518) {
				local39 = Class1_Sub3_Sub2.anInt518 - arg1;
				local23 -= local39;
				arg1 = Class1_Sub3_Sub2.anInt518;
				local20 = local39 * local26 + 0;
				local18 += local39 * Class1_Sub3_Sub2.anInt516;
			}
			if (arg1 + local23 > Class1_Sub3_Sub2.anInt519) {
				local23 -= arg1 + local23 - Class1_Sub3_Sub2.anInt519;
			}
			if (arg2 < Class1_Sub3_Sub2.anInt520) {
				local39 = Class1_Sub3_Sub2.anInt520 - arg2;
				local26 -= local39;
				arg2 = Class1_Sub3_Sub2.anInt520;
				local20 += local39;
				local18 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg2 + local26 > Class1_Sub3_Sub2.anInt521) {
				local39 = arg2 + local26 - Class1_Sub3_Sub2.anInt521;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method327(this.anIntArray148, local30, arg0.aByteArray6, (byte) 8, local26, local18, local32, 0, Class1_Sub3_Sub2.anIntArray178, local20, local23);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("41571, " + -978 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([II[BBIIII[III)V")
	private void method327(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(21) int local21 = -(arg4 >> 2);
			@Pc(26) int local26 = -(arg4 & 0x3);
			for (@Pc(29) int local29 = -arg10; local29 < 0; local29++) {
				@Pc(40) int local40;
				for (@Pc(33) int local33 = local21; local33 < 0; local33++) {
					local40 = arg0[arg9++];
					if (local40 != 0 && arg2[arg5] == 0) {
						arg8[arg5++] = local40;
					} else {
						arg5++;
					}
					local40 = arg0[arg9++];
					if (local40 != 0 && arg2[arg5] == 0) {
						arg8[arg5++] = local40;
					} else {
						arg5++;
					}
					local40 = arg0[arg9++];
					if (local40 != 0 && arg2[arg5] == 0) {
						arg8[arg5++] = local40;
					} else {
						arg5++;
					}
					local40 = arg0[arg9++];
					if (local40 != 0 && arg2[arg5] == 0) {
						arg8[arg5++] = local40;
					} else {
						arg5++;
					}
				}
				for (@Pc(116) int local116 = local26; local116 < 0; local116++) {
					local40 = arg0[arg9++];
					if (local40 != 0 && arg2[arg5] == 0) {
						arg8[arg5++] = local40;
					} else {
						arg5++;
					}
				}
				arg5 += arg1;
				arg9 += arg6;
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("79781, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}
}
