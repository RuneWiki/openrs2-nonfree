import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public final class Class123_Sub2 extends Class123 {

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
	public Class123_Sub2() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(B)J")
	@Override
	public long method2765() {
		return System.nanoTime();
	}
}
