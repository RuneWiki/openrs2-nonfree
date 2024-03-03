import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)Z", line = 97)
	public static boolean method3711() {
		@Pc(8) Class2_Sub5 local8 = (Class2_Sub5) Class92.aClass135_19.aClass2_130.aClass2_244;
		if (local8 == null || Class92.aClass135_19.aClass2_130 == local8) {
			return false;
		} else {
			if (local8.anInt1004 >= 2000) {
				local8.anInt1004 -= 2000;
			}
			return local8.anInt1004 == 1011;
		}
	}
}
