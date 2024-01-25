import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class67 {

	@OriginalMember(owner = "client!dp", name = "t", descriptor = "[I")
	private static final int[] anIntArray109 = new int[32768];

	@OriginalMember(owner = "client!dp", name = "s", descriptor = "[I")
	private static final int[] anIntArray108;

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "Lclient!ud;")
	private Class328 aClass328_1;

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "Lclient!ud;")
	private Class328 aClass328_2;

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "Lclient!ud;")
	private Class328 aClass328_3;

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "Lclient!ud;")
	private Class328 aClass328_4;

	@OriginalMember(owner = "client!dp", name = "h", descriptor = "Lclient!ud;")
	private Class328 aClass328_5;

	@OriginalMember(owner = "client!dp", name = "j", descriptor = "Lclient!ud;")
	private Class328 aClass328_6;

	@OriginalMember(owner = "client!dp", name = "k", descriptor = "Lclient!ud;")
	private Class328 aClass328_7;

	@OriginalMember(owner = "client!dp", name = "n", descriptor = "Lclient!ud;")
	private Class328 aClass328_8;

	@OriginalMember(owner = "client!dp", name = "q", descriptor = "Lclient!uia;")
	private Class338 aClass338_1;

	@OriginalMember(owner = "client!dp", name = "r", descriptor = "Lclient!ud;")
	private Class328 aClass328_9;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "[I")
	private final int[] anIntArray104 = new int[5];

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "[I")
	private final int[] anIntArray105 = new int[5];

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
	private int anInt2602 = 100;

	@OriginalMember(owner = "client!dp", name = "l", descriptor = "[I")
	private final int[] anIntArray107 = new int[5];

	@OriginalMember(owner = "client!dp", name = "p", descriptor = "I")
	public int anInt2605 = 0;

	@OriginalMember(owner = "client!dp", name = "o", descriptor = "I")
	public int anInt2604 = 500;

	@OriginalMember(owner = "client!dp", name = "m", descriptor = "I")
	private int anInt2603 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray109[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray108 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray108[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!tn;)V")
	public void method2545(@OriginalArg(0) Class3_Sub15 arg0) {
		this.aClass328_3 = new Class328();
		this.aClass328_3.method7967(arg0);
		this.aClass328_7 = new Class328();
		this.aClass328_7.method7967(arg0);
		@Pc(21) int local21 = arg0.method8401();
		if (local21 != 0) {
			arg0.anInt10282--;
			this.aClass328_4 = new Class328();
			this.aClass328_4.method7967(arg0);
			this.aClass328_2 = new Class328();
			this.aClass328_2.method7967(arg0);
		}
		local21 = arg0.method8401();
		if (local21 != 0) {
			arg0.anInt10282--;
			this.aClass328_1 = new Class328();
			this.aClass328_1.method7967(arg0);
			this.aClass328_8 = new Class328();
			this.aClass328_8.method7967(arg0);
		}
		local21 = arg0.method8401();
		if (local21 != 0) {
			arg0.anInt10282--;
			this.aClass328_9 = new Class328();
			this.aClass328_9.method7967(arg0);
			this.aClass328_6 = new Class328();
			this.aClass328_6.method7967(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method8465();
			if (local114 == 0) {
				break;
			}
			this.anIntArray105[local109] = local114;
			this.anIntArray107[local109] = arg0.method8435();
			this.anIntArray104[local109] = arg0.method8465();
		}
		this.anInt2603 = arg0.method8465();
		this.anInt2602 = arg0.method8465();
		this.anInt2604 = arg0.method8414();
		this.anInt2605 = arg0.method8414();
		this.aClass338_1 = new Class338();
		this.aClass328_5 = new Class328();
		this.aClass338_1.method8015(arg0, this.aClass328_5);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(III)I")
	private int method2546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray108[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray109[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)[I")
	public int[] method2548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static655.method6403(Static101.anIntArray106, 0, arg0);
		if (arg1 < 10) {
			return Static101.anIntArray106;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass328_3.method7965();
		this.aClass328_7.method7965();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass328_4 != null) {
			this.aClass328_4.method7965();
			this.aClass328_2.method7965();
			local24 = (int) ((double) (this.aClass328_4.anInt9623 - this.aClass328_4.anInt9621) * 32.768D / local16);
			local26 = (int) ((double) this.aClass328_4.anInt9621 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass328_1 != null) {
			this.aClass328_1.method7965();
			this.aClass328_8.method7965();
			local63 = (int) ((double) (this.aClass328_1.anInt9623 - this.aClass328_1.anInt9621) * 32.768D / local16);
			local65 = (int) ((double) this.aClass328_1.anInt9621 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray105[local102] != 0) {
				Static101.anIntArray110[local102] = 0;
				Static101.anIntArray112[local102] = (int) ((double) this.anIntArray104[local102] * local16);
				Static101.anIntArray113[local102] = (this.anIntArray105[local102] << 14) / 100;
				Static101.anIntArray114[local102] = (int) ((double) (this.aClass328_3.anInt9623 - this.aClass328_3.anInt9621) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray107[local102]) / local16);
				Static101.anIntArray111[local102] = (int) ((double) this.aClass328_3.anInt9621 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass328_3.method7968(arg0);
			local187 = this.aClass328_7.method7968(arg0);
			if (this.aClass328_4 != null) {
				local195 = this.aClass328_4.method7968(arg0);
				local200 = this.aClass328_2.method7968(arg0);
				local182 += this.method2546(local28, local200, this.aClass328_4.anInt9624) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass328_1 != null) {
				local195 = this.aClass328_1.method7968(arg0);
				local200 = this.aClass328_8.method7968(arg0);
				local187 = local187 * ((this.method2546(local67, local200, this.aClass328_1.anInt9624) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray105[local195] != 0) {
					local200 = local176 + Static101.anIntArray112[local195];
					if (local200 < arg0) {
						Static101.anIntArray106[local200] += this.method2546(Static101.anIntArray110[local195], local187 * Static101.anIntArray113[local195] >> 15, this.aClass328_3.anInt9624);
						Static101.anIntArray110[local195] += (local182 * Static101.anIntArray114[local195] >> 16) + Static101.anIntArray111[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass328_9 != null) {
			this.aClass328_9.method7965();
			this.aClass328_6.method7965();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass328_9.method7968(arg0);
				local352 = this.aClass328_6.method7968(arg0);
				if (local339) {
					local187 = this.aClass328_9.anInt9621 + ((this.aClass328_9.anInt9623 - this.aClass328_9.anInt9621) * local347 >> 8);
				} else {
					local187 = this.aClass328_9.anInt9621 + ((this.aClass328_9.anInt9623 - this.aClass328_9.anInt9621) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static101.anIntArray106[local200] = 0;
				}
			}
		}
		if (this.anInt2603 > 0 && this.anInt2602 > 0) {
			local182 = (int) ((double) this.anInt2603 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static101.anIntArray106[local187] += Static101.anIntArray106[local187 - local182] * this.anInt2602 / 100;
			}
		}
		if (this.aClass338_1.anIntArray592[0] > 0 || this.aClass338_1.anIntArray592[1] > 0) {
			this.aClass328_5.method7965();
			local182 = this.aClass328_5.method7968(arg0 + 1);
			local187 = this.aClass338_1.method8012(0, (float) local182 / 65536.0F);
			local195 = this.aClass338_1.method8012(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static101.anIntArray106[local200 + local187] * (long) Static575.anInt9701 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static101.anIntArray106[local200 + local187 - local519 - 1] * (long) Static575.anIntArrayArray98[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static101.anIntArray106[local200 - local549 - 1] * (long) Static575.anIntArrayArray98[1][local549] >> 16);
					}
					Static101.anIntArray106[local200] = local352;
					local182 = this.aClass328_5.method7968(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static101.anIntArray106[local200 + local187] * (long) Static575.anInt9701 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static101.anIntArray106[local200 + local187 - local519 - 1] * (long) Static575.anIntArrayArray98[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static101.anIntArray106[local200 - local549 - 1] * (long) Static575.anIntArrayArray98[1][local549] >> 16);
						}
						Static101.anIntArray106[local200] = local352;
						local182 = this.aClass328_5.method7968(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static101.anIntArray106[local200 + local187 - local519 - 1] * (long) Static575.anIntArrayArray98[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static101.anIntArray106[local200 - local549 - 1] * (long) Static575.anIntArrayArray98[1][local549] >> 16);
							}
							Static101.anIntArray106[local200] = local352;
							this.aClass328_5.method7968(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass338_1.method8012(0, (float) local182 / 65536.0F);
					local195 = this.aClass338_1.method8012(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static101.anIntArray106[local182] < -32768) {
				Static101.anIntArray106[local182] = -32768;
			}
			if (Static101.anIntArray106[local182] > 32767) {
				Static101.anIntArray106[local182] = 32767;
			}
		}
		return Static101.anIntArray106;
	}
}
