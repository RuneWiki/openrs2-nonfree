import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IZ)I")
	public static int method7351(@OriginalArg(1) boolean arg0) {
		@Pc(5) int local5 = Static453.anInt7941;
		if (local5 == 0) {
			return arg0 ? 0 : Static637.anInt10654;
		} else if (local5 == 1) {
			return Static637.anInt10654;
		} else if (local5 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)V")
	public static void method7352() {
		if (Static113.aClass112_2 != null) {
			Static113.aClass112_2.method5391();
		}
		if (Static248.aClass112_3 != null) {
			Static248.aClass112_3.method5391();
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method7353(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static337.method5263("\n", "%0a", arg0));
	}
}
