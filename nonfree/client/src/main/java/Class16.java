import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ILFXQDER")
public final class Class16 {

	@OriginalMember(owner = "client!ILFXQDER", name = "u", descriptor = "[I")
	private static int[] anIntArray59;

	@OriginalMember(owner = "client!ILFXQDER", name = "v", descriptor = "[I")
	private static int[] anIntArray60;

	@OriginalMember(owner = "client!ILFXQDER", name = "w", descriptor = "[I")
	private static int[] anIntArray61;

	@OriginalMember(owner = "client!ILFXQDER", name = "c", descriptor = "B")
	private static byte aByte12 = 2;

	@OriginalMember(owner = "client!ILFXQDER", name = "x", descriptor = "[I")
	private static int[] anIntArray62 = new int[5];

	@OriginalMember(owner = "client!ILFXQDER", name = "y", descriptor = "[I")
	private static int[] anIntArray63 = new int[5];

	@OriginalMember(owner = "client!ILFXQDER", name = "z", descriptor = "[I")
	private static int[] anIntArray64 = new int[5];

	@OriginalMember(owner = "client!ILFXQDER", name = "A", descriptor = "[I")
	private static int[] anIntArray65 = new int[5];

	@OriginalMember(owner = "client!ILFXQDER", name = "B", descriptor = "[I")
	private static int[] anIntArray66 = new int[5];

	@OriginalMember(owner = "client!ILFXQDER", name = "d", descriptor = "Lclient!UHTSXKVU;")
	private Class38 aClass38_1;

	@OriginalMember(owner = "client!ILFXQDER", name = "e", descriptor = "Lclient!UHTSXKVU;")
	private Class38 aClass38_2;

	@OriginalMember(owner = "client!ILFXQDER", name = "f", descriptor = "Lclient!UHTSXKVU;")
	private Class38 aClass38_3;

	@OriginalMember(owner = "client!ILFXQDER", name = "g", descriptor = "Lclient!UHTSXKVU;")
	private Class38 aClass38_4;

	@OriginalMember(owner = "client!ILFXQDER", name = "h", descriptor = "Lclient!UHTSXKVU;")
	private Class38 aClass38_5;

	@OriginalMember(owner = "client!ILFXQDER", name = "i", descriptor = "Lclient!UHTSXKVU;")
	private Class38 aClass38_6;

	@OriginalMember(owner = "client!ILFXQDER", name = "j", descriptor = "Lclient!UHTSXKVU;")
	private Class38 aClass38_7;

	@OriginalMember(owner = "client!ILFXQDER", name = "k", descriptor = "Lclient!UHTSXKVU;")
	private Class38 aClass38_8;

	@OriginalMember(owner = "client!ILFXQDER", name = "o", descriptor = "I")
	private int anInt211;

	@OriginalMember(owner = "client!ILFXQDER", name = "q", descriptor = "Lclient!XSKZRAYI;")
	private Class44 aClass44_1;

	@OriginalMember(owner = "client!ILFXQDER", name = "r", descriptor = "Lclient!UHTSXKVU;")
	private Class38 aClass38_9;

	@OriginalMember(owner = "client!ILFXQDER", name = "t", descriptor = "I")
	public int anInt214;

	@OriginalMember(owner = "client!ILFXQDER", name = "a", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!ILFXQDER", name = "b", descriptor = "I")
	private int anInt210 = 290;

	@OriginalMember(owner = "client!ILFXQDER", name = "l", descriptor = "[I")
	private int[] anIntArray56 = new int[5];

	@OriginalMember(owner = "client!ILFXQDER", name = "m", descriptor = "[I")
	private int[] anIntArray57 = new int[5];

	@OriginalMember(owner = "client!ILFXQDER", name = "n", descriptor = "[I")
	private int[] anIntArray58 = new int[5];

	@OriginalMember(owner = "client!ILFXQDER", name = "p", descriptor = "I")
	private int anInt212 = 100;

	@OriginalMember(owner = "client!ILFXQDER", name = "s", descriptor = "I")
	public int anInt213 = 500;

	@OriginalMember(owner = "client!ILFXQDER", name = "a", descriptor = "()V")
	public static void method129() {
		anIntArray60 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray60[local6] = 1;
			} else {
				anIntArray60[local6] = -1;
			}
		}
		anIntArray61 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray61[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray59 = new int[220500];
	}

