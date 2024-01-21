import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LQCMEXCE")
public final class Class27 {

	@OriginalMember(owner = "client!LQCMEXCE", name = "s", descriptor = "[I")
	private static int[] anIntArray83;

	@OriginalMember(owner = "client!LQCMEXCE", name = "t", descriptor = "[I")
	private static int[] anIntArray84;

	@OriginalMember(owner = "client!LQCMEXCE", name = "u", descriptor = "[I")
	private static int[] anIntArray85;

	@OriginalMember(owner = "client!LQCMEXCE", name = "v", descriptor = "[I")
	private static int[] anIntArray86 = new int[5];

	@OriginalMember(owner = "client!LQCMEXCE", name = "w", descriptor = "[I")
	private static int[] anIntArray87 = new int[5];

	@OriginalMember(owner = "client!LQCMEXCE", name = "x", descriptor = "[I")
	private static int[] anIntArray88 = new int[5];

	@OriginalMember(owner = "client!LQCMEXCE", name = "y", descriptor = "[I")
	private static int[] anIntArray89 = new int[5];

	@OriginalMember(owner = "client!LQCMEXCE", name = "z", descriptor = "[I")
	private static int[] anIntArray90 = new int[5];

	@OriginalMember(owner = "client!LQCMEXCE", name = "b", descriptor = "Lclient!JDDBCSRY;")
	private Class21 aClass21_1;

	@OriginalMember(owner = "client!LQCMEXCE", name = "c", descriptor = "Lclient!JDDBCSRY;")
	private Class21 aClass21_2;

	@OriginalMember(owner = "client!LQCMEXCE", name = "d", descriptor = "Lclient!JDDBCSRY;")
	private Class21 aClass21_3;

	@OriginalMember(owner = "client!LQCMEXCE", name = "e", descriptor = "Lclient!JDDBCSRY;")
	private Class21 aClass21_4;

	@OriginalMember(owner = "client!LQCMEXCE", name = "f", descriptor = "Lclient!JDDBCSRY;")
	private Class21 aClass21_5;

	@OriginalMember(owner = "client!LQCMEXCE", name = "g", descriptor = "Lclient!JDDBCSRY;")
	private Class21 aClass21_6;

	@OriginalMember(owner = "client!LQCMEXCE", name = "h", descriptor = "Lclient!JDDBCSRY;")
	private Class21 aClass21_7;

	@OriginalMember(owner = "client!LQCMEXCE", name = "i", descriptor = "Lclient!JDDBCSRY;")
	private Class21 aClass21_8;

	@OriginalMember(owner = "client!LQCMEXCE", name = "m", descriptor = "I")
	private int anInt408;

	@OriginalMember(owner = "client!LQCMEXCE", name = "o", descriptor = "Lclient!QPCNAGNU;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!LQCMEXCE", name = "p", descriptor = "Lclient!JDDBCSRY;")
	private Class21 aClass21_9;

	@OriginalMember(owner = "client!LQCMEXCE", name = "r", descriptor = "I")
	public int anInt411;

	@OriginalMember(owner = "client!LQCMEXCE", name = "a", descriptor = "Z")
	private boolean aBoolean122 = true;

	@OriginalMember(owner = "client!LQCMEXCE", name = "j", descriptor = "[I")
	private int[] anIntArray80 = new int[5];

	@OriginalMember(owner = "client!LQCMEXCE", name = "k", descriptor = "[I")
	private int[] anIntArray81 = new int[5];

	@OriginalMember(owner = "client!LQCMEXCE", name = "l", descriptor = "[I")
	private int[] anIntArray82 = new int[5];

	@OriginalMember(owner = "client!LQCMEXCE", name = "n", descriptor = "I")
	private int anInt409 = 100;

	@OriginalMember(owner = "client!LQCMEXCE", name = "q", descriptor = "I")
	public int anInt410 = 500;

