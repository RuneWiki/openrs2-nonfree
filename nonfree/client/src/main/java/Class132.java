import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iaa")
public final class Class132 {

	@OriginalMember(owner = "client!iaa", name = "f", descriptor = "[I")
	private static final int[] anIntArray324 = new int[32768];

	@OriginalMember(owner = "client!iaa", name = "s", descriptor = "[I")
	private static final int[] anIntArray327;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "Lclient!kh;")
	private Class164 aClass164_1;

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "Lclient!oaa;")
	private Class212 aClass212_1;

	@OriginalMember(owner = "client!iaa", name = "e", descriptor = "Lclient!oaa;")
	private Class212 aClass212_2;

	@OriginalMember(owner = "client!iaa", name = "g", descriptor = "Lclient!oaa;")
	private Class212 aClass212_3;

	@OriginalMember(owner = "client!iaa", name = "l", descriptor = "Lclient!oaa;")
	private Class212 aClass212_4;

	@OriginalMember(owner = "client!iaa", name = "m", descriptor = "Lclient!oaa;")
	private Class212 aClass212_5;

	@OriginalMember(owner = "client!iaa", name = "n", descriptor = "Lclient!oaa;")
	private Class212 aClass212_6;

	@OriginalMember(owner = "client!iaa", name = "p", descriptor = "Lclient!oaa;")
	private Class212 aClass212_7;

	@OriginalMember(owner = "client!iaa", name = "q", descriptor = "Lclient!oaa;")
	private Class212 aClass212_8;

	@OriginalMember(owner = "client!iaa", name = "r", descriptor = "Lclient!oaa;")
	private Class212 aClass212_9;

	@OriginalMember(owner = "client!iaa", name = "d", descriptor = "I")
	public int anInt3875 = 0;

	@OriginalMember(owner = "client!iaa", name = "h", descriptor = "I")
	private int anInt3876 = 0;

	@OriginalMember(owner = "client!iaa", name = "i", descriptor = "[I")
	private final int[] anIntArray325 = new int[5];

	@OriginalMember(owner = "client!iaa", name = "j", descriptor = "I")
	private int anInt3877 = 100;

	@OriginalMember(owner = "client!iaa", name = "o", descriptor = "I")
	public int anInt3878 = 500;

	@OriginalMember(owner = "client!iaa", name = "t", descriptor = "[I")
	private final int[] anIntArray328 = new int[5];

	@OriginalMember(owner = "client!iaa", name = "k", descriptor = "[I")
	private final int[] anIntArray326 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray324[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray327 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray327[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lclient!ge;)V")
	public void method3428(@OriginalArg(0) Class1_Sub6 arg0) {
		this.aClass212_1 = new Class212();
		this.aClass212_1.method5098(arg0);
		this.aClass212_7 = new Class212();
		this.aClass212_7.method5098(arg0);
		@Pc(21) int local21 = arg0.method3922();
		if (local21 != 0) {
			arg0.anInt4555--;
			this.aClass212_9 = new Class212();
			this.aClass212_9.method5098(arg0);
			this.aClass212_6 = new Class212();
			this.aClass212_6.method5098(arg0);
		}
		local21 = arg0.method3922();
		if (local21 != 0) {
			arg0.anInt4555--;
			this.aClass212_2 = new Class212();
			this.aClass212_2.method5098(arg0);
			this.aClass212_8 = new Class212();
			this.aClass212_8.method5098(arg0);
		}
		local21 = arg0.method3922();
		if (local21 != 0) {
			arg0.anInt4555--;
			this.aClass212_5 = new Class212();
			this.aClass212_5.method5098(arg0);
			this.aClass212_3 = new Class212();
			this.aClass212_3.method5098(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method3936();
			if (local114 == 0) {
				break;
			}
			this.anIntArray326[local109] = local114;
			this.anIntArray328[local109] = arg0.method3946();
			this.anIntArray325[local109] = arg0.method3936();
		}
		this.anInt3876 = arg0.method3936();
		this.anInt3877 = arg0.method3936();
		this.anInt3878 = arg0.method3967();
		this.anInt3875 = arg0.method3967();
		this.aClass164_1 = new Class164();
		this.aClass212_4 = new Class212();
		this.aClass164_1.method4224(arg0, this.aClass212_4);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)[I")
	public int[] method3429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static551.method3489(Static199.anIntArray323, 0, arg0);
		if (arg1 < 10) {
			return Static199.anIntArray323;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass212_1.method5100();
		this.aClass212_7.method5100();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass212_9 != null) {
			this.aClass212_9.method5100();
			this.aClass212_6.method5100();
			local24 = (int) ((double) (this.aClass212_9.anInt6018 - this.aClass212_9.anInt6017) * 32.768D / local16);
			local26 = (int) ((double) this.aClass212_9.anInt6017 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass212_2 != null) {
			this.aClass212_2.method5100();
			this.aClass212_8.method5100();
			local63 = (int) ((double) (this.aClass212_2.anInt6018 - this.aClass212_2.anInt6017) * 32.768D / local16);
			local65 = (int) ((double) this.aClass212_2.anInt6017 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray326[local102] != 0) {
				Static199.anIntArray329[local102] = 0;
				Static199.anIntArray330[local102] = (int) ((double) this.anIntArray325[local102] * local16);
				Static199.anIntArray332[local102] = (this.anIntArray326[local102] << 14) / 100;
				Static199.anIntArray333[local102] = (int) ((double) (this.aClass212_1.anInt6018 - this.aClass212_1.anInt6017) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray328[local102]) / local16);
				Static199.anIntArray331[local102] = (int) ((double) this.aClass212_1.anInt6017 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass212_1.method5099(arg0);
			local187 = this.aClass212_7.method5099(arg0);
			if (this.aClass212_9 != null) {
				local195 = this.aClass212_9.method5099(arg0);
				local200 = this.aClass212_6.method5099(arg0);
				local182 += this.method3431(local28, local200, this.aClass212_9.anInt6020) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass212_2 != null) {
				local195 = this.aClass212_2.method5099(arg0);
				local200 = this.aClass212_8.method5099(arg0);
				local187 = local187 * ((this.method3431(local67, local200, this.aClass212_2.anInt6020) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray326[local195] != 0) {
					local200 = local176 + Static199.anIntArray330[local195];
					if (local200 < arg0) {
						Static199.anIntArray323[local200] += this.method3431(Static199.anIntArray329[local195], local187 * Static199.anIntArray332[local195] >> 15, this.aClass212_1.anInt6020);
						Static199.anIntArray329[local195] += (local182 * Static199.anIntArray333[local195] >> 16) + Static199.anIntArray331[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass212_5 != null) {
			this.aClass212_5.method5100();
			this.aClass212_3.method5100();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass212_5.method5099(arg0);
				local352 = this.aClass212_3.method5099(arg0);
				if (local339) {
					local187 = this.aClass212_5.anInt6017 + ((this.aClass212_5.anInt6018 - this.aClass212_5.anInt6017) * local347 >> 8);
				} else {
					local187 = this.aClass212_5.anInt6017 + ((this.aClass212_5.anInt6018 - this.aClass212_5.anInt6017) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static199.anIntArray323[local200] = 0;
				}
			}
		}
		if (this.anInt3876 > 0 && this.anInt3877 > 0) {
			local182 = (int) ((double) this.anInt3876 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static199.anIntArray323[local187] += Static199.anIntArray323[local187 - local182] * this.anInt3877 / 100;
			}
		}
		if (this.aClass164_1.anIntArray468[0] > 0 || this.aClass164_1.anIntArray468[1] > 0) {
			this.aClass212_4.method5100();
			local182 = this.aClass212_4.method5099(arg0 + 1);
			local187 = this.aClass164_1.method4222(0, (float) local182 / 65536.0F);
			local195 = this.aClass164_1.method4222(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static199.anIntArray323[local200 + local187] * (long) Static249.anInt4900 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static199.anIntArray323[local200 + local187 - local519 - 1] * (long) Static249.anIntArrayArray54[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static199.anIntArray323[local200 - local549 - 1] * (long) Static249.anIntArrayArray54[1][local549] >> 16);
					}
					Static199.anIntArray323[local200] = local352;
					local182 = this.aClass212_4.method5099(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static199.anIntArray323[local200 + local187] * (long) Static249.anInt4900 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static199.anIntArray323[local200 + local187 - local519 - 1] * (long) Static249.anIntArrayArray54[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static199.anIntArray323[local200 - local549 - 1] * (long) Static249.anIntArrayArray54[1][local549] >> 16);
						}
						Static199.anIntArray323[local200] = local352;
						local182 = this.aClass212_4.method5099(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static199.anIntArray323[local200 + local187 - local519 - 1] * (long) Static249.anIntArrayArray54[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static199.anIntArray323[local200 - local549 - 1] * (long) Static249.anIntArrayArray54[1][local549] >> 16);
							}
							Static199.anIntArray323[local200] = local352;
							this.aClass212_4.method5099(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass164_1.method4222(0, (float) local182 / 65536.0F);
					local195 = this.aClass164_1.method4222(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static199.anIntArray323[local182] < -32768) {
				Static199.anIntArray323[local182] = -32768;
			}
			if (Static199.anIntArray323[local182] > 32767) {
				Static199.anIntArray323[local182] = 32767;
			}
		}
		return Static199.anIntArray323;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(III)I")
	private int method3431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray327[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray324[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
