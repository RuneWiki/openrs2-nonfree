import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UHNEGZAI")
public final class Class43 {

	@OriginalMember(owner = "client!UHNEGZAI", name = "t", descriptor = "[I")
	private static int[] anIntArray172;

	@OriginalMember(owner = "client!UHNEGZAI", name = "u", descriptor = "[I")
	private static int[] anIntArray173;

	@OriginalMember(owner = "client!UHNEGZAI", name = "v", descriptor = "[I")
	private static int[] anIntArray174;

	@OriginalMember(owner = "client!UHNEGZAI", name = "w", descriptor = "[I")
	private static int[] anIntArray175 = new int[5];

	@OriginalMember(owner = "client!UHNEGZAI", name = "x", descriptor = "[I")
	private static int[] anIntArray176 = new int[5];

	@OriginalMember(owner = "client!UHNEGZAI", name = "y", descriptor = "[I")
	private static int[] anIntArray177 = new int[5];

	@OriginalMember(owner = "client!UHNEGZAI", name = "z", descriptor = "[I")
	private static int[] anIntArray178 = new int[5];

	@OriginalMember(owner = "client!UHNEGZAI", name = "A", descriptor = "[I")
	private static int[] anIntArray179 = new int[5];

	@OriginalMember(owner = "client!UHNEGZAI", name = "c", descriptor = "Lclient!GJKLDIZT;")
	private Class9 aClass9_1;

	@OriginalMember(owner = "client!UHNEGZAI", name = "d", descriptor = "Lclient!GJKLDIZT;")
	private Class9 aClass9_2;

	@OriginalMember(owner = "client!UHNEGZAI", name = "e", descriptor = "Lclient!GJKLDIZT;")
	private Class9 aClass9_3;

	@OriginalMember(owner = "client!UHNEGZAI", name = "f", descriptor = "Lclient!GJKLDIZT;")
	private Class9 aClass9_4;

	@OriginalMember(owner = "client!UHNEGZAI", name = "g", descriptor = "Lclient!GJKLDIZT;")
	private Class9 aClass9_5;

	@OriginalMember(owner = "client!UHNEGZAI", name = "h", descriptor = "Lclient!GJKLDIZT;")
	private Class9 aClass9_6;

	@OriginalMember(owner = "client!UHNEGZAI", name = "i", descriptor = "Lclient!GJKLDIZT;")
	private Class9 aClass9_7;

	@OriginalMember(owner = "client!UHNEGZAI", name = "j", descriptor = "Lclient!GJKLDIZT;")
	private Class9 aClass9_8;

	@OriginalMember(owner = "client!UHNEGZAI", name = "n", descriptor = "I")
	private int anInt629;

	@OriginalMember(owner = "client!UHNEGZAI", name = "p", descriptor = "Lclient!GLZZOSSI;")
	private Class10 aClass10_1;

	@OriginalMember(owner = "client!UHNEGZAI", name = "q", descriptor = "Lclient!GJKLDIZT;")
	private Class9 aClass9_9;

	@OriginalMember(owner = "client!UHNEGZAI", name = "s", descriptor = "I")
	public int anInt632;

	@OriginalMember(owner = "client!UHNEGZAI", name = "a", descriptor = "I")
	private int anInt627 = 49845;

	@OriginalMember(owner = "client!UHNEGZAI", name = "b", descriptor = "I")
	private int anInt628 = 662;

	@OriginalMember(owner = "client!UHNEGZAI", name = "k", descriptor = "[I")
	private int[] anIntArray169 = new int[5];

	@OriginalMember(owner = "client!UHNEGZAI", name = "l", descriptor = "[I")
	private int[] anIntArray170 = new int[5];

	@OriginalMember(owner = "client!UHNEGZAI", name = "m", descriptor = "[I")
	private int[] anIntArray171 = new int[5];

	@OriginalMember(owner = "client!UHNEGZAI", name = "o", descriptor = "I")
	private int anInt630 = 100;

