import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class40 {

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "[I")
	private static int[] anIntArray72 = new int[32768];

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "[I")
	private static int[] anIntArray68;

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "Lclient!kd;")
	private Class94 aClass94_1;

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "Lclient!n;")
	private Class116 aClass116_1;

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "Lclient!kd;")
	private Class94 aClass94_2;

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "Lclient!kd;")
	private Class94 aClass94_3;

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "Lclient!kd;")
	private Class94 aClass94_4;

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "Lclient!kd;")
	private Class94 aClass94_5;

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "Lclient!kd;")
	private Class94 aClass94_6;

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "Lclient!kd;")
	private Class94 aClass94_7;

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "Lclient!kd;")
	private Class94 aClass94_8;

	@OriginalMember(owner = "client!dg", name = "s", descriptor = "Lclient!kd;")
	private Class94 aClass94_9;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
	private int anInt1076 = 100;

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
	private int anInt1077 = 0;

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "[I")
	private int[] anIntArray70 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "[I")
	private int[] anIntArray69 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!dg", name = "q", descriptor = "I")
	public int anInt1078 = 0;

	@OriginalMember(owner = "client!dg", name = "t", descriptor = "[I")
	private int[] anIntArray73 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
	public int anInt1079 = 500;

	static {
		@Pc(7) Random local7 = new Random(0L);
		@Pc(9) int local9;
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray72[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray68 = new int[32768];
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray68[local9] = (int) (Math.sin((double) local9 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!wm;)V")
	public void method844(@OriginalArg(0) Class2_Sub26 arg0) {
		this.aClass94_3 = new Class94();
		this.aClass94_3.method2283(arg0);
		this.aClass94_1 = new Class94();
		this.aClass94_1.method2283(arg0);
		@Pc(21) int local21 = arg0.method4261();
		if (local21 != 0) {
			arg0.anInt5328--;
			this.aClass94_8 = new Class94();
			this.aClass94_8.method2283(arg0);
			this.aClass94_6 = new Class94();
			this.aClass94_6.method2283(arg0);
		}
		local21 = arg0.method4261();
		if (local21 != 0) {
			arg0.anInt5328--;
			this.aClass94_2 = new Class94();
			this.aClass94_2.method2283(arg0);
			this.aClass94_9 = new Class94();
			this.aClass94_9.method2283(arg0);
		}
		local21 = arg0.method4261();
		if (local21 != 0) {
			arg0.anInt5328--;
			this.aClass94_7 = new Class94();
			this.aClass94_7.method2283(arg0);
			this.aClass94_4 = new Class94();
			this.aClass94_4.method2283(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(116) int local116 = arg0.method4217();
			if (local116 == 0) {
				break;
			}
			this.anIntArray69[local109] = local116;
			this.anIntArray70[local109] = arg0.method4250();
			this.anIntArray73[local109] = arg0.method4217();
		}
		this.anInt1077 = arg0.method4217();
		this.anInt1076 = arg0.method4217();
		this.anInt1079 = arg0.method4242();
		this.anInt1078 = arg0.method4242();
		this.aClass116_1 = new Class116();
		this.aClass94_5 = new Class94();
		this.aClass116_1.method2872(arg0, this.aClass94_5);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[I")
	public int[] method846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static301.method298(Static45.anIntArray71, 0, arg0);
		if (arg1 < 10) {
			return Static45.anIntArray71;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass94_3.method2286();
		this.aClass94_1.method2286();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass94_8 != null) {
			this.aClass94_8.method2286();
			this.aClass94_6.method2286();
			local24 = (int) ((double) (this.aClass94_8.anInt2678 - this.aClass94_8.anInt2679) * 32.768D / local16);
			local26 = (int) ((double) this.aClass94_8.anInt2679 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass94_2 != null) {
			this.aClass94_2.method2286();
			this.aClass94_9.method2286();
			local63 = (int) ((double) (this.aClass94_2.anInt2678 - this.aClass94_2.anInt2679) * 32.768D / local16);
			local65 = (int) ((double) this.aClass94_2.anInt2679 * 32.768D / local16);
		}
		@Pc(102) int local102;
		for (local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray69[local102] != 0) {
				Static45.anIntArray78[local102] = 0;
				Static45.anIntArray77[local102] = (int) ((double) this.anIntArray73[local102] * local16);
				Static45.anIntArray74[local102] = (this.anIntArray69[local102] << 14) / 100;
				Static45.anIntArray75[local102] = (int) ((double) (this.aClass94_3.anInt2678 - this.aClass94_3.anInt2679) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray70[local102]) / local16);
				Static45.anIntArray76[local102] = (int) ((double) this.aClass94_3.anInt2679 * 32.768D / local16);
			}
		}
		@Pc(185) int local185;
		@Pc(190) int local190;
		@Pc(198) int local198;
		@Pc(203) int local203;
		for (local102 = 0; local102 < arg0; local102++) {
			local185 = this.aClass94_3.method2285(arg0);
			local190 = this.aClass94_1.method2285(arg0);
			if (this.aClass94_8 != null) {
				local198 = this.aClass94_8.method2285(arg0);
				local203 = this.aClass94_6.method2285(arg0);
				local185 += this.method847(local28, local203, this.aClass94_8.anInt2677) >> 1;
				local28 += (local198 * local24 >> 16) + local26;
			}
			if (this.aClass94_2 != null) {
				local198 = this.aClass94_2.method2285(arg0);
				local203 = this.aClass94_9.method2285(arg0);
				local190 = local190 * ((this.method847(local67, local203, this.aClass94_2.anInt2677) >> 1) + 32768) >> 15;
				local67 += (local198 * local63 >> 16) + local65;
			}
			for (local198 = 0; local198 < 5; local198++) {
				if (this.anIntArray69[local198] != 0) {
					local203 = local102 + Static45.anIntArray77[local198];
					if (local203 < arg0) {
						Static45.anIntArray71[local203] += this.method847(Static45.anIntArray78[local198], local190 * Static45.anIntArray74[local198] >> 15, this.aClass94_3.anInt2677);
						Static45.anIntArray78[local198] += (local185 * Static45.anIntArray75[local198] >> 16) + Static45.anIntArray76[local198];
					}
				}
			}
		}
		@Pc(356) int local356;
		if (this.aClass94_7 != null) {
			this.aClass94_7.method2286();
			this.aClass94_4.method2286();
			local102 = 0;
			@Pc(341) boolean local341 = true;
			for (local198 = 0; local198 < arg0; local198++) {
				local203 = this.aClass94_7.method2285(arg0);
				local356 = this.aClass94_4.method2285(arg0);
				if (local341) {
					local185 = this.aClass94_7.anInt2679 + ((this.aClass94_7.anInt2678 - this.aClass94_7.anInt2679) * local203 >> 8);
				} else {
					local185 = this.aClass94_7.anInt2679 + ((this.aClass94_7.anInt2678 - this.aClass94_7.anInt2679) * local356 >> 8);
				}
				local102 += 256;
				if (local102 >= local185) {
					local102 = 0;
					local341 = !local341;
				}
				if (local341) {
					Static45.anIntArray71[local198] = 0;
				}
			}
		}
		if (this.anInt1077 > 0 && this.anInt1076 > 0) {
			local102 = (int) ((double) this.anInt1077 * local16);
			for (local185 = local102; local185 < arg0; local185++) {
				Static45.anIntArray71[local185] += Static45.anIntArray71[local185 - local102] * this.anInt1076 / 100;
			}
		}
		if (this.aClass116_1.anIntArray283[0] > 0 || this.aClass116_1.anIntArray283[1] > 0) {
			this.aClass94_5.method2286();
			local102 = this.aClass94_5.method2285(arg0 + 1);
			local185 = this.aClass116_1.method2873(0, (float) local102 / 65536.0F);
			local190 = this.aClass116_1.method2873(1, (float) local102 / 65536.0F);
			if (arg0 >= local185 + local190) {
				local198 = 0;
				local203 = local190;
				if (local190 > arg0 - local185) {
					local203 = arg0 - local185;
				}
				@Pc(523) int local523;
				while (local198 < local203) {
					local356 = (int) ((long) Static45.anIntArray71[local198 + local185] * (long) Static167.anInt3561 >> 16);
					for (local523 = 0; local523 < local185; local523++) {
						local356 += (int) ((long) Static45.anIntArray71[local198 + local185 - local523 - 1] * (long) Static167.anIntArrayArray30[0][local523] >> 16);
					}
					for (local523 = 0; local523 < local198; local523++) {
						local356 -= (int) ((long) Static45.anIntArray71[local198 - local523 - 1] * (long) Static167.anIntArrayArray30[1][local523] >> 16);
					}
					Static45.anIntArray71[local198] = local356;
					local102 = this.aClass94_5.method2285(arg0 + 1);
					local198++;
				}
				local203 = 128;
				while (true) {
					if (local203 > arg0 - local185) {
						local203 = arg0 - local185;
					}
					while (local198 < local203) {
						local356 = (int) ((long) Static45.anIntArray71[local198 + local185] * (long) Static167.anInt3561 >> 16);
						for (local523 = 0; local523 < local185; local523++) {
							local356 += (int) ((long) Static45.anIntArray71[local198 + local185 - local523 - 1] * (long) Static167.anIntArrayArray30[0][local523] >> 16);
						}
						for (local523 = 0; local523 < local190; local523++) {
							local356 -= (int) ((long) Static45.anIntArray71[local198 - local523 - 1] * (long) Static167.anIntArrayArray30[1][local523] >> 16);
						}
						Static45.anIntArray71[local198] = local356;
						local102 = this.aClass94_5.method2285(arg0 + 1);
						local198++;
					}
					if (local198 >= arg0 - local185) {
						while (local198 < arg0) {
							local356 = 0;
							for (local523 = local198 + local185 - arg0; local523 < local185; local523++) {
								local356 += (int) ((long) Static45.anIntArray71[local198 + local185 - local523 - 1] * (long) Static167.anIntArrayArray30[0][local523] >> 16);
							}
							for (local523 = 0; local523 < local190; local523++) {
								local356 -= (int) ((long) Static45.anIntArray71[local198 - local523 - 1] * (long) Static167.anIntArrayArray30[1][local523] >> 16);
							}
							Static45.anIntArray71[local198] = local356;
							this.aClass94_5.method2285(arg0 + 1);
							local198++;
						}
						break;
					}
					local185 = this.aClass116_1.method2873(0, (float) local102 / 65536.0F);
					local190 = this.aClass116_1.method2873(1, (float) local102 / 65536.0F);
					local203 += 128;
				}
			}
		}
		for (local102 = 0; local102 < arg0; local102++) {
			if (Static45.anIntArray71[local102] < -32768) {
				Static45.anIntArray71[local102] = -32768;
			}
			if (Static45.anIntArray71[local102] > 32767) {
				Static45.anIntArray71[local102] = 32767;
			}
		}
		return Static45.anIntArray71;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)I")
	private int method847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray68[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray72[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
