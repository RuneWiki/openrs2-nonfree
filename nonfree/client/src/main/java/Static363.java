import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!pb", name = "x", descriptor = "[S")
	public static short[] aShortArray161;

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
	public static int anInt6805 = 0;

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_110 = new Class67("M", "M", "M", "M");

	@OriginalMember(owner = "client!pb", name = "E", descriptor = "I")
	public static int anInt6817 = 0;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(III)Z")
	public static boolean method5711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static40.anIntArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == -Static457.anInt8266) {
			return false;
		} else if (local7 == Static457.anInt8266) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static33.anInt880;
			@Pc(26) int local26 = arg2 << Static33.anInt880;
			if (Static434.method6594(local22 + 1, Static511.aClass52Array3[arg0].JA(arg1, arg2), local26 + 1) && Static434.method6594(local22 + Static219.anInt4777 - 1, Static511.aClass52Array3[arg0].JA(arg1 + 1, arg2), local26 + 1) && Static434.method6594(local22 + Static219.anInt4777 - 1, Static511.aClass52Array3[arg0].JA(arg1 + 1, arg2 + 1), local26 + Static219.anInt4777 - 1) && Static434.method6594(local22 + 1, Static511.aClass52Array3[arg0].JA(arg1, arg2 + 1), local26 + Static219.anInt4777 - 1) && Static434.method6594(local22 + Static467.anInt8424, Static511.aClass52Array3[arg0].JA(arg1, arg2), local26 + 1) && Static434.method6594(local22 + Static219.anInt4777 - 1, Static511.aClass52Array3[arg0].JA(arg1 + 1, arg2), local26 + Static467.anInt8424) && Static434.method6594(local22 + Static467.anInt8424, Static511.aClass52Array3[arg0].JA(arg1, arg2 + 1), local26 + Static219.anInt4777 - 1) && Static434.method6594(local22 + Static219.anInt4777 - 1, Static511.aClass52Array3[arg0].JA(arg1, arg2), local26 + Static467.anInt8424) && Static434.method6594(local22 + Static467.anInt8424, Static511.aClass52Array3[arg0].JA(arg1, arg2), local26 + Static467.anInt8424)) {
				Static40.anIntArrayArrayArray3[arg0][arg1][arg2] = Static457.anInt8266;
				return true;
			} else {
				Static40.anIntArrayArrayArray3[arg0][arg1][arg2] = -Static457.anInt8266;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[Lclient!qf;I)V")
	public static void method5716(@OriginalArg(1) Class245[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class245 local9 = arg0[local3];
			if (local9 != null) {
				if (local9.anInt7223 == 0) {
					if (local9.aClass245Array2 != null) {
						method5716(local9.aClass245Array2, arg1);
					}
					@Pc(33) Class3_Sub29 local33 = (Class3_Sub29) Static156.aClass267_14.method6644((long) local9.anInt7256);
					if (local33 != null) {
						Static342.method5429(arg1, local33.anInt5522);
					}
				}
				@Pc(49) Class3_Sub21 local49;
				if (arg1 == 0 && local9.anObjectArray18 != null) {
					local49 = new Class3_Sub21();
					local49.anObjectArray4 = local9.anObjectArray18;
					local49.aClass245_8 = local9;
					Static60.method1227(local49);
				}
				if (arg1 == 1 && local9.anObjectArray14 != null) {
					if (local9.anInt7264 >= 0) {
						@Pc(72) Class245 local72 = Static46.method1005(local9.anInt7256);
						if (local72 == null || local72.aClass245Array2 == null || local72.aClass245Array2.length <= local9.anInt7264 || local9 != local72.aClass245Array2[local9.anInt7264]) {
							continue;
						}
					}
					local49 = new Class3_Sub21();
					local49.anObjectArray4 = local9.anObjectArray14;
					local49.aClass245_8 = local9;
					Static60.method1227(local49);
				}
			}
		}
	}
}
