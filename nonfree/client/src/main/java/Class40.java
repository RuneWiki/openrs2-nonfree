import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UJYLHBCS")
public final class Class40 {

	@OriginalMember(owner = "client!UJYLHBCS", name = "r", descriptor = "[I")
	private static int[] anIntArray174;

	@OriginalMember(owner = "client!UJYLHBCS", name = "s", descriptor = "[I")
	private static int[] anIntArray175;

	@OriginalMember(owner = "client!UJYLHBCS", name = "t", descriptor = "[I")
	private static int[] anIntArray176;

	@OriginalMember(owner = "client!UJYLHBCS", name = "u", descriptor = "[I")
	private static int[] anIntArray177 = new int[5];

	@OriginalMember(owner = "client!UJYLHBCS", name = "v", descriptor = "[I")
	private static int[] anIntArray178 = new int[5];

	@OriginalMember(owner = "client!UJYLHBCS", name = "w", descriptor = "[I")
	private static int[] anIntArray179 = new int[5];

	@OriginalMember(owner = "client!UJYLHBCS", name = "x", descriptor = "[I")
	private static int[] anIntArray180 = new int[5];

	@OriginalMember(owner = "client!UJYLHBCS", name = "y", descriptor = "[I")
	private static int[] anIntArray181 = new int[5];

	@OriginalMember(owner = "client!UJYLHBCS", name = "a", descriptor = "Lclient!ANPSASQF;")
	private Class2 aClass2_1;

	@OriginalMember(owner = "client!UJYLHBCS", name = "b", descriptor = "Lclient!ANPSASQF;")
	private Class2 aClass2_2;

	@OriginalMember(owner = "client!UJYLHBCS", name = "c", descriptor = "Lclient!ANPSASQF;")
	private Class2 aClass2_3;

	@OriginalMember(owner = "client!UJYLHBCS", name = "d", descriptor = "Lclient!ANPSASQF;")
	private Class2 aClass2_4;

	@OriginalMember(owner = "client!UJYLHBCS", name = "e", descriptor = "Lclient!ANPSASQF;")
	private Class2 aClass2_5;

	@OriginalMember(owner = "client!UJYLHBCS", name = "f", descriptor = "Lclient!ANPSASQF;")
	private Class2 aClass2_6;

	@OriginalMember(owner = "client!UJYLHBCS", name = "g", descriptor = "Lclient!ANPSASQF;")
	private Class2 aClass2_7;

	@OriginalMember(owner = "client!UJYLHBCS", name = "h", descriptor = "Lclient!ANPSASQF;")
	private Class2 aClass2_8;

	@OriginalMember(owner = "client!UJYLHBCS", name = "l", descriptor = "I")
	private int anInt705;

	@OriginalMember(owner = "client!UJYLHBCS", name = "n", descriptor = "Lclient!IOYFKQTX;")
	private Class18 aClass18_1;

	@OriginalMember(owner = "client!UJYLHBCS", name = "o", descriptor = "Lclient!ANPSASQF;")
	private Class2 aClass2_9;

	@OriginalMember(owner = "client!UJYLHBCS", name = "q", descriptor = "I")
	public int anInt708;

	@OriginalMember(owner = "client!UJYLHBCS", name = "i", descriptor = "[I")
	private int[] anIntArray171 = new int[5];

	@OriginalMember(owner = "client!UJYLHBCS", name = "j", descriptor = "[I")
	private int[] anIntArray172 = new int[5];

	@OriginalMember(owner = "client!UJYLHBCS", name = "k", descriptor = "[I")
	private int[] anIntArray173 = new int[5];

	@OriginalMember(owner = "client!UJYLHBCS", name = "m", descriptor = "I")
	private int anInt706 = 100;

	@OriginalMember(owner = "client!UJYLHBCS", name = "p", descriptor = "I")
	public int anInt707 = 500;

