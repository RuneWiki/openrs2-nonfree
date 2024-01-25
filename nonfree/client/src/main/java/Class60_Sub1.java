import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public final class Class60_Sub1 extends Class60 {

	@OriginalMember(owner = "client!cja", name = "<init>", descriptor = "()V")
	public Class60_Sub1() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(B)J")
	@Override
	public long method3499() {
		return System.nanoTime();
	}
}
