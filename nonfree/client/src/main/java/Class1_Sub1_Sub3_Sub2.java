import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NEJZODYM")
public final class Class1_Sub1_Sub3_Sub2 extends Class1_Sub1_Sub3 {

	@OriginalMember(owner = "client!NEJZODYM", name = "v", descriptor = "I")
	private int anInt496 = 566;

	@OriginalMember(owner = "client!NEJZODYM", name = "w", descriptor = "Z")
	private boolean aBoolean125 = false;

	@OriginalMember(owner = "client!NEJZODYM", name = "x", descriptor = "I")
	private int anInt497 = -550;

	@OriginalMember(owner = "client!NEJZODYM", name = "y", descriptor = "Z")
	private boolean aBoolean126 = true;

	@OriginalMember(owner = "client!NEJZODYM", name = "z", descriptor = "Z")
	private boolean aBoolean127 = true;

	@OriginalMember(owner = "client!NEJZODYM", name = "A", descriptor = "I")
	private int anInt498 = 3;

	@OriginalMember(owner = "client!NEJZODYM", name = "B", descriptor = "[[B")
	private byte[][] aByteArrayArray2 = new byte[256][];

	@OriginalMember(owner = "client!NEJZODYM", name = "C", descriptor = "[I")
	private int[] anIntArray133 = new int[256];

	@OriginalMember(owner = "client!NEJZODYM", name = "D", descriptor = "[I")
	private int[] anIntArray134 = new int[256];

	@OriginalMember(owner = "client!NEJZODYM", name = "E", descriptor = "[I")
	private int[] anIntArray135 = new int[256];

	@OriginalMember(owner = "client!NEJZODYM", name = "F", descriptor = "[I")
	private int[] anIntArray136 = new int[256];

	@OriginalMember(owner = "client!NEJZODYM", name = "G", descriptor = "[I")
	private int[] anIntArray137 = new int[256];

