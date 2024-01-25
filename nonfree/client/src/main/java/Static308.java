import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!jha", name = "v", descriptor = "I")
	public static int anInt4969;

	@OriginalMember(owner = "client!jha", name = "u", descriptor = "[I")
	public static final int[] anIntArray368 = new int[500];

	@OriginalMember(owner = "client!jha", name = "w", descriptor = "Lclient!lka;")
	public static final Class233 aClass233_1 = new Class233();

	@OriginalMember(owner = "client!jha", name = "o", descriptor = "I")
	public static final int anInt4972 = 1400;

	@OriginalMember(owner = "client!jha", name = "q", descriptor = "[I")
	public static final int[] anIntArray369 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public static void method4569(@OriginalArg(1) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static670.method8989(local6.width, local6.height);
		if (Static488.anInt7680 == 1) {
			Static536.aClass22_11.method9401(arg0, Static438.anInt6734, Static182.anInt3160);
		} else {
			Static536.aClass22_11.method9401(arg0, Static637.anInt8890, Static316.anInt5077);
		}
	}

	@OriginalMember(owner = "client!jha", name = "c", descriptor = "(I)I")
	public static int method4570() {
		return Static488.anInt7680 == 1 ? Static245.anInt3872 : 0;
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(II)V")
	public static void method4571(@OriginalArg(1) int arg0) {
		if (Static107.aClass3_Sub14_10 == null || (arg0 < 0 || arg0 >= Static107.aClass3_Sub14_10.anInt1731)) {
			return;
		}
		@Pc(26) Class54 local26 = Static107.aClass3_Sub14_10.aClass54Array1[arg0];
		if (local26.aByte42 != -1) {
			return;
		}
		@Pc(37) Class292 local37 = Static631.method8307();
		@Pc(43) Class3_Sub29 local43 = Static507.method6901(Static323.aClass144_51, local37.aClass88_2);
		local43.aClass3_Sub2_Sub1_1.method2065(Static63.method1479(local26.aString30) + 2);
		local43.aClass3_Sub2_Sub1_1.method2032(arg0);
		local43.aClass3_Sub2_Sub1_1.method2073(local26.aString30);
		local37.method6855(local43);
	}
}
