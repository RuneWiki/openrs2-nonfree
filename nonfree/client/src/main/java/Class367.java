import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class367 {

	@OriginalMember(owner = "client!ww", name = "k", descriptor = "[I")
	private static final int[] anIntArray621 = new int[32768];

	@OriginalMember(owner = "client!ww", name = "n", descriptor = "[I")
	private static final int[] anIntArray623;

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "Lclient!fp;")
	private Class104 aClass104_1;

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "Lclient!fp;")
	private Class104 aClass104_2;

	@OriginalMember(owner = "client!ww", name = "d", descriptor = "Lclient!fp;")
	private Class104 aClass104_3;

	@OriginalMember(owner = "client!ww", name = "f", descriptor = "Lclient!vg;")
	private Class348 aClass348_1;

	@OriginalMember(owner = "client!ww", name = "h", descriptor = "Lclient!fp;")
	private Class104 aClass104_4;

	@OriginalMember(owner = "client!ww", name = "i", descriptor = "Lclient!fp;")
	private Class104 aClass104_5;

	@OriginalMember(owner = "client!ww", name = "j", descriptor = "Lclient!fp;")
	private Class104 aClass104_6;

	@OriginalMember(owner = "client!ww", name = "o", descriptor = "Lclient!fp;")
	private Class104 aClass104_7;

	@OriginalMember(owner = "client!ww", name = "p", descriptor = "Lclient!fp;")
	private Class104 aClass104_8;

	@OriginalMember(owner = "client!ww", name = "q", descriptor = "Lclient!fp;")
	private Class104 aClass104_9;

	@OriginalMember(owner = "client!ww", name = "e", descriptor = "I")
	public int anInt9819 = 0;

	@OriginalMember(owner = "client!ww", name = "g", descriptor = "I")
	public int anInt9820 = 500;

	@OriginalMember(owner = "client!ww", name = "l", descriptor = "I")
	private int anInt9821 = 0;

	@OriginalMember(owner = "client!ww", name = "v", descriptor = "I")
	private int anInt9822 = 100;

	@OriginalMember(owner = "client!ww", name = "u", descriptor = "[I")
	private final int[] anIntArray627 = new int[5];

	@OriginalMember(owner = "client!ww", name = "m", descriptor = "[I")
	private final int[] anIntArray622 = new int[5];

	@OriginalMember(owner = "client!ww", name = "y", descriptor = "[I")
	private final int[] anIntArray630 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray621[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray623 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray623[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(II)[I")
	public int[] method7989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static598.method777(Static596.anIntArray620, 0, arg0);
		if (arg1 < 10) {
			return Static596.anIntArray620;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass104_7.method2451();
		this.aClass104_5.method2451();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass104_1 != null) {
			this.aClass104_1.method2451();
			this.aClass104_3.method2451();
			local24 = (int) ((double) (this.aClass104_1.anInt2791 - this.aClass104_1.anInt2792) * 32.768D / local16);
			local26 = (int) ((double) this.aClass104_1.anInt2792 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass104_8 != null) {
			this.aClass104_8.method2451();
			this.aClass104_9.method2451();
			local63 = (int) ((double) (this.aClass104_8.anInt2791 - this.aClass104_8.anInt2792) * 32.768D / local16);
			local65 = (int) ((double) this.aClass104_8.anInt2792 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray630[local102] != 0) {
				Static596.anIntArray624[local102] = 0;
				Static596.anIntArray628[local102] = (int) ((double) this.anIntArray627[local102] * local16);
				Static596.anIntArray625[local102] = (this.anIntArray630[local102] << 14) / 100;
				Static596.anIntArray629[local102] = (int) ((double) (this.aClass104_7.anInt2791 - this.aClass104_7.anInt2792) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray622[local102]) / local16);
				Static596.anIntArray626[local102] = (int) ((double) this.aClass104_7.anInt2792 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass104_7.method2452(arg0);
			local187 = this.aClass104_5.method2452(arg0);
			if (this.aClass104_1 != null) {
				local195 = this.aClass104_1.method2452(arg0);
				local200 = this.aClass104_3.method2452(arg0);
				local182 += this.method7991(local28, local200, this.aClass104_1.anInt2789) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass104_8 != null) {
				local195 = this.aClass104_8.method2452(arg0);
				local200 = this.aClass104_9.method2452(arg0);
				local187 = local187 * ((this.method7991(local67, local200, this.aClass104_8.anInt2789) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray630[local195] != 0) {
					local200 = local176 + Static596.anIntArray628[local195];
					if (local200 < arg0) {
						Static596.anIntArray620[local200] += this.method7991(Static596.anIntArray624[local195], local187 * Static596.anIntArray625[local195] >> 15, this.aClass104_7.anInt2789);
						Static596.anIntArray624[local195] += (local182 * Static596.anIntArray629[local195] >> 16) + Static596.anIntArray626[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass104_4 != null) {
			this.aClass104_4.method2451();
			this.aClass104_6.method2451();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass104_4.method2452(arg0);
				local352 = this.aClass104_6.method2452(arg0);
				if (local339) {
					local187 = this.aClass104_4.anInt2792 + ((this.aClass104_4.anInt2791 - this.aClass104_4.anInt2792) * local347 >> 8);
				} else {
					local187 = this.aClass104_4.anInt2792 + ((this.aClass104_4.anInt2791 - this.aClass104_4.anInt2792) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static596.anIntArray620[local200] = 0;
				}
			}
		}
		if (this.anInt9821 > 0 && this.anInt9822 > 0) {
			local182 = (int) ((double) this.anInt9821 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static596.anIntArray620[local187] += Static596.anIntArray620[local187 - local182] * this.anInt9822 / 100;
			}
		}
		if (this.aClass348_1.anIntArray582[0] > 0 || this.aClass348_1.anIntArray582[1] > 0) {
			this.aClass104_2.method2451();
			local182 = this.aClass104_2.method2452(arg0 + 1);
			local187 = this.aClass348_1.method7520(0, (float) local182 / 65536.0F);
			local195 = this.aClass348_1.method7520(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static596.anIntArray620[local200 + local187] * (long) Static554.anInt9230 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static596.anIntArray620[local200 + local187 - local519 - 1] * (long) Static554.anIntArrayArray54[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static596.anIntArray620[local200 - local549 - 1] * (long) Static554.anIntArrayArray54[1][local549] >> 16);
					}
					Static596.anIntArray620[local200] = local352;
					local182 = this.aClass104_2.method2452(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static596.anIntArray620[local200 + local187] * (long) Static554.anInt9230 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static596.anIntArray620[local200 + local187 - local519 - 1] * (long) Static554.anIntArrayArray54[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static596.anIntArray620[local200 - local549 - 1] * (long) Static554.anIntArrayArray54[1][local549] >> 16);
						}
						Static596.anIntArray620[local200] = local352;
						local182 = this.aClass104_2.method2452(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static596.anIntArray620[local200 + local187 - local519 - 1] * (long) Static554.anIntArrayArray54[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static596.anIntArray620[local200 - local549 - 1] * (long) Static554.anIntArrayArray54[1][local549] >> 16);
							}
							Static596.anIntArray620[local200] = local352;
							this.aClass104_2.method2452(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass348_1.method7520(0, (float) local182 / 65536.0F);
					local195 = this.aClass348_1.method7520(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static596.anIntArray620[local182] < -32768) {
				Static596.anIntArray620[local182] = -32768;
			}
			if (Static596.anIntArray620[local182] > 32767) {
				Static596.anIntArray620[local182] = 32767;
			}
		}
		return Static596.anIntArray620;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!ac;)V")
	public void method7990(@OriginalArg(0) Class1_Sub3 arg0) {
		this.aClass104_7 = new Class104();
		this.aClass104_7.method2450(arg0);
		this.aClass104_5 = new Class104();
		this.aClass104_5.method2450(arg0);
		@Pc(21) int local21 = arg0.method7974();
		if (local21 != 0) {
			arg0.anInt9802--;
			this.aClass104_1 = new Class104();
			this.aClass104_1.method2450(arg0);
			this.aClass104_3 = new Class104();
			this.aClass104_3.method2450(arg0);
		}
		local21 = arg0.method7974();
		if (local21 != 0) {
			arg0.anInt9802--;
			this.aClass104_8 = new Class104();
			this.aClass104_8.method2450(arg0);
			this.aClass104_9 = new Class104();
			this.aClass104_9.method2450(arg0);
		}
		local21 = arg0.method7974();
		if (local21 != 0) {
			arg0.anInt9802--;
			this.aClass104_4 = new Class104();
			this.aClass104_4.method2450(arg0);
			this.aClass104_6 = new Class104();
			this.aClass104_6.method2450(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method7971();
			if (local114 == 0) {
				break;
			}
			this.anIntArray630[local109] = local114;
			this.anIntArray622[local109] = arg0.method7955();
			this.anIntArray627[local109] = arg0.method7971();
		}
		this.anInt9821 = arg0.method7971();
		this.anInt9822 = arg0.method7971();
		this.anInt9820 = arg0.method7945();
		this.anInt9819 = arg0.method7945();
		this.aClass348_1 = new Class348();
		this.aClass104_2 = new Class104();
		this.aClass348_1.method7521(arg0, this.aClass104_2);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(III)I")
	private int method7991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray623[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray621[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
