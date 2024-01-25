import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!l", name = "p", descriptor = "I")
	public static int anInt6306;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!ar;)V")
	public static void method4970(@OriginalArg(1) Class3_Sub5 arg0) {
		arg0.aBoolean457 = false;
		if (arg0.aClass3_Sub13_5 != null) {
			arg0.aClass3_Sub13_5.anInt1848 = 0;
		}
		for (@Pc(21) Class3_Sub5 local21 = arg0.method5187(); local21 != null; local21 = arg0.method5188()) {
			method4970(local21);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!bi;[[B)V")
	public static void method4971(@OriginalArg(1) Class4_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(14) int local14 = Static445.aByteArrayArray25.length;
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			@Pc(22) byte[] local22 = arg1[local16];
			if (local22 != null) {
				@Pc(35) int local35 = (Static289.anIntArray407[local16] >> 8) * 64 - Static108.anInt3458;
				@Pc(46) int local46 = (Static289.anIntArray407[local16] & 0xFF) * 64 - Static339.anInt6223;
				Static143.method2556();
				arg0.method755(local46, local35, Static266.aClass75_7, local22, Static389.aClass23Array1);
			}
		}
	}
}
