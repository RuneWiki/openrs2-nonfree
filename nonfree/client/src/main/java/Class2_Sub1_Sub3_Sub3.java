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

@OriginalClass("client!LOVQYTIZ")
public final class Class2_Sub1_Sub3_Sub3 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!LOVQYTIZ", name = "z", descriptor = "Z")
	private boolean aBoolean106 = true;

	@OriginalMember(owner = "client!LOVQYTIZ", name = "A", descriptor = "B")
	private byte aByte12 = 73;

	@OriginalMember(owner = "client!LOVQYTIZ", name = "B", descriptor = "I")
	private int anInt433 = -20671;

	@OriginalMember(owner = "client!LOVQYTIZ", name = "C", descriptor = "I")
	private int anInt434 = -660;

	@OriginalMember(owner = "client!LOVQYTIZ", name = "D", descriptor = "I")
	private int anInt435 = 40104;

	@OriginalMember(owner = "client!LOVQYTIZ", name = "E", descriptor = "Z")
	private boolean aBoolean107 = true;

	@OriginalMember(owner = "client!LOVQYTIZ", name = "F", descriptor = "Z")
	private boolean aBoolean108 = false;

	@OriginalMember(owner = "client!LOVQYTIZ", name = "G", descriptor = "[I")
	public int[] anIntArray103;

	@OriginalMember(owner = "client!LOVQYTIZ", name = "L", descriptor = "I")
	public int anInt440;

	@OriginalMember(owner = "client!LOVQYTIZ", name = "H", descriptor = "I")
	public int anInt436;

	@OriginalMember(owner = "client!LOVQYTIZ", name = "M", descriptor = "I")
	public int anInt441;

	@OriginalMember(owner = "client!LOVQYTIZ", name = "I", descriptor = "I")
	public int anInt437;

	@OriginalMember(owner = "client!LOVQYTIZ", name = "K", descriptor = "I")
	private int anInt439;

	@OriginalMember(owner = "client!LOVQYTIZ", name = "J", descriptor = "I")
	private int anInt438;

	@OriginalMember(owner = "client!LOVQYTIZ", name = "<init>", descriptor = "(II)V")
	public Class2_Sub1_Sub3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray103 = new int[arg0 * arg1];
		this.anInt436 = this.anInt440 = arg0;
		this.anInt437 = this.anInt441 = arg1;
		this.anInt438 = this.anInt439 = 0;
	}

	@OriginalMember(owner = "client!LOVQYTIZ", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class2_Sub1_Sub3_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(26) Image local26 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(31) MediaTracker local31 = new MediaTracker(arg1);
			local31.addImage(local26, 0);
			local31.waitForAll();
			this.anInt436 = local26.getWidth(arg1);
			this.anInt437 = local26.getHeight(arg1);
			this.anInt440 = this.anInt436;
			this.anInt441 = this.anInt437;
			this.anInt438 = 0;
			this.anInt439 = 0;
			this.anIntArray103 = new int[this.anInt436 * this.anInt437];
			@Pc(85) PixelGrabber local85 = new PixelGrabber(local26, 0, 0, this.anInt436, this.anInt437, this.anIntArray103, 0, this.anInt436);
			local85.grabPixels();
		} catch (@Pc(90) Exception local90) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!LOVQYTIZ", name = "<init>", descriptor = "(Lclient!JUPFHAZZ;Ljava/lang/String;I)V")
	public Class2_Sub1_Sub3_Sub3(@OriginalArg(0) Class21 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(40) Class2_Sub1_Sub4 local40 = new Class2_Sub1_Sub4(859, arg0.method275(arg1 + ".dat", null));
		@Pc(49) Class2_Sub1_Sub4 local49 = new Class2_Sub1_Sub4(859, arg0.method275("index.dat", null));
		local49.anInt672 = local40.method494();
		this.anInt440 = local49.method494();
		this.anInt441 = local49.method494();
		@Pc(64) int local64 = local49.method492();
		@Pc(67) int[] local67 = new int[local64];
		for (@Pc(69) int local69 = 0; local69 < local64 - 1; local69++) {
			local67[local69 + 1] = local49.method496();
			if (local67[local69 + 1] == 0) {
				local67[local69 + 1] = 1;
			}
		}
		for (@Pc(104) int local104 = 0; local104 < arg2; local104++) {
			local49.anInt672 += 2;
			local40.anInt672 += local49.method494() * local49.method494();
			local49.anInt672++;
		}
		this.anInt438 = local49.method492();
		this.anInt439 = local49.method492();
		this.anInt436 = local49.method494();
		this.anInt437 = local49.method494();
		@Pc(151) int local151 = local49.method492();
		@Pc(157) int local157 = this.anInt436 * this.anInt437;
		this.anIntArray103 = new int[local157];
		@Pc(165) int local165;
		if (local151 == 0) {
			for (local165 = 0; local165 < local157; local165++) {
				this.anIntArray103[local165] = local67[local40.method492()];
			}
		} else if (local151 == 1) {
			for (local165 = 0; local165 < this.anInt436; local165++) {
				for (@Pc(189) int local189 = 0; local189 < this.anInt437; local189++) {
					this.anIntArray103[local165 + local189 * this.anInt436] = local67[local40.method492()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!LOVQYTIZ", name = "a", descriptor = "(B)V")
	public void method329(@OriginalArg(0) byte arg0) {
		try {
			Class2_Sub1_Sub3.method352(this.anIntArray103, this.anInt436, this.anInt437);
			if (arg0 != this.aByte12) {
				for (@Pc(13) int local13 = 1; local13 > 0; local13++) {
				}
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("87243, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LOVQYTIZ", name = "a", descriptor = "(IIII)V")
	public void method330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray103.length; local12++) {
				@Pc(19) int local19 = this.anIntArray103[local12];
				if (local19 != 0) {
					@Pc(27) int local27 = local19 >> 16 & 0xFF;
					local27 += arg2;
					if (local27 < 1) {
						local27 = 1;
					} else if (local27 > 255) {
						local27 = 255;
					}
					@Pc(49) int local49 = local19 >> 8 & 0xFF;
					local49 += arg1;
					if (local49 < 1) {
						local49 = 1;
					} else if (local49 > 255) {
						local49 = 255;
					}
					@Pc(69) int local69 = local19 & 0xFF;
					local69 += arg0;
					if (local69 < 1) {
						local69 = 1;
					} else if (local69 > 255) {
						local69 = 255;
					}
					this.anIntArray103[local12] = (local27 << 16) + (local49 << 8) + local69;
				}
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("42754, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LOVQYTIZ", name = "c", descriptor = "(I)V")
	public void method331() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt440 * this.anInt441];
			for (@Pc(10) int local10 = 0; local10 < this.anInt437; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt436; local14++) {
					local8[(local10 + this.anInt439) * this.anInt440 + local14 + this.anInt438] = this.anIntArray103[local10 * this.anInt436 + local14];
				}
			}
			this.anIntArray103 = local8;
			this.anInt436 = this.anInt440;
			this.anInt437 = this.anInt441;
			this.anInt438 = 0;
			this.anInt439 = 0;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("20254, " + 0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LOVQYTIZ", name = "a", descriptor = "(III)V")
	public void method332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg0 += this.anInt438;
			@Pc(8) boolean local8 = false;
			arg2 += this.anInt439;
			@Pc(19) int local19 = arg0 + arg2 * Class2_Sub1_Sub3.anInt463;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt437;
			@Pc(27) int local27 = this.anInt436;
			@Pc(31) int local31 = Class2_Sub1_Sub3.anInt463 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg2 < Class2_Sub1_Sub3.anInt465) {
				local40 = Class2_Sub1_Sub3.anInt465 - arg2;
				local24 -= local40;
				arg2 = Class2_Sub1_Sub3.anInt465;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class2_Sub1_Sub3.anInt463;
			}
			if (arg2 + local24 > Class2_Sub1_Sub3.anInt466) {
				local24 -= arg2 + local24 - Class2_Sub1_Sub3.anInt466;
			}
			if (arg0 < Class2_Sub1_Sub3.anInt467) {
				local40 = Class2_Sub1_Sub3.anInt467 - arg0;
				local27 -= local40;
				arg0 = Class2_Sub1_Sub3.anInt467;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg0 + local27 > Class2_Sub1_Sub3.anInt468) {
				local40 = arg0 + local27 - Class2_Sub1_Sub3.anInt468;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method333(local33, local24, local27, local21, this.anIntArray103, Class2_Sub1_Sub3.anIntArray104, local31, local19);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("37973, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LOVQYTIZ", name = "a", descriptor = "(IIIII[I[III)V")
	private void method333(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(6) int local6 = -(arg2 >> 2);
			@Pc(11) int local11 = -(arg2 & 0x3);
			for (@Pc(25) int local25 = -arg1; local25 < 0; local25++) {
				for (@Pc(29) int local29 = local6; local29 < 0; local29++) {
					arg5[arg7++] = arg4[arg3++];
					arg5[arg7++] = arg4[arg3++];
					arg5[arg7++] = arg4[arg3++];
					arg5[arg7++] = arg4[arg3++];
				}
				for (@Pc(68) int local68 = local11; local68 < 0; local68++) {
					arg5[arg7++] = arg4[arg3++];
				}
				arg7 += arg6;
				arg3 += arg0;
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("96485, " + 4 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LOVQYTIZ", name = "b", descriptor = "(III)V")
	public void method334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg2 += this.anInt438;
			if (arg1 == this.anInt433) {
				arg0 += this.anInt439;
				@Pc(20) int local20 = arg2 + arg0 * Class2_Sub1_Sub3.anInt463;
				@Pc(22) int local22 = 0;
				@Pc(25) int local25 = this.anInt437;
				@Pc(28) int local28 = this.anInt436;
				@Pc(32) int local32 = Class2_Sub1_Sub3.anInt463 - local28;
				@Pc(34) int local34 = 0;
				@Pc(41) int local41;
				if (arg0 < Class2_Sub1_Sub3.anInt465) {
					local41 = Class2_Sub1_Sub3.anInt465 - arg0;
					local25 -= local41;
					arg0 = Class2_Sub1_Sub3.anInt465;
					local22 = local41 * local28 + 0;
					local20 += local41 * Class2_Sub1_Sub3.anInt463;
				}
				if (arg0 + local25 > Class2_Sub1_Sub3.anInt466) {
					local25 -= arg0 + local25 - Class2_Sub1_Sub3.anInt466;
				}
				if (arg2 < Class2_Sub1_Sub3.anInt467) {
					local41 = Class2_Sub1_Sub3.anInt467 - arg2;
					local28 -= local41;
					arg2 = Class2_Sub1_Sub3.anInt467;
					local22 += local41;
					local20 += local41;
					local34 = local41 + 0;
					local32 += local41;
				}
				if (arg2 + local28 > Class2_Sub1_Sub3.anInt468) {
					local41 = arg2 + local28 - Class2_Sub1_Sub3.anInt468;
					local28 -= local41;
					local34 += local41;
					local32 += local41;
				}
				if (local28 > 0 && local25 > 0) {
					this.method335(Class2_Sub1_Sub3.anIntArray104, this.anIntArray103, local22, local20, local28, local25, local32, local34);
				}
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("43880, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LOVQYTIZ", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method335(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!LOVQYTIZ", name = "b", descriptor = "(IIII)V")
	public void method336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt438;
			arg1 += this.anInt439;
			@Pc(25) int local25 = arg0 + arg1 * Class2_Sub1_Sub3.anInt463;
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = this.anInt437;
			@Pc(33) int local33 = this.anInt436;
			@Pc(37) int local37 = Class2_Sub1_Sub3.anInt463 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg1 < Class2_Sub1_Sub3.anInt465) {
				local46 = Class2_Sub1_Sub3.anInt465 - arg1;
				local30 -= local46;
				arg1 = Class2_Sub1_Sub3.anInt465;
				local27 = local46 * local33 + 0;
				local25 += local46 * Class2_Sub1_Sub3.anInt463;
			}
			if (arg1 + local30 > Class2_Sub1_Sub3.anInt466) {
				local30 -= arg1 + local30 - Class2_Sub1_Sub3.anInt466;
			}
			if (arg0 < Class2_Sub1_Sub3.anInt467) {
				local46 = Class2_Sub1_Sub3.anInt467 - arg0;
				local33 -= local46;
				arg0 = Class2_Sub1_Sub3.anInt467;
				local27 += local46;
				local25 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg0 + local33 > Class2_Sub1_Sub3.anInt468) {
				local46 = arg0 + local33 - Class2_Sub1_Sub3.anInt468;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method337(local27, local30, local37, this.anIntArray103, 0, local25, Class2_Sub1_Sub3.anIntArray104, local39, local33);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("7909, " + arg0 + ", " + arg1 + ", " + 0 + ", " + 128 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LOVQYTIZ", name = "a", descriptor = "(III[IIIII[III)V")
	private void method337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int[] arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		try {
			for (@Pc(17) int local17 = -arg1; local17 < 0; local17++) {
				for (@Pc(22) int local22 = -arg8; local22 < 0; local22++) {
					@Pc(29) int local29 = arg3[arg0++];
					if (local29 == 0) {
						arg5++;
					} else {
						@Pc(35) int local35 = arg6[arg5];
						arg6[arg5++] = ((local29 & 0xFF00FF) * 128 + (local35 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local29 & 0xFF00) * 128 + (local35 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg5 += arg2;
				arg0 += arg7;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("53577, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 128 + ", " + arg4 + ", " + -660 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LOVQYTIZ", name = "a", descriptor = "(IIII[II[IIIII)V")
	public void method338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(16) int local16 = -arg7 / 2;
				@Pc(21) int local21 = -arg6 / 2;
				@Pc(30) int local30 = (int) (Math.sin((double) arg4 / 326.11D) * 65536.0D);
				@Pc(39) int local39 = (int) (Math.cos((double) arg4 / 326.11D) * 65536.0D);
				@Pc(45) int local45 = local30 * arg1 >> 8;
				@Pc(51) int local51 = local39 * arg1 >> 8;
				@Pc(63) int local63 = (arg9 << 16) + local21 * local45 + local16 * local51;
				@Pc(75) int local75 = (arg8 << 16) + (local21 * local51 - local16 * local45);
				@Pc(81) int local81 = arg2 + arg0 * Class2_Sub1_Sub3.anInt463;
				for (@Pc(83) int local83 = 0; local83 < arg6; local83++) {
					@Pc(89) int local89 = arg3[local83];
					@Pc(93) int local93 = local81 + local89;
					@Pc(99) int local99 = local63 + local51 * local89;
					@Pc(105) int local105 = local75 - local45 * local89;
					for (@Pc(110) int local110 = -arg5[local83]; local110 < 0; local110++) {
						Class2_Sub1_Sub3.anIntArray104[local93++] = this.anIntArray103[(local99 >> 16) + (local105 >> 16) * this.anInt436];
						local99 += local51;
						local105 -= local45;
					}
					local63 += local45;
					local75 += local51;
					local81 += Class2_Sub1_Sub3.anInt463;
				}
			} catch (@Pc(158) Exception local158) {
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("42074, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -31511 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LOVQYTIZ", name = "a", descriptor = "(IDIIIIIBI)V")
	public void method339(@OriginalArg(1) double arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		try {
			try {
				@Pc(21) int local21 = (int) (Math.sin(arg0) * 65536.0D);
				@Pc(27) int local27 = (int) (Math.cos(arg0) * 65536.0D);
				@Pc(33) int local33 = local21 * 256 >> 8;
				@Pc(39) int local39 = local27 * 256 >> 8;
				@Pc(51) int local51 = local33 * -10 + local39 * -10 + 983040;
				@Pc(63) int local63 = local39 * -10 + 983040 - local33 * -10;
				@Pc(69) int local69 = arg2 + arg1 * Class2_Sub1_Sub3.anInt463;
				for (@Pc(71) int local71 = 0; local71 < 20; local71++) {
					@Pc(75) int local75 = local69;
					@Pc(77) int local77 = local51;
					@Pc(79) int local79 = local63;
					for (@Pc(82) int local82 = -20; local82 < 0; local82++) {
						@Pc(98) int local98 = this.anIntArray103[(local77 >> 16) + (local79 >> 16) * this.anInt436];
						if (local98 == 0) {
							local75++;
						} else {
							Class2_Sub1_Sub3.anIntArray104[local75++] = local98;
						}
						local77 += local39;
						local79 -= local33;
					}
					local51 += local33;
					local63 += local39;
					local69 += Class2_Sub1_Sub3.anInt463;
				}
			} catch (@Pc(137) Exception local137) {
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("46467, " + 20 + ", " + arg0 + ", " + 15 + ", " + 15 + ", " + 20 + ", " + arg1 + ", " + arg2 + ", " + -60 + ", " + 256 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LOVQYTIZ", name = "a", descriptor = "(ZLclient!NPZZPPRD;II)V")
	public void method340(@OriginalArg(1) Class2_Sub1_Sub3_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			arg2 += this.anInt438;
			arg1 += this.anInt439;
			@Pc(25) int local25 = arg2 + arg1 * Class2_Sub1_Sub3.anInt463;
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = this.anInt437;
			@Pc(33) int local33 = this.anInt436;
			@Pc(37) int local37 = Class2_Sub1_Sub3.anInt463 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg1 < Class2_Sub1_Sub3.anInt465) {
				local46 = Class2_Sub1_Sub3.anInt465 - arg1;
				local30 -= local46;
				arg1 = Class2_Sub1_Sub3.anInt465;
				local27 = local46 * local33 + 0;
				local25 += local46 * Class2_Sub1_Sub3.anInt463;
			}
			if (arg1 + local30 > Class2_Sub1_Sub3.anInt466) {
				local30 -= arg1 + local30 - Class2_Sub1_Sub3.anInt466;
			}
			if (arg2 < Class2_Sub1_Sub3.anInt467) {
				local46 = Class2_Sub1_Sub3.anInt467 - arg2;
				local33 -= local46;
				arg2 = Class2_Sub1_Sub3.anInt467;
				local27 += local46;
				local25 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg2 + local33 > Class2_Sub1_Sub3.anInt468) {
				local46 = arg2 + local33 - Class2_Sub1_Sub3.anInt468;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method341(Class2_Sub1_Sub3.anIntArray104, local25, 0, local37, this.anIntArray103, local27, (byte) 3, local39, local33, arg0.aByteArray12, local30);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("25936, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LOVQYTIZ", name = "a", descriptor = "([IIII[IIBII[BI)V")
	private void method341(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(21) int local21 = -(arg8 >> 2);
			@Pc(26) int local26 = -(arg8 & 0x3);
			for (@Pc(29) int local29 = -arg10; local29 < 0; local29++) {
				@Pc(40) int local40;
				for (@Pc(33) int local33 = local21; local33 < 0; local33++) {
					local40 = arg4[arg5++];
					if (local40 != 0 && arg9[arg1] == 0) {
						arg0[arg1++] = local40;
					} else {
						arg1++;
					}
					local40 = arg4[arg5++];
					if (local40 != 0 && arg9[arg1] == 0) {
						arg0[arg1++] = local40;
					} else {
						arg1++;
					}
					local40 = arg4[arg5++];
					if (local40 != 0 && arg9[arg1] == 0) {
						arg0[arg1++] = local40;
					} else {
						arg1++;
					}
					local40 = arg4[arg5++];
					if (local40 != 0 && arg9[arg1] == 0) {
						arg0[arg1++] = local40;
					} else {
						arg1++;
					}
				}
				for (@Pc(116) int local116 = local26; local116 < 0; local116++) {
					local40 = arg4[arg5++];
					if (local40 != 0 && arg9[arg1] == 0) {
						arg0[arg1++] = local40;
					} else {
						arg1++;
					}
				}
				arg1 += arg3;
				arg5 += arg7;
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("56899, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}
}
