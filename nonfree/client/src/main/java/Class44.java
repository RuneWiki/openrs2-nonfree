import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XDUWEFUG")
public final class Class44 {

	@OriginalMember(owner = "client!XDUWEFUG", name = "s", descriptor = "[I")
	private static int[] anIntArray163;

	@OriginalMember(owner = "client!XDUWEFUG", name = "t", descriptor = "[I")
	private static int[] anIntArray164;

	@OriginalMember(owner = "client!XDUWEFUG", name = "u", descriptor = "[I")
	private static int[] anIntArray165;

	@OriginalMember(owner = "client!XDUWEFUG", name = "v", descriptor = "[I")
	private static int[] anIntArray166 = new int[5];

	@OriginalMember(owner = "client!XDUWEFUG", name = "w", descriptor = "[I")
	private static int[] anIntArray167 = new int[5];

	@OriginalMember(owner = "client!XDUWEFUG", name = "x", descriptor = "[I")
	private static int[] anIntArray168 = new int[5];

	@OriginalMember(owner = "client!XDUWEFUG", name = "y", descriptor = "[I")
	private static int[] anIntArray169 = new int[5];

	@OriginalMember(owner = "client!XDUWEFUG", name = "z", descriptor = "[I")
	private static int[] anIntArray170 = new int[5];

	@OriginalMember(owner = "client!XDUWEFUG", name = "b", descriptor = "Lclient!LMFHFXBO;")
	private Class25 aClass25_1;

	@OriginalMember(owner = "client!XDUWEFUG", name = "c", descriptor = "Lclient!LMFHFXBO;")
	private Class25 aClass25_2;

	@OriginalMember(owner = "client!XDUWEFUG", name = "d", descriptor = "Lclient!LMFHFXBO;")
	private Class25 aClass25_3;

	@OriginalMember(owner = "client!XDUWEFUG", name = "e", descriptor = "Lclient!LMFHFXBO;")
	private Class25 aClass25_4;

	@OriginalMember(owner = "client!XDUWEFUG", name = "f", descriptor = "Lclient!LMFHFXBO;")
	private Class25 aClass25_5;

	@OriginalMember(owner = "client!XDUWEFUG", name = "g", descriptor = "Lclient!LMFHFXBO;")
	private Class25 aClass25_6;

	@OriginalMember(owner = "client!XDUWEFUG", name = "h", descriptor = "Lclient!LMFHFXBO;")
	private Class25 aClass25_7;

	@OriginalMember(owner = "client!XDUWEFUG", name = "i", descriptor = "Lclient!LMFHFXBO;")
	private Class25 aClass25_8;

	@OriginalMember(owner = "client!XDUWEFUG", name = "m", descriptor = "I")
	private int anInt688;

	@OriginalMember(owner = "client!XDUWEFUG", name = "o", descriptor = "Lclient!BVZJQTSH;")
	private Class2 aClass2_1;

	@OriginalMember(owner = "client!XDUWEFUG", name = "p", descriptor = "Lclient!LMFHFXBO;")
	private Class25 aClass25_9;

	@OriginalMember(owner = "client!XDUWEFUG", name = "r", descriptor = "I")
	public int anInt691;

	@OriginalMember(owner = "client!XDUWEFUG", name = "a", descriptor = "Z")
	private boolean aBoolean159 = false;

	@OriginalMember(owner = "client!XDUWEFUG", name = "j", descriptor = "[I")
	private int[] anIntArray160 = new int[5];

	@OriginalMember(owner = "client!XDUWEFUG", name = "k", descriptor = "[I")
	private int[] anIntArray161 = new int[5];

	@OriginalMember(owner = "client!XDUWEFUG", name = "l", descriptor = "[I")
	private int[] anIntArray162 = new int[5];

	@OriginalMember(owner = "client!XDUWEFUG", name = "n", descriptor = "I")
	private int anInt689 = 100;

	@OriginalMember(owner = "client!XDUWEFUG", name = "q", descriptor = "I")
	public int anInt690 = 500;

