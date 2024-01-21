import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class77 {

	@OriginalMember(owner = "client!p", name = "i", descriptor = "[I")
	private static final int[] anIntArray260 = new int[32768];

	@OriginalMember(owner = "client!p", name = "e", descriptor = "[I")
	private static final int[] anIntArray258;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "Lclient!wb;")
	private Class100 aClass100_1;

	@OriginalMember(owner = "client!p", name = "b", descriptor = "Lclient!wb;")
	private Class100 aClass100_2;

	@OriginalMember(owner = "client!p", name = "d", descriptor = "Lclient!wb;")
	private Class100 aClass100_3;

	@OriginalMember(owner = "client!p", name = "f", descriptor = "Lclient!wb;")
	private Class100 aClass100_4;

	@OriginalMember(owner = "client!p", name = "k", descriptor = "Lclient!wb;")
	private Class100 aClass100_5;

	@OriginalMember(owner = "client!p", name = "l", descriptor = "Lclient!wb;")
	private Class100 aClass100_6;

	@OriginalMember(owner = "client!p", name = "m", descriptor = "Lclient!wb;")
	private Class100 aClass100_7;

	@OriginalMember(owner = "client!p", name = "n", descriptor = "Lclient!wb;")
	private Class100 aClass100_8;

	@OriginalMember(owner = "client!p", name = "p", descriptor = "Lclient!mg;")
	private Class65 aClass65_1;

	@OriginalMember(owner = "client!p", name = "q", descriptor = "Lclient!wb;")
	private Class100 aClass100_9;

	@OriginalMember(owner = "client!p", name = "c", descriptor = "[I")
	private final int[] anIntArray257 = new int[5];

	@OriginalMember(owner = "client!p", name = "h", descriptor = "I")
	private int anInt3140 = 100;

	@OriginalMember(owner = "client!p", name = "j", descriptor = "[I")
	private final int[] anIntArray261 = new int[5];

	@OriginalMember(owner = "client!p", name = "o", descriptor = "I")
	public int anInt3141 = 0;

	@OriginalMember(owner = "client!p", name = "r", descriptor = "[I")
	private final int[] anIntArray262 = new int[5];

	@OriginalMember(owner = "client!p", name = "s", descriptor = "I")
	public int anInt3142 = 500;

	@OriginalMember(owner = "client!p", name = "t", descriptor = "I")
	private int anInt3143 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray260[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray258 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray258[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(III)I")
	private int method2436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray258[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray260[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)[I")
	public int[] method2438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static214.method347(Static141.anIntArray259, 0, arg0);
		if (arg1 < 10) {
			return Static141.anIntArray259;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass100_9.method3463();
		this.aClass100_3.method3463();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass100_4 != null) {
			this.aClass100_4.method3463();
			this.aClass100_5.method3463();
			local24 = (int) ((double) (this.aClass100_4.anInt4578 - this.aClass100_4.anInt4576) * 32.768D / local16);
			local26 = (int) ((double) this.aClass100_4.anInt4576 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass100_1 != null) {
			this.aClass100_1.method3463();
			this.aClass100_2.method3463();
			local63 = (int) ((double) (this.aClass100_1.anInt4578 - this.aClass100_1.anInt4576) * 32.768D / local16);
			local65 = (int) ((double) this.aClass100_1.anInt4576 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray257[local102] != 0) {
				Static141.anIntArray265[local102] = 0;
				Static141.anIntArray263[local102] = (int) ((double) this.anIntArray262[local102] * local16);
				Static141.anIntArray267[local102] = (this.anIntArray257[local102] << 14) / 100;
				Static141.anIntArray264[local102] = (int) ((double) (this.aClass100_9.anInt4578 - this.aClass100_9.anInt4576) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray261[local102]) / local16);
				Static141.anIntArray266[local102] = (int) ((double) this.aClass100_9.anInt4576 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass100_9.method3462(arg0);
			local187 = this.aClass100_3.method3462(arg0);
			if (this.aClass100_4 != null) {
				local195 = this.aClass100_4.method3462(arg0);
				local200 = this.aClass100_5.method3462(arg0);
				local182 += this.method2436(local28, local200, this.aClass100_4.anInt4577) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass100_1 != null) {
				local195 = this.aClass100_1.method3462(arg0);
				local200 = this.aClass100_2.method3462(arg0);
				local187 = local187 * ((this.method2436(local67, local200, this.aClass100_1.anInt4577) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray257[local195] != 0) {
					local200 = local176 + Static141.anIntArray263[local195];
					if (local200 < arg0) {
						Static141.anIntArray259[local200] += this.method2436(Static141.anIntArray265[local195], local187 * Static141.anIntArray267[local195] >> 15, this.aClass100_9.anInt4577);
						Static141.anIntArray265[local195] += (local182 * Static141.anIntArray264[local195] >> 16) + Static141.anIntArray266[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass100_7 != null) {
			this.aClass100_7.method3463();
			this.aClass100_8.method3463();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass100_7.method3462(arg0);
				local352 = this.aClass100_8.method3462(arg0);
				if (local339) {
					local187 = this.aClass100_7.anInt4576 + ((this.aClass100_7.anInt4578 - this.aClass100_7.anInt4576) * local347 >> 8);
				} else {
					local187 = this.aClass100_7.anInt4576 + ((this.aClass100_7.anInt4578 - this.aClass100_7.anInt4576) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static141.anIntArray259[local200] = 0;
				}
			}
		}
		if (this.anInt3143 > 0 && this.anInt3140 > 0) {
			local182 = (int) ((double) this.anInt3143 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static141.anIntArray259[local187] += Static141.anIntArray259[local187 - local182] * this.anInt3140 / 100;
			}
		}
		if (this.aClass65_1.anIntArray215[0] > 0 || this.aClass65_1.anIntArray215[1] > 0) {
			this.aClass100_6.method3463();
			local182 = this.aClass100_6.method3462(arg0 + 1);
			local187 = this.aClass65_1.method2078(0, (float) local182 / 65536.0F);
			local195 = this.aClass65_1.method2078(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static141.anIntArray259[local200 + local187] * (long) Static124.anInt2722 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static141.anIntArray259[local200 + local187 - local519 - 1] * (long) Static124.anIntArrayArray19[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static141.anIntArray259[local200 - local549 - 1] * (long) Static124.anIntArrayArray19[1][local549] >> 16);
					}
					Static141.anIntArray259[local200] = local352;
					local182 = this.aClass100_6.method3462(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static141.anIntArray259[local200 + local187] * (long) Static124.anInt2722 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static141.anIntArray259[local200 + local187 - local519 - 1] * (long) Static124.anIntArrayArray19[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static141.anIntArray259[local200 - local549 - 1] * (long) Static124.anIntArrayArray19[1][local549] >> 16);
						}
						Static141.anIntArray259[local200] = local352;
						local182 = this.aClass100_6.method3462(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static141.anIntArray259[local200 + local187 - local519 - 1] * (long) Static124.anIntArrayArray19[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static141.anIntArray259[local200 - local549 - 1] * (long) Static124.anIntArrayArray19[1][local549] >> 16);
							}
							Static141.anIntArray259[local200] = local352;
							this.aClass100_6.method3462(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass65_1.method2078(0, (float) local182 / 65536.0F);
					local195 = this.aClass65_1.method2078(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static141.anIntArray259[local182] < -32768) {
				Static141.anIntArray259[local182] = -32768;
			}
			if (Static141.anIntArray259[local182] > 32767) {
				Static141.anIntArray259[local182] = 32767;
			}
		}
		return Static141.anIntArray259;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!fj;)V")
	public void method2439(@OriginalArg(0) Class1_Sub7 arg0) {
		this.aClass100_9 = new Class100();
		this.aClass100_9.method3461(arg0);
		this.aClass100_3 = new Class100();
		this.aClass100_3.method3461(arg0);
		@Pc(21) int local21 = arg0.method2771();
		if (local21 != 0) {
			arg0.anInt3592--;
			this.aClass100_4 = new Class100();
			this.aClass100_4.method3461(arg0);
			this.aClass100_5 = new Class100();
			this.aClass100_5.method3461(arg0);
		}
		local21 = arg0.method2771();
		if (local21 != 0) {
			arg0.anInt3592--;
			this.aClass100_1 = new Class100();
			this.aClass100_1.method3461(arg0);
			this.aClass100_2 = new Class100();
			this.aClass100_2.method3461(arg0);
		}
		local21 = arg0.method2771();
		if (local21 != 0) {
			arg0.anInt3592--;
			this.aClass100_7 = new Class100();
			this.aClass100_7.method3461(arg0);
			this.aClass100_8 = new Class100();
			this.aClass100_8.method3461(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method2795();
			if (local114 == 0) {
				break;
			}
			this.anIntArray257[local109] = local114;
			this.anIntArray261[local109] = arg0.method2759();
			this.anIntArray262[local109] = arg0.method2795();
		}
		this.anInt3143 = arg0.method2795();
		this.anInt3140 = arg0.method2795();
		this.anInt3142 = arg0.method2765();
		this.anInt3141 = arg0.method2765();
		this.aClass65_1 = new Class65();
		this.aClass100_6 = new Class100();
		this.aClass65_1.method2081(arg0, this.aClass100_6);
	}
}
