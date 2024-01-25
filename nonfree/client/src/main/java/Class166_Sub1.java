import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public final class Class166_Sub1 extends Class166 {

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "()V")
	public Class166_Sub1() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)J")
	@Override
	public long method6646() {
		return System.nanoTime();
	}
}
