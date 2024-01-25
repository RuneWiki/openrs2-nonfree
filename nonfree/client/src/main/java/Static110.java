import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!gp", name = "B", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame4;

	@OriginalMember(owner = "client!gp", name = "w", descriptor = "I")
	public static int anInt2075 = 0;

	@OriginalMember(owner = "client!gp", name = "x", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!gp", name = "y", descriptor = "Lclient!ka;")
	public static Class109 aClass109_25 = new Class109(64);

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILclient!no;III)V")
	public static void method1953(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub27 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg0 << 14 | arg2 << 28 | arg3);
		@Pc(22) Class5_Sub29 local22 = (Class5_Sub29) Static343.aClass190_33.method5466(local16);
		if (local22 == null) {
			local22 = new Class5_Sub29();
			Static343.aClass190_33.method5464(local22, local16);
			local22.aClass103_113.method2745(arg1);
			return;
		}
		@Pc(44) Class130 local44 = Static322.method544(arg1.anInt4335);
		@Pc(47) int local47 = local44.anInt3860;
		if (local44.anInt3841 == 1) {
			local47 *= arg1.anInt4334 + 1;
		}
		for (@Pc(66) Class5_Sub27 local66 = (Class5_Sub27) local22.aClass103_113.method2756(); local66 != null; local66 = (Class5_Sub27) local22.aClass103_113.method2748()) {
			local44 = Static322.method544(local66.anInt4335);
			@Pc(76) int local76 = local44.anInt3860;
			if (local44.anInt3841 == 1) {
				local76 *= local66.anInt4334 + 1;
			}
			if (local76 < local47) {
				Static235.method4169(local66, arg1);
				return;
			}
		}
		local22.aClass103_113.method2745(arg1);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIII)Z")
	public static boolean method1955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static14.method278(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static72.method1326(local10 + 1, Static8.aClass51Array1[arg0].method1856(arg1, arg2) + arg3, local14 + 1) && Static72.method1326(local10 + 128 - 1, Static8.aClass51Array1[arg0].method1856(arg1 + 1, arg2) + arg3, local14 + 1) && Static72.method1326(local10 + 128 - 1, Static8.aClass51Array1[arg0].method1856(arg1 + 1, arg2 + 1) + arg3, local14 + 128 - 1) && Static72.method1326(local10 + 1, Static8.aClass51Array1[arg0].method1856(arg1, arg2 + 1) + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}
}
