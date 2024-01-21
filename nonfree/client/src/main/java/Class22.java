import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class22 {

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "[I")
	public static int[] anIntArray73 = new int[32768];

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "[I")
	public static int[] anIntArray69;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Lclient!oe;")
	private Class62 aClass62_1;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "Lclient!rg;")
	private Class74 aClass74_1;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "Lclient!rg;")
	private Class74 aClass74_2;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "Lclient!rg;")
	private Class74 aClass74_3;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "Lclient!rg;")
	private Class74 aClass74_4;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "Lclient!rg;")
	private Class74 aClass74_5;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "Lclient!rg;")
	private Class74 aClass74_6;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "Lclient!rg;")
	private Class74 aClass74_7;

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "Lclient!rg;")
	private Class74 aClass74_8;

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "Lclient!rg;")
	private Class74 aClass74_9;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "[I")
	private final int[] anIntArray70 = new int[5];

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
	public int anInt1318 = 0;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "[I")
	private final int[] anIntArray71 = new int[5];

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
	private int anInt1315 = 0;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
	private int anInt1317 = 100;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	public int anInt1316 = 500;

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "[I")
	private final int[] anIntArray78 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray73[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray69 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray69[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)I")
	private int method844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray69[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray73[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)[I")
	public int[] method845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static184.method164(Static44.anIntArray72, 0, arg0);
		if (arg1 < 10) {
			return Static44.anIntArray72;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass74_5.method2232();
		this.aClass74_8.method2232();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass74_6 != null) {
			this.aClass74_6.method2232();
			this.aClass74_9.method2232();
			local24 = (int) ((double) (this.aClass74_6.anInt3391 - this.aClass74_6.anInt3390) * 32.768D / local16);
			local26 = (int) ((double) this.aClass74_6.anInt3390 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass74_2 != null) {
			this.aClass74_2.method2232();
			this.aClass74_1.method2232();
			local63 = (int) ((double) (this.aClass74_2.anInt3391 - this.aClass74_2.anInt3390) * 32.768D / local16);
			local65 = (int) ((double) this.aClass74_2.anInt3390 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray70[local102] != 0) {
				Static44.anIntArray74[local102] = 0;
				Static44.anIntArray77[local102] = (int) ((double) this.anIntArray78[local102] * local16);
				Static44.anIntArray76[local102] = (this.anIntArray70[local102] << 14) / 100;
				Static44.anIntArray75[local102] = (int) ((double) (this.aClass74_5.anInt3391 - this.aClass74_5.anInt3390) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray71[local102]) / local16);
				Static44.anIntArray79[local102] = (int) ((double) this.aClass74_5.anInt3390 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass74_5.method2230(arg0);
			local187 = this.aClass74_8.method2230(arg0);
			if (this.aClass74_6 != null) {
				local195 = this.aClass74_6.method2230(arg0);
				local200 = this.aClass74_9.method2230(arg0);
				local182 += this.method844(local28, local200, this.aClass74_6.anInt3392) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass74_2 != null) {
				local195 = this.aClass74_2.method2230(arg0);
				local200 = this.aClass74_1.method2230(arg0);
				local187 = local187 * ((this.method844(local67, local200, this.aClass74_2.anInt3392) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray70[local195] != 0) {
					local200 = local176 + Static44.anIntArray77[local195];
					if (local200 < arg0) {
						Static44.anIntArray72[local200] += this.method844(Static44.anIntArray74[local195], local187 * Static44.anIntArray76[local195] >> 15, this.aClass74_5.anInt3392);
						Static44.anIntArray74[local195] += (local182 * Static44.anIntArray75[local195] >> 16) + Static44.anIntArray79[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass74_4 != null) {
			this.aClass74_4.method2232();
			this.aClass74_7.method2232();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass74_4.method2230(arg0);
				local352 = this.aClass74_7.method2230(arg0);
				if (local339) {
					local187 = this.aClass74_4.anInt3390 + ((this.aClass74_4.anInt3391 - this.aClass74_4.anInt3390) * local347 >> 8);
				} else {
					local187 = this.aClass74_4.anInt3390 + ((this.aClass74_4.anInt3391 - this.aClass74_4.anInt3390) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static44.anIntArray72[local200] = 0;
				}
			}
		}
		if (this.anInt1315 > 0 && this.anInt1317 > 0) {
			local182 = (int) ((double) this.anInt1315 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static44.anIntArray72[local187] += Static44.anIntArray72[local187 - local182] * this.anInt1317 / 100;
			}
		}
		if (this.aClass62_1.anIntArray241[0] > 0 || this.aClass62_1.anIntArray241[1] > 0) {
			this.aClass74_3.method2232();
			local182 = this.aClass74_3.method2230(arg0 + 1);
			local187 = this.aClass62_1.method1882(0, (float) local182 / 65536.0F);
			local195 = this.aClass62_1.method1882(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static44.anIntArray72[local200 + local187] * (long) Static119.anInt2809 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static44.anIntArray72[local200 + local187 - local519 - 1] * (long) Static119.anIntArrayArray47[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static44.anIntArray72[local200 - local549 - 1] * (long) Static119.anIntArrayArray47[1][local549] >> 16);
					}
					Static44.anIntArray72[local200] = local352;
					local182 = this.aClass74_3.method2230(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static44.anIntArray72[local200 + local187] * (long) Static119.anInt2809 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static44.anIntArray72[local200 + local187 - local519 - 1] * (long) Static119.anIntArrayArray47[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static44.anIntArray72[local200 - local549 - 1] * (long) Static119.anIntArrayArray47[1][local549] >> 16);
						}
						Static44.anIntArray72[local200] = local352;
						local182 = this.aClass74_3.method2230(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static44.anIntArray72[local200 + local187 - local519 - 1] * (long) Static119.anIntArrayArray47[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static44.anIntArray72[local200 - local549 - 1] * (long) Static119.anIntArrayArray47[1][local549] >> 16);
							}
							Static44.anIntArray72[local200] = local352;
							this.aClass74_3.method2230(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass62_1.method1882(0, (float) local182 / 65536.0F);
					local195 = this.aClass62_1.method1882(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static44.anIntArray72[local182] < -32768) {
				Static44.anIntArray72[local182] = -32768;
			}
			if (Static44.anIntArray72[local182] > 32767) {
				Static44.anIntArray72[local182] = 32767;
			}
		}
		return Static44.anIntArray72;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!me;)V")
	public void method846(@OriginalArg(0) Class2_Sub13 arg0) {
		this.aClass74_5 = new Class74();
		this.aClass74_5.method2231(arg0);
		this.aClass74_8 = new Class74();
		this.aClass74_8.method2231(arg0);
		@Pc(21) int local21 = arg0.method1402();
		if (local21 != 0) {
			arg0.anInt2154--;
			this.aClass74_6 = new Class74();
			this.aClass74_6.method2231(arg0);
			this.aClass74_9 = new Class74();
			this.aClass74_9.method2231(arg0);
		}
		local21 = arg0.method1402();
		if (local21 != 0) {
			arg0.anInt2154--;
			this.aClass74_2 = new Class74();
			this.aClass74_2.method2231(arg0);
			this.aClass74_1 = new Class74();
			this.aClass74_1.method2231(arg0);
		}
		local21 = arg0.method1402();
		if (local21 != 0) {
			arg0.anInt2154--;
			this.aClass74_4 = new Class74();
			this.aClass74_4.method2231(arg0);
			this.aClass74_7 = new Class74();
			this.aClass74_7.method2231(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1439();
			if (local114 == 0) {
				break;
			}
			this.anIntArray70[local109] = local114;
			this.anIntArray71[local109] = arg0.method1429();
			this.anIntArray78[local109] = arg0.method1439();
		}
		this.anInt1315 = arg0.method1439();
		this.anInt1317 = arg0.method1439();
		this.anInt1316 = arg0.method1397();
		this.anInt1318 = arg0.method1397();
		this.aClass62_1 = new Class62();
		this.aClass74_3 = new Class74();
		this.aClass62_1.method1886(arg0, this.aClass74_3);
	}
}
