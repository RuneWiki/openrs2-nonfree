import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class204 {

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "[I")
	private static final int[] anIntArray799 = new int[32768];

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "[I")
	private static final int[] anIntArray801;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "Lclient!ql;")
	private Class172 aClass172_1;

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "Lclient!vh;")
	private Class206 aClass206_1;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "Lclient!vh;")
	private Class206 aClass206_2;

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "Lclient!vh;")
	private Class206 aClass206_3;

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "Lclient!vh;")
	private Class206 aClass206_4;

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "Lclient!vh;")
	private Class206 aClass206_5;

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "Lclient!vh;")
	private Class206 aClass206_6;

	@OriginalMember(owner = "client!ve", name = "q", descriptor = "Lclient!vh;")
	private Class206 aClass206_7;

	@OriginalMember(owner = "client!ve", name = "r", descriptor = "Lclient!vh;")
	private Class206 aClass206_8;

	@OriginalMember(owner = "client!ve", name = "s", descriptor = "Lclient!vh;")
	private Class206 aClass206_9;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "[I")
	private final int[] anIntArray797 = new int[5];

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
	private int anInt6261 = 0;

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
	public int anInt6262 = 0;

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
	private int anInt6263 = 100;

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "[I")
	private final int[] anIntArray798 = new int[5];

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "[I")
	private final int[] anIntArray800 = new int[5];

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
	public int anInt6260 = 500;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray799[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray801 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray801[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)[I")
	public int[] method5283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static366.method4205(Static333.anIntArray796, 0, arg0);
		if (arg1 < 10) {
			return Static333.anIntArray796;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass206_8.method5309();
		this.aClass206_9.method5309();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass206_7 != null) {
			this.aClass206_7.method5309();
			this.aClass206_6.method5309();
			local24 = (int) ((double) (this.aClass206_7.anInt6292 - this.aClass206_7.anInt6291) * 32.768D / local16);
			local26 = (int) ((double) this.aClass206_7.anInt6291 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass206_2 != null) {
			this.aClass206_2.method5309();
			this.aClass206_1.method5309();
			local63 = (int) ((double) (this.aClass206_2.anInt6292 - this.aClass206_2.anInt6291) * 32.768D / local16);
			local65 = (int) ((double) this.aClass206_2.anInt6291 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray800[local102] != 0) {
				Static333.anIntArray806[local102] = 0;
				Static333.anIntArray803[local102] = (int) ((double) this.anIntArray798[local102] * local16);
				Static333.anIntArray802[local102] = (this.anIntArray800[local102] << 14) / 100;
				Static333.anIntArray804[local102] = (int) ((double) (this.aClass206_8.anInt6292 - this.aClass206_8.anInt6291) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray797[local102]) / local16);
				Static333.anIntArray805[local102] = (int) ((double) this.aClass206_8.anInt6291 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass206_8.method5312(arg0);
			local187 = this.aClass206_9.method5312(arg0);
			if (this.aClass206_7 != null) {
				local195 = this.aClass206_7.method5312(arg0);
				local200 = this.aClass206_6.method5312(arg0);
				local182 += this.method5284(local28, local200, this.aClass206_7.anInt6290) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass206_2 != null) {
				local195 = this.aClass206_2.method5312(arg0);
				local200 = this.aClass206_1.method5312(arg0);
				local187 = local187 * ((this.method5284(local67, local200, this.aClass206_2.anInt6290) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray800[local195] != 0) {
					local200 = local176 + Static333.anIntArray803[local195];
					if (local200 < arg0) {
						Static333.anIntArray796[local200] += this.method5284(Static333.anIntArray806[local195], local187 * Static333.anIntArray802[local195] >> 15, this.aClass206_8.anInt6290);
						Static333.anIntArray806[local195] += (local182 * Static333.anIntArray804[local195] >> 16) + Static333.anIntArray805[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass206_5 != null) {
			this.aClass206_5.method5309();
			this.aClass206_4.method5309();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass206_5.method5312(arg0);
				local352 = this.aClass206_4.method5312(arg0);
				if (local339) {
					local187 = this.aClass206_5.anInt6291 + ((this.aClass206_5.anInt6292 - this.aClass206_5.anInt6291) * local347 >> 8);
				} else {
					local187 = this.aClass206_5.anInt6291 + ((this.aClass206_5.anInt6292 - this.aClass206_5.anInt6291) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static333.anIntArray796[local200] = 0;
				}
			}
		}
		if (this.anInt6261 > 0 && this.anInt6263 > 0) {
			local182 = (int) ((double) this.anInt6261 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static333.anIntArray796[local187] += Static333.anIntArray796[local187 - local182] * this.anInt6263 / 100;
			}
		}
		if (this.aClass172_1.anIntArray657[0] > 0 || this.aClass172_1.anIntArray657[1] > 0) {
			this.aClass206_3.method5309();
			local182 = this.aClass206_3.method5312(arg0 + 1);
			local187 = this.aClass172_1.method4360(0, (float) local182 / 65536.0F);
			local195 = this.aClass172_1.method4360(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static333.anIntArray796[local200 + local187] * (long) Static260.anInt5016 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static333.anIntArray796[local200 + local187 - local519 - 1] * (long) Static260.anIntArrayArray45[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static333.anIntArray796[local200 - local549 - 1] * (long) Static260.anIntArrayArray45[1][local549] >> 16);
					}
					Static333.anIntArray796[local200] = local352;
					local182 = this.aClass206_3.method5312(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static333.anIntArray796[local200 + local187] * (long) Static260.anInt5016 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static333.anIntArray796[local200 + local187 - local519 - 1] * (long) Static260.anIntArrayArray45[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static333.anIntArray796[local200 - local549 - 1] * (long) Static260.anIntArrayArray45[1][local549] >> 16);
						}
						Static333.anIntArray796[local200] = local352;
						local182 = this.aClass206_3.method5312(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static333.anIntArray796[local200 + local187 - local519 - 1] * (long) Static260.anIntArrayArray45[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static333.anIntArray796[local200 - local549 - 1] * (long) Static260.anIntArrayArray45[1][local549] >> 16);
							}
							Static333.anIntArray796[local200] = local352;
							this.aClass206_3.method5312(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass172_1.method4360(0, (float) local182 / 65536.0F);
					local195 = this.aClass172_1.method4360(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static333.anIntArray796[local182] < -32768) {
				Static333.anIntArray796[local182] = -32768;
			}
			if (Static333.anIntArray796[local182] > 32767) {
				Static333.anIntArray796[local182] = 32767;
			}
		}
		return Static333.anIntArray796;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)I")
	private int method5284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray801[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray799[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!ap;)V")
	public void method5286(@OriginalArg(0) Class7_Sub3 arg0) {
		this.aClass206_8 = new Class206();
		this.aClass206_8.method5310(arg0);
		this.aClass206_9 = new Class206();
		this.aClass206_9.method5310(arg0);
		@Pc(21) int local21 = arg0.method2772();
		if (local21 != 0) {
			arg0.anInt3005--;
			this.aClass206_7 = new Class206();
			this.aClass206_7.method5310(arg0);
			this.aClass206_6 = new Class206();
			this.aClass206_6.method5310(arg0);
		}
		local21 = arg0.method2772();
		if (local21 != 0) {
			arg0.anInt3005--;
			this.aClass206_2 = new Class206();
			this.aClass206_2.method5310(arg0);
			this.aClass206_1 = new Class206();
			this.aClass206_1.method5310(arg0);
		}
		local21 = arg0.method2772();
		if (local21 != 0) {
			arg0.anInt3005--;
			this.aClass206_5 = new Class206();
			this.aClass206_5.method5310(arg0);
			this.aClass206_4 = new Class206();
			this.aClass206_4.method5310(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method2732();
			if (local114 == 0) {
				break;
			}
			this.anIntArray800[local109] = local114;
			this.anIntArray797[local109] = arg0.method2752();
			this.anIntArray798[local109] = arg0.method2732();
		}
		this.anInt6261 = arg0.method2732();
		this.anInt6263 = arg0.method2732();
		this.anInt6260 = arg0.method2764();
		this.anInt6262 = arg0.method2764();
		this.aClass172_1 = new Class172();
		this.aClass206_3 = new Class206();
		this.aClass172_1.method4359(arg0, this.aClass206_3);
	}
}
