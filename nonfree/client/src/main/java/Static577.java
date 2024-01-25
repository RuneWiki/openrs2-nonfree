import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!tm", name = "w", descriptor = "Lclient!tf;")
	public static Class310_Sub1 aClass310_Sub1_2;

	@OriginalMember(owner = "client!tm", name = "A", descriptor = "[I")
	public static final int[] anIntArray641 = new int[2];

	@OriginalMember(owner = "client!tm", name = "L", descriptor = "[I")
	public static final int[] anIntArray643 = new int[200];

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)V")
	public static void method8016() {
		Static263.aClass263_1 = new Class263(8);
		Static466.anInt8062 = 0;
		for (@Pc(27) Class2_Sub8 local27 = (Class2_Sub8) Static100.aClass43_4.method1087(); local27 != null; local27 = (Class2_Sub8) Static100.aClass43_4.method1088()) {
			local27.method4178();
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!d;III)Lclient!ha;")
	public static Class132 method8020(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new oa(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "(I)V")
	public static void method8021() {
		Static660.aClass321Array2 = null;
		if (Static594.aBoolean693 && Static455.method6591() != 1) {
			Static660.method8977(0, Static556.anInt9319 == 3 || Static556.anInt9319 == 7, Static189.method2690(), Static213.method3109(), 0);
		}
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		if (Static594.aBoolean693) {
			local36 = Static234.method3562();
			local38 = Static314.method4504();
		}
		Static653.method8879(-1, local36, local36, Static561.anInt9357, local38, Static348.anInt5935 + local38, local36 + Static449.anInt7506, local38);
		if (Static660.aClass321Array2 != null) {
			Static515.method7287(-1412584499, true, Static348.anInt5935 + local38, local36 + Static449.anInt7506, Static660.aClass321Array2, Static398.aClass321_30.anInt9043, Static371.anInt6311, Static451.anInt7554, local36, local38);
			Static660.aClass321Array2 = null;
		}
	}
}
