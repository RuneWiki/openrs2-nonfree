import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TJCUOFPI")
public final class Class6_Sub2_Sub2_Sub2 extends Class6_Sub2_Sub2 {

	@OriginalMember(owner = "client!TJCUOFPI", name = "B", descriptor = "Z")
	private boolean aBoolean162 = true;

	@OriginalMember(owner = "client!TJCUOFPI", name = "C", descriptor = "B")
	private byte aByte26 = 48;

	@OriginalMember(owner = "client!TJCUOFPI", name = "D", descriptor = "I")
	private int anInt505 = 9;

	@OriginalMember(owner = "client!TJCUOFPI", name = "E", descriptor = "Z")
	private boolean aBoolean163 = false;

	@OriginalMember(owner = "client!TJCUOFPI", name = "F", descriptor = "I")
	private int anInt506 = -16070;

	@OriginalMember(owner = "client!TJCUOFPI", name = "G", descriptor = "[[B")
	private byte[][] aByteArrayArray2 = new byte[256][];

	@OriginalMember(owner = "client!TJCUOFPI", name = "H", descriptor = "[I")
	private int[] anIntArray142 = new int[256];

	@OriginalMember(owner = "client!TJCUOFPI", name = "I", descriptor = "[I")
	private int[] anIntArray143 = new int[256];

	@OriginalMember(owner = "client!TJCUOFPI", name = "J", descriptor = "[I")
	private int[] anIntArray144 = new int[256];

	@OriginalMember(owner = "client!TJCUOFPI", name = "K", descriptor = "[I")
	private int[] anIntArray145 = new int[256];

	@OriginalMember(owner = "client!TJCUOFPI", name = "L", descriptor = "[I")
	private int[] anIntArray146 = new int[256];

