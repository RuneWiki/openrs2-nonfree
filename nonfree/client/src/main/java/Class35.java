import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SMALAPQM")
public final class Class35 {

	@OriginalMember(owner = "client!SMALAPQM", name = "s", descriptor = "[I")
	private static int[] anIntArray163;

	@OriginalMember(owner = "client!SMALAPQM", name = "t", descriptor = "[I")
	private static int[] anIntArray164;

	@OriginalMember(owner = "client!SMALAPQM", name = "u", descriptor = "[I")
	private static int[] anIntArray165;

	@OriginalMember(owner = "client!SMALAPQM", name = "v", descriptor = "[I")
	private static int[] anIntArray166 = new int[5];

	@OriginalMember(owner = "client!SMALAPQM", name = "w", descriptor = "[I")
	private static int[] anIntArray167 = new int[5];

	@OriginalMember(owner = "client!SMALAPQM", name = "x", descriptor = "[I")
	private static int[] anIntArray168 = new int[5];

	@OriginalMember(owner = "client!SMALAPQM", name = "y", descriptor = "[I")
	private static int[] anIntArray169 = new int[5];

	@OriginalMember(owner = "client!SMALAPQM", name = "z", descriptor = "[I")
	private static int[] anIntArray170 = new int[5];

	@OriginalMember(owner = "client!SMALAPQM", name = "b", descriptor = "Lclient!AUPOWMGG;")
	private Class1 aClass1_1;

	@OriginalMember(owner = "client!SMALAPQM", name = "c", descriptor = "Lclient!AUPOWMGG;")
	private Class1 aClass1_2;

	@OriginalMember(owner = "client!SMALAPQM", name = "d", descriptor = "Lclient!AUPOWMGG;")
	private Class1 aClass1_3;

	@OriginalMember(owner = "client!SMALAPQM", name = "e", descriptor = "Lclient!AUPOWMGG;")
	private Class1 aClass1_4;

	@OriginalMember(owner = "client!SMALAPQM", name = "f", descriptor = "Lclient!AUPOWMGG;")
	private Class1 aClass1_5;

	@OriginalMember(owner = "client!SMALAPQM", name = "g", descriptor = "Lclient!AUPOWMGG;")
	private Class1 aClass1_6;

	@OriginalMember(owner = "client!SMALAPQM", name = "h", descriptor = "Lclient!AUPOWMGG;")
	private Class1 aClass1_7;

	@OriginalMember(owner = "client!SMALAPQM", name = "i", descriptor = "Lclient!AUPOWMGG;")
	private Class1 aClass1_8;

	@OriginalMember(owner = "client!SMALAPQM", name = "m", descriptor = "I")
	private int anInt566;

	@OriginalMember(owner = "client!SMALAPQM", name = "o", descriptor = "Lclient!PKLJDULJ;")
	private Class30 aClass30_1;

	@OriginalMember(owner = "client!SMALAPQM", name = "p", descriptor = "Lclient!AUPOWMGG;")
	private Class1 aClass1_9;

	@OriginalMember(owner = "client!SMALAPQM", name = "r", descriptor = "I")
	public int anInt569;

	@OriginalMember(owner = "client!SMALAPQM", name = "a", descriptor = "I")
	private int anInt565 = 897;

	@OriginalMember(owner = "client!SMALAPQM", name = "j", descriptor = "[I")
	private int[] anIntArray160 = new int[5];

	@OriginalMember(owner = "client!SMALAPQM", name = "k", descriptor = "[I")
	private int[] anIntArray161 = new int[5];

	@OriginalMember(owner = "client!SMALAPQM", name = "l", descriptor = "[I")
	private int[] anIntArray162 = new int[5];

	@OriginalMember(owner = "client!SMALAPQM", name = "n", descriptor = "I")
	private int anInt567 = 100;

	@OriginalMember(owner = "client!SMALAPQM", name = "q", descriptor = "I")
	public int anInt568 = 500;

