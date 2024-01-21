import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class64 {

	@OriginalMember(owner = "client!og", name = "t", descriptor = "[I")
	public static int[] anIntArray296 = new int[32768];

	@OriginalMember(owner = "client!og", name = "o", descriptor = "[I")
	public static int[] anIntArray294;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "Lclient!ff;")
	private Class24 aClass24_1;

	@OriginalMember(owner = "client!og", name = "b", descriptor = "Lclient!ff;")
	private Class24 aClass24_2;

	@OriginalMember(owner = "client!og", name = "c", descriptor = "Lclient!ff;")
	private Class24 aClass24_3;

	@OriginalMember(owner = "client!og", name = "f", descriptor = "Lclient!ff;")
	private Class24 aClass24_4;

	@OriginalMember(owner = "client!og", name = "g", descriptor = "Lclient!ff;")
	private Class24 aClass24_5;

	@OriginalMember(owner = "client!og", name = "h", descriptor = "Lclient!ff;")
	private Class24 aClass24_6;

	@OriginalMember(owner = "client!og", name = "i", descriptor = "Lclient!ff;")
	private Class24 aClass24_7;

	@OriginalMember(owner = "client!og", name = "j", descriptor = "Lclient!ff;")
	private Class24 aClass24_8;

	@OriginalMember(owner = "client!og", name = "k", descriptor = "Lclient!ff;")
	private Class24 aClass24_9;

	@OriginalMember(owner = "client!og", name = "m", descriptor = "Lclient!rg;")
	private Class76 aClass76_1;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "[I")
	private final int[] anIntArray291 = new int[5];

	@OriginalMember(owner = "client!og", name = "l", descriptor = "[I")
	private final int[] anIntArray292 = new int[5];

	@OriginalMember(owner = "client!og", name = "n", descriptor = "[I")
	private final int[] anIntArray293 = new int[5];

	@OriginalMember(owner = "client!og", name = "q", descriptor = "I")
	public int anInt2754 = 500;

	@OriginalMember(owner = "client!og", name = "p", descriptor = "I")
	public int anInt2753 = 0;

	@OriginalMember(owner = "client!og", name = "e", descriptor = "I")
	private int anInt2752 = 0;

	@OriginalMember(owner = "client!og", name = "r", descriptor = "I")
	private int anInt2755 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray296[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray294 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray294[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!ka;)V")
	public void method2153(@OriginalArg(0) Class1_Sub8 arg0) {
		this.aClass24_3 = new Class24();
		this.aClass24_3.method897(arg0);
		this.aClass24_7 = new Class24();
		this.aClass24_7.method897(arg0);
		@Pc(21) int local21 = arg0.method336();
		if (local21 != 0) {
			arg0.anInt446--;
			this.aClass24_4 = new Class24();
			this.aClass24_4.method897(arg0);
			this.aClass24_6 = new Class24();
			this.aClass24_6.method897(arg0);
		}
		local21 = arg0.method336();
		if (local21 != 0) {
			arg0.anInt446--;
			this.aClass24_1 = new Class24();
			this.aClass24_1.method897(arg0);
			this.aClass24_5 = new Class24();
			this.aClass24_5.method897(arg0);
		}
		local21 = arg0.method336();
		if (local21 != 0) {
			arg0.anInt446--;
			this.aClass24_2 = new Class24();
			this.aClass24_2.method897(arg0);
			this.aClass24_8 = new Class24();
			this.aClass24_8.method897(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method330();
			if (local114 == 0) {
				break;
			}
			this.anIntArray291[local109] = local114;
			this.anIntArray292[local109] = arg0.method351();
			this.anIntArray293[local109] = arg0.method330();
		}
		this.anInt2752 = arg0.method330();
		this.anInt2755 = arg0.method330();
		this.anInt2754 = arg0.method359();
		this.anInt2753 = arg0.method359();
		this.aClass76_1 = new Class76();
		this.aClass24_9 = new Class24();
		this.aClass76_1.method2488(arg0, this.aClass24_9);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)I")
	private int method2155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray294[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray296[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)[I")
	public int[] method2156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static190.method1387(Static123.anIntArray295, 0, arg0);
		if (arg1 < 10) {
			return Static123.anIntArray295;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass24_3.method895();
		this.aClass24_7.method895();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass24_4 != null) {
			this.aClass24_4.method895();
			this.aClass24_6.method895();
			local24 = (int) ((double) (this.aClass24_4.anInt1183 - this.aClass24_4.anInt1184) * 32.768D / local16);
			local26 = (int) ((double) this.aClass24_4.anInt1184 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass24_1 != null) {
			this.aClass24_1.method895();
			this.aClass24_5.method895();
			local63 = (int) ((double) (this.aClass24_1.anInt1183 - this.aClass24_1.anInt1184) * 32.768D / local16);
			local65 = (int) ((double) this.aClass24_1.anInt1184 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray291[local102] != 0) {
				Static123.anIntArray300[local102] = 0;
				Static123.anIntArray298[local102] = (int) ((double) this.anIntArray293[local102] * local16);
				Static123.anIntArray301[local102] = (this.anIntArray291[local102] << 14) / 100;
				Static123.anIntArray297[local102] = (int) ((double) (this.aClass24_3.anInt1183 - this.aClass24_3.anInt1184) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray292[local102]) / local16);
				Static123.anIntArray299[local102] = (int) ((double) this.aClass24_3.anInt1184 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass24_3.method896(arg0);
			local187 = this.aClass24_7.method896(arg0);
			if (this.aClass24_4 != null) {
				local195 = this.aClass24_4.method896(arg0);
				local200 = this.aClass24_6.method896(arg0);
				local182 += this.method2155(local28, local200, this.aClass24_4.anInt1182) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass24_1 != null) {
				local195 = this.aClass24_1.method896(arg0);
				local200 = this.aClass24_5.method896(arg0);
				local187 = local187 * ((this.method2155(local67, local200, this.aClass24_1.anInt1182) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray291[local195] != 0) {
					local200 = local176 + Static123.anIntArray298[local195];
					if (local200 < arg0) {
						Static123.anIntArray295[local200] += this.method2155(Static123.anIntArray300[local195], local187 * Static123.anIntArray301[local195] >> 15, this.aClass24_3.anInt1182);
						Static123.anIntArray300[local195] += (local182 * Static123.anIntArray297[local195] >> 16) + Static123.anIntArray299[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass24_2 != null) {
			this.aClass24_2.method895();
			this.aClass24_8.method895();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass24_2.method896(arg0);
				local352 = this.aClass24_8.method896(arg0);
				if (local339) {
					local187 = this.aClass24_2.anInt1184 + ((this.aClass24_2.anInt1183 - this.aClass24_2.anInt1184) * local347 >> 8);
				} else {
					local187 = this.aClass24_2.anInt1184 + ((this.aClass24_2.anInt1183 - this.aClass24_2.anInt1184) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static123.anIntArray295[local200] = 0;
				}
			}
		}
		if (this.anInt2752 > 0 && this.anInt2755 > 0) {
			local182 = (int) ((double) this.anInt2752 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static123.anIntArray295[local187] += Static123.anIntArray295[local187 - local182] * this.anInt2755 / 100;
			}
		}
		if (this.aClass76_1.anIntArray335[0] > 0 || this.aClass76_1.anIntArray335[1] > 0) {
			this.aClass24_9.method895();
			local182 = this.aClass24_9.method896(arg0 + 1);
			local187 = this.aClass76_1.method2483(0, (float) local182 / 65536.0F);
			local195 = this.aClass76_1.method2483(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static123.anIntArray295[local200 + local187] * (long) Static145.anInt3187 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static123.anIntArray295[local200 + local187 - local519 - 1] * (long) Static145.anIntArrayArray24[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static123.anIntArray295[local200 - local549 - 1] * (long) Static145.anIntArrayArray24[1][local549] >> 16);
					}
					Static123.anIntArray295[local200] = local352;
					local182 = this.aClass24_9.method896(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static123.anIntArray295[local200 + local187] * (long) Static145.anInt3187 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static123.anIntArray295[local200 + local187 - local519 - 1] * (long) Static145.anIntArrayArray24[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static123.anIntArray295[local200 - local549 - 1] * (long) Static145.anIntArrayArray24[1][local549] >> 16);
						}
						Static123.anIntArray295[local200] = local352;
						local182 = this.aClass24_9.method896(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static123.anIntArray295[local200 + local187 - local519 - 1] * (long) Static145.anIntArrayArray24[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static123.anIntArray295[local200 - local549 - 1] * (long) Static145.anIntArrayArray24[1][local549] >> 16);
							}
							Static123.anIntArray295[local200] = local352;
							this.aClass24_9.method896(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass76_1.method2483(0, (float) local182 / 65536.0F);
					local195 = this.aClass76_1.method2483(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static123.anIntArray295[local182] < -32768) {
				Static123.anIntArray295[local182] = -32768;
			}
			if (Static123.anIntArray295[local182] > 32767) {
				Static123.anIntArray295[local182] = 32767;
			}
		}
		return Static123.anIntArray295;
	}
}
