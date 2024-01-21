import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JUIUBOIF")
public final class Class20 {

	@OriginalMember(owner = "client!JUIUBOIF", name = "u", descriptor = "[I")
	private static int[] anIntArray88;

	@OriginalMember(owner = "client!JUIUBOIF", name = "v", descriptor = "[I")
	private static int[] anIntArray89;

	@OriginalMember(owner = "client!JUIUBOIF", name = "w", descriptor = "[I")
	private static int[] anIntArray90;

	@OriginalMember(owner = "client!JUIUBOIF", name = "x", descriptor = "[I")
	private static int[] anIntArray91 = new int[5];

	@OriginalMember(owner = "client!JUIUBOIF", name = "y", descriptor = "[I")
	private static int[] anIntArray92 = new int[5];

	@OriginalMember(owner = "client!JUIUBOIF", name = "z", descriptor = "[I")
	private static int[] anIntArray93 = new int[5];

	@OriginalMember(owner = "client!JUIUBOIF", name = "A", descriptor = "[I")
	private static int[] anIntArray94 = new int[5];

	@OriginalMember(owner = "client!JUIUBOIF", name = "B", descriptor = "[I")
	private static int[] anIntArray95 = new int[5];

	@OriginalMember(owner = "client!JUIUBOIF", name = "d", descriptor = "Lclient!VMVYFNTB;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!JUIUBOIF", name = "e", descriptor = "Lclient!VMVYFNTB;")
	private Class47 aClass47_2;

	@OriginalMember(owner = "client!JUIUBOIF", name = "f", descriptor = "Lclient!VMVYFNTB;")
	private Class47 aClass47_3;

	@OriginalMember(owner = "client!JUIUBOIF", name = "g", descriptor = "Lclient!VMVYFNTB;")
	private Class47 aClass47_4;

	@OriginalMember(owner = "client!JUIUBOIF", name = "h", descriptor = "Lclient!VMVYFNTB;")
	private Class47 aClass47_5;

	@OriginalMember(owner = "client!JUIUBOIF", name = "i", descriptor = "Lclient!VMVYFNTB;")
	private Class47 aClass47_6;

	@OriginalMember(owner = "client!JUIUBOIF", name = "j", descriptor = "Lclient!VMVYFNTB;")
	private Class47 aClass47_7;

	@OriginalMember(owner = "client!JUIUBOIF", name = "k", descriptor = "Lclient!VMVYFNTB;")
	private Class47 aClass47_8;

	@OriginalMember(owner = "client!JUIUBOIF", name = "o", descriptor = "I")
	private int anInt370;

	@OriginalMember(owner = "client!JUIUBOIF", name = "q", descriptor = "Lclient!EQHIVIBA;")
	private Class11 aClass11_1;

	@OriginalMember(owner = "client!JUIUBOIF", name = "r", descriptor = "Lclient!VMVYFNTB;")
	private Class47 aClass47_9;

	@OriginalMember(owner = "client!JUIUBOIF", name = "t", descriptor = "I")
	public int anInt373;

	@OriginalMember(owner = "client!JUIUBOIF", name = "a", descriptor = "B")
	private byte aByte12 = -27;

	@OriginalMember(owner = "client!JUIUBOIF", name = "b", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!JUIUBOIF", name = "c", descriptor = "B")
	private byte aByte13 = 102;

	@OriginalMember(owner = "client!JUIUBOIF", name = "l", descriptor = "[I")
	private int[] anIntArray85 = new int[5];

	@OriginalMember(owner = "client!JUIUBOIF", name = "m", descriptor = "[I")
	private int[] anIntArray86 = new int[5];

	@OriginalMember(owner = "client!JUIUBOIF", name = "n", descriptor = "[I")
	private int[] anIntArray87 = new int[5];

	@OriginalMember(owner = "client!JUIUBOIF", name = "p", descriptor = "I")
	private int anInt371 = 100;

	@OriginalMember(owner = "client!JUIUBOIF", name = "s", descriptor = "I")
	public int anInt372 = 500;

	@OriginalMember(owner = "client!JUIUBOIF", name = "a", descriptor = "()V")
	public static void method224() {
		anIntArray89 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray89[local6] = 1;
			} else {
				anIntArray89[local6] = -1;
			}
		}
		anIntArray90 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray90[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray88 = new int[220500];
	}

