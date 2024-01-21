import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GCVPDIUI")
public final class Class10 {

	@OriginalMember(owner = "client!GCVPDIUI", name = "r", descriptor = "[I")
	private static int[] anIntArray67;

	@OriginalMember(owner = "client!GCVPDIUI", name = "s", descriptor = "[I")
	private static int[] anIntArray68;

	@OriginalMember(owner = "client!GCVPDIUI", name = "t", descriptor = "[I")
	private static int[] anIntArray69;

	@OriginalMember(owner = "client!GCVPDIUI", name = "u", descriptor = "[I")
	private static int[] anIntArray70 = new int[5];

	@OriginalMember(owner = "client!GCVPDIUI", name = "v", descriptor = "[I")
	private static int[] anIntArray71 = new int[5];

	@OriginalMember(owner = "client!GCVPDIUI", name = "w", descriptor = "[I")
	private static int[] anIntArray72 = new int[5];

	@OriginalMember(owner = "client!GCVPDIUI", name = "x", descriptor = "[I")
	private static int[] anIntArray73 = new int[5];

	@OriginalMember(owner = "client!GCVPDIUI", name = "y", descriptor = "[I")
	private static int[] anIntArray74 = new int[5];

	@OriginalMember(owner = "client!GCVPDIUI", name = "a", descriptor = "Lclient!JOBKQXED;")
	private Class21 aClass21_1;

	@OriginalMember(owner = "client!GCVPDIUI", name = "b", descriptor = "Lclient!JOBKQXED;")
	private Class21 aClass21_2;

	@OriginalMember(owner = "client!GCVPDIUI", name = "c", descriptor = "Lclient!JOBKQXED;")
	private Class21 aClass21_3;

	@OriginalMember(owner = "client!GCVPDIUI", name = "d", descriptor = "Lclient!JOBKQXED;")
	private Class21 aClass21_4;

	@OriginalMember(owner = "client!GCVPDIUI", name = "e", descriptor = "Lclient!JOBKQXED;")
	private Class21 aClass21_5;

	@OriginalMember(owner = "client!GCVPDIUI", name = "f", descriptor = "Lclient!JOBKQXED;")
	private Class21 aClass21_6;

	@OriginalMember(owner = "client!GCVPDIUI", name = "g", descriptor = "Lclient!JOBKQXED;")
	private Class21 aClass21_7;

	@OriginalMember(owner = "client!GCVPDIUI", name = "h", descriptor = "Lclient!JOBKQXED;")
	private Class21 aClass21_8;

	@OriginalMember(owner = "client!GCVPDIUI", name = "l", descriptor = "I")
	private int anInt150;

	@OriginalMember(owner = "client!GCVPDIUI", name = "n", descriptor = "Lclient!GKDFAZFL;")
	private Class13 aClass13_1;

	@OriginalMember(owner = "client!GCVPDIUI", name = "o", descriptor = "Lclient!JOBKQXED;")
	private Class21 aClass21_9;

	@OriginalMember(owner = "client!GCVPDIUI", name = "q", descriptor = "I")
	public int anInt153;

	@OriginalMember(owner = "client!GCVPDIUI", name = "i", descriptor = "[I")
	private int[] anIntArray64 = new int[5];

	@OriginalMember(owner = "client!GCVPDIUI", name = "j", descriptor = "[I")
	private int[] anIntArray65 = new int[5];

	@OriginalMember(owner = "client!GCVPDIUI", name = "k", descriptor = "[I")
	private int[] anIntArray66 = new int[5];

	@OriginalMember(owner = "client!GCVPDIUI", name = "m", descriptor = "I")
	private int anInt151 = 100;

	@OriginalMember(owner = "client!GCVPDIUI", name = "p", descriptor = "I")
	public int anInt152 = 500;

