import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ia", name = "W", descriptor = "F")
	public static float aFloat34;

	@OriginalMember(owner = "client!ia", name = "R", descriptor = "Lclient!fi;")
	public static Class66 aClass66_44 = new Class66(128);

	@OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
	public static int anInt2645 = 0;

	@OriginalMember(owner = "client!ia", name = "V", descriptor = "I")
	public static int anInt2647 = 127;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)I")
	public static int method2444(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(25) int local25 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local25;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "(I)V")
	public static void method2445() {
		@Pc(1) Class66 local1 = Static177.aClass66_38;
		synchronized (Static177.aClass66_38) {
			Static177.aClass66_38.method1933();
		}
		local1 = Static162.aClass66_58;
		synchronized (Static162.aClass66_58) {
			Static162.aClass66_58.method1933();
		}
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(B)V")
	public static void method2446() {
		Static136.aClass66_46.method1942();
		Static297.aClass66_98.method1942();
	}

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "(I)V")
	public static void method2447() {
		Static193.aClass42_37.method1054();
		Static187.aClass176_10.method4767();
		Static54.aClass176_5.method4767();
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(IIIII)V")
	public static void method2448(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14;
		if (arg1 >= arg2) {
			for (local14 = arg2; local14 < arg1; local14++) {
				Static332.anIntArrayArray56[local14][arg3] = arg0;
			}
		} else {
			for (local14 = arg1; local14 < arg2; local14++) {
				Static332.anIntArrayArray56[local14][arg3] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(II)I")
	public static int method2449(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(II)V")
	public static void method2450(@OriginalArg(1) int arg0) {
		for (@Pc(7) Class5 local7 = Static61.aClass42_6.method1060(); local7 != null; local7 = Static61.aClass42_6.method1055()) {
			if ((long) arg0 == (local7.aLong218 >> 48 & 0xFFFFL)) {
				local7.method5803();
			}
		}
	}
}
