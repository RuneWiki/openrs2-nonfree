import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public final class Class372 {

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)Z")
	public boolean method8631() {
		return Static372.aClass372_10 == this | Static70.aClass372_12 == this;
	}

	@OriginalMember(owner = "client!wg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
