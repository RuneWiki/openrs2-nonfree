import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HJHNNPSW")
public final class Class11 {

	@OriginalMember(owner = "client!HJHNNPSW", name = "u", descriptor = "[I")
	private static int[] anIntArray38;

	@OriginalMember(owner = "client!HJHNNPSW", name = "v", descriptor = "[I")
	private static int[] anIntArray39;

	@OriginalMember(owner = "client!HJHNNPSW", name = "w", descriptor = "[I")
	private static int[] anIntArray40;

	@OriginalMember(owner = "client!HJHNNPSW", name = "a", descriptor = "B")
	private static byte aByte2 = 52;

	@OriginalMember(owner = "client!HJHNNPSW", name = "b", descriptor = "I")
	private static int anInt132 = 245;

	@OriginalMember(owner = "client!HJHNNPSW", name = "x", descriptor = "[I")
	private static int[] anIntArray41 = new int[5];

	@OriginalMember(owner = "client!HJHNNPSW", name = "y", descriptor = "[I")
	private static int[] anIntArray42 = new int[5];

	@OriginalMember(owner = "client!HJHNNPSW", name = "z", descriptor = "[I")
	private static int[] anIntArray43 = new int[5];

	@OriginalMember(owner = "client!HJHNNPSW", name = "A", descriptor = "[I")
	private static int[] anIntArray44 = new int[5];

	@OriginalMember(owner = "client!HJHNNPSW", name = "B", descriptor = "[I")
	private static int[] anIntArray45 = new int[5];

	@OriginalMember(owner = "client!HJHNNPSW", name = "d", descriptor = "Lclient!XJHYQMBH;")
	private Class50 aClass50_1;

	@OriginalMember(owner = "client!HJHNNPSW", name = "e", descriptor = "Lclient!XJHYQMBH;")
	private Class50 aClass50_2;

	@OriginalMember(owner = "client!HJHNNPSW", name = "f", descriptor = "Lclient!XJHYQMBH;")
	private Class50 aClass50_3;

	@OriginalMember(owner = "client!HJHNNPSW", name = "g", descriptor = "Lclient!XJHYQMBH;")
	private Class50 aClass50_4;

	@OriginalMember(owner = "client!HJHNNPSW", name = "h", descriptor = "Lclient!XJHYQMBH;")
	private Class50 aClass50_5;

	@OriginalMember(owner = "client!HJHNNPSW", name = "i", descriptor = "Lclient!XJHYQMBH;")
	private Class50 aClass50_6;

	@OriginalMember(owner = "client!HJHNNPSW", name = "j", descriptor = "Lclient!XJHYQMBH;")
	private Class50 aClass50_7;

	@OriginalMember(owner = "client!HJHNNPSW", name = "k", descriptor = "Lclient!XJHYQMBH;")
	private Class50 aClass50_8;

	@OriginalMember(owner = "client!HJHNNPSW", name = "o", descriptor = "I")
	private int anInt133;

	@OriginalMember(owner = "client!HJHNNPSW", name = "q", descriptor = "Lclient!RHVCMDPL;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!HJHNNPSW", name = "r", descriptor = "Lclient!XJHYQMBH;")
	private Class50 aClass50_9;

	@OriginalMember(owner = "client!HJHNNPSW", name = "t", descriptor = "I")
	public int anInt136;

	@OriginalMember(owner = "client!HJHNNPSW", name = "c", descriptor = "Z")
	private boolean aBoolean30 = true;

	@OriginalMember(owner = "client!HJHNNPSW", name = "l", descriptor = "[I")
	private int[] anIntArray35 = new int[5];

	@OriginalMember(owner = "client!HJHNNPSW", name = "m", descriptor = "[I")
	private int[] anIntArray36 = new int[5];

	@OriginalMember(owner = "client!HJHNNPSW", name = "n", descriptor = "[I")
	private int[] anIntArray37 = new int[5];

	@OriginalMember(owner = "client!HJHNNPSW", name = "p", descriptor = "I")
	private int anInt134 = 100;

	@OriginalMember(owner = "client!HJHNNPSW", name = "s", descriptor = "I")
	public int anInt135 = 500;

