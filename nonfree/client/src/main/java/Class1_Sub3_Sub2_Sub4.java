import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jb")
public final class Class1_Sub3_Sub2_Sub4 extends Class1_Sub3_Sub2 {

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "[I")
	private static int[] anIntArray166 = new int[256];

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
	private int anInt415 = -886;

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "Z")
	private boolean aBoolean116 = false;

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[94][];

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "[I")
	private int[] anIntArray160 = new int[94];

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "[I")
	private int[] anIntArray161 = new int[94];

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "[I")
	private int[] anIntArray162 = new int[94];

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "[I")
	private int[] anIntArray163 = new int[94];

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "[I")
	private int[] anIntArray164 = new int[95];

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "[I")
	private int[] anIntArray165 = new int[256];

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
	public int anInt416;

	static {
		@Pc(4) String local4 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(11) int local11 = local4.indexOf(local6);
			if (local11 == -1) {
				local11 = 74;
			}
			anIntArray166[local6] = local11;
		}
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(ZLclient!ub;Ljava/lang/String;)V")
	public Class1_Sub3_Sub2_Sub4(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) String arg2) {
		try {
			@Pc(54) Class1_Sub3_Sub3 local54 = new Class1_Sub3_Sub3(arg1.method479((byte) 6, null, arg2 + ".dat"), 4);
			@Pc(64) Class1_Sub3_Sub3 local64 = new Class1_Sub3_Sub3(arg1.method479((byte) 6, null, "index.dat"), 4);
			local64.anInt433 = local54.method382() + 4;
			@Pc(78) int local78 = local64.method380();
			if (local78 > 0) {
				local64.anInt433 += (local78 - 1) * 3;
			}
			@Pc(114) int local114;
			for (@Pc(92) int local92 = 0; local92 < 94; local92++) {
				this.anIntArray162[local92] = local64.method380();
				this.anIntArray163[local92] = local64.method380();
				local114 = this.anIntArray160[local92] = local64.method382();
				@Pc(122) int local122 = this.anIntArray161[local92] = local64.method382();
				@Pc(125) int local125 = local64.method380();
				@Pc(129) int local129 = local114 * local122;
				this.aByteArrayArray3[local92] = new byte[local129];
				@Pc(139) int local139;
				@Pc(164) int local164;
				if (local125 == 0) {
					for (local139 = 0; local139 < local129; local139++) {
						this.aByteArrayArray3[local92][local139] = local54.method381();
					}
				} else if (local125 == 1) {
					for (local139 = 0; local139 < local114; local139++) {
						for (local164 = 0; local164 < local122; local164++) {
							this.aByteArrayArray3[local92][local139 + local164 * local114] = local54.method381();
						}
					}
				}
				if (local122 > this.anInt416) {
					this.anInt416 = local122;
				}
				this.anIntArray162[local92] = 1;
				this.anIntArray164[local92] = local114 + 2;
				local139 = 0;
				for (local164 = local122 / 7; local164 < local122; local164++) {
					local139 += this.aByteArrayArray3[local92][local164 * local114];
				}
				@Pc(238) int local238;
				if (local139 <= local122 / 7) {
					local238 = this.anIntArray164[local92]--;
					this.anIntArray162[local92] = 0;
				}
				local139 = 0;
				for (@Pc(252) int local252 = local122 / 7; local252 < local122; local252++) {
					local139 += this.aByteArrayArray3[local92][local114 + local252 * local114 - 1];
				}
				if (local139 <= local122 / 7) {
					local238 = this.anIntArray164[local92]--;
				}
			}
			this.anIntArray164[94] = this.anIntArray164[8];
			for (local114 = 0; local114 < 256; local114++) {
				this.anIntArray165[local114] = this.anIntArray164[anIntArray166[local114]];
			}
		} catch (@Pc(318) RuntimeException local318) {
			signlink.reporterror("30925, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local318.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZIIILjava/lang/String;)V")
	public void method321(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			this.method324(arg3, arg2 - this.method323(arg3) / 2, arg1, arg0);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("36838, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIILjava/lang/String;IZ)V")
	public void method322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) boolean arg4) {
		try {
			this.method326(arg4, arg1 - this.method323(arg3) / 2, arg2, arg0, arg3);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("47339, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 26631 + ", " + arg4 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method323(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(11) int local11 = 0;
			for (@Pc(13) int local13 = 0; local13 < arg0.length(); local13++) {
				if (arg0.charAt(local13) == '@' && local13 + 4 < arg0.length() && arg0.charAt(local13 + 4) == '@') {
					local13 += 4;
				} else {
					local11 += this.anIntArray165[arg0.charAt(local13)];
				}
			}
			return local11;
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("90876, " + arg0 + ", " + true + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;IIZI)V")
	public void method324(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 != null) {
				@Pc(7) int local7 = arg3 - this.anInt416;
				for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
					@Pc(17) int local17 = anIntArray166[arg0.charAt(local9)];
					if (local17 != 94) {
						this.method327(this.aByteArrayArray3[local17], arg1 + this.anIntArray162[local17], local7 + this.anIntArray163[local17], this.anIntArray160[local17], this.anIntArray161[local17], arg2);
					}
					arg1 += this.anIntArray164[local17];
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("98873, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public void method325(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 != null) {
				arg4 -= this.method323(arg2) / 2;
				@Pc(25) int local25 = arg0 - this.anInt416;
				for (@Pc(27) int local27 = 0; local27 < arg2.length(); local27++) {
					@Pc(35) int local35 = anIntArray166[arg2.charAt(local27)];
					if (local35 != 94) {
						this.method327(this.aByteArrayArray3[local35], arg4 + this.anIntArray162[local35], local25 + this.anIntArray163[local35] + (int) (Math.sin((double) local27 / 2.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray160[local35], this.anIntArray161[local35], arg1);
					}
					arg4 += this.anIntArray164[local35];
				}
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("74174, " + 9 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZIIILjava/lang/String;)V")
	public void method326(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			if (arg4 != null) {
				@Pc(20) int local20 = arg3 - this.anInt416;
				for (@Pc(22) int local22 = 0; local22 < arg4.length(); local22++) {
					if (arg4.charAt(local22) == '@' && local22 + 4 < arg4.length() && arg4.charAt(local22 + 4) == '@') {
						@Pc(51) String local51 = arg4.substring(local22 + 1, local22 + 4);
						if (local51.equals("red")) {
							arg2 = 16711680;
						}
						if (local51.equals("gre")) {
							arg2 = 65280;
						}
						if (local51.equals("blu")) {
							arg2 = 255;
						}
						if (local51.equals("yel")) {
							arg2 = 16776960;
						}
						if (local51.equals("cya")) {
							arg2 = 65535;
						}
						if (local51.equals("mag")) {
							arg2 = 16711935;
						}
						if (local51.equals("whi")) {
							arg2 = 16777215;
						}
						if (local51.equals("bla")) {
							arg2 = 0;
						}
						if (local51.equals("lre")) {
							arg2 = 16748608;
						}
						if (local51.equals("dre")) {
							arg2 = 8388608;
						}
						if (local51.equals("dbl")) {
							arg2 = 128;
						}
						if (local51.equals("or1")) {
							arg2 = 16756736;
						}
						if (local51.equals("or2")) {
							arg2 = 16740352;
						}
						if (local51.equals("or3")) {
							arg2 = 16723968;
						}
						if (local51.equals("gr1")) {
							arg2 = 12648192;
						}
						if (local51.equals("gr2")) {
							arg2 = 8453888;
						}
						if (local51.equals("gr3")) {
							arg2 = 4259584;
						}
						local22 += 4;
					} else {
						@Pc(162) int local162 = anIntArray166[arg4.charAt(local22)];
						if (local162 != 94) {
							if (arg0) {
								this.method327(this.aByteArrayArray3[local162], arg1 + this.anIntArray162[local162] + 1, local20 + this.anIntArray163[local162] + 1, this.anIntArray160[local162], this.anIntArray161[local162], 0);
							}
							this.method327(this.aByteArrayArray3[local162], arg1 + this.anIntArray162[local162], local20 + this.anIntArray163[local162], this.anIntArray160[local162], this.anIntArray161[local162], arg2);
						}
						arg1 += this.anIntArray164[local162];
					}
				}
			}
		} catch (@Pc(239) RuntimeException local239) {
			signlink.reporterror("97487, " + -886 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local239.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([BIIIII)V")
	private void method327(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub3_Sub2.anInt406;
		@Pc(9) int local9 = Class1_Sub3_Sub2.anInt406 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub3_Sub2.anInt408) {
			local20 = Class1_Sub3_Sub2.anInt408 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub3_Sub2.anInt408;
			local13 = local20 * arg3;
			local5 += local20 * Class1_Sub3_Sub2.anInt406;
		}
		if (arg2 + arg4 >= Class1_Sub3_Sub2.anInt409) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub3_Sub2.anInt409;
		}
		if (arg1 < Class1_Sub3_Sub2.anInt410) {
			local20 = Class1_Sub3_Sub2.anInt410 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub3_Sub2.anInt410;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub3_Sub2.anInt411) {
			local20 = arg1 + arg3 + 1 - Class1_Sub3_Sub2.anInt411;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method328(Class1_Sub3_Sub2.anIntArray159, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method328(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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
