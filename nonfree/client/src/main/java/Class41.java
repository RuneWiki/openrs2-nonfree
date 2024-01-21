import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WLTAOGXS")
public final class Class41 {

	@OriginalMember(owner = "client!WLTAOGXS", name = "s", descriptor = "[I")
	private static int[] anIntArray166;

	@OriginalMember(owner = "client!WLTAOGXS", name = "t", descriptor = "[I")
	private static int[] anIntArray167;

	@OriginalMember(owner = "client!WLTAOGXS", name = "u", descriptor = "[I")
	private static int[] anIntArray168;

	@OriginalMember(owner = "client!WLTAOGXS", name = "v", descriptor = "[I")
	private static int[] anIntArray169 = new int[5];

	@OriginalMember(owner = "client!WLTAOGXS", name = "w", descriptor = "[I")
	private static int[] anIntArray170 = new int[5];

	@OriginalMember(owner = "client!WLTAOGXS", name = "x", descriptor = "[I")
	private static int[] anIntArray171 = new int[5];

	@OriginalMember(owner = "client!WLTAOGXS", name = "y", descriptor = "[I")
	private static int[] anIntArray172 = new int[5];

	@OriginalMember(owner = "client!WLTAOGXS", name = "z", descriptor = "[I")
	private static int[] anIntArray173 = new int[5];

	@OriginalMember(owner = "client!WLTAOGXS", name = "b", descriptor = "Lclient!LYKGAWTC;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!WLTAOGXS", name = "c", descriptor = "Lclient!LYKGAWTC;")
	private Class27 aClass27_2;

	@OriginalMember(owner = "client!WLTAOGXS", name = "d", descriptor = "Lclient!LYKGAWTC;")
	private Class27 aClass27_3;

	@OriginalMember(owner = "client!WLTAOGXS", name = "e", descriptor = "Lclient!LYKGAWTC;")
	private Class27 aClass27_4;

	@OriginalMember(owner = "client!WLTAOGXS", name = "f", descriptor = "Lclient!LYKGAWTC;")
	private Class27 aClass27_5;

	@OriginalMember(owner = "client!WLTAOGXS", name = "g", descriptor = "Lclient!LYKGAWTC;")
	private Class27 aClass27_6;

	@OriginalMember(owner = "client!WLTAOGXS", name = "h", descriptor = "Lclient!LYKGAWTC;")
	private Class27 aClass27_7;

	@OriginalMember(owner = "client!WLTAOGXS", name = "i", descriptor = "Lclient!LYKGAWTC;")
	private Class27 aClass27_8;

	@OriginalMember(owner = "client!WLTAOGXS", name = "m", descriptor = "I")
	private int anInt765;

	@OriginalMember(owner = "client!WLTAOGXS", name = "o", descriptor = "Lclient!GHIPAIQX;")
	private Class16 aClass16_1;

	@OriginalMember(owner = "client!WLTAOGXS", name = "p", descriptor = "Lclient!LYKGAWTC;")
	private Class27 aClass27_9;

	@OriginalMember(owner = "client!WLTAOGXS", name = "r", descriptor = "I")
	public int anInt768;

	@OriginalMember(owner = "client!WLTAOGXS", name = "a", descriptor = "I")
	private int anInt764 = 1;

	@OriginalMember(owner = "client!WLTAOGXS", name = "j", descriptor = "[I")
	private int[] anIntArray163 = new int[5];

	@OriginalMember(owner = "client!WLTAOGXS", name = "k", descriptor = "[I")
	private int[] anIntArray164 = new int[5];

	@OriginalMember(owner = "client!WLTAOGXS", name = "l", descriptor = "[I")
	private int[] anIntArray165 = new int[5];

	@OriginalMember(owner = "client!WLTAOGXS", name = "n", descriptor = "I")
	private int anInt766 = 100;

	@OriginalMember(owner = "client!WLTAOGXS", name = "q", descriptor = "I")
	public int anInt767 = 500;

