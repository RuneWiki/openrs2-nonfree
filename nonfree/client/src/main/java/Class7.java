import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public final class Class7 {

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)Z")
	public boolean method69() {
		return Static532.aClass7_5 == this | Static642.aClass7_7 == this;
	}

	@OriginalMember(owner = "client!ad", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
