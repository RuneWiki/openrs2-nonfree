import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OZEEIHVG")
public final class Class33 {

	@OriginalMember(owner = "client!OZEEIHVG", name = "t", descriptor = "[I")
	private static int[] anIntArray168;

	@OriginalMember(owner = "client!OZEEIHVG", name = "u", descriptor = "[I")
	private static int[] anIntArray169;

	@OriginalMember(owner = "client!OZEEIHVG", name = "v", descriptor = "[I")
	private static int[] anIntArray170;

	@OriginalMember(owner = "client!OZEEIHVG", name = "a", descriptor = "I")
	private static int anInt629 = 48306;

	@OriginalMember(owner = "client!OZEEIHVG", name = "w", descriptor = "[I")
	private static int[] anIntArray171 = new int[5];

	@OriginalMember(owner = "client!OZEEIHVG", name = "x", descriptor = "[I")
	private static int[] anIntArray172 = new int[5];

	@OriginalMember(owner = "client!OZEEIHVG", name = "y", descriptor = "[I")
	private static int[] anIntArray173 = new int[5];

	@OriginalMember(owner = "client!OZEEIHVG", name = "z", descriptor = "[I")
	private static int[] anIntArray174 = new int[5];

	@OriginalMember(owner = "client!OZEEIHVG", name = "A", descriptor = "[I")
	private static int[] anIntArray175 = new int[5];

	@OriginalMember(owner = "client!OZEEIHVG", name = "b", descriptor = "I")
	private int anInt630;

	@OriginalMember(owner = "client!OZEEIHVG", name = "c", descriptor = "Lclient!SHSBXUIJ;")
	private Class37 aClass37_1;

	@OriginalMember(owner = "client!OZEEIHVG", name = "d", descriptor = "Lclient!SHSBXUIJ;")
	private Class37 aClass37_2;

	@OriginalMember(owner = "client!OZEEIHVG", name = "e", descriptor = "Lclient!SHSBXUIJ;")
	private Class37 aClass37_3;

	@OriginalMember(owner = "client!OZEEIHVG", name = "f", descriptor = "Lclient!SHSBXUIJ;")
	private Class37 aClass37_4;

	@OriginalMember(owner = "client!OZEEIHVG", name = "g", descriptor = "Lclient!SHSBXUIJ;")
	private Class37 aClass37_5;

	@OriginalMember(owner = "client!OZEEIHVG", name = "h", descriptor = "Lclient!SHSBXUIJ;")
	private Class37 aClass37_6;

	@OriginalMember(owner = "client!OZEEIHVG", name = "i", descriptor = "Lclient!SHSBXUIJ;")
	private Class37 aClass37_7;

	@OriginalMember(owner = "client!OZEEIHVG", name = "j", descriptor = "Lclient!SHSBXUIJ;")
	private Class37 aClass37_8;

	@OriginalMember(owner = "client!OZEEIHVG", name = "n", descriptor = "I")
	private int anInt631;

	@OriginalMember(owner = "client!OZEEIHVG", name = "p", descriptor = "Lclient!VLRTJGOX;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!OZEEIHVG", name = "q", descriptor = "Lclient!SHSBXUIJ;")
	private Class37 aClass37_9;

	@OriginalMember(owner = "client!OZEEIHVG", name = "s", descriptor = "I")
	public int anInt634;

	@OriginalMember(owner = "client!OZEEIHVG", name = "k", descriptor = "[I")
	private int[] anIntArray165 = new int[5];

	@OriginalMember(owner = "client!OZEEIHVG", name = "l", descriptor = "[I")
	private int[] anIntArray166 = new int[5];

	@OriginalMember(owner = "client!OZEEIHVG", name = "m", descriptor = "[I")
	private int[] anIntArray167 = new int[5];

	@OriginalMember(owner = "client!OZEEIHVG", name = "o", descriptor = "I")
	private int anInt632 = 100;

	@OriginalMember(owner = "client!OZEEIHVG", name = "r", descriptor = "I")
	public int anInt633 = 500;

