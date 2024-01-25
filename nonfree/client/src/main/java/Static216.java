import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
	public static int anInt3669 = 0;

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
	public static int anInt3671 = 2;

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
	public static final int anInt3672 = 4;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)V")
	public static void method3140(@OriginalArg(0) int arg0) {
		Static64.anInt1190 = arg0;
		Static645.anInt10427 = -1;
		Static600.anInt9797 = 100;
		Static30.anInt677 = 3;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
	public static void method3141() {
		Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub4_1, 1);
		Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub4_2, 1);
		Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub29_1, 2);
		Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub29_2, 2);
		Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub9_1, 1);
		Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub27_1, 1);
		Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub3_1, 1);
		Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub10_1, 1);
		Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub28_1, 1);
		Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub12_1, 1);
		Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub13_1, 2);
		Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub21_1, 1);
		Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub25_1, 2);
		Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub15_1, 1);
		Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub6_2, 0);
		Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub6_1, 0);
		Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub17_1, 2);
		Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub23_1, 0);
		Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub26_1, 0);
		Static163.method2343();
		Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub22_1, 0);
		Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub11_1, 4);
		Static180.method8370();
		Static139.method2087();
		Static558.aBoolean680 = true;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V")
	public static void method3142(@OriginalArg(0) int arg0) {
		for (@Pc(14) Class6 local14 = Static345.aClass209_31.method5037(); local14 != null; local14 = Static345.aClass209_31.method5036()) {
			if ((local14.aLong314 >> 48 & 0xFFFFL) == (long) arg0) {
				local14.method9174();
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)V")
	public static void method3143(@OriginalArg(1) int arg0) {
		@Pc(10) Class6_Sub34 local10 = (Class6_Sub34) Static60.aClass209_5.method5038((long) arg0);
		if (local10 != null) {
			local10.aBoolean343 = !local10.aBoolean343;
			local10.aClass204_Sub1_1.method6597(local10.aBoolean343);
		}
	}
}
