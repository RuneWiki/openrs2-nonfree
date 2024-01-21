import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RLHOXRLU")
public final class Class28 {

	@OriginalMember(owner = "client!RLHOXRLU", name = "u", descriptor = "[I")
	private static int[] anIntArray158;

	@OriginalMember(owner = "client!RLHOXRLU", name = "v", descriptor = "[I")
	private static int[] anIntArray159;

	@OriginalMember(owner = "client!RLHOXRLU", name = "w", descriptor = "[I")
	private static int[] anIntArray160;

	@OriginalMember(owner = "client!RLHOXRLU", name = "c", descriptor = "B")
	private static byte aByte26 = 6;

	@OriginalMember(owner = "client!RLHOXRLU", name = "x", descriptor = "[I")
	private static int[] anIntArray161 = new int[5];

	@OriginalMember(owner = "client!RLHOXRLU", name = "y", descriptor = "[I")
	private static int[] anIntArray162 = new int[5];

	@OriginalMember(owner = "client!RLHOXRLU", name = "z", descriptor = "[I")
	private static int[] anIntArray163 = new int[5];

	@OriginalMember(owner = "client!RLHOXRLU", name = "A", descriptor = "[I")
	private static int[] anIntArray164 = new int[5];

	@OriginalMember(owner = "client!RLHOXRLU", name = "B", descriptor = "[I")
	private static int[] anIntArray165 = new int[5];

	@OriginalMember(owner = "client!RLHOXRLU", name = "d", descriptor = "Lclient!VJXKRAVR;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!RLHOXRLU", name = "e", descriptor = "Lclient!VJXKRAVR;")
	private Class39 aClass39_2;

	@OriginalMember(owner = "client!RLHOXRLU", name = "f", descriptor = "Lclient!VJXKRAVR;")
	private Class39 aClass39_3;

	@OriginalMember(owner = "client!RLHOXRLU", name = "g", descriptor = "Lclient!VJXKRAVR;")
	private Class39 aClass39_4;

	@OriginalMember(owner = "client!RLHOXRLU", name = "h", descriptor = "Lclient!VJXKRAVR;")
	private Class39 aClass39_5;

	@OriginalMember(owner = "client!RLHOXRLU", name = "i", descriptor = "Lclient!VJXKRAVR;")
	private Class39 aClass39_6;

	@OriginalMember(owner = "client!RLHOXRLU", name = "j", descriptor = "Lclient!VJXKRAVR;")
	private Class39 aClass39_7;

	@OriginalMember(owner = "client!RLHOXRLU", name = "k", descriptor = "Lclient!VJXKRAVR;")
	private Class39 aClass39_8;

	@OriginalMember(owner = "client!RLHOXRLU", name = "o", descriptor = "I")
	private int anInt578;

	@OriginalMember(owner = "client!RLHOXRLU", name = "q", descriptor = "Lclient!RFLXBNRG;")
	private Class26 aClass26_1;

	@OriginalMember(owner = "client!RLHOXRLU", name = "r", descriptor = "Lclient!VJXKRAVR;")
	private Class39 aClass39_9;

	@OriginalMember(owner = "client!RLHOXRLU", name = "t", descriptor = "I")
	public int anInt581;

	@OriginalMember(owner = "client!RLHOXRLU", name = "a", descriptor = "Z")
	private boolean aBoolean152 = true;

	@OriginalMember(owner = "client!RLHOXRLU", name = "b", descriptor = "I")
	private int anInt577 = -132;

	@OriginalMember(owner = "client!RLHOXRLU", name = "l", descriptor = "[I")
	private int[] anIntArray155 = new int[5];

	@OriginalMember(owner = "client!RLHOXRLU", name = "m", descriptor = "[I")
	private int[] anIntArray156 = new int[5];

	@OriginalMember(owner = "client!RLHOXRLU", name = "n", descriptor = "[I")
	private int[] anIntArray157 = new int[5];

	@OriginalMember(owner = "client!RLHOXRLU", name = "p", descriptor = "I")
	private int anInt579 = 100;