	@OriginalMember(owner = "client!LQCMEXCE", name = "a", descriptor = "()V")
	public static void method219() {
		anIntArray84 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray84[local6] = 1;
			} else {
				anIntArray84[local6] = -1;
			}
		}
		anIntArray85 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray85[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray83 = new int[220500];
	}

	@OriginalMember(owner = "client!LQCMEXCE", name = "a", descriptor = "(II)[I")
	public int[] method220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray83[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray83;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass21_1.method153();
		this.aClass21_2.method153();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass21_3 != null) {
			this.aClass21_3.method153();
			this.aClass21_4.method153();
			local36 = (int) ((double) (this.aClass21_3.anInt295 - this.aClass21_3.anInt294) * 32.768D / local26);
			local38 = (int) ((double) this.aClass21_3.anInt294 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass21_5 != null) {
			this.aClass21_5.method153();
			this.aClass21_6.method153();
			local77 = (int) ((double) (this.aClass21_5.anInt295 - this.aClass21_5.anInt294) * 32.768D / local26);
			local79 = (int) ((double) this.aClass21_5.anInt294 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray80[local118] != 0) {
				anIntArray86[local118] = 0;
				anIntArray87[local118] = (int) ((double) this.anIntArray82[local118] * local26);
				anIntArray88[local118] = (this.anIntArray80[local118] << 14) / 100;
				anIntArray89[local118] = (int) ((double) (this.aClass21_1.anInt295 - this.aClass21_1.anInt294) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray81[local118]) / local26);
				anIntArray90[local118] = (int) ((double) this.aClass21_1.anInt294 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass21_1.method154((byte) 5, arg0);
			local207 = this.aClass21_2.method154((byte) 5, arg0);
			if (this.aClass21_3 != null) {
				local216 = this.aClass21_3.method154((byte) 5, arg0);
				local222 = this.aClass21_4.method154((byte) 5, arg0);
				local201 += this.method221(this.aClass21_3.anInt296, local40, local222) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass21_5 != null) {
				local216 = this.aClass21_5.method154((byte) 5, arg0);
				local222 = this.aClass21_6.method154((byte) 5, arg0);
				local207 = local207 * ((this.method221(this.aClass21_5.anInt296, local81, local222) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray80[local216] != 0) {
					local222 = local193 + anIntArray87[local216];
					if (local222 < arg0) {
						anIntArray83[local222] += this.method221(this.aClass21_1.anInt296, anIntArray86[local216], local207 * anIntArray88[local216] >> 15);
						anIntArray86[local216] += (local201 * anIntArray89[local216] >> 16) + anIntArray90[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass21_7 != null) {
			this.aClass21_7.method153();
			this.aClass21_8.method153();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass21_7.method154((byte) 5, arg0);
				local385 = this.aClass21_8.method154((byte) 5, arg0);
				if (local369) {
					local207 = this.aClass21_7.anInt294 + ((this.aClass21_7.anInt295 - this.aClass21_7.anInt294) * local379 >> 8);
				} else {
					local207 = this.aClass21_7.anInt294 + ((this.aClass21_7.anInt295 - this.aClass21_7.anInt294) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray83[local222] = 0;
				}
			}
		}
		if (this.anInt408 > 0 && this.anInt409 > 0) {
			local201 = (int) ((double) this.anInt408 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray83[local207] += anIntArray83[local207 - local201] * this.anInt409 / 100;
			}
		}
		if (this.aClass39_1.anIntArray113[0] > 0 || this.aClass39_1.anIntArray113[1] > 0) {
			this.aClass21_9.method153();
			local201 = this.aClass21_9.method154((byte) 5, arg0 + 1);
			local207 = this.aClass39_1.method287(0, (float) local201 / 65536.0F);
			local216 = this.aClass39_1.method287(1, (float) local201 / 65536.0F);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray83[local222 + local207] * (long) Class39.anInt585 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray83[local222 + local207 - local559 - 1] * (long) Class39.anIntArrayArray7[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray83[local222 - local590 - 1] * (long) Class39.anIntArrayArray7[1][local590] >> 16);
					}
					anIntArray83[local222] = local385;
					local201 = this.aClass21_9.method154((byte) 5, arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray83[local222 + local207] * (long) Class39.anInt585 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray83[local222 + local207 - local590 - 1] * (long) Class39.anIntArrayArray7[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray83[local222 - local694 - 1] * (long) Class39.anIntArrayArray7[1][local694] >> 16);
						}
						anIntArray83[local222] = local559;
						local201 = this.aClass21_9.method154((byte) 5, arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray83[local222 + local207 - local590 - 1] * (long) Class39.anIntArrayArray7[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray83[local222 - local694 - 1] * (long) Class39.anIntArrayArray7[1][local694] >> 16);
							}
							anIntArray83[local222] = local559;
							this.aClass21_9.method154((byte) 5, arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass39_1.method287(0, (float) local201 / 65536.0F);
					local216 = this.aClass39_1.method287(1, (float) local201 / 65536.0F);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray83[local201] < -32768) {
				anIntArray83[local201] = -32768;
			}
			if (anIntArray83[local201] > 32767) {
				anIntArray83[local201] = 32767;
			}
		}
		return anIntArray83;
	}

	@OriginalMember(owner = "client!LQCMEXCE", name = "a", descriptor = "(IIII)I")
	private int method221(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 == 1) {
				return (arg1 & 0x7FFF) < 16384 ? arg2 : -arg2;
			} else if (arg0 == 2) {
				return anIntArray85[arg1 & 0x7FFF] * arg2 >> 14;
			} else if (arg0 == 3) {
				return ((arg1 & 0x7FFF) * arg2 >> 14) - arg2;
			} else if (arg0 == 4) {
				return anIntArray84[arg1 / 2607 & 0x7FFF] * arg2;
			} else {
				return 0;
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("82968, " + -95 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LQCMEXCE", name = "a", descriptor = "(ZLclient!XGRGMPUQ;)V")
	public void method222(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class5_Sub1_Sub4 arg1) {
		try {
			this.aClass21_1 = new Class21();
			this.aClass21_1.method151(this.aBoolean122, arg1);
			this.aClass21_2 = new Class21();
			this.aClass21_2.method151(this.aBoolean122, arg1);
			@Pc(26) int local26 = arg1.method437();
			if (!arg0) {
				throw new NullPointerException();
			}
			if (local26 != 0) {
				arg1.anInt755--;
				this.aClass21_3 = new Class21();
				this.aClass21_3.method151(this.aBoolean122, arg1);
				this.aClass21_4 = new Class21();
				this.aClass21_4.method151(this.aBoolean122, arg1);
			}
			local26 = arg1.method437();
			if (local26 != 0) {
				arg1.anInt755--;
				this.aClass21_5 = new Class21();
				this.aClass21_5.method151(this.aBoolean122, arg1);
				this.aClass21_6 = new Class21();
				this.aClass21_6.method151(this.aBoolean122, arg1);
			}
			local26 = arg1.method437();
			if (local26 != 0) {
				arg1.anInt755--;
				this.aClass21_7 = new Class21();
				this.aClass21_7.method151(this.aBoolean122, arg1);
				this.aClass21_8 = new Class21();
				this.aClass21_8.method151(this.aBoolean122, arg1);
			}
			for (@Pc(130) int local130 = 0; local130 < 10; local130++) {
				@Pc(141) int local141 = arg1.method451();
				if (local141 == 0) {
					break;
				}
				this.anIntArray80[local130] = local141;
				this.anIntArray81[local130] = arg1.method450();
				this.anIntArray82[local130] = arg1.method451();
			}
			this.anInt408 = arg1.method451();
			this.anInt409 = arg1.method451();
			this.anInt410 = arg1.method439();
			this.anInt411 = arg1.method439();
			this.aClass39_1 = new Class39();
			this.aClass21_9 = new Class21();
			this.aClass39_1.method288(this.aClass21_9, arg1);
		} catch (@Pc(199) RuntimeException local199) {
			signlink.reporterror("15424, " + arg0 + ", " + arg1 + ", " + local199.toString());
			throw new RuntimeException();
		}
	}
}
