import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class108 {

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "[I")
	private static final int[] anIntArray286 = new int[32768];

	@OriginalMember(owner = "client!jo", name = "l", descriptor = "[I")
	private static final int[] anIntArray289;

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "Lclient!dl;")
	private Class44 aClass44_1;

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "Lclient!dl;")
	private Class44 aClass44_2;

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "Lclient!dl;")
	private Class44 aClass44_3;

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "Lclient!rq;")
	private Class178 aClass178_1;

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "Lclient!dl;")
	private Class44 aClass44_4;

	@OriginalMember(owner = "client!jo", name = "i", descriptor = "Lclient!dl;")
	private Class44 aClass44_5;

	@OriginalMember(owner = "client!jo", name = "k", descriptor = "Lclient!dl;")
	private Class44 aClass44_6;

	@OriginalMember(owner = "client!jo", name = "m", descriptor = "Lclient!dl;")
	private Class44 aClass44_7;

	@OriginalMember(owner = "client!jo", name = "q", descriptor = "Lclient!dl;")
	private Class44 aClass44_8;

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "Lclient!dl;")
	private Class44 aClass44_9;

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "[I")
	private final int[] anIntArray287 = new int[5];

	@OriginalMember(owner = "client!jo", name = "j", descriptor = "[I")
	private final int[] anIntArray288 = new int[5];

	@OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
	public int anInt3332 = 500;

	@OriginalMember(owner = "client!jo", name = "n", descriptor = "I")
	public int anInt3330 = 0;

	@OriginalMember(owner = "client!jo", name = "v", descriptor = "[I")
	private final int[] anIntArray293 = new int[5];

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
	private int anInt3329 = 0;

	@OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
	private int anInt3331 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray286[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray289 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray289[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!lf;)V")
	public void method3028(@OriginalArg(0) Class4_Sub11 arg0) {
		this.aClass44_4 = new Class44();
		this.aClass44_4.method1287(arg0);
		this.aClass44_9 = new Class44();
		this.aClass44_9.method1287(arg0);
		@Pc(21) int local21 = arg0.method3440();
		if (local21 != 0) {
			arg0.anInt3768--;
			this.aClass44_7 = new Class44();
			this.aClass44_7.method1287(arg0);
			this.aClass44_8 = new Class44();
			this.aClass44_8.method1287(arg0);
		}
		local21 = arg0.method3440();
		if (local21 != 0) {
			arg0.anInt3768--;
			this.aClass44_1 = new Class44();
			this.aClass44_1.method1287(arg0);
			this.aClass44_3 = new Class44();
			this.aClass44_3.method1287(arg0);
		}
		local21 = arg0.method3440();
		if (local21 != 0) {
			arg0.anInt3768--;
			this.aClass44_2 = new Class44();
			this.aClass44_2.method1287(arg0);
			this.aClass44_5 = new Class44();
			this.aClass44_5.method1287(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method3457();
			if (local114 == 0) {
				break;
			}
			this.anIntArray288[local109] = local114;
			this.anIntArray293[local109] = arg0.method3406();
			this.anIntArray287[local109] = arg0.method3457();
		}
		this.anInt3329 = arg0.method3457();
		this.anInt3331 = arg0.method3457();
		this.anInt3332 = arg0.method3401();
		this.anInt3330 = arg0.method3401();
		this.aClass178_1 = new Class178();
		this.aClass44_6 = new Class44();
		this.aClass178_1.method4769(arg0, this.aClass44_6);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)[I")
	public int[] method3029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static359.method766(Static154.anIntArray290, 0, arg0);
		if (arg1 < 10) {
			return Static154.anIntArray290;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass44_4.method1289();
		this.aClass44_9.method1289();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass44_7 != null) {
			this.aClass44_7.method1289();
			this.aClass44_8.method1289();
			local24 = (int) ((double) (this.aClass44_7.anInt1593 - this.aClass44_7.anInt1594) * 32.768D / local16);
			local26 = (int) ((double) this.aClass44_7.anInt1594 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass44_1 != null) {
			this.aClass44_1.method1289();
			this.aClass44_3.method1289();
			local63 = (int) ((double) (this.aClass44_1.anInt1593 - this.aClass44_1.anInt1594) * 32.768D / local16);
			local65 = (int) ((double) this.aClass44_1.anInt1594 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray288[local102] != 0) {
				Static154.anIntArray294[local102] = 0;
				Static154.anIntArray295[local102] = (int) ((double) this.anIntArray287[local102] * local16);
				Static154.anIntArray291[local102] = (this.anIntArray288[local102] << 14) / 100;
				Static154.anIntArray296[local102] = (int) ((double) (this.aClass44_4.anInt1593 - this.aClass44_4.anInt1594) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray293[local102]) / local16);
				Static154.anIntArray292[local102] = (int) ((double) this.aClass44_4.anInt1594 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass44_4.method1286(arg0);
			local187 = this.aClass44_9.method1286(arg0);
			if (this.aClass44_7 != null) {
				local195 = this.aClass44_7.method1286(arg0);
				local200 = this.aClass44_8.method1286(arg0);
				local182 += this.method3030(local28, local200, this.aClass44_7.anInt1592) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass44_1 != null) {
				local195 = this.aClass44_1.method1286(arg0);
				local200 = this.aClass44_3.method1286(arg0);
				local187 = local187 * ((this.method3030(local67, local200, this.aClass44_1.anInt1592) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray288[local195] != 0) {
					local200 = local176 + Static154.anIntArray295[local195];
					if (local200 < arg0) {
						Static154.anIntArray290[local200] += this.method3030(Static154.anIntArray294[local195], local187 * Static154.anIntArray291[local195] >> 15, this.aClass44_4.anInt1592);
						Static154.anIntArray294[local195] += (local182 * Static154.anIntArray296[local195] >> 16) + Static154.anIntArray292[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass44_2 != null) {
			this.aClass44_2.method1289();
			this.aClass44_5.method1289();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass44_2.method1286(arg0);
				local352 = this.aClass44_5.method1286(arg0);
				if (local339) {
					local187 = this.aClass44_2.anInt1594 + ((this.aClass44_2.anInt1593 - this.aClass44_2.anInt1594) * local347 >> 8);
				} else {
					local187 = this.aClass44_2.anInt1594 + ((this.aClass44_2.anInt1593 - this.aClass44_2.anInt1594) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static154.anIntArray290[local200] = 0;
				}
			}
		}
		if (this.anInt3329 > 0 && this.anInt3331 > 0) {
			local182 = (int) ((double) this.anInt3329 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static154.anIntArray290[local187] += Static154.anIntArray290[local187 - local182] * this.anInt3331 / 100;
			}
		}
		if (this.aClass178_1.anIntArray453[0] > 0 || this.aClass178_1.anIntArray453[1] > 0) {
			this.aClass44_6.method1289();
			local182 = this.aClass44_6.method1286(arg0 + 1);
			local187 = this.aClass178_1.method4770(0, (float) local182 / 65536.0F);
			local195 = this.aClass178_1.method4770(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static154.anIntArray290[local200 + local187] * (long) Static279.anInt5521 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static154.anIntArray290[local200 + local187 - local519 - 1] * (long) Static279.anIntArrayArray153[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static154.anIntArray290[local200 - local549 - 1] * (long) Static279.anIntArrayArray153[1][local549] >> 16);
					}
					Static154.anIntArray290[local200] = local352;
					local182 = this.aClass44_6.method1286(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static154.anIntArray290[local200 + local187] * (long) Static279.anInt5521 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static154.anIntArray290[local200 + local187 - local519 - 1] * (long) Static279.anIntArrayArray153[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static154.anIntArray290[local200 - local549 - 1] * (long) Static279.anIntArrayArray153[1][local549] >> 16);
						}
						Static154.anIntArray290[local200] = local352;
						local182 = this.aClass44_6.method1286(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static154.anIntArray290[local200 + local187 - local519 - 1] * (long) Static279.anIntArrayArray153[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static154.anIntArray290[local200 - local549 - 1] * (long) Static279.anIntArrayArray153[1][local549] >> 16);
							}
							Static154.anIntArray290[local200] = local352;
							this.aClass44_6.method1286(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass178_1.method4770(0, (float) local182 / 65536.0F);
					local195 = this.aClass178_1.method4770(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static154.anIntArray290[local182] < -32768) {
				Static154.anIntArray290[local182] = -32768;
			}
			if (Static154.anIntArray290[local182] > 32767) {
				Static154.anIntArray290[local182] = 32767;
			}
		}
		return Static154.anIntArray290;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)I")
	private int method3030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray289[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray286[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
