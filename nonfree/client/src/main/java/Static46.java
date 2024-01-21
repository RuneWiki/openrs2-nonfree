import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!eg", name = "X", descriptor = "Lclient!ab;")
	public static Class2_Sub2 aClass2_Sub2_3;

	@OriginalMember(owner = "client!eg", name = "Y", descriptor = "I")
	public static int anInt1237 = 0;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIII)Z")
	public static boolean method886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static110.method1878(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static88.method1581(local10 + 1, Static90.anIntArrayArrayArray7[arg0][arg1][arg2] + arg3, local14 + 1) && Static88.method1581(local10 + 128 - 1, Static90.anIntArrayArrayArray7[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static88.method1581(local10 + 128 - 1, Static90.anIntArrayArrayArray7[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static88.method1581(local10 + 1, Static90.anIntArrayArrayArray7[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I[Lclient!ff;Z)V")
	public static void method887(@OriginalArg(0) int arg0, @OriginalArg(1) Class24[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class24 local9 = arg1[local3];
			if (local9 != null) {
				if (local9.anInt1425 == 0) {
					if (local9.aClass24Array1 != null) {
						method887(arg0, local9.aClass24Array1);
					}
					@Pc(33) Class2_Sub22 local33 = (Class2_Sub22) Static121.aClass35_35.method1354((long) local9.anInt1367);
					if (local33 != null) {
						Static95.method1646(local33.anInt2866, arg0);
					}
				}
				@Pc(52) Class2_Sub21 local52;
				if (arg0 == 0 && local9.anObjectArray24 != null) {
					local52 = new Class2_Sub21();
					local52.anObjectArray29 = local9.anObjectArray24;
					local52.aClass24_9 = local9;
					Static118.method2854(local52);
				}
				if (arg0 == 1 && local9.anObjectArray25 != null) {
					if (local9.anInt1409 >= 0) {
						@Pc(79) Class24 local79 = Static58.method1035(local9.anInt1367);
						if (local79 == null || local79.aClass24Array1 == null || local9.anInt1409 >= local79.aClass24Array1.length || local9 != local79.aClass24Array1[local9.anInt1409]) {
							continue;
						}
					}
					local52 = new Class2_Sub21();
					local52.aClass24_9 = local9;
					local52.anObjectArray29 = local9.anObjectArray25;
					Static118.method2854(local52);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILclient!jc;)V")
	public static void method888(@OriginalArg(1) Class40 arg0) {
		Static73.aClass40_19 = arg0;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V")
	public static void method890() {
		aClass2_Sub2_3 = null;
	}
}
