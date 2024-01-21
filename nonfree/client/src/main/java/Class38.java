import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VCSQFXER")
public final class Class38 {

	@OriginalMember(owner = "client!VCSQFXER", name = "s", descriptor = "[I")
	private static int[] anIntArray127;

	@OriginalMember(owner = "client!VCSQFXER", name = "t", descriptor = "[I")
	private static int[] anIntArray128;

	@OriginalMember(owner = "client!VCSQFXER", name = "u", descriptor = "[I")
	private static int[] anIntArray129;

	@OriginalMember(owner = "client!VCSQFXER", name = "v", descriptor = "[I")
	private static int[] anIntArray130 = new int[5];

	@OriginalMember(owner = "client!VCSQFXER", name = "w", descriptor = "[I")
	private static int[] anIntArray131 = new int[5];

	@OriginalMember(owner = "client!VCSQFXER", name = "x", descriptor = "[I")
	private static int[] anIntArray132 = new int[5];

	@OriginalMember(owner = "client!VCSQFXER", name = "y", descriptor = "[I")
	private static int[] anIntArray133 = new int[5];

	@OriginalMember(owner = "client!VCSQFXER", name = "z", descriptor = "[I")
	private static int[] anIntArray134 = new int[5];

	@OriginalMember(owner = "client!VCSQFXER", name = "b", descriptor = "Lclient!BJGBRRBX;")
	private Class3 aClass3_1;

	@OriginalMember(owner = "client!VCSQFXER", name = "c", descriptor = "Lclient!BJGBRRBX;")
	private Class3 aClass3_2;

	@OriginalMember(owner = "client!VCSQFXER", name = "d", descriptor = "Lclient!BJGBRRBX;")
	private Class3 aClass3_3;

	@OriginalMember(owner = "client!VCSQFXER", name = "e", descriptor = "Lclient!BJGBRRBX;")
	private Class3 aClass3_4;

	@OriginalMember(owner = "client!VCSQFXER", name = "f", descriptor = "Lclient!BJGBRRBX;")
	private Class3 aClass3_5;

	@OriginalMember(owner = "client!VCSQFXER", name = "g", descriptor = "Lclient!BJGBRRBX;")
	private Class3 aClass3_6;

	@OriginalMember(owner = "client!VCSQFXER", name = "h", descriptor = "Lclient!BJGBRRBX;")
	private Class3 aClass3_7;

	@OriginalMember(owner = "client!VCSQFXER", name = "i", descriptor = "Lclient!BJGBRRBX;")
	private Class3 aClass3_8;

	@OriginalMember(owner = "client!VCSQFXER", name = "m", descriptor = "I")
	private int anInt719;

	@OriginalMember(owner = "client!VCSQFXER", name = "o", descriptor = "Lclient!STQKONHX;")
	private Class34 aClass34_1;

	@OriginalMember(owner = "client!VCSQFXER", name = "p", descriptor = "Lclient!BJGBRRBX;")
	private Class3 aClass3_9;

	@OriginalMember(owner = "client!VCSQFXER", name = "r", descriptor = "I")
	public int anInt722;

	@OriginalMember(owner = "client!VCSQFXER", name = "a", descriptor = "Z")
	private boolean aBoolean175 = false;

	@OriginalMember(owner = "client!VCSQFXER", name = "j", descriptor = "[I")
	private int[] anIntArray124 = new int[5];

	@OriginalMember(owner = "client!VCSQFXER", name = "k", descriptor = "[I")
	private int[] anIntArray125 = new int[5];

	@OriginalMember(owner = "client!VCSQFXER", name = "l", descriptor = "[I")
	private int[] anIntArray126 = new int[5];

	@OriginalMember(owner = "client!VCSQFXER", name = "n", descriptor = "I")
	private int anInt720 = 100;

	@OriginalMember(owner = "client!VCSQFXER", name = "q", descriptor = "I")
	public int anInt721 = 500;

