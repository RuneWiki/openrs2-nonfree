import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public final class Class171_Sub2 extends Class171 {

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "()V")
	public Class171_Sub2() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)J")
	@Override
	public long method7250() {
		return System.nanoTime();
	}
}
