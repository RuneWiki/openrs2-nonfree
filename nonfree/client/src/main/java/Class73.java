import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class73 {

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "[I")
	private static int[] anIntArray193 = new int[32768];

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "[I")
	private static int[] anIntArray192;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "Lclient!jd;")
	private Class57 aClass57_1;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "Lclient!jd;")
	private Class57 aClass57_2;

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "Lclient!jd;")
	private Class57 aClass57_3;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "Lclient!jd;")
	private Class57 aClass57_4;

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "Lclient!jd;")
	private Class57 aClass57_5;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "Lclient!jd;")
	private Class57 aClass57_6;

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "Lclient!jd;")
	private Class57 aClass57_7;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "Lclient!jd;")
	private Class57 aClass57_8;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "Lclient!vc;")
	private Class118 aClass118_1;

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "Lclient!jd;")
	private Class57 aClass57_9;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
	public int anInt2988 = 500;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "[I")
	private int[] anIntArray194 = new int[5];

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "[I")
	private int[] anIntArray196 = new int[5];

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "[I")
	private int[] anIntArray197 = new int[5];

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
	private int anInt2989 = 0;

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
	public int anInt2990 = 0;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
	private int anInt2987 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray193[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray192 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray192[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)I")
	private int method2340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray192[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray193[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)[I")
	public int[] method2342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static233.method870(Static133.anIntArray195, 0, arg0);
		if (arg1 < 10) {
			return Static133.anIntArray195;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass57_8.method1608();
		this.aClass57_6.method1608();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass57_7 != null) {
			this.aClass57_7.method1608();
			this.aClass57_9.method1608();
			local24 = (int) ((double) (this.aClass57_7.anInt2113 - this.aClass57_7.anInt2115) * 32.768D / local16);
			local26 = (int) ((double) this.aClass57_7.anInt2115 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass57_3 != null) {
			this.aClass57_3.method1608();
			this.aClass57_5.method1608();
			local63 = (int) ((double) (this.aClass57_3.anInt2113 - this.aClass57_3.anInt2115) * 32.768D / local16);
			local65 = (int) ((double) this.aClass57_3.anInt2115 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray196[local102] != 0) {
				Static133.anIntArray200[local102] = 0;
				Static133.anIntArray198[local102] = (int) ((double) this.anIntArray197[local102] * local16);
				Static133.anIntArray201[local102] = (this.anIntArray196[local102] << 14) / 100;
				Static133.anIntArray202[local102] = (int) ((double) (this.aClass57_8.anInt2113 - this.aClass57_8.anInt2115) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray194[local102]) / local16);
				Static133.anIntArray199[local102] = (int) ((double) this.aClass57_8.anInt2115 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass57_8.method1610(arg0);
			local187 = this.aClass57_6.method1610(arg0);
			if (this.aClass57_7 != null) {
				local195 = this.aClass57_7.method1610(arg0);
				local200 = this.aClass57_9.method1610(arg0);
				local182 += this.method2340(local28, local200, this.aClass57_7.anInt2112) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass57_3 != null) {
				local195 = this.aClass57_3.method1610(arg0);
				local200 = this.aClass57_5.method1610(arg0);
				local187 = local187 * ((this.method2340(local67, local200, this.aClass57_3.anInt2112) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray196[local195] != 0) {
					local200 = local176 + Static133.anIntArray198[local195];
					if (local200 < arg0) {
						Static133.anIntArray195[local200] += this.method2340(Static133.anIntArray200[local195], local187 * Static133.anIntArray201[local195] >> 15, this.aClass57_8.anInt2112);
						Static133.anIntArray200[local195] += (local182 * Static133.anIntArray202[local195] >> 16) + Static133.anIntArray199[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass57_2 != null) {
			this.aClass57_2.method1608();
			this.aClass57_4.method1608();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass57_2.method1610(arg0);
				local352 = this.aClass57_4.method1610(arg0);
				if (local339) {
					local187 = this.aClass57_2.anInt2115 + ((this.aClass57_2.anInt2113 - this.aClass57_2.anInt2115) * local347 >> 8);
				} else {
					local187 = this.aClass57_2.anInt2115 + ((this.aClass57_2.anInt2113 - this.aClass57_2.anInt2115) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static133.anIntArray195[local200] = 0;
				}
			}
		}
		if (this.anInt2989 > 0 && this.anInt2987 > 0) {
			local182 = (int) ((double) this.anInt2989 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static133.anIntArray195[local187] += Static133.anIntArray195[local187 - local182] * this.anInt2987 / 100;
			}
		}
		if (this.aClass118_1.anIntArray344[0] > 0 || this.aClass118_1.anIntArray344[1] > 0) {
			this.aClass57_1.method1608();
			local182 = this.aClass57_1.method1610(arg0 + 1);
			local187 = this.aClass118_1.method3552(0, (float) local182 / 65536.0F);
			local195 = this.aClass118_1.method3552(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static133.anIntArray195[local200 + local187] * (long) Static214.anInt4568 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static133.anIntArray195[local200 + local187 - local519 - 1] * (long) Static214.anIntArrayArray37[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static133.anIntArray195[local200 - local549 - 1] * (long) Static214.anIntArrayArray37[1][local549] >> 16);
					}
					Static133.anIntArray195[local200] = local352;
					local182 = this.aClass57_1.method1610(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static133.anIntArray195[local200 + local187] * (long) Static214.anInt4568 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static133.anIntArray195[local200 + local187 - local519 - 1] * (long) Static214.anIntArrayArray37[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static133.anIntArray195[local200 - local549 - 1] * (long) Static214.anIntArrayArray37[1][local549] >> 16);
						}
						Static133.anIntArray195[local200] = local352;
						local182 = this.aClass57_1.method1610(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static133.anIntArray195[local200 + local187 - local519 - 1] * (long) Static214.anIntArrayArray37[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static133.anIntArray195[local200 - local549 - 1] * (long) Static214.anIntArrayArray37[1][local549] >> 16);
							}
							Static133.anIntArray195[local200] = local352;
							this.aClass57_1.method1610(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass118_1.method3552(0, (float) local182 / 65536.0F);
					local195 = this.aClass118_1.method3552(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static133.anIntArray195[local182] < -32768) {
				Static133.anIntArray195[local182] = -32768;
			}
			if (Static133.anIntArray195[local182] > 32767) {
				Static133.anIntArray195[local182] = 32767;
			}
		}
		return Static133.anIntArray195;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!k;)V")
	public void method2343(@OriginalArg(0) Class1_Sub16 arg0) {
		this.aClass57_8 = new Class57();
		this.aClass57_8.method1607(arg0);
		this.aClass57_6 = new Class57();
		this.aClass57_6.method1607(arg0);
		@Pc(21) int local21 = arg0.method3793();
		if (local21 != 0) {
			arg0.anInt4860--;
			this.aClass57_7 = new Class57();
			this.aClass57_7.method1607(arg0);
			this.aClass57_9 = new Class57();
			this.aClass57_9.method1607(arg0);
		}
		local21 = arg0.method3793();
		if (local21 != 0) {
			arg0.anInt4860--;
			this.aClass57_3 = new Class57();
			this.aClass57_3.method1607(arg0);
			this.aClass57_5 = new Class57();
			this.aClass57_5.method1607(arg0);
		}
		local21 = arg0.method3793();
		if (local21 != 0) {
			arg0.anInt4860--;
			this.aClass57_2 = new Class57();
			this.aClass57_2.method1607(arg0);
			this.aClass57_4 = new Class57();
			this.aClass57_4.method1607(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method3797();
			if (local114 == 0) {
				break;
			}
			this.anIntArray196[local109] = local114;
			this.anIntArray194[local109] = arg0.method3788();
			this.anIntArray197[local109] = arg0.method3797();
		}
		this.anInt2989 = arg0.method3797();
		this.anInt2987 = arg0.method3797();
		this.anInt2988 = arg0.method3805();
		this.anInt2990 = arg0.method3805();
		this.aClass118_1 = new Class118();
		this.aClass57_1 = new Class57();
		this.aClass118_1.method3554(arg0, this.aClass57_1);
	}
}
