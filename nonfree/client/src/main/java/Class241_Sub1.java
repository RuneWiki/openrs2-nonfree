import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public final class Class241_Sub1 extends Class241 {

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V")
	public Class241_Sub1() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Z)J")
	@Override
	public long method7166() {
		return System.nanoTime();
	}
}
