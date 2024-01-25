import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public final class Class310 {

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)Z")
	public boolean method7319() {
		return Static62.aClass310_1 == this | Static138.aClass310_2 == this;
	}

	@OriginalMember(owner = "client!rm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
