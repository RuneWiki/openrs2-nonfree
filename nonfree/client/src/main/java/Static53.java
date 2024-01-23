import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "Lclient!l;")
	public static Class98 aClass98_48 = new Class98(30);

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!rg;B)Ljava/lang/String;")
	public static String method5031(@OriginalArg(0) Class151 arg0) {
		if (Static42.method612(arg0).method4788() == 0) {
			return null;
		} else if (arg0.aString165 == null || arg0.aString165.trim().length() == 0) {
			return Static244.aBoolean346 ? "Hidden-use" : null;
		} else {
			return arg0.aString165;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method5032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2) {
		@Pc(18) int local18 = (int) arg2 >> 14 & 0x1F;
		@Pc(25) int local25 = (int) arg2 >> 20 & 0x3;
		@Pc(32) int local32 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
		if (local18 == 10 || local18 == 11 || local18 == 22) {
			@Pc(71) Class49 local71 = Static175.method2874(local32);
			@Pc(84) int local84;
			@Pc(87) int local87;
			if (local25 == 0 || local25 == 2) {
				local84 = local71.anInt1360;
				local87 = local71.anInt1329;
			} else {
				local84 = local71.anInt1329;
				local87 = local71.anInt1360;
			}
			@Pc(98) int local98 = local71.anInt1362;
			if (local25 != 0) {
				local98 = (local98 << local25 & 0xF) + (local98 >> 4 - local25);
			}
			Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], local98, 0, local84, Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], arg1, 0, local87, arg0);
		} else {
			Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, local25, 0, Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], arg1, local18 + 1, 0, arg0);
		}
		return true;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V")
	public static void method5036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 8) {
			arg1 = 4;
		}
		if (arg1 == 4 && !Static66.aBoolean94) {
			arg1 = 2;
			arg0 = 2;
		}
		if (Static12.anInt234 != arg1) {
			if (Static91.aBoolean138) {
				return;
			}
			if (Static12.anInt234 != 0) {
				Static59.anInterface1Array1[Static12.anInt234].method3984();
			}
			if (arg1 != 0) {
				@Pc(77) Interface1 local77 = Static59.anInterface1Array1[arg1];
				local77.method3983();
				local77.method3985(arg0);
			}
			Static12.anInt234 = arg1;
			Static240.anInt4879 = arg0;
		} else if (arg1 != 0 && arg0 != Static240.anInt4879) {
			Static59.anInterface1Array1[arg1].method3985(arg0);
			Static240.anInt4879 = arg0;
		}
	}
}
