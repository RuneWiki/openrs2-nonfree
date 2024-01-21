import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class70 {

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "[I")
	public static int[] anIntArray352 = new int[32768];

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "[I")
	public static int[] anIntArray354;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "Lclient!uc;")
	private Class79 aClass79_1;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "Lclient!uc;")
	private Class79 aClass79_2;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "Lclient!uc;")
	private Class79 aClass79_3;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "Lclient!uc;")
	private Class79 aClass79_4;

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "Lclient!uc;")
	private Class79 aClass79_5;

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "Lclient!uc;")
	private Class79 aClass79_6;

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "Lclient!uc;")
	private Class79 aClass79_7;

	@OriginalMember(owner = "client!sa", name = "q", descriptor = "Lclient!uc;")
	private Class79 aClass79_8;

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "Lclient!uc;")
	private Class79 aClass79_9;

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "Lclient!jb;")
	private Class41 aClass41_1;

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
	public int anInt3301 = 500;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
	private int anInt3300 = 0;

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "[I")
	private final int[] anIntArray353 = new int[5];

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "[I")
	private final int[] anIntArray355 = new int[5];

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
	public int anInt3302 = 0;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
	private int anInt3299 = 100;

	@OriginalMember(owner = "client!sa", name = "t", descriptor = "[I")
	private final int[] anIntArray356 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray352[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray354 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray354[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)I")
	private int method2388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray354[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray352[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)[I")
	public int[] method2390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static184.method1121(Static145.anIntArray351, 0, arg0);
		if (arg1 < 10) {
			return Static145.anIntArray351;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass79_5.method2571();
		this.aClass79_6.method2571();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass79_1 != null) {
			this.aClass79_1.method2571();
			this.aClass79_7.method2571();
			local24 = (int) ((double) (this.aClass79_1.anInt3547 - this.aClass79_1.anInt3550) * 32.768D / local16);
			local26 = (int) ((double) this.aClass79_1.anInt3550 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass79_8 != null) {
			this.aClass79_8.method2571();
			this.aClass79_3.method2571();
			local63 = (int) ((double) (this.aClass79_8.anInt3547 - this.aClass79_8.anInt3550) * 32.768D / local16);
			local65 = (int) ((double) this.aClass79_8.anInt3550 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray355[local102] != 0) {
				Static145.anIntArray361[local102] = 0;
				Static145.anIntArray357[local102] = (int) ((double) this.anIntArray353[local102] * local16);
				Static145.anIntArray360[local102] = (this.anIntArray355[local102] << 14) / 100;
				Static145.anIntArray358[local102] = (int) ((double) (this.aClass79_5.anInt3547 - this.aClass79_5.anInt3550) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray356[local102]) / local16);
				Static145.anIntArray359[local102] = (int) ((double) this.aClass79_5.anInt3550 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass79_5.method2572(arg0);
			local187 = this.aClass79_6.method2572(arg0);
			if (this.aClass79_1 != null) {
				local195 = this.aClass79_1.method2572(arg0);
				local200 = this.aClass79_7.method2572(arg0);
				local182 += this.method2388(local28, local200, this.aClass79_1.anInt3549) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass79_8 != null) {
				local195 = this.aClass79_8.method2572(arg0);
				local200 = this.aClass79_3.method2572(arg0);
				local187 = local187 * ((this.method2388(local67, local200, this.aClass79_8.anInt3549) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray355[local195] != 0) {
					local200 = local176 + Static145.anIntArray357[local195];
					if (local200 < arg0) {
						Static145.anIntArray351[local200] += this.method2388(Static145.anIntArray361[local195], local187 * Static145.anIntArray360[local195] >> 15, this.aClass79_5.anInt3549);
						Static145.anIntArray361[local195] += (local182 * Static145.anIntArray358[local195] >> 16) + Static145.anIntArray359[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass79_9 != null) {
			this.aClass79_9.method2571();
			this.aClass79_4.method2571();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass79_9.method2572(arg0);
				local352 = this.aClass79_4.method2572(arg0);
				if (local339) {
					local187 = this.aClass79_9.anInt3550 + ((this.aClass79_9.anInt3547 - this.aClass79_9.anInt3550) * local347 >> 8);
				} else {
					local187 = this.aClass79_9.anInt3550 + ((this.aClass79_9.anInt3547 - this.aClass79_9.anInt3550) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static145.anIntArray351[local200] = 0;
				}
			}
		}
		if (this.anInt3300 > 0 && this.anInt3299 > 0) {
			local182 = (int) ((double) this.anInt3300 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static145.anIntArray351[local187] += Static145.anIntArray351[local187 - local182] * this.anInt3299 / 100;
			}
		}
		if (this.aClass41_1.anIntArray179[0] > 0 || this.aClass41_1.anIntArray179[1] > 0) {
			this.aClass79_2.method2571();
			local182 = this.aClass79_2.method2572(arg0 + 1);
			local187 = this.aClass41_1.method1267(0, (float) local182 / 65536.0F);
			local195 = this.aClass41_1.method1267(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static145.anIntArray351[local200 + local187] * (long) Static73.anInt1644 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static145.anIntArray351[local200 + local187 - local519 - 1] * (long) Static73.anIntArrayArray12[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static145.anIntArray351[local200 - local549 - 1] * (long) Static73.anIntArrayArray12[1][local549] >> 16);
					}
					Static145.anIntArray351[local200] = local352;
					local182 = this.aClass79_2.method2572(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static145.anIntArray351[local200 + local187] * (long) Static73.anInt1644 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static145.anIntArray351[local200 + local187 - local519 - 1] * (long) Static73.anIntArrayArray12[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static145.anIntArray351[local200 - local549 - 1] * (long) Static73.anIntArrayArray12[1][local549] >> 16);
						}
						Static145.anIntArray351[local200] = local352;
						local182 = this.aClass79_2.method2572(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static145.anIntArray351[local200 + local187 - local519 - 1] * (long) Static73.anIntArrayArray12[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static145.anIntArray351[local200 - local549 - 1] * (long) Static73.anIntArrayArray12[1][local549] >> 16);
							}
							Static145.anIntArray351[local200] = local352;
							this.aClass79_2.method2572(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass41_1.method1267(0, (float) local182 / 65536.0F);
					local195 = this.aClass41_1.method1267(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static145.anIntArray351[local182] < -32768) {
				Static145.anIntArray351[local182] = -32768;
			}
			if (Static145.anIntArray351[local182] > 32767) {
				Static145.anIntArray351[local182] = 32767;
			}
		}
		return Static145.anIntArray351;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!ff;)V")
	public void method2391(@OriginalArg(0) Class3_Sub12 arg0) {
		this.aClass79_5 = new Class79();
		this.aClass79_5.method2570(arg0);
		this.aClass79_6 = new Class79();
		this.aClass79_6.method2570(arg0);
		@Pc(21) int local21 = arg0.method1354();
		if (local21 != 0) {
			arg0.anInt1793--;
			this.aClass79_1 = new Class79();
			this.aClass79_1.method2570(arg0);
			this.aClass79_7 = new Class79();
			this.aClass79_7.method2570(arg0);
		}
		local21 = arg0.method1354();
		if (local21 != 0) {
			arg0.anInt1793--;
			this.aClass79_8 = new Class79();
			this.aClass79_8.method2570(arg0);
			this.aClass79_3 = new Class79();
			this.aClass79_3.method2570(arg0);
		}
		local21 = arg0.method1354();
		if (local21 != 0) {
			arg0.anInt1793--;
			this.aClass79_9 = new Class79();
			this.aClass79_9.method2570(arg0);
			this.aClass79_4 = new Class79();
			this.aClass79_4.method2570(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1379();
			if (local114 == 0) {
				break;
			}
			this.anIntArray355[local109] = local114;
			this.anIntArray356[local109] = arg0.method1366();
			this.anIntArray353[local109] = arg0.method1379();
		}
		this.anInt3300 = arg0.method1379();
		this.anInt3299 = arg0.method1379();
		this.anInt3301 = arg0.method1359();
		this.anInt3302 = arg0.method1359();
		this.aClass41_1 = new Class41();
		this.aClass79_2 = new Class79();
		this.aClass41_1.method1268(arg0, this.aClass79_2);
	}
}
