import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
	public static int anInt4011 = 1;

	@OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
	public static int anInt4012 = 0;

	@OriginalMember(owner = "client!ee", name = "E", descriptor = "I")
	public static int anInt4013 = -1;

	@OriginalMember(owner = "client!ee", name = "H", descriptor = "Lclient!hk;")
	public static final Class101 aClass101_11 = new Class101(14, 1);

	@OriginalMember(owner = "client!ee", name = "I", descriptor = "Lclient!hk;")
	public static final Class101 aClass101_12 = new Class101(15, 4);

	@OriginalMember(owner = "client!ee", name = "J", descriptor = "Lclient!hk;")
	public static final Class101 aClass101_13 = new Class101(16, -2);

	@OriginalMember(owner = "client!ee", name = "K", descriptor = "Lclient!hk;")
	public static final Class101 aClass101_14 = new Class101(17, 0);

	@OriginalMember(owner = "client!ee", name = "L", descriptor = "Lclient!hk;")
	public static final Class101 aClass101_15 = new Class101(18, -2);

	@OriginalMember(owner = "client!ee", name = "M", descriptor = "Lclient!hk;")
	public static final Class101 aClass101_16 = new Class101(20, 6);

	@OriginalMember(owner = "client!ee", name = "N", descriptor = "Lclient!hk;")
	public static final Class101 aClass101_17 = new Class101(21, 8);

	@OriginalMember(owner = "client!ee", name = "O", descriptor = "Lclient!hk;")
	public static final Class101 aClass101_18 = new Class101(22, -2);

	@OriginalMember(owner = "client!ee", name = "P", descriptor = "Lclient!hk;")
	public static final Class101 aClass101_19 = new Class101(23, 4);

	@OriginalMember(owner = "client!ee", name = "Q", descriptor = "Lclient!hk;")
	public static final Class101 aClass101_20 = new Class101(24, -1);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!km;)V")
	public static void method3660(@OriginalArg(1) Class82 arg0) {
		if (Static148.aClass210_21.method5038() == 0) {
			return;
		}
		@Pc(51) Class2_Sub15 local51;
		if (Static123.anInt2363 == 0) {
			for (local51 = (Class2_Sub15) Static148.aClass210_21.method5035(); local51 != null; local51 = (Class2_Sub15) Static148.aClass210_21.method5037()) {
				Static106.aClass250_1.method5738(false, false, local51.anInt2268, arg0, arg0, Static91.aClass13_2, local51.anInt2264, local51.aBoolean179 ? Static267.aClass12_Sub1_Sub2_Sub2_1.aClass247_1 : null, local51.anInt2267, local51.anInt2266, local51.anInt2265);
				local51.method5745();
			}
			Static303.method4753();
			return;
		}
		if (Static367.aClass82_9 == null) {
			@Pc(21) Canvas local21 = new Canvas();
			local21.setSize(36, 32);
			Static367.aClass82_9 = Static189.method4473(local21, 0, Static92.aClass53_2, 0, Static356.anInterface1_7);
			Static120.aClass13_3 = Static367.aClass82_9.method4472(Static362.method5519(Static382.aClass71_89, Static259.anInt4617), Static404.method5314(Static119.aClass71_25, Static259.anInt4617));
		}
		for (local51 = (Class2_Sub15) Static148.aClass210_21.method5035(); local51 != null; local51 = (Class2_Sub15) Static148.aClass210_21.method5037()) {
			Static106.aClass250_1.method5738(false, false, local51.anInt2268, Static367.aClass82_9, arg0, Static120.aClass13_3, local51.anInt2264, local51.aBoolean179 ? Static267.aClass12_Sub1_Sub2_Sub2_1.aClass247_1 : null, local51.anInt2267, local51.anInt2266, local51.anInt2265);
			local51.method5745();
		}
	}
}
