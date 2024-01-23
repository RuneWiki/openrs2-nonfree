import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!jj", name = "P", descriptor = "Lclient!rn;")
	public static Class155 aClass155_56;

	@OriginalMember(owner = "client!jj", name = "V", descriptor = "[S")
	public static short[] aShortArray62 = new short[256];

	@OriginalMember(owner = "client!jj", name = "W", descriptor = "I")
	public static int anInt2589 = 0;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIII)I")
	public static int method2305(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static41.aByteArrayArrayArray2[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static41.aByteArrayArrayArray2[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(II)V")
	public static void method2306(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static230.aBooleanArray107[arg0]) {
			return;
		}
		Static277.aClass155_114.method4150(arg0);
		if (Static96.aClass151ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(25) boolean local25 = true;
		for (@Pc(27) int local27 = 0; local27 < Static96.aClass151ArrayArray1[arg0].length; local27++) {
			if (Static96.aClass151ArrayArray1[arg0][local27] != null) {
				if (Static96.aClass151ArrayArray1[arg0][local27].anInt4721 == 2) {
					local25 = false;
				} else {
					Static96.aClass151ArrayArray1[arg0][local27] = null;
				}
			}
		}
		if (local25) {
			Static96.aClass151ArrayArray1[arg0] = null;
		}
		Static230.aBooleanArray107[arg0] = false;
	}

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(II)V")
	public static void method2307(@OriginalArg(1) int arg0) {
		Static137.aClass98_18.method2572();
		Static137.aClass98_18 = new Class98(arg0);
	}

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "(II)Lclient!c;")
	public static Class21 method2309(@OriginalArg(1) int arg0) {
		@Pc(10) Class21 local10 = (Class21) Static145.aClass98_19.method2570((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static173.aClass155_66.method4121(Static134.method3641(arg0), Static9.method149(arg0));
		local10 = new Class21();
		local10.anInt540 = arg0;
		if (local27 != null) {
			local10.method450(new Class3_Sub26(local27));
		}
		local10.method452();
		if (local10.anInt529 != -1) {
			local10.method454(method2309(local10.anInt529), method2309(local10.anInt496));
		}
		if (local10.anInt553 != -1) {
			local10.method453(method2309(local10.anInt517), method2309(local10.anInt553));
		}
		if (!Static289.aBoolean414 && local10.aBoolean44) {
			local10.aString18 = Static113.aString85;
			local10.aBoolean43 = false;
			local10.anInt519 = 0;
			local10.aStringArray8 = Static151.aStringArray23;
			local10.aStringArray7 = Static219.aStringArray29;
		}
		Static145.aClass98_19.method2568(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZI)V")
	public static void method2310(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static66.anInt1232 != -1) {
				method2306(Static66.anInt1232);
			}
			for (@Pc(19) Class3_Sub3 local19 = (Class3_Sub3) Static205.aClass30_23.method664(); local19 != null; local19 = (Class3_Sub3) Static205.aClass30_23.method671()) {
				Static49.method779(true, local19);
			}
			Static66.anInt1232 = -1;
			Static205.aClass30_23 = new Class30(8);
			Static140.method2392();
			Static66.anInt1232 = Static156.anInt2936;
			Static315.method5005(false);
			Static199.method3282();
			Static43.method654(Static66.anInt1232);
		}
		Static144.anInt4821 = -1;
		Static45.method687(Static257.anInt5293);
		Static136.aClass10_Sub5_Sub1_1 = new Class10_Sub5_Sub1();
		Static136.aClass10_Sub5_Sub1_1.anInt5073 = 3000;
		Static136.aClass10_Sub5_Sub1_1.anInt5016 = 3000;
		if (!Static283.aBoolean393 && Static47.anInt5990 == 0) {
			Static140.method2390(Static65.aClass155_31);
			Static264.method4398(10);
			return;
		}
		if (Static25.anInt467 == 2) {
			Static173.anInt3251 = Static135.anInt2608 << 7;
			Static230.anInt4492 = Static20.anInt370 << 7;
		} else {
			Static65.method1017();
		}
		if (Static283.aBoolean393) {
			Static13.method193();
		}
		Static48.method755();
		Static264.method4398(28);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)Lclient!qk;")
	public static Class3_Sub4_Sub2_Sub2 method2311(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub4_Sub2_Sub2 local12 = (Class3_Sub4_Sub2_Sub2) Static256.aClass98_42.method2570((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(23) byte[] local23 = Static268.aClass155_113.method4121(arg0, 0);
		local12 = new Class3_Sub4_Sub2_Sub2(local23);
		local12.method3686(Static96.aClass81Array2, null);
		Static256.aClass98_42.method2568(local12, (long) arg0);
		return local12;
	}
}
