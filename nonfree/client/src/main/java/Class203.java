import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class203 {

	@OriginalMember(owner = "client!lq", name = "j", descriptor = "[I")
	private static final int[] anIntArray420 = new int[32768];

	@OriginalMember(owner = "client!lq", name = "h", descriptor = "[I")
	private static final int[] anIntArray419;

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "Lclient!ck;")
	private Class49 aClass49_1;

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "Lclient!ck;")
	private Class49 aClass49_2;

	@OriginalMember(owner = "client!lq", name = "k", descriptor = "Lclient!ck;")
	private Class49 aClass49_3;

	@OriginalMember(owner = "client!lq", name = "m", descriptor = "Lclient!ck;")
	private Class49 aClass49_4;

	@OriginalMember(owner = "client!lq", name = "n", descriptor = "Lclient!ea;")
	private Class74 aClass74_1;

	@OriginalMember(owner = "client!lq", name = "o", descriptor = "Lclient!ck;")
	private Class49 aClass49_5;

	@OriginalMember(owner = "client!lq", name = "p", descriptor = "Lclient!ck;")
	private Class49 aClass49_6;

	@OriginalMember(owner = "client!lq", name = "q", descriptor = "Lclient!ck;")
	private Class49 aClass49_7;

	@OriginalMember(owner = "client!lq", name = "r", descriptor = "Lclient!ck;")
	private Class49 aClass49_8;

	@OriginalMember(owner = "client!lq", name = "u", descriptor = "Lclient!ck;")
	private Class49 aClass49_9;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "[I")
	private final int[] anIntArray415 = new int[5];

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
	public int anInt6158 = 500;

	@OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
	private int anInt6160 = 100;

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "[I")
	private final int[] anIntArray417 = new int[5];

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "[I")
	private final int[] anIntArray418 = new int[5];

	@OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
	private int anInt6159 = 0;

	@OriginalMember(owner = "client!lq", name = "w", descriptor = "I")
	public int anInt6161 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray420[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray419 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray419[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!fd;)V")
	public void method5127(@OriginalArg(0) Class3_Sub7 arg0) {
		this.aClass49_8 = new Class49();
		this.aClass49_8.method1654(arg0);
		this.aClass49_9 = new Class49();
		this.aClass49_9.method1654(arg0);
		@Pc(21) int local21 = arg0.method6538();
		if (local21 != 0) {
			arg0.anInt7869--;
			this.aClass49_7 = new Class49();
			this.aClass49_7.method1654(arg0);
			this.aClass49_4 = new Class49();
			this.aClass49_4.method1654(arg0);
		}
		local21 = arg0.method6538();
		if (local21 != 0) {
			arg0.anInt7869--;
			this.aClass49_5 = new Class49();
			this.aClass49_5.method1654(arg0);
			this.aClass49_3 = new Class49();
			this.aClass49_3.method1654(arg0);
		}
		local21 = arg0.method6538();
		if (local21 != 0) {
			arg0.anInt7869--;
			this.aClass49_6 = new Class49();
			this.aClass49_6.method1654(arg0);
			this.aClass49_2 = new Class49();
			this.aClass49_2.method1654(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method6542();
			if (local114 == 0) {
				break;
			}
			this.anIntArray417[local109] = local114;
			this.anIntArray418[local109] = arg0.method6511();
			this.anIntArray415[local109] = arg0.method6542();
		}
		this.anInt6159 = arg0.method6542();
		this.anInt6160 = arg0.method6542();
		this.anInt6158 = arg0.method6535();
		this.anInt6161 = arg0.method6535();
		this.aClass74_1 = new Class74();
		this.aClass49_1 = new Class49();
		this.aClass74_1.method2201(arg0, this.aClass49_1);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(III)I")
	private int method5128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray419[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray420[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)[I")
	public int[] method5130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static602.method4667(Static307.anIntArray416, 0, arg0);
		if (arg1 < 10) {
			return Static307.anIntArray416;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass49_8.method1651();
		this.aClass49_9.method1651();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass49_7 != null) {
			this.aClass49_7.method1651();
			this.aClass49_4.method1651();
			local24 = (int) ((double) (this.aClass49_7.anInt1710 - this.aClass49_7.anInt1708) * 32.768D / local16);
			local26 = (int) ((double) this.aClass49_7.anInt1708 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass49_5 != null) {
			this.aClass49_5.method1651();
			this.aClass49_3.method1651();
			local63 = (int) ((double) (this.aClass49_5.anInt1710 - this.aClass49_5.anInt1708) * 32.768D / local16);
			local65 = (int) ((double) this.aClass49_5.anInt1708 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray417[local102] != 0) {
				Static307.anIntArray425[local102] = 0;
				Static307.anIntArray421[local102] = (int) ((double) this.anIntArray415[local102] * local16);
				Static307.anIntArray424[local102] = (this.anIntArray417[local102] << 14) / 100;
				Static307.anIntArray423[local102] = (int) ((double) (this.aClass49_8.anInt1710 - this.aClass49_8.anInt1708) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray418[local102]) / local16);
				Static307.anIntArray422[local102] = (int) ((double) this.aClass49_8.anInt1708 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass49_8.method1652(arg0);
			local187 = this.aClass49_9.method1652(arg0);
			if (this.aClass49_7 != null) {
				local195 = this.aClass49_7.method1652(arg0);
				local200 = this.aClass49_4.method1652(arg0);
				local182 += this.method5128(local28, local200, this.aClass49_7.anInt1709) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass49_5 != null) {
				local195 = this.aClass49_5.method1652(arg0);
				local200 = this.aClass49_3.method1652(arg0);
				local187 = local187 * ((this.method5128(local67, local200, this.aClass49_5.anInt1709) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray417[local195] != 0) {
					local200 = local176 + Static307.anIntArray421[local195];
					if (local200 < arg0) {
						Static307.anIntArray416[local200] += this.method5128(Static307.anIntArray425[local195], local187 * Static307.anIntArray424[local195] >> 15, this.aClass49_8.anInt1709);
						Static307.anIntArray425[local195] += (local182 * Static307.anIntArray423[local195] >> 16) + Static307.anIntArray422[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass49_6 != null) {
			this.aClass49_6.method1651();
			this.aClass49_2.method1651();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass49_6.method1652(arg0);
				local352 = this.aClass49_2.method1652(arg0);
				if (local339) {
					local187 = this.aClass49_6.anInt1708 + ((this.aClass49_6.anInt1710 - this.aClass49_6.anInt1708) * local347 >> 8);
				} else {
					local187 = this.aClass49_6.anInt1708 + ((this.aClass49_6.anInt1710 - this.aClass49_6.anInt1708) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static307.anIntArray416[local200] = 0;
				}
			}
		}
		if (this.anInt6159 > 0 && this.anInt6160 > 0) {
			local182 = (int) ((double) this.anInt6159 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static307.anIntArray416[local187] += Static307.anIntArray416[local187 - local182] * this.anInt6160 / 100;
			}
		}
		if (this.aClass74_1.anIntArray121[0] > 0 || this.aClass74_1.anIntArray121[1] > 0) {
			this.aClass49_1.method1651();
			local182 = this.aClass49_1.method1652(arg0 + 1);
			local187 = this.aClass74_1.method2202(0, (float) local182 / 65536.0F);
			local195 = this.aClass74_1.method2202(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static307.anIntArray416[local200 + local187] * (long) Static103.anInt2484 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static307.anIntArray416[local200 + local187 - local519 - 1] * (long) Static103.anIntArrayArray21[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static307.anIntArray416[local200 - local549 - 1] * (long) Static103.anIntArrayArray21[1][local549] >> 16);
					}
					Static307.anIntArray416[local200] = local352;
					local182 = this.aClass49_1.method1652(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static307.anIntArray416[local200 + local187] * (long) Static103.anInt2484 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static307.anIntArray416[local200 + local187 - local519 - 1] * (long) Static103.anIntArrayArray21[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static307.anIntArray416[local200 - local549 - 1] * (long) Static103.anIntArrayArray21[1][local549] >> 16);
						}
						Static307.anIntArray416[local200] = local352;
						local182 = this.aClass49_1.method1652(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static307.anIntArray416[local200 + local187 - local519 - 1] * (long) Static103.anIntArrayArray21[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static307.anIntArray416[local200 - local549 - 1] * (long) Static103.anIntArrayArray21[1][local549] >> 16);
							}
							Static307.anIntArray416[local200] = local352;
							this.aClass49_1.method1652(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass74_1.method2202(0, (float) local182 / 65536.0F);
					local195 = this.aClass74_1.method2202(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static307.anIntArray416[local182] < -32768) {
				Static307.anIntArray416[local182] = -32768;
			}
			if (Static307.anIntArray416[local182] > 32767) {
				Static307.anIntArray416[local182] = 32767;
			}
		}
		return Static307.anIntArray416;
	}
}
