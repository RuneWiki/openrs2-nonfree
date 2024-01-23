import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class194 {

	@OriginalMember(owner = "client!we", name = "c", descriptor = "[I")
	private static int[] anIntArray580 = new int[32768];

	@OriginalMember(owner = "client!we", name = "j", descriptor = "[I")
	private static int[] anIntArray583;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "Lclient!kl;")
	private Class98 aClass98_1;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Lclient!kl;")
	private Class98 aClass98_2;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "Lclient!kl;")
	private Class98 aClass98_3;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Lclient!kl;")
	private Class98 aClass98_4;

	@OriginalMember(owner = "client!we", name = "n", descriptor = "Lclient!kl;")
	private Class98 aClass98_5;

	@OriginalMember(owner = "client!we", name = "o", descriptor = "Lclient!kl;")
	private Class98 aClass98_6;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "Lclient!hl;")
	private Class74 aClass74_1;

	@OriginalMember(owner = "client!we", name = "s", descriptor = "Lclient!kl;")
	private Class98 aClass98_7;

	@OriginalMember(owner = "client!we", name = "v", descriptor = "Lclient!kl;")
	private Class98 aClass98_8;

	@OriginalMember(owner = "client!we", name = "y", descriptor = "Lclient!kl;")
	private Class98 aClass98_9;

	@OriginalMember(owner = "client!we", name = "d", descriptor = "I")
	public int anInt5965 = 500;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "[I")
	private int[] anIntArray582 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!we", name = "k", descriptor = "[I")
	private int[] anIntArray584 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!we", name = "h", descriptor = "[I")
	private int[] anIntArray581 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!we", name = "m", descriptor = "I")
	private int anInt5967 = 0;

	@OriginalMember(owner = "client!we", name = "l", descriptor = "I")
	private int anInt5966 = 100;

	@OriginalMember(owner = "client!we", name = "u", descriptor = "I")
	public int anInt5968 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		@Pc(9) int local9;
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray580[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray583 = new int[32768];
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray583[local9] = (int) (Math.sin((double) local9 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!oe;)V")
	public void method4677(@OriginalArg(0) Class2_Sub16 arg0) {
		this.aClass98_4 = new Class98();
		this.aClass98_4.method2816(arg0);
		this.aClass98_2 = new Class98();
		this.aClass98_2.method2816(arg0);
		@Pc(21) int local21 = arg0.method2146();
		if (local21 != 0) {
			arg0.anInt2789--;
			this.aClass98_5 = new Class98();
			this.aClass98_5.method2816(arg0);
			this.aClass98_3 = new Class98();
			this.aClass98_3.method2816(arg0);
		}
		local21 = arg0.method2146();
		if (local21 != 0) {
			arg0.anInt2789--;
			this.aClass98_1 = new Class98();
			this.aClass98_1.method2816(arg0);
			this.aClass98_7 = new Class98();
			this.aClass98_7.method2816(arg0);
		}
		local21 = arg0.method2146();
		if (local21 != 0) {
			arg0.anInt2789--;
			this.aClass98_8 = new Class98();
			this.aClass98_8.method2816(arg0);
			this.aClass98_6 = new Class98();
			this.aClass98_6.method2816(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(116) int local116 = arg0.method2161();
			if (local116 == 0) {
				break;
			}
			this.anIntArray584[local109] = local116;
			this.anIntArray582[local109] = arg0.method2174();
			this.anIntArray581[local109] = arg0.method2161();
		}
		this.anInt5967 = arg0.method2161();
		this.anInt5966 = arg0.method2161();
		this.anInt5965 = arg0.method2130();
		this.anInt5968 = arg0.method2130();
		this.aClass74_1 = new Class74();
		this.aClass98_9 = new Class98();
		this.aClass74_1.method1899(arg0, this.aClass98_9);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)[I")
	public int[] method4678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static323.method3549(Static310.anIntArray579, 0, arg0);
		if (arg1 < 10) {
			return Static310.anIntArray579;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass98_4.method2818();
		this.aClass98_2.method2818();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass98_5 != null) {
			this.aClass98_5.method2818();
			this.aClass98_3.method2818();
			local24 = (int) ((double) (this.aClass98_5.anInt3415 - this.aClass98_5.anInt3416) * 32.768D / local16);
			local26 = (int) ((double) this.aClass98_5.anInt3416 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass98_1 != null) {
			this.aClass98_1.method2818();
			this.aClass98_7.method2818();
			local63 = (int) ((double) (this.aClass98_1.anInt3415 - this.aClass98_1.anInt3416) * 32.768D / local16);
			local65 = (int) ((double) this.aClass98_1.anInt3416 * 32.768D / local16);
		}
		@Pc(102) int local102;
		for (local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray584[local102] != 0) {
				Static310.anIntArray587[local102] = 0;
				Static310.anIntArray588[local102] = (int) ((double) this.anIntArray581[local102] * local16);
				Static310.anIntArray589[local102] = (this.anIntArray584[local102] << 14) / 100;
				Static310.anIntArray586[local102] = (int) ((double) (this.aClass98_4.anInt3415 - this.aClass98_4.anInt3416) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray582[local102]) / local16);
				Static310.anIntArray585[local102] = (int) ((double) this.aClass98_4.anInt3416 * 32.768D / local16);
			}
		}
		@Pc(185) int local185;
		@Pc(190) int local190;
		@Pc(198) int local198;
		@Pc(203) int local203;
		for (local102 = 0; local102 < arg0; local102++) {
			local185 = this.aClass98_4.method2819(arg0);
			local190 = this.aClass98_2.method2819(arg0);
			if (this.aClass98_5 != null) {
				local198 = this.aClass98_5.method2819(arg0);
				local203 = this.aClass98_3.method2819(arg0);
				local185 += this.method4680(local28, local203, this.aClass98_5.anInt3414) >> 1;
				local28 += (local198 * local24 >> 16) + local26;
			}
			if (this.aClass98_1 != null) {
				local198 = this.aClass98_1.method2819(arg0);
				local203 = this.aClass98_7.method2819(arg0);
				local190 = local190 * ((this.method4680(local67, local203, this.aClass98_1.anInt3414) >> 1) + 32768) >> 15;
				local67 += (local198 * local63 >> 16) + local65;
			}
			for (local198 = 0; local198 < 5; local198++) {
				if (this.anIntArray584[local198] != 0) {
					local203 = local102 + Static310.anIntArray588[local198];
					if (local203 < arg0) {
						Static310.anIntArray579[local203] += this.method4680(Static310.anIntArray587[local198], local190 * Static310.anIntArray589[local198] >> 15, this.aClass98_4.anInt3414);
						Static310.anIntArray587[local198] += (local185 * Static310.anIntArray586[local198] >> 16) + Static310.anIntArray585[local198];
					}
				}
			}
		}
		@Pc(356) int local356;
		if (this.aClass98_8 != null) {
			this.aClass98_8.method2818();
			this.aClass98_6.method2818();
			local102 = 0;
			@Pc(341) boolean local341 = true;
			for (local198 = 0; local198 < arg0; local198++) {
				local203 = this.aClass98_8.method2819(arg0);
				local356 = this.aClass98_6.method2819(arg0);
				if (local341) {
					local185 = this.aClass98_8.anInt3416 + ((this.aClass98_8.anInt3415 - this.aClass98_8.anInt3416) * local203 >> 8);
				} else {
					local185 = this.aClass98_8.anInt3416 + ((this.aClass98_8.anInt3415 - this.aClass98_8.anInt3416) * local356 >> 8);
				}
				local102 += 256;
				if (local102 >= local185) {
					local102 = 0;
					local341 = !local341;
				}
				if (local341) {
					Static310.anIntArray579[local198] = 0;
				}
			}
		}
		if (this.anInt5967 > 0 && this.anInt5966 > 0) {
			local102 = (int) ((double) this.anInt5967 * local16);
			for (local185 = local102; local185 < arg0; local185++) {
				Static310.anIntArray579[local185] += Static310.anIntArray579[local185 - local102] * this.anInt5966 / 100;
			}
		}
		if (this.aClass74_1.anIntArray221[0] > 0 || this.aClass74_1.anIntArray221[1] > 0) {
			this.aClass98_9.method2818();
			local102 = this.aClass98_9.method2819(arg0 + 1);
			local185 = this.aClass74_1.method1901(0, (float) local102 / 65536.0F);
			local190 = this.aClass74_1.method1901(1, (float) local102 / 65536.0F);
			if (arg0 >= local185 + local190) {
				local198 = 0;
				local203 = local190;
				if (local190 > arg0 - local185) {
					local203 = arg0 - local185;
				}
				@Pc(523) int local523;
				while (local198 < local203) {
					local356 = (int) ((long) Static310.anIntArray579[local198 + local185] * (long) Static112.anInt2525 >> 16);
					for (local523 = 0; local523 < local185; local523++) {
						local356 += (int) ((long) Static310.anIntArray579[local198 + local185 - local523 - 1] * (long) Static112.anIntArrayArray8[0][local523] >> 16);
					}
					for (local523 = 0; local523 < local198; local523++) {
						local356 -= (int) ((long) Static310.anIntArray579[local198 - local523 - 1] * (long) Static112.anIntArrayArray8[1][local523] >> 16);
					}
					Static310.anIntArray579[local198] = local356;
					local102 = this.aClass98_9.method2819(arg0 + 1);
					local198++;
				}
				local203 = 128;
				while (true) {
					if (local203 > arg0 - local185) {
						local203 = arg0 - local185;
					}
					while (local198 < local203) {
						local356 = (int) ((long) Static310.anIntArray579[local198 + local185] * (long) Static112.anInt2525 >> 16);
						for (local523 = 0; local523 < local185; local523++) {
							local356 += (int) ((long) Static310.anIntArray579[local198 + local185 - local523 - 1] * (long) Static112.anIntArrayArray8[0][local523] >> 16);
						}
						for (local523 = 0; local523 < local190; local523++) {
							local356 -= (int) ((long) Static310.anIntArray579[local198 - local523 - 1] * (long) Static112.anIntArrayArray8[1][local523] >> 16);
						}
						Static310.anIntArray579[local198] = local356;
						local102 = this.aClass98_9.method2819(arg0 + 1);
						local198++;
					}
					if (local198 >= arg0 - local185) {
						while (local198 < arg0) {
							local356 = 0;
							for (local523 = local198 + local185 - arg0; local523 < local185; local523++) {
								local356 += (int) ((long) Static310.anIntArray579[local198 + local185 - local523 - 1] * (long) Static112.anIntArrayArray8[0][local523] >> 16);
							}
							for (local523 = 0; local523 < local190; local523++) {
								local356 -= (int) ((long) Static310.anIntArray579[local198 - local523 - 1] * (long) Static112.anIntArrayArray8[1][local523] >> 16);
							}
							Static310.anIntArray579[local198] = local356;
							this.aClass98_9.method2819(arg0 + 1);
							local198++;
						}
						break;
					}
					local185 = this.aClass74_1.method1901(0, (float) local102 / 65536.0F);
					local190 = this.aClass74_1.method1901(1, (float) local102 / 65536.0F);
					local203 += 128;
				}
			}
		}
		for (local102 = 0; local102 < arg0; local102++) {
			if (Static310.anIntArray579[local102] < -32768) {
				Static310.anIntArray579[local102] = -32768;
			}
			if (Static310.anIntArray579[local102] > 32767) {
				Static310.anIntArray579[local102] = 32767;
			}
		}
		return Static310.anIntArray579;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III)I")
	private int method4680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray583[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray580[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
