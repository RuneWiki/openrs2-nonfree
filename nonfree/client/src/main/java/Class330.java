import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class330 {

	@OriginalMember(owner = "client!si", name = "m", descriptor = "[I")
	private static final int[] anIntArray484 = new int[32768];

	@OriginalMember(owner = "client!si", name = "e", descriptor = "[I")
	private static final int[] anIntArray482;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "Lclient!ph;")
	private Class285 aClass285_1;

	@OriginalMember(owner = "client!si", name = "s", descriptor = "Lclient!jfa;")
	private Class186 aClass186_1;

	@OriginalMember(owner = "client!si", name = "h", descriptor = "Lclient!ph;")
	private Class285 aClass285_2;

	@OriginalMember(owner = "client!si", name = "v", descriptor = "Lclient!ph;")
	private Class285 aClass285_3;

	@OriginalMember(owner = "client!si", name = "b", descriptor = "Lclient!ph;")
	private Class285 aClass285_4;

	@OriginalMember(owner = "client!si", name = "w", descriptor = "Lclient!ph;")
	private Class285 aClass285_5;

	@OriginalMember(owner = "client!si", name = "x", descriptor = "Lclient!ph;")
	private Class285 aClass285_6;

	@OriginalMember(owner = "client!si", name = "n", descriptor = "Lclient!ph;")
	private Class285 aClass285_7;

	@OriginalMember(owner = "client!si", name = "u", descriptor = "Lclient!ph;")
	private Class285 aClass285_8;

	@OriginalMember(owner = "client!si", name = "c", descriptor = "Lclient!ph;")
	private Class285 aClass285_9;

	@OriginalMember(owner = "client!si", name = "d", descriptor = "[I")
	private final int[] anIntArray480 = new int[5];

	@OriginalMember(owner = "client!si", name = "j", descriptor = "I")
	private int anInt9363 = 0;

	@OriginalMember(owner = "client!si", name = "y", descriptor = "[I")
	private final int[] anIntArray483 = new int[5];

	@OriginalMember(owner = "client!si", name = "o", descriptor = "I")
	public int anInt9364 = 0;

	@OriginalMember(owner = "client!si", name = "t", descriptor = "I")
	private int anInt9365 = 100;

	@OriginalMember(owner = "client!si", name = "i", descriptor = "[I")
	private final int[] anIntArray481 = new int[5];

	@OriginalMember(owner = "client!si", name = "f", descriptor = "I")
	public int anInt9366 = 500;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray484[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray482 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray482[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!jc;)V")
	public void method8076(@OriginalArg(0) Class14_Sub21 arg0) {
		this.aClass285_3 = new Class285();
		this.aClass285_3.method6882(arg0);
		this.aClass285_8 = new Class285();
		this.aClass285_8.method6882(arg0);
		@Pc(21) int local21 = arg0.method7695(110);
		if (local21 != 0) {
			arg0.anInt8936--;
			this.aClass285_6 = new Class285();
			this.aClass285_6.method6882(arg0);
			this.aClass285_4 = new Class285();
			this.aClass285_4.method6882(arg0);
		}
		local21 = arg0.method7695(110);
		if (local21 != 0) {
			arg0.anInt8936--;
			this.aClass285_1 = new Class285();
			this.aClass285_1.method6882(arg0);
			this.aClass285_9 = new Class285();
			this.aClass285_9.method6882(arg0);
		}
		local21 = arg0.method7695(120);
		if (local21 != 0) {
			arg0.anInt8936--;
			this.aClass285_2 = new Class285();
			this.aClass285_2.method6882(arg0);
			this.aClass285_5 = new Class285();
			this.aClass285_5.method6882(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method7728(-129);
			if (local114 == 0) {
				break;
			}
			this.anIntArray481[local109] = local114;
			this.anIntArray483[local109] = arg0.method7753();
			this.anIntArray480[local109] = arg0.method7728(-129);
		}
		this.anInt9363 = arg0.method7728(-129);
		this.anInt9365 = arg0.method7728(-129);
		this.anInt9366 = arg0.method7717(-1978450544);
		this.anInt9364 = arg0.method7717(-1978450544);
		this.aClass186_1 = new Class186();
		this.aClass285_7 = new Class285();
		this.aClass186_1.method4694(arg0, this.aClass285_7);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)[I")
	public int[] method8078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static691.method83(Static560.anIntArray485, 0, arg0);
		if (arg1 < 10) {
			return Static560.anIntArray485;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass285_3.method6883();
		this.aClass285_8.method6883();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass285_6 != null) {
			this.aClass285_6.method6883();
			this.aClass285_4.method6883();
			local24 = (int) ((double) (this.aClass285_6.anInt7825 - this.aClass285_6.anInt7827) * 32.768D / local16);
			local26 = (int) ((double) this.aClass285_6.anInt7827 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass285_1 != null) {
			this.aClass285_1.method6883();
			this.aClass285_9.method6883();
			local63 = (int) ((double) (this.aClass285_1.anInt7825 - this.aClass285_1.anInt7827) * 32.768D / local16);
			local65 = (int) ((double) this.aClass285_1.anInt7827 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray481[local102] != 0) {
				Static560.anIntArray489[local102] = 0;
				Static560.anIntArray487[local102] = (int) ((double) this.anIntArray480[local102] * local16);
				Static560.anIntArray486[local102] = (this.anIntArray481[local102] << 14) / 100;
				Static560.anIntArray490[local102] = (int) ((double) (this.aClass285_3.anInt7825 - this.aClass285_3.anInt7827) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray483[local102]) / local16);
				Static560.anIntArray488[local102] = (int) ((double) this.aClass285_3.anInt7827 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass285_3.method6880(arg0);
			local187 = this.aClass285_8.method6880(arg0);
			if (this.aClass285_6 != null) {
				local195 = this.aClass285_6.method6880(arg0);
				local200 = this.aClass285_4.method6880(arg0);
				local182 += this.method8079(local28, local200, this.aClass285_6.anInt7824) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass285_1 != null) {
				local195 = this.aClass285_1.method6880(arg0);
				local200 = this.aClass285_9.method6880(arg0);
				local187 = local187 * ((this.method8079(local67, local200, this.aClass285_1.anInt7824) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray481[local195] != 0) {
					local200 = local176 + Static560.anIntArray487[local195];
					if (local200 < arg0) {
						Static560.anIntArray485[local200] += this.method8079(Static560.anIntArray489[local195], local187 * Static560.anIntArray486[local195] >> 15, this.aClass285_3.anInt7824);
						Static560.anIntArray489[local195] += (local182 * Static560.anIntArray490[local195] >> 16) + Static560.anIntArray488[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass285_2 != null) {
			this.aClass285_2.method6883();
			this.aClass285_5.method6883();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass285_2.method6880(arg0);
				local352 = this.aClass285_5.method6880(arg0);
				if (local339) {
					local187 = this.aClass285_2.anInt7827 + ((this.aClass285_2.anInt7825 - this.aClass285_2.anInt7827) * local347 >> 8);
				} else {
					local187 = this.aClass285_2.anInt7827 + ((this.aClass285_2.anInt7825 - this.aClass285_2.anInt7827) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static560.anIntArray485[local200] = 0;
				}
			}
		}
		if (this.anInt9363 > 0 && this.anInt9365 > 0) {
			local182 = (int) ((double) this.anInt9363 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static560.anIntArray485[local187] += Static560.anIntArray485[local187 - local182] * this.anInt9365 / 100;
			}
		}
		if (this.aClass186_1.anIntArray287[0] > 0 || this.aClass186_1.anIntArray287[1] > 0) {
			this.aClass285_7.method6883();
			local182 = this.aClass285_7.method6880(arg0 + 1);
			local187 = this.aClass186_1.method4693(0, (float) local182 / 65536.0F);
			local195 = this.aClass186_1.method4693(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static560.anIntArray485[local200 + local187] * (long) Static278.anInt5151 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static560.anIntArray485[local200 + local187 - local519 - 1] * (long) Static278.anIntArrayArray35[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static560.anIntArray485[local200 - local549 - 1] * (long) Static278.anIntArrayArray35[1][local549] >> 16);
					}
					Static560.anIntArray485[local200] = local352;
					local182 = this.aClass285_7.method6880(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static560.anIntArray485[local200 + local187] * (long) Static278.anInt5151 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static560.anIntArray485[local200 + local187 - local519 - 1] * (long) Static278.anIntArrayArray35[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static560.anIntArray485[local200 - local549 - 1] * (long) Static278.anIntArrayArray35[1][local549] >> 16);
						}
						Static560.anIntArray485[local200] = local352;
						local182 = this.aClass285_7.method6880(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static560.anIntArray485[local200 + local187 - local519 - 1] * (long) Static278.anIntArrayArray35[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static560.anIntArray485[local200 - local549 - 1] * (long) Static278.anIntArrayArray35[1][local549] >> 16);
							}
							Static560.anIntArray485[local200] = local352;
							this.aClass285_7.method6880(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass186_1.method4693(0, (float) local182 / 65536.0F);
					local195 = this.aClass186_1.method4693(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static560.anIntArray485[local182] < -32768) {
				Static560.anIntArray485[local182] = -32768;
			}
			if (Static560.anIntArray485[local182] > 32767) {
				Static560.anIntArray485[local182] = 32767;
			}
		}
		return Static560.anIntArray485;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(III)I")
	private int method8079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray482[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray484[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
