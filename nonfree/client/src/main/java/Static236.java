import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "J")
	public static long aLong31;

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
	public static int anInt929;

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_21 = new Class140("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
	public static int anInt928 = 0;

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "[I")
	public static final int[] anIntArray88 = new int[50];

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "Z")
	public static boolean aBoolean94 = false;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method1163(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static209.anInt6939; local11++) {
			if (arg0.equalsIgnoreCase(Static190.aStringArray42[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static177.aClass1_Sub2_Sub3_Sub1_1.aString34);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)V")
	public static void method1164(@OriginalArg(1) int arg0) {
		Static6.anInt88 = arg0;
		@Pc(7) Class107 local7 = Static258.aClass107_38;
		synchronized (Static258.aClass107_38) {
			Static258.aClass107_38.method3015();
		}
		local7 = Static217.aClass107_29;
		synchronized (Static217.aClass107_29) {
			Static217.aClass107_29.method3015();
		}
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(II)V")
	public static void method1168() {
		@Pc(5) Class107 local5 = Static298.aClass107_46;
		synchronized (Static298.aClass107_46) {
			Static298.aClass107_46.method3011(5);
		}
		local5 = Static310.aClass107_51;
		synchronized (Static310.aClass107_51) {
			Static310.aClass107_51.method3011(5);
		}
	}
}