	@OriginalMember(owner = "client!JUIUBOIF", name = "a", descriptor = "(II)[I")
	public int[] method225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray88[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray88;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass47_1.method477();
		this.aClass47_2.method477();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass47_3 != null) {
			this.aClass47_3.method477();
			this.aClass47_4.method477();
			local36 = (int) ((double) (this.aClass47_3.anInt773 - this.aClass47_3.anInt772) * 32.768D / local26);
			local38 = (int) ((double) this.aClass47_3.anInt772 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass47_5 != null) {
			this.aClass47_5.method477();
			this.aClass47_6.method477();
			local77 = (int) ((double) (this.aClass47_5.anInt773 - this.aClass47_5.anInt772) * 32.768D / local26);
			local79 = (int) ((double) this.aClass47_5.anInt772 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray85[local118] != 0) {
				anIntArray91[local118] = 0;
				anIntArray92[local118] = (int) ((double) this.anIntArray87[local118] * local26);
				anIntArray93[local118] = (this.anIntArray85[local118] << 14) / 100;
				anIntArray94[local118] = (int) ((double) (this.aClass47_1.anInt773 - this.aClass47_1.anInt772) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray86[local118]) / local26);
				anIntArray95[local118] = (int) ((double) this.aClass47_1.anInt772 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass47_1.method478(arg0);
			local207 = this.aClass47_2.method478(arg0);
			if (this.aClass47_3 != null) {
				local216 = this.aClass47_3.method478(arg0);
				local222 = this.aClass47_4.method478(arg0);
				local201 += this.method226(local40, this.aClass47_3.anInt774, local222) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass47_5 != null) {
				local216 = this.aClass47_5.method478(arg0);
				local222 = this.aClass47_6.method478(arg0);
				local207 = local207 * ((this.method226(local81, this.aClass47_5.anInt774, local222) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray85[local216] != 0) {
					local222 = local193 + anIntArray92[local216];
					if (local222 < arg0) {
						anIntArray88[local222] += this.method226(anIntArray91[local216], this.aClass47_1.anInt774, local207 * anIntArray93[local216] >> 15);
						anIntArray91[local216] += (local201 * anIntArray94[local216] >> 16) + anIntArray95[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass47_7 != null) {
			this.aClass47_7.method477();
			this.aClass47_8.method477();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass47_7.method478(arg0);
				local385 = this.aClass47_8.method478(arg0);
				if (local369) {
					local207 = this.aClass47_7.anInt772 + ((this.aClass47_7.anInt773 - this.aClass47_7.anInt772) * local379 >> 8);
				} else {
					local207 = this.aClass47_7.anInt772 + ((this.aClass47_7.anInt773 - this.aClass47_7.anInt772) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray88[local222] = 0;
				}
			}
		}
		if (this.anInt370 > 0 && this.anInt371 > 0) {
			local201 = (int) ((double) this.anInt370 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray88[local207] += anIntArray88[local207 - local201] * this.anInt371 / 100;
			}
		}
		if (this.aClass11_1.anIntArray22[0] > 0 || this.aClass11_1.anIntArray22[1] > 0) {
			this.aClass47_9.method477();
			local201 = this.aClass47_9.method478(arg0 + 1);
			local207 = this.aClass11_1.method100((float) local201 / 65536.0F, 0);
			local216 = this.aClass11_1.method100((float) local201 / 65536.0F, 1);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray88[local222 + local207] * (long) Class11.anInt165 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray88[local222 + local207 - local559 - 1] * (long) Class11.anIntArrayArray5[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray88[local222 - local590 - 1] * (long) Class11.anIntArrayArray5[1][local590] >> 16);
					}
					anIntArray88[local222] = local385;
					local201 = this.aClass47_9.method478(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray88[local222 + local207] * (long) Class11.anInt165 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray88[local222 + local207 - local590 - 1] * (long) Class11.anIntArrayArray5[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray88[local222 - local694 - 1] * (long) Class11.anIntArrayArray5[1][local694] >> 16);
						}
						anIntArray88[local222] = local559;
						local201 = this.aClass47_9.method478(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray88[local222 + local207 - local590 - 1] * (long) Class11.anIntArrayArray5[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray88[local222 - local694 - 1] * (long) Class11.anIntArrayArray5[1][local694] >> 16);
							}
							anIntArray88[local222] = local559;
							this.aClass47_9.method478(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass11_1.method100((float) local201 / 65536.0F, 0);
					local216 = this.aClass11_1.method100((float) local201 / 65536.0F, 1);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray88[local201] < -32768) {
				anIntArray88[local201] = -32768;
			}
			if (anIntArray88[local201] > 32767) {
				anIntArray88[local201] = 32767;
			}
		}
		return anIntArray88;
	}

	@OriginalMember(owner = "client!JUIUBOIF", name = "a", descriptor = "(IBII)I")
	private int method226(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aByte13 != 102) {
				this.aBoolean79 = !this.aBoolean79;
			}
			if (arg1 == 1) {
				return (arg0 & 0x7FFF) < 16384 ? arg2 : -arg2;
			} else if (arg1 == 2) {
				return anIntArray90[arg0 & 0x7FFF] * arg2 >> 14;
			} else if (arg1 == 3) {
				return ((arg0 & 0x7FFF) * arg2 >> 14) - arg2;
			} else if (arg1 == 4) {
				return anIntArray89[arg0 / 2607 & 0x7FFF] * arg2;
			} else {
				return 0;
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("93273, " + arg0 + ", " + 102 + ", " + arg1 + ", " + arg2 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JUIUBOIF", name = "a", descriptor = "(BLclient!XJCNBMKS;)V")
	public void method227(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			this.aClass47_1 = new Class47();
			this.aClass47_1.method475(this.aByte12, arg1);
			this.aClass47_2 = new Class47();
			this.aClass47_2.method475(this.aByte12, arg1);
			@Pc(26) int local26 = arg1.method498();
			if (local26 != 0) {
				arg1.anInt806--;
				this.aClass47_3 = new Class47();
				this.aClass47_3.method475(this.aByte12, arg1);
				this.aClass47_4 = new Class47();
				this.aClass47_4.method475(this.aByte12, arg1);
			}
			local26 = arg1.method498();
			if (local26 != 0) {
				arg1.anInt806--;
				this.aClass47_5 = new Class47();
				this.aClass47_5.method475(this.aByte12, arg1);
				this.aClass47_6 = new Class47();
				this.aClass47_6.method475(this.aByte12, arg1);
			}
			local26 = arg1.method498();
			if (local26 != 0) {
				arg1.anInt806--;
				this.aClass47_7 = new Class47();
				this.aClass47_7.method475(this.aByte12, arg1);
				this.aClass47_8 = new Class47();
				this.aClass47_8.method475(this.aByte12, arg1);
			}
			for (@Pc(124) int local124 = 0; local124 < 10; local124++) {
				@Pc(135) int local135 = arg1.method512();
				if (local135 == 0) {
					break;
				}
				this.anIntArray85[local124] = local135;
				this.anIntArray86[local124] = arg1.method511();
				this.anIntArray87[local124] = arg1.method512();
			}
			this.anInt370 = arg1.method512();
			this.anInt371 = arg1.method512();
			this.anInt372 = arg1.method500();
			this.anInt373 = arg1.method500();
			if (arg0 != this.aByte12) {
				this.aBoolean79 = !this.aBoolean79;
			}
			this.aClass11_1 = new Class11();
			this.aClass47_9 = new Class47();
			this.aClass11_1.method101(arg1, this.aClass47_9, 857);
		} catch (@Pc(205) RuntimeException local205) {
			signlink.reporterror("56701, " + arg0 + ", " + arg1 + ", " + local205.toString());
			throw new RuntimeException();
		}
	}
}
