import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!ql", name = "E", descriptor = "Z")
	public static volatile boolean aBoolean629 = false;

	@OriginalMember(owner = "client!ql", name = "H", descriptor = "Lclient!aca;")
	public static final Class6 aClass6_32 = new Class6(4, 1);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V")
	public static void method7030(@OriginalArg(1) int arg0) {
		@Pc(15) Class3_Sub54 local15 = (Class3_Sub54) Static623.aClass62_45.method1682((long) arg0);
		if (local15 != null) {
			local15.aClass133_Sub1_1.method2963();
			Static638.method8383(local15.aBoolean754, local15.anInt10223);
			local15.method8770();
		}
	}
}
