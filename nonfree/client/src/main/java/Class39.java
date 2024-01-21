import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UXJRWLQU")
public final class Class39 {

	@OriginalMember(owner = "client!UXJRWLQU", name = "s", descriptor = "[I")
	private static int[] anIntArray155;

	@OriginalMember(owner = "client!UXJRWLQU", name = "t", descriptor = "[I")
	private static int[] anIntArray156;

	@OriginalMember(owner = "client!UXJRWLQU", name = "u", descriptor = "[I")
	private static int[] anIntArray157;

	@OriginalMember(owner = "client!UXJRWLQU", name = "a", descriptor = "I")
	private static int anInt608 = 60;

	@OriginalMember(owner = "client!UXJRWLQU", name = "v", descriptor = "[I")
	private static int[] anIntArray158 = new int[5];

	@OriginalMember(owner = "client!UXJRWLQU", name = "w", descriptor = "[I")
	private static int[] anIntArray159 = new int[5];

	@OriginalMember(owner = "client!UXJRWLQU", name = "x", descriptor = "[I")
	private static int[] anIntArray160 = new int[5];

	@OriginalMember(owner = "client!UXJRWLQU", name = "y", descriptor = "[I")
	private static int[] anIntArray161 = new int[5];

	@OriginalMember(owner = "client!UXJRWLQU", name = "z", descriptor = "[I")
	private static int[] anIntArray162 = new int[5];

	@OriginalMember(owner = "client!UXJRWLQU", name = "b", descriptor = "Lclient!ZBHVITZX;")
	private Class48 aClass48_1;

	@OriginalMember(owner = "client!UXJRWLQU", name = "c", descriptor = "Lclient!ZBHVITZX;")
	private Class48 aClass48_2;

	@OriginalMember(owner = "client!UXJRWLQU", name = "d", descriptor = "Lclient!ZBHVITZX;")
	private Class48 aClass48_3;

	@OriginalMember(owner = "client!UXJRWLQU", name = "e", descriptor = "Lclient!ZBHVITZX;")
	private Class48 aClass48_4;

	@OriginalMember(owner = "client!UXJRWLQU", name = "f", descriptor = "Lclient!ZBHVITZX;")
	private Class48 aClass48_5;

	@OriginalMember(owner = "client!UXJRWLQU", name = "g", descriptor = "Lclient!ZBHVITZX;")
	private Class48 aClass48_6;

	@OriginalMember(owner = "client!UXJRWLQU", name = "h", descriptor = "Lclient!ZBHVITZX;")
	private Class48 aClass48_7;

	@OriginalMember(owner = "client!UXJRWLQU", name = "i", descriptor = "Lclient!ZBHVITZX;")
	private Class48 aClass48_8;

	@OriginalMember(owner = "client!UXJRWLQU", name = "m", descriptor = "I")
	private int anInt609;

	@OriginalMember(owner = "client!UXJRWLQU", name = "o", descriptor = "Lclient!KEQJLHXN;")
	private Class20 aClass20_1;

	@OriginalMember(owner = "client!UXJRWLQU", name = "p", descriptor = "Lclient!ZBHVITZX;")
	private Class48 aClass48_9;

	@OriginalMember(owner = "client!UXJRWLQU", name = "r", descriptor = "I")
	public int anInt612;

	@OriginalMember(owner = "client!UXJRWLQU", name = "j", descriptor = "[I")
	private int[] anIntArray152 = new int[5];

	@OriginalMember(owner = "client!UXJRWLQU", name = "k", descriptor = "[I")
	private int[] anIntArray153 = new int[5];

	@OriginalMember(owner = "client!UXJRWLQU", name = "l", descriptor = "[I")
	private int[] anIntArray154 = new int[5];

	@OriginalMember(owner = "client!UXJRWLQU", name = "n", descriptor = "I")
	private int anInt610 = 100;

	@OriginalMember(owner = "client!UXJRWLQU", name = "q", descriptor = "I")
	public int anInt611 = 500;

