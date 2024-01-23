import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class48 {

	@OriginalMember(owner = "client!eo", name = "p", descriptor = "[I")
	private static int[] anIntArray122 = new int[32768];

	@OriginalMember(owner = "client!eo", name = "o", descriptor = "[I")
	private static int[] anIntArray121;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "Lclient!dn;")
	private Class38 aClass38_1;

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "Lclient!dn;")
	private Class38 aClass38_2;

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "Lclient!dn;")
	private Class38 aClass38_3;

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "Lclient!dn;")
	private Class38 aClass38_4;

	@OriginalMember(owner = "client!eo", name = "i", descriptor = "Lclient!dn;")
	private Class38 aClass38_5;

	@OriginalMember(owner = "client!eo", name = "k", descriptor = "Lclient!hf;")
	private Class71 aClass71_1;

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "Lclient!dn;")
	private Class38 aClass38_6;

	@OriginalMember(owner = "client!eo", name = "r", descriptor = "Lclient!dn;")
	private Class38 aClass38_7;

	@OriginalMember(owner = "client!eo", name = "v", descriptor = "Lclient!dn;")
	private Class38 aClass38_8;

	@OriginalMember(owner = "client!eo", name = "x", descriptor = "Lclient!dn;")
	private Class38 aClass38_9;

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "[I")
	private int[] anIntArray118 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "[I")
	private int[] anIntArray120 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
	private int anInt1325 = 0;

	@OriginalMember(owner = "client!eo", name = "n", descriptor = "I")
	public int anInt1327 = 500;

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
	public int anInt1324 = 0;

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "[I")
	private int[] anIntArray119 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
	private int anInt1326 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		@Pc(9) int local9;
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray122[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray121 = new int[32768];
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray121[local9] = (int) (Math.sin((double) local9 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)I")
	private int method1103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray121[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray122[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!ug;)V")
	public void method1104(@OriginalArg(0) Class3_Sub26 arg0) {
		this.aClass38_2 = new Class38();
		this.aClass38_2.method948(arg0);
		this.aClass38_5 = new Class38();
		this.aClass38_5.method948(arg0);
		@Pc(21) int local21 = arg0.method3915();
		if (local21 != 0) {
			arg0.anInt4615--;
			this.aClass38_7 = new Class38();
			this.aClass38_7.method948(arg0);
			this.aClass38_1 = new Class38();
			this.aClass38_1.method948(arg0);
		}
		local21 = arg0.method3915();
		if (local21 != 0) {
			arg0.anInt4615--;
			this.aClass38_6 = new Class38();
			this.aClass38_6.method948(arg0);
			this.aClass38_8 = new Class38();
			this.aClass38_8.method948(arg0);
		}
		local21 = arg0.method3915();
		if (local21 != 0) {
			arg0.anInt4615--;
			this.aClass38_4 = new Class38();
			this.aClass38_4.method948(arg0);
			this.aClass38_3 = new Class38();
			this.aClass38_3.method948(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(116) int local116 = arg0.method3904();
			if (local116 == 0) {
				break;
			}
			this.anIntArray120[local109] = local116;
			this.anIntArray119[local109] = arg0.method3937();
			this.anIntArray118[local109] = arg0.method3904();
		}
		this.anInt1325 = arg0.method3904();
		this.anInt1326 = arg0.method3904();
		this.anInt1327 = arg0.method3948();
		this.anInt1324 = arg0.method3948();
		this.aClass71_1 = new Class71();
		this.aClass38_9 = new Class38();
		this.aClass71_1.method1692(arg0, this.aClass38_9);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)[I")
	public int[] method1105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static326.method4266(Static72.anIntArray123, 0, arg0);
		if (arg1 < 10) {
			return Static72.anIntArray123;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass38_2.method950();
		this.aClass38_5.method950();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass38_7 != null) {
			this.aClass38_7.method950();
			this.aClass38_1.method950();
			local24 = (int) ((double) (this.aClass38_7.anInt1110 - this.aClass38_7.anInt1111) * 32.768D / local16);
			local26 = (int) ((double) this.aClass38_7.anInt1111 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass38_6 != null) {
			this.aClass38_6.method950();
			this.aClass38_8.method950();
			local63 = (int) ((double) (this.aClass38_6.anInt1110 - this.aClass38_6.anInt1111) * 32.768D / local16);
			local65 = (int) ((double) this.aClass38_6.anInt1111 * 32.768D / local16);
		}
		@Pc(102) int local102;
		for (local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray120[local102] != 0) {
				Static72.anIntArray126[local102] = 0;
				Static72.anIntArray127[local102] = (int) ((double) this.anIntArray118[local102] * local16);
				Static72.anIntArray124[local102] = (this.anIntArray120[local102] << 14) / 100;
				Static72.anIntArray125[local102] = (int) ((double) (this.aClass38_2.anInt1110 - this.aClass38_2.anInt1111) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray119[local102]) / local16);
				Static72.anIntArray128[local102] = (int) ((double) this.aClass38_2.anInt1111 * 32.768D / local16);
			}
		}
		@Pc(185) int local185;
		@Pc(190) int local190;
		@Pc(198) int local198;
		@Pc(203) int local203;
		for (local102 = 0; local102 < arg0; local102++) {
			local185 = this.aClass38_2.method947(arg0);
			local190 = this.aClass38_5.method947(arg0);
			if (this.aClass38_7 != null) {
				local198 = this.aClass38_7.method947(arg0);
				local203 = this.aClass38_1.method947(arg0);
				local185 += this.method1103(local28, local203, this.aClass38_7.anInt1109) >> 1;
				local28 += (local198 * local24 >> 16) + local26;
			}
			if (this.aClass38_6 != null) {
				local198 = this.aClass38_6.method947(arg0);
				local203 = this.aClass38_8.method947(arg0);
				local190 = local190 * ((this.method1103(local67, local203, this.aClass38_6.anInt1109) >> 1) + 32768) >> 15;
				local67 += (local198 * local63 >> 16) + local65;
			}
			for (local198 = 0; local198 < 5; local198++) {
				if (this.anIntArray120[local198] != 0) {
					local203 = local102 + Static72.anIntArray127[local198];
					if (local203 < arg0) {
						Static72.anIntArray123[local203] += this.method1103(Static72.anIntArray126[local198], local190 * Static72.anIntArray124[local198] >> 15, this.aClass38_2.anInt1109);
						Static72.anIntArray126[local198] += (local185 * Static72.anIntArray125[local198] >> 16) + Static72.anIntArray128[local198];
					}
				}
			}
		}
		@Pc(356) int local356;
		if (this.aClass38_4 != null) {
			this.aClass38_4.method950();
			this.aClass38_3.method950();
			local102 = 0;
			@Pc(341) boolean local341 = true;
			for (local198 = 0; local198 < arg0; local198++) {
				local203 = this.aClass38_4.method947(arg0);
				local356 = this.aClass38_3.method947(arg0);
				if (local341) {
					local185 = this.aClass38_4.anInt1111 + ((this.aClass38_4.anInt1110 - this.aClass38_4.anInt1111) * local203 >> 8);
				} else {
					local185 = this.aClass38_4.anInt1111 + ((this.aClass38_4.anInt1110 - this.aClass38_4.anInt1111) * local356 >> 8);
				}
				local102 += 256;
				if (local102 >= local185) {
					local102 = 0;
					local341 = !local341;
				}
				if (local341) {
					Static72.anIntArray123[local198] = 0;
				}
			}
		}
		if (this.anInt1325 > 0 && this.anInt1326 > 0) {
			local102 = (int) ((double) this.anInt1325 * local16);
			for (local185 = local102; local185 < arg0; local185++) {
				Static72.anIntArray123[local185] += Static72.anIntArray123[local185 - local102] * this.anInt1326 / 100;
			}
		}
		if (this.aClass71_1.anIntArray196[0] > 0 || this.aClass71_1.anIntArray196[1] > 0) {
			this.aClass38_9.method950();
			local102 = this.aClass38_9.method947(arg0 + 1);
			local185 = this.aClass71_1.method1697(0, (float) local102 / 65536.0F);
			local190 = this.aClass71_1.method1697(1, (float) local102 / 65536.0F);
			if (arg0 >= local185 + local190) {
				local198 = 0;
				local203 = local190;
				if (local190 > arg0 - local185) {
					local203 = arg0 - local185;
				}
				@Pc(523) int local523;
				while (local198 < local203) {
					local356 = (int) ((long) Static72.anIntArray123[local198 + local185] * (long) Static106.anInt1948 >> 16);
					for (local523 = 0; local523 < local185; local523++) {
						local356 += (int) ((long) Static72.anIntArray123[local198 + local185 - local523 - 1] * (long) Static106.anIntArrayArray25[0][local523] >> 16);
					}
					for (local523 = 0; local523 < local198; local523++) {
						local356 -= (int) ((long) Static72.anIntArray123[local198 - local523 - 1] * (long) Static106.anIntArrayArray25[1][local523] >> 16);
					}
					Static72.anIntArray123[local198] = local356;
					local102 = this.aClass38_9.method947(arg0 + 1);
					local198++;
				}
				local203 = 128;
				while (true) {
					if (local203 > arg0 - local185) {
						local203 = arg0 - local185;
					}
					while (local198 < local203) {
						local356 = (int) ((long) Static72.anIntArray123[local198 + local185] * (long) Static106.anInt1948 >> 16);
						for (local523 = 0; local523 < local185; local523++) {
							local356 += (int) ((long) Static72.anIntArray123[local198 + local185 - local523 - 1] * (long) Static106.anIntArrayArray25[0][local523] >> 16);
						}
						for (local523 = 0; local523 < local190; local523++) {
							local356 -= (int) ((long) Static72.anIntArray123[local198 - local523 - 1] * (long) Static106.anIntArrayArray25[1][local523] >> 16);
						}
						Static72.anIntArray123[local198] = local356;
						local102 = this.aClass38_9.method947(arg0 + 1);
						local198++;
					}
					if (local198 >= arg0 - local185) {
						while (local198 < arg0) {
							local356 = 0;
							for (local523 = local198 + local185 - arg0; local523 < local185; local523++) {
								local356 += (int) ((long) Static72.anIntArray123[local198 + local185 - local523 - 1] * (long) Static106.anIntArrayArray25[0][local523] >> 16);
							}
							for (local523 = 0; local523 < local190; local523++) {
								local356 -= (int) ((long) Static72.anIntArray123[local198 - local523 - 1] * (long) Static106.anIntArrayArray25[1][local523] >> 16);
							}
							Static72.anIntArray123[local198] = local356;
							this.aClass38_9.method947(arg0 + 1);
							local198++;
						}
						break;
					}
					local185 = this.aClass71_1.method1697(0, (float) local102 / 65536.0F);
					local190 = this.aClass71_1.method1697(1, (float) local102 / 65536.0F);
					local203 += 128;
				}
			}
		}
		for (local102 = 0; local102 < arg0; local102++) {
			if (Static72.anIntArray123[local102] < -32768) {
				Static72.anIntArray123[local102] = -32768;
			}
			if (Static72.anIntArray123[local102] > 32767) {
				Static72.anIntArray123[local102] = 32767;
			}
		}
		return Static72.anIntArray123;
	}
}
