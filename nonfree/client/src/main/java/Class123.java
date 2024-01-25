import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public final class Class123 {

	@OriginalMember(owner = "client!hn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)Z")
	public boolean method3505() {
		return Static468.aClass123_5 == this | Static504.aClass123_6 == this;
	}
}
