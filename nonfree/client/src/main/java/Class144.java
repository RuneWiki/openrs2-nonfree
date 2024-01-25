import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class144 {

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "[I")
	public static final int[] anIntArray452 = new int[4096];

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray452[local4] = Static196.method3620(local4);
		}
	}
}
