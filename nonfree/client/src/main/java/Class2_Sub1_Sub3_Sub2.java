import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LICHOWDY")
public final class Class2_Sub1_Sub3_Sub2 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!LICHOWDY", name = "z", descriptor = "Z")
	private boolean aBoolean99 = true;

	@OriginalMember(owner = "client!LICHOWDY", name = "A", descriptor = "I")
	private int anInt414 = 435;

	@OriginalMember(owner = "client!LICHOWDY", name = "B", descriptor = "I")
	private int anInt415 = 712;

	@OriginalMember(owner = "client!LICHOWDY", name = "C", descriptor = "I")
	private int anInt416 = 266;

	@OriginalMember(owner = "client!LICHOWDY", name = "D", descriptor = "[[B")
	private byte[][] aByteArrayArray4 = new byte[256][];

	@OriginalMember(owner = "client!LICHOWDY", name = "E", descriptor = "[I")
	private int[] anIntArray97 = new int[256];

	@OriginalMember(owner = "client!LICHOWDY", name = "F", descriptor = "[I")
	private int[] anIntArray98 = new int[256];

	@OriginalMember(owner = "client!LICHOWDY", name = "G", descriptor = "[I")
	private int[] anIntArray99 = new int[256];

	@OriginalMember(owner = "client!LICHOWDY", name = "H", descriptor = "[I")
	private int[] anIntArray100 = new int[256];

	@OriginalMember(owner = "client!LICHOWDY", name = "I", descriptor = "[I")
	private int[] anIntArray101 = new int[256];

	@OriginalMember(owner = "client!LICHOWDY", name = "K", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!LICHOWDY", name = "L", descriptor = "Z")
	private boolean aBoolean100 = false;

	@OriginalMember(owner = "client!LICHOWDY", name = "J", descriptor = "I")
	public int anInt417;

	@OriginalMember(owner = "client!LICHOWDY", name = "<init>", descriptor = "(ILclient!JUPFHAZZ;Ljava/lang/String;Z)V")
	public Class2_Sub1_Sub3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		try {
			@Pc(51) int local51 = 38 / arg0;
			@Pc(67) Class2_Sub1_Sub4 local67 = new Class2_Sub1_Sub4(859, arg1.method275(arg2 + ".dat", null));
			@Pc(76) Class2_Sub1_Sub4 local76 = new Class2_Sub1_Sub4(859, arg1.method275("index.dat", null));
			local76.anInt672 = local67.method494() + 4;
			@Pc(87) int local87 = local76.method492();
			if (local87 > 0) {
				local76.anInt672 += (local87 - 1) * 3;
			}
			for (@Pc(101) int local101 = 0; local101 < 256; local101++) {
				this.anIntArray99[local101] = local76.method492();
				this.anIntArray100[local101] = local76.method492();
				@Pc(125) int local125 = this.anIntArray97[local101] = local76.method494();
				@Pc(133) int local133 = this.anIntArray98[local101] = local76.method494();
				@Pc(136) int local136 = local76.method492();
				@Pc(140) int local140 = local125 * local133;
				this.aByteArrayArray4[local101] = new byte[local140];
				@Pc(150) int local150;
				@Pc(175) int local175;
				if (local136 == 0) {
					for (local150 = 0; local150 < local140; local150++) {
						this.aByteArrayArray4[local101][local150] = local67.method493();
					}
				} else if (local136 == 1) {
					for (local150 = 0; local150 < local125; local150++) {
						for (local175 = 0; local175 < local133; local175++) {
							this.aByteArrayArray4[local101][local150 + local175 * local125] = local67.method493();
						}
					}
				}
				if (local133 > this.anInt417 && local101 < 128) {
					this.anInt417 = local133;
				}
				this.anIntArray99[local101] = 1;
				this.anIntArray101[local101] = local125 + 2;
				local150 = 0;
				for (local175 = local133 / 7; local175 < local133; local175++) {
					local150 += this.aByteArrayArray4[local101][local175 * local125];
				}
				@Pc(252) int local252;
				if (local150 <= local133 / 7) {
					local252 = this.anIntArray101[local101]--;
					this.anIntArray99[local101] = 0;
				}
				local150 = 0;
				for (@Pc(266) int local266 = local133 / 7; local266 < local133; local266++) {
					local150 += this.aByteArrayArray4[local101][local125 + local266 * local125 - 1];
				}
				if (local150 <= local133 / 7) {
					local252 = this.anIntArray101[local101]--;
				}
			}
			if (arg3) {
				this.anIntArray101[32] = this.anIntArray101[73];
			} else {
				this.anIntArray101[32] = this.anIntArray101[105];
			}
		} catch (@Pc(333) RuntimeException local333) {
			signlink.reporterror("14991, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local333.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public void method299(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		try {
			this.method304(arg2, arg1, 507 - this.method303(arg2), this.aBoolean99, arg0);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("73101, " + -570 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 507 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "(Ljava/lang/String;BIII)V")
	public void method300(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			this.method304(arg0, arg2, arg1 - this.method303(arg0) / 2, this.aBoolean99, arg3);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("7911, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "(ILjava/lang/String;ZIII)V")
	public void method301(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.method308(arg4 - this.method302(arg0, (byte) 3) / 2, arg2, arg3, arg1, arg0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("40118, " + 9 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method302(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			@Pc(12) boolean local12 = false;
			for (@Pc(24) int local24 = 0; local24 < arg0.length(); local24++) {
				if (arg0.charAt(local24) == '@' && local24 + 4 < arg0.length() && arg0.charAt(local24 + 4) == '@') {
					local24 += 4;
				} else {
					local7 += this.anIntArray101[arg0.charAt(local24)];
				}
			}
			return local7;
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("38963, " + arg0 + ", " + arg1 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method303(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(19) int local19 = 0;
			for (@Pc(21) int local21 = 0; local21 < arg0.length(); local21++) {
				local19 += this.anIntArray101[arg0.charAt(local21)];
			}
			return local19;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("86665, " + arg0 + ", " + -117 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "(Ljava/lang/String;IIZI)V")
	public void method304(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg0 != null) {
				@Pc(7) int local7 = arg1 - this.anInt417;
				if (arg3) {
					for (@Pc(12) int local12 = 0; local12 < arg0.length(); local12++) {
						@Pc(18) char local18 = arg0.charAt(local12);
						if (local18 != ' ') {
							this.method311(this.aByteArrayArray4[local18], arg2 + this.anIntArray99[local18], local7 + this.anIntArray100[local18], this.anIntArray97[local18], this.anIntArray98[local18], arg4);
						}
						arg2 += this.anIntArray101[local18];
					}
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("39447, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public void method305(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			if (arg4 != null) {
				arg3 -= this.method303(arg4) / 2;
				@Pc(19) int local19 = arg0 - this.anInt417;
				for (@Pc(21) int local21 = 0; local21 < arg4.length(); local21++) {
					@Pc(27) char local27 = arg4.charAt(local21);
					if (local27 != ' ') {
						this.method311(this.aByteArrayArray4[local27], arg3 + this.anIntArray99[local27], local19 + this.anIntArray100[local27] + (int) (Math.sin((double) local21 / 2.0D + (double) arg1 / 5.0D) * 5.0D), this.anIntArray97[local27], this.anIntArray98[local27], arg2);
					}
					arg3 += this.anIntArray101[local27];
				}
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("82034, " + -383 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LICHOWDY", name = "b", descriptor = "(IIIIILjava/lang/String;)V")
	public void method306(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			if (arg4 != null) {
				arg2 -= this.method303(arg4) / 2;
				@Pc(21) int local21 = arg1 - this.anInt417;
				for (@Pc(23) int local23 = 0; local23 < arg4.length(); local23++) {
					@Pc(29) char local29 = arg4.charAt(local23);
					if (local29 != ' ') {
						this.method311(this.aByteArrayArray4[local29], arg2 + this.anIntArray99[local29] + (int) (Math.sin((double) local23 / 5.0D + (double) arg0 / 5.0D) * 5.0D), local21 + this.anIntArray100[local29] + (int) (Math.sin((double) local23 / 3.0D + (double) arg0 / 5.0D) * 5.0D), this.anIntArray97[local29], this.anIntArray98[local29], arg3);
					}
					arg2 += this.anIntArray101[local29];
				}
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("36976, " + arg0 + ", " + 435 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public void method307(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg5 / 8.0D;
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg3 -= this.method303(arg2) / 2;
				@Pc(29) int local29 = arg4 - this.anInt417;
				for (@Pc(31) int local31 = 0; local31 < arg2.length(); local31++) {
					@Pc(37) char local37 = arg2.charAt(local31);
					if (local37 != ' ') {
						this.method311(this.aByteArrayArray4[local37], arg3 + this.anIntArray99[local37], local29 + this.anIntArray100[local37] + (int) (Math.sin((double) local31 / 1.5D + (double) arg1) * local9), this.anIntArray97[local37], this.anIntArray98[local37], arg0);
					}
					arg3 += this.anIntArray101[local37];
				}
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("92394, " + arg0 + ", " + 712 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "(IIIIZLjava/lang/String;)V")
	public void method308(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) String arg4) {
		try {
			this.aBoolean100 = false;
			@Pc(6) int local6 = arg0;
			if (arg4 != null) {
				@Pc(25) int local25 = arg1 - this.anInt417;
				for (@Pc(27) int local27 = 0; local27 < arg4.length(); local27++) {
					if (arg4.charAt(local27) == '@' && local27 + 4 < arg4.length() && arg4.charAt(local27 + 4) == '@') {
						@Pc(60) int local60 = this.method310(arg4.substring(local27 + 1, local27 + 4), this.anInt416);
						if (local60 != -1) {
							arg2 = local60;
						}
						local27 += 4;
					} else {
						@Pc(72) char local72 = arg4.charAt(local27);
						if (local72 != ' ') {
							if (arg3) {
								this.method311(this.aByteArrayArray4[local72], arg0 + this.anIntArray99[local72] + 1, local25 + this.anIntArray100[local72] + 1, this.anIntArray97[local72], this.anIntArray98[local72], 0);
							}
							this.method311(this.aByteArrayArray4[local72], arg0 + this.anIntArray99[local72], local25 + this.anIntArray100[local72], this.anIntArray97[local72], this.anIntArray98[local72], arg2);
						}
						arg0 += this.anIntArray101[local72];
					}
				}
				if (this.aBoolean100) {
					Class2_Sub1_Sub3.method360(arg0 - local6, local6, local25 + (int) ((double) this.anInt417 * 0.7D), 8388608, (byte) 3);
				}
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("86902, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "(IIIIZLjava/lang/String;I)V")
	public void method309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4) {
		try {
			if (arg4 != null) {
				this.aRandom1.setSeed((long) arg0);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(22) int local22 = 15 - this.anInt417;
				for (@Pc(24) int local24 = 0; local24 < arg4.length(); local24++) {
					if (arg4.charAt(local24) == '@' && local24 + 4 < arg4.length() && arg4.charAt(local24 + 4) == '@') {
						@Pc(57) int local57 = this.method310(arg4.substring(local24 + 1, local24 + 4), this.anInt416);
						if (local57 != -1) {
							arg2 = local57;
						}
						local24 += 4;
					} else {
						@Pc(69) char local69 = arg4.charAt(local24);
						if (local69 != ' ') {
							this.method313(local22 + this.anIntArray100[local69] + 1, this.anIntArray98[local69], this.aByteArrayArray4[local69], 0, arg3 + this.anIntArray99[local69] + 1, 192, this.anIntArray97[local69]);
							this.method313(local22 + this.anIntArray100[local69], this.anIntArray98[local69], this.aByteArrayArray4[local69], arg2, arg3 + this.anIntArray99[local69], local17, this.anIntArray97[local69]);
						}
						arg3 += this.anIntArray101[local69];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg3++;
						}
					}
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("78168, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + 21911 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LICHOWDY", name = "b", descriptor = "(Ljava/lang/String;I)I")
	private int method310(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = 17 / arg1;
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
					this.aBoolean100 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean100 = false;
				}
				return -1;
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("40905, " + arg0 + ", " + arg1 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "([BIIIII)V")
	private void method311(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class2_Sub1_Sub3.anInt463;
		@Pc(9) int local9 = Class2_Sub1_Sub3.anInt463 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class2_Sub1_Sub3.anInt465) {
			local20 = Class2_Sub1_Sub3.anInt465 - arg2;
			arg4 -= local20;
			arg2 = Class2_Sub1_Sub3.anInt465;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class2_Sub1_Sub3.anInt463;
		}
		if (arg2 + arg4 >= Class2_Sub1_Sub3.anInt466) {
			arg4 -= arg2 + arg4 + 1 - Class2_Sub1_Sub3.anInt466;
		}
		if (arg1 < Class2_Sub1_Sub3.anInt467) {
			local20 = Class2_Sub1_Sub3.anInt467 - arg1;
			arg3 -= local20;
			arg1 = Class2_Sub1_Sub3.anInt467;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class2_Sub1_Sub3.anInt468) {
			local20 = arg1 + arg3 + 1 - Class2_Sub1_Sub3.anInt468;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method312(Class2_Sub1_Sub3.anIntArray104, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method312(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "(II[BIIIIZ)V")
	private void method313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(10) int local10 = arg4 + arg0 * Class2_Sub1_Sub3.anInt463;
			@Pc(14) int local14 = Class2_Sub1_Sub3.anInt463 - arg6;
			@Pc(16) int local16 = 0;
			@Pc(18) int local18 = 0;
			@Pc(25) int local25;
			if (arg0 < Class2_Sub1_Sub3.anInt465) {
				local25 = Class2_Sub1_Sub3.anInt465 - arg0;
				arg1 -= local25;
				arg0 = Class2_Sub1_Sub3.anInt465;
				local18 = local25 * arg6 + 0;
				local10 += local25 * Class2_Sub1_Sub3.anInt463;
			}
			if (arg0 + arg1 >= Class2_Sub1_Sub3.anInt466) {
				arg1 -= arg0 + arg1 + 1 - Class2_Sub1_Sub3.anInt466;
			}
			if (arg4 < Class2_Sub1_Sub3.anInt467) {
				local25 = Class2_Sub1_Sub3.anInt467 - arg4;
				arg6 -= local25;
				arg4 = Class2_Sub1_Sub3.anInt467;
				local18 += local25;
				local10 += local25;
				local16 = local25 + 0;
				local14 += local25;
			}
			if (arg4 + arg6 >= Class2_Sub1_Sub3.anInt468) {
				local25 = arg4 + arg6 + 1 - Class2_Sub1_Sub3.anInt468;
				arg6 -= local25;
				local16 += local25;
				local14 += local25;
			}
			if (arg6 > 0 && arg1 > 0) {
				this.method314(arg2, local10, arg3, local18, local14, arg1, arg5, arg6, Class2_Sub1_Sub3.anIntArray104, local16);
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("68907, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + true + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "([BIIIIIII[III)V")
	private void method314(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg2 & 0xFF00FF) * arg6 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg6 & 0xFF0000) >> 8;
			@Pc(28) int local28 = 256 - arg6;
			for (@Pc(31) int local31 = -arg5; local31 < 0; local31++) {
				for (@Pc(36) int local36 = -arg7; local36 < 0; local36++) {
					if (arg0[arg3++] == 0) {
						arg1++;
					} else {
						@Pc(47) int local47 = arg8[arg1];
						arg8[arg1++] = (((local47 & 0xFF00FF) * local28 & 0xFF00FF00) + ((local47 & 0xFF00) * local28 & 0xFF0000) >> 8) + local19;
					}
				}
				arg1 += arg4;
				arg3 += arg9;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("2614, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 0 + ", " + arg9 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}
}
