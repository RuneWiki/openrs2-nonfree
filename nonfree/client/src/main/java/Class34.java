import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class34 {

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "[I")
	private static int[] anIntArray64 = new int[32768];

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "[I")
	private static int[] anIntArray67;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "Lclient!gn;")
	private Class67 aClass67_1;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Lclient!gn;")
	private Class67 aClass67_2;

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "Lclient!gn;")
	private Class67 aClass67_3;

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "Lclient!uf;")
	private Class175 aClass175_1;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "Lclient!gn;")
	private Class67 aClass67_4;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "Lclient!gn;")
	private Class67 aClass67_5;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "Lclient!gn;")
	private Class67 aClass67_6;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "Lclient!gn;")
	private Class67 aClass67_7;

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "Lclient!gn;")
	private Class67 aClass67_8;

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "Lclient!gn;")
	private Class67 aClass67_9;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
	public int anInt830 = 0;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "[I")
	private int[] anIntArray63 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
	private int anInt831 = 100;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "[I")
	private int[] anIntArray66 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "[I")
	private int[] anIntArray68 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
	public int anInt832 = 500;

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
	private int anInt833 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		@Pc(9) int local9;
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray64[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray67 = new int[32768];
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray67[local9] = (int) (Math.sin((double) local9 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!sb;)V")
	public void method754(@OriginalArg(0) Class1_Sub14 arg0) {
		this.aClass67_9 = new Class67();
		this.aClass67_9.method1380(arg0);
		this.aClass67_5 = new Class67();
		this.aClass67_5.method1380(arg0);
		@Pc(21) int local21 = arg0.method2595();
		if (local21 != 0) {
			arg0.anInt3290--;
			this.aClass67_3 = new Class67();
			this.aClass67_3.method1380(arg0);
			this.aClass67_6 = new Class67();
			this.aClass67_6.method1380(arg0);
		}
		local21 = arg0.method2595();
		if (local21 != 0) {
			arg0.anInt3290--;
			this.aClass67_2 = new Class67();
			this.aClass67_2.method1380(arg0);
			this.aClass67_8 = new Class67();
			this.aClass67_8.method1380(arg0);
		}
		local21 = arg0.method2595();
		if (local21 != 0) {
			arg0.anInt3290--;
			this.aClass67_7 = new Class67();
			this.aClass67_7.method1380(arg0);
			this.aClass67_1 = new Class67();
			this.aClass67_1.method1380(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(116) int local116 = arg0.method2648();
			if (local116 == 0) {
				break;
			}
			this.anIntArray68[local109] = local116;
			this.anIntArray63[local109] = arg0.method2590();
			this.anIntArray66[local109] = arg0.method2648();
		}
		this.anInt833 = arg0.method2648();
		this.anInt831 = arg0.method2648();
		this.anInt832 = arg0.method2593();
		this.anInt830 = arg0.method2593();
		this.aClass175_1 = new Class175();
		this.aClass67_4 = new Class67();
		this.aClass175_1.method4227(arg0, this.aClass67_4);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)[I")
	public int[] method755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static319.method509(Static42.anIntArray65, 0, arg0);
		if (arg1 < 10) {
			return Static42.anIntArray65;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass67_9.method1381();
		this.aClass67_5.method1381();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass67_3 != null) {
			this.aClass67_3.method1381();
			this.aClass67_6.method1381();
			local24 = (int) ((double) (this.aClass67_3.anInt1773 - this.aClass67_3.anInt1772) * 32.768D / local16);
			local26 = (int) ((double) this.aClass67_3.anInt1772 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass67_2 != null) {
			this.aClass67_2.method1381();
			this.aClass67_8.method1381();
			local63 = (int) ((double) (this.aClass67_2.anInt1773 - this.aClass67_2.anInt1772) * 32.768D / local16);
			local65 = (int) ((double) this.aClass67_2.anInt1772 * 32.768D / local16);
		}
		@Pc(102) int local102;
		for (local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray68[local102] != 0) {
				Static42.anIntArray71[local102] = 0;
				Static42.anIntArray69[local102] = (int) ((double) this.anIntArray66[local102] * local16);
				Static42.anIntArray72[local102] = (this.anIntArray68[local102] << 14) / 100;
				Static42.anIntArray73[local102] = (int) ((double) (this.aClass67_9.anInt1773 - this.aClass67_9.anInt1772) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray63[local102]) / local16);
				Static42.anIntArray70[local102] = (int) ((double) this.aClass67_9.anInt1772 * 32.768D / local16);
			}
		}
		@Pc(185) int local185;
		@Pc(190) int local190;
		@Pc(198) int local198;
		@Pc(203) int local203;
		for (local102 = 0; local102 < arg0; local102++) {
			local185 = this.aClass67_9.method1382(arg0);
			local190 = this.aClass67_5.method1382(arg0);
			if (this.aClass67_3 != null) {
				local198 = this.aClass67_3.method1382(arg0);
				local203 = this.aClass67_6.method1382(arg0);
				local185 += this.method756(local28, local203, this.aClass67_3.anInt1775) >> 1;
				local28 += (local198 * local24 >> 16) + local26;
			}
			if (this.aClass67_2 != null) {
				local198 = this.aClass67_2.method1382(arg0);
				local203 = this.aClass67_8.method1382(arg0);
				local190 = local190 * ((this.method756(local67, local203, this.aClass67_2.anInt1775) >> 1) + 32768) >> 15;
				local67 += (local198 * local63 >> 16) + local65;
			}
			for (local198 = 0; local198 < 5; local198++) {
				if (this.anIntArray68[local198] != 0) {
					local203 = local102 + Static42.anIntArray69[local198];
					if (local203 < arg0) {
						Static42.anIntArray65[local203] += this.method756(Static42.anIntArray71[local198], local190 * Static42.anIntArray72[local198] >> 15, this.aClass67_9.anInt1775);
						Static42.anIntArray71[local198] += (local185 * Static42.anIntArray73[local198] >> 16) + Static42.anIntArray70[local198];
					}
				}
			}
		}
		@Pc(356) int local356;
		if (this.aClass67_7 != null) {
			this.aClass67_7.method1381();
			this.aClass67_1.method1381();
			local102 = 0;
			@Pc(341) boolean local341 = true;
			for (local198 = 0; local198 < arg0; local198++) {
				local203 = this.aClass67_7.method1382(arg0);
				local356 = this.aClass67_1.method1382(arg0);
				if (local341) {
					local185 = this.aClass67_7.anInt1772 + ((this.aClass67_7.anInt1773 - this.aClass67_7.anInt1772) * local203 >> 8);
				} else {
					local185 = this.aClass67_7.anInt1772 + ((this.aClass67_7.anInt1773 - this.aClass67_7.anInt1772) * local356 >> 8);
				}
				local102 += 256;
				if (local102 >= local185) {
					local102 = 0;
					local341 = !local341;
				}
				if (local341) {
					Static42.anIntArray65[local198] = 0;
				}
			}
		}
		if (this.anInt833 > 0 && this.anInt831 > 0) {
			local102 = (int) ((double) this.anInt833 * local16);
			for (local185 = local102; local185 < arg0; local185++) {
				Static42.anIntArray65[local185] += Static42.anIntArray65[local185 - local102] * this.anInt831 / 100;
			}
		}
		if (this.aClass175_1.anIntArray496[0] > 0 || this.aClass175_1.anIntArray496[1] > 0) {
			this.aClass67_4.method1381();
			local102 = this.aClass67_4.method1382(arg0 + 1);
			local185 = this.aClass175_1.method4228(0, (float) local102 / 65536.0F);
			local190 = this.aClass175_1.method4228(1, (float) local102 / 65536.0F);
			if (arg0 >= local185 + local190) {
				local198 = 0;
				local203 = local190;
				if (local190 > arg0 - local185) {
					local203 = arg0 - local185;
				}
				@Pc(523) int local523;
				while (local198 < local203) {
					local356 = (int) ((long) Static42.anIntArray65[local198 + local185] * (long) Static284.anInt5410 >> 16);
					for (local523 = 0; local523 < local185; local523++) {
						local356 += (int) ((long) Static42.anIntArray65[local198 + local185 - local523 - 1] * (long) Static284.anIntArrayArray44[0][local523] >> 16);
					}
					for (local523 = 0; local523 < local198; local523++) {
						local356 -= (int) ((long) Static42.anIntArray65[local198 - local523 - 1] * (long) Static284.anIntArrayArray44[1][local523] >> 16);
					}
					Static42.anIntArray65[local198] = local356;
					local102 = this.aClass67_4.method1382(arg0 + 1);
					local198++;
				}
				local203 = 128;
				while (true) {
					if (local203 > arg0 - local185) {
						local203 = arg0 - local185;
					}
					while (local198 < local203) {
						local356 = (int) ((long) Static42.anIntArray65[local198 + local185] * (long) Static284.anInt5410 >> 16);
						for (local523 = 0; local523 < local185; local523++) {
							local356 += (int) ((long) Static42.anIntArray65[local198 + local185 - local523 - 1] * (long) Static284.anIntArrayArray44[0][local523] >> 16);
						}
						for (local523 = 0; local523 < local190; local523++) {
							local356 -= (int) ((long) Static42.anIntArray65[local198 - local523 - 1] * (long) Static284.anIntArrayArray44[1][local523] >> 16);
						}
						Static42.anIntArray65[local198] = local356;
						local102 = this.aClass67_4.method1382(arg0 + 1);
						local198++;
					}
					if (local198 >= arg0 - local185) {
						while (local198 < arg0) {
							local356 = 0;
							for (local523 = local198 + local185 - arg0; local523 < local185; local523++) {
								local356 += (int) ((long) Static42.anIntArray65[local198 + local185 - local523 - 1] * (long) Static284.anIntArrayArray44[0][local523] >> 16);
							}
							for (local523 = 0; local523 < local190; local523++) {
								local356 -= (int) ((long) Static42.anIntArray65[local198 - local523 - 1] * (long) Static284.anIntArrayArray44[1][local523] >> 16);
							}
							Static42.anIntArray65[local198] = local356;
							this.aClass67_4.method1382(arg0 + 1);
							local198++;
						}
						break;
					}
					local185 = this.aClass175_1.method4228(0, (float) local102 / 65536.0F);
					local190 = this.aClass175_1.method4228(1, (float) local102 / 65536.0F);
					local203 += 128;
				}
			}
		}
		for (local102 = 0; local102 < arg0; local102++) {
			if (Static42.anIntArray65[local102] < -32768) {
				Static42.anIntArray65[local102] = -32768;
			}
			if (Static42.anIntArray65[local102] > 32767) {
				Static42.anIntArray65[local102] = 32767;
			}
		}
		return Static42.anIntArray65;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)I")
	private int method756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray67[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray64[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
