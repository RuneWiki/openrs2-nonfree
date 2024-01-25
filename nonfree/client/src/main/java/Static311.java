import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!kia", name = "c", descriptor = "[I")
	public static int[] anIntArray294;

	@OriginalMember(owner = "client!kia", name = "b", descriptor = "I")
	public static int anInt5200 = 0;

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(III)Z")
	public static boolean method4474(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(15) Class216 local15 = Static466.aClass340_6.method7665(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local15.method5044(arg1);
	}
}
