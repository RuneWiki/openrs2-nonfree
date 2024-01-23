import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
	public static int anInt939;

	@OriginalMember(owner = "client!dc", name = "Z", descriptor = "Lclient!rn;")
	public static Class155 aClass155_27;

	@OriginalMember(owner = "client!dc", name = "E", descriptor = "Lclient!cn;")
	public static Class30 aClass30_5 = new Class30(32);

	@OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
	public static int anInt946 = 0;

	@OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
	public static int anInt947 = -1;

	@OriginalMember(owner = "client!dc", name = "X", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!dc", name = "Y", descriptor = "S")
	public static short aShort10 = 1;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZLclient!ah;)V")
	public static void method779(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class3_Sub3 arg1) {
		@Pc(4) int local4 = arg1.anInt183;
		@Pc(17) int local17 = (int) arg1.aLong243;
		arg1.method5013();
		if (arg0) {
			Static133.method2306(local4);
		}
		Static83.method1280(local4);
		@Pc(36) Class151 local36 = Static243.method4115(local17);
		if (local36 != null) {
			Static134.method3639(local36);
		}
		@Pc(44) int local44 = Static152.anInt2876;
		@Pc(46) int local46;
		for (local46 = 0; local46 < local44; local46++) {
			if (Static262.method4363(Static259.aShortArray87[local46])) {
				Static2.method24(local46);
			}
		}
		if (Static152.anInt2876 == 1) {
			Static118.aBoolean169 = false;
			Static35.method534(Static205.anInt4054, Static175.anInt3271, Static300.anInt5922, Static173.anInt3249);
		} else {
			Static35.method534(Static205.anInt4054, Static175.anInt3271, Static300.anInt5922, Static173.anInt3249);
			local46 = Static224.aClass3_Sub4_Sub2_14.method3690(Static267.aString196);
			for (@Pc(89) int local89 = 0; local89 < Static152.anInt2876; local89++) {
				@Pc(102) int local102 = Static224.aClass3_Sub4_Sub2_14.method3690(Static153.method2577(local89));
				if (local102 > local46) {
					local46 = local102;
				}
			}
			Static175.anInt3271 = local46 + 8;
			Static205.anInt4054 = Static152.anInt2876 * 15 + (Static34.aBoolean53 ? 26 : 22);
		}
		if (Static66.anInt1232 != -1) {
			Static88.method1354(1, Static66.anInt1232);
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(IB)V")
	public static void method782(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub4_Sub7 local4 = Static34.method528(arg0, 1);
		local4.method970();
	}
}
