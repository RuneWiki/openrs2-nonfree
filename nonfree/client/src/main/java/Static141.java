import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!en", name = "b", descriptor = "Z")
	public static boolean aBoolean152 = false;

	@OriginalMember(owner = "client!en", name = "e", descriptor = "[I")
	public static final int[] anIntArray133 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BZ)Z")
	public static boolean method1561(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			return false;
		} else {
			return local7 < 128 || local7 >= 160 || Static571.aCharArray5[local7 - 128] != '\u0000';
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
	public static void method1563() {
		if (!Static238.aBoolean302) {
			return;
		}
		@Pc(11) Class230 local11 = Static572.method8204(Static639.anInt10686, Static402.anInt10315);
		if (local11 != null && local11.lb != null) {
			@Pc(28) Class14_Sub55 local28 = new Class14_Sub55();
			local28.anObjectArray33 = local11.lb;
			local28.aClass230_14 = local11;
			Static632.method8830(local28);
		}
		Static416.anInt7542 = -1;
		Static68.anInt1565 = -1;
		Static238.aBoolean302 = false;
		if (local11 != null) {
			Static634.method8860(local11);
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BII)Z")
	public static boolean method1566(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static275.method4000(arg0, arg1) | (arg1 & 0x70000) != 0 || Static70.method1361(arg0, arg1);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
	public static void method1569() {
		Static432.method6333();
		Static128.aBoolean202 = false;
	}
}
