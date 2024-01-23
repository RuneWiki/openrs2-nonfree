import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString191 = "slide:";

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
	public static int anInt5345 = 0;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V")
	public static void method4040() {
		Static299.aClass61_54.method1381(5);
		Static239.aClass61_45.method1381(5);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BB)V")
	public static void method4041(@OriginalArg(1) byte arg0) {
		if (Static123.aByteArrayArrayArray5 == null) {
			Static123.aByteArrayArrayArray5 = new byte[4][104][104];
		}
		for (@Pc(21) int local21 = 0; local21 < 4; local21++) {
			for (@Pc(26) int local26 = 0; local26 < 104; local26++) {
				for (@Pc(33) int local33 = 0; local33 < 104; local33++) {
					Static123.aByteArrayArrayArray5[local21][local26][local33] = arg0;
				}
			}
		}
	}
}
