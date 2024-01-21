import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class23 {

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "[I")
	private static final int[] anIntArray120 = new int[32768];

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "[I")
	private static final int[] anIntArray122;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "Lclient!ii;")
	private Class42 aClass42_1;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Lclient!ii;")
	private Class42 aClass42_2;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "Lclient!ii;")
	private Class42 aClass42_3;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "Lclient!ii;")
	private Class42 aClass42_4;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "Lclient!g;")
	private Class30 aClass30_1;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "Lclient!ii;")
	private Class42 aClass42_5;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "Lclient!ii;")
	private Class42 aClass42_6;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "Lclient!ii;")
	private Class42 aClass42_7;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "Lclient!ii;")
	private Class42 aClass42_8;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "Lclient!ii;")
	private Class42 aClass42_9;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
	private int anInt878 = 0;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	public int anInt877 = 500;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "[I")
	private final int[] anIntArray117 = new int[5];

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	public int anInt879 = 0;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
	private int anInt880 = 100;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "[I")
	private final int[] anIntArray121 = new int[5];

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "[I")
	private final int[] anIntArray118 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray120[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray122 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray122[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)[I")
	public int[] method602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static200.method1182(Static40.anIntArray119, 0, arg0);
		if (arg1 < 10) {
			return Static40.anIntArray119;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass42_6.method1197();
		this.aClass42_9.method1197();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass42_8 != null) {
			this.aClass42_8.method1197();
			this.aClass42_2.method1197();
			local24 = (int) ((double) (this.aClass42_8.anInt1727 - this.aClass42_8.anInt1728) * 32.768D / local16);
			local26 = (int) ((double) this.aClass42_8.anInt1728 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass42_1 != null) {
			this.aClass42_1.method1197();
			this.aClass42_5.method1197();
			local63 = (int) ((double) (this.aClass42_1.anInt1727 - this.aClass42_1.anInt1728) * 32.768D / local16);
			local65 = (int) ((double) this.aClass42_1.anInt1728 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray121[local102] != 0) {
				Static40.anIntArray126[local102] = 0;
				Static40.anIntArray125[local102] = (int) ((double) this.anIntArray118[local102] * local16);
				Static40.anIntArray123[local102] = (this.anIntArray121[local102] << 14) / 100;
				Static40.anIntArray127[local102] = (int) ((double) (this.aClass42_6.anInt1727 - this.aClass42_6.anInt1728) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray117[local102]) / local16);
				Static40.anIntArray124[local102] = (int) ((double) this.aClass42_6.anInt1728 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass42_6.method1195(arg0);
			local187 = this.aClass42_9.method1195(arg0);
			if (this.aClass42_8 != null) {
				local195 = this.aClass42_8.method1195(arg0);
				local200 = this.aClass42_2.method1195(arg0);
				local182 += this.method603(local28, local200, this.aClass42_8.anInt1725) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass42_1 != null) {
				local195 = this.aClass42_1.method1195(arg0);
				local200 = this.aClass42_5.method1195(arg0);
				local187 = local187 * ((this.method603(local67, local200, this.aClass42_1.anInt1725) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray121[local195] != 0) {
					local200 = local176 + Static40.anIntArray125[local195];
					if (local200 < arg0) {
						Static40.anIntArray119[local200] += this.method603(Static40.anIntArray126[local195], local187 * Static40.anIntArray123[local195] >> 15, this.aClass42_6.anInt1725);
						Static40.anIntArray126[local195] += (local182 * Static40.anIntArray127[local195] >> 16) + Static40.anIntArray124[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass42_3 != null) {
			this.aClass42_3.method1197();
			this.aClass42_4.method1197();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass42_3.method1195(arg0);
				local352 = this.aClass42_4.method1195(arg0);
				if (local339) {
					local187 = this.aClass42_3.anInt1728 + ((this.aClass42_3.anInt1727 - this.aClass42_3.anInt1728) * local347 >> 8);
				} else {
					local187 = this.aClass42_3.anInt1728 + ((this.aClass42_3.anInt1727 - this.aClass42_3.anInt1728) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static40.anIntArray119[local200] = 0;
				}
			}
		}
		if (this.anInt878 > 0 && this.anInt880 > 0) {
			local182 = (int) ((double) this.anInt878 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static40.anIntArray119[local187] += Static40.anIntArray119[local187 - local182] * this.anInt880 / 100;
			}
		}
		if (this.aClass30_1.anIntArray166[0] > 0 || this.aClass30_1.anIntArray166[1] > 0) {
			this.aClass42_7.method1197();
			local182 = this.aClass42_7.method1195(arg0 + 1);
			local187 = this.aClass30_1.method805(0, (float) local182 / 65536.0F);
			local195 = this.aClass30_1.method805(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static40.anIntArray119[local200 + local187] * (long) Static55.anInt1193 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static40.anIntArray119[local200 + local187 - local519 - 1] * (long) Static55.anIntArrayArray9[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static40.anIntArray119[local200 - local549 - 1] * (long) Static55.anIntArrayArray9[1][local549] >> 16);
					}
					Static40.anIntArray119[local200] = local352;
					local182 = this.aClass42_7.method1195(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static40.anIntArray119[local200 + local187] * (long) Static55.anInt1193 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static40.anIntArray119[local200 + local187 - local519 - 1] * (long) Static55.anIntArrayArray9[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static40.anIntArray119[local200 - local549 - 1] * (long) Static55.anIntArrayArray9[1][local549] >> 16);
						}
						Static40.anIntArray119[local200] = local352;
						local182 = this.aClass42_7.method1195(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static40.anIntArray119[local200 + local187 - local519 - 1] * (long) Static55.anIntArrayArray9[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static40.anIntArray119[local200 - local549 - 1] * (long) Static55.anIntArrayArray9[1][local549] >> 16);
							}
							Static40.anIntArray119[local200] = local352;
							this.aClass42_7.method1195(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass30_1.method805(0, (float) local182 / 65536.0F);
					local195 = this.aClass30_1.method805(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static40.anIntArray119[local182] < -32768) {
				Static40.anIntArray119[local182] = -32768;
			}
			if (Static40.anIntArray119[local182] > 32767) {
				Static40.anIntArray119[local182] = 32767;
			}
		}
		return Static40.anIntArray119;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)I")
	private int method603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray122[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray120[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!mb;)V")
	public void method605(@OriginalArg(0) Class3_Sub17 arg0) {
		this.aClass42_6 = new Class42();
		this.aClass42_6.method1198(arg0);
		this.aClass42_9 = new Class42();
		this.aClass42_9.method1198(arg0);
		@Pc(21) int local21 = arg0.method2107();
		if (local21 != 0) {
			arg0.anInt2923--;
			this.aClass42_8 = new Class42();
			this.aClass42_8.method1198(arg0);
			this.aClass42_2 = new Class42();
			this.aClass42_2.method1198(arg0);
		}
		local21 = arg0.method2107();
		if (local21 != 0) {
			arg0.anInt2923--;
			this.aClass42_1 = new Class42();
			this.aClass42_1.method1198(arg0);
			this.aClass42_5 = new Class42();
			this.aClass42_5.method1198(arg0);
		}
		local21 = arg0.method2107();
		if (local21 != 0) {
			arg0.anInt2923--;
			this.aClass42_3 = new Class42();
			this.aClass42_3.method1198(arg0);
			this.aClass42_4 = new Class42();
			this.aClass42_4.method1198(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method2090();
			if (local114 == 0) {
				break;
			}
			this.anIntArray121[local109] = local114;
			this.anIntArray117[local109] = arg0.method2127();
			this.anIntArray118[local109] = arg0.method2090();
		}
		this.anInt878 = arg0.method2090();
		this.anInt880 = arg0.method2090();
		this.anInt877 = arg0.method2111();
		this.anInt879 = arg0.method2111();
		this.aClass30_1 = new Class30();
		this.aClass42_7 = new Class42();
		this.aClass30_1.method807(arg0, this.aClass42_7);
	}
}
