import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!cfa", name = "i", descriptor = "Lclient!ds;")
	public static Class90 aClass90_1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!cfa", name = "c", descriptor = "Ljava/lang/Class;")
	private static Class aClass10;

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "I")
	public static final int anInt1370 = 1401;

	@OriginalMember(owner = "client!cfa", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[200];

	@OriginalMember(owner = "client!cfa", name = "d", descriptor = "Z")
	public static volatile boolean aBoolean148 = true;

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "Z")
	public static boolean aBoolean149 = false;

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lclient!ola;Z)V")
	public static void method1204(@OriginalArg(0) Class2_Sub46 arg0) {
		if (Static632.aClass311ArrayArrayArray3 == null) {
			return;
		}
		@Pc(9) Interface25 local9 = null;
		if (arg0.anInt7508 == 0) {
			local9 = (Interface25) Static91.method1414(arg0.anInt7506, arg0.anInt7501, arg0.anInt7498);
		}
		if (arg0.anInt7508 == 1) {
			local9 = (Interface25) Static366.method5263(arg0.anInt7506, arg0.anInt7501, arg0.anInt7498);
		}
		if (arg0.anInt7508 == 2) {
			local9 = (Interface25) Static140.method2072(arg0.anInt7506, arg0.anInt7501, arg0.anInt7498, aClass10 == null ? (aClass10 = Class59.a("vi")) : aClass10);
		}
		if (arg0.anInt7508 == 3) {
			local9 = (Interface25) Static441.method6382(arg0.anInt7506, arg0.anInt7501, arg0.anInt7498);
		}
		if (local9 == null) {
			arg0.anInt7503 = -1;
			arg0.anInt7502 = 0;
			arg0.anInt7499 = 0;
		} else {
			arg0.anInt7503 = local9.method8986();
			arg0.anInt7502 = local9.method8991((byte) 56);
			arg0.anInt7499 = local9.method8992();
		}
	}
}
