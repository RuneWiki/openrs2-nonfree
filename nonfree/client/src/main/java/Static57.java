import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
	public static int anInt5922;

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "[S")
	public static short[] aShortArray108 = new short[256];

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "[I")
	public static final int[] anIntArray575 = new int[25];

	@OriginalMember(owner = "client!dh", name = "t", descriptor = "Z")
	public static volatile boolean aBoolean492 = false;

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
	public static void method5323() {
		for (@Pc(10) Class32_Sub1 local10 = (Class32_Sub1) Static85.aClass39_2.method805(); local10 != null; local10 = (Class32_Sub1) Static85.aClass39_2.method805()) {
			Static217.method4000(local10);
		}
		Static45.method709();
		Static45.method722();
		Static45.method705();
		Static45.method706();
		Static45.method717();
		Static45.method720();
	}
}
