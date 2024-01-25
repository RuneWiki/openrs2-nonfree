import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!am", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray2 = new boolean[100];

	@OriginalMember(owner = "client!am", name = "D", descriptor = "I")
	public static int anInt593 = 0;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)V")
	public static void method646(@OriginalArg(0) int arg0) {
		@Pc(14) Class6_Sub4_Sub6 local14 = Static68.method1408(12, arg0);
		local14.method3828();
	}
}
