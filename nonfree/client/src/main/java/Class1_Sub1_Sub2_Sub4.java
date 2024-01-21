import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lb")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!lb", name = "I", descriptor = "[I")
	private static int[] anIntArray219 = new int[256];

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
	private int anInt752 = 626;

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
	private int anInt753 = 31154;

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
	private int anInt754 = 9;

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[94][];

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "[I")
	private int[] anIntArray213 = new int[94];

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "[I")
	private int[] anIntArray214 = new int[94];

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "[I")
	private int[] anIntArray215 = new int[94];

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "[I")
	private int[] anIntArray216 = new int[94];

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "[I")
	private int[] anIntArray217 = new int[95];

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "[I")
	private int[] anIntArray218 = new int[256];

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!lb", name = "H", descriptor = "Z")
	private boolean aBoolean168 = false;

	@OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
	public int anInt755;

	static {
		@Pc(4) String local4 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(11) int local11 = local4.indexOf(local6);
			if (local11 == -1) {
				local11 = 74;
			}
			anIntArray219[local6] = local11;
		}
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!yb;B)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) String arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(64) Class1_Sub1_Sub3 local64 = new Class1_Sub1_Sub3(arg1.method674(arg0 + ".dat", null), false);
			@Pc(73) Class1_Sub1_Sub3 local73 = new Class1_Sub1_Sub3(arg1.method674("index.dat", null), false);
			local73.anInt778 = local64.method498() + 4;
			@Pc(84) int local84 = local73.method496();
			if (local84 > 0) {
				local73.anInt778 += (local84 - 1) * 3;
			}
			@Pc(127) int local127;
			for (@Pc(98) int local98 = 0; local98 < 94; local98++) {
				this.anIntArray215[local98] = local73.method496();
				this.anIntArray216[local98] = local73.method496();
				local127 = this.anIntArray213[local98] = local73.method498();
				@Pc(135) int local135 = this.anIntArray214[local98] = local73.method498();
				@Pc(138) int local138 = local73.method496();
				@Pc(142) int local142 = local127 * local135;
				this.aByteArrayArray3[local98] = new byte[local142];
				@Pc(152) int local152;
				@Pc(177) int local177;
				if (local138 == 0) {
					for (local152 = 0; local152 < local142; local152++) {
						this.aByteArrayArray3[local98][local152] = local64.method497();
					}
				} else if (local138 == 1) {
					for (local152 = 0; local152 < local127; local152++) {
						for (local177 = 0; local177 < local135; local177++) {
							this.aByteArrayArray3[local98][local152 + local177 * local127] = local64.method497();
						}
					}
				}
				if (local135 > this.anInt755) {
					this.anInt755 = local135;
				}
				this.anIntArray215[local98] = 1;
				this.anIntArray217[local98] = local127 + 2;
				local152 = 0;
				for (local177 = local135 / 7; local177 < local135; local177++) {
					local152 += this.aByteArrayArray3[local98][local177 * local127];
				}
				@Pc(251) int local251;
				if (local152 <= local135 / 7) {
					local251 = this.anIntArray217[local98]--;
					this.anIntArray215[local98] = 0;
				}
				local152 = 0;
				for (@Pc(265) int local265 = local135 / 7; local265 < local135; local265++) {
					local152 += this.aByteArrayArray3[local98][local127 + local265 * local127 - 1];
				}
				if (local152 <= local135 / 7) {
					local251 = this.anIntArray217[local98]--;
				}
			}
			this.anIntArray217[94] = this.anIntArray217[8];
			for (local127 = 0; local127 < 256; local127++) {
				this.anIntArray218[local127] = this.anIntArray217[anIntArray219[local127]];
			}
		} catch (@Pc(341) RuntimeException local341) {
			signlink.reporterror("17013, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local341.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public void method463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		try {
			this.method466(arg3, arg0, arg1 - this.method465(arg3) / 2, arg2);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("65989, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -977 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIIILjava/lang/String;B)V")
	public void method464(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		try {
			this.method468(arg2, arg3 - this.method465(arg4) / 2, arg1, arg0, arg4);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("68841, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -5 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method465(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(18) int local18 = 0; local18 < arg0.length(); local18++) {
				if (arg0.charAt(local18) == '@' && local18 + 4 < arg0.length() && arg0.charAt(local18 + 4) == '@') {
					local18 += 4;
				} else {
					local7 += this.anIntArray218[arg0.charAt(local18)];
				}
			}
			return local7;
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("60773, " + true + ", " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public void method466(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 != null) {
				@Pc(18) int local18 = arg3 - this.anInt755;
				for (@Pc(20) int local20 = 0; local20 < arg0.length(); local20++) {
					@Pc(28) int local28 = anIntArray219[arg0.charAt(local20)];
					if (local28 != 94) {
						this.method471(this.aByteArrayArray3[local28], arg2 + this.anIntArray215[local28], local18 + this.anIntArray216[local28], this.anIntArray213[local28], this.anIntArray214[local28], arg1);
					}
					arg2 += this.anIntArray217[local28];
				}
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("72600, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIILjava/lang/String;IB)V")
	public void method467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg3 != null) {
				arg0 -= this.method465(arg3) / 2;
				@Pc(16) int local16 = arg2 - this.anInt755;
				for (@Pc(18) int local18 = 0; local18 < arg3.length(); local18++) {
					@Pc(26) int local26 = anIntArray219[arg3.charAt(local18)];
					if (local26 != 94) {
						this.method471(this.aByteArrayArray3[local26], arg0 + this.anIntArray215[local26], local16 + this.anIntArray216[local26] + (int) (Math.sin((double) local18 / 2.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray213[local26], this.anIntArray214[local26], arg1);
					}
					arg0 += this.anIntArray217[local26];
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("75634, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 1 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIZZLjava/lang/String;)V")
	public void method468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) String arg4) {
		try {
			this.aBoolean168 = false;
			@Pc(6) int local6 = arg1;
			if (arg4 != null) {
				@Pc(14) int local14 = arg2 - this.anInt755;
				for (@Pc(16) int local16 = 0; local16 < arg4.length(); local16++) {
					@Pc(48) int local48;
					if (arg4.charAt(local16) == '@' && local16 + 4 < arg4.length() && arg4.charAt(local16 + 4) == '@') {
						local48 = this.method470(arg4.substring(local16 + 1, local16 + 4));
						if (local48 != -1) {
							arg0 = local48;
						}
						local16 += 4;
					} else {
						local48 = anIntArray219[arg4.charAt(local16)];
						if (local48 != 94) {
							if (arg3) {
								this.method471(this.aByteArrayArray3[local48], arg1 + this.anIntArray215[local48] + 1, local14 + this.anIntArray216[local48] + 1, this.anIntArray213[local48], this.anIntArray214[local48], 0);
							}
							this.method471(this.aByteArrayArray3[local48], arg1 + this.anIntArray215[local48], local14 + this.anIntArray216[local48], this.anIntArray213[local48], this.anIntArray214[local48], arg0);
						}
						arg1 += this.anIntArray217[local48];
					}
				}
				if (this.aBoolean168) {
					Class1_Sub1_Sub2.method459(local14 + (int) ((double) this.anInt755 * 0.7D), arg1 - local6, local6, 8388608);
				}
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("19574, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZLjava/lang/String;IIZ)V")
	public void method469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 != null) {
				this.aRandom1.setSeed((long) arg0);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(22) int local22 = 15 - this.anInt755;
				for (@Pc(24) int local24 = 0; local24 < arg2.length(); local24++) {
					@Pc(56) int local56;
					if (arg2.charAt(local24) == '@' && local24 + 4 < arg2.length() && arg2.charAt(local24 + 4) == '@') {
						local56 = this.method470(arg2.substring(local24 + 1, local24 + 4));
						if (local56 != -1) {
							arg1 = local56;
						}
						local24 += 4;
					} else {
						local56 = anIntArray219[arg2.charAt(local24)];
						if (local56 != 94) {
							this.method473(arg4 + this.anIntArray215[local56] + 1, local22 + this.anIntArray216[local56] + 1, 192, this.aByteArrayArray3[local56], 0, this.anIntArray213[local56], this.anIntArray214[local56]);
							this.method473(arg4 + this.anIntArray215[local56], local22 + this.anIntArray216[local56], local17, this.aByteArrayArray3[local56], arg1, this.anIntArray213[local56], this.anIntArray214[local56]);
						}
						arg4 += this.anIntArray217[local56];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg4++;
						}
					}
				}
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("70617, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(ZLjava/lang/String;)I")
	private int method470(@OriginalArg(1) String arg0) {
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
					this.aBoolean168 = true;
				}
				return -1;
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("66577, " + true + ", " + arg0 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([BIIIII)V")
	private void method471(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub2.anInt743;
		@Pc(9) int local9 = Class1_Sub1_Sub2.anInt743 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub2.anInt745) {
			local20 = Class1_Sub1_Sub2.anInt745 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub2.anInt745;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub2.anInt743;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt746) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt746;
		}
		if (arg1 < Class1_Sub1_Sub2.anInt747) {
			local20 = Class1_Sub1_Sub2.anInt747 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub2.anInt747;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub2.anInt748) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub2.anInt748;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method472(Class1_Sub1_Sub2.anIntArray212, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method472(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII[BIII)V")
	private void method473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg0 + arg1 * Class1_Sub1_Sub2.anInt743;
			@Pc(9) int local9 = Class1_Sub1_Sub2.anInt743 - arg5;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(20) int local20;
			if (arg1 < Class1_Sub1_Sub2.anInt745) {
				local20 = Class1_Sub1_Sub2.anInt745 - arg1;
				arg6 -= local20;
				arg1 = Class1_Sub1_Sub2.anInt745;
				local13 = local20 * arg5 + 0;
				local5 += local20 * Class1_Sub1_Sub2.anInt743;
			}
			if (arg1 + arg6 >= Class1_Sub1_Sub2.anInt746) {
				arg6 -= arg1 + arg6 + 1 - Class1_Sub1_Sub2.anInt746;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt747) {
				local20 = Class1_Sub1_Sub2.anInt747 - arg0;
				arg5 -= local20;
				arg0 = Class1_Sub1_Sub2.anInt747;
				local13 += local20;
				local5 += local20;
				local11 = local20 + 0;
				local9 += local20;
			}
			if (arg0 + arg5 >= Class1_Sub1_Sub2.anInt748) {
				local20 = arg0 + arg5 + 1 - Class1_Sub1_Sub2.anInt748;
				arg5 -= local20;
				local11 += local20;
				local9 += local20;
			}
			if (arg5 > 0 && arg6 > 0) {
				this.method474(arg5, local13, Class1_Sub1_Sub2.anIntArray212, arg3, local5, local11, local9, arg4, arg6, arg2);
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("76628, " + arg0 + ", " + arg1 + ", " + -197 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[I[BIIIZIII)V")
	private void method474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg7 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg7 & 0xFF00) * arg9 & 0xFF0000) >> 8;
			@Pc(23) int local23 = 256 - arg9;
			for (@Pc(26) int local26 = -arg8; local26 < 0; local26++) {
				for (@Pc(31) int local31 = -arg0; local31 < 0; local31++) {
					if (arg3[arg1++] == 0) {
						arg4++;
					} else {
						@Pc(42) int local42 = arg2[arg4];
						arg2[arg4++] = (((local42 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local42 & 0xFF00) * local23 & 0xFF0000) >> 8) + local19;
					}
				}
				arg4 += arg6;
				arg1 += arg5;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("10665, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + false + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}
}
