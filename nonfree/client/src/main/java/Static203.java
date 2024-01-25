import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
	public static int anInt2040;

	@OriginalMember(owner = "client!ke", name = "w", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_40 = new Class254(35, 7);

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method1669(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(12) int local12 = Static97.anInt1902;
		@Pc(14) int[] local14 = Static105.anIntArray107;
		@Pc(16) boolean local16 = false;
		for (@Pc(18) int local18 = 0; local18 < local12; local18++) {
			@Pc(26) Class47_Sub1_Sub5_Sub2 local26 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local14[local18]];
			if (local26 != null && Static255.aClass47_Sub1_Sub5_Sub2_2 != local26 && local26.aString66 != null && local26.aString66.equalsIgnoreCase(arg1)) {
				if (arg0 == 1) {
					Static224.method3272(Static370.aClass254_146);
					Static201.aClass1_Sub14_Sub2_2.method4545(0);
					Static201.aClass1_Sub14_Sub2_2.method4504(local14[local18]);
				} else if (arg0 == 4) {
					Static224.method3272(Static148.aClass254_136);
					Static201.aClass1_Sub14_Sub2_2.method4505(local14[local18]);
					Static201.aClass1_Sub14_Sub2_2.method4545(0);
				} else if (arg0 == 5) {
					Static224.method3272(Static416.aClass254_137);
					Static201.aClass1_Sub14_Sub2_2.method4553(0);
					Static201.aClass1_Sub14_Sub2_2.method4535(local14[local18]);
				} else if (arg0 == 6) {
					Static224.method3272(Static452.aClass254_149);
					Static201.aClass1_Sub14_Sub2_2.method4554(0);
					Static201.aClass1_Sub14_Sub2_2.method4504(local14[local18]);
				} else if (arg0 == 7) {
					Static224.method3272(Static49.aClass254_22);
					Static201.aClass1_Sub14_Sub2_2.method4505(local14[local18]);
					Static201.aClass1_Sub14_Sub2_2.method4544(0);
				}
				local16 = true;
				break;
			}
		}
		if (!local16) {
			Static353.method5059(Static369.aClass96_99.method1935(Static389.anInt7061) + arg1);
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)Lclient!tn;")
	public static Class229 method1670(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(18) int local18 = arg0 & 0xFFFF;
		if (Static276.aClass229ArrayArray1[local7] == null || Static276.aClass229ArrayArray1[local7][local18] == null) {
			@Pc(32) boolean local32 = Static111.method1740(local7);
			if (!local32) {
				return null;
			}
		}
		return Static276.aClass229ArrayArray1[local7][local18];
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIB)I")
	public static int method1671(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(46) int local46 = (arg0 & 0x7F) * 96 >> 7;
			if (local46 < 2) {
				local46 = 2;
			} else if (local46 > 126) {
				local46 = 126;
			}
			return (arg0 & 0xFF80) + local46;
		}
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)V")
	public static void method1673(@OriginalArg(1) int arg0) {
		Static192.anInt3512 = arg0;
		Static223.aClass151_103.method3298();
	}
}
