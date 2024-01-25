import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!hn", name = "E", descriptor = "[Lclient!vp;")
	public static Class4_Sub2_Sub1[] aClass4_Sub2_Sub1Array1;

	@OriginalMember(owner = "client!hn", name = "F", descriptor = "I")
	public static int anInt4029;

	@OriginalMember(owner = "client!hn", name = "L", descriptor = "I")
	public static int anInt4035 = 0;

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(Z)V")
	public static void method3643() {
		Static92.anInt1879 = -1;
		Static10.anInt220 = 1;
		if (Static358.aString61 == null) {
			Static606.method8671(35);
		} else {
			@Pc(24) Class5_Sub22 local24 = new Class5_Sub22(Static483.method7166(Static89.method1512(Static358.aString61)));
			@Pc(28) long local28 = local24.method5907();
			Static66.aLong35 = local24.method5907();
			Static567.method8234(Static249.method4127(local28), "", true);
		}
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(Z)Lclient!nfa;")
	public static Class33_Sub1 method3644() {
		return Static233.anInt4297 < Static103.aClass33_Sub1Array2.length ? Static103.aClass33_Sub1Array2[Static233.anInt4297++] : null;
	}
}
