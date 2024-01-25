import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class231 {

	@OriginalMember(owner = "client!so", name = "s", descriptor = "[I")
	private static final int[] anIntArray485 = new int[32768];

	@OriginalMember(owner = "client!so", name = "g", descriptor = "[I")
	private static final int[] anIntArray481;

	@OriginalMember(owner = "client!so", name = "b", descriptor = "Lclient!nm;")
	private Class181 aClass181_1;

	@OriginalMember(owner = "client!so", name = "c", descriptor = "Lclient!kh;")
	private Class147 aClass147_1;

	@OriginalMember(owner = "client!so", name = "f", descriptor = "Lclient!nm;")
	private Class181 aClass181_2;

	@OriginalMember(owner = "client!so", name = "l", descriptor = "Lclient!nm;")
	private Class181 aClass181_3;

	@OriginalMember(owner = "client!so", name = "m", descriptor = "Lclient!nm;")
	private Class181 aClass181_4;

	@OriginalMember(owner = "client!so", name = "n", descriptor = "Lclient!nm;")
	private Class181 aClass181_5;

	@OriginalMember(owner = "client!so", name = "o", descriptor = "Lclient!nm;")
	private Class181 aClass181_6;

	@OriginalMember(owner = "client!so", name = "q", descriptor = "Lclient!nm;")
	private Class181 aClass181_7;

	@OriginalMember(owner = "client!so", name = "r", descriptor = "Lclient!nm;")
	private Class181 aClass181_8;

	@OriginalMember(owner = "client!so", name = "v", descriptor = "Lclient!nm;")
	private Class181 aClass181_9;

	@OriginalMember(owner = "client!so", name = "d", descriptor = "[I")
	private final int[] anIntArray480 = new int[5];

	@OriginalMember(owner = "client!so", name = "h", descriptor = "I")
	public int anInt6063 = 500;

	@OriginalMember(owner = "client!so", name = "k", descriptor = "I")
	private int anInt6064 = 0;

	@OriginalMember(owner = "client!so", name = "i", descriptor = "[I")
	private final int[] anIntArray482 = new int[5];

	@OriginalMember(owner = "client!so", name = "a", descriptor = "I")
	private int anInt6061 = 100;

	@OriginalMember(owner = "client!so", name = "p", descriptor = "[I")
	private final int[] anIntArray484 = new int[5];

	@OriginalMember(owner = "client!so", name = "e", descriptor = "I")
	public int anInt6062 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray485[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray481 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray481[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(III)I")
	private int method4866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray481[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray485[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!fh;)V")
	public void method4867(@OriginalArg(0) Class4_Sub9 arg0) {
		this.aClass181_8 = new Class181();
		this.aClass181_8.method3514(arg0);
		this.aClass181_5 = new Class181();
		this.aClass181_5.method3514(arg0);
		@Pc(21) int local21 = arg0.method5007();
		if (local21 != 0) {
			arg0.anInt6207--;
			this.aClass181_9 = new Class181();
			this.aClass181_9.method3514(arg0);
			this.aClass181_1 = new Class181();
			this.aClass181_1.method3514(arg0);
		}
		local21 = arg0.method5007();
		if (local21 != 0) {
			arg0.anInt6207--;
			this.aClass181_3 = new Class181();
			this.aClass181_3.method3514(arg0);
			this.aClass181_7 = new Class181();
			this.aClass181_7.method3514(arg0);
		}
		local21 = arg0.method5007();
		if (local21 != 0) {
			arg0.anInt6207--;
			this.aClass181_6 = new Class181();
			this.aClass181_6.method3514(arg0);
			this.aClass181_2 = new Class181();
			this.aClass181_2.method3514(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method5033();
			if (local114 == 0) {
				break;
			}
			this.anIntArray482[local109] = local114;
			this.anIntArray484[local109] = arg0.method5020();
			this.anIntArray480[local109] = arg0.method5033();
		}
		this.anInt6064 = arg0.method5033();
		this.anInt6061 = arg0.method5033();
		this.anInt6063 = arg0.method5028();
		this.anInt6062 = arg0.method5028();
		this.aClass147_1 = new Class147();
		this.aClass181_4 = new Class181();
		this.aClass147_1.method2861(arg0, this.aClass181_4);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)[I")
	public int[] method4868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static461.method1983(Static369.anIntArray483, 0, arg0);
		if (arg1 < 10) {
			return Static369.anIntArray483;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass181_8.method3515();
		this.aClass181_5.method3515();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass181_9 != null) {
			this.aClass181_9.method3515();
			this.aClass181_1.method3515();
			local24 = (int) ((double) (this.aClass181_9.anInt4405 - this.aClass181_9.anInt4403) * 32.768D / local16);
			local26 = (int) ((double) this.aClass181_9.anInt4403 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass181_3 != null) {
			this.aClass181_3.method3515();
			this.aClass181_7.method3515();
			local63 = (int) ((double) (this.aClass181_3.anInt4405 - this.aClass181_3.anInt4403) * 32.768D / local16);
			local65 = (int) ((double) this.aClass181_3.anInt4403 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray482[local102] != 0) {
				Static369.anIntArray486[local102] = 0;
				Static369.anIntArray487[local102] = (int) ((double) this.anIntArray480[local102] * local16);
				Static369.anIntArray490[local102] = (this.anIntArray482[local102] << 14) / 100;
				Static369.anIntArray489[local102] = (int) ((double) (this.aClass181_8.anInt4405 - this.aClass181_8.anInt4403) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray484[local102]) / local16);
				Static369.anIntArray488[local102] = (int) ((double) this.aClass181_8.anInt4403 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass181_8.method3516(arg0);
			local187 = this.aClass181_5.method3516(arg0);
			if (this.aClass181_9 != null) {
				local195 = this.aClass181_9.method3516(arg0);
				local200 = this.aClass181_1.method3516(arg0);
				local182 += this.method4866(local28, local200, this.aClass181_9.anInt4406) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass181_3 != null) {
				local195 = this.aClass181_3.method3516(arg0);
				local200 = this.aClass181_7.method3516(arg0);
				local187 = local187 * ((this.method4866(local67, local200, this.aClass181_3.anInt4406) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray482[local195] != 0) {
					local200 = local176 + Static369.anIntArray487[local195];
					if (local200 < arg0) {
						Static369.anIntArray483[local200] += this.method4866(Static369.anIntArray486[local195], local187 * Static369.anIntArray490[local195] >> 15, this.aClass181_8.anInt4406);
						Static369.anIntArray486[local195] += (local182 * Static369.anIntArray489[local195] >> 16) + Static369.anIntArray488[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass181_6 != null) {
			this.aClass181_6.method3515();
			this.aClass181_2.method3515();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass181_6.method3516(arg0);
				local352 = this.aClass181_2.method3516(arg0);
				if (local339) {
					local187 = this.aClass181_6.anInt4403 + ((this.aClass181_6.anInt4405 - this.aClass181_6.anInt4403) * local347 >> 8);
				} else {
					local187 = this.aClass181_6.anInt4403 + ((this.aClass181_6.anInt4405 - this.aClass181_6.anInt4403) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static369.anIntArray483[local200] = 0;
				}
			}
		}
		if (this.anInt6064 > 0 && this.anInt6061 > 0) {
			local182 = (int) ((double) this.anInt6064 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static369.anIntArray483[local187] += Static369.anIntArray483[local187 - local182] * this.anInt6061 / 100;
			}
		}
		if (this.aClass147_1.anIntArray265[0] > 0 || this.aClass147_1.anIntArray265[1] > 0) {
			this.aClass181_4.method3515();
			local182 = this.aClass181_4.method3516(arg0 + 1);
			local187 = this.aClass147_1.method2863(0, (float) local182 / 65536.0F);
			local195 = this.aClass147_1.method2863(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static369.anIntArray483[local200 + local187] * (long) Static203.anInt3607 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static369.anIntArray483[local200 + local187 - local519 - 1] * (long) Static203.anIntArrayArray41[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static369.anIntArray483[local200 - local549 - 1] * (long) Static203.anIntArrayArray41[1][local549] >> 16);
					}
					Static369.anIntArray483[local200] = local352;
					local182 = this.aClass181_4.method3516(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static369.anIntArray483[local200 + local187] * (long) Static203.anInt3607 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static369.anIntArray483[local200 + local187 - local519 - 1] * (long) Static203.anIntArrayArray41[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static369.anIntArray483[local200 - local549 - 1] * (long) Static203.anIntArrayArray41[1][local549] >> 16);
						}
						Static369.anIntArray483[local200] = local352;
						local182 = this.aClass181_4.method3516(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static369.anIntArray483[local200 + local187 - local519 - 1] * (long) Static203.anIntArrayArray41[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static369.anIntArray483[local200 - local549 - 1] * (long) Static203.anIntArrayArray41[1][local549] >> 16);
							}
							Static369.anIntArray483[local200] = local352;
							this.aClass181_4.method3516(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass147_1.method2863(0, (float) local182 / 65536.0F);
					local195 = this.aClass147_1.method2863(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static369.anIntArray483[local182] < -32768) {
				Static369.anIntArray483[local182] = -32768;
			}
			if (Static369.anIntArray483[local182] > 32767) {
				Static369.anIntArray483[local182] = 32767;
			}
		}
		return Static369.anIntArray483;
	}
}
