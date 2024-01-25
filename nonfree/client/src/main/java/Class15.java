import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class15 {

	@OriginalMember(owner = "client!aj", name = "r", descriptor = "[I")
	private static final int[] anIntArray13 = new int[32768];

	@OriginalMember(owner = "client!aj", name = "w", descriptor = "[I")
	private static final int[] anIntArray10;

	@OriginalMember(owner = "client!aj", name = "y", descriptor = "Lclient!mb;")
	private Class228 aClass228_1;

	@OriginalMember(owner = "client!aj", name = "v", descriptor = "Lclient!mb;")
	private Class228 aClass228_2;

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "Lclient!mb;")
	private Class228 aClass228_3;

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "Lclient!cr;")
	private Class65 aClass65_1;

	@OriginalMember(owner = "client!aj", name = "n", descriptor = "Lclient!mb;")
	private Class228 aClass228_4;

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "Lclient!mb;")
	private Class228 aClass228_5;

	@OriginalMember(owner = "client!aj", name = "o", descriptor = "Lclient!mb;")
	private Class228 aClass228_6;

	@OriginalMember(owner = "client!aj", name = "u", descriptor = "Lclient!mb;")
	private Class228 aClass228_7;

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "Lclient!mb;")
	private Class228 aClass228_8;

	@OriginalMember(owner = "client!aj", name = "p", descriptor = "Lclient!mb;")
	private Class228 aClass228_9;

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
	public int anInt179 = 0;

	@OriginalMember(owner = "client!aj", name = "x", descriptor = "I")
	private int anInt181 = 0;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
	public int anInt180 = 500;

	@OriginalMember(owner = "client!aj", name = "t", descriptor = "[I")
	private final int[] anIntArray14 = new int[5];

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
	private int anInt182 = 100;

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "[I")
	private final int[] anIntArray15 = new int[5];

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "[I")
	private final int[] anIntArray12 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray13[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray10 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray10[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)[I")
	public int[] method228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static693.method8321(Static16.anIntArray11, 0, arg0);
		if (arg1 < 10) {
			return Static16.anIntArray11;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass228_8.method5151();
		this.aClass228_4.method5151();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass228_6 != null) {
			this.aClass228_6.method5151();
			this.aClass228_1.method5151();
			local24 = (int) ((double) (this.aClass228_6.anInt5759 - this.aClass228_6.anInt5758) * 32.768D / local16);
			local26 = (int) ((double) this.aClass228_6.anInt5758 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass228_3 != null) {
			this.aClass228_3.method5151();
			this.aClass228_9.method5151();
			local63 = (int) ((double) (this.aClass228_3.anInt5759 - this.aClass228_3.anInt5758) * 32.768D / local16);
			local65 = (int) ((double) this.aClass228_3.anInt5758 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray14[local102] != 0) {
				Static16.anIntArray19[local102] = 0;
				Static16.anIntArray17[local102] = (int) ((double) this.anIntArray12[local102] * local16);
				Static16.anIntArray16[local102] = (this.anIntArray14[local102] << 14) / 100;
				Static16.anIntArray20[local102] = (int) ((double) (this.aClass228_8.anInt5759 - this.aClass228_8.anInt5758) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray15[local102]) / local16);
				Static16.anIntArray18[local102] = (int) ((double) this.aClass228_8.anInt5758 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass228_8.method5154(arg0);
			local187 = this.aClass228_4.method5154(arg0);
			if (this.aClass228_6 != null) {
				local195 = this.aClass228_6.method5154(arg0);
				local200 = this.aClass228_1.method5154(arg0);
				local182 += this.method230(local28, local200, this.aClass228_6.anInt5760) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass228_3 != null) {
				local195 = this.aClass228_3.method5154(arg0);
				local200 = this.aClass228_9.method5154(arg0);
				local187 = local187 * ((this.method230(local67, local200, this.aClass228_3.anInt5760) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray14[local195] != 0) {
					local200 = local176 + Static16.anIntArray17[local195];
					if (local200 < arg0) {
						Static16.anIntArray11[local200] += this.method230(Static16.anIntArray19[local195], local187 * Static16.anIntArray16[local195] >> 15, this.aClass228_8.anInt5760);
						Static16.anIntArray19[local195] += (local182 * Static16.anIntArray20[local195] >> 16) + Static16.anIntArray18[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass228_5 != null) {
			this.aClass228_5.method5151();
			this.aClass228_7.method5151();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass228_5.method5154(arg0);
				local352 = this.aClass228_7.method5154(arg0);
				if (local339) {
					local187 = this.aClass228_5.anInt5758 + ((this.aClass228_5.anInt5759 - this.aClass228_5.anInt5758) * local347 >> 8);
				} else {
					local187 = this.aClass228_5.anInt5758 + ((this.aClass228_5.anInt5759 - this.aClass228_5.anInt5758) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static16.anIntArray11[local200] = 0;
				}
			}
		}
		if (this.anInt181 > 0 && this.anInt182 > 0) {
			local182 = (int) ((double) this.anInt181 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static16.anIntArray11[local187] += Static16.anIntArray11[local187 - local182] * this.anInt182 / 100;
			}
		}
		if (this.aClass65_1.anIntArray71[0] > 0 || this.aClass65_1.anIntArray71[1] > 0) {
			this.aClass228_2.method5151();
			local182 = this.aClass228_2.method5154(arg0 + 1);
			local187 = this.aClass65_1.method1294(0, (float) local182 / 65536.0F);
			local195 = this.aClass65_1.method1294(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static16.anIntArray11[local200 + local187] * (long) Static79.anInt1385 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static16.anIntArray11[local200 + local187 - local519 - 1] * (long) Static79.anIntArrayArray9[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static16.anIntArray11[local200 - local549 - 1] * (long) Static79.anIntArrayArray9[1][local549] >> 16);
					}
					Static16.anIntArray11[local200] = local352;
					local182 = this.aClass228_2.method5154(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static16.anIntArray11[local200 + local187] * (long) Static79.anInt1385 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static16.anIntArray11[local200 + local187 - local519 - 1] * (long) Static79.anIntArrayArray9[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static16.anIntArray11[local200 - local549 - 1] * (long) Static79.anIntArrayArray9[1][local549] >> 16);
						}
						Static16.anIntArray11[local200] = local352;
						local182 = this.aClass228_2.method5154(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static16.anIntArray11[local200 + local187 - local519 - 1] * (long) Static79.anIntArrayArray9[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static16.anIntArray11[local200 - local549 - 1] * (long) Static79.anIntArrayArray9[1][local549] >> 16);
							}
							Static16.anIntArray11[local200] = local352;
							this.aClass228_2.method5154(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass65_1.method1294(0, (float) local182 / 65536.0F);
					local195 = this.aClass65_1.method1294(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static16.anIntArray11[local182] < -32768) {
				Static16.anIntArray11[local182] = -32768;
			}
			if (Static16.anIntArray11[local182] > 32767) {
				Static16.anIntArray11[local182] = 32767;
			}
		}
		return Static16.anIntArray11;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!wq;)V")
	public void method229(@OriginalArg(0) Class5_Sub36 arg0) {
		this.aClass228_8 = new Class228();
		this.aClass228_8.method5152(arg0);
		this.aClass228_4 = new Class228();
		this.aClass228_4.method5152(arg0);
		@Pc(21) int local21 = arg0.method7291();
		if (local21 != 0) {
			arg0.anInt8456--;
			this.aClass228_6 = new Class228();
			this.aClass228_6.method5152(arg0);
			this.aClass228_1 = new Class228();
			this.aClass228_1.method5152(arg0);
		}
		local21 = arg0.method7291();
		if (local21 != 0) {
			arg0.anInt8456--;
			this.aClass228_3 = new Class228();
			this.aClass228_3.method5152(arg0);
			this.aClass228_9 = new Class228();
			this.aClass228_9.method5152(arg0);
		}
		local21 = arg0.method7291();
		if (local21 != 0) {
			arg0.anInt8456--;
			this.aClass228_5 = new Class228();
			this.aClass228_5.method5152(arg0);
			this.aClass228_7 = new Class228();
			this.aClass228_7.method5152(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method7306();
			if (local114 == 0) {
				break;
			}
			this.anIntArray14[local109] = local114;
			this.anIntArray15[local109] = arg0.method7273();
			this.anIntArray12[local109] = arg0.method7306();
		}
		this.anInt181 = arg0.method7306();
		this.anInt182 = arg0.method7306();
		this.anInt180 = arg0.method7333();
		this.anInt179 = arg0.method7333();
		this.aClass65_1 = new Class65();
		this.aClass228_2 = new Class228();
		this.aClass65_1.method1290(arg0, this.aClass228_2);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)I")
	private int method230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray10[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray13[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
