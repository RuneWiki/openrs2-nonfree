import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!td", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray28 = new boolean[8];

	@OriginalMember(owner = "client!td", name = "n", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_61 = new Class103(64);

	@OriginalMember(owner = "client!td", name = "o", descriptor = "I")
	public static int anInt5776 = 0;

	@OriginalMember(owner = "client!td", name = "p", descriptor = "I")
	public static final int anInt5777 = 50;

	@OriginalMember(owner = "client!td", name = "q", descriptor = "I")
	public static int anInt5778 = 0;

	@OriginalMember(owner = "client!td", name = "r", descriptor = "Z")
	public static boolean aBoolean424 = false;

	@OriginalMember(owner = "client!td", name = "s", descriptor = "[I")
	public static final int[] anIntArray734 = new int[200];

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	public static void method4866() {
		@Pc(5) Class103 local5 = Static283.aClass103_59;
		synchronized (Static283.aClass103_59) {
			Static283.aClass103_59.method2684();
		}
		local5 = Static41.aClass103_12;
		synchronized (Static41.aClass103_12) {
			Static41.aClass103_12.method2684();
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
	public static void method4867() {
		if (Static125.anInt2778 == 5) {
			Static125.anInt2778 = 6;
		}
	}
}