	@OriginalMember(owner = "client!SMALAPQM", name = "a", descriptor = "()V")
	public static void method375() {
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

	@OriginalMember(owner = "client!SMALAPQM", name = "a", descriptor = "(II)[I")
	public int[] method376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray163[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray163;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass1_1.method3();
		this.aClass1_2.method3();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass1_3 != null) {
			this.aClass1_3.method3();
			this.aClass1_4.method3();
			local36 = (int) ((double) (this.aClass1_3.anInt4 - this.aClass1_3.anInt3) * 32.768D / local26);
			local38 = (int) ((double) this.aClass1_3.anInt3 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass1_5 != null) {
			this.aClass1_5.method3();
			this.aClass1_6.method3();
			local77 = (int) ((double) (this.aClass1_5.anInt4 - this.aClass1_5.anInt3) * 32.768D / local26);
			local79 = (int) ((double) this.aClass1_5.anInt3 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray160[local118] != 0) {
				anIntArray166[local118] = 0;
				anIntArray167[local118] = (int) ((double) this.anIntArray162[local118] * local26);
				anIntArray168[local118] = (this.anIntArray160[local118] << 14) / 100;
				anIntArray169[local118] = (int) ((double) (this.aClass1_1.anInt4 - this.aClass1_1.anInt3) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray161[local118]) / local26);
				anIntArray170[local118] = (int) ((double) this.aClass1_1.anInt3 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass1_1.method4(arg0);
			local207 = this.aClass1_2.method4(arg0);
			if (this.aClass1_3 != null) {
				local216 = this.aClass1_3.method4(arg0);
				local222 = this.aClass1_4.method4(arg0);
				local201 += this.method377(local222, local40, this.aClass1_3.anInt5) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass1_5 != null) {
				local216 = this.aClass1_5.method4(arg0);
				local222 = this.aClass1_6.method4(arg0);
				local207 = local207 * ((this.method377(local222, local81, this.aClass1_5.anInt5) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray160[local216] != 0) {
					local222 = local193 + anIntArray167[local216];
					if (local222 < arg0) {
						anIntArray163[local222] += this.method377(local207 * anIntArray168[local216] >> 15, anIntArray166[local216], this.aClass1_1.anInt5);
						anIntArray166[local216] += (local201 * anIntArray169[local216] >> 16) + anIntArray170[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass1_7 != null) {
			this.aClass1_7.method3();
			this.aClass1_8.method3();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass1_7.method4(arg0);
				local385 = this.aClass1_8.method4(arg0);
				if (local369) {
					local207 = this.aClass1_7.anInt3 + ((this.aClass1_7.anInt4 - this.aClass1_7.anInt3) * local379 >> 8);
				} else {
					local207 = this.aClass1_7.anInt3 + ((this.aClass1_7.anInt4 - this.aClass1_7.anInt3) * local385 >> 8);
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
		if (this.anInt566 > 0 && this.anInt567 > 0) {
			local201 = (int) ((double) this.anInt566 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray163[local207] += anIntArray163[local207 - local201] * this.anInt567 / 100;
			}
		}
		if (this.aClass30_1.anIntArray124[0] > 0 || this.aClass30_1.anIntArray124[1] > 0) {
			this.aClass1_9.method3();
			local201 = this.aClass1_9.method4(arg0 + 1);
			local207 = this.aClass30_1.method337((float) local201 / 65536.0F, 0);
			local216 = this.aClass30_1.method337((float) local201 / 65536.0F, 1);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray163[local222 + local207] * (long) Class30.anInt478 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray163[local222 + local207 - local559 - 1] * (long) Class30.anIntArrayArray8[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray163[local222 - local590 - 1] * (long) Class30.anIntArrayArray8[1][local590] >> 16);
					}
					anIntArray163[local222] = local385;
					local201 = this.aClass1_9.method4(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray163[local222 + local207] * (long) Class30.anInt478 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray163[local222 + local207 - local590 - 1] * (long) Class30.anIntArrayArray8[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray163[local222 - local694 - 1] * (long) Class30.anIntArrayArray8[1][local694] >> 16);
						}
						anIntArray163[local222] = local559;
						local201 = this.aClass1_9.method4(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray163[local222 + local207 - local590 - 1] * (long) Class30.anIntArrayArray8[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray163[local222 - local694 - 1] * (long) Class30.anIntArrayArray8[1][local694] >> 16);
							}
							anIntArray163[local222] = local559;
							this.aClass1_9.method4(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass30_1.method337((float) local201 / 65536.0F, 0);
					local216 = this.aClass30_1.method337((float) local201 / 65536.0F, 1);
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

	@OriginalMember(owner = "client!SMALAPQM", name = "a", descriptor = "(BIII)I")
	private int method377(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 1) {
				return (arg1 & 0x7FFF) < 16384 ? arg0 : -arg0;
			} else if (arg2 == 2) {
				return anIntArray165[arg1 & 0x7FFF] * arg0 >> 14;
			} else if (arg2 == 3) {
				return ((arg1 & 0x7FFF) * arg0 >> 14) - arg0;
			} else if (arg2 == 4) {
				return anIntArray164[arg1 / 2607 & 0x7FFF] * arg0;
			} else {
				return 0;
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("16816, " + -41 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SMALAPQM", name = "a", descriptor = "(ZLclient!NHEPCMLW;)V")
	public void method378(@OriginalArg(1) Class3_Sub1_Sub3 arg0) {
		try {
			this.aClass1_1 = new Class1();
			this.aClass1_1.method1(arg0);
			this.aClass1_2 = new Class1();
			this.aClass1_2.method1(arg0);
			@Pc(30) int local30 = arg0.method274();
			if (local30 != 0) {
				arg0.anInt441--;
				this.aClass1_3 = new Class1();
				this.aClass1_3.method1(arg0);
				this.aClass1_4 = new Class1();
				this.aClass1_4.method1(arg0);
			}
			local30 = arg0.method274();
			if (local30 != 0) {
				arg0.anInt441--;
				this.aClass1_5 = new Class1();
				this.aClass1_5.method1(arg0);
				this.aClass1_6 = new Class1();
				this.aClass1_6.method1(arg0);
			}
			local30 = arg0.method274();
			if (local30 != 0) {
				arg0.anInt441--;
				this.aClass1_7 = new Class1();
				this.aClass1_7.method1(arg0);
				this.aClass1_8 = new Class1();
				this.aClass1_8.method1(arg0);
			}
			for (@Pc(122) int local122 = 0; local122 < 10; local122++) {
				@Pc(133) int local133 = arg0.method288();
				if (local133 == 0) {
					break;
				}
				this.anIntArray160[local122] = local133;
				this.anIntArray161[local122] = arg0.method287();
				this.anIntArray162[local122] = arg0.method288();
			}
			this.anInt566 = arg0.method288();
			this.anInt567 = arg0.method288();
			this.anInt568 = arg0.method276();
			this.anInt569 = arg0.method276();
			this.aClass30_1 = new Class30();
			this.aClass1_9 = new Class1();
			this.aClass30_1.method338(arg0, this.aClass1_9);
		} catch (@Pc(191) RuntimeException local191) {
			signlink.reporterror("74802, " + false + ", " + arg0 + ", " + local191.toString());
			throw new RuntimeException();
		}
	}
}
