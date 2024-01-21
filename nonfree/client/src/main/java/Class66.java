import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class66 {

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "[I")
	public static int[] anIntArray317 = new int[32768];

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "[I")
	public static int[] anIntArray315;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "Lclient!aa;")
	private Class2 aClass2_1;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "Lclient!aa;")
	private Class2 aClass2_2;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "Lclient!aa;")
	private Class2 aClass2_3;

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "Lclient!aa;")
	private Class2 aClass2_4;

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "Lclient!t;")
	private Class69 aClass69_1;

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "Lclient!aa;")
	private Class2 aClass2_5;

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "Lclient!aa;")
	private Class2 aClass2_6;

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "Lclient!aa;")
	private Class2 aClass2_7;

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "Lclient!aa;")
	private Class2 aClass2_8;

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "Lclient!aa;")
	private Class2 aClass2_9;

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "[I")
	private final int[] anIntArray314 = new int[5];

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
	private int anInt3030 = 0;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "[I")
	private final int[] anIntArray313 = new int[5];

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
	public int anInt3031 = 500;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
	public int anInt3029 = 0;

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
	private int anInt3032 = 100;

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "[I")
	private final int[] anIntArray316 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray317[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray315 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray315[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)I")
	private int method2026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray315[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray317[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)[I")
	public int[] method2027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static135.method1706(Static106.anIntArray312, 0, arg0);
		if (arg1 < 10) {
			return Static106.anIntArray312;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass2_5.method4();
		this.aClass2_7.method4();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass2_4 != null) {
			this.aClass2_4.method4();
			this.aClass2_6.method4();
			local24 = (int) ((double) (this.aClass2_4.anInt8 - this.aClass2_4.anInt5) * 32.768D / local16);
			local26 = (int) ((double) this.aClass2_4.anInt5 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass2_3 != null) {
			this.aClass2_3.method4();
			this.aClass2_2.method4();
			local63 = (int) ((double) (this.aClass2_3.anInt8 - this.aClass2_3.anInt5) * 32.768D / local16);
			local65 = (int) ((double) this.aClass2_3.anInt5 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray313[local102] != 0) {
				Static106.anIntArray322[local102] = 0;
				Static106.anIntArray320[local102] = (int) ((double) this.anIntArray314[local102] * local16);
				Static106.anIntArray318[local102] = (this.anIntArray313[local102] << 14) / 100;
				Static106.anIntArray321[local102] = (int) ((double) (this.aClass2_5.anInt8 - this.aClass2_5.anInt5) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray316[local102]) / local16);
				Static106.anIntArray319[local102] = (int) ((double) this.aClass2_5.anInt5 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass2_5.method2(arg0);
			local187 = this.aClass2_7.method2(arg0);
			if (this.aClass2_4 != null) {
				local195 = this.aClass2_4.method2(arg0);
				local200 = this.aClass2_6.method2(arg0);
				local182 += this.method2026(local28, local200, this.aClass2_4.anInt7) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass2_3 != null) {
				local195 = this.aClass2_3.method2(arg0);
				local200 = this.aClass2_2.method2(arg0);
				local187 = local187 * ((this.method2026(local67, local200, this.aClass2_3.anInt7) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray313[local195] != 0) {
					local200 = local176 + Static106.anIntArray320[local195];
					if (local200 < arg0) {
						Static106.anIntArray312[local200] += this.method2026(Static106.anIntArray322[local195], local187 * Static106.anIntArray318[local195] >> 15, this.aClass2_5.anInt7);
						Static106.anIntArray322[local195] += (local182 * Static106.anIntArray321[local195] >> 16) + Static106.anIntArray319[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass2_9 != null) {
			this.aClass2_9.method4();
			this.aClass2_8.method4();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass2_9.method2(arg0);
				local352 = this.aClass2_8.method2(arg0);
				if (local339) {
					local187 = this.aClass2_9.anInt5 + ((this.aClass2_9.anInt8 - this.aClass2_9.anInt5) * local347 >> 8);
				} else {
					local187 = this.aClass2_9.anInt5 + ((this.aClass2_9.anInt8 - this.aClass2_9.anInt5) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static106.anIntArray312[local200] = 0;
				}
			}
		}
		if (this.anInt3030 > 0 && this.anInt3032 > 0) {
			local182 = (int) ((double) this.anInt3030 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static106.anIntArray312[local187] += Static106.anIntArray312[local187 - local182] * this.anInt3032 / 100;
			}
		}
		if (this.aClass69_1.anIntArray329[0] > 0 || this.aClass69_1.anIntArray329[1] > 0) {
			this.aClass2_1.method4();
			local182 = this.aClass2_1.method2(arg0 + 1);
			local187 = this.aClass69_1.method2059(0, (float) local182 / 65536.0F);
			local195 = this.aClass69_1.method2059(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static106.anIntArray312[local200 + local187] * (long) Static110.anInt3096 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static106.anIntArray312[local200 + local187 - local519 - 1] * (long) Static110.anIntArrayArray76[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static106.anIntArray312[local200 - local549 - 1] * (long) Static110.anIntArrayArray76[1][local549] >> 16);
					}
					Static106.anIntArray312[local200] = local352;
					local182 = this.aClass2_1.method2(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static106.anIntArray312[local200 + local187] * (long) Static110.anInt3096 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static106.anIntArray312[local200 + local187 - local519 - 1] * (long) Static110.anIntArrayArray76[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static106.anIntArray312[local200 - local549 - 1] * (long) Static110.anIntArrayArray76[1][local549] >> 16);
						}
						Static106.anIntArray312[local200] = local352;
						local182 = this.aClass2_1.method2(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static106.anIntArray312[local200 + local187 - local519 - 1] * (long) Static110.anIntArrayArray76[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static106.anIntArray312[local200 - local549 - 1] * (long) Static110.anIntArrayArray76[1][local549] >> 16);
							}
							Static106.anIntArray312[local200] = local352;
							this.aClass2_1.method2(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass69_1.method2059(0, (float) local182 / 65536.0F);
					local195 = this.aClass69_1.method2059(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static106.anIntArray312[local182] < -32768) {
				Static106.anIntArray312[local182] = -32768;
			}
			if (Static106.anIntArray312[local182] > 32767) {
				Static106.anIntArray312[local182] = 32767;
			}
		}
		return Static106.anIntArray312;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!la;)V")
	public void method2028(@OriginalArg(0) Class3_Sub12 arg0) {
		this.aClass2_5 = new Class2();
		this.aClass2_5.method3(arg0);
		this.aClass2_7 = new Class2();
		this.aClass2_7.method3(arg0);
		@Pc(21) int local21 = arg0.method1936();
		if (local21 != 0) {
			arg0.anInt2886--;
			this.aClass2_4 = new Class2();
			this.aClass2_4.method3(arg0);
			this.aClass2_6 = new Class2();
			this.aClass2_6.method3(arg0);
		}
		local21 = arg0.method1936();
		if (local21 != 0) {
			arg0.anInt2886--;
			this.aClass2_3 = new Class2();
			this.aClass2_3.method3(arg0);
			this.aClass2_2 = new Class2();
			this.aClass2_2.method3(arg0);
		}
		local21 = arg0.method1936();
		if (local21 != 0) {
			arg0.anInt2886--;
			this.aClass2_9 = new Class2();
			this.aClass2_9.method3(arg0);
			this.aClass2_8 = new Class2();
			this.aClass2_8.method3(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1948();
			if (local114 == 0) {
				break;
			}
			this.anIntArray313[local109] = local114;
			this.anIntArray316[local109] = arg0.method1944();
			this.anIntArray314[local109] = arg0.method1948();
		}
		this.anInt3030 = arg0.method1948();
		this.anInt3032 = arg0.method1948();
		this.anInt3031 = arg0.method1963();
		this.anInt3029 = arg0.method1963();
		this.aClass69_1 = new Class69();
		this.aClass2_1 = new Class2();
		this.aClass69_1.method2058(arg0, this.aClass2_1);
	}
}
