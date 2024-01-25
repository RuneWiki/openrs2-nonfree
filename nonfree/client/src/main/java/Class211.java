import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class211 {

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "[I")
	private static final int[] anIntArray408 = new int[32768];

	@OriginalMember(owner = "client!ro", name = "q", descriptor = "[I")
	private static final int[] anIntArray410;

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "Lclient!kv;")
	private Class145 aClass145_1;

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "Lclient!kv;")
	private Class145 aClass145_2;

	@OriginalMember(owner = "client!ro", name = "f", descriptor = "Lclient!kv;")
	private Class145 aClass145_3;

	@OriginalMember(owner = "client!ro", name = "g", descriptor = "Lclient!kv;")
	private Class145 aClass145_4;

	@OriginalMember(owner = "client!ro", name = "j", descriptor = "Lclient!kv;")
	private Class145 aClass145_5;

	@OriginalMember(owner = "client!ro", name = "k", descriptor = "Lclient!kv;")
	private Class145 aClass145_6;

	@OriginalMember(owner = "client!ro", name = "l", descriptor = "Lclient!kv;")
	private Class145 aClass145_7;

	@OriginalMember(owner = "client!ro", name = "o", descriptor = "Lclient!kv;")
	private Class145 aClass145_8;

	@OriginalMember(owner = "client!ro", name = "p", descriptor = "Lclient!fr;")
	private Class83 aClass83_1;

	@OriginalMember(owner = "client!ro", name = "r", descriptor = "Lclient!kv;")
	private Class145 aClass145_9;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "[I")
	private final int[] anIntArray407 = new int[5];

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
	private int anInt5872 = 100;

	@OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
	private int anInt5873 = 0;

	@OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
	public int anInt5875 = 0;

	@OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
	public int anInt5874 = 500;

	@OriginalMember(owner = "client!ro", name = "i", descriptor = "[I")
	private final int[] anIntArray409 = new int[5];

	@OriginalMember(owner = "client!ro", name = "x", descriptor = "[I")
	private final int[] anIntArray416 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray408[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray410 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray410[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!fh;)V")
	public void method4656(@OriginalArg(0) Class5_Sub15 arg0) {
		this.aClass145_2 = new Class145();
		this.aClass145_2.method3003(arg0);
		this.aClass145_4 = new Class145();
		this.aClass145_4.method3003(arg0);
		@Pc(21) int local21 = arg0.method5539();
		if (local21 != 0) {
			arg0.anInt7013--;
			this.aClass145_7 = new Class145();
			this.aClass145_7.method3003(arg0);
			this.aClass145_3 = new Class145();
			this.aClass145_3.method3003(arg0);
		}
		local21 = arg0.method5539();
		if (local21 != 0) {
			arg0.anInt7013--;
			this.aClass145_9 = new Class145();
			this.aClass145_9.method3003(arg0);
			this.aClass145_8 = new Class145();
			this.aClass145_8.method3003(arg0);
		}
		local21 = arg0.method5539();
		if (local21 != 0) {
			arg0.anInt7013--;
			this.aClass145_5 = new Class145();
			this.aClass145_5.method3003(arg0);
			this.aClass145_6 = new Class145();
			this.aClass145_6.method3003(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method5542();
			if (local114 == 0) {
				break;
			}
			this.anIntArray407[local109] = local114;
			this.anIntArray416[local109] = arg0.method5576();
			this.anIntArray409[local109] = arg0.method5542();
		}
		this.anInt5873 = arg0.method5542();
		this.anInt5872 = arg0.method5542();
		this.anInt5874 = arg0.method5598();
		this.anInt5875 = arg0.method5598();
		this.aClass83_1 = new Class83();
		this.aClass145_1 = new Class145();
		this.aClass83_1.method1767(arg0, this.aClass145_1);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)[I")
	public int[] method4658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static468.method3862(Static361.anIntArray411, 0, arg0);
		if (arg1 < 10) {
			return Static361.anIntArray411;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass145_2.method3004();
		this.aClass145_4.method3004();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass145_7 != null) {
			this.aClass145_7.method3004();
			this.aClass145_3.method3004();
			local24 = (int) ((double) (this.aClass145_7.anInt3791 - this.aClass145_7.anInt3792) * 32.768D / local16);
			local26 = (int) ((double) this.aClass145_7.anInt3792 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass145_9 != null) {
			this.aClass145_9.method3004();
			this.aClass145_8.method3004();
			local63 = (int) ((double) (this.aClass145_9.anInt3791 - this.aClass145_9.anInt3792) * 32.768D / local16);
			local65 = (int) ((double) this.aClass145_9.anInt3792 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray407[local102] != 0) {
				Static361.anIntArray415[local102] = 0;
				Static361.anIntArray417[local102] = (int) ((double) this.anIntArray409[local102] * local16);
				Static361.anIntArray414[local102] = (this.anIntArray407[local102] << 14) / 100;
				Static361.anIntArray413[local102] = (int) ((double) (this.aClass145_2.anInt3791 - this.aClass145_2.anInt3792) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray416[local102]) / local16);
				Static361.anIntArray412[local102] = (int) ((double) this.aClass145_2.anInt3792 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass145_2.method3002(arg0);
			local187 = this.aClass145_4.method3002(arg0);
			if (this.aClass145_7 != null) {
				local195 = this.aClass145_7.method3002(arg0);
				local200 = this.aClass145_3.method3002(arg0);
				local182 += this.method4659(local28, local200, this.aClass145_7.anInt3793) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass145_9 != null) {
				local195 = this.aClass145_9.method3002(arg0);
				local200 = this.aClass145_8.method3002(arg0);
				local187 = local187 * ((this.method4659(local67, local200, this.aClass145_9.anInt3793) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray407[local195] != 0) {
					local200 = local176 + Static361.anIntArray417[local195];
					if (local200 < arg0) {
						Static361.anIntArray411[local200] += this.method4659(Static361.anIntArray415[local195], local187 * Static361.anIntArray414[local195] >> 15, this.aClass145_2.anInt3793);
						Static361.anIntArray415[local195] += (local182 * Static361.anIntArray413[local195] >> 16) + Static361.anIntArray412[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass145_5 != null) {
			this.aClass145_5.method3004();
			this.aClass145_6.method3004();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass145_5.method3002(arg0);
				local352 = this.aClass145_6.method3002(arg0);
				if (local339) {
					local187 = this.aClass145_5.anInt3792 + ((this.aClass145_5.anInt3791 - this.aClass145_5.anInt3792) * local347 >> 8);
				} else {
					local187 = this.aClass145_5.anInt3792 + ((this.aClass145_5.anInt3791 - this.aClass145_5.anInt3792) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static361.anIntArray411[local200] = 0;
				}
			}
		}
		if (this.anInt5873 > 0 && this.anInt5872 > 0) {
			local182 = (int) ((double) this.anInt5873 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static361.anIntArray411[local187] += Static361.anIntArray411[local187 - local182] * this.anInt5872 / 100;
			}
		}
		if (this.aClass83_1.anIntArray123[0] > 0 || this.aClass83_1.anIntArray123[1] > 0) {
			this.aClass145_1.method3004();
			local182 = this.aClass145_1.method3002(arg0 + 1);
			local187 = this.aClass83_1.method1762(0, (float) local182 / 65536.0F);
			local195 = this.aClass83_1.method1762(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static361.anIntArray411[local200 + local187] * (long) Static126.anInt2204 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static361.anIntArray411[local200 + local187 - local519 - 1] * (long) Static126.anIntArrayArray13[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static361.anIntArray411[local200 - local549 - 1] * (long) Static126.anIntArrayArray13[1][local549] >> 16);
					}
					Static361.anIntArray411[local200] = local352;
					local182 = this.aClass145_1.method3002(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static361.anIntArray411[local200 + local187] * (long) Static126.anInt2204 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static361.anIntArray411[local200 + local187 - local519 - 1] * (long) Static126.anIntArrayArray13[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static361.anIntArray411[local200 - local549 - 1] * (long) Static126.anIntArrayArray13[1][local549] >> 16);
						}
						Static361.anIntArray411[local200] = local352;
						local182 = this.aClass145_1.method3002(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static361.anIntArray411[local200 + local187 - local519 - 1] * (long) Static126.anIntArrayArray13[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static361.anIntArray411[local200 - local549 - 1] * (long) Static126.anIntArrayArray13[1][local549] >> 16);
							}
							Static361.anIntArray411[local200] = local352;
							this.aClass145_1.method3002(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass83_1.method1762(0, (float) local182 / 65536.0F);
					local195 = this.aClass83_1.method1762(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static361.anIntArray411[local182] < -32768) {
				Static361.anIntArray411[local182] = -32768;
			}
			if (Static361.anIntArray411[local182] > 32767) {
				Static361.anIntArray411[local182] = 32767;
			}
		}
		return Static361.anIntArray411;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(III)I")
	private int method4659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray410[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray408[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
