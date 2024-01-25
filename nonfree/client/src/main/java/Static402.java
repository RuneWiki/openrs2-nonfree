import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!pfa", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString98 = null;

	@OriginalMember(owner = "client!pfa", name = "c", descriptor = "(B)V")
	public static void method5857() {
		for (@Pc(16) Class9_Sub10 local16 = (Class9_Sub10) Static75.aClass309_3.method6587(); local16 != null; local16 = (Class9_Sub10) Static75.aClass309_3.method6587()) {
			Static165.method2917(local16);
		}
		@Pc(35) int local35;
		@Pc(37) int local37;
		if (Static278.aClass3_Sub13_Sub1_1.method4485(Static260.anInt4932)) {
			local35 = 0;
			local37 = 3;
		} else {
			local37 = Static65.anInt1778;
			local35 = Static65.anInt1778;
		}
		Static69.method1645();
		for (@Pc(46) int local46 = local35; local46 <= local37; local46++) {
			Static69.method1636();
			Static69.method1635(local46);
			Static69.method1641(local46);
		}
		Static69.method1650();
		Static69.method1647();
	}

	@OriginalMember(owner = "client!pfa", name = "d", descriptor = "(II)V")
	public static void method5859(@OriginalArg(1) int arg0) {
		@Pc(1) Class3_Sub3_Sub10 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class139 local8 = Static374.aClass139Array17[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static157.anInt3168; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static411.anInt6927; local15++) {
						local1 = local8.v(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static458.anInt7508;
							@Pc(32) int local32 = local12 << Static458.anInt7508;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class139 local41 = Static374.aClass139Array17[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method6889(local15, local12) - local41.method6889(local15, local12);
									@Pc(71) int local71 = local8.method6889(local15 + 1, local12) - local41.method6889(local15 + 1, local12);
									@Pc(91) int local91 = local8.method6889(local15 + 1, local12 + 1) - local41.method6889(local15 + 1, local12 + 1);
									@Pc(107) int local107 = local8.method6889(local15, local12 + 1) - local41.method6889(local15, local12 + 1);
									local41.E(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pfa", name = "i", descriptor = "(I)Z")
	public static boolean method5861() {
		try {
			@Pc(7) Class100 local7 = new Class100();
			@Pc(14) byte[] local14 = local7.method2789(Static584.aByteArray106);
			Static246.method4029(local14);
			return true;
		} catch (@Pc(23) Exception local23) {
			return false;
		}
	}
}
