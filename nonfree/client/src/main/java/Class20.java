import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class20 {

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "[I")
	public static int[] anIntArray155 = new int[32768];

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "[I")
	public static int[] anIntArray152;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "Lclient!ub;")
	private Class75 aClass75_1;

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "Lclient!ub;")
	private Class75 aClass75_2;

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "Lclient!ub;")
	private Class75 aClass75_3;

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "Lclient!ub;")
	private Class75 aClass75_4;

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "Lclient!ub;")
	private Class75 aClass75_5;

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "Lclient!ub;")
	private Class75 aClass75_6;

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "Lclient!ub;")
	private Class75 aClass75_7;

	@OriginalMember(owner = "client!ef", name = "o", descriptor = "Lclient!ub;")
	private Class75 aClass75_8;

	@OriginalMember(owner = "client!ef", name = "q", descriptor = "Lclient!ub;")
	private Class75 aClass75_9;

	@OriginalMember(owner = "client!ef", name = "r", descriptor = "Lclient!wd;")
	private Class81 aClass81_1;

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
	public int anInt935 = 500;

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
	public int anInt937 = 0;

	@OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
	private int anInt938 = 100;

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
	private int anInt936 = 0;

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "[I")
	private final int[] anIntArray150 = new int[5];

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "[I")
	private final int[] anIntArray153 = new int[5];

	@OriginalMember(owner = "client!ef", name = "s", descriptor = "[I")
	private final int[] anIntArray154 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray155[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray152 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray152[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)[I")
	public int[] method664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static138.method1879(Static34.anIntArray151, 0, arg0);
		if (arg1 < 10) {
			return Static34.anIntArray151;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass75_3.method2124();
		this.aClass75_5.method2124();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass75_6 != null) {
			this.aClass75_6.method2124();
			this.aClass75_9.method2124();
			local24 = (int) ((double) (this.aClass75_6.anInt2995 - this.aClass75_6.anInt2994) * 32.768D / local16);
			local26 = (int) ((double) this.aClass75_6.anInt2994 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass75_7 != null) {
			this.aClass75_7.method2124();
			this.aClass75_2.method2124();
			local63 = (int) ((double) (this.aClass75_7.anInt2995 - this.aClass75_7.anInt2994) * 32.768D / local16);
			local65 = (int) ((double) this.aClass75_7.anInt2994 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray154[local102] != 0) {
				Static34.anIntArray159[local102] = 0;
				Static34.anIntArray156[local102] = (int) ((double) this.anIntArray150[local102] * local16);
				Static34.anIntArray160[local102] = (this.anIntArray154[local102] << 14) / 100;
				Static34.anIntArray158[local102] = (int) ((double) (this.aClass75_3.anInt2995 - this.aClass75_3.anInt2994) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray153[local102]) / local16);
				Static34.anIntArray157[local102] = (int) ((double) this.aClass75_3.anInt2994 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass75_3.method2126(arg0);
			local187 = this.aClass75_5.method2126(arg0);
			if (this.aClass75_6 != null) {
				local195 = this.aClass75_6.method2126(arg0);
				local200 = this.aClass75_9.method2126(arg0);
				local182 += this.method665(local28, local200, this.aClass75_6.anInt2992) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass75_7 != null) {
				local195 = this.aClass75_7.method2126(arg0);
				local200 = this.aClass75_2.method2126(arg0);
				local187 = local187 * ((this.method665(local67, local200, this.aClass75_7.anInt2992) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray154[local195] != 0) {
					local200 = local176 + Static34.anIntArray156[local195];
					if (local200 < arg0) {
						Static34.anIntArray151[local200] += this.method665(Static34.anIntArray159[local195], local187 * Static34.anIntArray160[local195] >> 15, this.aClass75_3.anInt2992);
						Static34.anIntArray159[local195] += (local182 * Static34.anIntArray158[local195] >> 16) + Static34.anIntArray157[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass75_1 != null) {
			this.aClass75_1.method2124();
			this.aClass75_4.method2124();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass75_1.method2126(arg0);
				local352 = this.aClass75_4.method2126(arg0);
				if (local339) {
					local187 = this.aClass75_1.anInt2994 + ((this.aClass75_1.anInt2995 - this.aClass75_1.anInt2994) * local347 >> 8);
				} else {
					local187 = this.aClass75_1.anInt2994 + ((this.aClass75_1.anInt2995 - this.aClass75_1.anInt2994) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static34.anIntArray151[local200] = 0;
				}
			}
		}
		if (this.anInt936 > 0 && this.anInt938 > 0) {
			local182 = (int) ((double) this.anInt936 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static34.anIntArray151[local187] += Static34.anIntArray151[local187 - local182] * this.anInt938 / 100;
			}
		}
		if (this.aClass81_1.anIntArray466[0] > 0 || this.aClass81_1.anIntArray466[1] > 0) {
			this.aClass75_8.method2124();
			local182 = this.aClass75_8.method2126(arg0 + 1);
			local187 = this.aClass81_1.method2257(0, (float) local182 / 65536.0F);
			local195 = this.aClass81_1.method2257(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static34.anIntArray151[local200 + local187] * (long) Static130.anInt3263 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static34.anIntArray151[local200 + local187 - local519 - 1] * (long) Static130.anIntArrayArray88[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static34.anIntArray151[local200 - local549 - 1] * (long) Static130.anIntArrayArray88[1][local549] >> 16);
					}
					Static34.anIntArray151[local200] = local352;
					local182 = this.aClass75_8.method2126(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static34.anIntArray151[local200 + local187] * (long) Static130.anInt3263 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static34.anIntArray151[local200 + local187 - local519 - 1] * (long) Static130.anIntArrayArray88[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static34.anIntArray151[local200 - local549 - 1] * (long) Static130.anIntArrayArray88[1][local549] >> 16);
						}
						Static34.anIntArray151[local200] = local352;
						local182 = this.aClass75_8.method2126(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static34.anIntArray151[local200 + local187 - local519 - 1] * (long) Static130.anIntArrayArray88[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static34.anIntArray151[local200 - local549 - 1] * (long) Static130.anIntArrayArray88[1][local549] >> 16);
							}
							Static34.anIntArray151[local200] = local352;
							this.aClass75_8.method2126(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass81_1.method2257(0, (float) local182 / 65536.0F);
					local195 = this.aClass81_1.method2257(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static34.anIntArray151[local182] < -32768) {
				Static34.anIntArray151[local182] = -32768;
			}
			if (Static34.anIntArray151[local182] > 32767) {
				Static34.anIntArray151[local182] = 32767;
			}
		}
		return Static34.anIntArray151;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)I")
	private int method665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray152[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray155[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!rd;)V")
	public void method667(@OriginalArg(0) Class1_Sub20 arg0) {
		this.aClass75_3 = new Class75();
		this.aClass75_3.method2123(arg0);
		this.aClass75_5 = new Class75();
		this.aClass75_5.method2123(arg0);
		@Pc(21) int local21 = arg0.method2053();
		if (local21 != 0) {
			arg0.anInt2951--;
			this.aClass75_6 = new Class75();
			this.aClass75_6.method2123(arg0);
			this.aClass75_9 = new Class75();
			this.aClass75_9.method2123(arg0);
		}
		local21 = arg0.method2053();
		if (local21 != 0) {
			arg0.anInt2951--;
			this.aClass75_7 = new Class75();
			this.aClass75_7.method2123(arg0);
			this.aClass75_2 = new Class75();
			this.aClass75_2.method2123(arg0);
		}
		local21 = arg0.method2053();
		if (local21 != 0) {
			arg0.anInt2951--;
			this.aClass75_1 = new Class75();
			this.aClass75_1.method2123(arg0);
			this.aClass75_4 = new Class75();
			this.aClass75_4.method2123(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method2056();
			if (local114 == 0) {
				break;
			}
			this.anIntArray154[local109] = local114;
			this.anIntArray153[local109] = arg0.method2080();
			this.anIntArray150[local109] = arg0.method2056();
		}
		this.anInt936 = arg0.method2056();
		this.anInt938 = arg0.method2056();
		this.anInt935 = arg0.method2087();
		this.anInt937 = arg0.method2087();
		this.aClass81_1 = new Class81();
		this.aClass75_8 = new Class75();
		this.aClass81_1.method2256(arg0, this.aClass75_8);
	}
}
