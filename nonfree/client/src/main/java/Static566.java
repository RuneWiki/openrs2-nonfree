import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)I")
	public static int method7607(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "(I)Lclient!fca;")
	public static Class6_Sub17 method7608() {
		if (Static217.aClass361_25 == null || Static558.aClass36_1 == null) {
			return null;
		}
		Static558.aClass36_1.method1055(Static217.aClass361_25);
		@Pc(18) Class6_Sub17 local18 = (Class6_Sub17) Static558.aClass36_1.method1056();
		if (local18 == null) {
			return null;
		} else {
			@Pc(35) Class176 local35 = Static217.aClass213_2.method5127(local18.anInt2970);
			return local35 != null && local35.aBoolean355 && local35.method4379(Static217.anInterface2_2) ? local18 : Static364.method5450();
		}
	}
}
