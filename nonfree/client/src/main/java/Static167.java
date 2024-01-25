import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
	public static int anInt3259;

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "Lclient!ib;")
	public static Class154 aClass154_3;

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "Lclient!wn;")
	public static final Class379 aClass379_5 = new Class379("", 12);

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "I")
	public static int anInt3261 = -1;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(BZ)V")
	public static void method2802(@OriginalArg(1) boolean arg0) {
		Static234.method3998();
		if (!Static26.method368(Static82.anInt1653)) {
			return;
		}
		Static189.anInt3567++;
		if (Static189.anInt3567 < 50 && !arg0) {
			return;
		}
		Static189.anInt3567 = 0;
		if (!Static303.aBoolean610 && Static547.aClass197_1 != null) {
			@Pc(39) Class3_Sub27 local39 = Static59.method1040(Static325.aClass20_2, Static60.aClass314_48);
			Static148.method2572(local39);
			try {
				Static263.method4385();
			} catch (@Pc(48) IOException local48) {
				Static303.aBoolean610 = true;
			}
		}
		Static234.method3998();
	}
}
