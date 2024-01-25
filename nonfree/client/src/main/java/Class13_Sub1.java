import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public final class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "()V")
	public Class13_Sub1() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)J")
	@Override
	public long method9172() {
		return System.nanoTime();
	}
}
