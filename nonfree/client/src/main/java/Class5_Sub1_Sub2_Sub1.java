import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KGPDNFPL")
public final class Class5_Sub1_Sub2_Sub1 extends Class5_Sub1_Sub2 {

	@OriginalMember(owner = "client!KGPDNFPL", name = "x", descriptor = "I")
	private int anInt367 = -998;

	@OriginalMember(owner = "client!KGPDNFPL", name = "y", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!KGPDNFPL", name = "z", descriptor = "B")
	private byte aByte14 = -46;

	@OriginalMember(owner = "client!KGPDNFPL", name = "A", descriptor = "Z")
	private boolean aBoolean108 = true;

	@OriginalMember(owner = "client!KGPDNFPL", name = "B", descriptor = "I")
	private int anInt368 = -34;

	@OriginalMember(owner = "client!KGPDNFPL", name = "C", descriptor = "Z")
	private boolean aBoolean109 = false;

	@OriginalMember(owner = "client!KGPDNFPL", name = "D", descriptor = "Z")
	private boolean aBoolean110 = false;

	@OriginalMember(owner = "client!KGPDNFPL", name = "E", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[256][];

	@OriginalMember(owner = "client!KGPDNFPL", name = "F", descriptor = "[I")
	private int[] anIntArray68 = new int[256];

	@OriginalMember(owner = "client!KGPDNFPL", name = "G", descriptor = "[I")
	private int[] anIntArray69 = new int[256];

	@OriginalMember(owner = "client!KGPDNFPL", name = "H", descriptor = "[I")
	private int[] anIntArray70 = new int[256];

	@OriginalMember(owner = "client!KGPDNFPL", name = "I", descriptor = "[I")
	private int[] anIntArray71 = new int[256];

	@OriginalMember(owner = "client!KGPDNFPL", name = "J", descriptor = "[I")
	private int[] anIntArray72 = new int[256];

	@OriginalMember(owner = "client!KGPDNFPL", name = "L", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!KGPDNFPL", name = "M", descriptor = "Z")
	private boolean aBoolean111 = false;

	@OriginalMember(owner = "client!KGPDNFPL", name = "K", descriptor = "I")
	public int anInt369;

	@OriginalMember(owner = "client!KGPDNFPL", name = "<init>", descriptor = "(Ljava/lang/String;ZLclient!MJLXHQTQ;Z)V")
	public Class5_Sub1_Sub2_Sub1(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) boolean arg3) {
		try {
			@Pc(72) Class5_Sub1_Sub4 local72 = new Class5_Sub1_Sub4(arg2.method227(arg0 + ".dat", null), -82);
			@Pc(81) Class5_Sub1_Sub4 local81 = new Class5_Sub1_Sub4(arg2.method227("index.dat", null), -82);
			local81.anInt755 = local72.method439() + 4;
			@Pc(98) int local98 = local81.method437();
			if (local98 > 0) {
				local81.anInt755 += (local98 - 1) * 3;
			}
			for (@Pc(112) int local112 = 0; local112 < 256; local112++) {
				this.anIntArray70[local112] = local81.method437();
				this.anIntArray71[local112] = local81.method437();
				@Pc(142) int local142 = this.anIntArray68[local112] = local81.method439();
				@Pc(150) int local150 = this.anIntArray69[local112] = local81.method439();
				@Pc(153) int local153 = local81.method437();
				@Pc(157) int local157 = local142 * local150;
				this.aByteArrayArray1[local112] = new byte[local157];
				@Pc(167) int local167;
				@Pc(192) int local192;
				if (local153 == 0) {
					for (local167 = 0; local167 < local157; local167++) {
						this.aByteArrayArray1[local112][local167] = local72.method438();
					}
				} else if (local153 == 1) {
					for (local167 = 0; local167 < local142; local167++) {
						for (local192 = 0; local192 < local150; local192++) {
							this.aByteArrayArray1[local112][local167 + local192 * local142] = local72.method438();
						}
					}
				}
				if (local150 > this.anInt369 && local112 < 128) {
					this.anInt369 = local150;
				}
				this.anIntArray70[local112] = 1;
				this.anIntArray72[local112] = local142 + 2;
				local167 = 0;
				for (local192 = local150 / 7; local192 < local150; local192++) {
					local167 += this.aByteArrayArray1[local112][local192 * local142];
				}
				@Pc(269) int local269;
				if (local167 <= local150 / 7) {
					local269 = this.anIntArray72[local112]--;
					this.anIntArray70[local112] = 0;
				}
				local167 = 0;
				for (@Pc(283) int local283 = local150 / 7; local283 < local150; local283++) {
					local167 += this.aByteArrayArray1[local112][local142 + local283 * local142 - 1];
				}
				if (local167 <= local150 / 7) {
					local269 = this.anIntArray72[local112]--;
				}
			}
			if (arg3) {
				this.anIntArray72[32] = this.anIntArray72[73];
			} else {
				this.anIntArray72[32] = this.anIntArray72[105];
			}
		} catch (@Pc(342) RuntimeException local342) {
			signlink.reporterror("75166, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local342.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KGPDNFPL", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public void method177(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(4) int arg2) {
		try {
			this.method182(arg0, 507 - this.method181(arg1), arg2, arg1, (byte) 6);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("76896, " + arg0 + ", " + arg1 + ", " + 507 + ", " + -54 + ", " + arg2 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KGPDNFPL", name = "a", descriptor = "(Ljava/lang/String;ZIII)V")
	public void method178(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			this.method182(arg2, arg3 - this.method181(arg0) / 2, arg1, arg0, (byte) 6);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("52462, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KGPDNFPL", name = "a", descriptor = "(IILjava/lang/String;IZI)V")
	public void method179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		try {
			this.method186(arg2, arg0 - this.method180(arg2) / 2, arg3, arg4, arg1);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("54410, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KGPDNFPL", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method180(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
				if (arg0.charAt(local9) == '@' && local9 + 4 < arg0.length() && arg0.charAt(local9 + 4) == '@') {
					local9 += 4;
				} else {
					local7 += this.anIntArray72[arg0.charAt(local9)];
				}
			}
			return local7;
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("22011, " + false + ", " + arg0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KGPDNFPL", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method181(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(5) int local5 = 0;
			for (@Pc(12) int local12 = 0; local12 < arg0.length(); local12++) {
				local5 += this.anIntArray72[arg0.charAt(local12)];
			}
			return local5;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("4135, " + arg0 + ", " + 219 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KGPDNFPL", name = "a", descriptor = "(IIILjava/lang/String;B)V")
	public void method182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) byte arg4) {
		try {
			@Pc(6) boolean local6 = false;
			if (arg3 != null) {
				@Pc(24) int local24 = arg0 - this.anInt369;
				for (@Pc(26) int local26 = 0; local26 < arg3.length(); local26++) {
					@Pc(32) char local32 = arg3.charAt(local26);
					if (local32 != ' ') {
						this.method189(this.aByteArrayArray1[local32], arg1 + this.anIntArray70[local32], local24 + this.anIntArray71[local32], this.anIntArray68[local32], this.anIntArray69[local32], arg2);
					}
					arg1 += this.anIntArray72[local32];
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("14233, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KGPDNFPL", name = "a", descriptor = "(IIBILjava/lang/String;I)V")
	public void method183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 != null) {
				arg2 -= this.method181(arg3) / 2;
				@Pc(16) int local16 = arg4 - this.anInt369;
				for (@Pc(18) int local18 = 0; local18 < arg3.length(); local18++) {
					@Pc(24) char local24 = arg3.charAt(local18);
					if (local24 != ' ') {
						this.method189(this.aByteArrayArray1[local24], arg2 + this.anIntArray70[local24], local16 + this.anIntArray71[local24] + (int) (Math.sin((double) local18 / 2.0D + (double) arg1 / 5.0D) * 5.0D), this.anIntArray68[local24], this.anIntArray69[local24], arg0);
					}
					arg2 += this.anIntArray72[local24];
				}
				if (this.aByte14 == -46) {
					;
				}
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("67168, " + arg0 + ", " + arg1 + ", " + -46 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KGPDNFPL", name = "a", descriptor = "(Ljava/lang/String;IZIII)V")
	public void method184(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 != null) {
				arg1 -= this.method181(arg0) / 2;
				@Pc(18) int local18 = arg4 - this.anInt369;
				for (@Pc(29) int local29 = 0; local29 < arg0.length(); local29++) {
					@Pc(35) char local35 = arg0.charAt(local29);
					if (local35 != ' ') {
						this.method189(this.aByteArrayArray1[local35], arg1 + this.anIntArray70[local35] + (int) (Math.sin((double) local29 / 5.0D + (double) arg3 / 5.0D) * 5.0D), local18 + this.anIntArray71[local35] + (int) (Math.sin((double) local29 / 3.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray68[local35], this.anIntArray69[local35], arg2);
					}
					arg1 += this.anIntArray72[local35];
				}
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("34188, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KGPDNFPL", name = "a", descriptor = "(IILjava/lang/String;IIIB)V")
	public void method185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		try {
			@Pc(6) boolean local6 = false;
			if (arg2 != null) {
				@Pc(19) double local19 = 7.0D - (double) arg5 / 8.0D;
				if (local19 < 0.0D) {
					local19 = 0.0D;
				}
				arg3 -= this.method181(arg2) / 2;
				@Pc(39) int local39 = arg0 - this.anInt369;
				for (@Pc(41) int local41 = 0; local41 < arg2.length(); local41++) {
					@Pc(47) char local47 = arg2.charAt(local41);
					if (local47 != ' ') {
						this.method189(this.aByteArrayArray1[local47], arg3 + this.anIntArray70[local47], local39 + this.anIntArray71[local47] + (int) (Math.sin((double) local41 / 1.5D + (double) arg1) * local19), this.anIntArray68[local47], this.anIntArray69[local47], arg4);
					}
					arg3 += this.anIntArray72[local47];
				}
			}
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("62947, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KGPDNFPL", name = "a", descriptor = "(ILjava/lang/String;IIZI)V")
	public void method186(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			this.aBoolean111 = false;
			@Pc(6) int local6 = arg1;
			if (arg0 != null) {
				@Pc(14) int local14 = arg4 - this.anInt369;
				for (@Pc(25) int local25 = 0; local25 < arg0.length(); local25++) {
					if (arg0.charAt(local25) == '@' && local25 + 4 < arg0.length() && arg0.charAt(local25 + 4) == '@') {
						@Pc(57) int local57 = this.method188(arg0.substring(local25 + 1, local25 + 4));
						if (local57 != -1) {
							arg2 = local57;
						}
						local25 += 4;
					} else {
						@Pc(69) char local69 = arg0.charAt(local25);
						if (local69 != ' ') {
							if (arg3) {
								this.method189(this.aByteArrayArray1[local69], arg1 + this.anIntArray70[local69] + 1, local14 + this.anIntArray71[local69] + 1, this.anIntArray68[local69], this.anIntArray69[local69], 0);
							}
							this.method189(this.aByteArrayArray1[local69], arg1 + this.anIntArray70[local69], local14 + this.anIntArray71[local69], this.anIntArray68[local69], this.anIntArray69[local69], arg2);
						}
						arg1 += this.anIntArray72[local69];
					}
				}
				if (this.aBoolean111) {
					Class5_Sub1_Sub2.method338(8388608, local14 + (int) ((double) this.anInt369 * 0.7D), arg1 - local6, local6);
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("83862, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KGPDNFPL", name = "a", descriptor = "(ILjava/lang/String;IIIIZ)V")
	public void method187(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 != null) {
				this.aRandom1.setSeed((long) arg1);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(27) int local27 = 15 - this.anInt369;
				for (@Pc(29) int local29 = 0; local29 < arg0.length(); local29++) {
					if (arg0.charAt(local29) == '@' && local29 + 4 < arg0.length() && arg0.charAt(local29 + 4) == '@') {
						@Pc(61) int local61 = this.method188(arg0.substring(local29 + 1, local29 + 4));
						if (local61 != -1) {
							arg2 = local61;
						}
						local29 += 4;
					} else {
						@Pc(73) char local73 = arg0.charAt(local29);
						if (local73 != ' ') {
							this.method191(this.anIntArray69[local73], arg3 + this.anIntArray70[local73] + 1, 192, 0, this.anIntArray68[local73], this.aByteArrayArray1[local73], local27 + this.anIntArray71[local73] + 1);
							this.method191(this.anIntArray69[local73], arg3 + this.anIntArray70[local73], local17, arg2, this.anIntArray68[local73], this.aByteArrayArray1[local73], local27 + this.anIntArray71[local73]);
						}
						arg3 += this.anIntArray72[local73];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg3++;
						}
					}
				}
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("28372, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KGPDNFPL", name = "a", descriptor = "(ILjava/lang/String;)I")
	private int method188(@OriginalArg(1) String arg0) {
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
					this.aBoolean111 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean111 = false;
				}
				return -1;
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("11233, " + 40765 + ", " + arg0 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KGPDNFPL", name = "a", descriptor = "([BIIIII)V")
	private void method189(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class5_Sub1_Sub2.anInt622;
		@Pc(9) int local9 = Class5_Sub1_Sub2.anInt622 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class5_Sub1_Sub2.anInt624) {
			local20 = Class5_Sub1_Sub2.anInt624 - arg2;
			arg4 -= local20;
			arg2 = Class5_Sub1_Sub2.anInt624;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class5_Sub1_Sub2.anInt622;
		}
		if (arg2 + arg4 >= Class5_Sub1_Sub2.anInt625) {
			arg4 -= arg2 + arg4 + 1 - Class5_Sub1_Sub2.anInt625;
		}
		if (arg1 < Class5_Sub1_Sub2.anInt626) {
			local20 = Class5_Sub1_Sub2.anInt626 - arg1;
			arg3 -= local20;
			arg1 = Class5_Sub1_Sub2.anInt626;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class5_Sub1_Sub2.anInt627) {
			local20 = arg1 + arg3 + 1 - Class5_Sub1_Sub2.anInt627;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method190(Class5_Sub1_Sub2.anIntArray117, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!KGPDNFPL", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method190(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!KGPDNFPL", name = "a", descriptor = "(IIIII[BIZ)V")
	private void method191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(14) int local14 = arg1 + arg6 * Class5_Sub1_Sub2.anInt622;
			@Pc(18) int local18 = Class5_Sub1_Sub2.anInt622 - arg4;
			@Pc(20) int local20 = 0;
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			if (arg6 < Class5_Sub1_Sub2.anInt624) {
				local29 = Class5_Sub1_Sub2.anInt624 - arg6;
				arg0 -= local29;
				arg6 = Class5_Sub1_Sub2.anInt624;
				local22 = local29 * arg4 + 0;
				local14 += local29 * Class5_Sub1_Sub2.anInt622;
			}
			if (arg6 + arg0 >= Class5_Sub1_Sub2.anInt625) {
				arg0 -= arg6 + arg0 + 1 - Class5_Sub1_Sub2.anInt625;
			}
			if (arg1 < Class5_Sub1_Sub2.anInt626) {
				local29 = Class5_Sub1_Sub2.anInt626 - arg1;
				arg4 -= local29;
				arg1 = Class5_Sub1_Sub2.anInt626;
				local22 += local29;
				local14 += local29;
				local20 = local29 + 0;
				local18 += local29;
			}
			if (arg1 + arg4 >= Class5_Sub1_Sub2.anInt627) {
				local29 = arg1 + arg4 + 1 - Class5_Sub1_Sub2.anInt627;
				arg4 -= local29;
				local20 += local29;
				local18 += local29;
			}
			if (arg4 > 0 && arg0 > 0) {
				this.method192(local22, arg0, local20, local18, arg4, arg5, Class5_Sub1_Sub2.anIntArray117, local14, arg3, arg2);
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("71445, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + true + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KGPDNFPL", name = "a", descriptor = "(IIIIII[B[IIII)V")
	private void method192(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg8 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg8 & 0xFF00) * arg9 & 0xFF0000) >> 8;
			@Pc(23) int local23 = 256 - arg9;
			for (@Pc(26) int local26 = -arg1; local26 < 0; local26++) {
				for (@Pc(31) int local31 = -arg4; local31 < 0; local31++) {
					if (arg5[arg0++] == 0) {
						arg7++;
					} else {
						@Pc(42) int local42 = arg6[arg7];
						arg6[arg7++] = (((local42 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local42 & 0xFF00) * local23 & 0xFF0000) >> 8) + local19;
					}
				}
				arg7 += arg3;
				arg0 += arg2;
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("73149, " + arg0 + ", " + 495 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}
}
