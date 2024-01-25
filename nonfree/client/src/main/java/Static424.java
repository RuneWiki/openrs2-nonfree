import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!qba", name = "y", descriptor = "Z")
	public static boolean aBoolean564 = true;

	@OriginalMember(owner = "client!qba", name = "C", descriptor = "[Lclient!eg;")
	public static final Class93[] aClass93Array1 = new Class93[4];

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(II)V")
	public static void method6093(@OriginalArg(1) int arg0) {
		if (Static463.anInt7968 == arg0) {
			return;
		}
		Static188.anInt3850 = Static49.anInt1174 = Static217.anIntArray260[arg0];
		Static262.method4041();
		Static590.anIntArrayArray70 = new int[Static188.anInt3850][Static49.anInt1174];
		Static66.anIntArrayArrayArray30 = new int[4][Static188.anInt3850 >> 3][Static49.anInt1174 >> 3];
		Static173.anIntArrayArray18 = new int[Static188.anInt3850][Static49.anInt1174];
		for (@Pc(44) int local44 = 0; local44 < 4; local44++) {
			Static495.aClass355Array1[local44] = Static71.method1165(Static49.anInt1174, Static188.anInt3850);
		}
		Static143.aByteArrayArrayArray50 = new byte[4][Static188.anInt3850][Static49.anInt1174];
		Static286.method4237(Static49.anInt1174, Static188.anInt3850);
		Static203.method3298(Static307.aClass100_6, Static49.anInt1174 >> 3, Static188.anInt3850 >> 3);
		Static463.anInt7968 = arg0;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IILclient!kp;)Ljava/lang/String;")
	public static String method6100(@OriginalArg(1) int arg0, @OriginalArg(2) Class196 arg1) {
		if (!Static67.method1102(arg1).method5423(arg0) && arg1.anObjectArray30 == null) {
			return null;
		} else if (arg1.aStringArray84 == null || arg0 >= arg1.aStringArray84.length || arg1.aStringArray84[arg0] == null || arg1.aStringArray84[arg0].trim().length() == 0) {
			return Static298.aBoolean425 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray84[arg0];
		}
	}
}
