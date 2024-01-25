import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!i", name = "s", descriptor = "I")
	public static int anInt6340;

	@OriginalMember(owner = "client!i", name = "t", descriptor = "[I")
	public static int[] anIntArray524;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public static void method5038() {
		Static372.aClass188_49.method4156();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)V")
	public static void method5040(@OriginalArg(0) byte arg0) {
		if (Static419.aByteArrayArrayArray17 == null) {
			Static419.aByteArrayArrayArray17 = new byte[4][Static234.anInt3949][Static371.anInt6492];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(23) int local23 = 0; local23 < Static234.anInt3949; local23++) {
				for (@Pc(27) int local27 = 0; local27 < Static371.anInt6492; local27++) {
					Static419.aByteArrayArrayArray17[local14][local23][local27] = arg0;
				}
			}
		}
	}
}
