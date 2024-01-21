import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class46 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "[I")
	public static int[] anIntArray211 = new int[32768];

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "[I")
	public static int[] anIntArray214;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "Lclient!vd;")
	private Class80 aClass80_1;

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "Lclient!vd;")
	private Class80 aClass80_2;

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "Lclient!fc;")
	private Class24 aClass24_1;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "Lclient!vd;")
	private Class80 aClass80_3;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "Lclient!vd;")
	private Class80 aClass80_4;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "Lclient!vd;")
	private Class80 aClass80_5;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "Lclient!vd;")
	private Class80 aClass80_6;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "Lclient!vd;")
	private Class80 aClass80_7;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "Lclient!vd;")
	private Class80 aClass80_8;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "Lclient!vd;")
	private Class80 aClass80_9;

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "[I")
	private final int[] anIntArray212 = new int[5];

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
	private int anInt1703 = 100;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "[I")
	private final int[] anIntArray213 = new int[5];

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
	private int anInt1705 = 0;

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
	public int anInt1704 = 500;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "[I")
	private final int[] anIntArray215 = new int[5];

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
	public int anInt1706 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray211[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray214 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray214[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!wd;)V")
	public void method1054(@OriginalArg(0) Class8_Sub20 arg0) {
		this.aClass80_4 = new Class80();
		this.aClass80_4.method1978(arg0);
		this.aClass80_7 = new Class80();
		this.aClass80_7.method1978(arg0);
		@Pc(21) int local21 = arg0.method1872();
		if (local21 != 0) {
			arg0.anInt2853--;
			this.aClass80_5 = new Class80();
			this.aClass80_5.method1978(arg0);
			this.aClass80_6 = new Class80();
			this.aClass80_6.method1978(arg0);
		}
		local21 = arg0.method1872();
		if (local21 != 0) {
			arg0.anInt2853--;
			this.aClass80_9 = new Class80();
			this.aClass80_9.method1978(arg0);
			this.aClass80_3 = new Class80();
			this.aClass80_3.method1978(arg0);
		}
		local21 = arg0.method1872();
		if (local21 != 0) {
			arg0.anInt2853--;
			this.aClass80_1 = new Class80();
			this.aClass80_1.method1978(arg0);
			this.aClass80_2 = new Class80();
			this.aClass80_2.method1978(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1849();
			if (local114 == 0) {
				break;
			}
			this.anIntArray212[local109] = local114;
			this.anIntArray213[local109] = arg0.method1888();
			this.anIntArray215[local109] = arg0.method1849();
		}
		this.anInt1705 = arg0.method1849();
		this.anInt1703 = arg0.method1849();
		this.anInt1704 = arg0.method1839();
		this.anInt1706 = arg0.method1839();
		this.aClass24_1 = new Class24();
		this.aClass80_8 = new Class80();
		this.aClass24_1.method579(arg0, this.aClass80_8);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)I")
	private int method1055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray214[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray211[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)[I")
	public int[] method1057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static140.method1344(Static71.anIntArray216, 0, arg0);
		if (arg1 < 10) {
			return Static71.anIntArray216;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass80_4.method1977();
		this.aClass80_7.method1977();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass80_5 != null) {
			this.aClass80_5.method1977();
			this.aClass80_6.method1977();
			local24 = (int) ((double) (this.aClass80_5.anInt3004 - this.aClass80_5.anInt3003) * 32.768D / local16);
			local26 = (int) ((double) this.aClass80_5.anInt3003 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass80_9 != null) {
			this.aClass80_9.method1977();
			this.aClass80_3.method1977();
			local63 = (int) ((double) (this.aClass80_9.anInt3004 - this.aClass80_9.anInt3003) * 32.768D / local16);
			local65 = (int) ((double) this.aClass80_9.anInt3003 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray212[local102] != 0) {
				Static71.anIntArray218[local102] = 0;
				Static71.anIntArray217[local102] = (int) ((double) this.anIntArray215[local102] * local16);
				Static71.anIntArray220[local102] = (this.anIntArray212[local102] << 14) / 100;
				Static71.anIntArray221[local102] = (int) ((double) (this.aClass80_4.anInt3004 - this.aClass80_4.anInt3003) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray213[local102]) / local16);
				Static71.anIntArray219[local102] = (int) ((double) this.aClass80_4.anInt3003 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass80_4.method1976(arg0);
			local187 = this.aClass80_7.method1976(arg0);
			if (this.aClass80_5 != null) {
				local195 = this.aClass80_5.method1976(arg0);
				local200 = this.aClass80_6.method1976(arg0);
				local182 += this.method1055(local28, local200, this.aClass80_5.anInt3006) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass80_9 != null) {
				local195 = this.aClass80_9.method1976(arg0);
				local200 = this.aClass80_3.method1976(arg0);
				local187 = local187 * ((this.method1055(local67, local200, this.aClass80_9.anInt3006) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray212[local195] != 0) {
					local200 = local176 + Static71.anIntArray217[local195];
					if (local200 < arg0) {
						Static71.anIntArray216[local200] += this.method1055(Static71.anIntArray218[local195], local187 * Static71.anIntArray220[local195] >> 15, this.aClass80_4.anInt3006);
						Static71.anIntArray218[local195] += (local182 * Static71.anIntArray221[local195] >> 16) + Static71.anIntArray219[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass80_1 != null) {
			this.aClass80_1.method1977();
			this.aClass80_2.method1977();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass80_1.method1976(arg0);
				local352 = this.aClass80_2.method1976(arg0);
				if (local339) {
					local187 = this.aClass80_1.anInt3003 + ((this.aClass80_1.anInt3004 - this.aClass80_1.anInt3003) * local347 >> 8);
				} else {
					local187 = this.aClass80_1.anInt3003 + ((this.aClass80_1.anInt3004 - this.aClass80_1.anInt3003) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static71.anIntArray216[local200] = 0;
				}
			}
		}
		if (this.anInt1705 > 0 && this.anInt1703 > 0) {
			local182 = (int) ((double) this.anInt1705 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static71.anIntArray216[local187] += Static71.anIntArray216[local187 - local182] * this.anInt1703 / 100;
			}
		}
		if (this.aClass24_1.anIntArray128[0] > 0 || this.aClass24_1.anIntArray128[1] > 0) {
			this.aClass80_8.method1977();
			local182 = this.aClass80_8.method1976(arg0 + 1);
			local187 = this.aClass24_1.method577(0, (float) local182 / 65536.0F);
			local195 = this.aClass24_1.method577(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static71.anIntArray216[local200 + local187] * (long) Static37.anInt923 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static71.anIntArray216[local200 + local187 - local519 - 1] * (long) Static37.anIntArrayArray9[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static71.anIntArray216[local200 - local549 - 1] * (long) Static37.anIntArrayArray9[1][local549] >> 16);
					}
					Static71.anIntArray216[local200] = local352;
					local182 = this.aClass80_8.method1976(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static71.anIntArray216[local200 + local187] * (long) Static37.anInt923 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static71.anIntArray216[local200 + local187 - local519 - 1] * (long) Static37.anIntArrayArray9[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static71.anIntArray216[local200 - local549 - 1] * (long) Static37.anIntArrayArray9[1][local549] >> 16);
						}
						Static71.anIntArray216[local200] = local352;
						local182 = this.aClass80_8.method1976(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static71.anIntArray216[local200 + local187 - local519 - 1] * (long) Static37.anIntArrayArray9[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static71.anIntArray216[local200 - local549 - 1] * (long) Static37.anIntArrayArray9[1][local549] >> 16);
							}
							Static71.anIntArray216[local200] = local352;
							this.aClass80_8.method1976(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass24_1.method577(0, (float) local182 / 65536.0F);
					local195 = this.aClass24_1.method577(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static71.anIntArray216[local182] < -32768) {
				Static71.anIntArray216[local182] = -32768;
			}
			if (Static71.anIntArray216[local182] > 32767) {
				Static71.anIntArray216[local182] = 32767;
			}
		}
		return Static71.anIntArray216;
	}
}
