import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!oea", name = "j", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_79 = new Class94(66, -1);

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(II)V")
	public static void method6488(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub26 local15 = (Class2_Sub26) Static224.aClass99_38.method3056((long) arg0);
		if (local15 != null) {
			local15.aBoolean390 = !local15.aBoolean390;
			local15.aClass165_Sub1_1.method7057(local15.aBoolean390);
		}
	}
}
