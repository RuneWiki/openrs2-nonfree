import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FDMAFIMR")
public final class Class1_Sub1_Sub3_Sub3 extends Class1_Sub1_Sub3 {

	@OriginalMember(owner = "client!FDMAFIMR", name = "E", descriptor = "I")
	private int anInt289;

	@OriginalMember(owner = "client!FDMAFIMR", name = "z", descriptor = "I")
	private int anInt286 = -6;

	@OriginalMember(owner = "client!FDMAFIMR", name = "A", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!FDMAFIMR", name = "B", descriptor = "I")
	private int anInt287 = -11820;

	@OriginalMember(owner = "client!FDMAFIMR", name = "C", descriptor = "Z")
	private boolean aBoolean83 = true;

	@OriginalMember(owner = "client!FDMAFIMR", name = "D", descriptor = "I")
	private int anInt288 = 2;

	@OriginalMember(owner = "client!FDMAFIMR", name = "F", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[256][];

	@OriginalMember(owner = "client!FDMAFIMR", name = "G", descriptor = "[I")
	private int[] anIntArray43 = new int[256];

	@OriginalMember(owner = "client!FDMAFIMR", name = "H", descriptor = "[I")
	private int[] anIntArray44 = new int[256];

	@OriginalMember(owner = "client!FDMAFIMR", name = "I", descriptor = "[I")
	private int[] anIntArray45 = new int[256];

	@OriginalMember(owner = "client!FDMAFIMR", name = "J", descriptor = "[I")
	private int[] anIntArray46 = new int[256];

	@OriginalMember(owner = "client!FDMAFIMR", name = "K", descriptor = "[I")
	private int[] anIntArray47 = new int[256];

	@OriginalMember(owner = "client!FDMAFIMR", name = "M", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!FDMAFIMR", name = "N", descriptor = "Z")
	private boolean aBoolean84 = false;

	@OriginalMember(owner = "client!FDMAFIMR", name = "L", descriptor = "I")
	public int anInt290;

	@OriginalMember(owner = "client!FDMAFIMR", name = "<init>", descriptor = "(Lclient!VSUYIIVA;Ljava/lang/String;ZZ)V")
	public Class1_Sub1_Sub3_Sub3(@OriginalArg(0) Class42 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		try {
			@Pc(66) Class1_Sub1_Sub2 local66 = new Class1_Sub1_Sub2(arg0.method539(arg1 + ".dat", null), 792);
			@Pc(75) Class1_Sub1_Sub2 local75 = new Class1_Sub1_Sub2(arg0.method539("index.dat", null), 792);
			local75.anInt153 = local66.method61() + 4;
			@Pc(95) int local95 = local75.method59();
			if (local95 > 0) {
				local75.anInt153 += (local95 - 1) * 3;
			}
			for (@Pc(109) int local109 = 0; local109 < 256; local109++) {
				this.anIntArray45[local109] = local75.method59();
				this.anIntArray46[local109] = local75.method59();
				@Pc(133) int local133 = this.anIntArray43[local109] = local75.method61();
				@Pc(141) int local141 = this.anIntArray44[local109] = local75.method61();
				@Pc(144) int local144 = local75.method59();
				@Pc(148) int local148 = local133 * local141;
				this.aByteArrayArray1[local109] = new byte[local148];
				@Pc(158) int local158;
				@Pc(183) int local183;
				if (local144 == 0) {
					for (local158 = 0; local158 < local148; local158++) {
						this.aByteArrayArray1[local109][local158] = local66.method60();
					}
				} else if (local144 == 1) {
					for (local158 = 0; local158 < local133; local158++) {
						for (local183 = 0; local183 < local141; local183++) {
							this.aByteArrayArray1[local109][local158 + local183 * local133] = local66.method60();
						}
					}
				}
				if (local141 > this.anInt290 && local109 < 128) {
					this.anInt290 = local141;
				}
				this.anIntArray45[local109] = 1;
				this.anIntArray47[local109] = local133 + 2;
				local158 = 0;
				for (local183 = local141 / 7; local183 < local141; local183++) {
					local158 += this.aByteArrayArray1[local109][local183 * local133];
				}
				@Pc(260) int local260;
				if (local158 <= local141 / 7) {
					local260 = this.anIntArray47[local109]--;
					this.anIntArray45[local109] = 0;
				}
				local158 = 0;
				for (@Pc(274) int local274 = local141 / 7; local274 < local141; local274++) {
					local158 += this.aByteArrayArray1[local109][local133 + local274 * local133 - 1];
				}
				if (local158 <= local141 / 7) {
					local260 = this.anIntArray47[local109]--;
				}
			}
			if (arg2) {
				this.anIntArray47[32] = this.anIntArray47[73];
			} else {
				this.anIntArray47[32] = this.anIntArray47[105];
			}
		} catch (@Pc(333) RuntimeException local333) {
			signlink.reporterror("91581, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local333.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDMAFIMR", name = "a", descriptor = "(ILjava/lang/String;IZI)V")
	public void method224(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(4) int arg2) {
		try {
			this.method229(arg1, 507 - this.method228(arg1, 987), arg2, 619, arg0);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("67723, " + arg0 + ", " + arg1 + ", " + 507 + ", " + false + ", " + arg2 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDMAFIMR", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public void method225(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.method229(arg1, arg3 - this.method228(arg1, 987) / 2, arg2, 619, arg0);
			if (this.anInt288 > 2 || this.anInt288 < 2) {
				this.anInt287 = -399;
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("3413, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 2 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDMAFIMR", name = "a", descriptor = "(ILjava/lang/String;IIZI)V")
	public void method226(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		try {
			this.method233(arg0, arg1, arg5 - this.method227(arg1) / 2, arg4, arg3);
			@Pc(18) boolean local18 = false;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("68706, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDMAFIMR", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method227(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(13) int local13 = 0; local13 < arg0.length(); local13++) {
				if (arg0.charAt(local13) == '@' && local13 + 4 < arg0.length() && arg0.charAt(local13 + 4) == '@') {
					local13 += 4;
				} else {
					local7 += this.anIntArray47[arg0.charAt(local13)];
				}
			}
			return local7;
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("64367, " + 498 + ", " + arg0 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDMAFIMR", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method228(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(5) int local5 = 0;
			@Pc(9) boolean local9 = false;
			for (@Pc(11) int local11 = 0; local11 < arg0.length(); local11++) {
				local5 += this.anIntArray47[arg0.charAt(local11)];
			}
			return local5;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("27683, " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDMAFIMR", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public void method229(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg0 != null) {
				@Pc(7) int local7 = arg4 - this.anInt290;
				@Pc(11) boolean local11 = false;
				for (@Pc(13) int local13 = 0; local13 < arg0.length(); local13++) {
					@Pc(19) char local19 = arg0.charAt(local13);
					if (local19 != ' ') {
						this.method236(this.aByteArrayArray1[local19], arg1 + this.anIntArray45[local19], local7 + this.anIntArray46[local19], this.anIntArray43[local19], this.anIntArray44[local19], arg2);
					}
					arg1 += this.anIntArray47[local19];
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("57768, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDMAFIMR", name = "a", descriptor = "(Ljava/lang/String;IIIIB)V")
	public void method230(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg0 != null) {
				arg2 -= this.method228(arg0, 987) / 2;
				@Pc(22) int local22 = arg4 - this.anInt290;
				for (@Pc(24) int local24 = 0; local24 < arg0.length(); local24++) {
					@Pc(30) char local30 = arg0.charAt(local24);
					if (local30 != ' ') {
						this.method236(this.aByteArrayArray1[local30], arg2 + this.anIntArray45[local30], local22 + this.anIntArray46[local30] + (int) (Math.sin((double) local24 / 2.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray43[local30], this.anIntArray44[local30], arg1);
					}
					arg2 += this.anIntArray47[local30];
				}
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("83872, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 39 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDMAFIMR", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public void method231(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 != null) {
				arg1 -= this.method228(arg0, 987) / 2;
				@Pc(16) int local16 = arg3 - this.anInt290;
				for (@Pc(18) int local18 = 0; local18 < arg0.length(); local18++) {
					@Pc(24) char local24 = arg0.charAt(local18);
					if (local24 != ' ') {
						this.method236(this.aByteArrayArray1[local24], arg1 + this.anIntArray45[local24] + (int) (Math.sin((double) local18 / 5.0D + (double) arg4 / 5.0D) * 5.0D), local16 + this.anIntArray46[local24] + (int) (Math.sin((double) local18 / 3.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray43[local24], this.anIntArray44[local24], arg2);
					}
					arg1 += this.anIntArray47[local24];
				}
			}
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("71618, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 9 + ", " + arg3 + ", " + arg4 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDMAFIMR", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
	public void method232(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		try {
			if (arg5 != null) {
				@Pc(11) double local11 = 7.0D - (double) arg2 / 8.0D;
				if (local11 < 0.0D) {
					local11 = 0.0D;
				}
				arg0 -= this.method228(arg5, 987) / 2;
				@Pc(31) int local31 = arg4 - this.anInt290;
				for (@Pc(33) int local33 = 0; local33 < arg5.length(); local33++) {
					@Pc(39) char local39 = arg5.charAt(local33);
					if (local39 != ' ') {
						this.method236(this.aByteArrayArray1[local39], arg0 + this.anIntArray45[local39], local31 + this.anIntArray46[local39] + (int) (Math.sin((double) local33 / 1.5D + (double) arg3) * local11), this.anIntArray43[local39], this.anIntArray44[local39], arg1);
					}
					arg0 += this.anIntArray47[local39];
				}
			}
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("50711, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDMAFIMR", name = "a", descriptor = "(ILjava/lang/String;IZII)V")
	public void method233(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		try {
			this.aBoolean84 = false;
			@Pc(9) int local9 = arg2;
			if (arg1 != null) {
				@Pc(17) int local17 = arg4 - this.anInt290;
				for (@Pc(19) int local19 = 0; local19 < arg1.length(); local19++) {
					if (arg1.charAt(local19) == '@' && local19 + 4 < arg1.length() && arg1.charAt(local19 + 4) == '@') {
						@Pc(52) int local52 = this.method235(this.anInt289, arg1.substring(local19 + 1, local19 + 4));
						if (local52 != -1) {
							arg0 = local52;
						}
						local19 += 4;
					} else {
						@Pc(64) char local64 = arg1.charAt(local19);
						if (local64 != ' ') {
							if (arg3) {
								this.method236(this.aByteArrayArray1[local64], arg2 + this.anIntArray45[local64] + 1, local17 + this.anIntArray46[local64] + 1, this.anIntArray43[local64], this.anIntArray44[local64], 0);
							}
							this.method236(this.aByteArrayArray1[local64], arg2 + this.anIntArray45[local64], local17 + this.anIntArray46[local64], this.anIntArray43[local64], this.anIntArray44[local64], arg0);
						}
						arg2 += this.anIntArray47[local64];
					}
				}
				if (this.aBoolean84) {
					Class1_Sub1_Sub3.method517(arg2 - local9, local17 + (int) ((double) this.anInt290 * 0.7D), 8388608, local9);
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("22087, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDMAFIMR", name = "a", descriptor = "(ILjava/lang/String;IIIZI)V")
	public void method234(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg0 != null) {
				this.aRandom1.setSeed((long) arg2);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(22) int local22 = 15 - this.anInt290;
				for (@Pc(24) int local24 = 0; local24 < arg0.length(); local24++) {
					if (arg0.charAt(local24) == '@' && local24 + 4 < arg0.length() && arg0.charAt(local24 + 4) == '@') {
						@Pc(57) int local57 = this.method235(this.anInt289, arg0.substring(local24 + 1, local24 + 4));
						if (local57 != -1) {
							arg3 = local57;
						}
						local24 += 4;
					} else {
						@Pc(69) char local69 = arg0.charAt(local24);
						if (local69 != ' ') {
							this.method238(arg4 + this.anIntArray45[local69] + 1, 401, this.aByteArrayArray1[local69], local22 + this.anIntArray46[local69] + 1, this.anIntArray43[local69], 0, this.anIntArray44[local69], 192);
							this.method238(arg4 + this.anIntArray45[local69], 401, this.aByteArrayArray1[local69], local22 + this.anIntArray46[local69], this.anIntArray43[local69], arg3, this.anIntArray44[local69], local17);
						}
						arg4 += this.anIntArray47[local69];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg4++;
						}
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("48417, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDMAFIMR", name = "b", descriptor = "(ILjava/lang/String;)I")
	private int method235(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg0 != 0) {
				this.anInt286 = 294;
			}
			if (arg1.equals("red")) {
				return 16711680;
			} else if (arg1.equals("gre")) {
				return 65280;
			} else if (arg1.equals("blu")) {
				return 255;
			} else if (arg1.equals("yel")) {
				return 16776960;
			} else if (arg1.equals("cya")) {
				return 65535;
			} else if (arg1.equals("mag")) {
				return 16711935;
			} else if (arg1.equals("whi")) {
				return 16777215;
			} else if (arg1.equals("bla")) {
				return 0;
			} else if (arg1.equals("lre")) {
				return 16748608;
			} else if (arg1.equals("dre")) {
				return 8388608;
			} else if (arg1.equals("dbl")) {
				return 128;
			} else if (arg1.equals("or1")) {
				return 16756736;
			} else if (arg1.equals("or2")) {
				return 16740352;
			} else if (arg1.equals("or3")) {
				return 16723968;
			} else if (arg1.equals("gr1")) {
				return 12648192;
			} else if (arg1.equals("gr2")) {
				return 8453888;
			} else if (arg1.equals("gr3")) {
				return 4259584;
			} else {
				if (arg1.equals("str")) {
					this.aBoolean84 = true;
				}
				if (arg1.equals("end")) {
					this.aBoolean84 = false;
				}
				return -1;
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("1122, " + arg0 + ", " + arg1 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDMAFIMR", name = "a", descriptor = "([BIIIII)V")
	private void method236(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub3.anInt735;
		@Pc(9) int local9 = Class1_Sub1_Sub3.anInt735 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub3.anInt737) {
			local20 = Class1_Sub1_Sub3.anInt737 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub3.anInt737;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub3.anInt735;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub3.anInt738) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub3.anInt738;
		}
		if (arg1 < Class1_Sub1_Sub3.anInt739) {
			local20 = Class1_Sub1_Sub3.anInt739 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub3.anInt739;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub3.anInt740) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub3.anInt740;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method237(Class1_Sub1_Sub3.anIntArray176, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!FDMAFIMR", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method237(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!FDMAFIMR", name = "a", descriptor = "(II[BIIIII)V")
	private void method238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(5) int local5 = arg0 + arg3 * Class1_Sub1_Sub3.anInt735;
			@Pc(9) int local9 = Class1_Sub1_Sub3.anInt735 - arg4;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(17) boolean local17 = false;
			@Pc(24) int local24;
			if (arg3 < Class1_Sub1_Sub3.anInt737) {
				local24 = Class1_Sub1_Sub3.anInt737 - arg3;
				arg6 -= local24;
				arg3 = Class1_Sub1_Sub3.anInt737;
				local13 = local24 * arg4 + 0;
				local5 += local24 * Class1_Sub1_Sub3.anInt735;
			}
			if (arg3 + arg6 >= Class1_Sub1_Sub3.anInt738) {
				arg6 -= arg3 + arg6 + 1 - Class1_Sub1_Sub3.anInt738;
			}
			if (arg0 < Class1_Sub1_Sub3.anInt739) {
				local24 = Class1_Sub1_Sub3.anInt739 - arg0;
				arg4 -= local24;
				arg0 = Class1_Sub1_Sub3.anInt739;
				local13 += local24;
				local5 += local24;
				local11 = local24 + 0;
				local9 += local24;
			}
			if (arg0 + arg4 >= Class1_Sub1_Sub3.anInt740) {
				local24 = arg0 + arg4 + 1 - Class1_Sub1_Sub3.anInt740;
				arg4 -= local24;
				local11 += local24;
				local9 += local24;
			}
			if (arg4 > 0 && arg6 > 0) {
				this.method239(arg2, local5, arg5, local13, local9, arg4, local11, arg7, Class1_Sub1_Sub3.anIntArray176, arg6);
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("63135, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDMAFIMR", name = "a", descriptor = "([BIIIIZIII[II)V")
	private void method239(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg2 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg7 & 0xFF0000) >> 8;
			@Pc(23) int local23 = 256 - arg7;
			for (@Pc(29) int local29 = -arg9; local29 < 0; local29++) {
				for (@Pc(34) int local34 = -arg5; local34 < 0; local34++) {
					if (arg0[arg3++] == 0) {
						arg1++;
					} else {
						@Pc(45) int local45 = arg8[arg1];
						arg8[arg1++] = (((local45 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local45 & 0xFF00) * local23 & 0xFF0000) >> 8) + local19;
					}
				}
				arg1 += arg4;
				arg3 += arg6;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("71696, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}
}
