import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bba", name = "F", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_20 = new Class239(40, 6);

	@OriginalMember(owner = "client!bba", name = "G", descriptor = "I")
	public static int anInt592 = 0;

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(BI)V")
	public static void method670(@OriginalArg(0) byte arg0) {
		if (Static139.aByteArrayArrayArray8 == null) {
			Static139.aByteArrayArrayArray8 = new byte[4][Static363.anInt1158][Static511.anInt8889];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(26) int local26 = 0; local26 < Static363.anInt1158; local26++) {
				for (@Pc(30) int local30 = 0; local30 < Static511.anInt8889; local30++) {
					Static139.aByteArrayArrayArray8[local14][local26][local30] = arg0;
				}
			}
		}
	}
}
