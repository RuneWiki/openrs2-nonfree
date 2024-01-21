import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class6 {

	@OriginalMember(owner = "client!be", name = "s", descriptor = "[I")
	public static int[] anIntArray22 = new int[32768];

	@OriginalMember(owner = "client!be", name = "o", descriptor = "[I")
	public static int[] anIntArray20;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "Lclient!ch;")
	private Class13 aClass13_1;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "Lclient!ch;")
	private Class13 aClass13_2;

	@OriginalMember(owner = "client!be", name = "f", descriptor = "Lclient!kb;")
	private Class36 aClass36_1;

	@OriginalMember(owner = "client!be", name = "g", descriptor = "Lclient!ch;")
	private Class13 aClass13_3;

	@OriginalMember(owner = "client!be", name = "h", descriptor = "Lclient!ch;")
	private Class13 aClass13_4;

	@OriginalMember(owner = "client!be", name = "j", descriptor = "Lclient!ch;")
	private Class13 aClass13_5;

	@OriginalMember(owner = "client!be", name = "m", descriptor = "Lclient!ch;")
	private Class13 aClass13_6;

	@OriginalMember(owner = "client!be", name = "n", descriptor = "Lclient!ch;")
	private Class13 aClass13_7;

	@OriginalMember(owner = "client!be", name = "p", descriptor = "Lclient!ch;")
	private Class13 aClass13_8;

	@OriginalMember(owner = "client!be", name = "r", descriptor = "Lclient!ch;")
	private Class13 aClass13_9;

	@OriginalMember(owner = "client!be", name = "d", descriptor = "I")
	public int anInt352 = 0;

	@OriginalMember(owner = "client!be", name = "c", descriptor = "I")
	public int anInt351 = 500;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "I")
	private int anInt350 = 100;

	@OriginalMember(owner = "client!be", name = "k", descriptor = "I")
	private int anInt353 = 0;

	@OriginalMember(owner = "client!be", name = "i", descriptor = "[I")
	private final int[] anIntArray18 = new int[5];

	@OriginalMember(owner = "client!be", name = "q", descriptor = "[I")
	private final int[] anIntArray21 = new int[5];

	@OriginalMember(owner = "client!be", name = "l", descriptor = "[I")
	private final int[] anIntArray19 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray22[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray20 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray20[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)I")
	private int method220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray20[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray22[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[I")
	public int[] method221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static185.method2280(Static13.anIntArray23, 0, arg0);
		if (arg1 < 10) {
			return Static13.anIntArray23;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass13_5.method388();
		this.aClass13_9.method388();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass13_6 != null) {
			this.aClass13_6.method388();
			this.aClass13_4.method388();
			local24 = (int) ((double) (this.aClass13_6.anInt623 - this.aClass13_6.anInt620) * 32.768D / local16);
			local26 = (int) ((double) this.aClass13_6.anInt620 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass13_7 != null) {
			this.aClass13_7.method388();
			this.aClass13_2.method388();
			local63 = (int) ((double) (this.aClass13_7.anInt623 - this.aClass13_7.anInt620) * 32.768D / local16);
			local65 = (int) ((double) this.aClass13_7.anInt620 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray21[local102] != 0) {
				Static13.anIntArray26[local102] = 0;
				Static13.anIntArray25[local102] = (int) ((double) this.anIntArray19[local102] * local16);
				Static13.anIntArray24[local102] = (this.anIntArray21[local102] << 14) / 100;
				Static13.anIntArray27[local102] = (int) ((double) (this.aClass13_5.anInt623 - this.aClass13_5.anInt620) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray18[local102]) / local16);
				Static13.anIntArray28[local102] = (int) ((double) this.aClass13_5.anInt620 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass13_5.method386(arg0);
			local187 = this.aClass13_9.method386(arg0);
			if (this.aClass13_6 != null) {
				local195 = this.aClass13_6.method386(arg0);
				local200 = this.aClass13_4.method386(arg0);
				local182 += this.method220(local28, local200, this.aClass13_6.anInt622) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass13_7 != null) {
				local195 = this.aClass13_7.method386(arg0);
				local200 = this.aClass13_2.method386(arg0);
				local187 = local187 * ((this.method220(local67, local200, this.aClass13_7.anInt622) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray21[local195] != 0) {
					local200 = local176 + Static13.anIntArray25[local195];
					if (local200 < arg0) {
						Static13.anIntArray23[local200] += this.method220(Static13.anIntArray26[local195], local187 * Static13.anIntArray24[local195] >> 15, this.aClass13_5.anInt622);
						Static13.anIntArray26[local195] += (local182 * Static13.anIntArray27[local195] >> 16) + Static13.anIntArray28[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass13_3 != null) {
			this.aClass13_3.method388();
			this.aClass13_8.method388();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass13_3.method386(arg0);
				local352 = this.aClass13_8.method386(arg0);
				if (local339) {
					local187 = this.aClass13_3.anInt620 + ((this.aClass13_3.anInt623 - this.aClass13_3.anInt620) * local347 >> 8);
				} else {
					local187 = this.aClass13_3.anInt620 + ((this.aClass13_3.anInt623 - this.aClass13_3.anInt620) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static13.anIntArray23[local200] = 0;
				}
			}
		}
		if (this.anInt353 > 0 && this.anInt350 > 0) {
			local182 = (int) ((double) this.anInt353 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static13.anIntArray23[local187] += Static13.anIntArray23[local187 - local182] * this.anInt350 / 100;
			}
		}
		if (this.aClass36_1.anIntArray206[0] > 0 || this.aClass36_1.anIntArray206[1] > 0) {
			this.aClass13_1.method388();
			local182 = this.aClass13_1.method386(arg0 + 1);
			local187 = this.aClass36_1.method1689(0, (float) local182 / 65536.0F);
			local195 = this.aClass36_1.method1689(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static13.anIntArray23[local200 + local187] * (long) Static77.anInt2363 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static13.anIntArray23[local200 + local187 - local519 - 1] * (long) Static77.anIntArrayArray69[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static13.anIntArray23[local200 - local549 - 1] * (long) Static77.anIntArrayArray69[1][local549] >> 16);
					}
					Static13.anIntArray23[local200] = local352;
					local182 = this.aClass13_1.method386(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static13.anIntArray23[local200 + local187] * (long) Static77.anInt2363 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static13.anIntArray23[local200 + local187 - local519 - 1] * (long) Static77.anIntArrayArray69[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static13.anIntArray23[local200 - local549 - 1] * (long) Static77.anIntArrayArray69[1][local549] >> 16);
						}
						Static13.anIntArray23[local200] = local352;
						local182 = this.aClass13_1.method386(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static13.anIntArray23[local200 + local187 - local519 - 1] * (long) Static77.anIntArrayArray69[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static13.anIntArray23[local200 - local549 - 1] * (long) Static77.anIntArrayArray69[1][local549] >> 16);
							}
							Static13.anIntArray23[local200] = local352;
							this.aClass13_1.method386(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass36_1.method1689(0, (float) local182 / 65536.0F);
					local195 = this.aClass36_1.method1689(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static13.anIntArray23[local182] < -32768) {
				Static13.anIntArray23[local182] = -32768;
			}
			if (Static13.anIntArray23[local182] > 32767) {
				Static13.anIntArray23[local182] = 32767;
			}
		}
		return Static13.anIntArray23;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!hc;)V")
	public void method222(@OriginalArg(0) Class1_Sub6 arg0) {
		this.aClass13_5 = new Class13();
		this.aClass13_5.method387(arg0);
		this.aClass13_9 = new Class13();
		this.aClass13_9.method387(arg0);
		@Pc(21) int local21 = arg0.method544();
		if (local21 != 0) {
			arg0.anInt839--;
			this.aClass13_6 = new Class13();
			this.aClass13_6.method387(arg0);
			this.aClass13_4 = new Class13();
			this.aClass13_4.method387(arg0);
		}
		local21 = arg0.method544();
		if (local21 != 0) {
			arg0.anInt839--;
			this.aClass13_7 = new Class13();
			this.aClass13_7.method387(arg0);
			this.aClass13_2 = new Class13();
			this.aClass13_2.method387(arg0);
		}
		local21 = arg0.method544();
		if (local21 != 0) {
			arg0.anInt839--;
			this.aClass13_3 = new Class13();
			this.aClass13_3.method387(arg0);
			this.aClass13_8 = new Class13();
			this.aClass13_8.method387(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method527();
			if (local114 == 0) {
				break;
			}
			this.anIntArray21[local109] = local114;
			this.anIntArray18[local109] = arg0.method525();
			this.anIntArray19[local109] = arg0.method527();
		}
		this.anInt353 = arg0.method527();
		this.anInt350 = arg0.method527();
		this.anInt351 = arg0.method546();
		this.anInt352 = arg0.method546();
		this.aClass36_1 = new Class36();
		this.aClass13_1 = new Class13();
		this.aClass36_1.method1691(arg0, this.aClass13_1);
	}
}
