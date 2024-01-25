import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public final class Class231_Sub1 extends Class231 {

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	public Class231_Sub1() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)J")
	@Override
	public long method6768() {
		return System.nanoTime();
	}
}
