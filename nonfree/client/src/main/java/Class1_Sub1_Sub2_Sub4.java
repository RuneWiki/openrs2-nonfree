import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lb")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!lb", name = "K", descriptor = "[I")
	private static int[] anIntArray220 = new int[256];

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
	private int anInt744 = 919;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[94][];

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "[I")
	private int[] anIntArray214 = new int[94];

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "[I")
	private int[] anIntArray215 = new int[94];

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "[I")
	private int[] anIntArray216 = new int[94];

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "[I")
	private int[] anIntArray217 = new int[94];

	@OriginalMember(owner = "client!lb", name = "F", descriptor = "[I")
	private int[] anIntArray218 = new int[95];

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "[I")
	private int[] anIntArray219 = new int[256];

	@OriginalMember(owner = "client!lb", name = "I", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!lb", name = "J", descriptor = "Z")
	private boolean aBoolean179 = false;

	@OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
	public int anInt745;

	static {
		@Pc(4) String local4 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(11) int local11 = local4.indexOf(local6);
			if (local11 == -1) {
				local11 = 74;
			}
			anIntArray220[local6] = local11;
		}
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Ljava/lang/String;BLclient!yb;)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class48 arg2) {
		try {
			@Pc(58) Class1_Sub1_Sub3 local58 = new Class1_Sub1_Sub3(arg2.method678(arg0 + ".dat", null), 337);
			@Pc(67) Class1_Sub1_Sub3 local67 = new Class1_Sub1_Sub3(arg2.method678("index.dat", null), 337);
			local67.anInt768 = local58.method500() + 4;
			@Pc(78) int local78 = local67.method498();
			if (local78 > 0) {
				local67.anInt768 += (local78 - 1) * 3;
			}
			@Pc(116) int local116;
			for (@Pc(92) int local92 = 0; local92 < 94; local92++) {
				this.anIntArray216[local92] = local67.method498();
				this.anIntArray217[local92] = local67.method498();
				local116 = this.anIntArray214[local92] = local67.method500();
				@Pc(124) int local124 = this.anIntArray215[local92] = local67.method500();
				@Pc(127) int local127 = local67.method498();
				@Pc(131) int local131 = local116 * local124;
				this.aByteArrayArray3[local92] = new byte[local131];
				@Pc(141) int local141;
				@Pc(166) int local166;
				if (local127 == 0) {
					for (local141 = 0; local141 < local131; local141++) {
						this.aByteArrayArray3[local92][local141] = local58.method499();
					}
				} else if (local127 == 1) {
					for (local141 = 0; local141 < local116; local141++) {
						for (local166 = 0; local166 < local124; local166++) {
							this.aByteArrayArray3[local92][local141 + local166 * local116] = local58.method499();
						}
					}
				}
				if (local124 > this.anInt745) {
					this.anInt745 = local124;
				}
				this.anIntArray216[local92] = 1;
				this.anIntArray218[local92] = local116 + 2;
				local141 = 0;
				for (local166 = local124 / 7; local166 < local124; local166++) {
					local141 += this.aByteArrayArray3[local92][local166 * local116];
				}
				@Pc(240) int local240;
				if (local141 <= local124 / 7) {
					local240 = this.anIntArray218[local92]--;
					this.anIntArray216[local92] = 0;
				}
				local141 = 0;
				for (@Pc(254) int local254 = local124 / 7; local254 < local124; local254++) {
					local141 += this.aByteArrayArray3[local92][local116 + local254 * local116 - 1];
				}
				if (local141 <= local124 / 7) {
					local240 = this.anIntArray218[local92]--;
				}
			}
			this.anIntArray218[94] = this.anIntArray218[8];
			for (local116 = 0; local116 < 256; local116++) {
				this.anIntArray219[local116] = this.anIntArray218[anIntArray220[local116]];
			}
		} catch (@Pc(332) RuntimeException local332) {
			signlink.reporterror("55356, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local332.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public void method465(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.method468(arg2, arg3 - this.method467(arg0) / 2, arg0, arg1);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("11, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -28519 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBIZLjava/lang/String;I)V")
	public void method466(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) {
		try {
			this.method470(arg4, arg0, arg2 - this.method467(arg4) / 2, arg3, arg5);
			@Pc(19) boolean local19 = false;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("15730, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method467(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(16) int local16 = 0;
			for (@Pc(18) int local18 = 0; local18 < arg0.length(); local18++) {
				if (arg0.charAt(local18) == '@' && local18 + 4 < arg0.length() && arg0.charAt(local18 + 4) == '@') {
					local18 += 4;
				} else {
					local16 += this.anIntArray219[arg0.charAt(local18)];
				}
			}
			return local16;
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("63124, " + -525 + ", " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILjava/lang/String;IB)V")
	public void method468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2 != null) {
				@Pc(7) int local7 = arg0 - this.anInt745;
				for (@Pc(15) int local15 = 0; local15 < arg2.length(); local15++) {
					@Pc(23) int local23 = anIntArray220[arg2.charAt(local15)];
					if (local23 != 94) {
						this.method473(this.aByteArrayArray3[local23], arg1 + this.anIntArray216[local23], local7 + this.anIntArray217[local23], this.anIntArray214[local23], this.anIntArray215[local23], arg3);
					}
					arg1 += this.anIntArray218[local23];
				}
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("42917, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 3 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public void method469(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 != null) {
				arg0 -= this.method467(arg1) / 2;
				@Pc(19) int local19 = arg4 - this.anInt745;
				for (@Pc(21) int local21 = 0; local21 < arg1.length(); local21++) {
					@Pc(29) int local29 = anIntArray220[arg1.charAt(local21)];
					if (local29 != 94) {
						this.method473(this.aByteArrayArray3[local29], arg0 + this.anIntArray216[local29], local19 + this.anIntArray217[local29] + (int) (Math.sin((double) local21 / 2.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray214[local29], this.anIntArray215[local29], arg2);
					}
					arg0 += this.anIntArray218[local29];
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("51834, " + arg0 + ", " + arg1 + ", " + -244 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;IIZII)V")
	public void method470(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			this.aBoolean179 = false;
			@Pc(10) int local10 = arg2;
			if (arg0 != null) {
				@Pc(18) int local18 = arg1 - this.anInt745;
				for (@Pc(20) int local20 = 0; local20 < arg0.length(); local20++) {
					@Pc(52) int local52;
					if (arg0.charAt(local20) == '@' && local20 + 4 < arg0.length() && arg0.charAt(local20 + 4) == '@') {
						local52 = this.method472(arg0.substring(local20 + 1, local20 + 4), 856);
						if (local52 != -1) {
							arg4 = local52;
						}
						local20 += 4;
					} else {
						local52 = anIntArray220[arg0.charAt(local20)];
						if (local52 != 94) {
							if (arg3) {
								this.method473(this.aByteArrayArray3[local52], arg2 + this.anIntArray216[local52] + 1, local18 + this.anIntArray217[local52] + 1, this.anIntArray214[local52], this.anIntArray215[local52], 0);
							}
							this.method473(this.aByteArrayArray3[local52], arg2 + this.anIntArray216[local52], local18 + this.anIntArray217[local52], this.anIntArray214[local52], this.anIntArray215[local52], arg4);
						}
						arg2 += this.anIntArray218[local52];
					}
				}
				if (this.aBoolean179) {
					Class1_Sub1_Sub2.method461(local18 + (int) ((double) this.anInt745 * 0.7D), local10, arg2 - local10, 8388608);
				}
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("24752, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -44475 + ", " + arg4 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBIIILjava/lang/String;Z)V")
	public void method471(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			if (arg4 != null) {
				this.aRandom1.setSeed((long) arg0);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(26) int local26 = 15 - this.anInt745;
				for (@Pc(28) int local28 = 0; local28 < arg4.length(); local28++) {
					@Pc(60) int local60;
					if (arg4.charAt(local28) == '@' && local28 + 4 < arg4.length() && arg4.charAt(local28 + 4) == '@') {
						local60 = this.method472(arg4.substring(local28 + 1, local28 + 4), 856);
						if (local60 != -1) {
							arg3 = local60;
						}
						local28 += 4;
					} else {
						local60 = anIntArray220[arg4.charAt(local28)];
						if (local60 != 94) {
							this.method475(arg2 + this.anIntArray216[local60] + 1, local26 + this.anIntArray217[local60] + 1, this.anIntArray214[local60], 0, this.anIntArray215[local60], this.aByteArrayArray3[local60], 192);
							this.method475(arg2 + this.anIntArray216[local60], local26 + this.anIntArray217[local60], this.anIntArray214[local60], arg3, this.anIntArray215[local60], this.aByteArrayArray3[local60], local17);
						}
						arg2 += this.anIntArray218[local60];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg2++;
						}
					}
				}
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("52571, " + arg0 + ", " + -37 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;I)I")
	private int method472(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
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
				if (arg0.equals("str")) {
					this.aBoolean179 = true;
				}
				return -1;
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("96331, " + arg0 + ", " + arg1 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([BIIIII)V")
	private void method473(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub2.anInt734;
		@Pc(9) int local9 = Class1_Sub1_Sub2.anInt734 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub2.anInt736) {
			local20 = Class1_Sub1_Sub2.anInt736 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub2.anInt736;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub2.anInt734;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt737) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt737;
		}
		if (arg1 < Class1_Sub1_Sub2.anInt738) {
			local20 = Class1_Sub1_Sub2.anInt738 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub2.anInt738;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub2.anInt739) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub2.anInt739;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method474(Class1_Sub1_Sub2.anIntArray213, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method474(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIII[BI)V")
	private void method475(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(10) int local10 = arg0 + arg1 * Class1_Sub1_Sub2.anInt734;
			@Pc(14) int local14 = Class1_Sub1_Sub2.anInt734 - arg2;
			@Pc(16) int local16 = 0;
			@Pc(18) int local18 = 0;
			@Pc(25) int local25;
			if (arg1 < Class1_Sub1_Sub2.anInt736) {
				local25 = Class1_Sub1_Sub2.anInt736 - arg1;
				arg4 -= local25;
				arg1 = Class1_Sub1_Sub2.anInt736;
				local18 = local25 * arg2 + 0;
				local10 += local25 * Class1_Sub1_Sub2.anInt734;
			}
			if (arg1 + arg4 >= Class1_Sub1_Sub2.anInt737) {
				arg4 -= arg1 + arg4 + 1 - Class1_Sub1_Sub2.anInt737;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt738) {
				local25 = Class1_Sub1_Sub2.anInt738 - arg0;
				arg2 -= local25;
				arg0 = Class1_Sub1_Sub2.anInt738;
				local18 += local25;
				local10 += local25;
				local16 = local25 + 0;
				local14 += local25;
			}
			if (arg0 + arg2 >= Class1_Sub1_Sub2.anInt739) {
				local25 = arg0 + arg2 + 1 - Class1_Sub1_Sub2.anInt739;
				arg2 -= local25;
				local16 += local25;
				local14 += local25;
			}
			if (arg2 > 0 && arg4 > 0) {
				this.method476(local14, Class1_Sub1_Sub2.anIntArray213, arg2, local16, arg3, local18, arg6, local10, arg4, arg5);
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("86170, " + -371 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[IIIIIIIZI[B)V")
	private void method476(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9) {
		try {
			@Pc(19) int local19 = ((arg4 & 0xFF00FF) * arg6 & 0xFF00FF00) + ((arg4 & 0xFF00) * arg6 & 0xFF0000) >> 8;
			@Pc(32) int local32 = 256 - arg6;
			for (@Pc(35) int local35 = -arg8; local35 < 0; local35++) {
				for (@Pc(40) int local40 = -arg2; local40 < 0; local40++) {
					if (arg9[arg5++] == 0) {
						arg7++;
					} else {
						@Pc(51) int local51 = arg1[arg7];
						arg1[arg7++] = (((local51 & 0xFF00FF) * local32 & 0xFF00FF00) + ((local51 & 0xFF00) * local32 & 0xFF0000) >> 8) + local19;
					}
				}
				arg7 += arg0;
				arg5 += arg3;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("51035, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + true + ", " + arg8 + ", " + arg9 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}
}
