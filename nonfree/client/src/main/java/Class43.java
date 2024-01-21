import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VUJNNHKQ")
public final class Class43 {

	@OriginalMember(owner = "client!VUJNNHKQ", name = "r", descriptor = "[I")
	private static int[] anIntArray153;

	@OriginalMember(owner = "client!VUJNNHKQ", name = "s", descriptor = "[I")
	private static int[] anIntArray154;

	@OriginalMember(owner = "client!VUJNNHKQ", name = "t", descriptor = "[I")
	private static int[] anIntArray155;

	@OriginalMember(owner = "client!VUJNNHKQ", name = "u", descriptor = "[I")
	private static int[] anIntArray156 = new int[5];

	@OriginalMember(owner = "client!VUJNNHKQ", name = "v", descriptor = "[I")
	private static int[] anIntArray157 = new int[5];

	@OriginalMember(owner = "client!VUJNNHKQ", name = "w", descriptor = "[I")
	private static int[] anIntArray158 = new int[5];

	@OriginalMember(owner = "client!VUJNNHKQ", name = "x", descriptor = "[I")
	private static int[] anIntArray159 = new int[5];

	@OriginalMember(owner = "client!VUJNNHKQ", name = "y", descriptor = "[I")
	private static int[] anIntArray160 = new int[5];

	@OriginalMember(owner = "client!VUJNNHKQ", name = "a", descriptor = "Lclient!MMADHCLT;")
	private Class20 aClass20_1;

	@OriginalMember(owner = "client!VUJNNHKQ", name = "b", descriptor = "Lclient!MMADHCLT;")
	private Class20 aClass20_2;

	@OriginalMember(owner = "client!VUJNNHKQ", name = "c", descriptor = "Lclient!MMADHCLT;")
	private Class20 aClass20_3;

	@OriginalMember(owner = "client!VUJNNHKQ", name = "d", descriptor = "Lclient!MMADHCLT;")
	private Class20 aClass20_4;

	@OriginalMember(owner = "client!VUJNNHKQ", name = "e", descriptor = "Lclient!MMADHCLT;")
	private Class20 aClass20_5;

	@OriginalMember(owner = "client!VUJNNHKQ", name = "f", descriptor = "Lclient!MMADHCLT;")
	private Class20 aClass20_6;

	@OriginalMember(owner = "client!VUJNNHKQ", name = "g", descriptor = "Lclient!MMADHCLT;")
	private Class20 aClass20_7;

	@OriginalMember(owner = "client!VUJNNHKQ", name = "h", descriptor = "Lclient!MMADHCLT;")
	private Class20 aClass20_8;

	@OriginalMember(owner = "client!VUJNNHKQ", name = "l", descriptor = "I")
	private int anInt700;

	@OriginalMember(owner = "client!VUJNNHKQ", name = "n", descriptor = "Lclient!RMKIQWOG;")
	private Class34 aClass34_1;

	@OriginalMember(owner = "client!VUJNNHKQ", name = "o", descriptor = "Lclient!MMADHCLT;")
	private Class20 aClass20_9;

	@OriginalMember(owner = "client!VUJNNHKQ", name = "q", descriptor = "I")
	public int anInt703;

	@OriginalMember(owner = "client!VUJNNHKQ", name = "i", descriptor = "[I")
	private int[] anIntArray150 = new int[5];

	@OriginalMember(owner = "client!VUJNNHKQ", name = "j", descriptor = "[I")
	private int[] anIntArray151 = new int[5];

	@OriginalMember(owner = "client!VUJNNHKQ", name = "k", descriptor = "[I")
	private int[] anIntArray152 = new int[5];

	@OriginalMember(owner = "client!VUJNNHKQ", name = "m", descriptor = "I")
	private int anInt701 = 100;

	@OriginalMember(owner = "client!VUJNNHKQ", name = "p", descriptor = "I")
	public int anInt702 = 500;

