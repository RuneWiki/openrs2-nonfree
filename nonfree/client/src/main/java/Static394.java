import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!oca", name = "A", descriptor = "[I")
	public static int[] anIntArray369;

	@OriginalMember(owner = "client!oca", name = "B", descriptor = "Lclient!uaa;")
	public static Class333 aClass333_10;

	@OriginalMember(owner = "client!oca", name = "k", descriptor = "Lclient!vea;")
	public static final Class352 aClass352_7 = new Class352(1, 2, 2, 0);

	@OriginalMember(owner = "client!oca", name = "u", descriptor = "I")
	public static int anInt7366 = -2;

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method6226(@OriginalArg(1) String arg0) {
		return Static84.method2220(arg0);
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(BI)V")
	public static void method6232() {
		Static241.aClass94_21.method2958(5);
	}

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "(I)V")
	public static void method6234() {
		@Pc(10) Class6_Sub36 local10;
		for (local10 = (Class6_Sub36) Static354.aClass163_40.method4966(); local10 != null; local10 = (Class6_Sub36) Static354.aClass163_40.method4965()) {
			if (local10.aBoolean609) {
				local10.method8792();
			} else {
				local10.aBoolean608 = true;
				if (local10.anInt7720 >= 0 && local10.anInt7721 >= 0 && local10.anInt7720 < Static306.anInt6176 && local10.anInt7721 < Static108.anInt2930) {
					Static145.method2842(local10);
				}
			}
		}
		for (local10 = (Class6_Sub36) Static122.aClass163_15.method4966(); local10 != null; local10 = (Class6_Sub36) Static122.aClass163_15.method4965()) {
			if (local10.aBoolean609) {
				local10.method8792();
			} else {
				local10.aBoolean608 = true;
			}
		}
	}
}
