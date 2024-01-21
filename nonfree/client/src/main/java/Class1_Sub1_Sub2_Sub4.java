import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kb")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "Z")
	private boolean aBoolean192 = false;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
	private int anInt697 = -836;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
	private int anInt698 = -6835;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[256][];

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "[I")
	private int[] anIntArray214 = new int[256];

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "[I")
	private int[] anIntArray215 = new int[256];

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "[I")
	private int[] anIntArray216 = new int[256];

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "[I")
	private int[] anIntArray217 = new int[256];

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "[I")
	private int[] anIntArray218 = new int[256];

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "Z")
	private boolean aBoolean193 = false;

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
	public int anInt699;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(ZLjava/lang/String;Lclient!xb;I)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(61) Class1_Sub1_Sub3 local61 = new Class1_Sub1_Sub3(arg2.method666(arg1 + ".dat", null), this.aBoolean192);
			@Pc(71) Class1_Sub1_Sub3 local71 = new Class1_Sub1_Sub3(arg2.method666("index.dat", null), this.aBoolean192);
			local71.anInt733 = local61.method482() + 4;
			@Pc(92) int local92 = local71.method480();
			if (local92 > 0) {
				local71.anInt733 += (local92 - 1) * 3;
			}
			for (@Pc(106) int local106 = 0; local106 < 256; local106++) {
				this.anIntArray216[local106] = local71.method480();
				this.anIntArray217[local106] = local71.method480();
				@Pc(130) int local130 = this.anIntArray214[local106] = local71.method482();
				@Pc(138) int local138 = this.anIntArray215[local106] = local71.method482();
				@Pc(141) int local141 = local71.method480();
				@Pc(145) int local145 = local130 * local138;
				this.aByteArrayArray3[local106] = new byte[local145];
				@Pc(155) int local155;
				@Pc(180) int local180;
				if (local141 == 0) {
					for (local155 = 0; local155 < local145; local155++) {
						this.aByteArrayArray3[local106][local155] = local61.method481();
					}
				} else if (local141 == 1) {
					for (local155 = 0; local155 < local130; local155++) {
						for (local180 = 0; local180 < local138; local180++) {
							this.aByteArrayArray3[local106][local155 + local180 * local130] = local61.method481();
						}
					}
				}
				if (local138 > this.anInt699 && local106 < 128) {
					this.anInt699 = local138;
				}
				this.anIntArray216[local106] = 1;
				this.anIntArray218[local106] = local130 + 2;
				local155 = 0;
				for (local180 = local138 / 7; local180 < local138; local180++) {
					local155 += this.aByteArrayArray3[local106][local180 * local130];
				}
				@Pc(257) int local257;
				if (local155 <= local138 / 7) {
					local257 = this.anIntArray218[local106]--;
					this.anIntArray216[local106] = 0;
				}
				local155 = 0;
				for (@Pc(271) int local271 = local138 / 7; local271 < local138; local271++) {
					local155 += this.aByteArrayArray3[local106][local130 + local271 * local130 - 1];
				}
				if (local155 <= local138 / 7) {
					local257 = this.anIntArray218[local106]--;
				}
			}
			if (arg0) {
				this.anIntArray218[32] = this.anIntArray218[73];
			} else {
				this.anIntArray218[32] = this.anIntArray218[105];
			}
		} catch (@Pc(335) RuntimeException local335) {
			signlink.reporterror("40778, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local335.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIILjava/lang/String;)V")
	public void method446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) String arg2) {
		try {
			this.method451(arg0, arg1, 507 - this.method450(arg2), arg2);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("253, " + arg0 + ", " + arg1 + ", " + 507 + ", " + 341 + ", " + arg2 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public void method447(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		try {
			this.method451(arg3, arg1, arg0 - this.method450(arg2) / 2, arg2);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("44494, " + arg0 + ", " + -33071 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZILjava/lang/String;II)V")
	public void method448(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		try {
			this.method455(arg2, arg0 - this.method449(arg3) / 2, arg1, arg4, arg3);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("81039, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -836 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method449(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(14) int local14 = 0; local14 < arg0.length(); local14++) {
				if (arg0.charAt(local14) == '@' && local14 + 4 < arg0.length() && arg0.charAt(local14 + 4) == '@') {
					local14 += 4;
				} else {
					local7 += this.anIntArray218[arg0.charAt(local14)];
				}
			}
			return local7;
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("39082, " + arg0 + ", " + 0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method450(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(11) int local11 = 0;
			for (@Pc(13) int local13 = 0; local13 < arg0.length(); local13++) {
				local11 += this.anIntArray218[arg0.charAt(local13)];
			}
			return local11;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("88327, " + 7 + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(IIILjava/lang/String;I)V")
	public void method451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		try {
			if (arg3 != null) {
				@Pc(7) int local7 = arg0 - this.anInt699;
				for (@Pc(13) int local13 = 0; local13 < arg3.length(); local13++) {
					@Pc(19) char local19 = arg3.charAt(local13);
					if (local19 != ' ') {
						this.method458(this.aByteArrayArray3[local19], arg2 + this.anIntArray216[local19], local7 + this.anIntArray217[local19], this.anIntArray214[local19], this.anIntArray215[local19], arg1);
					}
					arg2 += this.anIntArray218[local19];
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("23547, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 3 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIBIILjava/lang/String;)V")
	public void method452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			if (arg4 != null) {
				arg2 -= this.method450(arg4) / 2;
				@Pc(25) int local25 = arg3 - this.anInt699;
				for (@Pc(27) int local27 = 0; local27 < arg4.length(); local27++) {
					@Pc(33) char local33 = arg4.charAt(local27);
					if (local33 != ' ') {
						this.method458(this.aByteArrayArray3[local33], arg2 + this.anIntArray216[local33], local25 + this.anIntArray217[local33] + (int) (Math.sin((double) local27 / 2.0D + (double) arg0 / 5.0D) * 5.0D), this.anIntArray214[local33], this.anIntArray215[local33], arg1);
					}
					arg2 += this.anIntArray218[local33];
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("76763, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;IZII)V")
	public void method453(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 != null) {
				arg2 -= this.method450(arg1) / 2;
				@Pc(19) int local19 = arg0 - this.anInt699;
				for (@Pc(21) int local21 = 0; local21 < arg1.length(); local21++) {
					@Pc(27) char local27 = arg1.charAt(local21);
					if (local27 != ' ') {
						this.method458(this.aByteArrayArray3[local27], arg2 + this.anIntArray216[local27] + (int) (Math.sin((double) local21 / 5.0D + (double) arg3 / 5.0D) * 5.0D), local19 + this.anIntArray217[local27] + (int) (Math.sin((double) local21 / 3.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray214[local27], this.anIntArray215[local27], arg4);
					}
					arg2 += this.anIntArray218[local27];
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("46232, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public void method454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg0 / 8.0D;
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg5 -= this.method450(arg2) / 2;
				@Pc(29) int local29 = arg4 - this.anInt699;
				for (@Pc(37) int local37 = 0; local37 < arg2.length(); local37++) {
					@Pc(43) char local43 = arg2.charAt(local37);
					if (local43 != ' ') {
						this.method458(this.aByteArrayArray3[local43], arg5 + this.anIntArray216[local43], local29 + this.anIntArray217[local43] + (int) (Math.sin((double) local37 / 1.5D + (double) arg1) * local9), this.anIntArray214[local43], this.anIntArray215[local43], arg3);
					}
					arg5 += this.anIntArray218[local43];
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("61582, " + arg0 + ", " + arg1 + ", " + -32105 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIZILjava/lang/String;I)V")
	public void method455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		try {
			this.aBoolean193 = false;
			@Pc(6) int local6 = arg1;
			if (arg4 != null) {
				@Pc(14) int local14 = arg3 - this.anInt699;
				for (@Pc(20) int local20 = 0; local20 < arg4.length(); local20++) {
					if (arg4.charAt(local20) == '@' && local20 + 4 < arg4.length() && arg4.charAt(local20 + 4) == '@') {
						@Pc(52) int local52 = this.method457(arg4.substring(local20 + 1, local20 + 4));
						if (local52 != -1) {
							arg0 = local52;
						}
						local20 += 4;
					} else {
						@Pc(64) char local64 = arg4.charAt(local20);
						if (local64 != ' ') {
							if (arg2) {
								this.method458(this.aByteArrayArray3[local64], arg1 + this.anIntArray216[local64] + 1, local14 + this.anIntArray217[local64] + 1, this.anIntArray214[local64], this.anIntArray215[local64], 0);
							}
							this.method458(this.aByteArrayArray3[local64], arg1 + this.anIntArray216[local64], local14 + this.anIntArray217[local64], this.anIntArray214[local64], this.anIntArray215[local64], arg0);
						}
						arg1 += this.anIntArray218[local64];
					}
				}
				if (this.aBoolean193) {
					Class1_Sub1_Sub2.method442(local6, 8388608, local14 + (int) ((double) this.anInt699 * 0.7D), arg1 - local6);
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("44066, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 1 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIILjava/lang/String;IIZ)V")
	public void method456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg0 == 9 && arg3 != null) {
				this.aRandom1.setSeed((long) arg4);
				@Pc(21) int local21 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(26) int local26 = 15 - this.anInt699;
				for (@Pc(28) int local28 = 0; local28 < arg3.length(); local28++) {
					if (arg3.charAt(local28) == '@' && local28 + 4 < arg3.length() && arg3.charAt(local28 + 4) == '@') {
						@Pc(60) int local60 = this.method457(arg3.substring(local28 + 1, local28 + 4));
						if (local60 != -1) {
							arg2 = local60;
						}
						local28 += 4;
					} else {
						@Pc(72) char local72 = arg3.charAt(local28);
						if (local72 != ' ') {
							this.method460(arg1 + this.anIntArray216[local72] + 1, local26 + this.anIntArray217[local72] + 1, this.anIntArray214[local72], this.anIntArray215[local72], this.aByteArrayArray3[local72], 192, 0);
							this.method460(arg1 + this.anIntArray216[local72], local26 + this.anIntArray217[local72], this.anIntArray214[local72], this.anIntArray215[local72], this.aByteArrayArray3[local72], local21, arg2);
						}
						arg1 += this.anIntArray218[local72];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg1++;
						}
					}
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("71752, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + true + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(Ljava/lang/String;I)I")
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
					this.aBoolean193 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean193 = false;
				}
				return -1;
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("5721, " + arg0 + ", " + 381 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BIIIII)V")
	private void method458(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub2.anInt687;
		@Pc(9) int local9 = Class1_Sub1_Sub2.anInt687 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub2.anInt689) {
			local20 = Class1_Sub1_Sub2.anInt689 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub2.anInt689;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub2.anInt687;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt690) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt690;
		}
		if (arg1 < Class1_Sub1_Sub2.anInt691) {
			local20 = Class1_Sub1_Sub2.anInt691 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub2.anInt691;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub2.anInt692) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub2.anInt692;
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

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIII[BII)V")
	private void method460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg0 + arg1 * Class1_Sub1_Sub2.anInt687;
			@Pc(9) int local9 = Class1_Sub1_Sub2.anInt687 - arg2;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(20) int local20;
			if (arg1 < Class1_Sub1_Sub2.anInt689) {
				local20 = Class1_Sub1_Sub2.anInt689 - arg1;
				arg3 -= local20;
				arg1 = Class1_Sub1_Sub2.anInt689;
				local13 = local20 * arg2 + 0;
				local5 += local20 * Class1_Sub1_Sub2.anInt687;
			}
			if (arg1 + arg3 >= Class1_Sub1_Sub2.anInt690) {
				arg3 -= arg1 + arg3 + 1 - Class1_Sub1_Sub2.anInt690;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt691) {
				local20 = Class1_Sub1_Sub2.anInt691 - arg0;
				arg2 -= local20;
				arg0 = Class1_Sub1_Sub2.anInt691;
				local13 += local20;
				local5 += local20;
				local11 = local20 + 0;
				local9 += local20;
			}
			if (arg0 + arg2 >= Class1_Sub1_Sub2.anInt692) {
				local20 = arg0 + arg2 + 1 - Class1_Sub1_Sub2.anInt692;
				arg2 -= local20;
				local11 += local20;
				local9 += local20;
			}
			if (arg2 > 0 && arg3 > 0) {
				this.method461(arg4, arg5, local13, arg2, local11, local5, Class1_Sub1_Sub2.anIntArray213, local9, arg6, arg3);
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("80898, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 216 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BIIIIII[IIII)V")
	private void method461(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(22) int local22 = ((arg8 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg8 & 0xFF00) * arg1 & 0xFF0000) >> 8;
			@Pc(26) int local26 = 256 - arg1;
			for (@Pc(29) int local29 = -arg9; local29 < 0; local29++) {
				for (@Pc(34) int local34 = -arg3; local34 < 0; local34++) {
					if (arg0[arg2++] == 0) {
						arg5++;
					} else {
						@Pc(45) int local45 = arg6[arg5];
						arg6[arg5++] = (((local45 & 0xFF00FF) * local26 & 0xFF00FF00) + ((local45 & 0xFF00) * local26 & 0xFF0000) >> 8) + local22;
					}
				}
				arg5 += arg7;
				arg2 += arg4;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("2127, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}
}
