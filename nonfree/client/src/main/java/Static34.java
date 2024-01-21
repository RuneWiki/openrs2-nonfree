import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!dd", name = "T", descriptor = "[Lclient!vi;")
	public static Class2_Sub1_Sub2[] aClass2_Sub1_Sub2Array3;

	@OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
	public static int anInt818;

	@OriginalMember(owner = "client!dd", name = "Z", descriptor = "I")
	public static int anInt822;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([BB)[B")
	public static byte[] method594(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static220.method1006(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)V")
	public static void method596(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static124.method1934(arg0)) {
			return;
		}
		@Pc(23) Class47[] local23 = Static89.aClass47ArrayArray1[arg0];
		for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
			@Pc(31) Class47 local31 = local23[local25];
			if (local31.anObjectArray22 != null) {
				@Pc(38) Class2_Sub13 local38 = new Class2_Sub13();
				local38.anObjectArray27 = local31.anObjectArray22;
				local38.aClass47_12 = local31;
				Static74.method1041(2000000, local38);
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(Z)V")
	public static void method597() {
		if (Static75.aString4.toLowerCase().indexOf("microsoft") != -1) {
			Static38.anIntArray273[191] = 73;
			Static38.anIntArray273[189] = 26;
			Static38.anIntArray273[190] = 72;
			Static38.anIntArray273[222] = 59;
			Static38.anIntArray273[223] = 28;
			Static38.anIntArray273[187] = 27;
			Static38.anIntArray273[188] = 71;
			Static38.anIntArray273[186] = 57;
			Static38.anIntArray273[221] = 43;
			Static38.anIntArray273[220] = 74;
			Static38.anIntArray273[192] = 58;
			Static38.anIntArray273[219] = 42;
			return;
		}
		Static38.anIntArray273[45] = 26;
		if (Static75.aMethod1 == null) {
			Static38.anIntArray273[222] = 59;
			Static38.anIntArray273[192] = 58;
		} else {
			Static38.anIntArray273[192] = 28;
			Static38.anIntArray273[520] = 59;
			Static38.anIntArray273[222] = 58;
		}
		Static38.anIntArray273[61] = 27;
		Static38.anIntArray273[47] = 73;
		Static38.anIntArray273[46] = 72;
		Static38.anIntArray273[59] = 57;
		Static38.anIntArray273[93] = 43;
		Static38.anIntArray273[92] = 74;
		Static38.anIntArray273[91] = 42;
		Static38.anIntArray273[44] = 71;
	}
}
