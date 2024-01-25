import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(III)I")
	public static int method5244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(43) int local43 = Static594.method7955(arg1 - 1, arg0 - 1) + Static594.method7955(arg1 - 1, arg0 - -1) + Static594.method7955(arg1 + 1, arg0 + -1) + Static594.method7955(arg1 - -1, arg0 + 1);
		@Pc(74) int local74 = Static594.method7955(arg1, arg0 - 1) + Static594.method7955(arg1, arg0 + 1) + Static594.method7955(arg1 + -1, arg0) + Static594.method7955(arg1 + 1, arg0);
		@Pc(79) int local79 = Static594.method7955(arg1, arg0);
		return local74 / 8 + local43 / 16 + local79 / 4;
	}
}
