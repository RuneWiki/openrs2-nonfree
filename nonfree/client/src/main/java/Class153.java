import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class153 {

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "[I")
	private static final int[] anIntArray344 = new int[32768];

	@OriginalMember(owner = "client!lp", name = "g", descriptor = "[I")
	private static final int[] anIntArray346;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "Lclient!ht;")
	private Class109 aClass109_1;

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "Lclient!ht;")
	private Class109 aClass109_2;

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "Lclient!ht;")
	private Class109 aClass109_3;

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "Lclient!ht;")
	private Class109 aClass109_4;

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "Lclient!ht;")
	private Class109 aClass109_5;

	@OriginalMember(owner = "client!lp", name = "m", descriptor = "Lclient!ht;")
	private Class109 aClass109_6;

	@OriginalMember(owner = "client!lp", name = "r", descriptor = "Lclient!ht;")
	private Class109 aClass109_7;

	@OriginalMember(owner = "client!lp", name = "t", descriptor = "Lclient!ht;")
	private Class109 aClass109_8;

	@OriginalMember(owner = "client!lp", name = "v", descriptor = "Lclient!ht;")
	private Class109 aClass109_9;

	@OriginalMember(owner = "client!lp", name = "w", descriptor = "Lclient!ll;")
	private Class150 aClass150_1;

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "I")
	private int anInt4207 = 0;

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "[I")
	private final int[] anIntArray345 = new int[5];

	@OriginalMember(owner = "client!lp", name = "j", descriptor = "I")
	public int anInt4208 = 0;

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
	public int anInt4210 = 500;

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
	private int anInt4209 = 100;

	@OriginalMember(owner = "client!lp", name = "y", descriptor = "[I")
	private final int[] anIntArray354 = new int[5];

	@OriginalMember(owner = "client!lp", name = "o", descriptor = "[I")
	private final int[] anIntArray348 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray344[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray346 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray346[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)I")
	private int method3503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray346[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray344[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!hp;)V")
	public void method3504(@OriginalArg(0) Class1_Sub5 arg0) {
		this.aClass109_7 = new Class109();
		this.aClass109_7.method2559(arg0);
		this.aClass109_2 = new Class109();
		this.aClass109_2.method2559(arg0);
		@Pc(21) int local21 = arg0.method5366();
		if (local21 != 0) {
			arg0.anInt6475--;
			this.aClass109_1 = new Class109();
			this.aClass109_1.method2559(arg0);
			this.aClass109_6 = new Class109();
			this.aClass109_6.method2559(arg0);
		}
		local21 = arg0.method5366();
		if (local21 != 0) {
			arg0.anInt6475--;
			this.aClass109_9 = new Class109();
			this.aClass109_9.method2559(arg0);
			this.aClass109_3 = new Class109();
			this.aClass109_3.method2559(arg0);
		}
		local21 = arg0.method5366();
		if (local21 != 0) {
			arg0.anInt6475--;
			this.aClass109_4 = new Class109();
			this.aClass109_4.method2559(arg0);
			this.aClass109_5 = new Class109();
			this.aClass109_5.method2559(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method5361();
			if (local114 == 0) {
				break;
			}
			this.anIntArray348[local109] = local114;
			this.anIntArray345[local109] = arg0.method5413();
			this.anIntArray354[local109] = arg0.method5361();
		}
		this.anInt4207 = arg0.method5361();
		this.anInt4209 = arg0.method5361();
		this.anInt4210 = arg0.method5362();
		this.anInt4208 = arg0.method5362();
		this.aClass150_1 = new Class150();
		this.aClass109_8 = new Class109();
		this.aClass150_1.method3460(arg0, this.aClass109_8);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)[I")
	public int[] method3505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static468.method4331(Static230.anIntArray347, 0, arg0);
		if (arg1 < 10) {
			return Static230.anIntArray347;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass109_7.method2560();
		this.aClass109_2.method2560();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass109_1 != null) {
			this.aClass109_1.method2560();
			this.aClass109_6.method2560();
			local24 = (int) ((double) (this.aClass109_1.anInt2959 - this.aClass109_1.anInt2960) * 32.768D / local16);
			local26 = (int) ((double) this.aClass109_1.anInt2960 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass109_9 != null) {
			this.aClass109_9.method2560();
			this.aClass109_3.method2560();
			local63 = (int) ((double) (this.aClass109_9.anInt2959 - this.aClass109_9.anInt2960) * 32.768D / local16);
			local65 = (int) ((double) this.aClass109_9.anInt2960 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray348[local102] != 0) {
				Static230.anIntArray353[local102] = 0;
				Static230.anIntArray352[local102] = (int) ((double) this.anIntArray354[local102] * local16);
				Static230.anIntArray349[local102] = (this.anIntArray348[local102] << 14) / 100;
				Static230.anIntArray350[local102] = (int) ((double) (this.aClass109_7.anInt2959 - this.aClass109_7.anInt2960) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray345[local102]) / local16);
				Static230.anIntArray351[local102] = (int) ((double) this.aClass109_7.anInt2960 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass109_7.method2557(arg0);
			local187 = this.aClass109_2.method2557(arg0);
			if (this.aClass109_1 != null) {
				local195 = this.aClass109_1.method2557(arg0);
				local200 = this.aClass109_6.method2557(arg0);
				local182 += this.method3503(local28, local200, this.aClass109_1.anInt2961) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass109_9 != null) {
				local195 = this.aClass109_9.method2557(arg0);
				local200 = this.aClass109_3.method2557(arg0);
				local187 = local187 * ((this.method3503(local67, local200, this.aClass109_9.anInt2961) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray348[local195] != 0) {
					local200 = local176 + Static230.anIntArray352[local195];
					if (local200 < arg0) {
						Static230.anIntArray347[local200] += this.method3503(Static230.anIntArray353[local195], local187 * Static230.anIntArray349[local195] >> 15, this.aClass109_7.anInt2961);
						Static230.anIntArray353[local195] += (local182 * Static230.anIntArray350[local195] >> 16) + Static230.anIntArray351[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass109_4 != null) {
			this.aClass109_4.method2560();
			this.aClass109_5.method2560();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass109_4.method2557(arg0);
				local352 = this.aClass109_5.method2557(arg0);
				if (local339) {
					local187 = this.aClass109_4.anInt2960 + ((this.aClass109_4.anInt2959 - this.aClass109_4.anInt2960) * local347 >> 8);
				} else {
					local187 = this.aClass109_4.anInt2960 + ((this.aClass109_4.anInt2959 - this.aClass109_4.anInt2960) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static230.anIntArray347[local200] = 0;
				}
			}
		}
		if (this.anInt4207 > 0 && this.anInt4209 > 0) {
			local182 = (int) ((double) this.anInt4207 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static230.anIntArray347[local187] += Static230.anIntArray347[local187 - local182] * this.anInt4209 / 100;
			}
		}
		if (this.aClass150_1.anIntArray337[0] > 0 || this.aClass150_1.anIntArray337[1] > 0) {
			this.aClass109_8.method2560();
			local182 = this.aClass109_8.method2557(arg0 + 1);
			local187 = this.aClass150_1.method3461(0, (float) local182 / 65536.0F);
			local195 = this.aClass150_1.method3461(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static230.anIntArray347[local200 + local187] * (long) Static226.anInt4123 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static230.anIntArray347[local200 + local187 - local519 - 1] * (long) Static226.anIntArrayArray43[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static230.anIntArray347[local200 - local549 - 1] * (long) Static226.anIntArrayArray43[1][local549] >> 16);
					}
					Static230.anIntArray347[local200] = local352;
					local182 = this.aClass109_8.method2557(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static230.anIntArray347[local200 + local187] * (long) Static226.anInt4123 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static230.anIntArray347[local200 + local187 - local519 - 1] * (long) Static226.anIntArrayArray43[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static230.anIntArray347[local200 - local549 - 1] * (long) Static226.anIntArrayArray43[1][local549] >> 16);
						}
						Static230.anIntArray347[local200] = local352;
						local182 = this.aClass109_8.method2557(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static230.anIntArray347[local200 + local187 - local519 - 1] * (long) Static226.anIntArrayArray43[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static230.anIntArray347[local200 - local549 - 1] * (long) Static226.anIntArrayArray43[1][local549] >> 16);
							}
							Static230.anIntArray347[local200] = local352;
							this.aClass109_8.method2557(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass150_1.method3461(0, (float) local182 / 65536.0F);
					local195 = this.aClass150_1.method3461(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static230.anIntArray347[local182] < -32768) {
				Static230.anIntArray347[local182] = -32768;
			}
			if (Static230.anIntArray347[local182] > 32767) {
				Static230.anIntArray347[local182] = 32767;
			}
		}
		return Static230.anIntArray347;
	}
}
