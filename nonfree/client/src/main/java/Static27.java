import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!dc", name = "gb", descriptor = "Lclient!wa;")
	public static Class87 aClass87_4;

	@OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
	public static int anInt709 = -1;

	@OriginalMember(owner = "client!dc", name = "U", descriptor = "[I")
	public static int[] anIntArray30 = new int[100];

	@OriginalMember(owner = "client!dc", name = "W", descriptor = "Lclient!ai;")
	public static Class6 aClass6_194 = null;

	@OriginalMember(owner = "client!dc", name = "X", descriptor = "Lclient!ai;")
	public static Class6 aClass6_195 = Static38.method685("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!dc", name = "ab", descriptor = "Lclient!ai;")
	public static Class6 aClass6_196 = Static38.method685("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!dc", name = "bb", descriptor = "[I")
	public static int[] anIntArray31 = new int[2000];

	@OriginalMember(owner = "client!dc", name = "db", descriptor = "[[[Lclient!vb;")
	public static Class84[][][] aClass84ArrayArrayArray1 = new Class84[4][104][104];

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!h;)V")
	public static void method501(@OriginalArg(1) Class2_Sub3_Sub5_Sub1 arg0) {
		arg0.aBoolean110 = false;
		@Pc(18) Class2_Sub3_Sub8 local18;
		if (arg0.anInt2657 != -1) {
			local18 = Static129.method2790(arg0.anInt2657);
			if (local18 == null || local18.anIntArray109 == null) {
				arg0.anInt2657 = -1;
			} else {
				arg0.anInt2664++;
				if (local18.anIntArray109.length > arg0.anInt2665 && arg0.anInt2664 > local18.anIntArray113[arg0.anInt2665]) {
					arg0.anInt2665++;
					arg0.anInt2664 = 1;
					Static29.method518(arg0.anInt2665, local18, arg0.anInt2672, arg0 == Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1, arg0.anInt2674);
				}
				if (local18.anIntArray109.length <= arg0.anInt2665) {
					arg0.anInt2664 = 0;
					arg0.anInt2665 = 0;
					Static29.method518(arg0.anInt2665, local18, arg0.anInt2672, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1 == arg0, arg0.anInt2674);
				}
			}
		}
		if (arg0.anInt2708 != -1 && arg0.anInt2711 <= Static107.anInt2559) {
			if (arg0.anInt2663 < 0) {
				arg0.anInt2663 = 0;
			}
			@Pc(127) int local127 = Static122.method1901(arg0.anInt2708).anInt3259;
			if (local127 == -1) {
				arg0.anInt2708 = -1;
			} else {
				@Pc(135) Class2_Sub3_Sub8 local135 = Static129.method2790(local127);
				if (local135 == null || local135.anIntArray109 == null) {
					arg0.anInt2708 = -1;
				} else {
					arg0.anInt2661++;
					if (local135.anIntArray109.length > arg0.anInt2663 && local135.anIntArray113[arg0.anInt2663] < arg0.anInt2661) {
						arg0.anInt2661 = 1;
						arg0.anInt2663++;
						Static29.method518(arg0.anInt2663, local135, arg0.anInt2672, arg0 == Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1, arg0.anInt2674);
					}
					if (arg0.anInt2663 >= local135.anIntArray109.length && (arg0.anInt2663 < 0 || local135.anIntArray109.length <= arg0.anInt2663)) {
						arg0.anInt2708 = -1;
					}
				}
			}
		}
		if (arg0.anInt2658 != -1 && arg0.anInt2682 <= 1) {
			local18 = Static129.method2790(arg0.anInt2658);
			if (local18.anInt1696 == 1 && arg0.anInt2694 > 0 && Static107.anInt2559 >= arg0.anInt2690 && Static107.anInt2559 > arg0.anInt2696) {
				arg0.anInt2682 = 1;
				return;
			}
		}
		if (arg0.anInt2658 != -1 && arg0.anInt2682 == 0) {
			local18 = Static129.method2790(arg0.anInt2658);
			if (local18 == null || local18.anIntArray109 == null) {
				arg0.anInt2658 = -1;
			} else {
				arg0.anInt2669++;
				if (arg0.anInt2688 < local18.anIntArray109.length && local18.anIntArray113[arg0.anInt2688] < arg0.anInt2669) {
					arg0.anInt2669 = 1;
					arg0.anInt2688++;
					Static29.method518(arg0.anInt2688, local18, arg0.anInt2672, arg0 == Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1, arg0.anInt2674);
				}
				if (local18.anIntArray109.length <= arg0.anInt2688) {
					arg0.anInt2660++;
					arg0.anInt2688 -= local18.anInt1694;
					if (local18.anInt1692 <= arg0.anInt2660) {
						arg0.anInt2658 = -1;
					} else if (arg0.anInt2688 >= 0 && local18.anIntArray109.length > arg0.anInt2688) {
						Static29.method518(arg0.anInt2688, local18, arg0.anInt2672, arg0 == Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1, arg0.anInt2674);
					} else {
						arg0.anInt2658 = -1;
					}
				}
				arg0.aBoolean110 = local18.aBoolean62;
			}
		}
		if (arg0.anInt2682 > 0) {
			arg0.anInt2682--;
		}
	}

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)V")
	public static void method503() {
		anIntArray30 = null;
		anIntArray31 = null;
		aClass84ArrayArrayArray1 = null;
		aClass6_196 = null;
		aClass87_4 = null;
		aClass6_194 = null;
		aClass6_195 = null;
	}
}
