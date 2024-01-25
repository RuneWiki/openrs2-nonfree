import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sfa")
public final class Class320 {

	@OriginalMember(owner = "client!sfa", name = "g", descriptor = "[I")
	private static final int[] anIntArray589 = new int[32768];

	@OriginalMember(owner = "client!sfa", name = "n", descriptor = "[I")
	private static final int[] anIntArray593;

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "Lclient!mca;")
	private Class219 aClass219_1;

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "Lclient!mca;")
	private Class219 aClass219_2;

	@OriginalMember(owner = "client!sfa", name = "d", descriptor = "Lclient!mca;")
	private Class219 aClass219_3;

	@OriginalMember(owner = "client!sfa", name = "e", descriptor = "Lclient!mca;")
	private Class219 aClass219_4;

	@OriginalMember(owner = "client!sfa", name = "f", descriptor = "Lclient!mca;")
	private Class219 aClass219_5;

	@OriginalMember(owner = "client!sfa", name = "m", descriptor = "Lclient!pc;")
	private Class267 aClass267_1;

	@OriginalMember(owner = "client!sfa", name = "p", descriptor = "Lclient!mca;")
	private Class219 aClass219_6;

	@OriginalMember(owner = "client!sfa", name = "t", descriptor = "Lclient!mca;")
	private Class219 aClass219_7;

	@OriginalMember(owner = "client!sfa", name = "w", descriptor = "Lclient!mca;")
	private Class219 aClass219_8;

	@OriginalMember(owner = "client!sfa", name = "y", descriptor = "Lclient!mca;")
	private Class219 aClass219_9;

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "[I")
	private final int[] anIntArray588 = new int[5];

	@OriginalMember(owner = "client!sfa", name = "h", descriptor = "[I")
	private final int[] anIntArray590 = new int[5];

	@OriginalMember(owner = "client!sfa", name = "k", descriptor = "[I")
	private final int[] anIntArray591 = new int[5];

	@OriginalMember(owner = "client!sfa", name = "j", descriptor = "I")
	public int anInt8756 = 500;

	@OriginalMember(owner = "client!sfa", name = "i", descriptor = "I")
	private int anInt8755 = 100;

	@OriginalMember(owner = "client!sfa", name = "s", descriptor = "I")
	private int anInt8757 = 0;

	@OriginalMember(owner = "client!sfa", name = "u", descriptor = "I")
	public int anInt8758 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray589[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray593 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray593[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(III)I")
	private int method7416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray593[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray589[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lclient!gga;)V")
	public void method7418(@OriginalArg(0) Class6_Sub23 arg0) {
		this.aClass219_9 = new Class219();
		this.aClass219_9.method5206(arg0);
		this.aClass219_8 = new Class219();
		this.aClass219_8.method5206(arg0);
		@Pc(21) int local21 = arg0.method8374();
		if (local21 != 0) {
			arg0.anInt9901--;
			this.aClass219_1 = new Class219();
			this.aClass219_1.method5206(arg0);
			this.aClass219_7 = new Class219();
			this.aClass219_7.method5206(arg0);
		}
		local21 = arg0.method8374();
		if (local21 != 0) {
			arg0.anInt9901--;
			this.aClass219_3 = new Class219();
			this.aClass219_3.method5206(arg0);
			this.aClass219_6 = new Class219();
			this.aClass219_6.method5206(arg0);
		}
		local21 = arg0.method8374();
		if (local21 != 0) {
			arg0.anInt9901--;
			this.aClass219_5 = new Class219();
			this.aClass219_5.method5206(arg0);
			this.aClass219_4 = new Class219();
			this.aClass219_4.method5206(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method8404();
			if (local114 == 0) {
				break;
			}
			this.anIntArray590[local109] = local114;
			this.anIntArray591[local109] = arg0.method8383();
			this.anIntArray588[local109] = arg0.method8404();
		}
		this.anInt8757 = arg0.method8404();
		this.anInt8755 = arg0.method8404();
		this.anInt8756 = arg0.method8363();
		this.anInt8758 = arg0.method8363();
		this.aClass267_1 = new Class267();
		this.aClass219_2 = new Class219();
		this.aClass267_1.method6462(arg0, this.aClass219_2);
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(II)[I")
	public int[] method7419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static679.method1570(Static535.anIntArray592, 0, arg0);
		if (arg1 < 10) {
			return Static535.anIntArray592;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass219_9.method5207();
		this.aClass219_8.method5207();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass219_1 != null) {
			this.aClass219_1.method5207();
			this.aClass219_7.method5207();
			local24 = (int) ((double) (this.aClass219_1.anInt6158 - this.aClass219_1.anInt6159) * 32.768D / local16);
			local26 = (int) ((double) this.aClass219_1.anInt6159 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass219_3 != null) {
			this.aClass219_3.method5207();
			this.aClass219_6.method5207();
			local63 = (int) ((double) (this.aClass219_3.anInt6158 - this.aClass219_3.anInt6159) * 32.768D / local16);
			local65 = (int) ((double) this.aClass219_3.anInt6159 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray590[local102] != 0) {
				Static535.anIntArray596[local102] = 0;
				Static535.anIntArray597[local102] = (int) ((double) this.anIntArray588[local102] * local16);
				Static535.anIntArray595[local102] = (this.anIntArray590[local102] << 14) / 100;
				Static535.anIntArray594[local102] = (int) ((double) (this.aClass219_9.anInt6158 - this.aClass219_9.anInt6159) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray591[local102]) / local16);
				Static535.anIntArray598[local102] = (int) ((double) this.aClass219_9.anInt6159 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass219_9.method5209(arg0);
			local187 = this.aClass219_8.method5209(arg0);
			if (this.aClass219_1 != null) {
				local195 = this.aClass219_1.method5209(arg0);
				local200 = this.aClass219_7.method5209(arg0);
				local182 += this.method7416(local28, local200, this.aClass219_1.anInt6160) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass219_3 != null) {
				local195 = this.aClass219_3.method5209(arg0);
				local200 = this.aClass219_6.method5209(arg0);
				local187 = local187 * ((this.method7416(local67, local200, this.aClass219_3.anInt6160) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray590[local195] != 0) {
					local200 = local176 + Static535.anIntArray597[local195];
					if (local200 < arg0) {
						Static535.anIntArray592[local200] += this.method7416(Static535.anIntArray596[local195], local187 * Static535.anIntArray595[local195] >> 15, this.aClass219_9.anInt6160);
						Static535.anIntArray596[local195] += (local182 * Static535.anIntArray594[local195] >> 16) + Static535.anIntArray598[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass219_5 != null) {
			this.aClass219_5.method5207();
			this.aClass219_4.method5207();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass219_5.method5209(arg0);
				local352 = this.aClass219_4.method5209(arg0);
				if (local339) {
					local187 = this.aClass219_5.anInt6159 + ((this.aClass219_5.anInt6158 - this.aClass219_5.anInt6159) * local347 >> 8);
				} else {
					local187 = this.aClass219_5.anInt6159 + ((this.aClass219_5.anInt6158 - this.aClass219_5.anInt6159) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static535.anIntArray592[local200] = 0;
				}
			}
		}
		if (this.anInt8757 > 0 && this.anInt8755 > 0) {
			local182 = (int) ((double) this.anInt8757 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static535.anIntArray592[local187] += Static535.anIntArray592[local187 - local182] * this.anInt8755 / 100;
			}
		}
		if (this.aClass267_1.anIntArray497[0] > 0 || this.aClass267_1.anIntArray497[1] > 0) {
			this.aClass219_2.method5207();
			local182 = this.aClass219_2.method5209(arg0 + 1);
			local187 = this.aClass267_1.method6459(0, (float) local182 / 65536.0F);
			local195 = this.aClass267_1.method6459(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static535.anIntArray592[local200 + local187] * (long) Static442.anInt7473 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static535.anIntArray592[local200 + local187 - local519 - 1] * (long) Static442.anIntArrayArray42[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static535.anIntArray592[local200 - local549 - 1] * (long) Static442.anIntArrayArray42[1][local549] >> 16);
					}
					Static535.anIntArray592[local200] = local352;
					local182 = this.aClass219_2.method5209(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static535.anIntArray592[local200 + local187] * (long) Static442.anInt7473 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static535.anIntArray592[local200 + local187 - local519 - 1] * (long) Static442.anIntArrayArray42[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static535.anIntArray592[local200 - local549 - 1] * (long) Static442.anIntArrayArray42[1][local549] >> 16);
						}
						Static535.anIntArray592[local200] = local352;
						local182 = this.aClass219_2.method5209(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static535.anIntArray592[local200 + local187 - local519 - 1] * (long) Static442.anIntArrayArray42[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static535.anIntArray592[local200 - local549 - 1] * (long) Static442.anIntArrayArray42[1][local549] >> 16);
							}
							Static535.anIntArray592[local200] = local352;
							this.aClass219_2.method5209(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass267_1.method6459(0, (float) local182 / 65536.0F);
					local195 = this.aClass267_1.method6459(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static535.anIntArray592[local182] < -32768) {
				Static535.anIntArray592[local182] = -32768;
			}
			if (Static535.anIntArray592[local182] > 32767) {
				Static535.anIntArray592[local182] = 32767;
			}
		}
		return Static535.anIntArray592;
	}
}
