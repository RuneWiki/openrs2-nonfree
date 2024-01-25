import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "Lclient!kk;")
	public static final Class178 aClass178_2 = new Class178(0, Static230.aClass156_15, Static230.aClass156_15, 0, 1);

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "Lclient!kk;")
	public static final Class178 aClass178_3 = new Class178(1, Static230.aClass156_15, 2);

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "Lclient!kk;")
	public static final Class178 aClass178_4 = new Class178(2, Static230.aClass156_15, Static230.aClass156_15, 2, 3);

	@OriginalMember(owner = "client!kk", name = "n", descriptor = "Lclient!kk;")
	public static final Class178 aClass178_5 = new Class178(3, Static230.aClass156_15, 3);

	@OriginalMember(owner = "client!kk", name = "q", descriptor = "Lclient!kk;")
	public static final Class178 aClass178_6 = new Class178(4, Static230.aClass156_15, Static230.aClass156_15, 3, 4);

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "Lclient!kk;")
	public static final Class178 aClass178_7 = new Class178(5, Static230.aClass156_15, 4);

	@OriginalMember(owner = "client!kk", name = "s", descriptor = "Lclient!kk;")
	public static final Class178 aClass178_8 = new Class178(6, Static230.aClass156_15, 4);

	@OriginalMember(owner = "client!kk", name = "t", descriptor = "Lclient!kk;")
	public static final Class178 aClass178_9 = new Class178(7, Static230.aClass156_15, Static230.aClass156_15, 4, 5);

	@OriginalMember(owner = "client!kk", name = "u", descriptor = "Lclient!kk;")
	public static final Class178 aClass178_10 = new Class178(8, Static230.aClass156_15, Static230.aClass156_15, 5, 98, true, true);

	@OriginalMember(owner = "client!kk", name = "v", descriptor = "Lclient!kk;")
	public static final Class178 aClass178_11 = new Class178(9, Static230.aClass156_15, 99);

	@OriginalMember(owner = "client!kk", name = "w", descriptor = "Lclient!kk;")
	public static final Class178 aClass178_12 = new Class178(10, Static230.aClass156_15, 100);

	@OriginalMember(owner = "client!kk", name = "x", descriptor = "Lclient!kk;")
	public static final Class178 aClass178_13 = new Class178(11, Static230.aClass156_16, Static230.aClass156_16, 0, 92, true, true);

	@OriginalMember(owner = "client!kk", name = "y", descriptor = "Lclient!kk;")
	public static final Class178 aClass178_14 = new Class178(12, Static230.aClass156_16, Static230.aClass156_16, 92, 92);

	@OriginalMember(owner = "client!kk", name = "z", descriptor = "Lclient!kk;")
	private static final Class178 aClass178_15 = new Class178(13, Static230.aClass156_16, Static230.aClass156_16, 92, 93);

	@OriginalMember(owner = "client!kk", name = "A", descriptor = "Lclient!kk;")
	public static final Class178 aClass178_16 = new Class178(14, Static230.aClass156_16, Static230.aClass156_16, 94, 95);

	@OriginalMember(owner = "client!kk", name = "B", descriptor = "Lclient!kk;")
	public static final Class178 aClass178_17 = new Class178(15, Static230.aClass156_16, Static230.aClass156_16, 96, 97);

	@OriginalMember(owner = "client!kk", name = "C", descriptor = "Lclient!kk;")
	public static final Class178 aClass178_18 = new Class178(16, Static230.aClass156_16, 97);

	@OriginalMember(owner = "client!kk", name = "E", descriptor = "Lclient!kk;")
	public static final Class178 aClass178_19 = new Class178(17, Static230.aClass156_16, 97);

	@OriginalMember(owner = "client!kk", name = "F", descriptor = "Lclient!kk;")
	public static final Class178 aClass178_20 = new Class178(18, Static230.aClass156_16, 98);

	@OriginalMember(owner = "client!kk", name = "G", descriptor = "Lclient!kk;")
	public static final Class178 aClass178_21 = new Class178(19, Static230.aClass156_16, 100);

	@OriginalMember(owner = "client!kk", name = "I", descriptor = "Lclient!kk;")
	public static final Class178 aClass178_22 = new Class178(20, Static230.aClass156_16, 100);

	@OriginalMember(owner = "client!kk", name = "J", descriptor = "Lclient!kk;")
	public static final Class178 aClass178_23 = new Class178(21, Static230.aClass156_16, 100);

	@OriginalMember(owner = "client!kk", name = "K", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_99 = new Class73(71, -2);

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "([ILclient!ac;[I[II)V")
	public static void method4393(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class4_Sub1_Sub1_Sub1 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) int local13 = arg0[local7];
			@Pc(17) int local17 = arg2[local7];
			@Pc(21) int local21 = arg3[local7];
			@Pc(23) int local23 = 0;
			while (local17 != 0 && local23 < arg1.aClass286Array3.length) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg1.aClass286Array3[local23] = null;
					} else {
						@Pc(40) Class57 local40 = Static78.aClass298_2.method6521(local13);
						@Pc(43) int local43 = local40.anInt1547;
						@Pc(48) Class286 local48 = arg1.aClass286Array3[local23];
						if (local48 != null) {
							if (local48.anInt7760 == local13) {
								if (local43 == 0) {
									local48 = arg1.aClass286Array3[local23] = null;
								} else if (local43 == 1) {
									local48.anInt7756 = 0;
									local48.anInt7757 = local21;
									local48.anInt7761 = 0;
									local48.anInt7762 = 1;
									local48.anInt7759 = 0;
									Static520.method6532(arg1.aByte108, local40, false, arg1.anInt9542, 0, arg1.anInt9540);
								} else if (local43 == 2) {
									local48.anInt7759 = 0;
								}
							} else if (local40.anInt1532 >= Static78.aClass298_2.method6521(local48.anInt7760).anInt1532) {
								local48 = arg1.aClass286Array3[local23] = null;
							}
						}
						if (local48 == null) {
							local48 = arg1.aClass286Array3[local23] = new Class286();
							local48.anInt7760 = local13;
							local48.anInt7756 = 0;
							local48.anInt7761 = 0;
							local48.anInt7762 = 1;
							local48.anInt7759 = 0;
							local48.anInt7757 = local21;
							Static520.method6532(arg1.aByte108, local40, false, arg1.anInt9542, 0, arg1.anInt9540);
						}
					}
				}
				local23++;
				local17 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)[Lclient!kk;")
	public static Class178[] method4395() {
		return new Class178[] { aClass178_2, aClass178_3, aClass178_4, aClass178_5, aClass178_6, aClass178_7, aClass178_8, aClass178_9, aClass178_10, aClass178_11, aClass178_12, aClass178_13, aClass178_14, aClass178_15, aClass178_16, aClass178_17, aClass178_18, aClass178_19, aClass178_20, aClass178_21, aClass178_22, aClass178_23 };
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIB)I")
	public static int method4396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static36.anInt956 == -1) {
			return 1;
		}
		if (Static560.anInt9242 != arg1) {
			Static169.method3174(Static230.aClass156_12.method4065(Static25.anInt769), arg1);
			if (Static560.anInt9242 != arg1) {
				return -1;
			}
		}
		try {
			@Pc(34) Dimension local34 = Static32.aCanvas3.getSize();
			Static30.method892(Static230.aClass156_12.method4065(Static25.anInt769), Static8.aClass327_1, Static101.aClass92_9, Static240.aClass14_7, true);
			@Pc(52) Class220 local52 = Static489.method6690(Static36.anInt956, Static145.aClass251_40);
			@Pc(55) long local55 = Static8.method201();
			Static240.aClass14_7.F();
			Static21.aClass54_1.GA(0, Static108.anInt2068, 0);
			Static240.aClass14_7.method6829(Static21.aClass54_1);
			Static240.aClass14_7.m(local34.width / 2, local34.height / 2, 512, 512);
			Static240.aClass14_7.ha(1.0F);
			Static240.aClass14_7.YA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(101) Class20 local101 = Static240.aClass14_7.method6833(local52, 2048, 64, 64, 768);
			@Pc(103) int local103 = 0;
			label41: for (@Pc(105) int local105 = 0; local105 < 500; local105++) {
				Static240.aClass14_7.D(0);
				Static240.aClass14_7.method6892();
				for (@Pc(114) int local114 = 15; local114 >= 0; local114--) {
					for (@Pc(118) int local118 = 0; local118 <= local114; local118++) {
						Static528.aClass54_6.GA((int) ((float) Static112.anInt2178 * (-((float) local114 / 2.0F) + (float) local118)), 0, (local114 + 1) * Static112.anInt2178);
						local103++;
						local101.method7256(Static528.aClass54_6, null, 0);
						if (Static8.method201() - local55 >= (long) arg0) {
							break label41;
						}
					}
				}
			}
			Static240.aClass14_7.method6890();
			@Pc(195) long local195 = (long) (local103 * 1000) / (Static8.method201() - local55);
			Static240.aClass14_7.D(0);
			Static240.aClass14_7.method6892();
			return (int) local195;
		} catch (@Pc(204) Throwable local204) {
			local204.printStackTrace();
			return -1;
		}
	}
}
