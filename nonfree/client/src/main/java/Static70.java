import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!cm", name = "p", descriptor = "Lclient!jv;")
	public static final Class174 aClass174_35 = new Class174();

	@OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
	public static int anInt9329 = 500;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BII)Z")
	public static boolean method7721(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "(I)Lclient!qj;")
	public static Class3_Sub41 method7723() {
		if (Static284.aClass130_49 == null || Static26.aClass179_5 == null) {
			return null;
		}
		for (@Pc(24) Class3_Sub41 local24 = (Class3_Sub41) Static26.aClass179_5.method4382(); local24 != null; local24 = (Class3_Sub41) Static26.aClass179_5.method4382()) {
			@Pc(32) Class40 local32 = Static284.aClass168_4.method4062(local24.anInt7163);
			if (local32 != null && local32.aBoolean93 && local32.method1125(Static284.anInterface21_2)) {
				return local24;
			}
		}
		return null;
	}
}
