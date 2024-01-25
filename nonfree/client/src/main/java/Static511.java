import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!tj", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray19;

	@OriginalMember(owner = "client!tj", name = "k", descriptor = "[Z")
	public static final boolean[] aBooleanArray27 = new boolean[8];

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
	public static void method7027() {
		Static113.anInt2286 = 0;
		Static450.aClass177Array1 = new Class177[50];
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BZI)I")
	public static int method7030(@OriginalArg(2) int arg0) {
		@Pc(14) Class1_Sub46 local14 = Static365.method5363(false, arg0);
		if (local14 == null) {
			return Static413.aClass76_1.method1861(arg0).anInt7066;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local14.anIntArray577.length; local26++) {
			if (local14.anIntArray577[local26] == -1) {
				local24++;
			}
		}
		return local24 + Static413.aClass76_1.method1861(arg0).anInt7066 - local14.anIntArray577.length;
	}
}
