import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!jt", name = "w", descriptor = "I")
	public static int anInt4667;

	@OriginalMember(owner = "client!jt", name = "u", descriptor = "I")
	public static int anInt4666 = 0;

	@OriginalMember(owner = "client!jt", name = "v", descriptor = "[I")
	public static final int[] anIntArray239 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!jt", name = "e", descriptor = "(I)V")
	public static void method4091() {
		if (Static576.aString99.toLowerCase().indexOf("microsoft") != -1) {
			Static166.anIntArray153[221] = 43;
			Static166.anIntArray153[191] = 73;
			Static166.anIntArray153[220] = 74;
			Static166.anIntArray153[187] = 27;
			Static166.anIntArray153[186] = 57;
			Static166.anIntArray153[222] = 59;
			Static166.anIntArray153[219] = 42;
			Static166.anIntArray153[189] = 26;
			Static166.anIntArray153[190] = 72;
			Static166.anIntArray153[188] = 71;
			Static166.anIntArray153[192] = 58;
			Static166.anIntArray153[223] = 28;
			return;
		}
		Static166.anIntArray153[91] = 42;
		Static166.anIntArray153[92] = 74;
		Static166.anIntArray153[59] = 57;
		Static166.anIntArray153[44] = 71;
		Static166.anIntArray153[61] = 27;
		Static166.anIntArray153[93] = 43;
		Static166.anIntArray153[46] = 72;
		Static166.anIntArray153[47] = 73;
		Static166.anIntArray153[45] = 26;
		if (Static576.aMethod2 == null) {
			Static166.anIntArray153[222] = 59;
			Static166.anIntArray153[192] = 58;
		} else {
			Static166.anIntArray153[520] = 59;
			Static166.anIntArray153[192] = 28;
			Static166.anIntArray153[222] = 58;
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IBI)I")
	public static int method4092(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static128.method2627(arg0 - 1, arg1 + -1) + Static128.method2627(arg0 + 1, arg1 - 1) + Static128.method2627(arg0 - 1, arg1 + 1) + Static128.method2627(arg0 + 1, arg1 - -1);
		@Pc(75) int local75 = Static128.method2627(arg0 - 1, arg1) + Static128.method2627(arg0 + 1, arg1) + Static128.method2627(arg0, arg1 + -1) + Static128.method2627(arg0, arg1 + 1);
		@Pc(80) int local80 = Static128.method2627(arg0, arg1);
		return local80 / 4 + local75 / 8 + local45 / 16;
	}

	@OriginalMember(owner = "client!jt", name = "g", descriptor = "(I)V")
	public static void method4094() {
		Static405.aClass4_Sub7_Sub3_4.method5456();
		Static451.aClass176_108 = null;
		Static342.anInt6643 = 1;
		Static280.aClass4_Sub7_Sub3_2 = null;
	}
}
