import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YXUDALYQ")
public final class Class49 {

	@OriginalMember(owner = "client!YXUDALYQ", name = "a", descriptor = "I")
	private static int anInt767;

	@OriginalMember(owner = "client!YXUDALYQ", name = "s", descriptor = "[I")
	private static int[] anIntArray193;

	@OriginalMember(owner = "client!YXUDALYQ", name = "t", descriptor = "[I")
	private static int[] anIntArray194;

	@OriginalMember(owner = "client!YXUDALYQ", name = "u", descriptor = "[I")
	private static int[] anIntArray195;

	@OriginalMember(owner = "client!YXUDALYQ", name = "v", descriptor = "[I")
	private static int[] anIntArray196 = new int[5];

	@OriginalMember(owner = "client!YXUDALYQ", name = "w", descriptor = "[I")
	private static int[] anIntArray197 = new int[5];

	@OriginalMember(owner = "client!YXUDALYQ", name = "x", descriptor = "[I")
	private static int[] anIntArray198 = new int[5];

	@OriginalMember(owner = "client!YXUDALYQ", name = "y", descriptor = "[I")
	private static int[] anIntArray199 = new int[5];

	@OriginalMember(owner = "client!YXUDALYQ", name = "z", descriptor = "[I")
	private static int[] anIntArray200 = new int[5];

	@OriginalMember(owner = "client!YXUDALYQ", name = "b", descriptor = "Lclient!JZEFIVMF;")
	private Class17 aClass17_1;

	@OriginalMember(owner = "client!YXUDALYQ", name = "c", descriptor = "Lclient!JZEFIVMF;")
	private Class17 aClass17_2;

	@OriginalMember(owner = "client!YXUDALYQ", name = "d", descriptor = "Lclient!JZEFIVMF;")
	private Class17 aClass17_3;

	@OriginalMember(owner = "client!YXUDALYQ", name = "e", descriptor = "Lclient!JZEFIVMF;")
	private Class17 aClass17_4;

	@OriginalMember(owner = "client!YXUDALYQ", name = "f", descriptor = "Lclient!JZEFIVMF;")
	private Class17 aClass17_5;

	@OriginalMember(owner = "client!YXUDALYQ", name = "g", descriptor = "Lclient!JZEFIVMF;")
	private Class17 aClass17_6;

	@OriginalMember(owner = "client!YXUDALYQ", name = "h", descriptor = "Lclient!JZEFIVMF;")
	private Class17 aClass17_7;

	@OriginalMember(owner = "client!YXUDALYQ", name = "i", descriptor = "Lclient!JZEFIVMF;")
	private Class17 aClass17_8;

	@OriginalMember(owner = "client!YXUDALYQ", name = "m", descriptor = "I")
	private int anInt768;

	@OriginalMember(owner = "client!YXUDALYQ", name = "o", descriptor = "Lclient!XALWVYUP;")
	private Class44 aClass44_1;

	@OriginalMember(owner = "client!YXUDALYQ", name = "p", descriptor = "Lclient!JZEFIVMF;")
	private Class17 aClass17_9;

	@OriginalMember(owner = "client!YXUDALYQ", name = "r", descriptor = "I")
	public int anInt771;

	@OriginalMember(owner = "client!YXUDALYQ", name = "j", descriptor = "[I")
	private int[] anIntArray190 = new int[5];

	@OriginalMember(owner = "client!YXUDALYQ", name = "k", descriptor = "[I")
	private int[] anIntArray191 = new int[5];

	@OriginalMember(owner = "client!YXUDALYQ", name = "l", descriptor = "[I")
	private int[] anIntArray192 = new int[5];

	@OriginalMember(owner = "client!YXUDALYQ", name = "n", descriptor = "I")
	private int anInt769 = 100;

	@OriginalMember(owner = "client!YXUDALYQ", name = "q", descriptor = "I")
	public int anInt770 = 500;

