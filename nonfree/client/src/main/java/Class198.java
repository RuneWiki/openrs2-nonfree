import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class198 {

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "[I")
	private static final int[] anIntArray295 = new int[32768];

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "[I")
	private static final int[] anIntArray296;

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "Lclient!vk;")
	private Class372 aClass372_1;

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "Lclient!vk;")
	private Class372 aClass372_2;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "Lclient!vk;")
	private Class372 aClass372_3;

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "Lclient!vk;")
	private Class372 aClass372_4;

	@OriginalMember(owner = "client!kf", name = "q", descriptor = "Lclient!vk;")
	private Class372 aClass372_5;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "Lclient!vk;")
	private Class372 aClass372_6;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "Lclient!vk;")
	private Class372 aClass372_7;

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "Lclient!ur;")
	private Class358 aClass358_1;

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "Lclient!vk;")
	private Class372 aClass372_8;

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "Lclient!vk;")
	private Class372 aClass372_9;

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "[I")
	private final int[] anIntArray294 = new int[5];

	@OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
	public int anInt5436 = 0;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
	private int anInt5438 = 0;

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
	public int anInt5435 = 500;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "[I")
	private final int[] anIntArray298 = new int[5];

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
	private int anInt5437 = 100;

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "[I")
	private final int[] anIntArray299 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray295[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray296 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray296[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!ib;)V")
	public void method4660(@OriginalArg(0) Class5_Sub23 arg0) {
		this.aClass372_7 = new Class372();
		this.aClass372_7.method8920(arg0);
		this.aClass372_8 = new Class372();
		this.aClass372_8.method8920(arg0);
		@Pc(21) int local21 = arg0.method8529();
		if (local21 != 0) {
			arg0.anInt9869--;
			this.aClass372_4 = new Class372();
			this.aClass372_4.method8920(arg0);
			this.aClass372_2 = new Class372();
			this.aClass372_2.method8920(arg0);
		}
		local21 = arg0.method8529();
		if (local21 != 0) {
			arg0.anInt9869--;
			this.aClass372_1 = new Class372();
			this.aClass372_1.method8920(arg0);
			this.aClass372_6 = new Class372();
			this.aClass372_6.method8920(arg0);
		}
		local21 = arg0.method8529();
		if (local21 != 0) {
			arg0.anInt9869--;
			this.aClass372_3 = new Class372();
			this.aClass372_3.method8920(arg0);
			this.aClass372_9 = new Class372();
			this.aClass372_9.method8920(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method8499();
			if (local114 == 0) {
				break;
			}
			this.anIntArray294[local109] = local114;
			this.anIntArray298[local109] = arg0.method8481();
			this.anIntArray299[local109] = arg0.method8499();
		}
		this.anInt5438 = arg0.method8499();
		this.anInt5437 = arg0.method8499();
		this.anInt5435 = arg0.method8519();
		this.anInt5436 = arg0.method8519();
		this.aClass358_1 = new Class358();
		this.aClass372_5 = new Class372();
		this.aClass358_1.method8715(arg0, this.aClass372_5);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)[I")
	public int[] method4662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static682.method800(Static304.anIntArray297, 0, arg0);
		if (arg1 < 10) {
			return Static304.anIntArray297;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass372_7.method8923();
		this.aClass372_8.method8923();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass372_4 != null) {
			this.aClass372_4.method8923();
			this.aClass372_2.method8923();
			local24 = (int) ((double) (this.aClass372_4.anInt10396 - this.aClass372_4.anInt10394) * 32.768D / local16);
			local26 = (int) ((double) this.aClass372_4.anInt10394 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass372_1 != null) {
			this.aClass372_1.method8923();
			this.aClass372_6.method8923();
			local63 = (int) ((double) (this.aClass372_1.anInt10396 - this.aClass372_1.anInt10394) * 32.768D / local16);
			local65 = (int) ((double) this.aClass372_1.anInt10394 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray294[local102] != 0) {
				Static304.anIntArray303[local102] = 0;
				Static304.anIntArray300[local102] = (int) ((double) this.anIntArray299[local102] * local16);
				Static304.anIntArray301[local102] = (this.anIntArray294[local102] << 14) / 100;
				Static304.anIntArray302[local102] = (int) ((double) (this.aClass372_7.anInt10396 - this.aClass372_7.anInt10394) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray298[local102]) / local16);
				Static304.anIntArray304[local102] = (int) ((double) this.aClass372_7.anInt10394 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass372_7.method8921(arg0);
			local187 = this.aClass372_8.method8921(arg0);
			if (this.aClass372_4 != null) {
				local195 = this.aClass372_4.method8921(arg0);
				local200 = this.aClass372_2.method8921(arg0);
				local182 += this.method4663(local28, local200, this.aClass372_4.anInt10395) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass372_1 != null) {
				local195 = this.aClass372_1.method8921(arg0);
				local200 = this.aClass372_6.method8921(arg0);
				local187 = local187 * ((this.method4663(local67, local200, this.aClass372_1.anInt10395) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray294[local195] != 0) {
					local200 = local176 + Static304.anIntArray300[local195];
					if (local200 < arg0) {
						Static304.anIntArray297[local200] += this.method4663(Static304.anIntArray303[local195], local187 * Static304.anIntArray301[local195] >> 15, this.aClass372_7.anInt10395);
						Static304.anIntArray303[local195] += (local182 * Static304.anIntArray302[local195] >> 16) + Static304.anIntArray304[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass372_3 != null) {
			this.aClass372_3.method8923();
			this.aClass372_9.method8923();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass372_3.method8921(arg0);
				local352 = this.aClass372_9.method8921(arg0);
				if (local339) {
					local187 = this.aClass372_3.anInt10394 + ((this.aClass372_3.anInt10396 - this.aClass372_3.anInt10394) * local347 >> 8);
				} else {
					local187 = this.aClass372_3.anInt10394 + ((this.aClass372_3.anInt10396 - this.aClass372_3.anInt10394) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static304.anIntArray297[local200] = 0;
				}
			}
		}
		if (this.anInt5438 > 0 && this.anInt5437 > 0) {
			local182 = (int) ((double) this.anInt5438 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static304.anIntArray297[local187] += Static304.anIntArray297[local187 - local182] * this.anInt5437 / 100;
			}
		}
		if (this.aClass358_1.anIntArray560[0] > 0 || this.aClass358_1.anIntArray560[1] > 0) {
			this.aClass372_5.method8923();
			local182 = this.aClass372_5.method8921(arg0 + 1);
			local187 = this.aClass358_1.method8713(0, (float) local182 / 65536.0F);
			local195 = this.aClass358_1.method8713(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static304.anIntArray297[local200 + local187] * (long) Static614.anInt10138 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static304.anIntArray297[local200 + local187 - local519 - 1] * (long) Static614.anIntArrayArray55[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static304.anIntArray297[local200 - local549 - 1] * (long) Static614.anIntArrayArray55[1][local549] >> 16);
					}
					Static304.anIntArray297[local200] = local352;
					local182 = this.aClass372_5.method8921(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static304.anIntArray297[local200 + local187] * (long) Static614.anInt10138 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static304.anIntArray297[local200 + local187 - local519 - 1] * (long) Static614.anIntArrayArray55[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static304.anIntArray297[local200 - local549 - 1] * (long) Static614.anIntArrayArray55[1][local549] >> 16);
						}
						Static304.anIntArray297[local200] = local352;
						local182 = this.aClass372_5.method8921(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static304.anIntArray297[local200 + local187 - local519 - 1] * (long) Static614.anIntArrayArray55[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static304.anIntArray297[local200 - local549 - 1] * (long) Static614.anIntArrayArray55[1][local549] >> 16);
							}
							Static304.anIntArray297[local200] = local352;
							this.aClass372_5.method8921(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass358_1.method8713(0, (float) local182 / 65536.0F);
					local195 = this.aClass358_1.method8713(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static304.anIntArray297[local182] < -32768) {
				Static304.anIntArray297[local182] = -32768;
			}
			if (Static304.anIntArray297[local182] > 32767) {
				Static304.anIntArray297[local182] = 32767;
			}
		}
		return Static304.anIntArray297;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)I")
	private int method4663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray296[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray295[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
