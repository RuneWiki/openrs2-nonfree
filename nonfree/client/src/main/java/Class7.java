import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!dc")
public final class Class7 {

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "[I")
	private static int[] anIntArray106;

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "[I")
	private static int[] anIntArray107;

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "[I")
	private static int[] anIntArray108;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
	private static int anInt478 = -917;

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "[I")
	private static int[] anIntArray109 = new int[5];

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "[I")
	private static int[] anIntArray110 = new int[5];

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "[I")
	private static int[] anIntArray111 = new int[5];

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "[I")
	private static int[] anIntArray112 = new int[5];

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "[I")
	private static int[] anIntArray113 = new int[5];

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "Lclient!ac;")
	private Class2 aClass2_1;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Lclient!ac;")
	private Class2 aClass2_2;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "Lclient!ac;")
	private Class2 aClass2_3;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Lclient!ac;")
	private Class2 aClass2_4;

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "Lclient!ac;")
	private Class2 aClass2_5;

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "Lclient!ac;")
	private Class2 aClass2_6;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Lclient!ac;")
	private Class2 aClass2_7;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "Lclient!ac;")
	private Class2 aClass2_8;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
	private int anInt479;

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "Lclient!bc;")
	private Class3 aClass3_1;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "Lclient!ac;")
	private Class2 aClass2_9;

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
	public int anInt482;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "[I")
	private int[] anIntArray103 = new int[5];

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "[I")
	private int[] anIntArray104 = new int[5];

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "[I")
	private int[] anIntArray105 = new int[5];

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
	private int anInt480 = 100;

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
	public int anInt481 = 500;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "()V")
	public static void method243() {
		anIntArray107 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray107[local6] = 1;
			} else {
				anIntArray107[local6] = -1;
			}
		}
		anIntArray108 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray108[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray106 = new int[220500];
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)[I")
	public int[] method244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray106[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray106;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass2_1.method44(anInt478);
		this.aClass2_2.method44(anInt478);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass2_3 != null) {
			this.aClass2_3.method44(anInt478);
			this.aClass2_4.method44(anInt478);
			local36 = (int) ((double) (this.aClass2_3.anInt155 - this.aClass2_3.anInt154) * 32.768D / local26);
			local38 = (int) ((double) this.aClass2_3.anInt154 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass2_5 != null) {
			this.aClass2_5.method44(anInt478);
			this.aClass2_6.method44(anInt478);
			local77 = (int) ((double) (this.aClass2_5.anInt155 - this.aClass2_5.anInt154) * 32.768D / local26);
			local79 = (int) ((double) this.aClass2_5.anInt154 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray103[local118] != 0) {
				anIntArray109[local118] = 0;
				anIntArray110[local118] = (int) ((double) this.anIntArray105[local118] * local26);
				anIntArray111[local118] = (this.anIntArray103[local118] << 14) / 100;
				anIntArray112[local118] = (int) ((double) (this.aClass2_1.anInt155 - this.aClass2_1.anInt154) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray104[local118]) / local26);
				anIntArray113[local118] = (int) ((double) this.aClass2_1.anInt154 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass2_1.method45(arg0);
			local207 = this.aClass2_2.method45(arg0);
			if (this.aClass2_3 != null) {
				local216 = this.aClass2_3.method45(arg0);
				local222 = this.aClass2_4.method45(arg0);
				local201 += this.method245(local222, local40, this.aClass2_3.anInt156, (byte) 7) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass2_5 != null) {
				local216 = this.aClass2_5.method45(arg0);
				local222 = this.aClass2_6.method45(arg0);
				local207 = local207 * ((this.method245(local222, local81, this.aClass2_5.anInt156, (byte) 7) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray103[local216] != 0) {
					local222 = local193 + anIntArray110[local216];
					if (local222 < arg0) {
						anIntArray106[local222] += this.method245(local207 * anIntArray111[local216] >> 15, anIntArray109[local216], this.aClass2_1.anInt156, (byte) 7);
						anIntArray109[local216] += (local201 * anIntArray112[local216] >> 16) + anIntArray113[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass2_7 != null) {
			this.aClass2_7.method44(anInt478);
			this.aClass2_8.method44(anInt478);
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass2_7.method45(arg0);
				local385 = this.aClass2_8.method45(arg0);
				if (local369) {
					local207 = this.aClass2_7.anInt154 + ((this.aClass2_7.anInt155 - this.aClass2_7.anInt154) * local379 >> 8);
				} else {
					local207 = this.aClass2_7.anInt154 + ((this.aClass2_7.anInt155 - this.aClass2_7.anInt154) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray106[local222] = 0;
				}
			}
		}
		if (this.anInt479 > 0 && this.anInt480 > 0) {
			local201 = (int) ((double) this.anInt479 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray106[local207] += anIntArray106[local207 - local201] * this.anInt480 / 100;
			}
		}
		if (this.aClass3_1.anIntArray18[0] > 0 || this.aClass3_1.anIntArray18[1] > 0) {
			this.aClass2_9.method44(anInt478);
			local201 = this.aClass2_9.method45(arg0 + 1);
			local207 = this.aClass3_1.method54((float) local201 / 65536.0F, 0);
			local216 = this.aClass3_1.method54((float) local201 / 65536.0F, 1);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray106[local222 + local207] * (long) Class3.anInt179 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray106[local222 + local207 - local559 - 1] * (long) Class3.anIntArrayArray1[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray106[local222 - local590 - 1] * (long) Class3.anIntArrayArray1[1][local590] >> 16);
					}
					anIntArray106[local222] = local385;
					local201 = this.aClass2_9.method45(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray106[local222 + local207] * (long) Class3.anInt179 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray106[local222 + local207 - local590 - 1] * (long) Class3.anIntArrayArray1[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray106[local222 - local694 - 1] * (long) Class3.anIntArrayArray1[1][local694] >> 16);
						}
						anIntArray106[local222] = local559;
						local201 = this.aClass2_9.method45(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray106[local222 + local207 - local590 - 1] * (long) Class3.anIntArrayArray1[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray106[local222 - local694 - 1] * (long) Class3.anIntArrayArray1[1][local694] >> 16);
							}
							anIntArray106[local222] = local559;
							this.aClass2_9.method45(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass3_1.method54((float) local201 / 65536.0F, 0);
					local216 = this.aClass3_1.method54((float) local201 / 65536.0F, 1);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray106[local201] < -32768) {
				anIntArray106[local201] = -32768;
			}
			if (anIntArray106[local201] > 32767) {
				anIntArray106[local201] = 32767;
			}
		}
		return anIntArray106;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIB)I")
	private int method245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(4) boolean local4 = false;
			if (arg2 == 1) {
				return (arg1 & 0x7FFF) < 16384 ? arg0 : -arg0;
			} else if (arg2 == 2) {
				return anIntArray108[arg1 & 0x7FFF] * arg0 >> 14;
			} else if (arg2 == 3) {
				return ((arg1 & 0x7FFF) * arg0 >> 14) - arg0;
			} else if (arg2 == 4) {
				return anIntArray107[arg1 / 2607 & 0x7FFF] * arg0;
			} else {
				return 0;
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("29879, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!lb;Z)V")
	public void method246(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			this.aClass2_1 = new Class2();
			this.aClass2_1.method42(arg0);
			this.aClass2_2 = new Class2();
			this.aClass2_2.method42(arg0);
			@Pc(30) int local30 = arg0.method480();
			if (local30 != 0) {
				arg0.anInt763--;
				this.aClass2_3 = new Class2();
				this.aClass2_3.method42(arg0);
				this.aClass2_4 = new Class2();
				this.aClass2_4.method42(arg0);
			}
			local30 = arg0.method480();
			if (local30 != 0) {
				arg0.anInt763--;
				this.aClass2_5 = new Class2();
				this.aClass2_5.method42(arg0);
				this.aClass2_6 = new Class2();
				this.aClass2_6.method42(arg0);
			}
			local30 = arg0.method480();
			if (local30 != 0) {
				arg0.anInt763--;
				this.aClass2_7 = new Class2();
				this.aClass2_7.method42(arg0);
				this.aClass2_8 = new Class2();
				this.aClass2_8.method42(arg0);
			}
			for (@Pc(122) int local122 = 0; local122 < 10; local122++) {
				@Pc(133) int local133 = arg0.method494();
				if (local133 == 0) {
					break;
				}
				this.anIntArray103[local122] = local133;
				this.anIntArray104[local122] = arg0.method493();
				this.anIntArray105[local122] = arg0.method494();
			}
			this.anInt479 = arg0.method494();
			this.anInt480 = arg0.method494();
			this.anInt481 = arg0.method482();
			this.anInt482 = arg0.method482();
			this.aClass3_1 = new Class3();
			this.aClass2_9 = new Class2();
			this.aClass3_1.method55(arg0, this.aClass2_9);
		} catch (@Pc(191) RuntimeException local191) {
			signlink.reporterror("45627, " + arg0 + ", " + false + ", " + local191.toString());
			throw new RuntimeException();
		}
	}
}
