import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EYHVDWTF")
public final class Class1_Sub1_Sub2_Sub2 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!EYHVDWTF", name = "A", descriptor = "I")
	private int anInt272;

	@OriginalMember(owner = "client!EYHVDWTF", name = "D", descriptor = "I")
	private int anInt273;

	@OriginalMember(owner = "client!EYHVDWTF", name = "B", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!EYHVDWTF", name = "C", descriptor = "Z")
	private boolean aBoolean68 = true;

	@OriginalMember(owner = "client!EYHVDWTF", name = "E", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[256][];

	@OriginalMember(owner = "client!EYHVDWTF", name = "F", descriptor = "[I")
	private int[] anIntArray38 = new int[256];

	@OriginalMember(owner = "client!EYHVDWTF", name = "G", descriptor = "[I")
	private int[] anIntArray39 = new int[256];

	@OriginalMember(owner = "client!EYHVDWTF", name = "H", descriptor = "[I")
	private int[] anIntArray40 = new int[256];

	@OriginalMember(owner = "client!EYHVDWTF", name = "I", descriptor = "[I")
	private int[] anIntArray41 = new int[256];

	@OriginalMember(owner = "client!EYHVDWTF", name = "J", descriptor = "[I")
	private int[] anIntArray42 = new int[256];

	@OriginalMember(owner = "client!EYHVDWTF", name = "L", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!EYHVDWTF", name = "M", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!EYHVDWTF", name = "K", descriptor = "I")
	public int anInt274;

	@OriginalMember(owner = "client!EYHVDWTF", name = "<init>", descriptor = "(Lclient!SPZBTZXL;IZLjava/lang/String;)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) Class35 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) String arg3) {
		try {
			@Pc(58) Class1_Sub1_Sub3 local58 = new Class1_Sub1_Sub3(arg0.method491(arg3 + ".dat", null), this.anInt272);
			@Pc(68) Class1_Sub1_Sub3 local68 = new Class1_Sub1_Sub3(arg0.method491("index.dat", null), this.anInt272);
			@Pc(72) int local72 = 81 / arg1;
			local68.anInt443 = local58.method361() + 4;
			@Pc(83) int local83 = local68.method359();
			if (local83 > 0) {
				local68.anInt443 += (local83 - 1) * 3;
			}
			for (@Pc(97) int local97 = 0; local97 < 256; local97++) {
				this.anIntArray40[local97] = local68.method359();
				this.anIntArray41[local97] = local68.method359();
				@Pc(121) int local121 = this.anIntArray38[local97] = local68.method361();
				@Pc(129) int local129 = this.anIntArray39[local97] = local68.method361();
				@Pc(132) int local132 = local68.method359();
				@Pc(136) int local136 = local121 * local129;
				this.aByteArrayArray1[local97] = new byte[local136];
				@Pc(146) int local146;
				@Pc(171) int local171;
				if (local132 == 0) {
					for (local146 = 0; local146 < local136; local146++) {
						this.aByteArrayArray1[local97][local146] = local58.method360();
					}
				} else if (local132 == 1) {
					for (local146 = 0; local146 < local121; local146++) {
						for (local171 = 0; local171 < local129; local171++) {
							this.aByteArrayArray1[local97][local146 + local171 * local121] = local58.method360();
						}
					}
				}
				if (local129 > this.anInt274 && local97 < 128) {
					this.anInt274 = local129;
				}
				this.anIntArray40[local97] = 1;
				this.anIntArray42[local97] = local121 + 2;
				local146 = 0;
				for (local171 = local129 / 7; local171 < local129; local171++) {
					local146 += this.aByteArrayArray1[local97][local171 * local121];
				}
				@Pc(248) int local248;
				if (local146 <= local129 / 7) {
					local248 = this.anIntArray42[local97]--;
					this.anIntArray40[local97] = 0;
				}
				local146 = 0;
				for (@Pc(262) int local262 = local129 / 7; local262 < local129; local262++) {
					local146 += this.aByteArrayArray1[local97][local121 + local262 * local121 - 1];
				}
				if (local146 <= local129 / 7) {
					local248 = this.anIntArray42[local97]--;
				}
			}
			if (arg2) {
				this.anIntArray42[32] = this.anIntArray42[73];
			} else {
				this.anIntArray42[32] = this.anIntArray42[105];
			}
		} catch (@Pc(321) RuntimeException local321) {
			signlink.reporterror("14590, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local321.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYHVDWTF", name = "a", descriptor = "(Ljava/lang/String;BIII)V")
	public void method178(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		try {
			this.method183(507 - this.method182(arg0), arg0, arg2, arg1);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("63752, " + arg0 + ", " + 28 + ", " + 507 + ", " + arg1 + ", " + arg2 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYHVDWTF", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public void method179(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg4 > 0) {
				this.method183(arg1 - this.method182(arg0) / 2, arg0, arg2, arg3);
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("23231, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYHVDWTF", name = "a", descriptor = "(IIILjava/lang/String;ZZ)V")
	public void method180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) boolean arg4) {
		try {
			this.method187(arg2, arg0 - this.method181(arg3) / 2, arg4, arg3, arg1);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("39593, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYHVDWTF", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method181(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
				if (arg0.charAt(local9) == '@' && local9 + 4 < arg0.length() && arg0.charAt(local9 + 4) == '@') {
					local9 += 4;
				} else {
					local7 += this.anIntArray42[arg0.charAt(local9)];
				}
			}
			return local7;
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("50339, " + arg0 + ", " + 0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYHVDWTF", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method182(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(15) int local15 = 0;
			for (@Pc(17) int local17 = 0; local17 < arg0.length(); local17++) {
				local15 += this.anIntArray42[arg0.charAt(local17)];
			}
			return local15;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("6304, " + -163 + ", " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYHVDWTF", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public void method183(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 != null) {
				@Pc(7) int local7 = arg2 - this.anInt274;
				for (@Pc(9) int local9 = 0; local9 < arg1.length(); local9++) {
					@Pc(15) char local15 = arg1.charAt(local9);
					if (local15 != ' ') {
						this.method190(this.aByteArrayArray1[local15], arg0 + this.anIntArray40[local15], local7 + this.anIntArray41[local15], this.anIntArray38[local15], this.anIntArray39[local15], arg3);
					}
					arg0 += this.anIntArray42[local15];
				}
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("81685, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYHVDWTF", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public void method184(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 != null) {
				arg4 -= this.method182(arg0) / 2;
				@Pc(18) int local18 = arg3 - this.anInt274;
				for (@Pc(20) int local20 = 0; local20 < arg0.length(); local20++) {
					@Pc(26) char local26 = arg0.charAt(local20);
					if (local26 != ' ') {
						this.method190(this.aByteArrayArray1[local26], arg4 + this.anIntArray40[local26], local18 + this.anIntArray41[local26] + (int) (Math.sin((double) local20 / 2.0D + (double) arg1 / 5.0D) * 5.0D), this.anIntArray38[local26], this.anIntArray39[local26], arg2);
					}
					arg4 += this.anIntArray42[local26];
				}
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("14314, " + arg0 + ", " + arg1 + ", " + -45089 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYHVDWTF", name = "b", descriptor = "(Ljava/lang/String;IIIII)V")
	public void method185(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg0 != null) {
				arg3 -= this.method182(arg0) / 2;
				@Pc(27) int local27 = arg4 - this.anInt274;
				for (@Pc(29) int local29 = 0; local29 < arg0.length(); local29++) {
					@Pc(35) char local35 = arg0.charAt(local29);
					if (local35 != ' ') {
						this.method190(this.aByteArrayArray1[local35], arg3 + this.anIntArray40[local35] + (int) (Math.sin((double) local29 / 5.0D + (double) arg2 / 5.0D) * 5.0D), local27 + this.anIntArray41[local35] + (int) (Math.sin((double) local29 / 3.0D + (double) arg2 / 5.0D) * 5.0D), this.anIntArray38[local35], this.anIntArray39[local35], arg1);
					}
					arg3 += this.anIntArray42[local35];
				}
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("98085, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 8 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYHVDWTF", name = "a", descriptor = "(Ljava/lang/String;IIIZII)V")
	public void method186(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 != null) {
				@Pc(12) double local12 = 7.0D - (double) arg4 / 8.0D;
				if (local12 < 0.0D) {
					local12 = 0.0D;
				}
				arg2 -= this.method182(arg0) / 2;
				@Pc(32) int local32 = arg1 - this.anInt274;
				for (@Pc(34) int local34 = 0; local34 < arg0.length(); local34++) {
					@Pc(40) char local40 = arg0.charAt(local34);
					if (local40 != ' ') {
						this.method190(this.aByteArrayArray1[local40], arg2 + this.anIntArray40[local40], local32 + this.anIntArray41[local40] + (int) (Math.sin((double) local34 / 1.5D + (double) arg5) * local12), this.anIntArray38[local40], this.anIntArray39[local40], arg3);
					}
					arg2 += this.anIntArray42[local40];
				}
			}
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("11199, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + arg5 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYHVDWTF", name = "a", descriptor = "(IIZZLjava/lang/String;I)V")
	public void method187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			this.aBoolean69 = false;
			@Pc(6) int local6 = arg1;
			if (arg3 != null) {
				@Pc(23) int local23 = arg4 - this.anInt274;
				for (@Pc(25) int local25 = 0; local25 < arg3.length(); local25++) {
					if (arg3.charAt(local25) == '@' && local25 + 4 < arg3.length() && arg3.charAt(local25 + 4) == '@') {
						@Pc(57) int local57 = this.method189(arg3.substring(local25 + 1, local25 + 4));
						if (local57 != -1) {
							arg0 = local57;
						}
						local25 += 4;
					} else {
						@Pc(69) char local69 = arg3.charAt(local25);
						if (local69 != ' ') {
							if (arg2) {
								this.method190(this.aByteArrayArray1[local69], arg1 + this.anIntArray40[local69] + 1, local23 + this.anIntArray41[local69] + 1, this.anIntArray38[local69], this.anIntArray39[local69], 0);
							}
							this.method190(this.aByteArrayArray1[local69], arg1 + this.anIntArray40[local69], local23 + this.anIntArray41[local69], this.anIntArray38[local69], this.anIntArray39[local69], arg0);
						}
						arg1 += this.anIntArray42[local69];
					}
				}
				if (this.aBoolean69) {
					Class1_Sub1_Sub2.method408(local23 + (int) ((double) this.anInt274 * 0.7D), local6, 8388608, arg1 - local6);
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("27223, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYHVDWTF", name = "a", descriptor = "(ILjava/lang/String;ZIIII)V")
	public void method188(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg1 != null) {
				this.aRandom1.setSeed((long) arg3);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(22) int local22 = 15 - this.anInt274;
				for (@Pc(24) int local24 = 0; local24 < arg1.length(); local24++) {
					if (arg1.charAt(local24) == '@' && local24 + 4 < arg1.length() && arg1.charAt(local24 + 4) == '@') {
						@Pc(56) int local56 = this.method189(arg1.substring(local24 + 1, local24 + 4));
						if (local56 != -1) {
							arg0 = local56;
						}
						local24 += 4;
					} else {
						@Pc(68) char local68 = arg1.charAt(local24);
						if (local68 != ' ') {
							this.method192((byte) 2, 192, arg2 + this.anIntArray40[local68] + 1, this.anIntArray39[local68], this.anIntArray38[local68], local22 + this.anIntArray41[local68] + 1, this.aByteArrayArray1[local68], 0);
							this.method192((byte) 2, local17, arg2 + this.anIntArray40[local68], this.anIntArray39[local68], this.anIntArray38[local68], local22 + this.anIntArray41[local68], this.aByteArrayArray1[local68], arg0);
						}
						arg2 += this.anIntArray42[local68];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg2++;
						}
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("84028, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYHVDWTF", name = "b", descriptor = "(Ljava/lang/String;I)I")
	private int method189(@OriginalArg(0) String arg0) {
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
					this.aBoolean69 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean69 = false;
				}
				return -1;
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("54, " + arg0 + ", " + 2 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYHVDWTF", name = "a", descriptor = "([BIIIII)V")
	private void method190(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub2.anInt453;
		@Pc(9) int local9 = Class1_Sub1_Sub2.anInt453 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub2.anInt455) {
			local20 = Class1_Sub1_Sub2.anInt455 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub2.anInt455;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub2.anInt453;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt456) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt456;
		}
		if (arg1 < Class1_Sub1_Sub2.anInt457) {
			local20 = Class1_Sub1_Sub2.anInt457 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub2.anInt457;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub2.anInt458) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub2.anInt458;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method191(Class1_Sub1_Sub2.anIntArray122, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!EYHVDWTF", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method191(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!EYHVDWTF", name = "a", descriptor = "(BIIIII[BI)V")
	private void method192(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(5) int local5 = arg2 + arg5 * Class1_Sub1_Sub2.anInt453;
			@Pc(9) int local9 = Class1_Sub1_Sub2.anInt453 - arg4;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(18) boolean local18 = false;
			@Pc(28) int local28;
			if (arg5 < Class1_Sub1_Sub2.anInt455) {
				local28 = Class1_Sub1_Sub2.anInt455 - arg5;
				arg3 -= local28;
				arg5 = Class1_Sub1_Sub2.anInt455;
				local13 = local28 * arg4 + 0;
				local5 += local28 * Class1_Sub1_Sub2.anInt453;
			}
			if (arg5 + arg3 >= Class1_Sub1_Sub2.anInt456) {
				arg3 -= arg5 + arg3 + 1 - Class1_Sub1_Sub2.anInt456;
			}
			if (arg2 < Class1_Sub1_Sub2.anInt457) {
				local28 = Class1_Sub1_Sub2.anInt457 - arg2;
				arg4 -= local28;
				arg2 = Class1_Sub1_Sub2.anInt457;
				local13 += local28;
				local5 += local28;
				local11 = local28 + 0;
				local9 += local28;
			}
			if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt458) {
				local28 = arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt458;
				arg4 -= local28;
				local11 += local28;
				local9 += local28;
			}
			if (arg4 > 0 && arg3 > 0) {
				this.method193(local5, local9, arg3, arg4, arg7, local13, arg1, local11, Class1_Sub1_Sub2.anIntArray122, arg6);
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("52211, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EYHVDWTF", name = "a", descriptor = "(IIIIIIIII[I[B)V")
	private void method193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) byte[] arg9) {
		try {
			@Pc(24) int local24 = ((arg4 & 0xFF00FF) * arg6 & 0xFF00FF00) + ((arg4 & 0xFF00) * arg6 & 0xFF0000) >> 8;
			@Pc(28) int local28 = 256 - arg6;
			for (@Pc(31) int local31 = -arg2; local31 < 0; local31++) {
				for (@Pc(36) int local36 = -arg3; local36 < 0; local36++) {
					if (arg9[arg5++] == 0) {
						arg0++;
					} else {
						@Pc(47) int local47 = arg8[arg0];
						arg8[arg0++] = (((local47 & 0xFF00FF) * local28 & 0xFF00FF00) + ((local47 & 0xFF00) * local28 & 0xFF0000) >> 8) + local24;
					}
				}
				arg0 += arg1;
				arg5 += arg7;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("734, " + arg0 + ", " + arg1 + ", " + 927 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}
}
