import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class43 {

	@OriginalMember(owner = "client!hj", name = "t", descriptor = "[I")
	private static final int[] anIntArray143 = new int[32768];

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "[I")
	private static final int[] anIntArray140;

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "Lclient!lg;")
	private Class59 aClass59_1;

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "Lclient!lg;")
	private Class59 aClass59_2;

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "Lclient!qa;")
	private Class80 aClass80_1;

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "Lclient!lg;")
	private Class59 aClass59_3;

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "Lclient!lg;")
	private Class59 aClass59_4;

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "Lclient!lg;")
	private Class59 aClass59_5;

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "Lclient!lg;")
	private Class59 aClass59_6;

	@OriginalMember(owner = "client!hj", name = "o", descriptor = "Lclient!lg;")
	private Class59 aClass59_7;

	@OriginalMember(owner = "client!hj", name = "p", descriptor = "Lclient!lg;")
	private Class59 aClass59_8;

	@OriginalMember(owner = "client!hj", name = "q", descriptor = "Lclient!lg;")
	private Class59 aClass59_9;

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
	private int anInt1623 = 0;

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "[I")
	private final int[] anIntArray139 = new int[5];

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
	public int anInt1624 = 500;

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
	public int anInt1625 = 0;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "[I")
	private final int[] anIntArray138 = new int[5];

	@OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
	private int anInt1626 = 100;

	@OriginalMember(owner = "client!hj", name = "s", descriptor = "[I")
	private final int[] anIntArray142 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray143[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray140 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray140[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!kd;)V")
	public void method1108(@OriginalArg(0) Class2_Sub11 arg0) {
		this.aClass59_9 = new Class59();
		this.aClass59_9.method1748(arg0);
		this.aClass59_2 = new Class59();
		this.aClass59_2.method1748(arg0);
		@Pc(21) int local21 = arg0.method1534();
		if (local21 != 0) {
			arg0.anInt2235--;
			this.aClass59_5 = new Class59();
			this.aClass59_5.method1748(arg0);
			this.aClass59_8 = new Class59();
			this.aClass59_8.method1748(arg0);
		}
		local21 = arg0.method1534();
		if (local21 != 0) {
			arg0.anInt2235--;
			this.aClass59_1 = new Class59();
			this.aClass59_1.method1748(arg0);
			this.aClass59_6 = new Class59();
			this.aClass59_6.method1748(arg0);
		}
		local21 = arg0.method1534();
		if (local21 != 0) {
			arg0.anInt2235--;
			this.aClass59_4 = new Class59();
			this.aClass59_4.method1748(arg0);
			this.aClass59_3 = new Class59();
			this.aClass59_3.method1748(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1572();
			if (local114 == 0) {
				break;
			}
			this.anIntArray142[local109] = local114;
			this.anIntArray138[local109] = arg0.method1553();
			this.anIntArray139[local109] = arg0.method1572();
		}
		this.anInt1623 = arg0.method1572();
		this.anInt1626 = arg0.method1572();
		this.anInt1624 = arg0.method1557();
		this.anInt1625 = arg0.method1557();
		this.aClass80_1 = new Class80();
		this.aClass59_7 = new Class59();
		this.aClass80_1.method2356(arg0, this.aClass59_7);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)[I")
	public int[] method1110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static220.method1005(Static79.anIntArray141, 0, arg0);
		if (arg1 < 10) {
			return Static79.anIntArray141;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass59_9.method1751();
		this.aClass59_2.method1751();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass59_5 != null) {
			this.aClass59_5.method1751();
			this.aClass59_8.method1751();
			local24 = (int) ((double) (this.aClass59_5.anInt2482 - this.aClass59_5.anInt2479) * 32.768D / local16);
			local26 = (int) ((double) this.aClass59_5.anInt2479 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass59_1 != null) {
			this.aClass59_1.method1751();
			this.aClass59_6.method1751();
			local63 = (int) ((double) (this.aClass59_1.anInt2482 - this.aClass59_1.anInt2479) * 32.768D / local16);
			local65 = (int) ((double) this.aClass59_1.anInt2479 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray142[local102] != 0) {
				Static79.anIntArray148[local102] = 0;
				Static79.anIntArray145[local102] = (int) ((double) this.anIntArray139[local102] * local16);
				Static79.anIntArray147[local102] = (this.anIntArray142[local102] << 14) / 100;
				Static79.anIntArray146[local102] = (int) ((double) (this.aClass59_9.anInt2482 - this.aClass59_9.anInt2479) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray138[local102]) / local16);
				Static79.anIntArray144[local102] = (int) ((double) this.aClass59_9.anInt2479 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass59_9.method1749(arg0);
			local187 = this.aClass59_2.method1749(arg0);
			if (this.aClass59_5 != null) {
				local195 = this.aClass59_5.method1749(arg0);
				local200 = this.aClass59_8.method1749(arg0);
				local182 += this.method1111(local28, local200, this.aClass59_5.anInt2480) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass59_1 != null) {
				local195 = this.aClass59_1.method1749(arg0);
				local200 = this.aClass59_6.method1749(arg0);
				local187 = local187 * ((this.method1111(local67, local200, this.aClass59_1.anInt2480) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray142[local195] != 0) {
					local200 = local176 + Static79.anIntArray145[local195];
					if (local200 < arg0) {
						Static79.anIntArray141[local200] += this.method1111(Static79.anIntArray148[local195], local187 * Static79.anIntArray147[local195] >> 15, this.aClass59_9.anInt2480);
						Static79.anIntArray148[local195] += (local182 * Static79.anIntArray146[local195] >> 16) + Static79.anIntArray144[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass59_4 != null) {
			this.aClass59_4.method1751();
			this.aClass59_3.method1751();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass59_4.method1749(arg0);
				local352 = this.aClass59_3.method1749(arg0);
				if (local339) {
					local187 = this.aClass59_4.anInt2479 + ((this.aClass59_4.anInt2482 - this.aClass59_4.anInt2479) * local347 >> 8);
				} else {
					local187 = this.aClass59_4.anInt2479 + ((this.aClass59_4.anInt2482 - this.aClass59_4.anInt2479) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static79.anIntArray141[local200] = 0;
				}
			}
		}
		if (this.anInt1623 > 0 && this.anInt1626 > 0) {
			local182 = (int) ((double) this.anInt1623 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static79.anIntArray141[local187] += Static79.anIntArray141[local187 - local182] * this.anInt1626 / 100;
			}
		}
		if (this.aClass80_1.anIntArray292[0] > 0 || this.aClass80_1.anIntArray292[1] > 0) {
			this.aClass59_7.method1751();
			local182 = this.aClass59_7.method1749(arg0 + 1);
			local187 = this.aClass80_1.method2357(0, (float) local182 / 65536.0F);
			local195 = this.aClass80_1.method2357(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static79.anIntArray141[local200 + local187] * (long) Static160.anInt3390 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static79.anIntArray141[local200 + local187 - local519 - 1] * (long) Static160.anIntArrayArray27[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static79.anIntArray141[local200 - local549 - 1] * (long) Static160.anIntArrayArray27[1][local549] >> 16);
					}
					Static79.anIntArray141[local200] = local352;
					local182 = this.aClass59_7.method1749(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static79.anIntArray141[local200 + local187] * (long) Static160.anInt3390 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static79.anIntArray141[local200 + local187 - local519 - 1] * (long) Static160.anIntArrayArray27[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static79.anIntArray141[local200 - local549 - 1] * (long) Static160.anIntArrayArray27[1][local549] >> 16);
						}
						Static79.anIntArray141[local200] = local352;
						local182 = this.aClass59_7.method1749(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static79.anIntArray141[local200 + local187 - local519 - 1] * (long) Static160.anIntArrayArray27[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static79.anIntArray141[local200 - local549 - 1] * (long) Static160.anIntArrayArray27[1][local549] >> 16);
							}
							Static79.anIntArray141[local200] = local352;
							this.aClass59_7.method1749(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass80_1.method2357(0, (float) local182 / 65536.0F);
					local195 = this.aClass80_1.method2357(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static79.anIntArray141[local182] < -32768) {
				Static79.anIntArray141[local182] = -32768;
			}
			if (Static79.anIntArray141[local182] > 32767) {
				Static79.anIntArray141[local182] = 32767;
			}
		}
		return Static79.anIntArray141;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)I")
	private int method1111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray140[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray143[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
