import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
	public static int anInt2450;

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "[S")
	public static short[] aShortArray76;

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
	public static int anInt2446 = 0;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "Z")
	public static boolean aBoolean104 = false;

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
	public static int anInt2448 = -1;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)J")
	public static synchronized long method1911() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static104.aLong89 > local5) {
			Static103.aLong88 += Static104.aLong89 - local5;
		}
		Static104.aLong89 = local5;
		return local5 + Static103.aLong88;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)V")
	public static void method1912(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub26 local12 = (Class2_Sub26) Static48.aClass103_6.method3659((long) arg0);
		if (local12 != null) {
			for (@Pc(22) int local22 = 0; local22 < local12.anIntArray605.length; local22++) {
				local12.anIntArray605[local22] = -1;
				local12.anIntArray602[local22] = 0;
			}
		}
	}
}
