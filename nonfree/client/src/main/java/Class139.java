import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class139 {

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "[I")
	private static final int[] anIntArray276 = new int[32768];

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "[I")
	private static final int[] anIntArray273;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "Lclient!wda;")
	private Class367 aClass367_1;

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "Lclient!wda;")
	private Class367 aClass367_2;

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "Lclient!wda;")
	private Class367 aClass367_3;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "Lclient!wda;")
	private Class367 aClass367_4;

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "Lclient!wda;")
	private Class367 aClass367_5;

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "Lclient!vfa;")
	private Class355 aClass355_1;

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "Lclient!wda;")
	private Class367 aClass367_6;

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "Lclient!wda;")
	private Class367 aClass367_7;

	@OriginalMember(owner = "client!ia", name = "x", descriptor = "Lclient!wda;")
	private Class367 aClass367_8;

	@OriginalMember(owner = "client!ia", name = "y", descriptor = "Lclient!wda;")
	private Class367 aClass367_9;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
	public int anInt5017 = 500;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
	public int anInt5018 = 0;

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
	private int anInt5019 = 100;

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "[I")
	private final int[] anIntArray274 = new int[5];

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "[I")
	private final int[] anIntArray278 = new int[5];

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
	private int anInt5020 = 0;

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "[I")
	private final int[] anIntArray277 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray276[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray273 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray273[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)I")
	private int method4113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray273[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray276[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!ig;)V")
	public void method4114(@OriginalArg(0) Class8_Sub8 arg0) {
		this.aClass367_5 = new Class367();
		this.aClass367_5.method8397(arg0);
		this.aClass367_8 = new Class367();
		this.aClass367_8.method8397(arg0);
		@Pc(21) int local21 = arg0.method8525();
		if (local21 != 0) {
			arg0.anInt10588--;
			this.aClass367_2 = new Class367();
			this.aClass367_2.method8397(arg0);
			this.aClass367_4 = new Class367();
			this.aClass367_4.method8397(arg0);
		}
		local21 = arg0.method8525();
		if (local21 != 0) {
			arg0.anInt10588--;
			this.aClass367_9 = new Class367();
			this.aClass367_9.method8397(arg0);
			this.aClass367_6 = new Class367();
			this.aClass367_6.method8397(arg0);
		}
		local21 = arg0.method8525();
		if (local21 != 0) {
			arg0.anInt10588--;
			this.aClass367_1 = new Class367();
			this.aClass367_1.method8397(arg0);
			this.aClass367_3 = new Class367();
			this.aClass367_3.method8397(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method8565();
			if (local114 == 0) {
				break;
			}
			this.anIntArray278[local109] = local114;
			this.anIntArray277[local109] = arg0.method8529();
			this.anIntArray274[local109] = arg0.method8565();
		}
		this.anInt5020 = arg0.method8565();
		this.anInt5019 = arg0.method8565();
		this.anInt5017 = arg0.method8578();
		this.anInt5018 = arg0.method8578();
		this.aClass355_1 = new Class355();
		this.aClass367_7 = new Class367();
		this.aClass355_1.method8233(arg0, this.aClass367_7);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)[I")
	public int[] method4115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static649.method5531(Static217.anIntArray275, 0, arg0);
		if (arg1 < 10) {
			return Static217.anIntArray275;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass367_5.method8395();
		this.aClass367_8.method8395();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass367_2 != null) {
			this.aClass367_2.method8395();
			this.aClass367_4.method8395();
			local24 = (int) ((double) (this.aClass367_2.anInt10397 - this.aClass367_2.anInt10399) * 32.768D / local16);
			local26 = (int) ((double) this.aClass367_2.anInt10399 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass367_9 != null) {
			this.aClass367_9.method8395();
			this.aClass367_6.method8395();
			local63 = (int) ((double) (this.aClass367_9.anInt10397 - this.aClass367_9.anInt10399) * 32.768D / local16);
			local65 = (int) ((double) this.aClass367_9.anInt10399 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray278[local102] != 0) {
				Static217.anIntArray281[local102] = 0;
				Static217.anIntArray282[local102] = (int) ((double) this.anIntArray274[local102] * local16);
				Static217.anIntArray280[local102] = (this.anIntArray278[local102] << 14) / 100;
				Static217.anIntArray279[local102] = (int) ((double) (this.aClass367_5.anInt10397 - this.aClass367_5.anInt10399) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray277[local102]) / local16);
				Static217.anIntArray283[local102] = (int) ((double) this.aClass367_5.anInt10399 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass367_5.method8396(arg0);
			local187 = this.aClass367_8.method8396(arg0);
			if (this.aClass367_2 != null) {
				local195 = this.aClass367_2.method8396(arg0);
				local200 = this.aClass367_4.method8396(arg0);
				local182 += this.method4113(local28, local200, this.aClass367_2.anInt10396) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass367_9 != null) {
				local195 = this.aClass367_9.method8396(arg0);
				local200 = this.aClass367_6.method8396(arg0);
				local187 = local187 * ((this.method4113(local67, local200, this.aClass367_9.anInt10396) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray278[local195] != 0) {
					local200 = local176 + Static217.anIntArray282[local195];
					if (local200 < arg0) {
						Static217.anIntArray275[local200] += this.method4113(Static217.anIntArray281[local195], local187 * Static217.anIntArray280[local195] >> 15, this.aClass367_5.anInt10396);
						Static217.anIntArray281[local195] += (local182 * Static217.anIntArray279[local195] >> 16) + Static217.anIntArray283[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass367_1 != null) {
			this.aClass367_1.method8395();
			this.aClass367_3.method8395();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass367_1.method8396(arg0);
				local352 = this.aClass367_3.method8396(arg0);
				if (local339) {
					local187 = this.aClass367_1.anInt10399 + ((this.aClass367_1.anInt10397 - this.aClass367_1.anInt10399) * local347 >> 8);
				} else {
					local187 = this.aClass367_1.anInt10399 + ((this.aClass367_1.anInt10397 - this.aClass367_1.anInt10399) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static217.anIntArray275[local200] = 0;
				}
			}
		}
		if (this.anInt5020 > 0 && this.anInt5019 > 0) {
			local182 = (int) ((double) this.anInt5020 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static217.anIntArray275[local187] += Static217.anIntArray275[local187 - local182] * this.anInt5019 / 100;
			}
		}
		if (this.aClass355_1.anIntArray596[0] > 0 || this.aClass355_1.anIntArray596[1] > 0) {
			this.aClass367_7.method8395();
			local182 = this.aClass367_7.method8396(arg0 + 1);
			local187 = this.aClass355_1.method8236(0, (float) local182 / 65536.0F);
			local195 = this.aClass355_1.method8236(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static217.anIntArray275[local200 + local187] * (long) Static597.anInt10198 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static217.anIntArray275[local200 + local187 - local519 - 1] * (long) Static597.anIntArrayArray63[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static217.anIntArray275[local200 - local549 - 1] * (long) Static597.anIntArrayArray63[1][local549] >> 16);
					}
					Static217.anIntArray275[local200] = local352;
					local182 = this.aClass367_7.method8396(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static217.anIntArray275[local200 + local187] * (long) Static597.anInt10198 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static217.anIntArray275[local200 + local187 - local519 - 1] * (long) Static597.anIntArrayArray63[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static217.anIntArray275[local200 - local549 - 1] * (long) Static597.anIntArrayArray63[1][local549] >> 16);
						}
						Static217.anIntArray275[local200] = local352;
						local182 = this.aClass367_7.method8396(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static217.anIntArray275[local200 + local187 - local519 - 1] * (long) Static597.anIntArrayArray63[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static217.anIntArray275[local200 - local549 - 1] * (long) Static597.anIntArrayArray63[1][local549] >> 16);
							}
							Static217.anIntArray275[local200] = local352;
							this.aClass367_7.method8396(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass355_1.method8236(0, (float) local182 / 65536.0F);
					local195 = this.aClass355_1.method8236(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static217.anIntArray275[local182] < -32768) {
				Static217.anIntArray275[local182] = -32768;
			}
			if (Static217.anIntArray275[local182] > 32767) {
				Static217.anIntArray275[local182] = 32767;
			}
		}
		return Static217.anIntArray275;
	}
}
