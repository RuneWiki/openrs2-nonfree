import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class64 {

	@OriginalMember(owner = "client!ue", name = "q", descriptor = "[I")
	public static int[] anIntArray329 = new int[32768];

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "[I")
	public static int[] anIntArray324;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "Lclient!ee;")
	private Class19 aClass19_1;

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "Lclient!c;")
	private Class9 aClass9_1;

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "Lclient!c;")
	private Class9 aClass9_2;

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "Lclient!c;")
	private Class9 aClass9_3;

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "Lclient!c;")
	private Class9 aClass9_4;

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "Lclient!c;")
	private Class9 aClass9_5;

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "Lclient!c;")
	private Class9 aClass9_6;

	@OriginalMember(owner = "client!ue", name = "p", descriptor = "Lclient!c;")
	private Class9 aClass9_7;

	@OriginalMember(owner = "client!ue", name = "w", descriptor = "Lclient!c;")
	private Class9 aClass9_8;

	@OriginalMember(owner = "client!ue", name = "x", descriptor = "Lclient!c;")
	private Class9 aClass9_9;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "[I")
	private final int[] anIntArray325 = new int[5];

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "[I")
	private final int[] anIntArray327 = new int[5];

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
	private int anInt2631 = 0;

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "[I")
	private final int[] anIntArray328 = new int[5];

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
	public int anInt2630 = 0;

	@OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
	private int anInt2632 = 100;

	@OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
	public int anInt2633 = 500;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray329[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray324 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray324[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!ba;)V")
	public void method1732(@OriginalArg(0) Class2_Sub3 arg0) {
		this.aClass9_5 = new Class9();
		this.aClass9_5.method417(arg0);
		this.aClass9_7 = new Class9();
		this.aClass9_7.method417(arg0);
		@Pc(21) int local21 = arg0.method791();
		if (local21 != 0) {
			arg0.anInt1168--;
			this.aClass9_3 = new Class9();
			this.aClass9_3.method417(arg0);
			this.aClass9_9 = new Class9();
			this.aClass9_9.method417(arg0);
		}
		local21 = arg0.method791();
		if (local21 != 0) {
			arg0.anInt1168--;
			this.aClass9_6 = new Class9();
			this.aClass9_6.method417(arg0);
			this.aClass9_2 = new Class9();
			this.aClass9_2.method417(arg0);
		}
		local21 = arg0.method791();
		if (local21 != 0) {
			arg0.anInt1168--;
			this.aClass9_8 = new Class9();
			this.aClass9_8.method417(arg0);
			this.aClass9_1 = new Class9();
			this.aClass9_1.method417(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method825();
			if (local114 == 0) {
				break;
			}
			this.anIntArray328[local109] = local114;
			this.anIntArray325[local109] = arg0.method805();
			this.anIntArray327[local109] = arg0.method825();
		}
		this.anInt2631 = arg0.method825();
		this.anInt2632 = arg0.method825();
		this.anInt2633 = arg0.method792();
		this.anInt2630 = arg0.method792();
		this.aClass19_1 = new Class19();
		this.aClass9_4 = new Class9();
		this.aClass19_1.method719(arg0, this.aClass9_4);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)I")
	private int method1734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray324[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray329[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)[I")
	public int[] method1735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			Static105.anIntArray326[local1] = 0;
		}
		if (arg1 < 10) {
			return Static105.anIntArray326;
		}
		@Pc(23) double local23 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass9_5.method416();
		this.aClass9_7.method416();
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (this.aClass9_3 != null) {
			this.aClass9_3.method416();
			this.aClass9_9.method416();
			local31 = (int) ((double) (this.aClass9_3.anInt625 - this.aClass9_3.anInt623) * 32.768D / local23);
			local33 = (int) ((double) this.aClass9_3.anInt623 * 32.768D / local23);
		}
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.aClass9_6 != null) {
			this.aClass9_6.method416();
			this.aClass9_2.method416();
			local70 = (int) ((double) (this.aClass9_6.anInt625 - this.aClass9_6.anInt623) * 32.768D / local23);
			local72 = (int) ((double) this.aClass9_6.anInt623 * 32.768D / local23);
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			if (this.anIntArray328[local109] != 0) {
				Static105.anIntArray334[local109] = 0;
				Static105.anIntArray332[local109] = (int) ((double) this.anIntArray327[local109] * local23);
				Static105.anIntArray330[local109] = (this.anIntArray328[local109] << 14) / 100;
				Static105.anIntArray331[local109] = (int) ((double) (this.aClass9_5.anInt625 - this.aClass9_5.anInt623) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray325[local109]) / local23);
				Static105.anIntArray333[local109] = (int) ((double) this.aClass9_5.anInt623 * 32.768D / local23);
			}
		}
		@Pc(189) int local189;
		@Pc(194) int local194;
		@Pc(202) int local202;
		@Pc(207) int local207;
		for (@Pc(183) int local183 = 0; local183 < arg0; local183++) {
			local189 = this.aClass9_5.method419(arg0);
			local194 = this.aClass9_7.method419(arg0);
			if (this.aClass9_3 != null) {
				local202 = this.aClass9_3.method419(arg0);
				local207 = this.aClass9_9.method419(arg0);
				local189 += this.method1734(local35, local207, this.aClass9_3.anInt624) >> 1;
				local35 += (local202 * local31 >> 16) + local33;
			}
			if (this.aClass9_6 != null) {
				local202 = this.aClass9_6.method419(arg0);
				local207 = this.aClass9_2.method419(arg0);
				local194 = local194 * ((this.method1734(local74, local207, this.aClass9_6.anInt624) >> 1) + 32768) >> 15;
				local74 += (local202 * local70 >> 16) + local72;
			}
			for (local202 = 0; local202 < 5; local202++) {
				if (this.anIntArray328[local202] != 0) {
					local207 = local183 + Static105.anIntArray332[local202];
					if (local207 < arg0) {
						Static105.anIntArray326[local207] += this.method1734(Static105.anIntArray334[local202], local194 * Static105.anIntArray330[local202] >> 15, this.aClass9_5.anInt624);
						Static105.anIntArray334[local202] += (local189 * Static105.anIntArray331[local202] >> 16) + Static105.anIntArray333[local202];
					}
				}
			}
		}
		@Pc(354) int local354;
		@Pc(359) int local359;
		if (this.aClass9_8 != null) {
			this.aClass9_8.method416();
			this.aClass9_1.method416();
			local189 = 0;
			@Pc(346) boolean local346 = true;
			for (local207 = 0; local207 < arg0; local207++) {
				local354 = this.aClass9_8.method419(arg0);
				local359 = this.aClass9_1.method419(arg0);
				if (local346) {
					local194 = this.aClass9_8.anInt623 + ((this.aClass9_8.anInt625 - this.aClass9_8.anInt623) * local354 >> 8);
				} else {
					local194 = this.aClass9_8.anInt623 + ((this.aClass9_8.anInt625 - this.aClass9_8.anInt623) * local359 >> 8);
				}
				local189 += 256;
				if (local189 >= local194) {
					local189 = 0;
					local346 = !local346;
				}
				if (local346) {
					Static105.anIntArray326[local207] = 0;
				}
			}
		}
		if (this.anInt2631 > 0 && this.anInt2632 > 0) {
			local189 = (int) ((double) this.anInt2631 * local23);
			for (local194 = local189; local194 < arg0; local194++) {
				Static105.anIntArray326[local194] += Static105.anIntArray326[local194 - local189] * this.anInt2632 / 100;
			}
		}
		if (this.aClass19_1.anIntArray112[0] > 0 || this.aClass19_1.anIntArray112[1] > 0) {
			this.aClass9_4.method416();
			local189 = this.aClass9_4.method419(arg0 + 1);
			local194 = this.aClass19_1.method722(0, (float) local189 / 65536.0F);
			local202 = this.aClass19_1.method722(1, (float) local189 / 65536.0F);
			if (arg0 >= local194 + local202) {
				local207 = 0;
				local354 = local202;
				if (local202 > arg0 - local194) {
					local354 = arg0 - local194;
				}
				@Pc(526) int local526;
				@Pc(556) int local556;
				while (local207 < local354) {
					local359 = (int) ((long) Static105.anIntArray326[local207 + local194] * (long) Static26.anInt1029 >> 16);
					for (local526 = 0; local526 < local194; local526++) {
						local359 += (int) ((long) Static105.anIntArray326[local207 + local194 - local526 - 1] * (long) Static26.anIntArrayArray8[0][local526] >> 16);
					}
					for (local556 = 0; local556 < local207; local556++) {
						local359 -= (int) ((long) Static105.anIntArray326[local207 - local556 - 1] * (long) Static26.anIntArrayArray8[1][local556] >> 16);
					}
					Static105.anIntArray326[local207] = local359;
					local189 = this.aClass9_4.method419(arg0 + 1);
					local207++;
				}
				local354 = 128;
				while (true) {
					if (local354 > arg0 - local194) {
						local354 = arg0 - local194;
					}
					while (local207 < local354) {
						local359 = (int) ((long) Static105.anIntArray326[local207 + local194] * (long) Static26.anInt1029 >> 16);
						for (local526 = 0; local526 < local194; local526++) {
							local359 += (int) ((long) Static105.anIntArray326[local207 + local194 - local526 - 1] * (long) Static26.anIntArrayArray8[0][local526] >> 16);
						}
						for (local556 = 0; local556 < local202; local556++) {
							local359 -= (int) ((long) Static105.anIntArray326[local207 - local556 - 1] * (long) Static26.anIntArrayArray8[1][local556] >> 16);
						}
						Static105.anIntArray326[local207] = local359;
						local189 = this.aClass9_4.method419(arg0 + 1);
						local207++;
					}
					if (local207 >= arg0 - local194) {
						while (local207 < arg0) {
							local359 = 0;
							for (local526 = local207 + local194 - arg0; local526 < local194; local526++) {
								local359 += (int) ((long) Static105.anIntArray326[local207 + local194 - local526 - 1] * (long) Static26.anIntArrayArray8[0][local526] >> 16);
							}
							for (local556 = 0; local556 < local202; local556++) {
								local359 -= (int) ((long) Static105.anIntArray326[local207 - local556 - 1] * (long) Static26.anIntArrayArray8[1][local556] >> 16);
							}
							Static105.anIntArray326[local207] = local359;
							this.aClass9_4.method419(arg0 + 1);
							local207++;
						}
						break;
					}
					local194 = this.aClass19_1.method722(0, (float) local189 / 65536.0F);
					local202 = this.aClass19_1.method722(1, (float) local189 / 65536.0F);
					local354 += 128;
				}
			}
		}
		for (local189 = 0; local189 < arg0; local189++) {
			if (Static105.anIntArray326[local189] < -32768) {
				Static105.anIntArray326[local189] = -32768;
			}
			if (Static105.anIntArray326[local189] > 32767) {
				Static105.anIntArray326[local189] = 32767;
			}
		}
		return Static105.anIntArray326;
	}
}
