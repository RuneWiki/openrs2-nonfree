import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public final class Class139_Sub1 extends Class139 {

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "()V")
	public Class139_Sub1() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(B)J")
	@Override
	public long method7431() {
		return System.nanoTime();
	}
}
