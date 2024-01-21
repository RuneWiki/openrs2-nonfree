import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kb")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
	private int anInt701;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "Z")
	private boolean aBoolean184 = true;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
	private int anInt702 = 5;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
	private int anInt703 = 2;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[256][];

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "[I")
	private int[] anIntArray211 = new int[256];

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "[I")
	private int[] anIntArray212 = new int[256];

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "[I")
	private int[] anIntArray213 = new int[256];

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "[I")
	private int[] anIntArray214 = new int[256];

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "[I")
	private int[] anIntArray215 = new int[256];

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "Z")
	private boolean aBoolean185 = false;

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
	public int anInt704;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!xb;ZLjava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) Class47 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(60) Class1_Sub1_Sub3 local60 = new Class1_Sub1_Sub3(arg0.method660(arg2 + ".dat", null), 185);
			@Pc(69) Class1_Sub1_Sub3 local69 = new Class1_Sub1_Sub3(arg0.method660("index.dat", null), 185);
			local69.anInt738 = local60.method476() + 4;
			@Pc(80) int local80 = local69.method474();
			if (local80 > 0) {
				local69.anInt738 += (local80 - 1) * 3;
			}
			for (@Pc(94) int local94 = 0; local94 < 256; local94++) {
				this.anIntArray213[local94] = local69.method474();
				this.anIntArray214[local94] = local69.method474();
				@Pc(118) int local118 = this.anIntArray211[local94] = local69.method476();
				@Pc(126) int local126 = this.anIntArray212[local94] = local69.method476();
				@Pc(129) int local129 = local69.method474();
				@Pc(133) int local133 = local118 * local126;
				this.aByteArrayArray3[local94] = new byte[local133];
				@Pc(143) int local143;
				@Pc(168) int local168;
				if (local129 == 0) {
					for (local143 = 0; local143 < local133; local143++) {
						this.aByteArrayArray3[local94][local143] = local60.method475();
					}
				} else if (local129 == 1) {
					for (local143 = 0; local143 < local118; local143++) {
						for (local168 = 0; local168 < local126; local168++) {
							this.aByteArrayArray3[local94][local143 + local168 * local118] = local60.method475();
						}
					}
				}
				if (local126 > this.anInt704 && local94 < 128) {
					this.anInt704 = local126;
				}
				this.anIntArray213[local94] = 1;
				this.anIntArray215[local94] = local118 + 2;
				local143 = 0;
				for (local168 = local126 / 7; local168 < local126; local168++) {
					local143 += this.aByteArrayArray3[local94][local168 * local118];
				}
				@Pc(245) int local245;
				if (local143 <= local126 / 7) {
					local245 = this.anIntArray215[local94]--;
					this.anIntArray213[local94] = 0;
				}
				local143 = 0;
				for (@Pc(259) int local259 = local126 / 7; local259 < local126; local259++) {
					local143 += this.aByteArrayArray3[local94][local118 + local259 * local118 - 1];
				}
				if (local143 <= local126 / 7) {
					local245 = this.anIntArray215[local94]--;
				}
			}
			if (arg1) {
				this.anIntArray215[32] = this.anIntArray215[73];
			} else {
				this.anIntArray215[32] = this.anIntArray215[105];
			}
		} catch (@Pc(328) RuntimeException local328) {
			signlink.reporterror("4639, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local328.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBILjava/lang/String;I)V")
	public void method443(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		try {
			this.method447(arg0 - this.method446(arg2) / 2, arg2, arg3, arg1);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("84299, " + arg0 + ", " + 2 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZILjava/lang/String;IZI)V")
	public void method444(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.method449(arg1, arg3 - this.method445(arg2) / 2, arg0, arg4, arg2);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("63389, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method445(@OriginalArg(0) String arg0) {
		try {
			@Pc(11) int local11;
			if (this.anInt702 > 5 || this.anInt702 < 5) {
				for (local11 = 1; local11 > 0; local11++) {
				}
			}
			if (arg0 == null) {
				return 0;
			}
			local11 = 0;
			for (@Pc(24) int local24 = 0; local24 < arg0.length(); local24++) {
				if (arg0.charAt(local24) == '@' && local24 + 4 < arg0.length() && arg0.charAt(local24 + 4) == '@') {
					local24 += 4;
				} else {
					local11 += this.anIntArray215[arg0.charAt(local24)];
				}
			}
			return local11;
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("33755, " + arg0 + ", " + 5 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public int method446(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(9) int local9 = 0;
			for (@Pc(11) int local11 = 0; local11 < arg0.length(); local11++) {
				local9 += this.anIntArray215[arg0.charAt(local11)];
			}
			return local9;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("80007, " + arg0 + ", " + 479 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public void method447(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 != null) {
				@Pc(11) int local11 = arg2 - this.anInt704;
				for (@Pc(13) int local13 = 0; local13 < arg1.length(); local13++) {
					@Pc(19) char local19 = arg1.charAt(local13);
					if (local19 != ' ') {
						this.method452(this.aByteArrayArray3[local19], arg0 + this.anIntArray213[local19], local11 + this.anIntArray214[local19], this.anIntArray211[local19], this.anIntArray212[local19], arg3);
					}
					arg0 += this.anIntArray215[local19];
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("16862, " + arg0 + ", " + arg1 + ", " + -1765 + ", " + arg2 + ", " + arg3 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;IIIB)V")
	public void method448(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		try {
			if (arg1 != null) {
				arg4 -= this.method446(arg1) / 2;
				@Pc(16) int local16 = arg3 - this.anInt704;
				for (@Pc(18) int local18 = 0; local18 < arg1.length(); local18++) {
					@Pc(24) char local24 = arg1.charAt(local18);
					if (local24 != ' ') {
						this.method452(this.aByteArrayArray3[local24], arg4 + this.anIntArray213[local24], local16 + this.anIntArray214[local24] + (int) (Math.sin((double) local18 / 2.0D + (double) arg2 / 5.0D) * 5.0D), this.anIntArray211[local24], this.anIntArray212[local24], arg0);
					}
					arg4 += this.anIntArray215[local24];
				}
				@Pc(85) boolean local85 = false;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("77463, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIZILjava/lang/String;)V")
	public void method449(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			this.aBoolean185 = false;
			@Pc(6) int local6 = arg1;
			if (arg4 != null) {
				@Pc(14) int local14 = arg0 - this.anInt704;
				for (@Pc(19) int local19 = 0; local19 < arg4.length(); local19++) {
					if (arg4.charAt(local19) == '@' && local19 + 4 < arg4.length() && arg4.charAt(local19 + 4) == '@') {
						@Pc(51) int local51 = this.method451((byte) 6, arg4.substring(local19 + 1, local19 + 4));
						if (local51 != -1) {
							arg3 = local51;
						}
						local19 += 4;
					} else {
						@Pc(63) char local63 = arg4.charAt(local19);
						if (local63 != ' ') {
							if (arg2) {
								this.method452(this.aByteArrayArray3[local63], arg1 + this.anIntArray213[local63] + 1, local14 + this.anIntArray214[local63] + 1, this.anIntArray211[local63], this.anIntArray212[local63], 0);
							}
							this.method452(this.aByteArrayArray3[local63], arg1 + this.anIntArray213[local63], local14 + this.anIntArray214[local63], this.anIntArray211[local63], this.anIntArray212[local63], arg3);
						}
						arg1 += this.anIntArray215[local63];
					}
				}
				if (this.aBoolean185) {
					Class1_Sub1_Sub2.method439(local14 + (int) ((double) this.anInt704 * 0.7D), 8388608, arg1 - local6, local6);
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("57530, " + arg0 + ", " + 12 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;IIZIIZ)V")
	public void method450(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 != null) {
				this.aRandom1.setSeed((long) arg3);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(27) int local27 = 15 - this.anInt704;
				for (@Pc(29) int local29 = 0; local29 < arg0.length(); local29++) {
					if (arg0.charAt(local29) == '@' && local29 + 4 < arg0.length() && arg0.charAt(local29 + 4) == '@') {
						@Pc(61) int local61 = this.method451((byte) 6, arg0.substring(local29 + 1, local29 + 4));
						if (local61 != -1) {
							arg1 = local61;
						}
						local29 += 4;
					} else {
						@Pc(73) char local73 = arg0.charAt(local29);
						if (local73 != ' ') {
							this.method454(192, this.anIntArray212[local73], this.anIntArray211[local73], local27 + this.anIntArray214[local73] + 1, arg4 + this.anIntArray213[local73] + 1, this.aByteArrayArray3[local73], 0);
							this.method454(local17, this.anIntArray212[local73], this.anIntArray211[local73], local27 + this.anIntArray214[local73], arg4 + this.anIntArray213[local73], this.aByteArrayArray3[local73], arg1);
						}
						arg4 += this.anIntArray215[local73];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg4++;
						}
					}
				}
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("97644, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + false + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLjava/lang/String;)I")
	private int method451(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(4) boolean local4 = false;
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
					this.aBoolean185 = true;
				}
				if (arg1.equals("end")) {
					this.aBoolean185 = false;
				}
				return -1;
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("47363, " + arg0 + ", " + arg1 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BIIIII)V")
	private void method452(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub2.anInt691;
		@Pc(9) int local9 = Class1_Sub1_Sub2.anInt691 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub2.anInt693) {
			local20 = Class1_Sub1_Sub2.anInt693 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub2.anInt693;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub2.anInt691;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt694) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt694;
		}
		if (arg1 < Class1_Sub1_Sub2.anInt695) {
			local20 = Class1_Sub1_Sub2.anInt695 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub2.anInt695;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub2.anInt696) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub2.anInt696;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method453(Class1_Sub1_Sub2.anIntArray210, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method453(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIZIII[BI)V")
	private void method454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(8) int local8 = arg4 + arg3 * Class1_Sub1_Sub2.anInt691;
			@Pc(12) int local12 = Class1_Sub1_Sub2.anInt691 - arg2;
			@Pc(14) int local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(23) int local23;
			if (arg3 < Class1_Sub1_Sub2.anInt693) {
				local23 = Class1_Sub1_Sub2.anInt693 - arg3;
				arg1 -= local23;
				arg3 = Class1_Sub1_Sub2.anInt693;
				local16 = local23 * arg2 + 0;
				local8 += local23 * Class1_Sub1_Sub2.anInt691;
			}
			if (arg3 + arg1 >= Class1_Sub1_Sub2.anInt694) {
				arg1 -= arg3 + arg1 + 1 - Class1_Sub1_Sub2.anInt694;
			}
			if (arg4 < Class1_Sub1_Sub2.anInt695) {
				local23 = Class1_Sub1_Sub2.anInt695 - arg4;
				arg2 -= local23;
				arg4 = Class1_Sub1_Sub2.anInt695;
				local16 += local23;
				local8 += local23;
				local14 = local23 + 0;
				local12 += local23;
			}
			if (arg4 + arg2 >= Class1_Sub1_Sub2.anInt696) {
				local23 = arg4 + arg2 + 1 - Class1_Sub1_Sub2.anInt696;
				arg2 -= local23;
				local14 += local23;
				local12 += local23;
			}
			if (arg2 > 0 && arg1 > 0) {
				this.method455(arg1, arg6, arg2, local14, local8, arg5, Class1_Sub1_Sub2.anIntArray210, arg0, local16, local12);
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("60773, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIII[BB[IIII)V")
	private void method455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg1 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg7 & 0xFF0000) >> 8;
			@Pc(33) int local33 = 256 - arg7;
			for (@Pc(36) int local36 = -arg0; local36 < 0; local36++) {
				for (@Pc(41) int local41 = -arg2; local41 < 0; local41++) {
					if (arg5[arg8++] == 0) {
						arg4++;
					} else {
						@Pc(52) int local52 = arg6[arg4];
						arg6[arg4++] = (((local52 & 0xFF00FF) * local33 & 0xFF00FF00) + ((local52 & 0xFF00) * local33 & 0xFF0000) >> 8) + local19;
					}
				}
				arg4 += arg9;
				arg8 += arg3;
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("20349, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 9 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}
}
