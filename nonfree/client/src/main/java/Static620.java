import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static620 {

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "[I")
	public static final int[] anIntArray608 = new int[200];

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "[I")
	public static final int[] anIntArray609 = new int[1024];

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray29 = new boolean[100];

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIBII)V")
	public static void method8394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class8_Sub5_Sub8 local8 = Static509.method7344(8, arg0);
		local8.method3509();
		local8.anInt4329 = arg2;
		local8.anInt4324 = arg3;
		local8.anInt4321 = arg1;
	}
}
