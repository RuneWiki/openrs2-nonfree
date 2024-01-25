import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!og", name = "i", descriptor = "I")
	public static int anInt6288;

	@OriginalMember(owner = "client!og", name = "h", descriptor = "Lclient!kca;")
	public static final Class168 aClass168_5 = new Class168();

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)B")
	public static byte method5338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "([BZI)V")
	public static void method5339(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		if (Static9.aClass6_Sub14_1 == null) {
			Static9.aClass6_Sub14_1 = new Class6_Sub14(20000);
		}
		Static9.aClass6_Sub14_1.method6039(arg0.length, arg0);
		if (!arg1) {
			return;
		}
		Static57.method751(Static9.aClass6_Sub14_1.aByteArray88);
		Static376.aClass8_Sub1Array2 = new Class8_Sub1[Static274.anInt3317];
		@Pc(35) int local35 = 0;
		for (@Pc(37) int local37 = Static123.anInt2133; local37 <= Static329.anInt5898; local37++) {
			@Pc(43) Class8_Sub1 local43 = Static92.method5966(local37);
			if (local43 != null) {
				Static376.aClass8_Sub1Array2[local35++] = local43;
			}
		}
		Static238.aBoolean256 = false;
		Static131.aLong65 = Static137.method2058();
		Static9.aClass6_Sub14_1 = null;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)V")
	public static void method5340(@OriginalArg(0) int arg0) {
		Static383.method5698();
		Static87.method1417();
		Static534.method7436(arg0, true);
		Static252.method3571();
		Static419.method7565(Static176.aClass121_5);
		Static169.method2643(Static176.aClass121_5);
		Static18.method281(Static176.aClass121_5, Static447.aClass251_141);
		Static293.method4105();
		Static60.method775(Static52.aClass4Array1);
		Static260.method3643();
		Static321.method4977();
		if (Static146.anInt2581 == 3) {
			Static99.method1593(4);
		} else if (Static146.anInt2581 == 7) {
			Static99.method1593(8);
		} else if (Static146.anInt2581 == 10) {
			Static99.method1593(11);
		} else if (Static146.anInt2581 == 1 || Static146.anInt2581 == 2) {
			Static224.anInterface14_1.method5118();
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIII)V")
	public static void method5341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) Class129[] local7 = Static34.aClass129Array4;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(15) Class129 local15 = local7[local9];
			if (local15 != null && local15.anInt3170 == 2) {
				Static478.method6659(local15.anInt3174 * 2, local15.anInt3176, local15.anInt3169, arg3 >> 1, local15.anInt3172, arg1 >> 1);
				if (Static550.anIntArray695[0] > -1 && Static358.anInt6263 % 20 < 10) {
					Static248.aClass4Array9[local15.anInt3171].method6514(arg2 + Static550.anIntArray695[0] - 12, Static550.anIntArray695[1] + (arg0 - 28));
				}
			}
		}
	}
}
