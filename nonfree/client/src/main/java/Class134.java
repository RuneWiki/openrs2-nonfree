import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class134 {

	@OriginalMember(owner = "client!r", name = "c", descriptor = "[I")
	private static int[] anIntArray501 = new int[32768];

	@OriginalMember(owner = "client!r", name = "e", descriptor = "[I")
	private static int[] anIntArray503;

	@OriginalMember(owner = "client!r", name = "b", descriptor = "Lclient!wb;")
	private Class175 aClass175_1;

	@OriginalMember(owner = "client!r", name = "f", descriptor = "Lclient!wb;")
	private Class175 aClass175_2;

	@OriginalMember(owner = "client!r", name = "i", descriptor = "Lclient!wb;")
	private Class175 aClass175_3;

	@OriginalMember(owner = "client!r", name = "k", descriptor = "Lclient!wb;")
	private Class175 aClass175_4;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "Lclient!wb;")
	private Class175 aClass175_5;

	@OriginalMember(owner = "client!r", name = "q", descriptor = "Lclient!wb;")
	private Class175 aClass175_6;

	@OriginalMember(owner = "client!r", name = "r", descriptor = "Lclient!wb;")
	private Class175 aClass175_7;

	@OriginalMember(owner = "client!r", name = "s", descriptor = "Lclient!wb;")
	private Class175 aClass175_8;

	@OriginalMember(owner = "client!r", name = "t", descriptor = "Lclient!wb;")
	private Class175 aClass175_9;

	@OriginalMember(owner = "client!r", name = "w", descriptor = "Lclient!ik;")
	private Class74 aClass74_1;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "I")
	public int anInt4921 = 500;

	@OriginalMember(owner = "client!r", name = "d", descriptor = "[I")
	private int[] anIntArray502 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!r", name = "h", descriptor = "[I")
	private int[] anIntArray505 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!r", name = "u", descriptor = "[I")
	private int[] anIntArray510 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!r", name = "o", descriptor = "I")
	public int anInt4922 = 0;

	@OriginalMember(owner = "client!r", name = "y", descriptor = "I")
	private int anInt4924 = 100;

	@OriginalMember(owner = "client!r", name = "x", descriptor = "I")
	private int anInt4923 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		@Pc(9) int local9;
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray501[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray503 = new int[32768];
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray503[local9] = (int) (Math.sin((double) local9 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!im;)V")
	public void method3909(@OriginalArg(0) Class1_Sub16 arg0) {
		this.aClass175_6 = new Class175();
		this.aClass175_6.method4736(arg0);
		this.aClass175_3 = new Class175();
		this.aClass175_3.method4736(arg0);
		@Pc(21) int local21 = arg0.method2655();
		if (local21 != 0) {
			arg0.anInt3328--;
			this.aClass175_4 = new Class175();
			this.aClass175_4.method4736(arg0);
			this.aClass175_9 = new Class175();
			this.aClass175_9.method4736(arg0);
		}
		local21 = arg0.method2655();
		if (local21 != 0) {
			arg0.anInt3328--;
			this.aClass175_7 = new Class175();
			this.aClass175_7.method4736(arg0);
			this.aClass175_8 = new Class175();
			this.aClass175_8.method4736(arg0);
		}
		local21 = arg0.method2655();
		if (local21 != 0) {
			arg0.anInt3328--;
			this.aClass175_5 = new Class175();
			this.aClass175_5.method4736(arg0);
			this.aClass175_2 = new Class175();
			this.aClass175_2.method4736(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(116) int local116 = arg0.method2618();
			if (local116 == 0) {
				break;
			}
			this.anIntArray510[local109] = local116;
			this.anIntArray505[local109] = arg0.method2658();
			this.anIntArray502[local109] = arg0.method2618();
		}
		this.anInt4923 = arg0.method2618();
		this.anInt4924 = arg0.method2618();
		this.anInt4921 = arg0.method2652();
		this.anInt4922 = arg0.method2652();
		this.aClass74_1 = new Class74();
		this.aClass175_1 = new Class175();
		this.aClass74_1.method1929(arg0, this.aClass175_1);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)[I")
	public int[] method3910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static302.method1375(Static221.anIntArray504, 0, arg0);
		if (arg1 < 10) {
			return Static221.anIntArray504;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass175_6.method4734();
		this.aClass175_3.method4734();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass175_4 != null) {
			this.aClass175_4.method4734();
			this.aClass175_9.method4734();
			local24 = (int) ((double) (this.aClass175_4.anInt6104 - this.aClass175_4.anInt6107) * 32.768D / local16);
			local26 = (int) ((double) this.aClass175_4.anInt6107 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass175_7 != null) {
			this.aClass175_7.method4734();
			this.aClass175_8.method4734();
			local63 = (int) ((double) (this.aClass175_7.anInt6104 - this.aClass175_7.anInt6107) * 32.768D / local16);
			local65 = (int) ((double) this.aClass175_7.anInt6107 * 32.768D / local16);
		}
		@Pc(102) int local102;
		for (local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray510[local102] != 0) {
				Static221.anIntArray509[local102] = 0;
				Static221.anIntArray508[local102] = (int) ((double) this.anIntArray502[local102] * local16);
				Static221.anIntArray511[local102] = (this.anIntArray510[local102] << 14) / 100;
				Static221.anIntArray507[local102] = (int) ((double) (this.aClass175_6.anInt6104 - this.aClass175_6.anInt6107) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray505[local102]) / local16);
				Static221.anIntArray506[local102] = (int) ((double) this.aClass175_6.anInt6107 * 32.768D / local16);
			}
		}
		@Pc(185) int local185;
		@Pc(190) int local190;
		@Pc(198) int local198;
		@Pc(203) int local203;
		for (local102 = 0; local102 < arg0; local102++) {
			local185 = this.aClass175_6.method4737(arg0);
			local190 = this.aClass175_3.method4737(arg0);
			if (this.aClass175_4 != null) {
				local198 = this.aClass175_4.method4737(arg0);
				local203 = this.aClass175_9.method4737(arg0);
				local185 += this.method3911(local28, local203, this.aClass175_4.anInt6106) >> 1;
				local28 += (local198 * local24 >> 16) + local26;
			}
			if (this.aClass175_7 != null) {
				local198 = this.aClass175_7.method4737(arg0);
				local203 = this.aClass175_8.method4737(arg0);
				local190 = local190 * ((this.method3911(local67, local203, this.aClass175_7.anInt6106) >> 1) + 32768) >> 15;
				local67 += (local198 * local63 >> 16) + local65;
			}
			for (local198 = 0; local198 < 5; local198++) {
				if (this.anIntArray510[local198] != 0) {
					local203 = local102 + Static221.anIntArray508[local198];
					if (local203 < arg0) {
						Static221.anIntArray504[local203] += this.method3911(Static221.anIntArray509[local198], local190 * Static221.anIntArray511[local198] >> 15, this.aClass175_6.anInt6106);
						Static221.anIntArray509[local198] += (local185 * Static221.anIntArray507[local198] >> 16) + Static221.anIntArray506[local198];
					}
				}
			}
		}
		@Pc(356) int local356;
		if (this.aClass175_5 != null) {
			this.aClass175_5.method4734();
			this.aClass175_2.method4734();
			local102 = 0;
			@Pc(341) boolean local341 = true;
			for (local198 = 0; local198 < arg0; local198++) {
				local203 = this.aClass175_5.method4737(arg0);
				local356 = this.aClass175_2.method4737(arg0);
				if (local341) {
					local185 = this.aClass175_5.anInt6107 + ((this.aClass175_5.anInt6104 - this.aClass175_5.anInt6107) * local203 >> 8);
				} else {
					local185 = this.aClass175_5.anInt6107 + ((this.aClass175_5.anInt6104 - this.aClass175_5.anInt6107) * local356 >> 8);
				}
				local102 += 256;
				if (local102 >= local185) {
					local102 = 0;
					local341 = !local341;
				}
				if (local341) {
					Static221.anIntArray504[local198] = 0;
				}
			}
		}
		if (this.anInt4923 > 0 && this.anInt4924 > 0) {
			local102 = (int) ((double) this.anInt4923 * local16);
			for (local185 = local102; local185 < arg0; local185++) {
				Static221.anIntArray504[local185] += Static221.anIntArray504[local185 - local102] * this.anInt4924 / 100;
			}
		}
		if (this.aClass74_1.anIntArray252[0] > 0 || this.aClass74_1.anIntArray252[1] > 0) {
			this.aClass175_1.method4734();
			local102 = this.aClass175_1.method4737(arg0 + 1);
			local185 = this.aClass74_1.method1925(0, (float) local102 / 65536.0F);
			local190 = this.aClass74_1.method1925(1, (float) local102 / 65536.0F);
			if (arg0 >= local185 + local190) {
				local198 = 0;
				local203 = local190;
				if (local190 > arg0 - local185) {
					local203 = arg0 - local185;
				}
				@Pc(523) int local523;
				while (local198 < local203) {
					local356 = (int) ((long) Static221.anIntArray504[local198 + local185] * (long) Static118.anInt2579 >> 16);
					for (local523 = 0; local523 < local185; local523++) {
						local356 += (int) ((long) Static221.anIntArray504[local198 + local185 - local523 - 1] * (long) Static118.anIntArrayArray17[0][local523] >> 16);
					}
					for (local523 = 0; local523 < local198; local523++) {
						local356 -= (int) ((long) Static221.anIntArray504[local198 - local523 - 1] * (long) Static118.anIntArrayArray17[1][local523] >> 16);
					}
					Static221.anIntArray504[local198] = local356;
					local102 = this.aClass175_1.method4737(arg0 + 1);
					local198++;
				}
				local203 = 128;
				while (true) {
					if (local203 > arg0 - local185) {
						local203 = arg0 - local185;
					}
					while (local198 < local203) {
						local356 = (int) ((long) Static221.anIntArray504[local198 + local185] * (long) Static118.anInt2579 >> 16);
						for (local523 = 0; local523 < local185; local523++) {
							local356 += (int) ((long) Static221.anIntArray504[local198 + local185 - local523 - 1] * (long) Static118.anIntArrayArray17[0][local523] >> 16);
						}
						for (local523 = 0; local523 < local190; local523++) {
							local356 -= (int) ((long) Static221.anIntArray504[local198 - local523 - 1] * (long) Static118.anIntArrayArray17[1][local523] >> 16);
						}
						Static221.anIntArray504[local198] = local356;
						local102 = this.aClass175_1.method4737(arg0 + 1);
						local198++;
					}
					if (local198 >= arg0 - local185) {
						while (local198 < arg0) {
							local356 = 0;
							for (local523 = local198 + local185 - arg0; local523 < local185; local523++) {
								local356 += (int) ((long) Static221.anIntArray504[local198 + local185 - local523 - 1] * (long) Static118.anIntArrayArray17[0][local523] >> 16);
							}
							for (local523 = 0; local523 < local190; local523++) {
								local356 -= (int) ((long) Static221.anIntArray504[local198 - local523 - 1] * (long) Static118.anIntArrayArray17[1][local523] >> 16);
							}
							Static221.anIntArray504[local198] = local356;
							this.aClass175_1.method4737(arg0 + 1);
							local198++;
						}
						break;
					}
					local185 = this.aClass74_1.method1925(0, (float) local102 / 65536.0F);
					local190 = this.aClass74_1.method1925(1, (float) local102 / 65536.0F);
					local203 += 128;
				}
			}
		}
		for (local102 = 0; local102 < arg0; local102++) {
			if (Static221.anIntArray504[local102] < -32768) {
				Static221.anIntArray504[local102] = -32768;
			}
			if (Static221.anIntArray504[local102] > 32767) {
				Static221.anIntArray504[local102] = 32767;
			}
		}
		return Static221.anIntArray504;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(III)I")
	private int method3911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray503[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray501[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
