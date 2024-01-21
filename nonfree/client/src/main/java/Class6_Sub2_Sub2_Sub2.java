import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IDBGYHWK")
public final class Class6_Sub2_Sub2_Sub2 extends Class6_Sub2_Sub2 {

	@OriginalMember(owner = "client!IDBGYHWK", name = "z", descriptor = "Z")
	private boolean aBoolean68 = true;

	@OriginalMember(owner = "client!IDBGYHWK", name = "A", descriptor = "I")
	private int anInt172 = -592;

	@OriginalMember(owner = "client!IDBGYHWK", name = "B", descriptor = "I")
	private int anInt173 = 737;

	@OriginalMember(owner = "client!IDBGYHWK", name = "C", descriptor = "B")
	private byte aByte7 = 2;

	@OriginalMember(owner = "client!IDBGYHWK", name = "D", descriptor = "B")
	private byte aByte8 = -77;

	@OriginalMember(owner = "client!IDBGYHWK", name = "E", descriptor = "[[B")
	private byte[][] aByteArrayArray2 = new byte[256][];

	@OriginalMember(owner = "client!IDBGYHWK", name = "F", descriptor = "[I")
	private int[] anIntArray42 = new int[256];

	@OriginalMember(owner = "client!IDBGYHWK", name = "G", descriptor = "[I")
	private int[] anIntArray43 = new int[256];

	@OriginalMember(owner = "client!IDBGYHWK", name = "H", descriptor = "[I")
	private int[] anIntArray44 = new int[256];

	@OriginalMember(owner = "client!IDBGYHWK", name = "I", descriptor = "[I")
	private int[] anIntArray45 = new int[256];

	@OriginalMember(owner = "client!IDBGYHWK", name = "J", descriptor = "[I")
	private int[] anIntArray46 = new int[256];

	@OriginalMember(owner = "client!IDBGYHWK", name = "L", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!IDBGYHWK", name = "M", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!IDBGYHWK", name = "K", descriptor = "I")
	public int anInt174;

