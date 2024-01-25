import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class241 {

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "[I")
	private static final int[] anIntArray438 = new int[32768];

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "[I")
	private static final int[] anIntArray439;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "Lclient!wo;")
	private Class267 aClass267_1;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "Lclient!wo;")
	private Class267 aClass267_2;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "Lclient!wo;")
	private Class267 aClass267_3;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "Lclient!wo;")
	private Class267 aClass267_4;

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "Lclient!wo;")
	private Class267 aClass267_5;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "Lclient!wj;")
	private Class266 aClass266_1;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "Lclient!wo;")
	private Class267 aClass267_6;

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "Lclient!wo;")
	private Class267 aClass267_7;

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "Lclient!wo;")
	private Class267 aClass267_8;

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "Lclient!wo;")
	private Class267 aClass267_9;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
	public int anInt6613 = 500;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "[I")
	private final int[] anIntArray440 = new int[5];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "[I")
	private final int[] anIntArray437 = new int[5];

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
	public int anInt6614 = 0;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
	private int anInt6616 = 0;

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "[I")
	private final int[] anIntArray442 = new int[5];

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
	private int anInt6615 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray438[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray439 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray439[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!cu;)V")
	public void method5161(@OriginalArg(0) Class3_Sub7 arg0) {
		this.aClass267_4 = new Class267();
		this.aClass267_4.method5933(arg0);
		this.aClass267_5 = new Class267();
		this.aClass267_5.method5933(arg0);
		@Pc(21) int local21 = arg0.method2582();
		if (local21 != 0) {
			arg0.anInt3235--;
			this.aClass267_2 = new Class267();
			this.aClass267_2.method5933(arg0);
			this.aClass267_1 = new Class267();
			this.aClass267_1.method5933(arg0);
		}
		local21 = arg0.method2582();
		if (local21 != 0) {
			arg0.anInt3235--;
			this.aClass267_8 = new Class267();
			this.aClass267_8.method5933(arg0);
			this.aClass267_7 = new Class267();
			this.aClass267_7.method5933(arg0);
		}
		local21 = arg0.method2582();
		if (local21 != 0) {
			arg0.anInt3235--;
			this.aClass267_9 = new Class267();
			this.aClass267_9.method5933(arg0);
			this.aClass267_6 = new Class267();
			this.aClass267_6.method5933(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method2638();
			if (local114 == 0) {
				break;
			}
			this.anIntArray437[local109] = local114;
			this.anIntArray442[local109] = arg0.method2626();
			this.anIntArray440[local109] = arg0.method2638();
		}
		this.anInt6616 = arg0.method2638();
		this.anInt6615 = arg0.method2638();
		this.anInt6613 = arg0.method2588();
		this.anInt6614 = arg0.method2588();
		this.aClass266_1 = new Class266();
		this.aClass267_3 = new Class267();
		this.aClass266_1.method5908(arg0, this.aClass267_3);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)I")
	private int method5162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray439[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray438[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)[I")
	public int[] method5164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static462.method4612(Static400.anIntArray441, 0, arg0);
		if (arg1 < 10) {
			return Static400.anIntArray441;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass267_4.method5934();
		this.aClass267_5.method5934();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass267_2 != null) {
			this.aClass267_2.method5934();
			this.aClass267_1.method5934();
			local24 = (int) ((double) (this.aClass267_2.anInt7598 - this.aClass267_2.anInt7596) * 32.768D / local16);
			local26 = (int) ((double) this.aClass267_2.anInt7596 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass267_8 != null) {
			this.aClass267_8.method5934();
			this.aClass267_7.method5934();
			local63 = (int) ((double) (this.aClass267_8.anInt7598 - this.aClass267_8.anInt7596) * 32.768D / local16);
			local65 = (int) ((double) this.aClass267_8.anInt7596 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray437[local102] != 0) {
				Static400.anIntArray444[local102] = 0;
				Static400.anIntArray443[local102] = (int) ((double) this.anIntArray440[local102] * local16);
				Static400.anIntArray446[local102] = (this.anIntArray437[local102] << 14) / 100;
				Static400.anIntArray445[local102] = (int) ((double) (this.aClass267_4.anInt7598 - this.aClass267_4.anInt7596) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray442[local102]) / local16);
				Static400.anIntArray447[local102] = (int) ((double) this.aClass267_4.anInt7596 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass267_4.method5936(arg0);
			local187 = this.aClass267_5.method5936(arg0);
			if (this.aClass267_2 != null) {
				local195 = this.aClass267_2.method5936(arg0);
				local200 = this.aClass267_1.method5936(arg0);
				local182 += this.method5162(local28, local200, this.aClass267_2.anInt7597) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass267_8 != null) {
				local195 = this.aClass267_8.method5936(arg0);
				local200 = this.aClass267_7.method5936(arg0);
				local187 = local187 * ((this.method5162(local67, local200, this.aClass267_8.anInt7597) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray437[local195] != 0) {
					local200 = local176 + Static400.anIntArray443[local195];
					if (local200 < arg0) {
						Static400.anIntArray441[local200] += this.method5162(Static400.anIntArray444[local195], local187 * Static400.anIntArray446[local195] >> 15, this.aClass267_4.anInt7597);
						Static400.anIntArray444[local195] += (local182 * Static400.anIntArray445[local195] >> 16) + Static400.anIntArray447[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass267_9 != null) {
			this.aClass267_9.method5934();
			this.aClass267_6.method5934();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass267_9.method5936(arg0);
				local352 = this.aClass267_6.method5936(arg0);
				if (local339) {
					local187 = this.aClass267_9.anInt7596 + ((this.aClass267_9.anInt7598 - this.aClass267_9.anInt7596) * local347 >> 8);
				} else {
					local187 = this.aClass267_9.anInt7596 + ((this.aClass267_9.anInt7598 - this.aClass267_9.anInt7596) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static400.anIntArray441[local200] = 0;
				}
			}
		}
		if (this.anInt6616 > 0 && this.anInt6615 > 0) {
			local182 = (int) ((double) this.anInt6616 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static400.anIntArray441[local187] += Static400.anIntArray441[local187 - local182] * this.anInt6615 / 100;
			}
		}
		if (this.aClass266_1.anIntArray526[0] > 0 || this.aClass266_1.anIntArray526[1] > 0) {
			this.aClass267_3.method5934();
			local182 = this.aClass267_3.method5936(arg0 + 1);
			local187 = this.aClass266_1.method5911(0, (float) local182 / 65536.0F);
			local195 = this.aClass266_1.method5911(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static400.anIntArray441[local200 + local187] * (long) Static448.anInt7581 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static400.anIntArray441[local200 + local187 - local519 - 1] * (long) Static448.anIntArrayArray58[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static400.anIntArray441[local200 - local549 - 1] * (long) Static448.anIntArrayArray58[1][local549] >> 16);
					}
					Static400.anIntArray441[local200] = local352;
					local182 = this.aClass267_3.method5936(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static400.anIntArray441[local200 + local187] * (long) Static448.anInt7581 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static400.anIntArray441[local200 + local187 - local519 - 1] * (long) Static448.anIntArrayArray58[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static400.anIntArray441[local200 - local549 - 1] * (long) Static448.anIntArrayArray58[1][local549] >> 16);
						}
						Static400.anIntArray441[local200] = local352;
						local182 = this.aClass267_3.method5936(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static400.anIntArray441[local200 + local187 - local519 - 1] * (long) Static448.anIntArrayArray58[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static400.anIntArray441[local200 - local549 - 1] * (long) Static448.anIntArrayArray58[1][local549] >> 16);
							}
							Static400.anIntArray441[local200] = local352;
							this.aClass267_3.method5936(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass266_1.method5911(0, (float) local182 / 65536.0F);
					local195 = this.aClass266_1.method5911(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static400.anIntArray441[local182] < -32768) {
				Static400.anIntArray441[local182] = -32768;
			}
			if (Static400.anIntArray441[local182] > 32767) {
				Static400.anIntArray441[local182] = 32767;
			}
		}
		return Static400.anIntArray441;
	}
}
