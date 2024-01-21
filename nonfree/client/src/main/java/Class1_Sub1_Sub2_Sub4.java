import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kb")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
	private int anInt699;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
	private int anInt698 = 784;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "Z")
	private boolean aBoolean186 = false;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "B")
	private byte aByte43 = 5;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
	private int anInt700 = 2;

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "Z")
	private boolean aBoolean187 = false;

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[256][];

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "[I")
	private int[] anIntArray213 = new int[256];

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "[I")
	private int[] anIntArray214 = new int[256];

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "[I")
	private int[] anIntArray215 = new int[256];

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "[I")
	private int[] anIntArray216 = new int[256];

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "[I")
	private int[] anIntArray217 = new int[256];

	@OriginalMember(owner = "client!kb", name = "M", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!kb", name = "N", descriptor = "Z")
	private boolean aBoolean188 = false;

	@OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
	public int anInt701;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(ILjava/lang/String;ZLclient!xb;)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class47 arg3) {
		try {
			@Pc(66) Class1_Sub1_Sub3 local66 = new Class1_Sub1_Sub3(arg3.method662(arg1 + ".dat", null), 15787);
			@Pc(75) Class1_Sub1_Sub3 local75 = new Class1_Sub1_Sub3(arg3.method662("index.dat", null), 15787);
			local75.anInt734 = local66.method478() + 4;
			@Pc(97) int local97 = local75.method476();
			if (local97 > 0) {
				local75.anInt734 += (local97 - 1) * 3;
			}
			for (@Pc(111) int local111 = 0; local111 < 256; local111++) {
				this.anIntArray215[local111] = local75.method476();
				this.anIntArray216[local111] = local75.method476();
				@Pc(141) int local141 = this.anIntArray213[local111] = local75.method478();
				@Pc(149) int local149 = this.anIntArray214[local111] = local75.method478();
				@Pc(152) int local152 = local75.method476();
				@Pc(156) int local156 = local141 * local149;
				this.aByteArrayArray3[local111] = new byte[local156];
				@Pc(166) int local166;
				@Pc(191) int local191;
				if (local152 == 0) {
					for (local166 = 0; local166 < local156; local166++) {
						this.aByteArrayArray3[local111][local166] = local66.method477();
					}
				} else if (local152 == 1) {
					for (local166 = 0; local166 < local141; local166++) {
						for (local191 = 0; local191 < local149; local191++) {
							this.aByteArrayArray3[local111][local166 + local191 * local141] = local66.method477();
						}
					}
				}
				if (local149 > this.anInt701 && local111 < 128) {
					this.anInt701 = local149;
				}
				this.anIntArray215[local111] = 1;
				this.anIntArray217[local111] = local141 + 2;
				local166 = 0;
				for (local191 = local149 / 7; local191 < local149; local191++) {
					local166 += this.aByteArrayArray3[local111][local191 * local141];
				}
				@Pc(268) int local268;
				if (local166 <= local149 / 7) {
					local268 = this.anIntArray217[local111]--;
					this.anIntArray215[local111] = 0;
				}
				local166 = 0;
				for (@Pc(282) int local282 = local149 / 7; local282 < local149; local282++) {
					local166 += this.aByteArrayArray3[local111][local141 + local282 * local141 - 1];
				}
				if (local166 <= local149 / 7) {
					local268 = this.anIntArray217[local111]--;
				}
			}
			if (arg2) {
				this.anIntArray217[32] = this.anIntArray217[73];
			} else {
				this.anIntArray217[32] = this.anIntArray217[105];
			}
		} catch (@Pc(341) RuntimeException local341) {
			signlink.reporterror("36057, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local341.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public void method443(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			this.method447(arg2, arg1, arg0 - this.method446(arg1) / 2, arg3);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("89843, " + arg0 + ", " + arg1 + ", " + -31546 + ", " + arg2 + ", " + arg3 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZIBILjava/lang/String;I)V")
	public void method444(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			this.method451(arg1, arg4, arg0, arg2 - this.method445(arg3) / 2, arg3);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("52266, " + arg0 + ", " + arg1 + ", " + -85 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method445(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(14) int local14 = 0; local14 < arg0.length(); local14++) {
				if (arg0.charAt(local14) == '@' && local14 + 4 < arg0.length() && arg0.charAt(local14 + 4) == '@') {
					local14 += 4;
				} else {
					local7 += this.anIntArray217[arg0.charAt(local14)];
				}
			}
			return local7;
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("63390, " + arg0 + ", " + true + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method446(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(19) int local19 = 0;
			for (@Pc(21) int local21 = 0; local21 < arg0.length(); local21++) {
				local19 += this.anIntArray217[arg0.charAt(local21)];
			}
			return local19;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("70316, " + arg0 + ", " + -725 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BILjava/lang/String;II)V")
	public void method447(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 != null) {
				@Pc(7) int local7 = arg3 - this.anInt701;
				for (@Pc(15) int local15 = 0; local15 < arg1.length(); local15++) {
					@Pc(21) char local21 = arg1.charAt(local15);
					if (local21 != ' ') {
						this.method454(this.aByteArrayArray3[local21], arg2 + this.anIntArray215[local21], local7 + this.anIntArray216[local21], this.anIntArray213[local21], this.anIntArray214[local21], arg0);
					}
					arg2 += this.anIntArray217[local21];
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("88673, " + -104 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIBIILjava/lang/String;)V")
	public void method448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			if (arg4 != null) {
				arg0 -= this.method446(arg4) / 2;
				@Pc(18) int local18 = arg3 - this.anInt701;
				@Pc(24) int local24;
				if (this.aByte43 != 5) {
					for (local24 = 1; local24 > 0; local24++) {
					}
				}
				for (local24 = 0; local24 < arg4.length(); local24++) {
					@Pc(37) char local37 = arg4.charAt(local24);
					if (local37 != ' ') {
						this.method454(this.aByteArrayArray3[local37], arg0 + this.anIntArray215[local37], local18 + this.anIntArray216[local37] + (int) (Math.sin((double) local24 / 2.0D + (double) arg1 / 5.0D) * 5.0D), this.anIntArray213[local37], this.anIntArray214[local37], arg2);
					}
					arg0 += this.anIntArray217[local37];
				}
			}
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("90881, " + arg0 + ", " + arg1 + ", " + 5 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;BIII)V")
	public void method449(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(6) boolean local6 = false;
			if (arg1 != null) {
				arg3 -= this.method446(arg1) / 2;
				@Pc(26) int local26 = arg4 - this.anInt701;
				for (@Pc(28) int local28 = 0; local28 < arg1.length(); local28++) {
					@Pc(34) char local34 = arg1.charAt(local28);
					if (local34 != ' ') {
						this.method454(this.aByteArrayArray3[local34], arg3 + this.anIntArray215[local34] + (int) (Math.sin((double) local28 / 5.0D + (double) arg5 / 5.0D) * 5.0D), local26 + this.anIntArray216[local34] + (int) (Math.sin((double) local28 / 3.0D + (double) arg5 / 5.0D) * 5.0D), this.anIntArray213[local34], this.anIntArray214[local34], arg0);
					}
					arg3 += this.anIntArray217[local34];
				}
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("17099, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	public void method450(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg0 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg6 / 8.0D;
				if (arg5 != 8) {
					this.aBoolean186 = !this.aBoolean186;
				}
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg1 -= this.method446(arg0) / 2;
				@Pc(40) int local40 = arg3 - this.anInt701;
				for (@Pc(42) int local42 = 0; local42 < arg0.length(); local42++) {
					@Pc(48) char local48 = arg0.charAt(local42);
					if (local48 != ' ') {
						this.method454(this.aByteArrayArray3[local48], arg1 + this.anIntArray215[local48], local40 + this.anIntArray216[local48] + (int) (Math.sin((double) local42 / 1.5D + (double) arg2) * local9), this.anIntArray213[local48], this.anIntArray214[local48], arg4);
					}
					arg1 += this.anIntArray217[local48];
				}
			}
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("70626, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIZILjava/lang/String;)V")
	public void method451(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			this.aBoolean188 = false;
			@Pc(6) int local6 = arg3;
			if (arg4 != null) {
				@Pc(14) int local14 = arg1 - this.anInt701;
				for (@Pc(16) int local16 = 0; local16 < arg4.length(); local16++) {
					if (arg4.charAt(local16) == '@' && local16 + 4 < arg4.length() && arg4.charAt(local16 + 4) == '@') {
						@Pc(48) int local48 = this.method453(arg4.substring(local16 + 1, local16 + 4));
						if (local48 != -1) {
							arg0 = local48;
						}
						local16 += 4;
					} else {
						@Pc(60) char local60 = arg4.charAt(local16);
						if (local60 != ' ') {
							if (arg2) {
								this.method454(this.aByteArrayArray3[local60], arg3 + this.anIntArray215[local60] + 1, local14 + this.anIntArray216[local60] + 1, this.anIntArray213[local60], this.anIntArray214[local60], 0);
							}
							this.method454(this.aByteArrayArray3[local60], arg3 + this.anIntArray215[local60], local14 + this.anIntArray216[local60], this.anIntArray213[local60], this.anIntArray214[local60], arg0);
						}
						arg3 += this.anIntArray217[local60];
					}
				}
				if (2 >= this.anInt700 && 2 <= this.anInt700 && this.aBoolean188) {
					Class1_Sub1_Sub2.method439(arg3 - local6, local6, 8388608, local14 + (int) ((double) this.anInt701 * 0.7D));
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("34312, " + arg0 + ", " + 2 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;ZIIIII)V")
	public void method452(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg0 != null) {
				this.aRandom1.setSeed((long) arg3);
				@Pc(27) int local27 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(32) int local32 = 15 - this.anInt701;
				for (@Pc(34) int local34 = 0; local34 < arg0.length(); local34++) {
					if (arg0.charAt(local34) == '@' && local34 + 4 < arg0.length() && arg0.charAt(local34 + 4) == '@') {
						@Pc(66) int local66 = this.method453(arg0.substring(local34 + 1, local34 + 4));
						if (local66 != -1) {
							arg1 = local66;
						}
						local34 += 4;
					} else {
						@Pc(78) char local78 = arg0.charAt(local34);
						if (local78 != ' ') {
							this.method456(this.aByteArrayArray3[local78], arg2 + this.anIntArray215[local78] + 1, 0, local32 + this.anIntArray216[local78] + 1, this.anIntArray214[local78], 192, this.anIntArray213[local78]);
							this.method456(this.aByteArrayArray3[local78], arg2 + this.anIntArray215[local78], arg1, local32 + this.anIntArray216[local78], this.anIntArray214[local78], local27, this.anIntArray213[local78]);
						}
						arg2 += this.anIntArray217[local78];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg2++;
						}
					}
				}
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("64640, " + arg0 + ", " + true + ", " + arg1 + ", " + 26617 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(Ljava/lang/String;I)I")
	private int method453(@OriginalArg(0) String arg0) {
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
					this.aBoolean188 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean188 = false;
				}
				return -1;
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("97933, " + arg0 + ", " + 1 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BIIIII)V")
	private void method454(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub2.anInt688;
		@Pc(9) int local9 = Class1_Sub1_Sub2.anInt688 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub2.anInt690) {
			local20 = Class1_Sub1_Sub2.anInt690 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub2.anInt690;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub2.anInt688;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt691) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt691;
		}
		if (arg1 < Class1_Sub1_Sub2.anInt692) {
			local20 = Class1_Sub1_Sub2.anInt692 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub2.anInt692;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub2.anInt693) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub2.anInt693;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method455(Class1_Sub1_Sub2.anIntArray212, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method455(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BIIIIIIZ)V")
	private void method456(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(10) int local10 = arg1 + arg3 * Class1_Sub1_Sub2.anInt688;
			@Pc(14) int local14 = Class1_Sub1_Sub2.anInt688 - arg6;
			@Pc(16) int local16 = 0;
			@Pc(18) int local18 = 0;
			@Pc(25) int local25;
			if (arg3 < Class1_Sub1_Sub2.anInt690) {
				local25 = Class1_Sub1_Sub2.anInt690 - arg3;
				arg4 -= local25;
				arg3 = Class1_Sub1_Sub2.anInt690;
				local18 = local25 * arg6 + 0;
				local10 += local25 * Class1_Sub1_Sub2.anInt688;
			}
			if (arg3 + arg4 >= Class1_Sub1_Sub2.anInt691) {
				arg4 -= arg3 + arg4 + 1 - Class1_Sub1_Sub2.anInt691;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt692) {
				local25 = Class1_Sub1_Sub2.anInt692 - arg1;
				arg6 -= local25;
				arg1 = Class1_Sub1_Sub2.anInt692;
				local18 += local25;
				local10 += local25;
				local16 = local25 + 0;
				local14 += local25;
			}
			if (arg1 + arg6 >= Class1_Sub1_Sub2.anInt693) {
				local25 = arg1 + arg6 + 1 - Class1_Sub1_Sub2.anInt693;
				arg6 -= local25;
				local16 += local25;
				local14 += local25;
			}
			if (arg6 > 0 && arg4 > 0) {
				this.method457(local16, arg6, arg2, arg0, Class1_Sub1_Sub2.anIntArray212, local10, local18, local14, arg5, arg4);
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("96459, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + false + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III[BZ[IIIIII)V")
	private void method457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(28) int local28 = ((arg2 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg8 & 0xFF0000) >> 8;
			@Pc(32) int local32 = 256 - arg8;
			for (@Pc(35) int local35 = -arg9; local35 < 0; local35++) {
				for (@Pc(40) int local40 = -arg1; local40 < 0; local40++) {
					if (arg3[arg6++] == 0) {
						arg5++;
					} else {
						@Pc(51) int local51 = arg4[arg5];
						arg4[arg5++] = (((local51 & 0xFF00FF) * local32 & 0xFF00FF00) + ((local51 & 0xFF00) * local32 & 0xFF0000) >> 8) + local28;
					}
				}
				arg5 += arg7;
				arg6 += arg0;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("17490, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}
}
