import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!nia", name = "m", descriptor = "D")
	public static double aDouble15;

	@OriginalMember(owner = "client!nia", name = "k", descriptor = "I")
	public static int anInt6793;

	@OriginalMember(owner = "client!nia", name = "l", descriptor = "I")
	public static int anInt6788 = 0;

	@OriginalMember(owner = "client!nia", name = "r", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_106 = new Class397(138, 6);

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "([[IZ)V")
	public static void method5869(@OriginalArg(0) int[][] arg0) {
		Static118.anIntArrayArray7 = arg0;
	}

	@OriginalMember(owner = "client!nia", name = "c", descriptor = "(I)Z")
	public static boolean method5871() {
		@Pc(15) boolean local15 = true;
		if (Static549.aClass361_5 == null) {
			if (Static218.aClass182_59.method3964(Static261.anInt4038)) {
				Static549.aClass361_5 = Static735.method8272(Static218.aClass182_59, Static261.anInt4038);
			} else {
				local15 = false;
			}
		}
		if (Static472.aClass361_6 == null) {
			if (Static218.aClass182_59.method3964(Static236.anInt3785)) {
				Static472.aClass361_6 = Static735.method8272(Static218.aClass182_59, Static236.anInt3785);
			} else {
				local15 = false;
			}
		}
		if (Static711.aClass361_8 == null) {
			if (Static218.aClass182_59.method3964(Static683.anInt10658)) {
				Static711.aClass361_8 = Static735.method8272(Static218.aClass182_59, Static683.anInt10658);
			} else {
				local15 = false;
			}
		}
		if (Static341.aClass169_7 == null) {
			if (Static652.aClass182_33.method3964(Static275.anInt5502)) {
				Static341.aClass169_7 = Static462.method6278(Static275.anInt5502, Static652.aClass182_33);
			} else {
				local15 = false;
			}
		}
		if (Static260.aClass361Array1 == null) {
			if (Static218.aClass182_59.method3964(Static275.anInt5502)) {
				Static260.aClass361Array1 = Static735.method8275(Static218.aClass182_59, Static275.anInt5502);
			} else {
				local15 = false;
			}
		}
		return local15;
	}
}
