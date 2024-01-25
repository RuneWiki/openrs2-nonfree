import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!mp", name = "x", descriptor = "I")
	public static int anInt2800;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IB[S)[S")
	public static short[] method2305(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(14) short[] local14 = new short[arg0];
		Static464.method1968(arg1, 0, local14, 0, arg0);
		return local14;
	}
}
