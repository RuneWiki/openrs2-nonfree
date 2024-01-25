import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "[I")
	public static final int[] anIntArray11 = new int[4];

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!uu;B)I")
	public static int method420(@OriginalArg(0) Class250 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method5813(Static233.anInt3997)) {
			local5++;
		}
		if (arg0.method5813(Static244.anInt4146)) {
			local5++;
		}
		return local5;
	}
}
