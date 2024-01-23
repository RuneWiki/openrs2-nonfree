import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class42 {

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "[I")
	private static int[] anIntArray143 = new int[32768];

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "[I")
	private static int[] anIntArray142;

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "Lclient!q;")
	private Class95 aClass95_1;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "Lclient!q;")
	private Class95 aClass95_2;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "Lclient!q;")
	private Class95 aClass95_3;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "Lclient!q;")
	private Class95 aClass95_4;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "Lclient!q;")
	private Class95 aClass95_5;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "Lclient!q;")
	private Class95 aClass95_6;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "Lclient!q;")
	private Class95 aClass95_7;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "Lclient!q;")
	private Class95 aClass95_8;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "Lclient!wj;")
	private Class128 aClass128_1;

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "Lclient!q;")
	private Class95 aClass95_9;

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
	private int anInt1561 = 100;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "[I")
	private int[] anIntArray138 = new int[5];

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	public int anInt1564 = 0;

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
	public int anInt1562 = 500;

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "[I")
	private int[] anIntArray140 = new int[5];

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
	private int anInt1563 = 0;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "[I")
	private int[] anIntArray141 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray143[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray142 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray142[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!vf;)V")
	public void method1230(@OriginalArg(0) Class1_Sub26 arg0) {
		this.aClass95_1 = new Class95();
		this.aClass95_1.method2690(arg0);
		this.aClass95_7 = new Class95();
		this.aClass95_7.method2690(arg0);
		@Pc(21) int local21 = arg0.method2945();
		if (local21 != 0) {
			arg0.anInt4021--;
			this.aClass95_2 = new Class95();
			this.aClass95_2.method2690(arg0);
			this.aClass95_6 = new Class95();
			this.aClass95_6.method2690(arg0);
		}
		local21 = arg0.method2945();
		if (local21 != 0) {
			arg0.anInt4021--;
			this.aClass95_3 = new Class95();
			this.aClass95_3.method2690(arg0);
			this.aClass95_5 = new Class95();
			this.aClass95_5.method2690(arg0);
		}
		local21 = arg0.method2945();
		if (local21 != 0) {
			arg0.anInt4021--;
			this.aClass95_9 = new Class95();
			this.aClass95_9.method2690(arg0);
			this.aClass95_4 = new Class95();
			this.aClass95_4.method2690(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method2946();
			if (local114 == 0) {
				break;
			}
			this.anIntArray138[local109] = local114;
			this.anIntArray141[local109] = arg0.method2965();
			this.anIntArray140[local109] = arg0.method2946();
		}
		this.anInt1563 = arg0.method2946();
		this.anInt1561 = arg0.method2946();
		this.anInt1562 = arg0.method2964();
		this.anInt1564 = arg0.method2964();
		this.aClass128_1 = new Class128();
		this.aClass95_8 = new Class95();
		this.aClass128_1.method3750(arg0, this.aClass95_8);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)[I")
	public int[] method1232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static236.method298(Static68.anIntArray139, 0, arg0);
		if (arg1 < 10) {
			return Static68.anIntArray139;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass95_1.method2689();
		this.aClass95_7.method2689();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass95_2 != null) {
			this.aClass95_2.method2689();
			this.aClass95_6.method2689();
			local24 = (int) ((double) (this.aClass95_2.anInt3638 - this.aClass95_2.anInt3636) * 32.768D / local16);
			local26 = (int) ((double) this.aClass95_2.anInt3636 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass95_3 != null) {
			this.aClass95_3.method2689();
			this.aClass95_5.method2689();
			local63 = (int) ((double) (this.aClass95_3.anInt3638 - this.aClass95_3.anInt3636) * 32.768D / local16);
			local65 = (int) ((double) this.aClass95_3.anInt3636 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray138[local102] != 0) {
				Static68.anIntArray148[local102] = 0;
				Static68.anIntArray146[local102] = (int) ((double) this.anIntArray140[local102] * local16);
				Static68.anIntArray144[local102] = (this.anIntArray138[local102] << 14) / 100;
				Static68.anIntArray147[local102] = (int) ((double) (this.aClass95_1.anInt3638 - this.aClass95_1.anInt3636) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray141[local102]) / local16);
				Static68.anIntArray145[local102] = (int) ((double) this.aClass95_1.anInt3636 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass95_1.method2692(arg0);
			local187 = this.aClass95_7.method2692(arg0);
			if (this.aClass95_2 != null) {
				local195 = this.aClass95_2.method2692(arg0);
				local200 = this.aClass95_6.method2692(arg0);
				local182 += this.method1233(local28, local200, this.aClass95_2.anInt3637) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass95_3 != null) {
				local195 = this.aClass95_3.method2692(arg0);
				local200 = this.aClass95_5.method2692(arg0);
				local187 = local187 * ((this.method1233(local67, local200, this.aClass95_3.anInt3637) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray138[local195] != 0) {
					local200 = local176 + Static68.anIntArray146[local195];
					if (local200 < arg0) {
						Static68.anIntArray139[local200] += this.method1233(Static68.anIntArray148[local195], local187 * Static68.anIntArray144[local195] >> 15, this.aClass95_1.anInt3637);
						Static68.anIntArray148[local195] += (local182 * Static68.anIntArray147[local195] >> 16) + Static68.anIntArray145[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass95_9 != null) {
			this.aClass95_9.method2689();
			this.aClass95_4.method2689();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass95_9.method2692(arg0);
				local352 = this.aClass95_4.method2692(arg0);
				if (local339) {
					local187 = this.aClass95_9.anInt3636 + ((this.aClass95_9.anInt3638 - this.aClass95_9.anInt3636) * local347 >> 8);
				} else {
					local187 = this.aClass95_9.anInt3636 + ((this.aClass95_9.anInt3638 - this.aClass95_9.anInt3636) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static68.anIntArray139[local200] = 0;
				}
			}
		}
		if (this.anInt1563 > 0 && this.anInt1561 > 0) {
			local182 = (int) ((double) this.anInt1563 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static68.anIntArray139[local187] += Static68.anIntArray139[local187 - local182] * this.anInt1561 / 100;
			}
		}
		if (this.aClass128_1.anIntArray383[0] > 0 || this.aClass128_1.anIntArray383[1] > 0) {
			this.aClass95_8.method2689();
			local182 = this.aClass95_8.method2692(arg0 + 1);
			local187 = this.aClass128_1.method3749(0, (float) local182 / 65536.0F);
			local195 = this.aClass128_1.method3749(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static68.anIntArray139[local200 + local187] * (long) Static234.anInt5004 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static68.anIntArray139[local200 + local187 - local519 - 1] * (long) Static234.anIntArrayArray45[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static68.anIntArray139[local200 - local549 - 1] * (long) Static234.anIntArrayArray45[1][local549] >> 16);
					}
					Static68.anIntArray139[local200] = local352;
					local182 = this.aClass95_8.method2692(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static68.anIntArray139[local200 + local187] * (long) Static234.anInt5004 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static68.anIntArray139[local200 + local187 - local519 - 1] * (long) Static234.anIntArrayArray45[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static68.anIntArray139[local200 - local549 - 1] * (long) Static234.anIntArrayArray45[1][local549] >> 16);
						}
						Static68.anIntArray139[local200] = local352;
						local182 = this.aClass95_8.method2692(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static68.anIntArray139[local200 + local187 - local519 - 1] * (long) Static234.anIntArrayArray45[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static68.anIntArray139[local200 - local549 - 1] * (long) Static234.anIntArrayArray45[1][local549] >> 16);
							}
							Static68.anIntArray139[local200] = local352;
							this.aClass95_8.method2692(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass128_1.method3749(0, (float) local182 / 65536.0F);
					local195 = this.aClass128_1.method3749(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static68.anIntArray139[local182] < -32768) {
				Static68.anIntArray139[local182] = -32768;
			}
			if (Static68.anIntArray139[local182] > 32767) {
				Static68.anIntArray139[local182] = 32767;
			}
		}
		return Static68.anIntArray139;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)I")
	private int method1233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray142[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray143[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
