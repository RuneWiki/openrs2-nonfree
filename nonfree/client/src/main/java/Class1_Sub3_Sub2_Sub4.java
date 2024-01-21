import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jb")
public final class Class1_Sub3_Sub2_Sub4 extends Class1_Sub3_Sub2 {

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "[I")
	private static int[] anIntArray185 = new int[256];

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "Z")
	private boolean aBoolean139 = true;

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

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
	public int anInt518;

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
	private int anInt517;

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

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!ub;I)V")
	public Class1_Sub3_Sub2_Sub4(@OriginalArg(0) String arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(52) Class1_Sub3_Sub3 local52 = new Class1_Sub3_Sub3(arg1.method516(arg0 + ".dat", null), this.aBoolean139);
			@Pc(63) Class1_Sub3_Sub3 local63 = new Class1_Sub3_Sub3(arg1.method516("index.dat", null), this.aBoolean139);
			local63.anInt539 = local52.method374() + 4;
			@Pc(72) int local72 = local63.method372();
			if (local72 > 0) {
				local63.anInt539 += (local72 - 1) * 3;
			}
			@Pc(108) int local108;
			for (@Pc(86) int local86 = 0; local86 < 94; local86++) {
				this.anIntArray181[local86] = local63.method372();
				this.anIntArray182[local86] = local63.method372();
				local108 = this.anIntArray179[local86] = local63.method374();
				@Pc(116) int local116 = this.anIntArray180[local86] = local63.method374();
				@Pc(119) int local119 = local63.method372();
				@Pc(123) int local123 = local108 * local116;
				this.aByteArrayArray3[local86] = new byte[local123];
				@Pc(133) int local133;
				@Pc(158) int local158;
				if (local119 == 0) {
					for (local133 = 0; local133 < local123; local133++) {
						this.aByteArrayArray3[local86][local133] = local52.method373();
					}
				} else if (local119 == 1) {
					for (local133 = 0; local133 < local108; local133++) {
						for (local158 = 0; local158 < local116; local158++) {
							this.aByteArrayArray3[local86][local133 + local158 * local108] = local52.method373();
						}
					}
				}
				if (local116 > this.anInt518) {
					this.anInt518 = local116;
				}
				this.anIntArray181[local86] = 1;
				this.anIntArray183[local86] = local108 + 2;
				local133 = 0;
				for (local158 = local116 / 7; local158 < local116; local158++) {
					local133 += this.aByteArrayArray3[local86][local158 * local108];
				}
				@Pc(232) int local232;
				if (local133 <= local116 / 7) {
					local232 = this.anIntArray183[local86]--;
					this.anIntArray181[local86] = 0;
				}
				local133 = 0;
				for (@Pc(246) int local246 = local116 / 7; local246 < local116; local246++) {
					local133 += this.aByteArrayArray3[local86][local108 + local246 * local108 - 1];
				}
				if (local133 <= local116 / 7) {
					local232 = this.anIntArray183[local86]--;
				}
			}
			this.anIntArray183[94] = this.anIntArray183[8];
			for (local108 = 0; local108 < 256; local108++) {
				this.anIntArray184[local108] = this.anIntArray183[anIntArray185[local108]];
			}
		} catch (@Pc(318) RuntimeException local318) {
			signlink.reporterror("31663, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local318.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;IIBI)V")
	public void method347(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			this.method350(arg0, arg2 - this.method349(arg0) / 2, arg1, arg3);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("49689, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + ", " + arg3 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILjava/lang/String;ZIZI)V")
	public void method348(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			this.method352(arg3, arg2, arg4 - this.method349(arg1) / 2, arg0, arg1);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("93113, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method349(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(12) int local12 = 0;
			for (@Pc(14) int local14 = 0; local14 < arg0.length(); local14++) {
				if (arg0.charAt(local14) == '@' && local14 + 4 < arg0.length() && arg0.charAt(local14 + 4) == '@') {
					local14 += 4;
				} else {
					local12 += this.anIntArray184[arg0.charAt(local14)];
				}
			}
			return local12;
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("37120, " + ", " + arg0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public void method350(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 != null) {
				@Pc(9) int local9 = arg2 - this.anInt518;
				for (@Pc(16) int local16 = 0; local16 < arg0.length(); local16++) {
					@Pc(24) int local24 = anIntArray185[arg0.charAt(local16)];
					if (local24 != 94) {
						this.method353(this.aByteArrayArray3[local24], arg1 + this.anIntArray181[local24], local9 + this.anIntArray182[local24], this.anIntArray179[local24], this.anIntArray180[local24], arg3);
					}
					arg1 += this.anIntArray183[local24];
				}
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("98933, " + arg0 + ", " + arg1 + ", " + -729 + ", " + arg2 + ", " + arg3 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public void method351(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg0 != null) {
				arg1 -= this.method349(arg0) / 2;
				@Pc(16) int local16 = arg2 - this.anInt518;
				if (arg4 == 0) {
					for (@Pc(21) int local21 = 0; local21 < arg0.length(); local21++) {
						@Pc(29) int local29 = anIntArray185[arg0.charAt(local21)];
						if (local29 != 94) {
							this.method353(this.aByteArrayArray3[local29], arg1 + this.anIntArray181[local29], local16 + this.anIntArray182[local29] + (int) (Math.sin((double) local21 / 2.0D + (double) arg5 / 5.0D) * 5.0D), this.anIntArray179[local29], this.anIntArray180[local29], arg3);
						}
						arg1 += this.anIntArray183[local29];
					}
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("13316, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZIZIILjava/lang/String;)V")
	public void method352(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			if (arg4 != null) {
				@Pc(9) int local9 = arg3 - this.anInt518;
				for (@Pc(14) int local14 = 0; local14 < arg4.length(); local14++) {
					if (arg4.charAt(local14) == '@' && local14 + 4 < arg4.length() && arg4.charAt(local14 + 4) == '@') {
						@Pc(43) String local43 = arg4.substring(local14 + 1, local14 + 4);
						if (local43.equals("red")) {
							arg1 = 16711680;
						}
						if (local43.equals("gre")) {
							arg1 = 65280;
						}
						if (local43.equals("blu")) {
							arg1 = 255;
						}
						if (local43.equals("yel")) {
							arg1 = 16776960;
						}
						if (local43.equals("cya")) {
							arg1 = 65535;
						}
						if (local43.equals("mag")) {
							arg1 = 16711935;
						}
						if (local43.equals("whi")) {
							arg1 = 16777215;
						}
						if (local43.equals("bla")) {
							arg1 = 0;
						}
						if (local43.equals("lre")) {
							arg1 = 16748608;
						}
						if (local43.equals("dre")) {
							arg1 = 8388608;
						}
						if (local43.equals("dbl")) {
							arg1 = 128;
						}
						if (local43.equals("or1")) {
							arg1 = 16756736;
						}
						if (local43.equals("or2")) {
							arg1 = 16740352;
						}
						if (local43.equals("or3")) {
							arg1 = 16723968;
						}
						if (local43.equals("gr1")) {
							arg1 = 12648192;
						}
						if (local43.equals("gr2")) {
							arg1 = 8453888;
						}
						if (local43.equals("gr3")) {
							arg1 = 4259584;
						}
						local14 += 4;
					} else {
						@Pc(154) int local154 = anIntArray185[arg4.charAt(local14)];
						if (local154 != 94) {
							if (arg0) {
								this.method353(this.aByteArrayArray3[local154], arg2 + this.anIntArray181[local154] + 1, local9 + this.anIntArray182[local154] + 1, this.anIntArray179[local154], this.anIntArray180[local154], 0);
							}
							this.method353(this.aByteArrayArray3[local154], arg2 + this.anIntArray181[local154], local9 + this.anIntArray182[local154], this.anIntArray179[local154], this.anIntArray180[local154], arg1);
						}
						arg2 += this.anIntArray183[local154];
					}
				}
			}
		} catch (@Pc(231) RuntimeException local231) {
			signlink.reporterror("55131, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local231.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([BIIIII)V")
	private void method353(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub3_Sub2.anInt507;
		@Pc(9) int local9 = Class1_Sub3_Sub2.anInt507 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub3_Sub2.anInt509) {
			local20 = Class1_Sub3_Sub2.anInt509 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub3_Sub2.anInt509;
			local13 = local20 * arg3;
			local5 += local20 * Class1_Sub3_Sub2.anInt507;
		}
		if (arg2 + arg4 >= Class1_Sub3_Sub2.anInt510) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub3_Sub2.anInt510;
		}
		if (arg1 < Class1_Sub3_Sub2.anInt511) {
			local20 = Class1_Sub3_Sub2.anInt511 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub3_Sub2.anInt511;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub3_Sub2.anInt512) {
			local20 = arg1 + arg3 + 1 - Class1_Sub3_Sub2.anInt512;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method354(Class1_Sub3_Sub2.anIntArray178, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method354(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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
