import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class46 {

	@OriginalMember(owner = "client!le", name = "e", descriptor = "[I")
	public static int[] anIntArray193 = new int[32768];

	@OriginalMember(owner = "client!le", name = "m", descriptor = "[I")
	public static int[] anIntArray198;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "Lclient!cc;")
	private Class12 aClass12_1;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Lclient!cc;")
	private Class12 aClass12_2;

	@OriginalMember(owner = "client!le", name = "i", descriptor = "Lclient!cc;")
	private Class12 aClass12_3;

	@OriginalMember(owner = "client!le", name = "n", descriptor = "Lclient!cc;")
	private Class12 aClass12_4;

	@OriginalMember(owner = "client!le", name = "o", descriptor = "Lclient!cc;")
	private Class12 aClass12_5;

	@OriginalMember(owner = "client!le", name = "p", descriptor = "Lclient!cc;")
	private Class12 aClass12_6;

	@OriginalMember(owner = "client!le", name = "r", descriptor = "Lclient!cc;")
	private Class12 aClass12_7;

	@OriginalMember(owner = "client!le", name = "s", descriptor = "Lclient!cc;")
	private Class12 aClass12_8;

	@OriginalMember(owner = "client!le", name = "t", descriptor = "Lclient!cc;")
	private Class12 aClass12_9;

	@OriginalMember(owner = "client!le", name = "u", descriptor = "Lclient!pc;")
	private Class53 aClass53_1;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "[I")
	private final int[] anIntArray194 = new int[5];

	@OriginalMember(owner = "client!le", name = "h", descriptor = "I")
	private int anInt1656 = 0;

	@OriginalMember(owner = "client!le", name = "l", descriptor = "[I")
	private final int[] anIntArray197 = new int[5];

	@OriginalMember(owner = "client!le", name = "d", descriptor = "I")
	private int anInt1655 = 100;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "[I")
	private final int[] anIntArray195 = new int[5];

	@OriginalMember(owner = "client!le", name = "c", descriptor = "I")
	public int anInt1654 = 0;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "I")
	public int anInt1657 = 500;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray193[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray198 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray198[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!qe;)V")
	public void method1135(@OriginalArg(0) Class5_Sub11 arg0) {
		this.aClass12_8 = new Class12();
		this.aClass12_8.method403(arg0);
		this.aClass12_3 = new Class12();
		this.aClass12_3.method403(arg0);
		@Pc(21) int local21 = arg0.method1546();
		if (local21 != 0) {
			arg0.anInt2233--;
			this.aClass12_2 = new Class12();
			this.aClass12_2.method403(arg0);
			this.aClass12_5 = new Class12();
			this.aClass12_5.method403(arg0);
		}
		local21 = arg0.method1546();
		if (local21 != 0) {
			arg0.anInt2233--;
			this.aClass12_9 = new Class12();
			this.aClass12_9.method403(arg0);
			this.aClass12_4 = new Class12();
			this.aClass12_4.method403(arg0);
		}
		local21 = arg0.method1546();
		if (local21 != 0) {
			arg0.anInt2233--;
			this.aClass12_1 = new Class12();
			this.aClass12_1.method403(arg0);
			this.aClass12_7 = new Class12();
			this.aClass12_7.method403(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1535();
			if (local114 == 0) {
				break;
			}
			this.anIntArray197[local109] = local114;
			this.anIntArray195[local109] = arg0.method1538();
			this.anIntArray194[local109] = arg0.method1535();
		}
		this.anInt1656 = arg0.method1535();
		this.anInt1655 = arg0.method1535();
		this.anInt1657 = arg0.method1543();
		this.anInt1654 = arg0.method1543();
		this.aClass53_1 = new Class53();
		this.aClass12_6 = new Class12();
		this.aClass53_1.method1370(arg0, this.aClass12_6);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)[I")
	public int[] method1136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			Static67.anIntArray196[local1] = 0;
		}
		if (arg1 < 10) {
			return Static67.anIntArray196;
		}
		@Pc(23) double local23 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass12_8.method402();
		this.aClass12_3.method402();
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (this.aClass12_2 != null) {
			this.aClass12_2.method402();
			this.aClass12_5.method402();
			local31 = (int) ((double) (this.aClass12_2.anInt476 - this.aClass12_2.anInt478) * 32.768D / local23);
			local33 = (int) ((double) this.aClass12_2.anInt478 * 32.768D / local23);
		}
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.aClass12_9 != null) {
			this.aClass12_9.method402();
			this.aClass12_4.method402();
			local70 = (int) ((double) (this.aClass12_9.anInt476 - this.aClass12_9.anInt478) * 32.768D / local23);
			local72 = (int) ((double) this.aClass12_9.anInt478 * 32.768D / local23);
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			if (this.anIntArray197[local109] != 0) {
				Static67.anIntArray201[local109] = 0;
				Static67.anIntArray200[local109] = (int) ((double) this.anIntArray194[local109] * local23);
				Static67.anIntArray202[local109] = (this.anIntArray197[local109] << 14) / 100;
				Static67.anIntArray199[local109] = (int) ((double) (this.aClass12_8.anInt476 - this.aClass12_8.anInt478) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray195[local109]) / local23);
				Static67.anIntArray203[local109] = (int) ((double) this.aClass12_8.anInt478 * 32.768D / local23);
			}
		}
		@Pc(189) int local189;
		@Pc(194) int local194;
		@Pc(202) int local202;
		@Pc(207) int local207;
		for (@Pc(183) int local183 = 0; local183 < arg0; local183++) {
			local189 = this.aClass12_8.method401(arg0);
			local194 = this.aClass12_3.method401(arg0);
			if (this.aClass12_2 != null) {
				local202 = this.aClass12_2.method401(arg0);
				local207 = this.aClass12_5.method401(arg0);
				local189 += this.method1137(local35, local207, this.aClass12_2.anInt479) >> 1;
				local35 += (local202 * local31 >> 16) + local33;
			}
			if (this.aClass12_9 != null) {
				local202 = this.aClass12_9.method401(arg0);
				local207 = this.aClass12_4.method401(arg0);
				local194 = local194 * ((this.method1137(local74, local207, this.aClass12_9.anInt479) >> 1) + 32768) >> 15;
				local74 += (local202 * local70 >> 16) + local72;
			}
			for (local202 = 0; local202 < 5; local202++) {
				if (this.anIntArray197[local202] != 0) {
					local207 = local183 + Static67.anIntArray200[local202];
					if (local207 < arg0) {
						Static67.anIntArray196[local207] += this.method1137(Static67.anIntArray201[local202], local194 * Static67.anIntArray202[local202] >> 15, this.aClass12_8.anInt479);
						Static67.anIntArray201[local202] += (local189 * Static67.anIntArray199[local202] >> 16) + Static67.anIntArray203[local202];
					}
				}
			}
		}
		@Pc(354) int local354;
		@Pc(359) int local359;
		if (this.aClass12_1 != null) {
			this.aClass12_1.method402();
			this.aClass12_7.method402();
			local189 = 0;
			@Pc(346) boolean local346 = true;
			for (local207 = 0; local207 < arg0; local207++) {
				local354 = this.aClass12_1.method401(arg0);
				local359 = this.aClass12_7.method401(arg0);
				if (local346) {
					local194 = this.aClass12_1.anInt478 + ((this.aClass12_1.anInt476 - this.aClass12_1.anInt478) * local354 >> 8);
				} else {
					local194 = this.aClass12_1.anInt478 + ((this.aClass12_1.anInt476 - this.aClass12_1.anInt478) * local359 >> 8);
				}
				local189 += 256;
				if (local189 >= local194) {
					local189 = 0;
					local346 = !local346;
				}
				if (local346) {
					Static67.anIntArray196[local207] = 0;
				}
			}
		}
		if (this.anInt1656 > 0 && this.anInt1655 > 0) {
			local189 = (int) ((double) this.anInt1656 * local23);
			for (local194 = local189; local194 < arg0; local194++) {
				Static67.anIntArray196[local194] += Static67.anIntArray196[local194 - local189] * this.anInt1655 / 100;
			}
		}
		if (this.aClass53_1.anIntArray249[0] > 0 || this.aClass53_1.anIntArray249[1] > 0) {
			this.aClass12_6.method402();
			local189 = this.aClass12_6.method401(arg0 + 1);
			local194 = this.aClass53_1.method1367(0, (float) local189 / 65536.0F);
			local202 = this.aClass53_1.method1367(1, (float) local189 / 65536.0F);
			if (arg0 >= local194 + local202) {
				local207 = 0;
				local354 = local202;
				if (local202 > arg0 - local194) {
					local354 = arg0 - local194;
				}
				@Pc(526) int local526;
				@Pc(556) int local556;
				while (local207 < local354) {
					local359 = (int) ((long) Static67.anIntArray196[local207 + local194] * (long) Static84.anInt2018 >> 16);
					for (local526 = 0; local526 < local194; local526++) {
						local359 += (int) ((long) Static67.anIntArray196[local207 + local194 - local526 - 1] * (long) Static84.anIntArrayArray26[0][local526] >> 16);
					}
					for (local556 = 0; local556 < local207; local556++) {
						local359 -= (int) ((long) Static67.anIntArray196[local207 - local556 - 1] * (long) Static84.anIntArrayArray26[1][local556] >> 16);
					}
					Static67.anIntArray196[local207] = local359;
					local189 = this.aClass12_6.method401(arg0 + 1);
					local207++;
				}
				local354 = 128;
				while (true) {
					if (local354 > arg0 - local194) {
						local354 = arg0 - local194;
					}
					while (local207 < local354) {
						local359 = (int) ((long) Static67.anIntArray196[local207 + local194] * (long) Static84.anInt2018 >> 16);
						for (local526 = 0; local526 < local194; local526++) {
							local359 += (int) ((long) Static67.anIntArray196[local207 + local194 - local526 - 1] * (long) Static84.anIntArrayArray26[0][local526] >> 16);
						}
						for (local556 = 0; local556 < local202; local556++) {
							local359 -= (int) ((long) Static67.anIntArray196[local207 - local556 - 1] * (long) Static84.anIntArrayArray26[1][local556] >> 16);
						}
						Static67.anIntArray196[local207] = local359;
						local189 = this.aClass12_6.method401(arg0 + 1);
						local207++;
					}
					if (local207 >= arg0 - local194) {
						while (local207 < arg0) {
							local359 = 0;
							for (local526 = local207 + local194 - arg0; local526 < local194; local526++) {
								local359 += (int) ((long) Static67.anIntArray196[local207 + local194 - local526 - 1] * (long) Static84.anIntArrayArray26[0][local526] >> 16);
							}
							for (local556 = 0; local556 < local202; local556++) {
								local359 -= (int) ((long) Static67.anIntArray196[local207 - local556 - 1] * (long) Static84.anIntArrayArray26[1][local556] >> 16);
							}
							Static67.anIntArray196[local207] = local359;
							this.aClass12_6.method401(arg0 + 1);
							local207++;
						}
						break;
					}
					local194 = this.aClass53_1.method1367(0, (float) local189 / 65536.0F);
					local202 = this.aClass53_1.method1367(1, (float) local189 / 65536.0F);
					local354 += 128;
				}
			}
		}
		for (local189 = 0; local189 < arg0; local189++) {
			if (Static67.anIntArray196[local189] < -32768) {
				Static67.anIntArray196[local189] = -32768;
			}
			if (Static67.anIntArray196[local189] > 32767) {
				Static67.anIntArray196[local189] = 32767;
			}
		}
		return Static67.anIntArray196;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(III)I")
	private int method1137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray198[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray193[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
