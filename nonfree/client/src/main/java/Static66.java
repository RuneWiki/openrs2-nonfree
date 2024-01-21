import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!n", name = "g", descriptor = "I")
	public static int anInt1693;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "I")
	public static int anInt1690 = 0;

	@OriginalMember(owner = "client!n", name = "c", descriptor = "[I")
	public static int[] anIntArray215 = new int[5];

	@OriginalMember(owner = "client!n", name = "e", descriptor = "Lclient!kc;")
	public static Class36 aClass36_821 = Static14.method2017("mapfunction");

	@OriginalMember(owner = "client!n", name = "f", descriptor = "Lclient!ja;")
	public static Class31 aClass31_3 = new Class31(32);

	@OriginalMember(owner = "client!n", name = "h", descriptor = "Lclient!kc;")
	public static Class36 aClass36_822 = Static14.method2017("headicons_pk");

	@OriginalMember(owner = "client!n", name = "i", descriptor = "Lclient!kc;")
	public static Class36 aClass36_823 = Static14.method2017("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!n", name = "j", descriptor = "Z")
	public static boolean aBoolean74 = false;

	@OriginalMember(owner = "client!n", name = "k", descriptor = "Z")
	public static boolean aBoolean75 = false;

	@OriginalMember(owner = "client!n", name = "l", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!n", name = "n", descriptor = "Lclient!kc;")
	public static Class36 aClass36_824 = Static14.method2017("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
	public static void method1156(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class8 local11 = Static3.aClass8ArrayArrayArray2[Static92.anInt2412][arg1][arg0];
		if (local11 == null) {
			Static85.aClass61_1.method1734(Static92.anInt2412, arg1, arg0);
			return;
		}
		@Pc(21) Class2_Sub1_Sub4_Sub3 local21 = null;
		@Pc(23) int local23 = -99999999;
		@Pc(28) Class2_Sub1_Sub4_Sub3 local28;
		for (local28 = (Class2_Sub1_Sub4_Sub3) local11.method175(); local28 != null; local28 = (Class2_Sub1_Sub4_Sub3) local11.method173()) {
			@Pc(34) Class2_Sub1_Sub18 local34 = Static43.method832(local28.anInt1747);
			@Pc(37) int local37 = local34.anInt2804;
			if (local34.anInt2837 == 1) {
				local37 *= local28.anInt1752 + 1;
			}
			if (local37 > local23) {
				local23 = local37;
				local21 = local28;
			}
		}
		if (local21 == null) {
			Static85.aClass61_1.method1734(Static92.anInt2412, arg1, arg0);
			return;
		}
		@Pc(76) Class2_Sub1_Sub4_Sub3 local76 = null;
		local11.method188(local21);
		@Pc(82) Class2_Sub1_Sub4_Sub3 local82 = null;
		for (local28 = (Class2_Sub1_Sub4_Sub3) local11.method175(); local28 != null; local28 = (Class2_Sub1_Sub4_Sub3) local11.method173()) {
			if (local28.anInt1747 != local21.anInt1747) {
				if (local76 == null) {
					local76 = local28;
				}
				if (local28.anInt1747 != local76.anInt1747 && local82 == null) {
					local82 = local28;
				}
			}
		}
		@Pc(125) int local125 = (arg0 << 2028745255) + arg1 + 1610612736;
		Static85.aClass61_1.method1715(Static92.anInt2412, arg1, arg0, Static56.method1044(arg0 * 128 + 64, arg1 * 128 + 64, Static92.anInt2412), local21, local125, local76, local82);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	public static void method1157() {
		aClass36_823 = null;
		aClass36_821 = null;
		anIntArray215 = null;
		aClass36_824 = null;
		aClass36_822 = null;
		aClass31_3 = null;
		aBooleanArray11 = null;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(I)J")
	public static synchronized long method1158() {
		@Pc(9) long local9 = System.currentTimeMillis();
		if (Static41.aLong35 > local9) {
			Static49.aLong43 += Static41.aLong35 - local9;
		}
		Static41.aLong35 = local9;
		return Static49.aLong43 + local9;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!hd;)V")
	public static void method1159(@OriginalArg(1) Class2_Sub1_Sub4_Sub2 arg0) {
		arg0.aBoolean88 = false;
		@Pc(17) Class2_Sub1_Sub14 local17;
		if (arg0.anInt2181 != -1) {
			local17 = Static56.method1045(arg0.anInt2181);
			if (local17 == null || local17.anIntArray287 == null) {
				arg0.anInt2181 = -1;
			} else {
				arg0.anInt2146++;
				if (arg0.anInt2174 < local17.anIntArray287.length && local17.anIntArray288[arg0.anInt2174] < arg0.anInt2146) {
					arg0.anInt2174++;
					arg0.anInt2146 = 1;
				}
				if (arg0.anInt2174 >= local17.anIntArray287.length) {
					arg0.anInt2174 = 0;
					arg0.anInt2146 = 0;
				}
			}
		}
		if (arg0.anInt2152 != -1 && Static113.anInt2952 >= arg0.anInt2173) {
			if (arg0.anInt2151 < 0) {
				arg0.anInt2151 = 0;
			}
			@Pc(97) int local97 = Static99.method1476(arg0.anInt2152).anInt1677;
			if (local97 == -1) {
				arg0.anInt2152 = -1;
			} else {
				@Pc(104) Class2_Sub1_Sub14 local104 = Static56.method1045(local97);
				if (local104 == null || local104.anIntArray287 == null) {
					arg0.anInt2152 = -1;
				} else {
					arg0.anInt2205++;
					if (arg0.anInt2151 < local104.anIntArray287.length && local104.anIntArray288[arg0.anInt2151] < arg0.anInt2205) {
						arg0.anInt2205 = 1;
						arg0.anInt2151++;
					}
					if (arg0.anInt2151 >= local104.anIntArray287.length && (arg0.anInt2151 < 0 || local104.anIntArray287.length <= arg0.anInt2151)) {
						arg0.anInt2152 = -1;
					}
				}
			}
		}
		if (arg0.anInt2168 != -1 && arg0.anInt2162 <= 1) {
			local17 = Static56.method1045(arg0.anInt2168);
			if (local17.anInt2408 == 1 && arg0.anInt2192 > 0 && Static113.anInt2952 >= arg0.anInt2165 && arg0.anInt2188 < Static113.anInt2952) {
				arg0.anInt2162 = 1;
				return;
			}
		}
		if (arg0.anInt2168 != -1 && arg0.anInt2162 == 0) {
			local17 = Static56.method1045(arg0.anInt2168);
			if (local17 == null || local17.anIntArray287 == null) {
				arg0.anInt2168 = -1;
			} else {
				arg0.anInt2196++;
				if (local17.anIntArray287.length > arg0.anInt2147 && arg0.anInt2196 > local17.anIntArray288[arg0.anInt2147]) {
					arg0.anInt2196 = 1;
					arg0.anInt2147++;
				}
				if (local17.anIntArray287.length <= arg0.anInt2147) {
					arg0.anInt2198++;
					if (local17.anInt2389 <= arg0.anInt2198) {
						arg0.anInt2168 = -1;
					}
					arg0.anInt2147 -= local17.anInt2386;
					if (arg0.anInt2147 < 0 || arg0.anInt2147 >= local17.anIntArray287.length) {
						arg0.anInt2168 = -1;
					}
				}
				arg0.aBoolean88 = local17.aBoolean107;
			}
		}
		if (arg0.anInt2162 > 0) {
			arg0.anInt2162--;
		}
	}
}
