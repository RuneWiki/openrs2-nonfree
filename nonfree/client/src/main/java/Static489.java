import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "Lclient!bo;")
	public static Class34 aClass34_2;

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "Ljava/lang/Object;")
	public static Object anObject14;

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "Lclient!ui;")
	public static final Class289 aClass289_17 = new Class289(4);

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "Lclient!ui;")
	public static final Class289 aClass289_13 = new Class289(1);

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "Lclient!ui;")
	public static final Class289 aClass289_10 = new Class289(1);

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "Lclient!ui;")
	public static final Class289 aClass289_11 = new Class289(2);

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "Lclient!ui;")
	public static final Class289 aClass289_12 = new Class289(4);

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "Lclient!ui;")
	public static final Class289 aClass289_14 = new Class289(2);

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "Lclient!ui;")
	public static final Class289 aClass289_15 = new Class289(4);

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "Lclient!ui;")
	public static final Class289 aClass289_16 = new Class289(2);

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
	public static int anInt8373 = -1;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)Z")
	public static boolean method7072(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!vp;II)V")
	public static void method7074(@OriginalArg(0) int arg0, @OriginalArg(1) Class309 arg1, @OriginalArg(3) int arg2) {
		if (Static382.aBoolean440) {
			@Pc(16) Class134 local16 = Static113.anInt2794 == -1 ? null : Static162.aClass98_11.method3006(Static113.anInt2794);
			if (Static62.method1740(arg1).method7989() && (Static276.anInt5433 & 0x20) != 0 && (local16 == null || arg1.method7375(local16.anInt4335, Static113.anInt2794) != local16.anInt4335)) {
				Static179.method3455(arg1.anInt8750, Static444.anInt7508, 0L, true, 5, Static433.aString72, false, arg1.anInt8735, arg1.anInt8726, Static469.aString69 + " -> " + arg1.aString81);
			}
			return;
		}
		@Pc(77) String local77;
		for (@Pc(71) int local71 = 9; local71 >= 5; local71--) {
			local77 = Static391.method5887(arg1, local71);
			if (local77 != null) {
				Static179.method3455(arg1.anInt8750, Static368.method5688(local71, arg1), (long) (local71 + 1), true, 1002, local77, false, arg1.anInt8735, arg1.anInt8726, arg1.aString81);
			}
		}
		local77 = Static288.method4856(arg1);
		if (local77 != null) {
			Static179.method3455(arg1.anInt8750, arg1.anInt8801, 0L, true, 2, local77, false, arg1.anInt8735, arg1.anInt8726, arg1.aString81);
		}
		for (@Pc(138) int local138 = 4; local138 >= 0; local138--) {
			@Pc(144) String local144 = Static391.method5887(arg1, local138);
			if (local144 != null) {
				Static179.method3455(arg1.anInt8750, Static368.method5688(local138, arg1), (long) (local138 + 1), true, 16, local144, false, arg1.anInt8735, arg1.anInt8726, arg1.aString81);
			}
		}
		if (!Static62.method1740(arg1).method7985()) {
			return;
		}
		if (arg1.aString80 == null) {
			Static179.method3455(arg1.anInt8750, -1, 0L, true, 10, Static180.aClass114_79.method3330(Static315.anInt5993), false, arg1.anInt8735, arg1.anInt8726, "");
		} else {
			Static179.method3455(arg1.anInt8750, -1, 0L, true, 10, arg1.aString80, false, arg1.anInt8735, arg1.anInt8726, "");
		}
	}
}
