import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class230 {

	@OriginalMember(owner = "client!lo", name = "j", descriptor = "[I")
	private static final int[] anIntArray406 = new int[32768];

	@OriginalMember(owner = "client!lo", name = "k", descriptor = "[I")
	private static final int[] anIntArray405;

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "Lclient!ica;")
	private Class171 aClass171_1;

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "Lclient!ica;")
	private Class171 aClass171_2;

	@OriginalMember(owner = "client!lo", name = "m", descriptor = "Lclient!ica;")
	private Class171 aClass171_3;

	@OriginalMember(owner = "client!lo", name = "u", descriptor = "Lclient!ica;")
	private Class171 aClass171_4;

	@OriginalMember(owner = "client!lo", name = "s", descriptor = "Lclient!ica;")
	private Class171 aClass171_5;

	@OriginalMember(owner = "client!lo", name = "y", descriptor = "Lclient!ica;")
	private Class171 aClass171_6;

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "Lclient!ica;")
	private Class171 aClass171_7;

	@OriginalMember(owner = "client!lo", name = "l", descriptor = "Lclient!ica;")
	private Class171 aClass171_8;

	@OriginalMember(owner = "client!lo", name = "v", descriptor = "Lclient!cv;")
	private Class72 aClass72_1;

	@OriginalMember(owner = "client!lo", name = "x", descriptor = "Lclient!ica;")
	private Class171 aClass171_9;

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "[I")
	private final int[] anIntArray403 = new int[5];

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
	private int anInt5951 = 100;

	@OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
	public int anInt5953 = 0;

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "[I")
	private final int[] anIntArray408 = new int[5];

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
	private int anInt5952 = 0;

	@OriginalMember(owner = "client!lo", name = "w", descriptor = "[I")
	private final int[] anIntArray404 = new int[5];

	@OriginalMember(owner = "client!lo", name = "n", descriptor = "I")
	public int anInt5954 = 500;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray406[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray405 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray405[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)[I")
	public int[] method5322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static728.method272(Static374.anIntArray407, 0, arg0);
		if (arg1 < 10) {
			return Static374.anIntArray407;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass171_8.method3697();
		this.aClass171_7.method3697();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass171_3 != null) {
			this.aClass171_3.method3697();
			this.aClass171_6.method3697();
			local24 = (int) ((double) (this.aClass171_3.anInt4061 - this.aClass171_3.anInt4063) * 32.768D / local16);
			local26 = (int) ((double) this.aClass171_3.anInt4063 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass171_4 != null) {
			this.aClass171_4.method3697();
			this.aClass171_2.method3697();
			local63 = (int) ((double) (this.aClass171_4.anInt4061 - this.aClass171_4.anInt4063) * 32.768D / local16);
			local65 = (int) ((double) this.aClass171_4.anInt4063 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray408[local102] != 0) {
				Static374.anIntArray410[local102] = 0;
				Static374.anIntArray409[local102] = (int) ((double) this.anIntArray404[local102] * local16);
				Static374.anIntArray413[local102] = (this.anIntArray408[local102] << 14) / 100;
				Static374.anIntArray412[local102] = (int) ((double) (this.aClass171_8.anInt4061 - this.aClass171_8.anInt4063) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray403[local102]) / local16);
				Static374.anIntArray411[local102] = (int) ((double) this.aClass171_8.anInt4063 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass171_8.method3698(arg0);
			local187 = this.aClass171_7.method3698(arg0);
			if (this.aClass171_3 != null) {
				local195 = this.aClass171_3.method3698(arg0);
				local200 = this.aClass171_6.method3698(arg0);
				local182 += this.method5325(local28, local200, this.aClass171_3.anInt4060) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass171_4 != null) {
				local195 = this.aClass171_4.method3698(arg0);
				local200 = this.aClass171_2.method3698(arg0);
				local187 = local187 * ((this.method5325(local67, local200, this.aClass171_4.anInt4060) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray408[local195] != 0) {
					local200 = local176 + Static374.anIntArray409[local195];
					if (local200 < arg0) {
						Static374.anIntArray407[local200] += this.method5325(Static374.anIntArray410[local195], local187 * Static374.anIntArray413[local195] >> 15, this.aClass171_8.anInt4060);
						Static374.anIntArray410[local195] += (local182 * Static374.anIntArray412[local195] >> 16) + Static374.anIntArray411[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass171_1 != null) {
			this.aClass171_1.method3697();
			this.aClass171_5.method3697();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass171_1.method3698(arg0);
				local352 = this.aClass171_5.method3698(arg0);
				if (local339) {
					local187 = this.aClass171_1.anInt4063 + ((this.aClass171_1.anInt4061 - this.aClass171_1.anInt4063) * local347 >> 8);
				} else {
					local187 = this.aClass171_1.anInt4063 + ((this.aClass171_1.anInt4061 - this.aClass171_1.anInt4063) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static374.anIntArray407[local200] = 0;
				}
			}
		}
		if (this.anInt5952 > 0 && this.anInt5951 > 0) {
			local182 = (int) ((double) this.anInt5952 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static374.anIntArray407[local187] += Static374.anIntArray407[local187 - local182] * this.anInt5951 / 100;
			}
		}
		if (this.aClass72_1.anIntArray130[0] > 0 || this.aClass72_1.anIntArray130[1] > 0) {
			this.aClass171_9.method3697();
			local182 = this.aClass171_9.method3698(arg0 + 1);
			local187 = this.aClass72_1.method1525(0, (float) local182 / 65536.0F);
			local195 = this.aClass72_1.method1525(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static374.anIntArray407[local200 + local187] * (long) Static99.anInt1773 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static374.anIntArray407[local200 + local187 - local519 - 1] * (long) Static99.anIntArrayArray9[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static374.anIntArray407[local200 - local549 - 1] * (long) Static99.anIntArrayArray9[1][local549] >> 16);
					}
					Static374.anIntArray407[local200] = local352;
					local182 = this.aClass171_9.method3698(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static374.anIntArray407[local200 + local187] * (long) Static99.anInt1773 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static374.anIntArray407[local200 + local187 - local519 - 1] * (long) Static99.anIntArrayArray9[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static374.anIntArray407[local200 - local549 - 1] * (long) Static99.anIntArrayArray9[1][local549] >> 16);
						}
						Static374.anIntArray407[local200] = local352;
						local182 = this.aClass171_9.method3698(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static374.anIntArray407[local200 + local187 - local519 - 1] * (long) Static99.anIntArrayArray9[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static374.anIntArray407[local200 - local549 - 1] * (long) Static99.anIntArrayArray9[1][local549] >> 16);
							}
							Static374.anIntArray407[local200] = local352;
							this.aClass171_9.method3698(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass72_1.method1525(0, (float) local182 / 65536.0F);
					local195 = this.aClass72_1.method1525(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static374.anIntArray407[local182] < -32768) {
				Static374.anIntArray407[local182] = -32768;
			}
			if (Static374.anIntArray407[local182] > 32767) {
				Static374.anIntArray407[local182] = 32767;
			}
		}
		return Static374.anIntArray407;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!et;)V")
	public void method5324(@OriginalArg(0) Class2_Sub20 arg0) {
		this.aClass171_8 = new Class171();
		this.aClass171_8.method3695(arg0);
		this.aClass171_7 = new Class171();
		this.aClass171_7.method3695(arg0);
		@Pc(21) int local21 = arg0.method8581(-17416);
		if (local21 != 0) {
			arg0.anInt9723--;
			this.aClass171_3 = new Class171();
			this.aClass171_3.method3695(arg0);
			this.aClass171_6 = new Class171();
			this.aClass171_6.method3695(arg0);
		}
		local21 = arg0.method8581(-17416);
		if (local21 != 0) {
			arg0.anInt9723--;
			this.aClass171_4 = new Class171();
			this.aClass171_4.method3695(arg0);
			this.aClass171_2 = new Class171();
			this.aClass171_2.method3695(arg0);
		}
		local21 = arg0.method8581(-17416);
		if (local21 != 0) {
			arg0.anInt9723--;
			this.aClass171_1 = new Class171();
			this.aClass171_1.method3695(arg0);
			this.aClass171_5 = new Class171();
			this.aClass171_5.method3695(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method8592(255);
			if (local114 == 0) {
				break;
			}
			this.anIntArray408[local109] = local114;
			this.anIntArray403[local109] = arg0.method8560();
			this.anIntArray404[local109] = arg0.method8592(255);
		}
		this.anInt5952 = arg0.method8592(255);
		this.anInt5951 = arg0.method8592(255);
		this.anInt5954 = arg0.method8575();
		this.anInt5953 = arg0.method8575();
		this.aClass72_1 = new Class72();
		this.aClass171_9 = new Class171();
		this.aClass72_1.method1521(arg0, this.aClass171_9);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(III)I")
	private int method5325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray405[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray406[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
