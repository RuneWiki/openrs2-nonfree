import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KEVJJMXF")
public final class Class21 {

	@OriginalMember(owner = "client!KEVJJMXF", name = "t", descriptor = "[I")
	private static int[] anIntArray97;

	@OriginalMember(owner = "client!KEVJJMXF", name = "u", descriptor = "[I")
	private static int[] anIntArray98;

	@OriginalMember(owner = "client!KEVJJMXF", name = "v", descriptor = "[I")
	private static int[] anIntArray99;

	@OriginalMember(owner = "client!KEVJJMXF", name = "b", descriptor = "I")
	private static int anInt317 = 6;

	@OriginalMember(owner = "client!KEVJJMXF", name = "w", descriptor = "[I")
	private static int[] anIntArray100 = new int[5];

	@OriginalMember(owner = "client!KEVJJMXF", name = "x", descriptor = "[I")
	private static int[] anIntArray101 = new int[5];

	@OriginalMember(owner = "client!KEVJJMXF", name = "y", descriptor = "[I")
	private static int[] anIntArray102 = new int[5];

	@OriginalMember(owner = "client!KEVJJMXF", name = "z", descriptor = "[I")
	private static int[] anIntArray103 = new int[5];

	@OriginalMember(owner = "client!KEVJJMXF", name = "A", descriptor = "[I")
	private static int[] anIntArray104 = new int[5];

	@OriginalMember(owner = "client!KEVJJMXF", name = "c", descriptor = "Lclient!MWRZAKOJ;")
	private Class25 aClass25_1;

	@OriginalMember(owner = "client!KEVJJMXF", name = "d", descriptor = "Lclient!MWRZAKOJ;")
	private Class25 aClass25_2;

	@OriginalMember(owner = "client!KEVJJMXF", name = "e", descriptor = "Lclient!MWRZAKOJ;")
	private Class25 aClass25_3;

	@OriginalMember(owner = "client!KEVJJMXF", name = "f", descriptor = "Lclient!MWRZAKOJ;")
	private Class25 aClass25_4;

	@OriginalMember(owner = "client!KEVJJMXF", name = "g", descriptor = "Lclient!MWRZAKOJ;")
	private Class25 aClass25_5;

	@OriginalMember(owner = "client!KEVJJMXF", name = "h", descriptor = "Lclient!MWRZAKOJ;")
	private Class25 aClass25_6;

	@OriginalMember(owner = "client!KEVJJMXF", name = "i", descriptor = "Lclient!MWRZAKOJ;")
	private Class25 aClass25_7;

	@OriginalMember(owner = "client!KEVJJMXF", name = "j", descriptor = "Lclient!MWRZAKOJ;")
	private Class25 aClass25_8;

	@OriginalMember(owner = "client!KEVJJMXF", name = "n", descriptor = "I")
	private int anInt318;

	@OriginalMember(owner = "client!KEVJJMXF", name = "p", descriptor = "Lclient!URKVTZGT;")
	private Class43 aClass43_1;

	@OriginalMember(owner = "client!KEVJJMXF", name = "q", descriptor = "Lclient!MWRZAKOJ;")
	private Class25 aClass25_9;

	@OriginalMember(owner = "client!KEVJJMXF", name = "s", descriptor = "I")
	public int anInt321;

