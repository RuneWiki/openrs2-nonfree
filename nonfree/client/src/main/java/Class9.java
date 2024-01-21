import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ec")
public final class Class9 {

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "[I")
	private static int[] anIntArray146;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "[I")
	private static int[] anIntArray147;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "[I")
	private static int[] anIntArray148;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "[I")
	private static int[] anIntArray149 = new int[5];

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "[I")
	private static int[] anIntArray150 = new int[5];

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "[I")
	private static int[] anIntArray151 = new int[5];

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "[I")
	private static int[] anIntArray152 = new int[5];

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "[I")
	private static int[] anIntArray153 = new int[5];

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "Lclient!bc;")
	private Class3 aClass3_1;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Lclient!bc;")
	private Class3 aClass3_2;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "Lclient!bc;")
	private Class3 aClass3_3;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "Lclient!bc;")
	private Class3 aClass3_4;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "Lclient!bc;")
	private Class3 aClass3_5;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "Lclient!bc;")
	private Class3 aClass3_6;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "Lclient!bc;")
	private Class3 aClass3_7;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "Lclient!bc;")
	private Class3 aClass3_8;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
	private int anInt501;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "Lclient!cc;")
	private Class5 aClass5_1;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "Lclient!bc;")
	private Class3 aClass3_9;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
	public int anInt504;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	private int anInt500 = -939;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Z")
	private boolean aBoolean111 = false;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "[I")
	private int[] anIntArray143 = new int[5];

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "[I")
	private int[] anIntArray144 = new int[5];

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "[I")
	private int[] anIntArray145 = new int[5];

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
	private int anInt502 = 100;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
	public int anInt503 = 500;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "()V")
	public static void method281() {
		anIntArray147 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray147[local6] = 1;
			} else {
				anIntArray147[local6] = -1;
			}
		}
		anIntArray148 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray148[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray146 = new int[220500];
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)[I")
	public int[] method282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray146[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray146;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass3_1.method50(359);
		this.aClass3_2.method50(359);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass3_3 != null) {
			this.aClass3_3.method50(359);
			this.aClass3_4.method50(359);
			local36 = (int) ((double) (this.aClass3_3.anInt156 - this.aClass3_3.anInt155) * 32.768D / local26);
			local38 = (int) ((double) this.aClass3_3.anInt155 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass3_5 != null) {
			this.aClass3_5.method50(359);
			this.aClass3_6.method50(359);
			local77 = (int) ((double) (this.aClass3_5.anInt156 - this.aClass3_5.anInt155) * 32.768D / local26);
			local79 = (int) ((double) this.aClass3_5.anInt155 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray143[local118] != 0) {
				anIntArray149[local118] = 0;
				anIntArray150[local118] = (int) ((double) this.anIntArray145[local118] * local26);
				anIntArray151[local118] = (this.anIntArray143[local118] << 14) / 100;
				anIntArray152[local118] = (int) ((double) (this.aClass3_1.anInt156 - this.aClass3_1.anInt155) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray144[local118]) / local26);
				anIntArray153[local118] = (int) ((double) this.aClass3_1.anInt155 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass3_1.method51(arg0);
			local207 = this.aClass3_2.method51(arg0);
			if (this.aClass3_3 != null) {
				local216 = this.aClass3_3.method51(arg0);
				local222 = this.aClass3_4.method51(arg0);
				local201 += this.method283(local40, local222, this.aClass3_3.anInt157) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass3_5 != null) {
				local216 = this.aClass3_5.method51(arg0);
				local222 = this.aClass3_6.method51(arg0);
				local207 = local207 * ((this.method283(local81, local222, this.aClass3_5.anInt157) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray143[local216] != 0) {
					local222 = local193 + anIntArray150[local216];
					if (local222 < arg0) {
						anIntArray146[local222] += this.method283(anIntArray149[local216], local207 * anIntArray151[local216] >> 15, this.aClass3_1.anInt157);
						anIntArray149[local216] += (local201 * anIntArray152[local216] >> 16) + anIntArray153[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass3_7 != null) {
			this.aClass3_7.method50(359);
			this.aClass3_8.method50(359);
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass3_7.method51(arg0);
				local385 = this.aClass3_8.method51(arg0);
				if (local369) {
					local207 = this.aClass3_7.anInt155 + ((this.aClass3_7.anInt156 - this.aClass3_7.anInt155) * local379 >> 8);
				} else {
					local207 = this.aClass3_7.anInt155 + ((this.aClass3_7.anInt156 - this.aClass3_7.anInt155) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray146[local222] = 0;
				}
			}
		}
		if (this.anInt501 > 0 && this.anInt502 > 0) {
			local201 = (int) ((double) this.anInt501 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray146[local207] += anIntArray146[local207 - local201] * this.anInt502 / 100;
			}
		}
		if (this.aClass5_1.anIntArray26[0] > 0 || this.aClass5_1.anIntArray26[1] > 0) {
			this.aClass3_9.method50(359);
			local201 = this.aClass3_9.method51(arg0 + 1);
			local207 = this.aClass5_1.method77((float) local201 / 65536.0F, 0);
			local216 = this.aClass5_1.method77((float) local201 / 65536.0F, 1);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray146[local222 + local207] * (long) Class5.anInt182 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray146[local222 + local207 - local559 - 1] * (long) Class5.anIntArrayArray2[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray146[local222 - local590 - 1] * (long) Class5.anIntArrayArray2[1][local590] >> 16);
					}
					anIntArray146[local222] = local385;
					local201 = this.aClass3_9.method51(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray146[local222 + local207] * (long) Class5.anInt182 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray146[local222 + local207 - local590 - 1] * (long) Class5.anIntArrayArray2[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray146[local222 - local694 - 1] * (long) Class5.anIntArrayArray2[1][local694] >> 16);
						}
						anIntArray146[local222] = local559;
						local201 = this.aClass3_9.method51(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray146[local222 + local207 - local590 - 1] * (long) Class5.anIntArrayArray2[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray146[local222 - local694 - 1] * (long) Class5.anIntArrayArray2[1][local694] >> 16);
							}
							anIntArray146[local222] = local559;
							this.aClass3_9.method51(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass5_1.method77((float) local201 / 65536.0F, 0);
					local216 = this.aClass5_1.method77((float) local201 / 65536.0F, 1);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray146[local201] < -32768) {
				anIntArray146[local201] = -32768;
			}
			if (anIntArray146[local201] > 32767) {
				anIntArray146[local201] = 32767;
			}
		}
		return anIntArray146;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZII)I")
	private int method283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 1) {
				return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
			} else if (arg2 == 2) {
				return anIntArray148[arg0 & 0x7FFF] * arg1 >> 14;
			} else if (arg2 == 3) {
				return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
			} else if (arg2 == 4) {
				return anIntArray147[arg0 / 2607 & 0x7FFF] * arg1;
			} else {
				return 0;
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("92149, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLclient!mb;)V")
	public void method284(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			this.aClass3_1 = new Class3();
			this.aClass3_1.method48(arg0);
			this.aClass3_2 = new Class3();
			this.aClass3_2.method48(arg0);
			@Pc(24) int local24 = arg0.method503();
			if (local24 != 0) {
				arg0.anInt766--;
				this.aClass3_3 = new Class3();
				this.aClass3_3.method48(arg0);
				this.aClass3_4 = new Class3();
				this.aClass3_4.method48(arg0);
			}
			local24 = arg0.method503();
			if (local24 != 0) {
				arg0.anInt766--;
				this.aClass3_5 = new Class3();
				this.aClass3_5.method48(arg0);
				this.aClass3_6 = new Class3();
				this.aClass3_6.method48(arg0);
			}
			local24 = arg0.method503();
			if (local24 != 0) {
				arg0.anInt766--;
				this.aClass3_7 = new Class3();
				this.aClass3_7.method48(arg0);
				this.aClass3_8 = new Class3();
				this.aClass3_8.method48(arg0);
			}
			for (@Pc(132) int local132 = 0; local132 < 10; local132++) {
				@Pc(137) int local137 = arg0.method517();
				if (local137 == 0) {
					break;
				}
				this.anIntArray143[local132] = local137;
				this.anIntArray144[local132] = arg0.method516();
				this.anIntArray145[local132] = arg0.method517();
			}
			this.anInt501 = arg0.method517();
			this.anInt502 = arg0.method517();
			this.anInt503 = arg0.method505();
			this.anInt504 = arg0.method505();
			this.aClass5_1 = new Class5();
			this.aClass3_9 = new Class3();
			this.aClass5_1.method78(arg0, this.aClass3_9, this.aBoolean111);
		} catch (@Pc(196) RuntimeException local196) {
			signlink.reporterror("35629, " + 44 + ", " + arg0 + ", " + local196.toString());
			throw new RuntimeException();
		}
	}
}
