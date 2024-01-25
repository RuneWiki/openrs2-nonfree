import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public final class Class183_Sub1 extends Class183 {

	@OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "()V")
	public Class183_Sub1() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "(I)J")
	@Override
	public long method7334() {
		return System.nanoTime();
	}
}
