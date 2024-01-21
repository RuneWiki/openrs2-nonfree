import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class57 {

	@OriginalMember(owner = "client!od", name = "e", descriptor = "[I")
	public static int[] anIntArray226 = new int[32768];

	@OriginalMember(owner = "client!od", name = "i", descriptor = "[I")
	public static int[] anIntArray227;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "Lclient!p;")
	private Class59 aClass59_1;

	@OriginalMember(owner = "client!od", name = "c", descriptor = "Lclient!ha;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!od", name = "f", descriptor = "Lclient!ha;")
	private Class33 aClass33_2;

	@OriginalMember(owner = "client!od", name = "h", descriptor = "Lclient!ha;")
	private Class33 aClass33_3;

	@OriginalMember(owner = "client!od", name = "j", descriptor = "Lclient!ha;")
	private Class33 aClass33_4;

	@OriginalMember(owner = "client!od", name = "k", descriptor = "Lclient!ha;")
	private Class33 aClass33_5;

	@OriginalMember(owner = "client!od", name = "n", descriptor = "Lclient!ha;")
	private Class33 aClass33_6;

	@OriginalMember(owner = "client!od", name = "q", descriptor = "Lclient!ha;")
	private Class33 aClass33_7;

	@OriginalMember(owner = "client!od", name = "r", descriptor = "Lclient!ha;")
	private Class33 aClass33_8;

	@OriginalMember(owner = "client!od", name = "x", descriptor = "Lclient!ha;")
	private Class33 aClass33_9;

	@OriginalMember(owner = "client!od", name = "b", descriptor = "[I")
	private final int[] anIntArray224 = new int[5];

	@OriginalMember(owner = "client!od", name = "d", descriptor = "[I")
	private final int[] anIntArray225 = new int[5];

	@OriginalMember(owner = "client!od", name = "l", descriptor = "I")
	public int anInt2154 = 500;

	@OriginalMember(owner = "client!od", name = "g", descriptor = "I")
	private int anInt2153 = 100;

	@OriginalMember(owner = "client!od", name = "m", descriptor = "[I")
	private final int[] anIntArray228 = new int[5];

	@OriginalMember(owner = "client!od", name = "o", descriptor = "I")
	public int anInt2155 = 0;

	@OriginalMember(owner = "client!od", name = "t", descriptor = "I")
	private int anInt2156 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray226[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray227 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray227[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!s;)V")
	public void method1580(@OriginalArg(0) Class4_Sub16 arg0) {
		this.aClass33_1 = new Class33();
		this.aClass33_1.method743(arg0);
		this.aClass33_6 = new Class33();
		this.aClass33_6.method743(arg0);
		@Pc(21) int local21 = arg0.method1474();
		if (local21 != 0) {
			arg0.anInt2019--;
			this.aClass33_9 = new Class33();
			this.aClass33_9.method743(arg0);
			this.aClass33_7 = new Class33();
			this.aClass33_7.method743(arg0);
		}
		local21 = arg0.method1474();
		if (local21 != 0) {
			arg0.anInt2019--;
			this.aClass33_5 = new Class33();
			this.aClass33_5.method743(arg0);
			this.aClass33_3 = new Class33();
			this.aClass33_3.method743(arg0);
		}
		local21 = arg0.method1474();
		if (local21 != 0) {
			arg0.anInt2019--;
			this.aClass33_2 = new Class33();
			this.aClass33_2.method743(arg0);
			this.aClass33_8 = new Class33();
			this.aClass33_8.method743(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1450();
			if (local114 == 0) {
				break;
			}
			this.anIntArray228[local109] = local114;
			this.anIntArray224[local109] = arg0.method1478();
			this.anIntArray225[local109] = arg0.method1450();
		}
		this.anInt2156 = arg0.method1450();
		this.anInt2153 = arg0.method1450();
		this.anInt2154 = arg0.method1490();
		this.anInt2155 = arg0.method1490();
		this.aClass59_1 = new Class59();
		this.aClass33_4 = new Class33();
		this.aClass59_1.method1617(arg0, this.aClass33_4);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(III)I")
	private int method1581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray227[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray226[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)[I")
	public int[] method1582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static134.method1169(Static86.anIntArray229, 0, arg0);
		if (arg1 < 10) {
			return Static86.anIntArray229;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass33_1.method745();
		this.aClass33_6.method745();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass33_9 != null) {
			this.aClass33_9.method745();
			this.aClass33_7.method745();
			local24 = (int) ((double) (this.aClass33_9.anInt1132 - this.aClass33_9.anInt1133) * 32.768D / local16);
			local26 = (int) ((double) this.aClass33_9.anInt1133 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass33_5 != null) {
			this.aClass33_5.method745();
			this.aClass33_3.method745();
			local63 = (int) ((double) (this.aClass33_5.anInt1132 - this.aClass33_5.anInt1133) * 32.768D / local16);
			local65 = (int) ((double) this.aClass33_5.anInt1133 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray228[local102] != 0) {
				Static86.anIntArray232[local102] = 0;
				Static86.anIntArray231[local102] = (int) ((double) this.anIntArray225[local102] * local16);
				Static86.anIntArray233[local102] = (this.anIntArray228[local102] << 14) / 100;
				Static86.anIntArray234[local102] = (int) ((double) (this.aClass33_1.anInt1132 - this.aClass33_1.anInt1133) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray224[local102]) / local16);
				Static86.anIntArray230[local102] = (int) ((double) this.aClass33_1.anInt1133 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass33_1.method744(arg0);
			local187 = this.aClass33_6.method744(arg0);
			if (this.aClass33_9 != null) {
				local195 = this.aClass33_9.method744(arg0);
				local200 = this.aClass33_7.method744(arg0);
				local182 += this.method1581(local28, local200, this.aClass33_9.anInt1134) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass33_5 != null) {
				local195 = this.aClass33_5.method744(arg0);
				local200 = this.aClass33_3.method744(arg0);
				local187 = local187 * ((this.method1581(local67, local200, this.aClass33_5.anInt1134) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray228[local195] != 0) {
					local200 = local176 + Static86.anIntArray231[local195];
					if (local200 < arg0) {
						Static86.anIntArray229[local200] += this.method1581(Static86.anIntArray232[local195], local187 * Static86.anIntArray233[local195] >> 15, this.aClass33_1.anInt1134);
						Static86.anIntArray232[local195] += (local182 * Static86.anIntArray234[local195] >> 16) + Static86.anIntArray230[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass33_2 != null) {
			this.aClass33_2.method745();
			this.aClass33_8.method745();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass33_2.method744(arg0);
				local352 = this.aClass33_8.method744(arg0);
				if (local339) {
					local187 = this.aClass33_2.anInt1133 + ((this.aClass33_2.anInt1132 - this.aClass33_2.anInt1133) * local347 >> 8);
				} else {
					local187 = this.aClass33_2.anInt1133 + ((this.aClass33_2.anInt1132 - this.aClass33_2.anInt1133) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static86.anIntArray229[local200] = 0;
				}
			}
		}
		if (this.anInt2156 > 0 && this.anInt2153 > 0) {
			local182 = (int) ((double) this.anInt2156 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static86.anIntArray229[local187] += Static86.anIntArray229[local187 - local182] * this.anInt2153 / 100;
			}
		}
		if (this.aClass59_1.anIntArray237[0] > 0 || this.aClass59_1.anIntArray237[1] > 0) {
			this.aClass33_4.method745();
			local182 = this.aClass33_4.method744(arg0 + 1);
			local187 = this.aClass59_1.method1615(0, (float) local182 / 65536.0F);
			local195 = this.aClass59_1.method1615(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static86.anIntArray229[local200 + local187] * (long) Static89.anInt2206 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static86.anIntArray229[local200 + local187 - local519 - 1] * (long) Static89.anIntArrayArray17[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static86.anIntArray229[local200 - local549 - 1] * (long) Static89.anIntArrayArray17[1][local549] >> 16);
					}
					Static86.anIntArray229[local200] = local352;
					local182 = this.aClass33_4.method744(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static86.anIntArray229[local200 + local187] * (long) Static89.anInt2206 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static86.anIntArray229[local200 + local187 - local519 - 1] * (long) Static89.anIntArrayArray17[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static86.anIntArray229[local200 - local549 - 1] * (long) Static89.anIntArrayArray17[1][local549] >> 16);
						}
						Static86.anIntArray229[local200] = local352;
						local182 = this.aClass33_4.method744(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static86.anIntArray229[local200 + local187 - local519 - 1] * (long) Static89.anIntArrayArray17[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static86.anIntArray229[local200 - local549 - 1] * (long) Static89.anIntArrayArray17[1][local549] >> 16);
							}
							Static86.anIntArray229[local200] = local352;
							this.aClass33_4.method744(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass59_1.method1615(0, (float) local182 / 65536.0F);
					local195 = this.aClass59_1.method1615(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static86.anIntArray229[local182] < -32768) {
				Static86.anIntArray229[local182] = -32768;
			}
			if (Static86.anIntArray229[local182] > 32767) {
				Static86.anIntArray229[local182] = 32767;
			}
		}
		return Static86.anIntArray229;
	}
}
