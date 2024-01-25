import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class17 {

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "[I")
	private static final int[] anIntArray47 = new int[32768];

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "[I")
	private static final int[] anIntArray48;

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "Lclient!ov;")
	private Class181 aClass181_1;

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "Lclient!ov;")
	private Class181 aClass181_2;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "Lclient!ov;")
	private Class181 aClass181_3;

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "Lclient!ov;")
	private Class181 aClass181_4;

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "Lclient!ov;")
	private Class181 aClass181_5;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "Lclient!ov;")
	private Class181 aClass181_6;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "Lclient!qp;")
	private Class197 aClass197_1;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "Lclient!ov;")
	private Class181 aClass181_7;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "Lclient!ov;")
	private Class181 aClass181_8;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "Lclient!ov;")
	private Class181 aClass181_9;

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "[I")
	private final int[] anIntArray46 = new int[5];

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
	public int anInt658 = 0;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
	public int anInt661 = 500;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
	private int anInt660 = 100;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
	private int anInt659 = 0;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "[I")
	private final int[] anIntArray49 = new int[5];

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "[I")
	private final int[] anIntArray55 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray47[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray48 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray48[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)[I")
	public int[] method520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static457.method1213(Static24.anIntArray45, 0, arg0);
		if (arg1 < 10) {
			return Static24.anIntArray45;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass181_1.method4075();
		this.aClass181_3.method4075();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass181_9 != null) {
			this.aClass181_9.method4075();
			this.aClass181_8.method4075();
			local24 = (int) ((double) (this.aClass181_9.anInt5308 - this.aClass181_9.anInt5307) * 32.768D / local16);
			local26 = (int) ((double) this.aClass181_9.anInt5307 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass181_6 != null) {
			this.aClass181_6.method4075();
			this.aClass181_5.method4075();
			local63 = (int) ((double) (this.aClass181_6.anInt5308 - this.aClass181_6.anInt5307) * 32.768D / local16);
			local65 = (int) ((double) this.aClass181_6.anInt5307 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray55[local102] != 0) {
				Static24.anIntArray52[local102] = 0;
				Static24.anIntArray53[local102] = (int) ((double) this.anIntArray46[local102] * local16);
				Static24.anIntArray54[local102] = (this.anIntArray55[local102] << 14) / 100;
				Static24.anIntArray51[local102] = (int) ((double) (this.aClass181_1.anInt5308 - this.aClass181_1.anInt5307) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray49[local102]) / local16);
				Static24.anIntArray50[local102] = (int) ((double) this.aClass181_1.anInt5307 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass181_1.method4076(arg0);
			local187 = this.aClass181_3.method4076(arg0);
			if (this.aClass181_9 != null) {
				local195 = this.aClass181_9.method4076(arg0);
				local200 = this.aClass181_8.method4076(arg0);
				local182 += this.method522(local28, local200, this.aClass181_9.anInt5305) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass181_6 != null) {
				local195 = this.aClass181_6.method4076(arg0);
				local200 = this.aClass181_5.method4076(arg0);
				local187 = local187 * ((this.method522(local67, local200, this.aClass181_6.anInt5305) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray55[local195] != 0) {
					local200 = local176 + Static24.anIntArray53[local195];
					if (local200 < arg0) {
						Static24.anIntArray45[local200] += this.method522(Static24.anIntArray52[local195], local187 * Static24.anIntArray54[local195] >> 15, this.aClass181_1.anInt5305);
						Static24.anIntArray52[local195] += (local182 * Static24.anIntArray51[local195] >> 16) + Static24.anIntArray50[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass181_4 != null) {
			this.aClass181_4.method4075();
			this.aClass181_2.method4075();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass181_4.method4076(arg0);
				local352 = this.aClass181_2.method4076(arg0);
				if (local339) {
					local187 = this.aClass181_4.anInt5307 + ((this.aClass181_4.anInt5308 - this.aClass181_4.anInt5307) * local347 >> 8);
				} else {
					local187 = this.aClass181_4.anInt5307 + ((this.aClass181_4.anInt5308 - this.aClass181_4.anInt5307) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static24.anIntArray45[local200] = 0;
				}
			}
		}
		if (this.anInt659 > 0 && this.anInt660 > 0) {
			local182 = (int) ((double) this.anInt659 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static24.anIntArray45[local187] += Static24.anIntArray45[local187 - local182] * this.anInt660 / 100;
			}
		}
		if (this.aClass197_1.anIntArray510[0] > 0 || this.aClass197_1.anIntArray510[1] > 0) {
			this.aClass181_7.method4075();
			local182 = this.aClass181_7.method4076(arg0 + 1);
			local187 = this.aClass197_1.method4484(0, (float) local182 / 65536.0F);
			local195 = this.aClass197_1.method4484(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static24.anIntArray45[local200 + local187] * (long) Static330.anInt5811 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static24.anIntArray45[local200 + local187 - local519 - 1] * (long) Static330.anIntArrayArray52[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static24.anIntArray45[local200 - local549 - 1] * (long) Static330.anIntArrayArray52[1][local549] >> 16);
					}
					Static24.anIntArray45[local200] = local352;
					local182 = this.aClass181_7.method4076(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static24.anIntArray45[local200 + local187] * (long) Static330.anInt5811 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static24.anIntArray45[local200 + local187 - local519 - 1] * (long) Static330.anIntArrayArray52[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static24.anIntArray45[local200 - local549 - 1] * (long) Static330.anIntArrayArray52[1][local549] >> 16);
						}
						Static24.anIntArray45[local200] = local352;
						local182 = this.aClass181_7.method4076(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static24.anIntArray45[local200 + local187 - local519 - 1] * (long) Static330.anIntArrayArray52[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static24.anIntArray45[local200 - local549 - 1] * (long) Static330.anIntArrayArray52[1][local549] >> 16);
							}
							Static24.anIntArray45[local200] = local352;
							this.aClass181_7.method4076(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass197_1.method4484(0, (float) local182 / 65536.0F);
					local195 = this.aClass197_1.method4484(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static24.anIntArray45[local182] < -32768) {
				Static24.anIntArray45[local182] = -32768;
			}
			if (Static24.anIntArray45[local182] > 32767) {
				Static24.anIntArray45[local182] = 32767;
			}
		}
		return Static24.anIntArray45;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!tl;)V")
	public void method521(@OriginalArg(0) Class4_Sub30 arg0) {
		this.aClass181_1 = new Class181();
		this.aClass181_1.method4073(arg0);
		this.aClass181_3 = new Class181();
		this.aClass181_3.method4073(arg0);
		@Pc(21) int local21 = arg0.method4864();
		if (local21 != 0) {
			arg0.anInt6244--;
			this.aClass181_9 = new Class181();
			this.aClass181_9.method4073(arg0);
			this.aClass181_8 = new Class181();
			this.aClass181_8.method4073(arg0);
		}
		local21 = arg0.method4864();
		if (local21 != 0) {
			arg0.anInt6244--;
			this.aClass181_6 = new Class181();
			this.aClass181_6.method4073(arg0);
			this.aClass181_5 = new Class181();
			this.aClass181_5.method4073(arg0);
		}
		local21 = arg0.method4864();
		if (local21 != 0) {
			arg0.anInt6244--;
			this.aClass181_4 = new Class181();
			this.aClass181_4.method4073(arg0);
			this.aClass181_2 = new Class181();
			this.aClass181_2.method4073(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method4844();
			if (local114 == 0) {
				break;
			}
			this.anIntArray55[local109] = local114;
			this.anIntArray49[local109] = arg0.method4862();
			this.anIntArray46[local109] = arg0.method4844();
		}
		this.anInt659 = arg0.method4844();
		this.anInt660 = arg0.method4844();
		this.anInt661 = arg0.method4877();
		this.anInt658 = arg0.method4877();
		this.aClass197_1 = new Class197();
		this.aClass181_7 = new Class181();
		this.aClass197_1.method4486(arg0, this.aClass181_7);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)I")
	private int method522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray48[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray47[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
