import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public final class Class132_Sub2 extends Class132 {

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)J")
	@Override
	public long method6704() {
		return Static255.method4035() * 1000000L;
	}
}
