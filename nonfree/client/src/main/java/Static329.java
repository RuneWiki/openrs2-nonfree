import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
	public static int anInt5395;

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
	public static int anInt5391 = -1;

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
	public static int anInt5393 = 0;

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "Lclient!so;")
	public static final Class224 aClass224_20 = new Class224(3, 7);

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "Lclient!ng;")
	public static final Class167 aClass167_76 = new Class167(20);

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I[[[Lclient!fl;)V")
	public static void method4204(@OriginalArg(1) Class82[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class82[][] local13 = arg0[local7];
			for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < local13[local15].length; local19++) {
					@Pc(27) Class82 local27 = local13[local15][local19];
					if (local27 != null) {
						if (local27.aClass20_Sub2_1 instanceof Interface9) {
							((Interface9) local27.aClass20_Sub2_1).method5123();
						}
						if (local27.aClass20_Sub4_1 instanceof Interface9) {
							((Interface9) local27.aClass20_Sub4_1).method5123();
						}
						if (local27.aClass20_Sub4_2 instanceof Interface9) {
							((Interface9) local27.aClass20_Sub4_2).method5123();
						}
						if (local27.aClass20_Sub1_2 instanceof Interface9) {
							((Interface9) local27.aClass20_Sub1_2).method5123();
						}
						if (local27.aClass20_Sub1_3 instanceof Interface9) {
							((Interface9) local27.aClass20_Sub1_3).method5123();
						}
						for (@Pc(77) Class146 local77 = local27.aClass146_1; local77 != null; local77 = local77.aClass146_3) {
							@Pc(82) Class20_Sub3 local82 = local77.aClass20_Sub3_1;
							if (local82 instanceof Interface9) {
								((Interface9) local82).method5123();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IBI)I")
	public static int method4205(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(46) int local46 = Static143.method1882(arg0 - 1, arg1 + -1) + Static143.method1882(arg0 - 1, arg1 + 1) + Static143.method1882(arg0 - -1, arg1 + -1) + Static143.method1882(arg0 + 1, arg1 + 1);
		@Pc(76) int local76 = Static143.method1882(arg0, arg1 - 1) + Static143.method1882(arg0, arg1 + 1) + Static143.method1882(arg0 - 1, arg1) + Static143.method1882(arg0 + 1, arg1);
		@Pc(81) int local81 = Static143.method1882(arg0, arg1);
		return local46 / 16 + local76 / 8 + local81 / 4;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
	public static void method4206() {
		@Pc(7) Class220 local7 = null;
		try {
			@Pc(12) Class215 local12 = Static41.aClass124_2.method2523("2");
			while (local12.anInt5791 == 0) {
				Static252.method2874(1L);
			}
			if (local12.anInt5791 == 1) {
				local7 = (Class220) local12.anObject10;
				@Pc(40) Class1_Sub11 local40 = new Class1_Sub11(Static25.anInt543 * 6 + 3);
				local40.method4445(1);
				local40.method4448(Static25.anInt543);
				for (@Pc(50) int local50 = 0; local50 < Static156.anIntArray134.length; local50++) {
					if (Static389.aBooleanArray12[local50]) {
						local40.method4448(local50);
						local40.method4450(Static156.anIntArray134[local50]);
					}
				}
				local7.method4582(local40.anInt5766, 0, local40.aByteArray64);
			}
		} catch (@Pc(85) Exception local85) {
		}
		try {
			if (local7 != null) {
				local7.method4584();
			}
		} catch (@Pc(92) Exception local92) {
		}
		Static152.aLong81 = Static232.method3058();
		Static447.aBoolean604 = false;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
	public static void method4207() {
		for (@Pc(10) Class1_Sub42 local10 = (Class1_Sub42) Static335.aClass254_40.method5437(); local10 != null; local10 = (Class1_Sub42) Static335.aClass254_40.method5433()) {
			if (local10.aBoolean550) {
				local10.method5165();
			}
		}
		for (@Pc(37) Class1_Sub42 local37 = (Class1_Sub42) Static24.aClass254_3.method5437(); local37 != null; local37 = (Class1_Sub42) Static24.aClass254_3.method5433()) {
			if (local37.aBoolean550) {
				local37.method5165();
			}
		}
	}
}
