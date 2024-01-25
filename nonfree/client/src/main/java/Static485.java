import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
	public static int anInt8287 = 0;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method7061(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(14) Class6_Sub4_Sub18 local14 = Static565.method7924((long) arg0, 2);
		local14.method7976();
		local14.aString131 = arg1;
	}
}
