import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class63 {

	@OriginalMember(owner = "client!va", name = "e", descriptor = "[I")
	public static int[] anIntArray295 = new int[32768];

	@OriginalMember(owner = "client!va", name = "o", descriptor = "[I")
	public static int[] anIntArray298;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "Lclient!oa;")
	private Class48 aClass48_1;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "Lclient!qe;")
	private Class55 aClass55_1;

	@OriginalMember(owner = "client!va", name = "d", descriptor = "Lclient!oa;")
	private Class48 aClass48_2;

	@OriginalMember(owner = "client!va", name = "h", descriptor = "Lclient!oa;")
	private Class48 aClass48_3;

	@OriginalMember(owner = "client!va", name = "k", descriptor = "Lclient!oa;")
	private Class48 aClass48_4;

	@OriginalMember(owner = "client!va", name = "m", descriptor = "Lclient!oa;")
	private Class48 aClass48_5;

	@OriginalMember(owner = "client!va", name = "n", descriptor = "Lclient!oa;")
	private Class48 aClass48_6;

	@OriginalMember(owner = "client!va", name = "q", descriptor = "Lclient!oa;")
	private Class48 aClass48_7;

	@OriginalMember(owner = "client!va", name = "r", descriptor = "Lclient!oa;")
	private Class48 aClass48_8;

	@OriginalMember(owner = "client!va", name = "t", descriptor = "Lclient!oa;")
	private Class48 aClass48_9;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "[I")
	private final int[] anIntArray294 = new int[5];

	@OriginalMember(owner = "client!va", name = "f", descriptor = "I")
	public int anInt2654 = 0;

	@OriginalMember(owner = "client!va", name = "j", descriptor = "I")
	public int anInt2655 = 500;

	@OriginalMember(owner = "client!va", name = "l", descriptor = "I")
	private int anInt2656 = 100;

	@OriginalMember(owner = "client!va", name = "p", descriptor = "[I")
	private final int[] anIntArray299 = new int[5];

	@OriginalMember(owner = "client!va", name = "g", descriptor = "[I")
	private final int[] anIntArray296 = new int[5];

	@OriginalMember(owner = "client!va", name = "s", descriptor = "I")
	private int anInt2657 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray295[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray298 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray298[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)[I")
	public int[] method1711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			Static103.anIntArray297[local1] = 0;
		}
		if (arg1 < 10) {
			return Static103.anIntArray297;
		}
		@Pc(23) double local23 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass48_3.method1186();
		this.aClass48_6.method1186();
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (this.aClass48_8 != null) {
			this.aClass48_8.method1186();
			this.aClass48_7.method1186();
			local31 = (int) ((double) (this.aClass48_8.anInt1957 - this.aClass48_8.anInt1955) * 32.768D / local23);
			local33 = (int) ((double) this.aClass48_8.anInt1955 * 32.768D / local23);
		}
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.aClass48_1 != null) {
			this.aClass48_1.method1186();
			this.aClass48_4.method1186();
			local70 = (int) ((double) (this.aClass48_1.anInt1957 - this.aClass48_1.anInt1955) * 32.768D / local23);
			local72 = (int) ((double) this.aClass48_1.anInt1955 * 32.768D / local23);
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			if (this.anIntArray296[local109] != 0) {
				Static103.anIntArray301[local109] = 0;
				Static103.anIntArray300[local109] = (int) ((double) this.anIntArray299[local109] * local23);
				Static103.anIntArray303[local109] = (this.anIntArray296[local109] << 14) / 100;
				Static103.anIntArray302[local109] = (int) ((double) (this.aClass48_3.anInt1957 - this.aClass48_3.anInt1955) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray294[local109]) / local23);
				Static103.anIntArray304[local109] = (int) ((double) this.aClass48_3.anInt1955 * 32.768D / local23);
			}
		}
		@Pc(189) int local189;
		@Pc(194) int local194;
		@Pc(202) int local202;
		@Pc(207) int local207;
		for (@Pc(183) int local183 = 0; local183 < arg0; local183++) {
			local189 = this.aClass48_3.method1187(arg0);
			local194 = this.aClass48_6.method1187(arg0);
			if (this.aClass48_8 != null) {
				local202 = this.aClass48_8.method1187(arg0);
				local207 = this.aClass48_7.method1187(arg0);
				local189 += this.method1712(local35, local207, this.aClass48_8.anInt1956) >> 1;
				local35 += (local202 * local31 >> 16) + local33;
			}
			if (this.aClass48_1 != null) {
				local202 = this.aClass48_1.method1187(arg0);
				local207 = this.aClass48_4.method1187(arg0);
				local194 = local194 * ((this.method1712(local74, local207, this.aClass48_1.anInt1956) >> 1) + 32768) >> 15;
				local74 += (local202 * local70 >> 16) + local72;
			}
			for (local202 = 0; local202 < 5; local202++) {
				if (this.anIntArray296[local202] != 0) {
					local207 = local183 + Static103.anIntArray300[local202];
					if (local207 < arg0) {
						Static103.anIntArray297[local207] += this.method1712(Static103.anIntArray301[local202], local194 * Static103.anIntArray303[local202] >> 15, this.aClass48_3.anInt1956);
						Static103.anIntArray301[local202] += (local189 * Static103.anIntArray302[local202] >> 16) + Static103.anIntArray304[local202];
					}
				}
			}
		}
		@Pc(354) int local354;
		@Pc(359) int local359;
		if (this.aClass48_2 != null) {
			this.aClass48_2.method1186();
			this.aClass48_5.method1186();
			local189 = 0;
			@Pc(346) boolean local346 = true;
			for (local207 = 0; local207 < arg0; local207++) {
				local354 = this.aClass48_2.method1187(arg0);
				local359 = this.aClass48_5.method1187(arg0);
				if (local346) {
					local194 = this.aClass48_2.anInt1955 + ((this.aClass48_2.anInt1957 - this.aClass48_2.anInt1955) * local354 >> 8);
				} else {
					local194 = this.aClass48_2.anInt1955 + ((this.aClass48_2.anInt1957 - this.aClass48_2.anInt1955) * local359 >> 8);
				}
				local189 += 256;
				if (local189 >= local194) {
					local189 = 0;
					local346 = !local346;
				}
				if (local346) {
					Static103.anIntArray297[local207] = 0;
				}
			}
		}
		if (this.anInt2657 > 0 && this.anInt2656 > 0) {
			local189 = (int) ((double) this.anInt2657 * local23);
			for (local194 = local189; local194 < arg0; local194++) {
				Static103.anIntArray297[local194] += Static103.anIntArray297[local194 - local189] * this.anInt2656 / 100;
			}
		}
		if (this.aClass55_1.anIntArray244[0] > 0 || this.aClass55_1.anIntArray244[1] > 0) {
			this.aClass48_9.method1186();
			local189 = this.aClass48_9.method1187(arg0 + 1);
			local194 = this.aClass55_1.method1371(0, (float) local189 / 65536.0F);
			local202 = this.aClass55_1.method1371(1, (float) local189 / 65536.0F);
			if (arg0 >= local194 + local202) {
				local207 = 0;
				local354 = local202;
				if (local202 > arg0 - local194) {
					local354 = arg0 - local194;
				}
				@Pc(526) int local526;
				@Pc(556) int local556;
				while (local207 < local354) {
					local359 = (int) ((long) Static103.anIntArray297[local207 + local194] * (long) Static84.anInt2239 >> 16);
					for (local526 = 0; local526 < local194; local526++) {
						local359 += (int) ((long) Static103.anIntArray297[local207 + local194 - local526 - 1] * (long) Static84.anIntArrayArray22[0][local526] >> 16);
					}
					for (local556 = 0; local556 < local207; local556++) {
						local359 -= (int) ((long) Static103.anIntArray297[local207 - local556 - 1] * (long) Static84.anIntArrayArray22[1][local556] >> 16);
					}
					Static103.anIntArray297[local207] = local359;
					local189 = this.aClass48_9.method1187(arg0 + 1);
					local207++;
				}
				local354 = 128;
				while (true) {
					if (local354 > arg0 - local194) {
						local354 = arg0 - local194;
					}
					while (local207 < local354) {
						local359 = (int) ((long) Static103.anIntArray297[local207 + local194] * (long) Static84.anInt2239 >> 16);
						for (local526 = 0; local526 < local194; local526++) {
							local359 += (int) ((long) Static103.anIntArray297[local207 + local194 - local526 - 1] * (long) Static84.anIntArrayArray22[0][local526] >> 16);
						}
						for (local556 = 0; local556 < local202; local556++) {
							local359 -= (int) ((long) Static103.anIntArray297[local207 - local556 - 1] * (long) Static84.anIntArrayArray22[1][local556] >> 16);
						}
						Static103.anIntArray297[local207] = local359;
						local189 = this.aClass48_9.method1187(arg0 + 1);
						local207++;
					}
					if (local207 >= arg0 - local194) {
						while (local207 < arg0) {
							local359 = 0;
							for (local526 = local207 + local194 - arg0; local526 < local194; local526++) {
								local359 += (int) ((long) Static103.anIntArray297[local207 + local194 - local526 - 1] * (long) Static84.anIntArrayArray22[0][local526] >> 16);
							}
							for (local556 = 0; local556 < local202; local556++) {
								local359 -= (int) ((long) Static103.anIntArray297[local207 - local556 - 1] * (long) Static84.anIntArrayArray22[1][local556] >> 16);
							}
							Static103.anIntArray297[local207] = local359;
							this.aClass48_9.method1187(arg0 + 1);
							local207++;
						}
						break;
					}
					local194 = this.aClass55_1.method1371(0, (float) local189 / 65536.0F);
					local202 = this.aClass55_1.method1371(1, (float) local189 / 65536.0F);
					local354 += 128;
				}
			}
		}
		for (local189 = 0; local189 < arg0; local189++) {
			if (Static103.anIntArray297[local189] < -32768) {
				Static103.anIntArray297[local189] = -32768;
			}
			if (Static103.anIntArray297[local189] > 32767) {
				Static103.anIntArray297[local189] = 32767;
			}
		}
		return Static103.anIntArray297;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(III)I")
	private int method1712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray298[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray295[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!kd;)V")
	public void method1714(@OriginalArg(0) Class3_Sub8 arg0) {
		this.aClass48_3 = new Class48();
		this.aClass48_3.method1188(arg0);
		this.aClass48_6 = new Class48();
		this.aClass48_6.method1188(arg0);
		@Pc(21) int local21 = arg0.method1803();
		if (local21 != 0) {
			arg0.anInt2704--;
			this.aClass48_8 = new Class48();
			this.aClass48_8.method1188(arg0);
			this.aClass48_7 = new Class48();
			this.aClass48_7.method1188(arg0);
		}
		local21 = arg0.method1803();
		if (local21 != 0) {
			arg0.anInt2704--;
			this.aClass48_1 = new Class48();
			this.aClass48_1.method1188(arg0);
			this.aClass48_4 = new Class48();
			this.aClass48_4.method1188(arg0);
		}
		local21 = arg0.method1803();
		if (local21 != 0) {
			arg0.anInt2704--;
			this.aClass48_2 = new Class48();
			this.aClass48_2.method1188(arg0);
			this.aClass48_5 = new Class48();
			this.aClass48_5.method1188(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1769();
			if (local114 == 0) {
				break;
			}
			this.anIntArray296[local109] = local114;
			this.anIntArray294[local109] = arg0.method1778();
			this.anIntArray299[local109] = arg0.method1769();
		}
		this.anInt2657 = arg0.method1769();
		this.anInt2656 = arg0.method1769();
		this.anInt2655 = arg0.method1789();
		this.anInt2654 = arg0.method1789();
		this.aClass55_1 = new Class55();
		this.aClass48_9 = new Class48();
		this.aClass55_1.method1374(arg0, this.aClass48_9);
	}
}
