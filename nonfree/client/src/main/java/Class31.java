import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QWSZQDKL")
public final class Class31 {

	@OriginalMember(owner = "client!QWSZQDKL", name = "r", descriptor = "[I")
	private static int[] anIntArray141;

	@OriginalMember(owner = "client!QWSZQDKL", name = "s", descriptor = "[I")
	private static int[] anIntArray142;

	@OriginalMember(owner = "client!QWSZQDKL", name = "t", descriptor = "[I")
	private static int[] anIntArray143;

	@OriginalMember(owner = "client!QWSZQDKL", name = "u", descriptor = "[I")
	private static int[] anIntArray144 = new int[5];

	@OriginalMember(owner = "client!QWSZQDKL", name = "v", descriptor = "[I")
	private static int[] anIntArray145 = new int[5];

	@OriginalMember(owner = "client!QWSZQDKL", name = "w", descriptor = "[I")
	private static int[] anIntArray146 = new int[5];

	@OriginalMember(owner = "client!QWSZQDKL", name = "x", descriptor = "[I")
	private static int[] anIntArray147 = new int[5];

	@OriginalMember(owner = "client!QWSZQDKL", name = "y", descriptor = "[I")
	private static int[] anIntArray148 = new int[5];

	@OriginalMember(owner = "client!QWSZQDKL", name = "a", descriptor = "Lclient!KEEMQUKU;")
	private Class21 aClass21_1;

	@OriginalMember(owner = "client!QWSZQDKL", name = "b", descriptor = "Lclient!KEEMQUKU;")
	private Class21 aClass21_2;

	@OriginalMember(owner = "client!QWSZQDKL", name = "c", descriptor = "Lclient!KEEMQUKU;")
	private Class21 aClass21_3;

	@OriginalMember(owner = "client!QWSZQDKL", name = "d", descriptor = "Lclient!KEEMQUKU;")
	private Class21 aClass21_4;

	@OriginalMember(owner = "client!QWSZQDKL", name = "e", descriptor = "Lclient!KEEMQUKU;")
	private Class21 aClass21_5;

	@OriginalMember(owner = "client!QWSZQDKL", name = "f", descriptor = "Lclient!KEEMQUKU;")
	private Class21 aClass21_6;

	@OriginalMember(owner = "client!QWSZQDKL", name = "g", descriptor = "Lclient!KEEMQUKU;")
	private Class21 aClass21_7;

	@OriginalMember(owner = "client!QWSZQDKL", name = "h", descriptor = "Lclient!KEEMQUKU;")
	private Class21 aClass21_8;

	@OriginalMember(owner = "client!QWSZQDKL", name = "l", descriptor = "I")
	private int anInt410;

	@OriginalMember(owner = "client!QWSZQDKL", name = "n", descriptor = "Lclient!OYVSGGSR;")
	private Class29 aClass29_1;

	@OriginalMember(owner = "client!QWSZQDKL", name = "o", descriptor = "Lclient!KEEMQUKU;")
	private Class21 aClass21_9;

	@OriginalMember(owner = "client!QWSZQDKL", name = "q", descriptor = "I")
	public int anInt413;

	@OriginalMember(owner = "client!QWSZQDKL", name = "i", descriptor = "[I")
	private int[] anIntArray138 = new int[5];

	@OriginalMember(owner = "client!QWSZQDKL", name = "j", descriptor = "[I")
	private int[] anIntArray139 = new int[5];

	@OriginalMember(owner = "client!QWSZQDKL", name = "k", descriptor = "[I")
	private int[] anIntArray140 = new int[5];

	@OriginalMember(owner = "client!QWSZQDKL", name = "m", descriptor = "I")
	private int anInt411 = 100;

	@OriginalMember(owner = "client!QWSZQDKL", name = "p", descriptor = "I")
	public int anInt412 = 500;

