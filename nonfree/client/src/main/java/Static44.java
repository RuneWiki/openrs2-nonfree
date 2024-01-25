import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!cd", name = "G", descriptor = "F")
	public static float aFloat27;

	@OriginalMember(owner = "client!cd", name = "I", descriptor = "Lclient!ge;")
	public static final Class83 aClass83_9 = new Class83(4);

	@OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
	public static int anInt1000 = 0;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZB)I")
	public static int method926(@OriginalArg(0) int arg0) {
		@Pc(14) Class4_Sub38 local14 = Static351.method5112(false, arg0);
		if (local14 == null) {
			return Static434.aClass166_1.method4183(arg0).anInt6268;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local14.anIntArray540.length; local26++) {
			if (local14.anIntArray540[local26] == -1) {
				local24++;
			}
		}
		return local24 + Static434.aClass166_1.method4183(arg0).anInt6268 - local14.anIntArray540.length;
	}
}
