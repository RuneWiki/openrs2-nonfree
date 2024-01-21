import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PJPXFVTH")
public final class Class29 {

	@OriginalMember(owner = "client!PJPXFVTH", name = "t", descriptor = "[I")
	private static int[] anIntArray82;

	@OriginalMember(owner = "client!PJPXFVTH", name = "u", descriptor = "[I")
	private static int[] anIntArray83;

	@OriginalMember(owner = "client!PJPXFVTH", name = "v", descriptor = "[I")
	private static int[] anIntArray84;

	@OriginalMember(owner = "client!PJPXFVTH", name = "w", descriptor = "[I")
	private static int[] anIntArray85 = new int[5];

	@OriginalMember(owner = "client!PJPXFVTH", name = "x", descriptor = "[I")
	private static int[] anIntArray86 = new int[5];

	@OriginalMember(owner = "client!PJPXFVTH", name = "y", descriptor = "[I")
	private static int[] anIntArray87 = new int[5];

	@OriginalMember(owner = "client!PJPXFVTH", name = "z", descriptor = "[I")
	private static int[] anIntArray88 = new int[5];

	@OriginalMember(owner = "client!PJPXFVTH", name = "A", descriptor = "[I")
	private static int[] anIntArray89 = new int[5];

	@OriginalMember(owner = "client!PJPXFVTH", name = "c", descriptor = "Lclient!LSSFLBMP;")
	private Class24 aClass24_1;

	@OriginalMember(owner = "client!PJPXFVTH", name = "d", descriptor = "Lclient!LSSFLBMP;")
	private Class24 aClass24_2;

	@OriginalMember(owner = "client!PJPXFVTH", name = "e", descriptor = "Lclient!LSSFLBMP;")
	private Class24 aClass24_3;

	@OriginalMember(owner = "client!PJPXFVTH", name = "f", descriptor = "Lclient!LSSFLBMP;")
	private Class24 aClass24_4;

	@OriginalMember(owner = "client!PJPXFVTH", name = "g", descriptor = "Lclient!LSSFLBMP;")
	private Class24 aClass24_5;

	@OriginalMember(owner = "client!PJPXFVTH", name = "h", descriptor = "Lclient!LSSFLBMP;")
	private Class24 aClass24_6;

	@OriginalMember(owner = "client!PJPXFVTH", name = "i", descriptor = "Lclient!LSSFLBMP;")
	private Class24 aClass24_7;

	@OriginalMember(owner = "client!PJPXFVTH", name = "j", descriptor = "Lclient!LSSFLBMP;")
	private Class24 aClass24_8;

	@OriginalMember(owner = "client!PJPXFVTH", name = "n", descriptor = "I")
	private int anInt380;

	@OriginalMember(owner = "client!PJPXFVTH", name = "p", descriptor = "Lclient!QPYZEWVW;")
	private Class31 aClass31_1;

	@OriginalMember(owner = "client!PJPXFVTH", name = "q", descriptor = "Lclient!LSSFLBMP;")
	private Class24 aClass24_9;

	@OriginalMember(owner = "client!PJPXFVTH", name = "s", descriptor = "I")
	public int anInt383;

	@OriginalMember(owner = "client!PJPXFVTH", name = "a", descriptor = "I")
	private int anInt379 = 987;

	@OriginalMember(owner = "client!PJPXFVTH", name = "b", descriptor = "Z")
	private boolean aBoolean91 = true;

	@OriginalMember(owner = "client!PJPXFVTH", name = "k", descriptor = "[I")
	private int[] anIntArray79 = new int[5];

	@OriginalMember(owner = "client!PJPXFVTH", name = "l", descriptor = "[I")
	private int[] anIntArray80 = new int[5];

	@OriginalMember(owner = "client!PJPXFVTH", name = "m", descriptor = "[I")
	private int[] anIntArray81 = new int[5];

	@OriginalMember(owner = "client!PJPXFVTH", name = "o", descriptor = "I")
	private int anInt381 = 100;

