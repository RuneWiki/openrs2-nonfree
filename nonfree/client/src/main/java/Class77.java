import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class77 {

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "[I")
	private static final int[] anIntArray187 = new int[32768];

	@OriginalMember(owner = "client!gj", name = "s", descriptor = "[I")
	private static final int[] anIntArray191;

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "Lclient!rq;")
	private Class181 aClass181_1;

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "Lclient!rq;")
	private Class181 aClass181_2;

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "Lclient!rq;")
	private Class181 aClass181_3;

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "Lclient!rq;")
	private Class181 aClass181_4;

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "Lclient!rq;")
	private Class181 aClass181_5;

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "Lclient!rq;")
	private Class181 aClass181_6;

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "Lclient!rq;")
	private Class181 aClass181_7;

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "Lclient!uq;")
	private Class199 aClass199_1;

	@OriginalMember(owner = "client!gj", name = "r", descriptor = "Lclient!rq;")
	private Class181 aClass181_8;

	@OriginalMember(owner = "client!gj", name = "t", descriptor = "Lclient!rq;")
	private Class181 aClass181_9;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
	private int anInt2006 = 100;

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
	private int anInt2007 = 0;

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
	public int anInt2009 = 500;

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
	public int anInt2008 = 0;

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "[I")
	private final int[] anIntArray186 = new int[5];

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "[I")
	private final int[] anIntArray188 = new int[5];

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "[I")
	private final int[] anIntArray189 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray187[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray191 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray191[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)I")
	private int method1879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray191[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray187[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)[I")
	public int[] method1880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static368.method5426(Static105.anIntArray190, 0, arg0);
		if (arg1 < 10) {
			return Static105.anIntArray190;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass181_1.method4930();
		this.aClass181_7.method4930();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass181_4 != null) {
			this.aClass181_4.method4930();
			this.aClass181_3.method4930();
			local24 = (int) ((double) (this.aClass181_4.anInt5571 - this.aClass181_4.anInt5572) * 32.768D / local16);
			local26 = (int) ((double) this.aClass181_4.anInt5572 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass181_8 != null) {
			this.aClass181_8.method4930();
			this.aClass181_6.method4930();
			local63 = (int) ((double) (this.aClass181_8.anInt5571 - this.aClass181_8.anInt5572) * 32.768D / local16);
			local65 = (int) ((double) this.aClass181_8.anInt5572 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray186[local102] != 0) {
				Static105.anIntArray196[local102] = 0;
				Static105.anIntArray192[local102] = (int) ((double) this.anIntArray188[local102] * local16);
				Static105.anIntArray194[local102] = (this.anIntArray186[local102] << 14) / 100;
				Static105.anIntArray195[local102] = (int) ((double) (this.aClass181_1.anInt5571 - this.aClass181_1.anInt5572) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray189[local102]) / local16);
				Static105.anIntArray193[local102] = (int) ((double) this.aClass181_1.anInt5572 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass181_1.method4928(arg0);
			local187 = this.aClass181_7.method4928(arg0);
			if (this.aClass181_4 != null) {
				local195 = this.aClass181_4.method4928(arg0);
				local200 = this.aClass181_3.method4928(arg0);
				local182 += this.method1879(local28, local200, this.aClass181_4.anInt5574) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass181_8 != null) {
				local195 = this.aClass181_8.method4928(arg0);
				local200 = this.aClass181_6.method4928(arg0);
				local187 = local187 * ((this.method1879(local67, local200, this.aClass181_8.anInt5574) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray186[local195] != 0) {
					local200 = local176 + Static105.anIntArray192[local195];
					if (local200 < arg0) {
						Static105.anIntArray190[local200] += this.method1879(Static105.anIntArray196[local195], local187 * Static105.anIntArray194[local195] >> 15, this.aClass181_1.anInt5574);
						Static105.anIntArray196[local195] += (local182 * Static105.anIntArray195[local195] >> 16) + Static105.anIntArray193[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass181_9 != null) {
			this.aClass181_9.method4930();
			this.aClass181_2.method4930();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass181_9.method4928(arg0);
				local352 = this.aClass181_2.method4928(arg0);
				if (local339) {
					local187 = this.aClass181_9.anInt5572 + ((this.aClass181_9.anInt5571 - this.aClass181_9.anInt5572) * local347 >> 8);
				} else {
					local187 = this.aClass181_9.anInt5572 + ((this.aClass181_9.anInt5571 - this.aClass181_9.anInt5572) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static105.anIntArray190[local200] = 0;
				}
			}
		}
		if (this.anInt2007 > 0 && this.anInt2006 > 0) {
			local182 = (int) ((double) this.anInt2007 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static105.anIntArray190[local187] += Static105.anIntArray190[local187 - local182] * this.anInt2006 / 100;
			}
		}
		if (this.aClass199_1.anIntArray599[0] > 0 || this.aClass199_1.anIntArray599[1] > 0) {
			this.aClass181_5.method4930();
			local182 = this.aClass181_5.method4928(arg0 + 1);
			local187 = this.aClass199_1.method5671(0, (float) local182 / 65536.0F);
			local195 = this.aClass199_1.method5671(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static105.anIntArray190[local200 + local187] * (long) Static328.anInt6344 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static105.anIntArray190[local200 + local187 - local519 - 1] * (long) Static328.anIntArrayArray96[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static105.anIntArray190[local200 - local549 - 1] * (long) Static328.anIntArrayArray96[1][local549] >> 16);
					}
					Static105.anIntArray190[local200] = local352;
					local182 = this.aClass181_5.method4928(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static105.anIntArray190[local200 + local187] * (long) Static328.anInt6344 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static105.anIntArray190[local200 + local187 - local519 - 1] * (long) Static328.anIntArrayArray96[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static105.anIntArray190[local200 - local549 - 1] * (long) Static328.anIntArrayArray96[1][local549] >> 16);
						}
						Static105.anIntArray190[local200] = local352;
						local182 = this.aClass181_5.method4928(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static105.anIntArray190[local200 + local187 - local519 - 1] * (long) Static328.anIntArrayArray96[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static105.anIntArray190[local200 - local549 - 1] * (long) Static328.anIntArrayArray96[1][local549] >> 16);
							}
							Static105.anIntArray190[local200] = local352;
							this.aClass181_5.method4928(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass199_1.method5671(0, (float) local182 / 65536.0F);
					local195 = this.aClass199_1.method5671(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static105.anIntArray190[local182] < -32768) {
				Static105.anIntArray190[local182] = -32768;
			}
			if (Static105.anIntArray190[local182] > 32767) {
				Static105.anIntArray190[local182] = 32767;
			}
		}
		return Static105.anIntArray190;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!rg;)V")
	public void method1882(@OriginalArg(0) Class5_Sub12 arg0) {
		this.aClass181_1 = new Class181();
		this.aClass181_1.method4929(arg0);
		this.aClass181_7 = new Class181();
		this.aClass181_7.method4929(arg0);
		@Pc(21) int local21 = arg0.method5115();
		if (local21 != 0) {
			arg0.anInt5731--;
			this.aClass181_4 = new Class181();
			this.aClass181_4.method4929(arg0);
			this.aClass181_3 = new Class181();
			this.aClass181_3.method4929(arg0);
		}
		local21 = arg0.method5115();
		if (local21 != 0) {
			arg0.anInt5731--;
			this.aClass181_8 = new Class181();
			this.aClass181_8.method4929(arg0);
			this.aClass181_6 = new Class181();
			this.aClass181_6.method4929(arg0);
		}
		local21 = arg0.method5115();
		if (local21 != 0) {
			arg0.anInt5731--;
			this.aClass181_9 = new Class181();
			this.aClass181_9.method4929(arg0);
			this.aClass181_2 = new Class181();
			this.aClass181_2.method4929(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method5060();
			if (local114 == 0) {
				break;
			}
			this.anIntArray186[local109] = local114;
			this.anIntArray189[local109] = arg0.method5103();
			this.anIntArray188[local109] = arg0.method5060();
		}
		this.anInt2007 = arg0.method5060();
		this.anInt2006 = arg0.method5060();
		this.anInt2009 = arg0.method5106();
		this.anInt2008 = arg0.method5106();
		this.aClass199_1 = new Class199();
		this.aClass181_5 = new Class181();
		this.aClass199_1.method5669(arg0, this.aClass181_5);
	}
}
