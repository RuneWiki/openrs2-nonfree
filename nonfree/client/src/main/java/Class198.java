import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kga")
public final class Class198 {

	@OriginalMember(owner = "client!kga", name = "p", descriptor = "[I")
	private static final int[] anIntArray417 = new int[32768];

	@OriginalMember(owner = "client!kga", name = "j", descriptor = "[I")
	private static final int[] anIntArray415;

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "Lclient!kba;")
	private Class194 aClass194_1;

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "Lclient!kba;")
	private Class194 aClass194_2;

	@OriginalMember(owner = "client!kga", name = "g", descriptor = "Lclient!kba;")
	private Class194 aClass194_3;

	@OriginalMember(owner = "client!kga", name = "h", descriptor = "Lclient!kba;")
	private Class194 aClass194_4;

	@OriginalMember(owner = "client!kga", name = "i", descriptor = "Lclient!kba;")
	private Class194 aClass194_5;

	@OriginalMember(owner = "client!kga", name = "k", descriptor = "Lclient!kba;")
	private Class194 aClass194_6;

	@OriginalMember(owner = "client!kga", name = "o", descriptor = "Lclient!kba;")
	private Class194 aClass194_7;

	@OriginalMember(owner = "client!kga", name = "r", descriptor = "Lclient!di;")
	private Class74 aClass74_1;

	@OriginalMember(owner = "client!kga", name = "s", descriptor = "Lclient!kba;")
	private Class194 aClass194_8;

	@OriginalMember(owner = "client!kga", name = "t", descriptor = "Lclient!kba;")
	private Class194 aClass194_9;

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "[I")
	private final int[] anIntArray412 = new int[5];

	@OriginalMember(owner = "client!kga", name = "e", descriptor = "[I")
	private final int[] anIntArray414 = new int[5];

	@OriginalMember(owner = "client!kga", name = "f", descriptor = "I")
	private int anInt5275 = 0;

	@OriginalMember(owner = "client!kga", name = "q", descriptor = "I")
	private int anInt5278 = 100;

	@OriginalMember(owner = "client!kga", name = "m", descriptor = "I")
	public int anInt5277 = 500;

	@OriginalMember(owner = "client!kga", name = "l", descriptor = "I")
	public int anInt5276 = 0;

	@OriginalMember(owner = "client!kga", name = "n", descriptor = "[I")
	private final int[] anIntArray416 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray417[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray415 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray415[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(III)I")
	private int method4417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray415[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray417[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!so;)V")
	public void method4418(@OriginalArg(0) Class14_Sub29 arg0) {
		this.aClass194_6 = new Class194();
		this.aClass194_6.method4365(arg0);
		this.aClass194_8 = new Class194();
		this.aClass194_8.method4365(arg0);
		@Pc(21) int local21 = arg0.method5866();
		if (local21 != 0) {
			arg0.anInt7264--;
			this.aClass194_5 = new Class194();
			this.aClass194_5.method4365(arg0);
			this.aClass194_2 = new Class194();
			this.aClass194_2.method4365(arg0);
		}
		local21 = arg0.method5866();
		if (local21 != 0) {
			arg0.anInt7264--;
			this.aClass194_3 = new Class194();
			this.aClass194_3.method4365(arg0);
			this.aClass194_1 = new Class194();
			this.aClass194_1.method4365(arg0);
		}
		local21 = arg0.method5866();
		if (local21 != 0) {
			arg0.anInt7264--;
			this.aClass194_7 = new Class194();
			this.aClass194_7.method4365(arg0);
			this.aClass194_9 = new Class194();
			this.aClass194_9.method4365(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method5895();
			if (local114 == 0) {
				break;
			}
			this.anIntArray412[local109] = local114;
			this.anIntArray416[local109] = arg0.method5881();
			this.anIntArray414[local109] = arg0.method5895();
		}
		this.anInt5275 = arg0.method5895();
		this.anInt5278 = arg0.method5895();
		this.anInt5277 = arg0.method5900();
		this.anInt5276 = arg0.method5900();
		this.aClass74_1 = new Class74();
		this.aClass194_4 = new Class194();
		this.aClass74_1.method1830(arg0, this.aClass194_4);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(II)[I")
	public int[] method4419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static681.method2480(Static301.anIntArray413, 0, arg0);
		if (arg1 < 10) {
			return Static301.anIntArray413;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass194_6.method4364();
		this.aClass194_8.method4364();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass194_5 != null) {
			this.aClass194_5.method4364();
			this.aClass194_2.method4364();
			local24 = (int) ((double) (this.aClass194_5.anInt5225 - this.aClass194_5.anInt5224) * 32.768D / local16);
			local26 = (int) ((double) this.aClass194_5.anInt5224 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass194_3 != null) {
			this.aClass194_3.method4364();
			this.aClass194_1.method4364();
			local63 = (int) ((double) (this.aClass194_3.anInt5225 - this.aClass194_3.anInt5224) * 32.768D / local16);
			local65 = (int) ((double) this.aClass194_3.anInt5224 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray412[local102] != 0) {
				Static301.anIntArray420[local102] = 0;
				Static301.anIntArray421[local102] = (int) ((double) this.anIntArray414[local102] * local16);
				Static301.anIntArray422[local102] = (this.anIntArray412[local102] << 14) / 100;
				Static301.anIntArray419[local102] = (int) ((double) (this.aClass194_6.anInt5225 - this.aClass194_6.anInt5224) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray416[local102]) / local16);
				Static301.anIntArray418[local102] = (int) ((double) this.aClass194_6.anInt5224 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass194_6.method4366(arg0);
			local187 = this.aClass194_8.method4366(arg0);
			if (this.aClass194_5 != null) {
				local195 = this.aClass194_5.method4366(arg0);
				local200 = this.aClass194_2.method4366(arg0);
				local182 += this.method4417(local28, local200, this.aClass194_5.anInt5223) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass194_3 != null) {
				local195 = this.aClass194_3.method4366(arg0);
				local200 = this.aClass194_1.method4366(arg0);
				local187 = local187 * ((this.method4417(local67, local200, this.aClass194_3.anInt5223) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray412[local195] != 0) {
					local200 = local176 + Static301.anIntArray421[local195];
					if (local200 < arg0) {
						Static301.anIntArray413[local200] += this.method4417(Static301.anIntArray420[local195], local187 * Static301.anIntArray422[local195] >> 15, this.aClass194_6.anInt5223);
						Static301.anIntArray420[local195] += (local182 * Static301.anIntArray419[local195] >> 16) + Static301.anIntArray418[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass194_7 != null) {
			this.aClass194_7.method4364();
			this.aClass194_9.method4364();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass194_7.method4366(arg0);
				local352 = this.aClass194_9.method4366(arg0);
				if (local339) {
					local187 = this.aClass194_7.anInt5224 + ((this.aClass194_7.anInt5225 - this.aClass194_7.anInt5224) * local347 >> 8);
				} else {
					local187 = this.aClass194_7.anInt5224 + ((this.aClass194_7.anInt5225 - this.aClass194_7.anInt5224) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static301.anIntArray413[local200] = 0;
				}
			}
		}
		if (this.anInt5275 > 0 && this.anInt5278 > 0) {
			local182 = (int) ((double) this.anInt5275 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static301.anIntArray413[local187] += Static301.anIntArray413[local187 - local182] * this.anInt5278 / 100;
			}
		}
		if (this.aClass74_1.anIntArray167[0] > 0 || this.aClass74_1.anIntArray167[1] > 0) {
			this.aClass194_4.method4364();
			local182 = this.aClass194_4.method4366(arg0 + 1);
			local187 = this.aClass74_1.method1833(0, (float) local182 / 65536.0F);
			local195 = this.aClass74_1.method1833(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static301.anIntArray413[local200 + local187] * (long) Static103.anInt2166 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static301.anIntArray413[local200 + local187 - local519 - 1] * (long) Static103.anIntArrayArray9[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static301.anIntArray413[local200 - local549 - 1] * (long) Static103.anIntArrayArray9[1][local549] >> 16);
					}
					Static301.anIntArray413[local200] = local352;
					local182 = this.aClass194_4.method4366(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static301.anIntArray413[local200 + local187] * (long) Static103.anInt2166 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static301.anIntArray413[local200 + local187 - local519 - 1] * (long) Static103.anIntArrayArray9[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static301.anIntArray413[local200 - local549 - 1] * (long) Static103.anIntArrayArray9[1][local549] >> 16);
						}
						Static301.anIntArray413[local200] = local352;
						local182 = this.aClass194_4.method4366(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static301.anIntArray413[local200 + local187 - local519 - 1] * (long) Static103.anIntArrayArray9[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static301.anIntArray413[local200 - local549 - 1] * (long) Static103.anIntArrayArray9[1][local549] >> 16);
							}
							Static301.anIntArray413[local200] = local352;
							this.aClass194_4.method4366(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass74_1.method1833(0, (float) local182 / 65536.0F);
					local195 = this.aClass74_1.method1833(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static301.anIntArray413[local182] < -32768) {
				Static301.anIntArray413[local182] = -32768;
			}
			if (Static301.anIntArray413[local182] > 32767) {
				Static301.anIntArray413[local182] = 32767;
			}
		}
		return Static301.anIntArray413;
	}
}
