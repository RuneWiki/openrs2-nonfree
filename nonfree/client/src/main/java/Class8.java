import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class8 {

	@OriginalMember(owner = "client!ah", name = "q", descriptor = "[I")
	private static final int[] anIntArray10 = new int[32768];

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "[I")
	private static final int[] anIntArray5;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "Lclient!an;")
	private Class13 aClass13_1;

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "Lclient!an;")
	private Class13 aClass13_2;

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "Lclient!an;")
	private Class13 aClass13_3;

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "Lclient!an;")
	private Class13 aClass13_4;

	@OriginalMember(owner = "client!ah", name = "n", descriptor = "Lclient!an;")
	private Class13 aClass13_5;

	@OriginalMember(owner = "client!ah", name = "o", descriptor = "Lclient!an;")
	private Class13 aClass13_6;

	@OriginalMember(owner = "client!ah", name = "p", descriptor = "Lclient!an;")
	private Class13 aClass13_7;

	@OriginalMember(owner = "client!ah", name = "r", descriptor = "Lclient!jr;")
	private Class128 aClass128_1;

	@OriginalMember(owner = "client!ah", name = "s", descriptor = "Lclient!an;")
	private Class13 aClass13_8;

	@OriginalMember(owner = "client!ah", name = "w", descriptor = "Lclient!an;")
	private Class13 aClass13_9;

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "[I")
	private final int[] anIntArray7 = new int[5];

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
	public int anInt52 = 0;

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
	private int anInt51 = 0;

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "[I")
	private final int[] anIntArray9 = new int[5];

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
	public int anInt53 = 500;

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
	private int anInt50 = 100;

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "[I")
	private final int[] anIntArray8 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray10[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray5 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray5[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)I")
	private int method44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray5[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray10[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)[I")
	public int[] method46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static464.method3638(Static8.anIntArray6, 0, arg0);
		if (arg1 < 10) {
			return Static8.anIntArray6;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass13_6.method99();
		this.aClass13_7.method99();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass13_2 != null) {
			this.aClass13_2.method99();
			this.aClass13_9.method99();
			local24 = (int) ((double) (this.aClass13_2.anInt133 - this.aClass13_2.anInt134) * 32.768D / local16);
			local26 = (int) ((double) this.aClass13_2.anInt134 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass13_5 != null) {
			this.aClass13_5.method99();
			this.aClass13_3.method99();
			local63 = (int) ((double) (this.aClass13_5.anInt133 - this.aClass13_5.anInt134) * 32.768D / local16);
			local65 = (int) ((double) this.aClass13_5.anInt134 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray9[local102] != 0) {
				Static8.anIntArray12[local102] = 0;
				Static8.anIntArray13[local102] = (int) ((double) this.anIntArray7[local102] * local16);
				Static8.anIntArray15[local102] = (this.anIntArray9[local102] << 14) / 100;
				Static8.anIntArray11[local102] = (int) ((double) (this.aClass13_6.anInt133 - this.aClass13_6.anInt134) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray8[local102]) / local16);
				Static8.anIntArray14[local102] = (int) ((double) this.aClass13_6.anInt134 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass13_6.method101(arg0);
			local187 = this.aClass13_7.method101(arg0);
			if (this.aClass13_2 != null) {
				local195 = this.aClass13_2.method101(arg0);
				local200 = this.aClass13_9.method101(arg0);
				local182 += this.method44(local28, local200, this.aClass13_2.anInt135) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass13_5 != null) {
				local195 = this.aClass13_5.method101(arg0);
				local200 = this.aClass13_3.method101(arg0);
				local187 = local187 * ((this.method44(local67, local200, this.aClass13_5.anInt135) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray9[local195] != 0) {
					local200 = local176 + Static8.anIntArray13[local195];
					if (local200 < arg0) {
						Static8.anIntArray6[local200] += this.method44(Static8.anIntArray12[local195], local187 * Static8.anIntArray15[local195] >> 15, this.aClass13_6.anInt135);
						Static8.anIntArray12[local195] += (local182 * Static8.anIntArray11[local195] >> 16) + Static8.anIntArray14[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass13_1 != null) {
			this.aClass13_1.method99();
			this.aClass13_4.method99();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass13_1.method101(arg0);
				local352 = this.aClass13_4.method101(arg0);
				if (local339) {
					local187 = this.aClass13_1.anInt134 + ((this.aClass13_1.anInt133 - this.aClass13_1.anInt134) * local347 >> 8);
				} else {
					local187 = this.aClass13_1.anInt134 + ((this.aClass13_1.anInt133 - this.aClass13_1.anInt134) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static8.anIntArray6[local200] = 0;
				}
			}
		}
		if (this.anInt51 > 0 && this.anInt50 > 0) {
			local182 = (int) ((double) this.anInt51 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static8.anIntArray6[local187] += Static8.anIntArray6[local187 - local182] * this.anInt50 / 100;
			}
		}
		if (this.aClass128_1.anIntArray318[0] > 0 || this.aClass128_1.anIntArray318[1] > 0) {
			this.aClass13_8.method99();
			local182 = this.aClass13_8.method101(arg0 + 1);
			local187 = this.aClass128_1.method2859(0, (float) local182 / 65536.0F);
			local195 = this.aClass128_1.method2859(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static8.anIntArray6[local200 + local187] * (long) Static200.anInt3530 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static8.anIntArray6[local200 + local187 - local519 - 1] * (long) Static200.anIntArrayArray28[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static8.anIntArray6[local200 - local549 - 1] * (long) Static200.anIntArrayArray28[1][local549] >> 16);
					}
					Static8.anIntArray6[local200] = local352;
					local182 = this.aClass13_8.method101(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static8.anIntArray6[local200 + local187] * (long) Static200.anInt3530 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static8.anIntArray6[local200 + local187 - local519 - 1] * (long) Static200.anIntArrayArray28[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static8.anIntArray6[local200 - local549 - 1] * (long) Static200.anIntArrayArray28[1][local549] >> 16);
						}
						Static8.anIntArray6[local200] = local352;
						local182 = this.aClass13_8.method101(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static8.anIntArray6[local200 + local187 - local519 - 1] * (long) Static200.anIntArrayArray28[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static8.anIntArray6[local200 - local549 - 1] * (long) Static200.anIntArrayArray28[1][local549] >> 16);
							}
							Static8.anIntArray6[local200] = local352;
							this.aClass13_8.method101(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass128_1.method2859(0, (float) local182 / 65536.0F);
					local195 = this.aClass128_1.method2859(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static8.anIntArray6[local182] < -32768) {
				Static8.anIntArray6[local182] = -32768;
			}
			if (Static8.anIntArray6[local182] > 32767) {
				Static8.anIntArray6[local182] = 32767;
			}
		}
		return Static8.anIntArray6;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!gk;)V")
	public void method47(@OriginalArg(0) Class7_Sub14 arg0) {
		this.aClass13_6 = new Class13();
		this.aClass13_6.method100(arg0);
		this.aClass13_7 = new Class13();
		this.aClass13_7.method100(arg0);
		@Pc(21) int local21 = arg0.method3981();
		if (local21 != 0) {
			arg0.anInt4989--;
			this.aClass13_2 = new Class13();
			this.aClass13_2.method100(arg0);
			this.aClass13_9 = new Class13();
			this.aClass13_9.method100(arg0);
		}
		local21 = arg0.method3981();
		if (local21 != 0) {
			arg0.anInt4989--;
			this.aClass13_5 = new Class13();
			this.aClass13_5.method100(arg0);
			this.aClass13_3 = new Class13();
			this.aClass13_3.method100(arg0);
		}
		local21 = arg0.method3981();
		if (local21 != 0) {
			arg0.anInt4989--;
			this.aClass13_1 = new Class13();
			this.aClass13_1.method100(arg0);
			this.aClass13_4 = new Class13();
			this.aClass13_4.method100(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method3940();
			if (local114 == 0) {
				break;
			}
			this.anIntArray9[local109] = local114;
			this.anIntArray8[local109] = arg0.method3974();
			this.anIntArray7[local109] = arg0.method3940();
		}
		this.anInt51 = arg0.method3940();
		this.anInt50 = arg0.method3940();
		this.anInt53 = arg0.method3943();
		this.anInt52 = arg0.method3943();
		this.aClass128_1 = new Class128();
		this.aClass13_8 = new Class13();
		this.aClass128_1.method2860(arg0, this.aClass13_8);
	}
}
