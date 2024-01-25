import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public final class Class240 {

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(B)Z")
	public boolean method5517() {
		return Static501.aClass240_6 == this | Static63.aClass240_2 == this;
	}

	@OriginalMember(owner = "client!oda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
