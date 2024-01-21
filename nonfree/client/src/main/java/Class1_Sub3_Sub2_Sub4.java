import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jb")
public final class Class1_Sub3_Sub2_Sub4 extends Class1_Sub3_Sub2 {

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "[I")
	private static int[] anIntArray185 = new int[256];

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
	private int anInt534 = 770;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "Z")
	private boolean aBoolean126 = false;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[94][];

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "[I")
	private int[] anIntArray179 = new int[94];

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "[I")
	private int[] anIntArray180 = new int[94];

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "[I")
	private int[] anIntArray181 = new int[94];

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "[I")
	private int[] anIntArray182 = new int[94];

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "[I")
	private int[] anIntArray183 = new int[95];

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "[I")
	private int[] anIntArray184 = new int[256];

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
	public int anInt535;

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

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!ub;ILjava/lang/String;)V")
	public Class1_Sub3_Sub2_Sub4(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		try {
			@Pc(59) Class1_Sub3_Sub3 local59 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, arg2 + ".dat"));
			@Pc(69) Class1_Sub3_Sub3 local69 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, "index.dat"));
			local69.anInt554 = local59.method393() + 4;
			@Pc(78) int local78 = local69.method391();
			if (local78 > 0) {
				local69.anInt554 += (local78 - 1) * 3;
			}
			@Pc(120) int local120;
			for (@Pc(98) int local98 = 0; local98 < 94; local98++) {
				this.anIntArray181[local98] = local69.method391();
				this.anIntArray182[local98] = local69.method391();
				local120 = this.anIntArray179[local98] = local69.method393();
				@Pc(128) int local128 = this.anIntArray180[local98] = local69.method393();
				@Pc(131) int local131 = local69.method391();
				@Pc(135) int local135 = local120 * local128;
				this.aByteArrayArray3[local98] = new byte[local135];
				@Pc(145) int local145;
				@Pc(170) int local170;
				if (local131 == 0) {
					for (local145 = 0; local145 < local135; local145++) {
						this.aByteArrayArray3[local98][local145] = local59.method392();
					}
				} else if (local131 == 1) {
					for (local145 = 0; local145 < local120; local145++) {
						for (local170 = 0; local170 < local128; local170++) {
							this.aByteArrayArray3[local98][local145 + local170 * local120] = local59.method392();
						}
					}
				}
				if (local128 > this.anInt535) {
					this.anInt535 = local128;
				}
				this.anIntArray181[local98] = 1;
				this.anIntArray183[local98] = local120 + 2;
				local145 = 0;
				for (local170 = local128 / 7; local170 < local128; local170++) {
					local145 += this.aByteArrayArray3[local98][local170 * local120];
				}
				@Pc(244) int local244;
				if (local145 <= local128 / 7) {
					local244 = this.anIntArray183[local98]--;
					this.anIntArray181[local98] = 0;
				}
				local145 = 0;
				for (@Pc(258) int local258 = local128 / 7; local258 < local128; local258++) {
					local145 += this.aByteArrayArray3[local98][local120 + local258 * local120 - 1];
				}
				if (local145 <= local128 / 7) {
					local244 = this.anIntArray183[local98]--;
				}
			}
			this.anIntArray183[94] = this.anIntArray183[8];
			for (local120 = 0; local120 < 256; local120++) {
				this.anIntArray184[local120] = this.anIntArray183[anIntArray185[local120]];
			}
		} catch (@Pc(329) RuntimeException local329) {
			signlink.reporterror("19, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local329.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public void method362(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		try {
			this.method365(arg1, arg2, arg3, arg0 - this.method364(arg2) / 2);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("77773, " + -83 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;ZIIBI)V")
	public void method363(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.method367(arg4, arg3 - this.method364(arg0) / 2, arg1, arg2, arg0);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("14073, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -58 + ", " + arg4 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method364(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(23) int local23 = 0; local23 < arg0.length(); local23++) {
				if (arg0.charAt(local23) == '@' && local23 + 4 < arg0.length() && arg0.charAt(local23 + 4) == '@') {
					local23 += 4;
				} else {
					local7 += this.anIntArray184[arg0.charAt(local23)];
				}
			}
			return local7;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("73247, " + 6 + ", " + arg0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public void method365(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 != null) {
				@Pc(9) int local9 = arg0 - this.anInt535;
				for (@Pc(20) int local20 = 0; local20 < arg1.length(); local20++) {
					@Pc(28) int local28 = anIntArray185[arg1.charAt(local20)];
					if (local28 != 94) {
						this.method370(this.aByteArrayArray3[local28], arg3 + this.anIntArray181[local28], local9 + this.anIntArray182[local28], this.anIntArray179[local28], this.anIntArray180[local28], arg2);
					}
					arg3 += this.anIntArray183[local28];
				}
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("10732, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILjava/lang/String;IIZ)V")
	public void method366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg2 != null) {
				arg1 -= this.method364(arg2) / 2;
				@Pc(16) int local16 = arg0 - this.anInt535;
				for (@Pc(21) int local21 = 0; local21 < arg2.length(); local21++) {
					@Pc(29) int local29 = anIntArray185[arg2.charAt(local21)];
					if (local29 != 94) {
						this.method370(this.aByteArrayArray3[local29], arg1 + this.anIntArray181[local29], local16 + this.anIntArray182[local29] + (int) (Math.sin((double) local21 / 2.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray179[local29], this.anIntArray180[local29], arg3);
					}
					arg1 += this.anIntArray183[local29];
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("42614, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIZILjava/lang/String;)V")
	public void method367(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			if (arg4 != null) {
				@Pc(12) int local12 = arg0 - this.anInt535;
				for (@Pc(14) int local14 = 0; local14 < arg4.length(); local14++) {
					if (arg4.charAt(local14) == '@' && local14 + 4 < arg4.length() && arg4.charAt(local14 + 4) == '@') {
						arg3 = this.method369(arg4.substring(local14 + 1, local14 + 4));
						local14 += 4;
					} else {
						@Pc(55) int local55 = anIntArray185[arg4.charAt(local14)];
						if (local55 != 94) {
							if (arg2) {
								this.method370(this.aByteArrayArray3[local55], arg1 + this.anIntArray181[local55] + 1, local12 + this.anIntArray182[local55] + 1, this.anIntArray179[local55], this.anIntArray180[local55], 0);
							}
							this.method370(this.aByteArrayArray3[local55], arg1 + this.anIntArray181[local55], local12 + this.anIntArray182[local55], this.anIntArray179[local55], this.anIntArray180[local55], arg3);
						}
						arg1 += this.anIntArray183[local55];
					}
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("58025, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIILjava/lang/String;IZI)V")
	public void method368(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg2 != null) {
				this.aRandom1.setSeed((long) arg3);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(22) int local22 = 15 - this.anInt535;
				for (@Pc(24) int local24 = 0; local24 < arg2.length(); local24++) {
					if (arg2.charAt(local24) == '@' && local24 + 4 < arg2.length() && arg2.charAt(local24 + 4) == '@') {
						arg1 = this.method369(arg2.substring(local24 + 1, local24 + 4));
						local24 += 4;
					} else {
						@Pc(65) int local65 = anIntArray185[arg2.charAt(local24)];
						if (local65 != 94) {
							this.method372(192, local22 + this.anIntArray182[local65] + 1, this.anIntArray179[local65], arg4 + this.anIntArray181[local65] + 1, 0, this.anIntArray180[local65], this.aByteArrayArray3[local65]);
							this.method372(local17, local22 + this.anIntArray182[local65], this.anIntArray179[local65], arg4 + this.anIntArray181[local65], arg1, this.anIntArray180[local65], this.aByteArrayArray3[local65]);
						}
						arg4 += this.anIntArray183[local65];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg4++;
						}
					}
				}
			}
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("58064, " + -13789 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;B)I")
	private int method369(@OriginalArg(0) String arg0) {
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
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("97273, " + arg0 + ", " + 7 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([BIIIII)V")
	private void method370(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub3_Sub2.anInt524;
		@Pc(9) int local9 = Class1_Sub3_Sub2.anInt524 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub3_Sub2.anInt526) {
			local20 = Class1_Sub3_Sub2.anInt526 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub3_Sub2.anInt526;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub3_Sub2.anInt524;
		}
		if (arg2 + arg4 >= Class1_Sub3_Sub2.anInt527) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub3_Sub2.anInt527;
		}
		if (arg1 < Class1_Sub3_Sub2.anInt528) {
			local20 = Class1_Sub3_Sub2.anInt528 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub3_Sub2.anInt528;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub3_Sub2.anInt529) {
			local20 = arg1 + arg3 + 1 - Class1_Sub3_Sub2.anInt529;
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

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIII[B)V")
	private void method372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6) {
		try {
			@Pc(5) int local5 = arg3 + arg1 * Class1_Sub3_Sub2.anInt524;
			@Pc(9) int local9 = Class1_Sub3_Sub2.anInt524 - arg2;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(24) int local24;
			if (arg1 < Class1_Sub3_Sub2.anInt526) {
				local24 = Class1_Sub3_Sub2.anInt526 - arg1;
				arg5 -= local24;
				arg1 = Class1_Sub3_Sub2.anInt526;
				local13 = local24 * arg2 + 0;
				local5 += local24 * Class1_Sub3_Sub2.anInt524;
			}
			if (arg1 + arg5 >= Class1_Sub3_Sub2.anInt527) {
				arg5 -= arg1 + arg5 + 1 - Class1_Sub3_Sub2.anInt527;
			}
			if (arg3 < Class1_Sub3_Sub2.anInt528) {
				local24 = Class1_Sub3_Sub2.anInt528 - arg3;
				arg2 -= local24;
				arg3 = Class1_Sub3_Sub2.anInt528;
				local13 += local24;
				local5 += local24;
				local11 = local24 + 0;
				local9 += local24;
			}
			if (arg3 + arg2 >= Class1_Sub3_Sub2.anInt529) {
				local24 = arg3 + arg2 + 1 - Class1_Sub3_Sub2.anInt529;
				arg2 -= local24;
				local11 += local24;
				local9 += local24;
			}
			if (arg2 > 0 && arg5 > 0) {
				this.method373(arg2, local11, arg4, local9, arg5, local13, Class1_Sub3_Sub2.anIntArray178, local5, arg6, arg0);
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("7387, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 3181 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIII[IIZ[BI)V")
	private void method373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) byte[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
			@Pc(23) int local23 = 256 - arg9;
			for (@Pc(26) int local26 = -arg4; local26 < 0; local26++) {
				for (@Pc(31) int local31 = -arg0; local31 < 0; local31++) {
					if (arg8[arg5++] == 0) {
						arg7++;
					} else {
						@Pc(42) int local42 = arg6[arg7];
						arg6[arg7++] = (((local42 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local42 & 0xFF00) * local23 & 0xFF0000) >> 8) + local19;
					}
				}
				arg7 += arg3;
				arg5 += arg1;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("71116, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + true + ", " + arg8 + ", " + arg9 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}
}
