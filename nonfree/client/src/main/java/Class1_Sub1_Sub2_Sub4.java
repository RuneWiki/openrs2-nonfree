import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kb")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
	private int anInt685 = 864;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "Z")
	private boolean aBoolean189 = false;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
	private int anInt686 = 455;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "Z")
	private boolean aBoolean190 = false;

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "Z")
	private boolean aBoolean191 = false;

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[256][];

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "[I")
	private int[] anIntArray214 = new int[256];

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "[I")
	private int[] anIntArray215 = new int[256];

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "[I")
	private int[] anIntArray216 = new int[256];

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "[I")
	private int[] anIntArray217 = new int[256];

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "[I")
	private int[] anIntArray218 = new int[256];

	@OriginalMember(owner = "client!kb", name = "M", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!kb", name = "N", descriptor = "Z")
	private boolean aBoolean192 = false;

	@OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
	public int anInt687;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(ZLjava/lang/String;Lclient!xb;I)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(66) Class1_Sub1_Sub3 local66 = new Class1_Sub1_Sub3(arg2.method666(arg1 + ".dat", null), (byte) -93);
			@Pc(75) Class1_Sub1_Sub3 local75 = new Class1_Sub1_Sub3(arg2.method666("index.dat", null), (byte) -93);
			local75.anInt720 = local66.method482() + 4;
			@Pc(86) int local86 = local75.method480();
			@Pc(90) int local90 = 45 / arg3;
			if (local86 > 0) {
				local75.anInt720 += (local86 - 1) * 3;
			}
			for (@Pc(104) int local104 = 0; local104 < 256; local104++) {
				this.anIntArray216[local104] = local75.method480();
				this.anIntArray217[local104] = local75.method480();
				@Pc(128) int local128 = this.anIntArray214[local104] = local75.method482();
				@Pc(136) int local136 = this.anIntArray215[local104] = local75.method482();
				@Pc(139) int local139 = local75.method480();
				@Pc(143) int local143 = local128 * local136;
				this.aByteArrayArray3[local104] = new byte[local143];
				@Pc(153) int local153;
				@Pc(178) int local178;
				if (local139 == 0) {
					for (local153 = 0; local153 < local143; local153++) {
						this.aByteArrayArray3[local104][local153] = local66.method481();
					}
				} else if (local139 == 1) {
					for (local153 = 0; local153 < local128; local153++) {
						for (local178 = 0; local178 < local136; local178++) {
							this.aByteArrayArray3[local104][local153 + local178 * local128] = local66.method481();
						}
					}
				}
				if (local136 > this.anInt687 && local104 < 128) {
					this.anInt687 = local136;
				}
				this.anIntArray216[local104] = 1;
				this.anIntArray218[local104] = local128 + 2;
				local153 = 0;
				for (local178 = local136 / 7; local178 < local136; local178++) {
					local153 += this.aByteArrayArray3[local104][local178 * local128];
				}
				@Pc(255) int local255;
				if (local153 <= local136 / 7) {
					local255 = this.anIntArray218[local104]--;
					this.anIntArray216[local104] = 0;
				}
				local153 = 0;
				for (@Pc(269) int local269 = local136 / 7; local269 < local136; local269++) {
					local153 += this.aByteArrayArray3[local104][local128 + local269 * local128 - 1];
				}
				if (local153 <= local136 / 7) {
					local255 = this.anIntArray218[local104]--;
				}
			}
			if (arg0) {
				this.anIntArray218[32] = this.anIntArray218[73];
			} else {
				this.anIntArray218[32] = this.anIntArray218[105];
			}
		} catch (@Pc(333) RuntimeException local333) {
			signlink.reporterror("17943, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local333.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;IIZI)V")
	public void method446(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		try {
			this.method451(arg0, arg1, 507 - this.method450(arg0), arg2);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("90041, " + arg0 + ", " + 507 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;IIBI)V")
	public void method447(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			this.method451(arg0, arg1, arg3 - this.method450(arg0) / 2, arg2);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("77283, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZIILjava/lang/String;II)V")
	public void method448(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.method455(arg4, arg3 - this.method449(arg2) / 2, arg2, arg1, arg0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("35376, " + arg0 + ", " + 12737 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method449(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
				if (arg0.charAt(local9) == '@' && local9 + 4 < arg0.length() && arg0.charAt(local9 + 4) == '@') {
					local9 += 4;
				} else {
					local7 += this.anIntArray218[arg0.charAt(local9)];
				}
			}
			return local7;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("8051, " + 0 + ", " + arg0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method450(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(15) int local15 = 0;
			for (@Pc(17) int local17 = 0; local17 < arg0.length(); local17++) {
				local15 += this.anIntArray218[arg0.charAt(local17)];
			}
			return local15;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("25852, " + arg0 + ", " + false + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;ZIII)V")
	public void method451(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 != null) {
				@Pc(7) int local7 = arg1 - this.anInt687;
				for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
					@Pc(15) char local15 = arg0.charAt(local9);
					if (local15 != ' ') {
						this.method458(this.aByteArrayArray3[local15], arg2 + this.anIntArray216[local15], local7 + this.anIntArray217[local15], this.anIntArray214[local15], this.anIntArray215[local15], arg3);
					}
					arg2 += this.anIntArray218[local15];
				}
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("42072, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
	public void method452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 != null) {
				arg2 -= this.method450(arg3) / 2;
				@Pc(21) int local21 = arg4 - this.anInt687;
				for (@Pc(23) int local23 = 0; local23 < arg3.length(); local23++) {
					@Pc(29) char local29 = arg3.charAt(local23);
					if (local29 != ' ') {
						this.method458(this.aByteArrayArray3[local29], arg2 + this.anIntArray216[local29], local21 + this.anIntArray217[local29] + (int) (Math.sin((double) local23 / 2.0D + (double) arg1 / 5.0D) * 5.0D), this.anIntArray214[local29], this.anIntArray215[local29], arg0);
					}
					arg2 += this.anIntArray218[local29];
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("58019, " + arg0 + ", " + arg1 + ", " + -871 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;IIIBI)V")
	public void method453(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 != null) {
				arg2 -= this.method450(arg0) / 2;
				@Pc(16) int local16 = arg4 - this.anInt687;
				for (@Pc(29) int local29 = 0; local29 < arg0.length(); local29++) {
					@Pc(35) char local35 = arg0.charAt(local29);
					if (local35 != ' ') {
						this.method458(this.aByteArrayArray3[local35], arg2 + this.anIntArray216[local35] + (int) (Math.sin((double) local29 / 5.0D + (double) arg3 / 5.0D) * 5.0D), local16 + this.anIntArray217[local35] + (int) (Math.sin((double) local29 / 3.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray214[local35], this.anIntArray215[local35], arg1);
					}
					arg2 += this.anIntArray218[local35];
				}
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("77493, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 96 + ", " + arg4 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	public void method454(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 != null) {
				@Pc(19) double local19 = 7.0D - (double) arg3 / 8.0D;
				if (local19 < 0.0D) {
					local19 = 0.0D;
				}
				arg5 -= this.method450(arg1) / 2;
				@Pc(39) int local39 = arg2 - this.anInt687;
				for (@Pc(41) int local41 = 0; local41 < arg1.length(); local41++) {
					@Pc(47) char local47 = arg1.charAt(local41);
					if (local47 != ' ') {
						this.method458(this.aByteArrayArray3[local47], arg5 + this.anIntArray216[local47], local39 + this.anIntArray217[local47] + (int) (Math.sin((double) local41 / 1.5D + (double) arg4) * local19), this.anIntArray214[local47], this.anIntArray215[local47], arg0);
					}
					arg5 += this.anIntArray218[local47];
				}
			}
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("98709, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -160 + ", " + arg5 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILjava/lang/String;IZB)V")
	public void method455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		try {
			this.aBoolean192 = false;
			@Pc(6) int local6 = arg1;
			if (arg2 != null) {
				@Pc(20) int local20 = arg0 - this.anInt687;
				for (@Pc(22) int local22 = 0; local22 < arg2.length(); local22++) {
					if (arg2.charAt(local22) == '@' && local22 + 4 < arg2.length() && arg2.charAt(local22 + 4) == '@') {
						@Pc(54) int local54 = this.method457(695, arg2.substring(local22 + 1, local22 + 4));
						if (local54 != -1) {
							arg3 = local54;
						}
						local22 += 4;
					} else {
						@Pc(66) char local66 = arg2.charAt(local22);
						if (local66 != ' ') {
							if (arg4) {
								this.method458(this.aByteArrayArray3[local66], arg1 + this.anIntArray216[local66] + 1, local20 + this.anIntArray217[local66] + 1, this.anIntArray214[local66], this.anIntArray215[local66], 0);
							}
							this.method458(this.aByteArrayArray3[local66], arg1 + this.anIntArray216[local66], local20 + this.anIntArray217[local66], this.anIntArray214[local66], this.anIntArray215[local66], arg3);
						}
						arg1 += this.anIntArray218[local66];
					}
				}
				if (this.aBoolean192) {
					Class1_Sub1_Sub2.method442(8388608, local20 + (int) ((double) this.anInt687 * 0.7D), arg1 - local6, local6);
				}
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("82706, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 3 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIZLjava/lang/String;II)V")
	public void method456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg3 != null) {
				this.aRandom1.setSeed((long) arg2);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(36) int local36 = 15 - this.anInt687;
				for (@Pc(38) int local38 = 0; local38 < arg3.length(); local38++) {
					if (arg3.charAt(local38) == '@' && local38 + 4 < arg3.length() && arg3.charAt(local38 + 4) == '@') {
						@Pc(70) int local70 = this.method457(695, arg3.substring(local38 + 1, local38 + 4));
						if (local70 != -1) {
							arg1 = local70;
						}
						local38 += 4;
					} else {
						@Pc(82) char local82 = arg3.charAt(local38);
						if (local82 != ' ') {
							this.method460(this.anIntArray214[local82], 0, this.aByteArrayArray3[local82], local36 + this.anIntArray217[local82] + 1, arg4 + this.anIntArray216[local82] + 1, 192, this.anIntArray215[local82]);
							this.method460(this.anIntArray214[local82], arg1, this.aByteArrayArray3[local82], local36 + this.anIntArray217[local82], arg4 + this.anIntArray216[local82], local17, this.anIntArray215[local82]);
						}
						arg4 += this.anIntArray218[local82];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg4++;
						}
					}
				}
			}
		} catch (@Pc(170) RuntimeException local170) {
			signlink.reporterror("38399, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + 7 + ", " + arg4 + ", " + local170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;)I")
	private int method457(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(3) boolean local3 = false;
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
					this.aBoolean192 = true;
				}
				if (arg1.equals("end")) {
					this.aBoolean192 = false;
				}
				return -1;
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("26201, " + arg0 + ", " + arg1 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BIIIII)V")
	private void method458(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub2.anInt675;
		@Pc(9) int local9 = Class1_Sub1_Sub2.anInt675 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub2.anInt677) {
			local20 = Class1_Sub1_Sub2.anInt677 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub2.anInt677;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub2.anInt675;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt678) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt678;
		}
		if (arg1 < Class1_Sub1_Sub2.anInt679) {
			local20 = Class1_Sub1_Sub2.anInt679 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub2.anInt679;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub2.anInt680) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub2.anInt680;
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

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[BIIIII)V")
	private void method460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(10) int local10 = arg4 + arg3 * Class1_Sub1_Sub2.anInt675;
			@Pc(14) int local14 = Class1_Sub1_Sub2.anInt675 - arg0;
			@Pc(16) int local16 = 0;
			@Pc(18) int local18 = 0;
			@Pc(25) int local25;
			if (arg3 < Class1_Sub1_Sub2.anInt677) {
				local25 = Class1_Sub1_Sub2.anInt677 - arg3;
				arg6 -= local25;
				arg3 = Class1_Sub1_Sub2.anInt677;
				local18 = local25 * arg0 + 0;
				local10 += local25 * Class1_Sub1_Sub2.anInt675;
			}
			if (arg3 + arg6 >= Class1_Sub1_Sub2.anInt678) {
				arg6 -= arg3 + arg6 + 1 - Class1_Sub1_Sub2.anInt678;
			}
			if (arg4 < Class1_Sub1_Sub2.anInt679) {
				local25 = Class1_Sub1_Sub2.anInt679 - arg4;
				arg0 -= local25;
				arg4 = Class1_Sub1_Sub2.anInt679;
				local18 += local25;
				local10 += local25;
				local16 = local25 + 0;
				local14 += local25;
			}
			if (arg4 + arg0 >= Class1_Sub1_Sub2.anInt680) {
				local25 = arg4 + arg0 + 1 - Class1_Sub1_Sub2.anInt680;
				arg0 -= local25;
				local16 += local25;
				local14 += local25;
			}
			if (arg0 > 0 && arg6 > 0) {
				this.method461(local10, local16, local18, arg1, local14, arg6, Class1_Sub1_Sub2.anIntArray213, arg5, arg2, arg0);
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("37272, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -332 + ", " + arg5 + ", " + arg6 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIBII[II[BI)V")
	private void method461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg3 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((arg3 & 0xFF00) * arg7 & 0xFF0000) >> 8;
			@Pc(33) int local33 = 256 - arg7;
			for (@Pc(36) int local36 = -arg5; local36 < 0; local36++) {
				for (@Pc(41) int local41 = -arg9; local41 < 0; local41++) {
					if (arg8[arg2++] == 0) {
						arg0++;
					} else {
						@Pc(52) int local52 = arg6[arg0];
						arg6[arg0++] = (((local52 & 0xFF00FF) * local33 & 0xFF00FF00) + ((local52 & 0xFF00) * local33 & 0xFF0000) >> 8) + local19;
					}
				}
				arg0 += arg4;
				arg2 += arg1;
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("86484, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 8 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}
}
