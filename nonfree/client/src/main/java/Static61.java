import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cea", name = "Fb", descriptor = "[I")
	public static final int[] anIntArray144 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!cea", name = "Ib", descriptor = "Lclient!rt;")
	public static final Class297 aClass297_1 = new Class297();

	@OriginalMember(owner = "client!cea", name = "Rb", descriptor = "[I")
	public static int[] anIntArray145 = null;

	@OriginalMember(owner = "client!cea", name = "Xb", descriptor = "I")
	public static int anInt1147 = -1;

	@OriginalMember(owner = "client!cea", name = "s", descriptor = "(B)V")
	public static void method1040() {
		if (Static427.anIntArray604 != null && Static488.anIntArray645 != null) {
			return;
		}
		Static488.anIntArray645 = new int[256];
		Static427.anIntArray604 = new int[256];
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(26) double local26 = (double) local17 / 255.0D * 6.283185307179586D;
			Static427.anIntArray604[local17] = (int) (Math.sin(local26) * 4096.0D);
			Static488.anIntArray645[local17] = (int) (Math.cos(local26) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method1045(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static411.method5914("%0a", arg0, "\n"));
	}

	@OriginalMember(owner = "client!cea", name = "x", descriptor = "(I)V")
	public static void method1047() {
		if (Static4.aClass303_1 != null) {
			Static4.aClass303_1.method7977();
		}
		if (Static247.aClass303_2 != null) {
			Static247.aClass303_2.method7977();
		}
	}
}