	@OriginalMember(owner = "client!GCVPDIUI", name = "a", descriptor = "()V")
	public static void method169() {
		anIntArray68 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray68[local6] = 1;
			} else {
				anIntArray68[local6] = -1;
			}
		}
		anIntArray69 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray69[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray67 = new int[220500];
	}

	@OriginalMember(owner = "client!GCVPDIUI", name = "a", descriptor = "(II)[I")
	public int[] method170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray67[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray67;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass21_1.method241((byte) 3);
		this.aClass21_2.method241((byte) 3);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass21_3 != null) {
			this.aClass21_3.method241((byte) 3);
			this.aClass21_4.method241((byte) 3);
			local36 = (int) ((double) (this.aClass21_3.anInt340 - this.aClass21_3.anInt339) * 32.768D / local26);
			local38 = (int) ((double) this.aClass21_3.anInt339 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass21_5 != null) {
			this.aClass21_5.method241((byte) 3);
			this.aClass21_6.method241((byte) 3);
			local77 = (int) ((double) (this.aClass21_5.anInt340 - this.aClass21_5.anInt339) * 32.768D / local26);
			local79 = (int) ((double) this.aClass21_5.anInt339 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray64[local118] != 0) {
				anIntArray70[local118] = 0;
				anIntArray71[local118] = (int) ((double) this.anIntArray66[local118] * local26);
				anIntArray72[local118] = (this.anIntArray64[local118] << 14) / 100;
				anIntArray73[local118] = (int) ((double) (this.aClass21_1.anInt340 - this.aClass21_1.anInt339) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray65[local118]) / local26);
				anIntArray74[local118] = (int) ((double) this.aClass21_1.anInt339 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass21_1.method242(arg0);
			local207 = this.aClass21_2.method242(arg0);
			if (this.aClass21_3 != null) {
				local216 = this.aClass21_3.method242(arg0);
				local222 = this.aClass21_4.method242(arg0);
				local201 += this.method171(local222, this.aClass21_3.anInt341, local40) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass21_5 != null) {
				local216 = this.aClass21_5.method242(arg0);
				local222 = this.aClass21_6.method242(arg0);
				local207 = local207 * ((this.method171(local222, this.aClass21_5.anInt341, local81) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray64[local216] != 0) {
					local222 = local193 + anIntArray71[local216];
					if (local222 < arg0) {
						anIntArray67[local222] += this.method171(local207 * anIntArray72[local216] >> 15, this.aClass21_1.anInt341, anIntArray70[local216]);
						anIntArray70[local216] += (local201 * anIntArray73[local216] >> 16) + anIntArray74[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass21_7 != null) {
			this.aClass21_7.method241((byte) 3);
			this.aClass21_8.method241((byte) 3);
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass21_7.method242(arg0);
				local385 = this.aClass21_8.method242(arg0);
				if (local369) {
					local207 = this.aClass21_7.anInt339 + ((this.aClass21_7.anInt340 - this.aClass21_7.anInt339) * local379 >> 8);
				} else {
					local207 = this.aClass21_7.anInt339 + ((this.aClass21_7.anInt340 - this.aClass21_7.anInt339) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray67[local222] = 0;
				}
			}
		}
		if (this.anInt150 > 0 && this.anInt151 > 0) {
			local201 = (int) ((double) this.anInt150 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray67[local207] += anIntArray67[local207 - local201] * this.anInt151 / 100;
			}
		}
		if (this.aClass13_1.anIntArray93[0] > 0 || this.aClass13_1.anIntArray93[1] > 0) {
			this.aClass21_9.method241((byte) 3);
			local201 = this.aClass21_9.method242(arg0 + 1);
			local207 = this.aClass13_1.method176((float) local201 / 65536.0F, 0, 367);
			local216 = this.aClass13_1.method176((float) local201 / 65536.0F, 1, 367);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray67[local222 + local207] * (long) Class13.anInt163 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray67[local222 + local207 - local559 - 1] * (long) Class13.anIntArrayArray10[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray67[local222 - local590 - 1] * (long) Class13.anIntArrayArray10[1][local590] >> 16);
					}
					anIntArray67[local222] = local385;
					local201 = this.aClass21_9.method242(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray67[local222 + local207] * (long) Class13.anInt163 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray67[local222 + local207 - local590 - 1] * (long) Class13.anIntArrayArray10[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray67[local222 - local694 - 1] * (long) Class13.anIntArrayArray10[1][local694] >> 16);
						}
						anIntArray67[local222] = local559;
						local201 = this.aClass21_9.method242(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray67[local222 + local207 - local590 - 1] * (long) Class13.anIntArrayArray10[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray67[local222 - local694 - 1] * (long) Class13.anIntArrayArray10[1][local694] >> 16);
							}
							anIntArray67[local222] = local559;
							this.aClass21_9.method242(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass13_1.method176((float) local201 / 65536.0F, 0, 367);
					local216 = this.aClass13_1.method176((float) local201 / 65536.0F, 1, 367);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray67[local201] < -32768) {
				anIntArray67[local201] = -32768;
			}
			if (anIntArray67[local201] > 32767) {
				anIntArray67[local201] = 32767;
			}
		}
		return anIntArray67;
	}

	@OriginalMember(owner = "client!GCVPDIUI", name = "a", descriptor = "(IZII)I")
	private int method171(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 == 1) {
				return (arg2 & 0x7FFF) < 16384 ? arg0 : -arg0;
			} else if (arg1 == 2) {
				return anIntArray69[arg2 & 0x7FFF] * arg0 >> 14;
			} else if (arg1 == 3) {
				return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
			} else if (arg1 == 4) {
				return anIntArray68[arg2 / 2607 & 0x7FFF] * arg0;
			} else {
				return 0;
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("90023, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GCVPDIUI", name = "a", descriptor = "(Lclient!CMGGUSPR;I)V")
	public void method172(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			this.aClass21_1 = new Class21();
			this.aClass21_1.method239(arg0);
			this.aClass21_2 = new Class21();
			this.aClass21_2.method239(arg0);
			@Pc(24) int local24 = arg0.method55();
			if (local24 != 0) {
				arg0.anInt78--;
				this.aClass21_3 = new Class21();
				this.aClass21_3.method239(arg0);
				this.aClass21_4 = new Class21();
				this.aClass21_4.method239(arg0);
			}
			local24 = arg0.method55();
			if (local24 != 0) {
				arg0.anInt78--;
				this.aClass21_5 = new Class21();
				this.aClass21_5.method239(arg0);
				this.aClass21_6 = new Class21();
				this.aClass21_6.method239(arg0);
			}
			local24 = arg0.method55();
			if (local24 != 0) {
				arg0.anInt78--;
				this.aClass21_7 = new Class21();
				this.aClass21_7.method239(arg0);
				this.aClass21_8 = new Class21();
				this.aClass21_8.method239(arg0);
			}
			for (@Pc(116) int local116 = 0; local116 < 10; local116++) {
				@Pc(127) int local127 = arg0.method69();
				if (local127 == 0) {
					break;
				}
				this.anIntArray64[local116] = local127;
				this.anIntArray65[local116] = arg0.method68();
				this.anIntArray66[local116] = arg0.method69();
			}
			this.anInt150 = arg0.method69();
			this.anInt151 = arg0.method69();
			this.anInt152 = arg0.method57();
			this.anInt153 = arg0.method57();
			this.aClass13_1 = new Class13();
			this.aClass21_9 = new Class21();
			this.aClass13_1.method177(arg0, this.aClass21_9);
		} catch (@Pc(193) RuntimeException local193) {
			signlink.reporterror("6388, " + arg0 + ", " + -593 + ", " + local193.toString());
			throw new RuntimeException();
		}
	}
}
