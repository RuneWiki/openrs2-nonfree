import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BDJKVJZU")
public final class Class5_Sub1_Sub1_Sub1 extends Class5_Sub1_Sub1 {

	@OriginalMember(owner = "client!BDJKVJZU", name = "x", descriptor = "I")
	private int anInt44 = -166;

	@OriginalMember(owner = "client!BDJKVJZU", name = "y", descriptor = "Z")
	private boolean aBoolean19 = true;

	@OriginalMember(owner = "client!BDJKVJZU", name = "z", descriptor = "B")
	private byte aByte2 = 1;

	@OriginalMember(owner = "client!BDJKVJZU", name = "A", descriptor = "Z")
	private boolean aBoolean20 = true;

	@OriginalMember(owner = "client!BDJKVJZU", name = "B", descriptor = "I")
	private int anInt45 = -274;

	@OriginalMember(owner = "client!BDJKVJZU", name = "C", descriptor = "Z")
	private boolean aBoolean21 = false;

	@OriginalMember(owner = "client!BDJKVJZU", name = "D", descriptor = "I")
	private int anInt46 = -52;

	@OriginalMember(owner = "client!BDJKVJZU", name = "E", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[256][];

	@OriginalMember(owner = "client!BDJKVJZU", name = "F", descriptor = "[I")
	private int[] anIntArray7 = new int[256];

	@OriginalMember(owner = "client!BDJKVJZU", name = "G", descriptor = "[I")
	private int[] anIntArray8 = new int[256];

	@OriginalMember(owner = "client!BDJKVJZU", name = "H", descriptor = "[I")
	private int[] anIntArray9 = new int[256];

	@OriginalMember(owner = "client!BDJKVJZU", name = "I", descriptor = "[I")
	private int[] anIntArray10 = new int[256];

	@OriginalMember(owner = "client!BDJKVJZU", name = "J", descriptor = "[I")
	private int[] anIntArray11 = new int[256];

	@OriginalMember(owner = "client!BDJKVJZU", name = "L", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!BDJKVJZU", name = "M", descriptor = "Z")
	private boolean aBoolean22 = false;

	@OriginalMember(owner = "client!BDJKVJZU", name = "K", descriptor = "I")
	public int anInt47;

	@OriginalMember(owner = "client!BDJKVJZU", name = "<init>", descriptor = "(IZLclient!TXPLZUUI;Ljava/lang/String;)V")
	public Class5_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) String arg3) {
		try {
			@Pc(72) Class5_Sub1_Sub4 local72 = new Class5_Sub1_Sub4(arg2.method464(arg3 + ".dat", null), 0);
			@Pc(88) Class5_Sub1_Sub4 local88 = new Class5_Sub1_Sub4(arg2.method464("index.dat", null), 0);
			local88.anInt429 = local72.method242() + 4;
			@Pc(99) int local99 = local88.method240();
			if (local99 > 0) {
				local88.anInt429 += (local99 - 1) * 3;
			}
			for (@Pc(113) int local113 = 0; local113 < 256; local113++) {
				this.anIntArray9[local113] = local88.method240();
				this.anIntArray10[local113] = local88.method240();
				@Pc(137) int local137 = this.anIntArray7[local113] = local88.method242();
				@Pc(145) int local145 = this.anIntArray8[local113] = local88.method242();
				@Pc(148) int local148 = local88.method240();
				@Pc(152) int local152 = local137 * local145;
				this.aByteArrayArray1[local113] = new byte[local152];
				@Pc(162) int local162;
				@Pc(187) int local187;
				if (local148 == 0) {
					for (local162 = 0; local162 < local152; local162++) {
						this.aByteArrayArray1[local113][local162] = local72.method241();
					}
				} else if (local148 == 1) {
					for (local162 = 0; local162 < local137; local162++) {
						for (local187 = 0; local187 < local145; local187++) {
							this.aByteArrayArray1[local113][local162 + local187 * local137] = local72.method241();
						}
					}
				}
				if (local145 > this.anInt47 && local113 < 128) {
					this.anInt47 = local145;
				}
				this.anIntArray9[local113] = 1;
				this.anIntArray11[local113] = local137 + 2;
				local162 = 0;
				for (local187 = local145 / 7; local187 < local145; local187++) {
					local162 += this.aByteArrayArray1[local113][local187 * local137];
				}
				@Pc(264) int local264;
				if (local162 <= local145 / 7) {
					local264 = this.anIntArray11[local113]--;
					this.anIntArray9[local113] = 0;
				}
				local162 = 0;
				for (@Pc(278) int local278 = local145 / 7; local278 < local145; local278++) {
					local162 += this.aByteArrayArray1[local113][local137 + local278 * local137 - 1];
				}
				if (local162 <= local145 / 7) {
					local264 = this.anIntArray11[local113]--;
				}
			}
			if (arg1) {
				this.anIntArray11[32] = this.anIntArray11[73];
			} else {
				this.anIntArray11[32] = this.anIntArray11[105];
			}
		} catch (@Pc(337) RuntimeException local337) {
			signlink.reporterror("76641, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local337.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDJKVJZU", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public void method39(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.method44(507 - this.method43(arg0), arg0, arg2, arg1);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("11535, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 507 + ", " + -699 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDJKVJZU", name = "a", descriptor = "(IILjava/lang/String;IZ)V")
	public void method40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		try {
			this.method44(arg1 - this.method43(arg2) / 2, arg2, arg3, arg0);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("96435, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDJKVJZU", name = "a", descriptor = "(ILjava/lang/String;ZIII)V")
	public void method41(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.method48(arg3, arg0 - this.method42(arg1) / 2, arg4, arg1, arg2);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("97056, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -72 + ", " + arg4 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDJKVJZU", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method42(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(11) int local11 = 0;
			for (@Pc(13) int local13 = 0; local13 < arg0.length(); local13++) {
				if (arg0.charAt(local13) == '@' && local13 + 4 < arg0.length() && arg0.charAt(local13 + 4) == '@') {
					local13 += 4;
				} else {
					local11 += this.anIntArray11[arg0.charAt(local13)];
				}
			}
			return local11;
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("78987, " + arg0 + ", " + false + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDJKVJZU", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method43(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(19) int local19 = 0; local19 < arg0.length(); local19++) {
				local7 += this.anIntArray11[arg0.charAt(local19)];
			}
			return local7;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("47004, " + 12043 + ", " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDJKVJZU", name = "a", descriptor = "(IBLjava/lang/String;II)V")
	public void method44(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (1 == this.aByte2 && arg1 != null) {
				@Pc(12) int local12 = arg3 - this.anInt47;
				for (@Pc(14) int local14 = 0; local14 < arg1.length(); local14++) {
					@Pc(20) char local20 = arg1.charAt(local14);
					if (local20 != ' ') {
						this.method51(this.aByteArrayArray1[local20], arg0 + this.anIntArray9[local20], local12 + this.anIntArray10[local20], this.anIntArray7[local20], this.anIntArray8[local20], arg2);
					}
					arg0 += this.anIntArray11[local20];
				}
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("96151, " + arg0 + ", " + 1 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDJKVJZU", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public void method45(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 != null) {
				arg4 -= this.method43(arg1) / 2;
				@Pc(20) int local20 = arg3 - this.anInt47;
				for (@Pc(22) int local22 = 0; local22 < arg1.length(); local22++) {
					@Pc(28) char local28 = arg1.charAt(local22);
					if (local28 != ' ') {
						this.method51(this.aByteArrayArray1[local28], arg4 + this.anIntArray9[local28], local20 + this.anIntArray10[local28] + (int) (Math.sin((double) local22 / 2.0D + (double) arg2 / 5.0D) * 5.0D), this.anIntArray7[local28], this.anIntArray8[local28], arg0);
					}
					arg4 += this.anIntArray11[local28];
				}
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("60897, " + 22561 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDJKVJZU", name = "a", descriptor = "(IZIILjava/lang/String;I)V")
	public void method46(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 != null) {
				arg0 -= this.method43(arg3) / 2;
				@Pc(16) int local16 = arg1 - this.anInt47;
				for (@Pc(23) int local23 = 0; local23 < arg3.length(); local23++) {
					@Pc(29) char local29 = arg3.charAt(local23);
					if (local29 != ' ') {
						this.method51(this.aByteArrayArray1[local29], arg0 + this.anIntArray9[local29] + (int) (Math.sin((double) local23 / 5.0D + (double) arg2 / 5.0D) * 5.0D), local16 + this.anIntArray10[local29] + (int) (Math.sin((double) local23 / 3.0D + (double) arg2 / 5.0D) * 5.0D), this.anIntArray7[local29], this.anIntArray8[local29], arg4);
					}
					arg0 += this.anIntArray11[local29];
				}
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("63046, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDJKVJZU", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public void method47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg3 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg5 / 8.0D;
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg4 -= this.method43(arg3) / 2;
				@Pc(32) int local32 = arg2 - this.anInt47;
				for (@Pc(34) int local34 = 0; local34 < arg3.length(); local34++) {
					@Pc(40) char local40 = arg3.charAt(local34);
					if (local40 != ' ') {
						this.method51(this.aByteArrayArray1[local40], arg4 + this.anIntArray9[local40], local32 + this.anIntArray10[local40] + (int) (Math.sin((double) local34 / 1.5D + (double) arg1) * local9), this.anIntArray7[local40], this.anIntArray8[local40], arg0);
					}
					arg4 += this.anIntArray11[local40];
				}
			}
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("86219, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDJKVJZU", name = "a", descriptor = "(IZIILjava/lang/String;Z)V")
	public void method48(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) boolean arg4) {
		try {
			this.aBoolean22 = false;
			@Pc(16) int local16 = arg1;
			if (arg3 != null) {
				@Pc(24) int local24 = arg0 - this.anInt47;
				for (@Pc(26) int local26 = 0; local26 < arg3.length(); local26++) {
					if (arg3.charAt(local26) == '@' && local26 + 4 < arg3.length() && arg3.charAt(local26 + 4) == '@') {
						@Pc(58) int local58 = this.method50(arg3.substring(local26 + 1, local26 + 4));
						if (local58 != -1) {
							arg2 = local58;
						}
						local26 += 4;
					} else {
						@Pc(70) char local70 = arg3.charAt(local26);
						if (local70 != ' ') {
							if (arg4) {
								this.method51(this.aByteArrayArray1[local70], arg1 + this.anIntArray9[local70] + 1, local24 + this.anIntArray10[local70] + 1, this.anIntArray7[local70], this.anIntArray8[local70], 0);
							}
							this.method51(this.aByteArrayArray1[local70], arg1 + this.anIntArray9[local70], local24 + this.anIntArray10[local70], this.anIntArray7[local70], this.anIntArray8[local70], arg2);
						}
						arg1 += this.anIntArray11[local70];
					}
				}
				if (this.aBoolean22) {
					Class5_Sub1_Sub1.method552(arg1 - local16, 8388608, local16, local24 + (int) ((double) this.anInt47 * 0.7D));
				}
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("69664, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDJKVJZU", name = "a", descriptor = "(IIIZLjava/lang/String;II)V")
	public void method49(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg2 != null) {
				this.aRandom1.setSeed((long) arg0);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(34) int local34 = 15 - this.anInt47;
				for (@Pc(36) int local36 = 0; local36 < arg2.length(); local36++) {
					if (arg2.charAt(local36) == '@' && local36 + 4 < arg2.length() && arg2.charAt(local36 + 4) == '@') {
						@Pc(68) int local68 = this.method50(arg2.substring(local36 + 1, local36 + 4));
						if (local68 != -1) {
							arg4 = local68;
						}
						local36 += 4;
					} else {
						@Pc(80) char local80 = arg2.charAt(local36);
						if (local80 != ' ') {
							this.method53(local34 + this.anIntArray10[local80] + 1, arg1 + this.anIntArray9[local80] + 1, this.anIntArray7[local80], this.aByteArrayArray1[local80], this.anIntArray8[local80], 192, 0);
							this.method53(local34 + this.anIntArray10[local80], arg1 + this.anIntArray9[local80], this.anIntArray7[local80], this.aByteArrayArray1[local80], this.anIntArray8[local80], local17, arg4);
						}
						arg1 += this.anIntArray11[local80];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg1++;
						}
					}
				}
			}
		} catch (@Pc(168) RuntimeException local168) {
			signlink.reporterror("56931, " + arg0 + ", " + -274 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local168.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDJKVJZU", name = "b", descriptor = "(Ljava/lang/String;Z)I")
	private int method50(@OriginalArg(0) String arg0) {
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
					this.aBoolean22 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean22 = false;
				}
				return -1;
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("48456, " + arg0 + ", " + false + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDJKVJZU", name = "a", descriptor = "([BIIIII)V")
	private void method51(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class5_Sub1_Sub1.anInt773;
		@Pc(9) int local9 = Class5_Sub1_Sub1.anInt773 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class5_Sub1_Sub1.anInt775) {
			local20 = Class5_Sub1_Sub1.anInt775 - arg2;
			arg4 -= local20;
			arg2 = Class5_Sub1_Sub1.anInt775;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class5_Sub1_Sub1.anInt773;
		}
		if (arg2 + arg4 >= Class5_Sub1_Sub1.anInt776) {
			arg4 -= arg2 + arg4 + 1 - Class5_Sub1_Sub1.anInt776;
		}
		if (arg1 < Class5_Sub1_Sub1.anInt777) {
			local20 = Class5_Sub1_Sub1.anInt777 - arg1;
			arg3 -= local20;
			arg1 = Class5_Sub1_Sub1.anInt777;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class5_Sub1_Sub1.anInt778) {
			local20 = arg1 + arg3 + 1 - Class5_Sub1_Sub1.anInt778;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method52(Class5_Sub1_Sub1.anIntArray201, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!BDJKVJZU", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method52(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!BDJKVJZU", name = "a", descriptor = "(IIZI[BIII)V")
	private void method53(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(8) int local8 = arg1 + arg0 * Class5_Sub1_Sub1.anInt773;
			@Pc(12) int local12 = Class5_Sub1_Sub1.anInt773 - arg2;
			@Pc(14) int local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(23) int local23;
			if (arg0 < Class5_Sub1_Sub1.anInt775) {
				local23 = Class5_Sub1_Sub1.anInt775 - arg0;
				arg4 -= local23;
				arg0 = Class5_Sub1_Sub1.anInt775;
				local16 = local23 * arg2 + 0;
				local8 += local23 * Class5_Sub1_Sub1.anInt773;
			}
			if (arg0 + arg4 >= Class5_Sub1_Sub1.anInt776) {
				arg4 -= arg0 + arg4 + 1 - Class5_Sub1_Sub1.anInt776;
			}
			if (arg1 < Class5_Sub1_Sub1.anInt777) {
				local23 = Class5_Sub1_Sub1.anInt777 - arg1;
				arg2 -= local23;
				arg1 = Class5_Sub1_Sub1.anInt777;
				local16 += local23;
				local8 += local23;
				local14 = local23 + 0;
				local12 += local23;
			}
			if (arg1 + arg2 >= Class5_Sub1_Sub1.anInt778) {
				local23 = arg1 + arg2 + 1 - Class5_Sub1_Sub1.anInt778;
				arg2 -= local23;
				local14 += local23;
				local12 += local23;
			}
			if (arg2 > 0 && arg4 > 0) {
				this.method54(local16, local12, Class5_Sub1_Sub1.anIntArray201, local14, arg4, arg3, arg6, arg5, local8, arg2);
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("70630, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDJKVJZU", name = "a", descriptor = "(II[III[BIIIII)V")
	private void method54(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg6 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((arg6 & 0xFF00) * arg7 & 0xFF0000) >> 8;
			@Pc(28) int local28 = 256 - arg7;
			for (@Pc(31) int local31 = -arg4; local31 < 0; local31++) {
				for (@Pc(36) int local36 = -arg9; local36 < 0; local36++) {
					if (arg5[arg0++] == 0) {
						arg8++;
					} else {
						@Pc(47) int local47 = arg2[arg8];
						arg2[arg8++] = (((local47 & 0xFF00FF) * local28 & 0xFF00FF00) + ((local47 & 0xFF00) * local28 & 0xFF0000) >> 8) + local19;
					}
				}
				arg8 += arg1;
				arg0 += arg3;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("84639, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + -713 + ", " + arg9 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}
}
