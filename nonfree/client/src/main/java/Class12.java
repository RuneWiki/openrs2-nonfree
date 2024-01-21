import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DZFLZLPS")
public final class Class12 {

	@OriginalMember(owner = "client!DZFLZLPS", name = "t", descriptor = "[I")
	private static int[] anIntArray32;

	@OriginalMember(owner = "client!DZFLZLPS", name = "u", descriptor = "[I")
	private static int[] anIntArray33;

	@OriginalMember(owner = "client!DZFLZLPS", name = "v", descriptor = "[I")
	private static int[] anIntArray34;

	@OriginalMember(owner = "client!DZFLZLPS", name = "w", descriptor = "[I")
	private static int[] anIntArray35 = new int[5];

	@OriginalMember(owner = "client!DZFLZLPS", name = "x", descriptor = "[I")
	private static int[] anIntArray36 = new int[5];

	@OriginalMember(owner = "client!DZFLZLPS", name = "y", descriptor = "[I")
	private static int[] anIntArray37 = new int[5];

	@OriginalMember(owner = "client!DZFLZLPS", name = "z", descriptor = "[I")
	private static int[] anIntArray38 = new int[5];

	@OriginalMember(owner = "client!DZFLZLPS", name = "A", descriptor = "[I")
	private static int[] anIntArray39 = new int[5];

	@OriginalMember(owner = "client!DZFLZLPS", name = "c", descriptor = "Lclient!ENGZWEMK;")
	private Class14 aClass14_1;

	@OriginalMember(owner = "client!DZFLZLPS", name = "d", descriptor = "Lclient!ENGZWEMK;")
	private Class14 aClass14_2;

	@OriginalMember(owner = "client!DZFLZLPS", name = "e", descriptor = "Lclient!ENGZWEMK;")
	private Class14 aClass14_3;

	@OriginalMember(owner = "client!DZFLZLPS", name = "f", descriptor = "Lclient!ENGZWEMK;")
	private Class14 aClass14_4;

	@OriginalMember(owner = "client!DZFLZLPS", name = "g", descriptor = "Lclient!ENGZWEMK;")
	private Class14 aClass14_5;

	@OriginalMember(owner = "client!DZFLZLPS", name = "h", descriptor = "Lclient!ENGZWEMK;")
	private Class14 aClass14_6;

	@OriginalMember(owner = "client!DZFLZLPS", name = "i", descriptor = "Lclient!ENGZWEMK;")
	private Class14 aClass14_7;

	@OriginalMember(owner = "client!DZFLZLPS", name = "j", descriptor = "Lclient!ENGZWEMK;")
	private Class14 aClass14_8;

	@OriginalMember(owner = "client!DZFLZLPS", name = "n", descriptor = "I")
	private int anInt115;

	@OriginalMember(owner = "client!DZFLZLPS", name = "p", descriptor = "Lclient!DJKDKZEW;")
	private Class10 aClass10_1;

	@OriginalMember(owner = "client!DZFLZLPS", name = "q", descriptor = "Lclient!ENGZWEMK;")
	private Class14 aClass14_9;

	@OriginalMember(owner = "client!DZFLZLPS", name = "s", descriptor = "I")
	public int anInt118;

	@OriginalMember(owner = "client!DZFLZLPS", name = "a", descriptor = "Z")
	private boolean aBoolean43 = true;

	@OriginalMember(owner = "client!DZFLZLPS", name = "b", descriptor = "I")
	private int anInt114 = -353;

	@OriginalMember(owner = "client!DZFLZLPS", name = "k", descriptor = "[I")
	private int[] anIntArray29 = new int[5];

	@OriginalMember(owner = "client!DZFLZLPS", name = "l", descriptor = "[I")
	private int[] anIntArray30 = new int[5];

	@OriginalMember(owner = "client!DZFLZLPS", name = "m", descriptor = "[I")
	private int[] anIntArray31 = new int[5];

	@OriginalMember(owner = "client!DZFLZLPS", name = "o", descriptor = "I")
	private int anInt116 = 100;

