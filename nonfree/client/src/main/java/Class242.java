import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public final class Class242 {

	@OriginalMember(owner = "client!tv", name = "l", descriptor = "[I")
	private static final int[] anIntArray562 = new int[32768];

	@OriginalMember(owner = "client!tv", name = "t", descriptor = "[I")
	private static final int[] anIntArray565;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "Lclient!ls;")
	private Class164 aClass164_1;

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "Lclient!ls;")
	private Class164 aClass164_2;

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "Lclient!ls;")
	private Class164 aClass164_3;

	@OriginalMember(owner = "client!tv", name = "e", descriptor = "Lclient!ls;")
	private Class164 aClass164_4;

	@OriginalMember(owner = "client!tv", name = "f", descriptor = "Lclient!ls;")
	private Class164 aClass164_5;

	@OriginalMember(owner = "client!tv", name = "i", descriptor = "Lclient!ku;")
	private Class154 aClass154_1;

	@OriginalMember(owner = "client!tv", name = "n", descriptor = "Lclient!ls;")
	private Class164 aClass164_6;

	@OriginalMember(owner = "client!tv", name = "o", descriptor = "Lclient!ls;")
	private Class164 aClass164_7;

	@OriginalMember(owner = "client!tv", name = "p", descriptor = "Lclient!ls;")
	private Class164 aClass164_8;

	@OriginalMember(owner = "client!tv", name = "s", descriptor = "Lclient!ls;")
	private Class164 aClass164_9;

	@OriginalMember(owner = "client!tv", name = "g", descriptor = "[I")
	private final int[] anIntArray560 = new int[5];

	@OriginalMember(owner = "client!tv", name = "j", descriptor = "[I")
	private final int[] anIntArray561 = new int[5];

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
	private int anInt7012 = 100;

	@OriginalMember(owner = "client!tv", name = "h", descriptor = "I")
	public int anInt7013 = 0;

	@OriginalMember(owner = "client!tv", name = "q", descriptor = "[I")
	private final int[] anIntArray564 = new int[5];

	@OriginalMember(owner = "client!tv", name = "r", descriptor = "I")
	private int anInt7015 = 0;

	@OriginalMember(owner = "client!tv", name = "k", descriptor = "I")
	public int anInt7014 = 500;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray562[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray565 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray565[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(II)[I")
	public int[] method5621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static472.method5027(Static402.anIntArray563, 0, arg0);
		if (arg1 < 10) {
			return Static402.anIntArray563;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass164_3.method3377();
		this.aClass164_9.method3377();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass164_8 != null) {
			this.aClass164_8.method3377();
			this.aClass164_7.method3377();
			local24 = (int) ((double) (this.aClass164_8.anInt4163 - this.aClass164_8.anInt4164) * 32.768D / local16);
			local26 = (int) ((double) this.aClass164_8.anInt4164 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass164_6 != null) {
			this.aClass164_6.method3377();
			this.aClass164_5.method3377();
			local63 = (int) ((double) (this.aClass164_6.anInt4163 - this.aClass164_6.anInt4164) * 32.768D / local16);
			local65 = (int) ((double) this.aClass164_6.anInt4164 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray561[local102] != 0) {
				Static402.anIntArray568[local102] = 0;
				Static402.anIntArray569[local102] = (int) ((double) this.anIntArray564[local102] * local16);
				Static402.anIntArray567[local102] = (this.anIntArray561[local102] << 14) / 100;
				Static402.anIntArray566[local102] = (int) ((double) (this.aClass164_3.anInt4163 - this.aClass164_3.anInt4164) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray560[local102]) / local16);
				Static402.anIntArray570[local102] = (int) ((double) this.aClass164_3.anInt4164 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass164_3.method3380(arg0);
			local187 = this.aClass164_9.method3380(arg0);
			if (this.aClass164_8 != null) {
				local195 = this.aClass164_8.method3380(arg0);
				local200 = this.aClass164_7.method3380(arg0);
				local182 += this.method5622(local28, local200, this.aClass164_8.anInt4162) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass164_6 != null) {
				local195 = this.aClass164_6.method3380(arg0);
				local200 = this.aClass164_5.method3380(arg0);
				local187 = local187 * ((this.method5622(local67, local200, this.aClass164_6.anInt4162) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray561[local195] != 0) {
					local200 = local176 + Static402.anIntArray569[local195];
					if (local200 < arg0) {
						Static402.anIntArray563[local200] += this.method5622(Static402.anIntArray568[local195], local187 * Static402.anIntArray567[local195] >> 15, this.aClass164_3.anInt4162);
						Static402.anIntArray568[local195] += (local182 * Static402.anIntArray566[local195] >> 16) + Static402.anIntArray570[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass164_4 != null) {
			this.aClass164_4.method3377();
			this.aClass164_2.method3377();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass164_4.method3380(arg0);
				local352 = this.aClass164_2.method3380(arg0);
				if (local339) {
					local187 = this.aClass164_4.anInt4164 + ((this.aClass164_4.anInt4163 - this.aClass164_4.anInt4164) * local347 >> 8);
				} else {
					local187 = this.aClass164_4.anInt4164 + ((this.aClass164_4.anInt4163 - this.aClass164_4.anInt4164) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static402.anIntArray563[local200] = 0;
				}
			}
		}
		if (this.anInt7015 > 0 && this.anInt7012 > 0) {
			local182 = (int) ((double) this.anInt7015 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static402.anIntArray563[local187] += Static402.anIntArray563[local187 - local182] * this.anInt7012 / 100;
			}
		}
		if (this.aClass154_1.anIntArray347[0] > 0 || this.aClass154_1.anIntArray347[1] > 0) {
			this.aClass164_1.method3377();
			local182 = this.aClass164_1.method3380(arg0 + 1);
			local187 = this.aClass154_1.method3094(0, (float) local182 / 65536.0F);
			local195 = this.aClass154_1.method3094(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static402.anIntArray563[local200 + local187] * (long) Static225.anInt3801 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static402.anIntArray563[local200 + local187 - local519 - 1] * (long) Static225.anIntArrayArray96[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static402.anIntArray563[local200 - local549 - 1] * (long) Static225.anIntArrayArray96[1][local549] >> 16);
					}
					Static402.anIntArray563[local200] = local352;
					local182 = this.aClass164_1.method3380(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static402.anIntArray563[local200 + local187] * (long) Static225.anInt3801 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static402.anIntArray563[local200 + local187 - local519 - 1] * (long) Static225.anIntArrayArray96[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static402.anIntArray563[local200 - local549 - 1] * (long) Static225.anIntArrayArray96[1][local549] >> 16);
						}
						Static402.anIntArray563[local200] = local352;
						local182 = this.aClass164_1.method3380(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static402.anIntArray563[local200 + local187 - local519 - 1] * (long) Static225.anIntArrayArray96[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static402.anIntArray563[local200 - local549 - 1] * (long) Static225.anIntArrayArray96[1][local549] >> 16);
							}
							Static402.anIntArray563[local200] = local352;
							this.aClass164_1.method3380(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass154_1.method3094(0, (float) local182 / 65536.0F);
					local195 = this.aClass154_1.method3094(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static402.anIntArray563[local182] < -32768) {
				Static402.anIntArray563[local182] = -32768;
			}
			if (Static402.anIntArray563[local182] > 32767) {
				Static402.anIntArray563[local182] = 32767;
			}
		}
		return Static402.anIntArray563;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(III)I")
	private int method5622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray565[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray562[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!hw;)V")
	public void method5623(@OriginalArg(0) Class2_Sub17 arg0) {
		this.aClass164_3 = new Class164();
		this.aClass164_3.method3379(arg0);
		this.aClass164_9 = new Class164();
		this.aClass164_9.method3379(arg0);
		@Pc(21) int local21 = arg0.method6138();
		if (local21 != 0) {
			arg0.anInt7523--;
			this.aClass164_8 = new Class164();
			this.aClass164_8.method3379(arg0);
			this.aClass164_7 = new Class164();
			this.aClass164_7.method3379(arg0);
		}
		local21 = arg0.method6138();
		if (local21 != 0) {
			arg0.anInt7523--;
			this.aClass164_6 = new Class164();
			this.aClass164_6.method3379(arg0);
			this.aClass164_5 = new Class164();
			this.aClass164_5.method3379(arg0);
		}
		local21 = arg0.method6138();
		if (local21 != 0) {
			arg0.anInt7523--;
			this.aClass164_4 = new Class164();
			this.aClass164_4.method3379(arg0);
			this.aClass164_2 = new Class164();
			this.aClass164_2.method3379(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method6174();
			if (local114 == 0) {
				break;
			}
			this.anIntArray561[local109] = local114;
			this.anIntArray560[local109] = arg0.method6134();
			this.anIntArray564[local109] = arg0.method6174();
		}
		this.anInt7015 = arg0.method6174();
		this.anInt7012 = arg0.method6174();
		this.anInt7014 = arg0.method6148();
		this.anInt7013 = arg0.method6148();
		this.aClass154_1 = new Class154();
		this.aClass164_1 = new Class164();
		this.aClass154_1.method3098(arg0, this.aClass164_1);
	}
}
