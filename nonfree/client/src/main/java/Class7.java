import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!dc")
public final class Class7 {

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "[I")
	private static int[] anIntArray98;

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "[I")
	private static int[] anIntArray99;

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "[I")
	private static int[] anIntArray100;

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "[I")
	private static int[] anIntArray101 = new int[5];

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "[I")
	private static int[] anIntArray102 = new int[5];

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "[I")
	private static int[] anIntArray103 = new int[5];

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "[I")
	private static int[] anIntArray104 = new int[5];

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "[I")
	private static int[] anIntArray105 = new int[5];

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "Lclient!bc;")
	private Class3 aClass3_1;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Lclient!bc;")
	private Class3 aClass3_2;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "Lclient!bc;")
	private Class3 aClass3_3;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Lclient!bc;")
	private Class3 aClass3_4;

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "Lclient!bc;")
	private Class3 aClass3_5;

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "Lclient!bc;")
	private Class3 aClass3_6;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Lclient!bc;")
	private Class3 aClass3_7;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "Lclient!bc;")
	private Class3 aClass3_8;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
	private int anInt487;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
	public int anInt490;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "[I")
	private int[] anIntArray95 = new int[5];

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "[I")
	private int[] anIntArray96 = new int[5];

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "[I")
	private int[] anIntArray97 = new int[5];

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
	private int anInt488 = 100;

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
	public int anInt489 = 500;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "()V")
	public static void method231() {
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
	public int[] method232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
			local36 = (int) ((double) (this.aClass3_3.anInt199 - this.aClass3_3.anInt198) * 32.768D / local26);
			local38 = (int) ((double) this.aClass3_3.anInt198 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass3_5 != null) {
			this.aClass3_5.method49();
			this.aClass3_6.method49();
			local77 = (int) ((double) (this.aClass3_5.anInt199 - this.aClass3_5.anInt198) * 32.768D / local26);
			local79 = (int) ((double) this.aClass3_5.anInt198 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray95[local118] != 0) {
				anIntArray101[local118] = 0;
				anIntArray102[local118] = (int) ((double) this.anIntArray97[local118] * local26);
				anIntArray103[local118] = (this.anIntArray95[local118] << 14) / 100;
				anIntArray104[local118] = (int) ((double) (this.aClass3_1.anInt199 - this.aClass3_1.anInt198) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray96[local118]) / local26);
				anIntArray105[local118] = (int) ((double) this.aClass3_1.anInt198 * 32.768D / local26);
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
				local201 += this.method233(local222, this.aClass3_3.anInt200, local40) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass3_5 != null) {
				local216 = this.aClass3_5.method50(arg0);
				local222 = this.aClass3_6.method50(arg0);
				local207 = local207 * ((this.method233(local222, this.aClass3_5.anInt200, local81) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray95[local216] != 0) {
					local222 = local193 + anIntArray102[local216];
					if (local222 < arg0) {
						anIntArray98[local222] += this.method233(local207 * anIntArray103[local216] >> 15, this.aClass3_1.anInt200, anIntArray101[local216]);
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
					local207 = this.aClass3_7.anInt198 + ((this.aClass3_7.anInt199 - this.aClass3_7.anInt198) * local379 >> 8);
				} else {
					local207 = this.aClass3_7.anInt198 + ((this.aClass3_7.anInt199 - this.aClass3_7.anInt198) * local385 >> 8);
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
		if (this.anInt487 > 0 && this.anInt488 > 0) {
			local201 = (int) ((double) this.anInt487 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray98[local207] += anIntArray98[local207 - local201] * this.anInt488 / 100;
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

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIII)I")
	private int method233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg1 == 1) {
				return (arg2 & 0x7FFF) < 16384 ? arg0 : -arg0;
			} else if (arg1 == 2) {
				return anIntArray100[arg2 & 0x7FFF] * arg0 >> 14;
			} else if (arg1 == 3) {
				return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
			} else if (arg1 == 4) {
				return anIntArray99[arg2 / 2607 & 0x7FFF] * arg0;
			} else {
				return 0;
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("80154, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 84 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLclient!mb;)V")
	public void method234(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			this.aClass3_1 = new Class3();
			this.aClass3_1.method48(arg0);
			this.aClass3_2 = new Class3();
			this.aClass3_2.method48(arg0);
			@Pc(24) int local24 = arg0.method467();
			if (local24 != 0) {
				arg0.anInt771--;
				this.aClass3_3 = new Class3();
				this.aClass3_3.method48(arg0);
				this.aClass3_4 = new Class3();
				this.aClass3_4.method48(arg0);
			}
			local24 = arg0.method467();
			if (local24 != 0) {
				arg0.anInt771--;
				this.aClass3_5 = new Class3();
				this.aClass3_5.method48(arg0);
				this.aClass3_6 = new Class3();
				this.aClass3_6.method48(arg0);
			}
			local24 = arg0.method467();
			if (local24 != 0) {
				arg0.anInt771--;
				this.aClass3_7 = new Class3();
				this.aClass3_7.method48(arg0);
				this.aClass3_8 = new Class3();
				this.aClass3_8.method48(arg0);
			}
			for (@Pc(116) int local116 = 0; local116 < 10; local116++) {
				@Pc(127) int local127 = arg0.method481();
				if (local127 == 0) {
					break;
				}
				this.anIntArray95[local116] = local127;
				this.anIntArray96[local116] = arg0.method480();
				this.anIntArray97[local116] = arg0.method481();
			}
			this.anInt487 = arg0.method481();
			this.anInt488 = arg0.method481();
			this.anInt489 = arg0.method469();
			this.anInt490 = arg0.method469();
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("86033, " + false + ", " + arg0 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}
}
