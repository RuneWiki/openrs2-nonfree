import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class301 {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "[I")
	private static final int[] anIntArray697 = new int[32768];

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "[I")
	private static final int[] anIntArray700;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Lclient!vca;")
	private Class362 aClass362_1;

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "Lclient!vca;")
	private Class362 aClass362_2;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "Lclient!nl;")
	private Class241 aClass241_1;

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "Lclient!vca;")
	private Class362 aClass362_3;

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "Lclient!vca;")
	private Class362 aClass362_4;

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "Lclient!vca;")
	private Class362 aClass362_5;

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "Lclient!vca;")
	private Class362 aClass362_6;

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "Lclient!vca;")
	private Class362 aClass362_7;

	@OriginalMember(owner = "client!rf", name = "s", descriptor = "Lclient!vca;")
	private Class362 aClass362_8;

	@OriginalMember(owner = "client!rf", name = "t", descriptor = "Lclient!vca;")
	private Class362 aClass362_9;

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "[I")
	private final int[] anIntArray698 = new int[5];

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
	public int anInt8337 = 500;

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
	public int anInt8338 = 0;

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "[I")
	private final int[] anIntArray702 = new int[5];

	@OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
	private int anInt8339 = 100;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "[I")
	private final int[] anIntArray699 = new int[5];

	@OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
	private int anInt8340 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray697[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray700 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray700[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)I")
	private int method7269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray700[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray697[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)[I")
	public int[] method7270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static684.method5325(Static517.anIntArray701, 0, arg0);
		if (arg1 < 10) {
			return Static517.anIntArray701;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass362_1.method8784();
		this.aClass362_4.method8784();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass362_7 != null) {
			this.aClass362_7.method8784();
			this.aClass362_6.method8784();
			local24 = (int) ((double) (this.aClass362_7.anInt10027 - this.aClass362_7.anInt10028) * 32.768D / local16);
			local26 = (int) ((double) this.aClass362_7.anInt10028 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass362_9 != null) {
			this.aClass362_9.method8784();
			this.aClass362_5.method8784();
			local63 = (int) ((double) (this.aClass362_9.anInt10027 - this.aClass362_9.anInt10028) * 32.768D / local16);
			local65 = (int) ((double) this.aClass362_9.anInt10028 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray702[local102] != 0) {
				Static517.anIntArray703[local102] = 0;
				Static517.anIntArray705[local102] = (int) ((double) this.anIntArray698[local102] * local16);
				Static517.anIntArray707[local102] = (this.anIntArray702[local102] << 14) / 100;
				Static517.anIntArray704[local102] = (int) ((double) (this.aClass362_1.anInt10027 - this.aClass362_1.anInt10028) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray699[local102]) / local16);
				Static517.anIntArray706[local102] = (int) ((double) this.aClass362_1.anInt10028 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass362_1.method8783(arg0);
			local187 = this.aClass362_4.method8783(arg0);
			if (this.aClass362_7 != null) {
				local195 = this.aClass362_7.method8783(arg0);
				local200 = this.aClass362_6.method8783(arg0);
				local182 += this.method7269(local28, local200, this.aClass362_7.anInt10025) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass362_9 != null) {
				local195 = this.aClass362_9.method8783(arg0);
				local200 = this.aClass362_5.method8783(arg0);
				local187 = local187 * ((this.method7269(local67, local200, this.aClass362_9.anInt10025) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray702[local195] != 0) {
					local200 = local176 + Static517.anIntArray705[local195];
					if (local200 < arg0) {
						Static517.anIntArray701[local200] += this.method7269(Static517.anIntArray703[local195], local187 * Static517.anIntArray707[local195] >> 15, this.aClass362_1.anInt10025);
						Static517.anIntArray703[local195] += (local182 * Static517.anIntArray704[local195] >> 16) + Static517.anIntArray706[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass362_2 != null) {
			this.aClass362_2.method8784();
			this.aClass362_8.method8784();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass362_2.method8783(arg0);
				local352 = this.aClass362_8.method8783(arg0);
				if (local339) {
					local187 = this.aClass362_2.anInt10028 + ((this.aClass362_2.anInt10027 - this.aClass362_2.anInt10028) * local347 >> 8);
				} else {
					local187 = this.aClass362_2.anInt10028 + ((this.aClass362_2.anInt10027 - this.aClass362_2.anInt10028) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static517.anIntArray701[local200] = 0;
				}
			}
		}
		if (this.anInt8340 > 0 && this.anInt8339 > 0) {
			local182 = (int) ((double) this.anInt8340 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static517.anIntArray701[local187] += Static517.anIntArray701[local187 - local182] * this.anInt8339 / 100;
			}
		}
		if (this.aClass241_1.anIntArray574[0] > 0 || this.aClass241_1.anIntArray574[1] > 0) {
			this.aClass362_3.method8784();
			local182 = this.aClass362_3.method8783(arg0 + 1);
			local187 = this.aClass241_1.method5766(0, (float) local182 / 65536.0F);
			local195 = this.aClass241_1.method5766(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static517.anIntArray701[local200 + local187] * (long) Static407.anInt6473 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static517.anIntArray701[local200 + local187 - local519 - 1] * (long) Static407.anIntArrayArray43[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static517.anIntArray701[local200 - local549 - 1] * (long) Static407.anIntArrayArray43[1][local549] >> 16);
					}
					Static517.anIntArray701[local200] = local352;
					local182 = this.aClass362_3.method8783(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static517.anIntArray701[local200 + local187] * (long) Static407.anInt6473 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static517.anIntArray701[local200 + local187 - local519 - 1] * (long) Static407.anIntArrayArray43[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static517.anIntArray701[local200 - local549 - 1] * (long) Static407.anIntArrayArray43[1][local549] >> 16);
						}
						Static517.anIntArray701[local200] = local352;
						local182 = this.aClass362_3.method8783(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static517.anIntArray701[local200 + local187 - local519 - 1] * (long) Static407.anIntArrayArray43[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static517.anIntArray701[local200 - local549 - 1] * (long) Static407.anIntArrayArray43[1][local549] >> 16);
							}
							Static517.anIntArray701[local200] = local352;
							this.aClass362_3.method8783(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass241_1.method5766(0, (float) local182 / 65536.0F);
					local195 = this.aClass241_1.method5766(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static517.anIntArray701[local182] < -32768) {
				Static517.anIntArray701[local182] = -32768;
			}
			if (Static517.anIntArray701[local182] > 32767) {
				Static517.anIntArray701[local182] = 32767;
			}
		}
		return Static517.anIntArray701;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!jp;)V")
	public void method7272(@OriginalArg(0) Class3_Sub25 arg0) {
		this.aClass362_1 = new Class362();
		this.aClass362_1.method8782(arg0);
		this.aClass362_4 = new Class362();
		this.aClass362_4.method8782(arg0);
		@Pc(21) int local21 = arg0.method8632();
		if (local21 != 0) {
			arg0.anInt9765--;
			this.aClass362_7 = new Class362();
			this.aClass362_7.method8782(arg0);
			this.aClass362_6 = new Class362();
			this.aClass362_6.method8782(arg0);
		}
		local21 = arg0.method8632();
		if (local21 != 0) {
			arg0.anInt9765--;
			this.aClass362_9 = new Class362();
			this.aClass362_9.method8782(arg0);
			this.aClass362_5 = new Class362();
			this.aClass362_5.method8782(arg0);
		}
		local21 = arg0.method8632();
		if (local21 != 0) {
			arg0.anInt9765--;
			this.aClass362_2 = new Class362();
			this.aClass362_2.method8782(arg0);
			this.aClass362_8 = new Class362();
			this.aClass362_8.method8782(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method8604();
			if (local114 == 0) {
				break;
			}
			this.anIntArray702[local109] = local114;
			this.anIntArray699[local109] = arg0.method8591();
			this.anIntArray698[local109] = arg0.method8604();
		}
		this.anInt8340 = arg0.method8604();
		this.anInt8339 = arg0.method8604();
		this.anInt8337 = arg0.method8593();
		this.anInt8338 = arg0.method8593();
		this.aClass241_1 = new Class241();
		this.aClass362_3 = new Class362();
		this.aClass241_1.method5768(arg0, this.aClass362_3);
	}
}
