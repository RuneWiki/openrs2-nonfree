import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class227 {

	@OriginalMember(owner = "client!ms", name = "s", descriptor = "[I")
	private static final int[] anIntArray407 = new int[32768];

	@OriginalMember(owner = "client!ms", name = "i", descriptor = "[I")
	private static final int[] anIntArray405;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "Lclient!av;")
	private Class21 aClass21_1;

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "Lclient!av;")
	private Class21 aClass21_2;

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "Lclient!av;")
	private Class21 aClass21_3;

	@OriginalMember(owner = "client!ms", name = "f", descriptor = "Lclient!av;")
	private Class21 aClass21_4;

	@OriginalMember(owner = "client!ms", name = "k", descriptor = "Lclient!av;")
	private Class21 aClass21_5;

	@OriginalMember(owner = "client!ms", name = "m", descriptor = "Lclient!av;")
	private Class21 aClass21_6;

	@OriginalMember(owner = "client!ms", name = "n", descriptor = "Lclient!av;")
	private Class21 aClass21_7;

	@OriginalMember(owner = "client!ms", name = "o", descriptor = "Lclient!av;")
	private Class21 aClass21_8;

	@OriginalMember(owner = "client!ms", name = "p", descriptor = "Lclient!av;")
	private Class21 aClass21_9;

	@OriginalMember(owner = "client!ms", name = "r", descriptor = "Lclient!iba;")
	private Class147 aClass147_1;

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "[I")
	private final int[] anIntArray403 = new int[5];

	@OriginalMember(owner = "client!ms", name = "g", descriptor = "I")
	private int anInt5679 = 100;

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
	private int anInt5678 = 0;

	@OriginalMember(owner = "client!ms", name = "q", descriptor = "I")
	public int anInt5681 = 0;

	@OriginalMember(owner = "client!ms", name = "j", descriptor = "[I")
	private final int[] anIntArray406 = new int[5];

	@OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
	public int anInt5680 = 500;

	@OriginalMember(owner = "client!ms", name = "t", descriptor = "[I")
	private final int[] anIntArray408 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray407[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray405 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray405[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)I")
	private int method4859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray405[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray407[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!vj;)V")
	public void method4860(@OriginalArg(0) Class2_Sub22 arg0) {
		this.aClass21_6 = new Class21();
		this.aClass21_6.method482(arg0);
		this.aClass21_5 = new Class21();
		this.aClass21_5.method482(arg0);
		@Pc(21) int local21 = arg0.method8547();
		if (local21 != 0) {
			arg0.anInt10247--;
			this.aClass21_1 = new Class21();
			this.aClass21_1.method482(arg0);
			this.aClass21_7 = new Class21();
			this.aClass21_7.method482(arg0);
		}
		local21 = arg0.method8547();
		if (local21 != 0) {
			arg0.anInt10247--;
			this.aClass21_2 = new Class21();
			this.aClass21_2.method482(arg0);
			this.aClass21_3 = new Class21();
			this.aClass21_3.method482(arg0);
		}
		local21 = arg0.method8547();
		if (local21 != 0) {
			arg0.anInt10247--;
			this.aClass21_8 = new Class21();
			this.aClass21_8.method482(arg0);
			this.aClass21_4 = new Class21();
			this.aClass21_4.method482(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method8543();
			if (local114 == 0) {
				break;
			}
			this.anIntArray408[local109] = local114;
			this.anIntArray406[local109] = arg0.method8536();
			this.anIntArray403[local109] = arg0.method8543();
		}
		this.anInt5678 = arg0.method8543();
		this.anInt5679 = arg0.method8543();
		this.anInt5680 = arg0.method8546();
		this.anInt5681 = arg0.method8546();
		this.aClass147_1 = new Class147();
		this.aClass21_9 = new Class21();
		this.aClass147_1.method3115(arg0, this.aClass21_9);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)[I")
	public int[] method4862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static653.method5392(Static360.anIntArray404, 0, arg0);
		if (arg1 < 10) {
			return Static360.anIntArray404;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass21_6.method483();
		this.aClass21_5.method483();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass21_1 != null) {
			this.aClass21_1.method483();
			this.aClass21_7.method483();
			local24 = (int) ((double) (this.aClass21_1.anInt609 - this.aClass21_1.anInt608) * 32.768D / local16);
			local26 = (int) ((double) this.aClass21_1.anInt608 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass21_2 != null) {
			this.aClass21_2.method483();
			this.aClass21_3.method483();
			local63 = (int) ((double) (this.aClass21_2.anInt609 - this.aClass21_2.anInt608) * 32.768D / local16);
			local65 = (int) ((double) this.aClass21_2.anInt608 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray408[local102] != 0) {
				Static360.anIntArray413[local102] = 0;
				Static360.anIntArray410[local102] = (int) ((double) this.anIntArray403[local102] * local16);
				Static360.anIntArray411[local102] = (this.anIntArray408[local102] << 14) / 100;
				Static360.anIntArray412[local102] = (int) ((double) (this.aClass21_6.anInt609 - this.aClass21_6.anInt608) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray406[local102]) / local16);
				Static360.anIntArray409[local102] = (int) ((double) this.aClass21_6.anInt608 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass21_6.method481(arg0);
			local187 = this.aClass21_5.method481(arg0);
			if (this.aClass21_1 != null) {
				local195 = this.aClass21_1.method481(arg0);
				local200 = this.aClass21_7.method481(arg0);
				local182 += this.method4859(local28, local200, this.aClass21_1.anInt611) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass21_2 != null) {
				local195 = this.aClass21_2.method481(arg0);
				local200 = this.aClass21_3.method481(arg0);
				local187 = local187 * ((this.method4859(local67, local200, this.aClass21_2.anInt611) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray408[local195] != 0) {
					local200 = local176 + Static360.anIntArray410[local195];
					if (local200 < arg0) {
						Static360.anIntArray404[local200] += this.method4859(Static360.anIntArray413[local195], local187 * Static360.anIntArray411[local195] >> 15, this.aClass21_6.anInt611);
						Static360.anIntArray413[local195] += (local182 * Static360.anIntArray412[local195] >> 16) + Static360.anIntArray409[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass21_8 != null) {
			this.aClass21_8.method483();
			this.aClass21_4.method483();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass21_8.method481(arg0);
				local352 = this.aClass21_4.method481(arg0);
				if (local339) {
					local187 = this.aClass21_8.anInt608 + ((this.aClass21_8.anInt609 - this.aClass21_8.anInt608) * local347 >> 8);
				} else {
					local187 = this.aClass21_8.anInt608 + ((this.aClass21_8.anInt609 - this.aClass21_8.anInt608) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static360.anIntArray404[local200] = 0;
				}
			}
		}
		if (this.anInt5678 > 0 && this.anInt5679 > 0) {
			local182 = (int) ((double) this.anInt5678 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static360.anIntArray404[local187] += Static360.anIntArray404[local187 - local182] * this.anInt5679 / 100;
			}
		}
		if (this.aClass147_1.anIntArray252[0] > 0 || this.aClass147_1.anIntArray252[1] > 0) {
			this.aClass21_9.method483();
			local182 = this.aClass21_9.method481(arg0 + 1);
			local187 = this.aClass147_1.method3112(0, (float) local182 / 65536.0F);
			local195 = this.aClass147_1.method3112(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static360.anIntArray404[local200 + local187] * (long) Static227.anInt3674 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static360.anIntArray404[local200 + local187 - local519 - 1] * (long) Static227.anIntArrayArray17[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static360.anIntArray404[local200 - local549 - 1] * (long) Static227.anIntArrayArray17[1][local549] >> 16);
					}
					Static360.anIntArray404[local200] = local352;
					local182 = this.aClass21_9.method481(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static360.anIntArray404[local200 + local187] * (long) Static227.anInt3674 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static360.anIntArray404[local200 + local187 - local519 - 1] * (long) Static227.anIntArrayArray17[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static360.anIntArray404[local200 - local549 - 1] * (long) Static227.anIntArrayArray17[1][local549] >> 16);
						}
						Static360.anIntArray404[local200] = local352;
						local182 = this.aClass21_9.method481(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static360.anIntArray404[local200 + local187 - local519 - 1] * (long) Static227.anIntArrayArray17[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static360.anIntArray404[local200 - local549 - 1] * (long) Static227.anIntArrayArray17[1][local549] >> 16);
							}
							Static360.anIntArray404[local200] = local352;
							this.aClass21_9.method481(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass147_1.method3112(0, (float) local182 / 65536.0F);
					local195 = this.aClass147_1.method3112(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static360.anIntArray404[local182] < -32768) {
				Static360.anIntArray404[local182] = -32768;
			}
			if (Static360.anIntArray404[local182] > 32767) {
				Static360.anIntArray404[local182] = 32767;
			}
		}
		return Static360.anIntArray404;
	}
}
