import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class43 {

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "[I")
	private static final int[] anIntArray38 = new int[32768];

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "[I")
	private static final int[] anIntArray41;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "Lclient!rc;")
	private Class287 aClass287_1;

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "Lclient!rc;")
	private Class287 aClass287_2;

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "Lclient!rc;")
	private Class287 aClass287_3;

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "Lclient!rc;")
	private Class287 aClass287_4;

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "Lclient!rc;")
	private Class287 aClass287_5;

	@OriginalMember(owner = "client!bt", name = "q", descriptor = "Lclient!rc;")
	private Class287 aClass287_6;

	@OriginalMember(owner = "client!bt", name = "s", descriptor = "Lclient!rc;")
	private Class287 aClass287_7;

	@OriginalMember(owner = "client!bt", name = "t", descriptor = "Lclient!rc;")
	private Class287 aClass287_8;

	@OriginalMember(owner = "client!bt", name = "u", descriptor = "Lclient!bm;")
	private Class37 aClass37_1;

	@OriginalMember(owner = "client!bt", name = "y", descriptor = "Lclient!rc;")
	private Class287 aClass287_9;

	@OriginalMember(owner = "client!bt", name = "r", descriptor = "I")
	private int anInt1341 = 100;

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "[I")
	private final int[] anIntArray39 = new int[5];

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "[I")
	private final int[] anIntArray44 = new int[5];

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
	public int anInt1340 = 0;

	@OriginalMember(owner = "client!bt", name = "v", descriptor = "I")
	private int anInt1342 = 0;

	@OriginalMember(owner = "client!bt", name = "x", descriptor = "I")
	public int anInt1343 = 500;

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "[I")
	private final int[] anIntArray42 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray38[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray41 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray41[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!ek;)V")
	public void method1170(@OriginalArg(0) Class4_Sub13 arg0) {
		this.aClass287_9 = new Class287();
		this.aClass287_9.method6624(arg0);
		this.aClass287_4 = new Class287();
		this.aClass287_4.method6624(arg0);
		@Pc(21) int local21 = arg0.method7004();
		if (local21 != 0) {
			arg0.anInt9170--;
			this.aClass287_8 = new Class287();
			this.aClass287_8.method6624(arg0);
			this.aClass287_3 = new Class287();
			this.aClass287_3.method6624(arg0);
		}
		local21 = arg0.method7004();
		if (local21 != 0) {
			arg0.anInt9170--;
			this.aClass287_1 = new Class287();
			this.aClass287_1.method6624(arg0);
			this.aClass287_2 = new Class287();
			this.aClass287_2.method6624(arg0);
		}
		local21 = arg0.method7004();
		if (local21 != 0) {
			arg0.anInt9170--;
			this.aClass287_7 = new Class287();
			this.aClass287_7.method6624(arg0);
			this.aClass287_5 = new Class287();
			this.aClass287_5.method6624(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method7019();
			if (local114 == 0) {
				break;
			}
			this.anIntArray42[local109] = local114;
			this.anIntArray44[local109] = arg0.method7017();
			this.anIntArray39[local109] = arg0.method7019();
		}
		this.anInt1342 = arg0.method7019();
		this.anInt1341 = arg0.method7019();
		this.anInt1343 = arg0.method7054();
		this.anInt1340 = arg0.method7054();
		this.aClass37_1 = new Class37();
		this.aClass287_6 = new Class287();
		this.aClass37_1.method1126(arg0, this.aClass287_6);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)[I")
	public int[] method1172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static599.method3057(Static51.anIntArray40, 0, arg0);
		if (arg1 < 10) {
			return Static51.anIntArray40;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass287_9.method6626();
		this.aClass287_4.method6626();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass287_8 != null) {
			this.aClass287_8.method6626();
			this.aClass287_3.method6626();
			local24 = (int) ((double) (this.aClass287_8.anInt8566 - this.aClass287_8.anInt8563) * 32.768D / local16);
			local26 = (int) ((double) this.aClass287_8.anInt8563 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass287_1 != null) {
			this.aClass287_1.method6626();
			this.aClass287_2.method6626();
			local63 = (int) ((double) (this.aClass287_1.anInt8566 - this.aClass287_1.anInt8563) * 32.768D / local16);
			local65 = (int) ((double) this.aClass287_1.anInt8563 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray42[local102] != 0) {
				Static51.anIntArray47[local102] = 0;
				Static51.anIntArray46[local102] = (int) ((double) this.anIntArray39[local102] * local16);
				Static51.anIntArray45[local102] = (this.anIntArray42[local102] << 14) / 100;
				Static51.anIntArray48[local102] = (int) ((double) (this.aClass287_9.anInt8566 - this.aClass287_9.anInt8563) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray44[local102]) / local16);
				Static51.anIntArray43[local102] = (int) ((double) this.aClass287_9.anInt8563 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass287_9.method6625(arg0);
			local187 = this.aClass287_4.method6625(arg0);
			if (this.aClass287_8 != null) {
				local195 = this.aClass287_8.method6625(arg0);
				local200 = this.aClass287_3.method6625(arg0);
				local182 += this.method1173(local28, local200, this.aClass287_8.anInt8564) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass287_1 != null) {
				local195 = this.aClass287_1.method6625(arg0);
				local200 = this.aClass287_2.method6625(arg0);
				local187 = local187 * ((this.method1173(local67, local200, this.aClass287_1.anInt8564) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray42[local195] != 0) {
					local200 = local176 + Static51.anIntArray46[local195];
					if (local200 < arg0) {
						Static51.anIntArray40[local200] += this.method1173(Static51.anIntArray47[local195], local187 * Static51.anIntArray45[local195] >> 15, this.aClass287_9.anInt8564);
						Static51.anIntArray47[local195] += (local182 * Static51.anIntArray48[local195] >> 16) + Static51.anIntArray43[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass287_7 != null) {
			this.aClass287_7.method6626();
			this.aClass287_5.method6626();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass287_7.method6625(arg0);
				local352 = this.aClass287_5.method6625(arg0);
				if (local339) {
					local187 = this.aClass287_7.anInt8563 + ((this.aClass287_7.anInt8566 - this.aClass287_7.anInt8563) * local347 >> 8);
				} else {
					local187 = this.aClass287_7.anInt8563 + ((this.aClass287_7.anInt8566 - this.aClass287_7.anInt8563) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static51.anIntArray40[local200] = 0;
				}
			}
		}
		if (this.anInt1342 > 0 && this.anInt1341 > 0) {
			local182 = (int) ((double) this.anInt1342 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static51.anIntArray40[local187] += Static51.anIntArray40[local187 - local182] * this.anInt1341 / 100;
			}
		}
		if (this.aClass37_1.anIntArray34[0] > 0 || this.aClass37_1.anIntArray34[1] > 0) {
			this.aClass287_6.method6626();
			local182 = this.aClass287_6.method6625(arg0 + 1);
			local187 = this.aClass37_1.method1125(0, (float) local182 / 65536.0F);
			local195 = this.aClass37_1.method1125(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static51.anIntArray40[local200 + local187] * (long) Static45.anInt1308 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static51.anIntArray40[local200 + local187 - local519 - 1] * (long) Static45.anIntArrayArray4[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static51.anIntArray40[local200 - local549 - 1] * (long) Static45.anIntArrayArray4[1][local549] >> 16);
					}
					Static51.anIntArray40[local200] = local352;
					local182 = this.aClass287_6.method6625(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static51.anIntArray40[local200 + local187] * (long) Static45.anInt1308 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static51.anIntArray40[local200 + local187 - local519 - 1] * (long) Static45.anIntArrayArray4[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static51.anIntArray40[local200 - local549 - 1] * (long) Static45.anIntArrayArray4[1][local549] >> 16);
						}
						Static51.anIntArray40[local200] = local352;
						local182 = this.aClass287_6.method6625(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static51.anIntArray40[local200 + local187 - local519 - 1] * (long) Static45.anIntArrayArray4[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static51.anIntArray40[local200 - local549 - 1] * (long) Static45.anIntArrayArray4[1][local549] >> 16);
							}
							Static51.anIntArray40[local200] = local352;
							this.aClass287_6.method6625(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass37_1.method1125(0, (float) local182 / 65536.0F);
					local195 = this.aClass37_1.method1125(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static51.anIntArray40[local182] < -32768) {
				Static51.anIntArray40[local182] = -32768;
			}
			if (Static51.anIntArray40[local182] > 32767) {
				Static51.anIntArray40[local182] = 32767;
			}
		}
		return Static51.anIntArray40;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(III)I")
	private int method1173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray41[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray38[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
