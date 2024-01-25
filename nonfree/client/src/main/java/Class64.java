import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class64 {

	@OriginalMember(owner = "client!ef", name = "r", descriptor = "[I")
	private static final int[] anIntArray140 = new int[32768];

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "[I")
	private static final int[] anIntArray137;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "Lclient!ng;")
	private Class160 aClass160_1;

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "Lclient!ng;")
	private Class160 aClass160_2;

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "Lclient!ng;")
	private Class160 aClass160_3;

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "Lclient!ng;")
	private Class160 aClass160_4;

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "Lclient!ng;")
	private Class160 aClass160_5;

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "Lclient!ng;")
	private Class160 aClass160_6;

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "Lclient!k;")
	private Class122 aClass122_1;

	@OriginalMember(owner = "client!ef", name = "o", descriptor = "Lclient!ng;")
	private Class160 aClass160_7;

	@OriginalMember(owner = "client!ef", name = "p", descriptor = "Lclient!ng;")
	private Class160 aClass160_8;

	@OriginalMember(owner = "client!ef", name = "s", descriptor = "Lclient!ng;")
	private Class160 aClass160_9;

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
	private int anInt1798 = 0;

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "[I")
	private final int[] anIntArray138 = new int[5];

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
	private int anInt1797 = 100;

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
	public int anInt1799 = 0;

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "[I")
	private final int[] anIntArray136 = new int[5];

	@OriginalMember(owner = "client!ef", name = "q", descriptor = "[I")
	private final int[] anIntArray139 = new int[5];

	@OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
	public int anInt1800 = 500;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray140[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray137 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray137[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)[I")
	public int[] method1419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static394.method2441(Static83.anIntArray135, 0, arg0);
		if (arg1 < 10) {
			return Static83.anIntArray135;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass160_2.method4092();
		this.aClass160_3.method4092();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass160_5 != null) {
			this.aClass160_5.method4092();
			this.aClass160_1.method4092();
			local24 = (int) ((double) (this.aClass160_5.anInt4532 - this.aClass160_5.anInt4534) * 32.768D / local16);
			local26 = (int) ((double) this.aClass160_5.anInt4534 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass160_6 != null) {
			this.aClass160_6.method4092();
			this.aClass160_9.method4092();
			local63 = (int) ((double) (this.aClass160_6.anInt4532 - this.aClass160_6.anInt4534) * 32.768D / local16);
			local65 = (int) ((double) this.aClass160_6.anInt4534 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray139[local102] != 0) {
				Static83.anIntArray142[local102] = 0;
				Static83.anIntArray145[local102] = (int) ((double) this.anIntArray138[local102] * local16);
				Static83.anIntArray144[local102] = (this.anIntArray139[local102] << 14) / 100;
				Static83.anIntArray141[local102] = (int) ((double) (this.aClass160_2.anInt4532 - this.aClass160_2.anInt4534) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray136[local102]) / local16);
				Static83.anIntArray143[local102] = (int) ((double) this.aClass160_2.anInt4534 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass160_2.method4091(arg0);
			local187 = this.aClass160_3.method4091(arg0);
			if (this.aClass160_5 != null) {
				local195 = this.aClass160_5.method4091(arg0);
				local200 = this.aClass160_1.method4091(arg0);
				local182 += this.method1422(local28, local200, this.aClass160_5.anInt4535) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass160_6 != null) {
				local195 = this.aClass160_6.method4091(arg0);
				local200 = this.aClass160_9.method4091(arg0);
				local187 = local187 * ((this.method1422(local67, local200, this.aClass160_6.anInt4535) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray139[local195] != 0) {
					local200 = local176 + Static83.anIntArray145[local195];
					if (local200 < arg0) {
						Static83.anIntArray135[local200] += this.method1422(Static83.anIntArray142[local195], local187 * Static83.anIntArray144[local195] >> 15, this.aClass160_2.anInt4535);
						Static83.anIntArray142[local195] += (local182 * Static83.anIntArray141[local195] >> 16) + Static83.anIntArray143[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass160_8 != null) {
			this.aClass160_8.method4092();
			this.aClass160_7.method4092();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass160_8.method4091(arg0);
				local352 = this.aClass160_7.method4091(arg0);
				if (local339) {
					local187 = this.aClass160_8.anInt4534 + ((this.aClass160_8.anInt4532 - this.aClass160_8.anInt4534) * local347 >> 8);
				} else {
					local187 = this.aClass160_8.anInt4534 + ((this.aClass160_8.anInt4532 - this.aClass160_8.anInt4534) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static83.anIntArray135[local200] = 0;
				}
			}
		}
		if (this.anInt1798 > 0 && this.anInt1797 > 0) {
			local182 = (int) ((double) this.anInt1798 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static83.anIntArray135[local187] += Static83.anIntArray135[local187 - local182] * this.anInt1797 / 100;
			}
		}
		if (this.aClass122_1.anIntArray275[0] > 0 || this.aClass122_1.anIntArray275[1] > 0) {
			this.aClass160_4.method4092();
			local182 = this.aClass160_4.method4091(arg0 + 1);
			local187 = this.aClass122_1.method3078(0, (float) local182 / 65536.0F);
			local195 = this.aClass122_1.method3078(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static83.anIntArray135[local200 + local187] * (long) Static173.anInt3537 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static83.anIntArray135[local200 + local187 - local519 - 1] * (long) Static173.anIntArrayArray18[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static83.anIntArray135[local200 - local549 - 1] * (long) Static173.anIntArrayArray18[1][local549] >> 16);
					}
					Static83.anIntArray135[local200] = local352;
					local182 = this.aClass160_4.method4091(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static83.anIntArray135[local200 + local187] * (long) Static173.anInt3537 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static83.anIntArray135[local200 + local187 - local519 - 1] * (long) Static173.anIntArrayArray18[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static83.anIntArray135[local200 - local549 - 1] * (long) Static173.anIntArrayArray18[1][local549] >> 16);
						}
						Static83.anIntArray135[local200] = local352;
						local182 = this.aClass160_4.method4091(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static83.anIntArray135[local200 + local187 - local519 - 1] * (long) Static173.anIntArrayArray18[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static83.anIntArray135[local200 - local549 - 1] * (long) Static173.anIntArrayArray18[1][local549] >> 16);
							}
							Static83.anIntArray135[local200] = local352;
							this.aClass160_4.method4091(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass122_1.method3078(0, (float) local182 / 65536.0F);
					local195 = this.aClass122_1.method3078(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static83.anIntArray135[local182] < -32768) {
				Static83.anIntArray135[local182] = -32768;
			}
			if (Static83.anIntArray135[local182] > 32767) {
				Static83.anIntArray135[local182] = 32767;
			}
		}
		return Static83.anIntArray135;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!vt;)V")
	public void method1421(@OriginalArg(0) Class2_Sub24 arg0) {
		this.aClass160_2 = new Class160();
		this.aClass160_2.method4094(arg0);
		this.aClass160_3 = new Class160();
		this.aClass160_3.method4094(arg0);
		@Pc(21) int local21 = arg0.method5732();
		if (local21 != 0) {
			arg0.anInt6669--;
			this.aClass160_5 = new Class160();
			this.aClass160_5.method4094(arg0);
			this.aClass160_1 = new Class160();
			this.aClass160_1.method4094(arg0);
		}
		local21 = arg0.method5732();
		if (local21 != 0) {
			arg0.anInt6669--;
			this.aClass160_6 = new Class160();
			this.aClass160_6.method4094(arg0);
			this.aClass160_9 = new Class160();
			this.aClass160_9.method4094(arg0);
		}
		local21 = arg0.method5732();
		if (local21 != 0) {
			arg0.anInt6669--;
			this.aClass160_8 = new Class160();
			this.aClass160_8.method4094(arg0);
			this.aClass160_7 = new Class160();
			this.aClass160_7.method4094(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method5722();
			if (local114 == 0) {
				break;
			}
			this.anIntArray139[local109] = local114;
			this.anIntArray136[local109] = arg0.method5768();
			this.anIntArray138[local109] = arg0.method5722();
		}
		this.anInt1798 = arg0.method5722();
		this.anInt1797 = arg0.method5722();
		this.anInt1800 = arg0.method5753();
		this.anInt1799 = arg0.method5753();
		this.aClass122_1 = new Class122();
		this.aClass160_4 = new Class160();
		this.aClass122_1.method3076(arg0, this.aClass160_4);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)I")
	private int method1422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray137[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray140[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
