import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XQKSIEVT")
public final class Class2_Sub1_Sub1_Sub4 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!XQKSIEVT", name = "y", descriptor = "Z")
	private boolean aBoolean208 = true;

	@OriginalMember(owner = "client!XQKSIEVT", name = "z", descriptor = "Z")
	private boolean aBoolean209 = false;

	@OriginalMember(owner = "client!XQKSIEVT", name = "A", descriptor = "I")
	private int anInt646 = -938;

	@OriginalMember(owner = "client!XQKSIEVT", name = "B", descriptor = "[[B")
	private byte[][] aByteArrayArray4 = new byte[256][];

	@OriginalMember(owner = "client!XQKSIEVT", name = "C", descriptor = "[I")
	private int[] anIntArray173 = new int[256];

	@OriginalMember(owner = "client!XQKSIEVT", name = "D", descriptor = "[I")
	private int[] anIntArray174 = new int[256];

	@OriginalMember(owner = "client!XQKSIEVT", name = "E", descriptor = "[I")
	private int[] anIntArray175 = new int[256];

	@OriginalMember(owner = "client!XQKSIEVT", name = "F", descriptor = "[I")
	private int[] anIntArray176 = new int[256];

	@OriginalMember(owner = "client!XQKSIEVT", name = "G", descriptor = "[I")
	private int[] anIntArray177 = new int[256];

	@OriginalMember(owner = "client!XQKSIEVT", name = "I", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!XQKSIEVT", name = "J", descriptor = "Z")
	private boolean aBoolean210 = false;

	@OriginalMember(owner = "client!XQKSIEVT", name = "H", descriptor = "I")
	public int anInt647;

	@OriginalMember(owner = "client!XQKSIEVT", name = "<init>", descriptor = "(ZZLclient!MAARFNGV;Ljava/lang/String;)V")
	public Class2_Sub1_Sub1_Sub4(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) String arg3) {
		try {
			@Pc(60) Class2_Sub1_Sub3 local60 = new Class2_Sub1_Sub3(arg2.method218(arg3 + ".dat", null), true);
			@Pc(69) Class2_Sub1_Sub3 local69 = new Class2_Sub1_Sub3(arg2.method218("index.dat", null), true);
			local69.anInt136 = local60.method99() + 4;
			@Pc(80) int local80 = local69.method97();
			if (arg0) {
				this.anInt646 = -277;
			}
			if (local80 > 0) {
				local69.anInt136 += (local80 - 1) * 3;
			}
			for (@Pc(99) int local99 = 0; local99 < 256; local99++) {
				this.anIntArray175[local99] = local69.method97();
				this.anIntArray176[local99] = local69.method97();
				@Pc(123) int local123 = this.anIntArray173[local99] = local69.method99();
				@Pc(131) int local131 = this.anIntArray174[local99] = local69.method99();
				@Pc(134) int local134 = local69.method97();
				@Pc(138) int local138 = local123 * local131;
				this.aByteArrayArray4[local99] = new byte[local138];
				@Pc(148) int local148;
				@Pc(173) int local173;
				if (local134 == 0) {
					for (local148 = 0; local148 < local138; local148++) {
						this.aByteArrayArray4[local99][local148] = local60.method98();
					}
				} else if (local134 == 1) {
					for (local148 = 0; local148 < local123; local148++) {
						for (local173 = 0; local173 < local131; local173++) {
							this.aByteArrayArray4[local99][local148 + local173 * local123] = local60.method98();
						}
					}
				}
				if (local131 > this.anInt647 && local99 < 128) {
					this.anInt647 = local131;
				}
				this.anIntArray175[local99] = 1;
				this.anIntArray177[local99] = local123 + 2;
				local148 = 0;
				for (local173 = local131 / 7; local173 < local131; local173++) {
					local148 += this.aByteArrayArray4[local99][local173 * local123];
				}
				@Pc(250) int local250;
				if (local148 <= local131 / 7) {
					local250 = this.anIntArray177[local99]--;
					this.anIntArray175[local99] = 0;
				}
				local148 = 0;
				for (@Pc(264) int local264 = local131 / 7; local264 < local131; local264++) {
					local148 += this.aByteArrayArray4[local99][local123 + local264 * local123 - 1];
				}
				if (local148 <= local131 / 7) {
					local250 = this.anIntArray177[local99]--;
				}
			}
			if (arg1) {
				this.anIntArray177[32] = this.anIntArray177[73];
			} else {
				this.anIntArray177[32] = this.anIntArray177[105];
			}
		} catch (@Pc(323) RuntimeException local323) {
			signlink.reporterror("67170, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local323.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQKSIEVT", name = "a", descriptor = "(ILjava/lang/String;ZII)V")
	public void method443(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(4) int arg2) {
		try {
			this.method448(arg1, 507 - this.method447(445, arg1), arg0, arg2);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("57388, " + arg0 + ", " + arg1 + ", " + true + ", " + 507 + ", " + arg2 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQKSIEVT", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public void method444(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(3) boolean local3 = false;
			this.method448(arg0, arg3 - this.method447(445, arg0) / 2, arg2, arg4);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("3115, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQKSIEVT", name = "a", descriptor = "(ZLjava/lang/String;IZII)V")
	public void method445(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.method452(arg2, arg3 - this.method446(arg0) / 2, arg1, arg4, arg0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("50295, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQKSIEVT", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method446(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(14) int local14 = 0; local14 < arg0.length(); local14++) {
				if (arg0.charAt(local14) == '@' && local14 + 4 < arg0.length() && arg0.charAt(local14 + 4) == '@') {
					local14 += 4;
				} else {
					local7 += this.anIntArray177[arg0.charAt(local14)];
				}
			}
			return local7;
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("44964, " + true + ", " + arg0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQKSIEVT", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method447(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg1 == null) {
				return 0;
			}
			@Pc(5) int local5 = 0;
			@Pc(9) boolean local9 = false;
			for (@Pc(11) int local11 = 0; local11 < arg1.length(); local11++) {
				local5 += this.anIntArray177[arg1.charAt(local11)];
			}
			return local5;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("86782, " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQKSIEVT", name = "a", descriptor = "(Ljava/lang/String;ZIII)V")
	public void method448(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 != null) {
				@Pc(9) int local9 = arg3 - this.anInt647;
				for (@Pc(11) int local11 = 0; local11 < arg0.length(); local11++) {
					@Pc(17) char local17 = arg0.charAt(local11);
					if (local17 != ' ') {
						this.method455(this.aByteArrayArray4[local17], arg1 + this.anIntArray175[local17], local9 + this.anIntArray176[local17], this.anIntArray173[local17], this.anIntArray174[local17], arg2);
					}
					arg1 += this.anIntArray177[local17];
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("46212, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQKSIEVT", name = "a", descriptor = "(Ljava/lang/String;IBIII)V")
	public void method449(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 != null) {
				arg2 -= this.method447(445, arg0) / 2;
				@Pc(28) int local28 = arg1 - this.anInt647;
				for (@Pc(30) int local30 = 0; local30 < arg0.length(); local30++) {
					@Pc(36) char local36 = arg0.charAt(local30);
					if (local36 != ' ') {
						this.method455(this.aByteArrayArray4[local36], arg2 + this.anIntArray175[local36], local28 + this.anIntArray176[local36] + (int) (Math.sin((double) local30 / 2.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray173[local36], this.anIntArray174[local36], arg4);
					}
					arg2 += this.anIntArray177[local36];
				}
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("82540, " + arg0 + ", " + arg1 + ", " + -122 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQKSIEVT", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public void method450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 != null) {
				arg4 -= this.method447(445, arg2) / 2;
				@Pc(19) int local19 = arg3 - this.anInt647;
				for (@Pc(21) int local21 = 0; local21 < arg2.length(); local21++) {
					@Pc(27) char local27 = arg2.charAt(local21);
					if (local27 != ' ') {
						this.method455(this.aByteArrayArray4[local27], arg4 + this.anIntArray175[local27] + (int) (Math.sin((double) local21 / 5.0D + (double) arg1 / 5.0D) * 5.0D), local19 + this.anIntArray176[local27] + (int) (Math.sin((double) local21 / 3.0D + (double) arg1 / 5.0D) * 5.0D), this.anIntArray173[local27], this.anIntArray174[local27], arg0);
					}
					arg4 += this.anIntArray177[local27];
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("1221, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQKSIEVT", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
	public void method451(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		try {
			if (arg5 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg3 / 8.0D;
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg2 -= this.method447(445, arg5) / 2;
				@Pc(33) int local33 = arg1 - this.anInt647;
				for (@Pc(35) int local35 = 0; local35 < arg5.length(); local35++) {
					@Pc(41) char local41 = arg5.charAt(local35);
					if (local41 != ' ') {
						this.method455(this.aByteArrayArray4[local41], arg2 + this.anIntArray175[local41], local33 + this.anIntArray176[local41] + (int) (Math.sin((double) local35 / 1.5D + (double) arg4) * local9), this.anIntArray173[local41], this.anIntArray174[local41], arg0);
					}
					arg2 += this.anIntArray177[local41];
				}
			}
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("63822, " + arg0 + ", " + 28569 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQKSIEVT", name = "a", descriptor = "(ZIIIILjava/lang/String;)V")
	public void method452(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4) {
		try {
			this.aBoolean210 = false;
			@Pc(9) int local9 = arg1;
			if (arg4 != null) {
				@Pc(17) int local17 = arg3 - this.anInt647;
				for (@Pc(19) int local19 = 0; local19 < arg4.length(); local19++) {
					if (arg4.charAt(local19) == '@' && local19 + 4 < arg4.length() && arg4.charAt(local19 + 4) == '@') {
						@Pc(51) int local51 = this.method454(arg4.substring(local19 + 1, local19 + 4));
						if (local51 != -1) {
							arg2 = local51;
						}
						local19 += 4;
					} else {
						@Pc(63) char local63 = arg4.charAt(local19);
						if (local63 != ' ') {
							if (arg0) {
								this.method455(this.aByteArrayArray4[local63], arg1 + this.anIntArray175[local63] + 1, local17 + this.anIntArray176[local63] + 1, this.anIntArray173[local63], this.anIntArray174[local63], 0);
							}
							this.method455(this.aByteArrayArray4[local63], arg1 + this.anIntArray175[local63], local17 + this.anIntArray176[local63], this.anIntArray173[local63], this.anIntArray174[local63], arg2);
						}
						arg1 += this.anIntArray177[local63];
					}
				}
				if (this.aBoolean210) {
					Class2_Sub1_Sub1.method439(local9, 129, local17 + (int) ((double) this.anInt647 * 0.7D), arg1 - local9, 8388608);
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("3447, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -877 + ", " + arg4 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQKSIEVT", name = "a", descriptor = "(ZIIZLjava/lang/String;II)V")
	public void method453(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg2 != null) {
				this.aRandom1.setSeed((long) arg3);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(22) int local22 = 15 - this.anInt647;
				for (@Pc(27) int local27 = 0; local27 < arg2.length(); local27++) {
					if (arg2.charAt(local27) == '@' && local27 + 4 < arg2.length() && arg2.charAt(local27 + 4) == '@') {
						@Pc(59) int local59 = this.method454(arg2.substring(local27 + 1, local27 + 4));
						if (local59 != -1) {
							arg4 = local59;
						}
						local27 += 4;
					} else {
						@Pc(71) char local71 = arg2.charAt(local27);
						if (local71 != ' ') {
							this.method457(local22 + this.anIntArray176[local71] + 1, this.aByteArrayArray4[local71], arg0 + this.anIntArray175[local71] + 1, 0, 192, this.anIntArray173[local71], this.anIntArray174[local71]);
							this.method457(local22 + this.anIntArray176[local71], this.aByteArrayArray4[local71], arg0 + this.anIntArray175[local71], arg4, local17, this.anIntArray173[local71], this.anIntArray174[local71]);
						}
						arg0 += this.anIntArray177[local71];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg0++;
						}
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("71838, " + true + ", " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQKSIEVT", name = "b", descriptor = "(ILjava/lang/String;)I")
	private int method454(@OriginalArg(1) String arg0) {
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
					this.aBoolean210 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean210 = false;
				}
				return -1;
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("27386, " + 7 + ", " + arg0 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQKSIEVT", name = "a", descriptor = "([BIIIII)V")
	private void method455(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class2_Sub1_Sub1.anInt637;
		@Pc(9) int local9 = Class2_Sub1_Sub1.anInt637 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class2_Sub1_Sub1.anInt639) {
			local20 = Class2_Sub1_Sub1.anInt639 - arg2;
			arg4 -= local20;
			arg2 = Class2_Sub1_Sub1.anInt639;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class2_Sub1_Sub1.anInt637;
		}
		if (arg2 + arg4 >= Class2_Sub1_Sub1.anInt640) {
			arg4 -= arg2 + arg4 + 1 - Class2_Sub1_Sub1.anInt640;
		}
		if (arg1 < Class2_Sub1_Sub1.anInt641) {
			local20 = Class2_Sub1_Sub1.anInt641 - arg1;
			arg3 -= local20;
			arg1 = Class2_Sub1_Sub1.anInt641;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class2_Sub1_Sub1.anInt642) {
			local20 = arg1 + arg3 + 1 - Class2_Sub1_Sub1.anInt642;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method456(Class2_Sub1_Sub1.anIntArray172, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!XQKSIEVT", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method456(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!XQKSIEVT", name = "a", descriptor = "(IZ[BIIIII)V")
	private void method457(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg2 + arg0 * Class2_Sub1_Sub1.anInt637;
			@Pc(9) int local9 = Class2_Sub1_Sub1.anInt637 - arg5;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(20) int local20;
			if (arg0 < Class2_Sub1_Sub1.anInt639) {
				local20 = Class2_Sub1_Sub1.anInt639 - arg0;
				arg6 -= local20;
				arg0 = Class2_Sub1_Sub1.anInt639;
				local13 = local20 * arg5 + 0;
				local5 += local20 * Class2_Sub1_Sub1.anInt637;
			}
			if (arg0 + arg6 >= Class2_Sub1_Sub1.anInt640) {
				arg6 -= arg0 + arg6 + 1 - Class2_Sub1_Sub1.anInt640;
			}
			if (arg2 < Class2_Sub1_Sub1.anInt641) {
				local20 = Class2_Sub1_Sub1.anInt641 - arg2;
				arg5 -= local20;
				arg2 = Class2_Sub1_Sub1.anInt641;
				local13 += local20;
				local5 += local20;
				local11 = local20 + 0;
				local9 += local20;
			}
			if (arg2 + arg5 >= Class2_Sub1_Sub1.anInt642) {
				local20 = arg2 + arg5 + 1 - Class2_Sub1_Sub1.anInt642;
				arg5 -= local20;
				local11 += local20;
				local9 += local20;
			}
			if (arg5 > 0 && arg6 > 0) {
				this.method458(arg6, arg1, local9, Class2_Sub1_Sub1.anIntArray172, arg5, local11, arg3, local13, arg4, local5);
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("99762, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQKSIEVT", name = "a", descriptor = "(II[BI[IIIIIII)V")
	private void method458(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg6 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((arg6 & 0xFF00) * arg8 & 0xFF0000) >> 8;
			@Pc(33) int local33 = 256 - arg8;
			for (@Pc(36) int local36 = -arg0; local36 < 0; local36++) {
				for (@Pc(41) int local41 = -arg4; local41 < 0; local41++) {
					if (arg1[arg7++] == 0) {
						arg9++;
					} else {
						@Pc(52) int local52 = arg3[arg9];
						arg3[arg9++] = (((local52 & 0xFF00FF) * local33 & 0xFF00FF00) + ((local52 & 0xFF00) * local33 & 0xFF0000) >> 8) + local19;
					}
				}
				arg9 += arg2;
				arg7 += arg5;
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("74041, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}
}
