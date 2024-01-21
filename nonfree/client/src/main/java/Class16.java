import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class16 {

	@OriginalMember(owner = "client!db", name = "q", descriptor = "[I")
	public static int[] anIntArray54 = new int[32768];

	@OriginalMember(owner = "client!db", name = "g", descriptor = "[I")
	public static int[] anIntArray51;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "Lclient!k;")
	private Class36 aClass36_1;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "Lclient!hf;")
	private Class29 aClass29_1;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "Lclient!k;")
	private Class36 aClass36_2;

	@OriginalMember(owner = "client!db", name = "f", descriptor = "Lclient!k;")
	private Class36 aClass36_3;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "Lclient!k;")
	private Class36 aClass36_4;

	@OriginalMember(owner = "client!db", name = "k", descriptor = "Lclient!k;")
	private Class36 aClass36_5;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "Lclient!k;")
	private Class36 aClass36_6;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "Lclient!k;")
	private Class36 aClass36_7;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "Lclient!k;")
	private Class36 aClass36_8;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "Lclient!k;")
	private Class36 aClass36_9;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "[I")
	private final int[] anIntArray49 = new int[5];

	@OriginalMember(owner = "client!db", name = "c", descriptor = "[I")
	private final int[] anIntArray50 = new int[5];

	@OriginalMember(owner = "client!db", name = "j", descriptor = "I")
	public int anInt544 = 0;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "I")
	private int anInt545 = 100;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "[I")
	private final int[] anIntArray53 = new int[5];

	@OriginalMember(owner = "client!db", name = "t", descriptor = "I")
	private int anInt546 = 0;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "I")
	public int anInt547 = 500;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray54[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray51 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray51[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!jd;)V")
	public void method377(@OriginalArg(0) Class4_Sub11 arg0) {
		this.aClass36_1 = new Class36();
		this.aClass36_1.method1041(arg0);
		this.aClass36_5 = new Class36();
		this.aClass36_5.method1041(arg0);
		@Pc(21) int local21 = arg0.method719();
		if (local21 != 0) {
			arg0.anInt1099--;
			this.aClass36_3 = new Class36();
			this.aClass36_3.method1041(arg0);
			this.aClass36_4 = new Class36();
			this.aClass36_4.method1041(arg0);
		}
		local21 = arg0.method719();
		if (local21 != 0) {
			arg0.anInt1099--;
			this.aClass36_2 = new Class36();
			this.aClass36_2.method1041(arg0);
			this.aClass36_9 = new Class36();
			this.aClass36_9.method1041(arg0);
		}
		local21 = arg0.method719();
		if (local21 != 0) {
			arg0.anInt1099--;
			this.aClass36_8 = new Class36();
			this.aClass36_8.method1041(arg0);
			this.aClass36_7 = new Class36();
			this.aClass36_7.method1041(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method692();
			if (local114 == 0) {
				break;
			}
			this.anIntArray49[local109] = local114;
			this.anIntArray53[local109] = arg0.method703();
			this.anIntArray50[local109] = arg0.method692();
		}
		this.anInt546 = arg0.method692();
		this.anInt545 = arg0.method692();
		this.anInt547 = arg0.method718();
		this.anInt544 = arg0.method718();
		this.aClass29_1 = new Class29();
		this.aClass36_6 = new Class36();
		this.aClass29_1.method893(arg0, this.aClass36_6);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)[I")
	public int[] method378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static139.method953(Static20.anIntArray52, 0, arg0);
		if (arg1 < 10) {
			return Static20.anIntArray52;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass36_1.method1042();
		this.aClass36_5.method1042();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass36_3 != null) {
			this.aClass36_3.method1042();
			this.aClass36_4.method1042();
			local24 = (int) ((double) (this.aClass36_3.anInt1537 - this.aClass36_3.anInt1539) * 32.768D / local16);
			local26 = (int) ((double) this.aClass36_3.anInt1539 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass36_2 != null) {
			this.aClass36_2.method1042();
			this.aClass36_9.method1042();
			local63 = (int) ((double) (this.aClass36_2.anInt1537 - this.aClass36_2.anInt1539) * 32.768D / local16);
			local65 = (int) ((double) this.aClass36_2.anInt1539 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray49[local102] != 0) {
				Static20.anIntArray57[local102] = 0;
				Static20.anIntArray56[local102] = (int) ((double) this.anIntArray50[local102] * local16);
				Static20.anIntArray55[local102] = (this.anIntArray49[local102] << 14) / 100;
				Static20.anIntArray59[local102] = (int) ((double) (this.aClass36_1.anInt1537 - this.aClass36_1.anInt1539) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray53[local102]) / local16);
				Static20.anIntArray58[local102] = (int) ((double) this.aClass36_1.anInt1539 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass36_1.method1040(arg0);
			local187 = this.aClass36_5.method1040(arg0);
			if (this.aClass36_3 != null) {
				local195 = this.aClass36_3.method1040(arg0);
				local200 = this.aClass36_4.method1040(arg0);
				local182 += this.method380(local28, local200, this.aClass36_3.anInt1540) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass36_2 != null) {
				local195 = this.aClass36_2.method1040(arg0);
				local200 = this.aClass36_9.method1040(arg0);
				local187 = local187 * ((this.method380(local67, local200, this.aClass36_2.anInt1540) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray49[local195] != 0) {
					local200 = local176 + Static20.anIntArray56[local195];
					if (local200 < arg0) {
						Static20.anIntArray52[local200] += this.method380(Static20.anIntArray57[local195], local187 * Static20.anIntArray55[local195] >> 15, this.aClass36_1.anInt1540);
						Static20.anIntArray57[local195] += (local182 * Static20.anIntArray59[local195] >> 16) + Static20.anIntArray58[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass36_8 != null) {
			this.aClass36_8.method1042();
			this.aClass36_7.method1042();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass36_8.method1040(arg0);
				local352 = this.aClass36_7.method1040(arg0);
				if (local339) {
					local187 = this.aClass36_8.anInt1539 + ((this.aClass36_8.anInt1537 - this.aClass36_8.anInt1539) * local347 >> 8);
				} else {
					local187 = this.aClass36_8.anInt1539 + ((this.aClass36_8.anInt1537 - this.aClass36_8.anInt1539) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static20.anIntArray52[local200] = 0;
				}
			}
		}
		if (this.anInt546 > 0 && this.anInt545 > 0) {
			local182 = (int) ((double) this.anInt546 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static20.anIntArray52[local187] += Static20.anIntArray52[local187 - local182] * this.anInt545 / 100;
			}
		}
		if (this.aClass29_1.anIntArray138[0] > 0 || this.aClass29_1.anIntArray138[1] > 0) {
			this.aClass36_6.method1042();
			local182 = this.aClass36_6.method1040(arg0 + 1);
			local187 = this.aClass29_1.method895(0, (float) local182 / 65536.0F);
			local195 = this.aClass29_1.method895(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static20.anIntArray52[local200 + local187] * (long) Static47.anInt1295 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static20.anIntArray52[local200 + local187 - local519 - 1] * (long) Static47.anIntArrayArray12[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static20.anIntArray52[local200 - local549 - 1] * (long) Static47.anIntArrayArray12[1][local549] >> 16);
					}
					Static20.anIntArray52[local200] = local352;
					local182 = this.aClass36_6.method1040(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static20.anIntArray52[local200 + local187] * (long) Static47.anInt1295 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static20.anIntArray52[local200 + local187 - local519 - 1] * (long) Static47.anIntArrayArray12[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static20.anIntArray52[local200 - local549 - 1] * (long) Static47.anIntArrayArray12[1][local549] >> 16);
						}
						Static20.anIntArray52[local200] = local352;
						local182 = this.aClass36_6.method1040(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static20.anIntArray52[local200 + local187 - local519 - 1] * (long) Static47.anIntArrayArray12[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static20.anIntArray52[local200 - local549 - 1] * (long) Static47.anIntArrayArray12[1][local549] >> 16);
							}
							Static20.anIntArray52[local200] = local352;
							this.aClass36_6.method1040(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass29_1.method895(0, (float) local182 / 65536.0F);
					local195 = this.aClass29_1.method895(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static20.anIntArray52[local182] < -32768) {
				Static20.anIntArray52[local182] = -32768;
			}
			if (Static20.anIntArray52[local182] > 32767) {
				Static20.anIntArray52[local182] = 32767;
			}
		}
		return Static20.anIntArray52;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III)I")
	private int method380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray51[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray54[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
