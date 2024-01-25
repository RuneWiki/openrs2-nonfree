import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!id", name = "v", descriptor = "I")
	public static int anInt3146;

	@OriginalMember(owner = "client!id", name = "j", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_58 = new Class237(20, -1);

	@OriginalMember(owner = "client!id", name = "u", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_59 = new Class237(57, 2);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IZIIZ)V")
	public static void method2681(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		Static199.method3017(arg1, arg2, Static412.aClass196_Sub1Array2.length - 1, arg3, 0, arg0);
		Static60.anInt1263 = 0;
		Static154.aClass1_Sub25_1 = null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V")
	public static void method2692(@OriginalArg(1) int arg0) {
		Static400.anInt6932 = arg0;
		@Pc(7) Class83 local7 = Static244.aClass83_38;
		synchronized (Static244.aClass83_38) {
			Static244.aClass83_38.method1669();
		}
	}
}
