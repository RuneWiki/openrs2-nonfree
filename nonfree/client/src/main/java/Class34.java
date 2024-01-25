import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class34 {

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "[I")
	private static final int[] anIntArray83 = new int[32768];

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "[I")
	private static final int[] anIntArray79;

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "Lclient!bd;")
	private Class16 aClass16_1;

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "Lclient!bd;")
	private Class16 aClass16_2;

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "Lclient!bd;")
	private Class16 aClass16_3;

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "Lclient!io;")
	private Class92 aClass92_1;

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "Lclient!bd;")
	private Class16 aClass16_4;

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "Lclient!bd;")
	private Class16 aClass16_5;

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "Lclient!bd;")
	private Class16 aClass16_6;

	@OriginalMember(owner = "client!cn", name = "n", descriptor = "Lclient!bd;")
	private Class16 aClass16_7;

	@OriginalMember(owner = "client!cn", name = "s", descriptor = "Lclient!bd;")
	private Class16 aClass16_8;

	@OriginalMember(owner = "client!cn", name = "v", descriptor = "Lclient!bd;")
	private Class16 aClass16_9;

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "[I")
	private final int[] anIntArray81 = new int[5];

	@OriginalMember(owner = "client!cn", name = "l", descriptor = "[I")
	private final int[] anIntArray82 = new int[5];

	@OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
	private int anInt990 = 100;

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
	public int anInt989 = 500;

	@OriginalMember(owner = "client!cn", name = "p", descriptor = "[I")
	private final int[] anIntArray84 = new int[5];

	@OriginalMember(owner = "client!cn", name = "t", descriptor = "I")
	public int anInt991 = 0;

	@OriginalMember(owner = "client!cn", name = "y", descriptor = "I")
	private int anInt992 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray83[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray79 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray79[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)I")
	private int method1079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray79[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray83[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!dg;)V")
	public void method1080(@OriginalArg(0) Class2_Sub10 arg0) {
		this.aClass16_7 = new Class16();
		this.aClass16_7.method681(arg0);
		this.aClass16_8 = new Class16();
		this.aClass16_8.method681(arg0);
		@Pc(21) int local21 = arg0.method4421();
		if (local21 != 0) {
			arg0.anInt4807--;
			this.aClass16_6 = new Class16();
			this.aClass16_6.method681(arg0);
			this.aClass16_9 = new Class16();
			this.aClass16_9.method681(arg0);
		}
		local21 = arg0.method4421();
		if (local21 != 0) {
			arg0.anInt4807--;
			this.aClass16_4 = new Class16();
			this.aClass16_4.method681(arg0);
			this.aClass16_2 = new Class16();
			this.aClass16_2.method681(arg0);
		}
		local21 = arg0.method4421();
		if (local21 != 0) {
			arg0.anInt4807--;
			this.aClass16_5 = new Class16();
			this.aClass16_5.method681(arg0);
			this.aClass16_3 = new Class16();
			this.aClass16_3.method681(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method4441();
			if (local114 == 0) {
				break;
			}
			this.anIntArray84[local109] = local114;
			this.anIntArray82[local109] = arg0.method4424();
			this.anIntArray81[local109] = arg0.method4441();
		}
		this.anInt992 = arg0.method4441();
		this.anInt990 = arg0.method4441();
		this.anInt989 = arg0.method4464();
		this.anInt991 = arg0.method4464();
		this.aClass92_1 = new Class92();
		this.aClass16_1 = new Class16();
		this.aClass92_1.method2777(arg0, this.aClass16_1);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)[I")
	public int[] method1082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static359.method689(Static45.anIntArray80, 0, arg0);
		if (arg1 < 10) {
			return Static45.anIntArray80;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass16_7.method682();
		this.aClass16_8.method682();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass16_6 != null) {
			this.aClass16_6.method682();
			this.aClass16_9.method682();
			local24 = (int) ((double) (this.aClass16_6.anInt439 - this.aClass16_6.anInt441) * 32.768D / local16);
			local26 = (int) ((double) this.aClass16_6.anInt441 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass16_4 != null) {
			this.aClass16_4.method682();
			this.aClass16_2.method682();
			local63 = (int) ((double) (this.aClass16_4.anInt439 - this.aClass16_4.anInt441) * 32.768D / local16);
			local65 = (int) ((double) this.aClass16_4.anInt441 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray84[local102] != 0) {
				Static45.anIntArray88[local102] = 0;
				Static45.anIntArray86[local102] = (int) ((double) this.anIntArray81[local102] * local16);
				Static45.anIntArray87[local102] = (this.anIntArray84[local102] << 14) / 100;
				Static45.anIntArray85[local102] = (int) ((double) (this.aClass16_7.anInt439 - this.aClass16_7.anInt441) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray82[local102]) / local16);
				Static45.anIntArray89[local102] = (int) ((double) this.aClass16_7.anInt441 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass16_7.method680(arg0);
			local187 = this.aClass16_8.method680(arg0);
			if (this.aClass16_6 != null) {
				local195 = this.aClass16_6.method680(arg0);
				local200 = this.aClass16_9.method680(arg0);
				local182 += this.method1079(local28, local200, this.aClass16_6.anInt442) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass16_4 != null) {
				local195 = this.aClass16_4.method680(arg0);
				local200 = this.aClass16_2.method680(arg0);
				local187 = local187 * ((this.method1079(local67, local200, this.aClass16_4.anInt442) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray84[local195] != 0) {
					local200 = local176 + Static45.anIntArray86[local195];
					if (local200 < arg0) {
						Static45.anIntArray80[local200] += this.method1079(Static45.anIntArray88[local195], local187 * Static45.anIntArray87[local195] >> 15, this.aClass16_7.anInt442);
						Static45.anIntArray88[local195] += (local182 * Static45.anIntArray85[local195] >> 16) + Static45.anIntArray89[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass16_5 != null) {
			this.aClass16_5.method682();
			this.aClass16_3.method682();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass16_5.method680(arg0);
				local352 = this.aClass16_3.method680(arg0);
				if (local339) {
					local187 = this.aClass16_5.anInt441 + ((this.aClass16_5.anInt439 - this.aClass16_5.anInt441) * local347 >> 8);
				} else {
					local187 = this.aClass16_5.anInt441 + ((this.aClass16_5.anInt439 - this.aClass16_5.anInt441) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static45.anIntArray80[local200] = 0;
				}
			}
		}
		if (this.anInt992 > 0 && this.anInt990 > 0) {
			local182 = (int) ((double) this.anInt992 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static45.anIntArray80[local187] += Static45.anIntArray80[local187 - local182] * this.anInt990 / 100;
			}
		}
		if (this.aClass92_1.anIntArray244[0] > 0 || this.aClass92_1.anIntArray244[1] > 0) {
			this.aClass16_1.method682();
			local182 = this.aClass16_1.method680(arg0 + 1);
			local187 = this.aClass92_1.method2776(0, (float) local182 / 65536.0F);
			local195 = this.aClass92_1.method2776(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static45.anIntArray80[local200 + local187] * (long) Static142.anInt2910 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static45.anIntArray80[local200 + local187 - local519 - 1] * (long) Static142.anIntArrayArray89[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static45.anIntArray80[local200 - local549 - 1] * (long) Static142.anIntArrayArray89[1][local549] >> 16);
					}
					Static45.anIntArray80[local200] = local352;
					local182 = this.aClass16_1.method680(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static45.anIntArray80[local200 + local187] * (long) Static142.anInt2910 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static45.anIntArray80[local200 + local187 - local519 - 1] * (long) Static142.anIntArrayArray89[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static45.anIntArray80[local200 - local549 - 1] * (long) Static142.anIntArrayArray89[1][local549] >> 16);
						}
						Static45.anIntArray80[local200] = local352;
						local182 = this.aClass16_1.method680(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static45.anIntArray80[local200 + local187 - local519 - 1] * (long) Static142.anIntArrayArray89[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static45.anIntArray80[local200 - local549 - 1] * (long) Static142.anIntArrayArray89[1][local549] >> 16);
							}
							Static45.anIntArray80[local200] = local352;
							this.aClass16_1.method680(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass92_1.method2776(0, (float) local182 / 65536.0F);
					local195 = this.aClass92_1.method2776(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static45.anIntArray80[local182] < -32768) {
				Static45.anIntArray80[local182] = -32768;
			}
			if (Static45.anIntArray80[local182] > 32767) {
				Static45.anIntArray80[local182] = 32767;
			}
		}
		return Static45.anIntArray80;
	}
}
