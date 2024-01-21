import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class22 {

	@OriginalMember(owner = "client!f", name = "b", descriptor = "[I")
	public static int[] anIntArray113 = new int[32768];

	@OriginalMember(owner = "client!f", name = "m", descriptor = "[I")
	public static int[] anIntArray116;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "Lclient!jg;")
	private Class43 aClass43_1;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "Lclient!jg;")
	private Class43 aClass43_2;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "Lclient!jg;")
	private Class43 aClass43_3;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "Lclient!jg;")
	private Class43 aClass43_4;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "Lclient!jg;")
	private Class43 aClass43_5;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "Lclient!ce;")
	private Class11 aClass11_1;

	@OriginalMember(owner = "client!f", name = "k", descriptor = "Lclient!jg;")
	private Class43 aClass43_6;

	@OriginalMember(owner = "client!f", name = "l", descriptor = "Lclient!jg;")
	private Class43 aClass43_7;

	@OriginalMember(owner = "client!f", name = "o", descriptor = "Lclient!jg;")
	private Class43 aClass43_8;

	@OriginalMember(owner = "client!f", name = "q", descriptor = "Lclient!jg;")
	private Class43 aClass43_9;

	@OriginalMember(owner = "client!f", name = "i", descriptor = "I")
	private int anInt1017 = 0;

	@OriginalMember(owner = "client!f", name = "n", descriptor = "I")
	public int anInt1018 = 0;

	@OriginalMember(owner = "client!f", name = "j", descriptor = "[I")
	private final int[] anIntArray115 = new int[5];

	@OriginalMember(owner = "client!f", name = "r", descriptor = "[I")
	private final int[] anIntArray117 = new int[5];

	@OriginalMember(owner = "client!f", name = "u", descriptor = "[I")
	private final int[] anIntArray120 = new int[5];

	@OriginalMember(owner = "client!f", name = "v", descriptor = "I")
	private int anInt1020 = 100;

	@OriginalMember(owner = "client!f", name = "p", descriptor = "I")
	public int anInt1019 = 500;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray113[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray116 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray116[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!va;)V")
	public void method836(@OriginalArg(0) Class2_Sub11 arg0) {
		this.aClass43_4 = new Class43();
		this.aClass43_4.method1290(arg0);
		this.aClass43_1 = new Class43();
		this.aClass43_1.method1290(arg0);
		@Pc(21) int local21 = arg0.method1461();
		if (local21 != 0) {
			arg0.anInt2077--;
			this.aClass43_6 = new Class43();
			this.aClass43_6.method1290(arg0);
			this.aClass43_7 = new Class43();
			this.aClass43_7.method1290(arg0);
		}
		local21 = arg0.method1461();
		if (local21 != 0) {
			arg0.anInt2077--;
			this.aClass43_5 = new Class43();
			this.aClass43_5.method1290(arg0);
			this.aClass43_9 = new Class43();
			this.aClass43_9.method1290(arg0);
		}
		local21 = arg0.method1461();
		if (local21 != 0) {
			arg0.anInt2077--;
			this.aClass43_3 = new Class43();
			this.aClass43_3.method1290(arg0);
			this.aClass43_8 = new Class43();
			this.aClass43_8.method1290(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1469();
			if (local114 == 0) {
				break;
			}
			this.anIntArray120[local109] = local114;
			this.anIntArray115[local109] = arg0.method1464();
			this.anIntArray117[local109] = arg0.method1469();
		}
		this.anInt1017 = arg0.method1469();
		this.anInt1020 = arg0.method1469();
		this.anInt1019 = arg0.method1456();
		this.anInt1018 = arg0.method1456();
		this.aClass11_1 = new Class11();
		this.aClass43_2 = new Class43();
		this.aClass11_1.method371(arg0, this.aClass43_2);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(III)I")
	private int method837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray116[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray113[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)[I")
	public int[] method839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static182.method1346(Static43.anIntArray114, 0, arg0);
		if (arg1 < 10) {
			return Static43.anIntArray114;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass43_4.method1288();
		this.aClass43_1.method1288();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass43_6 != null) {
			this.aClass43_6.method1288();
			this.aClass43_7.method1288();
			local24 = (int) ((double) (this.aClass43_6.anInt1828 - this.aClass43_6.anInt1827) * 32.768D / local16);
			local26 = (int) ((double) this.aClass43_6.anInt1827 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass43_5 != null) {
			this.aClass43_5.method1288();
			this.aClass43_9.method1288();
			local63 = (int) ((double) (this.aClass43_5.anInt1828 - this.aClass43_5.anInt1827) * 32.768D / local16);
			local65 = (int) ((double) this.aClass43_5.anInt1827 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray120[local102] != 0) {
				Static43.anIntArray123[local102] = 0;
				Static43.anIntArray119[local102] = (int) ((double) this.anIntArray117[local102] * local16);
				Static43.anIntArray118[local102] = (this.anIntArray120[local102] << 14) / 100;
				Static43.anIntArray122[local102] = (int) ((double) (this.aClass43_4.anInt1828 - this.aClass43_4.anInt1827) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray115[local102]) / local16);
				Static43.anIntArray121[local102] = (int) ((double) this.aClass43_4.anInt1827 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass43_4.method1287(arg0);
			local187 = this.aClass43_1.method1287(arg0);
			if (this.aClass43_6 != null) {
				local195 = this.aClass43_6.method1287(arg0);
				local200 = this.aClass43_7.method1287(arg0);
				local182 += this.method837(local28, local200, this.aClass43_6.anInt1826) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass43_5 != null) {
				local195 = this.aClass43_5.method1287(arg0);
				local200 = this.aClass43_9.method1287(arg0);
				local187 = local187 * ((this.method837(local67, local200, this.aClass43_5.anInt1826) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray120[local195] != 0) {
					local200 = local176 + Static43.anIntArray119[local195];
					if (local200 < arg0) {
						Static43.anIntArray114[local200] += this.method837(Static43.anIntArray123[local195], local187 * Static43.anIntArray118[local195] >> 15, this.aClass43_4.anInt1826);
						Static43.anIntArray123[local195] += (local182 * Static43.anIntArray122[local195] >> 16) + Static43.anIntArray121[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass43_3 != null) {
			this.aClass43_3.method1288();
			this.aClass43_8.method1288();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass43_3.method1287(arg0);
				local352 = this.aClass43_8.method1287(arg0);
				if (local339) {
					local187 = this.aClass43_3.anInt1827 + ((this.aClass43_3.anInt1828 - this.aClass43_3.anInt1827) * local347 >> 8);
				} else {
					local187 = this.aClass43_3.anInt1827 + ((this.aClass43_3.anInt1828 - this.aClass43_3.anInt1827) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static43.anIntArray114[local200] = 0;
				}
			}
		}
		if (this.anInt1017 > 0 && this.anInt1020 > 0) {
			local182 = (int) ((double) this.anInt1017 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static43.anIntArray114[local187] += Static43.anIntArray114[local187 - local182] * this.anInt1020 / 100;
			}
		}
		if (this.aClass11_1.anIntArray38[0] > 0 || this.aClass11_1.anIntArray38[1] > 0) {
			this.aClass43_2.method1288();
			local182 = this.aClass43_2.method1287(arg0 + 1);
			local187 = this.aClass11_1.method375(0, (float) local182 / 65536.0F);
			local195 = this.aClass11_1.method375(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static43.anIntArray114[local200 + local187] * (long) Static23.anInt551 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static43.anIntArray114[local200 + local187 - local519 - 1] * (long) Static23.anIntArrayArray6[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static43.anIntArray114[local200 - local549 - 1] * (long) Static23.anIntArrayArray6[1][local549] >> 16);
					}
					Static43.anIntArray114[local200] = local352;
					local182 = this.aClass43_2.method1287(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static43.anIntArray114[local200 + local187] * (long) Static23.anInt551 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static43.anIntArray114[local200 + local187 - local519 - 1] * (long) Static23.anIntArrayArray6[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static43.anIntArray114[local200 - local549 - 1] * (long) Static23.anIntArrayArray6[1][local549] >> 16);
						}
						Static43.anIntArray114[local200] = local352;
						local182 = this.aClass43_2.method1287(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static43.anIntArray114[local200 + local187 - local519 - 1] * (long) Static23.anIntArrayArray6[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static43.anIntArray114[local200 - local549 - 1] * (long) Static23.anIntArrayArray6[1][local549] >> 16);
							}
							Static43.anIntArray114[local200] = local352;
							this.aClass43_2.method1287(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass11_1.method375(0, (float) local182 / 65536.0F);
					local195 = this.aClass11_1.method375(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static43.anIntArray114[local182] < -32768) {
				Static43.anIntArray114[local182] = -32768;
			}
			if (Static43.anIntArray114[local182] > 32767) {
				Static43.anIntArray114[local182] = 32767;
			}
		}
		return Static43.anIntArray114;
	}
}
