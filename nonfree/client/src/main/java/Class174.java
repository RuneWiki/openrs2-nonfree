import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class174 {

	@OriginalMember(owner = "client!to", name = "n", descriptor = "[I")
	private static int[] anIntArray446 = new int[32768];

	@OriginalMember(owner = "client!to", name = "f", descriptor = "[I")
	private static int[] anIntArray443;

	@OriginalMember(owner = "client!to", name = "b", descriptor = "Lclient!sh;")
	private Class162 aClass162_1;

	@OriginalMember(owner = "client!to", name = "c", descriptor = "Lclient!sh;")
	private Class162 aClass162_2;

	@OriginalMember(owner = "client!to", name = "g", descriptor = "Lclient!sh;")
	private Class162 aClass162_3;

	@OriginalMember(owner = "client!to", name = "h", descriptor = "Lclient!sh;")
	private Class162 aClass162_4;

	@OriginalMember(owner = "client!to", name = "k", descriptor = "Lclient!sh;")
	private Class162 aClass162_5;

	@OriginalMember(owner = "client!to", name = "o", descriptor = "Lclient!sh;")
	private Class162 aClass162_6;

	@OriginalMember(owner = "client!to", name = "p", descriptor = "Lclient!sh;")
	private Class162 aClass162_7;

	@OriginalMember(owner = "client!to", name = "r", descriptor = "Lclient!sh;")
	private Class162 aClass162_8;

	@OriginalMember(owner = "client!to", name = "v", descriptor = "Lclient!sh;")
	private Class162 aClass162_9;

	@OriginalMember(owner = "client!to", name = "y", descriptor = "Lclient!gd;")
	private Class55 aClass55_1;

	@OriginalMember(owner = "client!to", name = "e", descriptor = "I")
	public int anInt4969 = 500;

	@OriginalMember(owner = "client!to", name = "m", descriptor = "I")
	private int anInt4971 = 100;

	@OriginalMember(owner = "client!to", name = "j", descriptor = "[I")
	private int[] anIntArray444 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!to", name = "i", descriptor = "I")
	private int anInt4970 = 0;

	@OriginalMember(owner = "client!to", name = "l", descriptor = "[I")
	private int[] anIntArray445 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!to", name = "d", descriptor = "[I")
	private int[] anIntArray442 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!to", name = "w", descriptor = "I")
	public int anInt4972 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		@Pc(9) int local9;
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray446[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray443 = new int[32768];
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray443[local9] = (int) (Math.sin((double) local9 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(III)I")
	private int method4271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray443[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray446[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!lf;)V")
	public void method4272(@OriginalArg(0) Class1_Sub14 arg0) {
		this.aClass162_2 = new Class162();
		this.aClass162_2.method4059(arg0);
		this.aClass162_3 = new Class162();
		this.aClass162_3.method4059(arg0);
		@Pc(21) int local21 = arg0.method1378();
		if (local21 != 0) {
			arg0.anInt1480--;
			this.aClass162_7 = new Class162();
			this.aClass162_7.method4059(arg0);
			this.aClass162_8 = new Class162();
			this.aClass162_8.method4059(arg0);
		}
		local21 = arg0.method1378();
		if (local21 != 0) {
			arg0.anInt1480--;
			this.aClass162_5 = new Class162();
			this.aClass162_5.method4059(arg0);
			this.aClass162_1 = new Class162();
			this.aClass162_1.method4059(arg0);
		}
		local21 = arg0.method1378();
		if (local21 != 0) {
			arg0.anInt1480--;
			this.aClass162_9 = new Class162();
			this.aClass162_9.method4059(arg0);
			this.aClass162_6 = new Class162();
			this.aClass162_6.method4059(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(116) int local116 = arg0.method1362();
			if (local116 == 0) {
				break;
			}
			this.anIntArray444[local109] = local116;
			this.anIntArray442[local109] = arg0.method1358();
			this.anIntArray445[local109] = arg0.method1362();
		}
		this.anInt4970 = arg0.method1362();
		this.anInt4971 = arg0.method1362();
		this.anInt4969 = arg0.method1386();
		this.anInt4972 = arg0.method1386();
		this.aClass55_1 = new Class55();
		this.aClass162_4 = new Class162();
		this.aClass55_1.method1631(arg0, this.aClass162_4);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(II)[I")
	public int[] method4274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static319.method1770(Static276.anIntArray441, 0, arg0);
		if (arg1 < 10) {
			return Static276.anIntArray441;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass162_2.method4057();
		this.aClass162_3.method4057();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass162_7 != null) {
			this.aClass162_7.method4057();
			this.aClass162_8.method4057();
			local24 = (int) ((double) (this.aClass162_7.anInt4648 - this.aClass162_7.anInt4647) * 32.768D / local16);
			local26 = (int) ((double) this.aClass162_7.anInt4647 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass162_5 != null) {
			this.aClass162_5.method4057();
			this.aClass162_1.method4057();
			local63 = (int) ((double) (this.aClass162_5.anInt4648 - this.aClass162_5.anInt4647) * 32.768D / local16);
			local65 = (int) ((double) this.aClass162_5.anInt4647 * 32.768D / local16);
		}
		@Pc(102) int local102;
		for (local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray444[local102] != 0) {
				Static276.anIntArray447[local102] = 0;
				Static276.anIntArray449[local102] = (int) ((double) this.anIntArray445[local102] * local16);
				Static276.anIntArray448[local102] = (this.anIntArray444[local102] << 14) / 100;
				Static276.anIntArray451[local102] = (int) ((double) (this.aClass162_2.anInt4648 - this.aClass162_2.anInt4647) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray442[local102]) / local16);
				Static276.anIntArray450[local102] = (int) ((double) this.aClass162_2.anInt4647 * 32.768D / local16);
			}
		}
		@Pc(185) int local185;
		@Pc(190) int local190;
		@Pc(198) int local198;
		@Pc(203) int local203;
		for (local102 = 0; local102 < arg0; local102++) {
			local185 = this.aClass162_2.method4056(arg0);
			local190 = this.aClass162_3.method4056(arg0);
			if (this.aClass162_7 != null) {
				local198 = this.aClass162_7.method4056(arg0);
				local203 = this.aClass162_8.method4056(arg0);
				local185 += this.method4271(local28, local203, this.aClass162_7.anInt4650) >> 1;
				local28 += (local198 * local24 >> 16) + local26;
			}
			if (this.aClass162_5 != null) {
				local198 = this.aClass162_5.method4056(arg0);
				local203 = this.aClass162_1.method4056(arg0);
				local190 = local190 * ((this.method4271(local67, local203, this.aClass162_5.anInt4650) >> 1) + 32768) >> 15;
				local67 += (local198 * local63 >> 16) + local65;
			}
			for (local198 = 0; local198 < 5; local198++) {
				if (this.anIntArray444[local198] != 0) {
					local203 = local102 + Static276.anIntArray449[local198];
					if (local203 < arg0) {
						Static276.anIntArray441[local203] += this.method4271(Static276.anIntArray447[local198], local190 * Static276.anIntArray448[local198] >> 15, this.aClass162_2.anInt4650);
						Static276.anIntArray447[local198] += (local185 * Static276.anIntArray451[local198] >> 16) + Static276.anIntArray450[local198];
					}
				}
			}
		}
		@Pc(356) int local356;
		if (this.aClass162_9 != null) {
			this.aClass162_9.method4057();
			this.aClass162_6.method4057();
			local102 = 0;
			@Pc(341) boolean local341 = true;
			for (local198 = 0; local198 < arg0; local198++) {
				local203 = this.aClass162_9.method4056(arg0);
				local356 = this.aClass162_6.method4056(arg0);
				if (local341) {
					local185 = this.aClass162_9.anInt4647 + ((this.aClass162_9.anInt4648 - this.aClass162_9.anInt4647) * local203 >> 8);
				} else {
					local185 = this.aClass162_9.anInt4647 + ((this.aClass162_9.anInt4648 - this.aClass162_9.anInt4647) * local356 >> 8);
				}
				local102 += 256;
				if (local102 >= local185) {
					local102 = 0;
					local341 = !local341;
				}
				if (local341) {
					Static276.anIntArray441[local198] = 0;
				}
			}
		}
		if (this.anInt4970 > 0 && this.anInt4971 > 0) {
			local102 = (int) ((double) this.anInt4970 * local16);
			for (local185 = local102; local185 < arg0; local185++) {
				Static276.anIntArray441[local185] += Static276.anIntArray441[local185 - local102] * this.anInt4971 / 100;
			}
		}
		if (this.aClass55_1.anIntArray156[0] > 0 || this.aClass55_1.anIntArray156[1] > 0) {
			this.aClass162_4.method4057();
			local102 = this.aClass162_4.method4056(arg0 + 1);
			local185 = this.aClass55_1.method1629(0, (float) local102 / 65536.0F);
			local190 = this.aClass55_1.method1629(1, (float) local102 / 65536.0F);
			if (arg0 >= local185 + local190) {
				local198 = 0;
				local203 = local190;
				if (local190 > arg0 - local185) {
					local203 = arg0 - local185;
				}
				@Pc(523) int local523;
				while (local198 < local203) {
					local356 = (int) ((long) Static276.anIntArray441[local198 + local185] * (long) Static89.anInt1730 >> 16);
					for (local523 = 0; local523 < local185; local523++) {
						local356 += (int) ((long) Static276.anIntArray441[local198 + local185 - local523 - 1] * (long) Static89.anIntArrayArray16[0][local523] >> 16);
					}
					for (local523 = 0; local523 < local198; local523++) {
						local356 -= (int) ((long) Static276.anIntArray441[local198 - local523 - 1] * (long) Static89.anIntArrayArray16[1][local523] >> 16);
					}
					Static276.anIntArray441[local198] = local356;
					local102 = this.aClass162_4.method4056(arg0 + 1);
					local198++;
				}
				local203 = 128;
				while (true) {
					if (local203 > arg0 - local185) {
						local203 = arg0 - local185;
					}
					while (local198 < local203) {
						local356 = (int) ((long) Static276.anIntArray441[local198 + local185] * (long) Static89.anInt1730 >> 16);
						for (local523 = 0; local523 < local185; local523++) {
							local356 += (int) ((long) Static276.anIntArray441[local198 + local185 - local523 - 1] * (long) Static89.anIntArrayArray16[0][local523] >> 16);
						}
						for (local523 = 0; local523 < local190; local523++) {
							local356 -= (int) ((long) Static276.anIntArray441[local198 - local523 - 1] * (long) Static89.anIntArrayArray16[1][local523] >> 16);
						}
						Static276.anIntArray441[local198] = local356;
						local102 = this.aClass162_4.method4056(arg0 + 1);
						local198++;
					}
					if (local198 >= arg0 - local185) {
						while (local198 < arg0) {
							local356 = 0;
							for (local523 = local198 + local185 - arg0; local523 < local185; local523++) {
								local356 += (int) ((long) Static276.anIntArray441[local198 + local185 - local523 - 1] * (long) Static89.anIntArrayArray16[0][local523] >> 16);
							}
							for (local523 = 0; local523 < local190; local523++) {
								local356 -= (int) ((long) Static276.anIntArray441[local198 - local523 - 1] * (long) Static89.anIntArrayArray16[1][local523] >> 16);
							}
							Static276.anIntArray441[local198] = local356;
							this.aClass162_4.method4056(arg0 + 1);
							local198++;
						}
						break;
					}
					local185 = this.aClass55_1.method1629(0, (float) local102 / 65536.0F);
					local190 = this.aClass55_1.method1629(1, (float) local102 / 65536.0F);
					local203 += 128;
				}
			}
		}
		for (local102 = 0; local102 < arg0; local102++) {
			if (Static276.anIntArray441[local102] < -32768) {
				Static276.anIntArray441[local102] = -32768;
			}
			if (Static276.anIntArray441[local102] > 32767) {
				Static276.anIntArray441[local102] = 32767;
			}
		}
		return Static276.anIntArray441;
	}
}
