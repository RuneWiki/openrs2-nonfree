import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SNQOEFQG")
public final class Class37 {

	@OriginalMember(owner = "client!SNQOEFQG", name = "s", descriptor = "[I")
	private static int[] anIntArray123;

	@OriginalMember(owner = "client!SNQOEFQG", name = "t", descriptor = "[I")
	private static int[] anIntArray124;

	@OriginalMember(owner = "client!SNQOEFQG", name = "u", descriptor = "[I")
	private static int[] anIntArray125;

	@OriginalMember(owner = "client!SNQOEFQG", name = "v", descriptor = "[I")
	private static int[] anIntArray126 = new int[5];

	@OriginalMember(owner = "client!SNQOEFQG", name = "w", descriptor = "[I")
	private static int[] anIntArray127 = new int[5];

	@OriginalMember(owner = "client!SNQOEFQG", name = "x", descriptor = "[I")
	private static int[] anIntArray128 = new int[5];

	@OriginalMember(owner = "client!SNQOEFQG", name = "y", descriptor = "[I")
	private static int[] anIntArray129 = new int[5];

	@OriginalMember(owner = "client!SNQOEFQG", name = "z", descriptor = "[I")
	private static int[] anIntArray130 = new int[5];

	@OriginalMember(owner = "client!SNQOEFQG", name = "b", descriptor = "Lclient!TDXKKGZV;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!SNQOEFQG", name = "c", descriptor = "Lclient!TDXKKGZV;")
	private Class39 aClass39_2;

	@OriginalMember(owner = "client!SNQOEFQG", name = "d", descriptor = "Lclient!TDXKKGZV;")
	private Class39 aClass39_3;

	@OriginalMember(owner = "client!SNQOEFQG", name = "e", descriptor = "Lclient!TDXKKGZV;")
	private Class39 aClass39_4;

	@OriginalMember(owner = "client!SNQOEFQG", name = "f", descriptor = "Lclient!TDXKKGZV;")
	private Class39 aClass39_5;

	@OriginalMember(owner = "client!SNQOEFQG", name = "g", descriptor = "Lclient!TDXKKGZV;")
	private Class39 aClass39_6;

	@OriginalMember(owner = "client!SNQOEFQG", name = "h", descriptor = "Lclient!TDXKKGZV;")
	private Class39 aClass39_7;

	@OriginalMember(owner = "client!SNQOEFQG", name = "i", descriptor = "Lclient!TDXKKGZV;")
	private Class39 aClass39_8;

	@OriginalMember(owner = "client!SNQOEFQG", name = "m", descriptor = "I")
	private int anInt595;

	@OriginalMember(owner = "client!SNQOEFQG", name = "o", descriptor = "Lclient!ADELCBNY;")
	private Class1 aClass1_1;

	@OriginalMember(owner = "client!SNQOEFQG", name = "p", descriptor = "Lclient!TDXKKGZV;")
	private Class39 aClass39_9;

	@OriginalMember(owner = "client!SNQOEFQG", name = "r", descriptor = "I")
	public int anInt598;

	@OriginalMember(owner = "client!SNQOEFQG", name = "a", descriptor = "I")
	private int anInt594 = 8;

	@OriginalMember(owner = "client!SNQOEFQG", name = "j", descriptor = "[I")
	private int[] anIntArray120 = new int[5];

	@OriginalMember(owner = "client!SNQOEFQG", name = "k", descriptor = "[I")
	private int[] anIntArray121 = new int[5];

	@OriginalMember(owner = "client!SNQOEFQG", name = "l", descriptor = "[I")
	private int[] anIntArray122 = new int[5];

	@OriginalMember(owner = "client!SNQOEFQG", name = "n", descriptor = "I")
	private int anInt596 = 100;

	@OriginalMember(owner = "client!SNQOEFQG", name = "q", descriptor = "I")
	public int anInt597 = 500;

