import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "Lclient!hu;")
	public static Class21 aClass21_26;

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
	public static int anInt6890;

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
	public static int anInt6889 = 0;

	@OriginalMember(owner = "client!nd", name = "G", descriptor = "Z")
	public static boolean aBoolean485 = false;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "()V")
	public static void method5650() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static394.aClass124Array1.length; local3++) {
				if (Static394.aClass124Array1[local3].method3584()) {
					Static183.aLongArray4[local3] = Static394.aClass124Array1[local3].method3587();
				} else {
					synchronized (Static394.aClass124Array1[local3]) {
						Static394.aClass124Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static394.aClass124Array1[Static394.aClass124Array1.length - 1].method3583();
				Static360.method5665(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static394.aClass124Array1.length - 1; local3++) {
						if (!Static394.aClass124Array1[local3].method3584()) {
							synchronized (Static394.aClass124Array1[local3]) {
								Static394.aClass124Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static394.aClass124Array1.length - 2; local102++) {
							Static394.aClass124Array1[local102].method3583();
						}
						Static360.method5665(2);
						while (!Static394.aClass124Array1[0].method3584()) {
							synchronized (Static394.aClass124Array1[0]) {
								Static394.aClass124Array1[0].notify();
							}
							try {
								Static214.method4061(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static394.aClass124Array1[0].method3583();
						return;
					}
					try {
						Static214.method4061(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static214.method4061(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!fd;ZIIZLclient!fd;I)I")
	public static int method5651(@OriginalArg(0) Class98_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class98_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = Static609.method7963(arg0, arg1, arg2, arg4);
		if (local10 != 0) {
			return arg1 ? -local10 : local10;
		} else if (arg5 == -1) {
			return 0;
		} else {
			@Pc(37) int local37 = Static609.method7963(arg0, arg3, arg5, arg4);
			return arg3 ? -local37 : local37;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBI)Z")
	public static boolean method5652(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)Z")
	public static boolean method5653(@OriginalArg(1) int arg0) {
		return arg0 == 6 || arg0 == 50 || arg0 == 59 || arg0 == 45 || arg0 == 18 || arg0 == 11 || arg0 == 13;
	}

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "(B)V")
	public static void method5654() {
		if (Static479.aClass8_Sub5_Sub6_1 != null) {
			Static479.aClass8_Sub5_Sub6_1 = null;
			Static76.method1967(Static331.anInt10704, Static358.anInt6868, Static264.anInt5648, Static528.anInt9126);
		}
	}
}
