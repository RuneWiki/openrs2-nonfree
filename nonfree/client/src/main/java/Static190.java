import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
	public static int anInt3438;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_38 = new Class171(36, -1);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZIIII)V")
	public static void method2929(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static229.anInt4089 < arg2 || arg3 < Static617.anInt6260) {
			return;
		}
		@Pc(20) boolean local20;
		if (arg4 < Static300.anInt5091) {
			local20 = false;
			arg4 = Static300.anInt5091;
		} else if (Static629.anInt10412 < arg4) {
			arg4 = Static629.anInt10412;
			local20 = false;
		} else {
			local20 = true;
		}
		@Pc(51) boolean local51;
		if (Static300.anInt5091 > arg1) {
			local51 = false;
			arg1 = Static300.anInt5091;
		} else if (Static629.anInt10412 < arg1) {
			local51 = false;
			arg1 = Static629.anInt10412;
		} else {
			local51 = true;
		}
		if (arg2 < Static617.anInt6260) {
			arg2 = Static617.anInt6260;
		} else {
			Static578.method7640(arg0, arg4, arg1, Static276.anIntArrayArray32[arg2++]);
		}
		if (Static229.anInt4089 < arg3) {
			arg3 = Static229.anInt4089;
		} else {
			Static578.method7640(arg0, arg4, arg1, Static276.anIntArrayArray32[arg3--]);
		}
		@Pc(111) int local111;
		if (local20 && local51) {
			for (local111 = arg2; local111 <= arg3; local111++) {
				@Pc(155) int[] local155 = Static276.anIntArrayArray32[local111];
				local155[arg4] = local155[arg1] = arg0;
			}
		} else if (local20) {
			for (local111 = arg2; local111 <= arg3; local111++) {
				Static276.anIntArrayArray32[local111][arg4] = arg0;
			}
		} else if (local51) {
			for (local111 = arg2; local111 <= arg3; local111++) {
				Static276.anIntArrayArray32[local111][arg1] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([Lclient!ofa;ZBIII)V")
	public static void method2931(@OriginalArg(0) Class265[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class265 local13 = arg0[local7];
			if (local13 != null && arg3 == local13.anInt6985) {
				Static563.method7423(arg1, arg4, arg2, local13);
				Static285.method4138(arg4, local13, arg2);
				if (local13.anInt7000 - local13.anInt7024 < local13.anInt7033) {
					local13.anInt7033 = local13.anInt7000 - local13.anInt7024;
				}
				if (local13.anInt7002 > local13.anInt7020 - local13.anInt6997) {
					local13.anInt7002 = local13.anInt7020 - local13.anInt6997;
				}
				if (local13.anInt7033 < 0) {
					local13.anInt7033 = 0;
				}
				if (local13.anInt7002 < 0) {
					local13.anInt7002 = 0;
				}
				if (local13.anInt6967 == 0) {
					Static463.method6195(arg1, local13);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	public static void method2932() {
		for (@Pc(9) Class3_Sub5_Sub18 local9 = (Class3_Sub5_Sub18) Static582.aClass302_69.method6603(); local9 != null; local9 = (Class3_Sub5_Sub18) Static582.aClass302_69.method6605()) {
			if (Static97.method1618(local9.anInt9217)) {
				Static100.method1639(local9);
			}
		}
	}
}