	@OriginalMember(owner = "client!QWSZQDKL", name = "a", descriptor = "()V")
	public static void method299() {
		anIntArray142 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray142[local6] = 1;
			} else {
				anIntArray142[local6] = -1;
			}
		}
		anIntArray143 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray143[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray141 = new int[220500];
	}

	@OriginalMember(owner = "client!QWSZQDKL", name = "a", descriptor = "(II)[I")
	public int[] method300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray141[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray141;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass21_1.method155();
		this.aClass21_2.method155();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass21_3 != null) {
			this.aClass21_3.method155();
			this.aClass21_4.method155();
			local36 = (int) ((double) (this.aClass21_3.anInt307 - this.aClass21_3.anInt306) * 32.768D / local26);
			local38 = (int) ((double) this.aClass21_3.anInt306 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass21_5 != null) {
			this.aClass21_5.method155();
			this.aClass21_6.method155();
			local77 = (int) ((double) (this.aClass21_5.anInt307 - this.aClass21_5.anInt306) * 32.768D / local26);
			local79 = (int) ((double) this.aClass21_5.anInt306 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray138[local118] != 0) {
				anIntArray144[local118] = 0;
				anIntArray145[local118] = (int) ((double) this.anIntArray140[local118] * local26);
				anIntArray146[local118] = (this.anIntArray138[local118] << 14) / 100;
				anIntArray147[local118] = (int) ((double) (this.aClass21_1.anInt307 - this.aClass21_1.anInt306) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray139[local118]) / local26);
				anIntArray148[local118] = (int) ((double) this.aClass21_1.anInt306 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass21_1.method156((byte) 5, arg0);
			local207 = this.aClass21_2.method156((byte) 5, arg0);
			if (this.aClass21_3 != null) {
				local216 = this.aClass21_3.method156((byte) 5, arg0);
				local222 = this.aClass21_4.method156((byte) 5, arg0);
				local201 += this.method301(local222, this.aClass21_3.anInt308, local40) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass21_5 != null) {
				local216 = this.aClass21_5.method156((byte) 5, arg0);
				local222 = this.aClass21_6.method156((byte) 5, arg0);
				local207 = local207 * ((this.method301(local222, this.aClass21_5.anInt308, local81) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray138[local216] != 0) {
					local222 = local193 + anIntArray145[local216];
					if (local222 < arg0) {
						anIntArray141[local222] += this.method301(local207 * anIntArray146[local216] >> 15, this.aClass21_1.anInt308, anIntArray144[local216]);
						anIntArray144[local216] += (local201 * anIntArray147[local216] >> 16) + anIntArray148[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass21_7 != null) {
			this.aClass21_7.method155();
			this.aClass21_8.method155();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass21_7.method156((byte) 5, arg0);
				local385 = this.aClass21_8.method156((byte) 5, arg0);
				if (local369) {
					local207 = this.aClass21_7.anInt306 + ((this.aClass21_7.anInt307 - this.aClass21_7.anInt306) * local379 >> 8);
				} else {
					local207 = this.aClass21_7.anInt306 + ((this.aClass21_7.anInt307 - this.aClass21_7.anInt306) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray141[local222] = 0;
				}
			}
		}
		if (this.anInt410 > 0 && this.anInt411 > 0) {
			local201 = (int) ((double) this.anInt410 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray141[local207] += anIntArray141[local207 - local201] * this.anInt411 / 100;
			}
		}
		if (this.aClass29_1.anIntArray128[0] > 0 || this.aClass29_1.anIntArray128[1] > 0) {
			this.aClass21_9.method155();
			local201 = this.aClass21_9.method156((byte) 5, arg0 + 1);
			local207 = this.aClass29_1.method223(0, (float) local201 / 65536.0F);
			local216 = this.aClass29_1.method223(1, (float) local201 / 65536.0F);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray141[local222 + local207] * (long) Class29.anInt378 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray141[local222 + local207 - 1 - local559] * (long) Class29.anIntArrayArray17[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray141[local222 - 1 - local590] * (long) Class29.anIntArrayArray17[1][local590] >> 16);
					}
					anIntArray141[local222] = local385;
					local201 = this.aClass21_9.method156((byte) 5, arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray141[local222 + local207] * (long) Class29.anInt378 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray141[local222 + local207 - 1 - local590] * (long) Class29.anIntArrayArray17[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray141[local222 - 1 - local694] * (long) Class29.anIntArrayArray17[1][local694] >> 16);
						}
						anIntArray141[local222] = local559;
						local201 = this.aClass21_9.method156((byte) 5, arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray141[local222 + local207 - 1 - local590] * (long) Class29.anIntArrayArray17[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray141[local222 - 1 - local694] * (long) Class29.anIntArrayArray17[1][local694] >> 16);
							}
							anIntArray141[local222] = local559;
							this.aClass21_9.method156((byte) 5, arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass29_1.method223(0, (float) local201 / 65536.0F);
					local216 = this.aClass29_1.method223(1, (float) local201 / 65536.0F);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray141[local201] < -32768) {
				anIntArray141[local201] = -32768;
			}
			if (anIntArray141[local201] > 32767) {
				anIntArray141[local201] = 32767;
			}
		}
		return anIntArray141;
	}

	@OriginalMember(owner = "client!QWSZQDKL", name = "a", descriptor = "(IIBI)I")
	private int method301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 == 1) {
				return (arg2 & 0x7FFF) < 16384 ? arg0 : -arg0;
			} else if (arg1 == 2) {
				return anIntArray143[arg2 & 0x7FFF] * arg0 >> 14;
			} else if (arg1 == 3) {
				return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
			} else if (arg1 == 4) {
				return anIntArray142[arg2 / 2607 & 0x7FFF] * arg0;
			} else {
				return 0;
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("70990, " + arg0 + ", " + arg1 + ", " + 73 + ", " + arg2 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QWSZQDKL", name = "a", descriptor = "(Lclient!PQBRPYKE;Z)V")
	public void method302(@OriginalArg(0) Class6_Sub1_Sub4 arg0) {
		try {
			this.aClass21_1 = new Class21();
			this.aClass21_1.method153(arg0);
			this.aClass21_2 = new Class21();
			this.aClass21_2.method153(arg0);
			@Pc(24) int local24 = arg0.method239();
			if (local24 != 0) {
				arg0.anInt390--;
				this.aClass21_3 = new Class21();
				this.aClass21_3.method153(arg0);
				this.aClass21_4 = new Class21();
				this.aClass21_4.method153(arg0);
			}
			local24 = arg0.method239();
			if (local24 != 0) {
				arg0.anInt390--;
				this.aClass21_5 = new Class21();
				this.aClass21_5.method153(arg0);
				this.aClass21_6 = new Class21();
				this.aClass21_6.method153(arg0);
			}
			local24 = arg0.method239();
			if (local24 != 0) {
				arg0.anInt390--;
				this.aClass21_7 = new Class21();
				this.aClass21_7.method153(arg0);
				this.aClass21_8 = new Class21();
				this.aClass21_8.method153(arg0);
			}
			for (@Pc(116) int local116 = 0; local116 < 10; local116++) {
				@Pc(127) int local127 = arg0.method253();
				if (local127 == 0) {
					break;
				}
				this.anIntArray138[local116] = local127;
				this.anIntArray139[local116] = arg0.method252();
				this.anIntArray140[local116] = arg0.method253();
			}
			this.anInt410 = arg0.method253();
			this.anInt411 = arg0.method253();
			this.anInt412 = arg0.method241();
			this.anInt413 = arg0.method241();
			this.aClass29_1 = new Class29();
			this.aClass21_9 = new Class21();
			this.aClass29_1.method224(arg0, this.aClass21_9);
		} catch (@Pc(194) RuntimeException local194) {
			signlink.reporterror("70522, " + arg0 + ", " + false + ", " + local194.toString());
			throw new RuntimeException();
		}
	}
}
