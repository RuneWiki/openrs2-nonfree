import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!op", name = "I", descriptor = "Lclient!sda;")
	public static Class1_Sub45 aClass1_Sub45_1;

	@OriginalMember(owner = "client!op", name = "s", descriptor = "Z")
	public static boolean aBoolean479 = false;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method5814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg3; local7 <= arg2; local7++) {
			for (@Pc(11) int local11 = arg0; local11 <= arg4; local11++) {
				if (Static118.anIntArrayArray26[local7][local11] == arg1 && Static499.anIntArrayArray114[local7][local11] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)I")
	public static int method5815() {
		@Pc(7) Class4 local7 = Static455.aClass4_11;
		@Pc(9) boolean local9 = false;
		if (Static449.anInt7876 != 0) {
			@Pc(15) Canvas local15 = new Canvas();
			local15.setSize(100, 100);
			local9 = true;
			local7 = Static386.method7191(local15, 0, null, null, 0);
		}
		@Pc(37) long local37 = Static110.method2222();
		for (@Pc(39) int local39 = 0; local39 < 10000; local39++) {
			local7.method7215();
		}
		@Pc(66) int local66 = (int) (Static110.method2222() - local37);
		local7.method7162(-16777216, 100, 0, 0, 100);
		if (local9) {
			local7.method7150();
		}
		return local66;
	}
}
