import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
	public static int anInt2275;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V")
	public static void method2171(@OriginalArg(0) int arg0) {
		@Pc(15) Class4_Sub5_Sub11 local15 = Static652.method8695((long) arg0, 3);
		local15.method3956();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZZ)Z")
	public static boolean method2172(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}
}
