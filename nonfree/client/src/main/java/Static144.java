import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!jf", name = "Ad", descriptor = "I")
	public static int anInt2967;

	@OriginalMember(owner = "client!jf", name = "K", descriptor = "I")
	public static int anInt2894 = 0;

	@OriginalMember(owner = "client!jf", name = "xc", descriptor = "[[I")
	public static final int[][] anIntArrayArray19 = new int[128][128];

	@OriginalMember(owner = "client!jf", name = "Rc", descriptor = "[I")
	public static final int[] anIntArray189 = new int[50];

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
	public static void method2696(@OriginalArg(0) int arg0) {
		Static55.anInt1337 = -1;
		if (arg0 == 37) {
			Static186.aFloat99 = 3.0F;
		} else if (arg0 == 50) {
			Static186.aFloat99 = 4.0F;
		} else if (arg0 == 75) {
			Static186.aFloat99 = 6.0F;
		} else if (arg0 == 100) {
			Static186.aFloat99 = 8.0F;
		} else if (arg0 == 200) {
			Static186.aFloat99 = 16.0F;
		}
		Static55.anInt1337 = -1;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)Z")
	public static boolean method2699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class137 local7 = Static228.method3923(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local7.method3710(arg1);
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
	public static void method2701() {
		@Pc(8) int local8 = Static354.method5830();
		if (local8 == 0) {
			Static293.aByteArrayArrayArray25 = null;
			Static122.method2409(0);
		} else if (local8 == 1) {
			Static65.method1808((byte) 0);
			Static122.method2409(512);
			if (Static32.aByteArrayArrayArray4 != null) {
				Static231.method3970();
			}
		} else {
			Static65.method1808((byte) (Static117.anInt2497 - 4 & 0xFF));
			Static122.method2409(2);
		}
		Static77.anInt1844 = Static156.anInt3123;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)V")
	public static void method2704(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static26.anInt627 = arg0;
	}
}
