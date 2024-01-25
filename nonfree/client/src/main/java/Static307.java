import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!mda", name = "e", descriptor = "Lclient!ws;")
	public static final Class361 aClass361_46 = new Class361();

	@OriginalMember(owner = "client!mda", name = "j", descriptor = "[I")
	public static final int[] anIntArray423 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIBIIII)V")
	public static void method4851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) int local16 = Static201.method3634(arg1, Static415.anInt9494, Static583.anInt9478);
		@Pc(22) int local22 = Static201.method3634(arg5, Static415.anInt9494, Static583.anInt9478);
		@Pc(28) int local28 = Static201.method3634(arg4, Static461.anInt7899, Static13.anInt7634);
		@Pc(34) int local34 = Static201.method3634(arg0, Static461.anInt7899, Static13.anInt7634);
		@Pc(42) int local42 = Static201.method3634(arg3 + arg1, Static415.anInt9494, Static583.anInt9478);
		@Pc(51) int local51 = Static201.method3634(arg5 - arg3, Static415.anInt9494, Static583.anInt9478);
		for (@Pc(53) int local53 = local16; local53 < local42; local53++) {
			Static208.method3687(local28, arg2, Static454.anIntArrayArray71[local53], local34);
		}
		for (@Pc(73) int local73 = local22; local73 > local51; local73--) {
			Static208.method3687(local28, arg2, Static454.anIntArrayArray71[local73], local34);
		}
		@Pc(96) int local96 = Static201.method3634(arg4 + arg3, Static461.anInt7899, Static13.anInt7634);
		@Pc(105) int local105 = Static201.method3634(arg0 - arg3, Static461.anInt7899, Static13.anInt7634);
		for (@Pc(107) int local107 = local42; local107 <= local51; local107++) {
			@Pc(113) int[] local113 = Static454.anIntArrayArray71[local107];
			Static208.method3687(local28, arg2, local113, local96);
			Static208.method3687(local105, arg2, local113, local34);
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4852(@OriginalArg(0) String arg0) {
		if (!Static438.aClass272_5.aBoolean511) {
			return -1;
		} else if (Static399.aHashtable4.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(22) String local22 = Static2.method59(arg0);
			if (local22 == null) {
				return -1;
			}
			@Pc(35) String local35 = Static299.aString41 + local22;
			if (!Static30.aClass251_13.method5776(local35, "")) {
				return -1;
			} else if (Static30.aClass251_13.method5753(local35)) {
				@Pc(61) byte[] local61 = Static30.aClass251_13.method5762("", local35);
				@Pc(65) File local65 = Static504.method6801(local22);
				if (local61 == null || local65 == null) {
					return -1;
				}
				@Pc(76) boolean local76 = true;
				@Pc(80) byte[] local80 = Static441.method6280(local65);
				if (local80 != null && local80.length == local61.length) {
					for (@Pc(89) int local89 = 0; local89 < local80.length; local89++) {
						if (local80[local89] != local61[local89]) {
							local76 = false;
							break;
						}
					}
				} else {
					local76 = false;
				}
				try {
					if (!local76) {
						Static438.aClass272_5.method6116(local65, local61);
					}
				} catch (@Pc(129) Throwable local129) {
					return -1;
				}
				Static509.method7731(arg0, local65);
				return 100;
			} else {
				return Static30.aClass251_13.method5756(local35);
			}
		}
	}
}
