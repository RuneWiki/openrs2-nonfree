import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "[I")
	public static final int[] anIntArray981 = new int[200];

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "[I")
	public static final int[] anIntArray982 = new int[50];

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(BI)V")
	public static void method4341(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub10_Sub2 local16 = Static217.method3611(arg0, 7);
		local16.method859();
	}
}
