import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
	public static int anInt1066;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "Lclient!af;")
	public static Class5 aClass5_502 = Static45.method1937("Freie Welt");

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "Lclient!af;")
	private static Class5 aClass5_512 = Static45.method1937("Type");

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "Lclient!af;")
	public static Class5 aClass5_503 = aClass5_512;

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "[I")
	public static int[] anIntArray185 = new int[25];

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "Lclient!af;")
	private static Class5 aClass5_506 = Static45.method1937("Please use a different world)3");

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "Lclient!af;")
	public static Class5 aClass5_504 = aClass5_506;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "Lclient!af;")
	private static Class5 aClass5_505 = Static45.method1937("Players");

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
	public static int anInt1062 = 2;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "Lclient!af;")
	public static Class5 aClass5_507 = aClass5_506;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "Lclient!af;")
	public static Class5 aClass5_508 = Static45.method1937("Mem:");

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "Lclient!af;")
	private static Class5 aClass5_511 = Static45.method1937(" is already on your ignore list");

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "Lclient!af;")
	public static Class5 aClass5_509 = aClass5_511;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "Lclient!af;")
	public static Class5 aClass5_510 = Static45.method1937("(U1");

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	public static int anInt1065 = 0;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "Lclient!af;")
	public static Class5 aClass5_513 = aClass5_505;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "Lclient!af;")
	public static Class5 aClass5_514 = Static45.method1937("headicons_prayer");

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "Lclient!af;")
	public static Class5 aClass5_515 = Static45.method1937("Fallen lassen");

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "[I")
	public static int[] anIntArray186 = new int[500];

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!we;")
	public static RuntimeException_Sub1 method786(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString5 = local12.aString5 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZB)V")
	public static void method787(@OriginalArg(0) boolean arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static93.anInt2338; local3++) {
			@Pc(13) int local13 = (Static131.anIntArray468[local3] << 14) + 536870912;
			@Pc(19) Class1_Sub3_Sub4_Sub2_Sub2 local19 = Static104.aClass1_Sub3_Sub4_Sub2_Sub2Array1[Static131.anIntArray468[local3]];
			if (local19 != null && local19.method2159() && arg0 == local19.aClass1_Sub3_Sub12_1.aBoolean71 && local19.aClass1_Sub3_Sub12_1.method1478()) {
				@Pc(48) int local48 = local19.anInt3089 >> 7;
				@Pc(53) int local53 = local19.anInt3079 >> 7;
				if (local48 >= 0 && local48 < 104 && local53 >= 0 && local53 < 104) {
					if (local19.anInt3063 == 1 && (local19.anInt3089 & 0x7F) == 64 && (local19.anInt3079 & 0x7F) == 64) {
						if (Static122.anInt3127 == Static3.anIntArrayArray5[local48][local53]) {
							continue;
						}
						Static3.anIntArrayArray5[local48][local53] = Static122.anInt3127;
					}
					if (!local19.aClass1_Sub3_Sub12_1.aBoolean73) {
						local13 += Integer.MIN_VALUE;
					}
					Static44.aClass68_1.method1863(Static7.anInt213, local19.anInt3089, local19.anInt3079, Static102.method1746(local19.anInt3079 + local19.anInt3063 * 64 - 64, Static7.anInt213, local19.anInt3089 + (local19.anInt3063 - 1) * 64), local19.anInt3063 * 64 + 60 - 64, local19, local19.anInt3073, local13, local19.aBoolean116);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
	public static void method788() {
		aClass5_506 = null;
		aClass5_510 = null;
		aClass5_502 = null;
		aClass5_512 = null;
		anIntArray186 = null;
		aClass5_515 = null;
		aClass5_511 = null;
		aClass5_509 = null;
		aClass5_504 = null;
		aClass5_508 = null;
		aClass5_507 = null;
		aClass5_505 = null;
		aClass5_513 = null;
		aClass5_503 = null;
		anIntArray185 = null;
		aClass5_514 = null;
	}
}
