import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!qd", name = "P", descriptor = "Lclient!fe;")
	public static Class10_Sub5_Sub1 aClass10_Sub5_Sub1_1;

	@OriginalMember(owner = "client!qd", name = "bb", descriptor = "Lclient!va;")
	public static Class61 aClass61_878 = Static88.method1421(":tradereq:");

	@OriginalMember(owner = "client!qd", name = "db", descriptor = "I")
	public static int anInt2196 = 0;

	@OriginalMember(owner = "client!qd", name = "eb", descriptor = "Lclient!va;")
	public static Class61 aClass61_879 = Static88.method1421("k");

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZ)V")
	public static void method1274(@OriginalArg(1) boolean arg0) {
		if (Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1654 >> 7 == Static35.anInt1020 && Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1649 >> 7 == Static50.anInt1406) {
			Static35.anInt1020 = 0;
		}
		@Pc(29) int local29 = Static10.anInt305;
		if (arg0) {
			local29 = 1;
		}
		for (@Pc(35) int local35 = 0; local35 < local29; local35++) {
			@Pc(43) Class10_Sub1_Sub5_Sub2_Sub2 local43;
			@Pc(41) int local41;
			if (arg0) {
				local41 = 33538048;
				local43 = Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1;
			} else {
				local43 = Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[Static58.anIntArray170[local35]];
				local41 = Static58.anIntArray170[local35] << 14;
			}
			if (local43 != null && local43.method927()) {
				local43.aBoolean81 = false;
				@Pc(71) int local71 = local43.anInt1654 >> 7;
				@Pc(76) int local76 = local43.anInt1649 >> 7;
				if ((Static31.aBoolean43 && Static10.anInt305 > 50 || Static10.anInt305 > 200) && !arg0 && local43.anInt1647 == local43.anInt1674) {
					local43.aBoolean81 = true;
				}
				if (local71 >= 0 && local71 < 104 && local76 >= 0 && local76 < 104) {
					if (local43.aClass10_Sub1_Sub5_Sub4_1 == null || local43.anInt1695 > Static95.anInt2442 || Static95.anInt2442 >= local43.anInt1706) {
						if ((local43.anInt1654 & 0x7F) == 64 && (local43.anInt1649 & 0x7F) == 64) {
							if (Static101.anInt2558 == Static51.anIntArrayArray12[local71][local76]) {
								continue;
							}
							Static51.anIntArrayArray12[local71][local76] = Static101.anInt2558;
						}
						local43.anInt1692 = Static39.method230(local43.anInt1654, Static101.anInt2582, local43.anInt1649);
						Static48.aClass54_1.method1354(Static101.anInt2582, local43.anInt1654, local43.anInt1649, local43.anInt1692, 60, local43, local43.anInt1646, local41, local43.aBoolean80);
					} else {
						local43.aBoolean81 = false;
						local43.anInt1692 = Static39.method230(local43.anInt1654, Static101.anInt2582, local43.anInt1649);
						Static48.aClass54_1.method1366(Static101.anInt2582, local43.anInt1654, local43.anInt1649, local43.anInt1692, local43, local43.anInt1646, local41, local43.anInt1705, local43.anInt1691, local43.anInt1699, local43.anInt1689);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I[BII)Lclient!va;")
	public static Class61 method1276(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class61 local7 = new Class61();
		local7.anInt2559 = arg1;
		local7.aByteArray18 = new byte[arg1];
		Static110.method560(arg0, arg2, local7.aByteArray18, 0, arg1);
		return local7;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
	public static void method1277() {
		aClass61_878 = null;
		aClass10_Sub5_Sub1_1 = null;
		aClass61_879 = null;
	}
}
