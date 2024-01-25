import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public final class Class158_Sub2 extends Class158 {

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	public Class158_Sub2() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)J")
	@Override
	public long method6230() {
		return System.nanoTime();
	}
}
