import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "[I")
	public static int[] anIntArray230;

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
	public static int anInt3654;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!sq;)Z")
	public static boolean method3015(@OriginalArg(1) Interface10 arg0) {
		@Pc(10) Class106 local10 = Static448.aClass104_4.method2616(arg0.method5325());
		if (local10.anInt3183 == -1) {
			return true;
		} else {
			@Pc(27) Class81 local27 = Static314.aClass108_4.method2647(local10.anInt3183);
			return local27.anInt2453 == -1 ? true : local27.method2027();
		}
	}
}
