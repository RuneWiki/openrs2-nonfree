import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public final class Class132_Sub1 extends Class132 {

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "()V")
	public Class132_Sub1() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)J")
	@Override
	public long method6704() {
		return System.nanoTime();
	}
}
