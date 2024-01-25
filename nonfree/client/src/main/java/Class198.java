import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class198 {

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "[I")
	private static final int[] anIntArray731 = new int[32768];

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "[I")
	private static final int[] anIntArray733;

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "Lclient!gh;")
	private Class70 aClass70_1;

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "Lclient!gh;")
	private Class70 aClass70_2;

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "Lclient!gh;")
	private Class70 aClass70_3;

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "Lclient!gh;")
	private Class70 aClass70_4;

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "Lclient!gh;")
	private Class70 aClass70_5;

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "Lclient!gh;")
	private Class70 aClass70_6;

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "Lclient!si;")
	private Class187 aClass187_1;

	@OriginalMember(owner = "client!tn", name = "p", descriptor = "Lclient!gh;")
	private Class70 aClass70_7;

	@OriginalMember(owner = "client!tn", name = "r", descriptor = "Lclient!gh;")
	private Class70 aClass70_8;

	@OriginalMember(owner = "client!tn", name = "t", descriptor = "Lclient!gh;")
	private Class70 aClass70_9;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
	public int anInt5849 = 0;

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "[I")
	private final int[] anIntArray732 = new int[5];

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
	public int anInt5848 = 500;

	@OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
	private int anInt5847 = 0;

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "[I")
	private final int[] anIntArray734 = new int[5];

	@OriginalMember(owner = "client!tn", name = "o", descriptor = "[I")
	private final int[] anIntArray735 = new int[5];

	@OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
	private int anInt5850 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray731[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray733 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray733[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)[I")
	public int[] method5140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static367.method5378(Static303.anIntArray736, 0, arg0);
		if (arg1 < 10) {
			return Static303.anIntArray736;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass70_8.method1926();
		this.aClass70_5.method1926();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass70_1 != null) {
			this.aClass70_1.method1926();
			this.aClass70_3.method1926();
			local24 = (int) ((double) (this.aClass70_1.anInt2116 - this.aClass70_1.anInt2114) * 32.768D / local16);
			local26 = (int) ((double) this.aClass70_1.anInt2114 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass70_6 != null) {
			this.aClass70_6.method1926();
			this.aClass70_2.method1926();
			local63 = (int) ((double) (this.aClass70_6.anInt2116 - this.aClass70_6.anInt2114) * 32.768D / local16);
			local65 = (int) ((double) this.aClass70_6.anInt2114 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray735[local102] != 0) {
				Static303.anIntArray740[local102] = 0;
				Static303.anIntArray738[local102] = (int) ((double) this.anIntArray732[local102] * local16);
				Static303.anIntArray737[local102] = (this.anIntArray735[local102] << 14) / 100;
				Static303.anIntArray739[local102] = (int) ((double) (this.aClass70_8.anInt2116 - this.aClass70_8.anInt2114) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray734[local102]) / local16);
				Static303.anIntArray741[local102] = (int) ((double) this.aClass70_8.anInt2114 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass70_8.method1929(arg0);
			local187 = this.aClass70_5.method1929(arg0);
			if (this.aClass70_1 != null) {
				local195 = this.aClass70_1.method1929(arg0);
				local200 = this.aClass70_3.method1929(arg0);
				local182 += this.method5141(local28, local200, this.aClass70_1.anInt2115) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass70_6 != null) {
				local195 = this.aClass70_6.method1929(arg0);
				local200 = this.aClass70_2.method1929(arg0);
				local187 = local187 * ((this.method5141(local67, local200, this.aClass70_6.anInt2115) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray735[local195] != 0) {
					local200 = local176 + Static303.anIntArray738[local195];
					if (local200 < arg0) {
						Static303.anIntArray736[local200] += this.method5141(Static303.anIntArray740[local195], local187 * Static303.anIntArray737[local195] >> 15, this.aClass70_8.anInt2115);
						Static303.anIntArray740[local195] += (local182 * Static303.anIntArray739[local195] >> 16) + Static303.anIntArray741[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass70_7 != null) {
			this.aClass70_7.method1926();
			this.aClass70_4.method1926();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass70_7.method1929(arg0);
				local352 = this.aClass70_4.method1929(arg0);
				if (local339) {
					local187 = this.aClass70_7.anInt2114 + ((this.aClass70_7.anInt2116 - this.aClass70_7.anInt2114) * local347 >> 8);
				} else {
					local187 = this.aClass70_7.anInt2114 + ((this.aClass70_7.anInt2116 - this.aClass70_7.anInt2114) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static303.anIntArray736[local200] = 0;
				}
			}
		}
		if (this.anInt5847 > 0 && this.anInt5850 > 0) {
			local182 = (int) ((double) this.anInt5847 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static303.anIntArray736[local187] += Static303.anIntArray736[local187 - local182] * this.anInt5850 / 100;
			}
		}
		if (this.aClass187_1.anIntArray689[0] > 0 || this.aClass187_1.anIntArray689[1] > 0) {
			this.aClass70_9.method1926();
			local182 = this.aClass70_9.method1929(arg0 + 1);
			local187 = this.aClass187_1.method4882(0, (float) local182 / 65536.0F);
			local195 = this.aClass187_1.method4882(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static303.anIntArray736[local200 + local187] * (long) Static284.anInt5497 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static303.anIntArray736[local200 + local187 - local519 - 1] * (long) Static284.anIntArrayArray56[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static303.anIntArray736[local200 - local549 - 1] * (long) Static284.anIntArrayArray56[1][local549] >> 16);
					}
					Static303.anIntArray736[local200] = local352;
					local182 = this.aClass70_9.method1929(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static303.anIntArray736[local200 + local187] * (long) Static284.anInt5497 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static303.anIntArray736[local200 + local187 - local519 - 1] * (long) Static284.anIntArrayArray56[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static303.anIntArray736[local200 - local549 - 1] * (long) Static284.anIntArrayArray56[1][local549] >> 16);
						}
						Static303.anIntArray736[local200] = local352;
						local182 = this.aClass70_9.method1929(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static303.anIntArray736[local200 + local187 - local519 - 1] * (long) Static284.anIntArrayArray56[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static303.anIntArray736[local200 - local549 - 1] * (long) Static284.anIntArrayArray56[1][local549] >> 16);
							}
							Static303.anIntArray736[local200] = local352;
							this.aClass70_9.method1929(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass187_1.method4882(0, (float) local182 / 65536.0F);
					local195 = this.aClass187_1.method4882(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static303.anIntArray736[local182] < -32768) {
				Static303.anIntArray736[local182] = -32768;
			}
			if (Static303.anIntArray736[local182] > 32767) {
				Static303.anIntArray736[local182] = 32767;
			}
		}
		return Static303.anIntArray736;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)I")
	private int method5141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray733[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray731[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!eb;)V")
	public void method5143(@OriginalArg(0) Class1_Sub7 arg0) {
		this.aClass70_8 = new Class70();
		this.aClass70_8.method1927(arg0);
		this.aClass70_5 = new Class70();
		this.aClass70_5.method1927(arg0);
		@Pc(21) int local21 = arg0.method3141();
		if (local21 != 0) {
			arg0.anInt3368--;
			this.aClass70_1 = new Class70();
			this.aClass70_1.method1927(arg0);
			this.aClass70_3 = new Class70();
			this.aClass70_3.method1927(arg0);
		}
		local21 = arg0.method3141();
		if (local21 != 0) {
			arg0.anInt3368--;
			this.aClass70_6 = new Class70();
			this.aClass70_6.method1927(arg0);
			this.aClass70_2 = new Class70();
			this.aClass70_2.method1927(arg0);
		}
		local21 = arg0.method3141();
		if (local21 != 0) {
			arg0.anInt3368--;
			this.aClass70_7 = new Class70();
			this.aClass70_7.method1927(arg0);
			this.aClass70_4 = new Class70();
			this.aClass70_4.method1927(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method3145();
			if (local114 == 0) {
				break;
			}
			this.anIntArray735[local109] = local114;
			this.anIntArray734[local109] = arg0.method3135();
			this.anIntArray732[local109] = arg0.method3145();
		}
		this.anInt5847 = arg0.method3145();
		this.anInt5850 = arg0.method3145();
		this.anInt5848 = arg0.method3115();
		this.anInt5849 = arg0.method3115();
		this.aClass187_1 = new Class187();
		this.aClass70_9 = new Class70();
		this.aClass187_1.method4883(arg0, this.aClass70_9);
	}
}
