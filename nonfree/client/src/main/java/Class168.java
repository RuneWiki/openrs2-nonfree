import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class168 {

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "[I")
	private static final int[] anIntArray517 = new int[32768];

	@OriginalMember(owner = "client!qh", name = "k", descriptor = "[I")
	private static final int[] anIntArray516;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "Lclient!ki;")
	private Class117 aClass117_1;

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "Lclient!ki;")
	private Class117 aClass117_2;

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "Lclient!ki;")
	private Class117 aClass117_3;

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "Lclient!vn;")
	private Class210 aClass210_1;

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "Lclient!ki;")
	private Class117 aClass117_4;

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "Lclient!ki;")
	private Class117 aClass117_5;

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "Lclient!ki;")
	private Class117 aClass117_6;

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "Lclient!ki;")
	private Class117 aClass117_7;

	@OriginalMember(owner = "client!qh", name = "s", descriptor = "Lclient!ki;")
	private Class117 aClass117_8;

	@OriginalMember(owner = "client!qh", name = "t", descriptor = "Lclient!ki;")
	private Class117 aClass117_9;

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
	public int anInt4755 = 500;

	@OriginalMember(owner = "client!qh", name = "o", descriptor = "[I")
	private final int[] anIntArray518 = new int[5];

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "[I")
	private final int[] anIntArray514 = new int[5];

	@OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
	private int anInt4757 = 0;

	@OriginalMember(owner = "client!qh", name = "q", descriptor = "[I")
	private final int[] anIntArray519 = new int[5];

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
	public int anInt4756 = 0;

	@OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
	private int anInt4758 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray517[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray516 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray516[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!ec;)V")
	public void method4405(@OriginalArg(0) Class6_Sub10 arg0) {
		this.aClass117_7 = new Class117();
		this.aClass117_7.method3214(arg0);
		this.aClass117_5 = new Class117();
		this.aClass117_5.method3214(arg0);
		@Pc(21) int local21 = arg0.method3972();
		if (local21 != 0) {
			arg0.anInt4188--;
			this.aClass117_8 = new Class117();
			this.aClass117_8.method3214(arg0);
			this.aClass117_3 = new Class117();
			this.aClass117_3.method3214(arg0);
		}
		local21 = arg0.method3972();
		if (local21 != 0) {
			arg0.anInt4188--;
			this.aClass117_1 = new Class117();
			this.aClass117_1.method3214(arg0);
			this.aClass117_4 = new Class117();
			this.aClass117_4.method3214(arg0);
		}
		local21 = arg0.method3972();
		if (local21 != 0) {
			arg0.anInt4188--;
			this.aClass117_6 = new Class117();
			this.aClass117_6.method3214(arg0);
			this.aClass117_2 = new Class117();
			this.aClass117_2.method3214(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method4017();
			if (local114 == 0) {
				break;
			}
			this.anIntArray514[local109] = local114;
			this.anIntArray518[local109] = arg0.method3964();
			this.anIntArray519[local109] = arg0.method4017();
		}
		this.anInt4757 = arg0.method4017();
		this.anInt4758 = arg0.method4017();
		this.anInt4755 = arg0.method4021();
		this.anInt4756 = arg0.method4021();
		this.aClass210_1 = new Class210();
		this.aClass117_9 = new Class117();
		this.aClass210_1.method5546(arg0, this.aClass117_9);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)I")
	private int method4406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray516[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray517[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)[I")
	public int[] method4407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static358.method956(Static257.anIntArray515, 0, arg0);
		if (arg1 < 10) {
			return Static257.anIntArray515;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass117_7.method3217();
		this.aClass117_5.method3217();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass117_8 != null) {
			this.aClass117_8.method3217();
			this.aClass117_3.method3217();
			local24 = (int) ((double) (this.aClass117_8.anInt3055 - this.aClass117_8.anInt3056) * 32.768D / local16);
			local26 = (int) ((double) this.aClass117_8.anInt3056 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass117_1 != null) {
			this.aClass117_1.method3217();
			this.aClass117_4.method3217();
			local63 = (int) ((double) (this.aClass117_1.anInt3055 - this.aClass117_1.anInt3056) * 32.768D / local16);
			local65 = (int) ((double) this.aClass117_1.anInt3056 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray514[local102] != 0) {
				Static257.anIntArray520[local102] = 0;
				Static257.anIntArray522[local102] = (int) ((double) this.anIntArray519[local102] * local16);
				Static257.anIntArray523[local102] = (this.anIntArray514[local102] << 14) / 100;
				Static257.anIntArray521[local102] = (int) ((double) (this.aClass117_7.anInt3055 - this.aClass117_7.anInt3056) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray518[local102]) / local16);
				Static257.anIntArray524[local102] = (int) ((double) this.aClass117_7.anInt3056 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass117_7.method3216(arg0);
			local187 = this.aClass117_5.method3216(arg0);
			if (this.aClass117_8 != null) {
				local195 = this.aClass117_8.method3216(arg0);
				local200 = this.aClass117_3.method3216(arg0);
				local182 += this.method4406(local28, local200, this.aClass117_8.anInt3053) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass117_1 != null) {
				local195 = this.aClass117_1.method3216(arg0);
				local200 = this.aClass117_4.method3216(arg0);
				local187 = local187 * ((this.method4406(local67, local200, this.aClass117_1.anInt3053) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray514[local195] != 0) {
					local200 = local176 + Static257.anIntArray522[local195];
					if (local200 < arg0) {
						Static257.anIntArray515[local200] += this.method4406(Static257.anIntArray520[local195], local187 * Static257.anIntArray523[local195] >> 15, this.aClass117_7.anInt3053);
						Static257.anIntArray520[local195] += (local182 * Static257.anIntArray521[local195] >> 16) + Static257.anIntArray524[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass117_6 != null) {
			this.aClass117_6.method3217();
			this.aClass117_2.method3217();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass117_6.method3216(arg0);
				local352 = this.aClass117_2.method3216(arg0);
				if (local339) {
					local187 = this.aClass117_6.anInt3056 + ((this.aClass117_6.anInt3055 - this.aClass117_6.anInt3056) * local347 >> 8);
				} else {
					local187 = this.aClass117_6.anInt3056 + ((this.aClass117_6.anInt3055 - this.aClass117_6.anInt3056) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static257.anIntArray515[local200] = 0;
				}
			}
		}
		if (this.anInt4757 > 0 && this.anInt4758 > 0) {
			local182 = (int) ((double) this.anInt4757 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static257.anIntArray515[local187] += Static257.anIntArray515[local187 - local182] * this.anInt4758 / 100;
			}
		}
		if (this.aClass210_1.anIntArray701[0] > 0 || this.aClass210_1.anIntArray701[1] > 0) {
			this.aClass117_9.method3217();
			local182 = this.aClass117_9.method3216(arg0 + 1);
			local187 = this.aClass210_1.method5544(0, (float) local182 / 65536.0F);
			local195 = this.aClass210_1.method5544(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static257.anIntArray515[local200 + local187] * (long) Static335.anInt6118 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static257.anIntArray515[local200 + local187 - local519 - 1] * (long) Static335.anIntArrayArray214[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static257.anIntArray515[local200 - local549 - 1] * (long) Static335.anIntArrayArray214[1][local549] >> 16);
					}
					Static257.anIntArray515[local200] = local352;
					local182 = this.aClass117_9.method3216(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static257.anIntArray515[local200 + local187] * (long) Static335.anInt6118 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static257.anIntArray515[local200 + local187 - local519 - 1] * (long) Static335.anIntArrayArray214[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static257.anIntArray515[local200 - local549 - 1] * (long) Static335.anIntArrayArray214[1][local549] >> 16);
						}
						Static257.anIntArray515[local200] = local352;
						local182 = this.aClass117_9.method3216(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static257.anIntArray515[local200 + local187 - local519 - 1] * (long) Static335.anIntArrayArray214[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static257.anIntArray515[local200 - local549 - 1] * (long) Static335.anIntArrayArray214[1][local549] >> 16);
							}
							Static257.anIntArray515[local200] = local352;
							this.aClass117_9.method3216(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass210_1.method5544(0, (float) local182 / 65536.0F);
					local195 = this.aClass210_1.method5544(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static257.anIntArray515[local182] < -32768) {
				Static257.anIntArray515[local182] = -32768;
			}
			if (Static257.anIntArray515[local182] > 32767) {
				Static257.anIntArray515[local182] = 32767;
			}
		}
		return Static257.anIntArray515;
	}
}
