import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class163 {

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "[I")
	private static final int[] anIntArray269 = new int[32768];

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "[I")
	private static final int[] anIntArray271;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "Lclient!vaa;")
	private Class337 aClass337_1;

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "Lclient!vaa;")
	private Class337 aClass337_2;

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "Lclient!vaa;")
	private Class337 aClass337_3;

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "Lclient!vaa;")
	private Class337 aClass337_4;

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "Lclient!vaa;")
	private Class337 aClass337_5;

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "Lclient!vaa;")
	private Class337 aClass337_6;

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "Lclient!vaa;")
	private Class337 aClass337_7;

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "Lclient!uw;")
	private Class336 aClass336_1;

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "Lclient!vaa;")
	private Class337 aClass337_8;

	@OriginalMember(owner = "client!ja", name = "x", descriptor = "Lclient!vaa;")
	private Class337 aClass337_9;

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
	private int anInt4442 = 0;

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
	public int anInt4444 = 0;

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
	public int anInt4443 = 500;

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "[I")
	private final int[] anIntArray273 = new int[5];

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "[I")
	private final int[] anIntArray272 = new int[5];

	@OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
	private int anInt4445 = 100;

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "[I")
	private final int[] anIntArray270 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray269[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray271 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray271[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)I")
	private int method3824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray271[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray269[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!io;)V")
	public void method3825(@OriginalArg(0) Class1_Sub20 arg0) {
		this.aClass337_7 = new Class337();
		this.aClass337_7.method7463(arg0);
		this.aClass337_1 = new Class337();
		this.aClass337_1.method7463(arg0);
		@Pc(21) int local21 = arg0.method4393();
		if (local21 != 0) {
			arg0.anInt5238--;
			this.aClass337_4 = new Class337();
			this.aClass337_4.method7463(arg0);
			this.aClass337_5 = new Class337();
			this.aClass337_5.method7463(arg0);
		}
		local21 = arg0.method4393();
		if (local21 != 0) {
			arg0.anInt5238--;
			this.aClass337_8 = new Class337();
			this.aClass337_8.method7463(arg0);
			this.aClass337_2 = new Class337();
			this.aClass337_2.method7463(arg0);
		}
		local21 = arg0.method4393();
		if (local21 != 0) {
			arg0.anInt5238--;
			this.aClass337_3 = new Class337();
			this.aClass337_3.method7463(arg0);
			this.aClass337_6 = new Class337();
			this.aClass337_6.method7463(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method4427();
			if (local114 == 0) {
				break;
			}
			this.anIntArray272[local109] = local114;
			this.anIntArray270[local109] = arg0.method4434();
			this.anIntArray273[local109] = arg0.method4427();
		}
		this.anInt4442 = arg0.method4427();
		this.anInt4445 = arg0.method4427();
		this.anInt4443 = arg0.method4426();
		this.anInt4444 = arg0.method4426();
		this.aClass336_1 = new Class336();
		this.aClass337_9 = new Class337();
		this.aClass336_1.method7420(arg0, this.aClass337_9);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)[I")
	public int[] method3826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static600.method3764(Static234.anIntArray274, 0, arg0);
		if (arg1 < 10) {
			return Static234.anIntArray274;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass337_7.method7462();
		this.aClass337_1.method7462();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass337_4 != null) {
			this.aClass337_4.method7462();
			this.aClass337_5.method7462();
			local24 = (int) ((double) (this.aClass337_4.anInt9009 - this.aClass337_4.anInt9007) * 32.768D / local16);
			local26 = (int) ((double) this.aClass337_4.anInt9007 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass337_8 != null) {
			this.aClass337_8.method7462();
			this.aClass337_2.method7462();
			local63 = (int) ((double) (this.aClass337_8.anInt9009 - this.aClass337_8.anInt9007) * 32.768D / local16);
			local65 = (int) ((double) this.aClass337_8.anInt9007 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray272[local102] != 0) {
				Static234.anIntArray277[local102] = 0;
				Static234.anIntArray276[local102] = (int) ((double) this.anIntArray273[local102] * local16);
				Static234.anIntArray275[local102] = (this.anIntArray272[local102] << 14) / 100;
				Static234.anIntArray278[local102] = (int) ((double) (this.aClass337_7.anInt9009 - this.aClass337_7.anInt9007) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray270[local102]) / local16);
				Static234.anIntArray279[local102] = (int) ((double) this.aClass337_7.anInt9007 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass337_7.method7461(arg0);
			local187 = this.aClass337_1.method7461(arg0);
			if (this.aClass337_4 != null) {
				local195 = this.aClass337_4.method7461(arg0);
				local200 = this.aClass337_5.method7461(arg0);
				local182 += this.method3824(local28, local200, this.aClass337_4.anInt9010) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass337_8 != null) {
				local195 = this.aClass337_8.method7461(arg0);
				local200 = this.aClass337_2.method7461(arg0);
				local187 = local187 * ((this.method3824(local67, local200, this.aClass337_8.anInt9010) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray272[local195] != 0) {
					local200 = local176 + Static234.anIntArray276[local195];
					if (local200 < arg0) {
						Static234.anIntArray274[local200] += this.method3824(Static234.anIntArray277[local195], local187 * Static234.anIntArray275[local195] >> 15, this.aClass337_7.anInt9010);
						Static234.anIntArray277[local195] += (local182 * Static234.anIntArray278[local195] >> 16) + Static234.anIntArray279[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass337_3 != null) {
			this.aClass337_3.method7462();
			this.aClass337_6.method7462();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass337_3.method7461(arg0);
				local352 = this.aClass337_6.method7461(arg0);
				if (local339) {
					local187 = this.aClass337_3.anInt9007 + ((this.aClass337_3.anInt9009 - this.aClass337_3.anInt9007) * local347 >> 8);
				} else {
					local187 = this.aClass337_3.anInt9007 + ((this.aClass337_3.anInt9009 - this.aClass337_3.anInt9007) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static234.anIntArray274[local200] = 0;
				}
			}
		}
		if (this.anInt4442 > 0 && this.anInt4445 > 0) {
			local182 = (int) ((double) this.anInt4442 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static234.anIntArray274[local187] += Static234.anIntArray274[local187 - local182] * this.anInt4445 / 100;
			}
		}
		if (this.aClass336_1.anIntArray602[0] > 0 || this.aClass336_1.anIntArray602[1] > 0) {
			this.aClass337_9.method7462();
			local182 = this.aClass337_9.method7461(arg0 + 1);
			local187 = this.aClass336_1.method7416(0, (float) local182 / 65536.0F);
			local195 = this.aClass336_1.method7416(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static234.anIntArray274[local200 + local187] * (long) Static547.anInt8994 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static234.anIntArray274[local200 + local187 - local519 - 1] * (long) Static547.anIntArrayArray56[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static234.anIntArray274[local200 - local549 - 1] * (long) Static547.anIntArrayArray56[1][local549] >> 16);
					}
					Static234.anIntArray274[local200] = local352;
					local182 = this.aClass337_9.method7461(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static234.anIntArray274[local200 + local187] * (long) Static547.anInt8994 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static234.anIntArray274[local200 + local187 - local519 - 1] * (long) Static547.anIntArrayArray56[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static234.anIntArray274[local200 - local549 - 1] * (long) Static547.anIntArrayArray56[1][local549] >> 16);
						}
						Static234.anIntArray274[local200] = local352;
						local182 = this.aClass337_9.method7461(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static234.anIntArray274[local200 + local187 - local519 - 1] * (long) Static547.anIntArrayArray56[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static234.anIntArray274[local200 - local549 - 1] * (long) Static547.anIntArrayArray56[1][local549] >> 16);
							}
							Static234.anIntArray274[local200] = local352;
							this.aClass337_9.method7461(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass336_1.method7416(0, (float) local182 / 65536.0F);
					local195 = this.aClass336_1.method7416(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static234.anIntArray274[local182] < -32768) {
				Static234.anIntArray274[local182] = -32768;
			}
			if (Static234.anIntArray274[local182] > 32767) {
				Static234.anIntArray274[local182] = 32767;
			}
		}
		return Static234.anIntArray274;
	}
}
