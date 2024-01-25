import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(II)V")
	public static void method4162(@OriginalArg(0) int arg0) {
		if (!Static7.aClass3_Sub15_Sub1_1.aBoolean594) {
			arg0 = -1;
		}
		if (Static435.anInt7970 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(21) Class183 local21 = Static25.aClass88_1.method2310(arg0);
			@Pc(25) Class9 local25 = local21.method4855();
			if (local25 == null) {
				arg0 = -1;
			} else {
				Static401.aClass285_11.method7036(local25.method539(), new Point(local21.anInt5819, local21.anInt5822), local25.method534(), Static549.aCanvas15, local25.method527());
				Static435.anInt7970 = arg0;
			}
		}
		if (arg0 == -1 && Static435.anInt7970 != -1) {
			Static401.aClass285_11.method7036(null, new Point(), -1, Static549.aCanvas15, -1);
			Static435.anInt7970 = -1;
		}
	}
}
