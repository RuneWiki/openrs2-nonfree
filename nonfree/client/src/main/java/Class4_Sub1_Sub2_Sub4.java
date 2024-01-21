import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XUAWPLCH")
public final class Class4_Sub1_Sub2_Sub4 extends Class4_Sub1_Sub2 {

	@OriginalMember(owner = "client!XUAWPLCH", name = "y", descriptor = "Z")
	private boolean aBoolean182 = true;

	@OriginalMember(owner = "client!XUAWPLCH", name = "z", descriptor = "I")
	private int anInt697 = 862;

	@OriginalMember(owner = "client!XUAWPLCH", name = "A", descriptor = "I")
	private int anInt698 = -357;

	@OriginalMember(owner = "client!XUAWPLCH", name = "B", descriptor = "Z")
	private boolean aBoolean183 = true;

	@OriginalMember(owner = "client!XUAWPLCH", name = "C", descriptor = "[[B")
	private byte[][] aByteArrayArray4 = new byte[256][];

	@OriginalMember(owner = "client!XUAWPLCH", name = "D", descriptor = "[I")
	private int[] anIntArray165 = new int[256];

	@OriginalMember(owner = "client!XUAWPLCH", name = "E", descriptor = "[I")
	private int[] anIntArray166 = new int[256];

	@OriginalMember(owner = "client!XUAWPLCH", name = "F", descriptor = "[I")
	private int[] anIntArray167 = new int[256];

	@OriginalMember(owner = "client!XUAWPLCH", name = "G", descriptor = "[I")
	private int[] anIntArray168 = new int[256];

	@OriginalMember(owner = "client!XUAWPLCH", name = "H", descriptor = "[I")
	private int[] anIntArray169 = new int[256];

