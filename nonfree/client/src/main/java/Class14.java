import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IRCSYKHE")
public final class Class14 {

	@OriginalMember(owner = "client!IRCSYKHE", name = "a", descriptor = "Z")
	private static boolean aBoolean71;

	@OriginalMember(owner = "client!IRCSYKHE", name = "s", descriptor = "[I")
	private static int[] anIntArray61;

	@OriginalMember(owner = "client!IRCSYKHE", name = "t", descriptor = "[I")
	private static int[] anIntArray62;

	@OriginalMember(owner = "client!IRCSYKHE", name = "u", descriptor = "[I")
	private static int[] anIntArray63;

	@OriginalMember(owner = "client!IRCSYKHE", name = "v", descriptor = "[I")
	private static int[] anIntArray64 = new int[5];

	@OriginalMember(owner = "client!IRCSYKHE", name = "w", descriptor = "[I")
	private static int[] anIntArray65 = new int[5];

	@OriginalMember(owner = "client!IRCSYKHE", name = "x", descriptor = "[I")
	private static int[] anIntArray66 = new int[5];

	@OriginalMember(owner = "client!IRCSYKHE", name = "y", descriptor = "[I")
	private static int[] anIntArray67 = new int[5];

	@OriginalMember(owner = "client!IRCSYKHE", name = "z", descriptor = "[I")
	private static int[] anIntArray68 = new int[5];

	@OriginalMember(owner = "client!IRCSYKHE", name = "b", descriptor = "Lclient!XJOITHUI;")
	private Class45 aClass45_1;

	@OriginalMember(owner = "client!IRCSYKHE", name = "c", descriptor = "Lclient!XJOITHUI;")
	private Class45 aClass45_2;

	@OriginalMember(owner = "client!IRCSYKHE", name = "d", descriptor = "Lclient!XJOITHUI;")
	private Class45 aClass45_3;

	@OriginalMember(owner = "client!IRCSYKHE", name = "e", descriptor = "Lclient!XJOITHUI;")
	private Class45 aClass45_4;

	@OriginalMember(owner = "client!IRCSYKHE", name = "f", descriptor = "Lclient!XJOITHUI;")
	private Class45 aClass45_5;

	@OriginalMember(owner = "client!IRCSYKHE", name = "g", descriptor = "Lclient!XJOITHUI;")
	private Class45 aClass45_6;

	@OriginalMember(owner = "client!IRCSYKHE", name = "h", descriptor = "Lclient!XJOITHUI;")
	private Class45 aClass45_7;

	@OriginalMember(owner = "client!IRCSYKHE", name = "i", descriptor = "Lclient!XJOITHUI;")
	private Class45 aClass45_8;

	@OriginalMember(owner = "client!IRCSYKHE", name = "m", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "client!IRCSYKHE", name = "o", descriptor = "Lclient!OKKLRABS;")
	private Class28 aClass28_1;

	@OriginalMember(owner = "client!IRCSYKHE", name = "p", descriptor = "Lclient!XJOITHUI;")
	private Class45 aClass45_9;

	@OriginalMember(owner = "client!IRCSYKHE", name = "r", descriptor = "I")
	public int anInt326;

	@OriginalMember(owner = "client!IRCSYKHE", name = "j", descriptor = "[I")
	private int[] anIntArray58 = new int[5];

	@OriginalMember(owner = "client!IRCSYKHE", name = "k", descriptor = "[I")
	private int[] anIntArray59 = new int[5];

	@OriginalMember(owner = "client!IRCSYKHE", name = "l", descriptor = "[I")
	private int[] anIntArray60 = new int[5];

	@OriginalMember(owner = "client!IRCSYKHE", name = "n", descriptor = "I")
	private int anInt324 = 100;

	@OriginalMember(owner = "client!IRCSYKHE", name = "q", descriptor = "I")
	public int anInt325 = 500;

