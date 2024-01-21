import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class4 {

	@OriginalMember(owner = "client!af", name = "q", descriptor = "[I")
	public static int[] anIntArray41 = new int[32768];

	@OriginalMember(owner = "client!af", name = "l", descriptor = "[I")
	public static int[] anIntArray38;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "Lclient!mb;")
	private Class48 aClass48_1;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "Lclient!mb;")
	private Class48 aClass48_2;

	@OriginalMember(owner = "client!af", name = "e", descriptor = "Lclient!mb;")
	private Class48 aClass48_3;

	@OriginalMember(owner = "client!af", name = "f", descriptor = "Lclient!mb;")
	private Class48 aClass48_4;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "Lclient!mb;")
	private Class48 aClass48_5;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "Lclient!mb;")
	private Class48 aClass48_6;

	@OriginalMember(owner = "client!af", name = "k", descriptor = "Lclient!nf;")
	private Class53 aClass53_1;

	@OriginalMember(owner = "client!af", name = "n", descriptor = "Lclient!mb;")
	private Class48 aClass48_7;

	@OriginalMember(owner = "client!af", name = "t", descriptor = "Lclient!mb;")
	private Class48 aClass48_8;

	@OriginalMember(owner = "client!af", name = "v", descriptor = "Lclient!mb;")
	private Class48 aClass48_9;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "I")
	public int anInt178 = 0;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "[I")
	private final int[] anIntArray36 = new int[5];

	@OriginalMember(owner = "client!af", name = "m", descriptor = "[I")
	private final int[] anIntArray39 = new int[5];

	@OriginalMember(owner = "client!af", name = "h", descriptor = "[I")
	private final int[] anIntArray37 = new int[5];

	@OriginalMember(owner = "client!af", name = "p", descriptor = "I")
	private int anInt180 = 0;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "I")
	public int anInt179 = 500;

	@OriginalMember(owner = "client!af", name = "x", descriptor = "I")
	private int anInt181 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray41[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray38 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray38[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(III)I")
	private int method90(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray38[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray41[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)[I")
	public int[] method91(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static136.method1940(Static6.anIntArray40, 0, arg0);
		if (arg1 < 10) {
			return Static6.anIntArray40;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass48_3.method1299();
		this.aClass48_5.method1299();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass48_9 != null) {
			this.aClass48_9.method1299();
			this.aClass48_8.method1299();
			local24 = (int) ((double) (this.aClass48_9.anInt1897 - this.aClass48_9.anInt1894) * 32.768D / local16);
			local26 = (int) ((double) this.aClass48_9.anInt1894 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass48_7 != null) {
			this.aClass48_7.method1299();
			this.aClass48_2.method1299();
			local63 = (int) ((double) (this.aClass48_7.anInt1897 - this.aClass48_7.anInt1894) * 32.768D / local16);
			local65 = (int) ((double) this.aClass48_7.anInt1894 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray37[local102] != 0) {
				Static6.anIntArray42[local102] = 0;
				Static6.anIntArray46[local102] = (int) ((double) this.anIntArray39[local102] * local16);
				Static6.anIntArray43[local102] = (this.anIntArray37[local102] << 14) / 100;
				Static6.anIntArray45[local102] = (int) ((double) (this.aClass48_3.anInt1897 - this.aClass48_3.anInt1894) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray36[local102]) / local16);
				Static6.anIntArray44[local102] = (int) ((double) this.aClass48_3.anInt1894 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass48_3.method1296(arg0);
			local187 = this.aClass48_5.method1296(arg0);
			if (this.aClass48_9 != null) {
				local195 = this.aClass48_9.method1296(arg0);
				local200 = this.aClass48_8.method1296(arg0);
				local182 += this.method90(local28, local200, this.aClass48_9.anInt1895) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass48_7 != null) {
				local195 = this.aClass48_7.method1296(arg0);
				local200 = this.aClass48_2.method1296(arg0);
				local187 = local187 * ((this.method90(local67, local200, this.aClass48_7.anInt1895) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray37[local195] != 0) {
					local200 = local176 + Static6.anIntArray46[local195];
					if (local200 < arg0) {
						Static6.anIntArray40[local200] += this.method90(Static6.anIntArray42[local195], local187 * Static6.anIntArray43[local195] >> 15, this.aClass48_3.anInt1895);
						Static6.anIntArray42[local195] += (local182 * Static6.anIntArray45[local195] >> 16) + Static6.anIntArray44[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass48_4 != null) {
			this.aClass48_4.method1299();
			this.aClass48_1.method1299();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass48_4.method1296(arg0);
				local352 = this.aClass48_1.method1296(arg0);
				if (local339) {
					local187 = this.aClass48_4.anInt1894 + ((this.aClass48_4.anInt1897 - this.aClass48_4.anInt1894) * local347 >> 8);
				} else {
					local187 = this.aClass48_4.anInt1894 + ((this.aClass48_4.anInt1897 - this.aClass48_4.anInt1894) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static6.anIntArray40[local200] = 0;
				}
			}
		}
		if (this.anInt180 > 0 && this.anInt181 > 0) {
			local182 = (int) ((double) this.anInt180 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static6.anIntArray40[local187] += Static6.anIntArray40[local187 - local182] * this.anInt181 / 100;
			}
		}
		if (this.aClass53_1.anIntArray313[0] > 0 || this.aClass53_1.anIntArray313[1] > 0) {
			this.aClass48_6.method1299();
			local182 = this.aClass48_6.method1296(arg0 + 1);
			local187 = this.aClass53_1.method1414(0, (float) local182 / 65536.0F);
			local195 = this.aClass53_1.method1414(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static6.anIntArray40[local200 + local187] * (long) Static84.anInt2011 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static6.anIntArray40[local200 + local187 - local519 - 1] * (long) Static84.anIntArrayArray20[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static6.anIntArray40[local200 - local549 - 1] * (long) Static84.anIntArrayArray20[1][local549] >> 16);
					}
					Static6.anIntArray40[local200] = local352;
					local182 = this.aClass48_6.method1296(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static6.anIntArray40[local200 + local187] * (long) Static84.anInt2011 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static6.anIntArray40[local200 + local187 - local519 - 1] * (long) Static84.anIntArrayArray20[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static6.anIntArray40[local200 - local549 - 1] * (long) Static84.anIntArrayArray20[1][local549] >> 16);
						}
						Static6.anIntArray40[local200] = local352;
						local182 = this.aClass48_6.method1296(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static6.anIntArray40[local200 + local187 - local519 - 1] * (long) Static84.anIntArrayArray20[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static6.anIntArray40[local200 - local549 - 1] * (long) Static84.anIntArrayArray20[1][local549] >> 16);
							}
							Static6.anIntArray40[local200] = local352;
							this.aClass48_6.method1296(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass53_1.method1414(0, (float) local182 / 65536.0F);
					local195 = this.aClass53_1.method1414(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static6.anIntArray40[local182] < -32768) {
				Static6.anIntArray40[local182] = -32768;
			}
			if (Static6.anIntArray40[local182] > 32767) {
				Static6.anIntArray40[local182] = 32767;
			}
		}
		return Static6.anIntArray40;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!qc;)V")
	public void method92(@OriginalArg(0) Class1_Sub18 arg0) {
		this.aClass48_3 = new Class48();
		this.aClass48_3.method1298(arg0);
		this.aClass48_5 = new Class48();
		this.aClass48_5.method1298(arg0);
		@Pc(21) int local21 = arg0.method2169();
		if (local21 != 0) {
			arg0.anInt3078--;
			this.aClass48_9 = new Class48();
			this.aClass48_9.method1298(arg0);
			this.aClass48_8 = new Class48();
			this.aClass48_8.method1298(arg0);
		}
		local21 = arg0.method2169();
		if (local21 != 0) {
			arg0.anInt3078--;
			this.aClass48_7 = new Class48();
			this.aClass48_7.method1298(arg0);
			this.aClass48_2 = new Class48();
			this.aClass48_2.method1298(arg0);
		}
		local21 = arg0.method2169();
		if (local21 != 0) {
			arg0.anInt3078--;
			this.aClass48_4 = new Class48();
			this.aClass48_4.method1298(arg0);
			this.aClass48_1 = new Class48();
			this.aClass48_1.method1298(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method2175();
			if (local114 == 0) {
				break;
			}
			this.anIntArray37[local109] = local114;
			this.anIntArray36[local109] = arg0.method2135();
			this.anIntArray39[local109] = arg0.method2175();
		}
		this.anInt180 = arg0.method2175();
		this.anInt181 = arg0.method2175();
		this.anInt179 = arg0.method2156();
		this.anInt178 = arg0.method2156();
		this.aClass53_1 = new Class53();
		this.aClass48_6 = new Class48();
		this.aClass53_1.method1415(arg0, this.aClass48_6);
	}
}
