import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	public static void method6527() {
		for (@Pc(10) int local10 = 0; local10 < 100; local10++) {
			Static470.aClass309Array3[local10] = null;
		}
		Static287.anInt5258 = 0;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BJ)I")
	public static int method6528(@OriginalArg(1) long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
	public static void method6529() {
		Static118.aClass22_10.method468(50);
		Static207.aClass22_18.method468(50);
		Static103.aClass22_8.method468(50);
		Static359.aClass22_30.method468(50);
	}
}
