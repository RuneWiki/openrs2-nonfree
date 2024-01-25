import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class361 {

	@OriginalMember(owner = "client!wn", name = "h", descriptor = "[I")
	private static final int[] anIntArray689 = new int[32768];

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "[I")
	private static final int[] anIntArray686;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "Lclient!aba;")
	private Class5 aClass5_1;

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "Lclient!aba;")
	private Class5 aClass5_2;

	@OriginalMember(owner = "client!wn", name = "j", descriptor = "Lclient!aba;")
	private Class5 aClass5_3;

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "Lclient!aba;")
	private Class5 aClass5_4;

	@OriginalMember(owner = "client!wn", name = "l", descriptor = "Lclient!om;")
	private Class245 aClass245_1;

	@OriginalMember(owner = "client!wn", name = "n", descriptor = "Lclient!aba;")
	private Class5 aClass5_5;

	@OriginalMember(owner = "client!wn", name = "o", descriptor = "Lclient!aba;")
	private Class5 aClass5_6;

	@OriginalMember(owner = "client!wn", name = "p", descriptor = "Lclient!aba;")
	private Class5 aClass5_7;

	@OriginalMember(owner = "client!wn", name = "q", descriptor = "Lclient!aba;")
	private Class5 aClass5_8;

	@OriginalMember(owner = "client!wn", name = "t", descriptor = "Lclient!aba;")
	private Class5 aClass5_9;

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "[I")
	private final int[] anIntArray688 = new int[5];

	@OriginalMember(owner = "client!wn", name = "i", descriptor = "[I")
	private final int[] anIntArray690 = new int[5];

	@OriginalMember(owner = "client!wn", name = "m", descriptor = "I")
	private int anInt9567 = 100;

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
	public int anInt9566 = 0;

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
	private int anInt9565 = 0;

	@OriginalMember(owner = "client!wn", name = "r", descriptor = "I")
	public int anInt9568 = 500;

	@OriginalMember(owner = "client!wn", name = "s", descriptor = "[I")
	private final int[] anIntArray691 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray689[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray686 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray686[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!es;)V")
	public void method7953(@OriginalArg(0) Class2_Sub15 arg0) {
		this.aClass5_7 = new Class5();
		this.aClass5_7.method32(arg0);
		this.aClass5_2 = new Class5();
		this.aClass5_2.method32(arg0);
		@Pc(21) int local21 = arg0.method4325();
		if (local21 != 0) {
			arg0.anInt5241--;
			this.aClass5_9 = new Class5();
			this.aClass5_9.method32(arg0);
			this.aClass5_8 = new Class5();
			this.aClass5_8.method32(arg0);
		}
		local21 = arg0.method4325();
		if (local21 != 0) {
			arg0.anInt5241--;
			this.aClass5_3 = new Class5();
			this.aClass5_3.method32(arg0);
			this.aClass5_4 = new Class5();
			this.aClass5_4.method32(arg0);
		}
		local21 = arg0.method4325();
		if (local21 != 0) {
			arg0.anInt5241--;
			this.aClass5_5 = new Class5();
			this.aClass5_5.method32(arg0);
			this.aClass5_1 = new Class5();
			this.aClass5_1.method32(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method4328();
			if (local114 == 0) {
				break;
			}
			this.anIntArray688[local109] = local114;
			this.anIntArray690[local109] = arg0.method4289();
			this.anIntArray691[local109] = arg0.method4328();
		}
		this.anInt9565 = arg0.method4328();
		this.anInt9567 = arg0.method4328();
		this.anInt9568 = arg0.method4294();
		this.anInt9566 = arg0.method4294();
		this.aClass245_1 = new Class245();
		this.aClass5_6 = new Class5();
		this.aClass245_1.method5724(arg0, this.aClass5_6);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)I")
	private int method7955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray686[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray689[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)[I")
	public int[] method7956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static598.method1135(Static588.anIntArray687, 0, arg0);
		if (arg1 < 10) {
			return Static588.anIntArray687;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass5_7.method30();
		this.aClass5_2.method30();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass5_9 != null) {
			this.aClass5_9.method30();
			this.aClass5_8.method30();
			local24 = (int) ((double) (this.aClass5_9.anInt26 - this.aClass5_9.anInt27) * 32.768D / local16);
			local26 = (int) ((double) this.aClass5_9.anInt27 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass5_3 != null) {
			this.aClass5_3.method30();
			this.aClass5_4.method30();
			local63 = (int) ((double) (this.aClass5_3.anInt26 - this.aClass5_3.anInt27) * 32.768D / local16);
			local65 = (int) ((double) this.aClass5_3.anInt27 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray688[local102] != 0) {
				Static588.anIntArray692[local102] = 0;
				Static588.anIntArray695[local102] = (int) ((double) this.anIntArray691[local102] * local16);
				Static588.anIntArray694[local102] = (this.anIntArray688[local102] << 14) / 100;
				Static588.anIntArray693[local102] = (int) ((double) (this.aClass5_7.anInt26 - this.aClass5_7.anInt27) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray690[local102]) / local16);
				Static588.anIntArray696[local102] = (int) ((double) this.aClass5_7.anInt27 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass5_7.method29(arg0);
			local187 = this.aClass5_2.method29(arg0);
			if (this.aClass5_9 != null) {
				local195 = this.aClass5_9.method29(arg0);
				local200 = this.aClass5_8.method29(arg0);
				local182 += this.method7955(local28, local200, this.aClass5_9.anInt29) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass5_3 != null) {
				local195 = this.aClass5_3.method29(arg0);
				local200 = this.aClass5_4.method29(arg0);
				local187 = local187 * ((this.method7955(local67, local200, this.aClass5_3.anInt29) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray688[local195] != 0) {
					local200 = local176 + Static588.anIntArray695[local195];
					if (local200 < arg0) {
						Static588.anIntArray687[local200] += this.method7955(Static588.anIntArray692[local195], local187 * Static588.anIntArray694[local195] >> 15, this.aClass5_7.anInt29);
						Static588.anIntArray692[local195] += (local182 * Static588.anIntArray693[local195] >> 16) + Static588.anIntArray696[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass5_5 != null) {
			this.aClass5_5.method30();
			this.aClass5_1.method30();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass5_5.method29(arg0);
				local352 = this.aClass5_1.method29(arg0);
				if (local339) {
					local187 = this.aClass5_5.anInt27 + ((this.aClass5_5.anInt26 - this.aClass5_5.anInt27) * local347 >> 8);
				} else {
					local187 = this.aClass5_5.anInt27 + ((this.aClass5_5.anInt26 - this.aClass5_5.anInt27) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static588.anIntArray687[local200] = 0;
				}
			}
		}
		if (this.anInt9565 > 0 && this.anInt9567 > 0) {
			local182 = (int) ((double) this.anInt9565 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static588.anIntArray687[local187] += Static588.anIntArray687[local187 - local182] * this.anInt9567 / 100;
			}
		}
		if (this.aClass245_1.anIntArray474[0] > 0 || this.aClass245_1.anIntArray474[1] > 0) {
			this.aClass5_6.method30();
			local182 = this.aClass5_6.method29(arg0 + 1);
			local187 = this.aClass245_1.method5726(0, (float) local182 / 65536.0F);
			local195 = this.aClass245_1.method5726(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static588.anIntArray687[local200 + local187] * (long) Static390.anInt6837 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static588.anIntArray687[local200 + local187 - local519 - 1] * (long) Static390.anIntArrayArray42[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static588.anIntArray687[local200 - local549 - 1] * (long) Static390.anIntArrayArray42[1][local549] >> 16);
					}
					Static588.anIntArray687[local200] = local352;
					local182 = this.aClass5_6.method29(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static588.anIntArray687[local200 + local187] * (long) Static390.anInt6837 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static588.anIntArray687[local200 + local187 - local519 - 1] * (long) Static390.anIntArrayArray42[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static588.anIntArray687[local200 - local549 - 1] * (long) Static390.anIntArrayArray42[1][local549] >> 16);
						}
						Static588.anIntArray687[local200] = local352;
						local182 = this.aClass5_6.method29(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static588.anIntArray687[local200 + local187 - local519 - 1] * (long) Static390.anIntArrayArray42[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static588.anIntArray687[local200 - local549 - 1] * (long) Static390.anIntArrayArray42[1][local549] >> 16);
							}
							Static588.anIntArray687[local200] = local352;
							this.aClass5_6.method29(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass245_1.method5726(0, (float) local182 / 65536.0F);
					local195 = this.aClass245_1.method5726(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static588.anIntArray687[local182] < -32768) {
				Static588.anIntArray687[local182] = -32768;
			}
			if (Static588.anIntArray687[local182] > 32767) {
				Static588.anIntArray687[local182] = 32767;
			}
		}
		return Static588.anIntArray687;
	}
}
