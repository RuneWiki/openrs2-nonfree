import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KWOZHDOE")
public final class Class22 {

	@OriginalMember(owner = "client!KWOZHDOE", name = "t", descriptor = "[I")
	private static int[] anIntArray78;

	@OriginalMember(owner = "client!KWOZHDOE", name = "u", descriptor = "[I")
	private static int[] anIntArray79;

	@OriginalMember(owner = "client!KWOZHDOE", name = "v", descriptor = "[I")
	private static int[] anIntArray80;

	@OriginalMember(owner = "client!KWOZHDOE", name = "b", descriptor = "I")
	private static int anInt402 = 1;

	@OriginalMember(owner = "client!KWOZHDOE", name = "w", descriptor = "[I")
	private static int[] anIntArray81 = new int[5];

	@OriginalMember(owner = "client!KWOZHDOE", name = "x", descriptor = "[I")
	private static int[] anIntArray82 = new int[5];

	@OriginalMember(owner = "client!KWOZHDOE", name = "y", descriptor = "[I")
	private static int[] anIntArray83 = new int[5];

	@OriginalMember(owner = "client!KWOZHDOE", name = "z", descriptor = "[I")
	private static int[] anIntArray84 = new int[5];

	@OriginalMember(owner = "client!KWOZHDOE", name = "A", descriptor = "[I")
	private static int[] anIntArray85 = new int[5];

	@OriginalMember(owner = "client!KWOZHDOE", name = "c", descriptor = "Lclient!YJSRODCC;")
	private Class45 aClass45_1;

	@OriginalMember(owner = "client!KWOZHDOE", name = "d", descriptor = "Lclient!YJSRODCC;")
	private Class45 aClass45_2;

	@OriginalMember(owner = "client!KWOZHDOE", name = "e", descriptor = "Lclient!YJSRODCC;")
	private Class45 aClass45_3;

	@OriginalMember(owner = "client!KWOZHDOE", name = "f", descriptor = "Lclient!YJSRODCC;")
	private Class45 aClass45_4;

	@OriginalMember(owner = "client!KWOZHDOE", name = "g", descriptor = "Lclient!YJSRODCC;")
	private Class45 aClass45_5;

	@OriginalMember(owner = "client!KWOZHDOE", name = "h", descriptor = "Lclient!YJSRODCC;")
	private Class45 aClass45_6;

	@OriginalMember(owner = "client!KWOZHDOE", name = "i", descriptor = "Lclient!YJSRODCC;")
	private Class45 aClass45_7;

	@OriginalMember(owner = "client!KWOZHDOE", name = "j", descriptor = "Lclient!YJSRODCC;")
	private Class45 aClass45_8;

	@OriginalMember(owner = "client!KWOZHDOE", name = "n", descriptor = "I")
	private int anInt403;

	@OriginalMember(owner = "client!KWOZHDOE", name = "p", descriptor = "Lclient!BMQRLUHC;")
	private Class5 aClass5_1;

	@OriginalMember(owner = "client!KWOZHDOE", name = "q", descriptor = "Lclient!YJSRODCC;")
	private Class45 aClass45_9;

	@OriginalMember(owner = "client!KWOZHDOE", name = "s", descriptor = "I")
	public int anInt406;

	@OriginalMember(owner = "client!KWOZHDOE", name = "a", descriptor = "I")
	private int anInt401 = 974;

	@OriginalMember(owner = "client!KWOZHDOE", name = "k", descriptor = "[I")
	private int[] anIntArray75 = new int[5];

	@OriginalMember(owner = "client!KWOZHDOE", name = "l", descriptor = "[I")
	private int[] anIntArray76 = new int[5];

	@OriginalMember(owner = "client!KWOZHDOE", name = "m", descriptor = "[I")
	private int[] anIntArray77 = new int[5];

	@OriginalMember(owner = "client!KWOZHDOE", name = "o", descriptor = "I")
	private int anInt404 = 100;

	@OriginalMember(owner = "client!KWOZHDOE", name = "r", descriptor = "I")
	public int anInt405 = 500;

