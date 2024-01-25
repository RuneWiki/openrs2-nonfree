import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "[I")
	public static int[] anIntArray511;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "[I")
	public static int[] anIntArray512;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "[I")
	public static int[] anIntArray513;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIZI[Lclient!sj;)V")
	public static void method5229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) Class181[] arg4) {
		for (@Pc(12) int local12 = 0; local12 < arg4.length; local12++) {
			@Pc(18) Class181 local18 = arg4[local12];
			if (local18 != null && local18.anInt5734 == arg0) {
				Static222.method3879(arg3, arg1, local18, arg2);
				Static254.method4264(local18, arg2, arg1);
				if (local18.anInt5717 > local18.anInt5737 - local18.anInt5704) {
					local18.anInt5717 = local18.anInt5737 - local18.anInt5704;
				}
				if (local18.anInt5717 < 0) {
					local18.anInt5717 = 0;
				}
				if (local18.anInt5685 > local18.anInt5724 - local18.anInt5721) {
					local18.anInt5685 = local18.anInt5724 - local18.anInt5721;
				}
				if (local18.anInt5685 < 0) {
					local18.anInt5685 = 0;
				}
				if (local18.anInt5715 == 0) {
					Static140.method2299(arg3, local18);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
	public static void method5232() {
		@Pc(5) Class198 local5 = Static140.aClass198_23;
		synchronized (Static140.aClass198_23) {
			Static140.aClass198_23.method5236();
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBIII)V")
	public static void method5233(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static312.anInt6281; local3++) {
			@Pc(9) Rectangle local9 = Class3.aRectangleArray122[local3];
			if (local9.width + local9.x > arg2 && arg2 + arg0 > local9.x && arg1 < local9.height + local9.y && local9.y < arg1 + arg3) {
				Static28.aBooleanArray1[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIII)V")
	public static void method5240(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 >= Static19.anInt533 && Static4.anInt75 >= arg1 && Static236.anInt4721 <= arg2 && Static73.anInt1425 >= arg3) {
			if (arg4 == 1) {
				Static182.method3247(arg0, arg5, arg1, arg3, arg2);
			} else {
				Static29.method590(arg4, arg0, arg1, arg2, arg3, arg5);
			}
		} else if (arg4 == 1) {
			Static73.method1121(arg5, arg3, arg2, arg0, arg1);
		} else {
			Static262.method5721(arg5, arg4, arg3, arg1, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "([Ljava/lang/String;[SI)V")
	public static void method5245(@OriginalArg(0) String[] arg0, @OriginalArg(1) short[] arg1) {
		Static230.method5541(0, arg0.length - 1, arg1, arg0);
	}
}
