import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "Lclient!lb;")
	public static Class221 aClass221_63;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "[I")
	public static final int[] anIntArray232 = new int[8];

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)V")
	public static void method3528(@OriginalArg(1) boolean arg0) {
		Static140.method2345();
		if (!Static56.method718(Static178.anInt3225)) {
			return;
		}
		@Pc(22) Class400[] local22 = Static532.aClass400Array1;
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class400 local30 = local22[local24];
			local30.anInt11060++;
			if (local30.anInt11060 < 50 && !arg0) {
				return;
			}
			local30.anInt11060 = 0;
			if (!local30.aBoolean795 && local30.aClass255_2 != null) {
				@Pc(67) Class3_Sub48 local67 = Static89.method1200(Static262.aClass286_46, local30.aClass399_2);
				local30.method9223(local67);
				try {
					local30.method9227();
				} catch (@Pc(76) IOException local76) {
					local30.aBoolean795 = true;
				}
			}
		}
		Static140.method2345();
	}
}
