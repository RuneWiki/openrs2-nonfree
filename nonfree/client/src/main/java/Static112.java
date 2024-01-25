import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
	public static int anInt2244 = 0;

	@OriginalMember(owner = "client!dh", name = "u", descriptor = "I")
	public static int anInt2245 = 0;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILclient!pe;)Z")
	public static boolean method2003(@OriginalArg(1) Interface19 arg0) {
		@Pc(12) Class144 local12 = Static70.aClass323_1.method7792(arg0.method9384());
		if (local12.anInt4403 == -1) {
			return true;
		} else {
			@Pc(28) Class404 local28 = Static567.aClass405_3.method9356(local12.anInt4403);
			return local28.anInt11190 == -1 ? true : local28.method9350();
		}
	}
}
