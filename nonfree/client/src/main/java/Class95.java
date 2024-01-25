import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public final class Class95 {

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)Z")
	public boolean method2412() {
		return Static310.aClass95_5 == this | Static335.aClass95_6 == this;
	}

	@OriginalMember(owner = "client!faa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