	@OriginalMember(owner = "client!PJPXFVTH", name = "r", descriptor = "I")
	public int anInt382 = 500;

	@OriginalMember(owner = "client!PJPXFVTH", name = "a", descriptor = "()V")
	public static void method303() {
		anIntArray83 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray83[local6] = 1;
			} else {
				anIntArray83[local6] = -1;
			}
		}
		anIntArray84 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray84[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray82 = new int[220500];
	}

	@OriginalMember(owner = "client!PJPXFVTH", name = "a", descriptor = "(II)[I")
	public int[] method304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray82[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray82;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass24_1.method243();
		this.aClass24_2.method243();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass24_3 != null) {
			this.aClass24_3.method243();
			this.aClass24_4.method243();
			local36 = (int) ((double) (this.aClass24_3.anInt276 - this.aClass24_3.anInt275) * 32.768D / local26);
			local38 = (int) ((double) this.aClass24_3.anInt275 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass24_5 != null) {
			this.aClass24_5.method243();
			this.aClass24_6.method243();
			local77 = (int) ((double) (this.aClass24_5.anInt276 - this.aClass24_5.anInt275) * 32.768D / local26);
			local79 = (int) ((double) this.aClass24_5.anInt275 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray79[local118] != 0) {
				anIntArray85[local118] = 0;
				anIntArray86[local118] = (int) ((double) this.anIntArray81[local118] * local26);
				anIntArray87[local118] = (this.anIntArray79[local118] << 14) / 100;
				anIntArray88[local118] = (int) ((double) (this.aClass24_1.anInt276 - this.aClass24_1.anInt275) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray80[local118]) / local26);
				anIntArray89[local118] = (int) ((double) this.aClass24_1.anInt275 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass24_1.method244(arg0);
			local207 = this.aClass24_2.method244(arg0);
			if (this.aClass24_3 != null) {
				local216 = this.aClass24_3.method244(arg0);
				local222 = this.aClass24_4.method244(arg0);
				local201 += this.method305(this.aClass24_3.anInt277, local222, local40) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass24_5 != null) {
				local216 = this.aClass24_5.method244(arg0);
				local222 = this.aClass24_6.method244(arg0);
				local207 = local207 * ((this.method305(this.aClass24_5.anInt277, local222, local81) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray79[local216] != 0) {
					local222 = local193 + anIntArray86[local216];
					if (local222 < arg0) {
						anIntArray82[local222] += this.method305(this.aClass24_1.anInt277, local207 * anIntArray87[local216] >> 15, anIntArray85[local216]);
						anIntArray85[local216] += (local201 * anIntArray88[local216] >> 16) + anIntArray89[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass24_7 != null) {
			this.aClass24_7.method243();
			this.aClass24_8.method243();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass24_7.method244(arg0);
				local385 = this.aClass24_8.method244(arg0);
				if (local369) {
					local207 = this.aClass24_7.anInt275 + ((this.aClass24_7.anInt276 - this.aClass24_7.anInt275) * local379 >> 8);
				} else {
					local207 = this.aClass24_7.anInt275 + ((this.aClass24_7.anInt276 - this.aClass24_7.anInt275) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray82[local222] = 0;
				}
			}
		}
		if (this.anInt380 > 0 && this.anInt381 > 0) {
			local201 = (int) ((double) this.anInt380 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray82[local207] += anIntArray82[local207 - local201] * this.anInt381 / 100;
			}
		}
		if (this.aClass31_1.anIntArray95[0] > 0 || this.aClass31_1.anIntArray95[1] > 0) {
			this.aClass24_9.method243();
			local201 = this.aClass24_9.method244(arg0 + 1);
			local207 = this.aClass31_1.method314((float) local201 / 65536.0F, 0);
			local216 = this.aClass31_1.method314((float) local201 / 65536.0F, 1);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray82[local222 + local207] * (long) Class31.anInt410 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray82[local222 + local207 - local559 - 1] * (long) Class31.anIntArrayArray12[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray82[local222 - local590 - 1] * (long) Class31.anIntArrayArray12[1][local590] >> 16);
					}
					anIntArray82[local222] = local385;
					local201 = this.aClass24_9.method244(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray82[local222 + local207] * (long) Class31.anInt410 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray82[local222 + local207 - local590 - 1] * (long) Class31.anIntArrayArray12[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray82[local222 - local694 - 1] * (long) Class31.anIntArrayArray12[1][local694] >> 16);
						}
						anIntArray82[local222] = local559;
						local201 = this.aClass24_9.method244(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray82[local222 + local207 - local590 - 1] * (long) Class31.anIntArrayArray12[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray82[local222 - local694 - 1] * (long) Class31.anIntArrayArray12[1][local694] >> 16);
							}
							anIntArray82[local222] = local559;
							this.aClass24_9.method244(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass31_1.method314((float) local201 / 65536.0F, 0);
					local216 = this.aClass31_1.method314((float) local201 / 65536.0F, 1);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray82[local201] < -32768) {
				anIntArray82[local201] = -32768;
			}
			if (anIntArray82[local201] > 32767) {
				anIntArray82[local201] = 32767;
			}
		}
		return anIntArray82;
	}

	@OriginalMember(owner = "client!PJPXFVTH", name = "a", descriptor = "(IIII)I")
	private int method305(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 == 1) {
				return (arg2 & 0x7FFF) < 16384 ? arg1 : -arg1;
			} else if (arg0 == 2) {
				return anIntArray84[arg2 & 0x7FFF] * arg1 >> 14;
			} else if (arg0 == 3) {
				return ((arg2 & 0x7FFF) * arg1 >> 14) - arg1;
			} else if (arg0 == 4) {
				return anIntArray83[arg2 / 2607 & 0x7FFF] * arg1;
			} else {
				return 0;
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("46488, " + 38792 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PJPXFVTH", name = "a", descriptor = "(ILclient!WNCFPLWV;)V")
	public void method306(@OriginalArg(1) Class3_Sub1_Sub4 arg0) {
		try {
			this.aClass24_1 = new Class24();
			this.aClass24_1.method241(arg0);
			this.aClass24_2 = new Class24();
			this.aClass24_2.method241(arg0);
			@Pc(24) int local24 = arg0.method458();
			if (local24 != 0) {
				arg0.anInt666--;
				this.aClass24_3 = new Class24();
				this.aClass24_3.method241(arg0);
				this.aClass24_4 = new Class24();
				this.aClass24_4.method241(arg0);
			}
			local24 = arg0.method458();
			if (local24 != 0) {
				arg0.anInt666--;
				this.aClass24_5 = new Class24();
				this.aClass24_5.method241(arg0);
				this.aClass24_6 = new Class24();
				this.aClass24_6.method241(arg0);
			}
			local24 = arg0.method458();
			if (local24 != 0) {
				arg0.anInt666--;
				this.aClass24_7 = new Class24();
				this.aClass24_7.method241(arg0);
				this.aClass24_8 = new Class24();
				this.aClass24_8.method241(arg0);
			}
			for (@Pc(133) int local133 = 0; local133 < 10; local133++) {
				@Pc(138) int local138 = arg0.method472();
				if (local138 == 0) {
					break;
				}
				this.anIntArray79[local133] = local138;
				this.anIntArray80[local133] = arg0.method471();
				this.anIntArray81[local133] = arg0.method472();
			}
			this.anInt380 = arg0.method472();
			this.anInt381 = arg0.method472();
			this.anInt382 = arg0.method460();
			this.anInt383 = arg0.method460();
			this.aClass31_1 = new Class31();
			this.aClass24_9 = new Class24();
			this.aClass31_1.method315(this.aClass24_9, arg0, this.aBoolean91);
		} catch (@Pc(197) RuntimeException local197) {
			signlink.reporterror("31557, " + -934 + ", " + arg0 + ", " + local197.toString());
			throw new RuntimeException();
		}
	}
}
