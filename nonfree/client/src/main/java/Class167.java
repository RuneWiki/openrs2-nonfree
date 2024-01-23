import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class167 {

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "[I")
	private static int[] anIntArray514 = new int[32768];

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "[I")
	private static int[] anIntArray513;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Lclient!qa;")
	private Class133 aClass133_1;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Lclient!qa;")
	private Class133 aClass133_2;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "Lclient!qa;")
	private Class133 aClass133_3;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Lclient!qa;")
	private Class133 aClass133_4;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "Lclient!wc;")
	private Class176 aClass176_1;

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "Lclient!qa;")
	private Class133 aClass133_5;

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "Lclient!qa;")
	private Class133 aClass133_6;

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "Lclient!qa;")
	private Class133 aClass133_7;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "Lclient!qa;")
	private Class133 aClass133_8;

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "Lclient!qa;")
	private Class133 aClass133_9;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	private int anInt5346 = 0;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "[I")
	private int[] anIntArray511 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
	public int anInt5347 = 500;

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "[I")
	private int[] anIntArray510 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "[I")
	private int[] anIntArray509 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
	public int anInt5348 = 0;

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
	private int anInt5349 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		@Pc(9) int local9;
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray514[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray513 = new int[32768];
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray513[local9] = (int) (Math.sin((double) local9 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)I")
	private int method4181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray513[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray514[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)[I")
	public int[] method4182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static304.method2605(Static275.anIntArray512, 0, arg0);
		if (arg1 < 10) {
			return Static275.anIntArray512;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass133_3.method3312();
		this.aClass133_8.method3312();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass133_6 != null) {
			this.aClass133_6.method3312();
			this.aClass133_1.method3312();
			local24 = (int) ((double) (this.aClass133_6.anInt4158 - this.aClass133_6.anInt4161) * 32.768D / local16);
			local26 = (int) ((double) this.aClass133_6.anInt4161 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass133_9 != null) {
			this.aClass133_9.method3312();
			this.aClass133_7.method3312();
			local63 = (int) ((double) (this.aClass133_9.anInt4158 - this.aClass133_9.anInt4161) * 32.768D / local16);
			local65 = (int) ((double) this.aClass133_9.anInt4161 * 32.768D / local16);
		}
		@Pc(102) int local102;
		for (local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray509[local102] != 0) {
				Static275.anIntArray515[local102] = 0;
				Static275.anIntArray517[local102] = (int) ((double) this.anIntArray510[local102] * local16);
				Static275.anIntArray516[local102] = (this.anIntArray509[local102] << 14) / 100;
				Static275.anIntArray518[local102] = (int) ((double) (this.aClass133_3.anInt4158 - this.aClass133_3.anInt4161) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray511[local102]) / local16);
				Static275.anIntArray519[local102] = (int) ((double) this.aClass133_3.anInt4161 * 32.768D / local16);
			}
		}
		@Pc(185) int local185;
		@Pc(190) int local190;
		@Pc(198) int local198;
		@Pc(203) int local203;
		for (local102 = 0; local102 < arg0; local102++) {
			local185 = this.aClass133_3.method3310(arg0);
			local190 = this.aClass133_8.method3310(arg0);
			if (this.aClass133_6 != null) {
				local198 = this.aClass133_6.method3310(arg0);
				local203 = this.aClass133_1.method3310(arg0);
				local185 += this.method4181(local28, local203, this.aClass133_6.anInt4159) >> 1;
				local28 += (local198 * local24 >> 16) + local26;
			}
			if (this.aClass133_9 != null) {
				local198 = this.aClass133_9.method3310(arg0);
				local203 = this.aClass133_7.method3310(arg0);
				local190 = local190 * ((this.method4181(local67, local203, this.aClass133_9.anInt4159) >> 1) + 32768) >> 15;
				local67 += (local198 * local63 >> 16) + local65;
			}
			for (local198 = 0; local198 < 5; local198++) {
				if (this.anIntArray509[local198] != 0) {
					local203 = local102 + Static275.anIntArray517[local198];
					if (local203 < arg0) {
						Static275.anIntArray512[local203] += this.method4181(Static275.anIntArray515[local198], local190 * Static275.anIntArray516[local198] >> 15, this.aClass133_3.anInt4159);
						Static275.anIntArray515[local198] += (local185 * Static275.anIntArray518[local198] >> 16) + Static275.anIntArray519[local198];
					}
				}
			}
		}
		@Pc(356) int local356;
		if (this.aClass133_5 != null) {
			this.aClass133_5.method3312();
			this.aClass133_4.method3312();
			local102 = 0;
			@Pc(341) boolean local341 = true;
			for (local198 = 0; local198 < arg0; local198++) {
				local203 = this.aClass133_5.method3310(arg0);
				local356 = this.aClass133_4.method3310(arg0);
				if (local341) {
					local185 = this.aClass133_5.anInt4161 + ((this.aClass133_5.anInt4158 - this.aClass133_5.anInt4161) * local203 >> 8);
				} else {
					local185 = this.aClass133_5.anInt4161 + ((this.aClass133_5.anInt4158 - this.aClass133_5.anInt4161) * local356 >> 8);
				}
				local102 += 256;
				if (local102 >= local185) {
					local102 = 0;
					local341 = !local341;
				}
				if (local341) {
					Static275.anIntArray512[local198] = 0;
				}
			}
		}
		if (this.anInt5346 > 0 && this.anInt5349 > 0) {
			local102 = (int) ((double) this.anInt5346 * local16);
			for (local185 = local102; local185 < arg0; local185++) {
				Static275.anIntArray512[local185] += Static275.anIntArray512[local185 - local102] * this.anInt5349 / 100;
			}
		}
		if (this.aClass176_1.anIntArray544[0] > 0 || this.aClass176_1.anIntArray544[1] > 0) {
			this.aClass133_2.method3312();
			local102 = this.aClass133_2.method3310(arg0 + 1);
			local185 = this.aClass176_1.method4362(0, (float) local102 / 65536.0F);
			local190 = this.aClass176_1.method4362(1, (float) local102 / 65536.0F);
			if (arg0 >= local185 + local190) {
				local198 = 0;
				local203 = local190;
				if (local190 > arg0 - local185) {
					local203 = arg0 - local185;
				}
				@Pc(523) int local523;
				while (local198 < local203) {
					local356 = (int) ((long) Static275.anIntArray512[local198 + local185] * (long) Static290.anInt5503 >> 16);
					for (local523 = 0; local523 < local185; local523++) {
						local356 += (int) ((long) Static275.anIntArray512[local198 + local185 - local523 - 1] * (long) Static290.anIntArrayArray44[0][local523] >> 16);
					}
					for (local523 = 0; local523 < local198; local523++) {
						local356 -= (int) ((long) Static275.anIntArray512[local198 - local523 - 1] * (long) Static290.anIntArrayArray44[1][local523] >> 16);
					}
					Static275.anIntArray512[local198] = local356;
					local102 = this.aClass133_2.method3310(arg0 + 1);
					local198++;
				}
				local203 = 128;
				while (true) {
					if (local203 > arg0 - local185) {
						local203 = arg0 - local185;
					}
					while (local198 < local203) {
						local356 = (int) ((long) Static275.anIntArray512[local198 + local185] * (long) Static290.anInt5503 >> 16);
						for (local523 = 0; local523 < local185; local523++) {
							local356 += (int) ((long) Static275.anIntArray512[local198 + local185 - local523 - 1] * (long) Static290.anIntArrayArray44[0][local523] >> 16);
						}
						for (local523 = 0; local523 < local190; local523++) {
							local356 -= (int) ((long) Static275.anIntArray512[local198 - local523 - 1] * (long) Static290.anIntArrayArray44[1][local523] >> 16);
						}
						Static275.anIntArray512[local198] = local356;
						local102 = this.aClass133_2.method3310(arg0 + 1);
						local198++;
					}
					if (local198 >= arg0 - local185) {
						while (local198 < arg0) {
							local356 = 0;
							for (local523 = local198 + local185 - arg0; local523 < local185; local523++) {
								local356 += (int) ((long) Static275.anIntArray512[local198 + local185 - local523 - 1] * (long) Static290.anIntArrayArray44[0][local523] >> 16);
							}
							for (local523 = 0; local523 < local190; local523++) {
								local356 -= (int) ((long) Static275.anIntArray512[local198 - local523 - 1] * (long) Static290.anIntArrayArray44[1][local523] >> 16);
							}
							Static275.anIntArray512[local198] = local356;
							this.aClass133_2.method3310(arg0 + 1);
							local198++;
						}
						break;
					}
					local185 = this.aClass176_1.method4362(0, (float) local102 / 65536.0F);
					local190 = this.aClass176_1.method4362(1, (float) local102 / 65536.0F);
					local203 += 128;
				}
			}
		}
		for (local102 = 0; local102 < arg0; local102++) {
			if (Static275.anIntArray512[local102] < -32768) {
				Static275.anIntArray512[local102] = -32768;
			}
			if (Static275.anIntArray512[local102] > 32767) {
				Static275.anIntArray512[local102] = 32767;
			}
		}
		return Static275.anIntArray512;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!cg;)V")
	public void method4183(@OriginalArg(0) Class1_Sub11 arg0) {
		this.aClass133_3 = new Class133();
		this.aClass133_3.method3311(arg0);
		this.aClass133_8 = new Class133();
		this.aClass133_8.method3311(arg0);
		@Pc(21) int local21 = arg0.method2690();
		if (local21 != 0) {
			arg0.anInt3264--;
			this.aClass133_6 = new Class133();
			this.aClass133_6.method3311(arg0);
			this.aClass133_1 = new Class133();
			this.aClass133_1.method3311(arg0);
		}
		local21 = arg0.method2690();
		if (local21 != 0) {
			arg0.anInt3264--;
			this.aClass133_9 = new Class133();
			this.aClass133_9.method3311(arg0);
			this.aClass133_7 = new Class133();
			this.aClass133_7.method3311(arg0);
		}
		local21 = arg0.method2690();
		if (local21 != 0) {
			arg0.anInt3264--;
			this.aClass133_5 = new Class133();
			this.aClass133_5.method3311(arg0);
			this.aClass133_4 = new Class133();
			this.aClass133_4.method3311(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(116) int local116 = arg0.method2664();
			if (local116 == 0) {
				break;
			}
			this.anIntArray509[local109] = local116;
			this.anIntArray511[local109] = arg0.method2644();
			this.anIntArray510[local109] = arg0.method2664();
		}
		this.anInt5346 = arg0.method2664();
		this.anInt5349 = arg0.method2664();
		this.anInt5347 = arg0.method2691();
		this.anInt5348 = arg0.method2691();
		this.aClass176_1 = new Class176();
		this.aClass133_2 = new Class133();
		this.aClass176_1.method4360(arg0, this.aClass133_2);
	}
}
