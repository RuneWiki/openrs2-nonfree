import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public final class Class123_Sub2 extends Class123 {

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
	private Class123_Sub2() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)J")
	@Override
	public long method6011() {
		return System.nanoTime();
	}
}
