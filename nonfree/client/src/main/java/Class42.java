import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VSTUETUV")
public final class Class42 {

	@OriginalMember(owner = "client!VSTUETUV", name = "u", descriptor = "[I")
	private static int[] anIntArray188;

	@OriginalMember(owner = "client!VSTUETUV", name = "v", descriptor = "[I")
	private static int[] anIntArray189;

	@OriginalMember(owner = "client!VSTUETUV", name = "w", descriptor = "[I")
	private static int[] anIntArray190;

	@OriginalMember(owner = "client!VSTUETUV", name = "x", descriptor = "[I")
	private static int[] anIntArray191 = new int[5];

	@OriginalMember(owner = "client!VSTUETUV", name = "y", descriptor = "[I")
	private static int[] anIntArray192 = new int[5];

	@OriginalMember(owner = "client!VSTUETUV", name = "z", descriptor = "[I")
	private static int[] anIntArray193 = new int[5];

	@OriginalMember(owner = "client!VSTUETUV", name = "A", descriptor = "[I")
	private static int[] anIntArray194 = new int[5];

	@OriginalMember(owner = "client!VSTUETUV", name = "B", descriptor = "[I")
	private static int[] anIntArray195 = new int[5];

	@OriginalMember(owner = "client!VSTUETUV", name = "d", descriptor = "Lclient!NXAZLFDC;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!VSTUETUV", name = "e", descriptor = "Lclient!NXAZLFDC;")
	private Class27 aClass27_2;

	@OriginalMember(owner = "client!VSTUETUV", name = "f", descriptor = "Lclient!NXAZLFDC;")
	private Class27 aClass27_3;

	@OriginalMember(owner = "client!VSTUETUV", name = "g", descriptor = "Lclient!NXAZLFDC;")
	private Class27 aClass27_4;

	@OriginalMember(owner = "client!VSTUETUV", name = "h", descriptor = "Lclient!NXAZLFDC;")
	private Class27 aClass27_5;

	@OriginalMember(owner = "client!VSTUETUV", name = "i", descriptor = "Lclient!NXAZLFDC;")
	private Class27 aClass27_6;

	@OriginalMember(owner = "client!VSTUETUV", name = "j", descriptor = "Lclient!NXAZLFDC;")
	private Class27 aClass27_7;

	@OriginalMember(owner = "client!VSTUETUV", name = "k", descriptor = "Lclient!NXAZLFDC;")
	private Class27 aClass27_8;

	@OriginalMember(owner = "client!VSTUETUV", name = "o", descriptor = "I")
	private int anInt750;

	@OriginalMember(owner = "client!VSTUETUV", name = "q", descriptor = "Lclient!ERCNIFTI;")
	private Class12 aClass12_1;

	@OriginalMember(owner = "client!VSTUETUV", name = "r", descriptor = "Lclient!NXAZLFDC;")
	private Class27 aClass27_9;

	@OriginalMember(owner = "client!VSTUETUV", name = "t", descriptor = "I")
	public int anInt753;

	@OriginalMember(owner = "client!VSTUETUV", name = "a", descriptor = "I")
	private int anInt748 = 16191;

	@OriginalMember(owner = "client!VSTUETUV", name = "b", descriptor = "Z")
	private boolean aBoolean187 = false;

	@OriginalMember(owner = "client!VSTUETUV", name = "c", descriptor = "I")
	private int anInt749 = -677;

	@OriginalMember(owner = "client!VSTUETUV", name = "l", descriptor = "[I")
	private int[] anIntArray185 = new int[5];

	@OriginalMember(owner = "client!VSTUETUV", name = "m", descriptor = "[I")
	private int[] anIntArray186 = new int[5];

	@OriginalMember(owner = "client!VSTUETUV", name = "n", descriptor = "[I")
	private int[] anIntArray187 = new int[5];

	@OriginalMember(owner = "client!VSTUETUV", name = "p", descriptor = "I")
	private int anInt751 = 100;

