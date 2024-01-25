import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class224 {

	@OriginalMember(owner = "client!me", name = "d", descriptor = "[I")
	private static final int[] anIntArray473 = new int[32768];

	@OriginalMember(owner = "client!me", name = "k", descriptor = "[I")
	private static final int[] anIntArray474;

	@OriginalMember(owner = "client!me", name = "e", descriptor = "Lclient!qq;")
	private Class292 aClass292_1;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "Lclient!qq;")
	private Class292 aClass292_2;

	@OriginalMember(owner = "client!me", name = "i", descriptor = "Lclient!qq;")
	private Class292 aClass292_3;

	@OriginalMember(owner = "client!me", name = "j", descriptor = "Lclient!qq;")
	private Class292 aClass292_4;

	@OriginalMember(owner = "client!me", name = "m", descriptor = "Lclient!qq;")
	private Class292 aClass292_5;

	@OriginalMember(owner = "client!me", name = "n", descriptor = "Lclient!qq;")
	private Class292 aClass292_6;

	@OriginalMember(owner = "client!me", name = "p", descriptor = "Lclient!qq;")
	private Class292 aClass292_7;

	@OriginalMember(owner = "client!me", name = "q", descriptor = "Lclient!qq;")
	private Class292 aClass292_8;

	@OriginalMember(owner = "client!me", name = "r", descriptor = "Lclient!qq;")
	private Class292 aClass292_9;

	@OriginalMember(owner = "client!me", name = "t", descriptor = "Lclient!wba;")
	private Class372 aClass372_1;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "I")
	private int anInt5970 = 100;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "[I")
	private final int[] anIntArray472 = new int[5];

	@OriginalMember(owner = "client!me", name = "f", descriptor = "I")
	public int anInt5971 = 500;

	@OriginalMember(owner = "client!me", name = "o", descriptor = "I")
	private int anInt5973 = 0;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "[I")
	private final int[] anIntArray471 = new int[5];

	@OriginalMember(owner = "client!me", name = "h", descriptor = "I")
	public int anInt5972 = 0;

	@OriginalMember(owner = "client!me", name = "u", descriptor = "[I")
	private final int[] anIntArray477 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray473[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray474 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray474[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!ee;)V")
	public void method5284(@OriginalArg(0) Class5_Sub12 arg0) {
		this.aClass292_7 = new Class292();
		this.aClass292_7.method6916(arg0);
		this.aClass292_6 = new Class292();
		this.aClass292_6.method6916(arg0);
		@Pc(21) int local21 = arg0.method8645();
		if (local21 != 0) {
			arg0.anInt10154--;
			this.aClass292_9 = new Class292();
			this.aClass292_9.method6916(arg0);
			this.aClass292_2 = new Class292();
			this.aClass292_2.method6916(arg0);
		}
		local21 = arg0.method8645();
		if (local21 != 0) {
			arg0.anInt10154--;
			this.aClass292_4 = new Class292();
			this.aClass292_4.method6916(arg0);
			this.aClass292_8 = new Class292();
			this.aClass292_8.method6916(arg0);
		}
		local21 = arg0.method8645();
		if (local21 != 0) {
			arg0.anInt10154--;
			this.aClass292_5 = new Class292();
			this.aClass292_5.method6916(arg0);
			this.aClass292_3 = new Class292();
			this.aClass292_3.method6916(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method8614();
			if (local114 == 0) {
				break;
			}
			this.anIntArray477[local109] = local114;
			this.anIntArray471[local109] = arg0.method8646();
			this.anIntArray472[local109] = arg0.method8614();
		}
		this.anInt5973 = arg0.method8614();
		this.anInt5970 = arg0.method8614();
		this.anInt5971 = arg0.method8631();
		this.anInt5972 = arg0.method8631();
		this.aClass372_1 = new Class372();
		this.aClass292_1 = new Class292();
		this.aClass372_1.method8566(arg0, this.aClass292_1);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)[I")
	public int[] method5285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static655.method4108(Static346.anIntArray475, 0, arg0);
		if (arg1 < 10) {
			return Static346.anIntArray475;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass292_7.method6917();
		this.aClass292_6.method6917();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass292_9 != null) {
			this.aClass292_9.method6917();
			this.aClass292_2.method6917();
			local24 = (int) ((double) (this.aClass292_9.anInt7929 - this.aClass292_9.anInt7928) * 32.768D / local16);
			local26 = (int) ((double) this.aClass292_9.anInt7928 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass292_4 != null) {
			this.aClass292_4.method6917();
			this.aClass292_8.method6917();
			local63 = (int) ((double) (this.aClass292_4.anInt7929 - this.aClass292_4.anInt7928) * 32.768D / local16);
			local65 = (int) ((double) this.aClass292_4.anInt7928 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray477[local102] != 0) {
				Static346.anIntArray476[local102] = 0;
				Static346.anIntArray481[local102] = (int) ((double) this.anIntArray472[local102] * local16);
				Static346.anIntArray480[local102] = (this.anIntArray477[local102] << 14) / 100;
				Static346.anIntArray478[local102] = (int) ((double) (this.aClass292_7.anInt7929 - this.aClass292_7.anInt7928) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray471[local102]) / local16);
				Static346.anIntArray479[local102] = (int) ((double) this.aClass292_7.anInt7928 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass292_7.method6918(arg0);
			local187 = this.aClass292_6.method6918(arg0);
			if (this.aClass292_9 != null) {
				local195 = this.aClass292_9.method6918(arg0);
				local200 = this.aClass292_2.method6918(arg0);
				local182 += this.method5286(local28, local200, this.aClass292_9.anInt7927) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass292_4 != null) {
				local195 = this.aClass292_4.method6918(arg0);
				local200 = this.aClass292_8.method6918(arg0);
				local187 = local187 * ((this.method5286(local67, local200, this.aClass292_4.anInt7927) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray477[local195] != 0) {
					local200 = local176 + Static346.anIntArray481[local195];
					if (local200 < arg0) {
						Static346.anIntArray475[local200] += this.method5286(Static346.anIntArray476[local195], local187 * Static346.anIntArray480[local195] >> 15, this.aClass292_7.anInt7927);
						Static346.anIntArray476[local195] += (local182 * Static346.anIntArray478[local195] >> 16) + Static346.anIntArray479[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass292_5 != null) {
			this.aClass292_5.method6917();
			this.aClass292_3.method6917();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass292_5.method6918(arg0);
				local352 = this.aClass292_3.method6918(arg0);
				if (local339) {
					local187 = this.aClass292_5.anInt7928 + ((this.aClass292_5.anInt7929 - this.aClass292_5.anInt7928) * local347 >> 8);
				} else {
					local187 = this.aClass292_5.anInt7928 + ((this.aClass292_5.anInt7929 - this.aClass292_5.anInt7928) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static346.anIntArray475[local200] = 0;
				}
			}
		}
		if (this.anInt5973 > 0 && this.anInt5970 > 0) {
			local182 = (int) ((double) this.anInt5973 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static346.anIntArray475[local187] += Static346.anIntArray475[local187 - local182] * this.anInt5970 / 100;
			}
		}
		if (this.aClass372_1.anIntArray809[0] > 0 || this.aClass372_1.anIntArray809[1] > 0) {
			this.aClass292_1.method6917();
			local182 = this.aClass292_1.method6918(arg0 + 1);
			local187 = this.aClass372_1.method8564(0, (float) local182 / 65536.0F);
			local195 = this.aClass372_1.method8564(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static346.anIntArray475[local200 + local187] * (long) Static623.anInt10089 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static346.anIntArray475[local200 + local187 - local519 - 1] * (long) Static623.anIntArrayArray62[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static346.anIntArray475[local200 - local549 - 1] * (long) Static623.anIntArrayArray62[1][local549] >> 16);
					}
					Static346.anIntArray475[local200] = local352;
					local182 = this.aClass292_1.method6918(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static346.anIntArray475[local200 + local187] * (long) Static623.anInt10089 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static346.anIntArray475[local200 + local187 - local519 - 1] * (long) Static623.anIntArrayArray62[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static346.anIntArray475[local200 - local549 - 1] * (long) Static623.anIntArrayArray62[1][local549] >> 16);
						}
						Static346.anIntArray475[local200] = local352;
						local182 = this.aClass292_1.method6918(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static346.anIntArray475[local200 + local187 - local519 - 1] * (long) Static623.anIntArrayArray62[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static346.anIntArray475[local200 - local549 - 1] * (long) Static623.anIntArrayArray62[1][local549] >> 16);
							}
							Static346.anIntArray475[local200] = local352;
							this.aClass292_1.method6918(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass372_1.method8564(0, (float) local182 / 65536.0F);
					local195 = this.aClass372_1.method8564(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static346.anIntArray475[local182] < -32768) {
				Static346.anIntArray475[local182] = -32768;
			}
			if (Static346.anIntArray475[local182] > 32767) {
				Static346.anIntArray475[local182] = 32767;
			}
		}
		return Static346.anIntArray475;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(III)I")
	private int method5286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray474[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray473[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
