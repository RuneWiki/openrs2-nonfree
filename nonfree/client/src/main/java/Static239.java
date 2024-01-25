import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
	public static int anInt4616 = 0;

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
	public static int anInt4617 = 0;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)Lclient!pm;")
	public static Class5_Sub9_Sub16 method4052(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) Class5_Sub9_Sub16 local20 = (Class5_Sub9_Sub16) Static193.aClass42_37.method1052((long) arg1 | (long) arg0 << 32);
		if (local20 == null) {
			local20 = new Class5_Sub9_Sub16(arg0, arg1);
			Static193.aClass42_37.method1050(local20.aLong218, local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)V")
	public static void method4053(@OriginalArg(1) int arg0) {
		Static274.anInt5377 = arg0;
		Static303.anInt5838 = -1;
		Static31.anInt823 = 100;
		Static210.anInt5623 = 3;
	}
}
