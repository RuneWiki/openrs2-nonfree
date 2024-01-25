import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "[I")
	public static int[] anIntArray386;

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "[Lclient!xa;")
	public static Class4[] aClass4Array7;

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "Lclient!pq;")
	public static Class251 aClass251_63;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZ)V")
	public static void method2891(@OriginalArg(1) boolean arg0) {
		Static11.method182();
		if (!Static179.method2711(Static146.anInt2581)) {
			return;
		}
		Static126.anInt2191++;
		if (Static126.anInt2191 < 50 && !arg0) {
			return;
		}
		Static126.anInt2191 = 0;
		if (!Static156.aBoolean183 && Static225.aClass71_1 != null) {
			Static136.method2051(Static293.aClass160_65);
			try {
				Static225.aClass71_1.method5968(Static218.aClass6_Sub14_Sub2_1.aByteArray88, Static218.aClass6_Sub14_Sub2_1.anInt7244);
				Static218.aClass6_Sub14_Sub2_1.anInt7244 = 0;
			} catch (@Pc(52) IOException local52) {
				Static156.aBoolean183 = true;
			}
		}
		Static11.method182();
	}
}
