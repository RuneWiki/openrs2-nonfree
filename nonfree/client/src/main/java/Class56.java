import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class56 {

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "[I")
	public static int[] anIntArray305 = new int[32768];

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "[I")
	public static int[] anIntArray309;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "Lclient!h;")
	private Class31 aClass31_1;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "Lclient!ud;")
	private Class76 aClass76_1;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Lclient!h;")
	private Class31 aClass31_2;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Lclient!h;")
	private Class31 aClass31_3;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "Lclient!h;")
	private Class31 aClass31_4;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Lclient!h;")
	private Class31 aClass31_5;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "Lclient!h;")
	private Class31 aClass31_6;

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "Lclient!h;")
	private Class31 aClass31_7;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "Lclient!h;")
	private Class31 aClass31_8;

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "Lclient!h;")
	private Class31 aClass31_9;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	public int anInt2434 = 500;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "[I")
	private final int[] anIntArray306 = new int[5];

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "[I")
	private final int[] anIntArray308 = new int[5];

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "[I")
	private final int[] anIntArray307 = new int[5];

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
	private int anInt2436 = 0;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
	public int anInt2435 = 0;

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
	private int anInt2437 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray305[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray309 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray309[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)[I")
	public int[] method1604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static136.method892(Static94.anIntArray304, 0, arg0);
		if (arg1 < 10) {
			return Static94.anIntArray304;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass31_1.method784();
		this.aClass31_4.method784();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass31_5 != null) {
			this.aClass31_5.method784();
			this.aClass31_3.method784();
			local24 = (int) ((double) (this.aClass31_5.anInt1146 - this.aClass31_5.anInt1144) * 32.768D / local16);
			local26 = (int) ((double) this.aClass31_5.anInt1144 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass31_6 != null) {
			this.aClass31_6.method784();
			this.aClass31_7.method784();
			local63 = (int) ((double) (this.aClass31_6.anInt1146 - this.aClass31_6.anInt1144) * 32.768D / local16);
			local65 = (int) ((double) this.aClass31_6.anInt1144 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray307[local102] != 0) {
				Static94.anIntArray314[local102] = 0;
				Static94.anIntArray311[local102] = (int) ((double) this.anIntArray306[local102] * local16);
				Static94.anIntArray313[local102] = (this.anIntArray307[local102] << 14) / 100;
				Static94.anIntArray310[local102] = (int) ((double) (this.aClass31_1.anInt1146 - this.aClass31_1.anInt1144) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray308[local102]) / local16);
				Static94.anIntArray312[local102] = (int) ((double) this.aClass31_1.anInt1144 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass31_1.method781(arg0);
			local187 = this.aClass31_4.method781(arg0);
			if (this.aClass31_5 != null) {
				local195 = this.aClass31_5.method781(arg0);
				local200 = this.aClass31_3.method781(arg0);
				local182 += this.method1605(local28, local200, this.aClass31_5.anInt1145) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass31_6 != null) {
				local195 = this.aClass31_6.method781(arg0);
				local200 = this.aClass31_7.method781(arg0);
				local187 = local187 * ((this.method1605(local67, local200, this.aClass31_6.anInt1145) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray307[local195] != 0) {
					local200 = local176 + Static94.anIntArray311[local195];
					if (local200 < arg0) {
						Static94.anIntArray304[local200] += this.method1605(Static94.anIntArray314[local195], local187 * Static94.anIntArray313[local195] >> 15, this.aClass31_1.anInt1145);
						Static94.anIntArray314[local195] += (local182 * Static94.anIntArray310[local195] >> 16) + Static94.anIntArray312[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass31_9 != null) {
			this.aClass31_9.method784();
			this.aClass31_8.method784();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass31_9.method781(arg0);
				local352 = this.aClass31_8.method781(arg0);
				if (local339) {
					local187 = this.aClass31_9.anInt1144 + ((this.aClass31_9.anInt1146 - this.aClass31_9.anInt1144) * local347 >> 8);
				} else {
					local187 = this.aClass31_9.anInt1144 + ((this.aClass31_9.anInt1146 - this.aClass31_9.anInt1144) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static94.anIntArray304[local200] = 0;
				}
			}
		}
		if (this.anInt2436 > 0 && this.anInt2437 > 0) {
			local182 = (int) ((double) this.anInt2436 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static94.anIntArray304[local187] += Static94.anIntArray304[local187 - local182] * this.anInt2437 / 100;
			}
		}
		if (this.aClass76_1.anIntArray364[0] > 0 || this.aClass76_1.anIntArray364[1] > 0) {
			this.aClass31_2.method784();
			local182 = this.aClass31_2.method781(arg0 + 1);
			local187 = this.aClass76_1.method1911(0, (float) local182 / 65536.0F);
			local195 = this.aClass76_1.method1911(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static94.anIntArray304[local200 + local187] * (long) Static122.anInt3040 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static94.anIntArray304[local200 + local187 - local519 - 1] * (long) Static122.anIntArrayArray23[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static94.anIntArray304[local200 - local549 - 1] * (long) Static122.anIntArrayArray23[1][local549] >> 16);
					}
					Static94.anIntArray304[local200] = local352;
					local182 = this.aClass31_2.method781(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static94.anIntArray304[local200 + local187] * (long) Static122.anInt3040 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static94.anIntArray304[local200 + local187 - local519 - 1] * (long) Static122.anIntArrayArray23[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static94.anIntArray304[local200 - local549 - 1] * (long) Static122.anIntArrayArray23[1][local549] >> 16);
						}
						Static94.anIntArray304[local200] = local352;
						local182 = this.aClass31_2.method781(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static94.anIntArray304[local200 + local187 - local519 - 1] * (long) Static122.anIntArrayArray23[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static94.anIntArray304[local200 - local549 - 1] * (long) Static122.anIntArrayArray23[1][local549] >> 16);
							}
							Static94.anIntArray304[local200] = local352;
							this.aClass31_2.method781(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass76_1.method1911(0, (float) local182 / 65536.0F);
					local195 = this.aClass76_1.method1911(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static94.anIntArray304[local182] < -32768) {
				Static94.anIntArray304[local182] = -32768;
			}
			if (Static94.anIntArray304[local182] > 32767) {
				Static94.anIntArray304[local182] = 32767;
			}
		}
		return Static94.anIntArray304;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)I")
	private int method1605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray309[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray305[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!pa;)V")
	public void method1606(@OriginalArg(0) Class5_Sub14 arg0) {
		this.aClass31_1 = new Class31();
		this.aClass31_1.method783(arg0);
		this.aClass31_4 = new Class31();
		this.aClass31_4.method783(arg0);
		@Pc(21) int local21 = arg0.method1471();
		if (local21 != 0) {
			arg0.anInt2199--;
			this.aClass31_5 = new Class31();
			this.aClass31_5.method783(arg0);
			this.aClass31_3 = new Class31();
			this.aClass31_3.method783(arg0);
		}
		local21 = arg0.method1471();
		if (local21 != 0) {
			arg0.anInt2199--;
			this.aClass31_6 = new Class31();
			this.aClass31_6.method783(arg0);
			this.aClass31_7 = new Class31();
			this.aClass31_7.method783(arg0);
		}
		local21 = arg0.method1471();
		if (local21 != 0) {
			arg0.anInt2199--;
			this.aClass31_9 = new Class31();
			this.aClass31_9.method783(arg0);
			this.aClass31_8 = new Class31();
			this.aClass31_8.method783(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1455();
			if (local114 == 0) {
				break;
			}
			this.anIntArray307[local109] = local114;
			this.anIntArray308[local109] = arg0.method1428();
			this.anIntArray306[local109] = arg0.method1455();
		}
		this.anInt2436 = arg0.method1455();
		this.anInt2437 = arg0.method1455();
		this.anInt2434 = arg0.method1478();
		this.anInt2435 = arg0.method1478();
		this.aClass76_1 = new Class76();
		this.aClass31_2 = new Class31();
		this.aClass76_1.method1909(arg0, this.aClass31_2);
	}
}
