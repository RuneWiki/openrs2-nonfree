import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
	public static int anInt4580;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(BII)V")
	public static void method4106(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class5_Sub1_Sub18 local17 = Static123.method1827((long) arg0, 12);
		local17.method7441();
		local17.anInt8635 = arg1;
	}
}
