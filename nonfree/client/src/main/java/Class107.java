import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class107 {

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "[I")
	private static final int[] anIntArray160 = new int[32768];

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "[I")
	private static final int[] anIntArray161;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "Lclient!tb;")
	private Class319 aClass319_1;

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "Lclient!tb;")
	private Class319 aClass319_2;

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "Lclient!tb;")
	private Class319 aClass319_3;

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "Lclient!tb;")
	private Class319 aClass319_4;

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "Lclient!tb;")
	private Class319 aClass319_5;

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "Lclient!tb;")
	private Class319 aClass319_6;

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "Lclient!nca;")
	private Class221 aClass221_1;

	@OriginalMember(owner = "client!ga", name = "o", descriptor = "Lclient!tb;")
	private Class319 aClass319_7;

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "Lclient!tb;")
	private Class319 aClass319_8;

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "Lclient!tb;")
	private Class319 aClass319_9;

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
	private int anInt3292 = 100;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
	private int anInt3291 = 0;

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "[I")
	private final int[] anIntArray159 = new int[5];

	@OriginalMember(owner = "client!ga", name = "q", descriptor = "[I")
	private final int[] anIntArray163 = new int[5];

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "[I")
	private final int[] anIntArray164 = new int[5];

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
	public int anInt3293 = 500;

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
	public int anInt3294 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray160[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray161 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray161[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)[I")
	public int[] method2960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static601.method2821(Static163.anIntArray162, 0, arg0);
		if (arg1 < 10) {
			return Static163.anIntArray162;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass319_8.method6751();
		this.aClass319_7.method6751();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass319_4 != null) {
			this.aClass319_4.method6751();
			this.aClass319_9.method6751();
			local24 = (int) ((double) (this.aClass319_4.anInt8117 - this.aClass319_4.anInt8116) * 32.768D / local16);
			local26 = (int) ((double) this.aClass319_4.anInt8116 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass319_6 != null) {
			this.aClass319_6.method6751();
			this.aClass319_3.method6751();
			local63 = (int) ((double) (this.aClass319_6.anInt8117 - this.aClass319_6.anInt8116) * 32.768D / local16);
			local65 = (int) ((double) this.aClass319_6.anInt8116 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray164[local102] != 0) {
				Static163.anIntArray167[local102] = 0;
				Static163.anIntArray169[local102] = (int) ((double) this.anIntArray159[local102] * local16);
				Static163.anIntArray166[local102] = (this.anIntArray164[local102] << 14) / 100;
				Static163.anIntArray168[local102] = (int) ((double) (this.aClass319_8.anInt8117 - this.aClass319_8.anInt8116) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray163[local102]) / local16);
				Static163.anIntArray165[local102] = (int) ((double) this.aClass319_8.anInt8116 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass319_8.method6752(arg0);
			local187 = this.aClass319_7.method6752(arg0);
			if (this.aClass319_4 != null) {
				local195 = this.aClass319_4.method6752(arg0);
				local200 = this.aClass319_9.method6752(arg0);
				local182 += this.method2961(local28, local200, this.aClass319_4.anInt8119) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass319_6 != null) {
				local195 = this.aClass319_6.method6752(arg0);
				local200 = this.aClass319_3.method6752(arg0);
				local187 = local187 * ((this.method2961(local67, local200, this.aClass319_6.anInt8119) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray164[local195] != 0) {
					local200 = local176 + Static163.anIntArray169[local195];
					if (local200 < arg0) {
						Static163.anIntArray162[local200] += this.method2961(Static163.anIntArray167[local195], local187 * Static163.anIntArray166[local195] >> 15, this.aClass319_8.anInt8119);
						Static163.anIntArray167[local195] += (local182 * Static163.anIntArray168[local195] >> 16) + Static163.anIntArray165[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass319_2 != null) {
			this.aClass319_2.method6751();
			this.aClass319_1.method6751();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass319_2.method6752(arg0);
				local352 = this.aClass319_1.method6752(arg0);
				if (local339) {
					local187 = this.aClass319_2.anInt8116 + ((this.aClass319_2.anInt8117 - this.aClass319_2.anInt8116) * local347 >> 8);
				} else {
					local187 = this.aClass319_2.anInt8116 + ((this.aClass319_2.anInt8117 - this.aClass319_2.anInt8116) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static163.anIntArray162[local200] = 0;
				}
			}
		}
		if (this.anInt3291 > 0 && this.anInt3292 > 0) {
			local182 = (int) ((double) this.anInt3291 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static163.anIntArray162[local187] += Static163.anIntArray162[local187 - local182] * this.anInt3292 / 100;
			}
		}
		if (this.aClass221_1.anIntArray334[0] > 0 || this.aClass221_1.anIntArray334[1] > 0) {
			this.aClass319_5.method6751();
			local182 = this.aClass319_5.method6752(arg0 + 1);
			local187 = this.aClass221_1.method5139(0, (float) local182 / 65536.0F);
			local195 = this.aClass221_1.method5139(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static163.anIntArray162[local200 + local187] * (long) Static349.anInt6076 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static163.anIntArray162[local200 + local187 - local519 - 1] * (long) Static349.anIntArrayArray135[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static163.anIntArray162[local200 - local549 - 1] * (long) Static349.anIntArrayArray135[1][local549] >> 16);
					}
					Static163.anIntArray162[local200] = local352;
					local182 = this.aClass319_5.method6752(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static163.anIntArray162[local200 + local187] * (long) Static349.anInt6076 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static163.anIntArray162[local200 + local187 - local519 - 1] * (long) Static349.anIntArrayArray135[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static163.anIntArray162[local200 - local549 - 1] * (long) Static349.anIntArrayArray135[1][local549] >> 16);
						}
						Static163.anIntArray162[local200] = local352;
						local182 = this.aClass319_5.method6752(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static163.anIntArray162[local200 + local187 - local519 - 1] * (long) Static349.anIntArrayArray135[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static163.anIntArray162[local200 - local549 - 1] * (long) Static349.anIntArrayArray135[1][local549] >> 16);
							}
							Static163.anIntArray162[local200] = local352;
							this.aClass319_5.method6752(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass221_1.method5139(0, (float) local182 / 65536.0F);
					local195 = this.aClass221_1.method5139(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static163.anIntArray162[local182] < -32768) {
				Static163.anIntArray162[local182] = -32768;
			}
			if (Static163.anIntArray162[local182] > 32767) {
				Static163.anIntArray162[local182] = 32767;
			}
		}
		return Static163.anIntArray162;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)I")
	private int method2961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray161[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray160[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!np;)V")
	public void method2962(@OriginalArg(0) Class3_Sub11 arg0) {
		this.aClass319_8 = new Class319();
		this.aClass319_8.method6750(arg0);
		this.aClass319_7 = new Class319();
		this.aClass319_7.method6750(arg0);
		@Pc(21) int local21 = arg0.method5175();
		if (local21 != 0) {
			arg0.anInt6128--;
			this.aClass319_4 = new Class319();
			this.aClass319_4.method6750(arg0);
			this.aClass319_9 = new Class319();
			this.aClass319_9.method6750(arg0);
		}
		local21 = arg0.method5175();
		if (local21 != 0) {
			arg0.anInt6128--;
			this.aClass319_6 = new Class319();
			this.aClass319_6.method6750(arg0);
			this.aClass319_3 = new Class319();
			this.aClass319_3.method6750(arg0);
		}
		local21 = arg0.method5175();
		if (local21 != 0) {
			arg0.anInt6128--;
			this.aClass319_2 = new Class319();
			this.aClass319_2.method6750(arg0);
			this.aClass319_1 = new Class319();
			this.aClass319_1.method6750(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method5217();
			if (local114 == 0) {
				break;
			}
			this.anIntArray164[local109] = local114;
			this.anIntArray163[local109] = arg0.method5172();
			this.anIntArray159[local109] = arg0.method5217();
		}
		this.anInt3291 = arg0.method5217();
		this.anInt3292 = arg0.method5217();
		this.anInt3293 = arg0.method5198();
		this.anInt3294 = arg0.method5198();
		this.aClass221_1 = new Class221();
		this.aClass319_5 = new Class319();
		this.aClass221_1.method5138(arg0, this.aClass319_5);
	}
}
