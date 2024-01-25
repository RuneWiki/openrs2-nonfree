import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public final class Class151_Sub1 extends Class151 {

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V")
	public Class151_Sub1() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)J")
	@Override
	public long method4619() {
		return System.nanoTime();
	}
}
