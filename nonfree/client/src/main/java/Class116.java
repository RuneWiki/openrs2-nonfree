import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class116 {

	@OriginalMember(owner = "client!il", name = "j", descriptor = "[I")
	private static final int[] anIntArray154 = new int[32768];

	@OriginalMember(owner = "client!il", name = "r", descriptor = "[I")
	private static final int[] anIntArray156;

	@OriginalMember(owner = "client!il", name = "e", descriptor = "Lclient!mr;")
	private Class160 aClass160_1;

	@OriginalMember(owner = "client!il", name = "f", descriptor = "Lclient!jr;")
	private Class127 aClass127_1;

	@OriginalMember(owner = "client!il", name = "g", descriptor = "Lclient!jr;")
	private Class127 aClass127_2;

	@OriginalMember(owner = "client!il", name = "h", descriptor = "Lclient!jr;")
	private Class127 aClass127_3;

	@OriginalMember(owner = "client!il", name = "i", descriptor = "Lclient!jr;")
	private Class127 aClass127_4;

	@OriginalMember(owner = "client!il", name = "k", descriptor = "Lclient!jr;")
	private Class127 aClass127_5;

	@OriginalMember(owner = "client!il", name = "l", descriptor = "Lclient!jr;")
	private Class127 aClass127_6;

	@OriginalMember(owner = "client!il", name = "m", descriptor = "Lclient!jr;")
	private Class127 aClass127_7;

	@OriginalMember(owner = "client!il", name = "o", descriptor = "Lclient!jr;")
	private Class127 aClass127_8;

	@OriginalMember(owner = "client!il", name = "t", descriptor = "Lclient!jr;")
	private Class127 aClass127_9;

	@OriginalMember(owner = "client!il", name = "b", descriptor = "I")
	private int anInt2846 = 100;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "[I")
	private final int[] anIntArray151 = new int[5];

	@OriginalMember(owner = "client!il", name = "d", descriptor = "[I")
	private final int[] anIntArray153 = new int[5];

	@OriginalMember(owner = "client!il", name = "n", descriptor = "[I")
	private final int[] anIntArray155 = new int[5];

	@OriginalMember(owner = "client!il", name = "q", descriptor = "I")
	private int anInt2848 = 0;

	@OriginalMember(owner = "client!il", name = "p", descriptor = "I")
	public int anInt2847 = 500;

	@OriginalMember(owner = "client!il", name = "s", descriptor = "I")
	public int anInt2849 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray154[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray156 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray156[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!dh;)V")
	public void method2337(@OriginalArg(0) Class1_Sub11 arg0) {
		this.aClass127_4 = new Class127();
		this.aClass127_4.method2622(arg0);
		this.aClass127_3 = new Class127();
		this.aClass127_3.method2622(arg0);
		@Pc(21) int local21 = arg0.method4463();
		if (local21 != 0) {
			arg0.anInt5766--;
			this.aClass127_8 = new Class127();
			this.aClass127_8.method2622(arg0);
			this.aClass127_9 = new Class127();
			this.aClass127_9.method2622(arg0);
		}
		local21 = arg0.method4463();
		if (local21 != 0) {
			arg0.anInt5766--;
			this.aClass127_2 = new Class127();
			this.aClass127_2.method2622(arg0);
			this.aClass127_6 = new Class127();
			this.aClass127_6.method2622(arg0);
		}
		local21 = arg0.method4463();
		if (local21 != 0) {
			arg0.anInt5766--;
			this.aClass127_7 = new Class127();
			this.aClass127_7.method2622(arg0);
			this.aClass127_5 = new Class127();
			this.aClass127_5.method2622(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method4469();
			if (local114 == 0) {
				break;
			}
			this.anIntArray153[local109] = local114;
			this.anIntArray151[local109] = arg0.method4449();
			this.anIntArray155[local109] = arg0.method4469();
		}
		this.anInt2848 = arg0.method4469();
		this.anInt2846 = arg0.method4469();
		this.anInt2847 = arg0.method4485();
		this.anInt2849 = arg0.method4485();
		this.aClass160_1 = new Class160();
		this.aClass127_1 = new Class127();
		this.aClass160_1.method3262(arg0, this.aClass127_1);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(III)I")
	private int method2338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray156[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray154[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(II)[I")
	public int[] method2340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static459.method2111(Static173.anIntArray152, 0, arg0);
		if (arg1 < 10) {
			return Static173.anIntArray152;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass127_4.method2619();
		this.aClass127_3.method2619();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass127_8 != null) {
			this.aClass127_8.method2619();
			this.aClass127_9.method2619();
			local24 = (int) ((double) (this.aClass127_8.anInt3170 - this.aClass127_8.anInt3167) * 32.768D / local16);
			local26 = (int) ((double) this.aClass127_8.anInt3167 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass127_2 != null) {
			this.aClass127_2.method2619();
			this.aClass127_6.method2619();
			local63 = (int) ((double) (this.aClass127_2.anInt3170 - this.aClass127_2.anInt3167) * 32.768D / local16);
			local65 = (int) ((double) this.aClass127_2.anInt3167 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray153[local102] != 0) {
				Static173.anIntArray160[local102] = 0;
				Static173.anIntArray158[local102] = (int) ((double) this.anIntArray155[local102] * local16);
				Static173.anIntArray159[local102] = (this.anIntArray153[local102] << 14) / 100;
				Static173.anIntArray157[local102] = (int) ((double) (this.aClass127_4.anInt3170 - this.aClass127_4.anInt3167) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray151[local102]) / local16);
				Static173.anIntArray161[local102] = (int) ((double) this.aClass127_4.anInt3167 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass127_4.method2621(arg0);
			local187 = this.aClass127_3.method2621(arg0);
			if (this.aClass127_8 != null) {
				local195 = this.aClass127_8.method2621(arg0);
				local200 = this.aClass127_9.method2621(arg0);
				local182 += this.method2338(local28, local200, this.aClass127_8.anInt3168) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass127_2 != null) {
				local195 = this.aClass127_2.method2621(arg0);
				local200 = this.aClass127_6.method2621(arg0);
				local187 = local187 * ((this.method2338(local67, local200, this.aClass127_2.anInt3168) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray153[local195] != 0) {
					local200 = local176 + Static173.anIntArray158[local195];
					if (local200 < arg0) {
						Static173.anIntArray152[local200] += this.method2338(Static173.anIntArray160[local195], local187 * Static173.anIntArray159[local195] >> 15, this.aClass127_4.anInt3168);
						Static173.anIntArray160[local195] += (local182 * Static173.anIntArray157[local195] >> 16) + Static173.anIntArray161[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass127_7 != null) {
			this.aClass127_7.method2619();
			this.aClass127_5.method2619();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass127_7.method2621(arg0);
				local352 = this.aClass127_5.method2621(arg0);
				if (local339) {
					local187 = this.aClass127_7.anInt3167 + ((this.aClass127_7.anInt3170 - this.aClass127_7.anInt3167) * local347 >> 8);
				} else {
					local187 = this.aClass127_7.anInt3167 + ((this.aClass127_7.anInt3170 - this.aClass127_7.anInt3167) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static173.anIntArray152[local200] = 0;
				}
			}
		}
		if (this.anInt2848 > 0 && this.anInt2846 > 0) {
			local182 = (int) ((double) this.anInt2848 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static173.anIntArray152[local187] += Static173.anIntArray152[local187 - local182] * this.anInt2846 / 100;
			}
		}
		if (this.aClass160_1.anIntArray219[0] > 0 || this.aClass160_1.anIntArray219[1] > 0) {
			this.aClass127_1.method2619();
			local182 = this.aClass127_1.method2621(arg0 + 1);
			local187 = this.aClass160_1.method3260(0, (float) local182 / 65536.0F);
			local195 = this.aClass160_1.method3260(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static173.anIntArray152[local200 + local187] * (long) Static255.anInt4095 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static173.anIntArray152[local200 + local187 - local519 - 1] * (long) Static255.anIntArrayArray101[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static173.anIntArray152[local200 - local549 - 1] * (long) Static255.anIntArrayArray101[1][local549] >> 16);
					}
					Static173.anIntArray152[local200] = local352;
					local182 = this.aClass127_1.method2621(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static173.anIntArray152[local200 + local187] * (long) Static255.anInt4095 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static173.anIntArray152[local200 + local187 - local519 - 1] * (long) Static255.anIntArrayArray101[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static173.anIntArray152[local200 - local549 - 1] * (long) Static255.anIntArrayArray101[1][local549] >> 16);
						}
						Static173.anIntArray152[local200] = local352;
						local182 = this.aClass127_1.method2621(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static173.anIntArray152[local200 + local187 - local519 - 1] * (long) Static255.anIntArrayArray101[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static173.anIntArray152[local200 - local549 - 1] * (long) Static255.anIntArrayArray101[1][local549] >> 16);
							}
							Static173.anIntArray152[local200] = local352;
							this.aClass127_1.method2621(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass160_1.method3260(0, (float) local182 / 65536.0F);
					local195 = this.aClass160_1.method3260(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static173.anIntArray152[local182] < -32768) {
				Static173.anIntArray152[local182] = -32768;
			}
			if (Static173.anIntArray152[local182] > 32767) {
				Static173.anIntArray152[local182] = 32767;
			}
		}
		return Static173.anIntArray152;
	}
}
