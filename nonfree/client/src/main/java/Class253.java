import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pda")
public final class Class253 {

	@OriginalMember(owner = "client!pda", name = "f", descriptor = "[I")
	private static final int[] anIntArray518 = new int[32768];

	@OriginalMember(owner = "client!pda", name = "g", descriptor = "[I")
	private static final int[] anIntArray519;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "Lclient!df;")
	private Class68 aClass68_1;

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "Lclient!rda;")
	private Class289 aClass289_1;

	@OriginalMember(owner = "client!pda", name = "i", descriptor = "Lclient!df;")
	private Class68 aClass68_2;

	@OriginalMember(owner = "client!pda", name = "l", descriptor = "Lclient!df;")
	private Class68 aClass68_3;

	@OriginalMember(owner = "client!pda", name = "o", descriptor = "Lclient!df;")
	private Class68 aClass68_4;

	@OriginalMember(owner = "client!pda", name = "p", descriptor = "Lclient!df;")
	private Class68 aClass68_5;

	@OriginalMember(owner = "client!pda", name = "q", descriptor = "Lclient!df;")
	private Class68 aClass68_6;

	@OriginalMember(owner = "client!pda", name = "r", descriptor = "Lclient!df;")
	private Class68 aClass68_7;

	@OriginalMember(owner = "client!pda", name = "s", descriptor = "Lclient!df;")
	private Class68 aClass68_8;

	@OriginalMember(owner = "client!pda", name = "x", descriptor = "Lclient!df;")
	private Class68 aClass68_9;

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "I")
	private int anInt7676 = 100;

	@OriginalMember(owner = "client!pda", name = "e", descriptor = "[I")
	private final int[] anIntArray517 = new int[5];

	@OriginalMember(owner = "client!pda", name = "j", descriptor = "I")
	public int anInt7677 = 500;

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "[I")
	private final int[] anIntArray516 = new int[5];

	@OriginalMember(owner = "client!pda", name = "k", descriptor = "I")
	private int anInt7678 = 0;

	@OriginalMember(owner = "client!pda", name = "h", descriptor = "[I")
	private final int[] anIntArray520 = new int[5];

	@OriginalMember(owner = "client!pda", name = "n", descriptor = "I")
	public int anInt7679 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray518[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray519 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray519[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(III)I")
	private int method6417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray519[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray518[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lclient!ud;)V")
	public void method6418(@OriginalArg(0) Class2_Sub34 arg0) {
		this.aClass68_6 = new Class68();
		this.aClass68_6.method1572(arg0);
		this.aClass68_5 = new Class68();
		this.aClass68_5.method1572(arg0);
		@Pc(21) int local21 = arg0.method6904();
		if (local21 != 0) {
			arg0.anInt8188--;
			this.aClass68_9 = new Class68();
			this.aClass68_9.method1572(arg0);
			this.aClass68_4 = new Class68();
			this.aClass68_4.method1572(arg0);
		}
		local21 = arg0.method6904();
		if (local21 != 0) {
			arg0.anInt8188--;
			this.aClass68_8 = new Class68();
			this.aClass68_8.method1572(arg0);
			this.aClass68_7 = new Class68();
			this.aClass68_7.method1572(arg0);
		}
		local21 = arg0.method6904();
		if (local21 != 0) {
			arg0.anInt8188--;
			this.aClass68_2 = new Class68();
			this.aClass68_2.method1572(arg0);
			this.aClass68_3 = new Class68();
			this.aClass68_3.method1572(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method6863();
			if (local114 == 0) {
				break;
			}
			this.anIntArray516[local109] = local114;
			this.anIntArray520[local109] = arg0.method6901();
			this.anIntArray517[local109] = arg0.method6863();
		}
		this.anInt7678 = arg0.method6863();
		this.anInt7676 = arg0.method6863();
		this.anInt7677 = arg0.method6884();
		this.anInt7679 = arg0.method6884();
		this.aClass289_1 = new Class289();
		this.aClass68_1 = new Class68();
		this.aClass289_1.method6936(arg0, this.aClass68_1);
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(II)[I")
	public int[] method6420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static649.method4864(Static426.anIntArray521, 0, arg0);
		if (arg1 < 10) {
			return Static426.anIntArray521;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass68_6.method1573();
		this.aClass68_5.method1573();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass68_9 != null) {
			this.aClass68_9.method1573();
			this.aClass68_4.method1573();
			local24 = (int) ((double) (this.aClass68_9.anInt1799 - this.aClass68_9.anInt1800) * 32.768D / local16);
			local26 = (int) ((double) this.aClass68_9.anInt1800 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass68_8 != null) {
			this.aClass68_8.method1573();
			this.aClass68_7.method1573();
			local63 = (int) ((double) (this.aClass68_8.anInt1799 - this.aClass68_8.anInt1800) * 32.768D / local16);
			local65 = (int) ((double) this.aClass68_8.anInt1800 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray516[local102] != 0) {
				Static426.anIntArray526[local102] = 0;
				Static426.anIntArray523[local102] = (int) ((double) this.anIntArray517[local102] * local16);
				Static426.anIntArray524[local102] = (this.anIntArray516[local102] << 14) / 100;
				Static426.anIntArray522[local102] = (int) ((double) (this.aClass68_6.anInt1799 - this.aClass68_6.anInt1800) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray520[local102]) / local16);
				Static426.anIntArray525[local102] = (int) ((double) this.aClass68_6.anInt1800 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass68_6.method1574(arg0);
			local187 = this.aClass68_5.method1574(arg0);
			if (this.aClass68_9 != null) {
				local195 = this.aClass68_9.method1574(arg0);
				local200 = this.aClass68_4.method1574(arg0);
				local182 += this.method6417(local28, local200, this.aClass68_9.anInt1798) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass68_8 != null) {
				local195 = this.aClass68_8.method1574(arg0);
				local200 = this.aClass68_7.method1574(arg0);
				local187 = local187 * ((this.method6417(local67, local200, this.aClass68_8.anInt1798) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray516[local195] != 0) {
					local200 = local176 + Static426.anIntArray523[local195];
					if (local200 < arg0) {
						Static426.anIntArray521[local200] += this.method6417(Static426.anIntArray526[local195], local187 * Static426.anIntArray524[local195] >> 15, this.aClass68_6.anInt1798);
						Static426.anIntArray526[local195] += (local182 * Static426.anIntArray522[local195] >> 16) + Static426.anIntArray525[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass68_2 != null) {
			this.aClass68_2.method1573();
			this.aClass68_3.method1573();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass68_2.method1574(arg0);
				local352 = this.aClass68_3.method1574(arg0);
				if (local339) {
					local187 = this.aClass68_2.anInt1800 + ((this.aClass68_2.anInt1799 - this.aClass68_2.anInt1800) * local347 >> 8);
				} else {
					local187 = this.aClass68_2.anInt1800 + ((this.aClass68_2.anInt1799 - this.aClass68_2.anInt1800) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static426.anIntArray521[local200] = 0;
				}
			}
		}
		if (this.anInt7678 > 0 && this.anInt7676 > 0) {
			local182 = (int) ((double) this.anInt7678 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static426.anIntArray521[local187] += Static426.anIntArray521[local187 - local182] * this.anInt7676 / 100;
			}
		}
		if (this.aClass289_1.anIntArray563[0] > 0 || this.aClass289_1.anIntArray563[1] > 0) {
			this.aClass68_1.method1573();
			local182 = this.aClass68_1.method1574(arg0 + 1);
			local187 = this.aClass289_1.method6940(0, (float) local182 / 65536.0F);
			local195 = this.aClass289_1.method6940(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static426.anIntArray521[local200 + local187] * (long) Static482.anInt8265 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static426.anIntArray521[local200 + local187 - local519 - 1] * (long) Static482.anIntArrayArray74[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static426.anIntArray521[local200 - local549 - 1] * (long) Static482.anIntArrayArray74[1][local549] >> 16);
					}
					Static426.anIntArray521[local200] = local352;
					local182 = this.aClass68_1.method1574(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static426.anIntArray521[local200 + local187] * (long) Static482.anInt8265 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static426.anIntArray521[local200 + local187 - local519 - 1] * (long) Static482.anIntArrayArray74[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static426.anIntArray521[local200 - local549 - 1] * (long) Static482.anIntArrayArray74[1][local549] >> 16);
						}
						Static426.anIntArray521[local200] = local352;
						local182 = this.aClass68_1.method1574(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static426.anIntArray521[local200 + local187 - local519 - 1] * (long) Static482.anIntArrayArray74[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static426.anIntArray521[local200 - local549 - 1] * (long) Static482.anIntArrayArray74[1][local549] >> 16);
							}
							Static426.anIntArray521[local200] = local352;
							this.aClass68_1.method1574(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass289_1.method6940(0, (float) local182 / 65536.0F);
					local195 = this.aClass289_1.method6940(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static426.anIntArray521[local182] < -32768) {
				Static426.anIntArray521[local182] = -32768;
			}
			if (Static426.anIntArray521[local182] > 32767) {
				Static426.anIntArray521[local182] = 32767;
			}
		}
		return Static426.anIntArray521;
	}
}
