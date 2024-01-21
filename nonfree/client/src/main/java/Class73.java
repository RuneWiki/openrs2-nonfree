import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class73 {

	@OriginalMember(owner = "client!se", name = "t", descriptor = "[I")
	public static int[] anIntArray388 = new int[32768];

	@OriginalMember(owner = "client!se", name = "s", descriptor = "[I")
	public static int[] anIntArray387;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "Lclient!sc;")
	private Class72 aClass72_1;

	@OriginalMember(owner = "client!se", name = "b", descriptor = "Lclient!sc;")
	private Class72 aClass72_2;

	@OriginalMember(owner = "client!se", name = "c", descriptor = "Lclient!sc;")
	private Class72 aClass72_3;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "Lclient!sc;")
	private Class72 aClass72_4;

	@OriginalMember(owner = "client!se", name = "e", descriptor = "Lclient!sc;")
	private Class72 aClass72_5;

	@OriginalMember(owner = "client!se", name = "i", descriptor = "Lclient!sc;")
	private Class72 aClass72_6;

	@OriginalMember(owner = "client!se", name = "k", descriptor = "Lclient!jh;")
	private Class40 aClass40_1;

	@OriginalMember(owner = "client!se", name = "m", descriptor = "Lclient!sc;")
	private Class72 aClass72_7;

	@OriginalMember(owner = "client!se", name = "n", descriptor = "Lclient!sc;")
	private Class72 aClass72_8;

	@OriginalMember(owner = "client!se", name = "r", descriptor = "Lclient!sc;")
	private Class72 aClass72_9;

	@OriginalMember(owner = "client!se", name = "f", descriptor = "I")
	private int anInt4031 = 0;

	@OriginalMember(owner = "client!se", name = "o", descriptor = "I")
	private int anInt4032 = 100;

	@OriginalMember(owner = "client!se", name = "j", descriptor = "[I")
	private final int[] anIntArray385 = new int[5];

	@OriginalMember(owner = "client!se", name = "l", descriptor = "[I")
	private final int[] anIntArray386 = new int[5];

	@OriginalMember(owner = "client!se", name = "p", descriptor = "I")
	public int anInt4033 = 0;

	@OriginalMember(owner = "client!se", name = "q", descriptor = "I")
	public int anInt4034 = 500;

	@OriginalMember(owner = "client!se", name = "h", descriptor = "[I")
	private final int[] anIntArray384 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray388[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray387 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray387[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!fa;)V")
	public void method3078(@OriginalArg(0) Class1_Sub9 arg0) {
		this.aClass72_4 = new Class72();
		this.aClass72_4.method3074(arg0);
		this.aClass72_6 = new Class72();
		this.aClass72_6.method3074(arg0);
		@Pc(21) int local21 = arg0.method1234();
		if (local21 != 0) {
			arg0.anInt1592--;
			this.aClass72_3 = new Class72();
			this.aClass72_3.method3074(arg0);
			this.aClass72_1 = new Class72();
			this.aClass72_1.method3074(arg0);
		}
		local21 = arg0.method1234();
		if (local21 != 0) {
			arg0.anInt1592--;
			this.aClass72_9 = new Class72();
			this.aClass72_9.method3074(arg0);
			this.aClass72_5 = new Class72();
			this.aClass72_5.method3074(arg0);
		}
		local21 = arg0.method1234();
		if (local21 != 0) {
			arg0.anInt1592--;
			this.aClass72_8 = new Class72();
			this.aClass72_8.method3074(arg0);
			this.aClass72_7 = new Class72();
			this.aClass72_7.method3074(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1244();
			if (local114 == 0) {
				break;
			}
			this.anIntArray386[local109] = local114;
			this.anIntArray384[local109] = arg0.method1247();
			this.anIntArray385[local109] = arg0.method1244();
		}
		this.anInt4031 = arg0.method1244();
		this.anInt4032 = arg0.method1244();
		this.anInt4034 = arg0.method1280();
		this.anInt4033 = arg0.method1280();
		this.aClass40_1 = new Class40();
		this.aClass72_2 = new Class72();
		this.aClass40_1.method1920(arg0, this.aClass72_2);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)I")
	private int method3079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray387[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray388[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)[I")
	public int[] method3080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static188.method2303(Static153.anIntArray383, 0, arg0);
		if (arg1 < 10) {
			return Static153.anIntArray383;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass72_4.method3076();
		this.aClass72_6.method3076();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass72_3 != null) {
			this.aClass72_3.method3076();
			this.aClass72_1.method3076();
			local24 = (int) ((double) (this.aClass72_3.anInt4024 - this.aClass72_3.anInt4022) * 32.768D / local16);
			local26 = (int) ((double) this.aClass72_3.anInt4022 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass72_9 != null) {
			this.aClass72_9.method3076();
			this.aClass72_5.method3076();
			local63 = (int) ((double) (this.aClass72_9.anInt4024 - this.aClass72_9.anInt4022) * 32.768D / local16);
			local65 = (int) ((double) this.aClass72_9.anInt4022 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray386[local102] != 0) {
				Static153.anIntArray391[local102] = 0;
				Static153.anIntArray389[local102] = (int) ((double) this.anIntArray385[local102] * local16);
				Static153.anIntArray392[local102] = (this.anIntArray386[local102] << 14) / 100;
				Static153.anIntArray390[local102] = (int) ((double) (this.aClass72_4.anInt4024 - this.aClass72_4.anInt4022) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray384[local102]) / local16);
				Static153.anIntArray393[local102] = (int) ((double) this.aClass72_4.anInt4022 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass72_4.method3073(arg0);
			local187 = this.aClass72_6.method3073(arg0);
			if (this.aClass72_3 != null) {
				local195 = this.aClass72_3.method3073(arg0);
				local200 = this.aClass72_1.method3073(arg0);
				local182 += this.method3079(local28, local200, this.aClass72_3.anInt4023) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass72_9 != null) {
				local195 = this.aClass72_9.method3073(arg0);
				local200 = this.aClass72_5.method3073(arg0);
				local187 = local187 * ((this.method3079(local67, local200, this.aClass72_9.anInt4023) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray386[local195] != 0) {
					local200 = local176 + Static153.anIntArray389[local195];
					if (local200 < arg0) {
						Static153.anIntArray383[local200] += this.method3079(Static153.anIntArray391[local195], local187 * Static153.anIntArray392[local195] >> 15, this.aClass72_4.anInt4023);
						Static153.anIntArray391[local195] += (local182 * Static153.anIntArray390[local195] >> 16) + Static153.anIntArray393[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass72_8 != null) {
			this.aClass72_8.method3076();
			this.aClass72_7.method3076();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass72_8.method3073(arg0);
				local352 = this.aClass72_7.method3073(arg0);
				if (local339) {
					local187 = this.aClass72_8.anInt4022 + ((this.aClass72_8.anInt4024 - this.aClass72_8.anInt4022) * local347 >> 8);
				} else {
					local187 = this.aClass72_8.anInt4022 + ((this.aClass72_8.anInt4024 - this.aClass72_8.anInt4022) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static153.anIntArray383[local200] = 0;
				}
			}
		}
		if (this.anInt4031 > 0 && this.anInt4032 > 0) {
			local182 = (int) ((double) this.anInt4031 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static153.anIntArray383[local187] += Static153.anIntArray383[local187 - local182] * this.anInt4032 / 100;
			}
		}
		if (this.aClass40_1.anIntArray249[0] > 0 || this.aClass40_1.anIntArray249[1] > 0) {
			this.aClass72_2.method3076();
			local182 = this.aClass72_2.method3073(arg0 + 1);
			local187 = this.aClass40_1.method1919(0, (float) local182 / 65536.0F);
			local195 = this.aClass40_1.method1919(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static153.anIntArray383[local200 + local187] * (long) Static87.anInt2590 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static153.anIntArray383[local200 + local187 - local519 - 1] * (long) Static87.anIntArrayArray23[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static153.anIntArray383[local200 - local549 - 1] * (long) Static87.anIntArrayArray23[1][local549] >> 16);
					}
					Static153.anIntArray383[local200] = local352;
					local182 = this.aClass72_2.method3073(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static153.anIntArray383[local200 + local187] * (long) Static87.anInt2590 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static153.anIntArray383[local200 + local187 - local519 - 1] * (long) Static87.anIntArrayArray23[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static153.anIntArray383[local200 - local549 - 1] * (long) Static87.anIntArrayArray23[1][local549] >> 16);
						}
						Static153.anIntArray383[local200] = local352;
						local182 = this.aClass72_2.method3073(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static153.anIntArray383[local200 + local187 - local519 - 1] * (long) Static87.anIntArrayArray23[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static153.anIntArray383[local200 - local549 - 1] * (long) Static87.anIntArrayArray23[1][local549] >> 16);
							}
							Static153.anIntArray383[local200] = local352;
							this.aClass72_2.method3073(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass40_1.method1919(0, (float) local182 / 65536.0F);
					local195 = this.aClass40_1.method1919(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static153.anIntArray383[local182] < -32768) {
				Static153.anIntArray383[local182] = -32768;
			}
			if (Static153.anIntArray383[local182] > 32767) {
				Static153.anIntArray383[local182] = 32767;
			}
		}
		return Static153.anIntArray383;
	}
}
