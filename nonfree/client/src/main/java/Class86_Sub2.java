import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public final class Class86_Sub2 extends Class86 {

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
	public Class86_Sub2() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)J")
	@Override
	public long method4810() {
		return System.nanoTime();
	}
}
