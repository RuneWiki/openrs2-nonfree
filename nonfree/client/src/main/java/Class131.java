import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class131 {

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "[I")
	private static int[] anIntArray413 = new int[32768];

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "[I")
	private static int[] anIntArray415;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "Lclient!cb;")
	private Class23 aClass23_1;

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "Lclient!cb;")
	private Class23 aClass23_2;

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "Lclient!cb;")
	private Class23 aClass23_3;

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "Lclient!cb;")
	private Class23 aClass23_4;

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "Lclient!cb;")
	private Class23 aClass23_5;

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "Lclient!cb;")
	private Class23 aClass23_6;

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "Lclient!pn;")
	private Class134 aClass134_1;

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "Lclient!cb;")
	private Class23 aClass23_7;

	@OriginalMember(owner = "client!ph", name = "r", descriptor = "Lclient!cb;")
	private Class23 aClass23_8;

	@OriginalMember(owner = "client!ph", name = "x", descriptor = "Lclient!cb;")
	private Class23 aClass23_9;

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
	public int anInt4575 = 0;

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
	public int anInt4577 = 500;

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
	private int anInt4576 = 100;

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "[I")
	private int[] anIntArray412 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "[I")
	private int[] anIntArray414 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
	private int anInt4578 = 0;

	@OriginalMember(owner = "client!ph", name = "y", descriptor = "[I")
	private int[] anIntArray422 = new int[] { 0, 0, 0, 0, 0 };

	static {
		@Pc(7) Random local7 = new Random(0L);
		@Pc(9) int local9;
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray413[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray415 = new int[32768];
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray415[local9] = (int) (Math.sin((double) local9 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)I")
	private int method3380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray415[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray413[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!qm;)V")
	public void method3381(@OriginalArg(0) Class1_Sub14 arg0) {
		this.aClass23_5 = new Class23();
		this.aClass23_5.method595(arg0);
		this.aClass23_8 = new Class23();
		this.aClass23_8.method595(arg0);
		@Pc(21) int local21 = arg0.method2199();
		if (local21 != 0) {
			arg0.anInt3000--;
			this.aClass23_3 = new Class23();
			this.aClass23_3.method595(arg0);
			this.aClass23_6 = new Class23();
			this.aClass23_6.method595(arg0);
		}
		local21 = arg0.method2199();
		if (local21 != 0) {
			arg0.anInt3000--;
			this.aClass23_4 = new Class23();
			this.aClass23_4.method595(arg0);
			this.aClass23_9 = new Class23();
			this.aClass23_9.method595(arg0);
		}
		local21 = arg0.method2199();
		if (local21 != 0) {
			arg0.anInt3000--;
			this.aClass23_1 = new Class23();
			this.aClass23_1.method595(arg0);
			this.aClass23_2 = new Class23();
			this.aClass23_2.method595(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(116) int local116 = arg0.method2187();
			if (local116 == 0) {
				break;
			}
			this.anIntArray414[local109] = local116;
			this.anIntArray412[local109] = arg0.method2195();
			this.anIntArray422[local109] = arg0.method2187();
		}
		this.anInt4578 = arg0.method2187();
		this.anInt4576 = arg0.method2187();
		this.anInt4577 = arg0.method2244();
		this.anInt4575 = arg0.method2244();
		this.aClass134_1 = new Class134();
		this.aClass23_7 = new Class23();
		this.aClass134_1.method3464(arg0, this.aClass23_7);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)[I")
	public int[] method3383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static319.method1425(Static212.anIntArray416, 0, arg0);
		if (arg1 < 10) {
			return Static212.anIntArray416;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass23_5.method593();
		this.aClass23_8.method593();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass23_3 != null) {
			this.aClass23_3.method593();
			this.aClass23_6.method593();
			local24 = (int) ((double) (this.aClass23_3.anInt714 - this.aClass23_3.anInt712) * 32.768D / local16);
			local26 = (int) ((double) this.aClass23_3.anInt712 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass23_4 != null) {
			this.aClass23_4.method593();
			this.aClass23_9.method593();
			local63 = (int) ((double) (this.aClass23_4.anInt714 - this.aClass23_4.anInt712) * 32.768D / local16);
			local65 = (int) ((double) this.aClass23_4.anInt712 * 32.768D / local16);
		}
		@Pc(102) int local102;
		for (local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray414[local102] != 0) {
				Static212.anIntArray419[local102] = 0;
				Static212.anIntArray421[local102] = (int) ((double) this.anIntArray422[local102] * local16);
				Static212.anIntArray417[local102] = (this.anIntArray414[local102] << 14) / 100;
				Static212.anIntArray420[local102] = (int) ((double) (this.aClass23_5.anInt714 - this.aClass23_5.anInt712) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray412[local102]) / local16);
				Static212.anIntArray418[local102] = (int) ((double) this.aClass23_5.anInt712 * 32.768D / local16);
			}
		}
		@Pc(185) int local185;
		@Pc(190) int local190;
		@Pc(198) int local198;
		@Pc(203) int local203;
		for (local102 = 0; local102 < arg0; local102++) {
			local185 = this.aClass23_5.method594(arg0);
			local190 = this.aClass23_8.method594(arg0);
			if (this.aClass23_3 != null) {
				local198 = this.aClass23_3.method594(arg0);
				local203 = this.aClass23_6.method594(arg0);
				local185 += this.method3380(local28, local203, this.aClass23_3.anInt715) >> 1;
				local28 += (local198 * local24 >> 16) + local26;
			}
			if (this.aClass23_4 != null) {
				local198 = this.aClass23_4.method594(arg0);
				local203 = this.aClass23_9.method594(arg0);
				local190 = local190 * ((this.method3380(local67, local203, this.aClass23_4.anInt715) >> 1) + 32768) >> 15;
				local67 += (local198 * local63 >> 16) + local65;
			}
			for (local198 = 0; local198 < 5; local198++) {
				if (this.anIntArray414[local198] != 0) {
					local203 = local102 + Static212.anIntArray421[local198];
					if (local203 < arg0) {
						Static212.anIntArray416[local203] += this.method3380(Static212.anIntArray419[local198], local190 * Static212.anIntArray417[local198] >> 15, this.aClass23_5.anInt715);
						Static212.anIntArray419[local198] += (local185 * Static212.anIntArray420[local198] >> 16) + Static212.anIntArray418[local198];
					}
				}
			}
		}
		@Pc(356) int local356;
		if (this.aClass23_1 != null) {
			this.aClass23_1.method593();
			this.aClass23_2.method593();
			local102 = 0;
			@Pc(341) boolean local341 = true;
			for (local198 = 0; local198 < arg0; local198++) {
				local203 = this.aClass23_1.method594(arg0);
				local356 = this.aClass23_2.method594(arg0);
				if (local341) {
					local185 = this.aClass23_1.anInt712 + ((this.aClass23_1.anInt714 - this.aClass23_1.anInt712) * local203 >> 8);
				} else {
					local185 = this.aClass23_1.anInt712 + ((this.aClass23_1.anInt714 - this.aClass23_1.anInt712) * local356 >> 8);
				}
				local102 += 256;
				if (local102 >= local185) {
					local102 = 0;
					local341 = !local341;
				}
				if (local341) {
					Static212.anIntArray416[local198] = 0;
				}
			}
		}
		if (this.anInt4578 > 0 && this.anInt4576 > 0) {
			local102 = (int) ((double) this.anInt4578 * local16);
			for (local185 = local102; local185 < arg0; local185++) {
				Static212.anIntArray416[local185] += Static212.anIntArray416[local185 - local102] * this.anInt4576 / 100;
			}
		}
		if (this.aClass134_1.anIntArray427[0] > 0 || this.aClass134_1.anIntArray427[1] > 0) {
			this.aClass23_7.method593();
			local102 = this.aClass23_7.method594(arg0 + 1);
			local185 = this.aClass134_1.method3465(0, (float) local102 / 65536.0F);
			local190 = this.aClass134_1.method3465(1, (float) local102 / 65536.0F);
			if (arg0 >= local185 + local190) {
				local198 = 0;
				local203 = local190;
				if (local190 > arg0 - local185) {
					local203 = arg0 - local185;
				}
				@Pc(523) int local523;
				while (local198 < local203) {
					local356 = (int) ((long) Static212.anIntArray416[local198 + local185] * (long) Static218.anInt4678 >> 16);
					for (local523 = 0; local523 < local185; local523++) {
						local356 += (int) ((long) Static212.anIntArray416[local198 + local185 - local523 - 1] * (long) Static218.anIntArrayArray60[0][local523] >> 16);
					}
					for (local523 = 0; local523 < local198; local523++) {
						local356 -= (int) ((long) Static212.anIntArray416[local198 - local523 - 1] * (long) Static218.anIntArrayArray60[1][local523] >> 16);
					}
					Static212.anIntArray416[local198] = local356;
					local102 = this.aClass23_7.method594(arg0 + 1);
					local198++;
				}
				local203 = 128;
				while (true) {
					if (local203 > arg0 - local185) {
						local203 = arg0 - local185;
					}
					while (local198 < local203) {
						local356 = (int) ((long) Static212.anIntArray416[local198 + local185] * (long) Static218.anInt4678 >> 16);
						for (local523 = 0; local523 < local185; local523++) {
							local356 += (int) ((long) Static212.anIntArray416[local198 + local185 - local523 - 1] * (long) Static218.anIntArrayArray60[0][local523] >> 16);
						}
						for (local523 = 0; local523 < local190; local523++) {
							local356 -= (int) ((long) Static212.anIntArray416[local198 - local523 - 1] * (long) Static218.anIntArrayArray60[1][local523] >> 16);
						}
						Static212.anIntArray416[local198] = local356;
						local102 = this.aClass23_7.method594(arg0 + 1);
						local198++;
					}
					if (local198 >= arg0 - local185) {
						while (local198 < arg0) {
							local356 = 0;
							for (local523 = local198 + local185 - arg0; local523 < local185; local523++) {
								local356 += (int) ((long) Static212.anIntArray416[local198 + local185 - local523 - 1] * (long) Static218.anIntArrayArray60[0][local523] >> 16);
							}
							for (local523 = 0; local523 < local190; local523++) {
								local356 -= (int) ((long) Static212.anIntArray416[local198 - local523 - 1] * (long) Static218.anIntArrayArray60[1][local523] >> 16);
							}
							Static212.anIntArray416[local198] = local356;
							this.aClass23_7.method594(arg0 + 1);
							local198++;
						}
						break;
					}
					local185 = this.aClass134_1.method3465(0, (float) local102 / 65536.0F);
					local190 = this.aClass134_1.method3465(1, (float) local102 / 65536.0F);
					local203 += 128;
				}
			}
		}
		for (local102 = 0; local102 < arg0; local102++) {
			if (Static212.anIntArray416[local102] < -32768) {
				Static212.anIntArray416[local102] = -32768;
			}
			if (Static212.anIntArray416[local102] > 32767) {
				Static212.anIntArray416[local102] = 32767;
			}
		}
		return Static212.anIntArray416;
	}
}
