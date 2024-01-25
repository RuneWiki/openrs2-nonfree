import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!oj", name = "tc", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas4;

	@OriginalMember(owner = "client!oj", name = "vc", descriptor = "I")
	public static int anInt4704;

	@OriginalMember(owner = "client!oj", name = "Cb", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_142 = new Class102(50, -1);

	@OriginalMember(owner = "client!oj", name = "pc", descriptor = "[I")
	public static final int[] anIntArray406 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!oj", name = "sc", descriptor = "Lclient!gs;")
	public static final Class93 aClass93_4 = new Class93();

	@OriginalMember(owner = "client!oj", name = "uc", descriptor = "Z")
	public static boolean aBoolean332 = true;

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
	public static void method3816() {
		Static41.method626();
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(B)Lclient!ti;")
	public static Class2_Sub40 method3820() {
		if (Static282.aClass156_23 == null || Static366.aClass32_1 == null) {
			return null;
		}
		for (@Pc(16) Class2_Sub40 local16 = (Class2_Sub40) Static366.aClass32_1.method667(); local16 != null; local16 = (Class2_Sub40) Static366.aClass32_1.method667()) {
			@Pc(24) Class78 local24 = Static282.aClass120_4.method2512(local16.anInt6352);
			if (local24 != null && local24.aBoolean144 && local24.method1749(Static282.anInterface12_2)) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!za;IIIIII)Lclient!e;")
	public static Class59 method3822(@OriginalArg(0) Class163 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) long local11 = (long) arg3;
		@Pc(17) Class59 local17 = (Class59) Static419.aClass132_57.method2701(local11);
		if (local17 == null) {
			@Pc(27) Class205 local27 = Static278.method3725(Static145.aClass54_44, arg3);
			if (local27 == null) {
				return null;
			}
			if (local27.anInt5616 < 13) {
				local27.method4443();
			}
			local17 = arg0.method5530(local27, 2055, Static396.anInt7303, 64, 768);
			Static419.aClass132_57.method2711(local17, local11);
		}
		local17 = local17.method5737((byte) 2, 2055, true);
		if (arg5 != 0) {
			local17.ma(arg5);
		}
		if (arg4 != 0) {
			local17.W(arg4);
		}
		if (arg1 != 0) {
			local17.K(arg1);
		}
		if (arg2 != 0) {
			local17.a(0, arg2, 0);
		}
		return local17;
	}
}
