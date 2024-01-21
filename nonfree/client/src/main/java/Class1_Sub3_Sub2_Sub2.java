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

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
	private int anInt359;

	@OriginalMember(owner = "client!hb", name = "B", descriptor = "I")
	private int anInt360;

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
	private int anInt358 = -40161;

	@OriginalMember(owner = "client!hb", name = "w", descriptor = "Z")
	private boolean aBoolean99 = false;

	@OriginalMember(owner = "client!hb", name = "y", descriptor = "Z")
	private boolean aBoolean100 = false;

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "B")
	private byte aByte15 = 4;

	@OriginalMember(owner = "client!hb", name = "A", descriptor = "Z")
	private boolean aBoolean101 = true;

	@OriginalMember(owner = "client!hb", name = "C", descriptor = "[I")
	public int[] anIntArray135;

	@OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
	public int anInt365;

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
	public int anInt361;

	@OriginalMember(owner = "client!hb", name = "I", descriptor = "I")
	private int anInt366;

	@OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
	public int anInt362;

	@OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
	private int anInt364;

	@OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
	private int anInt363;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(II)V")
	public Class1_Sub3_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray135 = new int[arg0 * arg1];
		this.anInt361 = this.anInt365 = arg0;
		this.anInt362 = this.anInt366 = arg1;
		this.anInt363 = this.anInt364 = 0;
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub3_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(20) Image local20 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(25) MediaTracker local25 = new MediaTracker(arg1);
			local25.addImage(local20, 0);
			local25.waitForAll();
			this.anInt361 = local20.getWidth(arg1);
			this.anInt362 = local20.getHeight(arg1);
			this.anInt365 = this.anInt361;
			this.anInt366 = this.anInt362;
			this.anInt363 = 0;
			this.anInt364 = 0;
			this.anIntArray135 = new int[this.anInt361 * this.anInt362];
			@Pc(79) PixelGrabber local79 = new PixelGrabber(local20, 0, 0, this.anInt361, this.anInt362, this.anIntArray135, 0, this.anInt361);
			local79.grabPixels();
		} catch (@Pc(84) Exception local84) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!ub;Ljava/lang/String;I)V")
	public Class1_Sub3_Sub2_Sub2(@OriginalArg(0) Class36 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(35) Class1_Sub3_Sub3 local35 = new Class1_Sub3_Sub3(arg0.method479((byte) 6, null, arg1 + ".dat"), 4);
		@Pc(45) Class1_Sub3_Sub3 local45 = new Class1_Sub3_Sub3(arg0.method479((byte) 6, null, "index.dat"), 4);
		local45.anInt433 = local35.method382();
		this.anInt365 = local45.method382();
		this.anInt366 = local45.method382();
		@Pc(60) int local60 = local45.method380();
		@Pc(63) int[] local63 = new int[local60];
		for (@Pc(65) int local65 = 0; local65 < local60 - 1; local65++) {
			local63[local65 + 1] = local45.method384();
			if (local63[local65 + 1] == 0) {
				local63[local65 + 1] = 1;
			}
		}
		for (@Pc(94) int local94 = 0; local94 < arg2; local94++) {
			local45.anInt433 += 2;
			local35.anInt433 += local45.method382() * local45.method382();
			local45.anInt433++;
		}
		this.anInt363 = local45.method380();
		this.anInt364 = local45.method380();
		this.anInt361 = local45.method382();
		this.anInt362 = local45.method382();
		@Pc(141) int local141 = local45.method380();
		@Pc(147) int local147 = this.anInt361 * this.anInt362;
		this.anIntArray135 = new int[local147];
		@Pc(155) int local155;
		if (local141 == 0) {
			for (local155 = 0; local155 < local147; local155++) {
				this.anIntArray135[local155] = local63[local35.method380()];
			}
		} else if (local141 == 1) {
			for (local155 = 0; local155 < this.anInt361; local155++) {
				for (@Pc(179) int local179 = 0; local179 < this.anInt362; local179++) {
					this.anIntArray135[local155 + local179 * this.anInt361] = local63[local35.method380()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
	public void method280() {
		try {
			Class1_Sub3_Sub2.method313(this.anInt361, this.anIntArray135, this.anInt362);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("90960, " + -510 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)V")
	public void method281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg2 += this.anInt363;
			arg0 += this.anInt364;
			@Pc(15) int local15 = arg2 + arg0 * Class1_Sub3_Sub2.anInt406;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt362;
			@Pc(23) int local23 = this.anInt361;
			@Pc(27) int local27 = Class1_Sub3_Sub2.anInt406 - local23;
			@Pc(29) int local29 = 0;
			if (arg1 == 0) {
				@Pc(39) int local39;
				if (arg0 < Class1_Sub3_Sub2.anInt408) {
					local39 = Class1_Sub3_Sub2.anInt408 - arg0;
					local20 -= local39;
					arg0 = Class1_Sub3_Sub2.anInt408;
					local17 = local39 * local23;
					local15 += local39 * Class1_Sub3_Sub2.anInt406;
				}
				if (arg0 + local20 > Class1_Sub3_Sub2.anInt409) {
					local20 -= arg0 + local20 - Class1_Sub3_Sub2.anInt409;
				}
				if (arg2 < Class1_Sub3_Sub2.anInt410) {
					local39 = Class1_Sub3_Sub2.anInt410 - arg2;
					local23 -= local39;
					arg2 = Class1_Sub3_Sub2.anInt410;
					local17 += local39;
					local15 += local39;
					local29 = local39;
					local27 += local39;
				}
				if (arg2 + local23 > Class1_Sub3_Sub2.anInt411) {
					local39 = arg2 + local23 - Class1_Sub3_Sub2.anInt411;
					local23 -= local39;
					local29 += local39;
					local27 += local39;
				}
				if (local23 > 0 && local20 > 0) {
					this.method282(local23, local20, local15, Class1_Sub3_Sub2.anIntArray159, this.anIntArray135, local17, local27, local29);
				}
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("42580, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III[II[IIII)V")
	private void method282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(6) int local6 = -(arg0 >> 2);
			@Pc(11) int local11 = -(arg0 & 0x3);
			for (@Pc(14) int local14 = -arg1; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					arg3[arg2++] = arg4[arg5++];
					arg3[arg2++] = arg4[arg5++];
					arg3[arg2++] = arg4[arg5++];
					arg3[arg2++] = arg4[arg5++];
				}
				for (@Pc(57) int local57 = local11; local57 < 0; local57++) {
					arg3[arg2++] = arg4[arg5++];
				}
				arg2 += arg6;
				arg5 += arg7;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("11530, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 14588 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(III)V")
	public void method283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg2 += this.anInt363;
			arg0 += this.anInt364;
			@Pc(15) int local15 = arg2 + arg0 * Class1_Sub3_Sub2.anInt406;
			@Pc(17) int local17 = 0;
			if (arg1 <= 0) {
				this.anInt358 = 423;
			}
			@Pc(25) int local25 = this.anInt362;
			@Pc(28) int local28 = this.anInt361;
			@Pc(32) int local32 = Class1_Sub3_Sub2.anInt406 - local28;
			@Pc(34) int local34 = 0;
			@Pc(41) int local41;
			if (arg0 < Class1_Sub3_Sub2.anInt408) {
				local41 = Class1_Sub3_Sub2.anInt408 - arg0;
				local25 -= local41;
				arg0 = Class1_Sub3_Sub2.anInt408;
				local17 = local41 * local28;
				local15 += local41 * Class1_Sub3_Sub2.anInt406;
			}
			if (arg0 + local25 > Class1_Sub3_Sub2.anInt409) {
				local25 -= arg0 + local25 - Class1_Sub3_Sub2.anInt409;
			}
			if (arg2 < Class1_Sub3_Sub2.anInt410) {
				local41 = Class1_Sub3_Sub2.anInt410 - arg2;
				local28 -= local41;
				arg2 = Class1_Sub3_Sub2.anInt410;
				local17 += local41;
				local15 += local41;
				local34 = local41;
				local32 += local41;
			}
			if (arg2 + local28 > Class1_Sub3_Sub2.anInt411) {
				local41 = arg2 + local28 - Class1_Sub3_Sub2.anInt411;
				local28 -= local41;
				local34 += local41;
				local32 += local41;
			}
			if (local28 > 0 && local25 > 0) {
				this.method284(Class1_Sub3_Sub2.anIntArray159, this.anIntArray135, local17, local15, local28, local25, local32, local34);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("62933, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method284(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZIII)V")
	public void method285(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		try {
			arg0 += this.anInt363;
			arg1 += this.anInt364;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub3_Sub2.anInt406;
			@Pc(17) int local17 = 0;
			@Pc(25) int local25 = this.anInt362;
			@Pc(28) int local28 = this.anInt361;
			@Pc(32) int local32 = Class1_Sub3_Sub2.anInt406 - local28;
			@Pc(34) int local34 = 0;
			@Pc(41) int local41;
			if (arg1 < Class1_Sub3_Sub2.anInt408) {
				local41 = Class1_Sub3_Sub2.anInt408 - arg1;
				local25 -= local41;
				arg1 = Class1_Sub3_Sub2.anInt408;
				local17 = local41 * local28;
				local15 += local41 * Class1_Sub3_Sub2.anInt406;
			}
			if (arg1 + local25 > Class1_Sub3_Sub2.anInt409) {
				local25 -= arg1 + local25 - Class1_Sub3_Sub2.anInt409;
			}
			if (arg0 < Class1_Sub3_Sub2.anInt410) {
				local41 = Class1_Sub3_Sub2.anInt410 - arg0;
				local28 -= local41;
				arg0 = Class1_Sub3_Sub2.anInt410;
				local17 += local41;
				local15 += local41;
				local34 = local41;
				local32 += local41;
			}
			if (arg0 + local28 > Class1_Sub3_Sub2.anInt411) {
				local41 = arg0 + local28 - Class1_Sub3_Sub2.anInt411;
				local28 -= local41;
				local34 += local41;
				local32 += local41;
			}
			if (local28 > 0 && local25 > 0) {
				this.method286(this.anIntArray135, local28, local17, local25, this.aByte15, local34, Class1_Sub3_Sub2.anIntArray159, local32, 0, local15);
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("48701, " + false + ", " + arg0 + ", " + 128 + ", " + arg1 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([IIIIIBI[IIII)V")
	private void method286(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			for (@Pc(8) int local8 = -arg3; local8 < 0; local8++) {
				for (@Pc(13) int local13 = -arg1; local13 < 0; local13++) {
					@Pc(20) int local20 = arg0[arg2++];
					if (local20 == 0) {
						arg9++;
					} else {
						@Pc(26) int local26 = arg6[arg9];
						arg6[arg9++] = ((local20 & 0xFF00FF) * 128 + (local26 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local20 & 0xFF00) * 128 + (local26 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg9 += arg7;
				arg2 += arg5;
			}
			if (arg4 != 4) {
				this.aBoolean100 = !this.aBoolean100;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("51066, " + arg0 + ", " + arg1 + ", " + 128 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([IIII[IIIIII)V")
	public void method287(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			try {
				@Pc(15) int local15 = -arg1 / 2;
				@Pc(20) int local20 = -arg2 / 2;
				@Pc(29) int local29 = (int) (Math.sin((double) arg7 / 326.11D) * 65536.0D);
				@Pc(38) int local38 = (int) (Math.cos((double) arg7 / 326.11D) * 65536.0D);
				@Pc(50) int local50 = (arg6 << 16) + local20 * local29 + local15 * local38;
				@Pc(62) int local62 = (arg8 << 16) + (local20 * local38 - local15 * local29);
				@Pc(68) int local68 = arg4 + arg5 * Class1_Sub3_Sub2.anInt406;
				for (@Pc(70) int local70 = 0; local70 < arg2; local70++) {
					@Pc(76) int local76 = arg3[local70];
					@Pc(80) int local80 = local68 + local76;
					@Pc(86) int local86 = local50 + local38 * local76;
					@Pc(92) int local92 = local62 - local29 * local76;
					for (@Pc(97) int local97 = -arg0[local70]; local97 < 0; local97++) {
						Class1_Sub3_Sub2.anIntArray159[local80++] = this.anIntArray135[(local86 >> 16) + (local92 >> 16) * this.anInt361];
						local86 += local38;
						local92 -= local29;
					}
					local50 += local29;
					local62 += local38;
					local68 += Class1_Sub3_Sub2.anInt406;
				}
			} catch (@Pc(145) Exception local145) {
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("80413, " + arg0 + ", " + arg1 + ", " + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILclient!ib;I)V")
	public void method288(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3_Sub2_Sub3 arg1, @OriginalArg(3) int arg2) {
		try {
			arg0 += this.anInt363;
			arg2 += this.anInt364;
			@Pc(15) int local15 = arg0 + arg2 * Class1_Sub3_Sub2.anInt406;
			@Pc(17) int local17 = 0;
			@Pc(23) int local23 = this.anInt362;
			@Pc(26) int local26 = this.anInt361;
			@Pc(30) int local30 = Class1_Sub3_Sub2.anInt406 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg2 < Class1_Sub3_Sub2.anInt408) {
				local39 = Class1_Sub3_Sub2.anInt408 - arg2;
				local23 -= local39;
				arg2 = Class1_Sub3_Sub2.anInt408;
				local17 = local39 * local26;
				local15 += local39 * Class1_Sub3_Sub2.anInt406;
			}
			if (arg2 + local23 > Class1_Sub3_Sub2.anInt409) {
				local23 -= arg2 + local23 - Class1_Sub3_Sub2.anInt409;
			}
			if (arg0 < Class1_Sub3_Sub2.anInt410) {
				local39 = Class1_Sub3_Sub2.anInt410 - arg0;
				local26 -= local39;
				arg0 = Class1_Sub3_Sub2.anInt410;
				local17 += local39;
				local15 += local39;
				local32 = local39;
				local30 += local39;
			}
			if (arg0 + local26 > Class1_Sub3_Sub2.anInt411) {
				local39 = arg0 + local26 - Class1_Sub3_Sub2.anInt411;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method289(local17, 0, Class1_Sub3_Sub2.anIntArray159, local26, local23, this.anIntArray135, local32, local15, local30, arg1.aByteArray3);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("22245, " + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II[III[IZIII[B)V")
	private void method289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9) {
		try {
			@Pc(6) int local6 = -(arg3 >> 2);
			@Pc(11) int local11 = -(arg3 & 0x3);
			for (@Pc(14) int local14 = -arg4; local14 < 0; local14++) {
				@Pc(25) int local25;
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					local25 = arg5[arg0++];
					if (local25 != 0 && arg9[arg7] == 0) {
						arg2[arg7++] = local25;
					} else {
						arg7++;
					}
					local25 = arg5[arg0++];
					if (local25 != 0 && arg9[arg7] == 0) {
						arg2[arg7++] = local25;
					} else {
						arg7++;
					}
					local25 = arg5[arg0++];
					if (local25 != 0 && arg9[arg7] == 0) {
						arg2[arg7++] = local25;
					} else {
						arg7++;
					}
					local25 = arg5[arg0++];
					if (local25 != 0 && arg9[arg7] == 0) {
						arg2[arg7++] = local25;
					} else {
						arg7++;
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					local25 = arg5[arg0++];
					if (local25 != 0 && arg9[arg7] == 0) {
						arg2[arg7++] = local25;
					} else {
						arg7++;
					}
				}
				arg7 += arg8;
				arg0 += arg6;
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("42304, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + true + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}
}