	@OriginalMember(owner = "client!SNQOEFQG", name = "a", descriptor = "()V")
	public static void method394() {
		anIntArray124 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray124[local6] = 1;
			} else {
				anIntArray124[local6] = -1;
			}
		}
		anIntArray125 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray125[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray123 = new int[220500];
	}

	@OriginalMember(owner = "client!SNQOEFQG", name = "a", descriptor = "(II)[I")
	public int[] method395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray123[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray123;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass39_1.method424();
		this.aClass39_2.method424();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass39_3 != null) {
			this.aClass39_3.method424();
			this.aClass39_4.method424();
			local36 = (int) ((double) (this.aClass39_3.anInt626 - this.aClass39_3.anInt625) * 32.768D / local26);
			local38 = (int) ((double) this.aClass39_3.anInt625 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass39_5 != null) {
			this.aClass39_5.method424();
			this.aClass39_6.method424();
			local77 = (int) ((double) (this.aClass39_5.anInt626 - this.aClass39_5.anInt625) * 32.768D / local26);
			local79 = (int) ((double) this.aClass39_5.anInt625 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray120[local118] != 0) {
				anIntArray126[local118] = 0;
				anIntArray127[local118] = (int) ((double) this.anIntArray122[local118] * local26);
				anIntArray128[local118] = (this.anIntArray120[local118] << 14) / 100;
				anIntArray129[local118] = (int) ((double) (this.aClass39_1.anInt626 - this.aClass39_1.anInt625) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray121[local118]) / local26);
				anIntArray130[local118] = (int) ((double) this.aClass39_1.anInt625 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass39_1.method425(arg0);
			local207 = this.aClass39_2.method425(arg0);
			if (this.aClass39_3 != null) {
				local216 = this.aClass39_3.method425(arg0);
				local222 = this.aClass39_4.method425(arg0);
				local201 += this.method396(local222, this.aClass39_3.anInt627, local40) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass39_5 != null) {
				local216 = this.aClass39_5.method425(arg0);
				local222 = this.aClass39_6.method425(arg0);
				local207 = local207 * ((this.method396(local222, this.aClass39_5.anInt627, local81) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray120[local216] != 0) {
					local222 = local193 + anIntArray127[local216];
					if (local222 < arg0) {
						anIntArray123[local222] += this.method396(local207 * anIntArray128[local216] >> 15, this.aClass39_1.anInt627, anIntArray126[local216]);
						anIntArray126[local216] += (local201 * anIntArray129[local216] >> 16) + anIntArray130[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass39_7 != null) {
			this.aClass39_7.method424();
			this.aClass39_8.method424();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass39_7.method425(arg0);
				local385 = this.aClass39_8.method425(arg0);
				if (local369) {
					local207 = this.aClass39_7.anInt625 + ((this.aClass39_7.anInt626 - this.aClass39_7.anInt625) * local379 >> 8);
				} else {
					local207 = this.aClass39_7.anInt625 + ((this.aClass39_7.anInt626 - this.aClass39_7.anInt625) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray123[local222] = 0;
				}
			}
		}
		if (this.anInt595 > 0 && this.anInt596 > 0) {
			local201 = (int) ((double) this.anInt595 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray123[local207] += anIntArray123[local207 - local201] * this.anInt596 / 100;
			}
		}
		if (this.aClass1_1.anIntArray1[0] > 0 || this.aClass1_1.anIntArray1[1] > 0) {
			this.aClass39_9.method424();
			local201 = this.aClass39_9.method425(arg0 + 1);
			local207 = this.aClass1_1.method4(0, (float) local201 / 65536.0F);
			local216 = this.aClass1_1.method4(1, (float) local201 / 65536.0F);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray123[local222 + local207] * (long) Class1.anInt1 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray123[local222 + local207 - local559 - 1] * (long) Class1.anIntArrayArray1[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray123[local222 - local590 - 1] * (long) Class1.anIntArrayArray1[1][local590] >> 16);
					}
					anIntArray123[local222] = local385;
					local201 = this.aClass39_9.method425(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray123[local222 + local207] * (long) Class1.anInt1 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray123[local222 + local207 - local590 - 1] * (long) Class1.anIntArrayArray1[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray123[local222 - local694 - 1] * (long) Class1.anIntArrayArray1[1][local694] >> 16);
						}
						anIntArray123[local222] = local559;
						local201 = this.aClass39_9.method425(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray123[local222 + local207 - local590 - 1] * (long) Class1.anIntArrayArray1[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray123[local222 - local694 - 1] * (long) Class1.anIntArrayArray1[1][local694] >> 16);
							}
							anIntArray123[local222] = local559;
							this.aClass39_9.method425(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass1_1.method4(0, (float) local201 / 65536.0F);
					local216 = this.aClass1_1.method4(1, (float) local201 / 65536.0F);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray123[local201] < -32768) {
				anIntArray123[local201] = -32768;
			}
			if (anIntArray123[local201] > 32767) {
				anIntArray123[local201] = 32767;
			}
		}
		return anIntArray123;
	}

	@OriginalMember(owner = "client!SNQOEFQG", name = "a", descriptor = "(IIII)I")
	private int method396(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 == 1) {
				return (arg2 & 0x7FFF) < 16384 ? arg0 : -arg0;
			} else if (arg1 == 2) {
				return anIntArray125[arg2 & 0x7FFF] * arg0 >> 14;
			} else if (arg1 == 3) {
				return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
			} else if (arg1 == 4) {
				return anIntArray124[arg2 / 2607 & 0x7FFF] * arg0;
			} else {
				return 0;
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("65753, " + 6 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SNQOEFQG", name = "a", descriptor = "(ILclient!IMUIZRAF;)V")
	public void method397(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub3 arg1) {
		try {
			this.aClass39_1 = new Class39();
			this.aClass39_1.method422(this.anInt594, arg1);
			this.aClass39_2 = new Class39();
			this.aClass39_2.method422(this.anInt594, arg1);
			@Pc(26) int local26 = arg1.method146();
			if (local26 != 0) {
				arg1.anInt243--;
				this.aClass39_3 = new Class39();
				this.aClass39_3.method422(this.anInt594, arg1);
				this.aClass39_4 = new Class39();
				this.aClass39_4.method422(this.anInt594, arg1);
			}
			local26 = arg1.method146();
			if (local26 != 0) {
				arg1.anInt243--;
				this.aClass39_5 = new Class39();
				this.aClass39_5.method422(this.anInt594, arg1);
				this.aClass39_6 = new Class39();
				this.aClass39_6.method422(this.anInt594, arg1);
			}
			local26 = arg1.method146();
			if (local26 != 0) {
				arg1.anInt243--;
				this.aClass39_7 = new Class39();
				this.aClass39_7.method422(this.anInt594, arg1);
				this.aClass39_8 = new Class39();
				this.aClass39_8.method422(this.anInt594, arg1);
			}
			@Pc(135) int local135;
			for (@Pc(124) int local124 = 0; local124 < 10; local124++) {
				local135 = arg1.method160();
				if (local135 == 0) {
					break;
				}
				this.anIntArray120[local124] = local135;
				this.anIntArray121[local124] = arg1.method159();
				this.anIntArray122[local124] = arg1.method160();
			}
			this.anInt595 = arg1.method160();
			this.anInt596 = arg1.method160();
			this.anInt597 = arg1.method148();
			if (arg0 != 8) {
				for (local135 = 1; local135 > 0; local135++) {
				}
			}
			this.anInt598 = arg1.method148();
			this.aClass1_1 = new Class1();
			this.aClass39_9 = new Class39();
			this.aClass1_1.method5(arg1, this.aClass39_9);
		} catch (@Pc(203) RuntimeException local203) {
			signlink.reporterror("6249, " + arg0 + ", " + arg1 + ", " + local203.toString());
			throw new RuntimeException();
		}
	}
}
