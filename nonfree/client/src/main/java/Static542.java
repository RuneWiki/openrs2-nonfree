import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
	public static int anInt8800;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BIZI)I")
	public static int method7708(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class6_Sub3 local8 = Static536.method7657(arg1, arg0);
		if (local8 == null) {
			return -1;
		} else if (arg2 >= 0 && local8.anIntArray21.length > arg2) {
			return local8.anIntArray21[arg2];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
	public static void method7709() {
		Static672.aClass381Array3 = null;
		if (Static93.aBoolean113 && Static368.method5566() != 1) {
			Static649.method8701(0, Static357.method5436(), Static37.anInt498 == 3 || Static37.anInt498 == 7, 0, Static312.method4955());
		}
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		if (Static93.aBoolean113) {
			local39 = Static24.method290();
			local41 = Static488.method7227();
		}
		Static278.method3590(local41 + Static274.anInt3226, local41, local41, -1, local39, local39 + Static535.anInt4128, local39, Static635.anInt9910);
		if (Static672.aClass381Array3 != null) {
			Static184.method3454(Static504.anInt8425, -1412584499, local39, local39 + Static535.anInt4128, Static274.anInt3226 + local41, Static220.aClass381_4.anInt10074, true, local41, Static183.anInt3686, Static672.aClass381Array3);
			Static672.aClass381Array3 = null;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLclient!jc;)Lclient!gca;")
	public static Class129 method7710(@OriginalArg(1) Class6_Sub15 arg0) {
		@Pc(7) int local7 = arg0.method3018();
		return new Class129(local7);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIJ)Ljava/lang/String;")
	public static String method7711(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		Static302.method4852(arg1);
		@Pc(10) int local10 = Static390.aCalendar1.get(5);
		@Pc(16) int local16 = Static390.aCalendar1.get(2) + 1;
		@Pc(31) int local31 = Static390.aCalendar1.get(1);
		return Integer.toString(local10 / 10) + local10 % 10 + "/" + local16 / 10 + local16 % 10 + "/" + local31 % 100 / 10 + local31 % 10;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)V")
	public static void method7712() {
		if (Static520.aClass352_8 != Static92.aClass352_4) {
			try {
				Static692.method2495("tbrefresh", Static635.aClient1);
			} catch (@Pc(28) Throwable local28) {
			}
		}
	}
}
