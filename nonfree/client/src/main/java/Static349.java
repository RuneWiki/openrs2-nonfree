import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
	public static int anInt6632;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
	public static int anInt6630 = 0;

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString249 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V")
	public static void method5911() {
		Static84.method2079(Static95.aCanvas2);
		Static288.method4958(Static95.aCanvas2);
		if (Static293.aClass72_1 != null) {
			Static293.aClass72_1.method2198(Static95.aCanvas2);
		}
		Static353.aClient1.method1011();
		Static95.aCanvas2.setBackground(Color.black);
		Static20.anInt394 = -1;
		Static100.method2244(Static95.aCanvas2);
		Static245.method3562(Static95.aCanvas2);
		if (Static293.aClass72_1 != null) {
			Static293.aClass72_1.method2201(Static95.aCanvas2);
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BLclient!mo;Lclient!mo;)I")
	public static int method5913(@OriginalArg(1) Class143 arg0, @OriginalArg(2) Class143 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method3736(Static291.anInt5610)) {
			local5++;
		}
		if (arg1.method3736(Static97.anInt2234)) {
			local5++;
		}
		if (arg1.method3736(Static181.anInt3757)) {
			local5++;
		}
		if (arg0.method3736(Static291.anInt5610)) {
			local5++;
		}
		if (arg0.method3736(Static97.anInt2234)) {
			local5++;
		}
		if (arg0.method3736(Static181.anInt3757)) {
			local5++;
		}
		return local5;
	}
}