	@OriginalMember(owner = "client!WLTAOGXS", name = "a", descriptor = "()V")
	public static void method524() {
		anIntArray167 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray167[local6] = 1;
			} else {
				anIntArray167[local6] = -1;
			}
		}
		anIntArray168 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray168[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray166 = new int[220500];
	}

	@OriginalMember(owner = "client!WLTAOGXS", name = "a", descriptor = "(II)[I")
	public int[] method525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray166[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray166;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass27_1.method327();
		this.aClass27_2.method327();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass27_3 != null) {
			this.aClass27_3.method327();
			this.aClass27_4.method327();
			local36 = (int) ((double) (this.aClass27_3.anInt385 - this.aClass27_3.anInt384) * 32.768D / local26);
			local38 = (int) ((double) this.aClass27_3.anInt384 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass27_5 != null) {
			this.aClass27_5.method327();
			this.aClass27_6.method327();
			local77 = (int) ((double) (this.aClass27_5.anInt385 - this.aClass27_5.anInt384) * 32.768D / local26);
			local79 = (int) ((double) this.aClass27_5.anInt384 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray163[local118] != 0) {
				anIntArray169[local118] = 0;
				anIntArray170[local118] = (int) ((double) this.anIntArray165[local118] * local26);
				anIntArray171[local118] = (this.anIntArray163[local118] << 14) / 100;
				anIntArray172[local118] = (int) ((double) (this.aClass27_1.anInt385 - this.aClass27_1.anInt384) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray164[local118]) / local26);
				anIntArray173[local118] = (int) ((double) this.aClass27_1.anInt384 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass27_1.method328(arg0);
			local207 = this.aClass27_2.method328(arg0);
			if (this.aClass27_3 != null) {
				local216 = this.aClass27_3.method328(arg0);
				local222 = this.aClass27_4.method328(arg0);
				local201 += this.method526(this.aClass27_3.anInt386, local222, local40, 996) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass27_5 != null) {
				local216 = this.aClass27_5.method328(arg0);
				local222 = this.aClass27_6.method328(arg0);
				local207 = local207 * ((this.method526(this.aClass27_5.anInt386, local222, local81, 996) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray163[local216] != 0) {
					local222 = local193 + anIntArray170[local216];
					if (local222 < arg0) {
						anIntArray166[local222] += this.method526(this.aClass27_1.anInt386, local207 * anIntArray171[local216] >> 15, anIntArray169[local216], 996);
						anIntArray169[local216] += (local201 * anIntArray172[local216] >> 16) + anIntArray173[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass27_7 != null) {
			this.aClass27_7.method327();
			this.aClass27_8.method327();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass27_7.method328(arg0);
				local385 = this.aClass27_8.method328(arg0);
				if (local369) {
					local207 = this.aClass27_7.anInt384 + ((this.aClass27_7.anInt385 - this.aClass27_7.anInt384) * local379 >> 8);
				} else {
					local207 = this.aClass27_7.anInt384 + ((this.aClass27_7.anInt385 - this.aClass27_7.anInt384) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray166[local222] = 0;
				}
			}
		}
		if (this.anInt765 > 0 && this.anInt766 > 0) {
			local201 = (int) ((double) this.anInt765 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray166[local207] += anIntArray166[local207 - local201] * this.anInt766 / 100;
			}
		}
		if (this.aClass16_1.anIntArray41[0] > 0 || this.aClass16_1.anIntArray41[1] > 0) {
			this.aClass27_9.method327();
			local201 = this.aClass27_9.method328(arg0 + 1);
			local207 = this.aClass16_1.method149((float) local201 / 65536.0F, 0);
			local216 = this.aClass16_1.method149((float) local201 / 65536.0F, 1);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray166[local222 + local207] * (long) Class16.anInt242 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray166[local222 + local207 - local559 - 1] * (long) Class16.anIntArrayArray9[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray166[local222 - local590 - 1] * (long) Class16.anIntArrayArray9[1][local590] >> 16);
					}
					anIntArray166[local222] = local385;
					local201 = this.aClass27_9.method328(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray166[local222 + local207] * (long) Class16.anInt242 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray166[local222 + local207 - local590 - 1] * (long) Class16.anIntArrayArray9[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray166[local222 - local694 - 1] * (long) Class16.anIntArrayArray9[1][local694] >> 16);
						}
						anIntArray166[local222] = local559;
						local201 = this.aClass27_9.method328(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray166[local222 + local207 - local590 - 1] * (long) Class16.anIntArrayArray9[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray166[local222 - local694 - 1] * (long) Class16.anIntArrayArray9[1][local694] >> 16);
							}
							anIntArray166[local222] = local559;
							this.aClass27_9.method328(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass16_1.method149((float) local201 / 65536.0F, 0);
					local216 = this.aClass16_1.method149((float) local201 / 65536.0F, 1);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray166[local201] < -32768) {
				anIntArray166[local201] = -32768;
			}
			if (anIntArray166[local201] > 32767) {
				anIntArray166[local201] = 32767;
			}
		}
		return anIntArray166;
	}

	@OriginalMember(owner = "client!WLTAOGXS", name = "a", descriptor = "(IIII)I")
	private int method526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg0 == 1) {
				return (arg2 & 0x7FFF) < 16384 ? arg1 : -arg1;
			} else if (arg0 == 2) {
				return anIntArray168[arg2 & 0x7FFF] * arg1 >> 14;
			} else if (arg0 == 3) {
				return ((arg2 & 0x7FFF) * arg1 >> 14) - arg1;
			} else if (arg0 == 4) {
				return anIntArray167[arg2 / 2607 & 0x7FFF] * arg1;
			} else {
				return 0;
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("70534, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WLTAOGXS", name = "a", descriptor = "(BLclient!GLMIQHJI;)V")
	public void method527(@OriginalArg(0) byte arg0, @OriginalArg(1) Class8_Sub1_Sub3 arg1) {
		try {
			this.aClass27_1 = new Class27();
			this.aClass27_1.method325(arg1);
			this.aClass27_2 = new Class27();
			this.aClass27_2.method325(arg1);
			@Pc(24) int local24 = arg1.method165();
			@Pc(29) boolean local29 = false;
			if (local24 != 0) {
				arg1.anInt253--;
				this.aClass27_3 = new Class27();
				this.aClass27_3.method325(arg1);
				this.aClass27_4 = new Class27();
				this.aClass27_4.method325(arg1);
			}
			local24 = arg1.method165();
			if (local24 != 0) {
				arg1.anInt253--;
				this.aClass27_5 = new Class27();
				this.aClass27_5.method325(arg1);
				this.aClass27_6 = new Class27();
				this.aClass27_6.method325(arg1);
			}
			local24 = arg1.method165();
			if (local24 != 0) {
				arg1.anInt253--;
				this.aClass27_7 = new Class27();
				this.aClass27_7.method325(arg1);
				this.aClass27_8 = new Class27();
				this.aClass27_8.method325(arg1);
			}
			for (@Pc(132) int local132 = 0; local132 < 10; local132++) {
				@Pc(137) int local137 = arg1.method179();
				if (local137 == 0) {
					break;
				}
				this.anIntArray163[local132] = local137;
				this.anIntArray164[local132] = arg1.method178();
				this.anIntArray165[local132] = arg1.method179();
			}
			this.anInt765 = arg1.method179();
			this.anInt766 = arg1.method179();
			this.anInt767 = arg1.method167();
			this.anInt768 = arg1.method167();
			this.aClass16_1 = new Class16();
			this.aClass27_9 = new Class27();
			this.aClass16_1.method150(this.aClass27_9, arg1);
		} catch (@Pc(195) RuntimeException local195) {
			signlink.reporterror("88678, " + arg0 + ", " + arg1 + ", " + local195.toString());
			throw new RuntimeException();
		}
	}
}
