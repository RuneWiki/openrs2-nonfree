import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UFBSEXDM")
public final class Class33 {

	@OriginalMember(owner = "client!UFBSEXDM", name = "s", descriptor = "[I")
	private static int[] anIntArray175;

	@OriginalMember(owner = "client!UFBSEXDM", name = "t", descriptor = "[I")
	private static int[] anIntArray176;

	@OriginalMember(owner = "client!UFBSEXDM", name = "u", descriptor = "[I")
	private static int[] anIntArray177;

	@OriginalMember(owner = "client!UFBSEXDM", name = "a", descriptor = "Z")
	private static boolean aBoolean167 = true;

	@OriginalMember(owner = "client!UFBSEXDM", name = "v", descriptor = "[I")
	private static int[] anIntArray178 = new int[5];

	@OriginalMember(owner = "client!UFBSEXDM", name = "w", descriptor = "[I")
	private static int[] anIntArray179 = new int[5];

	@OriginalMember(owner = "client!UFBSEXDM", name = "x", descriptor = "[I")
	private static int[] anIntArray180 = new int[5];

	@OriginalMember(owner = "client!UFBSEXDM", name = "y", descriptor = "[I")
	private static int[] anIntArray181 = new int[5];

	@OriginalMember(owner = "client!UFBSEXDM", name = "z", descriptor = "[I")
	private static int[] anIntArray182 = new int[5];

	@OriginalMember(owner = "client!UFBSEXDM", name = "b", descriptor = "Lclient!TMVRZUVH;")
	private Class31 aClass31_1;

	@OriginalMember(owner = "client!UFBSEXDM", name = "c", descriptor = "Lclient!TMVRZUVH;")
	private Class31 aClass31_2;

	@OriginalMember(owner = "client!UFBSEXDM", name = "d", descriptor = "Lclient!TMVRZUVH;")
	private Class31 aClass31_3;

	@OriginalMember(owner = "client!UFBSEXDM", name = "e", descriptor = "Lclient!TMVRZUVH;")
	private Class31 aClass31_4;

	@OriginalMember(owner = "client!UFBSEXDM", name = "f", descriptor = "Lclient!TMVRZUVH;")
	private Class31 aClass31_5;

	@OriginalMember(owner = "client!UFBSEXDM", name = "g", descriptor = "Lclient!TMVRZUVH;")
	private Class31 aClass31_6;

	@OriginalMember(owner = "client!UFBSEXDM", name = "h", descriptor = "Lclient!TMVRZUVH;")
	private Class31 aClass31_7;

	@OriginalMember(owner = "client!UFBSEXDM", name = "i", descriptor = "Lclient!TMVRZUVH;")
	private Class31 aClass31_8;

	@OriginalMember(owner = "client!UFBSEXDM", name = "m", descriptor = "I")
	private int anInt692;

	@OriginalMember(owner = "client!UFBSEXDM", name = "o", descriptor = "Lclient!LOQKYCGM;")
	private Class16 aClass16_1;

	@OriginalMember(owner = "client!UFBSEXDM", name = "p", descriptor = "Lclient!TMVRZUVH;")
	private Class31 aClass31_9;

	@OriginalMember(owner = "client!UFBSEXDM", name = "r", descriptor = "I")
	public int anInt695;

	@OriginalMember(owner = "client!UFBSEXDM", name = "j", descriptor = "[I")
	private int[] anIntArray172 = new int[5];

	@OriginalMember(owner = "client!UFBSEXDM", name = "k", descriptor = "[I")
	private int[] anIntArray173 = new int[5];

	@OriginalMember(owner = "client!UFBSEXDM", name = "l", descriptor = "[I")
	private int[] anIntArray174 = new int[5];

	@OriginalMember(owner = "client!UFBSEXDM", name = "n", descriptor = "I")
	private int anInt693 = 100;

	@OriginalMember(owner = "client!UFBSEXDM", name = "q", descriptor = "I")
	public int anInt694 = 500;