	@OriginalMember(owner = "client!OZEEIHVG", name = "a", descriptor = "()V")
	public static void method370() {
		anIntArray169 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray169[local6] = 1;
			} else {
				anIntArray169[local6] = -1;
			}
		}
		anIntArray170 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray170[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray168 = new int[220500];
	}

	@OriginalMember(owner = "client!OZEEIHVG", name = "a", descriptor = "(II)[I")
	public int[] method371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray168[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray168;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass37_1.method451();
		this.aClass37_2.method451();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass37_3 != null) {
			this.aClass37_3.method451();
			this.aClass37_4.method451();
			local36 = (int) ((double) (this.aClass37_3.anInt712 - this.aClass37_3.anInt711) * 32.768D / local26);
			local38 = (int) ((double) this.aClass37_3.anInt711 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass37_5 != null) {
			this.aClass37_5.method451();
			this.aClass37_6.method451();
			local77 = (int) ((double) (this.aClass37_5.anInt712 - this.aClass37_5.anInt711) * 32.768D / local26);
			local79 = (int) ((double) this.aClass37_5.anInt711 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray165[local118] != 0) {
				anIntArray171[local118] = 0;
				anIntArray172[local118] = (int) ((double) this.anIntArray167[local118] * local26);
				anIntArray173[local118] = (this.anIntArray165[local118] << 14) / 100;
				anIntArray174[local118] = (int) ((double) (this.aClass37_1.anInt712 - this.aClass37_1.anInt711) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray166[local118]) / local26);
				anIntArray175[local118] = (int) ((double) this.aClass37_1.anInt711 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass37_1.method452(arg0);
			local207 = this.aClass37_2.method452(arg0);
			if (this.aClass37_3 != null) {
				local216 = this.aClass37_3.method452(arg0);
				local222 = this.aClass37_4.method452(arg0);
				local201 += this.method372(local222, this.aClass37_3.anInt713, local40, 216) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass37_5 != null) {
				local216 = this.aClass37_5.method452(arg0);
				local222 = this.aClass37_6.method452(arg0);
				local207 = local207 * ((this.method372(local222, this.aClass37_5.anInt713, local81, 216) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray165[local216] != 0) {
					local222 = local193 + anIntArray172[local216];
					if (local222 < arg0) {
						anIntArray168[local222] += this.method372(local207 * anIntArray173[local216] >> 15, this.aClass37_1.anInt713, anIntArray171[local216], 216);
						anIntArray171[local216] += (local201 * anIntArray174[local216] >> 16) + anIntArray175[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass37_7 != null) {
			this.aClass37_7.method451();
			this.aClass37_8.method451();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass37_7.method452(arg0);
				local385 = this.aClass37_8.method452(arg0);
				if (local369) {
					local207 = this.aClass37_7.anInt711 + ((this.aClass37_7.anInt712 - this.aClass37_7.anInt711) * local379 >> 8);
				} else {
					local207 = this.aClass37_7.anInt711 + ((this.aClass37_7.anInt712 - this.aClass37_7.anInt711) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray168[local222] = 0;
				}
			}
		}
		if (this.anInt631 > 0 && this.anInt632 > 0) {
			local201 = (int) ((double) this.anInt631 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray168[local207] += anIntArray168[local207 - local201] * this.anInt632 / 100;
			}
		}
		if (this.aClass46_1.anIntArray197[0] > 0 || this.aClass46_1.anIntArray197[1] > 0) {
			this.aClass37_9.method451();
			local201 = this.aClass37_9.method452(arg0 + 1);
			local207 = this.aClass46_1.method514(0, (float) local201 / 65536.0F, anInt629);
			local216 = this.aClass46_1.method514(1, (float) local201 / 65536.0F, anInt629);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray168[local222 + local207] * (long) Class46.anInt760 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray168[local222 + local207 - local559 - 1] * (long) Class46.anIntArrayArray20[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray168[local222 - local590 - 1] * (long) Class46.anIntArrayArray20[1][local590] >> 16);
					}
					anIntArray168[local222] = local385;
					local201 = this.aClass37_9.method452(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray168[local222 + local207] * (long) Class46.anInt760 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray168[local222 + local207 - local590 - 1] * (long) Class46.anIntArrayArray20[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray168[local222 - local694 - 1] * (long) Class46.anIntArrayArray20[1][local694] >> 16);
						}
						anIntArray168[local222] = local559;
						local201 = this.aClass37_9.method452(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray168[local222 + local207 - local590 - 1] * (long) Class46.anIntArrayArray20[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray168[local222 - local694 - 1] * (long) Class46.anIntArrayArray20[1][local694] >> 16);
							}
							anIntArray168[local222] = local559;
							this.aClass37_9.method452(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass46_1.method514(0, (float) local201 / 65536.0F, anInt629);
					local216 = this.aClass46_1.method514(1, (float) local201 / 65536.0F, anInt629);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray168[local201] < -32768) {
				anIntArray168[local201] = -32768;
			}
			if (anIntArray168[local201] > 32767) {
				anIntArray168[local201] = 32767;
			}
		}
		return anIntArray168;
	}

	@OriginalMember(owner = "client!OZEEIHVG", name = "a", descriptor = "(IIII)I")
	private int method372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg1 == 1) {
				return (arg2 & 0x7FFF) < 16384 ? arg0 : -arg0;
			} else if (arg1 == 2) {
				return anIntArray170[arg2 & 0x7FFF] * arg0 >> 14;
			} else if (arg1 == 3) {
				return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
			} else if (arg1 == 4) {
				return anIntArray169[arg2 / 2607 & 0x7FFF] * arg0;
			} else {
				return 0;
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("34848, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OZEEIHVG", name = "a", descriptor = "(ILclient!RGCGKKUR;)V")
	public void method373(@OriginalArg(1) Class6_Sub1_Sub4 arg0) {
		try {
			this.aClass37_1 = new Class37();
			this.aClass37_1.method449(arg0);
			this.aClass37_2 = new Class37();
			this.aClass37_2.method449(arg0);
			@Pc(24) int local24 = arg0.method411();
			if (local24 != 0) {
				arg0.anInt704--;
				this.aClass37_3 = new Class37();
				this.aClass37_3.method449(arg0);
				this.aClass37_4 = new Class37();
				this.aClass37_4.method449(arg0);
			}
			local24 = arg0.method411();
			if (local24 != 0) {
				arg0.anInt704--;
				this.aClass37_5 = new Class37();
				this.aClass37_5.method449(arg0);
				this.aClass37_6 = new Class37();
				this.aClass37_6.method449(arg0);
			}
			local24 = arg0.method411();
			if (local24 != 0) {
				arg0.anInt704--;
				this.aClass37_7 = new Class37();
				this.aClass37_7.method449(arg0);
				this.aClass37_8 = new Class37();
				this.aClass37_8.method449(arg0);
			}
			for (@Pc(116) int local116 = 0; local116 < 10; local116++) {
				@Pc(127) int local127 = arg0.method425();
				if (local127 == 0) {
					break;
				}
				this.anIntArray165[local116] = local127;
				this.anIntArray166[local116] = arg0.method424();
				this.anIntArray167[local116] = arg0.method425();
			}
			this.anInt631 = arg0.method425();
			this.anInt632 = arg0.method425();
			this.anInt633 = arg0.method413();
			this.anInt634 = arg0.method413();
			this.aClass46_1 = new Class46();
			this.aClass37_9 = new Class37();
			this.aClass46_1.method515(arg0, this.aClass37_9, this.anInt630);
		} catch (@Pc(196) RuntimeException local196) {
			signlink.reporterror("91256, " + 5 + ", " + arg0 + ", " + local196.toString());
			throw new RuntimeException();
		}
	}
}
