import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_24 = new Class126(89, -2);

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray7 = new boolean[200];

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "[I")
	public static final int[] anIntArray78 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZLclient!bea;)Z")
	public static boolean method1542(@OriginalArg(1) Interface2 arg0) {
		@Pc(15) Class178 local15 = Static349.aClass374_2.method8357(arg0.method7823());
		if (local15.anInt4729 == -1) {
			return true;
		} else {
			@Pc(28) Class173 local28 = Static453.aClass116_2.method2727(local15.anInt4729);
			return local28.anInt4590 == -1 ? true : local28.method3928();
		}
	}
}
