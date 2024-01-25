import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public final class Class65_Sub2 extends Class65 {

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "()V")
	public Class65_Sub2() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)J")
	@Override
	public long method5484() {
		return System.nanoTime();
	}
}
