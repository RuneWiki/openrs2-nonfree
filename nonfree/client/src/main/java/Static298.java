import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!maa", name = "d", descriptor = "[I")
	public static final int[] anIntArray405 = new int[14];

	@OriginalMember(owner = "client!maa", name = "e", descriptor = "[I")
	public static final int[] anIntArray406 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!maa", name = "f", descriptor = "[I")
	public static int[] anIntArray407 = new int[1];

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(I)Lclient!gb;")
	public static Class5_Sub18 method4946() {
		if (Static245.aClass99_60 == null || Static395.aClass59_1 == null) {
			return null;
		}
		for (@Pc(24) Class5_Sub18 local24 = (Class5_Sub18) Static395.aClass59_1.method1396(); local24 != null; local24 = (Class5_Sub18) Static395.aClass59_1.method1396()) {
			@Pc(32) Class101 local32 = Static245.aClass246_4.method5847(local24.anInt3138);
			if (local32 != null && local32.aBoolean187 && local32.method2603(Static245.anInterface7_2)) {
				return local24;
			}
		}
		return null;
	}
}
