import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "[I")
	public static int[] anIntArray4 = new int[32768];

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "[I")
	public static int[] anIntArray9;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "Lclient!sd;")
	private Class67 aClass67_1;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "Lclient!sd;")
	private Class67 aClass67_2;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "Lclient!oc;")
	private Class57 aClass57_1;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "Lclient!sd;")
	private Class67 aClass67_3;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "Lclient!sd;")
	private Class67 aClass67_4;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "Lclient!sd;")
	private Class67 aClass67_5;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "Lclient!sd;")
	private Class67 aClass67_6;

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "Lclient!sd;")
	private Class67 aClass67_7;

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "Lclient!sd;")
	private Class67 aClass67_8;

	@OriginalMember(owner = "client!ab", name = "y", descriptor = "Lclient!sd;")
	private Class67 aClass67_9;

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
	private int anInt39 = 0;

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
	public int anInt38 = 0;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
	private int anInt37 = 100;

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "[I")
	private final int[] anIntArray8 = new int[5];

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "[I")
	private final int[] anIntArray6 = new int[5];

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "[I")
	private final int[] anIntArray7 = new int[5];

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
	public int anInt36 = 500;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray4[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray9 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray9[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!bf;)V")
	public void method27(@OriginalArg(0) Class6_Sub4 arg0) {
		this.aClass67_2 = new Class67();
		this.aClass67_2.method1867(arg0);
		this.aClass67_9 = new Class67();
		this.aClass67_9.method1867(arg0);
		@Pc(21) int local21 = arg0.method1321();
		if (local21 != 0) {
			arg0.anInt1949--;
			this.aClass67_3 = new Class67();
			this.aClass67_3.method1867(arg0);
			this.aClass67_5 = new Class67();
			this.aClass67_5.method1867(arg0);
		}
		local21 = arg0.method1321();
		if (local21 != 0) {
			arg0.anInt1949--;
			this.aClass67_4 = new Class67();
			this.aClass67_4.method1867(arg0);
			this.aClass67_7 = new Class67();
			this.aClass67_7.method1867(arg0);
		}
		local21 = arg0.method1321();
		if (local21 != 0) {
			arg0.anInt1949--;
			this.aClass67_6 = new Class67();
			this.aClass67_6.method1867(arg0);
			this.aClass67_8 = new Class67();
			this.aClass67_8.method1867(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1337();
			if (local114 == 0) {
				break;
			}
			this.anIntArray7[local109] = local114;
			this.anIntArray8[local109] = arg0.method1285();
			this.anIntArray6[local109] = arg0.method1337();
		}
		this.anInt39 = arg0.method1337();
		this.anInt37 = arg0.method1337();
		this.anInt36 = arg0.method1306();
		this.anInt38 = arg0.method1306();
		this.aClass57_1 = new Class57();
		this.aClass67_1 = new Class67();
		this.aClass57_1.method1508(arg0, this.aClass67_1);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)[I")
	public int[] method28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			Static3.anIntArray5[local1] = 0;
		}
		if (arg1 < 10) {
			return Static3.anIntArray5;
		}
		@Pc(23) double local23 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass67_2.method1866();
		this.aClass67_9.method1866();
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (this.aClass67_3 != null) {
			this.aClass67_3.method1866();
			this.aClass67_5.method1866();
			local31 = (int) ((double) (this.aClass67_3.anInt2841 - this.aClass67_3.anInt2844) * 32.768D / local23);
			local33 = (int) ((double) this.aClass67_3.anInt2844 * 32.768D / local23);
		}
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.aClass67_4 != null) {
			this.aClass67_4.method1866();
			this.aClass67_7.method1866();
			local70 = (int) ((double) (this.aClass67_4.anInt2841 - this.aClass67_4.anInt2844) * 32.768D / local23);
			local72 = (int) ((double) this.aClass67_4.anInt2844 * 32.768D / local23);
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			if (this.anIntArray7[local109] != 0) {
				Static3.anIntArray13[local109] = 0;
				Static3.anIntArray14[local109] = (int) ((double) this.anIntArray6[local109] * local23);
				Static3.anIntArray11[local109] = (this.anIntArray7[local109] << 14) / 100;
				Static3.anIntArray12[local109] = (int) ((double) (this.aClass67_2.anInt2841 - this.aClass67_2.anInt2844) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray8[local109]) / local23);
				Static3.anIntArray10[local109] = (int) ((double) this.aClass67_2.anInt2844 * 32.768D / local23);
			}
		}
		@Pc(189) int local189;
		@Pc(194) int local194;
		@Pc(202) int local202;
		@Pc(207) int local207;
		for (@Pc(183) int local183 = 0; local183 < arg0; local183++) {
			local189 = this.aClass67_2.method1868(arg0);
			local194 = this.aClass67_9.method1868(arg0);
			if (this.aClass67_3 != null) {
				local202 = this.aClass67_3.method1868(arg0);
				local207 = this.aClass67_5.method1868(arg0);
				local189 += this.method30(local35, local207, this.aClass67_3.anInt2842) >> 1;
				local35 += (local202 * local31 >> 16) + local33;
			}
			if (this.aClass67_4 != null) {
				local202 = this.aClass67_4.method1868(arg0);
				local207 = this.aClass67_7.method1868(arg0);
				local194 = local194 * ((this.method30(local74, local207, this.aClass67_4.anInt2842) >> 1) + 32768) >> 15;
				local74 += (local202 * local70 >> 16) + local72;
			}
			for (local202 = 0; local202 < 5; local202++) {
				if (this.anIntArray7[local202] != 0) {
					local207 = local183 + Static3.anIntArray14[local202];
					if (local207 < arg0) {
						Static3.anIntArray5[local207] += this.method30(Static3.anIntArray13[local202], local194 * Static3.anIntArray11[local202] >> 15, this.aClass67_2.anInt2842);
						Static3.anIntArray13[local202] += (local189 * Static3.anIntArray12[local202] >> 16) + Static3.anIntArray10[local202];
					}
				}
			}
		}
		@Pc(354) int local354;
		@Pc(359) int local359;
		if (this.aClass67_6 != null) {
			this.aClass67_6.method1866();
			this.aClass67_8.method1866();
			local189 = 0;
			@Pc(346) boolean local346 = true;
			for (local207 = 0; local207 < arg0; local207++) {
				local354 = this.aClass67_6.method1868(arg0);
				local359 = this.aClass67_8.method1868(arg0);
				if (local346) {
					local194 = this.aClass67_6.anInt2844 + ((this.aClass67_6.anInt2841 - this.aClass67_6.anInt2844) * local354 >> 8);
				} else {
					local194 = this.aClass67_6.anInt2844 + ((this.aClass67_6.anInt2841 - this.aClass67_6.anInt2844) * local359 >> 8);
				}
				local189 += 256;
				if (local189 >= local194) {
					local189 = 0;
					local346 = !local346;
				}
				if (local346) {
					Static3.anIntArray5[local207] = 0;
				}
			}
		}
		if (this.anInt39 > 0 && this.anInt37 > 0) {
			local189 = (int) ((double) this.anInt39 * local23);
			for (local194 = local189; local194 < arg0; local194++) {
				Static3.anIntArray5[local194] += Static3.anIntArray5[local194 - local189] * this.anInt37 / 100;
			}
		}
		if (this.aClass57_1.anIntArray256[0] > 0 || this.aClass57_1.anIntArray256[1] > 0) {
			this.aClass67_1.method1866();
			local189 = this.aClass67_1.method1868(arg0 + 1);
			local194 = this.aClass57_1.method1505(0, (float) local189 / 65536.0F);
			local202 = this.aClass57_1.method1505(1, (float) local189 / 65536.0F);
			if (arg0 >= local194 + local202) {
				local207 = 0;
				local354 = local202;
				if (local202 > arg0 - local194) {
					local354 = arg0 - local194;
				}
				@Pc(526) int local526;
				@Pc(556) int local556;
				while (local207 < local354) {
					local359 = (int) ((long) Static3.anIntArray5[local207 + local194] * (long) Static83.anInt2242 >> 16);
					for (local526 = 0; local526 < local194; local526++) {
						local359 += (int) ((long) Static3.anIntArray5[local207 + local194 - local526 - 1] * (long) Static83.anIntArrayArray31[0][local526] >> 16);
					}
					for (local556 = 0; local556 < local207; local556++) {
						local359 -= (int) ((long) Static3.anIntArray5[local207 - local556 - 1] * (long) Static83.anIntArrayArray31[1][local556] >> 16);
					}
					Static3.anIntArray5[local207] = local359;
					local189 = this.aClass67_1.method1868(arg0 + 1);
					local207++;
				}
				local354 = 128;
				while (true) {
					if (local354 > arg0 - local194) {
						local354 = arg0 - local194;
					}
					while (local207 < local354) {
						local359 = (int) ((long) Static3.anIntArray5[local207 + local194] * (long) Static83.anInt2242 >> 16);
						for (local526 = 0; local526 < local194; local526++) {
							local359 += (int) ((long) Static3.anIntArray5[local207 + local194 - local526 - 1] * (long) Static83.anIntArrayArray31[0][local526] >> 16);
						}
						for (local556 = 0; local556 < local202; local556++) {
							local359 -= (int) ((long) Static3.anIntArray5[local207 - local556 - 1] * (long) Static83.anIntArrayArray31[1][local556] >> 16);
						}
						Static3.anIntArray5[local207] = local359;
						local189 = this.aClass67_1.method1868(arg0 + 1);
						local207++;
					}
					if (local207 >= arg0 - local194) {
						while (local207 < arg0) {
							local359 = 0;
							for (local526 = local207 + local194 - arg0; local526 < local194; local526++) {
								local359 += (int) ((long) Static3.anIntArray5[local207 + local194 - local526 - 1] * (long) Static83.anIntArrayArray31[0][local526] >> 16);
							}
							for (local556 = 0; local556 < local202; local556++) {
								local359 -= (int) ((long) Static3.anIntArray5[local207 - local556 - 1] * (long) Static83.anIntArrayArray31[1][local556] >> 16);
							}
							Static3.anIntArray5[local207] = local359;
							this.aClass67_1.method1868(arg0 + 1);
							local207++;
						}
						break;
					}
					local194 = this.aClass57_1.method1505(0, (float) local189 / 65536.0F);
					local202 = this.aClass57_1.method1505(1, (float) local189 / 65536.0F);
					local354 += 128;
				}
			}
		}
		for (local189 = 0; local189 < arg0; local189++) {
			if (Static3.anIntArray5[local189] < -32768) {
				Static3.anIntArray5[local189] = -32768;
			}
			if (Static3.anIntArray5[local189] > 32767) {
				Static3.anIntArray5[local189] = 32767;
			}
		}
		return Static3.anIntArray5;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)I")
	private int method30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray9[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray4[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
