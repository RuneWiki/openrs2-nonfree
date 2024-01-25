import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!qs", name = "B", descriptor = "Lclient!fc;")
	public static Class73 aClass73_10;

	@OriginalMember(owner = "client!qs", name = "O", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_83 = new Class183(54, -1);

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "([[BLclient!kt;I)V")
	public static void method4831(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class133_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(19) int local19 = 0; local19 < arg1.anInt3960; local19++) {
			Static131.method2293();
			for (@Pc(25) int local25 = 0; local25 < Static89.anInt1891 >> 3; local25++) {
				for (@Pc(29) int local29 = 0; local29 < Static85.anInt1839 >> 3; local29++) {
					@Pc(33) boolean local33 = false;
					@Pc(41) int local41 = Static321.anIntArrayArrayArray9[local19][local25][local29];
					if (local41 != -1) {
						@Pc(50) int local50 = local41 >> 24 & 0x3;
						if (!arg1.aBoolean282 || local50 == 0) {
							@Pc(61) int local61 = local41 >> 1 & 0x3;
							@Pc(67) int local67 = local41 >> 14 & 0x3FF;
							@Pc(73) int local73 = local41 >> 3 & 0x7FF;
							@Pc(84) int local84 = (local67 / 8 << 8) + (local73 / 8);
							for (@Pc(86) int local86 = 0; local86 < Static71.anIntArray118.length; local86++) {
								if (local84 == Static71.anIntArray118[local86] && arg0[local86] != null) {
									@Pc(104) Class2_Sub24 local104 = new Class2_Sub24(arg0[local86]);
									arg1.method3463(local19, local29 * 8, local73, local50, local67, Static165.aClass178Array1, local25 * 8, local104, local61);
									local33 = true;
									arg1.method3480(local50, local73, local61, Static383.aClass48_9, local25 * 8, local29 * 8, local12[0] == -1 ? local12 : null, local19, local67, local104);
									break;
								}
							}
						}
					}
					if (!local33) {
						arg1.method3462(local29 * 8, 8, 8, local25 * 8, local19);
					}
				}
			}
		}
		if (local12[0] == -1) {
			Static251.aClass58_1 = null;
		} else {
			Static251.aClass58_1 = Static194.aClass52_1.method1206(local12[0], local12[1], Static371.aClass162_1, local12[2], local12[3]);
			Static284.anInt5625 = local12[4];
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(BI)Lclient!ih;")
	public static Class2_Sub7_Sub8 method4834(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub7_Sub8 local15 = (Class2_Sub7_Sub8) Static40.aClass105_1.method2632((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static51.aClass83_30.method1968(0, arg0);
		if (local25 == null || local25.length <= 1) {
			return null;
		} else {
			local15 = Static99.method1733(local25);
			Static40.aClass105_1.method2630(local15, (long) arg0);
			return local15;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!g;Lclient!fi;Lclient!g;BLclient!g;)Z")
	public static boolean method4835(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class2_Sub11_Sub1 arg1, @OriginalArg(2) Class83 arg2, @OriginalArg(4) Class83 arg3) {
		Static222.aClass83_80 = arg0;
		Static36.aClass83_56 = arg3;
		Static67.aClass2_Sub11_Sub1_1 = arg1;
		Static380.aClass83_130 = arg2;
		return true;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;IIBLjava/lang/String;Ljava/lang/String;)V")
	public static void method4840(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static73.anIntArray121[local3] = Static73.anIntArray121[local3 - 1];
			Static226.anIntArray376[local3] = Static226.anIntArray376[local3 - 1];
			Static337.aStringArray38[local3] = Static337.aStringArray38[local3 - 1];
			Static312.aStringArray35[local3] = Static312.aStringArray35[local3 - 1];
			Static217.aStringArray25[local3] = Static217.aStringArray25[local3 - 1];
			Static286.aStringArray28[local3] = Static286.aStringArray28[local3 - 1];
			Static332.anIntArray530[local3] = Static332.anIntArray530[local3 - 1];
		}
		Static73.anIntArray121[0] = arg3;
		Static226.anIntArray376[0] = arg4;
		Static337.aStringArray38[0] = arg5;
		Static312.aStringArray35[0] = arg0;
		Static217.aStringArray25[0] = arg2;
		Static206.anInt4232 = Static245.anInt4796;
		Static286.aStringArray28[0] = arg6;
		Static87.anInt1879++;
		Static332.anIntArray530[0] = arg1;
	}
}
