import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!oq", name = "e", descriptor = "B")
	public static byte aByte90;

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "Lclient!fc;")
	public static final Class94 aClass94_39 = new Class94(20);

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray20 = new boolean[100];

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_137 = new Class73(10, -2);

	@OriginalMember(owner = "client!oq", name = "g", descriptor = "Z")
	public static boolean aBoolean597 = false;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIZ)V")
	public static void method6457(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) Class6_Sub6 local10 = Static612.method8391(arg0, arg1);
		if (local10 != null) {
			for (@Pc(20) int local20 = 0; local20 < local10.anIntArray33.length; local20++) {
				local10.anIntArray33[local20] = -1;
				local10.anIntArray32[local20] = 0;
			}
		}
	}
}
