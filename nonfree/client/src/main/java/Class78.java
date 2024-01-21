import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class78 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "[I")
	public static int[] anIntArray314 = new int[32768];

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "[I")
	public static int[] anIntArray318;

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Lclient!nb;")
	private Class53 aClass53_1;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "Lclient!nb;")
	private Class53 aClass53_2;

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "Lclient!nb;")
	private Class53 aClass53_3;

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "Lclient!nb;")
	private Class53 aClass53_4;

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "Lclient!s;")
	private Class67 aClass67_1;

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "Lclient!nb;")
	private Class53 aClass53_5;

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "Lclient!nb;")
	private Class53 aClass53_6;

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "Lclient!nb;")
	private Class53 aClass53_7;

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "Lclient!nb;")
	private Class53 aClass53_8;

	@OriginalMember(owner = "client!vc", name = "u", descriptor = "Lclient!nb;")
	private Class53 aClass53_9;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
	public int anInt2992 = 0;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
	private int anInt2993 = 0;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "[I")
	private final int[] anIntArray317 = new int[5];

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "[I")
	private final int[] anIntArray316 = new int[5];

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "[I")
	private final int[] anIntArray321 = new int[5];

	@OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
	public int anInt2994 = 500;

	@OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
	private int anInt2995 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray314[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray318 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray318[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!b;)V")
	public void method1949(@OriginalArg(0) Class3_Sub2 arg0) {
		this.aClass53_2 = new Class53();
		this.aClass53_2.method1370(arg0);
		this.aClass53_4 = new Class53();
		this.aClass53_4.method1370(arg0);
		@Pc(21) int local21 = arg0.method270();
		if (local21 != 0) {
			arg0.anInt413--;
			this.aClass53_8 = new Class53();
			this.aClass53_8.method1370(arg0);
			this.aClass53_7 = new Class53();
			this.aClass53_7.method1370(arg0);
		}
		local21 = arg0.method270();
		if (local21 != 0) {
			arg0.anInt413--;
			this.aClass53_3 = new Class53();
			this.aClass53_3.method1370(arg0);
			this.aClass53_6 = new Class53();
			this.aClass53_6.method1370(arg0);
		}
		local21 = arg0.method270();
		if (local21 != 0) {
			arg0.anInt413--;
			this.aClass53_5 = new Class53();
			this.aClass53_5.method1370(arg0);
			this.aClass53_9 = new Class53();
			this.aClass53_9.method1370(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method311();
			if (local114 == 0) {
				break;
			}
			this.anIntArray321[local109] = local114;
			this.anIntArray317[local109] = arg0.method269();
			this.anIntArray316[local109] = arg0.method311();
		}
		this.anInt2993 = arg0.method311();
		this.anInt2995 = arg0.method311();
		this.anInt2994 = arg0.method276();
		this.anInt2992 = arg0.method276();
		this.aClass67_1 = new Class67();
		this.aClass53_1 = new Class53();
		this.aClass67_1.method1728(arg0, this.aClass53_1);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)I")
	private int method1950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray318[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray314[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)[I")
	public int[] method1951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			Static121.anIntArray315[local1] = 0;
		}
		if (arg1 < 10) {
			return Static121.anIntArray315;
		}
		@Pc(23) double local23 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass53_2.method1372();
		this.aClass53_4.method1372();
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (this.aClass53_8 != null) {
			this.aClass53_8.method1372();
			this.aClass53_7.method1372();
			local31 = (int) ((double) (this.aClass53_8.anInt2066 - this.aClass53_8.anInt2067) * 32.768D / local23);
			local33 = (int) ((double) this.aClass53_8.anInt2067 * 32.768D / local23);
		}
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.aClass53_3 != null) {
			this.aClass53_3.method1372();
			this.aClass53_6.method1372();
			local70 = (int) ((double) (this.aClass53_3.anInt2066 - this.aClass53_3.anInt2067) * 32.768D / local23);
			local72 = (int) ((double) this.aClass53_3.anInt2067 * 32.768D / local23);
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			if (this.anIntArray321[local109] != 0) {
				Static121.anIntArray324[local109] = 0;
				Static121.anIntArray322[local109] = (int) ((double) this.anIntArray316[local109] * local23);
				Static121.anIntArray320[local109] = (this.anIntArray321[local109] << 14) / 100;
				Static121.anIntArray323[local109] = (int) ((double) (this.aClass53_2.anInt2066 - this.aClass53_2.anInt2067) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray317[local109]) / local23);
				Static121.anIntArray319[local109] = (int) ((double) this.aClass53_2.anInt2067 * 32.768D / local23);
			}
		}
		@Pc(189) int local189;
		@Pc(194) int local194;
		@Pc(202) int local202;
		@Pc(207) int local207;
		for (@Pc(183) int local183 = 0; local183 < arg0; local183++) {
			local189 = this.aClass53_2.method1371(arg0);
			local194 = this.aClass53_4.method1371(arg0);
			if (this.aClass53_8 != null) {
				local202 = this.aClass53_8.method1371(arg0);
				local207 = this.aClass53_7.method1371(arg0);
				local189 += this.method1950(local35, local207, this.aClass53_8.anInt2068) >> 1;
				local35 += (local202 * local31 >> 16) + local33;
			}
			if (this.aClass53_3 != null) {
				local202 = this.aClass53_3.method1371(arg0);
				local207 = this.aClass53_6.method1371(arg0);
				local194 = local194 * ((this.method1950(local74, local207, this.aClass53_3.anInt2068) >> 1) + 32768) >> 15;
				local74 += (local202 * local70 >> 16) + local72;
			}
			for (local202 = 0; local202 < 5; local202++) {
				if (this.anIntArray321[local202] != 0) {
					local207 = local183 + Static121.anIntArray322[local202];
					if (local207 < arg0) {
						Static121.anIntArray315[local207] += this.method1950(Static121.anIntArray324[local202], local194 * Static121.anIntArray320[local202] >> 15, this.aClass53_2.anInt2068);
						Static121.anIntArray324[local202] += (local189 * Static121.anIntArray323[local202] >> 16) + Static121.anIntArray319[local202];
					}
				}
			}
		}
		@Pc(354) int local354;
		@Pc(359) int local359;
		if (this.aClass53_5 != null) {
			this.aClass53_5.method1372();
			this.aClass53_9.method1372();
			local189 = 0;
			@Pc(346) boolean local346 = true;
			for (local207 = 0; local207 < arg0; local207++) {
				local354 = this.aClass53_5.method1371(arg0);
				local359 = this.aClass53_9.method1371(arg0);
				if (local346) {
					local194 = this.aClass53_5.anInt2067 + ((this.aClass53_5.anInt2066 - this.aClass53_5.anInt2067) * local354 >> 8);
				} else {
					local194 = this.aClass53_5.anInt2067 + ((this.aClass53_5.anInt2066 - this.aClass53_5.anInt2067) * local359 >> 8);
				}
				local189 += 256;
				if (local189 >= local194) {
					local189 = 0;
					local346 = !local346;
				}
				if (local346) {
					Static121.anIntArray315[local207] = 0;
				}
			}
		}
		if (this.anInt2993 > 0 && this.anInt2995 > 0) {
			local189 = (int) ((double) this.anInt2993 * local23);
			for (local194 = local189; local194 < arg0; local194++) {
				Static121.anIntArray315[local194] += Static121.anIntArray315[local194 - local189] * this.anInt2995 / 100;
			}
		}
		if (this.aClass67_1.anIntArray221[0] > 0 || this.aClass67_1.anIntArray221[1] > 0) {
			this.aClass53_1.method1372();
			local189 = this.aClass53_1.method1371(arg0 + 1);
			local194 = this.aClass67_1.method1726(0, (float) local189 / 65536.0F);
			local202 = this.aClass67_1.method1726(1, (float) local189 / 65536.0F);
			if (arg0 >= local194 + local202) {
				local207 = 0;
				local354 = local202;
				if (local202 > arg0 - local194) {
					local354 = arg0 - local194;
				}
				@Pc(526) int local526;
				@Pc(556) int local556;
				while (local207 < local354) {
					local359 = (int) ((long) Static121.anIntArray315[local207 + local194] * (long) Static101.anInt2575 >> 16);
					for (local526 = 0; local526 < local194; local526++) {
						local359 += (int) ((long) Static121.anIntArray315[local207 + local194 - local526 - 1] * (long) Static101.anIntArrayArray21[0][local526] >> 16);
					}
					for (local556 = 0; local556 < local207; local556++) {
						local359 -= (int) ((long) Static121.anIntArray315[local207 - local556 - 1] * (long) Static101.anIntArrayArray21[1][local556] >> 16);
					}
					Static121.anIntArray315[local207] = local359;
					local189 = this.aClass53_1.method1371(arg0 + 1);
					local207++;
				}
				local354 = 128;
				while (true) {
					if (local354 > arg0 - local194) {
						local354 = arg0 - local194;
					}
					while (local207 < local354) {
						local359 = (int) ((long) Static121.anIntArray315[local207 + local194] * (long) Static101.anInt2575 >> 16);
						for (local526 = 0; local526 < local194; local526++) {
							local359 += (int) ((long) Static121.anIntArray315[local207 + local194 - local526 - 1] * (long) Static101.anIntArrayArray21[0][local526] >> 16);
						}
						for (local556 = 0; local556 < local202; local556++) {
							local359 -= (int) ((long) Static121.anIntArray315[local207 - local556 - 1] * (long) Static101.anIntArrayArray21[1][local556] >> 16);
						}
						Static121.anIntArray315[local207] = local359;
						local189 = this.aClass53_1.method1371(arg0 + 1);
						local207++;
					}
					if (local207 >= arg0 - local194) {
						while (local207 < arg0) {
							local359 = 0;
							for (local526 = local207 + local194 - arg0; local526 < local194; local526++) {
								local359 += (int) ((long) Static121.anIntArray315[local207 + local194 - local526 - 1] * (long) Static101.anIntArrayArray21[0][local526] >> 16);
							}
							for (local556 = 0; local556 < local202; local556++) {
								local359 -= (int) ((long) Static121.anIntArray315[local207 - local556 - 1] * (long) Static101.anIntArrayArray21[1][local556] >> 16);
							}
							Static121.anIntArray315[local207] = local359;
							this.aClass53_1.method1371(arg0 + 1);
							local207++;
						}
						break;
					}
					local194 = this.aClass67_1.method1726(0, (float) local189 / 65536.0F);
					local202 = this.aClass67_1.method1726(1, (float) local189 / 65536.0F);
					local354 += 128;
				}
			}
		}
		for (local189 = 0; local189 < arg0; local189++) {
			if (Static121.anIntArray315[local189] < -32768) {
				Static121.anIntArray315[local189] = -32768;
			}
			if (Static121.anIntArray315[local189] > 32767) {
				Static121.anIntArray315[local189] = 32767;
			}
		}
		return Static121.anIntArray315;
	}
}
