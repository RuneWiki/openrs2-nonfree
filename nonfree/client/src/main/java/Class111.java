import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public final class Class111 {

	@OriginalMember(owner = "client!ff", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)Z")
	public boolean method3099() {
		return Static650.aClass111_8 == this | Static24.aClass111_1 == this;
	}
}
