import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!fm", name = "B", descriptor = "I")
	public static int anInt3597 = 0;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V")
	public static void method2966() {
		if (Static604.aString95.toLowerCase().indexOf("microsoft") != -1) {
			Static18.anIntArray45[220] = 74;
			Static18.anIntArray45[192] = 58;
			Static18.anIntArray45[223] = 28;
			Static18.anIntArray45[187] = 27;
			Static18.anIntArray45[190] = 72;
			Static18.anIntArray45[219] = 42;
			Static18.anIntArray45[221] = 43;
			Static18.anIntArray45[186] = 57;
			Static18.anIntArray45[222] = 59;
			Static18.anIntArray45[189] = 26;
			Static18.anIntArray45[188] = 71;
			Static18.anIntArray45[191] = 73;
			return;
		}
		Static18.anIntArray45[92] = 74;
		Static18.anIntArray45[61] = 27;
		if (Static604.aMethod1 == null) {
			Static18.anIntArray45[222] = 59;
			Static18.anIntArray45[192] = 58;
		} else {
			Static18.anIntArray45[520] = 59;
			Static18.anIntArray45[192] = 28;
			Static18.anIntArray45[222] = 58;
		}
		Static18.anIntArray45[59] = 57;
		Static18.anIntArray45[46] = 72;
		Static18.anIntArray45[44] = 71;
		Static18.anIntArray45[45] = 26;
		Static18.anIntArray45[91] = 42;
		Static18.anIntArray45[93] = 43;
		Static18.anIntArray45[47] = 73;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILjava/lang/String;B)V")
	public static void method2967(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(12) Class2_Sub5_Sub10 local12 = Static594.method8175(arg0, 3);
		local12.method4393();
		local12.aString52 = arg1;
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(III)Z")
	public static boolean method2968(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!ud;B)Lclient!rn;")
	public static Class297 method2969(@OriginalArg(0) Class2_Sub34 arg0) {
		@Pc(7) int local7 = arg0.method6865();
		return new Class297(local7);
	}
}
