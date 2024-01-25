import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
	public static int anInt7228 = -1;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V")
	public static void method6397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class14_Sub2_Sub9 local16 = Static499.method7527((long) arg1, 5);
		local16.method4004();
		local16.anInt4595 = arg0;
	}
}
