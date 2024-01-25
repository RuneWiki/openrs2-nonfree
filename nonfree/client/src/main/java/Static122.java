import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
	public static int anInt2649;

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "Lclient!ih;")
	public static Class31 aClass31_11;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString17 = null;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Lclient!to;")
	public static Class3_Sub47 method2218() {
		if (Static598.aClass216_26 == null || Static297.aClass383_3 == null) {
			return null;
		}
		for (@Pc(16) Class3_Sub47 local16 = (Class3_Sub47) Static297.aClass383_3.method8657(); local16 != null; local16 = (Class3_Sub47) Static297.aClass383_3.method8657()) {
			@Pc(30) Class179 local30 = Static598.aClass154_2.method3947(local16.anInt9169);
			if (local30 != null && local30.aBoolean390 && local30.method4532(Static598.anInterface16_2)) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIB)Z")
	public static boolean method2219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static153.method2724(arg0, arg1) || Static152.method2717(arg0, arg1);
	}
}
