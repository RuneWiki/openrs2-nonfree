import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public final class Class210_Sub1 extends Class210 {

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	public Class210_Sub1() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)J")
	@Override
	public long method6281() {
		return System.nanoTime();
	}
}
