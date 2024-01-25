import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "J")
	public static long aLong53;

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
	public static int anInt1274;

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
	public static int anInt1275;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!ija;)Z")
	public static boolean method1206(@OriginalArg(1) Interface10 arg0) {
		@Pc(15) Class81 local15 = Static400.aClass140_4.method2839(arg0.method8668());
		if (local15.anInt1888 == -1) {
			return true;
		} else {
			@Pc(27) Class392 local27 = Static40.aClass161_1.method3448(local15.anInt1888);
			return local27.anInt10405 == -1 ? true : local27.method8681();
		}
	}
}
