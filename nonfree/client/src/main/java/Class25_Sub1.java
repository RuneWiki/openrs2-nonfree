import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public final class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	public Class25_Sub1() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)J")
	@Override
	public long method4035() {
		return System.nanoTime();
	}
}
