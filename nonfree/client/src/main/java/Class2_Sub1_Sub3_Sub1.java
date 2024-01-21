import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BKBLJVKV")
public final class Class2_Sub1_Sub3_Sub1 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!BKBLJVKV", name = "z", descriptor = "I")
	private int anInt165;

	@OriginalMember(owner = "client!BKBLJVKV", name = "B", descriptor = "I")
	private int anInt166;

	@OriginalMember(owner = "client!BKBLJVKV", name = "w", descriptor = "Z")
	private boolean aBoolean43 = true;

	@OriginalMember(owner = "client!BKBLJVKV", name = "x", descriptor = "I")
	private int anInt163 = 2;

	@OriginalMember(owner = "client!BKBLJVKV", name = "y", descriptor = "I")
	private int anInt164 = -21443;

	@OriginalMember(owner = "client!BKBLJVKV", name = "A", descriptor = "B")
	private byte aByte12 = 8;

	@OriginalMember(owner = "client!BKBLJVKV", name = "C", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[256][];

	@OriginalMember(owner = "client!BKBLJVKV", name = "D", descriptor = "[I")
	private int[] anIntArray19 = new int[256];

	@OriginalMember(owner = "client!BKBLJVKV", name = "E", descriptor = "[I")
	private int[] anIntArray20 = new int[256];

	@OriginalMember(owner = "client!BKBLJVKV", name = "F", descriptor = "[I")
	private int[] anIntArray21 = new int[256];

	@OriginalMember(owner = "client!BKBLJVKV", name = "G", descriptor = "[I")
	private int[] anIntArray22 = new int[256];

	@OriginalMember(owner = "client!BKBLJVKV", name = "H", descriptor = "[I")
	private int[] anIntArray23 = new int[256];

	@OriginalMember(owner = "client!BKBLJVKV", name = "J", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!BKBLJVKV", name = "K", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!BKBLJVKV", name = "I", descriptor = "I")
	public int anInt167;

	@OriginalMember(owner = "client!BKBLJVKV", name = "<init>", descriptor = "(Ljava/lang/String;ZILclient!VSQMPWOM;)V")
	public Class2_Sub1_Sub3_Sub1(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class39 arg3) {
		try {
			@Pc(63) Class2_Sub1_Sub2 local63 = new Class2_Sub1_Sub2(arg3.method489(arg0 + ".dat", null), -990);
			@Pc(72) Class2_Sub1_Sub2 local72 = new Class2_Sub1_Sub2(arg3.method489("index.dat", null), -990);
			local72.anInt123 = local63.method81() + 4;
			@Pc(93) int local93 = local72.method79();
			if (local93 > 0) {
				local72.anInt123 += (local93 - 1) * 3;
			}
			for (@Pc(107) int local107 = 0; local107 < 256; local107++) {
				this.anIntArray21[local107] = local72.method79();
				this.anIntArray22[local107] = local72.method79();
				@Pc(131) int local131 = this.anIntArray19[local107] = local72.method81();
				@Pc(139) int local139 = this.anIntArray20[local107] = local72.method81();
				@Pc(142) int local142 = local72.method79();
				@Pc(146) int local146 = local131 * local139;
				this.aByteArrayArray1[local107] = new byte[local146];
				@Pc(156) int local156;
				@Pc(181) int local181;
				if (local142 == 0) {
					for (local156 = 0; local156 < local146; local156++) {
						this.aByteArrayArray1[local107][local156] = local63.method80();
					}
				} else if (local142 == 1) {
					for (local156 = 0; local156 < local131; local156++) {
						for (local181 = 0; local181 < local139; local181++) {
							this.aByteArrayArray1[local107][local156 + local181 * local131] = local63.method80();
						}
					}
				}
				if (local139 > this.anInt167 && local107 < 128) {
					this.anInt167 = local139;
				}
				this.anIntArray21[local107] = 1;
				this.anIntArray23[local107] = local131 + 2;
				local156 = 0;
				for (local181 = local139 / 7; local181 < local139; local181++) {
					local156 += this.aByteArrayArray1[local107][local181 * local131];
				}
				@Pc(258) int local258;
				if (local156 <= local139 / 7) {
					local258 = this.anIntArray23[local107]--;
					this.anIntArray21[local107] = 0;
				}
				local156 = 0;
				for (@Pc(272) int local272 = local139 / 7; local272 < local139; local272++) {
					local156 += this.aByteArrayArray1[local107][local131 + local272 * local131 - 1];
				}
				if (local156 <= local139 / 7) {
					local258 = this.anIntArray23[local107]--;
				}
			}
			if (arg1) {
				this.anIntArray23[32] = this.anIntArray23[73];
			} else {
				this.anIntArray23[32] = this.anIntArray23[105];
			}
		} catch (@Pc(339) RuntimeException local339) {
			signlink.reporterror("85952, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local339.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public void method148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0 != this.anInt164) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			this.method153(arg3, arg2, 507 - this.method152(arg2), arg1);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("99961, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 507 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "(IBILjava/lang/String;I)V")
	public void method149(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		try {
			this.method153(arg0, arg2, arg3 - this.method152(arg2) / 2, arg1);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("89362, " + arg0 + ", " + 8 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "(ZLjava/lang/String;IIII)V")
	public void method150(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.method157(arg0, arg3, arg4 - this.method151(arg1) / 2, arg2, arg1);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("40502, " + arg0 + ", " + arg1 + ", " + -930 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method151(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			@Pc(13) int local13;
			if (this.anInt163 != 2) {
				for (local13 = 1; local13 > 0; local13++) {
				}
			}
			for (local13 = 0; local13 < arg0.length(); local13++) {
				if (arg0.charAt(local13) == '@' && local13 + 4 < arg0.length() && arg0.charAt(local13 + 4) == '@') {
					local13 += 4;
				} else {
					local7 += this.anIntArray23[arg0.charAt(local13)];
				}
			}
			return local7;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("69067, " + arg0 + ", " + 2 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BKBLJVKV", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public int method152(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(15) int local15 = 0;
			for (@Pc(17) int local17 = 0; local17 < arg0.length(); local17++) {
				local15 += this.anIntArray23[arg0.charAt(local17)];
			}
			return local15;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("31856, " + arg0 + ", " + 0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public void method153(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 != null) {
				@Pc(7) int local7 = arg0 - this.anInt167;
				for (@Pc(9) int local9 = 0; local9 < arg1.length(); local9++) {
					@Pc(15) char local15 = arg1.charAt(local9);
					if (local15 != ' ') {
						this.method160(this.aByteArrayArray1[local15], arg2 + this.anIntArray21[local15], local7 + this.anIntArray22[local15], this.anIntArray19[local15], this.anIntArray20[local15], arg3);
					}
					arg2 += this.anIntArray23[local15];
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("76639, " + arg0 + ", " + arg1 + ", " + 20424 + ", " + arg2 + ", " + arg3 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public void method154(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 != null) {
				arg2 -= this.method152(arg1) / 2;
				@Pc(16) int local16 = arg0 - this.anInt167;
				for (@Pc(21) int local21 = 0; local21 < arg1.length(); local21++) {
					@Pc(27) char local27 = arg1.charAt(local21);
					if (local27 != ' ') {
						this.method160(this.aByteArrayArray1[local27], arg2 + this.anIntArray21[local27], local16 + this.anIntArray22[local27] + (int) (Math.sin((double) local21 / 2.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray19[local27], this.anIntArray20[local27], arg4);
					}
					arg2 += this.anIntArray23[local27];
				}
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("41762, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public void method155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5) {
		try {
			if (arg5 != null) {
				arg4 -= this.method152(arg5) / 2;
				@Pc(15) boolean local15 = false;
				@Pc(20) int local20 = arg2 - this.anInt167;
				for (@Pc(22) int local22 = 0; local22 < arg5.length(); local22++) {
					@Pc(28) char local28 = arg5.charAt(local22);
					if (local28 != ' ') {
						this.method160(this.aByteArrayArray1[local28], arg4 + this.anIntArray21[local28] + (int) (Math.sin((double) local22 / 5.0D + (double) arg0 / 5.0D) * 5.0D), local20 + this.anIntArray22[local28] + (int) (Math.sin((double) local22 / 3.0D + (double) arg0 / 5.0D) * 5.0D), this.anIntArray19[local28], this.anIntArray20[local28], arg3);
					}
					arg4 += this.anIntArray23[local28];
				}
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("81444, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public void method156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg5 != null) {
				@Pc(11) double local11 = 7.0D - (double) arg0 / 8.0D;
				if (arg1 < 0) {
					if (local11 < 0.0D) {
						local11 = 0.0D;
					}
					arg3 -= this.method152(arg5) / 2;
					@Pc(36) int local36 = arg4 - this.anInt167;
					for (@Pc(38) int local38 = 0; local38 < arg5.length(); local38++) {
						@Pc(44) char local44 = arg5.charAt(local38);
						if (local44 != ' ') {
							this.method160(this.aByteArrayArray1[local44], arg3 + this.anIntArray21[local44], local36 + this.anIntArray22[local44] + (int) (Math.sin((double) local38 / 1.5D + (double) arg6) * local11), this.anIntArray19[local44], this.anIntArray20[local44], arg2);
						}
						arg3 += this.anIntArray23[local44];
					}
				}
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("47961, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "(ZIIILjava/lang/String;I)V")
	public void method157(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		try {
			this.aBoolean44 = false;
			@Pc(6) int local6 = arg2;
			if (arg4 != null) {
				@Pc(14) int local14 = arg1 - this.anInt167;
				for (@Pc(23) int local23 = 0; local23 < arg4.length(); local23++) {
					if (arg4.charAt(local23) == '@' && local23 + 4 < arg4.length() && arg4.charAt(local23 + 4) == '@') {
						@Pc(55) int local55 = this.method159(arg4.substring(local23 + 1, local23 + 4));
						if (local55 != -1) {
							arg3 = local55;
						}
						local23 += 4;
					} else {
						@Pc(67) char local67 = arg4.charAt(local23);
						if (local67 != ' ') {
							if (arg0) {
								this.method160(this.aByteArrayArray1[local67], arg2 + this.anIntArray21[local67] + 1, local14 + this.anIntArray22[local67] + 1, this.anIntArray19[local67], this.anIntArray20[local67], 0);
							}
							this.method160(this.aByteArrayArray1[local67], arg2 + this.anIntArray21[local67], local14 + this.anIntArray22[local67], this.anIntArray19[local67], this.anIntArray20[local67], arg3);
						}
						arg2 += this.anIntArray23[local67];
					}
				}
				if (this.aBoolean44) {
					Class2_Sub1_Sub3.method391(arg2 - local6, local6, 8388608, local14 + (int) ((double) this.anInt167 * 0.7D));
				}
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("65043, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 4 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "(IIIIIZLjava/lang/String;)V")
	public void method158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) String arg4) {
		try {
			if (arg4 != null) {
				this.aRandom1.setSeed((long) arg0);
				@Pc(22) int local22 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(27) int local27 = 15 - this.anInt167;
				for (@Pc(29) int local29 = 0; local29 < arg4.length(); local29++) {
					if (arg4.charAt(local29) == '@' && local29 + 4 < arg4.length() && arg4.charAt(local29 + 4) == '@') {
						@Pc(61) int local61 = this.method159(arg4.substring(local29 + 1, local29 + 4));
						if (local61 != -1) {
							arg2 = local61;
						}
						local29 += 4;
					} else {
						@Pc(73) char local73 = arg4.charAt(local29);
						if (local73 != ' ') {
							this.method162(arg3 + this.anIntArray21[local73] + 1, this.anIntArray20[local73], 0, local27 + this.anIntArray22[local73] + 1, this.anIntArray19[local73], 192, this.aByteArrayArray1[local73]);
							this.method162(arg3 + this.anIntArray21[local73], this.anIntArray20[local73], arg2, local27 + this.anIntArray22[local73], this.anIntArray19[local73], local22, this.aByteArrayArray1[local73]);
						}
						arg3 += this.anIntArray23[local73];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg3++;
						}
					}
				}
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("53073, " + arg0 + ", " + arg1 + ", " + 906 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BKBLJVKV", name = "c", descriptor = "(Ljava/lang/String;I)I")
	private int method159(@OriginalArg(0) String arg0) {
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
					this.aBoolean44 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean44 = false;
				}
				return -1;
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("43468, " + arg0 + ", " + -12688 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "([BIIIII)V")
	private void method160(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class2_Sub1_Sub3.anInt555;
		@Pc(9) int local9 = Class2_Sub1_Sub3.anInt555 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class2_Sub1_Sub3.anInt557) {
			local20 = Class2_Sub1_Sub3.anInt557 - arg2;
			arg4 -= local20;
			arg2 = Class2_Sub1_Sub3.anInt557;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class2_Sub1_Sub3.anInt555;
		}
		if (arg2 + arg4 >= Class2_Sub1_Sub3.anInt558) {
			arg4 -= arg2 + arg4 + 1 - Class2_Sub1_Sub3.anInt558;
		}
		if (arg1 < Class2_Sub1_Sub3.anInt559) {
			local20 = Class2_Sub1_Sub3.anInt559 - arg1;
			arg3 -= local20;
			arg1 = Class2_Sub1_Sub3.anInt559;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class2_Sub1_Sub3.anInt560) {
			local20 = arg1 + arg3 + 1 - Class2_Sub1_Sub3.anInt560;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method161(Class2_Sub1_Sub3.anIntArray93, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method161(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "(IIIIIBI[B)V")
	private void method162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6) {
		try {
			@Pc(5) int local5 = arg0 + arg3 * Class2_Sub1_Sub3.anInt555;
			@Pc(9) int local9 = Class2_Sub1_Sub3.anInt555 - arg4;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			if (this.aByte12 == 8) {
				@Pc(25) int local25;
				if (arg3 < Class2_Sub1_Sub3.anInt557) {
					local25 = Class2_Sub1_Sub3.anInt557 - arg3;
					arg1 -= local25;
					arg3 = Class2_Sub1_Sub3.anInt557;
					local13 = local25 * arg4 + 0;
					local5 += local25 * Class2_Sub1_Sub3.anInt555;
				}
				if (arg3 + arg1 >= Class2_Sub1_Sub3.anInt558) {
					arg1 -= arg3 + arg1 + 1 - Class2_Sub1_Sub3.anInt558;
				}
				if (arg0 < Class2_Sub1_Sub3.anInt559) {
					local25 = Class2_Sub1_Sub3.anInt559 - arg0;
					arg4 -= local25;
					arg0 = Class2_Sub1_Sub3.anInt559;
					local13 += local25;
					local5 += local25;
					local11 = local25 + 0;
					local9 += local25;
				}
				if (arg0 + arg4 >= Class2_Sub1_Sub3.anInt560) {
					local25 = arg0 + arg4 + 1 - Class2_Sub1_Sub3.anInt560;
					arg4 -= local25;
					local11 += local25;
					local9 += local25;
				}
				if (arg4 > 0 && arg1 > 0) {
					this.method163(local11, arg6, local5, arg2, arg1, arg5, local9, Class2_Sub1_Sub3.anIntArray93, local13, arg4);
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("7250, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 8 + ", " + arg5 + ", " + arg6 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "(I[BIIIIII[III)V")
	private void method163(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg3 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((arg3 & 0xFF00) * arg5 & 0xFF0000) >> 8;
			@Pc(35) int local35 = 256 - arg5;
			for (@Pc(38) int local38 = -arg4; local38 < 0; local38++) {
				for (@Pc(43) int local43 = -arg9; local43 < 0; local43++) {
					if (arg1[arg8++] == 0) {
						arg2++;
					} else {
						@Pc(54) int local54 = arg7[arg2];
						arg7[arg2++] = (((local54 & 0xFF00FF) * local35 & 0xFF00FF00) + ((local54 & 0xFF00) * local35 & 0xFF0000) >> 8) + local19;
					}
				}
				arg2 += arg6;
				arg8 += arg0;
			}
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("87798, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}
}
