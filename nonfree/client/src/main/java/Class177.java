import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class177 {

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "[I")
	private static final int[] anIntArray584 = new int[32768];

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "[I")
	private static final int[] anIntArray583;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "Lclient!e;")
	private Class57 aClass57_1;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "Lclient!e;")
	private Class57 aClass57_2;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "Lclient!rk;")
	private Class199 aClass199_1;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "Lclient!e;")
	private Class57 aClass57_3;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "Lclient!e;")
	private Class57 aClass57_4;

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "Lclient!e;")
	private Class57 aClass57_5;

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "Lclient!e;")
	private Class57 aClass57_6;

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "Lclient!e;")
	private Class57 aClass57_7;

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "Lclient!e;")
	private Class57 aClass57_8;

	@OriginalMember(owner = "client!pe", name = "x", descriptor = "Lclient!e;")
	private Class57 aClass57_9;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "[I")
	private final int[] anIntArray582 = new int[5];

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
	private int anInt4777 = 0;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
	private int anInt4778 = 100;

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
	public int anInt4779 = 500;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "[I")
	private final int[] anIntArray585 = new int[5];

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
	public int anInt4780 = 0;

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "[I")
	private final int[] anIntArray590 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray584[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray583 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray583[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!lk;)V")
	public void method4181(@OriginalArg(0) Class2_Sub13 arg0) {
		this.aClass57_6 = new Class57();
		this.aClass57_6.method1262(arg0);
		this.aClass57_5 = new Class57();
		this.aClass57_5.method1262(arg0);
		@Pc(21) int local21 = arg0.method4240();
		if (local21 != 0) {
			arg0.anInt4788--;
			this.aClass57_7 = new Class57();
			this.aClass57_7.method1262(arg0);
			this.aClass57_1 = new Class57();
			this.aClass57_1.method1262(arg0);
		}
		local21 = arg0.method4240();
		if (local21 != 0) {
			arg0.anInt4788--;
			this.aClass57_9 = new Class57();
			this.aClass57_9.method1262(arg0);
			this.aClass57_4 = new Class57();
			this.aClass57_4.method1262(arg0);
		}
		local21 = arg0.method4240();
		if (local21 != 0) {
			arg0.anInt4788--;
			this.aClass57_3 = new Class57();
			this.aClass57_3.method1262(arg0);
			this.aClass57_8 = new Class57();
			this.aClass57_8.method1262(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method4211();
			if (local114 == 0) {
				break;
			}
			this.anIntArray582[local109] = local114;
			this.anIntArray585[local109] = arg0.method4192();
			this.anIntArray590[local109] = arg0.method4211();
		}
		this.anInt4777 = arg0.method4211();
		this.anInt4778 = arg0.method4211();
		this.anInt4779 = arg0.method4245();
		this.anInt4780 = arg0.method4245();
		this.aClass199_1 = new Class199();
		this.aClass57_2 = new Class57();
		this.aClass199_1.method4808(arg0, this.aClass57_2);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)[I")
	public int[] method4182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static406.method5653(Static270.anIntArray586, 0, arg0);
		if (arg1 < 10) {
			return Static270.anIntArray586;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass57_6.method1261();
		this.aClass57_5.method1261();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass57_7 != null) {
			this.aClass57_7.method1261();
			this.aClass57_1.method1261();
			local24 = (int) ((double) (this.aClass57_7.anInt1318 - this.aClass57_7.anInt1317) * 32.768D / local16);
			local26 = (int) ((double) this.aClass57_7.anInt1317 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass57_9 != null) {
			this.aClass57_9.method1261();
			this.aClass57_4.method1261();
			local63 = (int) ((double) (this.aClass57_9.anInt1318 - this.aClass57_9.anInt1317) * 32.768D / local16);
			local65 = (int) ((double) this.aClass57_9.anInt1317 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray582[local102] != 0) {
				Static270.anIntArray587[local102] = 0;
				Static270.anIntArray592[local102] = (int) ((double) this.anIntArray590[local102] * local16);
				Static270.anIntArray588[local102] = (this.anIntArray582[local102] << 14) / 100;
				Static270.anIntArray589[local102] = (int) ((double) (this.aClass57_6.anInt1318 - this.aClass57_6.anInt1317) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray585[local102]) / local16);
				Static270.anIntArray591[local102] = (int) ((double) this.aClass57_6.anInt1317 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass57_6.method1263(arg0);
			local187 = this.aClass57_5.method1263(arg0);
			if (this.aClass57_7 != null) {
				local195 = this.aClass57_7.method1263(arg0);
				local200 = this.aClass57_1.method1263(arg0);
				local182 += this.method4184(local28, local200, this.aClass57_7.anInt1319) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass57_9 != null) {
				local195 = this.aClass57_9.method1263(arg0);
				local200 = this.aClass57_4.method1263(arg0);
				local187 = local187 * ((this.method4184(local67, local200, this.aClass57_9.anInt1319) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray582[local195] != 0) {
					local200 = local176 + Static270.anIntArray592[local195];
					if (local200 < arg0) {
						Static270.anIntArray586[local200] += this.method4184(Static270.anIntArray587[local195], local187 * Static270.anIntArray588[local195] >> 15, this.aClass57_6.anInt1319);
						Static270.anIntArray587[local195] += (local182 * Static270.anIntArray589[local195] >> 16) + Static270.anIntArray591[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass57_3 != null) {
			this.aClass57_3.method1261();
			this.aClass57_8.method1261();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass57_3.method1263(arg0);
				local352 = this.aClass57_8.method1263(arg0);
				if (local339) {
					local187 = this.aClass57_3.anInt1317 + ((this.aClass57_3.anInt1318 - this.aClass57_3.anInt1317) * local347 >> 8);
				} else {
					local187 = this.aClass57_3.anInt1317 + ((this.aClass57_3.anInt1318 - this.aClass57_3.anInt1317) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static270.anIntArray586[local200] = 0;
				}
			}
		}
		if (this.anInt4777 > 0 && this.anInt4778 > 0) {
			local182 = (int) ((double) this.anInt4777 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static270.anIntArray586[local187] += Static270.anIntArray586[local187 - local182] * this.anInt4778 / 100;
			}
		}
		if (this.aClass199_1.anIntArray668[0] > 0 || this.aClass199_1.anIntArray668[1] > 0) {
			this.aClass57_2.method1261();
			local182 = this.aClass57_2.method1263(arg0 + 1);
			local187 = this.aClass199_1.method4809(0, (float) local182 / 65536.0F);
			local195 = this.aClass199_1.method4809(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static270.anIntArray586[local200 + local187] * (long) Static310.anInt5490 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static270.anIntArray586[local200 + local187 - local519 - 1] * (long) Static310.anIntArrayArray47[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static270.anIntArray586[local200 - local549 - 1] * (long) Static310.anIntArrayArray47[1][local549] >> 16);
					}
					Static270.anIntArray586[local200] = local352;
					local182 = this.aClass57_2.method1263(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static270.anIntArray586[local200 + local187] * (long) Static310.anInt5490 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static270.anIntArray586[local200 + local187 - local519 - 1] * (long) Static310.anIntArrayArray47[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static270.anIntArray586[local200 - local549 - 1] * (long) Static310.anIntArrayArray47[1][local549] >> 16);
						}
						Static270.anIntArray586[local200] = local352;
						local182 = this.aClass57_2.method1263(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static270.anIntArray586[local200 + local187 - local519 - 1] * (long) Static310.anIntArrayArray47[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static270.anIntArray586[local200 - local549 - 1] * (long) Static310.anIntArrayArray47[1][local549] >> 16);
							}
							Static270.anIntArray586[local200] = local352;
							this.aClass57_2.method1263(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass199_1.method4809(0, (float) local182 / 65536.0F);
					local195 = this.aClass199_1.method4809(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static270.anIntArray586[local182] < -32768) {
				Static270.anIntArray586[local182] = -32768;
			}
			if (Static270.anIntArray586[local182] > 32767) {
				Static270.anIntArray586[local182] = 32767;
			}
		}
		return Static270.anIntArray586;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)I")
	private int method4184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray583[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray584[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
