import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public final class Class4 {

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)Z")
	public boolean method202() {
		return Static478.aClass4_7 == this | Static503.aClass4_8 == this;
	}

	@OriginalMember(owner = "client!aba", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
