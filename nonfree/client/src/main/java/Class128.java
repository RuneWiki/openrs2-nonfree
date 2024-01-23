import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class128 {

	@OriginalMember(owner = "client!pa", name = "t", descriptor = "[I")
	private static int[] anIntArray329 = new int[32768];

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "[I")
	private static int[] anIntArray325;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Lclient!i;")
	private Class71 aClass71_1;

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "Lclient!i;")
	private Class71 aClass71_2;

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "Lclient!i;")
	private Class71 aClass71_3;

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "Lclient!i;")
	private Class71 aClass71_4;

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "Lclient!i;")
	private Class71 aClass71_5;

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "Lclient!i;")
	private Class71 aClass71_6;

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "Lclient!i;")
	private Class71 aClass71_7;

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "Lclient!i;")
	private Class71 aClass71_8;

	@OriginalMember(owner = "client!pa", name = "q", descriptor = "Lclient!mf;")
	private Class108 aClass108_1;

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "Lclient!i;")
	private Class71 aClass71_9;

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
	public int anInt4024 = 500;

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
	private int anInt4025 = 0;

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "[I")
	private int[] anIntArray327 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "[I")
	private int[] anIntArray326 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
	private int anInt4026 = 100;

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "[I")
	private int[] anIntArray328 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
	public int anInt4027 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		@Pc(9) int local9;
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray329[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray325 = new int[32768];
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray325[local9] = (int) (Math.sin((double) local9 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!pi;)V")
	public void method3252(@OriginalArg(0) Class4_Sub24 arg0) {
		this.aClass71_6 = new Class71();
		this.aClass71_6.method1849(arg0);
		this.aClass71_4 = new Class71();
		this.aClass71_4.method1849(arg0);
		@Pc(21) int local21 = arg0.method3110();
		if (local21 != 0) {
			arg0.anInt3822--;
			this.aClass71_9 = new Class71();
			this.aClass71_9.method1849(arg0);
			this.aClass71_7 = new Class71();
			this.aClass71_7.method1849(arg0);
		}
		local21 = arg0.method3110();
		if (local21 != 0) {
			arg0.anInt3822--;
			this.aClass71_8 = new Class71();
			this.aClass71_8.method1849(arg0);
			this.aClass71_1 = new Class71();
			this.aClass71_1.method1849(arg0);
		}
		local21 = arg0.method3110();
		if (local21 != 0) {
			arg0.anInt3822--;
			this.aClass71_3 = new Class71();
			this.aClass71_3.method1849(arg0);
			this.aClass71_5 = new Class71();
			this.aClass71_5.method1849(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(116) int local116 = arg0.method3060();
			if (local116 == 0) {
				break;
			}
			this.anIntArray327[local109] = local116;
			this.anIntArray328[local109] = arg0.method3067();
			this.anIntArray326[local109] = arg0.method3060();
		}
		this.anInt4025 = arg0.method3060();
		this.anInt4026 = arg0.method3060();
		this.anInt4024 = arg0.method3085();
		this.anInt4027 = arg0.method3085();
		this.aClass108_1 = new Class108();
		this.aClass71_2 = new Class71();
		this.aClass108_1.method2638(arg0, this.aClass71_2);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)I")
	private int method3253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray325[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray329[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)[I")
	public int[] method3254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static317.method3200(Static203.anIntArray324, 0, arg0);
		if (arg1 < 10) {
			return Static203.anIntArray324;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass71_6.method1847();
		this.aClass71_4.method1847();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass71_9 != null) {
			this.aClass71_9.method1847();
			this.aClass71_7.method1847();
			local24 = (int) ((double) (this.aClass71_9.anInt2169 - this.aClass71_9.anInt2168) * 32.768D / local16);
			local26 = (int) ((double) this.aClass71_9.anInt2168 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass71_8 != null) {
			this.aClass71_8.method1847();
			this.aClass71_1.method1847();
			local63 = (int) ((double) (this.aClass71_8.anInt2169 - this.aClass71_8.anInt2168) * 32.768D / local16);
			local65 = (int) ((double) this.aClass71_8.anInt2168 * 32.768D / local16);
		}
		@Pc(102) int local102;
		for (local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray327[local102] != 0) {
				Static203.anIntArray331[local102] = 0;
				Static203.anIntArray330[local102] = (int) ((double) this.anIntArray326[local102] * local16);
				Static203.anIntArray334[local102] = (this.anIntArray327[local102] << 14) / 100;
				Static203.anIntArray332[local102] = (int) ((double) (this.aClass71_6.anInt2169 - this.aClass71_6.anInt2168) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray328[local102]) / local16);
				Static203.anIntArray333[local102] = (int) ((double) this.aClass71_6.anInt2168 * 32.768D / local16);
			}
		}
		@Pc(185) int local185;
		@Pc(190) int local190;
		@Pc(198) int local198;
		@Pc(203) int local203;
		for (local102 = 0; local102 < arg0; local102++) {
			local185 = this.aClass71_6.method1848(arg0);
			local190 = this.aClass71_4.method1848(arg0);
			if (this.aClass71_9 != null) {
				local198 = this.aClass71_9.method1848(arg0);
				local203 = this.aClass71_7.method1848(arg0);
				local185 += this.method3253(local28, local203, this.aClass71_9.anInt2167) >> 1;
				local28 += (local198 * local24 >> 16) + local26;
			}
			if (this.aClass71_8 != null) {
				local198 = this.aClass71_8.method1848(arg0);
				local203 = this.aClass71_1.method1848(arg0);
				local190 = local190 * ((this.method3253(local67, local203, this.aClass71_8.anInt2167) >> 1) + 32768) >> 15;
				local67 += (local198 * local63 >> 16) + local65;
			}
			for (local198 = 0; local198 < 5; local198++) {
				if (this.anIntArray327[local198] != 0) {
					local203 = local102 + Static203.anIntArray330[local198];
					if (local203 < arg0) {
						Static203.anIntArray324[local203] += this.method3253(Static203.anIntArray331[local198], local190 * Static203.anIntArray334[local198] >> 15, this.aClass71_6.anInt2167);
						Static203.anIntArray331[local198] += (local185 * Static203.anIntArray332[local198] >> 16) + Static203.anIntArray333[local198];
					}
				}
			}
		}
		@Pc(356) int local356;
		if (this.aClass71_3 != null) {
			this.aClass71_3.method1847();
			this.aClass71_5.method1847();
			local102 = 0;
			@Pc(341) boolean local341 = true;
			for (local198 = 0; local198 < arg0; local198++) {
				local203 = this.aClass71_3.method1848(arg0);
				local356 = this.aClass71_5.method1848(arg0);
				if (local341) {
					local185 = this.aClass71_3.anInt2168 + ((this.aClass71_3.anInt2169 - this.aClass71_3.anInt2168) * local203 >> 8);
				} else {
					local185 = this.aClass71_3.anInt2168 + ((this.aClass71_3.anInt2169 - this.aClass71_3.anInt2168) * local356 >> 8);
				}
				local102 += 256;
				if (local102 >= local185) {
					local102 = 0;
					local341 = !local341;
				}
				if (local341) {
					Static203.anIntArray324[local198] = 0;
				}
			}
		}
		if (this.anInt4025 > 0 && this.anInt4026 > 0) {
			local102 = (int) ((double) this.anInt4025 * local16);
			for (local185 = local102; local185 < arg0; local185++) {
				Static203.anIntArray324[local185] += Static203.anIntArray324[local185 - local102] * this.anInt4026 / 100;
			}
		}
		if (this.aClass108_1.anIntArray278[0] > 0 || this.aClass108_1.anIntArray278[1] > 0) {
			this.aClass71_2.method1847();
			local102 = this.aClass71_2.method1848(arg0 + 1);
			local185 = this.aClass108_1.method2640(0, (float) local102 / 65536.0F);
			local190 = this.aClass108_1.method2640(1, (float) local102 / 65536.0F);
			if (arg0 >= local185 + local190) {
				local198 = 0;
				local203 = local190;
				if (local190 > arg0 - local185) {
					local203 = arg0 - local185;
				}
				@Pc(523) int local523;
				while (local198 < local203) {
					local356 = (int) ((long) Static203.anIntArray324[local198 + local185] * (long) Static166.anInt3327 >> 16);
					for (local523 = 0; local523 < local185; local523++) {
						local356 += (int) ((long) Static203.anIntArray324[local198 + local185 - local523 - 1] * (long) Static166.anIntArrayArray19[0][local523] >> 16);
					}
					for (local523 = 0; local523 < local198; local523++) {
						local356 -= (int) ((long) Static203.anIntArray324[local198 - local523 - 1] * (long) Static166.anIntArrayArray19[1][local523] >> 16);
					}
					Static203.anIntArray324[local198] = local356;
					local102 = this.aClass71_2.method1848(arg0 + 1);
					local198++;
				}
				local203 = 128;
				while (true) {
					if (local203 > arg0 - local185) {
						local203 = arg0 - local185;
					}
					while (local198 < local203) {
						local356 = (int) ((long) Static203.anIntArray324[local198 + local185] * (long) Static166.anInt3327 >> 16);
						for (local523 = 0; local523 < local185; local523++) {
							local356 += (int) ((long) Static203.anIntArray324[local198 + local185 - local523 - 1] * (long) Static166.anIntArrayArray19[0][local523] >> 16);
						}
						for (local523 = 0; local523 < local190; local523++) {
							local356 -= (int) ((long) Static203.anIntArray324[local198 - local523 - 1] * (long) Static166.anIntArrayArray19[1][local523] >> 16);
						}
						Static203.anIntArray324[local198] = local356;
						local102 = this.aClass71_2.method1848(arg0 + 1);
						local198++;
					}
					if (local198 >= arg0 - local185) {
						while (local198 < arg0) {
							local356 = 0;
							for (local523 = local198 + local185 - arg0; local523 < local185; local523++) {
								local356 += (int) ((long) Static203.anIntArray324[local198 + local185 - local523 - 1] * (long) Static166.anIntArrayArray19[0][local523] >> 16);
							}
							for (local523 = 0; local523 < local190; local523++) {
								local356 -= (int) ((long) Static203.anIntArray324[local198 - local523 - 1] * (long) Static166.anIntArrayArray19[1][local523] >> 16);
							}
							Static203.anIntArray324[local198] = local356;
							this.aClass71_2.method1848(arg0 + 1);
							local198++;
						}
						break;
					}
					local185 = this.aClass108_1.method2640(0, (float) local102 / 65536.0F);
					local190 = this.aClass108_1.method2640(1, (float) local102 / 65536.0F);
					local203 += 128;
				}
			}
		}
		for (local102 = 0; local102 < arg0; local102++) {
			if (Static203.anIntArray324[local102] < -32768) {
				Static203.anIntArray324[local102] = -32768;
			}
			if (Static203.anIntArray324[local102] > 32767) {
				Static203.anIntArray324[local102] = 32767;
			}
		}
		return Static203.anIntArray324;
	}
}
