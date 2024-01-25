import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!kaa", name = "e", descriptor = "I")
	public static int anInt4672;

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "Z")
	public static boolean aBoolean348 = false;

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZLclient!pj;I)Lclient!mj;")
	public static Class202 method3974(@OriginalArg(1) Class248 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method5795(arg1);
		return local13 == null ? null : new Class202(local13);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(II)Z")
	public static boolean method3975(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2 || arg0 == 4;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZZ)V")
	public static void method3976(@OriginalArg(0) boolean arg0) {
		if (Static232.aString91.length() == 0) {
			return;
		}
		Static257.method5660("--> " + Static232.aString91);
		Static460.method6443(arg0, Static232.aString91, false);
		Static568.anInt9823 = 0;
		Static116.anInt1995 = 0;
		Static232.aString91 = "";
	}
}
