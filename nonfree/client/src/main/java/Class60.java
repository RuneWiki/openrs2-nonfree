import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class60 {

	@OriginalMember(owner = "client!t", name = "e", descriptor = "[I")
	public static int[] anIntArray277 = new int[32768];

	@OriginalMember(owner = "client!t", name = "k", descriptor = "[I")
	public static int[] anIntArray278;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "Lclient!hb;")
	private Class31 aClass31_1;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "Lclient!hb;")
	private Class31 aClass31_2;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "Lclient!hb;")
	private Class31 aClass31_3;

	@OriginalMember(owner = "client!t", name = "f", descriptor = "Lclient!hb;")
	private Class31 aClass31_4;

	@OriginalMember(owner = "client!t", name = "j", descriptor = "Lclient!se;")
	private Class59 aClass59_1;

	@OriginalMember(owner = "client!t", name = "m", descriptor = "Lclient!hb;")
	private Class31 aClass31_5;

	@OriginalMember(owner = "client!t", name = "n", descriptor = "Lclient!hb;")
	private Class31 aClass31_6;

	@OriginalMember(owner = "client!t", name = "o", descriptor = "Lclient!hb;")
	private Class31 aClass31_7;

	@OriginalMember(owner = "client!t", name = "s", descriptor = "Lclient!hb;")
	private Class31 aClass31_8;

	@OriginalMember(owner = "client!t", name = "t", descriptor = "Lclient!hb;")
	private Class31 aClass31_9;

	@OriginalMember(owner = "client!t", name = "g", descriptor = "I")
	public int anInt2478 = 0;

	@OriginalMember(owner = "client!t", name = "i", descriptor = "I")
	private int anInt2480 = 0;

	@OriginalMember(owner = "client!t", name = "p", descriptor = "[I")
	private final int[] anIntArray280 = new int[5];

	@OriginalMember(owner = "client!t", name = "h", descriptor = "I")
	private int anInt2479 = 100;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "I")
	public int anInt2477 = 500;

	@OriginalMember(owner = "client!t", name = "l", descriptor = "[I")
	private final int[] anIntArray279 = new int[5];

	@OriginalMember(owner = "client!t", name = "r", descriptor = "[I")
	private final int[] anIntArray282 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray277[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray278 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray278[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!m;)V")
	public void method1654(@OriginalArg(0) Class3_Sub6 arg0) {
		this.aClass31_1 = new Class31();
		this.aClass31_1.method738(arg0);
		this.aClass31_3 = new Class31();
		this.aClass31_3.method738(arg0);
		@Pc(21) int local21 = arg0.method1587();
		if (local21 != 0) {
			arg0.anInt2416--;
			this.aClass31_6 = new Class31();
			this.aClass31_6.method738(arg0);
			this.aClass31_2 = new Class31();
			this.aClass31_2.method738(arg0);
		}
		local21 = arg0.method1587();
		if (local21 != 0) {
			arg0.anInt2416--;
			this.aClass31_5 = new Class31();
			this.aClass31_5.method738(arg0);
			this.aClass31_7 = new Class31();
			this.aClass31_7.method738(arg0);
		}
		local21 = arg0.method1587();
		if (local21 != 0) {
			arg0.anInt2416--;
			this.aClass31_8 = new Class31();
			this.aClass31_8.method738(arg0);
			this.aClass31_4 = new Class31();
			this.aClass31_4.method738(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1629();
			if (local114 == 0) {
				break;
			}
			this.anIntArray282[local109] = local114;
			this.anIntArray280[local109] = arg0.method1620();
			this.anIntArray279[local109] = arg0.method1629();
		}
		this.anInt2480 = arg0.method1629();
		this.anInt2479 = arg0.method1629();
		this.anInt2477 = arg0.method1603();
		this.anInt2478 = arg0.method1603();
		this.aClass59_1 = new Class59();
		this.aClass31_9 = new Class31();
		this.aClass59_1.method1650(arg0, this.aClass31_9);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(III)I")
	private int method1656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray278[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray277[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(II)[I")
	public int[] method1657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			Static98.anIntArray281[local1] = 0;
		}
		if (arg1 < 10) {
			return Static98.anIntArray281;
		}
		@Pc(23) double local23 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass31_1.method739();
		this.aClass31_3.method739();
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (this.aClass31_6 != null) {
			this.aClass31_6.method739();
			this.aClass31_2.method739();
			local31 = (int) ((double) (this.aClass31_6.anInt1087 - this.aClass31_6.anInt1084) * 32.768D / local23);
			local33 = (int) ((double) this.aClass31_6.anInt1084 * 32.768D / local23);
		}
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.aClass31_5 != null) {
			this.aClass31_5.method739();
			this.aClass31_7.method739();
			local70 = (int) ((double) (this.aClass31_5.anInt1087 - this.aClass31_5.anInt1084) * 32.768D / local23);
			local72 = (int) ((double) this.aClass31_5.anInt1084 * 32.768D / local23);
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			if (this.anIntArray282[local109] != 0) {
				Static98.anIntArray285[local109] = 0;
				Static98.anIntArray286[local109] = (int) ((double) this.anIntArray279[local109] * local23);
				Static98.anIntArray283[local109] = (this.anIntArray282[local109] << 14) / 100;
				Static98.anIntArray287[local109] = (int) ((double) (this.aClass31_1.anInt1087 - this.aClass31_1.anInt1084) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray280[local109]) / local23);
				Static98.anIntArray284[local109] = (int) ((double) this.aClass31_1.anInt1084 * 32.768D / local23);
			}
		}
		@Pc(189) int local189;
		@Pc(194) int local194;
		@Pc(202) int local202;
		@Pc(207) int local207;
		for (@Pc(183) int local183 = 0; local183 < arg0; local183++) {
			local189 = this.aClass31_1.method741(arg0);
			local194 = this.aClass31_3.method741(arg0);
			if (this.aClass31_6 != null) {
				local202 = this.aClass31_6.method741(arg0);
				local207 = this.aClass31_2.method741(arg0);
				local189 += this.method1656(local35, local207, this.aClass31_6.anInt1086) >> 1;
				local35 += (local202 * local31 >> 16) + local33;
			}
			if (this.aClass31_5 != null) {
				local202 = this.aClass31_5.method741(arg0);
				local207 = this.aClass31_7.method741(arg0);
				local194 = local194 * ((this.method1656(local74, local207, this.aClass31_5.anInt1086) >> 1) + 32768) >> 15;
				local74 += (local202 * local70 >> 16) + local72;
			}
			for (local202 = 0; local202 < 5; local202++) {
				if (this.anIntArray282[local202] != 0) {
					local207 = local183 + Static98.anIntArray286[local202];
					if (local207 < arg0) {
						Static98.anIntArray281[local207] += this.method1656(Static98.anIntArray285[local202], local194 * Static98.anIntArray283[local202] >> 15, this.aClass31_1.anInt1086);
						Static98.anIntArray285[local202] += (local189 * Static98.anIntArray287[local202] >> 16) + Static98.anIntArray284[local202];
					}
				}
			}
		}
		@Pc(354) int local354;
		@Pc(359) int local359;
		if (this.aClass31_8 != null) {
			this.aClass31_8.method739();
			this.aClass31_4.method739();
			local189 = 0;
			@Pc(346) boolean local346 = true;
			for (local207 = 0; local207 < arg0; local207++) {
				local354 = this.aClass31_8.method741(arg0);
				local359 = this.aClass31_4.method741(arg0);
				if (local346) {
					local194 = this.aClass31_8.anInt1084 + ((this.aClass31_8.anInt1087 - this.aClass31_8.anInt1084) * local354 >> 8);
				} else {
					local194 = this.aClass31_8.anInt1084 + ((this.aClass31_8.anInt1087 - this.aClass31_8.anInt1084) * local359 >> 8);
				}
				local189 += 256;
				if (local189 >= local194) {
					local189 = 0;
					local346 = !local346;
				}
				if (local346) {
					Static98.anIntArray281[local207] = 0;
				}
			}
		}
		if (this.anInt2480 > 0 && this.anInt2479 > 0) {
			local189 = (int) ((double) this.anInt2480 * local23);
			for (local194 = local189; local194 < arg0; local194++) {
				Static98.anIntArray281[local194] += Static98.anIntArray281[local194 - local189] * this.anInt2479 / 100;
			}
		}
		if (this.aClass59_1.anIntArray276[0] > 0 || this.aClass59_1.anIntArray276[1] > 0) {
			this.aClass31_9.method739();
			local189 = this.aClass31_9.method741(arg0 + 1);
			local194 = this.aClass59_1.method1653(0, (float) local189 / 65536.0F);
			local202 = this.aClass59_1.method1653(1, (float) local189 / 65536.0F);
			if (arg0 >= local194 + local202) {
				local207 = 0;
				local354 = local202;
				if (local202 > arg0 - local194) {
					local354 = arg0 - local194;
				}
				@Pc(526) int local526;
				@Pc(556) int local556;
				while (local207 < local354) {
					local359 = (int) ((long) Static98.anIntArray281[local207 + local194] * (long) Static97.anInt2476 >> 16);
					for (local526 = 0; local526 < local194; local526++) {
						local359 += (int) ((long) Static98.anIntArray281[local207 + local194 - local526 - 1] * (long) Static97.anIntArrayArray16[0][local526] >> 16);
					}
					for (local556 = 0; local556 < local207; local556++) {
						local359 -= (int) ((long) Static98.anIntArray281[local207 - local556 - 1] * (long) Static97.anIntArrayArray16[1][local556] >> 16);
					}
					Static98.anIntArray281[local207] = local359;
					local189 = this.aClass31_9.method741(arg0 + 1);
					local207++;
				}
				local354 = 128;
				while (true) {
					if (local354 > arg0 - local194) {
						local354 = arg0 - local194;
					}
					while (local207 < local354) {
						local359 = (int) ((long) Static98.anIntArray281[local207 + local194] * (long) Static97.anInt2476 >> 16);
						for (local526 = 0; local526 < local194; local526++) {
							local359 += (int) ((long) Static98.anIntArray281[local207 + local194 - local526 - 1] * (long) Static97.anIntArrayArray16[0][local526] >> 16);
						}
						for (local556 = 0; local556 < local202; local556++) {
							local359 -= (int) ((long) Static98.anIntArray281[local207 - local556 - 1] * (long) Static97.anIntArrayArray16[1][local556] >> 16);
						}
						Static98.anIntArray281[local207] = local359;
						local189 = this.aClass31_9.method741(arg0 + 1);
						local207++;
					}
					if (local207 >= arg0 - local194) {
						while (local207 < arg0) {
							local359 = 0;
							for (local526 = local207 + local194 - arg0; local526 < local194; local526++) {
								local359 += (int) ((long) Static98.anIntArray281[local207 + local194 - local526 - 1] * (long) Static97.anIntArrayArray16[0][local526] >> 16);
							}
							for (local556 = 0; local556 < local202; local556++) {
								local359 -= (int) ((long) Static98.anIntArray281[local207 - local556 - 1] * (long) Static97.anIntArrayArray16[1][local556] >> 16);
							}
							Static98.anIntArray281[local207] = local359;
							this.aClass31_9.method741(arg0 + 1);
							local207++;
						}
						break;
					}
					local194 = this.aClass59_1.method1653(0, (float) local189 / 65536.0F);
					local202 = this.aClass59_1.method1653(1, (float) local189 / 65536.0F);
					local354 += 128;
				}
			}
		}
		for (local189 = 0; local189 < arg0; local189++) {
			if (Static98.anIntArray281[local189] < -32768) {
				Static98.anIntArray281[local189] = -32768;
			}
			if (Static98.anIntArray281[local189] > 32767) {
				Static98.anIntArray281[local189] = 32767;
			}
		}
		return Static98.anIntArray281;
	}
}
