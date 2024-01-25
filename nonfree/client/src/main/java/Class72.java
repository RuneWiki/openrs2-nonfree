import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public final class Class72 {

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)Z")
	public boolean method1981() {
		return Static460.aClass72_20 == this | Static135.aClass72_28 == this;
	}

	@OriginalMember(owner = "client!dc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
