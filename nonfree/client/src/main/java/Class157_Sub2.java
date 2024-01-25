import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rla")
public final class Class157_Sub2 extends Class157 {

	@OriginalMember(owner = "client!rla", name = "<init>", descriptor = "()V")
	private Class157_Sub2() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!rla", name = "a", descriptor = "(Z)J")
	@Override
	public long method7779() {
		return System.nanoTime();
	}
}