	@OriginalMember(owner = "client!HJHNNPSW", name = "a", descriptor = "()V")
	public static void method105() {
		anIntArray39 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray39[local6] = 1;
			} else {
				anIntArray39[local6] = -1;
			}
		}
		anIntArray40 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray40[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray38 = new int[220500];
	}

	@OriginalMember(owner = "client!HJHNNPSW", name = "a", descriptor = "(II)[I")
	public int[] method106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray38[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray38;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass50_1.method548();
		this.aClass50_2.method548();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass50_3 != null) {
			this.aClass50_3.method548();
			this.aClass50_4.method548();
			local36 = (int) ((double) (this.aClass50_3.anInt763 - this.aClass50_3.anInt762) * 32.768D / local26);
			local38 = (int) ((double) this.aClass50_3.anInt762 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass50_5 != null) {
			this.aClass50_5.method548();
			this.aClass50_6.method548();
			local77 = (int) ((double) (this.aClass50_5.anInt763 - this.aClass50_5.anInt762) * 32.768D / local26);
			local79 = (int) ((double) this.aClass50_5.anInt762 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray35[local118] != 0) {
				anIntArray41[local118] = 0;
				anIntArray42[local118] = (int) ((double) this.anIntArray37[local118] * local26);
				anIntArray43[local118] = (this.anIntArray35[local118] << 14) / 100;
				anIntArray44[local118] = (int) ((double) (this.aClass50_1.anInt763 - this.aClass50_1.anInt762) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray36[local118]) / local26);
				anIntArray45[local118] = (int) ((double) this.aClass50_1.anInt762 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass50_1.method549(aByte2, arg0);
			local207 = this.aClass50_2.method549(aByte2, arg0);
			if (this.aClass50_3 != null) {
				local216 = this.aClass50_3.method549(aByte2, arg0);
				local222 = this.aClass50_4.method549(aByte2, arg0);
				local201 += this.method107(this.aClass50_3.anInt764, local40, anInt132, local222) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass50_5 != null) {
				local216 = this.aClass50_5.method549(aByte2, arg0);
				local222 = this.aClass50_6.method549(aByte2, arg0);
				local207 = local207 * ((this.method107(this.aClass50_5.anInt764, local81, anInt132, local222) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray35[local216] != 0) {
					local222 = local193 + anIntArray42[local216];
					if (local222 < arg0) {
						anIntArray38[local222] += this.method107(this.aClass50_1.anInt764, anIntArray41[local216], anInt132, local207 * anIntArray43[local216] >> 15);
						anIntArray41[local216] += (local201 * anIntArray44[local216] >> 16) + anIntArray45[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass50_7 != null) {
			this.aClass50_7.method548();
			this.aClass50_8.method548();
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass50_7.method549(aByte2, arg0);
				local385 = this.aClass50_8.method549(aByte2, arg0);
				if (local369) {
					local207 = this.aClass50_7.anInt762 + ((this.aClass50_7.anInt763 - this.aClass50_7.anInt762) * local379 >> 8);
				} else {
					local207 = this.aClass50_7.anInt762 + ((this.aClass50_7.anInt763 - this.aClass50_7.anInt762) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray38[local222] = 0;
				}
			}
		}
		if (this.anInt133 > 0 && this.anInt134 > 0) {
			local201 = (int) ((double) this.anInt133 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray38[local207] += anIntArray38[local207 - local201] * this.anInt134 / 100;
			}
		}
		if (this.aClass33_1.anIntArray167[0] > 0 || this.aClass33_1.anIntArray167[1] > 0) {
			this.aClass50_9.method548();
			local201 = this.aClass50_9.method549(aByte2, arg0 + 1);
			local207 = this.aClass33_1.method386(0, (float) local201 / 65536.0F);
			local216 = this.aClass33_1.method386(1, (float) local201 / 65536.0F);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray38[local222 + local207] * (long) Class33.anInt578 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray38[local222 + local207 - local559 - 1] * (long) Class33.anIntArrayArray17[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray38[local222 - local590 - 1] * (long) Class33.anIntArrayArray17[1][local590] >> 16);
					}
					anIntArray38[local222] = local385;
					local201 = this.aClass50_9.method549(aByte2, arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray38[local222 + local207] * (long) Class33.anInt578 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray38[local222 + local207 - local590 - 1] * (long) Class33.anIntArrayArray17[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray38[local222 - local694 - 1] * (long) Class33.anIntArrayArray17[1][local694] >> 16);
						}
						anIntArray38[local222] = local559;
						local201 = this.aClass50_9.method549(aByte2, arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray38[local222 + local207 - local590 - 1] * (long) Class33.anIntArrayArray17[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray38[local222 - local694 - 1] * (long) Class33.anIntArrayArray17[1][local694] >> 16);
							}
							anIntArray38[local222] = local559;
							this.aClass50_9.method549(aByte2, arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass33_1.method386(0, (float) local201 / 65536.0F);
					local216 = this.aClass33_1.method386(1, (float) local201 / 65536.0F);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray38[local201] < -32768) {
				anIntArray38[local201] = -32768;
			}
			if (anIntArray38[local201] > 32767) {
				anIntArray38[local201] = 32767;
			}
		}
		return anIntArray38;
	}

	@OriginalMember(owner = "client!HJHNNPSW", name = "a", descriptor = "(IIII)I")
	private int method107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2 <= 0) {
				this.aBoolean30 = !this.aBoolean30;
			}
			if (arg0 == 1) {
				return (arg1 & 0x7FFF) < 16384 ? arg3 : -arg3;
			} else if (arg0 == 2) {
				return anIntArray40[arg1 & 0x7FFF] * arg3 >> 14;
			} else if (arg0 == 3) {
				return ((arg1 & 0x7FFF) * arg3 >> 14) - arg3;
			} else if (arg0 == 4) {
				return anIntArray39[arg1 / 2607 & 0x7FFF] * arg3;
			} else {
				return 0;
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("61710, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HJHNNPSW", name = "a", descriptor = "(ILclient!SVWJKJVI;)V")
	public void method108(@OriginalArg(1) Class1_Sub1_Sub4 arg0) {
		try {
			this.aClass50_1 = new Class50();
			this.aClass50_1.method546(arg0);
			this.aClass50_2 = new Class50();
			this.aClass50_2.method546(arg0);
			@Pc(24) int local24 = arg0.method405();
			if (local24 != 0) {
				arg0.anInt624--;
				this.aClass50_3 = new Class50();
				this.aClass50_3.method546(arg0);
				this.aClass50_4 = new Class50();
				this.aClass50_4.method546(arg0);
			}
			local24 = arg0.method405();
			if (local24 != 0) {
				arg0.anInt624--;
				this.aClass50_5 = new Class50();
				this.aClass50_5.method546(arg0);
				this.aClass50_6 = new Class50();
				this.aClass50_6.method546(arg0);
			}
			local24 = arg0.method405();
			if (local24 != 0) {
				arg0.anInt624--;
				this.aClass50_7 = new Class50();
				this.aClass50_7.method546(arg0);
				this.aClass50_8 = new Class50();
				this.aClass50_8.method546(arg0);
			}
			for (@Pc(116) int local116 = 0; local116 < 10; local116++) {
				@Pc(127) int local127 = arg0.method419();
				if (local127 == 0) {
					break;
				}
				this.anIntArray35[local116] = local127;
				this.anIntArray36[local116] = arg0.method418();
				this.anIntArray37[local116] = arg0.method419();
			}
			this.anInt133 = arg0.method419();
			this.anInt134 = arg0.method419();
			this.anInt135 = arg0.method407();
			this.anInt136 = arg0.method407();
			this.aClass33_1 = new Class33();
			this.aClass50_9 = new Class50();
			this.aClass33_1.method387(this.aClass50_9, arg0);
		} catch (@Pc(190) RuntimeException local190) {
			signlink.reporterror("61032, " + -13096 + ", " + arg0 + ", " + local190.toString());
			throw new RuntimeException();
		}
	}
}
