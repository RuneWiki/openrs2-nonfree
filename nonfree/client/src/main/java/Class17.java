import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class17 {

	@OriginalMember(owner = "client!as", name = "g", descriptor = "[I")
	private static final int[] anIntArray35 = new int[32768];

	@OriginalMember(owner = "client!as", name = "h", descriptor = "[I")
	private static final int[] anIntArray36;

	@OriginalMember(owner = "client!as", name = "d", descriptor = "Lclient!dw;")
	private Class75 aClass75_1;

	@OriginalMember(owner = "client!as", name = "i", descriptor = "Lclient!ir;")
	private Class142 aClass142_1;

	@OriginalMember(owner = "client!as", name = "j", descriptor = "Lclient!ir;")
	private Class142 aClass142_2;

	@OriginalMember(owner = "client!as", name = "k", descriptor = "Lclient!ir;")
	private Class142 aClass142_3;

	@OriginalMember(owner = "client!as", name = "l", descriptor = "Lclient!ir;")
	private Class142 aClass142_4;

	@OriginalMember(owner = "client!as", name = "n", descriptor = "Lclient!ir;")
	private Class142 aClass142_5;

	@OriginalMember(owner = "client!as", name = "p", descriptor = "Lclient!ir;")
	private Class142 aClass142_6;

	@OriginalMember(owner = "client!as", name = "q", descriptor = "Lclient!ir;")
	private Class142 aClass142_7;

	@OriginalMember(owner = "client!as", name = "t", descriptor = "Lclient!ir;")
	private Class142 aClass142_8;

	@OriginalMember(owner = "client!as", name = "x", descriptor = "Lclient!ir;")
	private Class142 aClass142_9;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "I")
	public int anInt419 = 0;

	@OriginalMember(owner = "client!as", name = "f", descriptor = "[I")
	private final int[] anIntArray34 = new int[5];

	@OriginalMember(owner = "client!as", name = "m", descriptor = "[I")
	private final int[] anIntArray37 = new int[5];

	@OriginalMember(owner = "client!as", name = "o", descriptor = "[I")
	private final int[] anIntArray38 = new int[5];

	@OriginalMember(owner = "client!as", name = "b", descriptor = "I")
	private int anInt420 = 100;

	@OriginalMember(owner = "client!as", name = "s", descriptor = "I")
	private int anInt422 = 0;

	@OriginalMember(owner = "client!as", name = "c", descriptor = "I")
	public int anInt421 = 500;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray35[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray36 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray36[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(III)I")
	private int method593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray36[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray35[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(II)[I")
	public int[] method595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static556.method7039(Static21.anIntArray33, 0, arg0);
		if (arg1 < 10) {
			return Static21.anIntArray33;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass142_2.method3852();
		this.aClass142_1.method3852();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass142_3 != null) {
			this.aClass142_3.method3852();
			this.aClass142_8.method3852();
			local24 = (int) ((double) (this.aClass142_3.anInt4111 - this.aClass142_3.anInt4109) * 32.768D / local16);
			local26 = (int) ((double) this.aClass142_3.anInt4109 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass142_5 != null) {
			this.aClass142_5.method3852();
			this.aClass142_9.method3852();
			local63 = (int) ((double) (this.aClass142_5.anInt4111 - this.aClass142_5.anInt4109) * 32.768D / local16);
			local65 = (int) ((double) this.aClass142_5.anInt4109 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray38[local102] != 0) {
				Static21.anIntArray39[local102] = 0;
				Static21.anIntArray40[local102] = (int) ((double) this.anIntArray37[local102] * local16);
				Static21.anIntArray43[local102] = (this.anIntArray38[local102] << 14) / 100;
				Static21.anIntArray42[local102] = (int) ((double) (this.aClass142_2.anInt4111 - this.aClass142_2.anInt4109) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray34[local102]) / local16);
				Static21.anIntArray41[local102] = (int) ((double) this.aClass142_2.anInt4109 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass142_2.method3853(arg0);
			local187 = this.aClass142_1.method3853(arg0);
			if (this.aClass142_3 != null) {
				local195 = this.aClass142_3.method3853(arg0);
				local200 = this.aClass142_8.method3853(arg0);
				local182 += this.method593(local28, local200, this.aClass142_3.anInt4112) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass142_5 != null) {
				local195 = this.aClass142_5.method3853(arg0);
				local200 = this.aClass142_9.method3853(arg0);
				local187 = local187 * ((this.method593(local67, local200, this.aClass142_5.anInt4112) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray38[local195] != 0) {
					local200 = local176 + Static21.anIntArray40[local195];
					if (local200 < arg0) {
						Static21.anIntArray33[local200] += this.method593(Static21.anIntArray39[local195], local187 * Static21.anIntArray43[local195] >> 15, this.aClass142_2.anInt4112);
						Static21.anIntArray39[local195] += (local182 * Static21.anIntArray42[local195] >> 16) + Static21.anIntArray41[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass142_7 != null) {
			this.aClass142_7.method3852();
			this.aClass142_6.method3852();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass142_7.method3853(arg0);
				local352 = this.aClass142_6.method3853(arg0);
				if (local339) {
					local187 = this.aClass142_7.anInt4109 + ((this.aClass142_7.anInt4111 - this.aClass142_7.anInt4109) * local347 >> 8);
				} else {
					local187 = this.aClass142_7.anInt4109 + ((this.aClass142_7.anInt4111 - this.aClass142_7.anInt4109) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static21.anIntArray33[local200] = 0;
				}
			}
		}
		if (this.anInt422 > 0 && this.anInt420 > 0) {
			local182 = (int) ((double) this.anInt422 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static21.anIntArray33[local187] += Static21.anIntArray33[local187 - local182] * this.anInt420 / 100;
			}
		}
		if (this.aClass75_1.anIntArray149[0] > 0 || this.aClass75_1.anIntArray149[1] > 0) {
			this.aClass142_4.method3852();
			local182 = this.aClass142_4.method3853(arg0 + 1);
			local187 = this.aClass75_1.method1979(0, (float) local182 / 65536.0F);
			local195 = this.aClass75_1.method1979(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static21.anIntArray33[local200 + local187] * (long) Static95.anInt2058 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static21.anIntArray33[local200 + local187 - local519 - 1] * (long) Static95.anIntArrayArray21[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static21.anIntArray33[local200 - local549 - 1] * (long) Static95.anIntArrayArray21[1][local549] >> 16);
					}
					Static21.anIntArray33[local200] = local352;
					local182 = this.aClass142_4.method3853(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static21.anIntArray33[local200 + local187] * (long) Static95.anInt2058 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static21.anIntArray33[local200 + local187 - local519 - 1] * (long) Static95.anIntArrayArray21[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static21.anIntArray33[local200 - local549 - 1] * (long) Static95.anIntArrayArray21[1][local549] >> 16);
						}
						Static21.anIntArray33[local200] = local352;
						local182 = this.aClass142_4.method3853(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static21.anIntArray33[local200 + local187 - local519 - 1] * (long) Static95.anIntArrayArray21[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static21.anIntArray33[local200 - local549 - 1] * (long) Static95.anIntArrayArray21[1][local549] >> 16);
							}
							Static21.anIntArray33[local200] = local352;
							this.aClass142_4.method3853(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass75_1.method1979(0, (float) local182 / 65536.0F);
					local195 = this.aClass75_1.method1979(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static21.anIntArray33[local182] < -32768) {
				Static21.anIntArray33[local182] = -32768;
			}
			if (Static21.anIntArray33[local182] > 32767) {
				Static21.anIntArray33[local182] = 32767;
			}
		}
		return Static21.anIntArray33;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!os;)V")
	public void method596(@OriginalArg(0) Class1_Sub17 arg0) {
		this.aClass142_2 = new Class142();
		this.aClass142_2.method3851(arg0);
		this.aClass142_1 = new Class142();
		this.aClass142_1.method3851(arg0);
		@Pc(21) int local21 = arg0.method4487();
		if (local21 != 0) {
			arg0.anInt4872--;
			this.aClass142_3 = new Class142();
			this.aClass142_3.method3851(arg0);
			this.aClass142_8 = new Class142();
			this.aClass142_8.method3851(arg0);
		}
		local21 = arg0.method4487();
		if (local21 != 0) {
			arg0.anInt4872--;
			this.aClass142_5 = new Class142();
			this.aClass142_5.method3851(arg0);
			this.aClass142_9 = new Class142();
			this.aClass142_9.method3851(arg0);
		}
		local21 = arg0.method4487();
		if (local21 != 0) {
			arg0.anInt4872--;
			this.aClass142_7 = new Class142();
			this.aClass142_7.method3851(arg0);
			this.aClass142_6 = new Class142();
			this.aClass142_6.method3851(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method4480();
			if (local114 == 0) {
				break;
			}
			this.anIntArray38[local109] = local114;
			this.anIntArray34[local109] = arg0.method4477();
			this.anIntArray37[local109] = arg0.method4480();
		}
		this.anInt422 = arg0.method4480();
		this.anInt420 = arg0.method4480();
		this.anInt421 = arg0.method4494();
		this.anInt419 = arg0.method4494();
		this.aClass75_1 = new Class75();
		this.aClass142_4 = new Class142();
		this.aClass75_1.method1975(arg0, this.aClass142_4);
	}
}
