import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!gb", name = "K", descriptor = "[I")
	public static int[] anIntArray180;

	@OriginalMember(owner = "client!gb", name = "J", descriptor = "Lclient!qc;")
	public static final Class272 aClass272_2 = new Class272();

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
	public static void method3297() {
		@Pc(5) int local5 = 0;
		if (Static87.aClass6_Sub33_6.aClass14_Sub10_1.method3033() == 1) {
			local5 = 55;
		}
		if (Static87.aClass6_Sub33_6.aClass14_Sub20_1.method7110() == 0) {
			local5 |= 0x40;
		}
		Static263.method4649(local5);
		Static249.aClass310_1.method7482(local5);
		Static356.aClass221_1.method5921(local5);
		Static8.aClass309_1.method7456(local5);
		Static360.aClass312_2.method7488(local5);
		Static250.method4447(local5);
		Static173.method3267(local5);
		Static125.method2615(local5);
		Static286.method4977(local5);
		Static112.method8730();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIB)V")
	public static void method3298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = Static623.anInt10490;
		@Pc(7) int local7 = Static620.anInt10443;
		if (Static238.aBoolean425) {
			local5 += Static352.method5739();
			local7 += Static573.method7997();
		}
		@Pc(35) Class4 local35;
		if (Static109.anInt2941 == 1) {
			local35 = Static296.aClass4Array7[Static516.anInt9014 / 100];
			local35.method7698(local5 - 8, local7 + -8);
			Static215.method3836(local35.method7712() + local7 - 8, local7 + -8, local5 - 8, local5 - -local35.method7700() + -8);
		}
		if (Static109.anInt2941 == 2) {
			local35 = Static296.aClass4Array7[Static516.anInt9014 / 100 + 4];
			local35.method7698(local5 - 8, local7 + -8);
			Static215.method3836(local35.method7712() + local7 - 8, local7 + -8, local5 - 8, local5 + -8 + local35.method7700());
		}
		Static393.method6211();
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)[Lclient!ee;")
	public static Class79[] method3299() {
		return new Class79[] { Static431.aClass79_17, Static627.aClass79_23, Static646.aClass79_25 };
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([I[Ljava/lang/Object;I)V")
	public static void method3301(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Static68.method2013(arg0, arg1, arg0.length - 1, 0);
	}
}
