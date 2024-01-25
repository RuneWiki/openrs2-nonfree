import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public final class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!bda", name = "<init>", descriptor = "()V")
	public Class29_Sub1() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)J")
	@Override
	public long method5617() {
		return System.nanoTime();
	}
}