	@OriginalMember(owner = "client!UJYLHBCS", name = "a", descriptor = "()V")
	public static void method494() {
		anIntArray175 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray175[local6] = 1;
			} else {
				anIntArray175[local6] = -1;
			}
		}
		anIntArray176 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray176[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray174 = new int[220500];
	}

	@OriginalMember(owner = "client!UJYLHBCS", name = "a", descriptor = "(II)[I")
	public int[] method495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray174[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray174;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass2_1.method15();
		this.aClass2_2.method15();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass2_3 != null) {
			this.aClass2_3.method15();
			this.aClass2_4.method15();
			local36 = (int) ((double) (this.aClass2_3.anInt24 - this.aClass2_3.anInt23) * 32.768D / local26);
			local38 = (int) ((double) this.aClass2_3.anInt23 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass2_5 != null) {
			this.aClass2_5.method15();
			this.aClass2_6.method15();
			local77 = (int) ((double) (this.aClass2_5.anInt24 - this.aClass2_5.anInt23) * 32.768D / local26);
			local79 = (int) ((double) this.aClass2_5.anInt23 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray171[local118] != 0) {
				anIntArray177[local118] = 0;
				anIntArray178[local118] = (int) ((double) this.anIntArray173[local118] * local26);
				anIntArray179[local118] = (this.anIntArray171[local118] << 14) / 100;
				anIntArray180[local118] = (int) ((double) (this.aClass2_1.anInt24 - this.aClass2_1.anInt23) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray172[local118]) / local26);
				anIntArray181[local118] = (int) ((double) this.aClass2_1.anInt23 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass2_1.method16(arg0);
			local207 = this.aClass2_2.method16(arg0);
			if (this.aClass2_3 != null) {
				local216 = this.aClass2_3.method16(arg0);
				local222 = this.aClass2_4.method16(arg0);
				local201 += this.method496(this.aClass2_3.anInt25, 856, local222, local40) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass2_5 != null) {
				local216 = this.aClass2_5.method16(arg0);
				local222 = this.aClass2_6.method16(arg0);
				local207 = local207 * ((this.method496(this.aClass2_5.anInt25, 856, local222, local81) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray171[local216] != 0) {
					local222 = local193 + anIntArray178[local216];
					if (local222 < arg0) {
						anIntArray174[local222] += this.method496(this.aClass2_1.anInt25, 856, local207 * anIntArray179[local216] >> 15, anIntArray177[local216]);
						anIntArray177[local216] += (local201 * anIntArray180[local216] >> 16) + anIntArray181[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass2_7 != null) {
			this.aClass2_7.method15();
			this.aClass2_8.method15();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass2_7.method16(arg0);
				local385 = this.aClass2_8.method16(arg0);
				if (local369) {
					local207 = this.aClass2_7.anInt23 + ((this.aClass2_7.anInt24 - this.aClass2_7.anInt23) * local379 >> 8);
				} else {
					local207 = this.aClass2_7.anInt23 + ((this.aClass2_7.anInt24 - this.aClass2_7.anInt23) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray174[local222] = 0;
				}
			}
		}
		if (this.anInt705 > 0 && this.anInt706 > 0) {
			local201 = (int) ((double) this.anInt705 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray174[local207] += anIntArray174[local207 - local201] * this.anInt706 / 100;
			}
		}
		if (this.aClass18_1.anIntArray67[0] > 0 || this.aClass18_1.anIntArray67[1] > 0) {
			this.aClass2_9.method15();
			local201 = this.aClass2_9.method16(arg0 + 1);
			local207 = this.aClass18_1.method294(0, (float) local201 / 65536.0F);
			local216 = this.aClass18_1.method294(1, (float) local201 / 65536.0F);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray174[local222 + local207] * (long) Class18.anInt417 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray174[local222 + local207 - local559 - 1] * (long) Class18.anIntArrayArray9[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray174[local222 - local590 - 1] * (long) Class18.anIntArrayArray9[1][local590] >> 16);
					}
					anIntArray174[local222] = local385;
					local201 = this.aClass2_9.method16(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray174[local222 + local207] * (long) Class18.anInt417 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray174[local222 + local207 - local590 - 1] * (long) Class18.anIntArrayArray9[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray174[local222 - local694 - 1] * (long) Class18.anIntArrayArray9[1][local694] >> 16);
						}
						anIntArray174[local222] = local559;
						local201 = this.aClass2_9.method16(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray174[local222 + local207 - local590 - 1] * (long) Class18.anIntArrayArray9[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray174[local222 - local694 - 1] * (long) Class18.anIntArrayArray9[1][local694] >> 16);
							}
							anIntArray174[local222] = local559;
							this.aClass2_9.method16(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass18_1.method294(0, (float) local201 / 65536.0F);
					local216 = this.aClass18_1.method294(1, (float) local201 / 65536.0F);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray174[local201] < -32768) {
				anIntArray174[local201] = -32768;
			}
			if (anIntArray174[local201] > 32767) {
				anIntArray174[local201] = 32767;
			}
		}
		return anIntArray174;
	}

	@OriginalMember(owner = "client!UJYLHBCS", name = "a", descriptor = "(IIII)I")
	private int method496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg0 == 1) {
				return (arg3 & 0x7FFF) < 16384 ? arg2 : -arg2;
			} else if (arg0 == 2) {
				return anIntArray176[arg3 & 0x7FFF] * arg2 >> 14;
			} else if (arg0 == 3) {
				return ((arg3 & 0x7FFF) * arg2 >> 14) - arg2;
			} else if (arg0 == 4) {
				return anIntArray175[arg3 / 2607 & 0x7FFF] * arg2;
			} else {
				return 0;
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("72163, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UJYLHBCS", name = "a", descriptor = "(BLclient!EYMNCFMK;)V")
	public void method497(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			this.aClass2_1 = new Class2();
			this.aClass2_1.method13(arg1);
			this.aClass2_2 = new Class2();
			this.aClass2_2.method13(arg1);
			@Pc(24) int local24 = arg1.method155();
			if (local24 != 0) {
				arg1.anInt301--;
				this.aClass2_3 = new Class2();
				this.aClass2_3.method13(arg1);
				this.aClass2_4 = new Class2();
				this.aClass2_4.method13(arg1);
			}
			local24 = arg1.method155();
			if (local24 != 0) {
				arg1.anInt301--;
				this.aClass2_5 = new Class2();
				this.aClass2_5.method13(arg1);
				this.aClass2_6 = new Class2();
				this.aClass2_6.method13(arg1);
			}
			local24 = arg1.method155();
			if (local24 != 0) {
				arg1.anInt301--;
				this.aClass2_7 = new Class2();
				this.aClass2_7.method13(arg1);
				this.aClass2_8 = new Class2();
				this.aClass2_8.method13(arg1);
			}
			for (@Pc(116) int local116 = 0; local116 < 10; local116++) {
				@Pc(127) int local127 = arg1.method169();
				if (local127 == 0) {
					break;
				}
				this.anIntArray171[local116] = local127;
				this.anIntArray172[local116] = arg1.method168();
				this.anIntArray173[local116] = arg1.method169();
			}
			this.anInt705 = arg1.method169();
			this.anInt706 = arg1.method169();
			this.anInt707 = arg1.method157();
			this.anInt708 = arg1.method157();
			this.aClass18_1 = new Class18();
			@Pc(176) boolean local176 = false;
			this.aClass2_9 = new Class2();
			this.aClass18_1.method295(this.aClass2_9, arg1);
		} catch (@Pc(196) RuntimeException local196) {
			signlink.reporterror("84707, " + arg0 + ", " + arg1 + ", " + local196.toString());
			throw new RuntimeException();
		}
	}
}
