import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_15 = new Class26(8);

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "Z")
	public static boolean aBoolean106 = false;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!kh;I)V")
	public static void method1481(@OriginalArg(0) Class11_Sub25 arg0) {
		if (arg0.aByteArray93.length - arg0.anInt6076 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method5185();
		if (local21 < 0 || local21 > 15) {
			return;
		}
		@Pc(34) byte local34;
		if (local21 == 15) {
			local34 = 37;
		} else if (local21 == 14) {
			local34 = 36;
		} else if (local21 == 13) {
			local34 = 35;
		} else if (local21 == 12) {
			local34 = 34;
		} else if (local21 == 11) {
			local34 = 33;
		} else if (local21 == 10) {
			local34 = 32;
		} else if (local21 == 9) {
			local34 = 31;
		} else if (local21 == 8) {
			local34 = 30;
		} else if (local21 == 7) {
			local34 = 29;
		} else if (local21 == 6) {
			local34 = 28;
		} else if (local21 == 5) {
			local34 = 28;
		} else if (local21 == 4) {
			local34 = 24;
		} else if (local21 == 3) {
			local34 = 23;
		} else if (local21 == 2) {
			local34 = 22;
		} else if (local21 == 1) {
			local34 = 23;
		} else {
			local34 = 19;
		}
		if (arg0.aByteArray93.length - arg0.anInt6076 < local34) {
			return;
		}
		Static37.anInt693 = arg0.method5185();
		if (Static37.anInt693 < 1) {
			Static37.anInt693 = 1;
		} else if (Static37.anInt693 > 4) {
			Static37.anInt693 = 4;
		}
		Static195.method3970(arg0.method5185() == 1);
		Static147.aBoolean182 = arg0.method5185() == 1;
		Static280.aBoolean11 = arg0.method5185() == 1;
		Static39.aBoolean43 = arg0.method5185() == 1;
		Static54.anInt1026 = arg0.method5185() == 1 ? 1 : 0;
		Static347.aBoolean422 = arg0.method5185() == 1;
		Static107.aBoolean127 = arg0.method5185() == 1;
		Static190.aBoolean248 = arg0.method5185() == 1;
		Static103.anInt1883 = arg0.method5185();
		if (Static103.anInt1883 > 2) {
			Static103.anInt1883 = 2;
		}
		if (local21 < 2) {
			Static52.aBoolean313 = arg0.method5185() == 1;
			arg0.method5185();
		} else {
			Static52.aBoolean313 = arg0.method5185() == 1;
		}
		Static36.aBoolean36 = arg0.method5185() == 1;
		Static117.aBoolean145 = arg0.method5185() == 1;
		Static17.anInt285 = arg0.method5185();
		if (Static17.anInt285 > 2) {
			Static17.anInt285 = 2;
		}
		Static82.anInt1504 = Static17.anInt285;
		Static210.aBoolean289 = arg0.method5185() == 1;
		Static289.anInt5719 = arg0.method5185();
		if (Static289.anInt5719 > 127) {
			Static289.anInt5719 = 127;
		}
		Static249.anInt4975 = arg0.method5185();
		Static326.anInt5865 = arg0.method5185();
		if (Static326.anInt5865 > 127) {
			Static326.anInt5865 = 127;
		}
		if (local21 >= 1) {
			Static9.anInt151 = arg0.method5187();
			Static285.anInt5644 = arg0.method5187();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method5185();
		}
		@Pc(413) int local413;
		if (local21 >= 4) {
			local413 = arg0.method5185();
			if (local413 < 0 || local413 > 2) {
				local413 = 0;
			}
			if (Static355.anInt6753 < 96) {
				local413 = 0;
			}
			Static3.method14(local413);
		}
		if (local21 >= 5) {
			Static104.anInt1926 = arg0.method5198();
		}
		local413 = 0;
		if (local21 >= 6) {
			Static70.anInt1316 = local413 = arg0.method5185();
		}
		if (Static70.anInt1316 != 1 && Static70.anInt1316 != 2) {
			Static70.anInt1316 = 2;
		}
		if (local21 >= 7) {
			Static279.aBoolean362 = arg0.method5185() == 1;
		}
		if (local21 >= 8) {
			Static210.aBoolean290 = arg0.method5185() == 1;
		}
		if (local21 >= 9) {
			Static344.anInt6591 = arg0.method5185();
		}
		if (Static344.anInt6591 < 0 || Static344.anInt6591 > Static239.method4232(Static355.anInt6753)) {
			Static344.anInt6591 = 0;
		}
		if (local21 >= 10) {
			Static193.aBoolean250 = arg0.method5185() != 0;
		}
		if (local21 >= 11) {
			Static79.aBoolean341 = arg0.method5185() != 0;
		}
		if (local21 >= 12) {
			Static54.anInt1026 = arg0.method5185();
		}
		if (Static54.anInt1026 < 0 || Static54.anInt1026 > 2) {
			Static54.anInt1026 = 1;
		}
		if (local21 >= 13) {
			Static55.aBoolean65 = arg0.method5185() == 1;
		}
		if (local21 >= 14) {
			Static276.anInt5525 = arg0.method5185();
		} else if (local413 == 0) {
			Static276.anInt5525 = 2;
		} else {
			Static276.anInt5525 = 1;
		}
		if (Static276.anInt5525 < 0 || Static276.anInt5525 > 3) {
			Static276.anInt5525 = 2;
		}
		if (local21 >= 15) {
			Static150.anInt2727 = arg0.method5185();
			if (Static150.anInt2727 < 0 || Static150.anInt2727 > 4) {
				Static150.anInt2727 = Static340.anInt5690 == 1 ? 2 : 4;
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIII)V")
	public static void method1483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static280.anInt219; local3++) {
			@Pc(9) Rectangle local9 = Class157.aRectangleArray3[local3];
			if (local9.width + local9.x > arg3 && arg3 + arg2 > local9.x && local9.height + local9.y > arg1 && arg0 + arg1 > local9.y) {
				Static18.aBooleanArray1[local3] = true;
			}
		}
	}
}
