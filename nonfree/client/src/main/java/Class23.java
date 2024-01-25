import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bba")
public final class Class23 {

	@OriginalMember(owner = "client!bba", name = "p", descriptor = "[I")
	private static final int[] anIntArray40 = new int[32768];

	@OriginalMember(owner = "client!bba", name = "o", descriptor = "[I")
	private static final int[] anIntArray39;

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "Lclient!gd;")
	private Class110 aClass110_1;

	@OriginalMember(owner = "client!bba", name = "c", descriptor = "Lclient!un;")
	private Class293 aClass293_1;

	@OriginalMember(owner = "client!bba", name = "g", descriptor = "Lclient!gd;")
	private Class110 aClass110_2;

	@OriginalMember(owner = "client!bba", name = "h", descriptor = "Lclient!gd;")
	private Class110 aClass110_3;

	@OriginalMember(owner = "client!bba", name = "i", descriptor = "Lclient!gd;")
	private Class110 aClass110_4;

	@OriginalMember(owner = "client!bba", name = "j", descriptor = "Lclient!gd;")
	private Class110 aClass110_5;

	@OriginalMember(owner = "client!bba", name = "m", descriptor = "Lclient!gd;")
	private Class110 aClass110_6;

	@OriginalMember(owner = "client!bba", name = "n", descriptor = "Lclient!gd;")
	private Class110 aClass110_7;

	@OriginalMember(owner = "client!bba", name = "s", descriptor = "Lclient!gd;")
	private Class110 aClass110_8;

	@OriginalMember(owner = "client!bba", name = "w", descriptor = "Lclient!gd;")
	private Class110 aClass110_9;

	@OriginalMember(owner = "client!bba", name = "f", descriptor = "I")
	private int anInt603 = 0;

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "I")
	private int anInt601 = 100;

	@OriginalMember(owner = "client!bba", name = "d", descriptor = "[I")
	private final int[] anIntArray36 = new int[5];

	@OriginalMember(owner = "client!bba", name = "k", descriptor = "[I")
	private final int[] anIntArray37 = new int[5];

	@OriginalMember(owner = "client!bba", name = "q", descriptor = "[I")
	private final int[] anIntArray41 = new int[5];

	@OriginalMember(owner = "client!bba", name = "e", descriptor = "I")
	public int anInt602 = 0;

	@OriginalMember(owner = "client!bba", name = "r", descriptor = "I")
	public int anInt604 = 500;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray40[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray39 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray39[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(II)[I")
	public int[] method691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static553.method2528(Static29.anIntArray38, 0, arg0);
		if (arg1 < 10) {
			return Static29.anIntArray38;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass110_8.method2827();
		this.aClass110_5.method2827();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass110_7 != null) {
			this.aClass110_7.method2827();
			this.aClass110_9.method2827();
			local24 = (int) ((double) (this.aClass110_7.anInt3176 - this.aClass110_7.anInt3177) * 32.768D / local16);
			local26 = (int) ((double) this.aClass110_7.anInt3177 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass110_3 != null) {
			this.aClass110_3.method2827();
			this.aClass110_6.method2827();
			local63 = (int) ((double) (this.aClass110_3.anInt3176 - this.aClass110_3.anInt3177) * 32.768D / local16);
			local65 = (int) ((double) this.aClass110_3.anInt3177 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray37[local102] != 0) {
				Static29.anIntArray45[local102] = 0;
				Static29.anIntArray46[local102] = (int) ((double) this.anIntArray41[local102] * local16);
				Static29.anIntArray43[local102] = (this.anIntArray37[local102] << 14) / 100;
				Static29.anIntArray44[local102] = (int) ((double) (this.aClass110_8.anInt3176 - this.aClass110_8.anInt3177) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray36[local102]) / local16);
				Static29.anIntArray42[local102] = (int) ((double) this.aClass110_8.anInt3177 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass110_8.method2828(arg0);
			local187 = this.aClass110_5.method2828(arg0);
			if (this.aClass110_7 != null) {
				local195 = this.aClass110_7.method2828(arg0);
				local200 = this.aClass110_9.method2828(arg0);
				local182 += this.method694(local28, local200, this.aClass110_7.anInt3175) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass110_3 != null) {
				local195 = this.aClass110_3.method2828(arg0);
				local200 = this.aClass110_6.method2828(arg0);
				local187 = local187 * ((this.method694(local67, local200, this.aClass110_3.anInt3175) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray37[local195] != 0) {
					local200 = local176 + Static29.anIntArray46[local195];
					if (local200 < arg0) {
						Static29.anIntArray38[local200] += this.method694(Static29.anIntArray45[local195], local187 * Static29.anIntArray43[local195] >> 15, this.aClass110_8.anInt3175);
						Static29.anIntArray45[local195] += (local182 * Static29.anIntArray44[local195] >> 16) + Static29.anIntArray42[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass110_4 != null) {
			this.aClass110_4.method2827();
			this.aClass110_2.method2827();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass110_4.method2828(arg0);
				local352 = this.aClass110_2.method2828(arg0);
				if (local339) {
					local187 = this.aClass110_4.anInt3177 + ((this.aClass110_4.anInt3176 - this.aClass110_4.anInt3177) * local347 >> 8);
				} else {
					local187 = this.aClass110_4.anInt3177 + ((this.aClass110_4.anInt3176 - this.aClass110_4.anInt3177) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static29.anIntArray38[local200] = 0;
				}
			}
		}
		if (this.anInt603 > 0 && this.anInt601 > 0) {
			local182 = (int) ((double) this.anInt603 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static29.anIntArray38[local187] += Static29.anIntArray38[local187 - local182] * this.anInt601 / 100;
			}
		}
		if (this.aClass293_1.anIntArray662[0] > 0 || this.aClass293_1.anIntArray662[1] > 0) {
			this.aClass110_1.method2827();
			local182 = this.aClass110_1.method2828(arg0 + 1);
			local187 = this.aClass293_1.method6884(0, (float) local182 / 65536.0F);
			local195 = this.aClass293_1.method6884(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static29.anIntArray38[local200 + local187] * (long) Static498.anInt8517 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static29.anIntArray38[local200 + local187 - local519 - 1] * (long) Static498.anIntArrayArray71[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static29.anIntArray38[local200 - local549 - 1] * (long) Static498.anIntArrayArray71[1][local549] >> 16);
					}
					Static29.anIntArray38[local200] = local352;
					local182 = this.aClass110_1.method2828(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static29.anIntArray38[local200 + local187] * (long) Static498.anInt8517 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static29.anIntArray38[local200 + local187 - local519 - 1] * (long) Static498.anIntArrayArray71[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static29.anIntArray38[local200 - local549 - 1] * (long) Static498.anIntArrayArray71[1][local549] >> 16);
						}
						Static29.anIntArray38[local200] = local352;
						local182 = this.aClass110_1.method2828(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static29.anIntArray38[local200 + local187 - local519 - 1] * (long) Static498.anIntArrayArray71[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static29.anIntArray38[local200 - local549 - 1] * (long) Static498.anIntArrayArray71[1][local549] >> 16);
							}
							Static29.anIntArray38[local200] = local352;
							this.aClass110_1.method2828(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass293_1.method6884(0, (float) local182 / 65536.0F);
					local195 = this.aClass293_1.method6884(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static29.anIntArray38[local182] < -32768) {
				Static29.anIntArray38[local182] = -32768;
			}
			if (Static29.anIntArray38[local182] > 32767) {
				Static29.anIntArray38[local182] = 32767;
			}
		}
		return Static29.anIntArray38;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lclient!co;)V")
	public void method692(@OriginalArg(0) Class5_Sub3 arg0) {
		this.aClass110_8 = new Class110();
		this.aClass110_8.method2826(arg0);
		this.aClass110_5 = new Class110();
		this.aClass110_5.method2826(arg0);
		@Pc(21) int local21 = arg0.method4220();
		if (local21 != 0) {
			arg0.anInt4960--;
			this.aClass110_7 = new Class110();
			this.aClass110_7.method2826(arg0);
			this.aClass110_9 = new Class110();
			this.aClass110_9.method2826(arg0);
		}
		local21 = arg0.method4220();
		if (local21 != 0) {
			arg0.anInt4960--;
			this.aClass110_3 = new Class110();
			this.aClass110_3.method2826(arg0);
			this.aClass110_6 = new Class110();
			this.aClass110_6.method2826(arg0);
		}
		local21 = arg0.method4220();
		if (local21 != 0) {
			arg0.anInt4960--;
			this.aClass110_4 = new Class110();
			this.aClass110_4.method2826(arg0);
			this.aClass110_2 = new Class110();
			this.aClass110_2.method2826(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method4231();
			if (local114 == 0) {
				break;
			}
			this.anIntArray37[local109] = local114;
			this.anIntArray36[local109] = arg0.method4190();
			this.anIntArray41[local109] = arg0.method4231();
		}
		this.anInt603 = arg0.method4231();
		this.anInt601 = arg0.method4231();
		this.anInt604 = arg0.method4227();
		this.anInt602 = arg0.method4227();
		this.aClass293_1 = new Class293();
		this.aClass110_1 = new Class110();
		this.aClass293_1.method6880(arg0, this.aClass110_1);
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(III)I")
	private int method694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray39[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray40[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
