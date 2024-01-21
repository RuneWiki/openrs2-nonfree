import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class5 {

	@OriginalMember(owner = "client!b", name = "a", descriptor = "[I")
	public static int[] anIntArray14 = new int[32768];

	@OriginalMember(owner = "client!b", name = "f", descriptor = "[I")
	public static int[] anIntArray16;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "Lclient!vh;")
	private Class87 aClass87_1;

	@OriginalMember(owner = "client!b", name = "g", descriptor = "Lclient!vh;")
	private Class87 aClass87_2;

	@OriginalMember(owner = "client!b", name = "h", descriptor = "Lclient!vh;")
	private Class87 aClass87_3;

	@OriginalMember(owner = "client!b", name = "j", descriptor = "Lclient!je;")
	private Class43 aClass43_1;

	@OriginalMember(owner = "client!b", name = "l", descriptor = "Lclient!vh;")
	private Class87 aClass87_4;

	@OriginalMember(owner = "client!b", name = "m", descriptor = "Lclient!vh;")
	private Class87 aClass87_5;

	@OriginalMember(owner = "client!b", name = "n", descriptor = "Lclient!vh;")
	private Class87 aClass87_6;

	@OriginalMember(owner = "client!b", name = "s", descriptor = "Lclient!vh;")
	private Class87 aClass87_7;

	@OriginalMember(owner = "client!b", name = "v", descriptor = "Lclient!vh;")
	private Class87 aClass87_8;

	@OriginalMember(owner = "client!b", name = "w", descriptor = "Lclient!vh;")
	private Class87 aClass87_9;

	@OriginalMember(owner = "client!b", name = "d", descriptor = "I")
	public int anInt348 = 500;

	@OriginalMember(owner = "client!b", name = "e", descriptor = "I")
	private int anInt349 = 0;

	@OriginalMember(owner = "client!b", name = "i", descriptor = "[I")
	private final int[] anIntArray17 = new int[5];

	@OriginalMember(owner = "client!b", name = "p", descriptor = "I")
	public int anInt351 = 0;

	@OriginalMember(owner = "client!b", name = "t", descriptor = "[I")
	private final int[] anIntArray21 = new int[5];

	@OriginalMember(owner = "client!b", name = "o", descriptor = "I")
	private int anInt350 = 100;

	@OriginalMember(owner = "client!b", name = "y", descriptor = "[I")
	private final int[] anIntArray24 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray14[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray16 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray16[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!rd;)V")
	public void method279(@OriginalArg(0) Class3_Sub4 arg0) {
		this.aClass87_3 = new Class87();
		this.aClass87_3.method2761(arg0);
		this.aClass87_5 = new Class87();
		this.aClass87_5.method2761(arg0);
		@Pc(21) int local21 = arg0.method191();
		if (local21 != 0) {
			arg0.anInt232--;
			this.aClass87_9 = new Class87();
			this.aClass87_9.method2761(arg0);
			this.aClass87_8 = new Class87();
			this.aClass87_8.method2761(arg0);
		}
		local21 = arg0.method191();
		if (local21 != 0) {
			arg0.anInt232--;
			this.aClass87_7 = new Class87();
			this.aClass87_7.method2761(arg0);
			this.aClass87_4 = new Class87();
			this.aClass87_4.method2761(arg0);
		}
		local21 = arg0.method191();
		if (local21 != 0) {
			arg0.anInt232--;
			this.aClass87_1 = new Class87();
			this.aClass87_1.method2761(arg0);
			this.aClass87_6 = new Class87();
			this.aClass87_6.method2761(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method209();
			if (local114 == 0) {
				break;
			}
			this.anIntArray24[local109] = local114;
			this.anIntArray21[local109] = arg0.method216();
			this.anIntArray17[local109] = arg0.method209();
		}
		this.anInt349 = arg0.method209();
		this.anInt350 = arg0.method209();
		this.anInt348 = arg0.method208();
		this.anInt351 = arg0.method208();
		this.aClass43_1 = new Class43();
		this.aClass87_2 = new Class87();
		this.aClass43_1.method1255(arg0, this.aClass87_2);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III)I")
	private int method280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray16[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray14[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)[I")
	public int[] method282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static184.method1307(Static11.anIntArray15, 0, arg0);
		if (arg1 < 10) {
			return Static11.anIntArray15;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass87_3.method2762();
		this.aClass87_5.method2762();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass87_9 != null) {
			this.aClass87_9.method2762();
			this.aClass87_8.method2762();
			local24 = (int) ((double) (this.aClass87_9.anInt3836 - this.aClass87_9.anInt3839) * 32.768D / local16);
			local26 = (int) ((double) this.aClass87_9.anInt3839 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass87_7 != null) {
			this.aClass87_7.method2762();
			this.aClass87_4.method2762();
			local63 = (int) ((double) (this.aClass87_7.anInt3836 - this.aClass87_7.anInt3839) * 32.768D / local16);
			local65 = (int) ((double) this.aClass87_7.anInt3839 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray24[local102] != 0) {
				Static11.anIntArray23[local102] = 0;
				Static11.anIntArray22[local102] = (int) ((double) this.anIntArray17[local102] * local16);
				Static11.anIntArray18[local102] = (this.anIntArray24[local102] << 14) / 100;
				Static11.anIntArray19[local102] = (int) ((double) (this.aClass87_3.anInt3836 - this.aClass87_3.anInt3839) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray21[local102]) / local16);
				Static11.anIntArray20[local102] = (int) ((double) this.aClass87_3.anInt3839 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass87_3.method2763(arg0);
			local187 = this.aClass87_5.method2763(arg0);
			if (this.aClass87_9 != null) {
				local195 = this.aClass87_9.method2763(arg0);
				local200 = this.aClass87_8.method2763(arg0);
				local182 += this.method280(local28, local200, this.aClass87_9.anInt3838) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass87_7 != null) {
				local195 = this.aClass87_7.method2763(arg0);
				local200 = this.aClass87_4.method2763(arg0);
				local187 = local187 * ((this.method280(local67, local200, this.aClass87_7.anInt3838) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray24[local195] != 0) {
					local200 = local176 + Static11.anIntArray22[local195];
					if (local200 < arg0) {
						Static11.anIntArray15[local200] += this.method280(Static11.anIntArray23[local195], local187 * Static11.anIntArray18[local195] >> 15, this.aClass87_3.anInt3838);
						Static11.anIntArray23[local195] += (local182 * Static11.anIntArray19[local195] >> 16) + Static11.anIntArray20[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass87_1 != null) {
			this.aClass87_1.method2762();
			this.aClass87_6.method2762();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass87_1.method2763(arg0);
				local352 = this.aClass87_6.method2763(arg0);
				if (local339) {
					local187 = this.aClass87_1.anInt3839 + ((this.aClass87_1.anInt3836 - this.aClass87_1.anInt3839) * local347 >> 8);
				} else {
					local187 = this.aClass87_1.anInt3839 + ((this.aClass87_1.anInt3836 - this.aClass87_1.anInt3839) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static11.anIntArray15[local200] = 0;
				}
			}
		}
		if (this.anInt349 > 0 && this.anInt350 > 0) {
			local182 = (int) ((double) this.anInt349 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static11.anIntArray15[local187] += Static11.anIntArray15[local187 - local182] * this.anInt350 / 100;
			}
		}
		if (this.aClass43_1.anIntArray192[0] > 0 || this.aClass43_1.anIntArray192[1] > 0) {
			this.aClass87_2.method2762();
			local182 = this.aClass87_2.method2763(arg0 + 1);
			local187 = this.aClass43_1.method1253(0, (float) local182 / 65536.0F);
			local195 = this.aClass43_1.method1253(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static11.anIntArray15[local200 + local187] * (long) Static76.anInt1897 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static11.anIntArray15[local200 + local187 - local519 - 1] * (long) Static76.anIntArrayArray16[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static11.anIntArray15[local200 - local549 - 1] * (long) Static76.anIntArrayArray16[1][local549] >> 16);
					}
					Static11.anIntArray15[local200] = local352;
					local182 = this.aClass87_2.method2763(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static11.anIntArray15[local200 + local187] * (long) Static76.anInt1897 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static11.anIntArray15[local200 + local187 - local519 - 1] * (long) Static76.anIntArrayArray16[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static11.anIntArray15[local200 - local549 - 1] * (long) Static76.anIntArrayArray16[1][local549] >> 16);
						}
						Static11.anIntArray15[local200] = local352;
						local182 = this.aClass87_2.method2763(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static11.anIntArray15[local200 + local187 - local519 - 1] * (long) Static76.anIntArrayArray16[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static11.anIntArray15[local200 - local549 - 1] * (long) Static76.anIntArrayArray16[1][local549] >> 16);
							}
							Static11.anIntArray15[local200] = local352;
							this.aClass87_2.method2763(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass43_1.method1253(0, (float) local182 / 65536.0F);
					local195 = this.aClass43_1.method1253(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static11.anIntArray15[local182] < -32768) {
				Static11.anIntArray15[local182] = -32768;
			}
			if (Static11.anIntArray15[local182] > 32767) {
				Static11.anIntArray15[local182] = 32767;
			}
		}
		return Static11.anIntArray15;
	}
}
