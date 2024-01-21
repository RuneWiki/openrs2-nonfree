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

@OriginalClass("client!AIRMECOM")
public final class Class2_Sub1_Sub2_Sub1 extends Class2_Sub1_Sub2 {

	@OriginalMember(owner = "client!AIRMECOM", name = "y", descriptor = "I")
	private int anInt36;

	@OriginalMember(owner = "client!AIRMECOM", name = "w", descriptor = "Z")
	private boolean aBoolean13 = false;

	@OriginalMember(owner = "client!AIRMECOM", name = "x", descriptor = "Z")
	private boolean aBoolean14 = true;

	@OriginalMember(owner = "client!AIRMECOM", name = "z", descriptor = "I")
	private int anInt37 = -178;

	@OriginalMember(owner = "client!AIRMECOM", name = "A", descriptor = "B")
	private byte aByte1 = 8;

	@OriginalMember(owner = "client!AIRMECOM", name = "B", descriptor = "B")
	private byte aByte2 = -78;

	@OriginalMember(owner = "client!AIRMECOM", name = "C", descriptor = "Z")
	private boolean aBoolean15 = false;

	@OriginalMember(owner = "client!AIRMECOM", name = "D", descriptor = "[I")
	public int[] anIntArray3;

	@OriginalMember(owner = "client!AIRMECOM", name = "I", descriptor = "I")
	public int anInt42;

	@OriginalMember(owner = "client!AIRMECOM", name = "E", descriptor = "I")
	public int anInt38;

	@OriginalMember(owner = "client!AIRMECOM", name = "J", descriptor = "I")
	public int anInt43;

	@OriginalMember(owner = "client!AIRMECOM", name = "F", descriptor = "I")
	public int anInt39;

	@OriginalMember(owner = "client!AIRMECOM", name = "H", descriptor = "I")
	private int anInt41;

	@OriginalMember(owner = "client!AIRMECOM", name = "G", descriptor = "I")
	private int anInt40;