	@OriginalMember(owner = "client!XDUWEFUG", name = "a", descriptor = "()V")
	public static void method496() {
		anIntArray164 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray164[local6] = 1;
			} else {
				anIntArray164[local6] = -1;
			}
		}
		anIntArray165 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray165[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray163 = new int[220500];
	}

	@OriginalMember(owner = "client!XDUWEFUG", name = "a", descriptor = "(II)[I")
	public int[] method497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray163[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray163;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass25_1.method277((byte) 2);
		this.aClass25_2.method277((byte) 2);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass25_3 != null) {
			this.aClass25_3.method277((byte) 2);
			this.aClass25_4.method277((byte) 2);
			local36 = (int) ((double) (this.aClass25_3.anInt434 - this.aClass25_3.anInt433) * 32.768D / local26);
			local38 = (int) ((double) this.aClass25_3.anInt433 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass25_5 != null) {
			this.aClass25_5.method277((byte) 2);
			this.aClass25_6.method277((byte) 2);
			local77 = (int) ((double) (this.aClass25_5.anInt434 - this.aClass25_5.anInt433) * 32.768D / local26);
			local79 = (int) ((double) this.aClass25_5.anInt433 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray160[local118] != 0) {
				anIntArray166[local118] = 0;
				anIntArray167[local118] = (int) ((double) this.anIntArray162[local118] * local26);
				anIntArray168[local118] = (this.anIntArray160[local118] << 14) / 100;
				anIntArray169[local118] = (int) ((double) (this.aClass25_1.anInt434 - this.aClass25_1.anInt433) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray161[local118]) / local26);
				anIntArray170[local118] = (int) ((double) this.aClass25_1.anInt433 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass25_1.method278(arg0);
			local207 = this.aClass25_2.method278(arg0);
			if (this.aClass25_3 != null) {
				local216 = this.aClass25_3.method278(arg0);
				local222 = this.aClass25_4.method278(arg0);
				local201 += this.method498(local40, this.aClass25_3.anInt435, local222) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass25_5 != null) {
				local216 = this.aClass25_5.method278(arg0);
				local222 = this.aClass25_6.method278(arg0);
				local207 = local207 * ((this.method498(local81, this.aClass25_5.anInt435, local222) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray160[local216] != 0) {
					local222 = local193 + anIntArray167[local216];
					if (local222 < arg0) {
						anIntArray163[local222] += this.method498(anIntArray166[local216], this.aClass25_1.anInt435, local207 * anIntArray168[local216] >> 15);
						anIntArray166[local216] += (local201 * anIntArray169[local216] >> 16) + anIntArray170[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass25_7 != null) {
			this.aClass25_7.method277((byte) 2);
			this.aClass25_8.method277((byte) 2);
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass25_7.method278(arg0);
				local385 = this.aClass25_8.method278(arg0);
				if (local369) {
					local207 = this.aClass25_7.anInt433 + ((this.aClass25_7.anInt434 - this.aClass25_7.anInt433) * local379 >> 8);
				} else {
					local207 = this.aClass25_7.anInt433 + ((this.aClass25_7.anInt434 - this.aClass25_7.anInt433) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray163[local222] = 0;
				}
			}
		}
		if (this.anInt688 > 0 && this.anInt689 > 0) {
			local201 = (int) ((double) this.anInt688 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray163[local207] += anIntArray163[local207 - local201] * this.anInt689 / 100;
			}
		}
		if (this.aClass2_1.anIntArray6[0] > 0 || this.aClass2_1.anIntArray6[1] > 0) {
			this.aClass25_9.method277((byte) 2);
			local201 = this.aClass25_9.method278(arg0 + 1);
			local207 = this.aClass2_1.method56((float) local201 / 65536.0F, 0);
			local216 = this.aClass2_1.method56((float) local201 / 65536.0F, 1);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray163[local222 + local207] * (long) Class2.anInt69 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray163[local222 + local207 - local559 - 1] * (long) Class2.anIntArrayArray1[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray163[local222 - local590 - 1] * (long) Class2.anIntArrayArray1[1][local590] >> 16);
					}
					anIntArray163[local222] = local385;
					local201 = this.aClass25_9.method278(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray163[local222 + local207] * (long) Class2.anInt69 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray163[local222 + local207 - local590 - 1] * (long) Class2.anIntArrayArray1[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray163[local222 - local694 - 1] * (long) Class2.anIntArrayArray1[1][local694] >> 16);
						}
						anIntArray163[local222] = local559;
						local201 = this.aClass25_9.method278(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray163[local222 + local207 - local590 - 1] * (long) Class2.anIntArrayArray1[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray163[local222 - local694 - 1] * (long) Class2.anIntArrayArray1[1][local694] >> 16);
							}
							anIntArray163[local222] = local559;
							this.aClass25_9.method278(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass2_1.method56((float) local201 / 65536.0F, 0);
					local216 = this.aClass2_1.method56((float) local201 / 65536.0F, 1);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray163[local201] < -32768) {
				anIntArray163[local201] = -32768;
			}
			if (anIntArray163[local201] > 32767) {
				anIntArray163[local201] = 32767;
			}
		}
		return anIntArray163;
	}

	@OriginalMember(owner = "client!XDUWEFUG", name = "a", descriptor = "(IIIB)I")
	private int method498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg1 == 1) {
				return (arg0 & 0x7FFF) < 16384 ? arg2 : -arg2;
			} else if (arg1 == 2) {
				return anIntArray165[arg0 & 0x7FFF] * arg2 >> 14;
			} else if (arg1 == 3) {
				return ((arg0 & 0x7FFF) * arg2 >> 14) - arg2;
			} else if (arg1 == 4) {
				return anIntArray164[arg0 / 2607 & 0x7FFF] * arg2;
			} else {
				return 0;
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("69079, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 4 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XDUWEFUG", name = "a", descriptor = "(Lclient!MNKDCXXG;I)V")
	public void method499(@OriginalArg(0) Class1_Sub2_Sub3 arg0) {
		try {
			this.aClass25_1 = new Class25();
			this.aClass25_1.method275(arg0);
			this.aClass25_2 = new Class25();
			this.aClass25_2.method275(arg0);
			@Pc(39) int local39 = arg0.method307();
			if (local39 != 0) {
				arg0.anInt474--;
				this.aClass25_3 = new Class25();
				this.aClass25_3.method275(arg0);
				this.aClass25_4 = new Class25();
				this.aClass25_4.method275(arg0);
			}
			local39 = arg0.method307();
			if (local39 != 0) {
				arg0.anInt474--;
				this.aClass25_5 = new Class25();
				this.aClass25_5.method275(arg0);
				this.aClass25_6 = new Class25();
				this.aClass25_6.method275(arg0);
			}
			local39 = arg0.method307();
			if (local39 != 0) {
				arg0.anInt474--;
				this.aClass25_7 = new Class25();
				this.aClass25_7.method275(arg0);
				this.aClass25_8 = new Class25();
				this.aClass25_8.method275(arg0);
			}
			for (@Pc(131) int local131 = 0; local131 < 10; local131++) {
				@Pc(136) int local136 = arg0.method321();
				if (local136 == 0) {
					break;
				}
				this.anIntArray160[local131] = local136;
				this.anIntArray161[local131] = arg0.method320();
				this.anIntArray162[local131] = arg0.method321();
			}
			this.anInt688 = arg0.method321();
			this.anInt689 = arg0.method321();
			this.anInt690 = arg0.method309();
			this.anInt691 = arg0.method309();
			this.aClass2_1 = new Class2();
			this.aClass25_9 = new Class25();
			this.aClass2_1.method57(arg0, this.aClass25_9);
		} catch (@Pc(194) RuntimeException local194) {
			signlink.reporterror("74687, " + arg0 + ", " + 0 + ", " + local194.toString());
			throw new RuntimeException();
		}
	}
}
