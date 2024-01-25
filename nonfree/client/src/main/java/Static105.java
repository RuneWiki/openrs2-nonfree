import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public static void method4641() {
		for (@Pc(10) Class2_Sub21 local10 = (Class2_Sub21) Static246.aClass70_25.method1264(); local10 != null; local10 = (Class2_Sub21) Static246.aClass70_25.method1261()) {
			if (local10.anInt3026 == -1) {
				local10.anInt3024 = 0;
				if (local10.anInt3036 >= 0 && local10.anInt3030 >= 0 && Static281.anInt4822 > local10.anInt3036 && local10.anInt3030 < Static29.anInt491) {
					Static387.method5349(local10);
				}
			} else {
				local10.method7657();
			}
		}
	}
}
