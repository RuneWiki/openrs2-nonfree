import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!sp", name = "Q", descriptor = "I")
	public static int anInt6033;

	@OriginalMember(owner = "client!sp", name = "R", descriptor = "I")
	public static int anInt6034;

	@OriginalMember(owner = "client!sp", name = "N", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_175 = new Class208(78, -1);

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "(I)V")
	public static void method5269() {
		for (@Pc(6) Class2_Sub41 local6 = (Class2_Sub41) Static314.aClass238_34.method5795(); local6 != null; local6 = (Class2_Sub41) Static314.aClass238_34.method5799()) {
			if (local6.aBoolean486) {
				local6.method5986();
			}
		}
		for (@Pc(34) Class2_Sub41 local34 = (Class2_Sub41) Static126.aClass238_8.method5795(); local34 != null; local34 = (Class2_Sub41) Static126.aClass238_8.method5799()) {
			if (local34.aBoolean486) {
				local34.method5986();
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "(I)Z")
	public static boolean method5270() {
		return Static255.aBoolean361;
	}
}
