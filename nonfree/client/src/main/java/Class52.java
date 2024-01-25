import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class52 {

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "[I")
	private static final int[] anIntArray142 = new int[32768];

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "[I")
	private static final int[] anIntArray139;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "Lclient!dk;")
	private Class53 aClass53_1;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "Lclient!dk;")
	private Class53 aClass53_2;

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "Lclient!dk;")
	private Class53 aClass53_3;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "Lclient!dk;")
	private Class53 aClass53_4;

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "Lclient!dk;")
	private Class53 aClass53_5;

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "Lclient!wi;")
	private Class262 aClass262_1;

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "Lclient!dk;")
	private Class53 aClass53_6;

	@OriginalMember(owner = "client!dj", name = "r", descriptor = "Lclient!dk;")
	private Class53 aClass53_7;

	@OriginalMember(owner = "client!dj", name = "s", descriptor = "Lclient!dk;")
	private Class53 aClass53_8;

	@OriginalMember(owner = "client!dj", name = "x", descriptor = "Lclient!dk;")
	private Class53 aClass53_9;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "[I")
	private final int[] anIntArray138 = new int[5];

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "[I")
	private final int[] anIntArray140 = new int[5];

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
	public int anInt1639 = 0;

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "[I")
	private final int[] anIntArray141 = new int[5];

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
	public int anInt1640 = 500;

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
	private int anInt1641 = 100;

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
	private int anInt1642 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray142[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray139 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray139[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)I")
	private int method1344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray139[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray142[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)[I")
	public int[] method1345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static464.method5796(Static74.anIntArray143, 0, arg0);
		if (arg1 < 10) {
			return Static74.anIntArray143;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass53_3.method1350();
		this.aClass53_6.method1350();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass53_8 != null) {
			this.aClass53_8.method1350();
			this.aClass53_5.method1350();
			local24 = (int) ((double) (this.aClass53_8.anInt1646 - this.aClass53_8.anInt1645) * 32.768D / local16);
			local26 = (int) ((double) this.aClass53_8.anInt1645 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass53_9 != null) {
			this.aClass53_9.method1350();
			this.aClass53_4.method1350();
			local63 = (int) ((double) (this.aClass53_9.anInt1646 - this.aClass53_9.anInt1645) * 32.768D / local16);
			local65 = (int) ((double) this.aClass53_9.anInt1645 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray138[local102] != 0) {
				Static74.anIntArray148[local102] = 0;
				Static74.anIntArray144[local102] = (int) ((double) this.anIntArray141[local102] * local16);
				Static74.anIntArray147[local102] = (this.anIntArray138[local102] << 14) / 100;
				Static74.anIntArray145[local102] = (int) ((double) (this.aClass53_3.anInt1646 - this.aClass53_3.anInt1645) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray140[local102]) / local16);
				Static74.anIntArray146[local102] = (int) ((double) this.aClass53_3.anInt1645 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass53_3.method1348(arg0);
			local187 = this.aClass53_6.method1348(arg0);
			if (this.aClass53_8 != null) {
				local195 = this.aClass53_8.method1348(arg0);
				local200 = this.aClass53_5.method1348(arg0);
				local182 += this.method1344(local28, local200, this.aClass53_8.anInt1644) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass53_9 != null) {
				local195 = this.aClass53_9.method1348(arg0);
				local200 = this.aClass53_4.method1348(arg0);
				local187 = local187 * ((this.method1344(local67, local200, this.aClass53_9.anInt1644) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray138[local195] != 0) {
					local200 = local176 + Static74.anIntArray144[local195];
					if (local200 < arg0) {
						Static74.anIntArray143[local200] += this.method1344(Static74.anIntArray148[local195], local187 * Static74.anIntArray147[local195] >> 15, this.aClass53_3.anInt1644);
						Static74.anIntArray148[local195] += (local182 * Static74.anIntArray145[local195] >> 16) + Static74.anIntArray146[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass53_1 != null) {
			this.aClass53_1.method1350();
			this.aClass53_2.method1350();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass53_1.method1348(arg0);
				local352 = this.aClass53_2.method1348(arg0);
				if (local339) {
					local187 = this.aClass53_1.anInt1645 + ((this.aClass53_1.anInt1646 - this.aClass53_1.anInt1645) * local347 >> 8);
				} else {
					local187 = this.aClass53_1.anInt1645 + ((this.aClass53_1.anInt1646 - this.aClass53_1.anInt1645) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static74.anIntArray143[local200] = 0;
				}
			}
		}
		if (this.anInt1642 > 0 && this.anInt1641 > 0) {
			local182 = (int) ((double) this.anInt1642 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static74.anIntArray143[local187] += Static74.anIntArray143[local187 - local182] * this.anInt1641 / 100;
			}
		}
		if (this.aClass262_1.anIntArray574[0] > 0 || this.aClass262_1.anIntArray574[1] > 0) {
			this.aClass53_7.method1350();
			local182 = this.aClass53_7.method1348(arg0 + 1);
			local187 = this.aClass262_1.method5907(0, (float) local182 / 65536.0F);
			local195 = this.aClass262_1.method5907(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static74.anIntArray143[local200 + local187] * (long) Static443.anInt7525 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static74.anIntArray143[local200 + local187 - local519 - 1] * (long) Static443.anIntArrayArray66[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static74.anIntArray143[local200 - local549 - 1] * (long) Static443.anIntArrayArray66[1][local549] >> 16);
					}
					Static74.anIntArray143[local200] = local352;
					local182 = this.aClass53_7.method1348(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static74.anIntArray143[local200 + local187] * (long) Static443.anInt7525 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static74.anIntArray143[local200 + local187 - local519 - 1] * (long) Static443.anIntArrayArray66[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static74.anIntArray143[local200 - local549 - 1] * (long) Static443.anIntArrayArray66[1][local549] >> 16);
						}
						Static74.anIntArray143[local200] = local352;
						local182 = this.aClass53_7.method1348(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static74.anIntArray143[local200 + local187 - local519 - 1] * (long) Static443.anIntArrayArray66[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static74.anIntArray143[local200 - local549 - 1] * (long) Static443.anIntArrayArray66[1][local549] >> 16);
							}
							Static74.anIntArray143[local200] = local352;
							this.aClass53_7.method1348(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass262_1.method5907(0, (float) local182 / 65536.0F);
					local195 = this.aClass262_1.method5907(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static74.anIntArray143[local182] < -32768) {
				Static74.anIntArray143[local182] = -32768;
			}
			if (Static74.anIntArray143[local182] > 32767) {
				Static74.anIntArray143[local182] = 32767;
			}
		}
		return Static74.anIntArray143;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!bt;)V")
	public void method1346(@OriginalArg(0) Class3_Sub2 arg0) {
		this.aClass53_3 = new Class53();
		this.aClass53_3.method1351(arg0);
		this.aClass53_6 = new Class53();
		this.aClass53_6.method1351(arg0);
		@Pc(21) int local21 = arg0.method6053();
		if (local21 != 0) {
			arg0.anInt7620--;
			this.aClass53_8 = new Class53();
			this.aClass53_8.method1351(arg0);
			this.aClass53_5 = new Class53();
			this.aClass53_5.method1351(arg0);
		}
		local21 = arg0.method6053();
		if (local21 != 0) {
			arg0.anInt7620--;
			this.aClass53_9 = new Class53();
			this.aClass53_9.method1351(arg0);
			this.aClass53_4 = new Class53();
			this.aClass53_4.method1351(arg0);
		}
		local21 = arg0.method6053();
		if (local21 != 0) {
			arg0.anInt7620--;
			this.aClass53_1 = new Class53();
			this.aClass53_1.method1351(arg0);
			this.aClass53_2 = new Class53();
			this.aClass53_2.method1351(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method6040();
			if (local114 == 0) {
				break;
			}
			this.anIntArray138[local109] = local114;
			this.anIntArray140[local109] = arg0.method6038();
			this.anIntArray141[local109] = arg0.method6040();
		}
		this.anInt1642 = arg0.method6040();
		this.anInt1641 = arg0.method6040();
		this.anInt1640 = arg0.method6004();
		this.anInt1639 = arg0.method6004();
		this.aClass262_1 = new Class262();
		this.aClass53_7 = new Class53();
		this.aClass262_1.method5908(arg0, this.aClass53_7);
	}
}
