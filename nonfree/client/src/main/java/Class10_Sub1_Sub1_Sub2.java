import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JDPYRDAS")
public final class Class10_Sub1_Sub1_Sub2 extends Class10_Sub1_Sub1 {

	@OriginalMember(owner = "client!JDPYRDAS", name = "w", descriptor = "Z")
	private boolean aBoolean69 = true;

	@OriginalMember(owner = "client!JDPYRDAS", name = "x", descriptor = "Z")
	private boolean aBoolean70 = true;

	@OriginalMember(owner = "client!JDPYRDAS", name = "y", descriptor = "I")
	private int anInt228 = 3;

	@OriginalMember(owner = "client!JDPYRDAS", name = "z", descriptor = "I")
	private int anInt229 = 3;

	@OriginalMember(owner = "client!JDPYRDAS", name = "A", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[256][];

	@OriginalMember(owner = "client!JDPYRDAS", name = "B", descriptor = "[I")
	private int[] anIntArray58 = new int[256];

	@OriginalMember(owner = "client!JDPYRDAS", name = "C", descriptor = "[I")
	private int[] anIntArray59 = new int[256];

	@OriginalMember(owner = "client!JDPYRDAS", name = "D", descriptor = "[I")
	private int[] anIntArray60 = new int[256];

	@OriginalMember(owner = "client!JDPYRDAS", name = "E", descriptor = "[I")
	private int[] anIntArray61 = new int[256];

	@OriginalMember(owner = "client!JDPYRDAS", name = "F", descriptor = "[I")
	private int[] anIntArray62 = new int[256];

	@OriginalMember(owner = "client!JDPYRDAS", name = "H", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!JDPYRDAS", name = "I", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!JDPYRDAS", name = "G", descriptor = "I")
	public int anInt230;

	@OriginalMember(owner = "client!JDPYRDAS", name = "<init>", descriptor = "(ZLclient!ATJMVOZR;ILjava/lang/String;)V")
	public Class10_Sub1_Sub1_Sub2(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		try {
			@Pc(63) Class10_Sub1_Sub3 local63 = new Class10_Sub1_Sub3(true, arg1.method2(arg3 + ".dat", null));
			@Pc(72) Class10_Sub1_Sub3 local72 = new Class10_Sub1_Sub3(true, arg1.method2("index.dat", null));
			local72.anInt428 = local63.method313() + 4;
			@Pc(95) int local95 = local72.method311();
			if (local95 > 0) {
				local72.anInt428 += (local95 - 1) * 3;
			}
			for (@Pc(109) int local109 = 0; local109 < 256; local109++) {
				this.anIntArray60[local109] = local72.method311();
				this.anIntArray61[local109] = local72.method311();
				@Pc(133) int local133 = this.anIntArray58[local109] = local72.method313();
				@Pc(141) int local141 = this.anIntArray59[local109] = local72.method313();
				@Pc(144) int local144 = local72.method311();
				@Pc(148) int local148 = local133 * local141;
				this.aByteArrayArray3[local109] = new byte[local148];
				@Pc(158) int local158;
				@Pc(183) int local183;
				if (local144 == 0) {
					for (local158 = 0; local158 < local148; local158++) {
						this.aByteArrayArray3[local109][local158] = local63.method312();
					}
				} else if (local144 == 1) {
					for (local158 = 0; local158 < local133; local158++) {
						for (local183 = 0; local183 < local141; local183++) {
							this.aByteArrayArray3[local109][local158 + local183 * local133] = local63.method312();
						}
					}
				}
				if (local141 > this.anInt230 && local109 < 128) {
					this.anInt230 = local141;
				}
				this.anIntArray60[local109] = 1;
				this.anIntArray62[local109] = local133 + 2;
				local158 = 0;
				for (local183 = local141 / 7; local183 < local141; local183++) {
					local158 += this.aByteArrayArray3[local109][local183 * local133];
				}
				@Pc(260) int local260;
				if (local158 <= local141 / 7) {
					local260 = this.anIntArray62[local109]--;
					this.anIntArray60[local109] = 0;
				}
				local158 = 0;
				for (@Pc(274) int local274 = local141 / 7; local274 < local141; local274++) {
					local158 += this.aByteArrayArray3[local109][local133 + local274 * local133 - 1];
				}
				if (local158 <= local141 / 7) {
					local260 = this.anIntArray62[local109]--;
				}
			}
			if (arg0) {
				this.anIntArray62[32] = this.anIntArray62[73];
			} else {
				this.anIntArray62[32] = this.anIntArray62[105];
			}
		} catch (@Pc(333) RuntimeException local333) {
			signlink.reporterror("60156, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local333.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "(ZLjava/lang/String;III)V")
	public void method147(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		try {
			this.method152(507 - this.method151(arg0), arg1, arg2, arg0);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("54845, " + true + ", " + arg0 + ", " + arg1 + ", " + 507 + ", " + arg2 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "(IIIILjava/lang/String;)V")
	public void method148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		try {
			this.method152(arg0 - this.method151(arg4) / 2, arg3, arg2, arg4);
			@Pc(17) boolean local17 = false;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("56142, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "(ZIIIILjava/lang/String;)V")
	public void method149(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5) {
		try {
			if (arg1 >= this.anInt228 && arg1 <= this.anInt228) {
				this.method156(arg2, arg4 - this.method150(arg5) / 2, arg3, arg0, arg5);
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("73500, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method150(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
				if (arg0.charAt(local9) == '@' && local9 + 4 < arg0.length() && arg0.charAt(local9 + 4) == '@') {
					local9 += 4;
				} else {
					local7 += this.anIntArray62[arg0.charAt(local9)];
				}
			}
			return local7;
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("64370, " + 35 + ", " + arg0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method151(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(19) int local19 = 0; local19 < arg0.length(); local19++) {
				local7 += this.anIntArray62[arg0.charAt(local19)];
			}
			return local7;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("89750, " + arg0 + ", " + -53 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JDPYRDAS", name = "b", descriptor = "(IIIILjava/lang/String;)V")
	public void method152(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			if (arg3 != null) {
				@Pc(19) int local19 = arg2 - this.anInt230;
				for (@Pc(21) int local21 = 0; local21 < arg3.length(); local21++) {
					@Pc(27) char local27 = arg3.charAt(local21);
					if (local27 != ' ') {
						this.method159(this.aByteArrayArray3[local27], arg0 + this.anIntArray60[local27], local19 + this.anIntArray61[local27], this.anIntArray58[local27], this.anIntArray59[local27], arg1);
					}
					arg0 += this.anIntArray62[local27];
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("98211, " + 2245 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "(IBILjava/lang/String;II)V")
	public void method153(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg3 != null) {
				arg4 -= this.method151(arg3) / 2;
				@Pc(18) boolean local18 = false;
				@Pc(33) int local33 = arg0 - this.anInt230;
				for (@Pc(35) int local35 = 0; local35 < arg3.length(); local35++) {
					@Pc(41) char local41 = arg3.charAt(local35);
					if (local41 != ' ') {
						this.method159(this.aByteArrayArray3[local41], arg4 + this.anIntArray60[local41], local33 + this.anIntArray61[local41] + (int) (Math.sin((double) local35 / 2.0D + (double) arg2 / 5.0D) * 5.0D), this.anIntArray58[local41], this.anIntArray59[local41], arg5);
					}
					arg4 += this.anIntArray62[local41];
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("30730, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "(IIBLjava/lang/String;II)V")
	public void method154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 != null) {
				arg3 -= this.method151(arg2) / 2;
				@Pc(28) int local28 = arg0 - this.anInt230;
				for (@Pc(30) int local30 = 0; local30 < arg2.length(); local30++) {
					@Pc(36) char local36 = arg2.charAt(local30);
					if (local36 != ' ') {
						this.method159(this.aByteArrayArray3[local36], arg3 + this.anIntArray60[local36] + (int) (Math.sin((double) local30 / 5.0D + (double) arg4 / 5.0D) * 5.0D), local28 + this.anIntArray61[local36] + (int) (Math.sin((double) local30 / 3.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray58[local36], this.anIntArray59[local36], arg1);
					}
					arg3 += this.anIntArray62[local36];
				}
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("95836, " + arg0 + ", " + arg1 + ", " + 1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	public void method155(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 != null) {
				@Pc(11) double local11 = 7.0D - (double) arg4 / 8.0D;
				if (local11 < 0.0D) {
					local11 = 0.0D;
				}
				arg2 -= this.method151(arg0) / 2;
				@Pc(42) int local42 = arg3 - this.anInt230;
				for (@Pc(44) int local44 = 0; local44 < arg0.length(); local44++) {
					@Pc(50) char local50 = arg0.charAt(local44);
					if (local50 != ' ') {
						this.method159(this.aByteArrayArray3[local50], arg2 + this.anIntArray60[local50], local42 + this.anIntArray61[local50] + (int) (Math.sin((double) local44 / 1.5D + (double) arg5) * local11), this.anIntArray58[local50], this.anIntArray59[local50], arg1);
					}
					arg2 += this.anIntArray62[local50];
				}
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("76523, " + -601 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "(IIIZLjava/lang/String;I)V")
	public void method156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) String arg4) {
		try {
			this.aBoolean71 = false;
			@Pc(10) int local10 = arg1;
			if (arg4 != null) {
				@Pc(18) int local18 = arg2 - this.anInt230;
				for (@Pc(20) int local20 = 0; local20 < arg4.length(); local20++) {
					if (arg4.charAt(local20) == '@' && local20 + 4 < arg4.length() && arg4.charAt(local20 + 4) == '@') {
						@Pc(53) int local53 = this.method158(this.anInt229, arg4.substring(local20 + 1, local20 + 4));
						if (local53 != -1) {
							arg0 = local53;
						}
						local20 += 4;
					} else {
						@Pc(65) char local65 = arg4.charAt(local20);
						if (local65 != ' ') {
							if (arg3) {
								this.method159(this.aByteArrayArray3[local65], arg1 + this.anIntArray60[local65] + 1, local18 + this.anIntArray61[local65] + 1, this.anIntArray58[local65], this.anIntArray59[local65], 0);
							}
							this.method159(this.aByteArrayArray3[local65], arg1 + this.anIntArray60[local65], local18 + this.anIntArray61[local65], this.anIntArray58[local65], this.anIntArray59[local65], arg0);
						}
						arg1 += this.anIntArray62[local65];
					}
				}
				if (this.aBoolean71) {
					Class10_Sub1_Sub1.method502(local10, 8388608, local18 + (int) ((double) this.anInt230 * 0.7D), arg1 - local10);
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("39622, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -39629 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "(ZIIIILjava/lang/String;I)V")
	public void method157(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			if (arg4 != null) {
				this.aRandom1.setSeed((long) arg0);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(22) int local22 = 15 - this.anInt230;
				for (@Pc(29) int local29 = 0; local29 < arg4.length(); local29++) {
					if (arg4.charAt(local29) == '@' && local29 + 4 < arg4.length() && arg4.charAt(local29 + 4) == '@') {
						@Pc(62) int local62 = this.method158(this.anInt229, arg4.substring(local29 + 1, local29 + 4));
						if (local62 != -1) {
							arg2 = local62;
						}
						local29 += 4;
					} else {
						@Pc(74) char local74 = arg4.charAt(local29);
						if (local74 != ' ') {
							this.method161(arg1 + this.anIntArray60[local74] + 1, 0, this.aByteArrayArray3[local74], local22 + this.anIntArray61[local74] + 1, this.anIntArray59[local74], this.anIntArray58[local74], 192);
							this.method161(arg1 + this.anIntArray60[local74], arg2, this.aByteArrayArray3[local74], local22 + this.anIntArray61[local74], this.anIntArray59[local74], this.anIntArray58[local74], local17);
						}
						arg1 += this.anIntArray62[local74];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg1++;
						}
					}
				}
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("46126, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "(ILjava/lang/String;)I")
	private int method158(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg0 != this.anInt229) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
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
					this.aBoolean71 = true;
				}
				if (arg1.equals("end")) {
					this.aBoolean71 = false;
				}
				return -1;
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("40569, " + arg0 + ", " + arg1 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "([BIIIII)V")
	private void method159(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class10_Sub1_Sub1.anInt674;
		@Pc(9) int local9 = Class10_Sub1_Sub1.anInt674 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class10_Sub1_Sub1.anInt676) {
			local20 = Class10_Sub1_Sub1.anInt676 - arg2;
			arg4 -= local20;
			arg2 = Class10_Sub1_Sub1.anInt676;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class10_Sub1_Sub1.anInt674;
		}
		if (arg2 + arg4 >= Class10_Sub1_Sub1.anInt677) {
			arg4 -= arg2 + arg4 + 1 - Class10_Sub1_Sub1.anInt677;
		}
		if (arg1 < Class10_Sub1_Sub1.anInt678) {
			local20 = Class10_Sub1_Sub1.anInt678 - arg1;
			arg3 -= local20;
			arg1 = Class10_Sub1_Sub1.anInt678;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class10_Sub1_Sub1.anInt679) {
			local20 = arg1 + arg3 + 1 - Class10_Sub1_Sub1.anInt679;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method160(Class10_Sub1_Sub1.anIntArray178, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method160(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "(IZI[BIIII)V")
	private void method161(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg0 + arg3 * Class10_Sub1_Sub1.anInt674;
			@Pc(9) int local9 = Class10_Sub1_Sub1.anInt674 - arg5;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(23) int local23;
			if (arg3 < Class10_Sub1_Sub1.anInt676) {
				local23 = Class10_Sub1_Sub1.anInt676 - arg3;
				arg4 -= local23;
				arg3 = Class10_Sub1_Sub1.anInt676;
				local13 = local23 * arg5 + 0;
				local5 += local23 * Class10_Sub1_Sub1.anInt674;
			}
			if (arg3 + arg4 >= Class10_Sub1_Sub1.anInt677) {
				arg4 -= arg3 + arg4 + 1 - Class10_Sub1_Sub1.anInt677;
			}
			if (arg0 < Class10_Sub1_Sub1.anInt678) {
				local23 = Class10_Sub1_Sub1.anInt678 - arg0;
				arg5 -= local23;
				arg0 = Class10_Sub1_Sub1.anInt678;
				local13 += local23;
				local5 += local23;
				local11 = local23 + 0;
				local9 += local23;
			}
			if (arg0 + arg5 >= Class10_Sub1_Sub1.anInt679) {
				local23 = arg0 + arg5 + 1 - Class10_Sub1_Sub1.anInt679;
				arg5 -= local23;
				local11 += local23;
				local9 += local23;
			}
			if (arg5 > 0 && arg4 > 0) {
				this.method162(local13, local9, local11, local5, arg6, Class10_Sub1_Sub1.anIntArray178, arg1, arg4, arg5, arg2);
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("65701, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "(IIIII[IIIII[B)V")
	private void method162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9) {
		try {
			@Pc(33) int local33 = ((arg6 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((arg6 & 0xFF00) * arg4 & 0xFF0000) >> 8;
			@Pc(37) int local37 = 256 - arg4;
			for (@Pc(40) int local40 = -arg7; local40 < 0; local40++) {
				for (@Pc(45) int local45 = -arg8; local45 < 0; local45++) {
					if (arg9[arg0++] == 0) {
						arg3++;
					} else {
						@Pc(56) int local56 = arg5[arg3];
						arg5[arg3++] = (((local56 & 0xFF00FF) * local37 & 0xFF00FF00) + ((local56 & 0xFF00) * local37 & 0xFF0000) >> 8) + local33;
					}
				}
				arg3 += arg1;
				arg0 += arg2;
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("18799, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 2 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}
}
