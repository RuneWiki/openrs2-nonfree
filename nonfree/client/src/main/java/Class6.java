import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class6 {

	@OriginalMember(owner = "client!af", name = "n", descriptor = "[I")
	private static int[] anIntArray8 = new int[32768];

	@OriginalMember(owner = "client!af", name = "k", descriptor = "[I")
	private static int[] anIntArray7;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "Lclient!mb;")
	private Class84 aClass84_1;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "Lclient!mb;")
	private Class84 aClass84_2;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "Lclient!mb;")
	private Class84 aClass84_3;

	@OriginalMember(owner = "client!af", name = "e", descriptor = "Lclient!nh;")
	private Class92 aClass92_1;

	@OriginalMember(owner = "client!af", name = "f", descriptor = "Lclient!mb;")
	private Class84 aClass84_4;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "Lclient!mb;")
	private Class84 aClass84_5;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "Lclient!mb;")
	private Class84 aClass84_6;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "Lclient!mb;")
	private Class84 aClass84_7;

	@OriginalMember(owner = "client!af", name = "l", descriptor = "Lclient!mb;")
	private Class84 aClass84_8;

	@OriginalMember(owner = "client!af", name = "t", descriptor = "Lclient!mb;")
	private Class84 aClass84_9;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "I")
	private int anInt130 = 100;

	@OriginalMember(owner = "client!af", name = "m", descriptor = "I")
	public int anInt131 = 0;

	@OriginalMember(owner = "client!af", name = "s", descriptor = "[I")
	private int[] anIntArray12 = new int[5];

	@OriginalMember(owner = "client!af", name = "d", descriptor = "I")
	public int anInt129 = 500;

	@OriginalMember(owner = "client!af", name = "q", descriptor = "[I")
	private int[] anIntArray10 = new int[5];

	@OriginalMember(owner = "client!af", name = "p", descriptor = "I")
	private int anInt132 = 0;

	@OriginalMember(owner = "client!af", name = "r", descriptor = "[I")
	private int[] anIntArray11 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray8[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray7 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray7[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!ql;)V")
	public void method96(@OriginalArg(0) Class1_Sub13 arg0) {
		this.aClass84_5 = new Class84();
		this.aClass84_5.method2577(arg0);
		this.aClass84_4 = new Class84();
		this.aClass84_4.method2577(arg0);
		@Pc(21) int local21 = arg0.method1772();
		if (local21 != 0) {
			arg0.anInt2395--;
			this.aClass84_8 = new Class84();
			this.aClass84_8.method2577(arg0);
			this.aClass84_2 = new Class84();
			this.aClass84_2.method2577(arg0);
		}
		local21 = arg0.method1772();
		if (local21 != 0) {
			arg0.anInt2395--;
			this.aClass84_3 = new Class84();
			this.aClass84_3.method2577(arg0);
			this.aClass84_1 = new Class84();
			this.aClass84_1.method2577(arg0);
		}
		local21 = arg0.method1772();
		if (local21 != 0) {
			arg0.anInt2395--;
			this.aClass84_9 = new Class84();
			this.aClass84_9.method2577(arg0);
			this.aClass84_7 = new Class84();
			this.aClass84_7.method2577(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1780();
			if (local114 == 0) {
				break;
			}
			this.anIntArray11[local109] = local114;
			this.anIntArray12[local109] = arg0.method1790();
			this.anIntArray10[local109] = arg0.method1780();
		}
		this.anInt132 = arg0.method1780();
		this.anInt130 = arg0.method1780();
		this.anInt129 = arg0.method1764();
		this.anInt131 = arg0.method1764();
		this.aClass92_1 = new Class92();
		this.aClass84_6 = new Class84();
		this.aClass92_1.method2809(arg0, this.aClass84_6);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(III)I")
	private int method97(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray7[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray8[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)[I")
	public int[] method98(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static274.method2687(Static6.anIntArray9, 0, arg0);
		if (arg1 < 10) {
			return Static6.anIntArray9;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass84_5.method2578();
		this.aClass84_4.method2578();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass84_8 != null) {
			this.aClass84_8.method2578();
			this.aClass84_2.method2578();
			local24 = (int) ((double) (this.aClass84_8.anInt3429 - this.aClass84_8.anInt3430) * 32.768D / local16);
			local26 = (int) ((double) this.aClass84_8.anInt3430 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass84_3 != null) {
			this.aClass84_3.method2578();
			this.aClass84_1.method2578();
			local63 = (int) ((double) (this.aClass84_3.anInt3429 - this.aClass84_3.anInt3430) * 32.768D / local16);
			local65 = (int) ((double) this.aClass84_3.anInt3430 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray11[local102] != 0) {
				Static6.anIntArray15[local102] = 0;
				Static6.anIntArray14[local102] = (int) ((double) this.anIntArray10[local102] * local16);
				Static6.anIntArray13[local102] = (this.anIntArray11[local102] << 14) / 100;
				Static6.anIntArray17[local102] = (int) ((double) (this.aClass84_5.anInt3429 - this.aClass84_5.anInt3430) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray12[local102]) / local16);
				Static6.anIntArray16[local102] = (int) ((double) this.aClass84_5.anInt3430 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass84_5.method2580(arg0);
			local187 = this.aClass84_4.method2580(arg0);
			if (this.aClass84_8 != null) {
				local195 = this.aClass84_8.method2580(arg0);
				local200 = this.aClass84_2.method2580(arg0);
				local182 += this.method97(local28, local200, this.aClass84_8.anInt3432) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass84_3 != null) {
				local195 = this.aClass84_3.method2580(arg0);
				local200 = this.aClass84_1.method2580(arg0);
				local187 = local187 * ((this.method97(local67, local200, this.aClass84_3.anInt3432) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray11[local195] != 0) {
					local200 = local176 + Static6.anIntArray14[local195];
					if (local200 < arg0) {
						Static6.anIntArray9[local200] += this.method97(Static6.anIntArray15[local195], local187 * Static6.anIntArray13[local195] >> 15, this.aClass84_5.anInt3432);
						Static6.anIntArray15[local195] += (local182 * Static6.anIntArray17[local195] >> 16) + Static6.anIntArray16[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass84_9 != null) {
			this.aClass84_9.method2578();
			this.aClass84_7.method2578();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass84_9.method2580(arg0);
				local352 = this.aClass84_7.method2580(arg0);
				if (local339) {
					local187 = this.aClass84_9.anInt3430 + ((this.aClass84_9.anInt3429 - this.aClass84_9.anInt3430) * local347 >> 8);
				} else {
					local187 = this.aClass84_9.anInt3430 + ((this.aClass84_9.anInt3429 - this.aClass84_9.anInt3430) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static6.anIntArray9[local200] = 0;
				}
			}
		}
		if (this.anInt132 > 0 && this.anInt130 > 0) {
			local182 = (int) ((double) this.anInt132 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static6.anIntArray9[local187] += Static6.anIntArray9[local187 - local182] * this.anInt130 / 100;
			}
		}
		if (this.aClass92_1.anIntArray279[0] > 0 || this.aClass92_1.anIntArray279[1] > 0) {
			this.aClass84_6.method2578();
			local182 = this.aClass84_6.method2580(arg0 + 1);
			local187 = this.aClass92_1.method2806(0, (float) local182 / 65536.0F);
			local195 = this.aClass92_1.method2806(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static6.anIntArray9[local200 + local187] * (long) Static159.anInt3788 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static6.anIntArray9[local200 + local187 - local519 - 1] * (long) Static159.anIntArrayArray25[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static6.anIntArray9[local200 - local549 - 1] * (long) Static159.anIntArrayArray25[1][local549] >> 16);
					}
					Static6.anIntArray9[local200] = local352;
					local182 = this.aClass84_6.method2580(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static6.anIntArray9[local200 + local187] * (long) Static159.anInt3788 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static6.anIntArray9[local200 + local187 - local519 - 1] * (long) Static159.anIntArrayArray25[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static6.anIntArray9[local200 - local549 - 1] * (long) Static159.anIntArrayArray25[1][local549] >> 16);
						}
						Static6.anIntArray9[local200] = local352;
						local182 = this.aClass84_6.method2580(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static6.anIntArray9[local200 + local187 - local519 - 1] * (long) Static159.anIntArrayArray25[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static6.anIntArray9[local200 - local549 - 1] * (long) Static159.anIntArrayArray25[1][local549] >> 16);
							}
							Static6.anIntArray9[local200] = local352;
							this.aClass84_6.method2580(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass92_1.method2806(0, (float) local182 / 65536.0F);
					local195 = this.aClass92_1.method2806(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static6.anIntArray9[local182] < -32768) {
				Static6.anIntArray9[local182] = -32768;
			}
			if (Static6.anIntArray9[local182] > 32767) {
				Static6.anIntArray9[local182] = 32767;
			}
		}
		return Static6.anIntArray9;
	}
}
