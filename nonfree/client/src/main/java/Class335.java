import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class335 {

	@OriginalMember(owner = "client!sp", name = "t", descriptor = "[I")
	private static final int[] anIntArray605 = new int[32768];

	@OriginalMember(owner = "client!sp", name = "q", descriptor = "[I")
	private static final int[] anIntArray604;

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "Lclient!uf;")
	private Class362 aClass362_1;

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "Lclient!uf;")
	private Class362 aClass362_2;

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "Lclient!uf;")
	private Class362 aClass362_3;

	@OriginalMember(owner = "client!sp", name = "i", descriptor = "Lclient!uf;")
	private Class362 aClass362_4;

	@OriginalMember(owner = "client!sp", name = "j", descriptor = "Lclient!uf;")
	private Class362 aClass362_5;

	@OriginalMember(owner = "client!sp", name = "l", descriptor = "Lclient!uf;")
	private Class362 aClass362_6;

	@OriginalMember(owner = "client!sp", name = "o", descriptor = "Lclient!uf;")
	private Class362 aClass362_7;

	@OriginalMember(owner = "client!sp", name = "p", descriptor = "Lclient!uf;")
	private Class362 aClass362_8;

	@OriginalMember(owner = "client!sp", name = "r", descriptor = "Lclient!uf;")
	private Class362 aClass362_9;

	@OriginalMember(owner = "client!sp", name = "s", descriptor = "Lclient!pf;")
	private Class278 aClass278_1;

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "I")
	public int anInt8576 = 500;

	@OriginalMember(owner = "client!sp", name = "g", descriptor = "[I")
	private final int[] anIntArray602 = new int[5];

	@OriginalMember(owner = "client!sp", name = "h", descriptor = "I")
	public int anInt8577 = 0;

	@OriginalMember(owner = "client!sp", name = "k", descriptor = "[I")
	private final int[] anIntArray603 = new int[5];

	@OriginalMember(owner = "client!sp", name = "n", descriptor = "I")
	private int anInt8579 = 0;

	@OriginalMember(owner = "client!sp", name = "m", descriptor = "I")
	private int anInt8578 = 100;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "[I")
	private final int[] anIntArray600 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray605[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray604 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray604[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)[I")
	public int[] method7396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static685.method6462(Static556.anIntArray601, 0, arg0);
		if (arg1 < 10) {
			return Static556.anIntArray601;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass362_6.method7904();
		this.aClass362_2.method7904();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass362_4 != null) {
			this.aClass362_4.method7904();
			this.aClass362_9.method7904();
			local24 = (int) ((double) (this.aClass362_4.anInt9249 - this.aClass362_4.anInt9248) * 32.768D / local16);
			local26 = (int) ((double) this.aClass362_4.anInt9248 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass362_3 != null) {
			this.aClass362_3.method7904();
			this.aClass362_7.method7904();
			local63 = (int) ((double) (this.aClass362_3.anInt9249 - this.aClass362_3.anInt9248) * 32.768D / local16);
			local65 = (int) ((double) this.aClass362_3.anInt9248 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray602[local102] != 0) {
				Static556.anIntArray610[local102] = 0;
				Static556.anIntArray607[local102] = (int) ((double) this.anIntArray600[local102] * local16);
				Static556.anIntArray608[local102] = (this.anIntArray602[local102] << 14) / 100;
				Static556.anIntArray609[local102] = (int) ((double) (this.aClass362_6.anInt9249 - this.aClass362_6.anInt9248) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray603[local102]) / local16);
				Static556.anIntArray606[local102] = (int) ((double) this.aClass362_6.anInt9248 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass362_6.method7905(arg0);
			local187 = this.aClass362_2.method7905(arg0);
			if (this.aClass362_4 != null) {
				local195 = this.aClass362_4.method7905(arg0);
				local200 = this.aClass362_9.method7905(arg0);
				local182 += this.method7397(local28, local200, this.aClass362_4.anInt9247) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass362_3 != null) {
				local195 = this.aClass362_3.method7905(arg0);
				local200 = this.aClass362_7.method7905(arg0);
				local187 = local187 * ((this.method7397(local67, local200, this.aClass362_3.anInt9247) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray602[local195] != 0) {
					local200 = local176 + Static556.anIntArray607[local195];
					if (local200 < arg0) {
						Static556.anIntArray601[local200] += this.method7397(Static556.anIntArray610[local195], local187 * Static556.anIntArray608[local195] >> 15, this.aClass362_6.anInt9247);
						Static556.anIntArray610[local195] += (local182 * Static556.anIntArray609[local195] >> 16) + Static556.anIntArray606[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass362_1 != null) {
			this.aClass362_1.method7904();
			this.aClass362_8.method7904();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass362_1.method7905(arg0);
				local352 = this.aClass362_8.method7905(arg0);
				if (local339) {
					local187 = this.aClass362_1.anInt9248 + ((this.aClass362_1.anInt9249 - this.aClass362_1.anInt9248) * local347 >> 8);
				} else {
					local187 = this.aClass362_1.anInt9248 + ((this.aClass362_1.anInt9249 - this.aClass362_1.anInt9248) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static556.anIntArray601[local200] = 0;
				}
			}
		}
		if (this.anInt8579 > 0 && this.anInt8578 > 0) {
			local182 = (int) ((double) this.anInt8579 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static556.anIntArray601[local187] += Static556.anIntArray601[local187 - local182] * this.anInt8578 / 100;
			}
		}
		if (this.aClass278_1.anIntArray493[0] > 0 || this.aClass278_1.anIntArray493[1] > 0) {
			this.aClass362_5.method7904();
			local182 = this.aClass362_5.method7905(arg0 + 1);
			local187 = this.aClass278_1.method6394(0, (float) local182 / 65536.0F);
			local195 = this.aClass278_1.method6394(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static556.anIntArray601[local200 + local187] * (long) Static457.anInt7333 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static556.anIntArray601[local200 + local187 - local519 - 1] * (long) Static457.anIntArrayArray43[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static556.anIntArray601[local200 - local549 - 1] * (long) Static457.anIntArrayArray43[1][local549] >> 16);
					}
					Static556.anIntArray601[local200] = local352;
					local182 = this.aClass362_5.method7905(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static556.anIntArray601[local200 + local187] * (long) Static457.anInt7333 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static556.anIntArray601[local200 + local187 - local519 - 1] * (long) Static457.anIntArrayArray43[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static556.anIntArray601[local200 - local549 - 1] * (long) Static457.anIntArrayArray43[1][local549] >> 16);
						}
						Static556.anIntArray601[local200] = local352;
						local182 = this.aClass362_5.method7905(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static556.anIntArray601[local200 + local187 - local519 - 1] * (long) Static457.anIntArrayArray43[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static556.anIntArray601[local200 - local549 - 1] * (long) Static457.anIntArrayArray43[1][local549] >> 16);
							}
							Static556.anIntArray601[local200] = local352;
							this.aClass362_5.method7905(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass278_1.method6394(0, (float) local182 / 65536.0F);
					local195 = this.aClass278_1.method6394(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static556.anIntArray601[local182] < -32768) {
				Static556.anIntArray601[local182] = -32768;
			}
			if (Static556.anIntArray601[local182] > 32767) {
				Static556.anIntArray601[local182] = 32767;
			}
		}
		return Static556.anIntArray601;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(III)I")
	private int method7397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray604[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray605[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!es;)V")
	public void method7398(@OriginalArg(0) Class4_Sub11 arg0) {
		this.aClass362_6 = new Class362();
		this.aClass362_6.method7906(arg0);
		this.aClass362_2 = new Class362();
		this.aClass362_2.method7906(arg0);
		@Pc(21) int local21 = arg0.method8865();
		if (local21 != 0) {
			arg0.anInt10466--;
			this.aClass362_4 = new Class362();
			this.aClass362_4.method7906(arg0);
			this.aClass362_9 = new Class362();
			this.aClass362_9.method7906(arg0);
		}
		local21 = arg0.method8865();
		if (local21 != 0) {
			arg0.anInt10466--;
			this.aClass362_3 = new Class362();
			this.aClass362_3.method7906(arg0);
			this.aClass362_7 = new Class362();
			this.aClass362_7.method7906(arg0);
		}
		local21 = arg0.method8865();
		if (local21 != 0) {
			arg0.anInt10466--;
			this.aClass362_1 = new Class362();
			this.aClass362_1.method7906(arg0);
			this.aClass362_8 = new Class362();
			this.aClass362_8.method7906(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method8823();
			if (local114 == 0) {
				break;
			}
			this.anIntArray602[local109] = local114;
			this.anIntArray603[local109] = arg0.method8842();
			this.anIntArray600[local109] = arg0.method8823();
		}
		this.anInt8579 = arg0.method8823();
		this.anInt8578 = arg0.method8823();
		this.anInt8576 = arg0.method8859();
		this.anInt8577 = arg0.method8859();
		this.aClass278_1 = new Class278();
		this.aClass362_5 = new Class362();
		this.aClass278_1.method6393(arg0, this.aClass362_5);
	}
}
