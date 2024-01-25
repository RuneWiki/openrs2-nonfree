import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class250 {

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "[I")
	private static final int[] anIntArray475 = new int[32768];

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "[I")
	private static final int[] anIntArray479;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "Lclient!tg;")
	private Class235 aClass235_1;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "Lclient!mi;")
	private Class153 aClass153_1;

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "Lclient!mi;")
	private Class153 aClass153_2;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "Lclient!mi;")
	private Class153 aClass153_3;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "Lclient!mi;")
	private Class153 aClass153_4;

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "Lclient!mi;")
	private Class153 aClass153_5;

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "Lclient!mi;")
	private Class153 aClass153_6;

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "Lclient!mi;")
	private Class153 aClass153_7;

	@OriginalMember(owner = "client!vd", name = "s", descriptor = "Lclient!mi;")
	private Class153 aClass153_8;

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "Lclient!mi;")
	private Class153 aClass153_9;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
	private int anInt7152 = 0;

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "[I")
	private final int[] anIntArray477 = new int[5];

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
	private int anInt7153 = 100;

	@OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
	public int anInt7155 = 0;

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "[I")
	private final int[] anIntArray480 = new int[5];

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "[I")
	private final int[] anIntArray478 = new int[5];

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
	public int anInt7154 = 500;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray475[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray479 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray479[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)[I")
	public int[] method5605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static468.method5040(Static422.anIntArray476, 0, arg0);
		if (arg1 < 10) {
			return Static422.anIntArray476;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass153_4.method3532();
		this.aClass153_3.method3532();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass153_5 != null) {
			this.aClass153_5.method3532();
			this.aClass153_8.method3532();
			local24 = (int) ((double) (this.aClass153_5.anInt4473 - this.aClass153_5.anInt4476) * 32.768D / local16);
			local26 = (int) ((double) this.aClass153_5.anInt4476 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass153_6 != null) {
			this.aClass153_6.method3532();
			this.aClass153_2.method3532();
			local63 = (int) ((double) (this.aClass153_6.anInt4473 - this.aClass153_6.anInt4476) * 32.768D / local16);
			local65 = (int) ((double) this.aClass153_6.anInt4476 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray478[local102] != 0) {
				Static422.anIntArray481[local102] = 0;
				Static422.anIntArray485[local102] = (int) ((double) this.anIntArray477[local102] * local16);
				Static422.anIntArray484[local102] = (this.anIntArray478[local102] << 14) / 100;
				Static422.anIntArray483[local102] = (int) ((double) (this.aClass153_4.anInt4473 - this.aClass153_4.anInt4476) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray480[local102]) / local16);
				Static422.anIntArray482[local102] = (int) ((double) this.aClass153_4.anInt4476 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass153_4.method3533(arg0);
			local187 = this.aClass153_3.method3533(arg0);
			if (this.aClass153_5 != null) {
				local195 = this.aClass153_5.method3533(arg0);
				local200 = this.aClass153_8.method3533(arg0);
				local182 += this.method5607(local28, local200, this.aClass153_5.anInt4474) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass153_6 != null) {
				local195 = this.aClass153_6.method3533(arg0);
				local200 = this.aClass153_2.method3533(arg0);
				local187 = local187 * ((this.method5607(local67, local200, this.aClass153_6.anInt4474) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray478[local195] != 0) {
					local200 = local176 + Static422.anIntArray485[local195];
					if (local200 < arg0) {
						Static422.anIntArray476[local200] += this.method5607(Static422.anIntArray481[local195], local187 * Static422.anIntArray484[local195] >> 15, this.aClass153_4.anInt4474);
						Static422.anIntArray481[local195] += (local182 * Static422.anIntArray483[local195] >> 16) + Static422.anIntArray482[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass153_7 != null) {
			this.aClass153_7.method3532();
			this.aClass153_9.method3532();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass153_7.method3533(arg0);
				local352 = this.aClass153_9.method3533(arg0);
				if (local339) {
					local187 = this.aClass153_7.anInt4476 + ((this.aClass153_7.anInt4473 - this.aClass153_7.anInt4476) * local347 >> 8);
				} else {
					local187 = this.aClass153_7.anInt4476 + ((this.aClass153_7.anInt4473 - this.aClass153_7.anInt4476) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static422.anIntArray476[local200] = 0;
				}
			}
		}
		if (this.anInt7152 > 0 && this.anInt7153 > 0) {
			local182 = (int) ((double) this.anInt7152 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static422.anIntArray476[local187] += Static422.anIntArray476[local187 - local182] * this.anInt7153 / 100;
			}
		}
		if (this.aClass235_1.anIntArray431[0] > 0 || this.aClass235_1.anIntArray431[1] > 0) {
			this.aClass153_1.method3532();
			local182 = this.aClass153_1.method3533(arg0 + 1);
			local187 = this.aClass235_1.method5056(0, (float) local182 / 65536.0F);
			local195 = this.aClass235_1.method5056(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static422.anIntArray476[local200 + local187] * (long) Static386.anInt6424 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static422.anIntArray476[local200 + local187 - local519 - 1] * (long) Static386.anIntArrayArray59[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static422.anIntArray476[local200 - local549 - 1] * (long) Static386.anIntArrayArray59[1][local549] >> 16);
					}
					Static422.anIntArray476[local200] = local352;
					local182 = this.aClass153_1.method3533(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static422.anIntArray476[local200 + local187] * (long) Static386.anInt6424 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static422.anIntArray476[local200 + local187 - local519 - 1] * (long) Static386.anIntArrayArray59[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static422.anIntArray476[local200 - local549 - 1] * (long) Static386.anIntArrayArray59[1][local549] >> 16);
						}
						Static422.anIntArray476[local200] = local352;
						local182 = this.aClass153_1.method3533(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static422.anIntArray476[local200 + local187 - local519 - 1] * (long) Static386.anIntArrayArray59[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static422.anIntArray476[local200 - local549 - 1] * (long) Static386.anIntArrayArray59[1][local549] >> 16);
							}
							Static422.anIntArray476[local200] = local352;
							this.aClass153_1.method3533(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass235_1.method5056(0, (float) local182 / 65536.0F);
					local195 = this.aClass235_1.method5056(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static422.anIntArray476[local182] < -32768) {
				Static422.anIntArray476[local182] = -32768;
			}
			if (Static422.anIntArray476[local182] > 32767) {
				Static422.anIntArray476[local182] = 32767;
			}
		}
		return Static422.anIntArray476;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)I")
	private int method5607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray479[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray475[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!ug;)V")
	public void method5608(@OriginalArg(0) Class1_Sub28 arg0) {
		this.aClass153_4 = new Class153();
		this.aClass153_4.method3530(arg0);
		this.aClass153_3 = new Class153();
		this.aClass153_3.method3530(arg0);
		@Pc(21) int local21 = arg0.method5337();
		if (local21 != 0) {
			arg0.anInt6812--;
			this.aClass153_5 = new Class153();
			this.aClass153_5.method3530(arg0);
			this.aClass153_8 = new Class153();
			this.aClass153_8.method3530(arg0);
		}
		local21 = arg0.method5337();
		if (local21 != 0) {
			arg0.anInt6812--;
			this.aClass153_6 = new Class153();
			this.aClass153_6.method3530(arg0);
			this.aClass153_2 = new Class153();
			this.aClass153_2.method3530(arg0);
		}
		local21 = arg0.method5337();
		if (local21 != 0) {
			arg0.anInt6812--;
			this.aClass153_7 = new Class153();
			this.aClass153_7.method3530(arg0);
			this.aClass153_9 = new Class153();
			this.aClass153_9.method3530(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method5392();
			if (local114 == 0) {
				break;
			}
			this.anIntArray478[local109] = local114;
			this.anIntArray480[local109] = arg0.method5338();
			this.anIntArray477[local109] = arg0.method5392();
		}
		this.anInt7152 = arg0.method5392();
		this.anInt7153 = arg0.method5392();
		this.anInt7154 = arg0.method5335();
		this.anInt7155 = arg0.method5335();
		this.aClass235_1 = new Class235();
		this.aClass153_1 = new Class153();
		this.aClass235_1.method5057(arg0, this.aClass153_1);
	}
}