	@OriginalMember(owner = "client!IRCSYKHE", name = "a", descriptor = "()V")
	public static void method217() {
		anIntArray62 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray62[local6] = 1;
			} else {
				anIntArray62[local6] = -1;
			}
		}
		anIntArray63 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray63[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray61 = new int[220500];
	}

	@OriginalMember(owner = "client!IRCSYKHE", name = "a", descriptor = "(II)[I")
	public int[] method218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray61[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray61;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass45_1.method498();
		this.aClass45_2.method498();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass45_3 != null) {
			this.aClass45_3.method498();
			this.aClass45_4.method498();
			local36 = (int) ((double) (this.aClass45_3.anInt747 - this.aClass45_3.anInt746) * 32.768D / local26);
			local38 = (int) ((double) this.aClass45_3.anInt746 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass45_5 != null) {
			this.aClass45_5.method498();
			this.aClass45_6.method498();
			local77 = (int) ((double) (this.aClass45_5.anInt747 - this.aClass45_5.anInt746) * 32.768D / local26);
			local79 = (int) ((double) this.aClass45_5.anInt746 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray58[local118] != 0) {
				anIntArray64[local118] = 0;
				anIntArray65[local118] = (int) ((double) this.anIntArray60[local118] * local26);
				anIntArray66[local118] = (this.anIntArray58[local118] << 14) / 100;
				anIntArray67[local118] = (int) ((double) (this.aClass45_1.anInt747 - this.aClass45_1.anInt746) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray59[local118]) / local26);
				anIntArray68[local118] = (int) ((double) this.aClass45_1.anInt746 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass45_1.method499(aBoolean71, arg0);
			local207 = this.aClass45_2.method499(aBoolean71, arg0);
			if (this.aClass45_3 != null) {
				local216 = this.aClass45_3.method499(aBoolean71, arg0);
				local222 = this.aClass45_4.method499(aBoolean71, arg0);
				local201 += this.method219(local40, this.aClass45_3.anInt748, local222) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass45_5 != null) {
				local216 = this.aClass45_5.method499(aBoolean71, arg0);
				local222 = this.aClass45_6.method499(aBoolean71, arg0);
				local207 = local207 * ((this.method219(local81, this.aClass45_5.anInt748, local222) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray58[local216] != 0) {
					local222 = local193 + anIntArray65[local216];
					if (local222 < arg0) {
						anIntArray61[local222] += this.method219(anIntArray64[local216], this.aClass45_1.anInt748, local207 * anIntArray66[local216] >> 15);
						anIntArray64[local216] += (local201 * anIntArray67[local216] >> 16) + anIntArray68[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass45_7 != null) {
			this.aClass45_7.method498();
			this.aClass45_8.method498();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass45_7.method499(aBoolean71, arg0);
				local385 = this.aClass45_8.method499(aBoolean71, arg0);
				if (local369) {
					local207 = this.aClass45_7.anInt746 + ((this.aClass45_7.anInt747 - this.aClass45_7.anInt746) * local379 >> 8);
				} else {
					local207 = this.aClass45_7.anInt746 + ((this.aClass45_7.anInt747 - this.aClass45_7.anInt746) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray61[local222] = 0;
				}
			}
		}
		if (this.anInt323 > 0 && this.anInt324 > 0) {
			local201 = (int) ((double) this.anInt323 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray61[local207] += anIntArray61[local207 - local201] * this.anInt324 / 100;
			}
		}
		if (this.aClass28_1.anIntArray138[0] > 0 || this.aClass28_1.anIntArray138[1] > 0) {
			this.aClass45_9.method498();
			local201 = this.aClass45_9.method499(aBoolean71, arg0 + 1);
			local207 = this.aClass28_1.method374((float) local201 / 65536.0F, 0);
			local216 = this.aClass28_1.method374((float) local201 / 65536.0F, 1);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray61[local222 + local207] * (long) Class28.anInt500 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray61[local222 + local207 - local559 - 1] * (long) Class28.anIntArrayArray15[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray61[local222 - local590 - 1] * (long) Class28.anIntArrayArray15[1][local590] >> 16);
					}
					anIntArray61[local222] = local385;
					local201 = this.aClass45_9.method499(aBoolean71, arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray61[local222 + local207] * (long) Class28.anInt500 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray61[local222 + local207 - local590 - 1] * (long) Class28.anIntArrayArray15[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray61[local222 - local694 - 1] * (long) Class28.anIntArrayArray15[1][local694] >> 16);
						}
						anIntArray61[local222] = local559;
						local201 = this.aClass45_9.method499(aBoolean71, arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray61[local222 + local207 - local590 - 1] * (long) Class28.anIntArrayArray15[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray61[local222 - local694 - 1] * (long) Class28.anIntArrayArray15[1][local694] >> 16);
							}
							anIntArray61[local222] = local559;
							this.aClass45_9.method499(aBoolean71, arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass28_1.method374((float) local201 / 65536.0F, 0);
					local216 = this.aClass28_1.method374((float) local201 / 65536.0F, 1);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray61[local201] < -32768) {
				anIntArray61[local201] = -32768;
			}
			if (anIntArray61[local201] > 32767) {
				anIntArray61[local201] = 32767;
			}
		}
		return anIntArray61;
	}

	@OriginalMember(owner = "client!IRCSYKHE", name = "a", descriptor = "(IIII)I")
	private int method219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg1 == 1) {
				return (arg0 & 0x7FFF) < 16384 ? arg2 : -arg2;
			} else if (arg1 == 2) {
				return anIntArray63[arg0 & 0x7FFF] * arg2 >> 14;
			} else if (arg1 == 3) {
				return ((arg0 & 0x7FFF) * arg2 >> 14) - arg2;
			} else if (arg1 == 4) {
				return anIntArray62[arg0 / 2607 & 0x7FFF] * arg2;
			} else {
				return 0;
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("73325, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 3 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IRCSYKHE", name = "a", descriptor = "(ILclient!BJPWOXRJ;)V")
	public void method220(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2 arg1) {
		try {
			this.aClass45_1 = new Class45();
			this.aClass45_1.method496(arg1);
			this.aClass45_2 = new Class45();
			this.aClass45_2.method496(arg1);
			@Pc(24) int local24 = arg1.method22();
			if (local24 != 0) {
				arg1.anInt10--;
				this.aClass45_3 = new Class45();
				this.aClass45_3.method496(arg1);
				this.aClass45_4 = new Class45();
				this.aClass45_4.method496(arg1);
			}
			local24 = arg1.method22();
			if (local24 != 0) {
				arg1.anInt10--;
				this.aClass45_5 = new Class45();
				this.aClass45_5.method496(arg1);
				this.aClass45_6 = new Class45();
				this.aClass45_6.method496(arg1);
			}
			local24 = arg1.method22();
			if (local24 != 0) {
				arg1.anInt10--;
				this.aClass45_7 = new Class45();
				this.aClass45_7.method496(arg1);
				this.aClass45_8 = new Class45();
				this.aClass45_8.method496(arg1);
			}
			for (@Pc(116) int local116 = 0; local116 < 10; local116++) {
				@Pc(127) int local127 = arg1.method36();
				if (local127 == 0) {
					break;
				}
				this.anIntArray58[local116] = local127;
				this.anIntArray59[local116] = arg1.method35();
				this.anIntArray60[local116] = arg1.method36();
			}
			this.anInt323 = arg1.method36();
			this.anInt324 = arg1.method36();
			this.anInt325 = arg1.method24();
			@Pc(166) boolean local166 = false;
			this.anInt326 = arg1.method24();
			this.aClass28_1 = new Class28();
			this.aClass45_9 = new Class45();
			this.aClass28_1.method375(arg1, this.aClass45_9);
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("21751, " + arg0 + ", " + arg1 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}
}
