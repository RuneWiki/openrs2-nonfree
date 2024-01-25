import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fca")
public final class Class99 {

	@OriginalMember(owner = "client!fca", name = "f", descriptor = "[I")
	private static final int[] anIntArray120 = new int[32768];

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "[I")
	private static final int[] anIntArray119;

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "Lclient!lea;")
	private Class185 aClass185_1;

	@OriginalMember(owner = "client!fca", name = "e", descriptor = "Lclient!lea;")
	private Class185 aClass185_2;

	@OriginalMember(owner = "client!fca", name = "h", descriptor = "Lclient!lea;")
	private Class185 aClass185_3;

	@OriginalMember(owner = "client!fca", name = "k", descriptor = "Lclient!jj;")
	private Class159 aClass159_1;

	@OriginalMember(owner = "client!fca", name = "m", descriptor = "Lclient!lea;")
	private Class185 aClass185_4;

	@OriginalMember(owner = "client!fca", name = "o", descriptor = "Lclient!lea;")
	private Class185 aClass185_5;

	@OriginalMember(owner = "client!fca", name = "p", descriptor = "Lclient!lea;")
	private Class185 aClass185_6;

	@OriginalMember(owner = "client!fca", name = "v", descriptor = "Lclient!lea;")
	private Class185 aClass185_7;

	@OriginalMember(owner = "client!fca", name = "x", descriptor = "Lclient!lea;")
	private Class185 aClass185_8;

	@OriginalMember(owner = "client!fca", name = "y", descriptor = "Lclient!lea;")
	private Class185 aClass185_9;

	@OriginalMember(owner = "client!fca", name = "g", descriptor = "I")
	private int anInt3356 = 0;

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "I")
	public int anInt3354 = 500;

	@OriginalMember(owner = "client!fca", name = "l", descriptor = "[I")
	private final int[] anIntArray123 = new int[5];

	@OriginalMember(owner = "client!fca", name = "n", descriptor = "I")
	public int anInt3357 = 0;

	@OriginalMember(owner = "client!fca", name = "s", descriptor = "[I")
	private final int[] anIntArray126 = new int[5];

	@OriginalMember(owner = "client!fca", name = "d", descriptor = "I")
	private int anInt3355 = 100;

	@OriginalMember(owner = "client!fca", name = "i", descriptor = "[I")
	private final int[] anIntArray121 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray120[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray119 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray119[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(III)I")
	private int method2737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray119[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray120[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!ie;)V")
	public void method2738(@OriginalArg(0) Class3_Sub26 arg0) {
		this.aClass185_9 = new Class185();
		this.aClass185_9.method4602(arg0);
		this.aClass185_3 = new Class185();
		this.aClass185_3.method4602(arg0);
		@Pc(21) int local21 = arg0.method6814();
		if (local21 != 0) {
			arg0.anInt8703--;
			this.aClass185_1 = new Class185();
			this.aClass185_1.method4602(arg0);
			this.aClass185_7 = new Class185();
			this.aClass185_7.method4602(arg0);
		}
		local21 = arg0.method6814();
		if (local21 != 0) {
			arg0.anInt8703--;
			this.aClass185_6 = new Class185();
			this.aClass185_6.method4602(arg0);
			this.aClass185_2 = new Class185();
			this.aClass185_2.method4602(arg0);
		}
		local21 = arg0.method6814();
		if (local21 != 0) {
			arg0.anInt8703--;
			this.aClass185_5 = new Class185();
			this.aClass185_5.method4602(arg0);
			this.aClass185_8 = new Class185();
			this.aClass185_8.method4602(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method6832();
			if (local114 == 0) {
				break;
			}
			this.anIntArray123[local109] = local114;
			this.anIntArray121[local109] = arg0.method6784();
			this.anIntArray126[local109] = arg0.method6832();
		}
		this.anInt3356 = arg0.method6832();
		this.anInt3355 = arg0.method6832();
		this.anInt3354 = arg0.method6811();
		this.anInt3357 = arg0.method6811();
		this.aClass159_1 = new Class159();
		this.aClass185_4 = new Class185();
		this.aClass159_1.method3981(arg0, this.aClass185_4);
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(II)[I")
	public int[] method2739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static604.method6227(Static140.anIntArray122, 0, arg0);
		if (arg1 < 10) {
			return Static140.anIntArray122;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass185_9.method4601();
		this.aClass185_3.method4601();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass185_1 != null) {
			this.aClass185_1.method4601();
			this.aClass185_7.method4601();
			local24 = (int) ((double) (this.aClass185_1.anInt5665 - this.aClass185_1.anInt5663) * 32.768D / local16);
			local26 = (int) ((double) this.aClass185_1.anInt5663 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass185_6 != null) {
			this.aClass185_6.method4601();
			this.aClass185_2.method4601();
			local63 = (int) ((double) (this.aClass185_6.anInt5665 - this.aClass185_6.anInt5663) * 32.768D / local16);
			local65 = (int) ((double) this.aClass185_6.anInt5663 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray123[local102] != 0) {
				Static140.anIntArray129[local102] = 0;
				Static140.anIntArray127[local102] = (int) ((double) this.anIntArray126[local102] * local16);
				Static140.anIntArray125[local102] = (this.anIntArray123[local102] << 14) / 100;
				Static140.anIntArray128[local102] = (int) ((double) (this.aClass185_9.anInt5665 - this.aClass185_9.anInt5663) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray121[local102]) / local16);
				Static140.anIntArray124[local102] = (int) ((double) this.aClass185_9.anInt5663 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass185_9.method4599(arg0);
			local187 = this.aClass185_3.method4599(arg0);
			if (this.aClass185_1 != null) {
				local195 = this.aClass185_1.method4599(arg0);
				local200 = this.aClass185_7.method4599(arg0);
				local182 += this.method2737(local28, local200, this.aClass185_1.anInt5664) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass185_6 != null) {
				local195 = this.aClass185_6.method4599(arg0);
				local200 = this.aClass185_2.method4599(arg0);
				local187 = local187 * ((this.method2737(local67, local200, this.aClass185_6.anInt5664) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray123[local195] != 0) {
					local200 = local176 + Static140.anIntArray127[local195];
					if (local200 < arg0) {
						Static140.anIntArray122[local200] += this.method2737(Static140.anIntArray129[local195], local187 * Static140.anIntArray125[local195] >> 15, this.aClass185_9.anInt5664);
						Static140.anIntArray129[local195] += (local182 * Static140.anIntArray128[local195] >> 16) + Static140.anIntArray124[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass185_5 != null) {
			this.aClass185_5.method4601();
			this.aClass185_8.method4601();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass185_5.method4599(arg0);
				local352 = this.aClass185_8.method4599(arg0);
				if (local339) {
					local187 = this.aClass185_5.anInt5663 + ((this.aClass185_5.anInt5665 - this.aClass185_5.anInt5663) * local347 >> 8);
				} else {
					local187 = this.aClass185_5.anInt5663 + ((this.aClass185_5.anInt5665 - this.aClass185_5.anInt5663) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static140.anIntArray122[local200] = 0;
				}
			}
		}
		if (this.anInt3356 > 0 && this.anInt3355 > 0) {
			local182 = (int) ((double) this.anInt3356 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static140.anIntArray122[local187] += Static140.anIntArray122[local187 - local182] * this.anInt3355 / 100;
			}
		}
		if (this.aClass159_1.anIntArray234[0] > 0 || this.aClass159_1.anIntArray234[1] > 0) {
			this.aClass185_4.method4601();
			local182 = this.aClass185_4.method4599(arg0 + 1);
			local187 = this.aClass159_1.method3978(0, (float) local182 / 65536.0F);
			local195 = this.aClass159_1.method3978(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static140.anIntArray122[local200 + local187] * (long) Static255.anInt4968 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static140.anIntArray122[local200 + local187 - local519 - 1] * (long) Static255.anIntArrayArray50[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static140.anIntArray122[local200 - local549 - 1] * (long) Static255.anIntArrayArray50[1][local549] >> 16);
					}
					Static140.anIntArray122[local200] = local352;
					local182 = this.aClass185_4.method4599(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static140.anIntArray122[local200 + local187] * (long) Static255.anInt4968 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static140.anIntArray122[local200 + local187 - local519 - 1] * (long) Static255.anIntArrayArray50[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static140.anIntArray122[local200 - local549 - 1] * (long) Static255.anIntArrayArray50[1][local549] >> 16);
						}
						Static140.anIntArray122[local200] = local352;
						local182 = this.aClass185_4.method4599(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static140.anIntArray122[local200 + local187 - local519 - 1] * (long) Static255.anIntArrayArray50[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static140.anIntArray122[local200 - local549 - 1] * (long) Static255.anIntArrayArray50[1][local549] >> 16);
							}
							Static140.anIntArray122[local200] = local352;
							this.aClass185_4.method4599(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass159_1.method3978(0, (float) local182 / 65536.0F);
					local195 = this.aClass159_1.method3978(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static140.anIntArray122[local182] < -32768) {
				Static140.anIntArray122[local182] = -32768;
			}
			if (Static140.anIntArray122[local182] > 32767) {
				Static140.anIntArray122[local182] = 32767;
			}
		}
		return Static140.anIntArray122;
	}
}