	@OriginalMember(owner = "client!RLHOXRLU", name = "s", descriptor = "I")
	public int anInt580 = 500;

	@OriginalMember(owner = "client!RLHOXRLU", name = "a", descriptor = "()V")
	public static void method384() {
		anIntArray159 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray159[local6] = 1;
			} else {
				anIntArray159[local6] = -1;
			}
		}
		anIntArray160 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray160[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray158 = new int[220500];
	}

	@OriginalMember(owner = "client!RLHOXRLU", name = "a", descriptor = "(II)[I")
	public int[] method385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray158[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray158;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass39_1.method529();
		this.aClass39_2.method529();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass39_3 != null) {
			this.aClass39_3.method529();
			this.aClass39_4.method529();
			local36 = (int) ((double) (this.aClass39_3.anInt721 - this.aClass39_3.anInt720) * 32.768D / local26);
			local38 = (int) ((double) this.aClass39_3.anInt720 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass39_5 != null) {
			this.aClass39_5.method529();
			this.aClass39_6.method529();
			local77 = (int) ((double) (this.aClass39_5.anInt721 - this.aClass39_5.anInt720) * 32.768D / local26);
			local79 = (int) ((double) this.aClass39_5.anInt720 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray155[local118] != 0) {
				anIntArray161[local118] = 0;
				anIntArray162[local118] = (int) ((double) this.anIntArray157[local118] * local26);
				anIntArray163[local118] = (this.anIntArray155[local118] << 14) / 100;
				anIntArray164[local118] = (int) ((double) (this.aClass39_1.anInt721 - this.aClass39_1.anInt720) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray156[local118]) / local26);
				anIntArray165[local118] = (int) ((double) this.aClass39_1.anInt720 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass39_1.method530(aByte26, arg0);
			local207 = this.aClass39_2.method530(aByte26, arg0);
			if (this.aClass39_3 != null) {
				local216 = this.aClass39_3.method530(aByte26, arg0);
				local222 = this.aClass39_4.method530(aByte26, arg0);
				local201 += this.method386(this.aClass39_3.anInt722, local222, local40) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass39_5 != null) {
				local216 = this.aClass39_5.method530(aByte26, arg0);
				local222 = this.aClass39_6.method530(aByte26, arg0);
				local207 = local207 * ((this.method386(this.aClass39_5.anInt722, local222, local81) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray155[local216] != 0) {
					local222 = local193 + anIntArray162[local216];
					if (local222 < arg0) {
						anIntArray158[local222] += this.method386(this.aClass39_1.anInt722, local207 * anIntArray163[local216] >> 15, anIntArray161[local216]);
						anIntArray161[local216] += (local201 * anIntArray164[local216] >> 16) + anIntArray165[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass39_7 != null) {
			this.aClass39_7.method529();
			this.aClass39_8.method529();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass39_7.method530(aByte26, arg0);
				local385 = this.aClass39_8.method530(aByte26, arg0);
				if (local369) {
					local207 = this.aClass39_7.anInt720 + ((this.aClass39_7.anInt721 - this.aClass39_7.anInt720) * local379 >> 8);
				} else {
					local207 = this.aClass39_7.anInt720 + ((this.aClass39_7.anInt721 - this.aClass39_7.anInt720) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray158[local222] = 0;
				}
			}
		}
		if (this.anInt578 > 0 && this.anInt579 > 0) {
			local201 = (int) ((double) this.anInt578 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray158[local207] += anIntArray158[local207 - local201] * this.anInt579 / 100;
			}
		}
		if (this.aClass26_1.anIntArray153[0] > 0 || this.aClass26_1.anIntArray153[1] > 0) {
			this.aClass39_9.method529();
			local201 = this.aClass39_9.method530(aByte26, arg0 + 1);
			local207 = this.aClass26_1.method382(0, (float) local201 / 65536.0F);
			local216 = this.aClass26_1.method382(1, (float) local201 / 65536.0F);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray158[local222 + local207] * (long) Class26.anInt558 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray158[local222 + local207 - local559 - 1] * (long) Class26.anIntArrayArray19[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray158[local222 - local590 - 1] * (long) Class26.anIntArrayArray19[1][local590] >> 16);
					}
					anIntArray158[local222] = local385;
					local201 = this.aClass39_9.method530(aByte26, arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray158[local222 + local207] * (long) Class26.anInt558 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray158[local222 + local207 - local590 - 1] * (long) Class26.anIntArrayArray19[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray158[local222 - local694 - 1] * (long) Class26.anIntArrayArray19[1][local694] >> 16);
						}
						anIntArray158[local222] = local559;
						local201 = this.aClass39_9.method530(aByte26, arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray158[local222 + local207 - local590 - 1] * (long) Class26.anIntArrayArray19[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray158[local222 - local694 - 1] * (long) Class26.anIntArrayArray19[1][local694] >> 16);
							}
							anIntArray158[local222] = local559;
							this.aClass39_9.method530(aByte26, arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass26_1.method382(0, (float) local201 / 65536.0F);
					local216 = this.aClass26_1.method382(1, (float) local201 / 65536.0F);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray158[local201] < -32768) {
				anIntArray158[local201] = -32768;
			}
			if (anIntArray158[local201] > 32767) {
				anIntArray158[local201] = 32767;
			}
		}
		return anIntArray158;
	}

	@OriginalMember(owner = "client!RLHOXRLU", name = "a", descriptor = "(IIII)I")
	private int method386(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 == 1) {
				return (arg2 & 0x7FFF) < 16384 ? arg1 : -arg1;
			} else if (arg0 == 2) {
				return anIntArray160[arg2 & 0x7FFF] * arg1 >> 14;
			} else if (arg0 == 3) {
				return ((arg2 & 0x7FFF) * arg1 >> 14) - arg1;
			} else if (arg0 == 4) {
				return anIntArray159[arg2 / 2607 & 0x7FFF] * arg1;
			} else {
				return 0;
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("97349, " + arg0 + ", " + -803 + ", " + arg1 + ", " + arg2 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RLHOXRLU", name = "a", descriptor = "(Lclient!MLYYHULT;B)V")
	public void method387(@OriginalArg(0) Class3_Sub1_Sub2 arg0) {
		try {
			this.aClass39_1 = new Class39();
			this.aClass39_1.method527(arg0);
			this.aClass39_2 = new Class39();
			this.aClass39_2.method527(arg0);
			@Pc(24) int local24 = arg0.method200();
			if (local24 != 0) {
				arg0.anInt429--;
				this.aClass39_3 = new Class39();
				this.aClass39_3.method527(arg0);
				this.aClass39_4 = new Class39();
				this.aClass39_4.method527(arg0);
			}
			local24 = arg0.method200();
			if (local24 != 0) {
				arg0.anInt429--;
				this.aClass39_5 = new Class39();
				this.aClass39_5.method527(arg0);
				this.aClass39_6 = new Class39();
				this.aClass39_6.method527(arg0);
			}
			local24 = arg0.method200();
			if (local24 != 0) {
				arg0.anInt429--;
				this.aClass39_7 = new Class39();
				this.aClass39_7.method527(arg0);
				this.aClass39_8 = new Class39();
				this.aClass39_8.method527(arg0);
			}
			for (@Pc(116) int local116 = 0; local116 < 10; local116++) {
				@Pc(127) int local127 = arg0.method214();
				if (local127 == 0) {
					break;
				}
				this.anIntArray155[local116] = local127;
				this.anIntArray156[local116] = arg0.method213();
				this.anIntArray157[local116] = arg0.method214();
			}
			this.anInt578 = arg0.method214();
			this.anInt579 = arg0.method214();
			this.anInt580 = arg0.method202();
			this.anInt581 = arg0.method202();
			this.aClass26_1 = new Class26();
			this.aClass39_9 = new Class39();
			this.aClass26_1.method383(this.aClass39_9, arg0);
		} catch (@Pc(196) RuntimeException local196) {
			signlink.reporterror("49894, " + arg0 + ", " + 2 + ", " + local196.toString());
			throw new RuntimeException();
		}
	}
}