	@OriginalMember(owner = "client!AIRMECOM", name = "<init>", descriptor = "(II)V")
	public Class2_Sub1_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray3 = new int[arg0 * arg1];
		this.anInt38 = this.anInt42 = arg0;
		this.anInt39 = this.anInt43 = arg1;
		this.anInt40 = this.anInt41 = 0;
	}

	@OriginalMember(owner = "client!AIRMECOM", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class2_Sub1_Sub2_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(23) Image local23 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(28) MediaTracker local28 = new MediaTracker(arg1);
			local28.addImage(local23, 0);
			local28.waitForAll();
			this.anInt38 = local23.getWidth(arg1);
			this.anInt39 = local23.getHeight(arg1);
			this.anInt42 = this.anInt38;
			this.anInt43 = this.anInt39;
			this.anInt40 = 0;
			this.anInt41 = 0;
			this.anIntArray3 = new int[this.anInt38 * this.anInt39];
			@Pc(82) PixelGrabber local82 = new PixelGrabber(local23, 0, 0, this.anInt38, this.anInt39, this.anIntArray3, 0, this.anInt38);
			local82.grabPixels();
		} catch (@Pc(87) Exception local87) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!AIRMECOM", name = "<init>", descriptor = "(Lclient!FXNTEMPE;Ljava/lang/String;I)V")
	public Class2_Sub1_Sub2_Sub1(@OriginalArg(0) Class13 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(37) Class2_Sub1_Sub4 local37 = new Class2_Sub1_Sub4(arg0.method117(arg1 + ".dat", null), -46859);
		@Pc(46) Class2_Sub1_Sub4 local46 = new Class2_Sub1_Sub4(arg0.method117("index.dat", null), -46859);
		local46.anInt556 = local37.method342();
		this.anInt42 = local46.method342();
		this.anInt43 = local46.method342();
		@Pc(61) int local61 = local46.method340();
		@Pc(64) int[] local64 = new int[local61];
		for (@Pc(66) int local66 = 0; local66 < local61 - 1; local66++) {
			local64[local66 + 1] = local46.method344();
			if (local64[local66 + 1] == 0) {
				local64[local66 + 1] = 1;
			}
		}
		for (@Pc(101) int local101 = 0; local101 < arg2; local101++) {
			local46.anInt556 += 2;
			local37.anInt556 += local46.method342() * local46.method342();
			local46.anInt556++;
		}
		this.anInt40 = local46.method340();
		this.anInt41 = local46.method340();
		this.anInt38 = local46.method342();
		this.anInt39 = local46.method342();
		@Pc(148) int local148 = local46.method340();
		@Pc(154) int local154 = this.anInt38 * this.anInt39;
		this.anIntArray3 = new int[local154];
		@Pc(162) int local162;
		if (local148 == 0) {
			for (local162 = 0; local162 < local154; local162++) {
				this.anIntArray3[local162] = local64[local37.method340()];
			}
		} else if (local148 == 1) {
			for (local162 = 0; local162 < this.anInt38; local162++) {
				for (@Pc(186) int local186 = 0; local186 < this.anInt39; local186++) {
					this.anIntArray3[local162 + local186 * this.anInt38] = local64[local37.method340()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!AIRMECOM", name = "b", descriptor = "(I)V")
	public void method37() {
		try {
			Class2_Sub1_Sub2.method473(this.anInt38, this.anInt39, this.anIntArray3);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("9679, " + -181 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AIRMECOM", name = "a", descriptor = "(IIIZ)V")
	public void method38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray3.length; local13++) {
				@Pc(20) int local20 = this.anIntArray3[local13];
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
					this.anIntArray3[local13] = (local28 << 16) + (local50 << 8) + local70;
				}
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("64497, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AIRMECOM", name = "b", descriptor = "(B)V")
	public void method39() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt42 * this.anInt43];
			for (@Pc(10) int local10 = 0; local10 < this.anInt39; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt38; local14++) {
					local8[(local10 + this.anInt41) * this.anInt42 + local14 + this.anInt40] = this.anIntArray3[local10 * this.anInt38 + local14];
				}
			}
			this.anIntArray3 = local8;
			this.anInt38 = this.anInt42;
			this.anInt39 = this.anInt43;
			this.anInt40 = 0;
			this.anInt41 = 0;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("22736, " + -18 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AIRMECOM", name = "a", descriptor = "(BII)V")
	public void method40(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt40;
			arg0 += this.anInt41;
			@Pc(15) int local15 = arg1 + arg0 * Class2_Sub1_Sub2.anInt710;
			@Pc(17) int local17 = 0;
			@Pc(31) int local31 = this.anInt39;
			@Pc(34) int local34 = this.anInt38;
			@Pc(38) int local38 = Class2_Sub1_Sub2.anInt710 - local34;
			@Pc(40) int local40 = 0;
			@Pc(47) int local47;
			if (arg0 < Class2_Sub1_Sub2.anInt712) {
				local47 = Class2_Sub1_Sub2.anInt712 - arg0;
				local31 -= local47;
				arg0 = Class2_Sub1_Sub2.anInt712;
				local17 = local47 * local34 + 0;
				local15 += local47 * Class2_Sub1_Sub2.anInt710;
			}
			if (arg0 + local31 > Class2_Sub1_Sub2.anInt713) {
				local31 -= arg0 + local31 - Class2_Sub1_Sub2.anInt713;
			}
			if (arg1 < Class2_Sub1_Sub2.anInt714) {
				local47 = Class2_Sub1_Sub2.anInt714 - arg1;
				local34 -= local47;
				arg1 = Class2_Sub1_Sub2.anInt714;
				local17 += local47;
				local15 += local47;
				local40 = local47 + 0;
				local38 += local47;
			}
			if (arg1 + local34 > Class2_Sub1_Sub2.anInt715) {
				local47 = arg1 + local34 - Class2_Sub1_Sub2.anInt715;
				local34 -= local47;
				local40 += local47;
				local38 += local47;
			}
			if (local34 > 0 && local31 > 0) {
				this.method41(local31, local15, local38, this.anIntArray3, local34, local40, Class2_Sub1_Sub2.anIntArray184, local17);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("11430, " + 3 + ", " + arg0 + ", " + arg1 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AIRMECOM", name = "a", descriptor = "(III[IIII[II)V")
	private void method41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(6) int local6 = -(arg4 >> 2);
			@Pc(18) int local18 = -(arg4 & 0x3);
			for (@Pc(21) int local21 = -arg0; local21 < 0; local21++) {
				for (@Pc(25) int local25 = local6; local25 < 0; local25++) {
					arg6[arg1++] = arg3[arg7++];
					arg6[arg1++] = arg3[arg7++];
					arg6[arg1++] = arg3[arg7++];
					arg6[arg1++] = arg3[arg7++];
				}
				for (@Pc(64) int local64 = local18; local64 < 0; local64++) {
					arg6[arg1++] = arg3[arg7++];
				}
				arg1 += arg2;
				arg7 += arg5;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("83334, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 4 + ", " + arg6 + ", " + arg7 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AIRMECOM", name = "b", descriptor = "(BII)V")
	public void method42(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt40;
			arg1 += this.anInt41;
			@Pc(21) int local21 = arg0 + arg1 * Class2_Sub1_Sub2.anInt710;
			@Pc(23) int local23 = 0;
			@Pc(26) int local26 = this.anInt39;
			@Pc(29) int local29 = this.anInt38;
			@Pc(33) int local33 = Class2_Sub1_Sub2.anInt710 - local29;
			@Pc(35) int local35 = 0;
			@Pc(42) int local42;
			if (arg1 < Class2_Sub1_Sub2.anInt712) {
				local42 = Class2_Sub1_Sub2.anInt712 - arg1;
				local26 -= local42;
				arg1 = Class2_Sub1_Sub2.anInt712;
				local23 = local42 * local29 + 0;
				local21 += local42 * Class2_Sub1_Sub2.anInt710;
			}
			if (arg1 + local26 > Class2_Sub1_Sub2.anInt713) {
				local26 -= arg1 + local26 - Class2_Sub1_Sub2.anInt713;
			}
			if (arg0 < Class2_Sub1_Sub2.anInt714) {
				local42 = Class2_Sub1_Sub2.anInt714 - arg0;
				local29 -= local42;
				arg0 = Class2_Sub1_Sub2.anInt714;
				local23 += local42;
				local21 += local42;
				local35 = local42 + 0;
				local33 += local42;
			}
			if (arg0 + local29 > Class2_Sub1_Sub2.anInt715) {
				local42 = arg0 + local29 - Class2_Sub1_Sub2.anInt715;
				local29 -= local42;
				local35 += local42;
				local33 += local42;
			}
			if (local29 > 0 && local26 > 0) {
				this.method43(Class2_Sub1_Sub2.anIntArray184, this.anIntArray3, local23, local21, local29, local26, local33, local35);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("38117, " + -91 + ", " + arg0 + ", " + arg1 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AIRMECOM", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method43(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!AIRMECOM", name = "a", descriptor = "(IIII)V")
	public void method44(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 == 0) {
				arg2 += this.anInt40;
				arg1 += this.anInt41;
				@Pc(18) int local18 = arg2 + arg1 * Class2_Sub1_Sub2.anInt710;
				@Pc(20) int local20 = 0;
				@Pc(23) int local23 = this.anInt39;
				@Pc(26) int local26 = this.anInt38;
				@Pc(30) int local30 = Class2_Sub1_Sub2.anInt710 - local26;
				@Pc(32) int local32 = 0;
				@Pc(39) int local39;
				if (arg1 < Class2_Sub1_Sub2.anInt712) {
					local39 = Class2_Sub1_Sub2.anInt712 - arg1;
					local23 -= local39;
					arg1 = Class2_Sub1_Sub2.anInt712;
					local20 = local39 * local26 + 0;
					local18 += local39 * Class2_Sub1_Sub2.anInt710;
				}
				if (arg1 + local23 > Class2_Sub1_Sub2.anInt713) {
					local23 -= arg1 + local23 - Class2_Sub1_Sub2.anInt713;
				}
				if (arg2 < Class2_Sub1_Sub2.anInt714) {
					local39 = Class2_Sub1_Sub2.anInt714 - arg2;
					local26 -= local39;
					arg2 = Class2_Sub1_Sub2.anInt714;
					local20 += local39;
					local18 += local39;
					local32 = local39 + 0;
					local30 += local39;
				}
				if (arg2 + local26 > Class2_Sub1_Sub2.anInt715) {
					local39 = arg2 + local26 - Class2_Sub1_Sub2.anInt715;
					local26 -= local39;
					local32 += local39;
					local30 += local39;
				}
				if (local26 > 0 && local23 > 0) {
					this.method45(this.aByte1, local32, local26, this.anIntArray3, local20, local18, Class2_Sub1_Sub2.anIntArray184, local23, 0, local30);
				}
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("6443, " + 128 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AIRMECOM", name = "a", descriptor = "(BII[IIII[IIII)V")
	private void method45(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			if (arg0 == 8) {
				@Pc(10) boolean local10 = false;
			} else {
				this.aBoolean14 = !this.aBoolean14;
			}
			for (@Pc(23) int local23 = -arg7; local23 < 0; local23++) {
				for (@Pc(28) int local28 = -arg2; local28 < 0; local28++) {
					@Pc(35) int local35 = arg3[arg4++];
					if (local35 == 0) {
						arg5++;
					} else {
						@Pc(41) int local41 = arg6[arg5];
						arg6[arg5++] = ((local35 & 0xFF00FF) * 128 + (local41 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local35 & 0xFF00) * 128 + (local41 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg5 += arg9;
				arg4 += arg1;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("17345, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 128 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AIRMECOM", name = "a", descriptor = "(III[III[IIIII)V")
	public void method46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(15) int local15 = -arg8 / 2;
				@Pc(20) int local20 = -arg6 / 2;
				@Pc(29) int local29 = (int) (Math.sin((double) arg0 / 326.11D) * 65536.0D);
				@Pc(38) int local38 = (int) (Math.cos((double) arg0 / 326.11D) * 65536.0D);
				@Pc(44) int local44 = local29 * arg4 >> 8;
				@Pc(50) int local50 = local38 * arg4 >> 8;
				@Pc(62) int local62 = (arg9 << 16) + local20 * local44 + local15 * local50;
				@Pc(74) int local74 = (arg7 << 16) + (local20 * local50 - local15 * local44);
				@Pc(80) int local80 = arg2 + arg1 * Class2_Sub1_Sub2.anInt710;
				for (@Pc(82) int local82 = 0; local82 < arg6; local82++) {
					@Pc(88) int local88 = arg5[local82];
					@Pc(92) int local92 = local80 + local88;
					@Pc(98) int local98 = local62 + local50 * local88;
					@Pc(104) int local104 = local74 - local44 * local88;
					for (@Pc(109) int local109 = -arg3[local82]; local109 < 0; local109++) {
						Class2_Sub1_Sub2.anIntArray184[local92++] = this.anIntArray3[(local98 >> 16) + (local104 >> 16) * this.anInt38];
						local98 += local50;
						local104 -= local44;
					}
					local62 += local44;
					local74 += local50;
					local80 += Class2_Sub1_Sub2.anInt710;
				}
			} catch (@Pc(157) Exception local157) {
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("41033, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 218 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AIRMECOM", name = "a", descriptor = "(IDIIIIIII)V")
	public void method47(@OriginalArg(1) double arg0, @OriginalArg(5) int arg1, @OriginalArg(8) int arg2) {
		try {
			try {
				@Pc(28) int local28 = (int) (Math.sin(arg0) * 65536.0D);
				@Pc(34) int local34 = (int) (Math.cos(arg0) * 65536.0D);
				@Pc(40) int local40 = local28 * 256 >> 8;
				@Pc(46) int local46 = local34 * 256 >> 8;
				@Pc(58) int local58 = local40 * -10 + local46 * -10 + 983040;
				@Pc(70) int local70 = local46 * -10 + 983040 - local40 * -10;
				@Pc(76) int local76 = arg2 + arg1 * Class2_Sub1_Sub2.anInt710;
				for (@Pc(78) int local78 = 0; local78 < 20; local78++) {
					@Pc(82) int local82 = local76;
					@Pc(84) int local84 = local58;
					@Pc(86) int local86 = local70;
					for (@Pc(89) int local89 = -20; local89 < 0; local89++) {
						@Pc(105) int local105 = this.anIntArray3[(local84 >> 16) + (local86 >> 16) * this.anInt38];
						if (local105 == 0) {
							local82++;
						} else {
							Class2_Sub1_Sub2.anIntArray184[local82++] = local105;
						}
						local84 += local46;
						local86 -= local40;
					}
					local58 += local40;
					local70 += local46;
					local76 += Class2_Sub1_Sub2.anInt710;
				}
			} catch (@Pc(144) Exception local144) {
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("8888, " + 20 + ", " + arg0 + ", " + 15 + ", " + 256 + ", " + 20 + ", " + arg1 + ", " + 15 + ", " + -637 + ", " + arg2 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AIRMECOM", name = "a", descriptor = "(IIILclient!OJMMOVXV;)V")
	public void method48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub1_Sub2_Sub3 arg3) {
		try {
			@Pc(4) int local4;
			if (arg2 != 7) {
				for (local4 = 1; local4 > 0; local4++) {
				}
			}
			arg0 += this.anInt40;
			arg1 += this.anInt41;
			local4 = arg0 + arg1 * Class2_Sub1_Sub2.anInt710;
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = this.anInt39;
			@Pc(33) int local33 = this.anInt38;
			@Pc(37) int local37 = Class2_Sub1_Sub2.anInt710 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg1 < Class2_Sub1_Sub2.anInt712) {
				local46 = Class2_Sub1_Sub2.anInt712 - arg1;
				local30 -= local46;
				arg1 = Class2_Sub1_Sub2.anInt712;
				local27 = local46 * local33 + 0;
				local4 += local46 * Class2_Sub1_Sub2.anInt710;
			}
			if (arg1 + local30 > Class2_Sub1_Sub2.anInt713) {
				local30 -= arg1 + local30 - Class2_Sub1_Sub2.anInt713;
			}
			if (arg0 < Class2_Sub1_Sub2.anInt714) {
				local46 = Class2_Sub1_Sub2.anInt714 - arg0;
				local33 -= local46;
				arg0 = Class2_Sub1_Sub2.anInt714;
				local27 += local46;
				local4 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg0 + local33 > Class2_Sub1_Sub2.anInt715) {
				local46 = arg0 + local33 - Class2_Sub1_Sub2.anInt715;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method49(local39, local33, local30, Class2_Sub1_Sub2.anIntArray184, arg3.aByteArray11, this.anIntArray3, local37, local4, local27, 0);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("51550, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AIRMECOM", name = "a", descriptor = "(III[I[B[IIIZII)V")
	private void method49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(6) int local6 = -(arg1 >> 2);
			@Pc(11) int local11 = -(arg1 & 0x3);
			for (@Pc(23) int local23 = -arg2; local23 < 0; local23++) {
				@Pc(34) int local34;
				for (@Pc(27) int local27 = local6; local27 < 0; local27++) {
					local34 = arg5[arg8++];
					if (local34 != 0 && arg4[arg7] == 0) {
						arg3[arg7++] = local34;
					} else {
						arg7++;
					}
					local34 = arg5[arg8++];
					if (local34 != 0 && arg4[arg7] == 0) {
						arg3[arg7++] = local34;
					} else {
						arg7++;
					}
					local34 = arg5[arg8++];
					if (local34 != 0 && arg4[arg7] == 0) {
						arg3[arg7++] = local34;
					} else {
						arg7++;
					}
					local34 = arg5[arg8++];
					if (local34 != 0 && arg4[arg7] == 0) {
						arg3[arg7++] = local34;
					} else {
						arg7++;
					}
				}
				for (@Pc(110) int local110 = local11; local110 < 0; local110++) {
					local34 = arg5[arg8++];
					if (local34 != 0 && arg4[arg7] == 0) {
						arg3[arg7++] = local34;
					} else {
						arg7++;
					}
				}
				arg7 += arg6;
				arg8 += arg0;
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("1784, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + false + ", " + arg8 + ", " + arg9 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}
}
