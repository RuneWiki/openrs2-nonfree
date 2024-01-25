import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!r", name = "i", descriptor = "I")
	public static int anInt5646;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "[I")
	public static final int[] anIntArray438 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!r", name = "f", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_177 = new Class157(16, 3);

	@OriginalMember(owner = "client!r", name = "g", descriptor = "[I")
	public static final int[] anIntArray439 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!r", name = "h", descriptor = "[I")
	public static final int[] anIntArray440 = new int[14];

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZI)Lclient!dm;")
	public static Class2_Sub9_Sub2 method4760(@OriginalArg(1) int arg0) {
		@Pc(10) Class107 local10 = Static58.aClass107_7;
		@Pc(19) Class2_Sub9_Sub2 local19;
		synchronized (Static58.aClass107_7) {
			local19 = (Class2_Sub9_Sub2) Static58.aClass107_7.method3021((long) arg0);
			if (local19 == null) {
				local19 = new Class2_Sub9_Sub2(arg0);
				Static58.aClass107_7.method3018((long) arg0, local19);
			}
		}
		synchronized (local19) {
			return local19.method1319() ? local19 : null;
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
	public static void method4761() {
		if (Static77.aClass88_1 != null) {
			Static77.aClass88_1.method2720();
		}
		if (Static288.aClass88_2 != null) {
			Static288.aClass88_2.method2720();
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
	public static void method4762(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg3 - arg2;
		@Pc(15) int local15 = arg1 - arg0;
		if (local10 == 0) {
			if (local15 != 0) {
				Static68.method1365(arg4, arg2, arg0, arg1);
			}
		} else if (local15 == 0) {
			Static40.method501(arg2, arg4, arg3, arg0);
		} else {
			@Pc(49) int local49 = (local15 << 12) / local10;
			@Pc(57) int local57 = arg0 - (local49 * arg2 >> 12);
			@Pc(69) int local69;
			@Pc(71) int local71;
			if (arg2 < Static108.anInt2266) {
				local71 = local57 + (local49 * Static108.anInt2266 >> 12);
				local69 = Static108.anInt2266;
			} else if (Static205.anInt4504 >= arg2) {
				local69 = arg2;
				local71 = arg0;
			} else {
				local71 = local57 + (local49 * Static205.anInt4504 >> 12);
				local69 = Static205.anInt4504;
			}
			@Pc(100) int local100;
			@Pc(108) int local108;
			if (Static108.anInt2266 > arg3) {
				local100 = Static108.anInt2266;
				local108 = (Static108.anInt2266 * local49 >> 12) + local57;
			} else if (arg3 > Static205.anInt4504) {
				local100 = Static205.anInt4504;
				local108 = (local49 * Static205.anInt4504 >> 12) + local57;
			} else {
				local108 = arg1;
				local100 = arg3;
			}
			if (local108 < Static197.anInt4298) {
				local100 = (Static197.anInt4298 - local57 << 12) / local49;
				local108 = Static197.anInt4298;
			} else if (Static38.anInt553 < local108) {
				local108 = Static38.anInt553;
				local100 = (Static38.anInt553 - local57 << 12) / local49;
			}
			if (Static197.anInt4298 > local71) {
				local69 = (Static197.anInt4298 - local57 << 12) / local49;
				local71 = Static197.anInt4298;
			} else if (local71 > Static38.anInt553) {
				local69 = (Static38.anInt553 - local57 << 12) / local49;
				local71 = Static38.anInt553;
			}
			Static132.method2559(local100, local71, local108, arg4, local69);
		}
	}
}
