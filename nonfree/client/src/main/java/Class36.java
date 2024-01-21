import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QCXYCZNF")
public final class Class36 {

	@OriginalMember(owner = "client!QCXYCZNF", name = "s", descriptor = "[I")
	private static int[] anIntArray97;

	@OriginalMember(owner = "client!QCXYCZNF", name = "t", descriptor = "[I")
	private static int[] anIntArray98;

	@OriginalMember(owner = "client!QCXYCZNF", name = "u", descriptor = "[I")
	private static int[] anIntArray99;

	@OriginalMember(owner = "client!QCXYCZNF", name = "v", descriptor = "[I")
	private static int[] anIntArray100 = new int[5];

	@OriginalMember(owner = "client!QCXYCZNF", name = "w", descriptor = "[I")
	private static int[] anIntArray101 = new int[5];

	@OriginalMember(owner = "client!QCXYCZNF", name = "x", descriptor = "[I")
	private static int[] anIntArray102 = new int[5];

	@OriginalMember(owner = "client!QCXYCZNF", name = "y", descriptor = "[I")
	private static int[] anIntArray103 = new int[5];

	@OriginalMember(owner = "client!QCXYCZNF", name = "z", descriptor = "[I")
	private static int[] anIntArray104 = new int[5];

	@OriginalMember(owner = "client!QCXYCZNF", name = "b", descriptor = "Lclient!SSKEPHYP;")
	private Class40 aClass40_1;

	@OriginalMember(owner = "client!QCXYCZNF", name = "c", descriptor = "Lclient!SSKEPHYP;")
	private Class40 aClass40_2;

	@OriginalMember(owner = "client!QCXYCZNF", name = "d", descriptor = "Lclient!SSKEPHYP;")
	private Class40 aClass40_3;

	@OriginalMember(owner = "client!QCXYCZNF", name = "e", descriptor = "Lclient!SSKEPHYP;")
	private Class40 aClass40_4;

	@OriginalMember(owner = "client!QCXYCZNF", name = "f", descriptor = "Lclient!SSKEPHYP;")
	private Class40 aClass40_5;

	@OriginalMember(owner = "client!QCXYCZNF", name = "g", descriptor = "Lclient!SSKEPHYP;")
	private Class40 aClass40_6;

	@OriginalMember(owner = "client!QCXYCZNF", name = "h", descriptor = "Lclient!SSKEPHYP;")
	private Class40 aClass40_7;

	@OriginalMember(owner = "client!QCXYCZNF", name = "i", descriptor = "Lclient!SSKEPHYP;")
	private Class40 aClass40_8;

	@OriginalMember(owner = "client!QCXYCZNF", name = "m", descriptor = "I")
	private int anInt552;

	@OriginalMember(owner = "client!QCXYCZNF", name = "o", descriptor = "Lclient!LNMFPXZK;")
	private Class24 aClass24_1;

	@OriginalMember(owner = "client!QCXYCZNF", name = "p", descriptor = "Lclient!SSKEPHYP;")
	private Class40 aClass40_9;

	@OriginalMember(owner = "client!QCXYCZNF", name = "r", descriptor = "I")
	public int anInt555;

	@OriginalMember(owner = "client!QCXYCZNF", name = "a", descriptor = "I")
	private int anInt551 = 4;

	@OriginalMember(owner = "client!QCXYCZNF", name = "j", descriptor = "[I")
	private int[] anIntArray94 = new int[5];

	@OriginalMember(owner = "client!QCXYCZNF", name = "k", descriptor = "[I")
	private int[] anIntArray95 = new int[5];

	@OriginalMember(owner = "client!QCXYCZNF", name = "l", descriptor = "[I")
	private int[] anIntArray96 = new int[5];

	@OriginalMember(owner = "client!QCXYCZNF", name = "n", descriptor = "I")
	private int anInt553 = 100;

	@OriginalMember(owner = "client!QCXYCZNF", name = "q", descriptor = "I")
	public int anInt554 = 500;

