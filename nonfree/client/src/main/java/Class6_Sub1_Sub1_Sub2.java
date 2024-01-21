import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MGTPXZHY")
public final class Class6_Sub1_Sub1_Sub2 extends Class6_Sub1_Sub1 {

	@OriginalMember(owner = "client!MGTPXZHY", name = "y", descriptor = "I")
	private int anInt394 = 182;

	@OriginalMember(owner = "client!MGTPXZHY", name = "z", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!MGTPXZHY", name = "A", descriptor = "I")
	private int anInt395 = 1;

	@OriginalMember(owner = "client!MGTPXZHY", name = "B", descriptor = "Z")
	private boolean aBoolean108 = false;

	@OriginalMember(owner = "client!MGTPXZHY", name = "C", descriptor = "I")
	private int anInt396 = -16;

	@OriginalMember(owner = "client!MGTPXZHY", name = "D", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[256][];

	@OriginalMember(owner = "client!MGTPXZHY", name = "E", descriptor = "[I")
	private int[] anIntArray79 = new int[256];

	@OriginalMember(owner = "client!MGTPXZHY", name = "F", descriptor = "[I")
	private int[] anIntArray80 = new int[256];

	@OriginalMember(owner = "client!MGTPXZHY", name = "G", descriptor = "[I")
	private int[] anIntArray81 = new int[256];

	@OriginalMember(owner = "client!MGTPXZHY", name = "H", descriptor = "[I")
	private int[] anIntArray82 = new int[256];

	@OriginalMember(owner = "client!MGTPXZHY", name = "I", descriptor = "[I")
	private int[] anIntArray83 = new int[256];

	@OriginalMember(owner = "client!MGTPXZHY", name = "K", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!MGTPXZHY", name = "L", descriptor = "Z")
	private boolean aBoolean109 = false;

	@OriginalMember(owner = "client!MGTPXZHY", name = "J", descriptor = "I")
	public int anInt397;

	@OriginalMember(owner = "client!MGTPXZHY", name = "<init>", descriptor = "(Ljava/lang/String;BZLclient!ESUFCMYV;)V")
	public Class6_Sub1_Sub1_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class11 arg3) {
		try {
			@Pc(66) Class6_Sub1_Sub4 local66 = new Class6_Sub1_Sub4(arg3.method89(arg0 + ".dat", null), (byte) -17);
			@Pc(86) Class6_Sub1_Sub4 local86 = new Class6_Sub1_Sub4(arg3.method89("index.dat", null), (byte) -17);
			local86.anInt704 = local66.method413() + 4;
			@Pc(97) int local97 = local86.method411();
			if (local97 > 0) {
				local86.anInt704 += (local97 - 1) * 3;
			}
			for (@Pc(111) int local111 = 0; local111 < 256; local111++) {
				this.anIntArray81[local111] = local86.method411();
				this.anIntArray82[local111] = local86.method411();
				@Pc(135) int local135 = this.anIntArray79[local111] = local86.method413();
				@Pc(143) int local143 = this.anIntArray80[local111] = local86.method413();
				@Pc(146) int local146 = local86.method411();
				@Pc(150) int local150 = local135 * local143;
				this.aByteArrayArray1[local111] = new byte[local150];
				@Pc(160) int local160;
				@Pc(185) int local185;
				if (local146 == 0) {
					for (local160 = 0; local160 < local150; local160++) {
						this.aByteArrayArray1[local111][local160] = local66.method412();
					}
				} else if (local146 == 1) {
					for (local160 = 0; local160 < local135; local160++) {
						for (local185 = 0; local185 < local143; local185++) {
							this.aByteArrayArray1[local111][local160 + local185 * local135] = local66.method412();
						}
					}
				}
				if (local143 > this.anInt397 && local111 < 128) {
					this.anInt397 = local143;
				}
				this.anIntArray81[local111] = 1;
				this.anIntArray83[local111] = local135 + 2;
				local160 = 0;
				for (local185 = local143 / 7; local185 < local143; local185++) {
					local160 += this.aByteArrayArray1[local111][local185 * local135];
				}
				@Pc(262) int local262;
				if (local160 <= local143 / 7) {
					local262 = this.anIntArray83[local111]--;
					this.anIntArray81[local111] = 0;
				}
				local160 = 0;
				for (@Pc(276) int local276 = local143 / 7; local276 < local143; local276++) {
					local160 += this.aByteArrayArray1[local111][local135 + local276 * local135 - 1];
				}
				if (local160 <= local143 / 7) {
					local262 = this.anIntArray83[local111]--;
				}
			}
			if (arg2) {
				this.anIntArray83[32] = this.anIntArray83[73];
			} else {
				this.anIntArray83[32] = this.anIntArray83[105];
			}
		} catch (@Pc(335) RuntimeException local335) {
			signlink.reporterror("90039, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local335.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public void method204(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(4) int arg2) {
		try {
			this.method209(arg2, arg1, arg0, 507 - this.method208(arg1));
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("84705, " + arg0 + ", " + 507 + ", " + arg1 + ", " + -161 + ", " + arg2 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public void method205(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		try {
			this.method209(arg1, arg2, arg3, arg0 - this.method208(arg2) / 2);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("88413, " + arg0 + ", " + 41480 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "(IIIZILjava/lang/String;)V")
	public void method206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			this.method213(arg4, arg3 - this.method207(arg4) / 2, arg0, arg2, arg1);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("71340, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method207(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
				if (arg0.charAt(local9) == '@' && local9 + 4 < arg0.length() && arg0.charAt(local9 + 4) == '@') {
					local9 += 4;
				} else {
					local7 += this.anIntArray83[arg0.charAt(local9)];
				}
			}
			if (this.anInt395 <= 1 && this.anInt395 >= 1) {
				return local7;
			} else {
				return 2;
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("72440, " + 1 + ", " + arg0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MGTPXZHY", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method208(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(13) int local13 = 0;
			for (@Pc(15) int local15 = 0; local15 < arg0.length(); local15++) {
				local13 += this.anIntArray83[arg0.charAt(local15)];
			}
			return local13;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("12213, " + -16 + ", " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "(IBLjava/lang/String;II)V")
	public void method209(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 != null) {
				@Pc(11) int local11 = arg2 - this.anInt397;
				for (@Pc(13) int local13 = 0; local13 < arg1.length(); local13++) {
					@Pc(19) char local19 = arg1.charAt(local13);
					if (local19 != ' ') {
						this.method216(this.aByteArrayArray1[local19], arg3 + this.anIntArray81[local19], local11 + this.anIntArray82[local19], this.anIntArray79[local19], this.anIntArray80[local19], arg0);
					}
					arg3 += this.anIntArray83[local19];
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("69437, " + arg0 + ", " + 118 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "(Ljava/lang/String;IIIBI)V")
	public void method210(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg0 != null) {
				arg2 -= this.method208(arg0) / 2;
				@Pc(18) int local18 = arg3 - this.anInt397;
				for (@Pc(20) int local20 = 0; local20 < arg0.length(); local20++) {
					@Pc(26) char local26 = arg0.charAt(local20);
					if (local26 != ' ') {
						this.method216(this.aByteArrayArray1[local26], arg2 + this.anIntArray81[local26], local18 + this.anIntArray82[local26] + (int) (Math.sin((double) local20 / 2.0D + (double) arg5 / 5.0D) * 5.0D), this.anIntArray79[local26], this.anIntArray80[local26], arg1);
					}
					arg2 += this.anIntArray83[local26];
				}
				@Pc(87) boolean local87 = false;
			}
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("78436, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
	public void method211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg4 != null) {
				arg1 -= this.method208(arg4) / 2;
				@Pc(17) int local17;
				if (arg3 <= 0) {
					for (local17 = 1; local17 > 0; local17++) {
					}
				}
				@Pc(27) int local27 = arg0 - this.anInt397;
				for (local17 = 0; local17 < arg4.length(); local17++) {
					@Pc(35) char local35 = arg4.charAt(local17);
					if (local35 != ' ') {
						this.method216(this.aByteArrayArray1[local35], arg1 + this.anIntArray81[local35] + (int) (Math.sin((double) local17 / 5.0D + (double) arg2 / 5.0D) * 5.0D), local27 + this.anIntArray82[local35] + (int) (Math.sin((double) local17 / 3.0D + (double) arg2 / 5.0D) * 5.0D), this.anIntArray79[local35], this.anIntArray80[local35], arg5);
					}
					arg1 += this.anIntArray83[local35];
				}
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("4455, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "(BIIIIILjava/lang/String;)V")
	public void method212(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		try {
			if (arg5 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg0 / 8.0D;
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg3 -= this.method208(arg5) / 2;
				@Pc(29) int local29 = arg2 - this.anInt397;
				for (@Pc(31) int local31 = 0; local31 < arg5.length(); local31++) {
					@Pc(37) char local37 = arg5.charAt(local31);
					if (local37 != ' ') {
						this.method216(this.aByteArrayArray1[local37], arg3 + this.anIntArray81[local37], local29 + this.anIntArray82[local37] + (int) (Math.sin((double) local31 / 1.5D + (double) arg4) * local9), this.anIntArray79[local37], this.anIntArray80[local37], arg1);
					}
					arg3 += this.anIntArray83[local37];
				}
			}
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("80653, " + 102 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "(Ljava/lang/String;IIZII)V")
	public void method213(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			this.aBoolean109 = false;
			@Pc(6) int local6 = arg1;
			if (arg0 != null) {
				@Pc(17) int local17 = arg2 - this.anInt397;
				for (@Pc(19) int local19 = 0; local19 < arg0.length(); local19++) {
					if (arg0.charAt(local19) == '@' && local19 + 4 < arg0.length() && arg0.charAt(local19 + 4) == '@') {
						@Pc(51) int local51 = this.method215(arg0.substring(local19 + 1, local19 + 4));
						if (local51 != -1) {
							arg4 = local51;
						}
						local19 += 4;
					} else {
						@Pc(63) char local63 = arg0.charAt(local19);
						if (local63 != ' ') {
							if (arg3) {
								this.method216(this.aByteArrayArray1[local63], arg1 + this.anIntArray81[local63] + 1, local17 + this.anIntArray82[local63] + 1, this.anIntArray79[local63], this.anIntArray80[local63], 0);
							}
							this.method216(this.aByteArrayArray1[local63], arg1 + this.anIntArray81[local63], local17 + this.anIntArray82[local63], this.anIntArray79[local63], this.anIntArray80[local63], arg4);
						}
						arg1 += this.anIntArray83[local63];
					}
				}
				if (this.aBoolean109) {
					Class6_Sub1_Sub1.method558(local6, arg1 - local6, 893, local17 + (int) ((double) this.anInt397 * 0.7D), 8388608);
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("8883, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "(ILjava/lang/String;IIZII)V")
	public void method214(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 != null) {
				this.aRandom1.setSeed((long) arg5);
				@Pc(13) boolean local13 = false;
				@Pc(21) int local21 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(26) int local26 = 15 - this.anInt397;
				for (@Pc(28) int local28 = 0; local28 < arg1.length(); local28++) {
					if (arg1.charAt(local28) == '@' && local28 + 4 < arg1.length() && arg1.charAt(local28 + 4) == '@') {
						@Pc(60) int local60 = this.method215(arg1.substring(local28 + 1, local28 + 4));
						if (local60 != -1) {
							arg4 = local60;
						}
						local28 += 4;
					} else {
						@Pc(72) char local72 = arg1.charAt(local28);
						if (local72 != ' ') {
							this.method218(0, arg3 + this.anIntArray81[local72] + 1, this.anIntArray80[local72], local26 + this.anIntArray82[local72] + 1, this.anIntArray79[local72], 192, this.aByteArrayArray1[local72]);
							this.method218(arg4, arg3 + this.anIntArray81[local72], this.anIntArray80[local72], local26 + this.anIntArray82[local72], this.anIntArray79[local72], local21, this.aByteArrayArray1[local72]);
						}
						arg3 += this.anIntArray83[local72];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg3++;
						}
					}
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("42663, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + arg5 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	private int method215(@OriginalArg(0) String arg0) {
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
					this.aBoolean109 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean109 = false;
				}
				return -1;
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("37593, " + arg0 + ", " + true + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "([BIIIII)V")
	private void method216(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class6_Sub1_Sub1.anInt821;
		@Pc(9) int local9 = Class6_Sub1_Sub1.anInt821 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class6_Sub1_Sub1.anInt823) {
			local20 = Class6_Sub1_Sub1.anInt823 - arg2;
			arg4 -= local20;
			arg2 = Class6_Sub1_Sub1.anInt823;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class6_Sub1_Sub1.anInt821;
		}
		if (arg2 + arg4 >= Class6_Sub1_Sub1.anInt824) {
			arg4 -= arg2 + arg4 + 1 - Class6_Sub1_Sub1.anInt824;
		}
		if (arg1 < Class6_Sub1_Sub1.anInt825) {
			local20 = Class6_Sub1_Sub1.anInt825 - arg1;
			arg3 -= local20;
			arg1 = Class6_Sub1_Sub1.anInt825;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class6_Sub1_Sub1.anInt826) {
			local20 = arg1 + arg3 + 1 - Class6_Sub1_Sub1.anInt826;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method217(Class6_Sub1_Sub1.anIntArray208, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method217(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "(IIIIIII[B)V")
	private void method218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) byte[] arg6) {
		try {
			@Pc(10) int local10 = arg1 + arg3 * Class6_Sub1_Sub1.anInt821;
			@Pc(14) int local14 = Class6_Sub1_Sub1.anInt821 - arg4;
			@Pc(16) int local16 = 0;
			@Pc(18) int local18 = 0;
			@Pc(25) int local25;
			if (arg3 < Class6_Sub1_Sub1.anInt823) {
				local25 = Class6_Sub1_Sub1.anInt823 - arg3;
				arg2 -= local25;
				arg3 = Class6_Sub1_Sub1.anInt823;
				local18 = local25 * arg4 + 0;
				local10 += local25 * Class6_Sub1_Sub1.anInt821;
			}
			if (arg3 + arg2 >= Class6_Sub1_Sub1.anInt824) {
				arg2 -= arg3 + arg2 + 1 - Class6_Sub1_Sub1.anInt824;
			}
			if (arg1 < Class6_Sub1_Sub1.anInt825) {
				local25 = Class6_Sub1_Sub1.anInt825 - arg1;
				arg4 -= local25;
				arg1 = Class6_Sub1_Sub1.anInt825;
				local18 += local25;
				local10 += local25;
				local16 = local25 + 0;
				local14 += local25;
			}
			if (arg1 + arg4 >= Class6_Sub1_Sub1.anInt826) {
				local25 = arg1 + arg4 + 1 - Class6_Sub1_Sub1.anInt826;
				arg4 -= local25;
				local16 += local25;
				local14 += local25;
			}
			if (arg4 > 0 && arg2 > 0) {
				this.method219(arg6, arg4, arg0, local16, local14, arg5, arg2, local18, Class6_Sub1_Sub1.anIntArray208, local10);
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("28458, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + arg6 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "([BIIIIIIII[II)V")
	private void method219(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg2 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg5 & 0xFF0000) >> 8;
			@Pc(29) int local29 = 256 - arg5;
			for (@Pc(32) int local32 = -arg6; local32 < 0; local32++) {
				for (@Pc(37) int local37 = -arg1; local37 < 0; local37++) {
					if (arg0[arg7++] == 0) {
						arg9++;
					} else {
						@Pc(48) int local48 = arg8[arg9];
						arg8[arg9++] = (((local48 & 0xFF00FF) * local29 & 0xFF00FF00) + ((local48 & 0xFF00) * local29 & 0xFF0000) >> 8) + local19;
					}
				}
				arg9 += arg4;
				arg7 += arg3;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("7685, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 3 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}
}
