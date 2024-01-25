import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
	public static int anInt10413;

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "[I")
	public static int[] anIntArray585;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBI)Z")
	public static boolean method8125(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)V")
	public static void method8127(@OriginalArg(1) int arg0) {
		@Pc(13) Class4_Sub6_Sub5 local13 = Static396.method6079(arg0, 16);
		local13.method2302();
	}
}
