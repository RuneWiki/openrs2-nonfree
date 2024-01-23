import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class107 {

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "[I")
	private static int[] anIntArray622 = new int[32768];

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "[I")
	private static int[] anIntArray621;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "Lclient!la;")
	private Class62 aClass62_1;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "Lclient!kd;")
	private Class57 aClass57_1;

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "Lclient!kd;")
	private Class57 aClass57_2;

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "Lclient!kd;")
	private Class57 aClass57_3;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "Lclient!kd;")
	private Class57 aClass57_4;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "Lclient!kd;")
	private Class57 aClass57_5;

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "Lclient!kd;")
	private Class57 aClass57_6;

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "Lclient!kd;")
	private Class57 aClass57_7;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "Lclient!kd;")
	private Class57 aClass57_8;

	@OriginalMember(owner = "client!wc", name = "y", descriptor = "Lclient!kd;")
	private Class57 aClass57_9;

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "[I")
	private int[] anIntArray618 = new int[5];

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
	public int anInt4588 = 500;

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
	private int anInt4590 = 100;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "[I")
	private int[] anIntArray620 = new int[5];

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "[I")
	private int[] anIntArray623 = new int[5];

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
	private int anInt4591 = 0;

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
	public int anInt4589 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray622[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray621 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray621[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!nc;)V")
	public void method3380(@OriginalArg(0) Class1_Sub9 arg0) {
		this.aClass57_9 = new Class57();
		this.aClass57_9.method1766(arg0);
		this.aClass57_8 = new Class57();
		this.aClass57_8.method1766(arg0);
		@Pc(21) int local21 = arg0.method895();
		if (local21 != 0) {
			arg0.anInt1192--;
			this.aClass57_3 = new Class57();
			this.aClass57_3.method1766(arg0);
			this.aClass57_4 = new Class57();
			this.aClass57_4.method1766(arg0);
		}
		local21 = arg0.method895();
		if (local21 != 0) {
			arg0.anInt1192--;
			this.aClass57_6 = new Class57();
			this.aClass57_6.method1766(arg0);
			this.aClass57_5 = new Class57();
			this.aClass57_5.method1766(arg0);
		}
		local21 = arg0.method895();
		if (local21 != 0) {
			arg0.anInt1192--;
			this.aClass57_1 = new Class57();
			this.aClass57_1.method1766(arg0);
			this.aClass57_2 = new Class57();
			this.aClass57_2.method1766(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method900();
			if (local114 == 0) {
				break;
			}
			this.anIntArray618[local109] = local114;
			this.anIntArray620[local109] = arg0.method926();
			this.anIntArray623[local109] = arg0.method900();
		}
		this.anInt4591 = arg0.method900();
		this.anInt4590 = arg0.method900();
		this.anInt4588 = arg0.method946();
		this.anInt4589 = arg0.method946();
		this.aClass62_1 = new Class62();
		this.aClass57_7 = new Class57();
		this.aClass62_1.method1894(arg0, this.aClass57_7);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)I")
	private int method3381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray621[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray622[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)[I")
	public int[] method3382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static221.method33(Static215.anIntArray619, 0, arg0);
		if (arg1 < 10) {
			return Static215.anIntArray619;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass57_9.method1767();
		this.aClass57_8.method1767();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass57_3 != null) {
			this.aClass57_3.method1767();
			this.aClass57_4.method1767();
			local24 = (int) ((double) (this.aClass57_3.anInt2358 - this.aClass57_3.anInt2355) * 32.768D / local16);
			local26 = (int) ((double) this.aClass57_3.anInt2355 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass57_6 != null) {
			this.aClass57_6.method1767();
			this.aClass57_5.method1767();
			local63 = (int) ((double) (this.aClass57_6.anInt2358 - this.aClass57_6.anInt2355) * 32.768D / local16);
			local65 = (int) ((double) this.aClass57_6.anInt2355 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray618[local102] != 0) {
				Static215.anIntArray624[local102] = 0;
				Static215.anIntArray626[local102] = (int) ((double) this.anIntArray623[local102] * local16);
				Static215.anIntArray627[local102] = (this.anIntArray618[local102] << 14) / 100;
				Static215.anIntArray628[local102] = (int) ((double) (this.aClass57_9.anInt2358 - this.aClass57_9.anInt2355) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray620[local102]) / local16);
				Static215.anIntArray625[local102] = (int) ((double) this.aClass57_9.anInt2355 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass57_9.method1764(arg0);
			local187 = this.aClass57_8.method1764(arg0);
			if (this.aClass57_3 != null) {
				local195 = this.aClass57_3.method1764(arg0);
				local200 = this.aClass57_4.method1764(arg0);
				local182 += this.method3381(local28, local200, this.aClass57_3.anInt2356) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass57_6 != null) {
				local195 = this.aClass57_6.method1764(arg0);
				local200 = this.aClass57_5.method1764(arg0);
				local187 = local187 * ((this.method3381(local67, local200, this.aClass57_6.anInt2356) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray618[local195] != 0) {
					local200 = local176 + Static215.anIntArray626[local195];
					if (local200 < arg0) {
						Static215.anIntArray619[local200] += this.method3381(Static215.anIntArray624[local195], local187 * Static215.anIntArray627[local195] >> 15, this.aClass57_9.anInt2356);
						Static215.anIntArray624[local195] += (local182 * Static215.anIntArray628[local195] >> 16) + Static215.anIntArray625[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass57_1 != null) {
			this.aClass57_1.method1767();
			this.aClass57_2.method1767();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass57_1.method1764(arg0);
				local352 = this.aClass57_2.method1764(arg0);
				if (local339) {
					local187 = this.aClass57_1.anInt2355 + ((this.aClass57_1.anInt2358 - this.aClass57_1.anInt2355) * local347 >> 8);
				} else {
					local187 = this.aClass57_1.anInt2355 + ((this.aClass57_1.anInt2358 - this.aClass57_1.anInt2355) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static215.anIntArray619[local200] = 0;
				}
			}
		}
		if (this.anInt4591 > 0 && this.anInt4590 > 0) {
			local182 = (int) ((double) this.anInt4591 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static215.anIntArray619[local187] += Static215.anIntArray619[local187 - local182] * this.anInt4590 / 100;
			}
		}
		if (this.aClass62_1.anIntArray312[0] > 0 || this.aClass62_1.anIntArray312[1] > 0) {
			this.aClass57_7.method1767();
			local182 = this.aClass57_7.method1764(arg0 + 1);
			local187 = this.aClass62_1.method1889(0, (float) local182 / 65536.0F);
			local195 = this.aClass62_1.method1889(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static215.anIntArray619[local200 + local187] * (long) Static109.anInt2513 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static215.anIntArray619[local200 + local187 - local519 - 1] * (long) Static109.anIntArrayArray41[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static215.anIntArray619[local200 - local549 - 1] * (long) Static109.anIntArrayArray41[1][local549] >> 16);
					}
					Static215.anIntArray619[local200] = local352;
					local182 = this.aClass57_7.method1764(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static215.anIntArray619[local200 + local187] * (long) Static109.anInt2513 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static215.anIntArray619[local200 + local187 - local519 - 1] * (long) Static109.anIntArrayArray41[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static215.anIntArray619[local200 - local549 - 1] * (long) Static109.anIntArrayArray41[1][local549] >> 16);
						}
						Static215.anIntArray619[local200] = local352;
						local182 = this.aClass57_7.method1764(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static215.anIntArray619[local200 + local187 - local519 - 1] * (long) Static109.anIntArrayArray41[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static215.anIntArray619[local200 - local549 - 1] * (long) Static109.anIntArrayArray41[1][local549] >> 16);
							}
							Static215.anIntArray619[local200] = local352;
							this.aClass57_7.method1764(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass62_1.method1889(0, (float) local182 / 65536.0F);
					local195 = this.aClass62_1.method1889(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static215.anIntArray619[local182] < -32768) {
				Static215.anIntArray619[local182] = -32768;
			}
			if (Static215.anIntArray619[local182] > 32767) {
				Static215.anIntArray619[local182] = 32767;
			}
		}
		return Static215.anIntArray619;
	}
}
