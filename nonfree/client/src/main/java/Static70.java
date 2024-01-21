import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "Lclient!df;")
	public static Class16 aClass16_53;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "Lclient!jb;")
	public static Class25 aClass25_22;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
	public static int anInt2197;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
	public static int anInt2201;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
	public static int anInt2194 = -1;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "Lclient!qf;")
	private static Class60 aClass60_948 = Static59.method1195("Your ignore list is full)3 Max of 100 hit");

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "[J")
	public static long[] aLongArray3 = new long[32];

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "Lclient!qf;")
	public static Class60 aClass60_949 = Static59.method1195("blinken3:");

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "Lclient!qf;")
	public static Class60 aClass60_950 = Static59.method1195("Okay");

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "Lclient!qf;")
	public static Class60 aClass60_951 = aClass60_948;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "[I")
	public static int[] anIntArray223 = new int[2000];

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
	public static int anInt2202 = 0;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)V")
	public static void method1459(@OriginalArg(1) boolean arg0) {
		if (Static77.anInt2428 == Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1524 >> 7 && Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1494 >> 7 == Static31.anInt1107) {
			Static77.anInt2428 = 0;
		}
		@Pc(21) int local21 = Static53.anInt1744;
		if (arg0) {
			local21 = 1;
		}
		for (@Pc(31) int local31 = 0; local31 < local21; local31++) {
			@Pc(47) Class3_Sub1_Sub1_Sub3_Sub1 local47;
			@Pc(41) int local41;
			if (arg0) {
				local41 = 33538048;
				local47 = Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1;
			} else {
				local41 = Static14.anIntArray56[local31] << 14;
				local47 = Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[Static14.anIntArray56[local31]];
			}
			if (local47 != null && local47.method1023()) {
				local47.aBoolean22 = false;
				@Pc(67) int local67 = local47.anInt1524 >> 7;
				if ((Static14.aBoolean15 && Static53.anInt1744 > 50 || Static53.anInt1744 > 200) && !arg0 && local47.anInt1486 == local47.anInt1539) {
					local47.aBoolean22 = true;
				}
				@Pc(96) int local96 = local47.anInt1494 >> 7;
				if (local67 >= 0 && local67 < 104 && local96 >= 0 && local96 < 104) {
					if (local47.aClass3_Sub1_Sub1_Sub4_1 == null || local47.anInt624 > Static34.anInt1183 || local47.anInt626 <= Static34.anInt1183) {
						if ((local47.anInt1524 & 0x7F) == 64 && (local47.anInt1494 & 0x7F) == 64) {
							if (Static130.anInt3484 == Static83.anIntArrayArray63[local67][local96]) {
								continue;
							}
							Static83.anIntArrayArray63[local67][local96] = Static130.anInt3484;
						}
						local47.anInt634 = Static66.method1353(local47.anInt1524, Static119.anInt3243, local47.anInt1494);
						Static13.aClass58_1.method1767(Static119.anInt3243, local47.anInt1524, local47.anInt1494, local47.anInt634, 60, local47, local47.anInt1525, local41, local47.aBoolean48);
					} else {
						local47.aBoolean22 = false;
						local47.anInt634 = Static66.method1353(local47.anInt1524, Static119.anInt3243, local47.anInt1494);
						Static13.aClass58_1.method1743(Static119.anInt3243, local47.anInt1524, local47.anInt1494, local47.anInt634, local47, local47.anInt1525, local41, local47.anInt630, local47.anInt642, local47.anInt638, local47.anInt621);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public static void method1460() {
		aLongArray3 = null;
		aClass60_951 = null;
		aClass60_950 = null;
		aClass60_949 = null;
		aClass60_948 = null;
		aClass25_22 = null;
		aClass16_53 = null;
		anIntArray223 = null;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)I")
	public static int method1461() {
		return Static96.anInt2744++;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!jb;I)V")
	public static void method1462(@OriginalArg(0) Class25 arg0) {
		Static38.aClass25_7 = arg0;
	}
}
