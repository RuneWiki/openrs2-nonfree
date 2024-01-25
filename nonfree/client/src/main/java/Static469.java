import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!rw", name = "m", descriptor = "I")
	public static int anInt8895;

	@OriginalMember(owner = "client!rw", name = "h", descriptor = "Lclient!hp;")
	public static final Class143 aClass143_4 = new Class143();

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method6819(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(21) int local21 = local8.length() - 3; local21 > 0; local21 -= 3) {
			local8 = local8.substring(0, local21) + "," + local8.substring(local21);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static223.aClass152_37.method3624(Static142.anInt3088) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static223.aClass152_39.method3624(Static142.anInt3088) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIIIIIIIBI)V")
	public static void method6821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class4_Sub51 local7 = null;
		for (@Pc(12) Class4_Sub51 local12 = (Class4_Sub51) Static322.aClass22_43.method895(); local12 != null; local12 = (Class4_Sub51) Static322.aClass22_43.method889()) {
			if (arg2 == local12.anInt10464 && local12.anInt10463 == arg4 && arg5 == local12.anInt10474 && local12.anInt10469 == arg1) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class4_Sub51();
			local7.anInt10469 = arg1;
			local7.anInt10463 = arg4;
			local7.anInt10474 = arg5;
			local7.anInt10464 = arg2;
			if (arg4 >= 0 && arg5 >= 0 && arg4 < Static338.anInt6508 && Static390.anInt7654 > arg5) {
				Static573.method8078(local7);
			}
			Static322.aClass22_43.method894(local7);
		}
		local7.anInt10470 = -1;
		local7.anInt10472 = arg6;
		local7.anInt10465 = arg0;
		local7.anInt10473 = arg3;
		local7.anInt10466 = 0;
	}
}
