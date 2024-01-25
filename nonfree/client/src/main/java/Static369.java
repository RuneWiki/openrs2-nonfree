import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(B)V")
	public static void method5323() {
		@Pc(20) int local20 = Static96.aClass6_Sub22_7.aClass29_Sub29_2.method9003();
		if (local20 == 0) {
			Static75.aByteArrayArrayArray1 = null;
			Static100.method1650(0);
		} else if (local20 == 1) {
			Static201.method7513((byte) 0);
			Static100.method1650(512);
			if (Static90.aByteArrayArrayArray2 != null) {
				Static668.method9068();
			}
		} else {
			Static201.method7513((byte) (Static61.anInt1167 - 4 & 0xFF));
			Static100.method1650(2);
		}
		Static26.anInt604 = Static253.anInt4353;
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIIII)Z")
	public static boolean method5324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static90.aByteArrayArrayArray2[0][arg3][arg2] & 0x2) != 0) {
			return true;
		} else if ((Static90.aByteArrayArrayArray2[arg0][arg3][arg2] & 0x10) == 0) {
			return Static70.method1233(arg0, arg2, arg3) == arg1;
		} else {
			return false;
		}
	}
}
