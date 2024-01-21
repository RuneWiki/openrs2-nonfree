import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class36 {

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "[I")
	public static int[] anIntArray291 = new int[32768];

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "[I")
	public static int[] anIntArray287;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "Lclient!me;")
	private Class53 aClass53_1;

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "Lclient!tb;")
	private Class79 aClass79_1;

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "Lclient!me;")
	private Class53 aClass53_2;

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "Lclient!me;")
	private Class53 aClass53_3;

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "Lclient!me;")
	private Class53 aClass53_4;

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "Lclient!me;")
	private Class53 aClass53_5;

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "Lclient!me;")
	private Class53 aClass53_6;

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "Lclient!me;")
	private Class53 aClass53_7;

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "Lclient!me;")
	private Class53 aClass53_8;

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "Lclient!me;")
	private Class53 aClass53_9;

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "[I")
	private final int[] anIntArray290 = new int[5];

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "[I")
	private final int[] anIntArray289 = new int[5];

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
	private int anInt1812 = 100;

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "[I")
	private final int[] anIntArray288 = new int[5];

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
	public int anInt1814 = 500;

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
	public int anInt1815 = 0;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
	private int anInt1813 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray291[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray287 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray287[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)[I")
	public int[] method1310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static186.method1563(Static65.anIntArray286, 0, arg0);
		if (arg1 < 10) {
			return Static65.anIntArray286;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass53_4.method1790();
		this.aClass53_8.method1790();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass53_1 != null) {
			this.aClass53_1.method1790();
			this.aClass53_2.method1790();
			local24 = (int) ((double) (this.aClass53_1.anInt2484 - this.aClass53_1.anInt2483) * 32.768D / local16);
			local26 = (int) ((double) this.aClass53_1.anInt2483 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass53_9 != null) {
			this.aClass53_9.method1790();
			this.aClass53_6.method1790();
			local63 = (int) ((double) (this.aClass53_9.anInt2484 - this.aClass53_9.anInt2483) * 32.768D / local16);
			local65 = (int) ((double) this.aClass53_9.anInt2483 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray290[local102] != 0) {
				Static65.anIntArray293[local102] = 0;
				Static65.anIntArray295[local102] = (int) ((double) this.anIntArray288[local102] * local16);
				Static65.anIntArray292[local102] = (this.anIntArray290[local102] << 14) / 100;
				Static65.anIntArray294[local102] = (int) ((double) (this.aClass53_4.anInt2484 - this.aClass53_4.anInt2483) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray289[local102]) / local16);
				Static65.anIntArray296[local102] = (int) ((double) this.aClass53_4.anInt2483 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass53_4.method1789(arg0);
			local187 = this.aClass53_8.method1789(arg0);
			if (this.aClass53_1 != null) {
				local195 = this.aClass53_1.method1789(arg0);
				local200 = this.aClass53_2.method1789(arg0);
				local182 += this.method1312(local28, local200, this.aClass53_1.anInt2486) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass53_9 != null) {
				local195 = this.aClass53_9.method1789(arg0);
				local200 = this.aClass53_6.method1789(arg0);
				local187 = local187 * ((this.method1312(local67, local200, this.aClass53_9.anInt2486) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray290[local195] != 0) {
					local200 = local176 + Static65.anIntArray295[local195];
					if (local200 < arg0) {
						Static65.anIntArray286[local200] += this.method1312(Static65.anIntArray293[local195], local187 * Static65.anIntArray292[local195] >> 15, this.aClass53_4.anInt2486);
						Static65.anIntArray293[local195] += (local182 * Static65.anIntArray294[local195] >> 16) + Static65.anIntArray296[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass53_5 != null) {
			this.aClass53_5.method1790();
			this.aClass53_7.method1790();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass53_5.method1789(arg0);
				local352 = this.aClass53_7.method1789(arg0);
				if (local339) {
					local187 = this.aClass53_5.anInt2483 + ((this.aClass53_5.anInt2484 - this.aClass53_5.anInt2483) * local347 >> 8);
				} else {
					local187 = this.aClass53_5.anInt2483 + ((this.aClass53_5.anInt2484 - this.aClass53_5.anInt2483) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static65.anIntArray286[local200] = 0;
				}
			}
		}
		if (this.anInt1813 > 0 && this.anInt1812 > 0) {
			local182 = (int) ((double) this.anInt1813 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static65.anIntArray286[local187] += Static65.anIntArray286[local187 - local182] * this.anInt1812 / 100;
			}
		}
		if (this.aClass79_1.anIntArray540[0] > 0 || this.aClass79_1.anIntArray540[1] > 0) {
			this.aClass53_3.method1790();
			local182 = this.aClass53_3.method1789(arg0 + 1);
			local187 = this.aClass79_1.method2571(0, (float) local182 / 65536.0F);
			local195 = this.aClass79_1.method2571(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static65.anIntArray286[local200 + local187] * (long) Static151.anInt3706 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static65.anIntArray286[local200 + local187 - local519 - 1] * (long) Static151.anIntArrayArray35[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static65.anIntArray286[local200 - local549 - 1] * (long) Static151.anIntArrayArray35[1][local549] >> 16);
					}
					Static65.anIntArray286[local200] = local352;
					local182 = this.aClass53_3.method1789(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static65.anIntArray286[local200 + local187] * (long) Static151.anInt3706 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static65.anIntArray286[local200 + local187 - local519 - 1] * (long) Static151.anIntArrayArray35[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static65.anIntArray286[local200 - local549 - 1] * (long) Static151.anIntArrayArray35[1][local549] >> 16);
						}
						Static65.anIntArray286[local200] = local352;
						local182 = this.aClass53_3.method1789(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static65.anIntArray286[local200 + local187 - local519 - 1] * (long) Static151.anIntArrayArray35[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static65.anIntArray286[local200 - local549 - 1] * (long) Static151.anIntArrayArray35[1][local549] >> 16);
							}
							Static65.anIntArray286[local200] = local352;
							this.aClass53_3.method1789(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass79_1.method2571(0, (float) local182 / 65536.0F);
					local195 = this.aClass79_1.method2571(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static65.anIntArray286[local182] < -32768) {
				Static65.anIntArray286[local182] = -32768;
			}
			if (Static65.anIntArray286[local182] > 32767) {
				Static65.anIntArray286[local182] = 32767;
			}
		}
		return Static65.anIntArray286;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!oa;)V")
	public void method1311(@OriginalArg(0) Class2_Sub18 arg0) {
		this.aClass53_4 = new Class53();
		this.aClass53_4.method1788(arg0);
		this.aClass53_8 = new Class53();
		this.aClass53_8.method1788(arg0);
		@Pc(21) int local21 = arg0.method2387();
		if (local21 != 0) {
			arg0.anInt3423--;
			this.aClass53_1 = new Class53();
			this.aClass53_1.method1788(arg0);
			this.aClass53_2 = new Class53();
			this.aClass53_2.method1788(arg0);
		}
		local21 = arg0.method2387();
		if (local21 != 0) {
			arg0.anInt3423--;
			this.aClass53_9 = new Class53();
			this.aClass53_9.method1788(arg0);
			this.aClass53_6 = new Class53();
			this.aClass53_6.method1788(arg0);
		}
		local21 = arg0.method2387();
		if (local21 != 0) {
			arg0.anInt3423--;
			this.aClass53_5 = new Class53();
			this.aClass53_5.method1788(arg0);
			this.aClass53_7 = new Class53();
			this.aClass53_7.method1788(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method2380();
			if (local114 == 0) {
				break;
			}
			this.anIntArray290[local109] = local114;
			this.anIntArray289[local109] = arg0.method2375();
			this.anIntArray288[local109] = arg0.method2380();
		}
		this.anInt1813 = arg0.method2380();
		this.anInt1812 = arg0.method2380();
		this.anInt1814 = arg0.method2353();
		this.anInt1815 = arg0.method2353();
		this.aClass79_1 = new Class79();
		this.aClass53_3 = new Class53();
		this.aClass79_1.method2570(arg0, this.aClass53_3);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)I")
	private int method1312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray287[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray291[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
