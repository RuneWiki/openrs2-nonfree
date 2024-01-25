import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public final class Class86_Sub1 extends Class86 {

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)J")
	@Override
	public long method4810() {
		return Static95.method1587() * 1000000L;
	}
}
