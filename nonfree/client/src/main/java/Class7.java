import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!dc")
public final class Class7 {

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "[I")
	private static int[] anIntArray98;

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "[I")
	private static int[] anIntArray99;

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "[I")
	private static int[] anIntArray100;

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "[I")
	private static int[] anIntArray101 = new int[5];

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "[I")
	private static int[] anIntArray102 = new int[5];

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "[I")
	private static int[] anIntArray103 = new int[5];

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "[I")
	private static int[] anIntArray104 = new int[5];

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "[I")
	private static int[] anIntArray105 = new int[5];

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "Lclient!bc;")
	private Class3 aClass3_1;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "Lclient!bc;")
	private Class3 aClass3_2;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Lclient!bc;")
	private Class3 aClass3_3;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "Lclient!bc;")
	private Class3 aClass3_4;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Lclient!bc;")
	private Class3 aClass3_5;

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "Lclient!bc;")
	private Class3 aClass3_6;

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "Lclient!bc;")
	private Class3 aClass3_7;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Lclient!bc;")
	private Class3 aClass3_8;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
	private int anInt485;

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
	public int anInt488;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "[I")
	private int[] anIntArray95 = new int[5];

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "[I")
	private int[] anIntArray96 = new int[5];

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "[I")
	private int[] anIntArray97 = new int[5];

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
	private int anInt486 = 100;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
	public int anInt487 = 500;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "()V")
	public static void method232() {
		anIntArray99 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray99[local6] = 1;
			} else {
				anIntArray99[local6] = -1;
			}
		}
		anIntArray100 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray100[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray98 = new int[220500];
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)[I")
	public int[] method233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray98[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray98;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass3_1.method49();
		this.aClass3_2.method49();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass3_3 != null) {
			this.aClass3_3.method49();
			this.aClass3_4.method49();
			local36 = (int) ((double) (this.aClass3_3.anInt194 - this.aClass3_3.anInt193) * 32.768D / local26);
			local38 = (int) ((double) this.aClass3_3.anInt193 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass3_5 != null) {
			this.aClass3_5.method49();
			this.aClass3_6.method49();
			local77 = (int) ((double) (this.aClass3_5.anInt194 - this.aClass3_5.anInt193) * 32.768D / local26);
			local79 = (int) ((double) this.aClass3_5.anInt193 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray95[local118] != 0) {
				anIntArray101[local118] = 0;
				anIntArray102[local118] = (int) ((double) this.anIntArray97[local118] * local26);
				anIntArray103[local118] = (this.anIntArray95[local118] << 14) / 100;
				anIntArray104[local118] = (int) ((double) (this.aClass3_1.anInt194 - this.aClass3_1.anInt193) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray96[local118]) / local26);
				anIntArray105[local118] = (int) ((double) this.aClass3_1.anInt193 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass3_1.method50(arg0);
			local207 = this.aClass3_2.method50(arg0);
			@Pc(216) int local216;
			if (this.aClass3_3 != null) {
				local216 = this.aClass3_3.method50(arg0);
				local222 = this.aClass3_4.method50(arg0);
				local201 += this.method234(local40, local222, this.aClass3_3.anInt195) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass3_5 != null) {
				local216 = this.aClass3_5.method50(arg0);
				local222 = this.aClass3_6.method50(arg0);
				local207 = local207 * ((this.method234(local81, local222, this.aClass3_5.anInt195) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray95[local216] != 0) {
					local222 = local193 + anIntArray102[local216];
					if (local222 < arg0) {
						anIntArray98[local222] += this.method234(anIntArray101[local216], local207 * anIntArray103[local216] >> 15, this.aClass3_1.anInt195);
						anIntArray101[local216] += (local201 * anIntArray104[local216] >> 16) + anIntArray105[local216];
					}
				}
			}
		}
		if (this.aClass3_7 != null) {
			this.aClass3_7.method49();
			this.aClass3_8.method49();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				@Pc(379) int local379 = this.aClass3_7.method50(arg0);
				@Pc(385) int local385 = this.aClass3_8.method50(arg0);
				if (local369) {
					local207 = this.aClass3_7.anInt193 + ((this.aClass3_7.anInt194 - this.aClass3_7.anInt193) * local379 >> 8);
				} else {
					local207 = this.aClass3_7.anInt193 + ((this.aClass3_7.anInt194 - this.aClass3_7.anInt193) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray98[local222] = 0;
				}
			}
		}
		if (this.anInt485 > 0 && this.anInt486 > 0) {
			local201 = (int) ((double) this.anInt485 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray98[local207] += anIntArray98[local207 - local201] * this.anInt486 / 100;
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray98[local201] < -32768) {
				anIntArray98[local201] = -32768;
			}
			if (anIntArray98[local201] > 32767) {
				anIntArray98[local201] = 32767;
			}
		}
		return anIntArray98;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZII)I")
	private int method234(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 1) {
				return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
			} else if (arg2 == 2) {
				return anIntArray100[arg0 & 0x7FFF] * arg1 >> 14;
			} else if (arg2 == 3) {
				return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
			} else if (arg2 == 4) {
				return anIntArray99[arg0 / 2607 & 0x7FFF] * arg1;
			} else {
				return 0;
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("31436, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!mb;)V")
	public void method235(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			this.aClass3_1 = new Class3();
			this.aClass3_1.method48(arg0);
			this.aClass3_2 = new Class3();
			this.aClass3_2.method48(arg0);
			@Pc(31) int local31 = arg0.method468();
			if (local31 != 0) {
				arg0.anInt777--;
				this.aClass3_3 = new Class3();
				this.aClass3_3.method48(arg0);
				this.aClass3_4 = new Class3();
				this.aClass3_4.method48(arg0);
			}
			local31 = arg0.method468();
			if (local31 != 0) {
				arg0.anInt777--;
				this.aClass3_5 = new Class3();
				this.aClass3_5.method48(arg0);
				this.aClass3_6 = new Class3();
				this.aClass3_6.method48(arg0);
			}
			local31 = arg0.method468();
			if (local31 != 0) {
				arg0.anInt777--;
				this.aClass3_7 = new Class3();
				this.aClass3_7.method48(arg0);
				this.aClass3_8 = new Class3();
				this.aClass3_8.method48(arg0);
			}
			for (@Pc(123) int local123 = 0; local123 < 10; local123++) {
				@Pc(134) int local134 = arg0.method482();
				if (local134 == 0) {
					break;
				}
				this.anIntArray95[local123] = local134;
				this.anIntArray96[local123] = arg0.method481();
				this.anIntArray97[local123] = arg0.method482();
			}
			this.anInt485 = arg0.method482();
			this.anInt486 = arg0.method482();
			this.anInt487 = arg0.method470();
			this.anInt488 = arg0.method470();
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("20612, " + 3251 + ", " + arg0 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}
}
