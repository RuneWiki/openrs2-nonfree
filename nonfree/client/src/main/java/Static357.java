import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
	public static int anInt6211;

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
	public static int anInt6212;

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "Z")
	public static boolean aBoolean461 = false;

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "Z")
	public static boolean aBoolean462 = true;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IILjava/lang/Object;Z)[B")
	public static byte[] method5255(@OriginalArg(1) int arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return Static159.method3158(arg0, local18);
		} else if (arg1 instanceof Class230) {
			@Pc(30) Class230 local30 = (Class230) arg1;
			return local30.method5476(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
