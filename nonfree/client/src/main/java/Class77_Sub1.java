import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public final class Class77_Sub1 extends Class77 {

	@OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "()V")
	private Class77_Sub1() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)J")
	@Override
	public long method5828() {
		return System.nanoTime();
	}
}
