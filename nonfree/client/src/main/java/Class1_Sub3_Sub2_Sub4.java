import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jb")
public final class Class1_Sub3_Sub2_Sub4 extends Class1_Sub3_Sub2 {

	@OriginalMember(owner = "client!jb", name = "K", descriptor = "[I")
	private static int[] anIntArray185 = new int[256];

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "Z")
	private boolean aBoolean124 = true;

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "B")
	private byte aByte26 = 8;

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "B")
	private byte aByte27 = 6;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "B")
	private byte aByte28 = 2;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
	private int anInt538 = -708;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
	private int anInt539 = 997;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[94][];

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "[I")
	private int[] anIntArray179 = new int[94];

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "[I")
	private int[] anIntArray180 = new int[94];

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "[I")
	private int[] anIntArray181 = new int[94];

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "[I")
	private int[] anIntArray182 = new int[94];

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "[I")
	private int[] anIntArray183 = new int[95];

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "[I")
	private int[] anIntArray184 = new int[256];

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
	public int anInt540;

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

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!ub;Ljava/lang/String;I)V")
	public Class1_Sub3_Sub2_Sub4(@OriginalArg(0) Class39 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(71) Class1_Sub3_Sub3 local71 = new Class1_Sub3_Sub3(363, arg0.method536(arg1 + ".dat", null));
			@Pc(81) Class1_Sub3_Sub3 local81 = new Class1_Sub3_Sub3(363, arg0.method536("index.dat", null));
			local81.anInt561 = local71.method393() + 4;
			@Pc(90) int local90 = local81.method391();
			if (local90 > 0) {
				local81.anInt561 += (local90 - 1) * 3;
			}
			@Pc(131) int local131;
			for (@Pc(104) int local104 = 0; local104 < 94; local104++) {
				this.anIntArray181[local104] = local81.method391();
				this.anIntArray182[local104] = local81.method391();
				local131 = this.anIntArray179[local104] = local81.method393();
				@Pc(139) int local139 = this.anIntArray180[local104] = local81.method393();
				@Pc(142) int local142 = local81.method391();
				@Pc(146) int local146 = local131 * local139;
				this.aByteArrayArray3[local104] = new byte[local146];
				@Pc(156) int local156;
				@Pc(181) int local181;
				if (local142 == 0) {
					for (local156 = 0; local156 < local146; local156++) {
						this.aByteArrayArray3[local104][local156] = local71.method392();
					}
				} else if (local142 == 1) {
					for (local156 = 0; local156 < local131; local156++) {
						for (local181 = 0; local181 < local139; local181++) {
							this.aByteArrayArray3[local104][local156 + local181 * local131] = local71.method392();
						}
					}
				}
				if (local139 > this.anInt540) {
					this.anInt540 = local139;
				}
				this.anIntArray181[local104] = 1;
				this.anIntArray183[local104] = local131 + 2;
				local156 = 0;
				for (local181 = local139 / 7; local181 < local139; local181++) {
					local156 += this.aByteArrayArray3[local104][local181 * local131];
				}
				@Pc(255) int local255;
				if (local156 <= local139 / 7) {
					local255 = this.anIntArray183[local104]--;
					this.anIntArray181[local104] = 0;
				}
				local156 = 0;
				for (@Pc(269) int local269 = local139 / 7; local269 < local139; local269++) {
					local156 += this.aByteArrayArray3[local104][local131 + local269 * local131 - 1];
				}
				if (local156 <= local139 / 7) {
					local255 = this.anIntArray183[local104]--;
				}
			}
			@Pc(311) int local311 = 9 / arg2;
			this.anIntArray183[94] = this.anIntArray183[8];
			for (local131 = 0; local131 < 256; local131++) {
				this.anIntArray184[local131] = this.anIntArray183[anIntArray185[local131]];
			}
		} catch (@Pc(339) RuntimeException local339) {
			signlink.reporterror("26392, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local339.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBILjava/lang/String;I)V")
	public void method362(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		try {
			this.method365(arg3 - this.method364(arg2) / 2, arg0, arg1, arg2);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("38285, " + arg0 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZILjava/lang/String;I)V")
	public void method363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		try {
			this.method367(arg0 - this.method364(arg4) / 2, arg3, arg4, arg2, arg1);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("53756, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method364(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(14) int local14 = 0; local14 < arg0.length(); local14++) {
				if (arg0.charAt(local14) == '@' && local14 + 4 < arg0.length() && arg0.charAt(local14 + 4) == '@') {
					local14 += 4;
				} else {
					local7 += this.anIntArray184[arg0.charAt(local14)];
				}
			}
			return local7;
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("24781, " + false + ", " + arg0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZILjava/lang/String;)V")
	public void method365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			if (arg3 != null) {
				@Pc(7) int local7 = arg1 - this.anInt540;
				for (@Pc(19) int local19 = 0; local19 < arg3.length(); local19++) {
					@Pc(27) int local27 = anIntArray185[arg3.charAt(local19)];
					if (local27 != 94) {
						this.method370(this.aByteArrayArray3[local27], arg0 + this.anIntArray181[local27], local7 + this.anIntArray182[local27], this.anIntArray179[local27], this.anIntArray180[local27], arg2);
					}
					arg0 += this.anIntArray183[local27];
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("10686, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBIIILjava/lang/String;)V")
	public void method366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			if (arg4 != null) {
				arg1 -= this.method364(arg4) / 2;
				@Pc(18) int local18 = arg2 - this.anInt540;
				@Pc(24) int local24;
				if (this.aByte26 != 8) {
					for (local24 = 1; local24 > 0; local24++) {
					}
				}
				for (local24 = 0; local24 < arg4.length(); local24++) {
					@Pc(39) int local39 = anIntArray185[arg4.charAt(local24)];
					if (local39 != 94) {
						this.method370(this.aByteArrayArray3[local39], arg1 + this.anIntArray181[local39], local18 + this.anIntArray182[local39] + (int) (Math.sin((double) local24 / 2.0D + (double) arg0 / 5.0D) * 5.0D), this.anIntArray179[local39], this.anIntArray180[local39], arg3);
					}
					arg1 += this.anIntArray183[local39];
				}
			}
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("9153, " + arg0 + ", " + 8 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIILjava/lang/String;ZI)V")
	public void method367(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 != null) {
				@Pc(9) int local9 = arg1 - this.anInt540;
				for (@Pc(11) int local11 = 0; local11 < arg2.length(); local11++) {
					if (arg2.charAt(local11) == '@' && local11 + 4 < arg2.length() && arg2.charAt(local11 + 4) == '@') {
						arg4 = this.method369(arg2.substring(local11 + 1, local11 + 4));
						local11 += 4;
					} else {
						@Pc(52) int local52 = anIntArray185[arg2.charAt(local11)];
						if (local52 != 94) {
							if (arg3) {
								this.method370(this.aByteArrayArray3[local52], arg0 + this.anIntArray181[local52] + 1, local9 + this.anIntArray182[local52] + 1, this.anIntArray179[local52], this.anIntArray180[local52], 0);
							}
							this.method370(this.aByteArrayArray3[local52], arg0 + this.anIntArray181[local52], local9 + this.anIntArray182[local52], this.anIntArray179[local52], this.anIntArray180[local52], arg4);
						}
						arg0 += this.anIntArray183[local52];
					}
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("2788, " + arg0 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZBIILjava/lang/String;I)V")
	public void method368(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg3 != null) {
				this.aRandom1.setSeed((long) arg0);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(22) int local22 = 15 - this.anInt540;
				for (@Pc(30) int local30 = 0; local30 < arg3.length(); local30++) {
					if (arg3.charAt(local30) == '@' && local30 + 4 < arg3.length() && arg3.charAt(local30 + 4) == '@') {
						arg2 = this.method369(arg3.substring(local30 + 1, local30 + 4));
						local30 += 4;
					} else {
						@Pc(71) int local71 = anIntArray185[arg3.charAt(local30)];
						if (local71 != 94) {
							this.method372(this.aByteArrayArray3[local71], arg4 + this.anIntArray181[local71] + 1, this.anIntArray180[local71], 0, local22 + this.anIntArray182[local71] + 1, 192, this.anIntArray179[local71]);
							this.method372(this.aByteArrayArray3[local71], arg4 + this.anIntArray181[local71], this.anIntArray180[local71], arg2, local22 + this.anIntArray182[local71], local17, this.anIntArray179[local71]);
						}
						arg4 += this.anIntArray183[local71];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg4++;
						}
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("44689, " + arg0 + ", " + true + ", " + -121 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILjava/lang/String;)I")
	private int method369(@OriginalArg(1) String arg0) {
		try {
			if (arg0.equals("red")) {
				return 16711680;
			} else if (arg0.equals("gre")) {
				return 65280;
			} else if (arg0.equals("blu")) {
				return 255;
			} else if (arg0.equals("yel")) {
				return 16776960;
			} else if (arg0.equals("cya")) {
				return 65535;
			} else if (arg0.equals("mag")) {
				return 16711935;
			} else if (arg0.equals("whi")) {
				return 16777215;
			} else if (arg0.equals("bla")) {
				return 0;
			} else if (arg0.equals("lre")) {
				return 16748608;
			} else if (arg0.equals("dre")) {
				return 8388608;
			} else if (arg0.equals("dbl")) {
				return 128;
			} else if (arg0.equals("or1")) {
				return 16756736;
			} else if (arg0.equals("or2")) {
				return 16740352;
			} else if (arg0.equals("or3")) {
				return 16723968;
			} else if (arg0.equals("gr1")) {
				return 12648192;
			} else if (arg0.equals("gr2")) {
				return 8453888;
			} else if (arg0.equals("gr3")) {
				return 4259584;
			} else {
				return 0;
			}
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("82682, " + 0 + ", " + arg0 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([BIIIII)V")
	private void method370(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub3_Sub2.anInt528;
		@Pc(9) int local9 = Class1_Sub3_Sub2.anInt528 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub3_Sub2.anInt530) {
			local20 = Class1_Sub3_Sub2.anInt530 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub3_Sub2.anInt530;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub3_Sub2.anInt528;
		}
		if (arg2 + arg4 >= Class1_Sub3_Sub2.anInt531) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub3_Sub2.anInt531;
		}
		if (arg1 < Class1_Sub3_Sub2.anInt532) {
			local20 = Class1_Sub3_Sub2.anInt532 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub3_Sub2.anInt532;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub3_Sub2.anInt533) {
			local20 = arg1 + arg3 + 1 - Class1_Sub3_Sub2.anInt533;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method371(Class1_Sub3_Sub2.anIntArray178, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method371(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([BBIIIIII)V")
	private void method372(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (this.aByte27 == 6) {
				@Pc(10) int local10 = arg1 + arg4 * Class1_Sub3_Sub2.anInt528;
				@Pc(14) int local14 = Class1_Sub3_Sub2.anInt528 - arg6;
				@Pc(16) int local16 = 0;
				@Pc(18) int local18 = 0;
				@Pc(25) int local25;
				if (arg4 < Class1_Sub3_Sub2.anInt530) {
					local25 = Class1_Sub3_Sub2.anInt530 - arg4;
					arg2 -= local25;
					arg4 = Class1_Sub3_Sub2.anInt530;
					local18 = local25 * arg6 + 0;
					local10 += local25 * Class1_Sub3_Sub2.anInt528;
				}
				if (arg4 + arg2 >= Class1_Sub3_Sub2.anInt531) {
					arg2 -= arg4 + arg2 + 1 - Class1_Sub3_Sub2.anInt531;
				}
				if (arg1 < Class1_Sub3_Sub2.anInt532) {
					local25 = Class1_Sub3_Sub2.anInt532 - arg1;
					arg6 -= local25;
					arg1 = Class1_Sub3_Sub2.anInt532;
					local18 += local25;
					local10 += local25;
					local16 = local25 + 0;
					local14 += local25;
				}
				if (arg1 + arg6 >= Class1_Sub3_Sub2.anInt533) {
					local25 = arg1 + arg6 + 1 - Class1_Sub3_Sub2.anInt533;
					arg6 -= local25;
					local16 += local25;
					local14 += local25;
				}
				if (arg6 > 0 && arg2 > 0) {
					this.method373(arg2, local10, arg6, Class1_Sub3_Sub2.anIntArray178, arg0, arg5, local18, local14, local16, (byte) 2, arg3);
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("13931, " + arg0 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III[I[BIIIIBI)V")
	private void method373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(19) int local19 = ((arg10 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((arg10 & 0xFF00) * arg5 & 0xFF0000) >> 8;
			@Pc(29) int local29;
			if (this.aByte28 == 2) {
				@Pc(25) boolean local25 = false;
			} else {
				for (local29 = 1; local29 > 0; local29++) {
				}
			}
			@Pc(38) int local38 = 256 - arg5;
			for (local29 = -arg0; local29 < 0; local29++) {
				for (@Pc(46) int local46 = -arg2; local46 < 0; local46++) {
					if (arg4[arg6++] == 0) {
						arg1++;
					} else {
						@Pc(57) int local57 = arg3[arg1];
						arg3[arg1++] = (((local57 & 0xFF00FF) * local38 & 0xFF00FF00) + ((local57 & 0xFF00) * local38 & 0xFF0000) >> 8) + local19;
					}
				}
				arg1 += arg7;
				arg6 += arg8;
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("64154, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}
}
