import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YXVQXWYR")
public final class Class1_Sub1_Sub1_Sub4 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!YXVQXWYR", name = "x", descriptor = "Z")
	private boolean aBoolean189 = false;

	@OriginalMember(owner = "client!YXVQXWYR", name = "y", descriptor = "I")
	private int anInt738 = 445;

	@OriginalMember(owner = "client!YXVQXWYR", name = "z", descriptor = "I")
	private int anInt739 = -471;

	@OriginalMember(owner = "client!YXVQXWYR", name = "A", descriptor = "I")
	private int anInt740 = -471;

	@OriginalMember(owner = "client!YXVQXWYR", name = "B", descriptor = "Z")
	private boolean aBoolean190 = false;

	@OriginalMember(owner = "client!YXVQXWYR", name = "C", descriptor = "I")
	private int anInt741 = 3;

	@OriginalMember(owner = "client!YXVQXWYR", name = "D", descriptor = "Z")
	private boolean aBoolean191 = false;

	@OriginalMember(owner = "client!YXVQXWYR", name = "E", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[256][];

	@OriginalMember(owner = "client!YXVQXWYR", name = "F", descriptor = "[I")
	private int[] anIntArray156 = new int[256];

	@OriginalMember(owner = "client!YXVQXWYR", name = "G", descriptor = "[I")
	private int[] anIntArray157 = new int[256];

	@OriginalMember(owner = "client!YXVQXWYR", name = "H", descriptor = "[I")
	private int[] anIntArray158 = new int[256];

	@OriginalMember(owner = "client!YXVQXWYR", name = "I", descriptor = "[I")
	private int[] anIntArray159 = new int[256];

	@OriginalMember(owner = "client!YXVQXWYR", name = "J", descriptor = "[I")
	private int[] anIntArray160 = new int[256];

	@OriginalMember(owner = "client!YXVQXWYR", name = "L", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!YXVQXWYR", name = "M", descriptor = "Z")
	private boolean aBoolean192 = false;

	@OriginalMember(owner = "client!YXVQXWYR", name = "K", descriptor = "I")
	public int anInt742;

	@OriginalMember(owner = "client!YXVQXWYR", name = "<init>", descriptor = "(ZLjava/lang/String;ILclient!XTGLDHGX;)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class44 arg3) {
		try {
			@Pc(72) Class1_Sub1_Sub3 local72 = new Class1_Sub1_Sub3(arg3.method484(arg1 + ".dat", null), 891);
			@Pc(81) Class1_Sub1_Sub3 local81 = new Class1_Sub1_Sub3(arg3.method484("index.dat", null), 891);
			local81.anInt468 = local72.method270() + 4;
			@Pc(102) int local102 = local81.method268();
			if (local102 > 0) {
				local81.anInt468 += (local102 - 1) * 3;
			}
			for (@Pc(116) int local116 = 0; local116 < 256; local116++) {
				this.anIntArray158[local116] = local81.method268();
				this.anIntArray159[local116] = local81.method268();
				@Pc(140) int local140 = this.anIntArray156[local116] = local81.method270();
				@Pc(148) int local148 = this.anIntArray157[local116] = local81.method270();
				@Pc(151) int local151 = local81.method268();
				@Pc(155) int local155 = local140 * local148;
				this.aByteArrayArray3[local116] = new byte[local155];
				@Pc(165) int local165;
				@Pc(190) int local190;
				if (local151 == 0) {
					for (local165 = 0; local165 < local155; local165++) {
						this.aByteArrayArray3[local116][local165] = local72.method269();
					}
				} else if (local151 == 1) {
					for (local165 = 0; local165 < local140; local165++) {
						for (local190 = 0; local190 < local148; local190++) {
							this.aByteArrayArray3[local116][local165 + local190 * local140] = local72.method269();
						}
					}
				}
				if (local148 > this.anInt742 && local116 < 128) {
					this.anInt742 = local148;
				}
				this.anIntArray158[local116] = 1;
				this.anIntArray160[local116] = local140 + 2;
				local165 = 0;
				for (local190 = local148 / 7; local190 < local148; local190++) {
					local165 += this.aByteArrayArray3[local116][local190 * local140];
				}
				@Pc(267) int local267;
				if (local165 <= local148 / 7) {
					local267 = this.anIntArray160[local116]--;
					this.anIntArray158[local116] = 0;
				}
				local165 = 0;
				for (@Pc(281) int local281 = local148 / 7; local281 < local148; local281++) {
					local165 += this.aByteArrayArray3[local116][local140 + local281 * local140 - 1];
				}
				if (local165 <= local148 / 7) {
					local267 = this.anIntArray160[local116]--;
				}
			}
			if (arg0) {
				this.anIntArray160[32] = this.anIntArray160[73];
			} else {
				this.anIntArray160[32] = this.anIntArray160[105];
			}
		} catch (@Pc(348) RuntimeException local348) {
			signlink.reporterror("60040, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local348.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "(Ljava/lang/String;IIBI)V")
	public void method499(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		try {
			this.method504(arg1, arg0, arg2, 822, 507 - this.method503(arg0));
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("2575, " + arg0 + ", " + 507 + ", " + arg1 + ", " + -80 + ", " + arg2 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public void method500(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			this.method504(arg0, arg1, arg2, 822, arg3 - this.method503(arg1) / 2);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("47504, " + arg0 + ", " + arg1 + ", " + 23693 + ", " + arg2 + ", " + arg3 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "(IIILjava/lang/String;IZ)V")
	public void method501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		try {
			@Pc(3) int local3 = 74 / arg2;
			this.method508(arg5, arg1 - this.method502(this.anInt738, arg3) / 2, arg0, arg3, arg4);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("93658, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method502(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(5) int local5 = 75 / arg0;
			if (arg1 == null) {
				return 0;
			}
			@Pc(11) int local11 = 0;
			for (@Pc(13) int local13 = 0; local13 < arg1.length(); local13++) {
				if (arg1.charAt(local13) == '@' && local13 + 4 < arg1.length() && arg1.charAt(local13 + 4) == '@') {
					local13 += 4;
				} else {
					local11 += this.anIntArray160[arg1.charAt(local13)];
				}
			}
			return local11;
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("11394, " + arg0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method503(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(16) int local16 = 0;
			for (@Pc(18) int local18 = 0; local18 < arg0.length(); local18++) {
				local16 += this.anIntArray160[arg0.charAt(local18)];
			}
			return local16;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("57519, " + arg0 + ", " + true + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YXVQXWYR", name = "b", descriptor = "(ILjava/lang/String;III)V")
	public void method504(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg1 != null) {
				@Pc(7) int local7 = arg2 - this.anInt742;
				for (@Pc(9) int local9 = 0; local9 < arg1.length(); local9++) {
					@Pc(15) char local15 = arg1.charAt(local9);
					if (local15 != ' ') {
						this.method511(this.aByteArrayArray3[local15], arg4 + this.anIntArray158[local15], local7 + this.anIntArray159[local15], this.anIntArray156[local15], this.anIntArray157[local15], arg0);
					}
					arg4 += this.anIntArray160[local15];
				}
				@Pc(61) boolean local61 = false;
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("25570, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "(IZLjava/lang/String;III)V")
	public void method505(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 != null) {
				arg2 -= this.method503(arg1) / 2;
				@Pc(26) int local26 = arg4 - this.anInt742;
				for (@Pc(28) int local28 = 0; local28 < arg1.length(); local28++) {
					@Pc(34) char local34 = arg1.charAt(local28);
					if (local34 != ' ') {
						this.method511(this.aByteArrayArray3[local34], arg2 + this.anIntArray158[local34], local26 + this.anIntArray159[local34] + (int) (Math.sin((double) local28 / 2.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray156[local34], this.anIntArray157[local34], arg0);
					}
					arg2 += this.anIntArray160[local34];
				}
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("73127, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "(ILjava/lang/String;IIBI)V")
	public void method506(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg1 != null) {
				arg0 -= this.method503(arg1) / 2;
				@Pc(16) int local16 = arg3 - this.anInt742;
				if (arg4 == 5) {
					for (@Pc(22) int local22 = 0; local22 < arg1.length(); local22++) {
						@Pc(28) char local28 = arg1.charAt(local22);
						if (local28 != ' ') {
							this.method511(this.aByteArrayArray3[local28], arg0 + this.anIntArray158[local28] + (int) (Math.sin((double) local22 / 5.0D + (double) arg2 / 5.0D) * 5.0D), local16 + this.anIntArray159[local28] + (int) (Math.sin((double) local22 / 3.0D + (double) arg2 / 5.0D) * 5.0D), this.anIntArray156[local28], this.anIntArray157[local28], arg5);
						}
						arg0 += this.anIntArray160[local28];
					}
				}
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("43081, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "(ILjava/lang/String;ZIIII)V")
	public void method507(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 != null) {
				@Pc(20) double local20 = 7.0D - (double) arg0 / 8.0D;
				if (local20 < 0.0D) {
					local20 = 0.0D;
				}
				arg4 -= this.method503(arg1) / 2;
				@Pc(40) int local40 = arg3 - this.anInt742;
				for (@Pc(42) int local42 = 0; local42 < arg1.length(); local42++) {
					@Pc(48) char local48 = arg1.charAt(local42);
					if (local48 != ' ') {
						this.method511(this.aByteArrayArray3[local48], arg4 + this.anIntArray158[local48], local40 + this.anIntArray159[local48] + (int) (Math.sin((double) local42 / 1.5D + (double) arg2) * local20), this.anIntArray156[local48], this.anIntArray157[local48], arg5);
					}
					arg4 += this.anIntArray160[local48];
				}
			}
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("85722, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "(ZZIILjava/lang/String;I)V")
	public void method508(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			this.aBoolean192 = false;
			@Pc(6) int local6 = arg1;
			if (arg3 != null) {
				@Pc(14) int local14 = arg4 - this.anInt742;
				for (@Pc(16) int local16 = 0; local16 < arg3.length(); local16++) {
					if (arg3.charAt(local16) == '@' && local16 + 4 < arg3.length() && arg3.charAt(local16 + 4) == '@') {
						@Pc(49) int local49 = this.method510(arg3.substring(local16 + 1, local16 + 4), this.anInt739);
						if (local49 != -1) {
							arg2 = local49;
						}
						local16 += 4;
					} else {
						@Pc(61) char local61 = arg3.charAt(local16);
						if (local61 != ' ') {
							if (arg0) {
								this.method511(this.aByteArrayArray3[local61], arg1 + this.anIntArray158[local61] + 1, local14 + this.anIntArray159[local61] + 1, this.anIntArray156[local61], this.anIntArray157[local61], 0);
							}
							this.method511(this.aByteArrayArray3[local61], arg1 + this.anIntArray158[local61], local14 + this.anIntArray159[local61], this.anIntArray156[local61], this.anIntArray157[local61], arg2);
						}
						arg1 += this.anIntArray160[local61];
					}
				}
				if (this.aBoolean192) {
					Class1_Sub1_Sub1.method495(local14 + (int) ((double) this.anInt742 * 0.7D), 8388608, arg1 - local6, local6);
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("94541, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "(ZIILjava/lang/String;III)V")
	public void method509(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2 != null) {
				this.aRandom1.setSeed((long) arg3);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(22) int local22 = 15 - this.anInt742;
				@Pc(26) boolean local26 = false;
				for (@Pc(28) int local28 = 0; local28 < arg2.length(); local28++) {
					if (arg2.charAt(local28) == '@' && local28 + 4 < arg2.length() && arg2.charAt(local28 + 4) == '@') {
						@Pc(61) int local61 = this.method510(arg2.substring(local28 + 1, local28 + 4), this.anInt739);
						if (local61 != -1) {
							arg1 = local61;
						}
						local28 += 4;
					} else {
						@Pc(73) char local73 = arg2.charAt(local28);
						if (local73 != ' ') {
							this.method513(192, arg0 + this.anIntArray158[local73] + 1, this.aByteArrayArray3[local73], this.anIntArray156[local73], local22 + this.anIntArray159[local73] + 1, this.anIntArray157[local73], 0);
							this.method513(local17, arg0 + this.anIntArray158[local73], this.aByteArrayArray3[local73], this.anIntArray156[local73], local22 + this.anIntArray159[local73], this.anIntArray157[local73], arg1);
						}
						arg0 += this.anIntArray160[local73];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg0++;
						}
					}
				}
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("38011, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "(Ljava/lang/String;I)I")
	private int method510(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 >= 0) {
				this.aBoolean189 = !this.aBoolean189;
			}
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
					this.aBoolean192 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean192 = false;
				}
				return -1;
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("14212, " + arg0 + ", " + arg1 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "([BIIIII)V")
	private void method511(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub1.anInt729;
		@Pc(9) int local9 = Class1_Sub1_Sub1.anInt729 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub1.anInt731) {
			local20 = Class1_Sub1_Sub1.anInt731 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub1.anInt731;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub1.anInt729;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub1.anInt732) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub1.anInt732;
		}
		if (arg1 < Class1_Sub1_Sub1.anInt733) {
			local20 = Class1_Sub1_Sub1.anInt733 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub1.anInt733;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub1.anInt734) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub1.anInt734;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method512(Class1_Sub1_Sub1.anIntArray155, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method512(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "(II[BIIIZI)V")
	private void method513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg1 + arg4 * Class1_Sub1_Sub1.anInt729;
			@Pc(9) int local9 = Class1_Sub1_Sub1.anInt729 - arg3;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(20) int local20;
			if (arg4 < Class1_Sub1_Sub1.anInt731) {
				local20 = Class1_Sub1_Sub1.anInt731 - arg4;
				arg5 -= local20;
				arg4 = Class1_Sub1_Sub1.anInt731;
				local13 = local20 * arg3 + 0;
				local5 += local20 * Class1_Sub1_Sub1.anInt729;
			}
			if (arg4 + arg5 >= Class1_Sub1_Sub1.anInt732) {
				arg5 -= arg4 + arg5 + 1 - Class1_Sub1_Sub1.anInt732;
			}
			if (arg1 < Class1_Sub1_Sub1.anInt733) {
				local20 = Class1_Sub1_Sub1.anInt733 - arg1;
				arg3 -= local20;
				arg1 = Class1_Sub1_Sub1.anInt733;
				local13 += local20;
				local5 += local20;
				local11 = local20 + 0;
				local9 += local20;
			}
			if (arg1 + arg3 >= Class1_Sub1_Sub1.anInt734) {
				local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub1.anInt734;
				arg3 -= local20;
				local11 += local20;
				local9 += local20;
			}
			if (arg3 > 0 && arg5 > 0) {
				this.method514(arg2, arg5, local5, Class1_Sub1_Sub1.anIntArray155, 520, local13, arg3, local11, local9, arg6, arg0);
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("67426, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + false + ", " + arg6 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "([BII[IIIIIIII)V")
	private void method514(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(23) int local23 = ((arg9 & 0xFF00FF) * arg10 & 0xFF00FF00) + ((arg9 & 0xFF00) * arg10 & 0xFF0000) >> 8;
			@Pc(27) int local27 = 256 - arg10;
			for (@Pc(30) int local30 = -arg1; local30 < 0; local30++) {
				for (@Pc(35) int local35 = -arg6; local35 < 0; local35++) {
					if (arg0[arg5++] == 0) {
						arg2++;
					} else {
						@Pc(46) int local46 = arg3[arg2];
						arg3[arg2++] = (((local46 & 0xFF00FF) * local27 & 0xFF00FF00) + ((local46 & 0xFF00) * local27 & 0xFF0000) >> 8) + local23;
					}
				}
				arg2 += arg8;
				arg5 += arg7;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("45065, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}
}
