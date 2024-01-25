import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_77 = new Class150(111, 3);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
	public static void method2909() {
		for (@Pc(15) Class5_Sub22 local15 = (Class5_Sub22) Static330.aClass99_53.method2526(); local15 != null; local15 = (Class5_Sub22) Static330.aClass99_53.method2519()) {
			if (local15.anInt3306 == -1) {
				local15.anInt3293 = 0;
				if (local15.anInt3297 >= 0 && local15.anInt3296 >= 0 && local15.anInt3297 < Static460.anInt7894 && Static235.anInt4493 > local15.anInt3296) {
					Static24.method3372(local15);
				}
			} else {
				local15.method7425();
			}
		}
	}
}