	@OriginalMember(owner = "client!VSTUETUV", name = "s", descriptor = "I")
	public int anInt752 = 500;

	@OriginalMember(owner = "client!VSTUETUV", name = "a", descriptor = "()V")
	public static void method533() {
		anIntArray189 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray189[local6] = 1;
			} else {
				anIntArray189[local6] = -1;
			}
		}
		anIntArray190 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray190[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray188 = new int[220500];
	}

	@OriginalMember(owner = "client!VSTUETUV", name = "a", descriptor = "(II)[I")
	public int[] method534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray188[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray188;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass27_1.method475();
		this.aClass27_2.method475();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass27_3 != null) {
			this.aClass27_3.method475();
			this.aClass27_4.method475();
			local36 = (int) ((double) (this.aClass27_3.anInt522 - this.aClass27_3.anInt521) * 32.768D / local26);
			local38 = (int) ((double) this.aClass27_3.anInt521 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass27_5 != null) {
			this.aClass27_5.method475();
			this.aClass27_6.method475();
			local77 = (int) ((double) (this.aClass27_5.anInt522 - this.aClass27_5.anInt521) * 32.768D / local26);
			local79 = (int) ((double) this.aClass27_5.anInt521 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray185[local118] != 0) {
				anIntArray191[local118] = 0;
				anIntArray192[local118] = (int) ((double) this.anIntArray187[local118] * local26);
				anIntArray193[local118] = (this.anIntArray185[local118] << 14) / 100;
				anIntArray194[local118] = (int) ((double) (this.aClass27_1.anInt522 - this.aClass27_1.anInt521) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray186[local118]) / local26);
				anIntArray195[local118] = (int) ((double) this.aClass27_1.anInt521 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass27_1.method476(arg0);
			local207 = this.aClass27_2.method476(arg0);
			if (this.aClass27_3 != null) {
				local216 = this.aClass27_3.method476(arg0);
				local222 = this.aClass27_4.method476(arg0);
				local201 += this.method535(this.aClass27_3.anInt523, local40, local222) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass27_5 != null) {
				local216 = this.aClass27_5.method476(arg0);
				local222 = this.aClass27_6.method476(arg0);
				local207 = local207 * ((this.method535(this.aClass27_5.anInt523, local81, local222) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray185[local216] != 0) {
					local222 = local193 + anIntArray192[local216];
					if (local222 < arg0) {
						anIntArray188[local222] += this.method535(this.aClass27_1.anInt523, anIntArray191[local216], local207 * anIntArray193[local216] >> 15);
						anIntArray191[local216] += (local201 * anIntArray194[local216] >> 16) + anIntArray195[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass27_7 != null) {
			this.aClass27_7.method475();
			this.aClass27_8.method475();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass27_7.method476(arg0);
				local385 = this.aClass27_8.method476(arg0);
				if (local369) {
					local207 = this.aClass27_7.anInt521 + ((this.aClass27_7.anInt522 - this.aClass27_7.anInt521) * local379 >> 8);
				} else {
					local207 = this.aClass27_7.anInt521 + ((this.aClass27_7.anInt522 - this.aClass27_7.anInt521) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray188[local222] = 0;
				}
			}
		}
		if (this.anInt750 > 0 && this.anInt751 > 0) {
			local201 = (int) ((double) this.anInt750 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray188[local207] += anIntArray188[local207 - local201] * this.anInt751 / 100;
			}
		}
		if (this.aClass12_1.anIntArray34[0] > 0 || this.aClass12_1.anIntArray34[1] > 0) {
			this.aClass27_9.method475();
			local201 = this.aClass27_9.method476(arg0 + 1);
			local207 = this.aClass12_1.method150((float) local201 / 65536.0F, 0);
			local216 = this.aClass12_1.method150((float) local201 / 65536.0F, 1);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray188[local222 + local207] * (long) Class12.anInt249 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray188[local222 + local207 - local559 - 1] * (long) Class12.anIntArrayArray3[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray188[local222 - local590 - 1] * (long) Class12.anIntArrayArray3[1][local590] >> 16);
					}
					anIntArray188[local222] = local385;
					local201 = this.aClass27_9.method476(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray188[local222 + local207] * (long) Class12.anInt249 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray188[local222 + local207 - local590 - 1] * (long) Class12.anIntArrayArray3[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray188[local222 - local694 - 1] * (long) Class12.anIntArrayArray3[1][local694] >> 16);
						}
						anIntArray188[local222] = local559;
						local201 = this.aClass27_9.method476(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray188[local222 + local207 - local590 - 1] * (long) Class12.anIntArrayArray3[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray188[local222 - local694 - 1] * (long) Class12.anIntArrayArray3[1][local694] >> 16);
							}
							anIntArray188[local222] = local559;
							this.aClass27_9.method476(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass12_1.method150((float) local201 / 65536.0F, 0);
					local216 = this.aClass12_1.method150((float) local201 / 65536.0F, 1);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray188[local201] < -32768) {
				anIntArray188[local201] = -32768;
			}
			if (anIntArray188[local201] > 32767) {
				anIntArray188[local201] = 32767;
			}
		}
		return anIntArray188;
	}

	@OriginalMember(owner = "client!VSTUETUV", name = "a", descriptor = "(IIII)I")
	private int method535(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 == 1) {
				return (arg1 & 0x7FFF) < 16384 ? arg2 : -arg2;
			} else if (arg0 == 2) {
				return anIntArray190[arg1 & 0x7FFF] * arg2 >> 14;
			} else if (arg0 == 3) {
				return ((arg1 & 0x7FFF) * arg2 >> 14) - arg2;
			} else if (arg0 == 4) {
				return anIntArray189[arg1 / 2607 & 0x7FFF] * arg2;
			} else {
				return 0;
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("15962, " + arg0 + ", " + -677 + ", " + arg1 + ", " + arg2 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VSTUETUV", name = "a", descriptor = "(Lclient!LDILQFVA;I)V")
	public void method536(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			this.aClass27_1 = new Class27();
			this.aClass27_1.method473(arg0);
			this.aClass27_2 = new Class27();
			this.aClass27_2.method473(arg0);
			if (this.anInt748 != 16191) {
				this.anInt749 = -331;
			}
			@Pc(31) int local31 = arg0.method359();
			if (local31 != 0) {
				arg0.anInt443--;
				this.aClass27_3 = new Class27();
				this.aClass27_3.method473(arg0);
				this.aClass27_4 = new Class27();
				this.aClass27_4.method473(arg0);
			}
			local31 = arg0.method359();
			if (local31 != 0) {
				arg0.anInt443--;
				this.aClass27_5 = new Class27();
				this.aClass27_5.method473(arg0);
				this.aClass27_6 = new Class27();
				this.aClass27_6.method473(arg0);
			}
			local31 = arg0.method359();
			if (local31 != 0) {
				arg0.anInt443--;
				this.aClass27_7 = new Class27();
				this.aClass27_7.method473(arg0);
				this.aClass27_8 = new Class27();
				this.aClass27_8.method473(arg0);
			}
			for (@Pc(123) int local123 = 0; local123 < 10; local123++) {
				@Pc(134) int local134 = arg0.method373();
				if (local134 == 0) {
					break;
				}
				this.anIntArray185[local123] = local134;
				this.anIntArray186[local123] = arg0.method372();
				this.anIntArray187[local123] = arg0.method373();
			}
			this.anInt750 = arg0.method373();
			this.anInt751 = arg0.method373();
			this.anInt752 = arg0.method361();
			this.anInt753 = arg0.method361();
			this.aClass12_1 = new Class12();
			this.aClass27_9 = new Class27();
			this.aClass12_1.method151(this.aBoolean187, arg0, this.aClass27_9);
		} catch (@Pc(193) RuntimeException local193) {
			signlink.reporterror("19466, " + arg0 + ", " + 16191 + ", " + local193.toString());
			throw new RuntimeException();
		}
	}
}
