import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class115 {

	@OriginalMember(owner = "client!la", name = "i", descriptor = "[I")
	private static final int[] anIntArray319 = new int[32768];

	@OriginalMember(owner = "client!la", name = "f", descriptor = "[I")
	private static final int[] anIntArray318;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "Lclient!fq;")
	private Class77 aClass77_1;

	@OriginalMember(owner = "client!la", name = "d", descriptor = "Lclient!df;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!la", name = "e", descriptor = "Lclient!df;")
	private Class47 aClass47_2;

	@OriginalMember(owner = "client!la", name = "h", descriptor = "Lclient!df;")
	private Class47 aClass47_3;

	@OriginalMember(owner = "client!la", name = "j", descriptor = "Lclient!df;")
	private Class47 aClass47_4;

	@OriginalMember(owner = "client!la", name = "k", descriptor = "Lclient!df;")
	private Class47 aClass47_5;

	@OriginalMember(owner = "client!la", name = "u", descriptor = "Lclient!df;")
	private Class47 aClass47_6;

	@OriginalMember(owner = "client!la", name = "v", descriptor = "Lclient!df;")
	private Class47 aClass47_7;

	@OriginalMember(owner = "client!la", name = "w", descriptor = "Lclient!df;")
	private Class47 aClass47_8;

	@OriginalMember(owner = "client!la", name = "y", descriptor = "Lclient!df;")
	private Class47 aClass47_9;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "[I")
	private final int[] anIntArray317 = new int[5];

	@OriginalMember(owner = "client!la", name = "o", descriptor = "[I")
	private final int[] anIntArray322 = new int[5];

	@OriginalMember(owner = "client!la", name = "g", descriptor = "I")
	public int anInt3734 = 500;

	@OriginalMember(owner = "client!la", name = "c", descriptor = "I")
	private int anInt3733 = 0;

	@OriginalMember(owner = "client!la", name = "m", descriptor = "I")
	private int anInt3735 = 100;

	@OriginalMember(owner = "client!la", name = "s", descriptor = "[I")
	private final int[] anIntArray326 = new int[5];

	@OriginalMember(owner = "client!la", name = "x", descriptor = "I")
	public int anInt3736 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray319[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray318 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray318[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!tq;)V")
	public void method3169(@OriginalArg(0) Class4_Sub7 arg0) {
		this.aClass47_6 = new Class47();
		this.aClass47_6.method1005(arg0);
		this.aClass47_9 = new Class47();
		this.aClass47_9.method1005(arg0);
		@Pc(21) int local21 = arg0.method2380();
		if (local21 != 0) {
			arg0.anInt2667--;
			this.aClass47_2 = new Class47();
			this.aClass47_2.method1005(arg0);
			this.aClass47_5 = new Class47();
			this.aClass47_5.method1005(arg0);
		}
		local21 = arg0.method2380();
		if (local21 != 0) {
			arg0.anInt2667--;
			this.aClass47_3 = new Class47();
			this.aClass47_3.method1005(arg0);
			this.aClass47_1 = new Class47();
			this.aClass47_1.method1005(arg0);
		}
		local21 = arg0.method2380();
		if (local21 != 0) {
			arg0.anInt2667--;
			this.aClass47_7 = new Class47();
			this.aClass47_7.method1005(arg0);
			this.aClass47_4 = new Class47();
			this.aClass47_4.method1005(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method2413();
			if (local114 == 0) {
				break;
			}
			this.anIntArray322[local109] = local114;
			this.anIntArray317[local109] = arg0.method2370();
			this.anIntArray326[local109] = arg0.method2413();
		}
		this.anInt3733 = arg0.method2413();
		this.anInt3735 = arg0.method2413();
		this.anInt3734 = arg0.method2404();
		this.anInt3736 = arg0.method2404();
		this.aClass77_1 = new Class77();
		this.aClass47_8 = new Class47();
		this.aClass77_1.method1677(arg0, this.aClass47_8);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)I")
	private int method3170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray318[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray319[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)[I")
	public int[] method3172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static363.method4757(Static168.anIntArray320, 0, arg0);
		if (arg1 < 10) {
			return Static168.anIntArray320;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass47_6.method1004();
		this.aClass47_9.method1004();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass47_2 != null) {
			this.aClass47_2.method1004();
			this.aClass47_5.method1004();
			local24 = (int) ((double) (this.aClass47_2.anInt1208 - this.aClass47_2.anInt1206) * 32.768D / local16);
			local26 = (int) ((double) this.aClass47_2.anInt1206 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass47_3 != null) {
			this.aClass47_3.method1004();
			this.aClass47_1.method1004();
			local63 = (int) ((double) (this.aClass47_3.anInt1208 - this.aClass47_3.anInt1206) * 32.768D / local16);
			local65 = (int) ((double) this.aClass47_3.anInt1206 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray322[local102] != 0) {
				Static168.anIntArray324[local102] = 0;
				Static168.anIntArray325[local102] = (int) ((double) this.anIntArray326[local102] * local16);
				Static168.anIntArray323[local102] = (this.anIntArray322[local102] << 14) / 100;
				Static168.anIntArray327[local102] = (int) ((double) (this.aClass47_6.anInt1208 - this.aClass47_6.anInt1206) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray317[local102]) / local16);
				Static168.anIntArray321[local102] = (int) ((double) this.aClass47_6.anInt1206 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass47_6.method1007(arg0);
			local187 = this.aClass47_9.method1007(arg0);
			if (this.aClass47_2 != null) {
				local195 = this.aClass47_2.method1007(arg0);
				local200 = this.aClass47_5.method1007(arg0);
				local182 += this.method3170(local28, local200, this.aClass47_2.anInt1205) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass47_3 != null) {
				local195 = this.aClass47_3.method1007(arg0);
				local200 = this.aClass47_1.method1007(arg0);
				local187 = local187 * ((this.method3170(local67, local200, this.aClass47_3.anInt1205) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray322[local195] != 0) {
					local200 = local176 + Static168.anIntArray325[local195];
					if (local200 < arg0) {
						Static168.anIntArray320[local200] += this.method3170(Static168.anIntArray324[local195], local187 * Static168.anIntArray323[local195] >> 15, this.aClass47_6.anInt1205);
						Static168.anIntArray324[local195] += (local182 * Static168.anIntArray327[local195] >> 16) + Static168.anIntArray321[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass47_7 != null) {
			this.aClass47_7.method1004();
			this.aClass47_4.method1004();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass47_7.method1007(arg0);
				local352 = this.aClass47_4.method1007(arg0);
				if (local339) {
					local187 = this.aClass47_7.anInt1206 + ((this.aClass47_7.anInt1208 - this.aClass47_7.anInt1206) * local347 >> 8);
				} else {
					local187 = this.aClass47_7.anInt1206 + ((this.aClass47_7.anInt1208 - this.aClass47_7.anInt1206) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static168.anIntArray320[local200] = 0;
				}
			}
		}
		if (this.anInt3733 > 0 && this.anInt3735 > 0) {
			local182 = (int) ((double) this.anInt3733 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static168.anIntArray320[local187] += Static168.anIntArray320[local187 - local182] * this.anInt3735 / 100;
			}
		}
		if (this.aClass77_1.anIntArray204[0] > 0 || this.aClass77_1.anIntArray204[1] > 0) {
			this.aClass47_8.method1004();
			local182 = this.aClass47_8.method1007(arg0 + 1);
			local187 = this.aClass77_1.method1679(0, (float) local182 / 65536.0F);
			local195 = this.aClass77_1.method1679(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static168.anIntArray320[local200 + local187] * (long) Static95.anInt2096 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static168.anIntArray320[local200 + local187 - local519 - 1] * (long) Static95.anIntArrayArray24[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static168.anIntArray320[local200 - local549 - 1] * (long) Static95.anIntArrayArray24[1][local549] >> 16);
					}
					Static168.anIntArray320[local200] = local352;
					local182 = this.aClass47_8.method1007(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static168.anIntArray320[local200 + local187] * (long) Static95.anInt2096 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static168.anIntArray320[local200 + local187 - local519 - 1] * (long) Static95.anIntArrayArray24[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static168.anIntArray320[local200 - local549 - 1] * (long) Static95.anIntArrayArray24[1][local549] >> 16);
						}
						Static168.anIntArray320[local200] = local352;
						local182 = this.aClass47_8.method1007(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static168.anIntArray320[local200 + local187 - local519 - 1] * (long) Static95.anIntArrayArray24[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static168.anIntArray320[local200 - local549 - 1] * (long) Static95.anIntArrayArray24[1][local549] >> 16);
							}
							Static168.anIntArray320[local200] = local352;
							this.aClass47_8.method1007(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass77_1.method1679(0, (float) local182 / 65536.0F);
					local195 = this.aClass77_1.method1679(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static168.anIntArray320[local182] < -32768) {
				Static168.anIntArray320[local182] = -32768;
			}
			if (Static168.anIntArray320[local182] > 32767) {
				Static168.anIntArray320[local182] = 32767;
			}
		}
		return Static168.anIntArray320;
	}
}