	@OriginalMember(owner = "client!KWOZHDOE", name = "a", descriptor = "()V")
	public static void method298() {
		anIntArray79 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray79[local6] = 1;
			} else {
				anIntArray79[local6] = -1;
			}
		}
		anIntArray80 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray80[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray78 = new int[220500];
	}

	@OriginalMember(owner = "client!KWOZHDOE", name = "a", descriptor = "(II)[I")
	public int[] method299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray78[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray78;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass45_1.method543();
		this.aClass45_2.method543();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass45_3 != null) {
			this.aClass45_3.method543();
			this.aClass45_4.method543();
			local36 = (int) ((double) (this.aClass45_3.anInt712 - this.aClass45_3.anInt711) * 32.768D / local26);
			local38 = (int) ((double) this.aClass45_3.anInt711 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass45_5 != null) {
			this.aClass45_5.method543();
			this.aClass45_6.method543();
			local77 = (int) ((double) (this.aClass45_5.anInt712 - this.aClass45_5.anInt711) * 32.768D / local26);
			local79 = (int) ((double) this.aClass45_5.anInt711 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray75[local118] != 0) {
				anIntArray81[local118] = 0;
				anIntArray82[local118] = (int) ((double) this.anIntArray77[local118] * local26);
				anIntArray83[local118] = (this.anIntArray75[local118] << 14) / 100;
				anIntArray84[local118] = (int) ((double) (this.aClass45_1.anInt712 - this.aClass45_1.anInt711) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray76[local118]) / local26);
				anIntArray85[local118] = (int) ((double) this.aClass45_1.anInt711 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass45_1.method544(arg0);
			local207 = this.aClass45_2.method544(arg0);
			if (this.aClass45_3 != null) {
				local216 = this.aClass45_3.method544(arg0);
				local222 = this.aClass45_4.method544(arg0);
				local201 += this.method300(anInt402, this.aClass45_3.anInt713, local222, local40) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass45_5 != null) {
				local216 = this.aClass45_5.method544(arg0);
				local222 = this.aClass45_6.method544(arg0);
				local207 = local207 * ((this.method300(anInt402, this.aClass45_5.anInt713, local222, local81) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray75[local216] != 0) {
					local222 = local193 + anIntArray82[local216];
					if (local222 < arg0) {
						anIntArray78[local222] += this.method300(anInt402, this.aClass45_1.anInt713, local207 * anIntArray83[local216] >> 15, anIntArray81[local216]);
						anIntArray81[local216] += (local201 * anIntArray84[local216] >> 16) + anIntArray85[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass45_7 != null) {
			this.aClass45_7.method543();
			this.aClass45_8.method543();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass45_7.method544(arg0);
				local385 = this.aClass45_8.method544(arg0);
				if (local369) {
					local207 = this.aClass45_7.anInt711 + ((this.aClass45_7.anInt712 - this.aClass45_7.anInt711) * local379 >> 8);
				} else {
					local207 = this.aClass45_7.anInt711 + ((this.aClass45_7.anInt712 - this.aClass45_7.anInt711) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray78[local222] = 0;
				}
			}
		}
		if (this.anInt403 > 0 && this.anInt404 > 0) {
			local201 = (int) ((double) this.anInt403 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray78[local207] += anIntArray78[local207 - local201] * this.anInt404 / 100;
			}
		}
		if (this.aClass5_1.anIntArray5[0] > 0 || this.aClass5_1.anIntArray5[1] > 0) {
			this.aClass45_9.method543();
			local201 = this.aClass45_9.method544(arg0 + 1);
			local207 = this.aClass5_1.method68((float) local201 / 65536.0F, 0);
			local216 = this.aClass5_1.method68((float) local201 / 65536.0F, 1);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray78[local222 + local207] * (long) Class5.anInt26 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray78[local222 + local207 - local559 - 1] * (long) Class5.anIntArrayArray2[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray78[local222 - local590 - 1] * (long) Class5.anIntArrayArray2[1][local590] >> 16);
					}
					anIntArray78[local222] = local385;
					local201 = this.aClass45_9.method544(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray78[local222 + local207] * (long) Class5.anInt26 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray78[local222 + local207 - local590 - 1] * (long) Class5.anIntArrayArray2[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray78[local222 - local694 - 1] * (long) Class5.anIntArrayArray2[1][local694] >> 16);
						}
						anIntArray78[local222] = local559;
						local201 = this.aClass45_9.method544(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray78[local222 + local207 - local590 - 1] * (long) Class5.anIntArrayArray2[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray78[local222 - local694 - 1] * (long) Class5.anIntArrayArray2[1][local694] >> 16);
							}
							anIntArray78[local222] = local559;
							this.aClass45_9.method544(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass5_1.method68((float) local201 / 65536.0F, 0);
					local216 = this.aClass5_1.method68((float) local201 / 65536.0F, 1);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray78[local201] < -32768) {
				anIntArray78[local201] = -32768;
			}
			if (anIntArray78[local201] > 32767) {
				anIntArray78[local201] = 32767;
			}
		}
		return anIntArray78;
	}

	@OriginalMember(owner = "client!KWOZHDOE", name = "a", descriptor = "(IIII)I")
	private int method300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0 < 1 || arg0 > 1) {
				return 1;
			} else if (arg1 == 1) {
				return (arg3 & 0x7FFF) < 16384 ? arg2 : -arg2;
			} else if (arg1 == 2) {
				return anIntArray80[arg3 & 0x7FFF] * arg2 >> 14;
			} else if (arg1 == 3) {
				return ((arg3 & 0x7FFF) * arg2 >> 14) - arg2;
			} else if (arg1 == 4) {
				return anIntArray79[arg3 / 2607 & 0x7FFF] * arg2;
			} else {
				return 0;
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("41085, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KWOZHDOE", name = "a", descriptor = "(Lclient!PGNBHFUF;I)V")
	public void method301(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			this.aClass45_1 = new Class45();
			this.aClass45_1.method541(arg0, this.anInt401);
			this.aClass45_2 = new Class45();
			this.aClass45_2.method541(arg0, this.anInt401);
			@Pc(26) int local26 = arg0.method355();
			if (local26 != 0) {
				arg0.anInt506--;
				this.aClass45_3 = new Class45();
				this.aClass45_3.method541(arg0, this.anInt401);
				this.aClass45_4 = new Class45();
				this.aClass45_4.method541(arg0, this.anInt401);
			}
			local26 = arg0.method355();
			if (local26 != 0) {
				arg0.anInt506--;
				this.aClass45_5 = new Class45();
				this.aClass45_5.method541(arg0, this.anInt401);
				this.aClass45_6 = new Class45();
				this.aClass45_6.method541(arg0, this.anInt401);
			}
			local26 = arg0.method355();
			if (local26 != 0) {
				arg0.anInt506--;
				this.aClass45_7 = new Class45();
				this.aClass45_7.method541(arg0, this.anInt401);
				this.aClass45_8 = new Class45();
				this.aClass45_8.method541(arg0, this.anInt401);
			}
			for (@Pc(124) int local124 = 0; local124 < 10; local124++) {
				@Pc(135) int local135 = arg0.method369();
				if (local135 == 0) {
					break;
				}
				this.anIntArray75[local124] = local135;
				this.anIntArray76[local124] = arg0.method368();
				this.anIntArray77[local124] = arg0.method369();
			}
			@Pc(162) int local162 = 57 / arg1;
			this.anInt403 = arg0.method369();
			this.anInt404 = arg0.method369();
			this.anInt405 = arg0.method357();
			this.anInt406 = arg0.method357();
			this.aClass5_1 = new Class5();
			this.aClass45_9 = new Class45();
			this.aClass5_1.method69(arg0, this.aClass45_9);
		} catch (@Pc(197) RuntimeException local197) {
			signlink.reporterror("19464, " + arg0 + ", " + arg1 + ", " + local197.toString());
			throw new RuntimeException();
		}
	}
}
