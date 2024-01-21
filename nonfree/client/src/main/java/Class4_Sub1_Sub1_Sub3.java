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

@OriginalClass("client!KUDWIDHU")
public final class Class4_Sub1_Sub1_Sub3 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!KUDWIDHU", name = "A", descriptor = "I")
	private int anInt212 = -1950;

	@OriginalMember(owner = "client!KUDWIDHU", name = "B", descriptor = "I")
	private int anInt213 = 899;

	@OriginalMember(owner = "client!KUDWIDHU", name = "C", descriptor = "B")
	private byte aByte14 = 5;

	@OriginalMember(owner = "client!KUDWIDHU", name = "D", descriptor = "I")
	private int anInt214 = -454;

	@OriginalMember(owner = "client!KUDWIDHU", name = "E", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!KUDWIDHU", name = "F", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!KUDWIDHU", name = "G", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!KUDWIDHU", name = "H", descriptor = "[I")
	public int[] anIntArray33;

	@OriginalMember(owner = "client!KUDWIDHU", name = "M", descriptor = "I")
	public int anInt219;

	@OriginalMember(owner = "client!KUDWIDHU", name = "I", descriptor = "I")
	public int anInt215;

	@OriginalMember(owner = "client!KUDWIDHU", name = "N", descriptor = "I")
	public int anInt220;

	@OriginalMember(owner = "client!KUDWIDHU", name = "J", descriptor = "I")
	public int anInt216;

	@OriginalMember(owner = "client!KUDWIDHU", name = "L", descriptor = "I")
	private int anInt218;

	@OriginalMember(owner = "client!KUDWIDHU", name = "K", descriptor = "I")
	private int anInt217;

	static {
		aBoolean79 = true;
	}

	@OriginalMember(owner = "client!KUDWIDHU", name = "<init>", descriptor = "(II)V")
	public Class4_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray33 = new int[arg0 * arg1];
		this.anInt215 = this.anInt219 = arg0;
		this.anInt216 = this.anInt220 = arg1;
		this.anInt217 = this.anInt218 = 0;
	}

	@OriginalMember(owner = "client!KUDWIDHU", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class4_Sub1_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(26) Image local26 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(31) MediaTracker local31 = new MediaTracker(arg1);
			local31.addImage(local26, 0);
			local31.waitForAll();
			this.anInt215 = local26.getWidth(arg1);
			this.anInt216 = local26.getHeight(arg1);
			this.anInt219 = this.anInt215;
			this.anInt220 = this.anInt216;
			this.anInt217 = 0;
			this.anInt218 = 0;
			this.anIntArray33 = new int[this.anInt215 * this.anInt216];
			@Pc(85) PixelGrabber local85 = new PixelGrabber(local26, 0, 0, this.anInt215, this.anInt216, this.anIntArray33, 0, this.anInt215);
			local85.grabPixels();
		} catch (@Pc(90) Exception local90) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!KUDWIDHU", name = "<init>", descriptor = "(Lclient!AKPFVPPG;Ljava/lang/String;I)V")
	public Class4_Sub1_Sub1_Sub3(@OriginalArg(0) Class2 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(40) Class4_Sub1_Sub3 local40 = new Class4_Sub1_Sub3(arg0.method7(arg1 + ".dat", null), (byte) 3);
		@Pc(49) Class4_Sub1_Sub3 local49 = new Class4_Sub1_Sub3(arg0.method7("index.dat", null), (byte) 3);
		local49.anInt101 = local40.method104();
		this.anInt219 = local49.method104();
		this.anInt220 = local49.method104();
		@Pc(64) int local64 = local49.method102();
		@Pc(67) int[] local67 = new int[local64];
		for (@Pc(69) int local69 = 0; local69 < local64 - 1; local69++) {
			local67[local69 + 1] = local49.method106();
			if (local67[local69 + 1] == 0) {
				local67[local69 + 1] = 1;
			}
		}
		for (@Pc(104) int local104 = 0; local104 < arg2; local104++) {
			local49.anInt101 += 2;
			local40.anInt101 += local49.method104() * local49.method104();
			local49.anInt101++;
		}
		this.anInt217 = local49.method102();
		this.anInt218 = local49.method102();
		this.anInt215 = local49.method104();
		this.anInt216 = local49.method104();
		@Pc(151) int local151 = local49.method102();
		@Pc(157) int local157 = this.anInt215 * this.anInt216;
		this.anIntArray33 = new int[local157];
		@Pc(165) int local165;
		if (local151 == 0) {
			for (local165 = 0; local165 < local157; local165++) {
				this.anIntArray33[local165] = local67[local40.method102()];
			}
		} else if (local151 == 1) {
			for (local165 = 0; local165 < this.anInt215; local165++) {
				for (@Pc(189) int local189 = 0; local189 < this.anInt216; local189++) {
					this.anIntArray33[local165 + local189 * this.anInt215] = local67[local40.method102()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!KUDWIDHU", name = "a", descriptor = "(I)V")
	public void method234() {
		try {
			Class4_Sub1_Sub1.method543(this.anIntArray33, this.anInt216, this.anInt215);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("24862, " + 0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUDWIDHU", name = "a", descriptor = "(ZIII)V")
	public void method235(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0) {
				for (@Pc(6) int local6 = 0; local6 < this.anIntArray33.length; local6++) {
					@Pc(13) int local13 = this.anIntArray33[local6];
					if (local13 != 0) {
						@Pc(21) int local21 = local13 >> 16 & 0xFF;
						local21 += arg3;
						if (local21 < 1) {
							local21 = 1;
						} else if (local21 > 255) {
							local21 = 255;
						}
						@Pc(43) int local43 = local13 >> 8 & 0xFF;
						local43 += arg1;
						if (local43 < 1) {
							local43 = 1;
						} else if (local43 > 255) {
							local43 = 255;
						}
						@Pc(63) int local63 = local13 & 0xFF;
						local63 += arg2;
						if (local63 < 1) {
							local63 = 1;
						} else if (local63 > 255) {
							local63 = 255;
						}
						this.anIntArray33[local6] = (local21 << 16) + (local43 << 8) + local63;
					}
				}
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("68049, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUDWIDHU", name = "b", descriptor = "(Z)V")
	public void method236() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt219 * this.anInt220];
			for (@Pc(10) int local10 = 0; local10 < this.anInt216; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt215; local14++) {
					local8[(local10 + this.anInt218) * this.anInt219 + local14 + this.anInt217] = this.anIntArray33[local10 * this.anInt215 + local14];
				}
			}
			this.anIntArray33 = local8;
			this.anInt215 = this.anInt219;
			this.anInt216 = this.anInt220;
			this.anInt217 = 0;
			this.anInt218 = 0;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("79778, " + true + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUDWIDHU", name = "a", descriptor = "(III)V")
	public void method237(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt217;
			arg1 += this.anInt218;
			@Pc(15) int local15 = arg0 + arg1 * Class4_Sub1_Sub1.anInt782;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt216;
			@Pc(23) int local23 = this.anInt215;
			@Pc(27) int local27 = Class4_Sub1_Sub1.anInt782 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class4_Sub1_Sub1.anInt784) {
				local36 = Class4_Sub1_Sub1.anInt784 - arg1;
				local20 -= local36;
				arg1 = Class4_Sub1_Sub1.anInt784;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class4_Sub1_Sub1.anInt782;
			}
			if (arg1 + local20 > Class4_Sub1_Sub1.anInt785) {
				local20 -= arg1 + local20 - Class4_Sub1_Sub1.anInt785;
			}
			if (arg0 < Class4_Sub1_Sub1.anInt786) {
				local36 = Class4_Sub1_Sub1.anInt786 - arg0;
				local23 -= local36;
				arg0 = Class4_Sub1_Sub1.anInt786;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class4_Sub1_Sub1.anInt787) {
				local36 = arg0 + local23 - Class4_Sub1_Sub1.anInt787;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method238(local27, local20, this.anIntArray33, local15, Class4_Sub1_Sub1.anIntArray201, local17, (byte) 5, local29, local23);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("14567, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUDWIDHU", name = "a", descriptor = "(II[II[IIBII)V")
	private void method238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			@Pc(6) int local6 = -(arg8 >> 2);
			if (this.aByte14 == 5) {
				@Pc(12) boolean local12 = false;
				@Pc(19) int local19 = -(arg8 & 0x3);
				for (@Pc(22) int local22 = -arg1; local22 < 0; local22++) {
					for (@Pc(27) int local27 = local6; local27 < 0; local27++) {
						arg4[arg3++] = arg2[arg5++];
						arg4[arg3++] = arg2[arg5++];
						arg4[arg3++] = arg2[arg5++];
						arg4[arg3++] = arg2[arg5++];
					}
					for (@Pc(66) int local66 = local19; local66 < 0; local66++) {
						arg4[arg3++] = arg2[arg5++];
					}
					arg3 += arg0;
					arg5 += arg7;
				}
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("54778, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUDWIDHU", name = "b", descriptor = "(III)V")
	public void method239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg1 += this.anInt217;
			arg2 += this.anInt218;
			@Pc(15) int local15 = arg1 + arg2 * Class4_Sub1_Sub1.anInt782;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt216;
			@Pc(23) int local23 = this.anInt215;
			@Pc(27) int local27 = Class4_Sub1_Sub1.anInt782 - local23;
			@Pc(29) int local29 = 0;
			@Pc(33) boolean local33 = false;
			@Pc(40) int local40;
			if (arg2 < Class4_Sub1_Sub1.anInt784) {
				local40 = Class4_Sub1_Sub1.anInt784 - arg2;
				local20 -= local40;
				arg2 = Class4_Sub1_Sub1.anInt784;
				local17 = local40 * local23 + 0;
				local15 += local40 * Class4_Sub1_Sub1.anInt782;
			}
			if (arg2 + local20 > Class4_Sub1_Sub1.anInt785) {
				local20 -= arg2 + local20 - Class4_Sub1_Sub1.anInt785;
			}
			if (arg1 < Class4_Sub1_Sub1.anInt786) {
				local40 = Class4_Sub1_Sub1.anInt786 - arg1;
				local23 -= local40;
				arg1 = Class4_Sub1_Sub1.anInt786;
				local17 += local40;
				local15 += local40;
				local29 = local40 + 0;
				local27 += local40;
			}
			if (arg1 + local23 > Class4_Sub1_Sub1.anInt787) {
				local40 = arg1 + local23 - Class4_Sub1_Sub1.anInt787;
				local23 -= local40;
				local29 += local40;
				local27 += local40;
			}
			if (local23 > 0 && local20 > 0) {
				this.method240(Class4_Sub1_Sub1.anIntArray201, this.anIntArray33, local17, local15, local23, local20, local27, local29);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("43725, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUDWIDHU", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method240(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!KUDWIDHU", name = "a", descriptor = "(IIII)V")
	public void method241(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			arg2 += this.anInt217;
			arg0 += this.anInt218;
			@Pc(13) boolean local13 = false;
			@Pc(19) int local19 = arg2 + arg0 * Class4_Sub1_Sub1.anInt782;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt216;
			@Pc(27) int local27 = this.anInt215;
			@Pc(31) int local31 = Class4_Sub1_Sub1.anInt782 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg0 < Class4_Sub1_Sub1.anInt784) {
				local40 = Class4_Sub1_Sub1.anInt784 - arg0;
				local24 -= local40;
				arg0 = Class4_Sub1_Sub1.anInt784;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class4_Sub1_Sub1.anInt782;
			}
			if (arg0 + local24 > Class4_Sub1_Sub1.anInt785) {
				local24 -= arg0 + local24 - Class4_Sub1_Sub1.anInt785;
			}
			if (arg2 < Class4_Sub1_Sub1.anInt786) {
				local40 = Class4_Sub1_Sub1.anInt786 - arg2;
				local27 -= local40;
				arg2 = Class4_Sub1_Sub1.anInt786;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg2 + local27 > Class4_Sub1_Sub1.anInt787) {
				local40 = arg2 + local27 - Class4_Sub1_Sub1.anInt787;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method242(local31, local27, local33, 0, local19, Class4_Sub1_Sub1.anIntArray201, this.anIntArray33, local21, local24);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("28537, " + 128 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUDWIDHU", name = "a", descriptor = "(IIIIII[II[III)V")
	private void method242(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(8) int[] arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		try {
			for (@Pc(18) int local18 = -arg8; local18 < 0; local18++) {
				for (@Pc(23) int local23 = -arg1; local23 < 0; local23++) {
					@Pc(30) int local30 = arg6[arg7++];
					if (local30 == 0) {
						arg4++;
					} else {
						@Pc(36) int local36 = arg5[arg4];
						arg5[arg4++] = ((local30 & 0xFF00FF) * 128 + (local36 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local30 & 0xFF00) * 128 + (local36 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg4 += arg0;
				arg7 += arg2;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("95443, " + arg0 + ", " + 128 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -816 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUDWIDHU", name = "a", descriptor = "(III[II[IIIIII)V")
	public void method243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			if (arg7 != 39461) {
				this.aBoolean82 = !this.aBoolean82;
			}
			try {
				@Pc(17) int local17 = -arg4 / 2;
				@Pc(22) int local22 = -arg0 / 2;
				@Pc(31) int local31 = (int) (Math.sin((double) arg1 / 326.11D) * 65536.0D);
				@Pc(40) int local40 = (int) (Math.cos((double) arg1 / 326.11D) * 65536.0D);
				@Pc(46) int local46 = local31 * arg2 >> 8;
				@Pc(52) int local52 = local40 * arg2 >> 8;
				@Pc(64) int local64 = (arg8 << 16) + local22 * local46 + local17 * local52;
				@Pc(76) int local76 = (arg9 << 16) + (local22 * local52 - local17 * local46);
				@Pc(82) int local82 = arg10 + arg6 * Class4_Sub1_Sub1.anInt782;
				for (@Pc(84) int local84 = 0; local84 < arg0; local84++) {
					@Pc(90) int local90 = arg3[local84];
					@Pc(94) int local94 = local82 + local90;
					@Pc(100) int local100 = local64 + local52 * local90;
					@Pc(106) int local106 = local76 - local46 * local90;
					for (@Pc(111) int local111 = -arg5[local84]; local111 < 0; local111++) {
						Class4_Sub1_Sub1.anIntArray201[local94++] = this.anIntArray33[(local100 >> 16) + (local106 >> 16) * this.anInt215];
						local100 += local52;
						local106 -= local46;
					}
					local64 += local46;
					local76 += local52;
					local82 += Class4_Sub1_Sub1.anInt782;
				}
			} catch (@Pc(159) Exception local159) {
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("11072, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUDWIDHU", name = "a", descriptor = "(IIIIDIIII)V")
	public void method244(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) double arg2) {
		try {
			try {
				@Pc(20) int local20 = (int) (Math.sin(arg2) * 65536.0D);
				@Pc(26) int local26 = (int) (Math.cos(arg2) * 65536.0D);
				@Pc(32) int local32 = local20 * 256 >> 8;
				@Pc(38) int local38 = local26 * 256 >> 8;
				@Pc(50) int local50 = local32 * -10 + local38 * -10 + 983040;
				@Pc(62) int local62 = local38 * -10 + 983040 - local32 * -10;
				@Pc(68) int local68 = arg1 + arg0 * Class4_Sub1_Sub1.anInt782;
				for (@Pc(70) int local70 = 0; local70 < 20; local70++) {
					@Pc(74) int local74 = local68;
					@Pc(76) int local76 = local50;
					@Pc(78) int local78 = local62;
					for (@Pc(81) int local81 = -20; local81 < 0; local81++) {
						@Pc(97) int local97 = this.anIntArray33[(local76 >> 16) + (local78 >> 16) * this.anInt215];
						if (local97 == 0) {
							local74++;
						} else {
							Class4_Sub1_Sub1.anIntArray201[local74++] = local97;
						}
						local76 += local38;
						local78 -= local32;
					}
					local50 += local32;
					local62 += local38;
					local68 += Class4_Sub1_Sub1.anInt782;
				}
			} catch (@Pc(136) Exception local136) {
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("22298, " + 20 + ", " + arg0 + ", " + 256 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + 15 + ", " + 20 + ", " + 15 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUDWIDHU", name = "a", descriptor = "(Lclient!ITVAFKCK;III)V")
	public void method245(@OriginalArg(0) Class4_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			arg2 += this.anInt217;
			arg1 += this.anInt218;
			@Pc(15) int local15 = arg2 + arg1 * Class4_Sub1_Sub1.anInt782;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt216;
			@Pc(23) int local23 = this.anInt215;
			@Pc(27) int local27 = Class4_Sub1_Sub1.anInt782 - local23;
			@Pc(29) int local29 = 0;
			@Pc(39) int local39;
			if (arg1 < Class4_Sub1_Sub1.anInt784) {
				local39 = Class4_Sub1_Sub1.anInt784 - arg1;
				local20 -= local39;
				arg1 = Class4_Sub1_Sub1.anInt784;
				local17 = local39 * local23 + 0;
				local15 += local39 * Class4_Sub1_Sub1.anInt782;
			}
			if (arg1 + local20 > Class4_Sub1_Sub1.anInt785) {
				local20 -= arg1 + local20 - Class4_Sub1_Sub1.anInt785;
			}
			if (arg2 < Class4_Sub1_Sub1.anInt786) {
				local39 = Class4_Sub1_Sub1.anInt786 - arg2;
				local23 -= local39;
				arg2 = Class4_Sub1_Sub1.anInt786;
				local17 += local39;
				local15 += local39;
				local29 = local39 + 0;
				local27 += local39;
			}
			if (arg2 + local23 > Class4_Sub1_Sub1.anInt787) {
				local39 = arg2 + local23 - Class4_Sub1_Sub1.anInt787;
				local23 -= local39;
				local29 += local39;
				local27 += local39;
			}
			if (local23 > 0 && local20 > 0) {
				this.method246(local29, local17, local23, arg0.aByteArray4, Class4_Sub1_Sub1.anIntArray201, local27, local15, this.anIntArray33, 0, local20);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("12980, " + arg0 + ", " + arg1 + ", " + -454 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KUDWIDHU", name = "a", descriptor = "(III[B[III[IIII)V")
	private void method246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(6) int local6 = -(arg2 >> 2);
			@Pc(11) int local11 = -(arg2 & 0x3);
			for (@Pc(17) int local17 = -arg9; local17 < 0; local17++) {
				@Pc(28) int local28;
				for (@Pc(21) int local21 = local6; local21 < 0; local21++) {
					local28 = arg7[arg1++];
					if (local28 != 0 && arg3[arg6] == 0) {
						arg4[arg6++] = local28;
					} else {
						arg6++;
					}
					local28 = arg7[arg1++];
					if (local28 != 0 && arg3[arg6] == 0) {
						arg4[arg6++] = local28;
					} else {
						arg6++;
					}
					local28 = arg7[arg1++];
					if (local28 != 0 && arg3[arg6] == 0) {
						arg4[arg6++] = local28;
					} else {
						arg6++;
					}
					local28 = arg7[arg1++];
					if (local28 != 0 && arg3[arg6] == 0) {
						arg4[arg6++] = local28;
					} else {
						arg6++;
					}
				}
				for (@Pc(104) int local104 = local11; local104 < 0; local104++) {
					local28 = arg7[arg1++];
					if (local28 != 0 && arg3[arg6] == 0) {
						arg4[arg6++] = local28;
					} else {
						arg6++;
					}
				}
				arg6 += arg5;
				arg1 += arg0;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("60498, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 197 + ", " + arg8 + ", " + arg9 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}
