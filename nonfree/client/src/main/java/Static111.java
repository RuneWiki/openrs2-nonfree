import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1558 = Static75.method1216("Loaded textures");

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1556 = aClass4_1558;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1559 = Static75.method1216("Login server offline)3");

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1557 = aClass4_1559;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1560 = Static75.method1216("(X");

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "[I")
	public static int[] anIntArray336 = new int[128];

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1562 = Static75.method1216("Moderator option: Mute player for 48 hours: <ON>");

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1561 = aClass4_1562;

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
	public static int anInt2786 = 0;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	public static void method1896() {
		aClass4_1556 = null;
		aClass4_1558 = null;
		aClass4_1561 = null;
		anImage4 = null;
		aClass4_1557 = null;
		aClass4_1562 = null;
		anIntArray336 = null;
		aClass4_1560 = null;
		aClass4_1559 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method1897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg3 < 1 || arg5 < 1 || arg3 > 102 || arg5 > 102) {
			return;
		}
		if (Static36.aBoolean70 && Static49.anInt1203 != arg4) {
			return;
		}
		@Pc(36) int local36 = 0;
		if (arg6 == 0) {
			local36 = Static38.aClass61_30.method1339(arg4, arg3, arg5);
		}
		if (arg6 == 1) {
			local36 = Static38.aClass61_30.method1304(arg4, arg3, arg5);
		}
		if (arg6 == 2) {
			local36 = Static38.aClass61_30.method1343(arg4, arg3, arg5);
		}
		if (arg6 == 3) {
			local36 = Static38.aClass61_30.method1335(arg4, arg3, arg5);
		}
		@Pc(92) int local92;
		if (local36 != 0) {
			local92 = Static38.aClass61_30.method1319(arg4, arg3, arg5, local36);
			@Pc(98) int local98 = local92 >> 6 & 0x3;
			@Pc(102) int local102 = local92 & 0x1F;
			@Pc(108) int local108 = local36 >> 14 & 0x7FFF;
			@Pc(122) Class3_Sub1_Sub5 local122;
			if (arg6 == 0) {
				Static38.aClass61_30.method1347(arg4, arg3, arg5);
				local122 = Static38.method1911(local108);
				if (local122.aBoolean113) {
					Static12.aClass40Array1[arg4].method879(local122.aBoolean116, arg5, arg3, local98, local102);
				}
			}
			if (arg6 == 1) {
				Static38.aClass61_30.method1328(arg4, arg3, arg5);
			}
			if (arg6 == 2) {
				Static38.aClass61_30.method1351(arg4, arg3, arg5);
				local122 = Static38.method1911(local108);
				if (local122.anInt1548 + arg3 > 103 || arg5 + local122.anInt1548 > 103 || local122.anInt1543 + arg3 > 103 || arg5 + local122.anInt1543 > 103) {
					return;
				}
				if (local122.aBoolean113) {
					Static12.aClass40Array1[arg4].method883(local98, local122.aBoolean116, arg5, local122.anInt1543, local122.anInt1548, arg3);
				}
			}
			if (arg6 == 3) {
				Static38.aClass61_30.method1316(arg4, arg3, arg5);
				local122 = Static38.method1911(local108);
				if (local122.aBoolean113 && local122.anInt1524 == 1) {
					Static12.aClass40Array1[arg4].method890(arg3, arg5);
				}
			}
		}
		if (arg1 < 0) {
			return;
		}
		local92 = arg4;
		if (arg4 < 3 && (Static11.aByteArrayArrayArray55[1][arg3][arg5] & 0x2) == 2) {
			local92 = arg4 + 1;
		}
		Static68.method1117(arg1, Static12.aClass40Array1[arg4], arg3, arg5, Static38.aClass61_30, local92, arg0, arg4, arg2);
		return;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ad;I)Z")
	public static boolean method1898(@OriginalArg(0) Class4 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static87.anInt1451; local11++) {
			if (arg0.method160(Static21.aClass4Array2[local11])) {
				return true;
			}
		}
		return arg0.method160(Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.aClass4_1302);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	public static void method1899() {
		Static61.aClass8_20.method198();
	}
}
