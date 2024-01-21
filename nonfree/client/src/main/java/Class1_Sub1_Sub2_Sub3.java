import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FTIYCDAU")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!FTIYCDAU", name = "x", descriptor = "Z")
	private boolean aBoolean67 = true;

	@OriginalMember(owner = "client!FTIYCDAU", name = "y", descriptor = "I")
	private int anInt360 = -21200;

	@OriginalMember(owner = "client!FTIYCDAU", name = "z", descriptor = "I")
	private int anInt361 = 47;

	@OriginalMember(owner = "client!FTIYCDAU", name = "A", descriptor = "I")
	private int anInt362 = 398;

	@OriginalMember(owner = "client!FTIYCDAU", name = "B", descriptor = "I")
	private int anInt363 = 969;

	@OriginalMember(owner = "client!FTIYCDAU", name = "C", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[256][];

	@OriginalMember(owner = "client!FTIYCDAU", name = "D", descriptor = "[I")
	private int[] anIntArray52 = new int[256];

	@OriginalMember(owner = "client!FTIYCDAU", name = "E", descriptor = "[I")
	private int[] anIntArray53 = new int[256];

	@OriginalMember(owner = "client!FTIYCDAU", name = "F", descriptor = "[I")
	private int[] anIntArray54 = new int[256];

	@OriginalMember(owner = "client!FTIYCDAU", name = "G", descriptor = "[I")
	private int[] anIntArray55 = new int[256];

	@OriginalMember(owner = "client!FTIYCDAU", name = "H", descriptor = "[I")
	private int[] anIntArray56 = new int[256];

	@OriginalMember(owner = "client!FTIYCDAU", name = "J", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!FTIYCDAU", name = "K", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!FTIYCDAU", name = "I", descriptor = "I")
	public int anInt364;

	@OriginalMember(owner = "client!FTIYCDAU", name = "<init>", descriptor = "(Ljava/lang/String;ILclient!HBJEXSJX;Z)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class13 arg2, @OriginalArg(3) boolean arg3) {
		try {
			@Pc(66) Class1_Sub1_Sub3 local66 = new Class1_Sub1_Sub3(arg2.method278(arg0 + ".dat", null), 0);
			@Pc(75) Class1_Sub1_Sub3 local75 = new Class1_Sub1_Sub3(arg2.method278("index.dat", null), 0);
			local75.anInt301 = local66.method157() + 4;
			@Pc(91) int local91 = local75.method155();
			if (local91 > 0) {
				local75.anInt301 += (local91 - 1) * 3;
			}
			for (@Pc(105) int local105 = 0; local105 < 256; local105++) {
				this.anIntArray54[local105] = local75.method155();
				this.anIntArray55[local105] = local75.method155();
				@Pc(129) int local129 = this.anIntArray52[local105] = local75.method157();
				@Pc(137) int local137 = this.anIntArray53[local105] = local75.method157();
				@Pc(140) int local140 = local75.method155();
				@Pc(144) int local144 = local129 * local137;
				this.aByteArrayArray1[local105] = new byte[local144];
				@Pc(154) int local154;
				@Pc(179) int local179;
				if (local140 == 0) {
					for (local154 = 0; local154 < local144; local154++) {
						this.aByteArrayArray1[local105][local154] = local66.method156();
					}
				} else if (local140 == 1) {
					for (local154 = 0; local154 < local129; local154++) {
						for (local179 = 0; local179 < local137; local179++) {
							this.aByteArrayArray1[local105][local154 + local179 * local129] = local66.method156();
						}
					}
				}
				if (local137 > this.anInt364 && local105 < 128) {
					this.anInt364 = local137;
				}
				this.anIntArray54[local105] = 1;
				this.anIntArray56[local105] = local129 + 2;
				local154 = 0;
				for (local179 = local137 / 7; local179 < local137; local179++) {
					local154 += this.aByteArrayArray1[local105][local179 * local129];
				}
				@Pc(256) int local256;
				if (local154 <= local137 / 7) {
					local256 = this.anIntArray56[local105]--;
					this.anIntArray54[local105] = 0;
				}
				local154 = 0;
				for (@Pc(270) int local270 = local137 / 7; local270 < local137; local270++) {
					local154 += this.aByteArrayArray1[local105][local129 + local270 * local129 - 1];
				}
				if (local154 <= local137 / 7) {
					local256 = this.anIntArray56[local105]--;
				}
			}
			if (arg3) {
				this.anIntArray56[32] = this.anIntArray56[73];
			} else {
				this.anIntArray56[32] = this.anIntArray56[105];
			}
		} catch (@Pc(329) RuntimeException local329) {
			signlink.reporterror("45563, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local329.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTIYCDAU", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public void method260(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			this.method265(507 - this.method264(arg0), arg2, arg0, arg3);
			@Pc(15) boolean local15 = false;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("96157, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 507 + ", " + arg3 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTIYCDAU", name = "a", descriptor = "(BIILjava/lang/String;I)V")
	public void method261(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(4) boolean local4 = false;
			this.method265(arg4 - this.method264(arg3) / 2, arg1, arg3, arg2);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("6762, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTIYCDAU", name = "a", descriptor = "(IZIIILjava/lang/String;)V")
	public void method262(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			this.method269(arg1, arg4, arg2, arg0, arg3 - this.method263(arg4) / 2);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("70419, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTIYCDAU", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method263(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(12) int local12 = 0;
			for (@Pc(14) int local14 = 0; local14 < arg0.length(); local14++) {
				if (arg0.charAt(local14) == '@' && local14 + 4 < arg0.length() && arg0.charAt(local14 + 4) == '@') {
					local14 += 4;
				} else {
					local12 += this.anIntArray56[arg0.charAt(local14)];
				}
			}
			return local12;
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("90720, " + arg0 + ", " + false + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTIYCDAU", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method264(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(11) int local11 = 0;
			for (@Pc(13) int local13 = 0; local13 < arg0.length(); local13++) {
				local11 += this.anIntArray56[arg0.charAt(local13)];
			}
			return local11;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("97401, " + -19 + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTIYCDAU", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public void method265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 != null) {
				@Pc(10) int local10 = arg1 - this.anInt364;
				for (@Pc(12) int local12 = 0; local12 < arg2.length(); local12++) {
					@Pc(18) char local18 = arg2.charAt(local12);
					if (local18 != ' ') {
						this.method272(this.aByteArrayArray1[local18], arg0 + this.anIntArray54[local18], local10 + this.anIntArray55[local18], this.anIntArray52[local18], this.anIntArray53[local18], arg3);
					}
					arg0 += this.anIntArray56[local18];
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("83507, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 47 + ", " + arg3 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTIYCDAU", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public void method266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg2 != null) {
				arg5 -= this.method264(arg2) / 2;
				@Pc(16) int local16 = arg4 - this.anInt364;
				if (arg1 == 0) {
					for (@Pc(21) int local21 = 0; local21 < arg2.length(); local21++) {
						@Pc(27) char local27 = arg2.charAt(local21);
						if (local27 != ' ') {
							this.method272(this.aByteArrayArray1[local27], arg5 + this.anIntArray54[local27], local16 + this.anIntArray55[local27] + (int) (Math.sin((double) local21 / 2.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray52[local27], this.anIntArray53[local27], arg0);
						}
						arg5 += this.anIntArray56[local27];
					}
				}
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("8049, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTIYCDAU", name = "b", descriptor = "(IILjava/lang/String;III)V")
	public void method267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg2 != null) {
				arg4 -= this.method264(arg2) / 2;
				@Pc(16) int local16 = arg3 - this.anInt364;
				for (@Pc(18) int local18 = 0; local18 < arg2.length(); local18++) {
					@Pc(24) char local24 = arg2.charAt(local18);
					if (local24 != ' ') {
						this.method272(this.aByteArrayArray1[local24], arg4 + this.anIntArray54[local24] + (int) (Math.sin((double) local18 / 5.0D + (double) arg1 / 5.0D) * 5.0D), local16 + this.anIntArray55[local24] + (int) (Math.sin((double) local18 / 3.0D + (double) arg1 / 5.0D) * 5.0D), this.anIntArray52[local24], this.anIntArray53[local24], arg5);
					}
					arg4 += this.anIntArray56[local24];
				}
				@Pc(98) boolean local98 = false;
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("18850, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTIYCDAU", name = "a", descriptor = "(Ljava/lang/String;IZIIII)V")
	public void method268(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 != null) {
				@Pc(11) double local11 = 7.0D - (double) arg5 / 8.0D;
				if (local11 < 0.0D) {
					local11 = 0.0D;
				}
				arg3 -= this.method264(arg0) / 2;
				@Pc(40) int local40 = arg2 - this.anInt364;
				for (@Pc(42) int local42 = 0; local42 < arg0.length(); local42++) {
					@Pc(48) char local48 = arg0.charAt(local42);
					if (local48 != ' ') {
						this.method272(this.aByteArrayArray1[local48], arg3 + this.anIntArray54[local48], local40 + this.anIntArray55[local48] + (int) (Math.sin((double) local42 / 1.5D + (double) arg4) * local11), this.anIntArray52[local48], this.anIntArray53[local48], arg1);
					}
					arg3 += this.anIntArray56[local48];
				}
			}
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("29938, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTIYCDAU", name = "a", descriptor = "(ZLjava/lang/String;IIII)V")
	public void method269(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.aBoolean68 = false;
			@Pc(6) int local6 = arg4;
			if (arg1 != null) {
				@Pc(18) int local18 = arg2 - this.anInt364;
				for (@Pc(20) int local20 = 0; local20 < arg1.length(); local20++) {
					if (arg1.charAt(local20) == '@' && local20 + 4 < arg1.length() && arg1.charAt(local20 + 4) == '@') {
						@Pc(52) int local52 = this.method271(arg1.substring(local20 + 1, local20 + 4));
						if (local52 != -1) {
							arg3 = local52;
						}
						local20 += 4;
					} else {
						@Pc(64) char local64 = arg1.charAt(local20);
						if (local64 != ' ') {
							if (arg0) {
								this.method272(this.aByteArrayArray1[local64], arg4 + this.anIntArray54[local64] + 1, local18 + this.anIntArray55[local64] + 1, this.anIntArray52[local64], this.anIntArray53[local64], 0);
							}
							this.method272(this.aByteArrayArray1[local64], arg4 + this.anIntArray54[local64], local18 + this.anIntArray55[local64], this.anIntArray52[local64], this.anIntArray53[local64], arg3);
						}
						arg4 += this.anIntArray56[local64];
					}
				}
				if (this.aBoolean68) {
					Class1_Sub1_Sub2.method354(local18 + (int) ((double) this.anInt364 * 0.7D), 8388608, local6, this.anInt360, arg4 - local6);
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("16433, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -48148 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTIYCDAU", name = "a", descriptor = "(Ljava/lang/String;IZIZII)V")
	public void method270(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg0 != null) {
				this.aRandom1.setSeed((long) arg4);
				@Pc(27) int local27 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(32) int local32 = 15 - this.anInt364;
				for (@Pc(34) int local34 = 0; local34 < arg0.length(); local34++) {
					if (arg0.charAt(local34) == '@' && local34 + 4 < arg0.length() && arg0.charAt(local34 + 4) == '@') {
						@Pc(66) int local66 = this.method271(arg0.substring(local34 + 1, local34 + 4));
						if (local66 != -1) {
							arg2 = local66;
						}
						local34 += 4;
					} else {
						@Pc(78) char local78 = arg0.charAt(local34);
						if (local78 != ' ') {
							this.method274(local32 + this.anIntArray55[local78] + 1, arg3 + this.anIntArray54[local78] + 1, 0, this.anIntArray53[local78], this.aByteArrayArray1[local78], this.anIntArray52[local78], 192);
							this.method274(local32 + this.anIntArray55[local78], arg3 + this.anIntArray54[local78], arg2, this.anIntArray53[local78], this.aByteArrayArray1[local78], this.anIntArray52[local78], local27);
						}
						arg3 += this.anIntArray56[local78];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg3++;
						}
					}
				}
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("7319, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTIYCDAU", name = "a", descriptor = "(ILjava/lang/String;)I")
	private int method271(@OriginalArg(1) String arg0) {
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
					this.aBoolean68 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean68 = false;
				}
				return -1;
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("35549, " + -22435 + ", " + arg0 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTIYCDAU", name = "a", descriptor = "([BIIIII)V")
	private void method272(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub2.anInt550;
		@Pc(9) int local9 = Class1_Sub1_Sub2.anInt550 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub2.anInt552) {
			local20 = Class1_Sub1_Sub2.anInt552 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub2.anInt552;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub2.anInt550;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt553) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt553;
		}
		if (arg1 < Class1_Sub1_Sub2.anInt554) {
			local20 = Class1_Sub1_Sub2.anInt554 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub2.anInt554;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub2.anInt555) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub2.anInt555;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method273(Class1_Sub1_Sub2.anIntArray86, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!FTIYCDAU", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method273(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!FTIYCDAU", name = "a", descriptor = "(IIII[BIII)V")
	private void method274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(5) int local5 = arg1 + arg0 * Class1_Sub1_Sub2.anInt550;
			@Pc(9) int local9 = Class1_Sub1_Sub2.anInt550 - arg5;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(25) int local25;
			if (arg0 < Class1_Sub1_Sub2.anInt552) {
				local25 = Class1_Sub1_Sub2.anInt552 - arg0;
				arg3 -= local25;
				arg0 = Class1_Sub1_Sub2.anInt552;
				local13 = local25 * arg5 + 0;
				local5 += local25 * Class1_Sub1_Sub2.anInt550;
			}
			if (arg0 + arg3 >= Class1_Sub1_Sub2.anInt553) {
				arg3 -= arg0 + arg3 + 1 - Class1_Sub1_Sub2.anInt553;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt554) {
				local25 = Class1_Sub1_Sub2.anInt554 - arg1;
				arg5 -= local25;
				arg1 = Class1_Sub1_Sub2.anInt554;
				local13 += local25;
				local5 += local25;
				local11 = local25 + 0;
				local9 += local25;
			}
			if (arg1 + arg5 >= Class1_Sub1_Sub2.anInt555) {
				local25 = arg1 + arg5 + 1 - Class1_Sub1_Sub2.anInt555;
				arg5 -= local25;
				local11 += local25;
				local9 += local25;
			}
			if (arg5 > 0 && arg3 > 0) {
				this.method275(local9, local11, local13, arg4, arg5, arg3, arg6, Class1_Sub1_Sub2.anIntArray86, arg2, local5);
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("44866, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 0 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTIYCDAU", name = "a", descriptor = "(III[BIIZI[III)V")
	private void method275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg8 & 0xFF00FF) * arg6 & 0xFF00FF00) + ((arg8 & 0xFF00) * arg6 & 0xFF0000) >> 8;
			@Pc(23) int local23 = 256 - arg6;
			for (@Pc(29) int local29 = -arg5; local29 < 0; local29++) {
				for (@Pc(34) int local34 = -arg4; local34 < 0; local34++) {
					if (arg3[arg2++] == 0) {
						arg9++;
					} else {
						@Pc(45) int local45 = arg7[arg9];
						arg7[arg9++] = (((local45 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local45 & 0xFF00) * local23 & 0xFF0000) >> 8) + local19;
					}
				}
				arg9 += arg0;
				arg2 += arg1;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("89596, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + true + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}
}
