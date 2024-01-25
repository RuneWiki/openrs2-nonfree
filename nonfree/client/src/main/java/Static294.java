import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!oc", name = "w", descriptor = "Lclient!ee;")
	public static Class58 aClass58_1;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
	public static final int anInt4615 = 1405;

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
	public static int anInt4616 = -1;

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString53 = "";

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!um;)I")
	public static int method3669(@OriginalArg(1) Class243 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method5463(Static17.anInt368)) {
			local5++;
		}
		if (arg0.method5463(Static442.anInt7326)) {
			local5++;
		}
		if (arg0.method5463(Static43.anInt5303)) {
			local5++;
		}
		if (arg0.method5463(Static363.anInt5901)) {
			local5++;
		}
		if (arg0.method5463(Static225.anInt3735)) {
			local5++;
		}
		if (arg0.method5463(Static419.anInt6978)) {
			local5++;
		}
		if (arg0.method5463(Static319.anInt4968)) {
			local5++;
		}
		if (arg0.method5463(Static451.anInt7415)) {
			local5++;
		}
		if (arg0.method5463(Static462.anInt7532)) {
			local5++;
		}
		if (arg0.method5463(Static246.anInt3975)) {
			local5++;
		}
		if (arg0.method5463(Static265.anInt4221)) {
			local5++;
		}
		if (arg0.method5463(Static91.anInt1609)) {
			local5++;
		}
		if (arg0.method5463(Static103.anInt1736)) {
			local5++;
		}
		if (arg0.method5463(Static256.anInt4161)) {
			local5++;
		}
		if (arg0.method5463(Static214.anInt3566)) {
			local5++;
		}
		if (arg0.method5463(Static391.anInt6412)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
	public static void method3671() {
		if (!Static402.aBoolean455) {
			return;
		}
		while (true) {
			while (Static232.anInt3848 < Static79.aClass50_Sub1Array1.length) {
				@Pc(26) Class50_Sub1 local26 = Static79.aClass50_Sub1Array1[Static232.anInt3848];
				if (local26 != null && local26.anInt1386 == -1) {
					if (Static190.aClass5_Sub10_1 == null) {
						Static190.aClass5_Sub10_1 = Static175.aClass140_2.method2905(local26.aString6);
					}
					@Pc(49) int local49 = Static190.aClass5_Sub10_1.anInt1414;
					if (local49 == -1) {
						return;
					}
					Static232.anInt3848++;
					Static190.aClass5_Sub10_1 = null;
					local26.anInt1386 = local49;
				} else {
					Static232.anInt3848++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)I")
	public static int method3672(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
