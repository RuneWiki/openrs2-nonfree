import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!li", name = "d", descriptor = "I")
	public static int anInt5886;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(III)V")
	public static void method5283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class14_Sub2_Sub9 local16 = Static499.method7527((long) arg1, 13);
		local16.method4004();
		local16.anInt4595 = arg0;
	}
}
