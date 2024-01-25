import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!sw", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray51 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(B)V")
	public static void method8030() {
		if (!Static672.aBoolean792) {
			Static258.aBoolean347 = true;
			Static10.aFloat3 += (-24.0F - Static10.aFloat3) / 2.0F;
			Static672.aBoolean792 = true;
		}
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIILjava/lang/Object;)[B")
	public static byte[] method8031(@OriginalArg(0) int arg0, @OriginalArg(3) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(14) byte[] local14 = (byte[]) arg1;
			return Static678.method9305(arg0, local14);
		} else if (arg1 instanceof Class143) {
			@Pc(32) Class143 local32 = (Class143) arg1;
			return local32.method3806(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
