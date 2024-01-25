import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public final class Class206_Sub2 extends Class206 {

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "()V")
	public Class206_Sub2() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "(I)J")
	@Override
	public long method8384() {
		return System.nanoTime();
	}
}
