import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!vo", name = "H", descriptor = "[[B")
	public static byte[][] aByteArrayArray46;

	@OriginalMember(owner = "client!vo", name = "A", descriptor = "[[S")
	public static final short[][] aShortArrayArray8 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIILclient!tq;)V")
	public static void method5814(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class239 arg2) {
		if (Static274.aBoolean336) {
			@Pc(172) Class255 local172 = Static415.anInt6945 == -1 ? null : Static414.aClass258_2.method5882(Static415.anInt6945);
			if (Static54.method1017(arg2).method4847() && (Static172.anInt3044 & 0x20) != 0 && (local172 == null || arg2.method5363(local172.anInt7133, Static415.anInt6945) != local172.anInt7133)) {
				Static361.method5112(Static263.aString38 + " -> " + arg2.aString56, 48, arg2.anInt6423, arg2.anInt6487, Static60.anInt1241, true, Static26.aString21, arg2.anInt6492, 0L, false);
			}
			return;
		}
		@Pc(12) String local12;
		for (@Pc(5) int local5 = 9; local5 >= 5; local5--) {
			local12 = Static450.method5986(local5, arg2);
			if (local12 != null) {
				Static361.method5112(arg2.aString56, 1007, arg2.anInt6423, arg2.anInt6487, Static325.method4616(arg2, local5), true, local12, arg2.anInt6492, (long) (local5 + 1), false);
			}
		}
		local12 = Static4.method30(arg2);
		if (local12 != null) {
			Static361.method5112(arg2.aString56, 15, arg2.anInt6423, arg2.anInt6487, arg2.anInt6410, true, local12, arg2.anInt6492, 0L, false);
		}
		for (@Pc(73) int local73 = 4; local73 >= 0; local73--) {
			@Pc(80) String local80 = Static450.method5986(local73, arg2);
			if (local80 != null) {
				Static361.method5112(arg2.aString56, 18, arg2.anInt6423, arg2.anInt6487, Static325.method4616(arg2, local73), true, local80, arg2.anInt6492, (long) (local73 + 1), false);
			}
		}
		if (!Static54.method1017(arg2).method4846()) {
			return;
		}
		if (arg2.aString60 == null) {
			Static361.method5112("", 3, arg2.anInt6423, arg2.anInt6487, -1, true, Static253.aClass231_76.method5138(Static382.anInt6289), arg2.anInt6492, 0L, false);
		} else {
			Static361.method5112("", 3, arg2.anInt6423, arg2.anInt6487, -1, true, arg2.aString60, arg2.anInt6492, 0L, false);
		}
	}
}
