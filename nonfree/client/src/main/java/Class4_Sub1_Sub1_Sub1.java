import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CAMKASVY")
public final class Class4_Sub1_Sub1_Sub1 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!CAMKASVY", name = "B", descriptor = "I")
	private int anInt33;

	@OriginalMember(owner = "client!CAMKASVY", name = "z", descriptor = "Z")
	private boolean aBoolean23 = false;

	@OriginalMember(owner = "client!CAMKASVY", name = "A", descriptor = "Z")
	private boolean aBoolean24 = true;

	@OriginalMember(owner = "client!CAMKASVY", name = "C", descriptor = "I")
	private int anInt34 = 779;

	@OriginalMember(owner = "client!CAMKASVY", name = "D", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[256][];

	@OriginalMember(owner = "client!CAMKASVY", name = "E", descriptor = "[I")
	private int[] anIntArray7 = new int[256];

	@OriginalMember(owner = "client!CAMKASVY", name = "F", descriptor = "[I")
	private int[] anIntArray8 = new int[256];

	@OriginalMember(owner = "client!CAMKASVY", name = "G", descriptor = "[I")
	private int[] anIntArray9 = new int[256];

	@OriginalMember(owner = "client!CAMKASVY", name = "H", descriptor = "[I")
	private int[] anIntArray10 = new int[256];

	@OriginalMember(owner = "client!CAMKASVY", name = "I", descriptor = "[I")
	private int[] anIntArray11 = new int[256];

	@OriginalMember(owner = "client!CAMKASVY", name = "K", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!CAMKASVY", name = "L", descriptor = "Z")
	private boolean aBoolean25 = false;

	@OriginalMember(owner = "client!CAMKASVY", name = "J", descriptor = "I")
	public int anInt35;

	@OriginalMember(owner = "client!CAMKASVY", name = "<init>", descriptor = "(Lclient!AKPFVPPG;Ljava/lang/String;ZZ)V")
	public Class4_Sub1_Sub1_Sub1(@OriginalArg(0) Class2 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		try {
			@Pc(66) Class4_Sub1_Sub3 local66 = new Class4_Sub1_Sub3(arg0.method7(arg1 + ".dat", null), (byte) 3);
			@Pc(75) Class4_Sub1_Sub3 local75 = new Class4_Sub1_Sub3(arg0.method7("index.dat", null), (byte) 3);
			local75.anInt101 = local66.method104() + 4;
			@Pc(86) int local86 = local75.method102();
			if (local86 > 0) {
				local75.anInt101 += (local86 - 1) * 3;
			}
			for (@Pc(100) int local100 = 0; local100 < 256; local100++) {
				this.anIntArray9[local100] = local75.method102();
				this.anIntArray10[local100] = local75.method102();
				@Pc(124) int local124 = this.anIntArray7[local100] = local75.method104();
				@Pc(132) int local132 = this.anIntArray8[local100] = local75.method104();
				@Pc(135) int local135 = local75.method102();
				@Pc(139) int local139 = local124 * local132;
				this.aByteArrayArray1[local100] = new byte[local139];
				@Pc(149) int local149;
				@Pc(174) int local174;
				if (local135 == 0) {
					for (local149 = 0; local149 < local139; local149++) {
						this.aByteArrayArray1[local100][local149] = local66.method103();
					}
				} else if (local135 == 1) {
					for (local149 = 0; local149 < local124; local149++) {
						for (local174 = 0; local174 < local132; local174++) {
							this.aByteArrayArray1[local100][local149 + local174 * local124] = local66.method103();
						}
					}
				}
				if (local132 > this.anInt35 && local100 < 128) {
					this.anInt35 = local132;
				}
				this.anIntArray9[local100] = 1;
				this.anIntArray11[local100] = local124 + 2;
				local149 = 0;
				for (local174 = local132 / 7; local174 < local132; local174++) {
					local149 += this.aByteArrayArray1[local100][local174 * local124];
				}
				@Pc(251) int local251;
				if (local149 <= local132 / 7) {
					local251 = this.anIntArray11[local100]--;
					this.anIntArray9[local100] = 0;
				}
				local149 = 0;
				for (@Pc(265) int local265 = local132 / 7; local265 < local132; local265++) {
					local149 += this.aByteArrayArray1[local100][local124 + local265 * local124 - 1];
				}
				if (local149 <= local132 / 7) {
					local251 = this.anIntArray11[local100]--;
				}
			}
			if (arg3) {
				this.anIntArray11[32] = this.anIntArray11[73];
			} else {
				this.anIntArray11[32] = this.anIntArray11[105];
			}
		} catch (@Pc(332) RuntimeException local332) {
			signlink.reporterror("74016, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local332.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "(IIBLjava/lang/String;I)V")
	public void method43(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2) {
		try {
			this.method48(779, arg1, 507 - this.method47(this.anInt33, arg1), arg0, arg2);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("60378, " + 507 + ", " + arg0 + ", " + 63 + ", " + arg1 + ", " + arg2 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "(IILjava/lang/String;IZ)V")
	public void method44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		try {
			this.method48(779, arg2, arg0 - this.method47(this.anInt33, arg2) / 2, arg1, arg3);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("27345, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "(ZIILjava/lang/String;II)V")
	public void method45(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.method52(arg1 - this.method46(arg2) / 2, arg3, arg0, arg2, arg4);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("25171, " + arg0 + ", " + arg1 + ", " + 2 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method46(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
				if (arg0.charAt(local9) == '@' && local9 + 4 < arg0.length() && arg0.charAt(local9 + 4) == '@') {
					local9 += 4;
				} else {
					local7 += this.anIntArray11[arg0.charAt(local9)];
				}
			}
			return local7;
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("25848, " + false + ", " + arg0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method47(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg1 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			@Pc(11) int local11;
			if (arg0 != 0) {
				for (local11 = 1; local11 > 0; local11++) {
				}
			}
			for (local11 = 0; local11 < arg1.length(); local11++) {
				local7 += this.anIntArray11[arg1.charAt(local11)];
			}
			return local7;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("79054, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public void method48(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg1 != null) {
				@Pc(11) int local11 = arg3 - this.anInt35;
				for (@Pc(13) int local13 = 0; local13 < arg1.length(); local13++) {
					@Pc(19) char local19 = arg1.charAt(local13);
					if (local19 != ' ') {
						this.method55(this.aByteArrayArray1[local19], arg2 + this.anIntArray9[local19], local11 + this.anIntArray10[local19], this.anIntArray7[local19], this.anIntArray8[local19], arg4);
					}
					arg2 += this.anIntArray11[local19];
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("9093, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public void method49(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 != null) {
				arg1 -= this.method47(this.anInt33, arg0) / 2;
				@Pc(17) int local17 = arg2 - this.anInt35;
				for (@Pc(19) int local19 = 0; local19 < arg0.length(); local19++) {
					@Pc(25) char local25 = arg0.charAt(local19);
					if (local25 != ' ') {
						this.method55(this.aByteArrayArray1[local25], arg1 + this.anIntArray9[local25], local17 + this.anIntArray10[local25] + (int) (Math.sin((double) local19 / 2.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray7[local25], this.anIntArray8[local25], arg3);
					}
					arg1 += this.anIntArray11[local25];
				}
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("25217, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "(IILjava/lang/String;IIZ)V")
	public void method50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg2 != null) {
				arg3 -= this.method47(this.anInt33, arg2) / 2;
				@Pc(17) int local17 = arg0 - this.anInt35;
				for (@Pc(24) int local24 = 0; local24 < arg2.length(); local24++) {
					@Pc(30) char local30 = arg2.charAt(local24);
					if (local30 != ' ') {
						this.method55(this.aByteArrayArray1[local30], arg3 + this.anIntArray9[local30] + (int) (Math.sin((double) local24 / 5.0D + (double) arg1 / 5.0D) * 5.0D), local17 + this.anIntArray10[local30] + (int) (Math.sin((double) local24 / 3.0D + (double) arg1 / 5.0D) * 5.0D), this.anIntArray7[local30], this.anIntArray8[local30], arg4);
					}
					arg3 += this.anIntArray11[local30];
				}
			}
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("26388, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "(IZIILjava/lang/String;II)V")
	public void method51(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3 != null) {
				@Pc(19) double local19 = 7.0D - (double) arg0 / 8.0D;
				if (local19 < 0.0D) {
					local19 = 0.0D;
				}
				arg4 -= this.method47(this.anInt33, arg3) / 2;
				@Pc(40) int local40 = arg1 - this.anInt35;
				for (@Pc(42) int local42 = 0; local42 < arg3.length(); local42++) {
					@Pc(48) char local48 = arg3.charAt(local42);
					if (local48 != ' ') {
						this.method55(this.aByteArrayArray1[local48], arg4 + this.anIntArray9[local48], local40 + this.anIntArray10[local48] + (int) (Math.sin((double) local42 / 1.5D + (double) arg5) * local19), this.anIntArray7[local48], this.anIntArray8[local48], arg2);
					}
					arg4 += this.anIntArray11[local48];
				}
			}
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("22571, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "(IIZBLjava/lang/String;I)V")
	public void method52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			this.aBoolean25 = false;
			@Pc(6) int local6 = arg0;
			if (arg3 != null) {
				@Pc(14) int local14 = arg1 - this.anInt35;
				for (@Pc(20) int local20 = 0; local20 < arg3.length(); local20++) {
					if (arg3.charAt(local20) == '@' && local20 + 4 < arg3.length() && arg3.charAt(local20 + 4) == '@') {
						@Pc(52) int local52 = this.method54(arg3.substring(local20 + 1, local20 + 4));
						if (local52 != -1) {
							arg4 = local52;
						}
						local20 += 4;
					} else {
						@Pc(64) char local64 = arg3.charAt(local20);
						if (local64 != ' ') {
							if (arg2) {
								this.method55(this.aByteArrayArray1[local64], arg0 + this.anIntArray9[local64] + 1, local14 + this.anIntArray10[local64] + 1, this.anIntArray7[local64], this.anIntArray8[local64], 0);
							}
							this.method55(this.aByteArrayArray1[local64], arg0 + this.anIntArray9[local64], local14 + this.anIntArray10[local64], this.anIntArray7[local64], this.anIntArray8[local64], arg4);
						}
						arg0 += this.anIntArray11[local64];
					}
				}
				if (this.aBoolean25) {
					Class4_Sub1_Sub1.method551(local14 + (int) ((double) this.anInt35 * 0.7D), local6, 8388608, arg0 - local6);
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("31690, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 6 + ", " + arg3 + ", " + arg4 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "(ILjava/lang/String;IZIZI)V")
	public void method53(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg1 != null) {
				this.aRandom1.setSeed((long) arg0);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(22) int local22 = 15 - this.anInt35;
				for (@Pc(24) int local24 = 0; local24 < arg1.length(); local24++) {
					if (arg1.charAt(local24) == '@' && local24 + 4 < arg1.length() && arg1.charAt(local24 + 4) == '@') {
						@Pc(56) int local56 = this.method54(arg1.substring(local24 + 1, local24 + 4));
						if (local56 != -1) {
							arg3 = local56;
						}
						local24 += 4;
					} else {
						@Pc(68) char local68 = arg1.charAt(local24);
						if (local68 != ' ') {
							this.method57(this.aByteArrayArray1[local68], 192, arg2 + this.anIntArray9[local68] + 1, this.anIntArray7[local68], 0, local22 + this.anIntArray10[local68] + 1, this.anIntArray8[local68]);
							this.method57(this.aByteArrayArray1[local68], local17, arg2 + this.anIntArray9[local68], this.anIntArray7[local68], arg3, local22 + this.anIntArray10[local68], this.anIntArray8[local68]);
						}
						arg2 += this.anIntArray11[local68];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg2++;
						}
					}
				}
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("86350, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + true + ", " + arg4 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CAMKASVY", name = "b", descriptor = "(ILjava/lang/String;)I")
	private int method54(@OriginalArg(1) String arg0) {
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
					this.aBoolean25 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean25 = false;
				}
				return -1;
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("4950, " + -33649 + ", " + arg0 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "([BIIIII)V")
	private void method55(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class4_Sub1_Sub1.anInt782;
		@Pc(9) int local9 = Class4_Sub1_Sub1.anInt782 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class4_Sub1_Sub1.anInt784) {
			local20 = Class4_Sub1_Sub1.anInt784 - arg2;
			arg4 -= local20;
			arg2 = Class4_Sub1_Sub1.anInt784;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class4_Sub1_Sub1.anInt782;
		}
		if (arg2 + arg4 >= Class4_Sub1_Sub1.anInt785) {
			arg4 -= arg2 + arg4 + 1 - Class4_Sub1_Sub1.anInt785;
		}
		if (arg1 < Class4_Sub1_Sub1.anInt786) {
			local20 = Class4_Sub1_Sub1.anInt786 - arg1;
			arg3 -= local20;
			arg1 = Class4_Sub1_Sub1.anInt786;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class4_Sub1_Sub1.anInt787) {
			local20 = arg1 + arg3 + 1 - Class4_Sub1_Sub1.anInt787;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method56(Class4_Sub1_Sub1.anIntArray201, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method56(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "([BIIZIIII)V")
	private void method57(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg2 + arg5 * Class4_Sub1_Sub1.anInt782;
			@Pc(9) int local9 = Class4_Sub1_Sub1.anInt782 - arg3;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(23) int local23;
			if (arg5 < Class4_Sub1_Sub1.anInt784) {
				local23 = Class4_Sub1_Sub1.anInt784 - arg5;
				arg6 -= local23;
				arg5 = Class4_Sub1_Sub1.anInt784;
				local13 = local23 * arg3 + 0;
				local5 += local23 * Class4_Sub1_Sub1.anInt782;
			}
			if (arg5 + arg6 >= Class4_Sub1_Sub1.anInt785) {
				arg6 -= arg5 + arg6 + 1 - Class4_Sub1_Sub1.anInt785;
			}
			if (arg2 < Class4_Sub1_Sub1.anInt786) {
				local23 = Class4_Sub1_Sub1.anInt786 - arg2;
				arg3 -= local23;
				arg2 = Class4_Sub1_Sub1.anInt786;
				local13 += local23;
				local5 += local23;
				local11 = local23 + 0;
				local9 += local23;
			}
			if (arg2 + arg3 >= Class4_Sub1_Sub1.anInt787) {
				local23 = arg2 + arg3 + 1 - Class4_Sub1_Sub1.anInt787;
				arg3 -= local23;
				local11 += local23;
				local9 += local23;
			}
			if (arg3 > 0 && arg6 > 0) {
				this.method58(local5, arg3, Class4_Sub1_Sub1.anIntArray201, 418, local13, local11, arg4, arg6, local9, arg1, arg0);
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("63104, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "(II[IIIIIIII[B)V")
	private void method58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) byte[] arg10) {
		try {
			@Pc(19) int local19 = ((arg6 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg6 & 0xFF00) * arg9 & 0xFF0000) >> 8;
			@Pc(23) boolean local23 = false;
			@Pc(27) int local27 = 256 - arg9;
			for (@Pc(30) int local30 = -arg7; local30 < 0; local30++) {
				for (@Pc(35) int local35 = -arg1; local35 < 0; local35++) {
					if (arg10[arg4++] == 0) {
						arg0++;
					} else {
						@Pc(46) int local46 = arg2[arg0];
						arg2[arg0++] = (((local46 & 0xFF00FF) * local27 & 0xFF00FF00) + ((local46 & 0xFF00) * local27 & 0xFF0000) >> 8) + local19;
					}
				}
				arg0 += arg8;
				arg4 += arg5;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("79759, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}
}
