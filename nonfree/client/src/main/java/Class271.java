import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class271 {

	@OriginalMember(owner = "client!pv", name = "e", descriptor = "[I")
	private static final int[] anIntArray548 = new int[32768];

	@OriginalMember(owner = "client!pv", name = "g", descriptor = "[I")
	private static final int[] anIntArray549;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "Lclient!baa;")
	private Class24 aClass24_1;

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "Lclient!baa;")
	private Class24 aClass24_2;

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "Lclient!baa;")
	private Class24 aClass24_3;

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "Lclient!baa;")
	private Class24 aClass24_4;

	@OriginalMember(owner = "client!pv", name = "f", descriptor = "Lclient!mj;")
	private Class226 aClass226_1;

	@OriginalMember(owner = "client!pv", name = "h", descriptor = "Lclient!baa;")
	private Class24 aClass24_5;

	@OriginalMember(owner = "client!pv", name = "n", descriptor = "Lclient!baa;")
	private Class24 aClass24_6;

	@OriginalMember(owner = "client!pv", name = "p", descriptor = "Lclient!baa;")
	private Class24 aClass24_7;

	@OriginalMember(owner = "client!pv", name = "q", descriptor = "Lclient!baa;")
	private Class24 aClass24_8;

	@OriginalMember(owner = "client!pv", name = "r", descriptor = "Lclient!baa;")
	private Class24 aClass24_9;

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "[I")
	private final int[] anIntArray550 = new int[5];

	@OriginalMember(owner = "client!pv", name = "l", descriptor = "I")
	private int anInt7177 = 0;

	@OriginalMember(owner = "client!pv", name = "i", descriptor = "I")
	public int anInt7175 = 0;

	@OriginalMember(owner = "client!pv", name = "m", descriptor = "[I")
	private final int[] anIntArray551 = new int[5];

	@OriginalMember(owner = "client!pv", name = "k", descriptor = "I")
	public int anInt7176 = 500;

	@OriginalMember(owner = "client!pv", name = "s", descriptor = "[I")
	private final int[] anIntArray553 = new int[5];

	@OriginalMember(owner = "client!pv", name = "x", descriptor = "I")
	private int anInt7178 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray548[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray549 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray549[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(II)[I")
	public int[] method5707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static598.method1170(Static415.anIntArray552, 0, arg0);
		if (arg1 < 10) {
			return Static415.anIntArray552;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass24_8.method323();
		this.aClass24_3.method323();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass24_1 != null) {
			this.aClass24_1.method323();
			this.aClass24_6.method323();
			local24 = (int) ((double) (this.aClass24_1.anInt390 - this.aClass24_1.anInt391) * 32.768D / local16);
			local26 = (int) ((double) this.aClass24_1.anInt391 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass24_7 != null) {
			this.aClass24_7.method323();
			this.aClass24_2.method323();
			local63 = (int) ((double) (this.aClass24_7.anInt390 - this.aClass24_7.anInt391) * 32.768D / local16);
			local65 = (int) ((double) this.aClass24_7.anInt391 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray550[local102] != 0) {
				Static415.anIntArray557[local102] = 0;
				Static415.anIntArray556[local102] = (int) ((double) this.anIntArray551[local102] * local16);
				Static415.anIntArray554[local102] = (this.anIntArray550[local102] << 14) / 100;
				Static415.anIntArray555[local102] = (int) ((double) (this.aClass24_8.anInt390 - this.aClass24_8.anInt391) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray553[local102]) / local16);
				Static415.anIntArray558[local102] = (int) ((double) this.aClass24_8.anInt391 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass24_8.method325(arg0);
			local187 = this.aClass24_3.method325(arg0);
			if (this.aClass24_1 != null) {
				local195 = this.aClass24_1.method325(arg0);
				local200 = this.aClass24_6.method325(arg0);
				local182 += this.method5708(local28, local200, this.aClass24_1.anInt392) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass24_7 != null) {
				local195 = this.aClass24_7.method325(arg0);
				local200 = this.aClass24_2.method325(arg0);
				local187 = local187 * ((this.method5708(local67, local200, this.aClass24_7.anInt392) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray550[local195] != 0) {
					local200 = local176 + Static415.anIntArray556[local195];
					if (local200 < arg0) {
						Static415.anIntArray552[local200] += this.method5708(Static415.anIntArray557[local195], local187 * Static415.anIntArray554[local195] >> 15, this.aClass24_8.anInt392);
						Static415.anIntArray557[local195] += (local182 * Static415.anIntArray555[local195] >> 16) + Static415.anIntArray558[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass24_9 != null) {
			this.aClass24_9.method323();
			this.aClass24_4.method323();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass24_9.method325(arg0);
				local352 = this.aClass24_4.method325(arg0);
				if (local339) {
					local187 = this.aClass24_9.anInt391 + ((this.aClass24_9.anInt390 - this.aClass24_9.anInt391) * local347 >> 8);
				} else {
					local187 = this.aClass24_9.anInt391 + ((this.aClass24_9.anInt390 - this.aClass24_9.anInt391) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static415.anIntArray552[local200] = 0;
				}
			}
		}
		if (this.anInt7177 > 0 && this.anInt7178 > 0) {
			local182 = (int) ((double) this.anInt7177 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static415.anIntArray552[local187] += Static415.anIntArray552[local187 - local182] * this.anInt7178 / 100;
			}
		}
		if (this.aClass226_1.anIntArray440[0] > 0 || this.aClass226_1.anIntArray440[1] > 0) {
			this.aClass24_5.method323();
			local182 = this.aClass24_5.method325(arg0 + 1);
			local187 = this.aClass226_1.method4490(0, (float) local182 / 65536.0F);
			local195 = this.aClass226_1.method4490(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static415.anIntArray552[local200 + local187] * (long) Static328.anInt5502 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static415.anIntArray552[local200 + local187 - local519 - 1] * (long) Static328.anIntArrayArray123[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static415.anIntArray552[local200 - local549 - 1] * (long) Static328.anIntArrayArray123[1][local549] >> 16);
					}
					Static415.anIntArray552[local200] = local352;
					local182 = this.aClass24_5.method325(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static415.anIntArray552[local200 + local187] * (long) Static328.anInt5502 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static415.anIntArray552[local200 + local187 - local519 - 1] * (long) Static328.anIntArrayArray123[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static415.anIntArray552[local200 - local549 - 1] * (long) Static328.anIntArrayArray123[1][local549] >> 16);
						}
						Static415.anIntArray552[local200] = local352;
						local182 = this.aClass24_5.method325(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static415.anIntArray552[local200 + local187 - local519 - 1] * (long) Static328.anIntArrayArray123[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static415.anIntArray552[local200 - local549 - 1] * (long) Static328.anIntArrayArray123[1][local549] >> 16);
							}
							Static415.anIntArray552[local200] = local352;
							this.aClass24_5.method325(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass226_1.method4490(0, (float) local182 / 65536.0F);
					local195 = this.aClass226_1.method4490(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static415.anIntArray552[local182] < -32768) {
				Static415.anIntArray552[local182] = -32768;
			}
			if (Static415.anIntArray552[local182] > 32767) {
				Static415.anIntArray552[local182] = 32767;
			}
		}
		return Static415.anIntArray552;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)I")
	private int method5708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray549[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray548[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!mo;)V")
	public void method5710(@OriginalArg(0) Class1_Sub35 arg0) {
		this.aClass24_8 = new Class24();
		this.aClass24_8.method326(arg0);
		this.aClass24_3 = new Class24();
		this.aClass24_3.method326(arg0);
		@Pc(21) int local21 = arg0.method5750();
		if (local21 != 0) {
			arg0.anInt7214--;
			this.aClass24_1 = new Class24();
			this.aClass24_1.method326(arg0);
			this.aClass24_6 = new Class24();
			this.aClass24_6.method326(arg0);
		}
		local21 = arg0.method5750();
		if (local21 != 0) {
			arg0.anInt7214--;
			this.aClass24_7 = new Class24();
			this.aClass24_7.method326(arg0);
			this.aClass24_2 = new Class24();
			this.aClass24_2.method326(arg0);
		}
		local21 = arg0.method5750();
		if (local21 != 0) {
			arg0.anInt7214--;
			this.aClass24_9 = new Class24();
			this.aClass24_9.method326(arg0);
			this.aClass24_4 = new Class24();
			this.aClass24_4.method326(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method5739();
			if (local114 == 0) {
				break;
			}
			this.anIntArray550[local109] = local114;
			this.anIntArray553[local109] = arg0.method5752();
			this.anIntArray551[local109] = arg0.method5739();
		}
		this.anInt7177 = arg0.method5739();
		this.anInt7178 = arg0.method5739();
		this.anInt7176 = arg0.method5771();
		this.anInt7175 = arg0.method5771();
		this.aClass226_1 = new Class226();
		this.aClass24_5 = new Class24();
		this.aClass226_1.method4491(arg0, this.aClass24_5);
	}
}
