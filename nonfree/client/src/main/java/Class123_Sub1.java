import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public final class Class123_Sub1 extends Class123 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)J")
	@Override
	public long method6011() {
		return Static626.method8479() * 1000000L;
	}
}
