import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GJBKSAZL")
public final class Class16 {

	@OriginalMember(owner = "client!GJBKSAZL", name = "s", descriptor = "[I")
	private static int[] anIntArray58;

	@OriginalMember(owner = "client!GJBKSAZL", name = "t", descriptor = "[I")
	private static int[] anIntArray59;

	@OriginalMember(owner = "client!GJBKSAZL", name = "u", descriptor = "[I")
	private static int[] anIntArray60;

	@OriginalMember(owner = "client!GJBKSAZL", name = "v", descriptor = "[I")
	private static int[] anIntArray61 = new int[5];

	@OriginalMember(owner = "client!GJBKSAZL", name = "w", descriptor = "[I")
	private static int[] anIntArray62 = new int[5];

	@OriginalMember(owner = "client!GJBKSAZL", name = "x", descriptor = "[I")
	private static int[] anIntArray63 = new int[5];

	@OriginalMember(owner = "client!GJBKSAZL", name = "y", descriptor = "[I")
	private static int[] anIntArray64 = new int[5];

	@OriginalMember(owner = "client!GJBKSAZL", name = "z", descriptor = "[I")
	private static int[] anIntArray65 = new int[5];

	@OriginalMember(owner = "client!GJBKSAZL", name = "b", descriptor = "Lclient!DNFIVRJB;")
	private Class10 aClass10_1;

	@OriginalMember(owner = "client!GJBKSAZL", name = "c", descriptor = "Lclient!DNFIVRJB;")
	private Class10 aClass10_2;

	@OriginalMember(owner = "client!GJBKSAZL", name = "d", descriptor = "Lclient!DNFIVRJB;")
	private Class10 aClass10_3;

	@OriginalMember(owner = "client!GJBKSAZL", name = "e", descriptor = "Lclient!DNFIVRJB;")
	private Class10 aClass10_4;

	@OriginalMember(owner = "client!GJBKSAZL", name = "f", descriptor = "Lclient!DNFIVRJB;")
	private Class10 aClass10_5;

	@OriginalMember(owner = "client!GJBKSAZL", name = "g", descriptor = "Lclient!DNFIVRJB;")
	private Class10 aClass10_6;

	@OriginalMember(owner = "client!GJBKSAZL", name = "h", descriptor = "Lclient!DNFIVRJB;")
	private Class10 aClass10_7;

	@OriginalMember(owner = "client!GJBKSAZL", name = "i", descriptor = "Lclient!DNFIVRJB;")
	private Class10 aClass10_8;

	@OriginalMember(owner = "client!GJBKSAZL", name = "m", descriptor = "I")
	private int anInt362;

	@OriginalMember(owner = "client!GJBKSAZL", name = "o", descriptor = "Lclient!DRRJWDRT;")
	private Class11 aClass11_1;

	@OriginalMember(owner = "client!GJBKSAZL", name = "p", descriptor = "Lclient!DNFIVRJB;")
	private Class10 aClass10_9;

	@OriginalMember(owner = "client!GJBKSAZL", name = "r", descriptor = "I")
	public int anInt365;

	@OriginalMember(owner = "client!GJBKSAZL", name = "a", descriptor = "I")
	private int anInt361 = 22486;

	@OriginalMember(owner = "client!GJBKSAZL", name = "j", descriptor = "[I")
	private int[] anIntArray55 = new int[5];

	@OriginalMember(owner = "client!GJBKSAZL", name = "k", descriptor = "[I")
	private int[] anIntArray56 = new int[5];

	@OriginalMember(owner = "client!GJBKSAZL", name = "l", descriptor = "[I")
	private int[] anIntArray57 = new int[5];

	@OriginalMember(owner = "client!GJBKSAZL", name = "n", descriptor = "I")
	private int anInt363 = 100;

	@OriginalMember(owner = "client!GJBKSAZL", name = "q", descriptor = "I")
	public int anInt364 = 500;

