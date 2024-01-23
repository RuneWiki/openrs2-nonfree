import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!am", name = "v", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!am", name = "x", descriptor = "I")
	public static int anInt212;

	@OriginalMember(owner = "client!am", name = "y", descriptor = "Lclient!cd;")
	public static Class27 aClass27_1;

	@OriginalMember(owner = "client!am", name = "z", descriptor = "[Lclient!uj;")
	public static Class4_Sub3_Sub14[] aClass4_Sub3_Sub14Array2;

	@OriginalMember(owner = "client!am", name = "o", descriptor = "Lclient!ll;")
	public static Class114 aClass114_2 = new Class114();

	@OriginalMember(owner = "client!am", name = "B", descriptor = "I")
	public static int anInt214 = 0;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II)V")
	public static void method191() {
		Static223.aClass26_45.method517(5);
		Static296.aClass26_57.method517(5);
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(II)I")
	public static int method192(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!ll;III)V")
	public static void method193(@OriginalArg(0) Class114 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static113.aClass114_13.method2619();
		if (Static240.aBoolean318) {
			return;
		}
		for (@Pc(23) Class4_Sub3_Sub7 local23 = (Class4_Sub3_Sub7) arg0.method2623(); local23 != null; local23 = (Class4_Sub3_Sub7) arg0.method2629()) {
			@Pc(30) Class83 local30 = Static142.method2192(local23.anInt1760);
			if (Static9.method120(local30)) {
				Static294.method3848(arg1, local23, arg2, local30);
				if (local23.aBoolean106) {
					Static284.method4366(local23, local30);
				}
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/lang/String;IIIIIILclient!gl;Lclient!wf;)V")
	public static void method194(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class4_Sub3_Sub5 arg7, @OriginalArg(9) Class189 arg8) {
		@Pc(14) int local14 = arg5 * arg5 + arg3 * arg3;
		@Pc(21) int local21 = (int) Static202.aFloat97 + Static269.anInt3585 & 0x7FF;
		@Pc(33) int local33 = Math.max(arg8.anInt5897 / 2, arg8.anInt5953 / 2) + 10;
		if (local33 * local33 < local14) {
			return;
		}
		@Pc(43) int local43 = Class111.anIntArray298[local21];
		@Pc(51) int local51 = local43 * 256 / (Static250.anInt4762 + 256);
		@Pc(55) int local55 = Class111.anIntArray299[local21];
		@Pc(63) int local63 = local55 * 256 / (Static250.anInt4762 + 256);
		@Pc(74) int local74 = local63 * arg3 + local51 * arg5 >> 16;
		@Pc(79) int local79 = arg7.method2268(arg1, 100);
		@Pc(85) int local85 = arg7.method2280(arg1);
		@Pc(96) int local96 = arg3 * local51 - local63 * arg5 >> 16;
		@Pc(111) int local111 = local74 - local79 / 2;
		if (-arg8.anInt5897 > local111 || local111 > arg8.anInt5897 || -arg8.anInt5953 > local96 || local96 > arg8.anInt5953) {
			return;
		}
		if (Static94.aBoolean138) {
			Static104.method1697((Class4_Sub3_Sub14_Sub2) arg8.method4766(false));
		} else {
			Static270.method4255(arg8.anIntArray672, arg8.anIntArray657);
		}
		arg7.method2267(arg1, local111 + arg4 + arg8.anInt5897 / 2, arg2 + arg8.anInt5953 / 2 + -local96 + -arg6 + -local85, local79, 50, arg0, 0, 1, 0, 0);
		if (Static94.aBoolean138) {
			Static104.method1703();
		} else {
			Static270.method4265();
		}
	}
}
