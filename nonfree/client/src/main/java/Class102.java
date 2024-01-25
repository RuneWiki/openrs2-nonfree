import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class102 {

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "[I")
	private static final int[] anIntArray199 = new int[32768];

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "[I")
	private static final int[] anIntArray197;

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "Lclient!fs;")
	private Class69 aClass69_1;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "Lclient!fs;")
	private Class69 aClass69_2;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Lclient!fs;")
	private Class69 aClass69_3;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "Lclient!fs;")
	private Class69 aClass69_4;

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "Lclient!fs;")
	private Class69 aClass69_5;

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "Lclient!fs;")
	private Class69 aClass69_6;

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "Lclient!fs;")
	private Class69 aClass69_7;

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "Lclient!uo;")
	private Class205 aClass205_1;

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "Lclient!fs;")
	private Class69 aClass69_8;

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "Lclient!fs;")
	private Class69 aClass69_9;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
	public int anInt2874 = 0;

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
	public int anInt2875 = 500;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "[I")
	private final int[] anIntArray196 = new int[5];

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "[I")
	private final int[] anIntArray198 = new int[5];

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
	private int anInt2876 = 0;

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
	private int anInt2877 = 100;

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "[I")
	private final int[] anIntArray203 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray199[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray197 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray197[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!fb;)V")
	public void method2347(@OriginalArg(0) Class3_Sub4 arg0) {
		this.aClass69_9 = new Class69();
		this.aClass69_9.method1682(arg0);
		this.aClass69_1 = new Class69();
		this.aClass69_1.method1682(arg0);
		@Pc(21) int local21 = arg0.method3643();
		if (local21 != 0) {
			arg0.anInt4268--;
			this.aClass69_2 = new Class69();
			this.aClass69_2.method1682(arg0);
			this.aClass69_6 = new Class69();
			this.aClass69_6.method1682(arg0);
		}
		local21 = arg0.method3643();
		if (local21 != 0) {
			arg0.anInt4268--;
			this.aClass69_8 = new Class69();
			this.aClass69_8.method1682(arg0);
			this.aClass69_4 = new Class69();
			this.aClass69_4.method1682(arg0);
		}
		local21 = arg0.method3643();
		if (local21 != 0) {
			arg0.anInt4268--;
			this.aClass69_3 = new Class69();
			this.aClass69_3.method1682(arg0);
			this.aClass69_7 = new Class69();
			this.aClass69_7.method1682(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method3633();
			if (local114 == 0) {
				break;
			}
			this.anIntArray196[local109] = local114;
			this.anIntArray198[local109] = arg0.method3657();
			this.anIntArray203[local109] = arg0.method3633();
		}
		this.anInt2876 = arg0.method3633();
		this.anInt2877 = arg0.method3633();
		this.anInt2875 = arg0.method3649();
		this.anInt2874 = arg0.method3649();
		this.aClass205_1 = new Class205();
		this.aClass69_5 = new Class69();
		this.aClass205_1.method5304(arg0, this.aClass69_5);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[I")
	public int[] method2348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static367.method4030(Static142.anIntArray200, 0, arg0);
		if (arg1 < 10) {
			return Static142.anIntArray200;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass69_9.method1683();
		this.aClass69_1.method1683();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass69_2 != null) {
			this.aClass69_2.method1683();
			this.aClass69_6.method1683();
			local24 = (int) ((double) (this.aClass69_2.anInt2078 - this.aClass69_2.anInt2080) * 32.768D / local16);
			local26 = (int) ((double) this.aClass69_2.anInt2080 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass69_8 != null) {
			this.aClass69_8.method1683();
			this.aClass69_4.method1683();
			local63 = (int) ((double) (this.aClass69_8.anInt2078 - this.aClass69_8.anInt2080) * 32.768D / local16);
			local65 = (int) ((double) this.aClass69_8.anInt2080 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray196[local102] != 0) {
				Static142.anIntArray201[local102] = 0;
				Static142.anIntArray202[local102] = (int) ((double) this.anIntArray203[local102] * local16);
				Static142.anIntArray206[local102] = (this.anIntArray196[local102] << 14) / 100;
				Static142.anIntArray205[local102] = (int) ((double) (this.aClass69_9.anInt2078 - this.aClass69_9.anInt2080) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray198[local102]) / local16);
				Static142.anIntArray204[local102] = (int) ((double) this.aClass69_9.anInt2080 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass69_9.method1681(arg0);
			local187 = this.aClass69_1.method1681(arg0);
			if (this.aClass69_2 != null) {
				local195 = this.aClass69_2.method1681(arg0);
				local200 = this.aClass69_6.method1681(arg0);
				local182 += this.method2349(local28, local200, this.aClass69_2.anInt2079) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass69_8 != null) {
				local195 = this.aClass69_8.method1681(arg0);
				local200 = this.aClass69_4.method1681(arg0);
				local187 = local187 * ((this.method2349(local67, local200, this.aClass69_8.anInt2079) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray196[local195] != 0) {
					local200 = local176 + Static142.anIntArray202[local195];
					if (local200 < arg0) {
						Static142.anIntArray200[local200] += this.method2349(Static142.anIntArray201[local195], local187 * Static142.anIntArray206[local195] >> 15, this.aClass69_9.anInt2079);
						Static142.anIntArray201[local195] += (local182 * Static142.anIntArray205[local195] >> 16) + Static142.anIntArray204[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass69_3 != null) {
			this.aClass69_3.method1683();
			this.aClass69_7.method1683();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass69_3.method1681(arg0);
				local352 = this.aClass69_7.method1681(arg0);
				if (local339) {
					local187 = this.aClass69_3.anInt2080 + ((this.aClass69_3.anInt2078 - this.aClass69_3.anInt2080) * local347 >> 8);
				} else {
					local187 = this.aClass69_3.anInt2080 + ((this.aClass69_3.anInt2078 - this.aClass69_3.anInt2080) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static142.anIntArray200[local200] = 0;
				}
			}
		}
		if (this.anInt2876 > 0 && this.anInt2877 > 0) {
			local182 = (int) ((double) this.anInt2876 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static142.anIntArray200[local187] += Static142.anIntArray200[local187 - local182] * this.anInt2877 / 100;
			}
		}
		if (this.aClass205_1.anIntArray524[0] > 0 || this.aClass205_1.anIntArray524[1] > 0) {
			this.aClass69_5.method1683();
			local182 = this.aClass69_5.method1681(arg0 + 1);
			local187 = this.aClass205_1.method5305(0, (float) local182 / 65536.0F);
			local195 = this.aClass205_1.method5305(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static142.anIntArray200[local200 + local187] * (long) Static324.anInt6249 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static142.anIntArray200[local200 + local187 - local519 - 1] * (long) Static324.anIntArrayArray57[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static142.anIntArray200[local200 - local549 - 1] * (long) Static324.anIntArrayArray57[1][local549] >> 16);
					}
					Static142.anIntArray200[local200] = local352;
					local182 = this.aClass69_5.method1681(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static142.anIntArray200[local200 + local187] * (long) Static324.anInt6249 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static142.anIntArray200[local200 + local187 - local519 - 1] * (long) Static324.anIntArrayArray57[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static142.anIntArray200[local200 - local549 - 1] * (long) Static324.anIntArrayArray57[1][local549] >> 16);
						}
						Static142.anIntArray200[local200] = local352;
						local182 = this.aClass69_5.method1681(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static142.anIntArray200[local200 + local187 - local519 - 1] * (long) Static324.anIntArrayArray57[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static142.anIntArray200[local200 - local549 - 1] * (long) Static324.anIntArrayArray57[1][local549] >> 16);
							}
							Static142.anIntArray200[local200] = local352;
							this.aClass69_5.method1681(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass205_1.method5305(0, (float) local182 / 65536.0F);
					local195 = this.aClass205_1.method5305(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static142.anIntArray200[local182] < -32768) {
				Static142.anIntArray200[local182] = -32768;
			}
			if (Static142.anIntArray200[local182] > 32767) {
				Static142.anIntArray200[local182] = 32767;
			}
		}
		return Static142.anIntArray200;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)I")
	private int method2349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray197[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray199[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