	@OriginalMember(owner = "client!GJBKSAZL", name = "a", descriptor = "()V")
	public static void method252() {
		anIntArray59 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray59[local6] = 1;
			} else {
				anIntArray59[local6] = -1;
			}
		}
		anIntArray60 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray60[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray58 = new int[220500];
	}

	@OriginalMember(owner = "client!GJBKSAZL", name = "a", descriptor = "(II)[I")
	public int[] method253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray58[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray58;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass10_1.method175(767);
		this.aClass10_2.method175(767);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass10_3 != null) {
			this.aClass10_3.method175(767);
			this.aClass10_4.method175(767);
			local36 = (int) ((double) (this.aClass10_3.anInt219 - this.aClass10_3.anInt218) * 32.768D / local26);
			local38 = (int) ((double) this.aClass10_3.anInt218 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass10_5 != null) {
			this.aClass10_5.method175(767);
			this.aClass10_6.method175(767);
			local77 = (int) ((double) (this.aClass10_5.anInt219 - this.aClass10_5.anInt218) * 32.768D / local26);
			local79 = (int) ((double) this.aClass10_5.anInt218 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray55[local118] != 0) {
				anIntArray61[local118] = 0;
				anIntArray62[local118] = (int) ((double) this.anIntArray57[local118] * local26);
				anIntArray63[local118] = (this.anIntArray55[local118] << 14) / 100;
				anIntArray64[local118] = (int) ((double) (this.aClass10_1.anInt219 - this.aClass10_1.anInt218) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray56[local118]) / local26);
				anIntArray65[local118] = (int) ((double) this.aClass10_1.anInt218 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass10_1.method176(arg0);
			local207 = this.aClass10_2.method176(arg0);
			if (this.aClass10_3 != null) {
				local216 = this.aClass10_3.method176(arg0);
				local222 = this.aClass10_4.method176(arg0);
				local201 += this.method254(local222, this.aClass10_3.anInt220, local40) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass10_5 != null) {
				local216 = this.aClass10_5.method176(arg0);
				local222 = this.aClass10_6.method176(arg0);
				local207 = local207 * ((this.method254(local222, this.aClass10_5.anInt220, local81) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray55[local216] != 0) {
					local222 = local193 + anIntArray62[local216];
					if (local222 < arg0) {
						anIntArray58[local222] += this.method254(local207 * anIntArray63[local216] >> 15, this.aClass10_1.anInt220, anIntArray61[local216]);
						anIntArray61[local216] += (local201 * anIntArray64[local216] >> 16) + anIntArray65[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass10_7 != null) {
			this.aClass10_7.method175(767);
			this.aClass10_8.method175(767);
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass10_7.method176(arg0);
				local385 = this.aClass10_8.method176(arg0);
				if (local369) {
					local207 = this.aClass10_7.anInt218 + ((this.aClass10_7.anInt219 - this.aClass10_7.anInt218) * local379 >> 8);
				} else {
					local207 = this.aClass10_7.anInt218 + ((this.aClass10_7.anInt219 - this.aClass10_7.anInt218) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray58[local222] = 0;
				}
			}
		}
		if (this.anInt362 > 0 && this.anInt363 > 0) {
			local201 = (int) ((double) this.anInt362 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray58[local207] += anIntArray58[local207 - local201] * this.anInt363 / 100;
			}
		}
		if (this.aClass11_1.anIntArray34[0] > 0 || this.aClass11_1.anIntArray34[1] > 0) {
			this.aClass10_9.method175(767);
			local201 = this.aClass10_9.method176(arg0 + 1);
			local207 = this.aClass11_1.method180(0, (float) local201 / 65536.0F);
			local216 = this.aClass11_1.method180(1, (float) local201 / 65536.0F);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray58[local222 + local207] * (long) Class11.anInt229 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray58[local222 + local207 - local559 - 1] * (long) Class11.anIntArrayArray3[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray58[local222 - local590 - 1] * (long) Class11.anIntArrayArray3[1][local590] >> 16);
					}
					anIntArray58[local222] = local385;
					local201 = this.aClass10_9.method176(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray58[local222 + local207] * (long) Class11.anInt229 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray58[local222 + local207 - local590 - 1] * (long) Class11.anIntArrayArray3[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray58[local222 - local694 - 1] * (long) Class11.anIntArrayArray3[1][local694] >> 16);
						}
						anIntArray58[local222] = local559;
						local201 = this.aClass10_9.method176(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray58[local222 + local207 - local590 - 1] * (long) Class11.anIntArrayArray3[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray58[local222 - local694 - 1] * (long) Class11.anIntArrayArray3[1][local694] >> 16);
							}
							anIntArray58[local222] = local559;
							this.aClass10_9.method176(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass11_1.method180(0, (float) local201 / 65536.0F);
					local216 = this.aClass11_1.method180(1, (float) local201 / 65536.0F);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray58[local201] < -32768) {
				anIntArray58[local201] = -32768;
			}
			if (anIntArray58[local201] > 32767) {
				anIntArray58[local201] = 32767;
			}
		}
		return anIntArray58;
	}

	@OriginalMember(owner = "client!GJBKSAZL", name = "a", descriptor = "(IIII)I")
	private int method254(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 == 1) {
				return (arg2 & 0x7FFF) < 16384 ? arg0 : -arg0;
			} else if (arg1 == 2) {
				return anIntArray60[arg2 & 0x7FFF] * arg0 >> 14;
			} else if (arg1 == 3) {
				return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
			} else if (arg1 == 4) {
				return anIntArray59[arg2 / 2607 & 0x7FFF] * arg0;
			} else {
				return 0;
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("40, " + -60 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GJBKSAZL", name = "a", descriptor = "(Lclient!CFARFRSG;I)V")
	public void method255(@OriginalArg(0) Class1_Sub1_Sub2 arg0) {
		try {
			this.aClass10_1 = new Class10();
			this.aClass10_1.method173(arg0);
			this.aClass10_2 = new Class10();
			this.aClass10_2.method173(arg0);
			@Pc(24) int local24 = arg0.method59();
			if (this.anInt361 != 22486) {
				throw new NullPointerException();
			}
			if (local24 != 0) {
				arg0.anInt153--;
				this.aClass10_3 = new Class10();
				this.aClass10_3.method173(arg0);
				this.aClass10_4 = new Class10();
				this.aClass10_4.method173(arg0);
			}
			local24 = arg0.method59();
			if (local24 != 0) {
				arg0.anInt153--;
				this.aClass10_5 = new Class10();
				this.aClass10_5.method173(arg0);
				this.aClass10_6 = new Class10();
				this.aClass10_6.method173(arg0);
			}
			local24 = arg0.method59();
			if (local24 != 0) {
				arg0.anInt153--;
				this.aClass10_7 = new Class10();
				this.aClass10_7.method173(arg0);
				this.aClass10_8 = new Class10();
				this.aClass10_8.method173(arg0);
			}
			for (@Pc(124) int local124 = 0; local124 < 10; local124++) {
				@Pc(135) int local135 = arg0.method73();
				if (local135 == 0) {
					break;
				}
				this.anIntArray55[local124] = local135;
				this.anIntArray56[local124] = arg0.method72();
				this.anIntArray57[local124] = arg0.method73();
			}
			this.anInt362 = arg0.method73();
			this.anInt363 = arg0.method73();
			this.anInt364 = arg0.method61();
			this.anInt365 = arg0.method61();
			this.aClass11_1 = new Class11();
			this.aClass10_9 = new Class10();
			this.aClass11_1.method181(this.aClass10_9, (byte) 5, arg0);
		} catch (@Pc(193) RuntimeException local193) {
			signlink.reporterror("96114, " + arg0 + ", " + 22486 + ", " + local193.toString());
			throw new RuntimeException();
		}
	}
}
