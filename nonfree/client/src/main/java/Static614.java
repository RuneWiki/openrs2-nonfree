import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static614 {

	@OriginalMember(owner = "client!uu", name = "H", descriptor = "Lclient!wm;")
	public static Class390 aClass390_119;

	@OriginalMember(owner = "client!uu", name = "O", descriptor = "Lclient!g;")
	public static Class127 aClass127_12;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
	public static void method8347(@OriginalArg(0) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static273.method4247(local6.width, local6.height);
		if (Static1.anInt9943 == 1) {
			Static374.aClass65_12.method6950(arg0, Static193.anInt3732, Static206.anInt3873);
		} else {
			Static374.aClass65_12.method6950(arg0, Static154.anInt3151, Static513.anInt8561);
		}
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(II)Ljava/lang/String;")
	public static String method8348(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub40 local10 = (Class5_Sub40) Static133.aClass300_10.method7188((long) arg0);
		if (local10 != null) {
			@Pc(22) Class5_Sub9_Sub4 local22 = local10.aClass140_Sub1_1.method7258();
			if (local22 != null) {
				@Pc(29) double local29 = local10.aClass140_Sub1_1.method7250();
				if ((double) local22.method8202() <= local29 && (double) local22.method8204() >= local29) {
					return local22.method8207();
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(III)V")
	public static void method8351(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class5_Sub3_Sub17 local9 = Static358.method5408(14, (long) arg0);
		local9.method7286();
		local9.anInt8546 = arg1;
	}

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "(III)Z")
	public static boolean method8352(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static378.method5638(arg1, arg0) | (arg1 & 0x70000) != 0 || Static399.method5900(arg1, arg0);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IZLclient!baa;)V")
	public static void method8353(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class5_Sub6 arg1) {
		if (arg1.aBoolean36) {
			if (arg1.anInt552 < 0 || Static399.method5893(arg1.anInt542, arg1.anInt552)) {
				if (arg0) {
					Static86.method1837(arg1.anInt554, arg1.anInt551, (Class225) null, arg1.anInt548, arg1.anInt547);
				} else {
					Static530.method7443(arg1.anInt554, arg1.anInt542, arg1.anInt552, -1, arg1.anInt543, arg1.anInt548, arg1.anInt551, arg1.anInt547);
				}
				arg1.method9052();
			}
		} else if (arg1.aBoolean37 && arg1.anInt548 >= 1 && arg1.anInt547 >= 1 && arg1.anInt548 <= Static201.anInt3834 - 2 && arg1.anInt547 <= Static626.anInt10238 - 2 && (arg1.anInt550 < 0 || Static399.method5893(arg1.anInt553, arg1.anInt550))) {
			if (arg0) {
				Static86.method1837(arg1.anInt554, arg1.anInt551, arg1.aClass225_1, arg1.anInt548, arg1.anInt547);
			} else {
				Static530.method7443(arg1.anInt554, arg1.anInt553, arg1.anInt550, -1, arg1.anInt544, arg1.anInt548, arg1.anInt551, arg1.anInt547);
			}
			arg1.aBoolean37 = false;
			if (!arg0 && arg1.anInt552 == arg1.anInt550 && arg1.anInt552 == -1) {
				arg1.method9052();
			} else if (!arg0 && arg1.anInt552 == arg1.anInt550 && arg1.anInt544 == arg1.anInt543 && arg1.anInt542 == arg1.anInt553) {
				arg1.method9052();
			}
		}
	}
}
