import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "[I")
	public static int[] anIntArray7;

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "I")
	public static int anInt71;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(BI)V")
	public static void method103(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub21 local10 = Static57.method8561(arg0, 11);
		local10.method8628();
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)Z")
	public static boolean method104() {
		return Static581.anInt9720 >= 1;
	}
}
