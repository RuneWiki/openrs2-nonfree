import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!hga", name = "C", descriptor = "I")
	public static int anInt4360;

	@OriginalMember(owner = "client!hga", name = "A", descriptor = "I")
	public static int anInt4358 = 0;

	@OriginalMember(owner = "client!hga", name = "h", descriptor = "(I)V")
	public static void method3616() {
		for (@Pc(14) Class2_Sub3 local14 = (Class2_Sub3) Static234.aClass238_27.method5833(); local14 != null; local14 = (Class2_Sub3) Static234.aClass238_27.method5838()) {
			if (local14.anInt293 > 0) {
				local14.anInt293--;
			}
			if (local14.anInt293 != 0) {
				if (local14.anInt283 > 0) {
					local14.anInt283--;
				}
				if (local14.anInt283 == 0 && local14.anInt296 >= 1 && local14.anInt286 >= 1 && Static3.anInt46 - 2 >= local14.anInt296 && local14.anInt286 <= Static270.anInt5194 - 2 && (local14.anInt292 < 0 || Static327.method4909(local14.anInt292, local14.anInt295))) {
					Static566.method1788(local14.anInt291, local14.anInt294, local14.anInt286, -1, local14.anInt290, local14.anInt296, local14.anInt292, local14.anInt295);
					local14.anInt283 = -1;
					if (local14.anInt285 == local14.anInt292 && local14.anInt285 == -1) {
						local14.method8599();
					} else if (local14.anInt292 == local14.anInt285 && local14.anInt291 == local14.anInt284 && local14.anInt295 == local14.anInt288) {
						local14.method8599();
					}
				}
			} else if (local14.anInt285 < 0 || Static327.method4909(local14.anInt285, local14.anInt288)) {
				Static566.method1788(local14.anInt284, local14.anInt294, local14.anInt286, -1, local14.anInt290, local14.anInt296, local14.anInt285, local14.anInt288);
				local14.method8599();
			}
		}
	}
}
