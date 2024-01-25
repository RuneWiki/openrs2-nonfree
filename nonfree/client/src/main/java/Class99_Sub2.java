import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public final class Class99_Sub2 extends Class99 {

	@OriginalMember(owner = "client!mha", name = "<init>", descriptor = "()V")
	public Class99_Sub2() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!mha", name = "c", descriptor = "(I)J")
	@Override
	public long method5518() {
		return System.nanoTime();
	}
}
