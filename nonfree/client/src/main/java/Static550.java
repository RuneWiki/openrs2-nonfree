import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
	public static int anInt9294;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
	public static int anInt9295 = -1;

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
	public static int anInt9297 = 0;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)V")
	public static void method7985(@OriginalArg(0) int arg0) {
		@Pc(16) Class5_Sub5_Sub6 local16 = Static478.method6972((long) arg0, 5);
		local16.method2686();
	}
}
