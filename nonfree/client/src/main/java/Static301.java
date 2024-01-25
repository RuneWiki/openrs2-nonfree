import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "[[[Lclient!dr;")
	public static Class53[][][] aClass53ArrayArrayArray4;

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
	public static int anInt5434;

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "J")
	public static long aLong158 = -1L;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
	public static void method4176(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static97.anInt2093 == 1) {
			Static200.method2883(arg1, Static84.aClass4_Sub21_1, arg0);
		} else if (Static97.anInt2093 == 2) {
			Static70.method5673(arg0, arg1);
		}
		Static97.anInt2093 = 0;
		Static84.aClass4_Sub21_1 = null;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
	public static void method4178() {
		Static2.method5381();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static395.aClass268Array1[local8].method5815();
		}
		Static307.method5820();
		Static13.method325();
		System.gc();
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V")
	public static void method4180() {
		Static278.method5612();
		Static186.aClass59_3 = null;
		Static138.aClass59_2 = null;
		Static446.aClass31ArrayArray1 = null;
		Static413.aClass30_12 = null;
		Static437.aClass59_4 = null;
	}
}
