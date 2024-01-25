import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!je", name = "o", descriptor = "I")
	public static int anInt4790 = 0;

	@OriginalMember(owner = "client!je", name = "u", descriptor = "Z")
	public static boolean aBoolean338 = true;

	@OriginalMember(owner = "client!je", name = "y", descriptor = "I")
	public static int anInt4797 = 0;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;BILjava/lang/String;)V")
	public static void method4021(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7) {
		@Pc(9) Class284 local9 = Static270.aClass284Array1[99];
		for (@Pc(15) int local15 = 99; local15 > 0; local15--) {
			Static270.aClass284Array1[local15] = Static270.aClass284Array1[local15 - 1];
		}
		if (local9 == null) {
			local9 = new Class284(arg6, arg2, arg5, arg1, arg0, arg7, arg4, arg3);
		} else {
			local9.method7028(arg1, arg3, arg7, arg0, arg6, arg4, arg2, arg5);
		}
		Static270.aClass284Array1[0] = local9;
		Static367.anInt6860 = Static446.anInt8177;
		Static211.anInt4643++;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public static void method4022() {
		if (Static472.aString77.toLowerCase().indexOf("microsoft") != -1) {
			Static331.anIntArray547[220] = 74;
			Static331.anIntArray547[188] = 71;
			Static331.anIntArray547[222] = 59;
			Static331.anIntArray547[189] = 26;
			Static331.anIntArray547[221] = 43;
			Static331.anIntArray547[190] = 72;
			Static331.anIntArray547[187] = 27;
			Static331.anIntArray547[192] = 58;
			Static331.anIntArray547[191] = 73;
			Static331.anIntArray547[223] = 28;
			Static331.anIntArray547[186] = 57;
			Static331.anIntArray547[219] = 42;
			return;
		}
		if (Static472.aMethod2 == null) {
			Static331.anIntArray547[222] = 59;
			Static331.anIntArray547[192] = 58;
		} else {
			Static331.anIntArray547[520] = 59;
			Static331.anIntArray547[192] = 28;
			Static331.anIntArray547[222] = 58;
		}
		Static331.anIntArray547[92] = 74;
		Static331.anIntArray547[45] = 26;
		Static331.anIntArray547[93] = 43;
		Static331.anIntArray547[91] = 42;
		Static331.anIntArray547[46] = 72;
		Static331.anIntArray547[47] = 73;
		Static331.anIntArray547[44] = 71;
		Static331.anIntArray547[59] = 57;
		Static331.anIntArray547[61] = 27;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
	public static void method4023(@OriginalArg(1) int arg0) {
		Static107.aLong73 = 1000000000L / (long) arg0;
	}
}
