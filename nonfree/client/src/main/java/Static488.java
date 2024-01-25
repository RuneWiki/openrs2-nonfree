import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "[I")
	public static int[] anIntArray481;

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "[I")
	public static final int[] anIntArray480 = new int[2048];

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "[[B")
	public static final byte[][] aByteArrayArray137 = new byte[50][];

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)V")
	public static void method7175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class8_Sub5_Sub8 local8 = Static509.method7344(15, 0);
		local8.method3509();
		local8.anInt4321 = arg1;
		local8.anInt4324 = arg0;
	}
}
