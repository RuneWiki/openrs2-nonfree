import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!co", name = "U", descriptor = "Lclient!lf;")
	public static Class90 aClass90_7;

	@OriginalMember(owner = "client!co", name = "V", descriptor = "[[I")
	public static int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!co", name = "N", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_29 = new Class140(64);

	@OriginalMember(owner = "client!co", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString40 = null;

	@OriginalMember(owner = "client!co", name = "W", descriptor = "I")
	public static int anInt1155 = 0;

	@OriginalMember(owner = "client!co", name = "X", descriptor = "Lclient!pj;")
	public static final Class156 aClass156_5 = new Class156(16);

	@OriginalMember(owner = "client!co", name = "Y", descriptor = "Lclient!tc;")
	public static final Class195 aClass195_7 = new Class195();

	@OriginalMember(owner = "client!co", name = "Z", descriptor = "I")
	public static int anInt1156 = 0;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIILclient!ie;ILclient!aa;B)V")
	public static void method1130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class91 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2 arg6) {
		@Pc(10) Interface8 local10 = null;
		if (arg3 == 0) {
			local10 = (Interface8) Static264.method4812(arg5, arg1, arg2);
		}
		if (arg3 == 1) {
			local10 = (Interface8) Static57.method1233(arg5, arg1, arg2);
		}
		if (arg3 == 2) {
			local10 = (Interface8) Static66.method1372(arg5, arg1, arg2, tr.class);
		}
		if (arg3 == 3) {
			local10 = (Interface8) Static331.method5551(arg5, arg1, arg2);
		}
		if (local10 == null) {
			return;
		}
		@Pc(59) int local59 = local10.method5699();
		@Pc(63) int local63 = local10.method5701();
		@Pc(69) Class188 local69 = Static126.method2405(local10.method5697());
		if (local69.method4908()) {
			Static282.method4867(arg5, arg2, arg1, local69);
		}
		if (local10.method5700()) {
			local10.method5696(arg6);
		}
		if (arg3 != 0) {
			if (arg3 == 1) {
				Static205.method3808(arg5, arg1, arg2);
				return;
			}
			if (arg3 == 2) {
				Static278.method4803(arg5, arg1, arg2, tr.class);
				if (local69.anInt5529 == 0 || local69.anInt5541 + arg1 >= Static48.anInt1107 || Static337.anInt6402 <= local69.anInt5541 + arg2 || Static48.anInt1107 <= local69.anInt5533 + arg1 || local69.anInt5533 + arg2 >= Static337.anInt6402) {
					return;
				}
				arg4.method2601(arg1, local69.anInt5541, !local69.aBoolean480, local69.anInt5533, local69.aBoolean473, local63, arg2);
			} else if (arg3 == 3) {
				Static4.method175(arg5, arg1, arg2);
				if (local69.anInt5529 == 1) {
					arg4.method2599(arg2, arg1);
					return;
				}
			}
			return;
		}
		Static11.method4799(arg5, arg1, arg2);
		if (local69.anInt5529 != 0) {
			arg4.method2590(arg1, local69.aBoolean473, arg2, local59, !local69.aBoolean480, local63);
			return;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V")
	public static void method1131() {
		@Pc(1) Class140 local1 = Static135.aClass140_73;
		synchronized (Static135.aClass140_73) {
			Static135.aClass140_73.method3813();
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIBIII)V")
	public static void method1132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 >= Static106.anInt2157 && arg5 <= Static251.anInt6512 && arg6 >= Static49.anInt1124 && arg0 <= Static291.anInt5657) {
			Static2.method3283(arg2, arg4, arg3, arg6, arg1, arg0, arg5);
		} else {
			Static352.method5705(arg5, arg0, arg4, arg3, arg2, arg1, arg6);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIBI)V")
	public static void method1133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static118.anInt4791; local7++) {
			@Pc(13) Rectangle local13 = Class1_Sub2_Sub3.aRectangleArray1[local7];
			if (arg2 < local13.x + local13.width && arg1 + arg2 > local13.x && local13.y + local13.height > arg3 && arg3 + arg0 > local13.y) {
				Static313.aBooleanArray30[local7] = true;
			}
		}
	}
}
