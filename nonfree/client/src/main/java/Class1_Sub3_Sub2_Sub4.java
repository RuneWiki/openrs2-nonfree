import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jb")
public final class Class1_Sub3_Sub2_Sub4 extends Class1_Sub3_Sub2 {

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "[I")
	private static int[] anIntArray185 = new int[256];

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "Z")
	private boolean aBoolean125 = false;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
	private int anInt542 = 958;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "Z")
	private boolean aBoolean126 = true;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[94][];

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "[I")
	private int[] anIntArray179 = new int[94];

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "[I")
	private int[] anIntArray180 = new int[94];

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "[I")
	private int[] anIntArray181 = new int[94];

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "[I")
	private int[] anIntArray182 = new int[94];

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "[I")
	private int[] anIntArray183 = new int[95];

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "[I")
	private int[] anIntArray184 = new int[256];

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
	public int anInt543;

	static {
		@Pc(4) String local4 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(11) int local11 = local4.indexOf(local6);
			if (local11 == -1) {
				local11 = 74;
			}
			anIntArray185[local6] = local11;
		}
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Ljava/lang/String;ILclient!ub;)V")
	public Class1_Sub3_Sub2_Sub4(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class39 arg2) {
		try {
			@Pc(57) Class1_Sub3_Sub3 local57 = new Class1_Sub3_Sub3(0, arg2.method528(arg0 + ".dat", null));
			@Pc(67) Class1_Sub3_Sub3 local67 = new Class1_Sub3_Sub3(0, arg2.method528("index.dat", null));
			local67.anInt566 = local57.method385() + 4;
			@Pc(76) int local76 = local67.method383();
			if (local76 > 0) {
				local67.anInt566 += (local76 - 1) * 3;
			}
			@Pc(112) int local112;
			for (@Pc(90) int local90 = 0; local90 < 94; local90++) {
				this.anIntArray181[local90] = local67.method383();
				this.anIntArray182[local90] = local67.method383();
				local112 = this.anIntArray179[local90] = local67.method385();
				@Pc(120) int local120 = this.anIntArray180[local90] = local67.method385();
				@Pc(123) int local123 = local67.method383();
				@Pc(127) int local127 = local112 * local120;
				this.aByteArrayArray3[local90] = new byte[local127];
				@Pc(137) int local137;
				@Pc(162) int local162;
				if (local123 == 0) {
					for (local137 = 0; local137 < local127; local137++) {
						this.aByteArrayArray3[local90][local137] = local57.method384();
					}
				} else if (local123 == 1) {
					for (local137 = 0; local137 < local112; local137++) {
						for (local162 = 0; local162 < local120; local162++) {
							this.aByteArrayArray3[local90][local137 + local162 * local112] = local57.method384();
						}
					}
				}
				if (local120 > this.anInt543) {
					this.anInt543 = local120;
				}
				this.anIntArray181[local90] = 1;
				this.anIntArray183[local90] = local112 + 2;
				local137 = 0;
				for (local162 = local120 / 7; local162 < local120; local162++) {
					local137 += this.aByteArrayArray3[local90][local162 * local112];
				}
				@Pc(236) int local236;
				if (local137 <= local120 / 7) {
					local236 = this.anIntArray183[local90]--;
					this.anIntArray181[local90] = 0;
				}
				local137 = 0;
				for (@Pc(250) int local250 = local120 / 7; local250 < local120; local250++) {
					local137 += this.aByteArrayArray3[local90][local112 + local250 * local112 - 1];
				}
				if (local137 <= local120 / 7) {
					local236 = this.anIntArray183[local90]--;
				}
			}
			this.anIntArray183[94] = this.anIntArray183[8];
			for (local112 = 0; local112 < 256; local112++) {
				this.anIntArray184[local112] = this.anIntArray183[anIntArray185[local112]];
			}
		} catch (@Pc(327) RuntimeException local327) {
			signlink.reporterror("4169, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local327.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public void method358(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		try {
			this.method361(arg0 - this.method360(arg2) / 2, arg3, arg2, arg1);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("84700, " + 12097 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILjava/lang/String;ZIBI)V")
	public void method359(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.method363(arg4 - this.method360(arg1) / 2, arg3, arg0, arg1, arg2);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("59344, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 62 + ", " + arg4 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method360(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
				if (arg0.charAt(local9) == '@' && local9 + 4 < arg0.length() && arg0.charAt(local9 + 4) == '@') {
					local9 += 4;
				} else {
					local7 += this.anIntArray184[arg0.charAt(local9)];
				}
			}
			return local7;
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("57320, " + arg0 + ", " + true + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIBLjava/lang/String;I)V")
	public void method361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 != null) {
				@Pc(11) int local11 = arg3 - this.anInt543;
				for (@Pc(13) int local13 = 0; local13 < arg2.length(); local13++) {
					@Pc(21) int local21 = anIntArray185[arg2.charAt(local13)];
					if (local21 != 94) {
						this.method364(this.aByteArrayArray3[local21], arg0 + this.anIntArray181[local21], local11 + this.anIntArray182[local21], this.anIntArray179[local21], this.anIntArray180[local21], arg1);
					}
					arg0 += this.anIntArray183[local21];
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("3505, " + arg0 + ", " + arg1 + ", " + 6 + ", " + arg2 + ", " + arg3 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public void method362(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 != null) {
				arg0 -= this.method360(arg2) / 2;
				@Pc(19) int local19 = arg1 - this.anInt543;
				for (@Pc(21) int local21 = 0; local21 < arg2.length(); local21++) {
					@Pc(29) int local29 = anIntArray185[arg2.charAt(local21)];
					if (local29 != 94) {
						this.method364(this.aByteArrayArray3[local29], arg0 + this.anIntArray181[local29], local19 + this.anIntArray182[local29] + (int) (Math.sin((double) local21 / 2.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray179[local29], this.anIntArray180[local29], arg4);
					}
					arg0 += this.anIntArray183[local29];
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("3914, " + 431 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIILjava/lang/String;IZ)V")
	public void method363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) boolean arg4) {
		try {
			if (arg3 != null) {
				@Pc(9) int local9 = arg2 - this.anInt543;
				for (@Pc(21) int local21 = 0; local21 < arg3.length(); local21++) {
					if (arg3.charAt(local21) == '@' && local21 + 4 < arg3.length() && arg3.charAt(local21 + 4) == '@') {
						@Pc(50) String local50 = arg3.substring(local21 + 1, local21 + 4);
						if (local50.equals("red")) {
							arg1 = 16711680;
						}
						if (local50.equals("gre")) {
							arg1 = 65280;
						}
						if (local50.equals("blu")) {
							arg1 = 255;
						}
						if (local50.equals("yel")) {
							arg1 = 16776960;
						}
						if (local50.equals("cya")) {
							arg1 = 65535;
						}
						if (local50.equals("mag")) {
							arg1 = 16711935;
						}
						if (local50.equals("whi")) {
							arg1 = 16777215;
						}
						if (local50.equals("bla")) {
							arg1 = 0;
						}
						if (local50.equals("lre")) {
							arg1 = 16748608;
						}
						if (local50.equals("dre")) {
							arg1 = 8388608;
						}
						if (local50.equals("dbl")) {
							arg1 = 128;
						}
						if (local50.equals("or1")) {
							arg1 = 16756736;
						}
						if (local50.equals("or2")) {
							arg1 = 16740352;
						}
						if (local50.equals("or3")) {
							arg1 = 16723968;
						}
						if (local50.equals("gr1")) {
							arg1 = 12648192;
						}
						if (local50.equals("gr2")) {
							arg1 = 8453888;
						}
						if (local50.equals("gr3")) {
							arg1 = 4259584;
						}
						local21 += 4;
					} else {
						@Pc(161) int local161 = anIntArray185[arg3.charAt(local21)];
						if (local161 != 94) {
							if (arg4) {
								this.method364(this.aByteArrayArray3[local161], arg0 + this.anIntArray181[local161] + 1, local9 + this.anIntArray182[local161] + 1, this.anIntArray179[local161], this.anIntArray180[local161], 0);
							}
							this.method364(this.aByteArrayArray3[local161], arg0 + this.anIntArray181[local161], local9 + this.anIntArray182[local161], this.anIntArray179[local161], this.anIntArray180[local161], arg1);
						}
						arg0 += this.anIntArray183[local161];
					}
				}
			}
		} catch (@Pc(238) RuntimeException local238) {
			signlink.reporterror("8093, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + local238.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([BIIIII)V")
	private void method364(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub3_Sub2.anInt532;
		@Pc(9) int local9 = Class1_Sub3_Sub2.anInt532 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub3_Sub2.anInt534) {
			local20 = Class1_Sub3_Sub2.anInt534 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub3_Sub2.anInt534;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub3_Sub2.anInt532;
		}
		if (arg2 + arg4 >= Class1_Sub3_Sub2.anInt535) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub3_Sub2.anInt535;
		}
		if (arg1 < Class1_Sub3_Sub2.anInt536) {
			local20 = Class1_Sub3_Sub2.anInt536 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub3_Sub2.anInt536;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub3_Sub2.anInt537) {
			local20 = arg1 + arg3 + 1 - Class1_Sub3_Sub2.anInt537;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method365(Class1_Sub3_Sub2.anIntArray178, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method365(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(6) int local6 = -(arg5 >> 2);
		@Pc(11) int local11 = -(arg5 & 0x3);
		for (@Pc(14) int local14 = -arg6; local14 < 0; local14++) {
			for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			for (@Pc(77) int local77 = local11; local77 < 0; local77++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}
}
