import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
	public static int anInt6361;

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "F")
	public static float aFloat97;

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
	public static int anInt6364 = 0;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IB)V")
	public static void method5326(@OriginalArg(0) int arg0) {
		@Pc(14) Class6_Sub1_Sub12 local14 = Static449.method5975(arg0, 6);
		local14.method3048();
	}
}