	@OriginalMember(owner = "client!VCSQFXER", name = "a", descriptor = "()V")
	public static void method484() {
		anIntArray128 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray128[local6] = 1;
			} else {
				anIntArray128[local6] = -1;
			}
		}
		anIntArray129 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray129[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray127 = new int[220500];
	}

	@OriginalMember(owner = "client!VCSQFXER", name = "a", descriptor = "(II)[I")
	public int[] method485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray127[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray127;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass3_1.method118((byte) 6);
		this.aClass3_2.method118((byte) 6);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass3_3 != null) {
			this.aClass3_3.method118((byte) 6);
			this.aClass3_4.method118((byte) 6);
			local36 = (int) ((double) (this.aClass3_3.anInt131 - this.aClass3_3.anInt130) * 32.768D / local26);
			local38 = (int) ((double) this.aClass3_3.anInt130 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass3_5 != null) {
			this.aClass3_5.method118((byte) 6);
			this.aClass3_6.method118((byte) 6);
			local77 = (int) ((double) (this.aClass3_5.anInt131 - this.aClass3_5.anInt130) * 32.768D / local26);
			local79 = (int) ((double) this.aClass3_5.anInt130 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray124[local118] != 0) {
				anIntArray130[local118] = 0;
				anIntArray131[local118] = (int) ((double) this.anIntArray126[local118] * local26);
				anIntArray132[local118] = (this.anIntArray124[local118] << 14) / 100;
				anIntArray133[local118] = (int) ((double) (this.aClass3_1.anInt131 - this.aClass3_1.anInt130) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray125[local118]) / local26);
				anIntArray134[local118] = (int) ((double) this.aClass3_1.anInt130 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass3_1.method119(arg0);
			local207 = this.aClass3_2.method119(arg0);
			if (this.aClass3_3 != null) {
				local216 = this.aClass3_3.method119(arg0);
				local222 = this.aClass3_4.method119(arg0);
				local201 += this.method486(local40, local222, this.aClass3_3.anInt132) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass3_5 != null) {
				local216 = this.aClass3_5.method119(arg0);
				local222 = this.aClass3_6.method119(arg0);
				local207 = local207 * ((this.method486(local81, local222, this.aClass3_5.anInt132) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray124[local216] != 0) {
					local222 = local193 + anIntArray131[local216];
					if (local222 < arg0) {
						anIntArray127[local222] += this.method486(anIntArray130[local216], local207 * anIntArray132[local216] >> 15, this.aClass3_1.anInt132);
						anIntArray130[local216] += (local201 * anIntArray133[local216] >> 16) + anIntArray134[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass3_7 != null) {
			this.aClass3_7.method118((byte) 6);
			this.aClass3_8.method118((byte) 6);
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass3_7.method119(arg0);
				local385 = this.aClass3_8.method119(arg0);
				if (local369) {
					local207 = this.aClass3_7.anInt130 + ((this.aClass3_7.anInt131 - this.aClass3_7.anInt130) * local379 >> 8);
				} else {
					local207 = this.aClass3_7.anInt130 + ((this.aClass3_7.anInt131 - this.aClass3_7.anInt130) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray127[local222] = 0;
				}
			}
		}
		if (this.anInt719 > 0 && this.anInt720 > 0) {
			local201 = (int) ((double) this.anInt719 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray127[local207] += anIntArray127[local207 - local201] * this.anInt720 / 100;
			}
		}
		if (this.aClass34_1.anIntArray119[0] > 0 || this.aClass34_1.anIntArray119[1] > 0) {
			this.aClass3_9.method118((byte) 6);
			local201 = this.aClass3_9.method119(arg0 + 1);
			local207 = this.aClass34_1.method466(0, (float) local201 / 65536.0F);
			local216 = this.aClass34_1.method466(1, (float) local201 / 65536.0F);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray127[local222 + local207] * (long) Class34.anInt661 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray127[local222 + local207 - local559 - 1] * (long) Class34.anIntArrayArray15[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray127[local222 - local590 - 1] * (long) Class34.anIntArrayArray15[1][local590] >> 16);
					}
					anIntArray127[local222] = local385;
					local201 = this.aClass3_9.method119(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray127[local222 + local207] * (long) Class34.anInt661 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray127[local222 + local207 - local590 - 1] * (long) Class34.anIntArrayArray15[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray127[local222 - local694 - 1] * (long) Class34.anIntArrayArray15[1][local694] >> 16);
						}
						anIntArray127[local222] = local559;
						local201 = this.aClass3_9.method119(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray127[local222 + local207 - local590 - 1] * (long) Class34.anIntArrayArray15[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray127[local222 - local694 - 1] * (long) Class34.anIntArrayArray15[1][local694] >> 16);
							}
							anIntArray127[local222] = local559;
							this.aClass3_9.method119(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass34_1.method466(0, (float) local201 / 65536.0F);
					local216 = this.aClass34_1.method466(1, (float) local201 / 65536.0F);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray127[local201] < -32768) {
				anIntArray127[local201] = -32768;
			}
			if (anIntArray127[local201] > 32767) {
				anIntArray127[local201] = 32767;
			}
		}
		return anIntArray127;
	}

	@OriginalMember(owner = "client!VCSQFXER", name = "a", descriptor = "(IIII)I")
	private int method486(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 1) {
				return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
			} else if (arg2 == 2) {
				return anIntArray129[arg0 & 0x7FFF] * arg1 >> 14;
			} else if (arg2 == 3) {
				return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
			} else if (arg2 == 4) {
				return anIntArray128[arg0 / 2607 & 0x7FFF] * arg1;
			} else {
				return 0;
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("78942, " + 9 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCSQFXER", name = "a", descriptor = "(BLclient!BFQIDHPO;)V")
	public void method487(@OriginalArg(1) Class2_Sub1_Sub2 arg0) {
		try {
			this.aClass3_1 = new Class3();
			this.aClass3_1.method116(arg0);
			this.aClass3_2 = new Class3();
			this.aClass3_2.method116(arg0);
			@Pc(24) int local24 = arg0.method79();
			if (local24 != 0) {
				arg0.anInt123--;
				this.aClass3_3 = new Class3();
				this.aClass3_3.method116(arg0);
				this.aClass3_4 = new Class3();
				this.aClass3_4.method116(arg0);
			}
			local24 = arg0.method79();
			if (local24 != 0) {
				arg0.anInt123--;
				this.aClass3_5 = new Class3();
				this.aClass3_5.method116(arg0);
				this.aClass3_6 = new Class3();
				this.aClass3_6.method116(arg0);
			}
			local24 = arg0.method79();
			if (local24 != 0) {
				arg0.anInt123--;
				this.aClass3_7 = new Class3();
				this.aClass3_7.method116(arg0);
				this.aClass3_8 = new Class3();
				this.aClass3_8.method116(arg0);
			}
			for (@Pc(116) int local116 = 0; local116 < 10; local116++) {
				@Pc(127) int local127 = arg0.method93();
				if (local127 == 0) {
					break;
				}
				this.anIntArray124[local116] = local127;
				this.anIntArray125[local116] = arg0.method92();
				this.anIntArray126[local116] = arg0.method93();
			}
			this.anInt719 = arg0.method93();
			this.anInt720 = arg0.method93();
			this.anInt721 = arg0.method81();
			this.anInt722 = arg0.method81();
			this.aClass34_1 = new Class34();
			this.aClass3_9 = new Class3();
			this.aClass34_1.method467(this.aClass3_9, arg0);
		} catch (@Pc(196) RuntimeException local196) {
			signlink.reporterror("26620, " + -11 + ", " + arg0 + ", " + local196.toString());
			throw new RuntimeException();
		}
	}
}