	@OriginalMember(owner = "client!YXUDALYQ", name = "a", descriptor = "()V")
	public static void method525() {
		anIntArray194 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray194[local6] = 1;
			} else {
				anIntArray194[local6] = -1;
			}
		}
		anIntArray195 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray195[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray193 = new int[220500];
	}

	@OriginalMember(owner = "client!YXUDALYQ", name = "a", descriptor = "(II)[I")
	public int[] method526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray193[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray193;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass17_1.method218();
		this.aClass17_2.method218();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass17_3 != null) {
			this.aClass17_3.method218();
			this.aClass17_4.method218();
			local36 = (int) ((double) (this.aClass17_3.anInt192 - this.aClass17_3.anInt191) * 32.768D / local26);
			local38 = (int) ((double) this.aClass17_3.anInt191 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass17_5 != null) {
			this.aClass17_5.method218();
			this.aClass17_6.method218();
			local77 = (int) ((double) (this.aClass17_5.anInt192 - this.aClass17_5.anInt191) * 32.768D / local26);
			local79 = (int) ((double) this.aClass17_5.anInt191 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray190[local118] != 0) {
				anIntArray196[local118] = 0;
				anIntArray197[local118] = (int) ((double) this.anIntArray192[local118] * local26);
				anIntArray198[local118] = (this.anIntArray190[local118] << 14) / 100;
				anIntArray199[local118] = (int) ((double) (this.aClass17_1.anInt192 - this.aClass17_1.anInt191) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray191[local118]) / local26);
				anIntArray200[local118] = (int) ((double) this.aClass17_1.anInt191 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass17_1.method219(arg0, anInt767);
			local207 = this.aClass17_2.method219(arg0, anInt767);
			if (this.aClass17_3 != null) {
				local216 = this.aClass17_3.method219(arg0, anInt767);
				local222 = this.aClass17_4.method219(arg0, anInt767);
				local201 += this.method527(local222, this.aClass17_3.anInt193, local40) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass17_5 != null) {
				local216 = this.aClass17_5.method219(arg0, anInt767);
				local222 = this.aClass17_6.method219(arg0, anInt767);
				local207 = local207 * ((this.method527(local222, this.aClass17_5.anInt193, local81) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray190[local216] != 0) {
					local222 = local193 + anIntArray197[local216];
					if (local222 < arg0) {
						anIntArray193[local222] += this.method527(local207 * anIntArray198[local216] >> 15, this.aClass17_1.anInt193, anIntArray196[local216]);
						anIntArray196[local216] += (local201 * anIntArray199[local216] >> 16) + anIntArray200[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass17_7 != null) {
			this.aClass17_7.method218();
			this.aClass17_8.method218();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass17_7.method219(arg0, anInt767);
				local385 = this.aClass17_8.method219(arg0, anInt767);
				if (local369) {
					local207 = this.aClass17_7.anInt191 + ((this.aClass17_7.anInt192 - this.aClass17_7.anInt191) * local379 >> 8);
				} else {
					local207 = this.aClass17_7.anInt191 + ((this.aClass17_7.anInt192 - this.aClass17_7.anInt191) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray193[local222] = 0;
				}
			}
		}
		if (this.anInt768 > 0 && this.anInt769 > 0) {
			local201 = (int) ((double) this.anInt768 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray193[local207] += anIntArray193[local207 - local201] * this.anInt769 / 100;
			}
		}
		if (this.aClass44_1.anIntArray151[0] > 0 || this.aClass44_1.anIntArray151[1] > 0) {
			this.aClass17_9.method218();
			local201 = this.aClass17_9.method219(arg0 + 1, anInt767);
			local207 = this.aClass44_1.method428(0, (float) local201 / 65536.0F);
			local216 = this.aClass44_1.method428(1, (float) local201 / 65536.0F);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray193[local222 + local207] * (long) Class44.anInt640 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray193[local222 + local207 - local559 - 1] * (long) Class44.anIntArrayArray14[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray193[local222 - local590 - 1] * (long) Class44.anIntArrayArray14[1][local590] >> 16);
					}
					anIntArray193[local222] = local385;
					local201 = this.aClass17_9.method219(arg0 + 1, anInt767);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray193[local222 + local207] * (long) Class44.anInt640 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray193[local222 + local207 - local590 - 1] * (long) Class44.anIntArrayArray14[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray193[local222 - local694 - 1] * (long) Class44.anIntArrayArray14[1][local694] >> 16);
						}
						anIntArray193[local222] = local559;
						local201 = this.aClass17_9.method219(arg0 + 1, anInt767);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray193[local222 + local207 - local590 - 1] * (long) Class44.anIntArrayArray14[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray193[local222 - local694 - 1] * (long) Class44.anIntArrayArray14[1][local694] >> 16);
							}
							anIntArray193[local222] = local559;
							this.aClass17_9.method219(arg0 + 1, anInt767);
							local222++;
						}
						break;
					}
					local207 = this.aClass44_1.method428(0, (float) local201 / 65536.0F);
					local216 = this.aClass44_1.method428(1, (float) local201 / 65536.0F);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray193[local201] < -32768) {
				anIntArray193[local201] = -32768;
			}
			if (anIntArray193[local201] > 32767) {
				anIntArray193[local201] = 32767;
			}
		}
		return anIntArray193;
	}

	@OriginalMember(owner = "client!YXUDALYQ", name = "a", descriptor = "(BIII)I")
	private int method527(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 == 1) {
				return (arg2 & 0x7FFF) < 16384 ? arg0 : -arg0;
			} else if (arg1 == 2) {
				return anIntArray195[arg2 & 0x7FFF] * arg0 >> 14;
			} else if (arg1 == 3) {
				return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
			} else if (arg1 == 4) {
				return anIntArray194[arg2 / 2607 & 0x7FFF] * arg0;
			} else {
				return 0;
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("61960, " + 77 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YXUDALYQ", name = "a", descriptor = "(Lclient!FTMSICIZ;I)V")
	public void method528(@OriginalArg(0) Class4_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.aClass17_1 = new Class17();
			this.aClass17_1.method216(arg0, 799);
			this.aClass17_2 = new Class17();
			this.aClass17_2.method216(arg0, 799);
			@Pc(24) int local24 = arg0.method102();
			if (local24 != 0) {
				arg0.anInt101--;
				this.aClass17_3 = new Class17();
				this.aClass17_3.method216(arg0, 799);
				this.aClass17_4 = new Class17();
				this.aClass17_4.method216(arg0, 799);
			}
			local24 = arg0.method102();
			if (local24 != 0) {
				arg0.anInt101--;
				this.aClass17_5 = new Class17();
				this.aClass17_5.method216(arg0, 799);
				this.aClass17_6 = new Class17();
				this.aClass17_6.method216(arg0, 799);
			}
			local24 = arg0.method102();
			if (local24 != 0) {
				arg0.anInt101--;
				this.aClass17_7 = new Class17();
				this.aClass17_7.method216(arg0, 799);
				this.aClass17_8 = new Class17();
				this.aClass17_8.method216(arg0, 799);
			}
			for (@Pc(116) int local116 = 0; local116 < 10; local116++) {
				@Pc(127) int local127 = arg0.method116();
				if (local127 == 0) {
					break;
				}
				this.anIntArray190[local116] = local127;
				this.anIntArray191[local116] = arg0.method115();
				this.anIntArray192[local116] = arg0.method116();
			}
			this.anInt768 = arg0.method116();
			this.anInt769 = arg0.method116();
			this.anInt770 = arg0.method104();
			this.anInt771 = arg0.method104();
			@Pc(170) boolean local170 = false;
			this.aClass44_1 = new Class44();
			this.aClass17_9 = new Class17();
			this.aClass44_1.method429(this.aClass17_9, arg0);
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("33410, " + arg0 + ", " + arg1 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}
}