	@OriginalMember(owner = "client!UHNEGZAI", name = "r", descriptor = "I")
	public int anInt631 = 500;

	@OriginalMember(owner = "client!UHNEGZAI", name = "a", descriptor = "()V")
	public static void method423() {
		anIntArray173 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray173[local6] = 1;
			} else {
				anIntArray173[local6] = -1;
			}
		}
		anIntArray174 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray174[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray172 = new int[220500];
	}

	@OriginalMember(owner = "client!UHNEGZAI", name = "a", descriptor = "(II)[I")
	public int[] method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray172[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray172;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass9_1.method168((byte) 4);
		this.aClass9_2.method168((byte) 4);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass9_3 != null) {
			this.aClass9_3.method168((byte) 4);
			this.aClass9_4.method168((byte) 4);
			local36 = (int) ((double) (this.aClass9_3.anInt193 - this.aClass9_3.anInt192) * 32.768D / local26);
			local38 = (int) ((double) this.aClass9_3.anInt192 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass9_5 != null) {
			this.aClass9_5.method168((byte) 4);
			this.aClass9_6.method168((byte) 4);
			local77 = (int) ((double) (this.aClass9_5.anInt193 - this.aClass9_5.anInt192) * 32.768D / local26);
			local79 = (int) ((double) this.aClass9_5.anInt192 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray169[local118] != 0) {
				anIntArray175[local118] = 0;
				anIntArray176[local118] = (int) ((double) this.anIntArray171[local118] * local26);
				anIntArray177[local118] = (this.anIntArray169[local118] << 14) / 100;
				anIntArray178[local118] = (int) ((double) (this.aClass9_1.anInt193 - this.aClass9_1.anInt192) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray170[local118]) / local26);
				anIntArray179[local118] = (int) ((double) this.aClass9_1.anInt192 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass9_1.method169(arg0);
			local207 = this.aClass9_2.method169(arg0);
			if (this.aClass9_3 != null) {
				local216 = this.aClass9_3.method169(arg0);
				local222 = this.aClass9_4.method169(arg0);
				local201 += this.method425(local222, this.aClass9_3.anInt194, local40) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass9_5 != null) {
				local216 = this.aClass9_5.method169(arg0);
				local222 = this.aClass9_6.method169(arg0);
				local207 = local207 * ((this.method425(local222, this.aClass9_5.anInt194, local81) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray169[local216] != 0) {
					local222 = local193 + anIntArray176[local216];
					if (local222 < arg0) {
						anIntArray172[local222] += this.method425(local207 * anIntArray177[local216] >> 15, this.aClass9_1.anInt194, anIntArray175[local216]);
						anIntArray175[local216] += (local201 * anIntArray178[local216] >> 16) + anIntArray179[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass9_7 != null) {
			this.aClass9_7.method168((byte) 4);
			this.aClass9_8.method168((byte) 4);
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass9_7.method169(arg0);
				local385 = this.aClass9_8.method169(arg0);
				if (local369) {
					local207 = this.aClass9_7.anInt192 + ((this.aClass9_7.anInt193 - this.aClass9_7.anInt192) * local379 >> 8);
				} else {
					local207 = this.aClass9_7.anInt192 + ((this.aClass9_7.anInt193 - this.aClass9_7.anInt192) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray172[local222] = 0;
				}
			}
		}
		if (this.anInt629 > 0 && this.anInt630 > 0) {
			local201 = (int) ((double) this.anInt629 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray172[local207] += anIntArray172[local207 - local201] * this.anInt630 / 100;
			}
		}
		if (this.aClass10_1.anIntArray41[0] > 0 || this.aClass10_1.anIntArray41[1] > 0) {
			this.aClass9_9.method168((byte) 4);
			local201 = this.aClass9_9.method169(arg0 + 1);
			local207 = this.aClass10_1.method173(0, (float) local201 / 65536.0F);
			local216 = this.aClass10_1.method173(1, (float) local201 / 65536.0F);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray172[local222 + local207] * (long) Class10.anInt201 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray172[local222 + local207 - local559 - 1] * (long) Class10.anIntArrayArray4[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray172[local222 - local590 - 1] * (long) Class10.anIntArrayArray4[1][local590] >> 16);
					}
					anIntArray172[local222] = local385;
					local201 = this.aClass9_9.method169(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray172[local222 + local207] * (long) Class10.anInt201 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray172[local222 + local207 - local590 - 1] * (long) Class10.anIntArrayArray4[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray172[local222 - local694 - 1] * (long) Class10.anIntArrayArray4[1][local694] >> 16);
						}
						anIntArray172[local222] = local559;
						local201 = this.aClass9_9.method169(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray172[local222 + local207 - local590 - 1] * (long) Class10.anIntArrayArray4[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray172[local222 - local694 - 1] * (long) Class10.anIntArrayArray4[1][local694] >> 16);
							}
							anIntArray172[local222] = local559;
							this.aClass9_9.method169(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass10_1.method173(0, (float) local201 / 65536.0F);
					local216 = this.aClass10_1.method173(1, (float) local201 / 65536.0F);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray172[local201] < -32768) {
				anIntArray172[local201] = -32768;
			}
			if (anIntArray172[local201] > 32767) {
				anIntArray172[local201] = 32767;
			}
		}
		return anIntArray172;
	}

	@OriginalMember(owner = "client!UHNEGZAI", name = "a", descriptor = "(BIII)I")
	private int method425(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 == 1) {
				return (arg2 & 0x7FFF) < 16384 ? arg0 : -arg0;
			} else if (arg1 == 2) {
				return anIntArray174[arg2 & 0x7FFF] * arg0 >> 14;
			} else if (arg1 == 3) {
				return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
			} else if (arg1 == 4) {
				return anIntArray173[arg2 / 2607 & 0x7FFF] * arg0;
			} else {
				return 0;
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("34464, " + -47 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UHNEGZAI", name = "a", descriptor = "(Lclient!DNRIFKTO;I)V")
	public void method426(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			this.aClass9_1 = new Class9();
			this.aClass9_1.method166(arg0);
			this.aClass9_2 = new Class9();
			this.aClass9_2.method166(arg0);
			@Pc(37) int local37 = arg0.method94();
			if (local37 != 0) {
				arg0.anInt166--;
				this.aClass9_3 = new Class9();
				this.aClass9_3.method166(arg0);
				this.aClass9_4 = new Class9();
				this.aClass9_4.method166(arg0);
			}
			local37 = arg0.method94();
			if (local37 != 0) {
				arg0.anInt166--;
				this.aClass9_5 = new Class9();
				this.aClass9_5.method166(arg0);
				this.aClass9_6 = new Class9();
				this.aClass9_6.method166(arg0);
			}
			local37 = arg0.method94();
			if (local37 != 0) {
				arg0.anInt166--;
				this.aClass9_7 = new Class9();
				this.aClass9_7.method166(arg0);
				this.aClass9_8 = new Class9();
				this.aClass9_8.method166(arg0);
			}
			for (@Pc(129) int local129 = 0; local129 < 10; local129++) {
				@Pc(134) int local134 = arg0.method108();
				if (local134 == 0) {
					break;
				}
				this.anIntArray169[local129] = local134;
				this.anIntArray170[local129] = arg0.method107();
				this.anIntArray171[local129] = arg0.method108();
			}
			this.anInt629 = arg0.method108();
			this.anInt630 = arg0.method108();
			this.anInt631 = arg0.method96();
			this.anInt632 = arg0.method96();
			this.aClass10_1 = new Class10();
			this.aClass9_9 = new Class9();
			this.aClass10_1.method174(arg0, this.aClass9_9);
		} catch (@Pc(192) RuntimeException local192) {
			signlink.reporterror("18918, " + arg0 + ", " + -25 + ", " + local192.toString());
			throw new RuntimeException();
		}
	}
}
