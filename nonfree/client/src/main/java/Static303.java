import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!tf", name = "L", descriptor = "Lclient!kq;")
	public static Class117 aClass117_3;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!vq;Z)V")
	public static void method4983(@OriginalArg(0) Class47 arg0) {
		if (Static160.aClass116_29.method3275() == 0) {
			return;
		}
		@Pc(59) Class4_Sub20 local59;
		if (Static225.anInt4568 == 0 || Static225.anInt4568 == 2) {
			for (local59 = (Class4_Sub20) Static160.aClass116_29.method3270(); local59 != null; local59 = (Class4_Sub20) Static160.aClass116_29.method3272()) {
				Static46.method929(local59.anInt2822, local59.aBoolean204 ? Static158.aClass8_Sub1_Sub2_Sub1_1.aClass33_1 : null, local59.anInt2827, false, arg0, local59.anInt2823, local59.anInt2825, Static63.aClass51_1, local59.anInt2824, false, arg0);
				local59.method5687();
			}
			Static12.method242();
			return;
		}
		if (Static81.aClass47_3 == null) {
			@Pc(29) Canvas local29 = new Canvas();
			local29.setSize(36, 32);
			Static81.aClass47_3 = Static344.method2669(0, Static141.anInterface3_6, local29, Static1.aClass134_7, 0);
			Static296.aClass51_7 = Static81.aClass47_3.method2693(Static48.method959(Static103.aClass193_38, Static225.anInt4567), Static362.method3088(Static316.aClass193_99, Static225.anInt4567));
		}
		for (local59 = (Class4_Sub20) Static160.aClass116_29.method3270(); local59 != null; local59 = (Class4_Sub20) Static160.aClass116_29.method3272()) {
			Static46.method929(local59.anInt2822, local59.aBoolean204 ? Static158.aClass8_Sub1_Sub2_Sub1_1.aClass33_1 : null, local59.anInt2827, false, arg0, local59.anInt2823, local59.anInt2825, Static296.aClass51_7, local59.anInt2824, false, Static81.aClass47_3);
			local59.method5687();
		}
	}
}
