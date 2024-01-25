import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!hj", name = "u", descriptor = "Z")
	public static boolean aBoolean208;

	@OriginalMember(owner = "client!hj", name = "r", descriptor = "[I")
	public static int[] anIntArray256 = new int[2];

	@OriginalMember(owner = "client!hj", name = "t", descriptor = "[I")
	public static final int[] anIntArray257 = new int[5];

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	public static void method2786(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub1_Sub5 local8 = Static431.method5935(3, arg1);
		local8.method521();
		local8.aString2 = arg0;
	}
}
