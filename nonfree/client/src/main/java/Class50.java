import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZJWNEIBQ")
public final class Class50 {

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "s", descriptor = "[I")
	private static int[] anIntArray202;

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "t", descriptor = "[I")
	private static int[] anIntArray203;

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "u", descriptor = "[I")
	private static int[] anIntArray204;

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "v", descriptor = "[I")
	private static int[] anIntArray205 = new int[5];

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "w", descriptor = "[I")
	private static int[] anIntArray206 = new int[5];

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "x", descriptor = "[I")
	private static int[] anIntArray207 = new int[5];

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "y", descriptor = "[I")
	private static int[] anIntArray208 = new int[5];

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "z", descriptor = "[I")
	private static int[] anIntArray209 = new int[5];

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "b", descriptor = "Lclient!HCHPPCNY;")
	private Class16 aClass16_1;

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "c", descriptor = "Lclient!HCHPPCNY;")
	private Class16 aClass16_2;

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "d", descriptor = "Lclient!HCHPPCNY;")
	private Class16 aClass16_3;

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "e", descriptor = "Lclient!HCHPPCNY;")
	private Class16 aClass16_4;

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "f", descriptor = "Lclient!HCHPPCNY;")
	private Class16 aClass16_5;

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "g", descriptor = "Lclient!HCHPPCNY;")
	private Class16 aClass16_6;

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "h", descriptor = "Lclient!HCHPPCNY;")
	private Class16 aClass16_7;

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "i", descriptor = "Lclient!HCHPPCNY;")
	private Class16 aClass16_8;

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "m", descriptor = "I")
	private int anInt824;

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "o", descriptor = "Lclient!PTIFANAY;")
	private Class30 aClass30_1;

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "p", descriptor = "Lclient!HCHPPCNY;")
	private Class16 aClass16_9;

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "r", descriptor = "I")
	public int anInt827;

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "a", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "j", descriptor = "[I")
	private int[] anIntArray199 = new int[5];

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "k", descriptor = "[I")
	private int[] anIntArray200 = new int[5];

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "l", descriptor = "[I")
	private int[] anIntArray201 = new int[5];

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "n", descriptor = "I")
	private int anInt825 = 100;

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "q", descriptor = "I")
	public int anInt826 = 500;

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "a", descriptor = "()V")
	public static void method572() {
		anIntArray203 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray203[local6] = 1;
			} else {
				anIntArray203[local6] = -1;
			}
		}
		anIntArray204 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray204[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray202 = new int[220500];
	}

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "a", descriptor = "(II)[I")
	public int[] method573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray202[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray202;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass16_1.method226();
		this.aClass16_2.method226();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass16_3 != null) {
			this.aClass16_3.method226();
			this.aClass16_4.method226();
			local36 = (int) ((double) (this.aClass16_3.anInt181 - this.aClass16_3.anInt180) * 32.768D / local26);
			local38 = (int) ((double) this.aClass16_3.anInt180 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass16_5 != null) {
			this.aClass16_5.method226();
			this.aClass16_6.method226();
			local77 = (int) ((double) (this.aClass16_5.anInt181 - this.aClass16_5.anInt180) * 32.768D / local26);
			local79 = (int) ((double) this.aClass16_5.anInt180 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray199[local118] != 0) {
				anIntArray205[local118] = 0;
				anIntArray206[local118] = (int) ((double) this.anIntArray201[local118] * local26);
				anIntArray207[local118] = (this.anIntArray199[local118] << 14) / 100;
				anIntArray208[local118] = (int) ((double) (this.aClass16_1.anInt181 - this.aClass16_1.anInt180) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray200[local118]) / local26);
				anIntArray209[local118] = (int) ((double) this.aClass16_1.anInt180 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass16_1.method227(arg0);
			local207 = this.aClass16_2.method227(arg0);
			if (this.aClass16_3 != null) {
				local216 = this.aClass16_3.method227(arg0);
				local222 = this.aClass16_4.method227(arg0);
				local201 += this.method574(local222, local40, this.aClass16_3.anInt182) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass16_5 != null) {
				local216 = this.aClass16_5.method227(arg0);
				local222 = this.aClass16_6.method227(arg0);
				local207 = local207 * ((this.method574(local222, local81, this.aClass16_5.anInt182) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray199[local216] != 0) {
					local222 = local193 + anIntArray206[local216];
					if (local222 < arg0) {
						anIntArray202[local222] += this.method574(local207 * anIntArray207[local216] >> 15, anIntArray205[local216], this.aClass16_1.anInt182);
						anIntArray205[local216] += (local201 * anIntArray208[local216] >> 16) + anIntArray209[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass16_7 != null) {
			this.aClass16_7.method226();
			this.aClass16_8.method226();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass16_7.method227(arg0);
				local385 = this.aClass16_8.method227(arg0);
				if (local369) {
					local207 = this.aClass16_7.anInt180 + ((this.aClass16_7.anInt181 - this.aClass16_7.anInt180) * local379 >> 8);
				} else {
					local207 = this.aClass16_7.anInt180 + ((this.aClass16_7.anInt181 - this.aClass16_7.anInt180) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray202[local222] = 0;
				}
			}
		}
		if (this.anInt824 > 0 && this.anInt825 > 0) {
			local201 = (int) ((double) this.anInt824 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray202[local207] += anIntArray202[local207 - local201] * this.anInt825 / 100;
			}
		}
		if (this.aClass30_1.anIntArray97[0] > 0 || this.aClass30_1.anIntArray97[1] > 0) {
			this.aClass16_9.method226();
			local201 = this.aClass16_9.method227(arg0 + 1);
			local207 = this.aClass30_1.method392(748, (float) local201 / 65536.0F, 0);
			local216 = this.aClass30_1.method392(748, (float) local201 / 65536.0F, 1);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray202[local222 + local207] * (long) Class30.anInt482 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray202[local222 + local207 - local559 - 1] * (long) Class30.anIntArrayArray13[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray202[local222 - local590 - 1] * (long) Class30.anIntArrayArray13[1][local590] >> 16);
					}
					anIntArray202[local222] = local385;
					local201 = this.aClass16_9.method227(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray202[local222 + local207] * (long) Class30.anInt482 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray202[local222 + local207 - local590 - 1] * (long) Class30.anIntArrayArray13[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray202[local222 - local694 - 1] * (long) Class30.anIntArrayArray13[1][local694] >> 16);
						}
						anIntArray202[local222] = local559;
						local201 = this.aClass16_9.method227(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray202[local222 + local207 - local590 - 1] * (long) Class30.anIntArrayArray13[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray202[local222 - local694 - 1] * (long) Class30.anIntArrayArray13[1][local694] >> 16);
							}
							anIntArray202[local222] = local559;
							this.aClass16_9.method227(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass30_1.method392(748, (float) local201 / 65536.0F, 0);
					local216 = this.aClass30_1.method392(748, (float) local201 / 65536.0F, 1);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray202[local201] < -32768) {
				anIntArray202[local201] = -32768;
			}
			if (anIntArray202[local201] > 32767) {
				anIntArray202[local201] = 32767;
			}
		}
		return anIntArray202;
	}

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "a", descriptor = "(IIII)I")
	private int method574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 == 1) {
				return (arg1 & 0x7FFF) < 16384 ? arg0 : -arg0;
			} else if (arg2 == 2) {
				return anIntArray204[arg1 & 0x7FFF] * arg0 >> 14;
			} else if (arg2 == 3) {
				return ((arg1 & 0x7FFF) * arg0 >> 14) - arg0;
			} else if (arg2 == 4) {
				return anIntArray203[arg1 / 2607 & 0x7FFF] * arg0;
			} else {
				return 0;
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("47863, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZJWNEIBQ", name = "a", descriptor = "(ILclient!BSNPYLEV;)V")
	public void method575(@OriginalArg(1) Class2_Sub1_Sub2 arg0) {
		try {
			this.aClass16_1 = new Class16();
			this.aClass16_1.method224(arg0);
			this.aClass16_2 = new Class16();
			this.aClass16_2.method224(arg0);
			@Pc(24) int local24 = arg0.method94();
			if (local24 != 0) {
				arg0.anInt81--;
				this.aClass16_3 = new Class16();
				this.aClass16_3.method224(arg0);
				this.aClass16_4 = new Class16();
				this.aClass16_4.method224(arg0);
			}
			local24 = arg0.method94();
			if (local24 != 0) {
				arg0.anInt81--;
				this.aClass16_5 = new Class16();
				this.aClass16_5.method224(arg0);
				this.aClass16_6 = new Class16();
				this.aClass16_6.method224(arg0);
			}
			local24 = arg0.method94();
			if (local24 != 0) {
				arg0.anInt81--;
				this.aClass16_7 = new Class16();
				this.aClass16_7.method224(arg0);
				this.aClass16_8 = new Class16();
				this.aClass16_8.method224(arg0);
			}
			for (@Pc(127) int local127 = 0; local127 < 10; local127++) {
				@Pc(138) int local138 = arg0.method108();
				if (local138 == 0) {
					break;
				}
				this.anIntArray199[local127] = local138;
				this.anIntArray200[local127] = arg0.method107();
				this.anIntArray201[local127] = arg0.method108();
			}
			this.anInt824 = arg0.method108();
			this.anInt825 = arg0.method108();
			this.anInt826 = arg0.method96();
			this.anInt827 = arg0.method96();
			this.aClass30_1 = new Class30();
			this.aClass16_9 = new Class16();
			this.aClass30_1.method393(arg0, this.aClass16_9);
		} catch (@Pc(196) RuntimeException local196) {
			signlink.reporterror("58689, " + 7 + ", " + arg0 + ", " + local196.toString());
			throw new RuntimeException();
		}
	}
}