	@OriginalMember(owner = "client!NEJZODYM", name = "I", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!NEJZODYM", name = "J", descriptor = "Z")
	private boolean aBoolean128 = false;

	@OriginalMember(owner = "client!NEJZODYM", name = "H", descriptor = "I")
	public int anInt499;

	@OriginalMember(owner = "client!NEJZODYM", name = "<init>", descriptor = "(Lclient!MNPBQFWE;ZILjava/lang/String;)V")
	public Class1_Sub1_Sub3_Sub2(@OriginalArg(0) Class27 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		try {
			@Pc(69) Class1_Sub1_Sub2 local69 = new Class1_Sub1_Sub2(false, arg0.method340(arg3 + ".dat", null));
			@Pc(78) Class1_Sub1_Sub2 local78 = new Class1_Sub1_Sub2(false, arg0.method340("index.dat", null));
			local78.anInt10 = local69.method24() + 4;
			@Pc(89) int local89 = local78.method22();
			if (local89 > 0) {
				local78.anInt10 += (local89 - 1) * 3;
			}
			for (@Pc(103) int local103 = 0; local103 < 256; local103++) {
				this.anIntArray135[local103] = local78.method22();
				this.anIntArray136[local103] = local78.method22();
				@Pc(127) int local127 = this.anIntArray133[local103] = local78.method24();
				@Pc(135) int local135 = this.anIntArray134[local103] = local78.method24();
				@Pc(138) int local138 = local78.method22();
				@Pc(142) int local142 = local127 * local135;
				this.aByteArrayArray2[local103] = new byte[local142];
				@Pc(152) int local152;
				@Pc(177) int local177;
				if (local138 == 0) {
					for (local152 = 0; local152 < local142; local152++) {
						this.aByteArrayArray2[local103][local152] = local69.method23();
					}
				} else if (local138 == 1) {
					for (local152 = 0; local152 < local127; local152++) {
						for (local177 = 0; local177 < local135; local177++) {
							this.aByteArrayArray2[local103][local152 + local177 * local127] = local69.method23();
						}
					}
				}
				if (local135 > this.anInt499 && local103 < 128) {
					this.anInt499 = local135;
				}
				this.anIntArray135[local103] = 1;
				this.anIntArray137[local103] = local127 + 2;
				local152 = 0;
				for (local177 = local135 / 7; local177 < local135; local177++) {
					local152 += this.aByteArrayArray2[local103][local177 * local127];
				}
				@Pc(254) int local254;
				if (local152 <= local135 / 7) {
					local254 = this.anIntArray137[local103]--;
					this.anIntArray135[local103] = 0;
				}
				local152 = 0;
				for (@Pc(268) int local268 = local135 / 7; local268 < local135; local268++) {
					local152 += this.aByteArrayArray2[local103][local127 + local268 * local127 - 1];
				}
				if (local152 <= local135 / 7) {
					local254 = this.anIntArray137[local103]--;
				}
			}
			if (arg1) {
				this.anIntArray137[32] = this.anIntArray137[73];
			} else {
				this.anIntArray137[32] = this.anIntArray137[105];
			}
		} catch (@Pc(332) RuntimeException local332) {
			signlink.reporterror("30896, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local332.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NEJZODYM", name = "a", descriptor = "(BIILjava/lang/String;I)V")
	public void method355(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2) {
		try {
			this.method360(arg2, arg0, arg1, 507 - this.method359(arg1));
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("47981, " + -13 + ", " + arg0 + ", " + 507 + ", " + arg1 + ", " + arg2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NEJZODYM", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public void method356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		try {
			this.method360(arg3, arg1, arg2, arg0 - this.method359(arg2) / 2);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("47779, " + arg0 + ", " + arg1 + ", " + 190 + ", " + arg2 + ", " + arg3 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NEJZODYM", name = "a", descriptor = "(ILjava/lang/String;ZIIZ)V")
	public void method357(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		try {
			this.method364(arg1, arg3, arg0, arg2 - this.method358(this.aBoolean126, arg1) / 2, 696, arg4);
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("77548, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NEJZODYM", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method358(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg1 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < arg1.length(); local9++) {
				if (arg1.charAt(local9) == '@' && local9 + 4 < arg1.length() && arg1.charAt(local9 + 4) == '@') {
					local9 += 4;
				} else {
					local7 += this.anIntArray137[arg1.charAt(local9)];
				}
			}
			if (arg0) {
				return local7;
			} else {
				return 4;
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("58679, " + arg0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NEJZODYM", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method359(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(5) int local5 = 0;
			for (@Pc(11) int local11 = 0; local11 < arg0.length(); local11++) {
				local5 += this.anIntArray137[arg0.charAt(local11)];
			}
			return local5;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("5881, " + arg0 + ", " + 0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NEJZODYM", name = "b", descriptor = "(BIILjava/lang/String;I)V")
	public void method360(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 != null) {
				@Pc(9) int local9 = arg1 - this.anInt499;
				for (@Pc(24) int local24 = 0; local24 < arg2.length(); local24++) {
					@Pc(30) char local30 = arg2.charAt(local24);
					if (local30 != ' ') {
						this.method367(this.aByteArrayArray2[local30], arg3 + this.anIntArray135[local30], local9 + this.anIntArray136[local30], this.anIntArray133[local30], this.anIntArray134[local30], arg0);
					}
					arg3 += this.anIntArray137[local30];
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("5464, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NEJZODYM", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public void method361(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 != null) {
				arg2 -= this.method359(arg1) / 2;
				@Pc(16) int local16 = arg0 - this.anInt499;
				for (@Pc(18) int local18 = 0; local18 < arg1.length(); local18++) {
					@Pc(24) char local24 = arg1.charAt(local18);
					if (local24 != ' ') {
						this.method367(this.aByteArrayArray2[local24], arg2 + this.anIntArray135[local24], local16 + this.anIntArray136[local24] + (int) (Math.sin((double) local18 / 2.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray133[local24], this.anIntArray134[local24], arg4);
					}
					arg2 += this.anIntArray137[local24];
				}
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("66770, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NEJZODYM", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public void method362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 != null) {
				arg0 -= this.method359(arg2) / 2;
				@Pc(20) int local20 = arg3 - this.anInt499;
				for (@Pc(22) int local22 = 0; local22 < arg2.length(); local22++) {
					@Pc(28) char local28 = arg2.charAt(local22);
					if (local28 != ' ') {
						this.method367(this.aByteArrayArray2[local28], arg0 + this.anIntArray135[local28] + (int) (Math.sin((double) local22 / 5.0D + (double) arg1 / 5.0D) * 5.0D), local20 + this.anIntArray136[local28] + (int) (Math.sin((double) local22 / 3.0D + (double) arg1 / 5.0D) * 5.0D), this.anIntArray133[local28], this.anIntArray134[local28], arg4);
					}
					arg0 += this.anIntArray137[local28];
				}
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("40344, " + arg0 + ", " + arg1 + ", " + 28025 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NEJZODYM", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
	public void method363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		try {
			if (arg5 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg4 / 8.0D;
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg0 -= this.method359(arg5) / 2;
				@Pc(29) int local29 = arg3 - this.anInt499;
				for (@Pc(41) int local41 = 0; local41 < arg5.length(); local41++) {
					@Pc(47) char local47 = arg5.charAt(local41);
					if (local47 != ' ') {
						this.method367(this.aByteArrayArray2[local47], arg0 + this.anIntArray135[local47], local29 + this.anIntArray136[local47] + (int) (Math.sin((double) local41 / 1.5D + (double) arg2) * local9), this.anIntArray133[local47], this.anIntArray134[local47], arg1);
					}
					arg0 += this.anIntArray137[local47];
				}
			}
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("97443, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -858 + ", " + arg4 + ", " + arg5 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NEJZODYM", name = "a", descriptor = "(Ljava/lang/String;IIIIZ)V")
	public void method364(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		try {
			this.aBoolean128 = false;
			@Pc(6) int local6 = arg3;
			@Pc(10) boolean local10 = false;
			if (arg0 != null) {
				@Pc(18) int local18 = arg1 - this.anInt499;
				for (@Pc(20) int local20 = 0; local20 < arg0.length(); local20++) {
					if (arg0.charAt(local20) == '@' && local20 + 4 < arg0.length() && arg0.charAt(local20 + 4) == '@') {
						@Pc(52) int local52 = this.method366(arg0.substring(local20 + 1, local20 + 4));
						if (local52 != -1) {
							arg2 = local52;
						}
						local20 += 4;
					} else {
						@Pc(64) char local64 = arg0.charAt(local20);
						if (local64 != ' ') {
							if (arg5) {
								this.method367(this.aByteArrayArray2[local64], arg3 + this.anIntArray135[local64] + 1, local18 + this.anIntArray136[local64] + 1, this.anIntArray133[local64], this.anIntArray134[local64], 0);
							}
							this.method367(this.aByteArrayArray2[local64], arg3 + this.anIntArray135[local64], local18 + this.anIntArray136[local64], this.anIntArray133[local64], this.anIntArray134[local64], arg2);
						}
						arg3 += this.anIntArray137[local64];
					}
				}
				if (this.aBoolean128) {
					Class1_Sub1_Sub3.method520(local6, arg3 - local6, local18 + (int) ((double) this.anInt499 * 0.7D), 8388608);
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("73161, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NEJZODYM", name = "a", descriptor = "(ZILjava/lang/String;IIII)V")
	public void method365(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg1 != null) {
				this.aRandom1.setSeed((long) arg0);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(22) int local22 = 15 - this.anInt499;
				for (@Pc(24) int local24 = 0; local24 < arg1.length(); local24++) {
					if (arg1.charAt(local24) == '@' && local24 + 4 < arg1.length() && arg1.charAt(local24 + 4) == '@') {
						@Pc(56) int local56 = this.method366(arg1.substring(local24 + 1, local24 + 4));
						if (local56 != -1) {
							arg4 = local56;
						}
						local24 += 4;
					} else {
						@Pc(68) char local68 = arg1.charAt(local24);
						if (local68 != ' ') {
							this.method369(this.aByteArrayArray2[local68], this.anIntArray133[local68], arg3 + this.anIntArray135[local68] + 1, 192, 0, this.anIntArray134[local68], local22 + this.anIntArray136[local68] + 1);
							this.method369(this.aByteArrayArray2[local68], this.anIntArray133[local68], arg3 + this.anIntArray135[local68], local17, arg4, this.anIntArray134[local68], local22 + this.anIntArray136[local68]);
						}
						arg3 += this.anIntArray137[local68];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg3++;
						}
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("3728, " + true + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NEJZODYM", name = "a", descriptor = "(Ljava/lang/String;B)I")
	private int method366(@OriginalArg(0) String arg0) {
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
					this.aBoolean128 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean128 = false;
				}
				return -1;
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("87957, " + arg0 + ", " + 99 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NEJZODYM", name = "a", descriptor = "([BIIIII)V")
	private void method367(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub3.anInt772;
		@Pc(9) int local9 = Class1_Sub1_Sub3.anInt772 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub3.anInt774) {
			local20 = Class1_Sub1_Sub3.anInt774 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub3.anInt774;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub3.anInt772;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub3.anInt775) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub3.anInt775;
		}
		if (arg1 < Class1_Sub1_Sub3.anInt776) {
			local20 = Class1_Sub1_Sub3.anInt776 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub3.anInt776;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub3.anInt777) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub3.anInt777;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method368(Class1_Sub1_Sub3.anIntArray208, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!NEJZODYM", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method368(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!NEJZODYM", name = "a", descriptor = "([BIIIIIII)V")
	private void method369(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(5) int local5 = arg2 + arg6 * Class1_Sub1_Sub3.anInt772;
			@Pc(9) int local9 = Class1_Sub1_Sub3.anInt772 - arg1;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(20) int local20;
			if (arg6 < Class1_Sub1_Sub3.anInt774) {
				local20 = Class1_Sub1_Sub3.anInt774 - arg6;
				arg5 -= local20;
				arg6 = Class1_Sub1_Sub3.anInt774;
				local13 = local20 * arg1 + 0;
				local5 += local20 * Class1_Sub1_Sub3.anInt772;
			}
			if (arg6 + arg5 >= Class1_Sub1_Sub3.anInt775) {
				arg5 -= arg6 + arg5 + 1 - Class1_Sub1_Sub3.anInt775;
			}
			if (arg2 < Class1_Sub1_Sub3.anInt776) {
				local20 = Class1_Sub1_Sub3.anInt776 - arg2;
				arg1 -= local20;
				arg2 = Class1_Sub1_Sub3.anInt776;
				local13 += local20;
				local5 += local20;
				local11 = local20 + 0;
				local9 += local20;
			}
			if (arg2 + arg1 >= Class1_Sub1_Sub3.anInt777) {
				local20 = arg2 + arg1 + 1 - Class1_Sub1_Sub3.anInt777;
				arg1 -= local20;
				local11 += local20;
				local9 += local20;
			}
			if (arg1 > 0 && arg5 > 0) {
				this.method370(local13, local11, local9, local5, arg1, arg3, arg4, arg0, arg5, Class1_Sub1_Sub3.anIntArray208);
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("72847, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + -35 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NEJZODYM", name = "a", descriptor = "(IIIIIII[BII[I)V")
	private void method370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9) {
		try {
			@Pc(19) int local19 = ((arg6 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((arg6 & 0xFF00) * arg5 & 0xFF0000) >> 8;
			@Pc(23) int local23 = 256 - arg5;
			for (@Pc(26) int local26 = -arg8; local26 < 0; local26++) {
				for (@Pc(31) int local31 = -arg4; local31 < 0; local31++) {
					if (arg7[arg0++] == 0) {
						arg3++;
					} else {
						@Pc(42) int local42 = arg9[arg3];
						arg9[arg3++] = (((local42 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local42 & 0xFF00) * local23 & 0xFF0000) >> 8) + local19;
					}
				}
				arg3 += arg2;
				arg0 += arg1;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("14843, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 4 + ", " + arg8 + ", " + arg9 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}
}
