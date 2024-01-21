import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!wi", name = "M", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1231 = Static181.method2795("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!wi", name = "T", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1233 = Static181.method2795(" has logged in)3");

	@OriginalMember(owner = "client!wi", name = "O", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1232 = aClass83_1233;

	@OriginalMember(owner = "client!wi", name = "R", descriptor = "Lclient!ra;")
	public static final Class2_Sub3 aClass2_Sub3_5 = new Class2_Sub3(new byte[5000]);

	@OriginalMember(owner = "client!wi", name = "X", descriptor = "[Z")
	public static final boolean[] aBooleanArray30 = new boolean[5];

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIZ)V")
	public static void method3270(@OriginalArg(3) boolean arg0) {
		Static68.anInt1622 = 22050;
		Static152.anInt3096 = 2;
		Static105.aBoolean119 = arg0;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)Lclient!ac;")
	public static Class2_Sub2_Sub1 method3272(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub2_Sub1 local10 = (Class2_Sub2_Sub1) Static137.aClass86_41.method2643((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static89.aClass28_205.method852(arg0, 16);
		local10 = new Class2_Sub2_Sub1();
		if (local20 != null) {
			local10.method89(new Class2_Sub3(local20));
		}
		Static137.aClass86_41.method2647(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!h;IIIIII)V")
	public static void method3273(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray143.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray143[local5] - Static87.anInt1883;
			local20 = arg0.anIntArray139[local5] - Static57.anInt1428;
			local27 = arg0.anIntArray138[local5] - Static95.anInt2024;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray136 != null) {
				Static65.anIntArray133[local5] = local37;
				Static65.anIntArray142[local5] = local59;
				Static65.anIntArray144[local5] = local69;
			}
			Static65.anIntArray132[local5] = Static24.anInt626 + (local37 << 9) / local69;
			Static65.anIntArray145[local5] = Static24.anInt628 + (local59 << 9) / local69;
		}
		Static24.anInt627 = 0;
		local3 = arg0.anIntArray140.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray140[local13];
			local27 = arg0.anIntArray137[local13];
			local37 = arg0.anIntArray135[local13];
			@Pc(142) int local142 = Static65.anIntArray132[local20];
			@Pc(146) int local146 = Static65.anIntArray132[local27];
			@Pc(150) int local150 = Static65.anIntArray132[local37];
			@Pc(154) int local154 = Static65.anIntArray145[local20];
			@Pc(158) int local158 = Static65.anIntArray145[local27];
			@Pc(162) int local162 = Static65.anIntArray145[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				if (Static192.aBoolean178 && Static53.method1040(Static169.anInt3514 + Static24.anInt626, Static214.anInt4257 + Static24.anInt628, local154, local158, local162, local142, local146, local150)) {
					Static132.anInt2867 = arg5;
					Static201.anInt4001 = arg6;
				}
				Static24.aBoolean36 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static24.anInt625 || local146 > Static24.anInt625 || local150 > Static24.anInt625) {
					Static24.aBoolean36 = true;
				}
				if (arg0.anIntArray136 == null || arg0.anIntArray136[local13] == -1) {
					if (arg0.anIntArray131[local13] != 12345678) {
						Static24.method479(local154, local158, local162, local142, local146, local150, arg0.anIntArray131[local13], arg0.anIntArray134[local13], arg0.anIntArray141[local13]);
					}
				} else if (Static171.aBoolean164) {
					@Pc(367) int local367 = Static24.anInterface3_1.method1292(arg0.anIntArray136[local13]);
					Static24.method479(local154, local158, local162, local142, local146, local150, Static10.method286(local367, arg0.anIntArray131[local13]), Static10.method286(local367, arg0.anIntArray134[local13]), Static10.method286(local367, arg0.anIntArray141[local13]));
				} else if (arg0.aBoolean82) {
					Static24.method461(local154, local158, local162, local142, local146, local150, arg0.anIntArray131[local13], arg0.anIntArray134[local13], arg0.anIntArray141[local13], Static65.anIntArray133[0], Static65.anIntArray133[1], Static65.anIntArray133[3], Static65.anIntArray142[0], Static65.anIntArray142[1], Static65.anIntArray142[3], Static65.anIntArray144[0], Static65.anIntArray144[1], Static65.anIntArray144[3], arg0.anIntArray136[local13]);
				} else {
					Static24.method461(local154, local158, local162, local142, local146, local150, arg0.anIntArray131[local13], arg0.anIntArray134[local13], arg0.anIntArray141[local13], Static65.anIntArray133[local20], Static65.anIntArray133[local27], Static65.anIntArray133[local37], Static65.anIntArray142[local20], Static65.anIntArray142[local27], Static65.anIntArray142[local37], Static65.anIntArray144[local20], Static65.anIntArray144[local27], Static65.anIntArray144[local37], arg0.anIntArray136[local13]);
				}
			}
		}
	}
}
