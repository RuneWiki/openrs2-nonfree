import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_41 = new Class25(33, 3);

	@OriginalMember(owner = "client!hp", name = "j", descriptor = "Lclient!ke;")
	public static final Class137 aClass137_14 = new Class137(32);

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!lt;III)Lclient!pm;")
	public static Class201 method2471(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) byte[] local14 = arg0.method3672(0, arg1);
		return local14 == null ? null : new Class201(local14);
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(B)Lclient!oa;")
	public static Class184_Sub1 method2472() {
		Static216.anInt3748 = 0;
		return Static71.method1393();
	}
}
