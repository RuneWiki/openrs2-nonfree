import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public final class Class79_Sub1 extends Class79 {

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "()V")
	public Class79_Sub1() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(B)J")
	@Override
	public long method9231() {
		return System.nanoTime();
	}
}