	@OriginalMember(owner = "client!UFBSEXDM", name = "a", descriptor = "()V")
	public static void method462() {
		anIntArray176 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray176[local6] = 1;
			} else {
				anIntArray176[local6] = -1;
			}
		}
		anIntArray177 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray177[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray175 = new int[220500];
	}

	@OriginalMember(owner = "client!UFBSEXDM", name = "a", descriptor = "(II)[I")
	public int[] method463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray175[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray175;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass31_1.method457(aBoolean167);
		this.aClass31_2.method457(aBoolean167);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass31_3 != null) {
			this.aClass31_3.method457(aBoolean167);
			this.aClass31_4.method457(aBoolean167);
			local36 = (int) ((double) (this.aClass31_3.anInt680 - this.aClass31_3.anInt679) * 32.768D / local26);
			local38 = (int) ((double) this.aClass31_3.anInt679 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass31_5 != null) {
			this.aClass31_5.method457(aBoolean167);
			this.aClass31_6.method457(aBoolean167);
			local77 = (int) ((double) (this.aClass31_5.anInt680 - this.aClass31_5.anInt679) * 32.768D / local26);
			local79 = (int) ((double) this.aClass31_5.anInt679 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray172[local118] != 0) {
				anIntArray178[local118] = 0;
				anIntArray179[local118] = (int) ((double) this.anIntArray174[local118] * local26);
				anIntArray180[local118] = (this.anIntArray172[local118] << 14) / 100;
				anIntArray181[local118] = (int) ((double) (this.aClass31_1.anInt680 - this.aClass31_1.anInt679) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray173[local118]) / local26);
				anIntArray182[local118] = (int) ((double) this.aClass31_1.anInt679 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass31_1.method458(arg0);
			local207 = this.aClass31_2.method458(arg0);
			if (this.aClass31_3 != null) {
				local216 = this.aClass31_3.method458(arg0);
				local222 = this.aClass31_4.method458(arg0);
				local201 += this.method464(local40, this.aClass31_3.anInt681, local222) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass31_5 != null) {
				local216 = this.aClass31_5.method458(arg0);
				local222 = this.aClass31_6.method458(arg0);
				local207 = local207 * ((this.method464(local81, this.aClass31_5.anInt681, local222) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray172[local216] != 0) {
					local222 = local193 + anIntArray179[local216];
					if (local222 < arg0) {
						anIntArray175[local222] += this.method464(anIntArray178[local216], this.aClass31_1.anInt681, local207 * anIntArray180[local216] >> 15);
						anIntArray178[local216] += (local201 * anIntArray181[local216] >> 16) + anIntArray182[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass31_7 != null) {
			this.aClass31_7.method457(aBoolean167);
			this.aClass31_8.method457(aBoolean167);
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass31_7.method458(arg0);
				local385 = this.aClass31_8.method458(arg0);
				if (local369) {
					local207 = this.aClass31_7.anInt679 + ((this.aClass31_7.anInt680 - this.aClass31_7.anInt679) * local379 >> 8);
				} else {
					local207 = this.aClass31_7.anInt679 + ((this.aClass31_7.anInt680 - this.aClass31_7.anInt679) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray175[local222] = 0;
				}
			}
		}
		if (this.anInt692 > 0 && this.anInt693 > 0) {
			local201 = (int) ((double) this.anInt692 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray175[local207] += anIntArray175[local207 - local201] * this.anInt693 / 100;
			}
		}
		if (this.aClass16_1.anIntArray59[0] > 0 || this.aClass16_1.anIntArray59[1] > 0) {
			this.aClass31_9.method457(aBoolean167);
			local201 = this.aClass31_9.method458(arg0 + 1);
			local207 = this.aClass16_1.method219((float) local201 / 65536.0F, 0);
			local216 = this.aClass16_1.method219((float) local201 / 65536.0F, 1);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray175[local222 + local207] * (long) Class16.anInt425 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray175[local222 + local207 - local559 - 1] * (long) Class16.anIntArrayArray5[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray175[local222 - local590 - 1] * (long) Class16.anIntArrayArray5[1][local590] >> 16);
					}
					anIntArray175[local222] = local385;
					local201 = this.aClass31_9.method458(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray175[local222 + local207] * (long) Class16.anInt425 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray175[local222 + local207 - local590 - 1] * (long) Class16.anIntArrayArray5[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray175[local222 - local694 - 1] * (long) Class16.anIntArrayArray5[1][local694] >> 16);
						}
						anIntArray175[local222] = local559;
						local201 = this.aClass31_9.method458(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray175[local222 + local207 - local590 - 1] * (long) Class16.anIntArrayArray5[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray175[local222 - local694 - 1] * (long) Class16.anIntArrayArray5[1][local694] >> 16);
							}
							anIntArray175[local222] = local559;
							this.aClass31_9.method458(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass16_1.method219((float) local201 / 65536.0F, 0);
					local216 = this.aClass16_1.method219((float) local201 / 65536.0F, 1);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray175[local201] < -32768) {
				anIntArray175[local201] = -32768;
			}
			if (anIntArray175[local201] > 32767) {
				anIntArray175[local201] = 32767;
			}
		}
		return anIntArray175;
	}

	@OriginalMember(owner = "client!UFBSEXDM", name = "a", descriptor = "(IIII)I")
	private int method464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg1 == 1) {
				return (arg0 & 0x7FFF) < 16384 ? arg2 : -arg2;
			} else if (arg1 == 2) {
				return anIntArray177[arg0 & 0x7FFF] * arg2 >> 14;
			} else if (arg1 == 3) {
				return ((arg0 & 0x7FFF) * arg2 >> 14) - arg2;
			} else if (arg1 == 4) {
				return anIntArray176[arg0 / 2607 & 0x7FFF] * arg2;
			} else {
				return 0;
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("47811, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -928 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UFBSEXDM", name = "a", descriptor = "(Lclient!GHHPHSRU;I)V")
	public void method465(@OriginalArg(0) Class3_Sub1_Sub2 arg0) {
		try {
			this.aClass31_1 = new Class31();
			this.aClass31_1.method455(arg0);
			this.aClass31_2 = new Class31();
			this.aClass31_2.method455(arg0);
			@Pc(24) int local24 = arg0.method89();
			if (local24 != 0) {
				arg0.anInt257--;
				this.aClass31_3 = new Class31();
				this.aClass31_3.method455(arg0);
				this.aClass31_4 = new Class31();
				this.aClass31_4.method455(arg0);
			}
			local24 = arg0.method89();
			if (local24 != 0) {
				arg0.anInt257--;
				this.aClass31_5 = new Class31();
				this.aClass31_5.method455(arg0);
				this.aClass31_6 = new Class31();
				this.aClass31_6.method455(arg0);
			}
			local24 = arg0.method89();
			if (local24 != 0) {
				arg0.anInt257--;
				this.aClass31_7 = new Class31();
				this.aClass31_7.method455(arg0);
				this.aClass31_8 = new Class31();
				this.aClass31_8.method455(arg0);
			}
			for (@Pc(124) int local124 = 0; local124 < 10; local124++) {
				@Pc(135) int local135 = arg0.method103();
				if (local135 == 0) {
					break;
				}
				this.anIntArray172[local124] = local135;
				this.anIntArray173[local124] = arg0.method102();
				this.anIntArray174[local124] = arg0.method103();
			}
			this.anInt692 = arg0.method103();
			this.anInt693 = arg0.method103();
			this.anInt694 = arg0.method91();
			this.anInt695 = arg0.method91();
			this.aClass16_1 = new Class16();
			this.aClass31_9 = new Class31();
			this.aClass16_1.method220(95, this.aClass31_9, arg0);
		} catch (@Pc(193) RuntimeException local193) {
			signlink.reporterror("82280, " + arg0 + ", " + 0 + ", " + local193.toString());
			throw new RuntimeException();
		}
	}
}
