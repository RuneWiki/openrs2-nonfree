import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RLQTDOAP")
public final class Class4_Sub1_Sub2_Sub4 extends Class4_Sub1_Sub2 {

	@OriginalMember(owner = "client!RLQTDOAP", name = "B", descriptor = "I")
	private int anInt707;

	@OriginalMember(owner = "client!RLQTDOAP", name = "z", descriptor = "Z")
	private boolean aBoolean186 = true;

	@OriginalMember(owner = "client!RLQTDOAP", name = "A", descriptor = "Z")
	private boolean aBoolean187 = true;

	@OriginalMember(owner = "client!RLQTDOAP", name = "C", descriptor = "[[B")
	private byte[][] aByteArrayArray4 = new byte[256][];

	@OriginalMember(owner = "client!RLQTDOAP", name = "D", descriptor = "[I")
	private int[] anIntArray166 = new int[256];

	@OriginalMember(owner = "client!RLQTDOAP", name = "E", descriptor = "[I")
	private int[] anIntArray167 = new int[256];

	@OriginalMember(owner = "client!RLQTDOAP", name = "F", descriptor = "[I")
	private int[] anIntArray168 = new int[256];

	@OriginalMember(owner = "client!RLQTDOAP", name = "G", descriptor = "[I")
	private int[] anIntArray169 = new int[256];

	@OriginalMember(owner = "client!RLQTDOAP", name = "H", descriptor = "[I")
	private int[] anIntArray170 = new int[256];

