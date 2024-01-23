import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
	public static int anInt4722;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "[Lclient!de;")
	public static Class36[] aClass36Array1 = new Class36[4];

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "[S")
	public static short[] aShortArray71 = new short[500];

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
	public static int anInt4718 = -1;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "[I")
	public static int[] anIntArray476 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString149 = "";

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
	public static int anInt4719 = 20;

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
	public static int anInt4721 = 0;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZLclient!ok;II)V")
	public static void method3740(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class116 arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int local4 = arg2.anInt4299;
		if (arg2.aByte15 == 0) {
			arg2.anInt4299 = arg2.anInt4292;
		} else if (arg2.aByte15 == 1) {
			arg2.anInt4299 = arg0 - arg2.anInt4292;
		} else if (arg2.aByte15 == 2) {
			arg2.anInt4299 = arg0 * arg2.anInt4292 >> 14;
		} else if (arg2.aByte15 == 3) {
			if (arg2.anInt4376 == 2) {
				arg2.anInt4299 = arg2.anInt4292 * 32 + arg2.anInt4373 * (arg2.anInt4292 - 1);
			} else if (arg2.anInt4376 == 7) {
				arg2.anInt4299 = arg2.anInt4292 * 115 + (arg2.anInt4292 - 1) * arg2.anInt4373;
			}
		}
		@Pc(104) int local104 = arg2.anInt4363;
		if (arg2.aByte13 == 0) {
			arg2.anInt4363 = arg2.anInt4347;
		} else if (arg2.aByte13 == 1) {
			arg2.anInt4363 = arg3 - arg2.anInt4347;
		} else if (arg2.aByte13 == 2) {
			arg2.anInt4363 = arg3 * arg2.anInt4347 >> 14;
		} else if (arg2.aByte13 == 3) {
			if (arg2.anInt4376 == 2) {
				arg2.anInt4363 = arg2.anInt4377 * (arg2.anInt4347 - 1) + arg2.anInt4347 * 32;
			} else if (arg2.anInt4376 == 7) {
				arg2.anInt4363 = arg2.anInt4377 * (arg2.anInt4347 - 1) + arg2.anInt4347 * 12;
			}
		}
		if (arg2.aByte15 == 4) {
			arg2.anInt4299 = arg2.anInt4363 * arg2.anInt4346 / arg2.anInt4379;
		}
		if (arg2.aByte13 == 4) {
			arg2.anInt4363 = arg2.anInt4299 * arg2.anInt4379 / arg2.anInt4346;
		}
		if (Static24.aBoolean27 && (Static37.method866(arg2).anInt1450 != 0 || arg2.anInt4376 == 0)) {
			if (arg2.anInt4363 < 5 && arg2.anInt4299 < 5) {
				arg2.anInt4363 = 5;
				arg2.anInt4299 = 5;
			} else {
				if (arg2.anInt4299 <= 0) {
					arg2.anInt4299 = 5;
				}
				if (arg2.anInt4363 <= 0) {
					arg2.anInt4363 = 5;
				}
			}
		}
		if (arg2.anInt4301 == 1337) {
			Static59.aClass116_2 = arg2;
		}
		if (arg1 && arg2.anObjectArray19 != null && (arg2.anInt4299 != local4 || arg2.anInt4363 != local104)) {
			@Pc(297) Class1_Sub27 local297 = new Class1_Sub27();
			local297.aClass116_13 = arg2;
			local297.anObjectArray32 = arg2.anObjectArray19;
			Static131.aClass131_7.method3799(local297);
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
	public static void method3741() {
		@Pc(13) Container local13;
		if (Static158.aFrame2 != null) {
			local13 = Static158.aFrame2;
		} else if (Static48.aFrame1 == null) {
			local13 = Static43.aClass66_1.anApplet1;
		} else {
			local13 = Static48.aFrame1;
		}
		Static105.anInt6113 = local13.getSize().width;
		Static80.anInt1912 = local13.getSize().height;
		@Pc(35) Insets local35;
		if (Static48.aFrame1 == local13) {
			local35 = Static48.aFrame1.getInsets();
			Static105.anInt6113 -= local35.left + local35.right;
			Static80.anInt1912 -= local35.bottom + local35.top;
		}
		if (Static277.method4610() >= 2) {
			Static54.anInt1439 = 0;
			Static144.anInt3368 = Static80.anInt1912;
			Static193.anInt4370 = Static105.anInt6113;
			Static186.anInt4165 = 0;
		} else {
			Static186.anInt4165 = 0;
			Static54.anInt1439 = (Static105.anInt6113 - 765) / 2;
			Static193.anInt4370 = 765;
			Static144.anInt3368 = 503;
		}
		if (Static296.aBoolean335) {
			Static296.method4828(Static193.anInt4370, Static144.anInt3368);
		}
		Static9.aCanvas1.setSize(Static193.anInt4370, Static144.anInt3368);
		if (Static48.aFrame1 == local13) {
			local35 = Static48.aFrame1.getInsets();
			Static9.aCanvas1.setLocation(Static54.anInt1439 + local35.left, local35.top - -Static186.anInt4165);
		} else {
			Static9.aCanvas1.setLocation(Static54.anInt1439, Static186.anInt4165);
		}
		if (Static194.anInt4389 != -1) {
			Static87.method1517(true);
		}
		Static275.method4583();
	}
}
