import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "Lclient!um;")
	public static Class243 aClass243_250;

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "Lclient!uu;")
	public static final Class5_Sub15_Sub2 aClass5_Sub15_Sub2_13 = new Class5_Sub15_Sub2(5000);

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIB)V")
	public static void method5918(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		@Pc(3) Class266[] local3 = Static186.aClass266Array1;
		for (@Pc(13) int local13 = 0; local13 < local3.length; local13++) {
			@Pc(19) Class266 local19 = local3[local13];
			if (local19 != null && local19.anInt7406 == 2) {
				Static93.method1319(local19.anInt7413, local19.anInt7403, arg2 >> 1, arg3 >> 1, local19.anInt7404 * 2, local19.anInt7410);
				if (Static205.anIntArray194[0] > -1 && Static85.anInt1536 % 20 < 10) {
					Static278.aClass49Array10[local19.anInt7412].method5785(Static205.anIntArray194[0] + arg0 - 12, arg1 - (-Static205.anIntArray194[1] - -28));
				}
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method5919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class258 local7 = Static319.aClass258ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class122 local13 = local7.aClass122_3; local13 != null; local13 = local13.aClass122_1) {
			@Pc(17) Class2_Sub1 local17 = local13.aClass2_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort107 == arg1 && local17.aShort106 == arg2) {
				Static434.method5733(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZI)V")
	public static void method5921(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static199.anInt3319 != -1) {
				Static326.method4003(Static199.anInt3319);
			}
			for (@Pc(18) Class5_Sub44 local18 = (Class5_Sub44) Static151.aClass252_42.method5660(); local18 != null; local18 = (Class5_Sub44) Static151.aClass252_42.method5666()) {
				if (!local18.method6005()) {
					local18 = (Class5_Sub44) Static151.aClass252_42.method5660();
					if (local18 == null) {
						break;
					}
				}
				Static456.method5988(true, false, local18);
			}
			Static199.anInt3319 = -1;
			Static151.aClass252_42 = new Class252(8);
			Static241.method3137();
			Static199.anInt3319 = Static121.anInt2155;
			Static330.method4011(false);
			Static251.method3223();
			Static181.method2474(Static199.anInt3319);
		}
		Static151.aBoolean500 = true;
	}
}
