import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
	public static int anInt8853;

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
	public static int anInt8850 = -2;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)V")
	public static void method7829(@OriginalArg(0) int arg0) {
		@Pc(11) Class2_Sub6_Sub12 local11 = Static636.method8647(5, (long) arg0);
		local11.method6245();
	}
}
