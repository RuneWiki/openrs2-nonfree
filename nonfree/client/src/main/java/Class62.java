import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class62 {

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "[I")
	public static int[] anIntArray269 = new int[32768];

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "[I")
	public static int[] anIntArray272;

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "Lclient!cf;")
	private Class11 aClass11_1;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "Lclient!cf;")
	private Class11 aClass11_2;

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "Lclient!cf;")
	private Class11 aClass11_3;

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "Lclient!cf;")
	private Class11 aClass11_4;

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "Lclient!cf;")
	private Class11 aClass11_5;

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "Lclient!cf;")
	private Class11 aClass11_6;

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "Lclient!df;")
	private Class16 aClass16_1;

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "Lclient!cf;")
	private Class11 aClass11_7;

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "Lclient!cf;")
	private Class11 aClass11_8;

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "Lclient!cf;")
	private Class11 aClass11_9;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "[I")
	private final int[] anIntArray268 = new int[5];

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
	private int anInt2446 = 100;

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
	private int anInt2447 = 0;

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "[I")
	private final int[] anIntArray273 = new int[5];

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
	public int anInt2445 = 0;

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
	public int anInt2448 = 500;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "[I")
	private final int[] anIntArray270 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray269[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray272 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray272[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!na;)V")
	public void method1772(@OriginalArg(0) Class2_Sub9 arg0) {
		this.aClass11_5 = new Class11();
		this.aClass11_5.method251(arg0);
		this.aClass11_9 = new Class11();
		this.aClass11_9.method251(arg0);
		@Pc(21) int local21 = arg0.method640();
		if (local21 != 0) {
			arg0.anInt976--;
			this.aClass11_4 = new Class11();
			this.aClass11_4.method251(arg0);
			this.aClass11_1 = new Class11();
			this.aClass11_1.method251(arg0);
		}
		local21 = arg0.method640();
		if (local21 != 0) {
			arg0.anInt976--;
			this.aClass11_6 = new Class11();
			this.aClass11_6.method251(arg0);
			this.aClass11_2 = new Class11();
			this.aClass11_2.method251(arg0);
		}
		local21 = arg0.method640();
		if (local21 != 0) {
			arg0.anInt976--;
			this.aClass11_7 = new Class11();
			this.aClass11_7.method251(arg0);
			this.aClass11_8 = new Class11();
			this.aClass11_8.method251(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method653();
			if (local114 == 0) {
				break;
			}
			this.anIntArray268[local109] = local114;
			this.anIntArray273[local109] = arg0.method641();
			this.anIntArray270[local109] = arg0.method653();
		}
		this.anInt2447 = arg0.method653();
		this.anInt2446 = arg0.method653();
		this.anInt2448 = arg0.method632();
		this.anInt2445 = arg0.method632();
		this.aClass16_1 = new Class16();
		this.aClass11_3 = new Class11();
		this.aClass16_1.method404(arg0, this.aClass11_3);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)[I")
	public int[] method1774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static141.method1908(Static98.anIntArray271, 0, arg0);
		if (arg1 < 10) {
			return Static98.anIntArray271;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass11_5.method250();
		this.aClass11_9.method250();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass11_4 != null) {
			this.aClass11_4.method250();
			this.aClass11_1.method250();
			local24 = (int) ((double) (this.aClass11_4.anInt311 - this.aClass11_4.anInt310) * 32.768D / local16);
			local26 = (int) ((double) this.aClass11_4.anInt310 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass11_6 != null) {
			this.aClass11_6.method250();
			this.aClass11_2.method250();
			local63 = (int) ((double) (this.aClass11_6.anInt311 - this.aClass11_6.anInt310) * 32.768D / local16);
			local65 = (int) ((double) this.aClass11_6.anInt310 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray268[local102] != 0) {
				Static98.anIntArray276[local102] = 0;
				Static98.anIntArray278[local102] = (int) ((double) this.anIntArray270[local102] * local16);
				Static98.anIntArray274[local102] = (this.anIntArray268[local102] << 14) / 100;
				Static98.anIntArray275[local102] = (int) ((double) (this.aClass11_5.anInt311 - this.aClass11_5.anInt310) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray273[local102]) / local16);
				Static98.anIntArray277[local102] = (int) ((double) this.aClass11_5.anInt310 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass11_5.method252(arg0);
			local187 = this.aClass11_9.method252(arg0);
			if (this.aClass11_4 != null) {
				local195 = this.aClass11_4.method252(arg0);
				local200 = this.aClass11_1.method252(arg0);
				local182 += this.method1775(local28, local200, this.aClass11_4.anInt309) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass11_6 != null) {
				local195 = this.aClass11_6.method252(arg0);
				local200 = this.aClass11_2.method252(arg0);
				local187 = local187 * ((this.method1775(local67, local200, this.aClass11_6.anInt309) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray268[local195] != 0) {
					local200 = local176 + Static98.anIntArray278[local195];
					if (local200 < arg0) {
						Static98.anIntArray271[local200] += this.method1775(Static98.anIntArray276[local195], local187 * Static98.anIntArray274[local195] >> 15, this.aClass11_5.anInt309);
						Static98.anIntArray276[local195] += (local182 * Static98.anIntArray275[local195] >> 16) + Static98.anIntArray277[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass11_7 != null) {
			this.aClass11_7.method250();
			this.aClass11_8.method250();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass11_7.method252(arg0);
				local352 = this.aClass11_8.method252(arg0);
				if (local339) {
					local187 = this.aClass11_7.anInt310 + ((this.aClass11_7.anInt311 - this.aClass11_7.anInt310) * local347 >> 8);
				} else {
					local187 = this.aClass11_7.anInt310 + ((this.aClass11_7.anInt311 - this.aClass11_7.anInt310) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static98.anIntArray271[local200] = 0;
				}
			}
		}
		if (this.anInt2447 > 0 && this.anInt2446 > 0) {
			local182 = (int) ((double) this.anInt2447 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static98.anIntArray271[local187] += Static98.anIntArray271[local187 - local182] * this.anInt2446 / 100;
			}
		}
		if (this.aClass16_1.anIntArray76[0] > 0 || this.aClass16_1.anIntArray76[1] > 0) {
			this.aClass11_3.method250();
			local182 = this.aClass11_3.method252(arg0 + 1);
			local187 = this.aClass16_1.method405(0, (float) local182 / 65536.0F);
			local195 = this.aClass16_1.method405(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static98.anIntArray271[local200 + local187] * (long) Static22.anInt648 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static98.anIntArray271[local200 + local187 - local519 - 1] * (long) Static22.anIntArrayArray7[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static98.anIntArray271[local200 - local549 - 1] * (long) Static22.anIntArrayArray7[1][local549] >> 16);
					}
					Static98.anIntArray271[local200] = local352;
					local182 = this.aClass11_3.method252(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static98.anIntArray271[local200 + local187] * (long) Static22.anInt648 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static98.anIntArray271[local200 + local187 - local519 - 1] * (long) Static22.anIntArrayArray7[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static98.anIntArray271[local200 - local549 - 1] * (long) Static22.anIntArrayArray7[1][local549] >> 16);
						}
						Static98.anIntArray271[local200] = local352;
						local182 = this.aClass11_3.method252(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static98.anIntArray271[local200 + local187 - local519 - 1] * (long) Static22.anIntArrayArray7[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static98.anIntArray271[local200 - local549 - 1] * (long) Static22.anIntArrayArray7[1][local549] >> 16);
							}
							Static98.anIntArray271[local200] = local352;
							this.aClass11_3.method252(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass16_1.method405(0, (float) local182 / 65536.0F);
					local195 = this.aClass16_1.method405(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static98.anIntArray271[local182] < -32768) {
				Static98.anIntArray271[local182] = -32768;
			}
			if (Static98.anIntArray271[local182] > 32767) {
				Static98.anIntArray271[local182] = 32767;
			}
		}
		return Static98.anIntArray271;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)I")
	private int method1775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray272[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray269[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
