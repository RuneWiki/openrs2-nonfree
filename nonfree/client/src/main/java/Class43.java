import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class43 {

	@OriginalMember(owner = "client!dg", name = "t", descriptor = "[I")
	private static final int[] anIntArray84 = new int[32768];

	@OriginalMember(owner = "client!dg", name = "r", descriptor = "[I")
	private static final int[] anIntArray83;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "Lclient!rs;")
	private Class179 aClass179_1;

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "Lclient!rs;")
	private Class179 aClass179_2;

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "Lclient!rs;")
	private Class179 aClass179_3;

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "Lclient!rs;")
	private Class179 aClass179_4;

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "Lclient!rs;")
	private Class179 aClass179_5;

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "Lclient!rs;")
	private Class179 aClass179_6;

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "Lclient!ec;")
	private Class52 aClass52_1;

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "Lclient!rs;")
	private Class179 aClass179_7;

	@OriginalMember(owner = "client!dg", name = "q", descriptor = "Lclient!rs;")
	private Class179 aClass179_8;

	@OriginalMember(owner = "client!dg", name = "s", descriptor = "Lclient!rs;")
	private Class179 aClass179_9;

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
	public int anInt1267 = 0;

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
	private int anInt1269 = 100;

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "[I")
	private final int[] anIntArray79 = new int[5];

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
	public int anInt1268 = 500;

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
	private int anInt1266 = 0;

	@OriginalMember(owner = "client!dg", name = "o", descriptor = "[I")
	private final int[] anIntArray81 = new int[5];

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "[I")
	private final int[] anIntArray82 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray84[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray83 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray83[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)I")
	private int method1017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray83[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray84[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!nj;)V")
	public void method1019(@OriginalArg(0) Class1_Sub21 arg0) {
		this.aClass179_9 = new Class179();
		this.aClass179_9.method4885(arg0);
		this.aClass179_1 = new Class179();
		this.aClass179_1.method4885(arg0);
		@Pc(21) int local21 = arg0.method5720();
		if (local21 != 0) {
			arg0.anInt6611--;
			this.aClass179_4 = new Class179();
			this.aClass179_4.method4885(arg0);
			this.aClass179_7 = new Class179();
			this.aClass179_7.method4885(arg0);
		}
		local21 = arg0.method5720();
		if (local21 != 0) {
			arg0.anInt6611--;
			this.aClass179_2 = new Class179();
			this.aClass179_2.method4885(arg0);
			this.aClass179_3 = new Class179();
			this.aClass179_3.method4885(arg0);
		}
		local21 = arg0.method5720();
		if (local21 != 0) {
			arg0.anInt6611--;
			this.aClass179_6 = new Class179();
			this.aClass179_6.method4885(arg0);
			this.aClass179_8 = new Class179();
			this.aClass179_8.method4885(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method5699();
			if (local114 == 0) {
				break;
			}
			this.anIntArray81[local109] = local114;
			this.anIntArray79[local109] = arg0.method5723();
			this.anIntArray82[local109] = arg0.method5699();
		}
		this.anInt1266 = arg0.method5699();
		this.anInt1269 = arg0.method5699();
		this.anInt1268 = arg0.method5715();
		this.anInt1267 = arg0.method5715();
		this.aClass52_1 = new Class52();
		this.aClass179_5 = new Class179();
		this.aClass52_1.method1197(arg0, this.aClass179_5);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[I")
	public int[] method1020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static361.method1855(Static52.anIntArray80, 0, arg0);
		if (arg1 < 10) {
			return Static52.anIntArray80;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass179_9.method4884();
		this.aClass179_1.method4884();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass179_4 != null) {
			this.aClass179_4.method4884();
			this.aClass179_7.method4884();
			local24 = (int) ((double) (this.aClass179_4.anInt5581 - this.aClass179_4.anInt5583) * 32.768D / local16);
			local26 = (int) ((double) this.aClass179_4.anInt5583 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass179_2 != null) {
			this.aClass179_2.method4884();
			this.aClass179_3.method4884();
			local63 = (int) ((double) (this.aClass179_2.anInt5581 - this.aClass179_2.anInt5583) * 32.768D / local16);
			local65 = (int) ((double) this.aClass179_2.anInt5583 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray81[local102] != 0) {
				Static52.anIntArray85[local102] = 0;
				Static52.anIntArray86[local102] = (int) ((double) this.anIntArray82[local102] * local16);
				Static52.anIntArray88[local102] = (this.anIntArray81[local102] << 14) / 100;
				Static52.anIntArray87[local102] = (int) ((double) (this.aClass179_9.anInt5581 - this.aClass179_9.anInt5583) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray79[local102]) / local16);
				Static52.anIntArray89[local102] = (int) ((double) this.aClass179_9.anInt5583 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass179_9.method4886(arg0);
			local187 = this.aClass179_1.method4886(arg0);
			if (this.aClass179_4 != null) {
				local195 = this.aClass179_4.method4886(arg0);
				local200 = this.aClass179_7.method4886(arg0);
				local182 += this.method1017(local28, local200, this.aClass179_4.anInt5584) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass179_2 != null) {
				local195 = this.aClass179_2.method4886(arg0);
				local200 = this.aClass179_3.method4886(arg0);
				local187 = local187 * ((this.method1017(local67, local200, this.aClass179_2.anInt5584) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray81[local195] != 0) {
					local200 = local176 + Static52.anIntArray86[local195];
					if (local200 < arg0) {
						Static52.anIntArray80[local200] += this.method1017(Static52.anIntArray85[local195], local187 * Static52.anIntArray88[local195] >> 15, this.aClass179_9.anInt5584);
						Static52.anIntArray85[local195] += (local182 * Static52.anIntArray87[local195] >> 16) + Static52.anIntArray89[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass179_6 != null) {
			this.aClass179_6.method4884();
			this.aClass179_8.method4884();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass179_6.method4886(arg0);
				local352 = this.aClass179_8.method4886(arg0);
				if (local339) {
					local187 = this.aClass179_6.anInt5583 + ((this.aClass179_6.anInt5581 - this.aClass179_6.anInt5583) * local347 >> 8);
				} else {
					local187 = this.aClass179_6.anInt5583 + ((this.aClass179_6.anInt5581 - this.aClass179_6.anInt5583) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static52.anIntArray80[local200] = 0;
				}
			}
		}
		if (this.anInt1266 > 0 && this.anInt1269 > 0) {
			local182 = (int) ((double) this.anInt1266 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static52.anIntArray80[local187] += Static52.anIntArray80[local187 - local182] * this.anInt1269 / 100;
			}
		}
		if (this.aClass52_1.anIntArray102[0] > 0 || this.aClass52_1.anIntArray102[1] > 0) {
			this.aClass179_5.method4884();
			local182 = this.aClass179_5.method4886(arg0 + 1);
			local187 = this.aClass52_1.method1195(0, (float) local182 / 65536.0F);
			local195 = this.aClass52_1.method1195(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static52.anIntArray80[local200 + local187] * (long) Static65.anInt1444 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static52.anIntArray80[local200 + local187 - local519 - 1] * (long) Static65.anIntArrayArray9[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static52.anIntArray80[local200 - local549 - 1] * (long) Static65.anIntArrayArray9[1][local549] >> 16);
					}
					Static52.anIntArray80[local200] = local352;
					local182 = this.aClass179_5.method4886(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static52.anIntArray80[local200 + local187] * (long) Static65.anInt1444 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static52.anIntArray80[local200 + local187 - local519 - 1] * (long) Static65.anIntArrayArray9[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static52.anIntArray80[local200 - local549 - 1] * (long) Static65.anIntArrayArray9[1][local549] >> 16);
						}
						Static52.anIntArray80[local200] = local352;
						local182 = this.aClass179_5.method4886(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static52.anIntArray80[local200 + local187 - local519 - 1] * (long) Static65.anIntArrayArray9[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static52.anIntArray80[local200 - local549 - 1] * (long) Static65.anIntArrayArray9[1][local549] >> 16);
							}
							Static52.anIntArray80[local200] = local352;
							this.aClass179_5.method4886(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass52_1.method1195(0, (float) local182 / 65536.0F);
					local195 = this.aClass52_1.method1195(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static52.anIntArray80[local182] < -32768) {
				Static52.anIntArray80[local182] = -32768;
			}
			if (Static52.anIntArray80[local182] > 32767) {
				Static52.anIntArray80[local182] = 32767;
			}
		}
		return Static52.anIntArray80;
	}
}
