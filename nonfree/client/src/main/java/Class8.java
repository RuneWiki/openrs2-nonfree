import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aea")
public final class Class8 {

	@OriginalMember(owner = "client!aea", name = "m", descriptor = "[I")
	private static final int[] anIntArray9 = new int[32768];

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "[I")
	private static final int[] anIntArray7;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "Lclient!mv;")
	private Class238 aClass238_1;

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "Lclient!mv;")
	private Class238 aClass238_2;

	@OriginalMember(owner = "client!aea", name = "d", descriptor = "Lclient!mv;")
	private Class238 aClass238_3;

	@OriginalMember(owner = "client!aea", name = "e", descriptor = "Lclient!mv;")
	private Class238 aClass238_4;

	@OriginalMember(owner = "client!aea", name = "g", descriptor = "Lclient!lja;")
	private Class221 aClass221_1;

	@OriginalMember(owner = "client!aea", name = "h", descriptor = "Lclient!mv;")
	private Class238 aClass238_5;

	@OriginalMember(owner = "client!aea", name = "j", descriptor = "Lclient!mv;")
	private Class238 aClass238_6;

	@OriginalMember(owner = "client!aea", name = "l", descriptor = "Lclient!mv;")
	private Class238 aClass238_7;

	@OriginalMember(owner = "client!aea", name = "r", descriptor = "Lclient!mv;")
	private Class238 aClass238_8;

	@OriginalMember(owner = "client!aea", name = "t", descriptor = "Lclient!mv;")
	private Class238 aClass238_9;

	@OriginalMember(owner = "client!aea", name = "k", descriptor = "I")
	public int anInt173 = 0;

	@OriginalMember(owner = "client!aea", name = "p", descriptor = "I")
	public int anInt174 = 500;

	@OriginalMember(owner = "client!aea", name = "i", descriptor = "I")
	private int anInt172 = 100;

	@OriginalMember(owner = "client!aea", name = "n", descriptor = "[I")
	private final int[] anIntArray10 = new int[5];

	@OriginalMember(owner = "client!aea", name = "f", descriptor = "[I")
	private final int[] anIntArray8 = new int[5];

	@OriginalMember(owner = "client!aea", name = "q", descriptor = "I")
	private int anInt175 = 0;

	@OriginalMember(owner = "client!aea", name = "o", descriptor = "[I")
	private final int[] anIntArray11 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray9[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray7 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray7[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lclient!rv;)V")
	public void method167(@OriginalArg(0) Class5_Sub15 arg0) {
		this.aClass238_2 = new Class238();
		this.aClass238_2.method5574(arg0);
		this.aClass238_3 = new Class238();
		this.aClass238_3.method5574(arg0);
		@Pc(21) int local21 = arg0.method3642();
		if (local21 != 0) {
			arg0.anInt4144--;
			this.aClass238_9 = new Class238();
			this.aClass238_9.method5574(arg0);
			this.aClass238_6 = new Class238();
			this.aClass238_6.method5574(arg0);
		}
		local21 = arg0.method3642();
		if (local21 != 0) {
			arg0.anInt4144--;
			this.aClass238_8 = new Class238();
			this.aClass238_8.method5574(arg0);
			this.aClass238_1 = new Class238();
			this.aClass238_1.method5574(arg0);
		}
		local21 = arg0.method3642();
		if (local21 != 0) {
			arg0.anInt4144--;
			this.aClass238_5 = new Class238();
			this.aClass238_5.method5574(arg0);
			this.aClass238_4 = new Class238();
			this.aClass238_4.method5574(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method3690();
			if (local114 == 0) {
				break;
			}
			this.anIntArray11[local109] = local114;
			this.anIntArray8[local109] = arg0.method3657();
			this.anIntArray10[local109] = arg0.method3690();
		}
		this.anInt175 = arg0.method3690();
		this.anInt172 = arg0.method3690();
		this.anInt174 = arg0.method3698();
		this.anInt173 = arg0.method3698();
		this.aClass221_1 = new Class221();
		this.aClass238_7 = new Class238();
		this.aClass221_1.method5191(arg0, this.aClass238_7);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(II)[I")
	public int[] method168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static685.method8330(Static9.anIntArray12, 0, arg0);
		if (arg1 < 10) {
			return Static9.anIntArray12;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass238_2.method5577();
		this.aClass238_3.method5577();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass238_9 != null) {
			this.aClass238_9.method5577();
			this.aClass238_6.method5577();
			local24 = (int) ((double) (this.aClass238_9.anInt6612 - this.aClass238_9.anInt6613) * 32.768D / local16);
			local26 = (int) ((double) this.aClass238_9.anInt6613 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass238_8 != null) {
			this.aClass238_8.method5577();
			this.aClass238_1.method5577();
			local63 = (int) ((double) (this.aClass238_8.anInt6612 - this.aClass238_8.anInt6613) * 32.768D / local16);
			local65 = (int) ((double) this.aClass238_8.anInt6613 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray11[local102] != 0) {
				Static9.anIntArray17[local102] = 0;
				Static9.anIntArray14[local102] = (int) ((double) this.anIntArray10[local102] * local16);
				Static9.anIntArray15[local102] = (this.anIntArray11[local102] << 14) / 100;
				Static9.anIntArray16[local102] = (int) ((double) (this.aClass238_2.anInt6612 - this.aClass238_2.anInt6613) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray8[local102]) / local16);
				Static9.anIntArray13[local102] = (int) ((double) this.aClass238_2.anInt6613 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass238_2.method5576(arg0);
			local187 = this.aClass238_3.method5576(arg0);
			if (this.aClass238_9 != null) {
				local195 = this.aClass238_9.method5576(arg0);
				local200 = this.aClass238_6.method5576(arg0);
				local182 += this.method170(local28, local200, this.aClass238_9.anInt6610) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass238_8 != null) {
				local195 = this.aClass238_8.method5576(arg0);
				local200 = this.aClass238_1.method5576(arg0);
				local187 = local187 * ((this.method170(local67, local200, this.aClass238_8.anInt6610) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray11[local195] != 0) {
					local200 = local176 + Static9.anIntArray14[local195];
					if (local200 < arg0) {
						Static9.anIntArray12[local200] += this.method170(Static9.anIntArray17[local195], local187 * Static9.anIntArray15[local195] >> 15, this.aClass238_2.anInt6610);
						Static9.anIntArray17[local195] += (local182 * Static9.anIntArray16[local195] >> 16) + Static9.anIntArray13[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass238_5 != null) {
			this.aClass238_5.method5577();
			this.aClass238_4.method5577();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass238_5.method5576(arg0);
				local352 = this.aClass238_4.method5576(arg0);
				if (local339) {
					local187 = this.aClass238_5.anInt6613 + ((this.aClass238_5.anInt6612 - this.aClass238_5.anInt6613) * local347 >> 8);
				} else {
					local187 = this.aClass238_5.anInt6613 + ((this.aClass238_5.anInt6612 - this.aClass238_5.anInt6613) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static9.anIntArray12[local200] = 0;
				}
			}
		}
		if (this.anInt175 > 0 && this.anInt172 > 0) {
			local182 = (int) ((double) this.anInt175 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static9.anIntArray12[local187] += Static9.anIntArray12[local187 - local182] * this.anInt172 / 100;
			}
		}
		if (this.aClass221_1.anIntArray354[0] > 0 || this.aClass221_1.anIntArray354[1] > 0) {
			this.aClass238_7.method5577();
			local182 = this.aClass238_7.method5576(arg0 + 1);
			local187 = this.aClass221_1.method5187(0, (float) local182 / 65536.0F);
			local195 = this.aClass221_1.method5187(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static9.anIntArray12[local200 + local187] * (long) Static341.anInt6175 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static9.anIntArray12[local200 + local187 - local519 - 1] * (long) Static341.anIntArrayArray48[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static9.anIntArray12[local200 - local549 - 1] * (long) Static341.anIntArrayArray48[1][local549] >> 16);
					}
					Static9.anIntArray12[local200] = local352;
					local182 = this.aClass238_7.method5576(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static9.anIntArray12[local200 + local187] * (long) Static341.anInt6175 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static9.anIntArray12[local200 + local187 - local519 - 1] * (long) Static341.anIntArrayArray48[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static9.anIntArray12[local200 - local549 - 1] * (long) Static341.anIntArrayArray48[1][local549] >> 16);
						}
						Static9.anIntArray12[local200] = local352;
						local182 = this.aClass238_7.method5576(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static9.anIntArray12[local200 + local187 - local519 - 1] * (long) Static341.anIntArrayArray48[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static9.anIntArray12[local200 - local549 - 1] * (long) Static341.anIntArrayArray48[1][local549] >> 16);
							}
							Static9.anIntArray12[local200] = local352;
							this.aClass238_7.method5576(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass221_1.method5187(0, (float) local182 / 65536.0F);
					local195 = this.aClass221_1.method5187(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static9.anIntArray12[local182] < -32768) {
				Static9.anIntArray12[local182] = -32768;
			}
			if (Static9.anIntArray12[local182] > 32767) {
				Static9.anIntArray12[local182] = 32767;
			}
		}
		return Static9.anIntArray12;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)I")
	private int method170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray7[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray9[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
