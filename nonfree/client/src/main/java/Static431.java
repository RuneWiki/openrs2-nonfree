import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
	public static int anInt7564;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIB)V")
	public static void method6023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class1_Sub6_Sub16 local16 = Static212.method3332(7, arg0);
		local16.method6594();
		local16.anInt8204 = arg1;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)Z")
	public static boolean method6024(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}
}
