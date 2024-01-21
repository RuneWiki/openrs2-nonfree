import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4 {

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "[I")
	public static int[] anIntArray22 = new int[32768];

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "[I")
	public static int[] anIntArray23;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "Lclient!ef;")
	private Class26 aClass26_1;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "Lclient!ai;")
	private Class8 aClass8_1;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "Lclient!ai;")
	private Class8 aClass8_2;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "Lclient!ai;")
	private Class8 aClass8_3;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "Lclient!ai;")
	private Class8 aClass8_4;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "Lclient!ai;")
	private Class8 aClass8_5;

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "Lclient!ai;")
	private Class8 aClass8_6;

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "Lclient!ai;")
	private Class8 aClass8_7;

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "Lclient!ai;")
	private Class8 aClass8_8;

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "Lclient!ai;")
	private Class8 aClass8_9;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
	private int anInt87 = 0;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
	public int anInt88 = 500;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
	private int anInt89 = 100;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
	public int anInt90 = 0;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "[I")
	private final int[] anIntArray18 = new int[5];

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "[I")
	private final int[] anIntArray20 = new int[5];

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "[I")
	private final int[] anIntArray21 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray22[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray23 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray23[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!hd;)V")
	public void method69(@OriginalArg(0) Class3_Sub8 arg0) {
		this.aClass8_2 = new Class8();
		this.aClass8_2.method245(arg0);
		this.aClass8_9 = new Class8();
		this.aClass8_9.method245(arg0);
		@Pc(21) int local21 = arg0.method1545();
		if (local21 != 0) {
			arg0.anInt1948--;
			this.aClass8_1 = new Class8();
			this.aClass8_1.method245(arg0);
			this.aClass8_5 = new Class8();
			this.aClass8_5.method245(arg0);
		}
		local21 = arg0.method1545();
		if (local21 != 0) {
			arg0.anInt1948--;
			this.aClass8_8 = new Class8();
			this.aClass8_8.method245(arg0);
			this.aClass8_6 = new Class8();
			this.aClass8_6.method245(arg0);
		}
		local21 = arg0.method1545();
		if (local21 != 0) {
			arg0.anInt1948--;
			this.aClass8_3 = new Class8();
			this.aClass8_3.method245(arg0);
			this.aClass8_7 = new Class8();
			this.aClass8_7.method245(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1544();
			if (local114 == 0) {
				break;
			}
			this.anIntArray18[local109] = local114;
			this.anIntArray21[local109] = arg0.method1532();
			this.anIntArray20[local109] = arg0.method1544();
		}
		this.anInt87 = arg0.method1544();
		this.anInt89 = arg0.method1544();
		this.anInt88 = arg0.method1510();
		this.anInt90 = arg0.method1510();
		this.aClass26_1 = new Class26();
		this.aClass8_4 = new Class8();
		this.aClass26_1.method899(arg0, this.aClass8_4);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)[I")
	public int[] method70(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static188.method2239(Static3.anIntArray19, 0, arg0);
		if (arg1 < 10) {
			return Static3.anIntArray19;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass8_2.method246();
		this.aClass8_9.method246();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass8_1 != null) {
			this.aClass8_1.method246();
			this.aClass8_5.method246();
			local24 = (int) ((double) (this.aClass8_1.anInt255 - this.aClass8_1.anInt258) * 32.768D / local16);
			local26 = (int) ((double) this.aClass8_1.anInt258 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass8_8 != null) {
			this.aClass8_8.method246();
			this.aClass8_6.method246();
			local63 = (int) ((double) (this.aClass8_8.anInt255 - this.aClass8_8.anInt258) * 32.768D / local16);
			local65 = (int) ((double) this.aClass8_8.anInt258 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray18[local102] != 0) {
				Static3.anIntArray25[local102] = 0;
				Static3.anIntArray27[local102] = (int) ((double) this.anIntArray20[local102] * local16);
				Static3.anIntArray24[local102] = (this.anIntArray18[local102] << 14) / 100;
				Static3.anIntArray26[local102] = (int) ((double) (this.aClass8_2.anInt255 - this.aClass8_2.anInt258) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray21[local102]) / local16);
				Static3.anIntArray28[local102] = (int) ((double) this.aClass8_2.anInt258 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass8_2.method247(arg0);
			local187 = this.aClass8_9.method247(arg0);
			if (this.aClass8_1 != null) {
				local195 = this.aClass8_1.method247(arg0);
				local200 = this.aClass8_5.method247(arg0);
				local182 += this.method71(local28, local200, this.aClass8_1.anInt257) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass8_8 != null) {
				local195 = this.aClass8_8.method247(arg0);
				local200 = this.aClass8_6.method247(arg0);
				local187 = local187 * ((this.method71(local67, local200, this.aClass8_8.anInt257) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray18[local195] != 0) {
					local200 = local176 + Static3.anIntArray27[local195];
					if (local200 < arg0) {
						Static3.anIntArray19[local200] += this.method71(Static3.anIntArray25[local195], local187 * Static3.anIntArray24[local195] >> 15, this.aClass8_2.anInt257);
						Static3.anIntArray25[local195] += (local182 * Static3.anIntArray26[local195] >> 16) + Static3.anIntArray28[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass8_3 != null) {
			this.aClass8_3.method246();
			this.aClass8_7.method246();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass8_3.method247(arg0);
				local352 = this.aClass8_7.method247(arg0);
				if (local339) {
					local187 = this.aClass8_3.anInt258 + ((this.aClass8_3.anInt255 - this.aClass8_3.anInt258) * local347 >> 8);
				} else {
					local187 = this.aClass8_3.anInt258 + ((this.aClass8_3.anInt255 - this.aClass8_3.anInt258) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static3.anIntArray19[local200] = 0;
				}
			}
		}
		if (this.anInt87 > 0 && this.anInt89 > 0) {
			local182 = (int) ((double) this.anInt87 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static3.anIntArray19[local187] += Static3.anIntArray19[local187 - local182] * this.anInt89 / 100;
			}
		}
		if (this.aClass26_1.anIntArray201[0] > 0 || this.aClass26_1.anIntArray201[1] > 0) {
			this.aClass8_4.method246();
			local182 = this.aClass8_4.method247(arg0 + 1);
			local187 = this.aClass26_1.method894(0, (float) local182 / 65536.0F);
			local195 = this.aClass26_1.method894(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static3.anIntArray19[local200 + local187] * (long) Static39.anInt1099 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static3.anIntArray19[local200 + local187 - local519 - 1] * (long) Static39.anIntArrayArray14[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static3.anIntArray19[local200 - local549 - 1] * (long) Static39.anIntArrayArray14[1][local549] >> 16);
					}
					Static3.anIntArray19[local200] = local352;
					local182 = this.aClass8_4.method247(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static3.anIntArray19[local200 + local187] * (long) Static39.anInt1099 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static3.anIntArray19[local200 + local187 - local519 - 1] * (long) Static39.anIntArrayArray14[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static3.anIntArray19[local200 - local549 - 1] * (long) Static39.anIntArrayArray14[1][local549] >> 16);
						}
						Static3.anIntArray19[local200] = local352;
						local182 = this.aClass8_4.method247(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static3.anIntArray19[local200 + local187 - local519 - 1] * (long) Static39.anIntArrayArray14[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static3.anIntArray19[local200 - local549 - 1] * (long) Static39.anIntArrayArray14[1][local549] >> 16);
							}
							Static3.anIntArray19[local200] = local352;
							this.aClass8_4.method247(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass26_1.method894(0, (float) local182 / 65536.0F);
					local195 = this.aClass26_1.method894(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static3.anIntArray19[local182] < -32768) {
				Static3.anIntArray19[local182] = -32768;
			}
			if (Static3.anIntArray19[local182] > 32767) {
				Static3.anIntArray19[local182] = 32767;
			}
		}
		return Static3.anIntArray19;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)I")
	private int method71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray23[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray22[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
