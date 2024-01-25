import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class123 {

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "[I")
	private static final int[] anIntArray251 = new int[32768];

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "[I")
	private static final int[] anIntArray252;

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "Lclient!ph;")
	private Class188 aClass188_1;

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "Lclient!pv;")
	private Class197 aClass197_1;

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "Lclient!pv;")
	private Class197 aClass197_2;

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "Lclient!pv;")
	private Class197 aClass197_3;

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "Lclient!pv;")
	private Class197 aClass197_4;

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "Lclient!pv;")
	private Class197 aClass197_5;

	@OriginalMember(owner = "client!jg", name = "o", descriptor = "Lclient!pv;")
	private Class197 aClass197_6;

	@OriginalMember(owner = "client!jg", name = "q", descriptor = "Lclient!pv;")
	private Class197 aClass197_7;

	@OriginalMember(owner = "client!jg", name = "r", descriptor = "Lclient!pv;")
	private Class197 aClass197_8;

	@OriginalMember(owner = "client!jg", name = "s", descriptor = "Lclient!pv;")
	private Class197 aClass197_9;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
	private int anInt3134 = 100;

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
	public int anInt3135 = 500;

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
	public int anInt3137 = 0;

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
	private int anInt3136 = 0;

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "[I")
	private final int[] anIntArray250 = new int[5];

	@OriginalMember(owner = "client!jg", name = "x", descriptor = "[I")
	private final int[] anIntArray257 = new int[5];

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "[I")
	private final int[] anIntArray249 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray251[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray252 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray252[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!sv;)V")
	public void method2542(@OriginalArg(0) Class2_Sub13 arg0) {
		this.aClass197_6 = new Class197();
		this.aClass197_6.method4323(arg0);
		this.aClass197_4 = new Class197();
		this.aClass197_4.method4323(arg0);
		@Pc(21) int local21 = arg0.method3580();
		if (local21 != 0) {
			arg0.anInt4347--;
			this.aClass197_1 = new Class197();
			this.aClass197_1.method4323(arg0);
			this.aClass197_7 = new Class197();
			this.aClass197_7.method4323(arg0);
		}
		local21 = arg0.method3580();
		if (local21 != 0) {
			arg0.anInt4347--;
			this.aClass197_5 = new Class197();
			this.aClass197_5.method4323(arg0);
			this.aClass197_2 = new Class197();
			this.aClass197_2.method4323(arg0);
		}
		local21 = arg0.method3580();
		if (local21 != 0) {
			arg0.anInt4347--;
			this.aClass197_3 = new Class197();
			this.aClass197_3.method4323(arg0);
			this.aClass197_9 = new Class197();
			this.aClass197_9.method4323(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method3588();
			if (local114 == 0) {
				break;
			}
			this.anIntArray257[local109] = local114;
			this.anIntArray249[local109] = arg0.method3581();
			this.anIntArray250[local109] = arg0.method3588();
		}
		this.anInt3136 = arg0.method3588();
		this.anInt3134 = arg0.method3588();
		this.anInt3135 = arg0.method3555();
		this.anInt3137 = arg0.method3555();
		this.aClass188_1 = new Class188();
		this.aClass197_8 = new Class197();
		this.aClass188_1.method4189(arg0, this.aClass197_8);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)[I")
	public int[] method2543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static464.method1967(Static188.anIntArray248, 0, arg0);
		if (arg1 < 10) {
			return Static188.anIntArray248;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass197_6.method4321();
		this.aClass197_4.method4321();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass197_1 != null) {
			this.aClass197_1.method4321();
			this.aClass197_7.method4321();
			local24 = (int) ((double) (this.aClass197_1.anInt5461 - this.aClass197_1.anInt5463) * 32.768D / local16);
			local26 = (int) ((double) this.aClass197_1.anInt5463 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass197_5 != null) {
			this.aClass197_5.method4321();
			this.aClass197_2.method4321();
			local63 = (int) ((double) (this.aClass197_5.anInt5461 - this.aClass197_5.anInt5463) * 32.768D / local16);
			local65 = (int) ((double) this.aClass197_5.anInt5463 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray257[local102] != 0) {
				Static188.anIntArray258[local102] = 0;
				Static188.anIntArray256[local102] = (int) ((double) this.anIntArray250[local102] * local16);
				Static188.anIntArray255[local102] = (this.anIntArray257[local102] << 14) / 100;
				Static188.anIntArray254[local102] = (int) ((double) (this.aClass197_6.anInt5461 - this.aClass197_6.anInt5463) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray249[local102]) / local16);
				Static188.anIntArray253[local102] = (int) ((double) this.aClass197_6.anInt5463 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass197_6.method4320(arg0);
			local187 = this.aClass197_4.method4320(arg0);
			if (this.aClass197_1 != null) {
				local195 = this.aClass197_1.method4320(arg0);
				local200 = this.aClass197_7.method4320(arg0);
				local182 += this.method2544(local28, local200, this.aClass197_1.anInt5460) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass197_5 != null) {
				local195 = this.aClass197_5.method4320(arg0);
				local200 = this.aClass197_2.method4320(arg0);
				local187 = local187 * ((this.method2544(local67, local200, this.aClass197_5.anInt5460) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray257[local195] != 0) {
					local200 = local176 + Static188.anIntArray256[local195];
					if (local200 < arg0) {
						Static188.anIntArray248[local200] += this.method2544(Static188.anIntArray258[local195], local187 * Static188.anIntArray255[local195] >> 15, this.aClass197_6.anInt5460);
						Static188.anIntArray258[local195] += (local182 * Static188.anIntArray254[local195] >> 16) + Static188.anIntArray253[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass197_3 != null) {
			this.aClass197_3.method4321();
			this.aClass197_9.method4321();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass197_3.method4320(arg0);
				local352 = this.aClass197_9.method4320(arg0);
				if (local339) {
					local187 = this.aClass197_3.anInt5463 + ((this.aClass197_3.anInt5461 - this.aClass197_3.anInt5463) * local347 >> 8);
				} else {
					local187 = this.aClass197_3.anInt5463 + ((this.aClass197_3.anInt5461 - this.aClass197_3.anInt5463) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static188.anIntArray248[local200] = 0;
				}
			}
		}
		if (this.anInt3136 > 0 && this.anInt3134 > 0) {
			local182 = (int) ((double) this.anInt3136 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static188.anIntArray248[local187] += Static188.anIntArray248[local187 - local182] * this.anInt3134 / 100;
			}
		}
		if (this.aClass188_1.anIntArray431[0] > 0 || this.aClass188_1.anIntArray431[1] > 0) {
			this.aClass197_8.method4321();
			local182 = this.aClass197_8.method4320(arg0 + 1);
			local187 = this.aClass188_1.method4187(0, (float) local182 / 65536.0F);
			local195 = this.aClass188_1.method4187(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static188.anIntArray248[local200 + local187] * (long) Static305.anInt5266 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static188.anIntArray248[local200 + local187 - local519 - 1] * (long) Static305.anIntArrayArray44[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static188.anIntArray248[local200 - local549 - 1] * (long) Static305.anIntArrayArray44[1][local549] >> 16);
					}
					Static188.anIntArray248[local200] = local352;
					local182 = this.aClass197_8.method4320(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static188.anIntArray248[local200 + local187] * (long) Static305.anInt5266 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static188.anIntArray248[local200 + local187 - local519 - 1] * (long) Static305.anIntArrayArray44[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static188.anIntArray248[local200 - local549 - 1] * (long) Static305.anIntArrayArray44[1][local549] >> 16);
						}
						Static188.anIntArray248[local200] = local352;
						local182 = this.aClass197_8.method4320(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static188.anIntArray248[local200 + local187 - local519 - 1] * (long) Static305.anIntArrayArray44[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static188.anIntArray248[local200 - local549 - 1] * (long) Static305.anIntArrayArray44[1][local549] >> 16);
							}
							Static188.anIntArray248[local200] = local352;
							this.aClass197_8.method4320(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass188_1.method4187(0, (float) local182 / 65536.0F);
					local195 = this.aClass188_1.method4187(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static188.anIntArray248[local182] < -32768) {
				Static188.anIntArray248[local182] = -32768;
			}
			if (Static188.anIntArray248[local182] > 32767) {
				Static188.anIntArray248[local182] = 32767;
			}
		}
		return Static188.anIntArray248;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)I")
	private int method2544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray252[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray251[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
