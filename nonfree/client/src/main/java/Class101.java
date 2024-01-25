import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public final class Class101 {

	@OriginalMember(owner = "client!eo", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)Z")
	public boolean method2511() {
		return Static528.aClass101_3 == this | Static540.aClass101_8 == this;
	}
}
