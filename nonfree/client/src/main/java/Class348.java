import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class348 {

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "[I")
	private static final int[] anIntArray526 = new int[32768];

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "[I")
	private static final int[] anIntArray527;

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "Lclient!nj;")
	private Class225 aClass225_1;

	@OriginalMember(owner = "client!ut", name = "f", descriptor = "Lclient!nj;")
	private Class225 aClass225_2;

	@OriginalMember(owner = "client!ut", name = "h", descriptor = "Lclient!md;")
	private Class197 aClass197_1;

	@OriginalMember(owner = "client!ut", name = "i", descriptor = "Lclient!nj;")
	private Class225 aClass225_3;

	@OriginalMember(owner = "client!ut", name = "k", descriptor = "Lclient!nj;")
	private Class225 aClass225_4;

	@OriginalMember(owner = "client!ut", name = "m", descriptor = "Lclient!nj;")
	private Class225 aClass225_5;

	@OriginalMember(owner = "client!ut", name = "n", descriptor = "Lclient!nj;")
	private Class225 aClass225_6;

	@OriginalMember(owner = "client!ut", name = "o", descriptor = "Lclient!nj;")
	private Class225 aClass225_7;

	@OriginalMember(owner = "client!ut", name = "q", descriptor = "Lclient!nj;")
	private Class225 aClass225_8;

	@OriginalMember(owner = "client!ut", name = "t", descriptor = "Lclient!nj;")
	private Class225 aClass225_9;

	@OriginalMember(owner = "client!ut", name = "e", descriptor = "I")
	private int anInt9901 = 100;

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "I")
	public int anInt9900 = 0;

	@OriginalMember(owner = "client!ut", name = "j", descriptor = "[I")
	private final int[] anIntArray528 = new int[5];

	@OriginalMember(owner = "client!ut", name = "l", descriptor = "[I")
	private final int[] anIntArray529 = new int[5];

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "I")
	public int anInt9902 = 500;

	@OriginalMember(owner = "client!ut", name = "r", descriptor = "[I")
	private final int[] anIntArray531 = new int[5];

	@OriginalMember(owner = "client!ut", name = "s", descriptor = "I")
	private int anInt9903 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray526[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray527 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray527[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!ji;)V")
	public void method8077(@OriginalArg(0) Class6_Sub8 arg0) {
		this.aClass225_8 = new Class225();
		this.aClass225_8.method5980(arg0);
		this.aClass225_9 = new Class225();
		this.aClass225_9.method5980(arg0);
		@Pc(21) int local21 = arg0.method8246();
		if (local21 != 0) {
			arg0.anInt10061--;
			this.aClass225_4 = new Class225();
			this.aClass225_4.method5980(arg0);
			this.aClass225_2 = new Class225();
			this.aClass225_2.method5980(arg0);
		}
		local21 = arg0.method8246();
		if (local21 != 0) {
			arg0.anInt10061--;
			this.aClass225_5 = new Class225();
			this.aClass225_5.method5980(arg0);
			this.aClass225_7 = new Class225();
			this.aClass225_7.method5980(arg0);
		}
		local21 = arg0.method8246();
		if (local21 != 0) {
			arg0.anInt10061--;
			this.aClass225_3 = new Class225();
			this.aClass225_3.method5980(arg0);
			this.aClass225_6 = new Class225();
			this.aClass225_6.method5980(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method8214();
			if (local114 == 0) {
				break;
			}
			this.anIntArray531[local109] = local114;
			this.anIntArray529[local109] = arg0.method8256();
			this.anIntArray528[local109] = arg0.method8214();
		}
		this.anInt9903 = arg0.method8214();
		this.anInt9901 = arg0.method8214();
		this.anInt9902 = arg0.method8220();
		this.anInt9900 = arg0.method8220();
		this.aClass197_1 = new Class197();
		this.aClass225_1 = new Class225();
		this.aClass197_1.method5688(arg0, this.aClass225_1);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(III)I")
	private int method8078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray527[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray526[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)[I")
	public int[] method8079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static653.method6536(Static584.anIntArray530, 0, arg0);
		if (arg1 < 10) {
			return Static584.anIntArray530;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass225_8.method5978();
		this.aClass225_9.method5978();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass225_4 != null) {
			this.aClass225_4.method5978();
			this.aClass225_2.method5978();
			local24 = (int) ((double) (this.aClass225_4.anInt7142 - this.aClass225_4.anInt7144) * 32.768D / local16);
			local26 = (int) ((double) this.aClass225_4.anInt7144 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass225_5 != null) {
			this.aClass225_5.method5978();
			this.aClass225_7.method5978();
			local63 = (int) ((double) (this.aClass225_5.anInt7142 - this.aClass225_5.anInt7144) * 32.768D / local16);
			local65 = (int) ((double) this.aClass225_5.anInt7144 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray531[local102] != 0) {
				Static584.anIntArray535[local102] = 0;
				Static584.anIntArray532[local102] = (int) ((double) this.anIntArray528[local102] * local16);
				Static584.anIntArray536[local102] = (this.anIntArray531[local102] << 14) / 100;
				Static584.anIntArray533[local102] = (int) ((double) (this.aClass225_8.anInt7142 - this.aClass225_8.anInt7144) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray529[local102]) / local16);
				Static584.anIntArray534[local102] = (int) ((double) this.aClass225_8.anInt7144 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass225_8.method5979(arg0);
			local187 = this.aClass225_9.method5979(arg0);
			if (this.aClass225_4 != null) {
				local195 = this.aClass225_4.method5979(arg0);
				local200 = this.aClass225_2.method5979(arg0);
				local182 += this.method8078(local28, local200, this.aClass225_4.anInt7143) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass225_5 != null) {
				local195 = this.aClass225_5.method5979(arg0);
				local200 = this.aClass225_7.method5979(arg0);
				local187 = local187 * ((this.method8078(local67, local200, this.aClass225_5.anInt7143) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray531[local195] != 0) {
					local200 = local176 + Static584.anIntArray532[local195];
					if (local200 < arg0) {
						Static584.anIntArray530[local200] += this.method8078(Static584.anIntArray535[local195], local187 * Static584.anIntArray536[local195] >> 15, this.aClass225_8.anInt7143);
						Static584.anIntArray535[local195] += (local182 * Static584.anIntArray533[local195] >> 16) + Static584.anIntArray534[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass225_3 != null) {
			this.aClass225_3.method5978();
			this.aClass225_6.method5978();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass225_3.method5979(arg0);
				local352 = this.aClass225_6.method5979(arg0);
				if (local339) {
					local187 = this.aClass225_3.anInt7144 + ((this.aClass225_3.anInt7142 - this.aClass225_3.anInt7144) * local347 >> 8);
				} else {
					local187 = this.aClass225_3.anInt7144 + ((this.aClass225_3.anInt7142 - this.aClass225_3.anInt7144) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static584.anIntArray530[local200] = 0;
				}
			}
		}
		if (this.anInt9903 > 0 && this.anInt9901 > 0) {
			local182 = (int) ((double) this.anInt9903 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static584.anIntArray530[local187] += Static584.anIntArray530[local187 - local182] * this.anInt9901 / 100;
			}
		}
		if (this.aClass197_1.anIntArray320[0] > 0 || this.aClass197_1.anIntArray320[1] > 0) {
			this.aClass225_1.method5978();
			local182 = this.aClass225_1.method5979(arg0 + 1);
			local187 = this.aClass197_1.method5689(0, (float) local182 / 65536.0F);
			local195 = this.aClass197_1.method5689(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static584.anIntArray530[local200 + local187] * (long) Static343.anInt6808 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static584.anIntArray530[local200 + local187 - local519 - 1] * (long) Static343.anIntArrayArray31[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static584.anIntArray530[local200 - local549 - 1] * (long) Static343.anIntArrayArray31[1][local549] >> 16);
					}
					Static584.anIntArray530[local200] = local352;
					local182 = this.aClass225_1.method5979(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static584.anIntArray530[local200 + local187] * (long) Static343.anInt6808 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static584.anIntArray530[local200 + local187 - local519 - 1] * (long) Static343.anIntArrayArray31[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static584.anIntArray530[local200 - local549 - 1] * (long) Static343.anIntArrayArray31[1][local549] >> 16);
						}
						Static584.anIntArray530[local200] = local352;
						local182 = this.aClass225_1.method5979(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static584.anIntArray530[local200 + local187 - local519 - 1] * (long) Static343.anIntArrayArray31[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static584.anIntArray530[local200 - local549 - 1] * (long) Static343.anIntArrayArray31[1][local549] >> 16);
							}
							Static584.anIntArray530[local200] = local352;
							this.aClass225_1.method5979(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass197_1.method5689(0, (float) local182 / 65536.0F);
					local195 = this.aClass197_1.method5689(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static584.anIntArray530[local182] < -32768) {
				Static584.anIntArray530[local182] = -32768;
			}
			if (Static584.anIntArray530[local182] > 32767) {
				Static584.anIntArray530[local182] = 32767;
			}
		}
		return Static584.anIntArray530;
	}
}
