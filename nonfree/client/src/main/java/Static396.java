import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "Z")
	public static boolean aBoolean454 = true;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
	public static void method5507(@OriginalArg(0) int arg0) {
		@Pc(16) Class3_Sub5_Sub20 local16 = Static447.method6065((long) arg0, 7);
		local16.method8834();
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	public static void method5509(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static367.anInt10954 = 1;
		Static399.anInt6574 = -1;
		Static220.method3264(arg1, arg0, false);
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)Z")
	public static boolean method5511(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}
}
