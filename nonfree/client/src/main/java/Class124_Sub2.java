import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public final class Class124_Sub2 extends Class124 {

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)J")
	@Override
	public long method7049() {
		return Static48.method1203() * 1000000L;
	}
}
