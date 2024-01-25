import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class42_Sub1 extends Class42 {

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
	public Class42_Sub1() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)J")
	@Override
	public long method8006() {
		return System.nanoTime();
	}
}
