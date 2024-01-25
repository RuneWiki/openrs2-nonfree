import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public final class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
	public Class10_Sub2() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(B)J")
	@Override
	public long method5413() {
		return System.nanoTime();
	}
}
