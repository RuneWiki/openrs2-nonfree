import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oga")
public final class Class244 {

	@OriginalMember(owner = "client!oga", name = "t", descriptor = "[I")
	private static final int[] anIntArray524 = new int[32768];

	@OriginalMember(owner = "client!oga", name = "l", descriptor = "[I")
	private static final int[] anIntArray519;

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "Lclient!vda;")
	private Class347 aClass347_1;

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "Lclient!vda;")
	private Class347 aClass347_2;

	@OriginalMember(owner = "client!oga", name = "d", descriptor = "Lclient!vda;")
	private Class347 aClass347_3;

	@OriginalMember(owner = "client!oga", name = "e", descriptor = "Lclient!vda;")
	private Class347 aClass347_4;

	@OriginalMember(owner = "client!oga", name = "g", descriptor = "Lclient!vda;")
	private Class347 aClass347_5;

	@OriginalMember(owner = "client!oga", name = "h", descriptor = "Lclient!vda;")
	private Class347 aClass347_6;

	@OriginalMember(owner = "client!oga", name = "i", descriptor = "Lclient!vda;")
	private Class347 aClass347_7;

	@OriginalMember(owner = "client!oga", name = "j", descriptor = "Lclient!cg;")
	private Class45 aClass45_1;

	@OriginalMember(owner = "client!oga", name = "m", descriptor = "Lclient!vda;")
	private Class347 aClass347_8;

	@OriginalMember(owner = "client!oga", name = "s", descriptor = "Lclient!vda;")
	private Class347 aClass347_9;

	@OriginalMember(owner = "client!oga", name = "f", descriptor = "I")
	private int anInt6512 = 0;

	@OriginalMember(owner = "client!oga", name = "k", descriptor = "I")
	public int anInt6513 = 0;

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "I")
	private int anInt6511 = 100;

	@OriginalMember(owner = "client!oga", name = "o", descriptor = "[I")
	private final int[] anIntArray521 = new int[5];

	@OriginalMember(owner = "client!oga", name = "p", descriptor = "I")
	public int anInt6514 = 500;

	@OriginalMember(owner = "client!oga", name = "r", descriptor = "[I")
	private final int[] anIntArray523 = new int[5];

	@OriginalMember(owner = "client!oga", name = "n", descriptor = "[I")
	private final int[] anIntArray520 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray524[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray519 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray519[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(Lclient!qh;)V")
	public void method5590(@OriginalArg(0) Class3_Sub11 arg0) {
		this.aClass347_3 = new Class347();
		this.aClass347_3.method7397(arg0);
		this.aClass347_1 = new Class347();
		this.aClass347_1.method7397(arg0);
		@Pc(21) int local21 = arg0.method3118();
		if (local21 != 0) {
			arg0.anInt3520--;
			this.aClass347_5 = new Class347();
			this.aClass347_5.method7397(arg0);
			this.aClass347_9 = new Class347();
			this.aClass347_9.method7397(arg0);
		}
		local21 = arg0.method3118();
		if (local21 != 0) {
			arg0.anInt3520--;
			this.aClass347_6 = new Class347();
			this.aClass347_6.method7397(arg0);
			this.aClass347_4 = new Class347();
			this.aClass347_4.method7397(arg0);
		}
		local21 = arg0.method3118();
		if (local21 != 0) {
			arg0.anInt3520--;
			this.aClass347_8 = new Class347();
			this.aClass347_8.method7397(arg0);
			this.aClass347_7 = new Class347();
			this.aClass347_7.method7397(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method3138();
			if (local114 == 0) {
				break;
			}
			this.anIntArray523[local109] = local114;
			this.anIntArray520[local109] = arg0.method3085();
			this.anIntArray521[local109] = arg0.method3138();
		}
		this.anInt6512 = arg0.method3138();
		this.anInt6511 = arg0.method3138();
		this.anInt6514 = arg0.method3109();
		this.anInt6513 = arg0.method3109();
		this.aClass45_1 = new Class45();
		this.aClass347_2 = new Class347();
		this.aClass45_1.method1461(arg0, this.aClass347_2);
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(III)I")
	private int method5592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray519[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray524[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(II)[I")
	public int[] method5593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static604.method5909(Static378.anIntArray522, 0, arg0);
		if (arg1 < 10) {
			return Static378.anIntArray522;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass347_3.method7400();
		this.aClass347_1.method7400();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass347_5 != null) {
			this.aClass347_5.method7400();
			this.aClass347_9.method7400();
			local24 = (int) ((double) (this.aClass347_5.anInt8894 - this.aClass347_5.anInt8895) * 32.768D / local16);
			local26 = (int) ((double) this.aClass347_5.anInt8895 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass347_6 != null) {
			this.aClass347_6.method7400();
			this.aClass347_4.method7400();
			local63 = (int) ((double) (this.aClass347_6.anInt8894 - this.aClass347_6.anInt8895) * 32.768D / local16);
			local65 = (int) ((double) this.aClass347_6.anInt8895 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray523[local102] != 0) {
				Static378.anIntArray526[local102] = 0;
				Static378.anIntArray528[local102] = (int) ((double) this.anIntArray521[local102] * local16);
				Static378.anIntArray527[local102] = (this.anIntArray523[local102] << 14) / 100;
				Static378.anIntArray529[local102] = (int) ((double) (this.aClass347_3.anInt8894 - this.aClass347_3.anInt8895) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray520[local102]) / local16);
				Static378.anIntArray525[local102] = (int) ((double) this.aClass347_3.anInt8895 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass347_3.method7398(arg0);
			local187 = this.aClass347_1.method7398(arg0);
			if (this.aClass347_5 != null) {
				local195 = this.aClass347_5.method7398(arg0);
				local200 = this.aClass347_9.method7398(arg0);
				local182 += this.method5592(local28, local200, this.aClass347_5.anInt8892) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass347_6 != null) {
				local195 = this.aClass347_6.method7398(arg0);
				local200 = this.aClass347_4.method7398(arg0);
				local187 = local187 * ((this.method5592(local67, local200, this.aClass347_6.anInt8892) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray523[local195] != 0) {
					local200 = local176 + Static378.anIntArray528[local195];
					if (local200 < arg0) {
						Static378.anIntArray522[local200] += this.method5592(Static378.anIntArray526[local195], local187 * Static378.anIntArray527[local195] >> 15, this.aClass347_3.anInt8892);
						Static378.anIntArray526[local195] += (local182 * Static378.anIntArray529[local195] >> 16) + Static378.anIntArray525[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass347_8 != null) {
			this.aClass347_8.method7400();
			this.aClass347_7.method7400();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass347_8.method7398(arg0);
				local352 = this.aClass347_7.method7398(arg0);
				if (local339) {
					local187 = this.aClass347_8.anInt8895 + ((this.aClass347_8.anInt8894 - this.aClass347_8.anInt8895) * local347 >> 8);
				} else {
					local187 = this.aClass347_8.anInt8895 + ((this.aClass347_8.anInt8894 - this.aClass347_8.anInt8895) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static378.anIntArray522[local200] = 0;
				}
			}
		}
		if (this.anInt6512 > 0 && this.anInt6511 > 0) {
			local182 = (int) ((double) this.anInt6512 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static378.anIntArray522[local187] += Static378.anIntArray522[local187 - local182] * this.anInt6511 / 100;
			}
		}
		if (this.aClass45_1.anIntArray110[0] > 0 || this.aClass45_1.anIntArray110[1] > 0) {
			this.aClass347_2.method7400();
			local182 = this.aClass347_2.method7398(arg0 + 1);
			local187 = this.aClass45_1.method1459(0, (float) local182 / 65536.0F);
			local195 = this.aClass45_1.method1459(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static378.anIntArray522[local200 + local187] * (long) Static64.anInt1714 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static378.anIntArray522[local200 + local187 - local519 - 1] * (long) Static64.anIntArrayArray5[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static378.anIntArray522[local200 - local549 - 1] * (long) Static64.anIntArrayArray5[1][local549] >> 16);
					}
					Static378.anIntArray522[local200] = local352;
					local182 = this.aClass347_2.method7398(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static378.anIntArray522[local200 + local187] * (long) Static64.anInt1714 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static378.anIntArray522[local200 + local187 - local519 - 1] * (long) Static64.anIntArrayArray5[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static378.anIntArray522[local200 - local549 - 1] * (long) Static64.anIntArrayArray5[1][local549] >> 16);
						}
						Static378.anIntArray522[local200] = local352;
						local182 = this.aClass347_2.method7398(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static378.anIntArray522[local200 + local187 - local519 - 1] * (long) Static64.anIntArrayArray5[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static378.anIntArray522[local200 - local549 - 1] * (long) Static64.anIntArrayArray5[1][local549] >> 16);
							}
							Static378.anIntArray522[local200] = local352;
							this.aClass347_2.method7398(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass45_1.method1459(0, (float) local182 / 65536.0F);
					local195 = this.aClass45_1.method1459(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static378.anIntArray522[local182] < -32768) {
				Static378.anIntArray522[local182] = -32768;
			}
			if (Static378.anIntArray522[local182] > 32767) {
				Static378.anIntArray522[local182] = 32767;
			}
		}
		return Static378.anIntArray522;
	}
}
