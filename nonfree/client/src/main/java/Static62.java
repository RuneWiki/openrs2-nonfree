import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)V")
	public static void method1015(@OriginalArg(1) boolean arg0) {
		if (Static41.aString3.length() == 0) {
			return;
		}
		Static82.method1376("--> " + Static41.aString3);
		Static12.method182(false, arg0, Static41.aString3);
		Static407.anInt7738 = 0;
		Static41.aString3 = "";
		Static463.anInt7202 = 0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZI)V")
	public static void method1017(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) Class4_Sub18 local8 = Static72.method6564(arg1, arg0);
		if (local8 != null) {
			for (@Pc(13) int local13 = 0; local13 < local8.anIntArray144.length; local13++) {
				local8.anIntArray144[local13] = -1;
				local8.anIntArray143[local13] = 0;
			}
		}
	}
}
