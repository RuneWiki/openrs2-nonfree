import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class297 {

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "[I")
	private static final int[] anIntArray463 = new int[32768];

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "[I")
	private static final int[] anIntArray462;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "Lclient!nj;")
	private Class251 aClass251_1;

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "Lclient!nj;")
	private Class251 aClass251_2;

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "Lclient!nj;")
	private Class251 aClass251_3;

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "Lclient!nj;")
	private Class251 aClass251_4;

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "Lclient!cm;")
	private Class67 aClass67_1;

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "Lclient!nj;")
	private Class251 aClass251_5;

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "Lclient!nj;")
	private Class251 aClass251_6;

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "Lclient!nj;")
	private Class251 aClass251_7;

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "Lclient!nj;")
	private Class251 aClass251_8;

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "Lclient!nj;")
	private Class251 aClass251_9;

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
	private int anInt8311 = 0;

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
	private int anInt8314 = 100;

	@OriginalMember(owner = "client!ra", name = "x", descriptor = "[I")
	private final int[] anIntArray471 = new int[5];

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
	public int anInt8313 = 500;

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "[I")
	private final int[] anIntArray468 = new int[5];

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "[I")
	private final int[] anIntArray469 = new int[5];

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
	public int anInt8312 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray463[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray462 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray462[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!mc;)V")
	public void method7111(@OriginalArg(0) Class5_Sub41 arg0) {
		this.aClass251_6 = new Class251();
		this.aClass251_6.method5863(arg0);
		this.aClass251_3 = new Class251();
		this.aClass251_3.method5863(arg0);
		@Pc(21) int local21 = arg0.method7816();
		if (local21 != 0) {
			arg0.anInt9230--;
			this.aClass251_5 = new Class251();
			this.aClass251_5.method5863(arg0);
			this.aClass251_8 = new Class251();
			this.aClass251_8.method5863(arg0);
		}
		local21 = arg0.method7816();
		if (local21 != 0) {
			arg0.anInt9230--;
			this.aClass251_4 = new Class251();
			this.aClass251_4.method5863(arg0);
			this.aClass251_7 = new Class251();
			this.aClass251_7.method5863(arg0);
		}
		local21 = arg0.method7816();
		if (local21 != 0) {
			arg0.anInt9230--;
			this.aClass251_9 = new Class251();
			this.aClass251_9.method5863(arg0);
			this.aClass251_2 = new Class251();
			this.aClass251_2.method5863(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method7812();
			if (local114 == 0) {
				break;
			}
			this.anIntArray469[local109] = local114;
			this.anIntArray468[local109] = arg0.method7845();
			this.anIntArray471[local109] = arg0.method7812();
		}
		this.anInt8311 = arg0.method7812();
		this.anInt8314 = arg0.method7812();
		this.anInt8313 = arg0.method7860();
		this.anInt8312 = arg0.method7860();
		this.aClass67_1 = new Class67();
		this.aClass251_1 = new Class251();
		this.aClass67_1.method1832(arg0, this.aClass251_1);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)I")
	private int method7113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray462[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray463[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)[I")
	public int[] method7114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static686.method4969(Static498.anIntArray464, 0, arg0);
		if (arg1 < 10) {
			return Static498.anIntArray464;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass251_6.method5862();
		this.aClass251_3.method5862();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass251_5 != null) {
			this.aClass251_5.method5862();
			this.aClass251_8.method5862();
			local24 = (int) ((double) (this.aClass251_5.anInt7061 - this.aClass251_5.anInt7063) * 32.768D / local16);
			local26 = (int) ((double) this.aClass251_5.anInt7063 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass251_4 != null) {
			this.aClass251_4.method5862();
			this.aClass251_7.method5862();
			local63 = (int) ((double) (this.aClass251_4.anInt7061 - this.aClass251_4.anInt7063) * 32.768D / local16);
			local65 = (int) ((double) this.aClass251_4.anInt7063 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray469[local102] != 0) {
				Static498.anIntArray472[local102] = 0;
				Static498.anIntArray470[local102] = (int) ((double) this.anIntArray471[local102] * local16);
				Static498.anIntArray467[local102] = (this.anIntArray469[local102] << 14) / 100;
				Static498.anIntArray466[local102] = (int) ((double) (this.aClass251_6.anInt7061 - this.aClass251_6.anInt7063) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray468[local102]) / local16);
				Static498.anIntArray465[local102] = (int) ((double) this.aClass251_6.anInt7063 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass251_6.method5860(arg0);
			local187 = this.aClass251_3.method5860(arg0);
			if (this.aClass251_5 != null) {
				local195 = this.aClass251_5.method5860(arg0);
				local200 = this.aClass251_8.method5860(arg0);
				local182 += this.method7113(local28, local200, this.aClass251_5.anInt7064) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass251_4 != null) {
				local195 = this.aClass251_4.method5860(arg0);
				local200 = this.aClass251_7.method5860(arg0);
				local187 = local187 * ((this.method7113(local67, local200, this.aClass251_4.anInt7064) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray469[local195] != 0) {
					local200 = local176 + Static498.anIntArray470[local195];
					if (local200 < arg0) {
						Static498.anIntArray464[local200] += this.method7113(Static498.anIntArray472[local195], local187 * Static498.anIntArray467[local195] >> 15, this.aClass251_6.anInt7064);
						Static498.anIntArray472[local195] += (local182 * Static498.anIntArray466[local195] >> 16) + Static498.anIntArray465[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass251_9 != null) {
			this.aClass251_9.method5862();
			this.aClass251_2.method5862();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass251_9.method5860(arg0);
				local352 = this.aClass251_2.method5860(arg0);
				if (local339) {
					local187 = this.aClass251_9.anInt7063 + ((this.aClass251_9.anInt7061 - this.aClass251_9.anInt7063) * local347 >> 8);
				} else {
					local187 = this.aClass251_9.anInt7063 + ((this.aClass251_9.anInt7061 - this.aClass251_9.anInt7063) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static498.anIntArray464[local200] = 0;
				}
			}
		}
		if (this.anInt8311 > 0 && this.anInt8314 > 0) {
			local182 = (int) ((double) this.anInt8311 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static498.anIntArray464[local187] += Static498.anIntArray464[local187 - local182] * this.anInt8314 / 100;
			}
		}
		if (this.aClass67_1.anIntArray73[0] > 0 || this.aClass67_1.anIntArray73[1] > 0) {
			this.aClass251_1.method5862();
			local182 = this.aClass251_1.method5860(arg0 + 1);
			local187 = this.aClass67_1.method1831(0, (float) local182 / 65536.0F);
			local195 = this.aClass67_1.method1831(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static498.anIntArray464[local200 + local187] * (long) Static85.anInt2025 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static498.anIntArray464[local200 + local187 - local519 - 1] * (long) Static85.anIntArrayArray4[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static498.anIntArray464[local200 - local549 - 1] * (long) Static85.anIntArrayArray4[1][local549] >> 16);
					}
					Static498.anIntArray464[local200] = local352;
					local182 = this.aClass251_1.method5860(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static498.anIntArray464[local200 + local187] * (long) Static85.anInt2025 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static498.anIntArray464[local200 + local187 - local519 - 1] * (long) Static85.anIntArrayArray4[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static498.anIntArray464[local200 - local549 - 1] * (long) Static85.anIntArrayArray4[1][local549] >> 16);
						}
						Static498.anIntArray464[local200] = local352;
						local182 = this.aClass251_1.method5860(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static498.anIntArray464[local200 + local187 - local519 - 1] * (long) Static85.anIntArrayArray4[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static498.anIntArray464[local200 - local549 - 1] * (long) Static85.anIntArrayArray4[1][local549] >> 16);
							}
							Static498.anIntArray464[local200] = local352;
							this.aClass251_1.method5860(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass67_1.method1831(0, (float) local182 / 65536.0F);
					local195 = this.aClass67_1.method1831(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static498.anIntArray464[local182] < -32768) {
				Static498.anIntArray464[local182] = -32768;
			}
			if (Static498.anIntArray464[local182] > 32767) {
				Static498.anIntArray464[local182] = 32767;
			}
		}
		return Static498.anIntArray464;
	}
}
