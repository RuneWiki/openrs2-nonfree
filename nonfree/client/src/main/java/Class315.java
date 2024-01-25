import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class315 {

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "[I")
	private static final int[] anIntArray446 = new int[32768];

	@OriginalMember(owner = "client!rw", name = "r", descriptor = "[I")
	private static final int[] anIntArray450;

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "Lclient!go;")
	private Class136 aClass136_1;

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "Lclient!go;")
	private Class136 aClass136_2;

	@OriginalMember(owner = "client!rw", name = "e", descriptor = "Lclient!go;")
	private Class136 aClass136_3;

	@OriginalMember(owner = "client!rw", name = "i", descriptor = "Lclient!go;")
	private Class136 aClass136_4;

	@OriginalMember(owner = "client!rw", name = "k", descriptor = "Lclient!go;")
	private Class136 aClass136_5;

	@OriginalMember(owner = "client!rw", name = "l", descriptor = "Lclient!go;")
	private Class136 aClass136_6;

	@OriginalMember(owner = "client!rw", name = "m", descriptor = "Lclient!go;")
	private Class136 aClass136_7;

	@OriginalMember(owner = "client!rw", name = "n", descriptor = "Lclient!vr;")
	private Class377 aClass377_1;

	@OriginalMember(owner = "client!rw", name = "q", descriptor = "Lclient!go;")
	private Class136 aClass136_8;

	@OriginalMember(owner = "client!rw", name = "v", descriptor = "Lclient!go;")
	private Class136 aClass136_9;

	@OriginalMember(owner = "client!rw", name = "h", descriptor = "I")
	private int anInt8361 = 0;

	@OriginalMember(owner = "client!rw", name = "g", descriptor = "[I")
	private final int[] anIntArray447 = new int[5];

	@OriginalMember(owner = "client!rw", name = "p", descriptor = "I")
	public int anInt8362 = 500;

	@OriginalMember(owner = "client!rw", name = "o", descriptor = "[I")
	private final int[] anIntArray449 = new int[5];

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "I")
	public int anInt8360 = 0;

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "I")
	private int anInt8359 = 100;

	@OriginalMember(owner = "client!rw", name = "w", descriptor = "[I")
	private final int[] anIntArray454 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray446[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray450 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray450[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lclient!dt;)V")
	public void method6880(@OriginalArg(0) Class3_Sub4 arg0) {
		this.aClass136_1 = new Class136();
		this.aClass136_1.method3087(arg0);
		this.aClass136_4 = new Class136();
		this.aClass136_4.method3087(arg0);
		@Pc(21) int local21 = arg0.method7954();
		if (local21 != 0) {
			arg0.anInt9739--;
			this.aClass136_7 = new Class136();
			this.aClass136_7.method3087(arg0);
			this.aClass136_5 = new Class136();
			this.aClass136_5.method3087(arg0);
		}
		local21 = arg0.method7954();
		if (local21 != 0) {
			arg0.anInt9739--;
			this.aClass136_6 = new Class136();
			this.aClass136_6.method3087(arg0);
			this.aClass136_9 = new Class136();
			this.aClass136_9.method3087(arg0);
		}
		local21 = arg0.method7954();
		if (local21 != 0) {
			arg0.anInt9739--;
			this.aClass136_2 = new Class136();
			this.aClass136_2.method3087(arg0);
			this.aClass136_3 = new Class136();
			this.aClass136_3.method3087(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method7896();
			if (local114 == 0) {
				break;
			}
			this.anIntArray449[local109] = local114;
			this.anIntArray447[local109] = arg0.method7892();
			this.anIntArray454[local109] = arg0.method7896();
		}
		this.anInt8361 = arg0.method7896();
		this.anInt8359 = arg0.method7896();
		this.anInt8362 = arg0.method7951();
		this.anInt8360 = arg0.method7951();
		this.aClass377_1 = new Class377();
		this.aClass136_8 = new Class136();
		this.aClass377_1.method8686(arg0, this.aClass136_8);
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)[I")
	public int[] method6881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static681.method4030(Static535.anIntArray448, 0, arg0);
		if (arg1 < 10) {
			return Static535.anIntArray448;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass136_1.method3088();
		this.aClass136_4.method3088();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass136_7 != null) {
			this.aClass136_7.method3088();
			this.aClass136_5.method3088();
			local24 = (int) ((double) (this.aClass136_7.anInt3616 - this.aClass136_7.anInt3617) * 32.768D / local16);
			local26 = (int) ((double) this.aClass136_7.anInt3617 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass136_6 != null) {
			this.aClass136_6.method3088();
			this.aClass136_9.method3088();
			local63 = (int) ((double) (this.aClass136_6.anInt3616 - this.aClass136_6.anInt3617) * 32.768D / local16);
			local65 = (int) ((double) this.aClass136_6.anInt3617 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray449[local102] != 0) {
				Static535.anIntArray452[local102] = 0;
				Static535.anIntArray451[local102] = (int) ((double) this.anIntArray454[local102] * local16);
				Static535.anIntArray453[local102] = (this.anIntArray449[local102] << 14) / 100;
				Static535.anIntArray455[local102] = (int) ((double) (this.aClass136_1.anInt3616 - this.aClass136_1.anInt3617) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray447[local102]) / local16);
				Static535.anIntArray456[local102] = (int) ((double) this.aClass136_1.anInt3617 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass136_1.method3089(arg0);
			local187 = this.aClass136_4.method3089(arg0);
			if (this.aClass136_7 != null) {
				local195 = this.aClass136_7.method3089(arg0);
				local200 = this.aClass136_5.method3089(arg0);
				local182 += this.method6883(local28, local200, this.aClass136_7.anInt3615) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass136_6 != null) {
				local195 = this.aClass136_6.method3089(arg0);
				local200 = this.aClass136_9.method3089(arg0);
				local187 = local187 * ((this.method6883(local67, local200, this.aClass136_6.anInt3615) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray449[local195] != 0) {
					local200 = local176 + Static535.anIntArray451[local195];
					if (local200 < arg0) {
						Static535.anIntArray448[local200] += this.method6883(Static535.anIntArray452[local195], local187 * Static535.anIntArray453[local195] >> 15, this.aClass136_1.anInt3615);
						Static535.anIntArray452[local195] += (local182 * Static535.anIntArray455[local195] >> 16) + Static535.anIntArray456[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass136_2 != null) {
			this.aClass136_2.method3088();
			this.aClass136_3.method3088();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass136_2.method3089(arg0);
				local352 = this.aClass136_3.method3089(arg0);
				if (local339) {
					local187 = this.aClass136_2.anInt3617 + ((this.aClass136_2.anInt3616 - this.aClass136_2.anInt3617) * local347 >> 8);
				} else {
					local187 = this.aClass136_2.anInt3617 + ((this.aClass136_2.anInt3616 - this.aClass136_2.anInt3617) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static535.anIntArray448[local200] = 0;
				}
			}
		}
		if (this.anInt8361 > 0 && this.anInt8359 > 0) {
			local182 = (int) ((double) this.anInt8361 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static535.anIntArray448[local187] += Static535.anIntArray448[local187 - local182] * this.anInt8359 / 100;
			}
		}
		if (this.aClass377_1.anIntArray574[0] > 0 || this.aClass377_1.anIntArray574[1] > 0) {
			this.aClass136_8.method3088();
			local182 = this.aClass136_8.method3089(arg0 + 1);
			local187 = this.aClass377_1.method8687(0, (float) local182 / 65536.0F);
			local195 = this.aClass377_1.method8687(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static535.anIntArray448[local200 + local187] * (long) Static646.anInt10602 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static535.anIntArray448[local200 + local187 - local519 - 1] * (long) Static646.anIntArrayArray61[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static535.anIntArray448[local200 - local549 - 1] * (long) Static646.anIntArrayArray61[1][local549] >> 16);
					}
					Static535.anIntArray448[local200] = local352;
					local182 = this.aClass136_8.method3089(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static535.anIntArray448[local200 + local187] * (long) Static646.anInt10602 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static535.anIntArray448[local200 + local187 - local519 - 1] * (long) Static646.anIntArrayArray61[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static535.anIntArray448[local200 - local549 - 1] * (long) Static646.anIntArrayArray61[1][local549] >> 16);
						}
						Static535.anIntArray448[local200] = local352;
						local182 = this.aClass136_8.method3089(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static535.anIntArray448[local200 + local187 - local519 - 1] * (long) Static646.anIntArrayArray61[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static535.anIntArray448[local200 - local549 - 1] * (long) Static646.anIntArrayArray61[1][local549] >> 16);
							}
							Static535.anIntArray448[local200] = local352;
							this.aClass136_8.method3089(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass377_1.method8687(0, (float) local182 / 65536.0F);
					local195 = this.aClass377_1.method8687(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static535.anIntArray448[local182] < -32768) {
				Static535.anIntArray448[local182] = -32768;
			}
			if (Static535.anIntArray448[local182] > 32767) {
				Static535.anIntArray448[local182] = 32767;
			}
		}
		return Static535.anIntArray448;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(III)I")
	private int method6883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray450[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray446[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
