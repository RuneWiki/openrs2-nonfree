import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!pba", name = "p", descriptor = "[I")
	public static final int[] anIntArray540 = new int[200];

	@OriginalMember(owner = "client!pba", name = "q", descriptor = "Lclient!kj;")
	public static final Class187 aClass187_16 = new Class187(13, 6);

	@OriginalMember(owner = "client!pba", name = "v", descriptor = "[I")
	public static final int[] anIntArray541 = new int[13];

	@OriginalMember(owner = "client!pba", name = "w", descriptor = "[I")
	public static final int[] anIntArray542 = new int[2048];

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IB)Z")
	public static boolean method5792(@OriginalArg(1) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			return false;
		} else {
			return local12 < 128 || local12 >= 160 || Static595.aCharArray12[local12 - 128] != '\u0000';
		}
	}
}
