import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!ro", name = "n", descriptor = "[I")
	public static final int[] anIntArray601 = new int[8];

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
	public static void method7044() {
		if (Static465.aString69.toLowerCase().indexOf("microsoft") != -1) {
			Static328.anIntArray369[187] = 27;
			Static328.anIntArray369[192] = 58;
			Static328.anIntArray369[188] = 71;
			Static328.anIntArray369[220] = 74;
			Static328.anIntArray369[186] = 57;
			Static328.anIntArray369[223] = 28;
			Static328.anIntArray369[189] = 26;
			Static328.anIntArray369[222] = 59;
			Static328.anIntArray369[219] = 42;
			Static328.anIntArray369[221] = 43;
			Static328.anIntArray369[191] = 73;
			Static328.anIntArray369[190] = 72;
			return;
		}
		Static328.anIntArray369[44] = 71;
		Static328.anIntArray369[93] = 43;
		Static328.anIntArray369[61] = 27;
		Static328.anIntArray369[46] = 72;
		Static328.anIntArray369[47] = 73;
		Static328.anIntArray369[92] = 74;
		Static328.anIntArray369[59] = 57;
		Static328.anIntArray369[45] = 26;
		if (Static465.aMethod1 == null) {
			Static328.anIntArray369[222] = 59;
			Static328.anIntArray369[192] = 58;
		} else {
			Static328.anIntArray369[520] = 59;
			Static328.anIntArray369[192] = 28;
			Static328.anIntArray369[222] = 58;
		}
		Static328.anIntArray369[91] = 42;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZI)V")
	public static void method7047(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static592.anInt9857 != -1) {
				Static198.method3399(Static592.anInt9857);
			}
			for (@Pc(18) Class2_Sub28 local18 = (Class2_Sub28) Static22.aClass323_4.method7480(); local18 != null; local18 = (Class2_Sub28) Static22.aClass323_4.method7482()) {
				if (!local18.method8921()) {
					local18 = (Class2_Sub28) Static22.aClass323_4.method7480();
					if (local18 == null) {
						break;
					}
				}
				Static4.method71(false, local18, true);
			}
			Static592.anInt9857 = -1;
			Static22.aClass323_4 = new Class323(8);
			Static339.method5136();
			Static592.anInt9857 = Static649.anInt10494;
			Static403.method6011(false);
			Static569.method7932();
			Static156.method2736(Static592.anInt9857);
		}
		Static633.aBoolean744 = true;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I[BI)[B")
	public static byte[] method7048(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[arg0];
		Static650.method2274(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