	@OriginalMember(owner = "client!UXJRWLQU", name = "a", descriptor = "()V")
	public static void method459() {
		anIntArray156 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray156[local6] = 1;
			} else {
				anIntArray156[local6] = -1;
			}
		}
		anIntArray157 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray157[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray155 = new int[220500];
	}

	@OriginalMember(owner = "client!UXJRWLQU", name = "a", descriptor = "(II)[I")
	public int[] method460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray155[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray155;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass48_1.method520();
		this.aClass48_2.method520();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass48_3 != null) {
			this.aClass48_3.method520();
			this.aClass48_4.method520();
			local36 = (int) ((double) (this.aClass48_3.anInt720 - this.aClass48_3.anInt719) * 32.768D / local26);
			local38 = (int) ((double) this.aClass48_3.anInt719 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass48_5 != null) {
			this.aClass48_5.method520();
			this.aClass48_6.method520();
			local77 = (int) ((double) (this.aClass48_5.anInt720 - this.aClass48_5.anInt719) * 32.768D / local26);
			local79 = (int) ((double) this.aClass48_5.anInt719 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray152[local118] != 0) {
				anIntArray158[local118] = 0;
				anIntArray159[local118] = (int) ((double) this.anIntArray154[local118] * local26);
				anIntArray160[local118] = (this.anIntArray152[local118] << 14) / 100;
				anIntArray161[local118] = (int) ((double) (this.aClass48_1.anInt720 - this.aClass48_1.anInt719) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray153[local118]) / local26);
				anIntArray162[local118] = (int) ((double) this.aClass48_1.anInt719 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass48_1.method521(arg0);
			local207 = this.aClass48_2.method521(arg0);
			if (this.aClass48_3 != null) {
				local216 = this.aClass48_3.method521(arg0);
				local222 = this.aClass48_4.method521(arg0);
				local201 += this.method461(local222, this.aClass48_3.anInt721, anInt608, local40) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass48_5 != null) {
				local216 = this.aClass48_5.method521(arg0);
				local222 = this.aClass48_6.method521(arg0);
				local207 = local207 * ((this.method461(local222, this.aClass48_5.anInt721, anInt608, local81) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray152[local216] != 0) {
					local222 = local193 + anIntArray159[local216];
					if (local222 < arg0) {
						anIntArray155[local222] += this.method461(local207 * anIntArray160[local216] >> 15, this.aClass48_1.anInt721, anInt608, anIntArray158[local216]);
						anIntArray158[local216] += (local201 * anIntArray161[local216] >> 16) + anIntArray162[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass48_7 != null) {
			this.aClass48_7.method520();
			this.aClass48_8.method520();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass48_7.method521(arg0);
				local385 = this.aClass48_8.method521(arg0);
				if (local369) {
					local207 = this.aClass48_7.anInt719 + ((this.aClass48_7.anInt720 - this.aClass48_7.anInt719) * local379 >> 8);
				} else {
					local207 = this.aClass48_7.anInt719 + ((this.aClass48_7.anInt720 - this.aClass48_7.anInt719) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray155[local222] = 0;
				}
			}
		}
		if (this.anInt609 > 0 && this.anInt610 > 0) {
			local201 = (int) ((double) this.anInt609 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray155[local207] += anIntArray155[local207 - local201] * this.anInt610 / 100;
			}
		}
		if (this.aClass20_1.anIntArray90[0] > 0 || this.aClass20_1.anIntArray90[1] > 0) {
			this.aClass48_9.method520();
			local201 = this.aClass48_9.method521(arg0 + 1);
			local207 = this.aClass20_1.method247((float) local201 / 65536.0F, 0);
			local216 = this.aClass20_1.method247((float) local201 / 65536.0F, 1);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray155[local222 + local207] * (long) Class20.anInt266 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray155[local222 + local207 - local559 - 1] * (long) Class20.anIntArrayArray12[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray155[local222 - local590 - 1] * (long) Class20.anIntArrayArray12[1][local590] >> 16);
					}
					anIntArray155[local222] = local385;
					local201 = this.aClass48_9.method521(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray155[local222 + local207] * (long) Class20.anInt266 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray155[local222 + local207 - local590 - 1] * (long) Class20.anIntArrayArray12[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray155[local222 - local694 - 1] * (long) Class20.anIntArrayArray12[1][local694] >> 16);
						}
						anIntArray155[local222] = local559;
						local201 = this.aClass48_9.method521(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray155[local222 + local207 - local590 - 1] * (long) Class20.anIntArrayArray12[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray155[local222 - local694 - 1] * (long) Class20.anIntArrayArray12[1][local694] >> 16);
							}
							anIntArray155[local222] = local559;
							this.aClass48_9.method521(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass20_1.method247((float) local201 / 65536.0F, 0);
					local216 = this.aClass20_1.method247((float) local201 / 65536.0F, 1);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray155[local201] < -32768) {
				anIntArray155[local201] = -32768;
			}
			if (anIntArray155[local201] > 32767) {
				anIntArray155[local201] = 32767;
			}
		}
		return anIntArray155;
	}

	@OriginalMember(owner = "client!UXJRWLQU", name = "a", descriptor = "(IIII)I")
	private int method461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2 <= 0) {
				return anInt608;
			} else if (arg1 == 1) {
				return (arg3 & 0x7FFF) < 16384 ? arg0 : -arg0;
			} else if (arg1 == 2) {
				return anIntArray157[arg3 & 0x7FFF] * arg0 >> 14;
			} else if (arg1 == 3) {
				return ((arg3 & 0x7FFF) * arg0 >> 14) - arg0;
			} else if (arg1 == 4) {
				return anIntArray156[arg3 / 2607 & 0x7FFF] * arg0;
			} else {
				return 0;
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("51873, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UXJRWLQU", name = "a", descriptor = "(Lclient!LBBVYYXO;B)V")
	public void method462(@OriginalArg(0) Class2_Sub1_Sub3 arg0) {
		try {
			this.aClass48_1 = new Class48();
			this.aClass48_1.method518(arg0);
			this.aClass48_2 = new Class48();
			this.aClass48_2.method518(arg0);
			@Pc(31) int local31 = arg0.method267();
			if (local31 != 0) {
				arg0.anInt283--;
				this.aClass48_3 = new Class48();
				this.aClass48_3.method518(arg0);
				this.aClass48_4 = new Class48();
				this.aClass48_4.method518(arg0);
			}
			local31 = arg0.method267();
			if (local31 != 0) {
				arg0.anInt283--;
				this.aClass48_5 = new Class48();
				this.aClass48_5.method518(arg0);
				this.aClass48_6 = new Class48();
				this.aClass48_6.method518(arg0);
			}
			local31 = arg0.method267();
			if (local31 != 0) {
				arg0.anInt283--;
				this.aClass48_7 = new Class48();
				this.aClass48_7.method518(arg0);
				this.aClass48_8 = new Class48();
				this.aClass48_8.method518(arg0);
			}
			for (@Pc(123) int local123 = 0; local123 < 10; local123++) {
				@Pc(134) int local134 = arg0.method281();
				if (local134 == 0) {
					break;
				}
				this.anIntArray152[local123] = local134;
				this.anIntArray153[local123] = arg0.method280();
				this.anIntArray154[local123] = arg0.method281();
			}
			this.anInt609 = arg0.method281();
			this.anInt610 = arg0.method281();
			this.anInt611 = arg0.method269();
			this.anInt612 = arg0.method269();
			this.aClass20_1 = new Class20();
			this.aClass48_9 = new Class48();
			this.aClass20_1.method248(arg0, this.aClass48_9);
		} catch (@Pc(192) RuntimeException local192) {
			signlink.reporterror("8279, " + arg0 + ", " + 59 + ", " + local192.toString());
			throw new RuntimeException();
		}
	}
}
