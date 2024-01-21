import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class52 {

	@OriginalMember(owner = "client!na", name = "l", descriptor = "[I")
	public static int[] anIntArray250 = new int[32768];

	@OriginalMember(owner = "client!na", name = "a", descriptor = "[I")
	public static int[] anIntArray248;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "Lclient!de;")
	private Class16 aClass16_1;

	@OriginalMember(owner = "client!na", name = "e", descriptor = "Lclient!de;")
	private Class16 aClass16_2;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "Lclient!de;")
	private Class16 aClass16_3;

	@OriginalMember(owner = "client!na", name = "g", descriptor = "Lclient!de;")
	private Class16 aClass16_4;

	@OriginalMember(owner = "client!na", name = "i", descriptor = "Lclient!de;")
	private Class16 aClass16_5;

	@OriginalMember(owner = "client!na", name = "j", descriptor = "Lclient!re;")
	private Class68 aClass68_1;

	@OriginalMember(owner = "client!na", name = "k", descriptor = "Lclient!de;")
	private Class16 aClass16_6;

	@OriginalMember(owner = "client!na", name = "n", descriptor = "Lclient!de;")
	private Class16 aClass16_7;

	@OriginalMember(owner = "client!na", name = "p", descriptor = "Lclient!de;")
	private Class16 aClass16_8;

	@OriginalMember(owner = "client!na", name = "q", descriptor = "Lclient!de;")
	private Class16 aClass16_9;

	@OriginalMember(owner = "client!na", name = "h", descriptor = "[I")
	private final int[] anIntArray249 = new int[5];

	@OriginalMember(owner = "client!na", name = "b", descriptor = "I")
	private int anInt2103 = 100;

	@OriginalMember(owner = "client!na", name = "m", descriptor = "I")
	public int anInt2105 = 0;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "I")
	public int anInt2104 = 500;

	@OriginalMember(owner = "client!na", name = "o", descriptor = "I")
	private int anInt2106 = 0;

	@OriginalMember(owner = "client!na", name = "r", descriptor = "[I")
	private final int[] anIntArray251 = new int[5];

	@OriginalMember(owner = "client!na", name = "v", descriptor = "[I")
	private final int[] anIntArray255 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray250[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray248 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray248[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(III)I")
	private int method1372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray248[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray250[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)[I")
	public int[] method1373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static140.method1969(Static79.anIntArray252, 0, arg0);
		if (arg1 < 10) {
			return Static79.anIntArray252;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass16_5.method495();
		this.aClass16_4.method495();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass16_8 != null) {
			this.aClass16_8.method495();
			this.aClass16_1.method495();
			local24 = (int) ((double) (this.aClass16_8.anInt821 - this.aClass16_8.anInt822) * 32.768D / local16);
			local26 = (int) ((double) this.aClass16_8.anInt822 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass16_7 != null) {
			this.aClass16_7.method495();
			this.aClass16_6.method495();
			local63 = (int) ((double) (this.aClass16_7.anInt821 - this.aClass16_7.anInt822) * 32.768D / local16);
			local65 = (int) ((double) this.aClass16_7.anInt822 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray251[local102] != 0) {
				Static79.anIntArray256[local102] = 0;
				Static79.anIntArray258[local102] = (int) ((double) this.anIntArray249[local102] * local16);
				Static79.anIntArray253[local102] = (this.anIntArray251[local102] << 14) / 100;
				Static79.anIntArray254[local102] = (int) ((double) (this.aClass16_5.anInt821 - this.aClass16_5.anInt822) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray255[local102]) / local16);
				Static79.anIntArray257[local102] = (int) ((double) this.aClass16_5.anInt822 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass16_5.method492(arg0);
			local187 = this.aClass16_4.method492(arg0);
			if (this.aClass16_8 != null) {
				local195 = this.aClass16_8.method492(arg0);
				local200 = this.aClass16_1.method492(arg0);
				local182 += this.method1372(local28, local200, this.aClass16_8.anInt823) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass16_7 != null) {
				local195 = this.aClass16_7.method492(arg0);
				local200 = this.aClass16_6.method492(arg0);
				local187 = local187 * ((this.method1372(local67, local200, this.aClass16_7.anInt823) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray251[local195] != 0) {
					local200 = local176 + Static79.anIntArray258[local195];
					if (local200 < arg0) {
						Static79.anIntArray252[local200] += this.method1372(Static79.anIntArray256[local195], local187 * Static79.anIntArray253[local195] >> 15, this.aClass16_5.anInt823);
						Static79.anIntArray256[local195] += (local182 * Static79.anIntArray254[local195] >> 16) + Static79.anIntArray257[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass16_3 != null) {
			this.aClass16_3.method495();
			this.aClass16_2.method495();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass16_3.method492(arg0);
				local352 = this.aClass16_2.method492(arg0);
				if (local339) {
					local187 = this.aClass16_3.anInt822 + ((this.aClass16_3.anInt821 - this.aClass16_3.anInt822) * local347 >> 8);
				} else {
					local187 = this.aClass16_3.anInt822 + ((this.aClass16_3.anInt821 - this.aClass16_3.anInt822) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static79.anIntArray252[local200] = 0;
				}
			}
		}
		if (this.anInt2106 > 0 && this.anInt2103 > 0) {
			local182 = (int) ((double) this.anInt2106 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static79.anIntArray252[local187] += Static79.anIntArray252[local187 - local182] * this.anInt2103 / 100;
			}
		}
		if (this.aClass68_1.anIntArray323[0] > 0 || this.aClass68_1.anIntArray323[1] > 0) {
			this.aClass16_9.method495();
			local182 = this.aClass16_9.method492(arg0 + 1);
			local187 = this.aClass68_1.method1715(0, (float) local182 / 65536.0F);
			local195 = this.aClass68_1.method1715(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static79.anIntArray252[local200 + local187] * (long) Static104.anInt2588 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static79.anIntArray252[local200 + local187 - local519 - 1] * (long) Static104.anIntArrayArray27[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static79.anIntArray252[local200 - local549 - 1] * (long) Static104.anIntArrayArray27[1][local549] >> 16);
					}
					Static79.anIntArray252[local200] = local352;
					local182 = this.aClass16_9.method492(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static79.anIntArray252[local200 + local187] * (long) Static104.anInt2588 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static79.anIntArray252[local200 + local187 - local519 - 1] * (long) Static104.anIntArrayArray27[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static79.anIntArray252[local200 - local549 - 1] * (long) Static104.anIntArrayArray27[1][local549] >> 16);
						}
						Static79.anIntArray252[local200] = local352;
						local182 = this.aClass16_9.method492(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static79.anIntArray252[local200 + local187 - local519 - 1] * (long) Static104.anIntArrayArray27[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static79.anIntArray252[local200 - local549 - 1] * (long) Static104.anIntArrayArray27[1][local549] >> 16);
							}
							Static79.anIntArray252[local200] = local352;
							this.aClass16_9.method492(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass68_1.method1715(0, (float) local182 / 65536.0F);
					local195 = this.aClass68_1.method1715(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static79.anIntArray252[local182] < -32768) {
				Static79.anIntArray252[local182] = -32768;
			}
			if (Static79.anIntArray252[local182] > 32767) {
				Static79.anIntArray252[local182] = 32767;
			}
		}
		return Static79.anIntArray252;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!of;)V")
	public void method1375(@OriginalArg(0) Class1_Sub19 arg0) {
		this.aClass16_5 = new Class16();
		this.aClass16_5.method493(arg0);
		this.aClass16_4 = new Class16();
		this.aClass16_4.method493(arg0);
		@Pc(21) int local21 = arg0.method2072();
		if (local21 != 0) {
			arg0.anInt3111--;
			this.aClass16_8 = new Class16();
			this.aClass16_8.method493(arg0);
			this.aClass16_1 = new Class16();
			this.aClass16_1.method493(arg0);
		}
		local21 = arg0.method2072();
		if (local21 != 0) {
			arg0.anInt3111--;
			this.aClass16_7 = new Class16();
			this.aClass16_7.method493(arg0);
			this.aClass16_6 = new Class16();
			this.aClass16_6.method493(arg0);
		}
		local21 = arg0.method2072();
		if (local21 != 0) {
			arg0.anInt3111--;
			this.aClass16_3 = new Class16();
			this.aClass16_3.method493(arg0);
			this.aClass16_2 = new Class16();
			this.aClass16_2.method493(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method2078();
			if (local114 == 0) {
				break;
			}
			this.anIntArray251[local109] = local114;
			this.anIntArray255[local109] = arg0.method2060();
			this.anIntArray249[local109] = arg0.method2078();
		}
		this.anInt2106 = arg0.method2078();
		this.anInt2103 = arg0.method2078();
		this.anInt2104 = arg0.method2051();
		this.anInt2105 = arg0.method2051();
		this.aClass68_1 = new Class68();
		this.aClass16_9 = new Class16();
		this.aClass68_1.method1713(arg0, this.aClass16_9);
	}
}
