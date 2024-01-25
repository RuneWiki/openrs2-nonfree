import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!nl", name = "B", descriptor = "[I")
	public static int[] anIntArray841;

	@OriginalMember(owner = "client!nl", name = "t", descriptor = "Z")
	public static boolean aBoolean482 = false;

	@OriginalMember(owner = "client!nl", name = "v", descriptor = "Ljava/lang/String;")
	public static final String aString436 = "slide:";

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILclient!gd;)Z")
	public static boolean method5630(@OriginalArg(1) Interface1 arg0) {
		@Pc(9) Class122 local9 = Static245.method4227(arg0.method5362());
		if (local9.anInt3536 == -1) {
			return true;
		} else {
			@Pc(20) Class83 local20 = Static171.method3241(local9.anInt3536);
			return local20.anInt2442 == -1 ? true : local20.method2037();
		}
	}
}
