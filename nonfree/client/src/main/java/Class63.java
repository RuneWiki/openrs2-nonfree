import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class63 {

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "[I")
	private static final int[] anIntArray169 = new int[32768];

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "[I")
	private static final int[] anIntArray170;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "Lclient!pq;")
	private Class203 aClass203_1;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "Lclient!wh;")
	private Class262 aClass262_1;

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "Lclient!pq;")
	private Class203 aClass203_2;

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "Lclient!pq;")
	private Class203 aClass203_3;

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "Lclient!pq;")
	private Class203 aClass203_4;

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "Lclient!pq;")
	private Class203 aClass203_5;

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "Lclient!pq;")
	private Class203 aClass203_6;

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "Lclient!pq;")
	private Class203 aClass203_7;

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "Lclient!pq;")
	private Class203 aClass203_8;

	@OriginalMember(owner = "client!ee", name = "v", descriptor = "Lclient!pq;")
	private Class203 aClass203_9;

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
	private int anInt1639 = 0;

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "[I")
	private final int[] anIntArray171 = new int[5];

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
	private int anInt1638 = 100;

	@OriginalMember(owner = "client!ee", name = "s", descriptor = "[I")
	private final int[] anIntArray174 = new int[5];

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
	public int anInt1640 = 0;

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "[I")
	private final int[] anIntArray172 = new int[5];

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
	public int anInt1637 = 500;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray169[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray170 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray170[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)I")
	private int method1526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray170[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray169[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!ha;)V")
	public void method1527(@OriginalArg(0) Class6_Sub15 arg0) {
		this.aClass203_3 = new Class203();
		this.aClass203_3.method4480(arg0);
		this.aClass203_2 = new Class203();
		this.aClass203_2.method4480(arg0);
		@Pc(21) int local21 = arg0.method3111();
		if (local21 != 0) {
			arg0.anInt3487--;
			this.aClass203_8 = new Class203();
			this.aClass203_8.method4480(arg0);
			this.aClass203_9 = new Class203();
			this.aClass203_9.method4480(arg0);
		}
		local21 = arg0.method3111();
		if (local21 != 0) {
			arg0.anInt3487--;
			this.aClass203_4 = new Class203();
			this.aClass203_4.method4480(arg0);
			this.aClass203_5 = new Class203();
			this.aClass203_5.method4480(arg0);
		}
		local21 = arg0.method3111();
		if (local21 != 0) {
			arg0.anInt3487--;
			this.aClass203_6 = new Class203();
			this.aClass203_6.method4480(arg0);
			this.aClass203_1 = new Class203();
			this.aClass203_1.method4480(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method3090();
			if (local114 == 0) {
				break;
			}
			this.anIntArray172[local109] = local114;
			this.anIntArray171[local109] = arg0.method3125();
			this.anIntArray174[local109] = arg0.method3090();
		}
		this.anInt1639 = arg0.method3090();
		this.anInt1638 = arg0.method3090();
		this.anInt1637 = arg0.method3108();
		this.anInt1640 = arg0.method3108();
		this.aClass262_1 = new Class262();
		this.aClass203_7 = new Class203();
		this.aClass262_1.method5901(arg0, this.aClass203_7);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)[I")
	public int[] method1528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static459.method5350(Static86.anIntArray173, 0, arg0);
		if (arg1 < 10) {
			return Static86.anIntArray173;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass203_3.method4478();
		this.aClass203_2.method4478();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass203_8 != null) {
			this.aClass203_8.method4478();
			this.aClass203_9.method4478();
			local24 = (int) ((double) (this.aClass203_8.anInt5103 - this.aClass203_8.anInt5100) * 32.768D / local16);
			local26 = (int) ((double) this.aClass203_8.anInt5100 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass203_4 != null) {
			this.aClass203_4.method4478();
			this.aClass203_5.method4478();
			local63 = (int) ((double) (this.aClass203_4.anInt5103 - this.aClass203_4.anInt5100) * 32.768D / local16);
			local65 = (int) ((double) this.aClass203_4.anInt5100 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray172[local102] != 0) {
				Static86.anIntArray178[local102] = 0;
				Static86.anIntArray179[local102] = (int) ((double) this.anIntArray174[local102] * local16);
				Static86.anIntArray175[local102] = (this.anIntArray172[local102] << 14) / 100;
				Static86.anIntArray177[local102] = (int) ((double) (this.aClass203_3.anInt5103 - this.aClass203_3.anInt5100) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray171[local102]) / local16);
				Static86.anIntArray176[local102] = (int) ((double) this.aClass203_3.anInt5100 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass203_3.method4479(arg0);
			local187 = this.aClass203_2.method4479(arg0);
			if (this.aClass203_8 != null) {
				local195 = this.aClass203_8.method4479(arg0);
				local200 = this.aClass203_9.method4479(arg0);
				local182 += this.method1526(local28, local200, this.aClass203_8.anInt5102) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass203_4 != null) {
				local195 = this.aClass203_4.method4479(arg0);
				local200 = this.aClass203_5.method4479(arg0);
				local187 = local187 * ((this.method1526(local67, local200, this.aClass203_4.anInt5102) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray172[local195] != 0) {
					local200 = local176 + Static86.anIntArray179[local195];
					if (local200 < arg0) {
						Static86.anIntArray173[local200] += this.method1526(Static86.anIntArray178[local195], local187 * Static86.anIntArray175[local195] >> 15, this.aClass203_3.anInt5102);
						Static86.anIntArray178[local195] += (local182 * Static86.anIntArray177[local195] >> 16) + Static86.anIntArray176[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass203_6 != null) {
			this.aClass203_6.method4478();
			this.aClass203_1.method4478();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass203_6.method4479(arg0);
				local352 = this.aClass203_1.method4479(arg0);
				if (local339) {
					local187 = this.aClass203_6.anInt5100 + ((this.aClass203_6.anInt5103 - this.aClass203_6.anInt5100) * local347 >> 8);
				} else {
					local187 = this.aClass203_6.anInt5100 + ((this.aClass203_6.anInt5103 - this.aClass203_6.anInt5100) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static86.anIntArray173[local200] = 0;
				}
			}
		}
		if (this.anInt1639 > 0 && this.anInt1638 > 0) {
			local182 = (int) ((double) this.anInt1639 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static86.anIntArray173[local187] += Static86.anIntArray173[local187 - local182] * this.anInt1638 / 100;
			}
		}
		if (this.aClass262_1.anIntArray621[0] > 0 || this.aClass262_1.anIntArray621[1] > 0) {
			this.aClass203_7.method4478();
			local182 = this.aClass203_7.method4479(arg0 + 1);
			local187 = this.aClass262_1.method5902(0, (float) local182 / 65536.0F);
			local195 = this.aClass262_1.method5902(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static86.anIntArray173[local200 + local187] * (long) Static438.anInt7198 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static86.anIntArray173[local200 + local187 - local519 - 1] * (long) Static438.anIntArrayArray58[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static86.anIntArray173[local200 - local549 - 1] * (long) Static438.anIntArrayArray58[1][local549] >> 16);
					}
					Static86.anIntArray173[local200] = local352;
					local182 = this.aClass203_7.method4479(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static86.anIntArray173[local200 + local187] * (long) Static438.anInt7198 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static86.anIntArray173[local200 + local187 - local519 - 1] * (long) Static438.anIntArrayArray58[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static86.anIntArray173[local200 - local549 - 1] * (long) Static438.anIntArrayArray58[1][local549] >> 16);
						}
						Static86.anIntArray173[local200] = local352;
						local182 = this.aClass203_7.method4479(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static86.anIntArray173[local200 + local187 - local519 - 1] * (long) Static438.anIntArrayArray58[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static86.anIntArray173[local200 - local549 - 1] * (long) Static438.anIntArrayArray58[1][local549] >> 16);
							}
							Static86.anIntArray173[local200] = local352;
							this.aClass203_7.method4479(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass262_1.method5902(0, (float) local182 / 65536.0F);
					local195 = this.aClass262_1.method5902(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static86.anIntArray173[local182] < -32768) {
				Static86.anIntArray173[local182] = -32768;
			}
			if (Static86.anIntArray173[local182] > 32767) {
				Static86.anIntArray173[local182] = 32767;
			}
		}
		return Static86.anIntArray173;
	}
}
