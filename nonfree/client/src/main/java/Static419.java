import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "Z")
	public static boolean aBoolean638 = false;

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
	public static int anInt7416 = 0;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!ha;IZ)Lclient!dr;")
	public static Class88 method6246(@OriginalArg(1) Class65 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (arg1 == -1) {
			return null;
		}
		if (Static16.anIntArray14 != null) {
			for (@Pc(12) int local12 = 0; local12 < Static16.anIntArray14.length; local12++) {
				if (arg1 == Static16.anIntArray14[local12]) {
					return Static255.aClass88Array1[local12];
				}
			}
		}
		@Pc(42) Class88 local42 = (Class88) Static300.aClass340_65.method7999((long) arg1);
		if (local42 != null) {
			if (arg2 && local42.aClass247_2 == null) {
				@Pc(54) Class247 local54 = Static331.method5104(Static519.aClass390_100, arg1);
				if (local54 == null) {
					return null;
				}
				local42.aClass247_2 = local54;
			}
			return local42;
		}
		@Pc(71) Class369[] local71 = Static689.method8546(Static504.aClass390_97, arg1);
		if (local71 == null) {
			return null;
		}
		@Pc(80) Class247 local80 = Static331.method5104(Static519.aClass390_100, arg1);
		if (local80 == null) {
			return null;
		}
		if (arg2) {
			local42 = new Class88(arg0.method6886(local80, local71), local80);
		} else {
			local42 = new Class88(arg0.method6886(local80, local71));
		}
		Static300.aClass340_65.method7986((long) arg1, local42);
		return local42;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)Z")
	public static boolean method6247(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static141.method2482(arg0, arg1) || Static528.method7441(arg0, arg1);
	}
}
