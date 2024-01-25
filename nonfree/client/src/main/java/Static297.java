import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "I")
	public static int anInt7032;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "I")
	public static int anInt7036;

	@OriginalMember(owner = "client!m", name = "b", descriptor = "[I")
	public static final int[] anIntArray551 = new int[4];

	@OriginalMember(owner = "client!m", name = "d", descriptor = "I")
	public static int anInt7034 = 0;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(III)Z")
	public static boolean method5710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static136.method2572(arg1, arg0) & Static360.method5529(arg1, arg0);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5711(@OriginalArg(1) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method5712() {
		Static36.method830();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static71.aClass10Array3[local8].method303();
		}
		Static457.method6380();
		Static452.method6364();
		System.gc();
	}
}
