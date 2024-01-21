import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!i", name = "Y", descriptor = "Lclient!pb;")
	public static Class71 aClass71_16;

	@OriginalMember(owner = "client!i", name = "gb", descriptor = "I")
	public static int anInt1663;

	@OriginalMember(owner = "client!i", name = "T", descriptor = "I")
	public static int anInt1653 = -1;

	@OriginalMember(owner = "client!i", name = "db", descriptor = "[Lclient!mb;")
	public static final Class62[] aClass62Array46 = new Class62[200];

	@OriginalMember(owner = "client!i", name = "fb", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_563 = Static151.method2243("Loaded textures");

	@OriginalMember(owner = "client!i", name = "kb", descriptor = "Lclient!mb;")
	public static Class62 aClass62_564 = aClass62_563;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(III)V")
	private static void method1131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub18 local7 = Static92.aClass2_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass100_1 = null;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIILclient!tf;II)V")
	public static void method1132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class95 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) long local9 = 0L;
		if (arg5 == 0) {
			local9 = Static77.method2472(arg1, arg0, arg2);
		}
		if (arg5 == 1) {
			local9 = Static179.method2595(arg1, arg0, arg2);
		}
		if (arg5 == 2) {
			local9 = Static47.method728(arg1, arg0, arg2);
		}
		if (arg5 == 3) {
			local9 = Static59.method819(arg1, arg0, arg2);
		}
		if (local9 == 0L) {
			return;
		}
		@Pc(68) int local68 = Integer.MAX_VALUE & (int) (local9 >>> 32);
		@Pc(75) int local75 = (int) local9 >> 20 & 0x3;
		@Pc(79) Class2_Sub1_Sub11 local79 = Static60.method844(local68);
		@Pc(86) int local86 = (int) local9 >> 14 & 0x1F;
		if (arg5 == 0) {
			Static121.method1899(arg1, arg0, arg2);
			if (local79.anInt1550 != 0) {
				arg3.method2674(local79.aBoolean72, local75, arg0, local86, arg2);
			}
		}
		if (arg5 == 1) {
			method1131(arg1, arg0, arg2);
		}
		if (arg5 == 2) {
			Static114.method1773(arg1, arg0, arg2);
			if (local79.anInt1550 != 0 && arg0 + local79.anInt1556 < 104 && local79.anInt1556 + arg2 < 104 && arg0 + local79.anInt1559 < 104 && arg2 + local79.anInt1559 < 104) {
				arg3.method2669(arg2, local79.anInt1556, local79.aBoolean72, arg0, local79.anInt1559, local75);
			}
		}
		if (arg5 != 3) {
			return;
		}
		Static185.method2661(arg1, arg0, arg2);
		if (local79.anInt1550 == 1) {
			arg3.method2679(arg2, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(II)V")
	public static void method1133(@OriginalArg(0) int arg0) {
		@Pc(5) Class12 local5 = Static63.aClass12_1;
		synchronized (Static63.aClass12_1) {
			Static186.anInt3869 = arg0;
		}
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(II)Z")
	public static boolean method1134(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!mb;B)Lclient!mb;")
	public static Class62 method1135(@OriginalArg(0) Class62 arg0) {
		@Pc(12) Class2_Sub10 local12 = Static44.method686(arg0);
		return local12 == null ? Static138.aClass62_1033 : local12.aClass62_721;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	public static void method1136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class2_Sub18 local7 = Static92.aClass2_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class100 local13 = local7.aClass100_1;
		if (local13 != null) {
			local13.anInt4037 = local13.anInt4037 * arg3 / 16;
			local13.anInt4042 = local13.anInt4042 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!i", name = "g", descriptor = "(I)V")
	public static void method1137() {
		Static50.aByteArrayArrayArray7 = null;
		Static3.anIntArray12 = null;
		Static150.aByteArrayArrayArray14 = null;
		Static199.aByteArrayArrayArray17 = null;
		Static197.aByteArrayArrayArray16 = null;
		Static203.anIntArray384 = null;
		Static104.anIntArray217 = null;
		Static195.anIntArray368 = null;
		Static10.aByteArrayArrayArray2 = null;
		Static128.anIntArray15 = null;
		Static102.anIntArrayArrayArray4 = null;
	}
}
