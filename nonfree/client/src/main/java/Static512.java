import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method7665(@OriginalArg(0) String arg0) {
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local11; local15++) {
			local13 = Static99.method2137(arg0.charAt(local15)) + (local13 << 5) - local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!wk;II)V")
	public static void method7666(@OriginalArg(0) Class2_Sub2_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArray484 == null) {
			return;
		}
		@Pc(13) int local13 = arg0.anIntArray484[arg1 + 1];
		if (local13 == arg0.anInt7651) {
			return;
		}
		arg0.anInt7589 = 0;
		arg0.anInt7646 = 0;
		arg0.anInt7659 = arg0.anInt7660;
		arg0.anInt7588 = 0;
		arg0.anInt7651 = local13;
		arg0.anInt7615 = 1;
		if (arg0.anInt7651 != -1) {
			Static28.method957(Static532.aClass157_2.method3734(arg0.anInt7651), arg0.aByte103, arg0.anInt9396, arg0.anInt9398, Static443.aClass2_Sub2_Sub1_Sub1_2 == arg0, arg0.anInt7646);
		}
	}
}
