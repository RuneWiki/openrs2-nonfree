import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class176 {

	@OriginalMember(owner = "client!uh", name = "s", descriptor = "[I")
	private static int[] anIntArray607 = new int[32768];

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "[I")
	private static int[] anIntArray602;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "Lclient!h;")
	private Class73 aClass73_1;

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "Lclient!h;")
	private Class73 aClass73_2;

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "Lclient!h;")
	private Class73 aClass73_3;

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "Lclient!h;")
	private Class73 aClass73_4;

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "Lclient!h;")
	private Class73 aClass73_5;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "Lclient!h;")
	private Class73 aClass73_6;

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "Lclient!h;")
	private Class73 aClass73_7;

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "Lclient!qo;")
	private Class149 aClass149_1;

	@OriginalMember(owner = "client!uh", name = "r", descriptor = "Lclient!h;")
	private Class73 aClass73_8;

	@OriginalMember(owner = "client!uh", name = "x", descriptor = "Lclient!h;")
	private Class73 aClass73_9;

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
	public int anInt5347 = 500;

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
	public int anInt5350 = 0;

	@OriginalMember(owner = "client!uh", name = "q", descriptor = "[I")
	private int[] anIntArray606 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!uh", name = "o", descriptor = "[I")
	private int[] anIntArray605 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
	private int anInt5348 = 0;

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "[I")
	private int[] anIntArray604 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
	private int anInt5349 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		@Pc(9) int local9;
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray607[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray602 = new int[32768];
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray602[local9] = (int) (Math.sin((double) local9 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!fd;)V")
	public void method4360(@OriginalArg(0) Class4_Sub10 arg0) {
		this.aClass73_7 = new Class73();
		this.aClass73_7.method1674(arg0);
		this.aClass73_4 = new Class73();
		this.aClass73_4.method1674(arg0);
		@Pc(21) int local21 = arg0.method4666();
		if (local21 != 0) {
			arg0.anInt5713--;
			this.aClass73_6 = new Class73();
			this.aClass73_6.method1674(arg0);
			this.aClass73_8 = new Class73();
			this.aClass73_8.method1674(arg0);
		}
		local21 = arg0.method4666();
		if (local21 != 0) {
			arg0.anInt5713--;
			this.aClass73_5 = new Class73();
			this.aClass73_5.method1674(arg0);
			this.aClass73_2 = new Class73();
			this.aClass73_2.method1674(arg0);
		}
		local21 = arg0.method4666();
		if (local21 != 0) {
			arg0.anInt5713--;
			this.aClass73_3 = new Class73();
			this.aClass73_3.method1674(arg0);
			this.aClass73_1 = new Class73();
			this.aClass73_1.method1674(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(116) int local116 = arg0.method4616();
			if (local116 == 0) {
				break;
			}
			this.anIntArray605[local109] = local116;
			this.anIntArray604[local109] = arg0.method4634();
			this.anIntArray606[local109] = arg0.method4616();
		}
		this.anInt5348 = arg0.method4616();
		this.anInt5349 = arg0.method4616();
		this.anInt5347 = arg0.method4653();
		this.anInt5350 = arg0.method4653();
		this.aClass149_1 = new Class149();
		this.aClass73_9 = new Class73();
		this.aClass149_1.method3679(arg0, this.aClass73_9);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)[I")
	public int[] method4362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static316.method76(Static283.anIntArray603, 0, arg0);
		if (arg1 < 10) {
			return Static283.anIntArray603;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass73_7.method1673();
		this.aClass73_4.method1673();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass73_6 != null) {
			this.aClass73_6.method1673();
			this.aClass73_8.method1673();
			local24 = (int) ((double) (this.aClass73_6.anInt2131 - this.aClass73_6.anInt2132) * 32.768D / local16);
			local26 = (int) ((double) this.aClass73_6.anInt2132 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass73_5 != null) {
			this.aClass73_5.method1673();
			this.aClass73_2.method1673();
			local63 = (int) ((double) (this.aClass73_5.anInt2131 - this.aClass73_5.anInt2132) * 32.768D / local16);
			local65 = (int) ((double) this.aClass73_5.anInt2132 * 32.768D / local16);
		}
		@Pc(102) int local102;
		for (local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray605[local102] != 0) {
				Static283.anIntArray611[local102] = 0;
				Static283.anIntArray609[local102] = (int) ((double) this.anIntArray606[local102] * local16);
				Static283.anIntArray610[local102] = (this.anIntArray605[local102] << 14) / 100;
				Static283.anIntArray612[local102] = (int) ((double) (this.aClass73_7.anInt2131 - this.aClass73_7.anInt2132) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray604[local102]) / local16);
				Static283.anIntArray608[local102] = (int) ((double) this.aClass73_7.anInt2132 * 32.768D / local16);
			}
		}
		@Pc(185) int local185;
		@Pc(190) int local190;
		@Pc(198) int local198;
		@Pc(203) int local203;
		for (local102 = 0; local102 < arg0; local102++) {
			local185 = this.aClass73_7.method1675(arg0);
			local190 = this.aClass73_4.method1675(arg0);
			if (this.aClass73_6 != null) {
				local198 = this.aClass73_6.method1675(arg0);
				local203 = this.aClass73_8.method1675(arg0);
				local185 += this.method4363(local28, local203, this.aClass73_6.anInt2133) >> 1;
				local28 += (local198 * local24 >> 16) + local26;
			}
			if (this.aClass73_5 != null) {
				local198 = this.aClass73_5.method1675(arg0);
				local203 = this.aClass73_2.method1675(arg0);
				local190 = local190 * ((this.method4363(local67, local203, this.aClass73_5.anInt2133) >> 1) + 32768) >> 15;
				local67 += (local198 * local63 >> 16) + local65;
			}
			for (local198 = 0; local198 < 5; local198++) {
				if (this.anIntArray605[local198] != 0) {
					local203 = local102 + Static283.anIntArray609[local198];
					if (local203 < arg0) {
						Static283.anIntArray603[local203] += this.method4363(Static283.anIntArray611[local198], local190 * Static283.anIntArray610[local198] >> 15, this.aClass73_7.anInt2133);
						Static283.anIntArray611[local198] += (local185 * Static283.anIntArray612[local198] >> 16) + Static283.anIntArray608[local198];
					}
				}
			}
		}
		@Pc(356) int local356;
		if (this.aClass73_3 != null) {
			this.aClass73_3.method1673();
			this.aClass73_1.method1673();
			local102 = 0;
			@Pc(341) boolean local341 = true;
			for (local198 = 0; local198 < arg0; local198++) {
				local203 = this.aClass73_3.method1675(arg0);
				local356 = this.aClass73_1.method1675(arg0);
				if (local341) {
					local185 = this.aClass73_3.anInt2132 + ((this.aClass73_3.anInt2131 - this.aClass73_3.anInt2132) * local203 >> 8);
				} else {
					local185 = this.aClass73_3.anInt2132 + ((this.aClass73_3.anInt2131 - this.aClass73_3.anInt2132) * local356 >> 8);
				}
				local102 += 256;
				if (local102 >= local185) {
					local102 = 0;
					local341 = !local341;
				}
				if (local341) {
					Static283.anIntArray603[local198] = 0;
				}
			}
		}
		if (this.anInt5348 > 0 && this.anInt5349 > 0) {
			local102 = (int) ((double) this.anInt5348 * local16);
			for (local185 = local102; local185 < arg0; local185++) {
				Static283.anIntArray603[local185] += Static283.anIntArray603[local185 - local102] * this.anInt5349 / 100;
			}
		}
		if (this.aClass149_1.anIntArray471[0] > 0 || this.aClass149_1.anIntArray471[1] > 0) {
			this.aClass73_9.method1673();
			local102 = this.aClass73_9.method1675(arg0 + 1);
			local185 = this.aClass149_1.method3677(0, (float) local102 / 65536.0F);
			local190 = this.aClass149_1.method3677(1, (float) local102 / 65536.0F);
			if (arg0 >= local185 + local190) {
				local198 = 0;
				local203 = local190;
				if (local190 > arg0 - local185) {
					local203 = arg0 - local185;
				}
				@Pc(523) int local523;
				while (local198 < local203) {
					local356 = (int) ((long) Static283.anIntArray603[local198 + local185] * (long) Static232.anInt4426 >> 16);
					for (local523 = 0; local523 < local185; local523++) {
						local356 += (int) ((long) Static283.anIntArray603[local198 + local185 - local523 - 1] * (long) Static232.anIntArrayArray38[0][local523] >> 16);
					}
					for (local523 = 0; local523 < local198; local523++) {
						local356 -= (int) ((long) Static283.anIntArray603[local198 - local523 - 1] * (long) Static232.anIntArrayArray38[1][local523] >> 16);
					}
					Static283.anIntArray603[local198] = local356;
					local102 = this.aClass73_9.method1675(arg0 + 1);
					local198++;
				}
				local203 = 128;
				while (true) {
					if (local203 > arg0 - local185) {
						local203 = arg0 - local185;
					}
					while (local198 < local203) {
						local356 = (int) ((long) Static283.anIntArray603[local198 + local185] * (long) Static232.anInt4426 >> 16);
						for (local523 = 0; local523 < local185; local523++) {
							local356 += (int) ((long) Static283.anIntArray603[local198 + local185 - local523 - 1] * (long) Static232.anIntArrayArray38[0][local523] >> 16);
						}
						for (local523 = 0; local523 < local190; local523++) {
							local356 -= (int) ((long) Static283.anIntArray603[local198 - local523 - 1] * (long) Static232.anIntArrayArray38[1][local523] >> 16);
						}
						Static283.anIntArray603[local198] = local356;
						local102 = this.aClass73_9.method1675(arg0 + 1);
						local198++;
					}
					if (local198 >= arg0 - local185) {
						while (local198 < arg0) {
							local356 = 0;
							for (local523 = local198 + local185 - arg0; local523 < local185; local523++) {
								local356 += (int) ((long) Static283.anIntArray603[local198 + local185 - local523 - 1] * (long) Static232.anIntArrayArray38[0][local523] >> 16);
							}
							for (local523 = 0; local523 < local190; local523++) {
								local356 -= (int) ((long) Static283.anIntArray603[local198 - local523 - 1] * (long) Static232.anIntArrayArray38[1][local523] >> 16);
							}
							Static283.anIntArray603[local198] = local356;
							this.aClass73_9.method1675(arg0 + 1);
							local198++;
						}
						break;
					}
					local185 = this.aClass149_1.method3677(0, (float) local102 / 65536.0F);
					local190 = this.aClass149_1.method3677(1, (float) local102 / 65536.0F);
					local203 += 128;
				}
			}
		}
		for (local102 = 0; local102 < arg0; local102++) {
			if (Static283.anIntArray603[local102] < -32768) {
				Static283.anIntArray603[local102] = -32768;
			}
			if (Static283.anIntArray603[local102] > 32767) {
				Static283.anIntArray603[local102] = 32767;
			}
		}
		return Static283.anIntArray603;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)I")
	private int method4363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray602[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray607[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
