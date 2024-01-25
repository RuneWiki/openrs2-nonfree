import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public final class Class179_Sub2 extends Class179 {

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
	public Class179_Sub2() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)J")
	@Override
	public long method7485() {
		return System.nanoTime();
	}
}
