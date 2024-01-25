import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
	public static int anInt410 = -1;

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
	public static int anInt411 = 0;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
	public static void method399(@OriginalArg(0) int arg0) {
		@Pc(18) Class4_Sub41 local18 = (Class4_Sub41) Static301.aClass198_34.method5261((long) arg0);
		if (local18 != null) {
			local18.method5667();
		}
	}
}
