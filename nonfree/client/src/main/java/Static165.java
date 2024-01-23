import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!lo", name = "m", descriptor = "Lclient!oo;")
	public static Class3_Sub23 aClass3_Sub23_1;

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
	public static int anInt3087 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString110 = "Ok";

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
	public static int anInt3088 = -1;

	@OriginalMember(owner = "client!lo", name = "j", descriptor = "Z")
	public static boolean aBoolean221 = false;

	@OriginalMember(owner = "client!lo", name = "n", descriptor = "I")
	public static int anInt3092 = -1;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)I")
	public static int method2731(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(6) int local6 = local0 | local0 >>> 1;
		@Pc(17) int local17 = local6 | local6 >>> 2;
		@Pc(23) int local23 = local17 | local17 >>> 4;
		@Pc(33) int local33 = local23 | local23 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!qi;IBIILclient!rg;I)V")
	public static void method2734(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class151 arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		@Pc(16) int local16 = arg3 * arg3 + arg1 * arg1;
		@Pc(26) int local26;
		if (Static25.anInt467 == 4) {
			local26 = (int) Static84.aFloat21 & 0x7FF;
		} else {
			local26 = (int) Static84.aFloat21 + Static241.anInt4889 & 0x7FF;
		}
		@Pc(48) int local48 = Math.max(arg4.anInt4773 / 2, arg4.anInt4751 / 2) + 10;
		if (local48 * local48 < local16) {
			return;
		}
		@Pc(62) int local62 = Class11.anIntArray26[local26];
		@Pc(66) int local66 = Class11.anIntArray27[local26];
		if (Static25.anInt467 != 4) {
			local66 = local66 * 256 / (Static125.anInt2421 + 256);
			local62 = local62 * 256 / (Static125.anInt2421 + 256);
		}
		@Pc(97) int local97 = local66 * arg1 + arg3 * local62 >> 16;
		@Pc(112) int local112 = local66 * arg3 - arg1 * local62 >> 16;
		if (Static283.aBoolean393) {
			((Class81_Sub1) arg0).method2033(arg5 + arg4.anInt4773 / 2 + local97 - arg0.anInt2802 / 2, -(arg0.anInt2795 / 2) + arg4.anInt4751 / 2 + arg2 + -local112, (Class3_Sub4_Sub12_Sub1) arg4.method4000(false));
		} else {
			((Class81_Sub2) arg0).method2509(arg4.anInt4773 / 2 + arg5 + local97 - arg0.anInt2802 / 2, arg4.anInt4751 / 2 + arg2 + -local112 - arg0.anInt2795 / 2, arg4.anIntArray509, arg4.anIntArray523);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIII)Lclient!ah;")
	public static Class3_Sub3 method2735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) Class3_Sub3 local15 = new Class3_Sub3();
		local15.anInt186 = arg1;
		local15.anInt183 = arg2;
		Static205.aClass30_23.method668(local15, (long) arg0);
		Static241.method4090(arg2);
		@Pc(34) Class151 local34 = Static243.method4115(arg0);
		if (local34 != null) {
			Static134.method3639(local34);
		}
		if (Static259.aClass151_18 != null) {
			Static134.method3639(Static259.aClass151_18);
			Static259.aClass151_18 = null;
		}
		@Pc(52) int local52 = Static152.anInt2876;
		@Pc(54) int local54;
		for (local54 = 0; local54 < local52; local54++) {
			if (Static262.method4363(Static259.aShortArray87[local54])) {
				Static2.method24(local54);
			}
		}
		if (Static152.anInt2876 == 1) {
			Static118.aBoolean169 = false;
			Static35.method534(Static205.anInt4054, Static175.anInt3271, Static300.anInt5922, Static173.anInt3249);
		} else {
			Static35.method534(Static205.anInt4054, Static175.anInt3271, Static300.anInt5922, Static173.anInt3249);
			local54 = Static224.aClass3_Sub4_Sub2_14.method3690(Static267.aString196);
			for (@Pc(96) int local96 = 0; local96 < Static152.anInt2876; local96++) {
				@Pc(109) int local109 = Static224.aClass3_Sub4_Sub2_14.method3690(Static153.method2577(local96));
				if (local109 > local54) {
					local54 = local109;
				}
			}
			Static205.anInt4054 = (Static34.aBoolean53 ? 26 : 22) + Static152.anInt2876 * 15;
			Static175.anInt3271 = local54 + 8;
		}
		if (local34 != null) {
			Static282.method4617(local34, false);
		}
		Static43.method654(arg2);
		if (Static66.anInt1232 != -1) {
			Static88.method1354(1, Static66.anInt1232);
		}
		return local15;
	}
}
