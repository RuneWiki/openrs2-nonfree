import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OBDRPXUY")
public final class Class27 {

	@OriginalMember(owner = "client!OBDRPXUY", name = "t", descriptor = "[I")
	private static int[] anIntArray110;

	@OriginalMember(owner = "client!OBDRPXUY", name = "u", descriptor = "[I")
	private static int[] anIntArray111;

	@OriginalMember(owner = "client!OBDRPXUY", name = "v", descriptor = "[I")
	private static int[] anIntArray112;

	@OriginalMember(owner = "client!OBDRPXUY", name = "w", descriptor = "[I")
	private static int[] anIntArray113 = new int[5];

	@OriginalMember(owner = "client!OBDRPXUY", name = "x", descriptor = "[I")
	private static int[] anIntArray114 = new int[5];

	@OriginalMember(owner = "client!OBDRPXUY", name = "y", descriptor = "[I")
	private static int[] anIntArray115 = new int[5];

	@OriginalMember(owner = "client!OBDRPXUY", name = "z", descriptor = "[I")
	private static int[] anIntArray116 = new int[5];

	@OriginalMember(owner = "client!OBDRPXUY", name = "A", descriptor = "[I")
	private static int[] anIntArray117 = new int[5];

	@OriginalMember(owner = "client!OBDRPXUY", name = "a", descriptor = "I")
	private int anInt413;

	@OriginalMember(owner = "client!OBDRPXUY", name = "c", descriptor = "Lclient!GTUIGVXS;")
	private Class16 aClass16_1;

	@OriginalMember(owner = "client!OBDRPXUY", name = "d", descriptor = "Lclient!GTUIGVXS;")
	private Class16 aClass16_2;

	@OriginalMember(owner = "client!OBDRPXUY", name = "e", descriptor = "Lclient!GTUIGVXS;")
	private Class16 aClass16_3;

	@OriginalMember(owner = "client!OBDRPXUY", name = "f", descriptor = "Lclient!GTUIGVXS;")
	private Class16 aClass16_4;

	@OriginalMember(owner = "client!OBDRPXUY", name = "g", descriptor = "Lclient!GTUIGVXS;")
	private Class16 aClass16_5;

	@OriginalMember(owner = "client!OBDRPXUY", name = "h", descriptor = "Lclient!GTUIGVXS;")
	private Class16 aClass16_6;

	@OriginalMember(owner = "client!OBDRPXUY", name = "i", descriptor = "Lclient!GTUIGVXS;")
	private Class16 aClass16_7;

	@OriginalMember(owner = "client!OBDRPXUY", name = "j", descriptor = "Lclient!GTUIGVXS;")
	private Class16 aClass16_8;

	@OriginalMember(owner = "client!OBDRPXUY", name = "n", descriptor = "I")
	private int anInt415;

	@OriginalMember(owner = "client!OBDRPXUY", name = "p", descriptor = "Lclient!WSKKAWXJ;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!OBDRPXUY", name = "q", descriptor = "Lclient!GTUIGVXS;")
	private Class16 aClass16_9;

	@OriginalMember(owner = "client!OBDRPXUY", name = "s", descriptor = "I")
	public int anInt418;

	@OriginalMember(owner = "client!OBDRPXUY", name = "b", descriptor = "I")
	private int anInt414 = 6;

	@OriginalMember(owner = "client!OBDRPXUY", name = "k", descriptor = "[I")
	private int[] anIntArray107 = new int[5];

	@OriginalMember(owner = "client!OBDRPXUY", name = "l", descriptor = "[I")
	private int[] anIntArray108 = new int[5];

	@OriginalMember(owner = "client!OBDRPXUY", name = "m", descriptor = "[I")
	private int[] anIntArray109 = new int[5];

	@OriginalMember(owner = "client!OBDRPXUY", name = "o", descriptor = "I")
	private int anInt416 = 100;

	@OriginalMember(owner = "client!OBDRPXUY", name = "r", descriptor = "I")
	public int anInt417 = 500;

