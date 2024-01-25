import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public final class Class85_Sub1 extends Class85 {

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
	public Class85_Sub1() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)J")
	@Override
	public long method4957() {
		return System.nanoTime();
	}
}
