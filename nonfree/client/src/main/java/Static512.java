import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!vj", name = "I", descriptor = "[I")
	public static final int[] anIntArray740 = new int[14];

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
	public static void method7332() {
		for (@Pc(8) Class1_Sub1_Sub6 local8 = (Class1_Sub1_Sub6) Static35.aClass38_14.method1419(); local8 != null; local8 = (Class1_Sub1_Sub6) Static35.aClass38_14.method1415()) {
			@Pc(20) Class47_Sub2_Sub2 local20 = local8.aClass47_Sub2_Sub2_1;
			if (local20.aBoolean150) {
				local8.method7983();
				local20.method1936();
			} else if (Static416.anInt7252 >= local20.anInt2021) {
				local20.method1937(Static309.anInt5936);
				if (local20.aBoolean150) {
					local8.method7983();
				} else {
					Static346.method5547(local20, true);
				}
			}
		}
	}
}