	@OriginalMember(owner = "client!QCXYCZNF", name = "a", descriptor = "()V")
	public static void method360() {
		anIntArray98 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray98[local6] = 1;
			} else {
				anIntArray98[local6] = -1;
			}
		}
		anIntArray99 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray99[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray97 = new int[220500];
	}

	@OriginalMember(owner = "client!QCXYCZNF", name = "a", descriptor = "(II)[I")
	public int[] method361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray97[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray97;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass40_1.method442();
		this.aClass40_2.method442();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass40_3 != null) {
			this.aClass40_3.method442();
			this.aClass40_4.method442();
			local36 = (int) ((double) (this.aClass40_3.anInt630 - this.aClass40_3.anInt629) * 32.768D / local26);
			local38 = (int) ((double) this.aClass40_3.anInt629 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass40_5 != null) {
			this.aClass40_5.method442();
			this.aClass40_6.method442();
			local77 = (int) ((double) (this.aClass40_5.anInt630 - this.aClass40_5.anInt629) * 32.768D / local26);
			local79 = (int) ((double) this.aClass40_5.anInt629 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray94[local118] != 0) {
				anIntArray100[local118] = 0;
				anIntArray101[local118] = (int) ((double) this.anIntArray96[local118] * local26);
				anIntArray102[local118] = (this.anIntArray94[local118] << 14) / 100;
				anIntArray103[local118] = (int) ((double) (this.aClass40_1.anInt630 - this.aClass40_1.anInt629) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray95[local118]) / local26);
				anIntArray104[local118] = (int) ((double) this.aClass40_1.anInt629 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass40_1.method443(arg0);
			local207 = this.aClass40_2.method443(arg0);
			if (this.aClass40_3 != null) {
				local216 = this.aClass40_3.method443(arg0);
				local222 = this.aClass40_4.method443(arg0);
				local201 += this.method362(this.aClass40_3.anInt631, local40, local222) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass40_5 != null) {
				local216 = this.aClass40_5.method443(arg0);
				local222 = this.aClass40_6.method443(arg0);
				local207 = local207 * ((this.method362(this.aClass40_5.anInt631, local81, local222) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray94[local216] != 0) {
					local222 = local193 + anIntArray101[local216];
					if (local222 < arg0) {
						anIntArray97[local222] += this.method362(this.aClass40_1.anInt631, anIntArray100[local216], local207 * anIntArray102[local216] >> 15);
						anIntArray100[local216] += (local201 * anIntArray103[local216] >> 16) + anIntArray104[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass40_7 != null) {
			this.aClass40_7.method442();
			this.aClass40_8.method442();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass40_7.method443(arg0);
				local385 = this.aClass40_8.method443(arg0);
				if (local369) {
					local207 = this.aClass40_7.anInt629 + ((this.aClass40_7.anInt630 - this.aClass40_7.anInt629) * local379 >> 8);
				} else {
					local207 = this.aClass40_7.anInt629 + ((this.aClass40_7.anInt630 - this.aClass40_7.anInt629) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray97[local222] = 0;
				}
			}
		}
		if (this.anInt552 > 0 && this.anInt553 > 0) {
			local201 = (int) ((double) this.anInt552 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray97[local207] += anIntArray97[local207 - local201] * this.anInt553 / 100;
			}
		}
		if (this.aClass24_1.anIntArray80[0] > 0 || this.aClass24_1.anIntArray80[1] > 0) {
			this.aClass40_9.method442();
			local201 = this.aClass40_9.method443(arg0 + 1);
			local207 = this.aClass24_1.method300((float) local201 / 65536.0F, 0);
			local216 = this.aClass24_1.method300((float) local201 / 65536.0F, 1);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray97[local222 + local207] * (long) Class24.anInt404 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray97[local222 + local207 - local559 - 1] * (long) Class24.anIntArrayArray8[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray97[local222 - local590 - 1] * (long) Class24.anIntArrayArray8[1][local590] >> 16);
					}
					anIntArray97[local222] = local385;
					local201 = this.aClass40_9.method443(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray97[local222 + local207] * (long) Class24.anInt404 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray97[local222 + local207 - local590 - 1] * (long) Class24.anIntArrayArray8[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray97[local222 - local694 - 1] * (long) Class24.anIntArrayArray8[1][local694] >> 16);
						}
						anIntArray97[local222] = local559;
						local201 = this.aClass40_9.method443(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray97[local222 + local207 - local590 - 1] * (long) Class24.anIntArrayArray8[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray97[local222 - local694 - 1] * (long) Class24.anIntArrayArray8[1][local694] >> 16);
							}
							anIntArray97[local222] = local559;
							this.aClass40_9.method443(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass24_1.method300((float) local201 / 65536.0F, 0);
					local216 = this.aClass24_1.method300((float) local201 / 65536.0F, 1);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray97[local201] < -32768) {
				anIntArray97[local201] = -32768;
			}
			if (anIntArray97[local201] > 32767) {
				anIntArray97[local201] = 32767;
			}
		}
		return anIntArray97;
	}

	@OriginalMember(owner = "client!QCXYCZNF", name = "a", descriptor = "(ZIII)I")
	private int method362(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 == 1) {
				return (arg1 & 0x7FFF) < 16384 ? arg2 : -arg2;
			} else if (arg0 == 2) {
				return anIntArray99[arg1 & 0x7FFF] * arg2 >> 14;
			} else if (arg0 == 3) {
				return ((arg1 & 0x7FFF) * arg2 >> 14) - arg2;
			} else if (arg0 == 4) {
				return anIntArray98[arg1 / 2607 & 0x7FFF] * arg2;
			} else {
				return 0;
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("65131, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QCXYCZNF", name = "a", descriptor = "(Lclient!JHKSAGUC;I)V")
	public void method363(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			this.aClass40_1 = new Class40();
			this.aClass40_1.method440(arg0);
			this.aClass40_2 = new Class40();
			this.aClass40_2.method440(arg0);
			@Pc(24) int local24 = arg0.method238();
			if (local24 != 0) {
				arg0.anInt352--;
				this.aClass40_3 = new Class40();
				this.aClass40_3.method440(arg0);
				this.aClass40_4 = new Class40();
				this.aClass40_4.method440(arg0);
			}
			local24 = arg0.method238();
			if (local24 != 0) {
				arg0.anInt352--;
				this.aClass40_5 = new Class40();
				this.aClass40_5.method440(arg0);
				this.aClass40_6 = new Class40();
				this.aClass40_6.method440(arg0);
			}
			local24 = arg0.method238();
			if (local24 != 0) {
				arg0.anInt352--;
				this.aClass40_7 = new Class40();
				this.aClass40_7.method440(arg0);
				this.aClass40_8 = new Class40();
				this.aClass40_8.method440(arg0);
			}
			for (@Pc(116) int local116 = 0; local116 < 10; local116++) {
				@Pc(127) int local127 = arg0.method252();
				if (local127 == 0) {
					break;
				}
				this.anIntArray94[local116] = local127;
				this.anIntArray95[local116] = arg0.method251();
				this.anIntArray96[local116] = arg0.method252();
			}
			this.anInt552 = arg0.method252();
			this.anInt553 = arg0.method252();
			this.anInt554 = arg0.method240();
			this.anInt555 = arg0.method240();
			this.aClass24_1 = new Class24();
			this.aClass40_9 = new Class40();
			this.aClass24_1.method301(this.aClass40_9, arg0);
		} catch (@Pc(191) RuntimeException local191) {
			signlink.reporterror("96444, " + arg0 + ", " + 0 + ", " + local191.toString());
			throw new RuntimeException();
		}
	}
}