	@OriginalMember(owner = "client!DZFLZLPS", name = "r", descriptor = "I")
	public int anInt117 = 500;

	@OriginalMember(owner = "client!DZFLZLPS", name = "a", descriptor = "()V")
	public static void method98() {
		anIntArray33 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray33[local6] = 1;
			} else {
				anIntArray33[local6] = -1;
			}
		}
		anIntArray34 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray34[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray32 = new int[220500];
	}

	@OriginalMember(owner = "client!DZFLZLPS", name = "a", descriptor = "(II)[I")
	public int[] method99(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray32[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray32;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass14_1.method104();
		this.aClass14_2.method104();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass14_3 != null) {
			this.aClass14_3.method104();
			this.aClass14_4.method104();
			local36 = (int) ((double) (this.aClass14_3.anInt150 - this.aClass14_3.anInt149) * 32.768D / local26);
			local38 = (int) ((double) this.aClass14_3.anInt149 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass14_5 != null) {
			this.aClass14_5.method104();
			this.aClass14_6.method104();
			local77 = (int) ((double) (this.aClass14_5.anInt150 - this.aClass14_5.anInt149) * 32.768D / local26);
			local79 = (int) ((double) this.aClass14_5.anInt149 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray29[local118] != 0) {
				anIntArray35[local118] = 0;
				anIntArray36[local118] = (int) ((double) this.anIntArray31[local118] * local26);
				anIntArray37[local118] = (this.anIntArray29[local118] << 14) / 100;
				anIntArray38[local118] = (int) ((double) (this.aClass14_1.anInt150 - this.aClass14_1.anInt149) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray30[local118]) / local26);
				anIntArray39[local118] = (int) ((double) this.aClass14_1.anInt149 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass14_1.method105(arg0);
			local207 = this.aClass14_2.method105(arg0);
			if (this.aClass14_3 != null) {
				local216 = this.aClass14_3.method105(arg0);
				local222 = this.aClass14_4.method105(arg0);
				local201 += this.method100(this.aClass14_3.anInt151, local222, local40) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass14_5 != null) {
				local216 = this.aClass14_5.method105(arg0);
				local222 = this.aClass14_6.method105(arg0);
				local207 = local207 * ((this.method100(this.aClass14_5.anInt151, local222, local81) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray29[local216] != 0) {
					local222 = local193 + anIntArray36[local216];
					if (local222 < arg0) {
						anIntArray32[local222] += this.method100(this.aClass14_1.anInt151, local207 * anIntArray37[local216] >> 15, anIntArray35[local216]);
						anIntArray35[local216] += (local201 * anIntArray38[local216] >> 16) + anIntArray39[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass14_7 != null) {
			this.aClass14_7.method104();
			this.aClass14_8.method104();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass14_7.method105(arg0);
				local385 = this.aClass14_8.method105(arg0);
				if (local369) {
					local207 = this.aClass14_7.anInt149 + ((this.aClass14_7.anInt150 - this.aClass14_7.anInt149) * local379 >> 8);
				} else {
					local207 = this.aClass14_7.anInt149 + ((this.aClass14_7.anInt150 - this.aClass14_7.anInt149) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray32[local222] = 0;
				}
			}
		}
		if (this.anInt115 > 0 && this.anInt116 > 0) {
			local201 = (int) ((double) this.anInt115 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray32[local207] += anIntArray32[local207 - local201] * this.anInt116 / 100;
			}
		}
		if (this.aClass10_1.anIntArray23[0] > 0 || this.aClass10_1.anIntArray23[1] > 0) {
			this.aClass14_9.method104();
			local201 = this.aClass14_9.method105(arg0 + 1);
			local207 = this.aClass10_1.method93((float) local201 / 65536.0F, 0);
			local216 = this.aClass10_1.method93((float) local201 / 65536.0F, 1);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray32[local222 + local207] * (long) Class10.anInt101 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray32[local222 + local207 - local559 - 1] * (long) Class10.anIntArrayArray2[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray32[local222 - local590 - 1] * (long) Class10.anIntArrayArray2[1][local590] >> 16);
					}
					anIntArray32[local222] = local385;
					local201 = this.aClass14_9.method105(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray32[local222 + local207] * (long) Class10.anInt101 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray32[local222 + local207 - local590 - 1] * (long) Class10.anIntArrayArray2[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray32[local222 - local694 - 1] * (long) Class10.anIntArrayArray2[1][local694] >> 16);
						}
						anIntArray32[local222] = local559;
						local201 = this.aClass14_9.method105(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray32[local222 + local207 - local590 - 1] * (long) Class10.anIntArrayArray2[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray32[local222 - local694 - 1] * (long) Class10.anIntArrayArray2[1][local694] >> 16);
							}
							anIntArray32[local222] = local559;
							this.aClass14_9.method105(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass10_1.method93((float) local201 / 65536.0F, 0);
					local216 = this.aClass10_1.method93((float) local201 / 65536.0F, 1);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray32[local201] < -32768) {
				anIntArray32[local201] = -32768;
			}
			if (anIntArray32[local201] > 32767) {
				anIntArray32[local201] = 32767;
			}
		}
		return anIntArray32;
	}

	@OriginalMember(owner = "client!DZFLZLPS", name = "a", descriptor = "(IIII)I")
	private int method100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0 == 1) {
				return (arg2 & 0x7FFF) < 16384 ? arg1 : -arg1;
			} else if (arg0 == 2) {
				return anIntArray34[arg2 & 0x7FFF] * arg1 >> 14;
			} else if (arg0 == 3) {
				return ((arg2 & 0x7FFF) * arg1 >> 14) - arg1;
			} else if (arg0 == 4) {
				return anIntArray33[arg2 / 2607 & 0x7FFF] * arg1;
			} else {
				return 0;
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("72890, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 3 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DZFLZLPS", name = "a", descriptor = "(Lclient!PKHWFJLM;Z)V")
	public void method101(@OriginalArg(0) Class5_Sub1_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (!arg1) {
				this.anInt114 = 171;
			}
			this.aClass14_1 = new Class14();
			this.aClass14_1.method102(arg0, this.aBoolean43);
			this.aClass14_2 = new Class14();
			this.aClass14_2.method102(arg0, this.aBoolean43);
			@Pc(31) int local31 = arg0.method240();
			if (local31 != 0) {
				arg0.anInt429--;
				this.aClass14_3 = new Class14();
				this.aClass14_3.method102(arg0, this.aBoolean43);
				this.aClass14_4 = new Class14();
				this.aClass14_4.method102(arg0, this.aBoolean43);
			}
			local31 = arg0.method240();
			if (local31 != 0) {
				arg0.anInt429--;
				this.aClass14_5 = new Class14();
				this.aClass14_5.method102(arg0, this.aBoolean43);
				this.aClass14_6 = new Class14();
				this.aClass14_6.method102(arg0, this.aBoolean43);
			}
			local31 = arg0.method240();
			if (local31 != 0) {
				arg0.anInt429--;
				this.aClass14_7 = new Class14();
				this.aClass14_7.method102(arg0, this.aBoolean43);
				this.aClass14_8 = new Class14();
				this.aClass14_8.method102(arg0, this.aBoolean43);
			}
			for (@Pc(129) int local129 = 0; local129 < 10; local129++) {
				@Pc(140) int local140 = arg0.method254();
				if (local140 == 0) {
					break;
				}
				this.anIntArray29[local129] = local140;
				this.anIntArray30[local129] = arg0.method253();
				this.anIntArray31[local129] = arg0.method254();
			}
			this.anInt115 = arg0.method254();
			this.anInt116 = arg0.method254();
			this.anInt117 = arg0.method242();
			this.anInt118 = arg0.method242();
			this.aClass10_1 = new Class10();
			this.aClass14_9 = new Class14();
			this.aClass10_1.method94(this.aClass14_9, arg0);
		} catch (@Pc(198) RuntimeException local198) {
			signlink.reporterror("42413, " + arg0 + ", " + arg1 + ", " + local198.toString());
			throw new RuntimeException();
		}
	}
}
