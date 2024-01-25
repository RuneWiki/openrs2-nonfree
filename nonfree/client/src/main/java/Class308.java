import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class308 {

	@OriginalMember(owner = "client!si", name = "k", descriptor = "[I")
	private static final int[] anIntArray557 = new int[32768];

	@OriginalMember(owner = "client!si", name = "r", descriptor = "[I")
	private static final int[] anIntArray560;

	@OriginalMember(owner = "client!si", name = "b", descriptor = "Lclient!cq;")
	private Class58 aClass58_1;

	@OriginalMember(owner = "client!si", name = "d", descriptor = "Lclient!cq;")
	private Class58 aClass58_2;

	@OriginalMember(owner = "client!si", name = "f", descriptor = "Lclient!cq;")
	private Class58 aClass58_3;

	@OriginalMember(owner = "client!si", name = "g", descriptor = "Lclient!cq;")
	private Class58 aClass58_4;

	@OriginalMember(owner = "client!si", name = "i", descriptor = "Lclient!cq;")
	private Class58 aClass58_5;

	@OriginalMember(owner = "client!si", name = "j", descriptor = "Lclient!cq;")
	private Class58 aClass58_6;

	@OriginalMember(owner = "client!si", name = "o", descriptor = "Lclient!cq;")
	private Class58 aClass58_7;

	@OriginalMember(owner = "client!si", name = "p", descriptor = "Lclient!cq;")
	private Class58 aClass58_8;

	@OriginalMember(owner = "client!si", name = "q", descriptor = "Lclient!cq;")
	private Class58 aClass58_9;

	@OriginalMember(owner = "client!si", name = "s", descriptor = "Lclient!mi;")
	private Class219 aClass219_1;

	@OriginalMember(owner = "client!si", name = "c", descriptor = "I")
	private int anInt8975 = 0;

	@OriginalMember(owner = "client!si", name = "h", descriptor = "I")
	public int anInt8976 = 0;

	@OriginalMember(owner = "client!si", name = "l", descriptor = "I")
	public int anInt8977 = 500;

	@OriginalMember(owner = "client!si", name = "e", descriptor = "[I")
	private final int[] anIntArray556 = new int[5];

	@OriginalMember(owner = "client!si", name = "m", descriptor = "[I")
	private final int[] anIntArray558 = new int[5];

	@OriginalMember(owner = "client!si", name = "a", descriptor = "I")
	private int anInt8974 = 100;

	@OriginalMember(owner = "client!si", name = "x", descriptor = "[I")
	private final int[] anIntArray565 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray557[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray560 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray560[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!sl;)V")
	public void method7724(@OriginalArg(0) Class3_Sub3 arg0) {
		this.aClass58_5 = new Class58();
		this.aClass58_5.method1862(arg0);
		this.aClass58_8 = new Class58();
		this.aClass58_8.method1862(arg0);
		@Pc(21) int local21 = arg0.method4225();
		if (local21 != 0) {
			arg0.anInt4736--;
			this.aClass58_1 = new Class58();
			this.aClass58_1.method1862(arg0);
			this.aClass58_4 = new Class58();
			this.aClass58_4.method1862(arg0);
		}
		local21 = arg0.method4225();
		if (local21 != 0) {
			arg0.anInt4736--;
			this.aClass58_3 = new Class58();
			this.aClass58_3.method1862(arg0);
			this.aClass58_7 = new Class58();
			this.aClass58_7.method1862(arg0);
		}
		local21 = arg0.method4225();
		if (local21 != 0) {
			arg0.anInt4736--;
			this.aClass58_9 = new Class58();
			this.aClass58_9.method1862(arg0);
			this.aClass58_2 = new Class58();
			this.aClass58_2.method1862(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method4228();
			if (local114 == 0) {
				break;
			}
			this.anIntArray565[local109] = local114;
			this.anIntArray556[local109] = arg0.method4264();
			this.anIntArray558[local109] = arg0.method4228();
		}
		this.anInt8975 = arg0.method4228();
		this.anInt8974 = arg0.method4228();
		this.anInt8977 = arg0.method4221();
		this.anInt8976 = arg0.method4221();
		this.aClass219_1 = new Class219();
		this.aClass58_6 = new Class58();
		this.aClass219_1.method5792(arg0, this.aClass58_6);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)[I")
	public int[] method7725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static653.method6856(Static521.anIntArray559, 0, arg0);
		if (arg1 < 10) {
			return Static521.anIntArray559;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass58_5.method1864();
		this.aClass58_8.method1864();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass58_1 != null) {
			this.aClass58_1.method1864();
			this.aClass58_4.method1864();
			local24 = (int) ((double) (this.aClass58_1.anInt1922 - this.aClass58_1.anInt1923) * 32.768D / local16);
			local26 = (int) ((double) this.aClass58_1.anInt1923 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass58_3 != null) {
			this.aClass58_3.method1864();
			this.aClass58_7.method1864();
			local63 = (int) ((double) (this.aClass58_3.anInt1922 - this.aClass58_3.anInt1923) * 32.768D / local16);
			local65 = (int) ((double) this.aClass58_3.anInt1923 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray565[local102] != 0) {
				Static521.anIntArray562[local102] = 0;
				Static521.anIntArray564[local102] = (int) ((double) this.anIntArray558[local102] * local16);
				Static521.anIntArray561[local102] = (this.anIntArray565[local102] << 14) / 100;
				Static521.anIntArray563[local102] = (int) ((double) (this.aClass58_5.anInt1922 - this.aClass58_5.anInt1923) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray556[local102]) / local16);
				Static521.anIntArray566[local102] = (int) ((double) this.aClass58_5.anInt1923 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass58_5.method1863(arg0);
			local187 = this.aClass58_8.method1863(arg0);
			if (this.aClass58_1 != null) {
				local195 = this.aClass58_1.method1863(arg0);
				local200 = this.aClass58_4.method1863(arg0);
				local182 += this.method7726(local28, local200, this.aClass58_1.anInt1921) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass58_3 != null) {
				local195 = this.aClass58_3.method1863(arg0);
				local200 = this.aClass58_7.method1863(arg0);
				local187 = local187 * ((this.method7726(local67, local200, this.aClass58_3.anInt1921) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray565[local195] != 0) {
					local200 = local176 + Static521.anIntArray564[local195];
					if (local200 < arg0) {
						Static521.anIntArray559[local200] += this.method7726(Static521.anIntArray562[local195], local187 * Static521.anIntArray561[local195] >> 15, this.aClass58_5.anInt1921);
						Static521.anIntArray562[local195] += (local182 * Static521.anIntArray563[local195] >> 16) + Static521.anIntArray566[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass58_9 != null) {
			this.aClass58_9.method1864();
			this.aClass58_2.method1864();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass58_9.method1863(arg0);
				local352 = this.aClass58_2.method1863(arg0);
				if (local339) {
					local187 = this.aClass58_9.anInt1923 + ((this.aClass58_9.anInt1922 - this.aClass58_9.anInt1923) * local347 >> 8);
				} else {
					local187 = this.aClass58_9.anInt1923 + ((this.aClass58_9.anInt1922 - this.aClass58_9.anInt1923) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static521.anIntArray559[local200] = 0;
				}
			}
		}
		if (this.anInt8975 > 0 && this.anInt8974 > 0) {
			local182 = (int) ((double) this.anInt8975 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static521.anIntArray559[local187] += Static521.anIntArray559[local187 - local182] * this.anInt8974 / 100;
			}
		}
		if (this.aClass219_1.anIntArray401[0] > 0 || this.aClass219_1.anIntArray401[1] > 0) {
			this.aClass58_6.method1864();
			local182 = this.aClass58_6.method1863(arg0 + 1);
			local187 = this.aClass219_1.method5796(0, (float) local182 / 65536.0F);
			local195 = this.aClass219_1.method5796(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static521.anIntArray559[local200 + local187] * (long) Static348.anInt6738 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static521.anIntArray559[local200 + local187 - local519 - 1] * (long) Static348.anIntArrayArray49[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static521.anIntArray559[local200 - local549 - 1] * (long) Static348.anIntArrayArray49[1][local549] >> 16);
					}
					Static521.anIntArray559[local200] = local352;
					local182 = this.aClass58_6.method1863(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static521.anIntArray559[local200 + local187] * (long) Static348.anInt6738 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static521.anIntArray559[local200 + local187 - local519 - 1] * (long) Static348.anIntArrayArray49[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static521.anIntArray559[local200 - local549 - 1] * (long) Static348.anIntArrayArray49[1][local549] >> 16);
						}
						Static521.anIntArray559[local200] = local352;
						local182 = this.aClass58_6.method1863(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static521.anIntArray559[local200 + local187 - local519 - 1] * (long) Static348.anIntArrayArray49[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static521.anIntArray559[local200 - local549 - 1] * (long) Static348.anIntArrayArray49[1][local549] >> 16);
							}
							Static521.anIntArray559[local200] = local352;
							this.aClass58_6.method1863(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass219_1.method5796(0, (float) local182 / 65536.0F);
					local195 = this.aClass219_1.method5796(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static521.anIntArray559[local182] < -32768) {
				Static521.anIntArray559[local182] = -32768;
			}
			if (Static521.anIntArray559[local182] > 32767) {
				Static521.anIntArray559[local182] = 32767;
			}
		}
		return Static521.anIntArray559;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(III)I")
	private int method7726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray560[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray557[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
