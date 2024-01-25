import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
	public static void method5872() {
		if (!Static474.aBoolean505) {
			return;
		}
		@Pc(22) Class270 local22 = Static1.method9504(Static418.anInt6410, Static216.anInt3565);
		if (local22 != null && local22.anObjectArray38 != null) {
			@Pc(33) Class3_Sub41 local33 = new Class3_Sub41();
			local33.anObjectArray4 = local22.anObjectArray38;
			local33.aClass270_12 = local22;
			Static540.method7160(local33);
		}
		Static474.aBoolean505 = false;
		Static167.anInt2966 = -1;
		Static318.anInt1773 = -1;
		if (local22 != null) {
			Static539.method7146(local22);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;)V")
	public static void method5873(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		Static565.anInt8601 = arg1;
		Static265.aClass292_3 = Static95.aClass292_2;
		Static11.anInt525 = 2;
		Static45.method1224(arg2, arg0, false, false);
	}
}
