import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
	public static int anInt6975 = 0;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BIZ)I")
	public static int method5743(@OriginalArg(1) int arg0) {
		@Pc(14) Class6_Sub37 local14 = Static375.method5604(false, arg0);
		if (local14 == null) {
			return Static300.aClass225_1.method5495(arg0).anInt7676;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local14.anIntArray408.length; local26++) {
			if (local14.anIntArray408[local26] == -1) {
				local24++;
			}
		}
		return local24 + Static300.aClass225_1.method5495(arg0).anInt7676 - local14.anIntArray408.length;
	}
}
