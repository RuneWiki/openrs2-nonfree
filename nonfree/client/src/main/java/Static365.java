import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
	public static int anInt6515 = 0;

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
	public static int anInt6516 = 765;

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "Z")
	public static boolean aBoolean415 = true;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
	public static void method5493() {
		Static151.anInt3129 = 0;
		Static292.aClass244_25.method5969();
		Static250.aBoolean294 = false;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I[Lclient!ts;B)V")
	public static void method5494(@OriginalArg(0) int arg0, @OriginalArg(1) Class239[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class239 local9 = arg1[local3];
			if (local9 != null) {
				if (local9.anInt6900 == 0) {
					if (local9.aClass239Array2 != null) {
						method5494(arg0, local9.aClass239Array2);
					}
					@Pc(33) Class6_Sub9 local33 = (Class6_Sub9) Static432.aClass74_33.method1883((long) local9.anInt6908);
					if (local33 != null) {
						Static101.method1824(arg0, local33.anInt1505);
					}
				}
				@Pc(49) Class6_Sub42 local49;
				if (arg0 == 0 && local9.anObjectArray10 != null) {
					local49 = new Class6_Sub42();
					local49.aClass239_13 = local9;
					local49.anObjectArray36 = local9.anObjectArray10;
					Static166.method2744(local49);
				}
				if (arg0 == 1 && local9.anObjectArray25 != null) {
					if (local9.anInt6907 >= 0) {
						@Pc(74) Class239 local74 = Static121.method2092(local9.anInt6908);
						if (local74 == null || local74.aClass239Array2 == null || local74.aClass239Array2.length <= local9.anInt6907 || local74.aClass239Array2[local9.anInt6907] != local9) {
							continue;
						}
					}
					local49 = new Class6_Sub42();
					local49.anObjectArray36 = local9.anObjectArray25;
					local49.aClass239_13 = local9;
					Static166.method2744(local49);
				}
			}
		}
	}
}
