import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "Lclient!ke;")
	public static Class1_Sub2_Sub4 aClass1_Sub2_Sub4_10;

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "[C")
	public static char[] aCharArray5 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
	public static int anInt5327 = 0;

	@OriginalMember(owner = "client!vg", name = "j", descriptor = "Lclient!vd;")
	public static Class140 aClass140_17 = new Class140(32);

	@OriginalMember(owner = "client!vg", name = "l", descriptor = "Z")
	public static boolean aBoolean270 = true;

	@OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
	public static int anInt5332 = -1;

	@OriginalMember(owner = "client!vg", name = "n", descriptor = "Z")
	public static boolean aBoolean271 = false;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)I")
	public static int method4054(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)V")
	public static void method4055(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub2_Sub18 local4 = Static13.method232(arg0, 12);
		local4.method3805();
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
	public static void method4056() {
		Static150.aClass79_23.method2489();
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)V")
	public static void method4057() {
		@Pc(9) int local9 = Static120.aClass1_Sub2_Sub7_2.method1922(Static16.aString354);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static230.anInt5417; local11++) {
			local19 = Static120.aClass1_Sub2_Sub7_2.method1922(Static174.method2990(local11));
			if (local19 > local9) {
				local9 = local19;
			}
		}
		local9 += 8;
		local19 = Static230.anInt5417 * 15 + 21;
		@Pc(46) int local46 = Static221.anInt4838 - local9 / 2;
		@Pc(48) int local48 = Static242.anInt5237;
		if (Static251.anInt5352 < local48 + local19) {
			local48 = Static251.anInt5352 - local19;
		}
		if (local48 < 0) {
			local48 = 0;
		}
		if (Static200.anInt4411 < local46 + local9) {
			local46 = Static200.anInt4411 - local9;
		}
		if (local46 < 0) {
			local46 = 0;
		}
		if (Static138.anInt3362 == 1) {
			if (Static221.anInt4838 == Static60.anInt1650 && Static242.anInt5237 == Static261.anInt5478) {
				Static48.anInt1406 = local48;
				Static95.anInt2633 = local46;
				Static259.aBoolean280 = true;
				Static197.anInt2398 = (Static4.aBoolean4 ? 26 : 22) + Static230.anInt5417 * 15;
				Static75.anInt2037 = local9;
				Static138.anInt3362 = 0;
			}
		} else if (Static256.anInt5442 == Static221.anInt4838 && Static133.anInt3300 == Static242.anInt5237) {
			Static259.aBoolean280 = true;
			Static48.anInt1406 = local48;
			Static197.anInt2398 = (Static4.aBoolean4 ? 26 : 22) + Static230.anInt5417 * 15;
			Static95.anInt2633 = local46;
			Static138.anInt3362 = 0;
			Static75.anInt2037 = local9;
		} else {
			Static138.anInt3362 = 1;
			Static60.anInt1650 = Static256.anInt5442;
			Static261.anInt5478 = Static133.anInt3300;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZI)V")
	public static void method4058(@OriginalArg(0) boolean arg0) {
		Static81.method1635(Static140.anInt3388, arg0, Static251.anInt5352, Static200.anInt4411);
	}
}
