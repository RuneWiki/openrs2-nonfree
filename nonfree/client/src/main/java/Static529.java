import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!ufa", name = "A", descriptor = "[Z")
	public static final boolean[] aBooleanArray31 = new boolean[100];

	@OriginalMember(owner = "client!ufa", name = "C", descriptor = "[I")
	public static final int[] anIntArray438 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!ufa", name = "D", descriptor = "I")
	public static int anInt7348 = 0;

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IILclient!hb;I)V")
	public static void method5913(@OriginalArg(0) int arg0, @OriginalArg(2) Class11_Sub1_Sub1_Sub3_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int[] local14 = new int[4];
		Static598.method772(local14, 0, local14.length, arg2);
		Static221.method3323(local14, arg0, arg1);
	}
}
