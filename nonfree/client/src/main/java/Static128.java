import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
	public static int anInt49;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)Lclient!dea;")
	public static Class70 method59(@OriginalArg(0) int arg0) {
		@Pc(10) Class70 local10 = (Class70) Static246.aClass87_115.method1805((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static286.aClass207_63.method4681(0, arg0);
		local10 = new Class70();
		if (local25 != null) {
			local10.method1555(arg0, new Class5_Sub22(local25));
		}
		Static246.aClass87_115.method1792((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)V")
	public static void method60() {
		@Pc(9) Class87 local9 = Static295.aClass87_129;
		synchronized (Static295.aClass87_129) {
			Static295.aClass87_129.method1793(5);
		}
	}
}
