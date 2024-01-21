import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class20 {

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "[I")
	public static int[] anIntArray70 = new int[32768];

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "[I")
	public static int[] anIntArray74;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "Lclient!gb;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "Lclient!gb;")
	private Class27 aClass27_2;

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "Lclient!gb;")
	private Class27 aClass27_3;

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "Lclient!gb;")
	private Class27 aClass27_4;

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "Lclient!gb;")
	private Class27 aClass27_5;

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "Lclient!gb;")
	private Class27 aClass27_6;

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "Lclient!gb;")
	private Class27 aClass27_7;

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "Lclient!va;")
	private Class79 aClass79_1;

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "Lclient!gb;")
	private Class27 aClass27_8;

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "Lclient!gb;")
	private Class27 aClass27_9;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
	private int anInt679 = 100;

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
	public int anInt682 = 0;

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "[I")
	private final int[] anIntArray73 = new int[5];

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
	public int anInt681 = 500;

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
	private int anInt680 = 0;

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "[I")
	private final int[] anIntArray71 = new int[5];

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "[I")
	private final int[] anIntArray75 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray70[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray74 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray74[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)I")
	private int method512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray74[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray70[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!ic;)V")
	public void method514(@OriginalArg(0) Class2_Sub10 arg0) {
		this.aClass27_4 = new Class27();
		this.aClass27_4.method658(arg0);
		this.aClass27_8 = new Class27();
		this.aClass27_8.method658(arg0);
		@Pc(21) int local21 = arg0.method1514();
		if (local21 != 0) {
			arg0.anInt2187--;
			this.aClass27_9 = new Class27();
			this.aClass27_9.method658(arg0);
			this.aClass27_2 = new Class27();
			this.aClass27_2.method658(arg0);
		}
		local21 = arg0.method1514();
		if (local21 != 0) {
			arg0.anInt2187--;
			this.aClass27_6 = new Class27();
			this.aClass27_6.method658(arg0);
			this.aClass27_1 = new Class27();
			this.aClass27_1.method658(arg0);
		}
		local21 = arg0.method1514();
		if (local21 != 0) {
			arg0.anInt2187--;
			this.aClass27_7 = new Class27();
			this.aClass27_7.method658(arg0);
			this.aClass27_5 = new Class27();
			this.aClass27_5.method658(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1484();
			if (local114 == 0) {
				break;
			}
			this.anIntArray73[local109] = local114;
			this.anIntArray71[local109] = arg0.method1513();
			this.anIntArray75[local109] = arg0.method1484();
		}
		this.anInt680 = arg0.method1484();
		this.anInt679 = arg0.method1484();
		this.anInt681 = arg0.method1517();
		this.anInt682 = arg0.method1517();
		this.aClass79_1 = new Class79();
		this.aClass27_3 = new Class27();
		this.aClass79_1.method1823(arg0, this.aClass27_3);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)[I")
	public int[] method515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static133.method957(Static28.anIntArray72, 0, arg0);
		if (arg1 < 10) {
			return Static28.anIntArray72;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass27_4.method657();
		this.aClass27_8.method657();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass27_9 != null) {
			this.aClass27_9.method657();
			this.aClass27_2.method657();
			local24 = (int) ((double) (this.aClass27_9.anInt940 - this.aClass27_9.anInt939) * 32.768D / local16);
			local26 = (int) ((double) this.aClass27_9.anInt939 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass27_6 != null) {
			this.aClass27_6.method657();
			this.aClass27_1.method657();
			local63 = (int) ((double) (this.aClass27_6.anInt940 - this.aClass27_6.anInt939) * 32.768D / local16);
			local65 = (int) ((double) this.aClass27_6.anInt939 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray73[local102] != 0) {
				Static28.anIntArray78[local102] = 0;
				Static28.anIntArray79[local102] = (int) ((double) this.anIntArray75[local102] * local16);
				Static28.anIntArray77[local102] = (this.anIntArray73[local102] << 14) / 100;
				Static28.anIntArray76[local102] = (int) ((double) (this.aClass27_4.anInt940 - this.aClass27_4.anInt939) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray71[local102]) / local16);
				Static28.anIntArray80[local102] = (int) ((double) this.aClass27_4.anInt939 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass27_4.method660(arg0);
			local187 = this.aClass27_8.method660(arg0);
			if (this.aClass27_9 != null) {
				local195 = this.aClass27_9.method660(arg0);
				local200 = this.aClass27_2.method660(arg0);
				local182 += this.method512(local28, local200, this.aClass27_9.anInt938) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass27_6 != null) {
				local195 = this.aClass27_6.method660(arg0);
				local200 = this.aClass27_1.method660(arg0);
				local187 = local187 * ((this.method512(local67, local200, this.aClass27_6.anInt938) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray73[local195] != 0) {
					local200 = local176 + Static28.anIntArray79[local195];
					if (local200 < arg0) {
						Static28.anIntArray72[local200] += this.method512(Static28.anIntArray78[local195], local187 * Static28.anIntArray77[local195] >> 15, this.aClass27_4.anInt938);
						Static28.anIntArray78[local195] += (local182 * Static28.anIntArray76[local195] >> 16) + Static28.anIntArray80[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass27_7 != null) {
			this.aClass27_7.method657();
			this.aClass27_5.method657();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass27_7.method660(arg0);
				local352 = this.aClass27_5.method660(arg0);
				if (local339) {
					local187 = this.aClass27_7.anInt939 + ((this.aClass27_7.anInt940 - this.aClass27_7.anInt939) * local347 >> 8);
				} else {
					local187 = this.aClass27_7.anInt939 + ((this.aClass27_7.anInt940 - this.aClass27_7.anInt939) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static28.anIntArray72[local200] = 0;
				}
			}
		}
		if (this.anInt680 > 0 && this.anInt679 > 0) {
			local182 = (int) ((double) this.anInt680 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static28.anIntArray72[local187] += Static28.anIntArray72[local187 - local182] * this.anInt679 / 100;
			}
		}
		if (this.aClass79_1.anIntArray388[0] > 0 || this.aClass79_1.anIntArray388[1] > 0) {
			this.aClass27_3.method657();
			local182 = this.aClass27_3.method660(arg0 + 1);
			local187 = this.aClass79_1.method1824(0, (float) local182 / 65536.0F);
			local195 = this.aClass79_1.method1824(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static28.anIntArray72[local200 + local187] * (long) Static122.anInt2628 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static28.anIntArray72[local200 + local187 - local519 - 1] * (long) Static122.anIntArrayArray29[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static28.anIntArray72[local200 - local549 - 1] * (long) Static122.anIntArrayArray29[1][local549] >> 16);
					}
					Static28.anIntArray72[local200] = local352;
					local182 = this.aClass27_3.method660(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static28.anIntArray72[local200 + local187] * (long) Static122.anInt2628 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static28.anIntArray72[local200 + local187 - local519 - 1] * (long) Static122.anIntArrayArray29[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static28.anIntArray72[local200 - local549 - 1] * (long) Static122.anIntArrayArray29[1][local549] >> 16);
						}
						Static28.anIntArray72[local200] = local352;
						local182 = this.aClass27_3.method660(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static28.anIntArray72[local200 + local187 - local519 - 1] * (long) Static122.anIntArrayArray29[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static28.anIntArray72[local200 - local549 - 1] * (long) Static122.anIntArrayArray29[1][local549] >> 16);
							}
							Static28.anIntArray72[local200] = local352;
							this.aClass27_3.method660(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass79_1.method1824(0, (float) local182 / 65536.0F);
					local195 = this.aClass79_1.method1824(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static28.anIntArray72[local182] < -32768) {
				Static28.anIntArray72[local182] = -32768;
			}
			if (Static28.anIntArray72[local182] > 32767) {
				Static28.anIntArray72[local182] = 32767;
			}
		}
		return Static28.anIntArray72;
	}
}
