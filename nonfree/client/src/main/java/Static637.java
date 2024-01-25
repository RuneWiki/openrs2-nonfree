import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static637 {

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
	public static int anInt10210 = 0;

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
	public static int anInt10214 = 0;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "Z")
	public static boolean aBoolean860 = false;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I[B)Z")
	public static boolean method8380(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class3_Sub15 local8 = new Class3_Sub15(arg0);
		@Pc(12) int local12 = local8.method8401();
		if (local12 != 2) {
			return false;
		}
		@Pc(26) boolean local26 = local8.method8401() == 1;
		if (local26) {
			Static64.method8135(local8);
		}
		Static260.method4854(local8);
		return true;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!mb;)V")
	public static void method8381(@OriginalArg(0) Class2_Sub3 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(7) Class2_Sub3 local7 = null;
			for (@Pc(11) Class2_Sub3 local11 = Static44.aClass2_Sub3Array3[local4]; local11 != null; local11 = local11.aClass2_Sub3_23) {
				if (local11 == arg0) {
					if (local7 == null) {
						Static44.aClass2_Sub3Array3[local4] = local11.aClass2_Sub3_23;
					} else {
						local7.aClass2_Sub3_23 = local11.aClass2_Sub3_23;
					}
					Static160.aBoolean330 = true;
					return;
				}
				local7 = local11;
			}
			local7 = null;
			for (@Pc(43) Class2_Sub3 local43 = Static464.aClass2_Sub3Array6[local4]; local43 != null; local43 = local43.aClass2_Sub3_23) {
				if (local43 == arg0) {
					if (local7 == null) {
						Static464.aClass2_Sub3Array6[local4] = local43.aClass2_Sub3_23;
					} else {
						local7.aClass2_Sub3_23 = local43.aClass2_Sub3_23;
					}
					Static160.aBoolean330 = true;
					return;
				}
				local7 = local43;
			}
			local7 = null;
			for (@Pc(75) Class2_Sub3 local75 = Static634.aClass2_Sub3Array7[local4]; local75 != null; local75 = local75.aClass2_Sub3_23) {
				if (local75 == arg0) {
					if (local7 == null) {
						Static634.aClass2_Sub3Array7[local4] = local75.aClass2_Sub3_23;
					} else {
						local7.aClass2_Sub3_23 = local75.aClass2_Sub3_23;
					}
					Static160.aBoolean330 = true;
					return;
				}
				local7 = local75;
			}
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
	public static void method8382() {
		if (Static453.aClass251Array1 == null) {
			Static453.aClass251Array1 = Static411.method6444();
			Static531.aClass251_22 = Static453.aClass251Array1[0];
			Static102.aLong262 = Static444.method6719();
		}
		if (Static99.aClass348_1 == null) {
			Static573.method8006();
		}
		@Pc(27) Class251 local27 = Static531.aClass251_22;
		@Pc(30) int local30 = Static174.method3573();
		if (Static531.aClass251_22 == local27) {
			Static155.aString34 = Static531.aClass251_22.aClass176_64.method4986(Static380.anInt7247);
			if (Static531.aClass251_22.aBoolean658) {
				Static563.anInt9573 = Static531.aClass251_22.anInt7696 + (Static531.aClass251_22.anInt7692 - Static531.aClass251_22.anInt7696) * local30 / 100;
			}
			if (Static531.aClass251_22.aBoolean657) {
				Static155.aString34 = Static155.aString34 + Static563.anInt9573 + "%";
			}
		} else if (Static531.aClass251_22 == Static411.aClass251_21) {
			Static99.aClass348_1 = null;
			Static182.method3694(3);
		} else {
			Static155.aString34 = local27.aClass176_63.method4986(Static380.anInt7247);
			Static563.anInt9573 = local27.anInt7692;
			if (Static531.aClass251_22.aBoolean657) {
				Static155.aString34 = Static155.aString34 + local27.anInt7692 + "%";
			}
			if (Static531.aClass251_22.aBoolean658 || local27.aBoolean658) {
				Static102.aLong262 = Static444.method6719();
			}
		}
		if (Static99.aClass348_1 == null) {
			return;
		}
		Static99.aClass348_1.method8106(Static155.aString34, Static531.aClass251_22, Static563.anInt9573, Static102.aLong262);
		if (Static284.anInterface15Array1 == null) {
			return;
		}
		for (@Pc(130) int local130 = Static423.anInt7824 + 1; local130 < Static284.anInterface15Array1.length; local130++) {
			if (Static284.anInterface15Array1[local130].method7159() >= 100 && local130 - 1 == Static423.anInt7824 && Static581.anInt9720 >= 1 && Static99.aClass348_1.method8105()) {
				try {
					Static284.anInterface15Array1[local130].method7158();
				} catch (@Pc(160) Exception local160) {
					Static284.anInterface15Array1 = null;
					return;
				}
				Static99.aClass348_1.method8107(Static284.anInterface15Array1[local130]);
				Static423.anInt7824++;
				if (Static423.anInt7824 >= Static284.anInterface15Array1.length - 1 && Static284.anInterface15Array1.length > 1) {
					Static423.anInt7824 = Static556.aClass154_1.method4768() ? 0 : -1;
				}
			}
		}
		return;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
	public static void method8383(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		Static331.anInt6610 = 2;
		Static231.anInt5230 = arg1;
		Static192.method3818(arg2, false, arg0);
	}
}
