import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!dc")
public final class Class7 {

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "[I")
	private static int[] anIntArray108;

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "[I")
	private static int[] anIntArray109;

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "[I")
	private static int[] anIntArray110;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
	private static int anInt499 = -101;

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "[I")
	private static int[] anIntArray111 = new int[5];

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "[I")
	private static int[] anIntArray112 = new int[5];

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "[I")
	private static int[] anIntArray113 = new int[5];

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "[I")
	private static int[] anIntArray114 = new int[5];

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "[I")
	private static int[] anIntArray115 = new int[5];

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
	private int anInt500;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
	public int anInt503;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "[I")
	private int[] anIntArray105 = new int[5];

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "[I")
	private int[] anIntArray106 = new int[5];

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "[I")
	private int[] anIntArray107 = new int[5];

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
	private int anInt501 = 100;

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
	public int anInt502 = 500;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "()V")
	public static void method240() {
		anIntArray109 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray109[local6] = 1;
			} else {
				anIntArray109[local6] = -1;
			}
		}
		anIntArray110 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray110[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray108 = new int[220500];
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)[I")
	public int[] method241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray108[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray108;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass3_1.method55(anInt499);
		this.aClass3_2.method55(anInt499);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass3_3 != null) {
			this.aClass3_3.method55(anInt499);
			this.aClass3_4.method55(anInt499);
			local36 = (int) ((double) (this.aClass3_3.anInt196 - this.aClass3_3.anInt195) * 32.768D / local26);
			local38 = (int) ((double) this.aClass3_3.anInt195 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass3_5 != null) {
			this.aClass3_5.method55(anInt499);
			this.aClass3_6.method55(anInt499);
			local77 = (int) ((double) (this.aClass3_5.anInt196 - this.aClass3_5.anInt195) * 32.768D / local26);
			local79 = (int) ((double) this.aClass3_5.anInt195 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray105[local118] != 0) {
				anIntArray111[local118] = 0;
				anIntArray112[local118] = (int) ((double) this.anIntArray107[local118] * local26);
				anIntArray113[local118] = (this.anIntArray105[local118] << 14) / 100;
				anIntArray114[local118] = (int) ((double) (this.aClass3_1.anInt196 - this.aClass3_1.anInt195) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray106[local118]) / local26);
				anIntArray115[local118] = (int) ((double) this.aClass3_1.anInt195 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass3_1.method56(arg0);
			local207 = this.aClass3_2.method56(arg0);
			@Pc(216) int local216;
			if (this.aClass3_3 != null) {
				local216 = this.aClass3_3.method56(arg0);
				local222 = this.aClass3_4.method56(arg0);
				local201 += this.method242(this.aClass3_3.anInt197, local40, local222, 985) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass3_5 != null) {
				local216 = this.aClass3_5.method56(arg0);
				local222 = this.aClass3_6.method56(arg0);
				local207 = local207 * ((this.method242(this.aClass3_5.anInt197, local81, local222, 985) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray105[local216] != 0) {
					local222 = local193 + anIntArray112[local216];
					if (local222 < arg0) {
						anIntArray108[local222] += this.method242(this.aClass3_1.anInt197, anIntArray111[local216], local207 * anIntArray113[local216] >> 15, 985);
						anIntArray111[local216] += (local201 * anIntArray114[local216] >> 16) + anIntArray115[local216];
					}
				}
			}
		}
		if (this.aClass3_7 != null) {
			this.aClass3_7.method55(anInt499);
			this.aClass3_8.method55(anInt499);
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				@Pc(379) int local379 = this.aClass3_7.method56(arg0);
				@Pc(385) int local385 = this.aClass3_8.method56(arg0);
				if (local369) {
					local207 = this.aClass3_7.anInt195 + ((this.aClass3_7.anInt196 - this.aClass3_7.anInt195) * local379 >> 8);
				} else {
					local207 = this.aClass3_7.anInt195 + ((this.aClass3_7.anInt196 - this.aClass3_7.anInt195) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray108[local222] = 0;
				}
			}
		}
		if (this.anInt500 > 0 && this.anInt501 > 0) {
			local201 = (int) ((double) this.anInt500 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray108[local207] += anIntArray108[local207 - local201] * this.anInt501 / 100;
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray108[local201] < -32768) {
				anIntArray108[local201] = -32768;
			}
			if (anIntArray108[local201] > 32767) {
				anIntArray108[local201] = 32767;
			}
		}
		return anIntArray108;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIII)I")
	private int method242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg0 == 1) {
				return (arg1 & 0x7FFF) < 16384 ? arg2 : -arg2;
			} else if (arg0 == 2) {
				return anIntArray110[arg1 & 0x7FFF] * arg2 >> 14;
			} else if (arg0 == 3) {
				return ((arg1 & 0x7FFF) * arg2 >> 14) - arg2;
			} else if (arg0 == 4) {
				return anIntArray109[arg1 / 2607 & 0x7FFF] * arg2;
			} else {
				return 0;
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("8536, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!mb;B)V")
	public void method243(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			this.aClass3_1 = new Class3();
			this.aClass3_1.method54(arg0);
			this.aClass3_2 = new Class3();
			this.aClass3_2.method54(arg0);
			@Pc(29) int local29 = arg0.method498();
			if (local29 != 0) {
				arg0.anInt796--;
				this.aClass3_3 = new Class3();
				this.aClass3_3.method54(arg0);
				this.aClass3_4 = new Class3();
				this.aClass3_4.method54(arg0);
			}
			local29 = arg0.method498();
			if (local29 != 0) {
				arg0.anInt796--;
				this.aClass3_5 = new Class3();
				this.aClass3_5.method54(arg0);
				this.aClass3_6 = new Class3();
				this.aClass3_6.method54(arg0);
			}
			local29 = arg0.method498();
			if (local29 != 0) {
				arg0.anInt796--;
				this.aClass3_7 = new Class3();
				this.aClass3_7.method54(arg0);
				this.aClass3_8 = new Class3();
				this.aClass3_8.method54(arg0);
			}
			for (@Pc(121) int local121 = 0; local121 < 10; local121++) {
				@Pc(132) int local132 = arg0.method512();
				if (local132 == 0) {
					break;
				}
				this.anIntArray105[local121] = local132;
				this.anIntArray106[local121] = arg0.method511();
				this.anIntArray107[local121] = arg0.method512();
			}
			this.anInt500 = arg0.method512();
			this.anInt501 = arg0.method512();
			this.anInt502 = arg0.method500();
			this.anInt503 = arg0.method500();
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("71972, " + arg0 + ", " + 66 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}
}
