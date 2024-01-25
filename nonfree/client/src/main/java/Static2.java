import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
	public static int anInt10;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
	public static int anInt11 = 0;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public static void method7() {
		@Pc(13) Class4_Sub6_Sub5 local13 = Static396.method6079(0, 15);
		local13.method2302();
	}
}
