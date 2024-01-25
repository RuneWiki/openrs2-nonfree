import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!go", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!go", name = "g", descriptor = "[Lclient!ug;")
	public static Class43[] aClass43Array8;

	@OriginalMember(owner = "client!go", name = "d", descriptor = "I")
	public static int anInt3445 = 0;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZII)V")
	public static void method3018(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class2_Sub3 local10 = Static549.method7662(-124, arg0, arg1);
		if (local10 != null) {
			for (@Pc(16) int local16 = 0; local16 < local10.anIntArray28.length; local16++) {
				local10.anIntArray28[local16] = -1;
				local10.anIntArray29[local16] = 0;
			}
		}
	}
}