	@OriginalMember(owner = "client!ILFXQDER", name = "a", descriptor = "(II)[I")
	public int[] method130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray59[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray59;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass38_1.method400();
		this.aClass38_2.method400();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass38_3 != null) {
			this.aClass38_3.method400();
			this.aClass38_4.method400();
			local36 = (int) ((double) (this.aClass38_3.anInt628 - this.aClass38_3.anInt627) * 32.768D / local26);
			local38 = (int) ((double) this.aClass38_3.anInt627 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass38_5 != null) {
			this.aClass38_5.method400();
			this.aClass38_6.method400();
			local77 = (int) ((double) (this.aClass38_5.anInt628 - this.aClass38_5.anInt627) * 32.768D / local26);
			local79 = (int) ((double) this.aClass38_5.anInt627 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray56[local118] != 0) {
				anIntArray62[local118] = 0;
				anIntArray63[local118] = (int) ((double) this.anIntArray58[local118] * local26);
				anIntArray64[local118] = (this.anIntArray56[local118] << 14) / 100;
				anIntArray65[local118] = (int) ((double) (this.aClass38_1.anInt628 - this.aClass38_1.anInt627) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray57[local118]) / local26);
				anIntArray66[local118] = (int) ((double) this.aClass38_1.anInt627 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass38_1.method401(arg0);
			local207 = this.aClass38_2.method401(arg0);
			if (this.aClass38_3 != null) {
				local216 = this.aClass38_3.method401(arg0);
				local222 = this.aClass38_4.method401(arg0);
				local201 += this.method131(local222, local40, this.aClass38_3.anInt629) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass38_5 != null) {
				local216 = this.aClass38_5.method401(arg0);
				local222 = this.aClass38_6.method401(arg0);
				local207 = local207 * ((this.method131(local222, local81, this.aClass38_5.anInt629) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray56[local216] != 0) {
					local222 = local193 + anIntArray63[local216];
					if (local222 < arg0) {
						anIntArray59[local222] += this.method131(local207 * anIntArray64[local216] >> 15, anIntArray62[local216], this.aClass38_1.anInt629);
						anIntArray62[local216] += (local201 * anIntArray65[local216] >> 16) + anIntArray66[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass38_7 != null) {
			this.aClass38_7.method400();
			this.aClass38_8.method400();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass38_7.method401(arg0);
				local385 = this.aClass38_8.method401(arg0);
				if (local369) {
					local207 = this.aClass38_7.anInt627 + ((this.aClass38_7.anInt628 - this.aClass38_7.anInt627) * local379 >> 8);
				} else {
					local207 = this.aClass38_7.anInt627 + ((this.aClass38_7.anInt628 - this.aClass38_7.anInt627) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray59[local222] = 0;
				}
			}
		}
		if (this.anInt211 > 0 && this.anInt212 > 0) {
			local201 = (int) ((double) this.anInt211 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray59[local207] += anIntArray59[local207 - local201] * this.anInt212 / 100;
			}
		}
		if (this.aClass44_1.anIntArray193[0] > 0 || this.aClass44_1.anIntArray193[1] > 0) {
			this.aClass38_9.method400();
			local201 = this.aClass38_9.method401(arg0 + 1);
			local207 = this.aClass44_1.method505(aByte12, 0, (float) local201 / 65536.0F);
			local216 = this.aClass44_1.method505(aByte12, 1, (float) local201 / 65536.0F);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray59[local222 + local207] * (long) Class44.anInt728 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray59[local222 + local207 - local559 - 1] * (long) Class44.anIntArrayArray19[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray59[local222 - local590 - 1] * (long) Class44.anIntArrayArray19[1][local590] >> 16);
					}
					anIntArray59[local222] = local385;
					local201 = this.aClass38_9.method401(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray59[local222 + local207] * (long) Class44.anInt728 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray59[local222 + local207 - local590 - 1] * (long) Class44.anIntArrayArray19[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray59[local222 - local694 - 1] * (long) Class44.anIntArrayArray19[1][local694] >> 16);
						}
						anIntArray59[local222] = local559;
						local201 = this.aClass38_9.method401(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray59[local222 + local207 - local590 - 1] * (long) Class44.anIntArrayArray19[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray59[local222 - local694 - 1] * (long) Class44.anIntArrayArray19[1][local694] >> 16);
							}
							anIntArray59[local222] = local559;
							this.aClass38_9.method401(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass44_1.method505(aByte12, 0, (float) local201 / 65536.0F);
					local216 = this.aClass44_1.method505(aByte12, 1, (float) local201 / 65536.0F);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray59[local201] < -32768) {
				anIntArray59[local201] = -32768;
			}
			if (anIntArray59[local201] > 32767) {
				anIntArray59[local201] = 32767;
			}
		}
		return anIntArray59;
	}

	@OriginalMember(owner = "client!ILFXQDER", name = "a", descriptor = "(IIIB)I")
	private int method131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 == 1) {
				return (arg1 & 0x7FFF) < 16384 ? arg0 : -arg0;
			} else if (arg2 == 2) {
				return anIntArray61[arg1 & 0x7FFF] * arg0 >> 14;
			} else if (arg2 == 3) {
				return ((arg1 & 0x7FFF) * arg0 >> 14) - arg0;
			} else if (arg2 == 4) {
				return anIntArray60[arg1 / 2607 & 0x7FFF] * arg0;
			} else {
				return 0;
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("86335, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -28 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ILFXQDER", name = "a", descriptor = "(Lclient!RSWRPCHR;B)V")
	public void method132(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			this.aClass38_1 = new Class38();
			this.aClass38_1.method398(arg0);
			this.aClass38_2 = new Class38();
			this.aClass38_2.method398(arg0);
			@Pc(24) int local24 = arg0.method340();
			if (local24 != 0) {
				arg0.anInt556--;
				this.aClass38_3 = new Class38();
				this.aClass38_3.method398(arg0);
				this.aClass38_4 = new Class38();
				this.aClass38_4.method398(arg0);
			}
			local24 = arg0.method340();
			if (local24 != 0) {
				arg0.anInt556--;
				this.aClass38_5 = new Class38();
				this.aClass38_5.method398(arg0);
				this.aClass38_6 = new Class38();
				this.aClass38_6.method398(arg0);
			}
			local24 = arg0.method340();
			if (local24 != 0) {
				arg0.anInt556--;
				this.aClass38_7 = new Class38();
				this.aClass38_7.method398(arg0);
				this.aClass38_8 = new Class38();
				this.aClass38_8.method398(arg0);
			}
			for (@Pc(116) int local116 = 0; local116 < 10; local116++) {
				@Pc(127) int local127 = arg0.method354();
				if (local127 == 0) {
					break;
				}
				this.anIntArray56[local116] = local127;
				this.anIntArray57[local116] = arg0.method353();
				this.anIntArray58[local116] = arg0.method354();
			}
			this.anInt211 = arg0.method354();
			this.anInt212 = arg0.method354();
			this.anInt213 = arg0.method342();
			this.anInt214 = arg0.method342();
			this.aClass44_1 = new Class44();
			this.aClass38_9 = new Class38();
			this.aClass44_1.method506(this.aClass38_9, 635, arg0);
		} catch (@Pc(191) RuntimeException local191) {
			signlink.reporterror("66149, " + arg0 + ", " + 46 + ", " + local191.toString());
			throw new RuntimeException();
		}
	}
}
