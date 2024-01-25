import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public final class Class124_Sub1 extends Class124 {

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
	public Class124_Sub1() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)J")
	@Override
	public long method7049() {
		return System.nanoTime();
	}
}
