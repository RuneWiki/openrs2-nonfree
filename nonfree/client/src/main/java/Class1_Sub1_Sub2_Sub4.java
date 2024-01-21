import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kb")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
	private int anInt717 = 1000;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "B")
	private byte aByte26 = -42;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
	private int anInt718 = 8184;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "Z")
	private boolean aBoolean188 = true;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[256][];

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "[I")
	private int[] anIntArray214 = new int[256];

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "[I")
	private int[] anIntArray215 = new int[256];

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "[I")
	private int[] anIntArray216 = new int[256];

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "[I")
	private int[] anIntArray217 = new int[256];

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "[I")
	private int[] anIntArray218 = new int[256];

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!kb", name = "L", descriptor = "Z")
	private boolean aBoolean189 = false;

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
	public int anInt719;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(ZLclient!xb;ILjava/lang/String;)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		try {
			@Pc(64) Class1_Sub1_Sub3 local64 = new Class1_Sub1_Sub3(this.anInt717, arg1.method666(arg3 + ".dat", null));
			@Pc(74) Class1_Sub1_Sub3 local74 = new Class1_Sub1_Sub3(this.anInt717, arg1.method666("index.dat", null));
			local74.anInt751 = local64.method482() + 4;
			@Pc(91) int local91 = local74.method480();
			if (local91 > 0) {
				local74.anInt751 += (local91 - 1) * 3;
			}
			for (@Pc(105) int local105 = 0; local105 < 256; local105++) {
				this.anIntArray216[local105] = local74.method480();
				this.anIntArray217[local105] = local74.method480();
				@Pc(135) int local135 = this.anIntArray214[local105] = local74.method482();
				@Pc(143) int local143 = this.anIntArray215[local105] = local74.method482();
				@Pc(146) int local146 = local74.method480();
				@Pc(150) int local150 = local135 * local143;
				this.aByteArrayArray3[local105] = new byte[local150];
				@Pc(160) int local160;
				@Pc(185) int local185;
				if (local146 == 0) {
					for (local160 = 0; local160 < local150; local160++) {
						this.aByteArrayArray3[local105][local160] = local64.method481();
					}
				} else if (local146 == 1) {
					for (local160 = 0; local160 < local135; local160++) {
						for (local185 = 0; local185 < local143; local185++) {
							this.aByteArrayArray3[local105][local160 + local185 * local135] = local64.method481();
						}
					}
				}
				if (local143 > this.anInt719 && local105 < 128) {
					this.anInt719 = local143;
				}
				this.anIntArray216[local105] = 1;
				this.anIntArray218[local105] = local135 + 2;
				local160 = 0;
				for (local185 = local143 / 7; local185 < local143; local185++) {
					local160 += this.aByteArrayArray3[local105][local185 * local135];
				}
				@Pc(262) int local262;
				if (local160 <= local143 / 7) {
					local262 = this.anIntArray218[local105]--;
					this.anIntArray216[local105] = 0;
				}
				local160 = 0;
				for (@Pc(276) int local276 = local143 / 7; local276 < local143; local276++) {
					local160 += this.aByteArrayArray3[local105][local135 + local276 * local135 - 1];
				}
				if (local160 <= local143 / 7) {
					local262 = this.anIntArray218[local105]--;
				}
			}
			if (arg0) {
				this.anIntArray218[32] = this.anIntArray218[73];
			} else {
				this.anIntArray218[32] = this.anIntArray218[105];
			}
		} catch (@Pc(335) RuntimeException local335) {
			signlink.reporterror("81028, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local335.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public void method446(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		try {
			this.method451(arg1, arg0, 507 - this.method450(arg1), arg2);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("4413, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 667 + ", " + 507 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIILjava/lang/String;)V")
	public void method447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			this.method451(arg3, arg0, arg2 - this.method450(arg3) / 2, arg1);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("99302, " + arg0 + ", " + arg1 + ", " + 36569 + ", " + arg2 + ", " + arg3 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIZIILjava/lang/String;)V")
	public void method448(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			this.method455(arg2, arg1, arg0 - this.method449(arg4, this.aByte26) / 2, arg3, arg4);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("94778, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method449(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) int local6;
			if (arg1 != -42) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			if (arg0 == null) {
				return 0;
			}
			local6 = 0;
			for (@Pc(19) int local19 = 0; local19 < arg0.length(); local19++) {
				if (arg0.charAt(local19) == '@' && local19 + 4 < arg0.length() && arg0.charAt(local19 + 4) == '@') {
					local19 += 4;
				} else {
					local6 += this.anIntArray218[arg0.charAt(local19)];
				}
			}
			return local6;
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("29256, " + arg0 + ", " + arg1 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method450(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(15) int local15 = 0; local15 < arg0.length(); local15++) {
				local7 += this.anIntArray218[arg0.charAt(local15)];
			}
			return local7;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("42202, " + arg0 + ", " + -309 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(ILjava/lang/String;III)V")
	public void method451(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 != null) {
				@Pc(7) int local7 = arg3 - this.anInt719;
				for (@Pc(15) int local15 = 0; local15 < arg0.length(); local15++) {
					@Pc(21) char local21 = arg0.charAt(local15);
					if (local21 != ' ') {
						this.method458(this.aByteArrayArray3[local21], arg2 + this.anIntArray216[local21], local7 + this.anIntArray217[local21], this.anIntArray214[local21], this.anIntArray215[local21], arg1);
					}
					arg2 += this.anIntArray218[local21];
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("11950, " + -49546 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBIIILjava/lang/String;)V")
	public void method452(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			if (arg4 != null) {
				arg2 -= this.method450(arg4) / 2;
				@Pc(16) int local16 = arg1 - this.anInt719;
				for (@Pc(18) int local18 = 0; local18 < arg4.length(); local18++) {
					@Pc(24) char local24 = arg4.charAt(local18);
					if (local24 != ' ') {
						this.method458(this.aByteArrayArray3[local24], arg2 + this.anIntArray216[local24], local16 + this.anIntArray217[local24] + (int) (Math.sin((double) local18 / 2.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray214[local24], this.anIntArray215[local24], arg0);
					}
					arg2 += this.anIntArray218[local24];
				}
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("38531, " + arg0 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZIILjava/lang/String;I)V")
	public void method453(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 != null) {
				arg0 -= this.method450(arg3) / 2;
				@Pc(19) int local19 = arg2 - this.anInt719;
				for (@Pc(21) int local21 = 0; local21 < arg3.length(); local21++) {
					@Pc(27) char local27 = arg3.charAt(local21);
					if (local27 != ' ') {
						this.method458(this.aByteArrayArray3[local27], arg0 + this.anIntArray216[local27] + (int) (Math.sin((double) local21 / 5.0D + (double) arg4 / 5.0D) * 5.0D), local19 + this.anIntArray217[local27] + (int) (Math.sin((double) local21 / 3.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray214[local27], this.anIntArray215[local27], arg1);
					}
					arg0 += this.anIntArray218[local27];
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("5277, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	public void method454(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg1 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg3 / 8.0D;
				if (arg6 != 4) {
					this.anInt717 = -399;
				}
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg2 -= this.method450(arg1) / 2;
				@Pc(35) int local35 = arg0 - this.anInt719;
				for (@Pc(37) int local37 = 0; local37 < arg1.length(); local37++) {
					@Pc(43) char local43 = arg1.charAt(local37);
					if (local43 != ' ') {
						this.method458(this.aByteArrayArray3[local43], arg2 + this.anIntArray216[local43], local35 + this.anIntArray217[local43] + (int) (Math.sin((double) local37 / 1.5D + (double) arg4) * local9), this.anIntArray214[local43], this.anIntArray215[local43], arg5);
					}
					arg2 += this.anIntArray218[local43];
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("26063, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZIIILjava/lang/String;)V")
	public void method455(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			this.aBoolean189 = false;
			@Pc(10) int local10 = arg2;
			if (arg4 != null) {
				@Pc(18) int local18 = arg0 - this.anInt719;
				for (@Pc(20) int local20 = 0; local20 < arg4.length(); local20++) {
					if (arg4.charAt(local20) == '@' && local20 + 4 < arg4.length() && arg4.charAt(local20 + 4) == '@') {
						@Pc(52) int local52 = this.method457(arg4.substring(local20 + 1, local20 + 4));
						if (local52 != -1) {
							arg3 = local52;
						}
						local20 += 4;
					} else {
						@Pc(64) char local64 = arg4.charAt(local20);
						if (local64 != ' ') {
							if (arg1) {
								this.method458(this.aByteArrayArray3[local64], arg2 + this.anIntArray216[local64] + 1, local18 + this.anIntArray217[local64] + 1, this.anIntArray214[local64], this.anIntArray215[local64], 0);
							}
							this.method458(this.aByteArrayArray3[local64], arg2 + this.anIntArray216[local64], local18 + this.anIntArray217[local64], this.anIntArray214[local64], this.anIntArray215[local64], arg3);
						}
						arg2 += this.anIntArray218[local64];
					}
				}
				if (this.aBoolean189) {
					Class1_Sub1_Sub2.method442(local18 + (int) ((double) this.anInt719 * 0.7D), local10, arg2 - local10, (byte) 6, 8388608);
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("35478, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 16365 + ", " + arg3 + ", " + arg4 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZIIIILjava/lang/String;I)V")
	public void method456(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) boolean local5 = false;
			if (arg4 != null) {
				this.aRandom1.setSeed((long) arg0);
				@Pc(21) int local21 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(26) int local26 = 15 - this.anInt719;
				for (@Pc(28) int local28 = 0; local28 < arg4.length(); local28++) {
					if (arg4.charAt(local28) == '@' && local28 + 4 < arg4.length() && arg4.charAt(local28 + 4) == '@') {
						@Pc(60) int local60 = this.method457(arg4.substring(local28 + 1, local28 + 4));
						if (local60 != -1) {
							arg3 = local60;
						}
						local28 += 4;
					} else {
						@Pc(72) char local72 = arg4.charAt(local28);
						if (local72 != ' ') {
							this.method460(arg5 + this.anIntArray216[local72] + 1, this.anIntArray214[local72], 192, 0, local26 + this.anIntArray217[local72] + 1, this.anIntArray215[local72], this.aByteArrayArray3[local72]);
							this.method460(arg5 + this.anIntArray216[local72], this.anIntArray214[local72], local21, arg3, local26 + this.anIntArray217[local72], this.anIntArray215[local72], this.aByteArrayArray3[local72]);
						}
						arg5 += this.anIntArray218[local72];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg5++;
						}
					}
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("64234, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(Ljava/lang/String;B)I")
	private int method457(@OriginalArg(0) String arg0) {
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
					this.aBoolean189 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean189 = false;
				}
				return -1;
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("46336, " + arg0 + ", " + -119 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BIIIII)V")
	private void method458(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub2.anInt707;
		@Pc(9) int local9 = Class1_Sub1_Sub2.anInt707 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub2.anInt709) {
			local20 = Class1_Sub1_Sub2.anInt709 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub2.anInt709;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub2.anInt707;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt710) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt710;
		}
		if (arg1 < Class1_Sub1_Sub2.anInt711) {
			local20 = Class1_Sub1_Sub2.anInt711 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub2.anInt711;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub2.anInt712) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub2.anInt712;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method459(Class1_Sub1_Sub2.anIntArray213, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method459(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIII[B)V")
	private void method460(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6) {
		try {
			@Pc(14) int local14 = arg0 + arg4 * Class1_Sub1_Sub2.anInt707;
			@Pc(18) int local18 = Class1_Sub1_Sub2.anInt707 - arg1;
			@Pc(20) int local20 = 0;
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			if (arg4 < Class1_Sub1_Sub2.anInt709) {
				local29 = Class1_Sub1_Sub2.anInt709 - arg4;
				arg5 -= local29;
				arg4 = Class1_Sub1_Sub2.anInt709;
				local22 = local29 * arg1 + 0;
				local14 += local29 * Class1_Sub1_Sub2.anInt707;
			}
			if (arg4 + arg5 >= Class1_Sub1_Sub2.anInt710) {
				arg5 -= arg4 + arg5 + 1 - Class1_Sub1_Sub2.anInt710;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt711) {
				local29 = Class1_Sub1_Sub2.anInt711 - arg0;
				arg1 -= local29;
				arg0 = Class1_Sub1_Sub2.anInt711;
				local22 += local29;
				local14 += local29;
				local20 = local29 + 0;
				local18 += local29;
			}
			if (arg0 + arg1 >= Class1_Sub1_Sub2.anInt712) {
				local29 = arg0 + arg1 + 1 - Class1_Sub1_Sub2.anInt712;
				arg1 -= local29;
				local20 += local29;
				local18 += local29;
			}
			if (arg1 > 0 && arg5 > 0) {
				this.method461(this.anInt718, local14, arg5, arg2, Class1_Sub1_Sub2.anIntArray213, local22, arg6, arg3, local20, local18, arg1);
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("81181, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII[II[BIIII)V")
	private void method461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			if (arg0 == 8184) {
				@Pc(23) int local23 = ((arg7 & 0xFF00FF) * arg3 & 0xFF00FF00) + ((arg7 & 0xFF00) * arg3 & 0xFF0000) >> 8;
				@Pc(27) int local27 = 256 - arg3;
				for (@Pc(30) int local30 = -arg2; local30 < 0; local30++) {
					for (@Pc(35) int local35 = -arg10; local35 < 0; local35++) {
						if (arg6[arg5++] == 0) {
							arg1++;
						} else {
							@Pc(46) int local46 = arg4[arg1];
							arg4[arg1++] = (((local46 & 0xFF00FF) * local27 & 0xFF00FF00) + ((local46 & 0xFF00) * local27 & 0xFF0000) >> 8) + local23;
						}
					}
					arg1 += arg9;
					arg5 += arg8;
				}
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("16213, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}
}
