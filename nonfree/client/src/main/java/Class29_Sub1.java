import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public final class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "()V")
	private Class29_Sub1() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(I)J")
	@Override
	public long method9347() {
		return System.nanoTime();
	}
}
