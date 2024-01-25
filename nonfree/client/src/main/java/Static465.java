import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
	public static int anInt7892 = -1;

	@OriginalMember(owner = "client!sh", name = "m", descriptor = "[Lclient!rf;")
	public static final Class274[] aClass274Array1 = new Class274[4];

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "Z")
	public static boolean aBoolean538 = false;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
	public static void method6520() {
		if (!Static492.aBoolean560) {
			return;
		}
		@Pc(11) Class97 local11 = Static50.method681(Static288.anInt4713, Static443.anInt7698);
		if (local11 != null && local11.anObjectArray28 != null) {
			@Pc(20) Class6_Sub36 local20 = new Class6_Sub36();
			local20.anObjectArray34 = local11.anObjectArray28;
			local20.aClass97_7 = local11;
			Static100.method1639(local20);
		}
		Static278.anInt6564 = -1;
		Static537.anInt9108 = -1;
		Static492.aBoolean560 = false;
		if (local11 != null) {
			Static390.method5794(local11);
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!fca;IZ)V")
	public static void method6523(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) int arg2) {
		Static444.aClass97_12 = arg1;
		Static367.anInt6360 = arg0;
		Static186.anInt3245 = arg2;
	}
}
