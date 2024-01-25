import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
	private Class3_Sub1() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)J")
	@Override
	public long method7050() {
		return System.nanoTime();
	}
}
