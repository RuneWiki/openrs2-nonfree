import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lb")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!lb", name = "L", descriptor = "[I")
	private static int[] anIntArray220 = new int[256];

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
	private int anInt750;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
	private int anInt751;

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "Z")
	private boolean aBoolean201 = true;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "B")
	private byte aByte29 = 7;

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[94][];

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "[I")
	private int[] anIntArray214 = new int[94];

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "[I")
	private int[] anIntArray215 = new int[94];

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "[I")
	private int[] anIntArray216 = new int[94];

	@OriginalMember(owner = "client!lb", name = "F", descriptor = "[I")
	private int[] anIntArray217 = new int[94];

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "[I")
	private int[] anIntArray218 = new int[95];

	@OriginalMember(owner = "client!lb", name = "H", descriptor = "[I")
	private int[] anIntArray219 = new int[256];

	@OriginalMember(owner = "client!lb", name = "J", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!lb", name = "K", descriptor = "Z")
	private boolean aBoolean202 = false;

	@OriginalMember(owner = "client!lb", name = "I", descriptor = "I")
	public int anInt752;

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

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!yb;Ljava/lang/String;B)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) Class48 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(61) Class1_Sub1_Sub3 local61 = new Class1_Sub1_Sub3(16, arg0.method678(arg1 + ".dat", null));
			@Pc(70) Class1_Sub1_Sub3 local70 = new Class1_Sub1_Sub3(16, arg0.method678("index.dat", null));
			local70.anInt776 = local61.method500() + 4;
			@Pc(84) int local84;
			if (arg2 != this.aByte29) {
				for (local84 = 1; local84 > 0; local84++) {
				}
			}
			local84 = local70.method498();
			if (local84 > 0) {
				local70.anInt776 += (local84 - 1) * 3;
			}
			@Pc(136) int local136;
			for (@Pc(112) int local112 = 0; local112 < 94; local112++) {
				this.anIntArray216[local112] = local70.method498();
				this.anIntArray217[local112] = local70.method498();
				local136 = this.anIntArray214[local112] = local70.method500();
				@Pc(144) int local144 = this.anIntArray215[local112] = local70.method500();
				@Pc(147) int local147 = local70.method498();
				@Pc(151) int local151 = local136 * local144;
				this.aByteArrayArray3[local112] = new byte[local151];
				@Pc(161) int local161;
				@Pc(186) int local186;
				if (local147 == 0) {
					for (local161 = 0; local161 < local151; local161++) {
						this.aByteArrayArray3[local112][local161] = local61.method499();
					}
				} else if (local147 == 1) {
					for (local161 = 0; local161 < local136; local161++) {
						for (local186 = 0; local186 < local144; local186++) {
							this.aByteArrayArray3[local112][local161 + local186 * local136] = local61.method499();
						}
					}
				}
				if (local144 > this.anInt752) {
					this.anInt752 = local144;
				}
				this.anIntArray216[local112] = 1;
				this.anIntArray218[local112] = local136 + 2;
				local161 = 0;
				for (local186 = local144 / 7; local186 < local144; local186++) {
					local161 += this.aByteArrayArray3[local112][local186 * local136];
				}
				@Pc(260) int local260;
				if (local161 <= local144 / 7) {
					local260 = this.anIntArray218[local112]--;
					this.anIntArray216[local112] = 0;
				}
				local161 = 0;
				for (@Pc(274) int local274 = local144 / 7; local274 < local144; local274++) {
					local161 += this.aByteArrayArray3[local112][local136 + local274 * local136 - 1];
				}
				if (local161 <= local144 / 7) {
					local260 = this.anIntArray218[local112]--;
				}
			}
			this.anIntArray218[94] = this.anIntArray218[8];
			for (local136 = 0; local136 < 256; local136++) {
				this.anIntArray219[local136] = this.anIntArray218[anIntArray220[local136]];
			}
		} catch (@Pc(340) RuntimeException local340) {
			signlink.reporterror("95669, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local340.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public void method465(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			this.method468(arg2, arg3, arg1, arg0 - this.method467(arg1) / 2);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("4362, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;IIZII)V")
	public void method466(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.method470(arg3, arg2, arg0, arg4, arg1 - this.method467(arg0) / 2);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("32635, " + arg0 + ", " + -413 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method467(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(14) int local14 = 0; local14 < arg0.length(); local14++) {
				if (arg0.charAt(local14) == '@' && local14 + 4 < arg0.length() && arg0.charAt(local14 + 4) == '@') {
					local14 += 4;
				} else {
					local7 += this.anIntArray219[arg0.charAt(local14)];
				}
			}
			return local7;
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("4664, " + false + ", " + arg0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZLjava/lang/String;I)V")
	public void method468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 != null) {
				@Pc(7) int local7 = arg0 - this.anInt752;
				for (@Pc(9) int local9 = 0; local9 < arg2.length(); local9++) {
					@Pc(17) int local17 = anIntArray220[arg2.charAt(local9)];
					if (local17 != 94) {
						this.method473(this.aByteArrayArray3[local17], arg3 + this.anIntArray216[local17], local7 + this.anIntArray217[local17], this.anIntArray214[local17], this.anIntArray215[local17], arg1);
					}
					arg3 += this.anIntArray218[local17];
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("9839, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public void method469(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 != null) {
				arg4 -= this.method467(arg0) / 2;
				@Pc(26) int local26 = arg1 - this.anInt752;
				for (@Pc(28) int local28 = 0; local28 < arg0.length(); local28++) {
					@Pc(36) int local36 = anIntArray220[arg0.charAt(local28)];
					if (local36 != 94) {
						this.method473(this.aByteArrayArray3[local36], arg4 + this.anIntArray216[local36], local26 + this.anIntArray217[local36] + (int) (Math.sin((double) local28 / 2.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray214[local36], this.anIntArray215[local36], arg2);
					}
					arg4 += this.anIntArray218[local36];
				}
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("64096, " + arg0 + ", " + arg1 + ", " + 288 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZLjava/lang/String;II)V")
	public void method470(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aBoolean202 = false;
			@Pc(12) int local12 = arg4;
			if (arg2 != null) {
				@Pc(20) int local20 = arg3 - this.anInt752;
				for (@Pc(22) int local22 = 0; local22 < arg2.length(); local22++) {
					@Pc(54) int local54;
					if (arg2.charAt(local22) == '@' && local22 + 4 < arg2.length() && arg2.charAt(local22 + 4) == '@') {
						local54 = this.method472(arg2.substring(local22 + 1, local22 + 4));
						if (local54 != -1) {
							arg0 = local54;
						}
						local22 += 4;
					} else {
						local54 = anIntArray220[arg2.charAt(local22)];
						if (local54 != 94) {
							if (arg1) {
								this.method473(this.aByteArrayArray3[local54], arg4 + this.anIntArray216[local54] + 1, local20 + this.anIntArray217[local54] + 1, this.anIntArray214[local54], this.anIntArray215[local54], 0);
							}
							this.method473(this.aByteArrayArray3[local54], arg4 + this.anIntArray216[local54], local20 + this.anIntArray217[local54], this.anIntArray214[local54], this.anIntArray215[local54], arg0);
						}
						arg4 += this.anIntArray218[local54];
					}
				}
				if (this.aBoolean202) {
					Class1_Sub1_Sub2.method461(8388608, local20 + (int) ((double) this.anInt752 * 0.7D), arg4 - local12, local12);
				}
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("90530, " + 3 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIIIIILjava/lang/String;)V")
	public void method471(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4) {
		try {
			if (arg4 != null) {
				this.aRandom1.setSeed((long) arg3);
				@Pc(27) int local27 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(32) int local32 = 15 - this.anInt752;
				for (@Pc(34) int local34 = 0; local34 < arg4.length(); local34++) {
					@Pc(66) int local66;
					if (arg4.charAt(local34) == '@' && local34 + 4 < arg4.length() && arg4.charAt(local34 + 4) == '@') {
						local66 = this.method472(arg4.substring(local34 + 1, local34 + 4));
						if (local66 != -1) {
							arg1 = local66;
						}
						local34 += 4;
					} else {
						local66 = anIntArray220[arg4.charAt(local34)];
						if (local66 != 94) {
							this.method475(arg0 + this.anIntArray216[local66] + 1, this.anIntArray214[local66], 192, local32 + this.anIntArray217[local66] + 1, this.aByteArrayArray3[local66], this.anIntArray215[local66], 0);
							this.method475(arg0 + this.anIntArray216[local66], this.anIntArray214[local66], local27, local32 + this.anIntArray217[local66], this.aByteArrayArray3[local66], this.anIntArray215[local66], arg1);
						}
						arg0 += this.anIntArray218[local66];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg0++;
						}
					}
				}
			}
		} catch (@Pc(168) RuntimeException local168) {
			signlink.reporterror("58749, " + true + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local168.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;I)I")
	private int method472(@OriginalArg(0) String arg0) {
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
				if (arg0.equals("str")) {
					this.aBoolean202 = true;
				}
				return -1;
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("20209, " + arg0 + ", " + 4 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([BIIIII)V")
	private void method473(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub2.anInt740;
		@Pc(9) int local9 = Class1_Sub1_Sub2.anInt740 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub2.anInt742) {
			local20 = Class1_Sub1_Sub2.anInt742 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub2.anInt742;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub2.anInt740;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt743) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt743;
		}
		if (arg1 < Class1_Sub1_Sub2.anInt744) {
			local20 = Class1_Sub1_Sub2.anInt744 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub2.anInt744;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub2.anInt745) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub2.anInt745;
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

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII[BBII)V")
	private void method475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg0 + arg3 * Class1_Sub1_Sub2.anInt740;
			@Pc(9) int local9 = Class1_Sub1_Sub2.anInt740 - arg1;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(26) int local26;
			if (arg3 < Class1_Sub1_Sub2.anInt742) {
				local26 = Class1_Sub1_Sub2.anInt742 - arg3;
				arg5 -= local26;
				arg3 = Class1_Sub1_Sub2.anInt742;
				local13 = local26 * arg1 + 0;
				local5 += local26 * Class1_Sub1_Sub2.anInt740;
			}
			if (arg3 + arg5 >= Class1_Sub1_Sub2.anInt743) {
				arg5 -= arg3 + arg5 + 1 - Class1_Sub1_Sub2.anInt743;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt744) {
				local26 = Class1_Sub1_Sub2.anInt744 - arg0;
				arg1 -= local26;
				arg0 = Class1_Sub1_Sub2.anInt744;
				local13 += local26;
				local5 += local26;
				local11 = local26 + 0;
				local9 += local26;
			}
			if (arg0 + arg1 >= Class1_Sub1_Sub2.anInt745) {
				local26 = arg0 + arg1 + 1 - Class1_Sub1_Sub2.anInt745;
				arg1 -= local26;
				local11 += local26;
				local9 += local26;
			}
			if (arg1 > 0 && arg5 > 0) {
				this.method476(arg2, arg4, Class1_Sub1_Sub2.anIntArray213, local13, arg1, arg6, arg5, local11, local9, local5);
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("5387, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 62 + ", " + arg5 + ", " + arg6 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[B[IIIZIIIII)V")
	private void method476(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(28) int local28 = ((arg5 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg5 & 0xFF00) * arg0 & 0xFF0000) >> 8;
			@Pc(32) int local32 = 256 - arg0;
			for (@Pc(35) int local35 = -arg6; local35 < 0; local35++) {
				for (@Pc(40) int local40 = -arg4; local40 < 0; local40++) {
					if (arg1[arg3++] == 0) {
						arg9++;
					} else {
						@Pc(51) int local51 = arg2[arg9];
						arg2[arg9++] = (((local51 & 0xFF00FF) * local32 & 0xFF00FF00) + ((local51 & 0xFF00) * local32 & 0xFF0000) >> 8) + local28;
					}
				}
				arg9 += arg8;
				arg3 += arg7;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("55803, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}
}