	@OriginalMember(owner = "client!TJCUOFPI", name = "N", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!TJCUOFPI", name = "O", descriptor = "Z")
	private boolean aBoolean164 = false;

	@OriginalMember(owner = "client!TJCUOFPI", name = "M", descriptor = "I")
	public int anInt507;

	@OriginalMember(owner = "client!TJCUOFPI", name = "<init>", descriptor = "(Lclient!RSPRYUFS;ZBLjava/lang/String;)V")
	public Class6_Sub2_Sub2_Sub2(@OriginalArg(0) Class37 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) String arg3) {
		try {
			@Pc(66) Class6_Sub2_Sub3 local66 = new Class6_Sub2_Sub3(-587, arg0.method358(arg3 + ".dat", null));
			@Pc(75) Class6_Sub2_Sub3 local75 = new Class6_Sub2_Sub3(-587, arg0.method358("index.dat", null));
			local75.anInt404 = local66.method264() + 4;
			@Pc(86) int local86 = local75.method262();
			@Pc(91) boolean local91 = false;
			if (local86 > 0) {
				local75.anInt404 += (local86 - 1) * 3;
			}
			for (@Pc(120) int local120 = 0; local120 < 256; local120++) {
				this.anIntArray144[local120] = local75.method262();
				this.anIntArray145[local120] = local75.method262();
				@Pc(144) int local144 = this.anIntArray142[local120] = local75.method264();
				@Pc(152) int local152 = this.anIntArray143[local120] = local75.method264();
				@Pc(155) int local155 = local75.method262();
				@Pc(159) int local159 = local144 * local152;
				this.aByteArrayArray2[local120] = new byte[local159];
				@Pc(169) int local169;
				@Pc(194) int local194;
				if (local155 == 0) {
					for (local169 = 0; local169 < local159; local169++) {
						this.aByteArrayArray2[local120][local169] = local66.method263();
					}
				} else if (local155 == 1) {
					for (local169 = 0; local169 < local144; local169++) {
						for (local194 = 0; local194 < local152; local194++) {
							this.aByteArrayArray2[local120][local169 + local194 * local144] = local66.method263();
						}
					}
				}
				if (local152 > this.anInt507 && local120 < 128) {
					this.anInt507 = local152;
				}
				this.anIntArray144[local120] = 1;
				this.anIntArray146[local120] = local144 + 2;
				local169 = 0;
				for (local194 = local152 / 7; local194 < local152; local194++) {
					local169 += this.aByteArrayArray2[local120][local194 * local144];
				}
				@Pc(271) int local271;
				if (local169 <= local152 / 7) {
					local271 = this.anIntArray146[local120]--;
					this.anIntArray144[local120] = 0;
				}
				local169 = 0;
				for (@Pc(285) int local285 = local152 / 7; local285 < local152; local285++) {
					local169 += this.aByteArrayArray2[local120][local144 + local285 * local144 - 1];
				}
				if (local169 <= local152 / 7) {
					local271 = this.anIntArray146[local120]--;
				}
			}
			if (arg1) {
				this.anIntArray146[32] = this.anIntArray146[73];
			} else {
				this.anIntArray146[32] = this.anIntArray146[105];
			}
		} catch (@Pc(344) RuntimeException local344) {
			signlink.reporterror("29275, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local344.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public void method379(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		try {
			this.method384(arg2, arg0, 507 - this.method383((byte) 5, arg0), arg1, this.aByte26);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("32479, " + arg0 + ", " + arg1 + ", " + -972 + ", " + 507 + ", " + arg2 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public void method380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		try {
			this.method384(arg0, arg2, arg3 - this.method383((byte) 5, arg2) / 2, arg1, this.aByte26);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("48446, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(IIILjava/lang/String;ZI)V")
	public void method381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg2 == 0) {
				this.method388(arg1, arg4, arg0, arg5 - this.method382(arg3) / 2, arg3);
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("3057, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method382(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(16) int local16 = 0;
			for (@Pc(18) int local18 = 0; local18 < arg0.length(); local18++) {
				if (arg0.charAt(local18) == '@' && local18 + 4 < arg0.length() && arg0.charAt(local18 + 4) == '@') {
					local18 += 4;
				} else {
					local16 += this.anIntArray146[arg0.charAt(local18)];
				}
			}
			return local16;
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("42363, " + 8 + ", " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method383(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg1 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			@Pc(12) boolean local12 = false;
			for (@Pc(23) int local23 = 0; local23 < arg1.length(); local23++) {
				local7 += this.anIntArray146[arg1.charAt(local23)];
			}
			return local7;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("5051, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(ILjava/lang/String;IIB)V")
	public void method384(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		try {
			if (arg4 == 48 && arg1 != null) {
				@Pc(11) int local11 = arg3 - this.anInt507;
				for (@Pc(13) int local13 = 0; local13 < arg1.length(); local13++) {
					@Pc(19) char local19 = arg1.charAt(local13);
					if (local19 != ' ') {
						this.method391(this.aByteArrayArray2[local19], arg2 + this.anIntArray144[local19], local11 + this.anIntArray145[local19], this.anIntArray142[local19], this.anIntArray143[local19], arg0);
					}
					arg2 += this.anIntArray146[local19];
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("31843, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public void method385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 != null) {
				arg0 -= this.method383((byte) 5, arg2) / 2;
				@Pc(16) int local16 = arg1 - this.anInt507;
				for (@Pc(25) int local25 = 0; local25 < arg2.length(); local25++) {
					@Pc(31) char local31 = arg2.charAt(local25);
					if (local31 != ' ') {
						this.method391(this.aByteArrayArray2[local31], arg0 + this.anIntArray144[local31], local16 + this.anIntArray145[local31] + (int) (Math.sin((double) local25 / 2.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray142[local31], this.anIntArray143[local31], arg4);
					}
					arg0 += this.anIntArray146[local31];
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("59713, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 9 + ", " + arg4 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(ILjava/lang/String;IZII)V")
	public void method386(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 != null) {
				arg2 -= this.method383((byte) 5, arg1) / 2;
				@Pc(27) int local27 = arg0 - this.anInt507;
				for (@Pc(29) int local29 = 0; local29 < arg1.length(); local29++) {
					@Pc(35) char local35 = arg1.charAt(local29);
					if (local35 != ' ') {
						this.method391(this.aByteArrayArray2[local35], arg2 + this.anIntArray144[local35] + (int) (Math.sin((double) local29 / 5.0D + (double) arg3 / 5.0D) * 5.0D), local27 + this.anIntArray145[local35] + (int) (Math.sin((double) local29 / 3.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray142[local35], this.anIntArray143[local35], arg4);
					}
					arg2 += this.anIntArray146[local35];
				}
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("62741, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(BIIILjava/lang/String;II)V")
	public void method387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg5 / 8.0D;
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg4 -= this.method383((byte) 5, arg3) / 2;
				@Pc(35) int local35 = arg0 - this.anInt507;
				for (@Pc(37) int local37 = 0; local37 < arg3.length(); local37++) {
					@Pc(43) char local43 = arg3.charAt(local37);
					if (local43 != ' ') {
						this.method391(this.aByteArrayArray2[local43], arg4 + this.anIntArray144[local43], local35 + this.anIntArray145[local43] + (int) (Math.sin((double) local37 / 1.5D + (double) arg1) * local9), this.anIntArray142[local43], this.anIntArray143[local43], arg2);
					}
					arg4 += this.anIntArray146[local43];
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("68053, " + 14 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(IZBIILjava/lang/String;)V")
	public void method388(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			this.aBoolean164 = false;
			@Pc(6) int local6 = arg3;
			if (arg4 != null) {
				@Pc(18) int local18 = arg2 - this.anInt507;
				for (@Pc(20) int local20 = 0; local20 < arg4.length(); local20++) {
					if (arg4.charAt(local20) == '@' && local20 + 4 < arg4.length() && arg4.charAt(local20 + 4) == '@') {
						@Pc(52) int local52 = this.method390(arg4.substring(local20 + 1, local20 + 4));
						if (local52 != -1) {
							arg0 = local52;
						}
						local20 += 4;
					} else {
						@Pc(64) char local64 = arg4.charAt(local20);
						if (local64 != ' ') {
							if (arg1) {
								this.method391(this.aByteArrayArray2[local64], arg3 + this.anIntArray144[local64] + 1, local18 + this.anIntArray145[local64] + 1, this.anIntArray142[local64], this.anIntArray143[local64], 0);
							}
							this.method391(this.aByteArrayArray2[local64], arg3 + this.anIntArray144[local64], local18 + this.anIntArray145[local64], this.anIntArray142[local64], this.anIntArray143[local64], arg0);
						}
						arg3 += this.anIntArray146[local64];
					}
				}
				if (this.aBoolean164) {
					Class6_Sub2_Sub2.method555(8388608, local18 + (int) ((double) this.anInt507 * 0.7D), local6, arg3 - local6);
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("3174, " + arg0 + ", " + arg1 + ", " + -11 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(ZIILjava/lang/String;III)V")
	public void method389(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 != null) {
				this.aRandom1.setSeed((long) arg3);
				@Pc(27) int local27 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(32) int local32 = 15 - this.anInt507;
				for (@Pc(34) int local34 = 0; local34 < arg2.length(); local34++) {
					if (arg2.charAt(local34) == '@' && local34 + 4 < arg2.length() && arg2.charAt(local34 + 4) == '@') {
						@Pc(66) int local66 = this.method390(arg2.substring(local34 + 1, local34 + 4));
						if (local66 != -1) {
							arg1 = local66;
						}
						local34 += 4;
					} else {
						@Pc(78) char local78 = arg2.charAt(local34);
						if (local78 != ' ') {
							this.method393(this.anIntArray143[local78], 0, local32 + this.anIntArray145[local78] + 1, this.aByteArrayArray2[local78], this.anIntArray142[local78], arg4 + this.anIntArray144[local78] + 1, 192);
							this.method393(this.anIntArray143[local78], arg1, local32 + this.anIntArray145[local78], this.aByteArrayArray2[local78], this.anIntArray142[local78], arg4 + this.anIntArray144[local78], local27);
						}
						arg4 += this.anIntArray146[local78];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg4++;
						}
					}
				}
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("98016, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(Ljava/lang/String;I)I")
	private int method390(@OriginalArg(0) String arg0) {
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
					this.aBoolean164 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean164 = false;
				}
				return -1;
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("73361, " + arg0 + ", " + -400 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "([BIIIII)V")
	private void method391(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class6_Sub2_Sub2.anInt802;
		@Pc(9) int local9 = Class6_Sub2_Sub2.anInt802 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class6_Sub2_Sub2.anInt804) {
			local20 = Class6_Sub2_Sub2.anInt804 - arg2;
			arg4 -= local20;
			arg2 = Class6_Sub2_Sub2.anInt804;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class6_Sub2_Sub2.anInt802;
		}
		if (arg2 + arg4 >= Class6_Sub2_Sub2.anInt805) {
			arg4 -= arg2 + arg4 + 1 - Class6_Sub2_Sub2.anInt805;
		}
		if (arg1 < Class6_Sub2_Sub2.anInt806) {
			local20 = Class6_Sub2_Sub2.anInt806 - arg1;
			arg3 -= local20;
			arg1 = Class6_Sub2_Sub2.anInt806;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class6_Sub2_Sub2.anInt807) {
			local20 = arg1 + arg3 + 1 - Class6_Sub2_Sub2.anInt807;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method392(Class6_Sub2_Sub2.anIntArray201, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method392(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(III[BIIBI)V")
	private void method393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg5 + arg2 * Class6_Sub2_Sub2.anInt802;
			@Pc(9) int local9 = Class6_Sub2_Sub2.anInt802 - arg4;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(20) int local20;
			if (arg2 < Class6_Sub2_Sub2.anInt804) {
				local20 = Class6_Sub2_Sub2.anInt804 - arg2;
				arg0 -= local20;
				arg2 = Class6_Sub2_Sub2.anInt804;
				local13 = local20 * arg4 + 0;
				local5 += local20 * Class6_Sub2_Sub2.anInt802;
			}
			if (arg2 + arg0 >= Class6_Sub2_Sub2.anInt805) {
				arg0 -= arg2 + arg0 + 1 - Class6_Sub2_Sub2.anInt805;
			}
			if (arg5 < Class6_Sub2_Sub2.anInt806) {
				local20 = Class6_Sub2_Sub2.anInt806 - arg5;
				arg4 -= local20;
				arg5 = Class6_Sub2_Sub2.anInt806;
				local13 += local20;
				local5 += local20;
				local11 = local20 + 0;
				local9 += local20;
			}
			if (arg5 + arg4 >= Class6_Sub2_Sub2.anInt807) {
				local20 = arg5 + arg4 + 1 - Class6_Sub2_Sub2.anInt807;
				arg4 -= local20;
				local11 += local20;
				local9 += local20;
			}
			if (arg4 > 0 && arg0 > 0) {
				this.method394(arg0, arg6, local11, arg4, arg1, Class6_Sub2_Sub2.anIntArray201, local5, local13, local9, arg3);
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("637, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -56 + ", " + arg6 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(IIIII[IIIIZ[B)V")
	private void method394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) byte[] arg9) {
		try {
			@Pc(19) int local19 = ((arg4 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg4 & 0xFF00) * arg1 & 0xFF0000) >> 8;
			@Pc(33) int local33 = 256 - arg1;
			for (@Pc(36) int local36 = -arg0; local36 < 0; local36++) {
				for (@Pc(41) int local41 = -arg3; local41 < 0; local41++) {
					if (arg9[arg7++] == 0) {
						arg6++;
					} else {
						@Pc(52) int local52 = arg5[arg6];
						arg5[arg6++] = (((local52 & 0xFF00FF) * local33 & 0xFF00FF00) + ((local52 & 0xFF00) * local33 & 0xFF0000) >> 8) + local19;
					}
				}
				arg6 += arg8;
				arg7 += arg2;
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("47091, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + true + ", " + arg9 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}
}
