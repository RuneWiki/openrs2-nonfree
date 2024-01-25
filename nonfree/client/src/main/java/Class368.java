import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class368 {

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "[I")
	private static final int[] anIntArray646 = new int[32768];

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "[I")
	private static final int[] anIntArray644;

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "Lclient!le;")
	private Class202 aClass202_1;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "Lclient!le;")
	private Class202 aClass202_2;

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "Lclient!le;")
	private Class202 aClass202_3;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "Lclient!le;")
	private Class202 aClass202_4;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "Lclient!le;")
	private Class202 aClass202_5;

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "Lclient!le;")
	private Class202 aClass202_6;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "Lclient!le;")
	private Class202 aClass202_7;

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "Lclient!le;")
	private Class202 aClass202_8;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "Lclient!le;")
	private Class202 aClass202_9;

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "Lclient!wr;")
	private Class381 aClass381_1;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
	private int anInt9966 = 0;

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "[I")
	private final int[] anIntArray643 = new int[5];

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "[I")
	private final int[] anIntArray642 = new int[5];

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "[I")
	private final int[] anIntArray645 = new int[5];

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
	public int anInt9968 = 500;

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
	private int anInt9967 = 100;

	@OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
	public int anInt9969 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray646[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray644 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray644[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)I")
	private int method8467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray644[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray646[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!dc;)V")
	public void method8468(@OriginalArg(0) Class3_Sub9 arg0) {
		this.aClass202_6 = new Class202();
		this.aClass202_6.method5285(arg0);
		this.aClass202_4 = new Class202();
		this.aClass202_4.method5285(arg0);
		@Pc(21) int local21 = arg0.method5633();
		if (local21 != 0) {
			arg0.anInt6453--;
			this.aClass202_2 = new Class202();
			this.aClass202_2.method5285(arg0);
			this.aClass202_7 = new Class202();
			this.aClass202_7.method5285(arg0);
		}
		local21 = arg0.method5633();
		if (local21 != 0) {
			arg0.anInt6453--;
			this.aClass202_9 = new Class202();
			this.aClass202_9.method5285(arg0);
			this.aClass202_5 = new Class202();
			this.aClass202_5.method5285(arg0);
		}
		local21 = arg0.method5633();
		if (local21 != 0) {
			arg0.anInt6453--;
			this.aClass202_3 = new Class202();
			this.aClass202_3.method5285(arg0);
			this.aClass202_1 = new Class202();
			this.aClass202_1.method5285(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method5606();
			if (local114 == 0) {
				break;
			}
			this.anIntArray643[local109] = local114;
			this.anIntArray645[local109] = arg0.method5608();
			this.anIntArray642[local109] = arg0.method5606();
		}
		this.anInt9966 = arg0.method5606();
		this.anInt9967 = arg0.method5606();
		this.anInt9968 = arg0.method5610();
		this.anInt9969 = arg0.method5610();
		this.aClass381_1 = new Class381();
		this.aClass202_8 = new Class202();
		this.aClass381_1.method8648(arg0, this.aClass202_8);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)[I")
	public int[] method8470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static651.method753(Static622.anIntArray647, 0, arg0);
		if (arg1 < 10) {
			return Static622.anIntArray647;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass202_6.method5288();
		this.aClass202_4.method5288();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass202_2 != null) {
			this.aClass202_2.method5288();
			this.aClass202_7.method5288();
			local24 = (int) ((double) (this.aClass202_2.anInt6120 - this.aClass202_2.anInt6118) * 32.768D / local16);
			local26 = (int) ((double) this.aClass202_2.anInt6118 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass202_9 != null) {
			this.aClass202_9.method5288();
			this.aClass202_5.method5288();
			local63 = (int) ((double) (this.aClass202_9.anInt6120 - this.aClass202_9.anInt6118) * 32.768D / local16);
			local65 = (int) ((double) this.aClass202_9.anInt6118 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray643[local102] != 0) {
				Static622.anIntArray649[local102] = 0;
				Static622.anIntArray648[local102] = (int) ((double) this.anIntArray642[local102] * local16);
				Static622.anIntArray650[local102] = (this.anIntArray643[local102] << 14) / 100;
				Static622.anIntArray652[local102] = (int) ((double) (this.aClass202_6.anInt6120 - this.aClass202_6.anInt6118) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray645[local102]) / local16);
				Static622.anIntArray651[local102] = (int) ((double) this.aClass202_6.anInt6118 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass202_6.method5286(arg0);
			local187 = this.aClass202_4.method5286(arg0);
			if (this.aClass202_2 != null) {
				local195 = this.aClass202_2.method5286(arg0);
				local200 = this.aClass202_7.method5286(arg0);
				local182 += this.method8467(local28, local200, this.aClass202_2.anInt6119) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass202_9 != null) {
				local195 = this.aClass202_9.method5286(arg0);
				local200 = this.aClass202_5.method5286(arg0);
				local187 = local187 * ((this.method8467(local67, local200, this.aClass202_9.anInt6119) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray643[local195] != 0) {
					local200 = local176 + Static622.anIntArray648[local195];
					if (local200 < arg0) {
						Static622.anIntArray647[local200] += this.method8467(Static622.anIntArray649[local195], local187 * Static622.anIntArray650[local195] >> 15, this.aClass202_6.anInt6119);
						Static622.anIntArray649[local195] += (local182 * Static622.anIntArray652[local195] >> 16) + Static622.anIntArray651[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass202_3 != null) {
			this.aClass202_3.method5288();
			this.aClass202_1.method5288();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass202_3.method5286(arg0);
				local352 = this.aClass202_1.method5286(arg0);
				if (local339) {
					local187 = this.aClass202_3.anInt6118 + ((this.aClass202_3.anInt6120 - this.aClass202_3.anInt6118) * local347 >> 8);
				} else {
					local187 = this.aClass202_3.anInt6118 + ((this.aClass202_3.anInt6120 - this.aClass202_3.anInt6118) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static622.anIntArray647[local200] = 0;
				}
			}
		}
		if (this.anInt9966 > 0 && this.anInt9967 > 0) {
			local182 = (int) ((double) this.anInt9966 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static622.anIntArray647[local187] += Static622.anIntArray647[local187 - local182] * this.anInt9967 / 100;
			}
		}
		if (this.aClass381_1.anIntArray677[0] > 0 || this.aClass381_1.anIntArray677[1] > 0) {
			this.aClass202_8.method5288();
			local182 = this.aClass202_8.method5286(arg0 + 1);
			local187 = this.aClass381_1.method8649(0, (float) local182 / 65536.0F);
			local195 = this.aClass381_1.method8649(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static622.anIntArray647[local200 + local187] * (long) Static643.anInt10261 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static622.anIntArray647[local200 + local187 - local519 - 1] * (long) Static643.anIntArrayArray62[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static622.anIntArray647[local200 - local549 - 1] * (long) Static643.anIntArrayArray62[1][local549] >> 16);
					}
					Static622.anIntArray647[local200] = local352;
					local182 = this.aClass202_8.method5286(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static622.anIntArray647[local200 + local187] * (long) Static643.anInt10261 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static622.anIntArray647[local200 + local187 - local519 - 1] * (long) Static643.anIntArrayArray62[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static622.anIntArray647[local200 - local549 - 1] * (long) Static643.anIntArrayArray62[1][local549] >> 16);
						}
						Static622.anIntArray647[local200] = local352;
						local182 = this.aClass202_8.method5286(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static622.anIntArray647[local200 + local187 - local519 - 1] * (long) Static643.anIntArrayArray62[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static622.anIntArray647[local200 - local549 - 1] * (long) Static643.anIntArrayArray62[1][local549] >> 16);
							}
							Static622.anIntArray647[local200] = local352;
							this.aClass202_8.method5286(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass381_1.method8649(0, (float) local182 / 65536.0F);
					local195 = this.aClass381_1.method8649(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static622.anIntArray647[local182] < -32768) {
				Static622.anIntArray647[local182] = -32768;
			}
			if (Static622.anIntArray647[local182] > 32767) {
				Static622.anIntArray647[local182] = 32767;
			}
		}
		return Static622.anIntArray647;
	}
}