	@OriginalMember(owner = "client!KEVJJMXF", name = "a", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!KEVJJMXF", name = "k", descriptor = "[I")
	private int[] anIntArray94 = new int[5];

	@OriginalMember(owner = "client!KEVJJMXF", name = "l", descriptor = "[I")
	private int[] anIntArray95 = new int[5];

	@OriginalMember(owner = "client!KEVJJMXF", name = "m", descriptor = "[I")
	private int[] anIntArray96 = new int[5];

	@OriginalMember(owner = "client!KEVJJMXF", name = "o", descriptor = "I")
	private int anInt319 = 100;

	@OriginalMember(owner = "client!KEVJJMXF", name = "r", descriptor = "I")
	public int anInt320 = 500;

	@OriginalMember(owner = "client!KEVJJMXF", name = "a", descriptor = "()V")
	public static void method237() {
		anIntArray98 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray98[local6] = 1;
			} else {
				anIntArray98[local6] = -1;
			}
		}
		anIntArray99 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray99[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray97 = new int[220500];
	}

	@OriginalMember(owner = "client!KEVJJMXF", name = "a", descriptor = "(II)[I")
	public int[] method238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray97[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray97;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass25_1.method287();
		this.aClass25_2.method287();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass25_3 != null) {
			this.aClass25_3.method287();
			this.aClass25_4.method287();
			local36 = (int) ((double) (this.aClass25_3.anInt455 - this.aClass25_3.anInt454) * 32.768D / local26);
			local38 = (int) ((double) this.aClass25_3.anInt454 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass25_5 != null) {
			this.aClass25_5.method287();
			this.aClass25_6.method287();
			local77 = (int) ((double) (this.aClass25_5.anInt455 - this.aClass25_5.anInt454) * 32.768D / local26);
			local79 = (int) ((double) this.aClass25_5.anInt454 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray94[local118] != 0) {
				anIntArray100[local118] = 0;
				anIntArray101[local118] = (int) ((double) this.anIntArray96[local118] * local26);
				anIntArray102[local118] = (this.anIntArray94[local118] << 14) / 100;
				anIntArray103[local118] = (int) ((double) (this.aClass25_1.anInt455 - this.aClass25_1.anInt454) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray95[local118]) / local26);
				anIntArray104[local118] = (int) ((double) this.aClass25_1.anInt454 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass25_1.method288(anInt317, arg0);
			local207 = this.aClass25_2.method288(anInt317, arg0);
			if (this.aClass25_3 != null) {
				local216 = this.aClass25_3.method288(anInt317, arg0);
				local222 = this.aClass25_4.method288(anInt317, arg0);
				local201 += this.method239(local40, local222, this.aClass25_3.anInt456) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass25_5 != null) {
				local216 = this.aClass25_5.method288(anInt317, arg0);
				local222 = this.aClass25_6.method288(anInt317, arg0);
				local207 = local207 * ((this.method239(local81, local222, this.aClass25_5.anInt456) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray94[local216] != 0) {
					local222 = local193 + anIntArray101[local216];
					if (local222 < arg0) {
						anIntArray97[local222] += this.method239(anIntArray100[local216], local207 * anIntArray102[local216] >> 15, this.aClass25_1.anInt456);
						anIntArray100[local216] += (local201 * anIntArray103[local216] >> 16) + anIntArray104[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass25_7 != null) {
			this.aClass25_7.method287();
			this.aClass25_8.method287();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass25_7.method288(anInt317, arg0);
				local385 = this.aClass25_8.method288(anInt317, arg0);
				if (local369) {
					local207 = this.aClass25_7.anInt454 + ((this.aClass25_7.anInt455 - this.aClass25_7.anInt454) * local379 >> 8);
				} else {
					local207 = this.aClass25_7.anInt454 + ((this.aClass25_7.anInt455 - this.aClass25_7.anInt454) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray97[local222] = 0;
				}
			}
		}
		if (this.anInt318 > 0 && this.anInt319 > 0) {
			local201 = (int) ((double) this.anInt318 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray97[local207] += anIntArray97[local207 - local201] * this.anInt319 / 100;
			}
		}
		if (this.aClass43_1.anIntArray181[0] > 0 || this.aClass43_1.anIntArray181[1] > 0) {
			this.aClass25_9.method287();
			local201 = this.aClass25_9.method288(anInt317, arg0 + 1);
			local207 = this.aClass43_1.method465(0, (float) local201 / 65536.0F);
			local216 = this.aClass43_1.method465(1, (float) local201 / 65536.0F);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray97[local222 + local207] * (long) Class43.anInt681 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray97[local222 + local207 - local559 - 1] * (long) Class43.anIntArrayArray18[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray97[local222 - local590 - 1] * (long) Class43.anIntArrayArray18[1][local590] >> 16);
					}
					anIntArray97[local222] = local385;
					local201 = this.aClass25_9.method288(anInt317, arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray97[local222 + local207] * (long) Class43.anInt681 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray97[local222 + local207 - local590 - 1] * (long) Class43.anIntArrayArray18[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray97[local222 - local694 - 1] * (long) Class43.anIntArrayArray18[1][local694] >> 16);
						}
						anIntArray97[local222] = local559;
						local201 = this.aClass25_9.method288(anInt317, arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray97[local222 + local207 - local590 - 1] * (long) Class43.anIntArrayArray18[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray97[local222 - local694 - 1] * (long) Class43.anIntArrayArray18[1][local694] >> 16);
							}
							anIntArray97[local222] = local559;
							this.aClass25_9.method288(anInt317, arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass43_1.method465(0, (float) local201 / 65536.0F);
					local216 = this.aClass43_1.method465(1, (float) local201 / 65536.0F);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray97[local201] < -32768) {
				anIntArray97[local201] = -32768;
			}
			if (anIntArray97[local201] > 32767) {
				anIntArray97[local201] = 32767;
			}
		}
		return anIntArray97;
	}

	@OriginalMember(owner = "client!KEVJJMXF", name = "a", descriptor = "(BIII)I")
	private int method239(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 1) {
				return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
			} else if (arg2 == 2) {
				return anIntArray99[arg0 & 0x7FFF] * arg1 >> 14;
			} else if (arg2 == 3) {
				return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
			} else if (arg2 == 4) {
				return anIntArray98[arg0 / 2607 & 0x7FFF] * arg1;
			} else {
				return 0;
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("74420, " + 1 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KEVJJMXF", name = "a", descriptor = "(Lclient!IUVBENCV;B)V")
	public void method240(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) byte arg1) {
		try {
			this.aClass25_1 = new Class25();
			this.aClass25_1.method285(arg0);
			this.aClass25_2 = new Class25();
			this.aClass25_2.method285(arg0);
			@Pc(24) int local24 = arg0.method152();
			if (local24 != 0) {
				arg0.anInt239--;
				this.aClass25_3 = new Class25();
				this.aClass25_3.method285(arg0);
				this.aClass25_4 = new Class25();
				this.aClass25_4.method285(arg0);
			}
			local24 = arg0.method152();
			if (local24 != 0) {
				arg0.anInt239--;
				this.aClass25_5 = new Class25();
				this.aClass25_5.method285(arg0);
				this.aClass25_6 = new Class25();
				this.aClass25_6.method285(arg0);
			}
			local24 = arg0.method152();
			if (local24 != 0) {
				arg0.anInt239--;
				this.aClass25_7 = new Class25();
				this.aClass25_7.method285(arg0);
				this.aClass25_8 = new Class25();
				this.aClass25_8.method285(arg0);
			}
			for (@Pc(116) int local116 = 0; local116 < 10; local116++) {
				@Pc(127) int local127 = arg0.method166();
				if (local127 == 0) {
					break;
				}
				this.anIntArray94[local116] = local127;
				this.anIntArray95[local116] = arg0.method165();
				this.anIntArray96[local116] = arg0.method166();
			}
			this.anInt318 = arg0.method166();
			this.anInt319 = arg0.method166();
			this.anInt320 = arg0.method154();
			@Pc(167) boolean local167 = false;
			this.anInt321 = arg0.method154();
			this.aClass43_1 = new Class43();
			this.aClass25_9 = new Class25();
			this.aClass43_1.method466(arg0, this.aClass25_9);
		} catch (@Pc(200) RuntimeException local200) {
			signlink.reporterror("44787, " + arg0 + ", " + arg1 + ", " + local200.toString());
			throw new RuntimeException();
		}
	}
}
