import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class178 {

	@OriginalMember(owner = "client!ph", name = "t", descriptor = "[I")
	private static final int[] anIntArray344 = new int[32768];

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "[I")
	private static final int[] anIntArray342;

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "[I")
	private static final int[] anIntArray339;

	@OriginalMember(owner = "client!ph", name = "v", descriptor = "[I")
	private static final int[] anIntArray346;

	@OriginalMember(owner = "client!ph", name = "y", descriptor = "[I")
	private static final int[] anIntArray349;

	@OriginalMember(owner = "client!ph", name = "w", descriptor = "[I")
	private static final int[] anIntArray347;

	@OriginalMember(owner = "client!ph", name = "x", descriptor = "[I")
	private static final int[] anIntArray348;

	@OriginalMember(owner = "client!ph", name = "u", descriptor = "[I")
	private static final int[] anIntArray345;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "Lclient!uf;")
	private Class232 aClass232_1;

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "Lclient!uf;")
	private Class232 aClass232_2;

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "Lclient!uf;")
	private Class232 aClass232_3;

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "Lclient!uf;")
	private Class232 aClass232_4;

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "Lclient!uf;")
	private Class232 aClass232_5;

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "Lclient!uf;")
	private Class232 aClass232_6;

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "Lclient!uf;")
	private Class232 aClass232_7;

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "Lclient!pc;")
	private Class176 aClass176_1;

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "Lclient!uf;")
	private Class232 aClass232_8;

	@OriginalMember(owner = "client!ph", name = "s", descriptor = "Lclient!uf;")
	private Class232 aClass232_9;

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
	public int anInt4950 = 500;

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
	private int anInt4951 = 0;

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
	private int anInt4952 = 100;

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
	public int anInt4953 = 0;

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "[I")
	private final int[] anIntArray341 = new int[5];

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "[I")
	private final int[] anIntArray340 = new int[5];

	@OriginalMember(owner = "client!ph", name = "r", descriptor = "[I")
	private final int[] anIntArray343 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray344[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray342 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray342[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
		anIntArray339 = new int[220500];
		anIntArray346 = new int[5];
		anIntArray349 = new int[5];
		anIntArray347 = new int[5];
		anIntArray348 = new int[5];
		anIntArray345 = new int[5];
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)I", line = 9)
	private int method4550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray342[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray344[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)[I", line = 40)
	public int[] method4551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static390.method4609(anIntArray339, 0, arg0);
		if (arg1 < 10) {
			return anIntArray339;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass232_9.method5843();
		this.aClass232_8.method5843();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass232_1 != null) {
			this.aClass232_1.method5843();
			this.aClass232_6.method5843();
			local24 = (int) ((double) (this.aClass232_1.anInt6448 - this.aClass232_1.anInt6450) * 32.768D / local16);
			local26 = (int) ((double) this.aClass232_1.anInt6450 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass232_7 != null) {
			this.aClass232_7.method5843();
			this.aClass232_3.method5843();
			local63 = (int) ((double) (this.aClass232_7.anInt6448 - this.aClass232_7.anInt6450) * 32.768D / local16);
			local65 = (int) ((double) this.aClass232_7.anInt6450 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray343[local102] != 0) {
				anIntArray345[local102] = 0;
				anIntArray346[local102] = (int) ((double) this.anIntArray341[local102] * local16);
				anIntArray348[local102] = (this.anIntArray343[local102] << 14) / 100;
				anIntArray349[local102] = (int) ((double) (this.aClass232_9.anInt6448 - this.aClass232_9.anInt6450) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray340[local102]) / local16);
				anIntArray347[local102] = (int) ((double) this.aClass232_9.anInt6450 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass232_9.method5841(arg0);
			local187 = this.aClass232_8.method5841(arg0);
			if (this.aClass232_1 != null) {
				local195 = this.aClass232_1.method5841(arg0);
				local200 = this.aClass232_6.method5841(arg0);
				local182 += this.method4550(local28, local200, this.aClass232_1.anInt6447) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass232_7 != null) {
				local195 = this.aClass232_7.method5841(arg0);
				local200 = this.aClass232_3.method5841(arg0);
				local187 = local187 * ((this.method4550(local67, local200, this.aClass232_7.anInt6447) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray343[local195] != 0) {
					local200 = local176 + anIntArray346[local195];
					if (local200 < arg0) {
						anIntArray339[local200] += this.method4550(anIntArray345[local195], local187 * anIntArray348[local195] >> 15, this.aClass232_9.anInt6447);
						anIntArray345[local195] += (local182 * anIntArray349[local195] >> 16) + anIntArray347[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass232_4 != null) {
			this.aClass232_4.method5843();
			this.aClass232_5.method5843();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass232_4.method5841(arg0);
				local352 = this.aClass232_5.method5841(arg0);
				if (local339) {
					local187 = this.aClass232_4.anInt6450 + ((this.aClass232_4.anInt6448 - this.aClass232_4.anInt6450) * local347 >> 8);
				} else {
					local187 = this.aClass232_4.anInt6450 + ((this.aClass232_4.anInt6448 - this.aClass232_4.anInt6450) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					anIntArray339[local200] = 0;
				}
			}
		}
		if (this.anInt4951 > 0 && this.anInt4952 > 0) {
			local182 = (int) ((double) this.anInt4951 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				anIntArray339[local187] += anIntArray339[local187 - local182] * this.anInt4952 / 100;
			}
		}
		if (this.aClass176_1.anIntArray332[0] > 0 || this.aClass176_1.anIntArray332[1] > 0) {
			this.aClass232_2.method5843();
			local182 = this.aClass232_2.method5841(arg0 + 1);
			local187 = this.aClass176_1.method4471(0, (float) local182 / 65536.0F);
			local195 = this.aClass176_1.method4471(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) anIntArray339[local200 + local187] * (long) Static243.anInt4829 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) anIntArray339[local200 + local187 - local519 - 1] * (long) Class176.anIntArrayArray40[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) anIntArray339[local200 - local549 - 1] * (long) Class176.anIntArrayArray40[1][local549] >> 16);
					}
					anIntArray339[local200] = local352;
					local182 = this.aClass232_2.method5841(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) anIntArray339[local200 + local187] * (long) Static243.anInt4829 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) anIntArray339[local200 + local187 - local519 - 1] * (long) Class176.anIntArrayArray40[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) anIntArray339[local200 - local549 - 1] * (long) Class176.anIntArrayArray40[1][local549] >> 16);
						}
						anIntArray339[local200] = local352;
						local182 = this.aClass232_2.method5841(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) anIntArray339[local200 + local187 - local519 - 1] * (long) Class176.anIntArrayArray40[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) anIntArray339[local200 - local549 - 1] * (long) Class176.anIntArrayArray40[1][local549] >> 16);
							}
							anIntArray339[local200] = local352;
							this.aClass232_2.method5841(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass176_1.method4471(0, (float) local182 / 65536.0F);
					local195 = this.aClass176_1.method4471(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (anIntArray339[local182] < -32768) {
				anIntArray339[local182] = -32768;
			}
			if (anIntArray339[local182] > 32767) {
				anIntArray339[local182] = 32767;
			}
		}
		return anIntArray339;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!bt;)V", line = 339)
	public void method4553(@OriginalArg(0) Class2_Sub4 arg0) {
		this.aClass232_9 = new Class232();
		this.aClass232_9.method5842(arg0);
		this.aClass232_8 = new Class232();
		this.aClass232_8.method5842(arg0);
		@Pc(21) int local21 = arg0.method4816();
		if (local21 != 0) {
			arg0.anInt5289--;
			this.aClass232_1 = new Class232();
			this.aClass232_1.method5842(arg0);
			this.aClass232_6 = new Class232();
			this.aClass232_6.method5842(arg0);
		}
		local21 = arg0.method4816();
		if (local21 != 0) {
			arg0.anInt5289--;
			this.aClass232_7 = new Class232();
			this.aClass232_7.method5842(arg0);
			this.aClass232_3 = new Class232();
			this.aClass232_3.method5842(arg0);
		}
		local21 = arg0.method4816();
		if (local21 != 0) {
			arg0.anInt5289--;
			this.aClass232_4 = new Class232();
			this.aClass232_4.method5842(arg0);
			this.aClass232_5 = new Class232();
			this.aClass232_5.method5842(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method4818();
			if (local114 == 0) {
				break;
			}
			this.anIntArray343[local109] = local114;
			this.anIntArray340[local109] = arg0.method4819();
			this.anIntArray341[local109] = arg0.method4818();
		}
		this.anInt4951 = arg0.method4818();
		this.anInt4952 = arg0.method4818();
		this.anInt4950 = arg0.method4830();
		this.anInt4953 = arg0.method4830();
		this.aClass176_1 = new Class176();
		this.aClass232_2 = new Class232();
		this.aClass176_1.method4469(arg0, this.aClass232_2);
	}
}
