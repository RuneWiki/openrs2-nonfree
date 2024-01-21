import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class67 {

	@OriginalMember(owner = "client!q", name = "i", descriptor = "[I")
	public static int[] anIntArray269 = new int[32768];

	@OriginalMember(owner = "client!q", name = "e", descriptor = "[I")
	public static int[] anIntArray267;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "Lclient!pb;")
	private Class63 aClass63_1;

	@OriginalMember(owner = "client!q", name = "d", descriptor = "Lclient!pb;")
	private Class63 aClass63_2;

	@OriginalMember(owner = "client!q", name = "h", descriptor = "Lclient!pb;")
	private Class63 aClass63_3;

	@OriginalMember(owner = "client!q", name = "j", descriptor = "Lclient!pb;")
	private Class63 aClass63_4;

	@OriginalMember(owner = "client!q", name = "l", descriptor = "Lclient!pb;")
	private Class63 aClass63_5;

	@OriginalMember(owner = "client!q", name = "n", descriptor = "Lclient!pb;")
	private Class63 aClass63_6;

	@OriginalMember(owner = "client!q", name = "o", descriptor = "Lclient!eb;")
	private Class21 aClass21_1;

	@OriginalMember(owner = "client!q", name = "p", descriptor = "Lclient!pb;")
	private Class63 aClass63_7;

	@OriginalMember(owner = "client!q", name = "q", descriptor = "Lclient!pb;")
	private Class63 aClass63_8;

	@OriginalMember(owner = "client!q", name = "s", descriptor = "Lclient!pb;")
	private Class63 aClass63_9;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "[I")
	private final int[] anIntArray266 = new int[5];

	@OriginalMember(owner = "client!q", name = "f", descriptor = "I")
	public int anInt2042 = 0;

	@OriginalMember(owner = "client!q", name = "m", descriptor = "I")
	private int anInt2044 = 100;

	@OriginalMember(owner = "client!q", name = "k", descriptor = "I")
	public int anInt2043 = 500;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "[I")
	private final int[] anIntArray265 = new int[5];

	@OriginalMember(owner = "client!q", name = "r", descriptor = "[I")
	private final int[] anIntArray270 = new int[5];

	@OriginalMember(owner = "client!q", name = "t", descriptor = "I")
	private int anInt2045 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray269[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray267 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray267[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!be;)V")
	public void method1517(@OriginalArg(0) Class2_Sub4 arg0) {
		this.aClass63_3 = new Class63();
		this.aClass63_3.method1437(arg0);
		this.aClass63_4 = new Class63();
		this.aClass63_4.method1437(arg0);
		@Pc(21) int local21 = arg0.method933();
		if (local21 != 0) {
			arg0.anInt1298--;
			this.aClass63_6 = new Class63();
			this.aClass63_6.method1437(arg0);
			this.aClass63_7 = new Class63();
			this.aClass63_7.method1437(arg0);
		}
		local21 = arg0.method933();
		if (local21 != 0) {
			arg0.anInt1298--;
			this.aClass63_1 = new Class63();
			this.aClass63_1.method1437(arg0);
			this.aClass63_9 = new Class63();
			this.aClass63_9.method1437(arg0);
		}
		local21 = arg0.method933();
		if (local21 != 0) {
			arg0.anInt1298--;
			this.aClass63_5 = new Class63();
			this.aClass63_5.method1437(arg0);
			this.aClass63_8 = new Class63();
			this.aClass63_8.method1437(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method938();
			if (local114 == 0) {
				break;
			}
			this.anIntArray265[local109] = local114;
			this.anIntArray266[local109] = arg0.method946();
			this.anIntArray270[local109] = arg0.method938();
		}
		this.anInt2045 = arg0.method938();
		this.anInt2044 = arg0.method938();
		this.anInt2043 = arg0.method896();
		this.anInt2042 = arg0.method896();
		this.aClass21_1 = new Class21();
		this.aClass63_2 = new Class63();
		this.aClass21_1.method515(arg0, this.aClass63_2);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)[I")
	public int[] method1518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static135.method358(Static92.anIntArray268, 0, arg0);
		if (arg1 < 10) {
			return Static92.anIntArray268;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass63_3.method1439();
		this.aClass63_4.method1439();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass63_6 != null) {
			this.aClass63_6.method1439();
			this.aClass63_7.method1439();
			local24 = (int) ((double) (this.aClass63_6.anInt1878 - this.aClass63_6.anInt1875) * 32.768D / local16);
			local26 = (int) ((double) this.aClass63_6.anInt1875 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass63_1 != null) {
			this.aClass63_1.method1439();
			this.aClass63_9.method1439();
			local63 = (int) ((double) (this.aClass63_1.anInt1878 - this.aClass63_1.anInt1875) * 32.768D / local16);
			local65 = (int) ((double) this.aClass63_1.anInt1875 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray265[local102] != 0) {
				Static92.anIntArray272[local102] = 0;
				Static92.anIntArray274[local102] = (int) ((double) this.anIntArray270[local102] * local16);
				Static92.anIntArray271[local102] = (this.anIntArray265[local102] << 14) / 100;
				Static92.anIntArray273[local102] = (int) ((double) (this.aClass63_3.anInt1878 - this.aClass63_3.anInt1875) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray266[local102]) / local16);
				Static92.anIntArray275[local102] = (int) ((double) this.aClass63_3.anInt1875 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass63_3.method1438(arg0);
			local187 = this.aClass63_4.method1438(arg0);
			if (this.aClass63_6 != null) {
				local195 = this.aClass63_6.method1438(arg0);
				local200 = this.aClass63_7.method1438(arg0);
				local182 += this.method1520(local28, local200, this.aClass63_6.anInt1876) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass63_1 != null) {
				local195 = this.aClass63_1.method1438(arg0);
				local200 = this.aClass63_9.method1438(arg0);
				local187 = local187 * ((this.method1520(local67, local200, this.aClass63_1.anInt1876) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray265[local195] != 0) {
					local200 = local176 + Static92.anIntArray274[local195];
					if (local200 < arg0) {
						Static92.anIntArray268[local200] += this.method1520(Static92.anIntArray272[local195], local187 * Static92.anIntArray271[local195] >> 15, this.aClass63_3.anInt1876);
						Static92.anIntArray272[local195] += (local182 * Static92.anIntArray273[local195] >> 16) + Static92.anIntArray275[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass63_5 != null) {
			this.aClass63_5.method1439();
			this.aClass63_8.method1439();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass63_5.method1438(arg0);
				local352 = this.aClass63_8.method1438(arg0);
				if (local339) {
					local187 = this.aClass63_5.anInt1875 + ((this.aClass63_5.anInt1878 - this.aClass63_5.anInt1875) * local347 >> 8);
				} else {
					local187 = this.aClass63_5.anInt1875 + ((this.aClass63_5.anInt1878 - this.aClass63_5.anInt1875) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static92.anIntArray268[local200] = 0;
				}
			}
		}
		if (this.anInt2045 > 0 && this.anInt2044 > 0) {
			local182 = (int) ((double) this.anInt2045 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static92.anIntArray268[local187] += Static92.anIntArray268[local187 - local182] * this.anInt2044 / 100;
			}
		}
		if (this.aClass21_1.anIntArray57[0] > 0 || this.aClass21_1.anIntArray57[1] > 0) {
			this.aClass63_2.method1439();
			local182 = this.aClass63_2.method1438(arg0 + 1);
			local187 = this.aClass21_1.method517(0, (float) local182 / 65536.0F);
			local195 = this.aClass21_1.method517(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static92.anIntArray268[local200 + local187] * (long) Static25.anInt627 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static92.anIntArray268[local200 + local187 - local519 - 1] * (long) Static25.anIntArrayArray5[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static92.anIntArray268[local200 - local549 - 1] * (long) Static25.anIntArrayArray5[1][local549] >> 16);
					}
					Static92.anIntArray268[local200] = local352;
					local182 = this.aClass63_2.method1438(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static92.anIntArray268[local200 + local187] * (long) Static25.anInt627 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static92.anIntArray268[local200 + local187 - local519 - 1] * (long) Static25.anIntArrayArray5[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static92.anIntArray268[local200 - local549 - 1] * (long) Static25.anIntArrayArray5[1][local549] >> 16);
						}
						Static92.anIntArray268[local200] = local352;
						local182 = this.aClass63_2.method1438(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static92.anIntArray268[local200 + local187 - local519 - 1] * (long) Static25.anIntArrayArray5[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static92.anIntArray268[local200 - local549 - 1] * (long) Static25.anIntArrayArray5[1][local549] >> 16);
							}
							Static92.anIntArray268[local200] = local352;
							this.aClass63_2.method1438(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass21_1.method517(0, (float) local182 / 65536.0F);
					local195 = this.aClass21_1.method517(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static92.anIntArray268[local182] < -32768) {
				Static92.anIntArray268[local182] = -32768;
			}
			if (Static92.anIntArray268[local182] > 32767) {
				Static92.anIntArray268[local182] = 32767;
			}
		}
		return Static92.anIntArray268;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(III)I")
	private int method1520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray267[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray269[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