	@OriginalMember(owner = "client!OBDRPXUY", name = "a", descriptor = "()V")
	public static void method235() {
		anIntArray111 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray111[local6] = 1;
			} else {
				anIntArray111[local6] = -1;
			}
		}
		anIntArray112 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray112[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray110 = new int[220500];
	}

	@OriginalMember(owner = "client!OBDRPXUY", name = "a", descriptor = "(II)[I")
	public int[] method236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray110[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray110;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass16_1.method152();
		this.aClass16_2.method152();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass16_3 != null) {
			this.aClass16_3.method152();
			this.aClass16_4.method152();
			local36 = (int) ((double) (this.aClass16_3.anInt254 - this.aClass16_3.anInt253) * 32.768D / local26);
			local38 = (int) ((double) this.aClass16_3.anInt253 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass16_5 != null) {
			this.aClass16_5.method152();
			this.aClass16_6.method152();
			local77 = (int) ((double) (this.aClass16_5.anInt254 - this.aClass16_5.anInt253) * 32.768D / local26);
			local79 = (int) ((double) this.aClass16_5.anInt253 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray107[local118] != 0) {
				anIntArray113[local118] = 0;
				anIntArray114[local118] = (int) ((double) this.anIntArray109[local118] * local26);
				anIntArray115[local118] = (this.anIntArray107[local118] << 14) / 100;
				anIntArray116[local118] = (int) ((double) (this.aClass16_1.anInt254 - this.aClass16_1.anInt253) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray108[local118]) / local26);
				anIntArray117[local118] = (int) ((double) this.aClass16_1.anInt253 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass16_1.method153(arg0);
			local207 = this.aClass16_2.method153(arg0);
			if (this.aClass16_3 != null) {
				local216 = this.aClass16_3.method153(arg0);
				local222 = this.aClass16_4.method153(arg0);
				local201 += this.method237(local40, this.aClass16_3.anInt255, local222) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass16_5 != null) {
				local216 = this.aClass16_5.method153(arg0);
				local222 = this.aClass16_6.method153(arg0);
				local207 = local207 * ((this.method237(local81, this.aClass16_5.anInt255, local222) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray107[local216] != 0) {
					local222 = local193 + anIntArray114[local216];
					if (local222 < arg0) {
						anIntArray110[local222] += this.method237(anIntArray113[local216], this.aClass16_1.anInt255, local207 * anIntArray115[local216] >> 15);
						anIntArray113[local216] += (local201 * anIntArray116[local216] >> 16) + anIntArray117[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass16_7 != null) {
			this.aClass16_7.method152();
			this.aClass16_8.method152();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass16_7.method153(arg0);
				local385 = this.aClass16_8.method153(arg0);
				if (local369) {
					local207 = this.aClass16_7.anInt253 + ((this.aClass16_7.anInt254 - this.aClass16_7.anInt253) * local379 >> 8);
				} else {
					local207 = this.aClass16_7.anInt253 + ((this.aClass16_7.anInt254 - this.aClass16_7.anInt253) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray110[local222] = 0;
				}
			}
		}
		if (this.anInt415 > 0 && this.anInt416 > 0) {
			local201 = (int) ((double) this.anInt415 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray110[local207] += anIntArray110[local207 - local201] * this.anInt416 / 100;
			}
		}
		if (this.aClass39_1.anIntArray191[0] > 0 || this.aClass39_1.anIntArray191[1] > 0) {
			this.aClass16_9.method152();
			local201 = this.aClass16_9.method153(arg0 + 1);
			local207 = this.aClass39_1.method509((float) local201 / 65536.0F, 0);
			local216 = this.aClass39_1.method509((float) local201 / 65536.0F, 1);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray110[local222 + local207] * (long) Class39.anInt743 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray110[local222 + local207 - local559 - 1] * (long) Class39.anIntArrayArray20[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray110[local222 - local590 - 1] * (long) Class39.anIntArrayArray20[1][local590] >> 16);
					}
					anIntArray110[local222] = local385;
					local201 = this.aClass16_9.method153(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray110[local222 + local207] * (long) Class39.anInt743 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray110[local222 + local207 - local590 - 1] * (long) Class39.anIntArrayArray20[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray110[local222 - local694 - 1] * (long) Class39.anIntArrayArray20[1][local694] >> 16);
						}
						anIntArray110[local222] = local559;
						local201 = this.aClass16_9.method153(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray110[local222 + local207 - local590 - 1] * (long) Class39.anIntArrayArray20[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray110[local222 - local694 - 1] * (long) Class39.anIntArrayArray20[1][local694] >> 16);
							}
							anIntArray110[local222] = local559;
							this.aClass16_9.method153(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass39_1.method509((float) local201 / 65536.0F, 0);
					local216 = this.aClass39_1.method509((float) local201 / 65536.0F, 1);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray110[local201] < -32768) {
				anIntArray110[local201] = -32768;
			}
			if (anIntArray110[local201] > 32767) {
				anIntArray110[local201] = 32767;
			}
		}
		return anIntArray110;
	}

	@OriginalMember(owner = "client!OBDRPXUY", name = "a", descriptor = "(IIII)I")
	private int method237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 == 1) {
				return (arg0 & 0x7FFF) < 16384 ? arg2 : -arg2;
			} else if (arg1 == 2) {
				return anIntArray112[arg0 & 0x7FFF] * arg2 >> 14;
			} else if (arg1 == 3) {
				return ((arg0 & 0x7FFF) * arg2 >> 14) - arg2;
			} else if (arg1 == 4) {
				return anIntArray111[arg0 / 2607 & 0x7FFF] * arg2;
			} else {
				return 0;
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("5732, " + arg0 + ", " + arg1 + ", " + 312 + ", " + arg2 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBDRPXUY", name = "a", descriptor = "(Lclient!WBEWPIXO;I)V")
	public void method238(@OriginalArg(0) Class3_Sub3_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			this.aClass16_1 = new Class16();
			this.aClass16_1.method150(arg0);
			this.aClass16_2 = new Class16();
			this.aClass16_2.method150(arg0);
			@Pc(24) int local24 = arg0.method468();
			if (local24 != 0) {
				arg0.anInt738--;
				this.aClass16_3 = new Class16();
				this.aClass16_3.method150(arg0);
				this.aClass16_4 = new Class16();
				this.aClass16_4.method150(arg0);
			}
			local24 = arg0.method468();
			if (local24 != 0) {
				arg0.anInt738--;
				this.aClass16_5 = new Class16();
				this.aClass16_5.method150(arg0);
				this.aClass16_6 = new Class16();
				this.aClass16_6.method150(arg0);
			}
			local24 = arg0.method468();
			if (local24 != 0) {
				arg0.anInt738--;
				this.aClass16_7 = new Class16();
				this.aClass16_7.method150(arg0);
				this.aClass16_8 = new Class16();
				this.aClass16_8.method150(arg0);
			}
			for (@Pc(116) int local116 = 0; local116 < 10; local116++) {
				@Pc(127) int local127 = arg0.method482();
				if (local127 == 0) {
					break;
				}
				this.anIntArray107[local116] = local127;
				this.anIntArray108[local116] = arg0.method481();
				this.anIntArray109[local116] = arg0.method482();
			}
			@Pc(154) boolean local154 = false;
			this.anInt415 = arg0.method482();
			this.anInt416 = arg0.method482();
			this.anInt417 = arg0.method470();
			this.anInt418 = arg0.method470();
			this.aClass39_1 = new Class39();
			this.aClass16_9 = new Class16();
			this.aClass39_1.method510(arg0, this.aClass16_9, this.anInt414);
		} catch (@Pc(190) RuntimeException local190) {
			signlink.reporterror("79047, " + arg0 + ", " + arg1 + ", " + local190.toString());
			throw new RuntimeException();
		}
	}
}