	@OriginalMember(owner = "client!VUJNNHKQ", name = "a", descriptor = "()V")
	public static void method470() {
		anIntArray154 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray154[local6] = 1;
			} else {
				anIntArray154[local6] = -1;
			}
		}
		anIntArray155 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray155[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray153 = new int[220500];
	}

	@OriginalMember(owner = "client!VUJNNHKQ", name = "a", descriptor = "(II)[I")
	public int[] method471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray153[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray153;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass20_1.method285();
		this.aClass20_2.method285();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass20_3 != null) {
			this.aClass20_3.method285();
			this.aClass20_4.method285();
			local36 = (int) ((double) (this.aClass20_3.anInt446 - this.aClass20_3.anInt445) * 32.768D / local26);
			local38 = (int) ((double) this.aClass20_3.anInt445 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass20_5 != null) {
			this.aClass20_5.method285();
			this.aClass20_6.method285();
			local77 = (int) ((double) (this.aClass20_5.anInt446 - this.aClass20_5.anInt445) * 32.768D / local26);
			local79 = (int) ((double) this.aClass20_5.anInt445 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray150[local118] != 0) {
				anIntArray156[local118] = 0;
				anIntArray157[local118] = (int) ((double) this.anIntArray152[local118] * local26);
				anIntArray158[local118] = (this.anIntArray150[local118] << 14) / 100;
				anIntArray159[local118] = (int) ((double) (this.aClass20_1.anInt446 - this.aClass20_1.anInt445) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray151[local118]) / local26);
				anIntArray160[local118] = (int) ((double) this.aClass20_1.anInt445 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass20_1.method286((byte) 1, arg0);
			local207 = this.aClass20_2.method286((byte) 1, arg0);
			if (this.aClass20_3 != null) {
				local216 = this.aClass20_3.method286((byte) 1, arg0);
				local222 = this.aClass20_4.method286((byte) 1, arg0);
				local201 += this.method472(this.aClass20_3.anInt447, local222, local40) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass20_5 != null) {
				local216 = this.aClass20_5.method286((byte) 1, arg0);
				local222 = this.aClass20_6.method286((byte) 1, arg0);
				local207 = local207 * ((this.method472(this.aClass20_5.anInt447, local222, local81) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray150[local216] != 0) {
					local222 = local193 + anIntArray157[local216];
					if (local222 < arg0) {
						anIntArray153[local222] += this.method472(this.aClass20_1.anInt447, local207 * anIntArray158[local216] >> 15, anIntArray156[local216]);
						anIntArray156[local216] += (local201 * anIntArray159[local216] >> 16) + anIntArray160[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass20_7 != null) {
			this.aClass20_7.method285();
			this.aClass20_8.method285();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass20_7.method286((byte) 1, arg0);
				local385 = this.aClass20_8.method286((byte) 1, arg0);
				if (local369) {
					local207 = this.aClass20_7.anInt445 + ((this.aClass20_7.anInt446 - this.aClass20_7.anInt445) * local379 >> 8);
				} else {
					local207 = this.aClass20_7.anInt445 + ((this.aClass20_7.anInt446 - this.aClass20_7.anInt445) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray153[local222] = 0;
				}
			}
		}
		if (this.anInt700 > 0 && this.anInt701 > 0) {
			local201 = (int) ((double) this.anInt700 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray153[local207] += anIntArray153[local207 - local201] * this.anInt701 / 100;
			}
		}
		if (this.aClass34_1.anIntArray133[0] > 0 || this.aClass34_1.anIntArray133[1] > 0) {
			this.aClass20_9.method285();
			local201 = this.aClass20_9.method286((byte) 1, arg0 + 1);
			local207 = this.aClass34_1.method376(0, (float) local201 / 65536.0F);
			local216 = this.aClass34_1.method376(1, (float) local201 / 65536.0F);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray153[local222 + local207] * (long) Class34.anInt571 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray153[local222 + local207 - local559 - 1] * (long) Class34.anIntArrayArray16[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray153[local222 - local590 - 1] * (long) Class34.anIntArrayArray16[1][local590] >> 16);
					}
					anIntArray153[local222] = local385;
					local201 = this.aClass20_9.method286((byte) 1, arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray153[local222 + local207] * (long) Class34.anInt571 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray153[local222 + local207 - local590 - 1] * (long) Class34.anIntArrayArray16[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray153[local222 - local694 - 1] * (long) Class34.anIntArrayArray16[1][local694] >> 16);
						}
						anIntArray153[local222] = local559;
						local201 = this.aClass20_9.method286((byte) 1, arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray153[local222 + local207 - local590 - 1] * (long) Class34.anIntArrayArray16[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray153[local222 - local694 - 1] * (long) Class34.anIntArrayArray16[1][local694] >> 16);
							}
							anIntArray153[local222] = local559;
							this.aClass20_9.method286((byte) 1, arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass34_1.method376(0, (float) local201 / 65536.0F);
					local216 = this.aClass34_1.method376(1, (float) local201 / 65536.0F);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray153[local201] < -32768) {
				anIntArray153[local201] = -32768;
			}
			if (anIntArray153[local201] > 32767) {
				anIntArray153[local201] = 32767;
			}
		}
		return anIntArray153;
	}

	@OriginalMember(owner = "client!VUJNNHKQ", name = "a", descriptor = "(IIZI)I")
	private int method472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 == 1) {
				return (arg2 & 0x7FFF) < 16384 ? arg1 : -arg1;
			} else if (arg0 == 2) {
				return anIntArray155[arg2 & 0x7FFF] * arg1 >> 14;
			} else if (arg0 == 3) {
				return ((arg2 & 0x7FFF) * arg1 >> 14) - arg1;
			} else if (arg0 == 4) {
				return anIntArray154[arg2 / 2607 & 0x7FFF] * arg1;
			} else {
				return 0;
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("40113, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VUJNNHKQ", name = "a", descriptor = "(ILclient!UAWAYCTK;)V")
	public void method473(@OriginalArg(1) Class6_Sub2_Sub3 arg0) {
		try {
			this.aClass20_1 = new Class20();
			this.aClass20_1.method283(arg0);
			this.aClass20_2 = new Class20();
			this.aClass20_2.method283(arg0);
			@Pc(24) int local24 = arg0.method402();
			if (local24 != 0) {
				arg0.anInt609--;
				this.aClass20_3 = new Class20();
				this.aClass20_3.method283(arg0);
				this.aClass20_4 = new Class20();
				this.aClass20_4.method283(arg0);
			}
			local24 = arg0.method402();
			if (local24 != 0) {
				arg0.anInt609--;
				this.aClass20_5 = new Class20();
				this.aClass20_5.method283(arg0);
				this.aClass20_6 = new Class20();
				this.aClass20_6.method283(arg0);
			}
			local24 = arg0.method402();
			if (local24 != 0) {
				arg0.anInt609--;
				this.aClass20_7 = new Class20();
				this.aClass20_7.method283(arg0);
				this.aClass20_8 = new Class20();
				this.aClass20_8.method283(arg0);
			}
			for (@Pc(116) int local116 = 0; local116 < 10; local116++) {
				@Pc(127) int local127 = arg0.method416();
				if (local127 == 0) {
					break;
				}
				this.anIntArray150[local116] = local127;
				this.anIntArray151[local116] = arg0.method415();
				this.anIntArray152[local116] = arg0.method416();
			}
			this.anInt700 = arg0.method416();
			this.anInt701 = arg0.method416();
			this.anInt702 = arg0.method404();
			this.anInt703 = arg0.method404();
			this.aClass34_1 = new Class34();
			this.aClass20_9 = new Class20();
			this.aClass34_1.method377(arg0, this.aClass20_9);
		} catch (@Pc(195) RuntimeException local195) {
			signlink.reporterror("61395, " + -7321 + ", " + arg0 + ", " + local195.toString());
			throw new RuntimeException();
		}
	}
}