	@OriginalMember(owner = "client!IDBGYHWK", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!RVLWVPJQ;ZI)V")
	public Class6_Sub2_Sub2_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(66) Class6_Sub2_Sub3 local66 = new Class6_Sub2_Sub3(741, arg1.method381(arg0 + ".dat", null));
			@Pc(75) Class6_Sub2_Sub3 local75 = new Class6_Sub2_Sub3(741, arg1.method381("index.dat", null));
			local75.anInt609 = local66.method404() + 4;
			@Pc(86) int local86 = local75.method402();
			if (local86 > 0) {
				local75.anInt609 += (local86 - 1) * 3;
			}
			for (@Pc(100) int local100 = 0; local100 < 256; local100++) {
				this.anIntArray44[local100] = local75.method402();
				this.anIntArray45[local100] = local75.method402();
				@Pc(124) int local124 = this.anIntArray42[local100] = local75.method404();
				@Pc(132) int local132 = this.anIntArray43[local100] = local75.method404();
				@Pc(135) int local135 = local75.method402();
				@Pc(139) int local139 = local124 * local132;
				this.aByteArrayArray2[local100] = new byte[local139];
				@Pc(149) int local149;
				@Pc(174) int local174;
				if (local135 == 0) {
					for (local149 = 0; local149 < local139; local149++) {
						this.aByteArrayArray2[local100][local149] = local66.method403();
					}
				} else if (local135 == 1) {
					for (local149 = 0; local149 < local124; local149++) {
						for (local174 = 0; local174 < local132; local174++) {
							this.aByteArrayArray2[local100][local149 + local174 * local124] = local66.method403();
						}
					}
				}
				if (local132 > this.anInt174 && local100 < 128) {
					this.anInt174 = local132;
				}
				this.anIntArray44[local100] = 1;
				this.anIntArray46[local100] = local124 + 2;
				local149 = 0;
				for (local174 = local132 / 7; local174 < local132; local174++) {
					local149 += this.aByteArrayArray2[local100][local174 * local124];
				}
				@Pc(251) int local251;
				if (local149 <= local132 / 7) {
					local251 = this.anIntArray46[local100]--;
					this.anIntArray44[local100] = 0;
				}
				local149 = 0;
				for (@Pc(265) int local265 = local132 / 7; local265 < local132; local265++) {
					local149 += this.aByteArrayArray2[local100][local124 + local265 * local124 - 1];
				}
				if (local149 <= local132 / 7) {
					local251 = this.anIntArray46[local100]--;
				}
			}
			if (arg2) {
				this.anIntArray46[32] = this.anIntArray46[73];
			} else {
				this.anIntArray46[32] = this.anIntArray46[105];
			}
		} catch (@Pc(334) RuntimeException local334) {
			signlink.reporterror("98672, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local334.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IDBGYHWK", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public void method159(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		try {
			this.method164(arg1, 507 - this.method163(arg0), arg2, arg0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("22559, " + arg0 + ", " + 799 + ", " + 507 + ", " + arg1 + ", " + arg2 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IDBGYHWK", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public void method160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		try {
			this.method164(arg3, arg1 - this.method163(arg2) / 2, arg0, arg2);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("58712, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IDBGYHWK", name = "a", descriptor = "(IIZLjava/lang/String;II)V")
	public void method161(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.method168(arg1, arg2, arg0, arg3 - this.method162(arg2) / 2, arg4);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("92251, " + -546 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IDBGYHWK", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method162(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(16) int local16 = 0;
			for (@Pc(18) int local18 = 0; local18 < arg0.length(); local18++) {
				if (arg0.charAt(local18) == '@' && local18 + 4 < arg0.length() && arg0.charAt(local18 + 4) == '@') {
					local18 += 4;
				} else {
					local16 += this.anIntArray46[arg0.charAt(local18)];
				}
			}
			return local16;
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("10853, " + arg0 + ", " + true + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IDBGYHWK", name = "b", descriptor = "(Ljava/lang/String;Z)I")
	public int method163(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(5) int local5 = 0;
			for (@Pc(12) int local12 = 0; local12 < arg0.length(); local12++) {
				local5 += this.anIntArray46[arg0.charAt(local12)];
			}
			return local5;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("28833, " + arg0 + ", " + false + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IDBGYHWK", name = "a", descriptor = "(IIILjava/lang/String;B)V")
	public void method164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		try {
			if (this.aByte7 != 2) {
				this.aBoolean68 = !this.aBoolean68;
			}
			if (arg3 != null) {
				@Pc(19) int local19 = arg2 - this.anInt174;
				for (@Pc(21) int local21 = 0; local21 < arg3.length(); local21++) {
					@Pc(27) char local27 = arg3.charAt(local21);
					if (local27 != ' ') {
						this.method171(this.aByteArrayArray2[local27], arg1 + this.anIntArray44[local27], local19 + this.anIntArray45[local27], this.anIntArray42[local27], this.anIntArray43[local27], arg0);
					}
					arg1 += this.anIntArray46[local27];
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("28611, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 2 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IDBGYHWK", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public void method165(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 != null) {
				arg4 -= this.method163(arg1) / 2;
				@Pc(19) int local19 = arg0 - this.anInt174;
				for (@Pc(21) int local21 = 0; local21 < arg1.length(); local21++) {
					@Pc(27) char local27 = arg1.charAt(local21);
					if (local27 != ' ') {
						this.method171(this.aByteArrayArray2[local27], arg4 + this.anIntArray44[local27], local19 + this.anIntArray45[local27] + (int) (Math.sin((double) local21 / 2.0D + (double) arg2 / 5.0D) * 5.0D), this.anIntArray42[local27], this.anIntArray43[local27], arg3);
					}
					arg4 += this.anIntArray46[local27];
				}
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("9782, " + arg0 + ", " + arg1 + ", " + -384 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IDBGYHWK", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
	public void method166(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 != null) {
				arg4 -= this.method163(arg3) / 2;
				@Pc(16) int local16 = arg2 - this.anInt174;
				for (@Pc(23) int local23 = 0; local23 < arg3.length(); local23++) {
					@Pc(29) char local29 = arg3.charAt(local23);
					if (local29 != ' ') {
						this.method171(this.aByteArrayArray2[local29], arg4 + this.anIntArray44[local29] + (int) (Math.sin((double) local23 / 5.0D + (double) arg1 / 5.0D) * 5.0D), local16 + this.anIntArray45[local29] + (int) (Math.sin((double) local23 / 3.0D + (double) arg1 / 5.0D) * 5.0D), this.anIntArray42[local29], this.anIntArray43[local29], arg0);
					}
					arg4 += this.anIntArray46[local29];
				}
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("67907, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IDBGYHWK", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public void method167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg4 / 8.0D;
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg2 -= this.method163(arg3) / 2;
				@Pc(29) int local29 = arg5 - this.anInt174;
				for (@Pc(36) int local36 = 0; local36 < arg3.length(); local36++) {
					@Pc(42) char local42 = arg3.charAt(local36);
					if (local42 != ' ') {
						this.method171(this.aByteArrayArray2[local42], arg2 + this.anIntArray44[local42], local29 + this.anIntArray45[local42] + (int) (Math.sin((double) local36 / 1.5D + (double) arg0) * local9), this.anIntArray42[local42], this.anIntArray43[local42], arg1);
					}
					arg2 += this.anIntArray46[local42];
				}
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("47373, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + arg5 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IDBGYHWK", name = "a", descriptor = "(ZILjava/lang/String;III)V")
	public void method168(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aBoolean69 = false;
			@Pc(10) int local10 = arg3;
			if (arg1 != null) {
				@Pc(18) int local18 = arg4 - this.anInt174;
				for (@Pc(20) int local20 = 0; local20 < arg1.length(); local20++) {
					if (arg1.charAt(local20) == '@' && local20 + 4 < arg1.length() && arg1.charAt(local20 + 4) == '@') {
						@Pc(52) int local52 = this.method170(arg1.substring(local20 + 1, local20 + 4));
						if (local52 != -1) {
							arg2 = local52;
						}
						local20 += 4;
					} else {
						@Pc(64) char local64 = arg1.charAt(local20);
						if (local64 != ' ') {
							if (arg0) {
								this.method171(this.aByteArrayArray2[local64], arg3 + this.anIntArray44[local64] + 1, local18 + this.anIntArray45[local64] + 1, this.anIntArray42[local64], this.anIntArray43[local64], 0);
							}
							this.method171(this.aByteArrayArray2[local64], arg3 + this.anIntArray44[local64], local18 + this.anIntArray45[local64], this.anIntArray42[local64], this.anIntArray43[local64], arg2);
						}
						arg3 += this.anIntArray46[local64];
					}
				}
				if (this.aBoolean69) {
					Class6_Sub2_Sub2.method522(local18 + (int) ((double) this.anInt174 * 0.7D), arg3 - local10, 8388608, local10);
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("54828, " + arg0 + ", " + 7 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IDBGYHWK", name = "a", descriptor = "(ILjava/lang/String;IIIIZ)V")
	public void method169(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 != null) {
				this.aRandom1.setSeed((long) arg0);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(22) int local22 = 15 - this.anInt174;
				for (@Pc(24) int local24 = 0; local24 < arg1.length(); local24++) {
					if (arg1.charAt(local24) == '@' && local24 + 4 < arg1.length() && arg1.charAt(local24 + 4) == '@') {
						@Pc(56) int local56 = this.method170(arg1.substring(local24 + 1, local24 + 4));
						if (local56 != -1) {
							arg2 = local56;
						}
						local24 += 4;
					} else {
						@Pc(68) char local68 = arg1.charAt(local24);
						if (local68 != ' ') {
							this.method173(this.anIntArray42[local68], this.aByteArrayArray2[local68], arg3 + this.anIntArray44[local68] + 1, 0, 192, this.anIntArray43[local68], local22 + this.anIntArray45[local68] + 1);
							this.method173(this.anIntArray42[local68], this.aByteArrayArray2[local68], arg3 + this.anIntArray44[local68], arg2, local17, this.anIntArray43[local68], local22 + this.anIntArray45[local68]);
						}
						arg3 += this.anIntArray46[local68];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg3++;
						}
					}
				}
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("91183, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 521 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IDBGYHWK", name = "a", descriptor = "(ZLjava/lang/String;)I")
	private int method170(@OriginalArg(1) String arg0) {
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
					this.aBoolean69 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean69 = false;
				}
				return -1;
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("20328, " + false + ", " + arg0 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IDBGYHWK", name = "a", descriptor = "([BIIIII)V")
	private void method171(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class6_Sub2_Sub2.anInt758;
		@Pc(9) int local9 = Class6_Sub2_Sub2.anInt758 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class6_Sub2_Sub2.anInt760) {
			local20 = Class6_Sub2_Sub2.anInt760 - arg2;
			arg4 -= local20;
			arg2 = Class6_Sub2_Sub2.anInt760;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class6_Sub2_Sub2.anInt758;
		}
		if (arg2 + arg4 >= Class6_Sub2_Sub2.anInt761) {
			arg4 -= arg2 + arg4 + 1 - Class6_Sub2_Sub2.anInt761;
		}
		if (arg1 < Class6_Sub2_Sub2.anInt762) {
			local20 = Class6_Sub2_Sub2.anInt762 - arg1;
			arg3 -= local20;
			arg1 = Class6_Sub2_Sub2.anInt762;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class6_Sub2_Sub2.anInt763) {
			local20 = arg1 + arg3 + 1 - Class6_Sub2_Sub2.anInt763;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method172(Class6_Sub2_Sub2.anIntArray206, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!IDBGYHWK", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method172(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!IDBGYHWK", name = "a", descriptor = "(I[BIIIIII)V")
	private void method173(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(11) int local11 = arg2 + arg6 * Class6_Sub2_Sub2.anInt758;
			@Pc(15) int local15 = Class6_Sub2_Sub2.anInt758 - arg0;
			@Pc(17) int local17 = 0;
			@Pc(19) int local19 = 0;
			@Pc(26) int local26;
			if (arg6 < Class6_Sub2_Sub2.anInt760) {
				local26 = Class6_Sub2_Sub2.anInt760 - arg6;
				arg5 -= local26;
				arg6 = Class6_Sub2_Sub2.anInt760;
				local19 = local26 * arg0 + 0;
				local11 += local26 * Class6_Sub2_Sub2.anInt758;
			}
			if (arg6 + arg5 >= Class6_Sub2_Sub2.anInt761) {
				arg5 -= arg6 + arg5 + 1 - Class6_Sub2_Sub2.anInt761;
			}
			if (arg2 < Class6_Sub2_Sub2.anInt762) {
				local26 = Class6_Sub2_Sub2.anInt762 - arg2;
				arg0 -= local26;
				arg2 = Class6_Sub2_Sub2.anInt762;
				local19 += local26;
				local11 += local26;
				local17 = local26 + 0;
				local15 += local26;
			}
			if (arg2 + arg0 >= Class6_Sub2_Sub2.anInt763) {
				local26 = arg2 + arg0 + 1 - Class6_Sub2_Sub2.anInt763;
				arg0 -= local26;
				local17 += local26;
				local15 += local26;
			}
			if (arg0 > 0 && arg5 > 0) {
				this.method174(Class6_Sub2_Sub2.anIntArray206, local19, arg5, arg3, local17, arg1, local11, local15, arg0, arg4, this.aByte8);
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("65865, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 35418 + ", " + arg6 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IDBGYHWK", name = "a", descriptor = "([IIIII[BIIIIB)V")
	private void method174(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) byte arg10) {
		try {
			@Pc(19) int local19 = ((arg3 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg3 & 0xFF00) * arg9 & 0xFF0000) >> 8;
			if (arg10 != -77) {
				this.aBoolean68 = !this.aBoolean68;
			}
			@Pc(34) int local34 = 256 - arg9;
			for (@Pc(37) int local37 = -arg2; local37 < 0; local37++) {
				for (@Pc(42) int local42 = -arg8; local42 < 0; local42++) {
					if (arg5[arg1++] == 0) {
						arg6++;
					} else {
						@Pc(53) int local53 = arg0[arg6];
						arg0[arg6++] = (((local53 & 0xFF00FF) * local34 & 0xFF00FF00) + ((local53 & 0xFF00) * local34 & 0xFF0000) >> 8) + local19;
					}
				}
				arg6 += arg7;
				arg1 += arg4;
			}
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("57431, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}
}
