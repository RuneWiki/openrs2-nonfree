import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_85 = new Class175("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!sc;IIII)V")
	public static void method2133(@OriginalArg(0) Class193 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static96.method1704(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static177.anInt3621) {
			Static96.method1704(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static96.method1704(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static57.anInt1411) {
			Static96.method1704(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static57.anInt1411) {
			Static96.method1704(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static177.anInt3621 && arg4 <= Static57.anInt1411) {
			Static96.method1704(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static96.method1704(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static177.anInt3621 && arg4 > 0) {
			Static96.method1704(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)Lclient!tv;")
	public static Class230 method2134(@OriginalArg(0) int arg0) {
		@Pc(10) Class230 local10 = (Class230) Static348.aClass5_63.method104((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static226.aClass56_58.method1384(0, arg0);
		local10 = new Class230();
		if (local20 != null) {
			local10.method5333(new Class3_Sub2(local20));
		}
		local10.method5335();
		Static348.aClass5_63.method114((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBII)Lclient!gf;")
	public static Class1_Sub3_Sub3 method2136(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class217 local11 = Static151.aClass217ArrayArrayArray3[arg1][arg2][arg0];
		if (local11 == null) {
			return null;
		}
		@Pc(26) Class1_Sub3_Sub3 local26 = null;
		@Pc(28) int local28 = -1;
		for (@Pc(31) Class182 local31 = local11.aClass182_3; local31 != null; local31 = local31.aClass182_2) {
			@Pc(35) Class1_Sub3 local35 = local31.aClass1_Sub3_2;
			if (local35 instanceof Class1_Sub3_Sub3) {
				@Pc(41) Class1_Sub3_Sub3 local41 = (Class1_Sub3_Sub3) local35;
				@Pc(51) int local51 = local41.method4831() * 64 + 60 - 64;
				@Pc(59) int local59 = local41.anInt6053 - local51 >> 7;
				@Pc(66) int local66 = local41.anInt6055 - local51 >> 7;
				@Pc(73) int local73 = local51 + local41.anInt6053 >> 7;
				@Pc(80) int local80 = local41.anInt6055 + local51 >> 7;
				if (arg2 >= local59 && arg0 >= local66 && local73 >= arg2 && local80 >= arg0) {
					@Pc(118) int local118 = (local80 + 1 - arg0) * (local73 + 1 + -arg2);
					if (local28 < local118) {
						local28 = local118;
						local26 = local41;
					}
				}
			}
		}
		return local26;
	}
}
