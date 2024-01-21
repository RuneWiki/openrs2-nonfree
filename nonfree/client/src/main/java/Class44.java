import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!zb")
public final class Class44 {

	@OriginalMember(owner = "client!zb", name = "r", descriptor = "[I")
	private static int[] anIntArray239;

	@OriginalMember(owner = "client!zb", name = "s", descriptor = "[I")
	private static int[] anIntArray240;

	@OriginalMember(owner = "client!zb", name = "t", descriptor = "[I")
	private static int[] anIntArray241;

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "B")
	private static byte aByte44 = 6;

	@OriginalMember(owner = "client!zb", name = "u", descriptor = "[I")
	private static int[] anIntArray242 = new int[5];

	@OriginalMember(owner = "client!zb", name = "v", descriptor = "[I")
	private static int[] anIntArray243 = new int[5];

	@OriginalMember(owner = "client!zb", name = "w", descriptor = "[I")
	private static int[] anIntArray244 = new int[5];

	@OriginalMember(owner = "client!zb", name = "x", descriptor = "[I")
	private static int[] anIntArray245 = new int[5];

	@OriginalMember(owner = "client!zb", name = "y", descriptor = "[I")
	private static int[] anIntArray246 = new int[5];

	@OriginalMember(owner = "client!zb", name = "b", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!zb", name = "c", descriptor = "Lclient!xb;")
	private Class42 aClass42_1;

	@OriginalMember(owner = "client!zb", name = "d", descriptor = "Lclient!xb;")
	private Class42 aClass42_2;

	@OriginalMember(owner = "client!zb", name = "e", descriptor = "Lclient!xb;")
	private Class42 aClass42_3;

	@OriginalMember(owner = "client!zb", name = "f", descriptor = "Lclient!xb;")
	private Class42 aClass42_4;

	@OriginalMember(owner = "client!zb", name = "g", descriptor = "Lclient!xb;")
	private Class42 aClass42_5;

	@OriginalMember(owner = "client!zb", name = "h", descriptor = "Lclient!xb;")
	private Class42 aClass42_6;

	@OriginalMember(owner = "client!zb", name = "i", descriptor = "Lclient!xb;")
	private Class42 aClass42_7;

	@OriginalMember(owner = "client!zb", name = "j", descriptor = "Lclient!xb;")
	private Class42 aClass42_8;

	@OriginalMember(owner = "client!zb", name = "n", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!zb", name = "q", descriptor = "I")
	public int anInt938;

	@OriginalMember(owner = "client!zb", name = "k", descriptor = "[I")
	private int[] anIntArray236 = new int[5];

	@OriginalMember(owner = "client!zb", name = "l", descriptor = "[I")
	private int[] anIntArray237 = new int[5];

	@OriginalMember(owner = "client!zb", name = "m", descriptor = "[I")
	private int[] anIntArray238 = new int[5];

	@OriginalMember(owner = "client!zb", name = "o", descriptor = "I")
	private int anInt936 = 100;

	@OriginalMember(owner = "client!zb", name = "p", descriptor = "I")
	public int anInt937 = 500;

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "()V")
	public static void method555() {
		anIntArray240 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray240[local6] = 1;
			} else {
				anIntArray240[local6] = -1;
			}
		}
		anIntArray241 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray241[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray239 = new int[220500];
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(II)[I")
	public int[] method556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray239[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray239;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass42_1.method533();
		this.aClass42_2.method533();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass42_3 != null) {
			this.aClass42_3.method533();
			this.aClass42_4.method533();
			local36 = (int) ((double) (this.aClass42_3.anInt810 - this.aClass42_3.anInt809) * 32.768D / local26);
			local38 = (int) ((double) this.aClass42_3.anInt809 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass42_5 != null) {
			this.aClass42_5.method533();
			this.aClass42_6.method533();
			local77 = (int) ((double) (this.aClass42_5.anInt810 - this.aClass42_5.anInt809) * 32.768D / local26);
			local79 = (int) ((double) this.aClass42_5.anInt809 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray236[local118] != 0) {
				anIntArray242[local118] = 0;
				anIntArray243[local118] = (int) ((double) this.anIntArray238[local118] * local26);
				anIntArray244[local118] = (this.anIntArray236[local118] << 14) / 100;
				anIntArray245[local118] = (int) ((double) (this.aClass42_1.anInt810 - this.aClass42_1.anInt809) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray237[local118]) / local26);
				anIntArray246[local118] = (int) ((double) this.aClass42_1.anInt809 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass42_1.method534(arg0);
			local207 = this.aClass42_2.method534(arg0);
			@Pc(216) int local216;
			if (this.aClass42_3 != null) {
				local216 = this.aClass42_3.method534(arg0);
				local222 = this.aClass42_4.method534(arg0);
				local201 += this.method557(local40, local222, this.aClass42_3.anInt811) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass42_5 != null) {
				local216 = this.aClass42_5.method534(arg0);
				local222 = this.aClass42_6.method534(arg0);
				local207 = local207 * ((this.method557(local81, local222, this.aClass42_5.anInt811) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray236[local216] != 0) {
					local222 = local193 + anIntArray243[local216];
					if (local222 < arg0) {
						anIntArray239[local222] += this.method557(anIntArray242[local216], local207 * anIntArray244[local216] >> 15, this.aClass42_1.anInt811);
						anIntArray242[local216] += (local201 * anIntArray245[local216] >> 16) + anIntArray246[local216];
					}
				}
			}
		}
		if (this.aClass42_7 != null) {
			this.aClass42_7.method533();
			this.aClass42_8.method533();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				@Pc(379) int local379 = this.aClass42_7.method534(arg0);
				@Pc(385) int local385 = this.aClass42_8.method534(arg0);
				if (local369) {
					local207 = this.aClass42_7.anInt809 + ((this.aClass42_7.anInt810 - this.aClass42_7.anInt809) * local379 >> 8);
				} else {
					local207 = this.aClass42_7.anInt809 + ((this.aClass42_7.anInt810 - this.aClass42_7.anInt809) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray239[local222] = 0;
				}
			}
		}
		if (this.anInt935 > 0 && this.anInt936 > 0) {
			local201 = (int) ((double) this.anInt935 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray239[local207] += anIntArray239[local207 - local201] * this.anInt936 / 100;
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray239[local201] < -32768) {
				anIntArray239[local201] = -32768;
			}
			if (anIntArray239[local201] > 32767) {
				anIntArray239[local201] = 32767;
			}
		}
		return anIntArray239;
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(BIII)I")
	private int method557(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 1) {
				return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
			} else if (arg2 == 2) {
				return anIntArray241[arg0 & 0x7FFF] * arg1 >> 14;
			} else if (arg2 == 3) {
				return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
			} else if (arg2 == 4) {
				return anIntArray240[arg0 / 2607 & 0x7FFF] * arg1;
			} else {
				return 0;
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("83648, " + -4 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(BLclient!kb;)V")
	public void method558(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			this.aClass42_1 = new Class42();
			if (arg0 != 6) {
				throw new NullPointerException();
			}
			this.aClass42_1.method532(aByte44, arg1);
			this.aClass42_2 = new Class42();
			this.aClass42_2.method532(aByte44, arg1);
			@Pc(31) int local31 = arg1.method372();
			if (local31 != 0) {
				arg1.anInt539--;
				this.aClass42_3 = new Class42();
				this.aClass42_3.method532(aByte44, arg1);
				this.aClass42_4 = new Class42();
				this.aClass42_4.method532(aByte44, arg1);
			}
			local31 = arg1.method372();
			if (local31 != 0) {
				arg1.anInt539--;
				this.aClass42_5 = new Class42();
				this.aClass42_5.method532(aByte44, arg1);
				this.aClass42_6 = new Class42();
				this.aClass42_6.method532(aByte44, arg1);
			}
			local31 = arg1.method372();
			if (local31 != 0) {
				arg1.anInt539--;
				this.aClass42_7 = new Class42();
				this.aClass42_7.method532(aByte44, arg1);
				this.aClass42_8 = new Class42();
				this.aClass42_8.method532(aByte44, arg1);
			}
			for (@Pc(123) int local123 = 0; local123 < 10; local123++) {
				@Pc(133) int local133 = arg1.method386();
				if (local133 == 0) {
					break;
				}
				this.anIntArray236[local123] = local133;
				this.anIntArray237[local123] = arg1.method385();
				this.anIntArray238[local123] = arg1.method386();
			}
			this.anInt935 = arg1.method386();
			this.anInt936 = arg1.method386();
			this.anInt937 = arg1.method374();
			this.anInt938 = arg1.method374();
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("8762, " + arg0 + ", " + arg1 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}
}
