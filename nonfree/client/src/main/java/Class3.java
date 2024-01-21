import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "[I")
	public static int[] anIntArray13 = new int[32768];

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "[I")
	public static int[] anIntArray11;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "Lclient!ae;")
	private Class6 aClass6_1;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "Lclient!ae;")
	private Class6 aClass6_2;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "Lclient!ae;")
	private Class6 aClass6_3;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "Lclient!ae;")
	private Class6 aClass6_4;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Lclient!ae;")
	private Class6 aClass6_5;

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "Lclient!od;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "Lclient!ae;")
	private Class6 aClass6_6;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "Lclient!ae;")
	private Class6 aClass6_7;

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "Lclient!ae;")
	private Class6 aClass6_8;

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "Lclient!ae;")
	private Class6 aClass6_9;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
	public int anInt14 = 500;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
	public int anInt12 = 0;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
	private int anInt13 = 0;

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "[I")
	private final int[] anIntArray9 = new int[5];

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "[I")
	private final int[] anIntArray10 = new int[5];

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "[I")
	private final int[] anIntArray12 = new int[5];

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
	private int anInt15 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray13[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray11 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray11[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!tc;)V")
	public void method23(@OriginalArg(0) Class10_Sub10 arg0) {
		this.aClass6_8 = new Class6();
		this.aClass6_8.method40(arg0);
		this.aClass6_5 = new Class6();
		this.aClass6_5.method40(arg0);
		@Pc(21) int local21 = arg0.method1111();
		if (local21 != 0) {
			arg0.anInt1957--;
			this.aClass6_1 = new Class6();
			this.aClass6_1.method40(arg0);
			this.aClass6_2 = new Class6();
			this.aClass6_2.method40(arg0);
		}
		local21 = arg0.method1111();
		if (local21 != 0) {
			arg0.anInt1957--;
			this.aClass6_6 = new Class6();
			this.aClass6_6.method40(arg0);
			this.aClass6_4 = new Class6();
			this.aClass6_4.method40(arg0);
		}
		local21 = arg0.method1111();
		if (local21 != 0) {
			arg0.anInt1957--;
			this.aClass6_7 = new Class6();
			this.aClass6_7.method40(arg0);
			this.aClass6_3 = new Class6();
			this.aClass6_3.method40(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1136();
			if (local114 == 0) {
				break;
			}
			this.anIntArray9[local109] = local114;
			this.anIntArray10[local109] = arg0.method1121();
			this.anIntArray12[local109] = arg0.method1136();
		}
		this.anInt13 = arg0.method1136();
		this.anInt15 = arg0.method1136();
		this.anInt14 = arg0.method1160();
		this.anInt12 = arg0.method1160();
		this.aClass47_1 = new Class47();
		this.aClass6_9 = new Class6();
		this.aClass47_1.method1024(arg0, this.aClass6_9);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)I")
	private int method24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray11[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray13[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)[I")
	public int[] method25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			Static3.anIntArray14[local1] = 0;
		}
		if (arg1 < 10) {
			return Static3.anIntArray14;
		}
		@Pc(23) double local23 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass6_8.method38();
		this.aClass6_5.method38();
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (this.aClass6_1 != null) {
			this.aClass6_1.method38();
			this.aClass6_2.method38();
			local31 = (int) ((double) (this.aClass6_1.anInt37 - this.aClass6_1.anInt39) * 32.768D / local23);
			local33 = (int) ((double) this.aClass6_1.anInt39 * 32.768D / local23);
		}
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.aClass6_6 != null) {
			this.aClass6_6.method38();
			this.aClass6_4.method38();
			local70 = (int) ((double) (this.aClass6_6.anInt37 - this.aClass6_6.anInt39) * 32.768D / local23);
			local72 = (int) ((double) this.aClass6_6.anInt39 * 32.768D / local23);
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			if (this.anIntArray9[local109] != 0) {
				Static3.anIntArray17[local109] = 0;
				Static3.anIntArray18[local109] = (int) ((double) this.anIntArray12[local109] * local23);
				Static3.anIntArray16[local109] = (this.anIntArray9[local109] << 14) / 100;
				Static3.anIntArray15[local109] = (int) ((double) (this.aClass6_8.anInt37 - this.aClass6_8.anInt39) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray10[local109]) / local23);
				Static3.anIntArray19[local109] = (int) ((double) this.aClass6_8.anInt39 * 32.768D / local23);
			}
		}
		@Pc(189) int local189;
		@Pc(194) int local194;
		@Pc(202) int local202;
		@Pc(207) int local207;
		for (@Pc(183) int local183 = 0; local183 < arg0; local183++) {
			local189 = this.aClass6_8.method37(arg0);
			local194 = this.aClass6_5.method37(arg0);
			if (this.aClass6_1 != null) {
				local202 = this.aClass6_1.method37(arg0);
				local207 = this.aClass6_2.method37(arg0);
				local189 += this.method24(local35, local207, this.aClass6_1.anInt36) >> 1;
				local35 += (local202 * local31 >> 16) + local33;
			}
			if (this.aClass6_6 != null) {
				local202 = this.aClass6_6.method37(arg0);
				local207 = this.aClass6_4.method37(arg0);
				local194 = local194 * ((this.method24(local74, local207, this.aClass6_6.anInt36) >> 1) + 32768) >> 15;
				local74 += (local202 * local70 >> 16) + local72;
			}
			for (local202 = 0; local202 < 5; local202++) {
				if (this.anIntArray9[local202] != 0) {
					local207 = local183 + Static3.anIntArray18[local202];
					if (local207 < arg0) {
						Static3.anIntArray14[local207] += this.method24(Static3.anIntArray17[local202], local194 * Static3.anIntArray16[local202] >> 15, this.aClass6_8.anInt36);
						Static3.anIntArray17[local202] += (local189 * Static3.anIntArray15[local202] >> 16) + Static3.anIntArray19[local202];
					}
				}
			}
		}
		@Pc(354) int local354;
		@Pc(359) int local359;
		if (this.aClass6_7 != null) {
			this.aClass6_7.method38();
			this.aClass6_3.method38();
			local189 = 0;
			@Pc(346) boolean local346 = true;
			for (local207 = 0; local207 < arg0; local207++) {
				local354 = this.aClass6_7.method37(arg0);
				local359 = this.aClass6_3.method37(arg0);
				if (local346) {
					local194 = this.aClass6_7.anInt39 + ((this.aClass6_7.anInt37 - this.aClass6_7.anInt39) * local354 >> 8);
				} else {
					local194 = this.aClass6_7.anInt39 + ((this.aClass6_7.anInt37 - this.aClass6_7.anInt39) * local359 >> 8);
				}
				local189 += 256;
				if (local189 >= local194) {
					local189 = 0;
					local346 = !local346;
				}
				if (local346) {
					Static3.anIntArray14[local207] = 0;
				}
			}
		}
		if (this.anInt13 > 0 && this.anInt15 > 0) {
			local189 = (int) ((double) this.anInt13 * local23);
			for (local194 = local189; local194 < arg0; local194++) {
				Static3.anIntArray14[local194] += Static3.anIntArray14[local194 - local189] * this.anInt15 / 100;
			}
		}
		if (this.aClass47_1.anIntArray211[0] > 0 || this.aClass47_1.anIntArray211[1] > 0) {
			this.aClass6_9.method38();
			local189 = this.aClass6_9.method37(arg0 + 1);
			local194 = this.aClass47_1.method1027(0, (float) local189 / 65536.0F);
			local202 = this.aClass47_1.method1027(1, (float) local189 / 65536.0F);
			if (arg0 >= local194 + local202) {
				local207 = 0;
				local354 = local202;
				if (local202 > arg0 - local194) {
					local354 = arg0 - local194;
				}
				@Pc(526) int local526;
				@Pc(556) int local556;
				while (local207 < local354) {
					local359 = (int) ((long) Static3.anIntArray14[local207 + local194] * (long) Static72.anInt1842 >> 16);
					for (local526 = 0; local526 < local194; local526++) {
						local359 += (int) ((long) Static3.anIntArray14[local207 + local194 - local526 - 1] * (long) Static72.anIntArrayArray14[0][local526] >> 16);
					}
					for (local556 = 0; local556 < local207; local556++) {
						local359 -= (int) ((long) Static3.anIntArray14[local207 - local556 - 1] * (long) Static72.anIntArrayArray14[1][local556] >> 16);
					}
					Static3.anIntArray14[local207] = local359;
					local189 = this.aClass6_9.method37(arg0 + 1);
					local207++;
				}
				local354 = 128;
				while (true) {
					if (local354 > arg0 - local194) {
						local354 = arg0 - local194;
					}
					while (local207 < local354) {
						local359 = (int) ((long) Static3.anIntArray14[local207 + local194] * (long) Static72.anInt1842 >> 16);
						for (local526 = 0; local526 < local194; local526++) {
							local359 += (int) ((long) Static3.anIntArray14[local207 + local194 - local526 - 1] * (long) Static72.anIntArrayArray14[0][local526] >> 16);
						}
						for (local556 = 0; local556 < local202; local556++) {
							local359 -= (int) ((long) Static3.anIntArray14[local207 - local556 - 1] * (long) Static72.anIntArrayArray14[1][local556] >> 16);
						}
						Static3.anIntArray14[local207] = local359;
						local189 = this.aClass6_9.method37(arg0 + 1);
						local207++;
					}
					if (local207 >= arg0 - local194) {
						while (local207 < arg0) {
							local359 = 0;
							for (local526 = local207 + local194 - arg0; local526 < local194; local526++) {
								local359 += (int) ((long) Static3.anIntArray14[local207 + local194 - local526 - 1] * (long) Static72.anIntArrayArray14[0][local526] >> 16);
							}
							for (local556 = 0; local556 < local202; local556++) {
								local359 -= (int) ((long) Static3.anIntArray14[local207 - local556 - 1] * (long) Static72.anIntArrayArray14[1][local556] >> 16);
							}
							Static3.anIntArray14[local207] = local359;
							this.aClass6_9.method37(arg0 + 1);
							local207++;
						}
						break;
					}
					local194 = this.aClass47_1.method1027(0, (float) local189 / 65536.0F);
					local202 = this.aClass47_1.method1027(1, (float) local189 / 65536.0F);
					local354 += 128;
				}
			}
		}
		for (local189 = 0; local189 < arg0; local189++) {
			if (Static3.anIntArray14[local189] < -32768) {
				Static3.anIntArray14[local189] = -32768;
			}
			if (Static3.anIntArray14[local189] > 32767) {
				Static3.anIntArray14[local189] = 32767;
			}
		}
		return Static3.anIntArray14;
	}
}
