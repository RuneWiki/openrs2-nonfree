import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class15 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "[I")
	public static int[] anIntArray62 = new int[32768];

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "[I")
	public static int[] anIntArray63;

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "Lclient!gb;")
	private Class26 aClass26_1;

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "Lclient!gb;")
	private Class26 aClass26_2;

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "Lclient!gb;")
	private Class26 aClass26_3;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "Lclient!na;")
	private Class53 aClass53_1;

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "Lclient!gb;")
	private Class26 aClass26_4;

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "Lclient!gb;")
	private Class26 aClass26_5;

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "Lclient!gb;")
	private Class26 aClass26_6;

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "Lclient!gb;")
	private Class26 aClass26_7;

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "Lclient!gb;")
	private Class26 aClass26_8;

	@OriginalMember(owner = "client!cf", name = "x", descriptor = "Lclient!gb;")
	private Class26 aClass26_9;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
	public int anInt555 = 500;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
	private int anInt556 = 0;

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "[I")
	private final int[] anIntArray64 = new int[5];

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "[I")
	private final int[] anIntArray65 = new int[5];

	@OriginalMember(owner = "client!cf", name = "t", descriptor = "[I")
	private final int[] anIntArray68 = new int[5];

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
	private int anInt554 = 100;

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
	public int anInt557 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray62[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray63 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray63[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!tf;)V")
	public void method313(@OriginalArg(0) Class4_Sub9 arg0) {
		this.aClass26_3 = new Class26();
		this.aClass26_3.method590(arg0);
		this.aClass26_1 = new Class26();
		this.aClass26_1.method590(arg0);
		@Pc(21) int local21 = arg0.method773();
		if (local21 != 0) {
			arg0.anInt1312--;
			this.aClass26_9 = new Class26();
			this.aClass26_9.method590(arg0);
			this.aClass26_4 = new Class26();
			this.aClass26_4.method590(arg0);
		}
		local21 = arg0.method773();
		if (local21 != 0) {
			arg0.anInt1312--;
			this.aClass26_7 = new Class26();
			this.aClass26_7.method590(arg0);
			this.aClass26_5 = new Class26();
			this.aClass26_5.method590(arg0);
		}
		local21 = arg0.method773();
		if (local21 != 0) {
			arg0.anInt1312--;
			this.aClass26_2 = new Class26();
			this.aClass26_2.method590(arg0);
			this.aClass26_6 = new Class26();
			this.aClass26_6.method590(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method770();
			if (local114 == 0) {
				break;
			}
			this.anIntArray68[local109] = local114;
			this.anIntArray65[local109] = arg0.method815();
			this.anIntArray64[local109] = arg0.method770();
		}
		this.anInt556 = arg0.method770();
		this.anInt554 = arg0.method770();
		this.anInt555 = arg0.method816();
		this.anInt557 = arg0.method816();
		this.aClass53_1 = new Class53();
		this.aClass26_8 = new Class26();
		this.aClass53_1.method1236(arg0, this.aClass26_8);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)[I")
	public int[] method314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static136.method699(Static17.anIntArray66, 0, arg0);
		if (arg1 < 10) {
			return Static17.anIntArray66;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass26_3.method588();
		this.aClass26_1.method588();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass26_9 != null) {
			this.aClass26_9.method588();
			this.aClass26_4.method588();
			local24 = (int) ((double) (this.aClass26_9.anInt1065 - this.aClass26_9.anInt1067) * 32.768D / local16);
			local26 = (int) ((double) this.aClass26_9.anInt1067 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass26_7 != null) {
			this.aClass26_7.method588();
			this.aClass26_5.method588();
			local63 = (int) ((double) (this.aClass26_7.anInt1065 - this.aClass26_7.anInt1067) * 32.768D / local16);
			local65 = (int) ((double) this.aClass26_7.anInt1067 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray68[local102] != 0) {
				Static17.anIntArray69[local102] = 0;
				Static17.anIntArray71[local102] = (int) ((double) this.anIntArray64[local102] * local16);
				Static17.anIntArray72[local102] = (this.anIntArray68[local102] << 14) / 100;
				Static17.anIntArray67[local102] = (int) ((double) (this.aClass26_3.anInt1065 - this.aClass26_3.anInt1067) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray65[local102]) / local16);
				Static17.anIntArray70[local102] = (int) ((double) this.aClass26_3.anInt1067 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass26_3.method589(arg0);
			local187 = this.aClass26_1.method589(arg0);
			if (this.aClass26_9 != null) {
				local195 = this.aClass26_9.method589(arg0);
				local200 = this.aClass26_4.method589(arg0);
				local182 += this.method316(local28, local200, this.aClass26_9.anInt1066) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass26_7 != null) {
				local195 = this.aClass26_7.method589(arg0);
				local200 = this.aClass26_5.method589(arg0);
				local187 = local187 * ((this.method316(local67, local200, this.aClass26_7.anInt1066) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray68[local195] != 0) {
					local200 = local176 + Static17.anIntArray71[local195];
					if (local200 < arg0) {
						Static17.anIntArray66[local200] += this.method316(Static17.anIntArray69[local195], local187 * Static17.anIntArray72[local195] >> 15, this.aClass26_3.anInt1066);
						Static17.anIntArray69[local195] += (local182 * Static17.anIntArray67[local195] >> 16) + Static17.anIntArray70[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass26_2 != null) {
			this.aClass26_2.method588();
			this.aClass26_6.method588();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass26_2.method589(arg0);
				local352 = this.aClass26_6.method589(arg0);
				if (local339) {
					local187 = this.aClass26_2.anInt1067 + ((this.aClass26_2.anInt1065 - this.aClass26_2.anInt1067) * local347 >> 8);
				} else {
					local187 = this.aClass26_2.anInt1067 + ((this.aClass26_2.anInt1065 - this.aClass26_2.anInt1067) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static17.anIntArray66[local200] = 0;
				}
			}
		}
		if (this.anInt556 > 0 && this.anInt554 > 0) {
			local182 = (int) ((double) this.anInt556 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static17.anIntArray66[local187] += Static17.anIntArray66[local187 - local182] * this.anInt554 / 100;
			}
		}
		if (this.aClass53_1.anIntArray208[0] > 0 || this.aClass53_1.anIntArray208[1] > 0) {
			this.aClass26_8.method588();
			local182 = this.aClass26_8.method589(arg0 + 1);
			local187 = this.aClass53_1.method1238(0, (float) local182 / 65536.0F);
			local195 = this.aClass53_1.method1238(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static17.anIntArray66[local200 + local187] * (long) Static73.anInt1828 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static17.anIntArray66[local200 + local187 - local519 - 1] * (long) Static73.anIntArrayArray50[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static17.anIntArray66[local200 - local549 - 1] * (long) Static73.anIntArrayArray50[1][local549] >> 16);
					}
					Static17.anIntArray66[local200] = local352;
					local182 = this.aClass26_8.method589(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static17.anIntArray66[local200 + local187] * (long) Static73.anInt1828 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static17.anIntArray66[local200 + local187 - local519 - 1] * (long) Static73.anIntArrayArray50[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static17.anIntArray66[local200 - local549 - 1] * (long) Static73.anIntArrayArray50[1][local549] >> 16);
						}
						Static17.anIntArray66[local200] = local352;
						local182 = this.aClass26_8.method589(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static17.anIntArray66[local200 + local187 - local519 - 1] * (long) Static73.anIntArrayArray50[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static17.anIntArray66[local200 - local549 - 1] * (long) Static73.anIntArrayArray50[1][local549] >> 16);
							}
							Static17.anIntArray66[local200] = local352;
							this.aClass26_8.method589(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass53_1.method1238(0, (float) local182 / 65536.0F);
					local195 = this.aClass53_1.method1238(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static17.anIntArray66[local182] < -32768) {
				Static17.anIntArray66[local182] = -32768;
			}
			if (Static17.anIntArray66[local182] > 32767) {
				Static17.anIntArray66[local182] = 32767;
			}
		}
		return Static17.anIntArray66;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)I")
	private int method316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray63[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray62[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