	@OriginalMember(owner = "client!RLQTDOAP", name = "J", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!RLQTDOAP", name = "K", descriptor = "Z")
	private boolean aBoolean188 = false;

	@OriginalMember(owner = "client!RLQTDOAP", name = "I", descriptor = "I")
	public int anInt708;

	@OriginalMember(owner = "client!RLQTDOAP", name = "<init>", descriptor = "(ZLjava/lang/String;ILclient!TKEGJSFV;)V")
	public Class4_Sub1_Sub2_Sub4(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class38 arg3) {
		try {
			@Pc(57) Class4_Sub1_Sub3 local57 = new Class4_Sub1_Sub3(arg3.method514(arg1 + ".dat", null), false);
			@Pc(66) Class4_Sub1_Sub3 local66 = new Class4_Sub1_Sub3(arg3.method514("index.dat", null), false);
			local66.anInt242 = local57.method169() + 4;
			@Pc(85) int local85 = local66.method167();
			if (local85 > 0) {
				local66.anInt242 += (local85 - 1) * 3;
			}
			for (@Pc(99) int local99 = 0; local99 < 256; local99++) {
				this.anIntArray168[local99] = local66.method167();
				this.anIntArray169[local99] = local66.method167();
				@Pc(123) int local123 = this.anIntArray166[local99] = local66.method169();
				@Pc(131) int local131 = this.anIntArray167[local99] = local66.method169();
				@Pc(134) int local134 = local66.method167();
				@Pc(138) int local138 = local123 * local131;
				this.aByteArrayArray4[local99] = new byte[local138];
				@Pc(148) int local148;
				@Pc(173) int local173;
				if (local134 == 0) {
					for (local148 = 0; local148 < local138; local148++) {
						this.aByteArrayArray4[local99][local148] = local57.method168();
					}
				} else if (local134 == 1) {
					for (local148 = 0; local148 < local123; local148++) {
						for (local173 = 0; local173 < local131; local173++) {
							this.aByteArrayArray4[local99][local148 + local173 * local123] = local57.method168();
						}
					}
				}
				if (local131 > this.anInt708 && local99 < 128) {
					this.anInt708 = local131;
				}
				this.anIntArray168[local99] = 1;
				this.anIntArray170[local99] = local123 + 2;
				local148 = 0;
				for (local173 = local131 / 7; local173 < local131; local173++) {
					local148 += this.aByteArrayArray4[local99][local173 * local123];
				}
				@Pc(250) int local250;
				if (local148 <= local131 / 7) {
					local250 = this.anIntArray170[local99]--;
					this.anIntArray168[local99] = 0;
				}
				local148 = 0;
				for (@Pc(264) int local264 = local131 / 7; local264 < local131; local264++) {
					local148 += this.aByteArrayArray4[local99][local123 + local264 * local123 - 1];
				}
				if (local148 <= local131 / 7) {
					local250 = this.anIntArray170[local99]--;
				}
			}
			if (arg0) {
				this.anIntArray170[32] = this.anIntArray170[73];
			} else {
				this.anIntArray170[32] = this.anIntArray170[105];
			}
		} catch (@Pc(323) RuntimeException local323) {
			signlink.reporterror("20689, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local323.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RLQTDOAP", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public void method494(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(3) boolean local3 = false;
			this.method499(arg1, arg0, 507 - this.method498(arg0), arg2);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("14346, " + 507 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RLQTDOAP", name = "a", descriptor = "(IIIILjava/lang/String;)V")
	public void method495(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			this.method499(arg1, arg3, arg2 - this.method498(arg3) / 2, arg0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("21033, " + arg0 + ", " + 3 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RLQTDOAP", name = "a", descriptor = "(IIIZZLjava/lang/String;)V")
	public void method496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) String arg4) {
		try {
			this.method503(arg4, arg1, arg0, arg2 - this.method497(arg4, 555) / 2, arg3);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("98103, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RLQTDOAP", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method497(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			@Pc(11) boolean local11 = false;
			for (@Pc(13) int local13 = 0; local13 < arg0.length(); local13++) {
				if (arg0.charAt(local13) == '@' && local13 + 4 < arg0.length() && arg0.charAt(local13 + 4) == '@') {
					local13 += 4;
				} else {
					local7 += this.anIntArray170[arg0.charAt(local13)];
				}
			}
			return local7;
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("383, " + arg0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RLQTDOAP", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method498(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(11) int local11 = 0;
			for (@Pc(13) int local13 = 0; local13 < arg0.length(); local13++) {
				local11 += this.anIntArray170[arg0.charAt(local13)];
			}
			return local11;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("84609, " + 37461 + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RLQTDOAP", name = "b", descriptor = "(ILjava/lang/String;III)V")
	public void method499(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 != null) {
				@Pc(9) int local9 = arg0 - this.anInt708;
				for (@Pc(11) int local11 = 0; local11 < arg1.length(); local11++) {
					@Pc(17) char local17 = arg1.charAt(local11);
					if (local17 != ' ') {
						this.method506(this.aByteArrayArray4[local17], arg2 + this.anIntArray168[local17], local9 + this.anIntArray169[local17], this.anIntArray166[local17], this.anIntArray167[local17], arg3);
					}
					arg2 += this.anIntArray170[local17];
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("79905, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 411 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RLQTDOAP", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public void method500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 != null) {
				arg3 -= this.method498(arg2) / 2;
				@Pc(27) int local27 = arg4 - this.anInt708;
				for (@Pc(29) int local29 = 0; local29 < arg2.length(); local29++) {
					@Pc(35) char local35 = arg2.charAt(local29);
					if (local35 != ' ') {
						this.method506(this.aByteArrayArray4[local35], arg3 + this.anIntArray168[local35], local27 + this.anIntArray169[local35] + (int) (Math.sin((double) local29 / 2.0D + (double) arg0 / 5.0D) * 5.0D), this.anIntArray166[local35], this.anIntArray167[local35], arg1);
					}
					arg3 += this.anIntArray170[local35];
				}
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("25402, " + arg0 + ", " + arg1 + ", " + 42587 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RLQTDOAP", name = "a", descriptor = "(Ljava/lang/String;IBIII)V")
	public void method501(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 != null) {
				arg3 -= this.method498(arg0) / 2;
				@Pc(31) int local31 = arg2 - this.anInt708;
				for (@Pc(33) int local33 = 0; local33 < arg0.length(); local33++) {
					@Pc(39) char local39 = arg0.charAt(local33);
					if (local39 != ' ') {
						this.method506(this.aByteArrayArray4[local39], arg3 + this.anIntArray168[local39] + (int) (Math.sin((double) local33 / 5.0D + (double) arg1 / 5.0D) * 5.0D), local31 + this.anIntArray169[local39] + (int) (Math.sin((double) local33 / 3.0D + (double) arg1 / 5.0D) * 5.0D), this.anIntArray166[local39], this.anIntArray167[local39], arg4);
					}
					arg3 += this.anIntArray170[local39];
				}
			}
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("12336, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RLQTDOAP", name = "a", descriptor = "(IIZIILjava/lang/String;I)V")
	public void method502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg4 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg1 / 8.0D;
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg3 -= this.method498(arg4) / 2;
				@Pc(29) int local29 = arg0 - this.anInt708;
				for (@Pc(41) int local41 = 0; local41 < arg4.length(); local41++) {
					@Pc(47) char local47 = arg4.charAt(local41);
					if (local47 != ' ') {
						this.method506(this.aByteArrayArray4[local47], arg3 + this.anIntArray168[local47], local29 + this.anIntArray169[local47] + (int) (Math.sin((double) local41 / 1.5D + (double) arg5) * local9), this.anIntArray166[local47], this.anIntArray167[local47], arg2);
					}
					arg3 += this.anIntArray170[local47];
				}
			}
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("58593, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RLQTDOAP", name = "a", descriptor = "(Ljava/lang/String;IIIIZ)V")
	public void method503(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		try {
			this.aBoolean188 = false;
			@Pc(6) int local6 = arg3;
			if (arg0 != null) {
				@Pc(25) int local25 = arg2 - this.anInt708;
				for (@Pc(27) int local27 = 0; local27 < arg0.length(); local27++) {
					if (arg0.charAt(local27) == '@' && local27 + 4 < arg0.length() && arg0.charAt(local27 + 4) == '@') {
						@Pc(59) int local59 = this.method505(arg0.substring(local27 + 1, local27 + 4));
						if (local59 != -1) {
							arg1 = local59;
						}
						local27 += 4;
					} else {
						@Pc(71) char local71 = arg0.charAt(local27);
						if (local71 != ' ') {
							if (arg4) {
								this.method506(this.aByteArrayArray4[local71], arg3 + this.anIntArray168[local71] + 1, local25 + this.anIntArray169[local71] + 1, this.anIntArray166[local71], this.anIntArray167[local71], 0);
							}
							this.method506(this.aByteArrayArray4[local71], arg3 + this.anIntArray168[local71], local25 + this.anIntArray169[local71], this.anIntArray166[local71], this.anIntArray167[local71], arg1);
						}
						arg3 += this.anIntArray170[local71];
					}
				}
				if (this.aBoolean188) {
					Class4_Sub1_Sub2.method490(local25 + (int) ((double) this.anInt708 * 0.7D), local6, arg3 - local6, 8388608);
				}
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("52306, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -964 + ", " + arg3 + ", " + arg4 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RLQTDOAP", name = "a", descriptor = "(IILjava/lang/String;IIIZ)V")
	public void method504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 != null) {
				this.aRandom1.setSeed((long) arg1);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(22) int local22 = 15 - this.anInt708;
				for (@Pc(24) int local24 = 0; local24 < arg2.length(); local24++) {
					if (arg2.charAt(local24) == '@' && local24 + 4 < arg2.length() && arg2.charAt(local24 + 4) == '@') {
						@Pc(56) int local56 = this.method505(arg2.substring(local24 + 1, local24 + 4));
						if (local56 != -1) {
							arg0 = local56;
						}
						local24 += 4;
					} else {
						@Pc(68) char local68 = arg2.charAt(local24);
						if (local68 != ' ') {
							this.method508(this.aByteArrayArray4[local68], local22 + this.anIntArray169[local68] + 1, 0, this.anIntArray167[local68], arg4 + this.anIntArray168[local68] + 1, this.anIntArray166[local68], 192);
							this.method508(this.aByteArrayArray4[local68], local22 + this.anIntArray169[local68], arg0, this.anIntArray167[local68], arg4 + this.anIntArray168[local68], this.anIntArray166[local68], local17);
						}
						arg4 += this.anIntArray170[local68];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg4++;
						}
					}
				}
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("14370, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 7 + ", " + arg4 + ", " + true + ", " + local167.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RLQTDOAP", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	private int method505(@OriginalArg(0) String arg0) {
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
					this.aBoolean188 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean188 = false;
				}
				return -1;
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("5363, " + arg0 + ", " + true + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RLQTDOAP", name = "a", descriptor = "([BIIIII)V")
	private void method506(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class4_Sub1_Sub2.anInt698;
		@Pc(9) int local9 = Class4_Sub1_Sub2.anInt698 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class4_Sub1_Sub2.anInt700) {
			local20 = Class4_Sub1_Sub2.anInt700 - arg2;
			arg4 -= local20;
			arg2 = Class4_Sub1_Sub2.anInt700;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class4_Sub1_Sub2.anInt698;
		}
		if (arg2 + arg4 >= Class4_Sub1_Sub2.anInt701) {
			arg4 -= arg2 + arg4 + 1 - Class4_Sub1_Sub2.anInt701;
		}
		if (arg1 < Class4_Sub1_Sub2.anInt702) {
			local20 = Class4_Sub1_Sub2.anInt702 - arg1;
			arg3 -= local20;
			arg1 = Class4_Sub1_Sub2.anInt702;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class4_Sub1_Sub2.anInt703) {
			local20 = arg1 + arg3 + 1 - Class4_Sub1_Sub2.anInt703;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method507(Class4_Sub1_Sub2.anIntArray165, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!RLQTDOAP", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method507(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!RLQTDOAP", name = "a", descriptor = "([BZIIIIII)V")
	private void method508(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(10) int local10 = arg4 + arg1 * Class4_Sub1_Sub2.anInt698;
			@Pc(14) int local14 = Class4_Sub1_Sub2.anInt698 - arg5;
			@Pc(16) int local16 = 0;
			@Pc(18) int local18 = 0;
			@Pc(25) int local25;
			if (arg1 < Class4_Sub1_Sub2.anInt700) {
				local25 = Class4_Sub1_Sub2.anInt700 - arg1;
				arg3 -= local25;
				arg1 = Class4_Sub1_Sub2.anInt700;
				local18 = local25 * arg5 + 0;
				local10 += local25 * Class4_Sub1_Sub2.anInt698;
			}
			if (arg1 + arg3 >= Class4_Sub1_Sub2.anInt701) {
				arg3 -= arg1 + arg3 + 1 - Class4_Sub1_Sub2.anInt701;
			}
			if (arg4 < Class4_Sub1_Sub2.anInt702) {
				local25 = Class4_Sub1_Sub2.anInt702 - arg4;
				arg5 -= local25;
				arg4 = Class4_Sub1_Sub2.anInt702;
				local18 += local25;
				local10 += local25;
				local16 = local25 + 0;
				local14 += local25;
			}
			if (arg4 + arg5 >= Class4_Sub1_Sub2.anInt703) {
				local25 = arg4 + arg5 + 1 - Class4_Sub1_Sub2.anInt703;
				arg5 -= local25;
				local16 += local25;
				local14 += local25;
			}
			if (arg5 > 0 && arg3 > 0) {
				this.method509(arg2, local14, arg3, arg6, arg0, Class4_Sub1_Sub2.anIntArray165, local16, local18, arg5, local10);
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("66788, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RLQTDOAP", name = "a", descriptor = "(IIIII[B[IIIII)V")
	private void method509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(22) int local22 = ((arg0 & 0xFF00FF) * arg3 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg3 & 0xFF0000) >> 8;
			@Pc(26) int local26 = 256 - arg3;
			for (@Pc(29) int local29 = -arg2; local29 < 0; local29++) {
				for (@Pc(34) int local34 = -arg8; local34 < 0; local34++) {
					if (arg4[arg7++] == 0) {
						arg9++;
					} else {
						@Pc(45) int local45 = arg5[arg9];
						arg5[arg9++] = (((local45 & 0xFF00FF) * local26 & 0xFF00FF00) + ((local45 & 0xFF00) * local26 & 0xFF0000) >> 8) + local22;
					}
				}
				arg9 += arg1;
				arg7 += arg6;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("29807, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}
}
