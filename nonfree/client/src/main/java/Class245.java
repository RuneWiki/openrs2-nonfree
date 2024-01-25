import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class245 {

	@OriginalMember(owner = "client!up", name = "d", descriptor = "[I")
	private static final int[] anIntArray567 = new int[32768];

	@OriginalMember(owner = "client!up", name = "k", descriptor = "[I")
	private static final int[] anIntArray569;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "Lclient!bs;")
	private Class31 aClass31_1;

	@OriginalMember(owner = "client!up", name = "c", descriptor = "Lclient!bs;")
	private Class31 aClass31_2;

	@OriginalMember(owner = "client!up", name = "f", descriptor = "Lclient!bs;")
	private Class31 aClass31_3;

	@OriginalMember(owner = "client!up", name = "g", descriptor = "Lclient!bs;")
	private Class31 aClass31_4;

	@OriginalMember(owner = "client!up", name = "i", descriptor = "Lclient!bs;")
	private Class31 aClass31_5;

	@OriginalMember(owner = "client!up", name = "j", descriptor = "Lclient!bs;")
	private Class31 aClass31_6;

	@OriginalMember(owner = "client!up", name = "n", descriptor = "Lclient!bs;")
	private Class31 aClass31_7;

	@OriginalMember(owner = "client!up", name = "o", descriptor = "Lclient!bs;")
	private Class31 aClass31_8;

	@OriginalMember(owner = "client!up", name = "q", descriptor = "Lclient!bs;")
	private Class31 aClass31_9;

	@OriginalMember(owner = "client!up", name = "x", descriptor = "Lclient!pr;")
	private Class197 aClass197_1;

	@OriginalMember(owner = "client!up", name = "b", descriptor = "[I")
	private final int[] anIntArray566 = new int[5];

	@OriginalMember(owner = "client!up", name = "e", descriptor = "I")
	public int anInt6756 = 500;

	@OriginalMember(owner = "client!up", name = "h", descriptor = "[I")
	private final int[] anIntArray568 = new int[5];

	@OriginalMember(owner = "client!up", name = "m", descriptor = "I")
	public int anInt6758 = 0;

	@OriginalMember(owner = "client!up", name = "r", descriptor = "I")
	private int anInt6759 = 100;

	@OriginalMember(owner = "client!up", name = "l", descriptor = "I")
	private int anInt6757 = 0;

	@OriginalMember(owner = "client!up", name = "w", descriptor = "[I")
	private final int[] anIntArray575 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray567[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray569 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray569[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!si;)V")
	public void method5338(@OriginalArg(0) Class2_Sub23 arg0) {
		this.aClass31_8 = new Class31();
		this.aClass31_8.method576(arg0);
		this.aClass31_7 = new Class31();
		this.aClass31_7.method576(arg0);
		@Pc(21) int local21 = arg0.method5495();
		if (local21 != 0) {
			arg0.anInt6952--;
			this.aClass31_9 = new Class31();
			this.aClass31_9.method576(arg0);
			this.aClass31_6 = new Class31();
			this.aClass31_6.method576(arg0);
		}
		local21 = arg0.method5495();
		if (local21 != 0) {
			arg0.anInt6952--;
			this.aClass31_2 = new Class31();
			this.aClass31_2.method576(arg0);
			this.aClass31_1 = new Class31();
			this.aClass31_1.method576(arg0);
		}
		local21 = arg0.method5495();
		if (local21 != 0) {
			arg0.anInt6952--;
			this.aClass31_3 = new Class31();
			this.aClass31_3.method576(arg0);
			this.aClass31_5 = new Class31();
			this.aClass31_5.method576(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method5479();
			if (local114 == 0) {
				break;
			}
			this.anIntArray568[local109] = local114;
			this.anIntArray575[local109] = arg0.method5501();
			this.anIntArray566[local109] = arg0.method5479();
		}
		this.anInt6757 = arg0.method5479();
		this.anInt6759 = arg0.method5479();
		this.anInt6756 = arg0.method5500();
		this.anInt6758 = arg0.method5500();
		this.aClass197_1 = new Class197();
		this.aClass31_4 = new Class31();
		this.aClass197_1.method4378(arg0, this.aClass31_4);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(III)I")
	private int method5339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray569[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray567[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(II)[I")
	public int[] method5340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static457.method687(Static406.anIntArray570, 0, arg0);
		if (arg1 < 10) {
			return Static406.anIntArray570;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass31_8.method579();
		this.aClass31_7.method579();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass31_9 != null) {
			this.aClass31_9.method579();
			this.aClass31_6.method579();
			local24 = (int) ((double) (this.aClass31_9.anInt669 - this.aClass31_9.anInt670) * 32.768D / local16);
			local26 = (int) ((double) this.aClass31_9.anInt670 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass31_2 != null) {
			this.aClass31_2.method579();
			this.aClass31_1.method579();
			local63 = (int) ((double) (this.aClass31_2.anInt669 - this.aClass31_2.anInt670) * 32.768D / local16);
			local65 = (int) ((double) this.aClass31_2.anInt670 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray568[local102] != 0) {
				Static406.anIntArray573[local102] = 0;
				Static406.anIntArray571[local102] = (int) ((double) this.anIntArray566[local102] * local16);
				Static406.anIntArray576[local102] = (this.anIntArray568[local102] << 14) / 100;
				Static406.anIntArray574[local102] = (int) ((double) (this.aClass31_8.anInt669 - this.aClass31_8.anInt670) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray575[local102]) / local16);
				Static406.anIntArray572[local102] = (int) ((double) this.aClass31_8.anInt670 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass31_8.method577(arg0);
			local187 = this.aClass31_7.method577(arg0);
			if (this.aClass31_9 != null) {
				local195 = this.aClass31_9.method577(arg0);
				local200 = this.aClass31_6.method577(arg0);
				local182 += this.method5339(local28, local200, this.aClass31_9.anInt668) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass31_2 != null) {
				local195 = this.aClass31_2.method577(arg0);
				local200 = this.aClass31_1.method577(arg0);
				local187 = local187 * ((this.method5339(local67, local200, this.aClass31_2.anInt668) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray568[local195] != 0) {
					local200 = local176 + Static406.anIntArray571[local195];
					if (local200 < arg0) {
						Static406.anIntArray570[local200] += this.method5339(Static406.anIntArray573[local195], local187 * Static406.anIntArray576[local195] >> 15, this.aClass31_8.anInt668);
						Static406.anIntArray573[local195] += (local182 * Static406.anIntArray574[local195] >> 16) + Static406.anIntArray572[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass31_3 != null) {
			this.aClass31_3.method579();
			this.aClass31_5.method579();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass31_3.method577(arg0);
				local352 = this.aClass31_5.method577(arg0);
				if (local339) {
					local187 = this.aClass31_3.anInt670 + ((this.aClass31_3.anInt669 - this.aClass31_3.anInt670) * local347 >> 8);
				} else {
					local187 = this.aClass31_3.anInt670 + ((this.aClass31_3.anInt669 - this.aClass31_3.anInt670) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static406.anIntArray570[local200] = 0;
				}
			}
		}
		if (this.anInt6757 > 0 && this.anInt6759 > 0) {
			local182 = (int) ((double) this.anInt6757 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static406.anIntArray570[local187] += Static406.anIntArray570[local187 - local182] * this.anInt6759 / 100;
			}
		}
		if (this.aClass197_1.anIntArray446[0] > 0 || this.aClass197_1.anIntArray446[1] > 0) {
			this.aClass31_4.method579();
			local182 = this.aClass31_4.method577(arg0 + 1);
			local187 = this.aClass197_1.method4381(0, (float) local182 / 65536.0F);
			local195 = this.aClass197_1.method4381(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static406.anIntArray570[local200 + local187] * (long) Static310.anInt5486 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static406.anIntArray570[local200 + local187 - local519 - 1] * (long) Static310.anIntArrayArray54[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static406.anIntArray570[local200 - local549 - 1] * (long) Static310.anIntArrayArray54[1][local549] >> 16);
					}
					Static406.anIntArray570[local200] = local352;
					local182 = this.aClass31_4.method577(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static406.anIntArray570[local200 + local187] * (long) Static310.anInt5486 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static406.anIntArray570[local200 + local187 - local519 - 1] * (long) Static310.anIntArrayArray54[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static406.anIntArray570[local200 - local549 - 1] * (long) Static310.anIntArrayArray54[1][local549] >> 16);
						}
						Static406.anIntArray570[local200] = local352;
						local182 = this.aClass31_4.method577(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static406.anIntArray570[local200 + local187 - local519 - 1] * (long) Static310.anIntArrayArray54[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static406.anIntArray570[local200 - local549 - 1] * (long) Static310.anIntArrayArray54[1][local549] >> 16);
							}
							Static406.anIntArray570[local200] = local352;
							this.aClass31_4.method577(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass197_1.method4381(0, (float) local182 / 65536.0F);
					local195 = this.aClass197_1.method4381(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static406.anIntArray570[local182] < -32768) {
				Static406.anIntArray570[local182] = -32768;
			}
			if (Static406.anIntArray570[local182] > 32767) {
				Static406.anIntArray570[local182] = 32767;
			}
		}
		return Static406.anIntArray570;
	}
}
