import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EOVZRNPE")
public final class Class2_Sub1_Sub1_Sub2 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!EOVZRNPE", name = "z", descriptor = "I")
	private int anInt186;

	@OriginalMember(owner = "client!EOVZRNPE", name = "A", descriptor = "I")
	private int anInt187;

	@OriginalMember(owner = "client!EOVZRNPE", name = "x", descriptor = "Z")
	private boolean aBoolean45 = true;

	@OriginalMember(owner = "client!EOVZRNPE", name = "y", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!EOVZRNPE", name = "B", descriptor = "B")
	private byte aByte13 = -90;

	@OriginalMember(owner = "client!EOVZRNPE", name = "C", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[256][];

	@OriginalMember(owner = "client!EOVZRNPE", name = "D", descriptor = "[I")
	private int[] anIntArray30 = new int[256];

	@OriginalMember(owner = "client!EOVZRNPE", name = "E", descriptor = "[I")
	private int[] anIntArray31 = new int[256];

	@OriginalMember(owner = "client!EOVZRNPE", name = "F", descriptor = "[I")
	private int[] anIntArray32 = new int[256];

	@OriginalMember(owner = "client!EOVZRNPE", name = "G", descriptor = "[I")
	private int[] anIntArray33 = new int[256];

	@OriginalMember(owner = "client!EOVZRNPE", name = "H", descriptor = "[I")
	private int[] anIntArray34 = new int[256];

	@OriginalMember(owner = "client!EOVZRNPE", name = "J", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!EOVZRNPE", name = "K", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!EOVZRNPE", name = "I", descriptor = "I")
	public int anInt188;

	@OriginalMember(owner = "client!EOVZRNPE", name = "<init>", descriptor = "(Ljava/lang/String;ZZLclient!FNOQZAYQ;)V")
	public Class2_Sub1_Sub1_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class8 arg3) {
		try {
			@Pc(61) Class2_Sub1_Sub4 local61 = new Class2_Sub1_Sub4(arg3.method165(arg0 + ".dat", null), this.aBoolean45);
			@Pc(71) Class2_Sub1_Sub4 local71 = new Class2_Sub1_Sub4(arg3.method165("index.dat", null), this.aBoolean45);
			local71.anInt166 = local61.method96() + 4;
			@Pc(91) int local91 = local71.method94();
			if (local91 > 0) {
				local71.anInt166 += (local91 - 1) * 3;
			}
			for (@Pc(105) int local105 = 0; local105 < 256; local105++) {
				this.anIntArray32[local105] = local71.method94();
				this.anIntArray33[local105] = local71.method94();
				@Pc(129) int local129 = this.anIntArray30[local105] = local71.method96();
				@Pc(137) int local137 = this.anIntArray31[local105] = local71.method96();
				@Pc(140) int local140 = local71.method94();
				@Pc(144) int local144 = local129 * local137;
				this.aByteArrayArray1[local105] = new byte[local144];
				@Pc(154) int local154;
				@Pc(179) int local179;
				if (local140 == 0) {
					for (local154 = 0; local154 < local144; local154++) {
						this.aByteArrayArray1[local105][local154] = local61.method95();
					}
				} else if (local140 == 1) {
					for (local154 = 0; local154 < local129; local154++) {
						for (local179 = 0; local179 < local137; local179++) {
							this.aByteArrayArray1[local105][local154 + local179 * local129] = local61.method95();
						}
					}
				}
				if (local137 > this.anInt188 && local105 < 128) {
					this.anInt188 = local137;
				}
				this.anIntArray32[local105] = 1;
				this.anIntArray34[local105] = local129 + 2;
				local154 = 0;
				for (local179 = local137 / 7; local179 < local137; local179++) {
					local154 += this.aByteArrayArray1[local105][local179 * local129];
				}
				@Pc(256) int local256;
				if (local154 <= local137 / 7) {
					local256 = this.anIntArray34[local105]--;
					this.anIntArray32[local105] = 0;
				}
				local154 = 0;
				for (@Pc(270) int local270 = local137 / 7; local270 < local137; local270++) {
					local154 += this.aByteArrayArray1[local105][local129 + local270 * local129 - 1];
				}
				if (local154 <= local137 / 7) {
					local256 = this.anIntArray34[local105]--;
				}
			}
			if (arg2) {
				this.anIntArray34[32] = this.anIntArray34[73];
			} else {
				this.anIntArray34[32] = this.anIntArray34[105];
			}
		} catch (@Pc(337) RuntimeException local337) {
			signlink.reporterror("88549, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local337.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOVZRNPE", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public void method148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		try {
			if (arg2 == 0) {
				this.method153(507 - this.method152(arg3), arg3, arg0, 988, arg1);
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("68087, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 507 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOVZRNPE", name = "a", descriptor = "(IILjava/lang/String;BI)V")
	public void method149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.aByte13 == -90) {
				this.method153(arg1 - this.method152(arg2) / 2, arg2, arg0, 988, arg3);
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("23883, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -90 + ", " + arg3 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOVZRNPE", name = "a", descriptor = "(ILjava/lang/String;ZIII)V")
	public void method150(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.method157(arg4 - this.method151(arg0) / 2, arg0, arg1, arg2, arg3);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("29025, " + 27826 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOVZRNPE", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method151(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(16) int local16 = 0;
			for (@Pc(18) int local18 = 0; local18 < arg0.length(); local18++) {
				if (arg0.charAt(local18) == '@' && local18 + 4 < arg0.length() && arg0.charAt(local18 + 4) == '@') {
					local18 += 4;
				} else {
					local16 += this.anIntArray34[arg0.charAt(local18)];
				}
			}
			return local16;
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("72176, " + arg0 + ", " + 410 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOVZRNPE", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method152(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(20) int local20 = 0; local20 < arg0.length(); local20++) {
				local7 += this.anIntArray34[arg0.charAt(local20)];
			}
			return local7;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("61159, " + -267 + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOVZRNPE", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public void method153(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg1 != null) {
				@Pc(7) int local7 = arg4 - this.anInt188;
				for (@Pc(9) int local9 = 0; local9 < arg1.length(); local9++) {
					@Pc(15) char local15 = arg1.charAt(local9);
					if (local15 != ' ') {
						this.method160(this.aByteArrayArray1[local15], arg0 + this.anIntArray32[local15], local7 + this.anIntArray33[local15], this.anIntArray30[local15], this.anIntArray31[local15], arg2);
					}
					arg0 += this.anIntArray34[local15];
				}
				@Pc(61) boolean local61 = false;
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("43570, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOVZRNPE", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public void method154(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg1 != null) {
				arg3 -= this.method152(arg1) / 2;
				@Pc(16) int local16 = arg2 - this.anInt188;
				for (@Pc(18) int local18 = 0; local18 < arg1.length(); local18++) {
					@Pc(24) char local24 = arg1.charAt(local18);
					if (local24 != ' ') {
						this.method160(this.aByteArrayArray1[local24], arg3 + this.anIntArray32[local24], local16 + this.anIntArray33[local24] + (int) (Math.sin((double) local18 / 2.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray30[local24], this.anIntArray31[local24], arg0);
					}
					arg3 += this.anIntArray34[local24];
				}
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("11181, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOVZRNPE", name = "a", descriptor = "(IBLjava/lang/String;III)V")
	public void method155(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg2 != null) {
				arg3 -= this.method152(arg2) / 2;
				if (arg1 == 81) {
					@Pc(20) int local20 = arg0 - this.anInt188;
					for (@Pc(22) int local22 = 0; local22 < arg2.length(); local22++) {
						@Pc(28) char local28 = arg2.charAt(local22);
						if (local28 != ' ') {
							this.method160(this.aByteArrayArray1[local28], arg3 + this.anIntArray32[local28] + (int) (Math.sin((double) local22 / 5.0D + (double) arg4 / 5.0D) * 5.0D), local20 + this.anIntArray33[local28] + (int) (Math.sin((double) local22 / 3.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray30[local28], this.anIntArray31[local28], arg5);
						}
						arg3 += this.anIntArray34[local28];
					}
				}
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("47665, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOVZRNPE", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public void method156(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg4 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg3 / 8.0D;
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg1 -= this.method152(arg4) / 2;
				@Pc(40) int local40 = arg0 - this.anInt188;
				for (@Pc(42) int local42 = 0; local42 < arg4.length(); local42++) {
					@Pc(48) char local48 = arg4.charAt(local42);
					if (local48 != ' ') {
						this.method160(this.aByteArrayArray1[local48], arg1 + this.anIntArray32[local48], local40 + this.anIntArray33[local48] + (int) (Math.sin((double) local42 / 1.5D + (double) arg5) * local9), this.anIntArray30[local48], this.anIntArray31[local48], arg2);
					}
					arg1 += this.anIntArray34[local48];
				}
			}
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("31734, " + 6 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOVZRNPE", name = "a", descriptor = "(IILjava/lang/String;ZII)V")
	public void method157(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aBoolean47 = false;
			@Pc(6) int local6 = arg0;
			if (arg1 != null) {
				@Pc(14) int local14 = arg3 - this.anInt188;
				for (@Pc(26) int local26 = 0; local26 < arg1.length(); local26++) {
					if (arg1.charAt(local26) == '@' && local26 + 4 < arg1.length() && arg1.charAt(local26 + 4) == '@') {
						@Pc(58) int local58 = this.method159(arg1.substring(local26 + 1, local26 + 4));
						if (local58 != -1) {
							arg4 = local58;
						}
						local26 += 4;
					} else {
						@Pc(70) char local70 = arg1.charAt(local26);
						if (local70 != ' ') {
							if (arg2) {
								this.method160(this.aByteArrayArray1[local70], arg0 + this.anIntArray32[local70] + 1, local14 + this.anIntArray33[local70] + 1, this.anIntArray30[local70], this.anIntArray31[local70], 0);
							}
							this.method160(this.aByteArrayArray1[local70], arg0 + this.anIntArray32[local70], local14 + this.anIntArray33[local70], this.anIntArray30[local70], this.anIntArray31[local70], arg4);
						}
						arg0 += this.anIntArray34[local70];
					}
				}
				if (this.aBoolean47) {
					Class2_Sub1_Sub1.method488(local14 + (int) ((double) this.anInt188 * 0.7D), arg0 - local6, local6, 8388608, this.anInt186);
				}
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("89138, " + arg0 + ", " + 30867 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOVZRNPE", name = "a", descriptor = "(ILjava/lang/String;ZZIII)V")
	public void method158(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg1 != null) {
				this.aRandom1.setSeed((long) arg3);
				@Pc(22) int local22 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(27) int local27 = 15 - this.anInt188;
				for (@Pc(29) int local29 = 0; local29 < arg1.length(); local29++) {
					if (arg1.charAt(local29) == '@' && local29 + 4 < arg1.length() && arg1.charAt(local29 + 4) == '@') {
						@Pc(61) int local61 = this.method159(arg1.substring(local29 + 1, local29 + 4));
						if (local61 != -1) {
							arg4 = local61;
						}
						local29 += 4;
					} else {
						@Pc(73) char local73 = arg1.charAt(local29);
						if (local73 != ' ') {
							this.method162(259, arg0 + this.anIntArray32[local73] + 1, 0, 192, local27 + this.anIntArray33[local73] + 1, this.aByteArrayArray1[local73], this.anIntArray31[local73], this.anIntArray30[local73]);
							this.method162(259, arg0 + this.anIntArray32[local73], arg4, local22, local27 + this.anIntArray33[local73], this.aByteArrayArray1[local73], this.anIntArray31[local73], this.anIntArray30[local73]);
						}
						arg0 += this.anIntArray34[local73];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg0++;
						}
					}
				}
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("70506, " + arg0 + ", " + arg1 + ", " + true + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOVZRNPE", name = "b", descriptor = "(Ljava/lang/String;I)I")
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
					this.aBoolean47 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean47 = false;
				}
				return -1;
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("65437, " + arg0 + ", " + 7 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOVZRNPE", name = "a", descriptor = "([BIIIII)V")
	private void method160(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class2_Sub1_Sub1.anInt688;
		@Pc(9) int local9 = Class2_Sub1_Sub1.anInt688 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class2_Sub1_Sub1.anInt690) {
			local20 = Class2_Sub1_Sub1.anInt690 - arg2;
			arg4 -= local20;
			arg2 = Class2_Sub1_Sub1.anInt690;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class2_Sub1_Sub1.anInt688;
		}
		if (arg2 + arg4 >= Class2_Sub1_Sub1.anInt691) {
			arg4 -= arg2 + arg4 + 1 - Class2_Sub1_Sub1.anInt691;
		}
		if (arg1 < Class2_Sub1_Sub1.anInt692) {
			local20 = Class2_Sub1_Sub1.anInt692 - arg1;
			arg3 -= local20;
			arg1 = Class2_Sub1_Sub1.anInt692;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class2_Sub1_Sub1.anInt693) {
			local20 = arg1 + arg3 + 1 - Class2_Sub1_Sub1.anInt693;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method161(Class2_Sub1_Sub1.anIntArray189, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!EOVZRNPE", name = "a", descriptor = "([I[BIIIIIII)V")
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

	@OriginalMember(owner = "client!EOVZRNPE", name = "a", descriptor = "(IIIII[BII)V")
	private void method162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(5) int local5 = arg1 + arg4 * Class2_Sub1_Sub1.anInt688;
			@Pc(9) int local9 = Class2_Sub1_Sub1.anInt688 - arg7;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(20) int local20;
			if (arg4 < Class2_Sub1_Sub1.anInt690) {
				local20 = Class2_Sub1_Sub1.anInt690 - arg4;
				arg6 -= local20;
				arg4 = Class2_Sub1_Sub1.anInt690;
				local13 = local20 * arg7 + 0;
				local5 += local20 * Class2_Sub1_Sub1.anInt688;
			}
			if (arg4 + arg6 >= Class2_Sub1_Sub1.anInt691) {
				arg6 -= arg4 + arg6 + 1 - Class2_Sub1_Sub1.anInt691;
			}
			if (arg1 < Class2_Sub1_Sub1.anInt692) {
				local20 = Class2_Sub1_Sub1.anInt692 - arg1;
				arg7 -= local20;
				arg1 = Class2_Sub1_Sub1.anInt692;
				local13 += local20;
				local5 += local20;
				local11 = local20 + 0;
				local9 += local20;
			}
			if (arg1 + arg7 >= Class2_Sub1_Sub1.anInt693) {
				local20 = arg1 + arg7 + 1 - Class2_Sub1_Sub1.anInt693;
				arg7 -= local20;
				local11 += local20;
				local9 += local20;
			}
			if (arg7 > 0 && arg6 > 0) {
				this.method163(arg2, local9, arg3, arg7, arg6, local11, arg5, local5, Class2_Sub1_Sub1.anIntArray189, local13);
				@Pc(129) boolean local129 = false;
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("89800, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOVZRNPE", name = "a", descriptor = "(IIIIII[BII[II)V")
	private void method163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg2 & 0xFF0000) >> 8;
			@Pc(23) int local23 = 256 - arg2;
			for (@Pc(30) int local30 = -arg4; local30 < 0; local30++) {
				for (@Pc(35) int local35 = -arg3; local35 < 0; local35++) {
					if (arg6[arg9++] == 0) {
						arg7++;
					} else {
						@Pc(46) int local46 = arg8[arg7];
						arg8[arg7++] = (((local46 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local46 & 0xFF00) * local23 & 0xFF0000) >> 8) + local19;
					}
				}
				arg7 += arg1;
				arg9 += arg5;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("17075, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 400 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}
}