	@OriginalMember(owner = "client!XUAWPLCH", name = "J", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!XUAWPLCH", name = "K", descriptor = "Z")
	private boolean aBoolean184 = false;

	@OriginalMember(owner = "client!XUAWPLCH", name = "I", descriptor = "I")
	public int anInt699;

	@OriginalMember(owner = "client!XUAWPLCH", name = "<init>", descriptor = "(ZLclient!QDHHNYHL;BLjava/lang/String;)V")
	public Class4_Sub1_Sub2_Sub4(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) String arg3) {
		try {
			@Pc(74) Class4_Sub1_Sub4 local74 = new Class4_Sub1_Sub4(5, arg1.method426(arg3 + ".dat", null));
			@Pc(83) Class4_Sub1_Sub4 local83 = new Class4_Sub1_Sub4(5, arg1.method426("index.dat", null));
			local83.anInt506 = local74.method357() + 4;
			@Pc(94) int local94 = local83.method355();
			if (local94 > 0) {
				local83.anInt506 += (local94 - 1) * 3;
			}
			for (@Pc(108) int local108 = 0; local108 < 256; local108++) {
				this.anIntArray167[local108] = local83.method355();
				this.anIntArray168[local108] = local83.method355();
				@Pc(132) int local132 = this.anIntArray165[local108] = local83.method357();
				@Pc(140) int local140 = this.anIntArray166[local108] = local83.method357();
				@Pc(143) int local143 = local83.method355();
				@Pc(147) int local147 = local132 * local140;
				this.aByteArrayArray4[local108] = new byte[local147];
				@Pc(157) int local157;
				@Pc(182) int local182;
				if (local143 == 0) {
					for (local157 = 0; local157 < local147; local157++) {
						this.aByteArrayArray4[local108][local157] = local74.method356();
					}
				} else if (local143 == 1) {
					for (local157 = 0; local157 < local132; local157++) {
						for (local182 = 0; local182 < local140; local182++) {
							this.aByteArrayArray4[local108][local157 + local182 * local132] = local74.method356();
						}
					}
				}
				if (local140 > this.anInt699 && local108 < 128) {
					this.anInt699 = local140;
				}
				this.anIntArray167[local108] = 1;
				this.anIntArray169[local108] = local132 + 2;
				local157 = 0;
				for (local182 = local140 / 7; local182 < local140; local182++) {
					local157 += this.aByteArrayArray4[local108][local182 * local132];
				}
				@Pc(259) int local259;
				if (local157 <= local140 / 7) {
					local259 = this.anIntArray169[local108]--;
					this.anIntArray167[local108] = 0;
				}
				local157 = 0;
				for (@Pc(273) int local273 = local140 / 7; local273 < local140; local273++) {
					local157 += this.aByteArrayArray4[local108][local132 + local273 * local132 - 1];
				}
				if (local157 <= local140 / 7) {
					local259 = this.anIntArray169[local108]--;
				}
			}
			if (arg0) {
				this.anIntArray169[32] = this.anIntArray169[73];
			} else {
				this.anIntArray169[32] = this.anIntArray169[105];
			}
		} catch (@Pc(340) RuntimeException local340) {
			signlink.reporterror("5750, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local340.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XUAWPLCH", name = "a", descriptor = "(IBILjava/lang/String;I)V")
	public void method503(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(4) boolean local4 = false;
			this.method508(arg3, arg1, 507 - this.method507(arg2), arg2);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("67066, " + 507 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XUAWPLCH", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public void method504(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		try {
			this.method508(arg3, arg1, arg0 - this.method507(arg2) / 2, arg2);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("71331, " + arg0 + ", " + 648 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XUAWPLCH", name = "a", descriptor = "(Ljava/lang/String;IZIII)V")
	public void method505(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.method512(arg3, arg1, 817, arg4 - this.method506(arg0) / 2, arg2, arg0);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("17234, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 33387 + ", " + arg4 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XUAWPLCH", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method506(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(14) int local14 = 0; local14 < arg0.length(); local14++) {
				if (arg0.charAt(local14) == '@' && local14 + 4 < arg0.length() && arg0.charAt(local14 + 4) == '@') {
					local14 += 4;
				} else {
					local7 += this.anIntArray169[arg0.charAt(local14)];
				}
			}
			return local7;
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("46440, " + false + ", " + arg0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XUAWPLCH", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method507(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(11) int local11 = 0;
			for (@Pc(13) int local13 = 0; local13 < arg0.length(); local13++) {
				local11 += this.anIntArray169[arg0.charAt(local13)];
			}
			return local11;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("70620, " + arg0 + ", " + -107 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XUAWPLCH", name = "a", descriptor = "(IIIILjava/lang/String;)V")
	public void method508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			if (arg3 != null) {
				@Pc(7) int local7 = arg1 - this.anInt699;
				for (@Pc(9) int local9 = 0; local9 < arg3.length(); local9++) {
					@Pc(15) char local15 = arg3.charAt(local9);
					if (local15 != ' ') {
						this.method515(this.aByteArrayArray4[local15], arg2 + this.anIntArray167[local15], local7 + this.anIntArray168[local15], this.anIntArray165[local15], this.anIntArray166[local15], arg0);
					}
					arg2 += this.anIntArray169[local15];
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("20016, " + arg0 + ", " + arg1 + ", " + 862 + ", " + arg2 + ", " + arg3 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XUAWPLCH", name = "a", descriptor = "(IIIIZLjava/lang/String;)V")
	public void method509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4) {
		try {
			if (arg4 != null) {
				arg2 -= this.method507(arg4) / 2;
				@Pc(19) int local19 = arg0 - this.anInt699;
				for (@Pc(21) int local21 = 0; local21 < arg4.length(); local21++) {
					@Pc(27) char local27 = arg4.charAt(local21);
					if (local27 != ' ') {
						this.method515(this.aByteArrayArray4[local27], arg2 + this.anIntArray167[local27], local19 + this.anIntArray168[local27] + (int) (Math.sin((double) local21 / 2.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray165[local27], this.anIntArray166[local27], arg1);
					}
					arg2 += this.anIntArray169[local27];
				}
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("68496, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XUAWPLCH", name = "a", descriptor = "(IBILjava/lang/String;II)V")
	public void method510(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg3 != null) {
				arg4 -= this.method507(arg3) / 2;
				@Pc(18) int local18 = arg0 - this.anInt699;
				@Pc(23) boolean local23 = false;
				for (@Pc(28) int local28 = 0; local28 < arg3.length(); local28++) {
					@Pc(34) char local34 = arg3.charAt(local28);
					if (local34 != ' ') {
						this.method515(this.aByteArrayArray4[local34], arg4 + this.anIntArray167[local34] + (int) (Math.sin((double) local28 / 5.0D + (double) arg2 / 5.0D) * 5.0D), local18 + this.anIntArray168[local34] + (int) (Math.sin((double) local28 / 3.0D + (double) arg2 / 5.0D) * 5.0D), this.anIntArray165[local34], this.anIntArray166[local34], arg5);
					}
					arg4 += this.anIntArray169[local34];
				}
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("36303, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XUAWPLCH", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public void method511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg3 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg5 / 8.0D;
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg2 -= this.method507(arg3) / 2;
				@Pc(32) int local32 = arg4 - this.anInt699;
				for (@Pc(34) int local34 = 0; local34 < arg3.length(); local34++) {
					@Pc(40) char local40 = arg3.charAt(local34);
					if (local40 != ' ') {
						this.method515(this.aByteArrayArray4[local40], arg2 + this.anIntArray167[local40], local32 + this.anIntArray168[local40] + (int) (Math.sin((double) local34 / 1.5D + (double) arg0) * local9), this.anIntArray165[local40], this.anIntArray166[local40], arg1);
					}
					arg2 += this.anIntArray169[local40];
				}
			}
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("98964, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 68 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XUAWPLCH", name = "b", descriptor = "(IIIIZLjava/lang/String;)V")
	public void method512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) String arg5) {
		try {
			@Pc(5) boolean local5 = false;
			this.aBoolean184 = false;
			@Pc(10) int local10 = arg3;
			if (arg5 != null) {
				@Pc(18) int local18 = arg0 - this.anInt699;
				for (@Pc(20) int local20 = 0; local20 < arg5.length(); local20++) {
					if (arg5.charAt(local20) == '@' && local20 + 4 < arg5.length() && arg5.charAt(local20 + 4) == '@') {
						@Pc(52) int local52 = this.method514(arg5.substring(local20 + 1, local20 + 4));
						if (local52 != -1) {
							arg1 = local52;
						}
						local20 += 4;
					} else {
						@Pc(64) char local64 = arg5.charAt(local20);
						if (local64 != ' ') {
							if (arg4) {
								this.method515(this.aByteArrayArray4[local64], arg3 + this.anIntArray167[local64] + 1, local18 + this.anIntArray168[local64] + 1, this.anIntArray165[local64], this.anIntArray166[local64], 0);
							}
							this.method515(this.aByteArrayArray4[local64], arg3 + this.anIntArray167[local64], local18 + this.anIntArray168[local64], this.anIntArray165[local64], this.anIntArray166[local64], arg1);
						}
						arg3 += this.anIntArray169[local64];
					}
				}
				if (this.aBoolean184) {
					Class4_Sub1_Sub2.method499(8388608, arg3 - local10, local18 + (int) ((double) this.anInt699 * 0.7D), local10);
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("11907, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XUAWPLCH", name = "a", descriptor = "(ILjava/lang/String;IIIZB)V")
	public void method513(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg1 != null) {
				this.aRandom1.setSeed((long) arg3);
				@Pc(28) int local28 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(33) int local33 = 15 - this.anInt699;
				for (@Pc(35) int local35 = 0; local35 < arg1.length(); local35++) {
					if (arg1.charAt(local35) == '@' && local35 + 4 < arg1.length() && arg1.charAt(local35 + 4) == '@') {
						@Pc(67) int local67 = this.method514(arg1.substring(local35 + 1, local35 + 4));
						if (local67 != -1) {
							arg4 = local67;
						}
						local35 += 4;
					} else {
						@Pc(79) char local79 = arg1.charAt(local35);
						if (local79 != ' ') {
							this.method517(local33 + this.anIntArray168[local79] + 1, 192, arg2 + this.anIntArray167[local79] + 1, this.anIntArray166[local79], 0, this.aByteArrayArray4[local79], this.anIntArray165[local79]);
							this.method517(local33 + this.anIntArray168[local79], local28, arg2 + this.anIntArray167[local79], this.anIntArray166[local79], arg4, this.aByteArrayArray4[local79], this.anIntArray165[local79]);
						}
						arg2 += this.anIntArray169[local79];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg2++;
						}
					}
				}
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("61497, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + -58 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XUAWPLCH", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	private int method514(@OriginalArg(0) String arg0) {
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
					this.aBoolean184 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean184 = false;
				}
				return -1;
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("3878, " + arg0 + ", " + true + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XUAWPLCH", name = "a", descriptor = "([BIIIII)V")
	private void method515(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class4_Sub1_Sub2.anInt688;
		@Pc(9) int local9 = Class4_Sub1_Sub2.anInt688 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class4_Sub1_Sub2.anInt690) {
			local20 = Class4_Sub1_Sub2.anInt690 - arg2;
			arg4 -= local20;
			arg2 = Class4_Sub1_Sub2.anInt690;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class4_Sub1_Sub2.anInt688;
		}
		if (arg2 + arg4 >= Class4_Sub1_Sub2.anInt691) {
			arg4 -= arg2 + arg4 + 1 - Class4_Sub1_Sub2.anInt691;
		}
		if (arg1 < Class4_Sub1_Sub2.anInt692) {
			local20 = Class4_Sub1_Sub2.anInt692 - arg1;
			arg3 -= local20;
			arg1 = Class4_Sub1_Sub2.anInt692;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class4_Sub1_Sub2.anInt693) {
			local20 = arg1 + arg3 + 1 - Class4_Sub1_Sub2.anInt693;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method516(Class4_Sub1_Sub2.anIntArray164, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!XUAWPLCH", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method516(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!XUAWPLCH", name = "a", descriptor = "(ZIIIII[BI)V")
	private void method517(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg2 + arg0 * Class4_Sub1_Sub2.anInt688;
			@Pc(9) int local9 = Class4_Sub1_Sub2.anInt688 - arg6;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(20) int local20;
			if (arg0 < Class4_Sub1_Sub2.anInt690) {
				local20 = Class4_Sub1_Sub2.anInt690 - arg0;
				arg3 -= local20;
				arg0 = Class4_Sub1_Sub2.anInt690;
				local13 = local20 * arg6 + 0;
				local5 += local20 * Class4_Sub1_Sub2.anInt688;
			}
			if (arg0 + arg3 >= Class4_Sub1_Sub2.anInt691) {
				arg3 -= arg0 + arg3 + 1 - Class4_Sub1_Sub2.anInt691;
			}
			if (arg2 < Class4_Sub1_Sub2.anInt692) {
				local20 = Class4_Sub1_Sub2.anInt692 - arg2;
				arg6 -= local20;
				arg2 = Class4_Sub1_Sub2.anInt692;
				local13 += local20;
				local5 += local20;
				local11 = local20 + 0;
				local9 += local20;
			}
			if (arg2 + arg6 >= Class4_Sub1_Sub2.anInt693) {
				local20 = arg2 + arg6 + 1 - Class4_Sub1_Sub2.anInt693;
				arg6 -= local20;
				local11 += local20;
				local9 += local20;
			}
			if (arg6 > 0 && arg3 > 0) {
				this.method518(arg3, local5, arg6, arg5, local11, arg4, local9, local13, Class4_Sub1_Sub2.anIntArray164, arg1, 217);
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("97612, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XUAWPLCH", name = "a", descriptor = "(III[BIIII[III)V")
	private void method518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(19) int local19 = ((arg5 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg5 & 0xFF00) * arg9 & 0xFF0000) >> 8;
			@Pc(23) boolean local23 = false;
			@Pc(27) int local27 = 256 - arg9;
			for (@Pc(30) int local30 = -arg0; local30 < 0; local30++) {
				for (@Pc(35) int local35 = -arg2; local35 < 0; local35++) {
					if (arg3[arg7++] == 0) {
						arg1++;
					} else {
						@Pc(46) int local46 = arg8[arg1];
						arg8[arg1++] = (((local46 & 0xFF00FF) * local27 & 0xFF00FF00) + ((local46 & 0xFF00) * local27 & 0xFF0000) >> 8) + local19;
					}
				}
				arg1 += arg6;
				arg7 += arg4;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("17456, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}
}
