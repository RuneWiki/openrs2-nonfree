import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "[I")
	public static final int[] anIntArray711 = new int[13];

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
	public static int anInt9643 = 0;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)V")
	public static void method7902(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub7_Sub5 local8 = Static218.method3780(6, arg0);
		local8.method3066();
		local8.anInt3348 = arg1;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)Z")
	public static boolean method7903(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method7905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 < 1 || arg3 < 1 || Static38.anInt740 - 2 < arg7 || Static38.anInt741 - 2 < arg3) {
			return;
		}
		@Pc(26) int local26 = arg4;
		if (arg4 < 3 && Static163.method3178(arg3, arg7)) {
			local26 = arg4 + 1;
		}
		if (!Static189.aClass4_Sub2_Sub1_1.method7652(Static403.anInt6994) && !Static209.method7919(Static312.anInt9775, arg3, arg7, local26)) {
			return;
		}
		if (Static309.aClass100ArrayArrayArray2 == null) {
			return;
		}
		Static560.aClass85_Sub1_2.method2389(arg3, Static15.aClass84Array1[arg4], arg7, arg4, Static185.aClass66_14, arg0);
		if (arg6 < 0) {
			return;
		}
		@Pc(69) boolean local69 = Static189.aClass4_Sub2_Sub1_1.aBoolean656;
		Static189.aClass4_Sub2_Sub1_1.aBoolean656 = true;
		Static560.aClass85_Sub1_2.method2388(arg3, Static15.aClass84Array1[arg4], Static185.aClass66_14, arg2, arg1, arg4, arg7, local26, arg5, arg6);
		Static189.aClass4_Sub2_Sub1_1.aBoolean656 = local69;
		return;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!gba;III)V")
	public static void method7906(@OriginalArg(0) Class115 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static190.anInt3969 = arg1;
		Static518.aClass115_14 = arg0;
		Static190.anInt3970 = arg2;
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)V")
	public static void method7907() {
		Static319.anInt5739 = -1;
		Static435.anInt7462 = -1;
		Static451.anInt9796 = 0;
	}
}
