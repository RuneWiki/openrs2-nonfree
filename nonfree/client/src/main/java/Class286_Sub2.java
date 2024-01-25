import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public final class Class286_Sub2 extends Class286 {

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
	public Class286_Sub2() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)J")
	@Override
	public long method6485() {
		return System.nanoTime();
	}
}
