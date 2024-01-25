import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "[Lclient!tb;")
	public static Class49[] aClass49Array14;

	@OriginalMember(owner = "client!rm", name = "h", descriptor = "F")
	public static float aFloat174;

	@OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
	public static int anInt8714 = 64;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILclient!rt;)Z")
	public static boolean method7633(@OriginalArg(1) Interface23 arg0) {
		@Pc(10) Class125 local10 = Static290.aClass163_5.method4124(120, arg0.method7934());
		if (local10.anInt3589 == -1) {
			return true;
		} else {
			@Pc(24) Class317 local24 = Static599.aClass306_2.method7371(local10.anInt3589);
			return local24.anInt8623 == -1 ? true : local24.method7551();
		}
	}
}
