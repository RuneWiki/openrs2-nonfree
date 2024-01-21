import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class36 {

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "[I")
	public static int[] anIntArray169 = new int[32768];

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "[I")
	public static int[] anIntArray170;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Lclient!g;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "Lclient!g;")
	private Class27 aClass27_2;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "Lclient!g;")
	private Class27 aClass27_3;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "Lclient!se;")
	private Class66 aClass66_1;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "Lclient!g;")
	private Class27 aClass27_4;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "Lclient!g;")
	private Class27 aClass27_5;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "Lclient!g;")
	private Class27 aClass27_6;

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "Lclient!g;")
	private Class27 aClass27_7;

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "Lclient!g;")
	private Class27 aClass27_8;

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "Lclient!g;")
	private Class27 aClass27_9;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
	public int anInt1359 = 0;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	public int anInt1357 = 500;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	private int anInt1358 = 0;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "[I")
	private final int[] anIntArray171 = new int[5];

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "[I")
	private final int[] anIntArray172 = new int[5];

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
	private int anInt1360 = 100;

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "[I")
	private final int[] anIntArray173 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray169[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray170 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray170[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)I")
	private int method948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray170[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray169[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[I")
	public int[] method949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static135.method110(Static53.anIntArray168, 0, arg0);
		if (arg1 < 10) {
			return Static53.anIntArray168;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass27_4.method635();
		this.aClass27_5.method635();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass27_6 != null) {
			this.aClass27_6.method635();
			this.aClass27_3.method635();
			local24 = (int) ((double) (this.aClass27_6.anInt984 - this.aClass27_6.anInt987) * 32.768D / local16);
			local26 = (int) ((double) this.aClass27_6.anInt987 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass27_9 != null) {
			this.aClass27_9.method635();
			this.aClass27_7.method635();
			local63 = (int) ((double) (this.aClass27_9.anInt984 - this.aClass27_9.anInt987) * 32.768D / local16);
			local65 = (int) ((double) this.aClass27_9.anInt987 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray173[local102] != 0) {
				Static53.anIntArray176[local102] = 0;
				Static53.anIntArray175[local102] = (int) ((double) this.anIntArray171[local102] * local16);
				Static53.anIntArray178[local102] = (this.anIntArray173[local102] << 14) / 100;
				Static53.anIntArray177[local102] = (int) ((double) (this.aClass27_4.anInt984 - this.aClass27_4.anInt987) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray172[local102]) / local16);
				Static53.anIntArray174[local102] = (int) ((double) this.aClass27_4.anInt987 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass27_4.method638(arg0);
			local187 = this.aClass27_5.method638(arg0);
			if (this.aClass27_6 != null) {
				local195 = this.aClass27_6.method638(arg0);
				local200 = this.aClass27_3.method638(arg0);
				local182 += this.method948(local28, local200, this.aClass27_6.anInt985) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass27_9 != null) {
				local195 = this.aClass27_9.method638(arg0);
				local200 = this.aClass27_7.method638(arg0);
				local187 = local187 * ((this.method948(local67, local200, this.aClass27_9.anInt985) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray173[local195] != 0) {
					local200 = local176 + Static53.anIntArray175[local195];
					if (local200 < arg0) {
						Static53.anIntArray168[local200] += this.method948(Static53.anIntArray176[local195], local187 * Static53.anIntArray178[local195] >> 15, this.aClass27_4.anInt985);
						Static53.anIntArray176[local195] += (local182 * Static53.anIntArray177[local195] >> 16) + Static53.anIntArray174[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass27_1 != null) {
			this.aClass27_1.method635();
			this.aClass27_2.method635();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass27_1.method638(arg0);
				local352 = this.aClass27_2.method638(arg0);
				if (local339) {
					local187 = this.aClass27_1.anInt987 + ((this.aClass27_1.anInt984 - this.aClass27_1.anInt987) * local347 >> 8);
				} else {
					local187 = this.aClass27_1.anInt987 + ((this.aClass27_1.anInt984 - this.aClass27_1.anInt987) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static53.anIntArray168[local200] = 0;
				}
			}
		}
		if (this.anInt1358 > 0 && this.anInt1360 > 0) {
			local182 = (int) ((double) this.anInt1358 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static53.anIntArray168[local187] += Static53.anIntArray168[local187 - local182] * this.anInt1360 / 100;
			}
		}
		if (this.aClass66_1.anIntArray343[0] > 0 || this.aClass66_1.anIntArray343[1] > 0) {
			this.aClass27_8.method635();
			local182 = this.aClass27_8.method638(arg0 + 1);
			local187 = this.aClass66_1.method1666(0, (float) local182 / 65536.0F);
			local195 = this.aClass66_1.method1666(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static53.anIntArray168[local200 + local187] * (long) Static109.anInt2394 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static53.anIntArray168[local200 + local187 - local519 - 1] * (long) Static109.anIntArrayArray21[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static53.anIntArray168[local200 - local549 - 1] * (long) Static109.anIntArrayArray21[1][local549] >> 16);
					}
					Static53.anIntArray168[local200] = local352;
					local182 = this.aClass27_8.method638(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static53.anIntArray168[local200 + local187] * (long) Static109.anInt2394 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static53.anIntArray168[local200 + local187 - local519 - 1] * (long) Static109.anIntArrayArray21[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static53.anIntArray168[local200 - local549 - 1] * (long) Static109.anIntArrayArray21[1][local549] >> 16);
						}
						Static53.anIntArray168[local200] = local352;
						local182 = this.aClass27_8.method638(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static53.anIntArray168[local200 + local187 - local519 - 1] * (long) Static109.anIntArrayArray21[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static53.anIntArray168[local200 - local549 - 1] * (long) Static109.anIntArrayArray21[1][local549] >> 16);
							}
							Static53.anIntArray168[local200] = local352;
							this.aClass27_8.method638(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass66_1.method1666(0, (float) local182 / 65536.0F);
					local195 = this.aClass66_1.method1666(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static53.anIntArray168[local182] < -32768) {
				Static53.anIntArray168[local182] = -32768;
			}
			if (Static53.anIntArray168[local182] > 32767) {
				Static53.anIntArray168[local182] = 32767;
			}
		}
		return Static53.anIntArray168;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ne;)V")
	public void method950(@OriginalArg(0) Class4_Sub10 arg0) {
		this.aClass27_4 = new Class27();
		this.aClass27_4.method637(arg0);
		this.aClass27_5 = new Class27();
		this.aClass27_5.method637(arg0);
		@Pc(21) int local21 = arg0.method599();
		if (local21 != 0) {
			arg0.anInt931--;
			this.aClass27_6 = new Class27();
			this.aClass27_6.method637(arg0);
			this.aClass27_3 = new Class27();
			this.aClass27_3.method637(arg0);
		}
		local21 = arg0.method599();
		if (local21 != 0) {
			arg0.anInt931--;
			this.aClass27_9 = new Class27();
			this.aClass27_9.method637(arg0);
			this.aClass27_7 = new Class27();
			this.aClass27_7.method637(arg0);
		}
		local21 = arg0.method599();
		if (local21 != 0) {
			arg0.anInt931--;
			this.aClass27_1 = new Class27();
			this.aClass27_1.method637(arg0);
			this.aClass27_2 = new Class27();
			this.aClass27_2.method637(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method568();
			if (local114 == 0) {
				break;
			}
			this.anIntArray173[local109] = local114;
			this.anIntArray172[local109] = arg0.method580();
			this.anIntArray171[local109] = arg0.method568();
		}
		this.anInt1358 = arg0.method568();
		this.anInt1360 = arg0.method568();
		this.anInt1357 = arg0.method604();
		this.anInt1359 = arg0.method604();
		this.aClass66_1 = new Class66();
		this.aClass27_8 = new Class27();
		this.aClass66_1.method1669(arg0, this.aClass27_8);
	}
}
