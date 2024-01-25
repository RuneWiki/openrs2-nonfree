import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!aga", name = "W", descriptor = "Z")
	public static boolean aBoolean16 = false;

	@OriginalMember(owner = "client!aga", name = "ab", descriptor = "I")
	public static int anInt209 = 0;

	@OriginalMember(owner = "client!aga", name = "kb", descriptor = "I")
	public static int anInt217 = 0;

	@OriginalMember(owner = "client!aga", name = "ub", descriptor = "Z")
	public static boolean aBoolean20 = false;

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IILclient!om;B)Lclient!daa;")
	public static Class58 method232(@OriginalArg(1) int arg0, @OriginalArg(2) Class246 arg1) {
		@Pc(9) byte[] local9 = arg1.method5653(arg0, 0);
		return local9 == null ? null : new Class58(local9);
	}
}
