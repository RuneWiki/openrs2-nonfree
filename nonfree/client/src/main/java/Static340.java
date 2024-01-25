import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!mea", name = "A", descriptor = "Lclient!kha;")
	public static Class181 aClass181_62;

	@OriginalMember(owner = "client!mea", name = "D", descriptor = "[[I")
	public static final int[][] anIntArrayArray61 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IB)V")
	public static void method5634(@OriginalArg(1) byte arg0) {
		if (Static192.aByteArrayArrayArray3 == null) {
			Static192.aByteArrayArrayArray3 = new byte[4][Static394.anInt7540][Static462.anInt8391];
		}
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			for (@Pc(23) int local23 = 0; local23 < Static394.anInt7540; local23++) {
				for (@Pc(27) int local27 = 0; local27 < Static462.anInt8391; local27++) {
					Static192.aByteArrayArrayArray3[local19][local23][local27] = arg0;
				}
			}
		}
	}
}
