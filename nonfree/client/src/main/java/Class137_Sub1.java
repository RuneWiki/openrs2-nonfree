import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public final class Class137_Sub1 extends Class137 {

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V")
	public Class137_Sub1() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)J")
	@Override
	public long method5523() {
		return System.nanoTime();
	}
}
