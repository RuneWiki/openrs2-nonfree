import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)V")
	public static void method7505(@OriginalArg(0) int arg0) {
		@Pc(16) Class5_Sub5_Sub6 local16 = Static478.method6972((long) arg0, 7);
		local16.method2686();
	}
}
