import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public final class Class128 {

	@OriginalMember(owner = "client!gv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)Z")
	public boolean method3186() {
		return Static251.aClass128_4 == this | Static464.aClass128_6 == this;
	}
}
