import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public final class Class218 {

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)Z")
	public boolean method5025() {
		return Static32.aClass218_6 == this | Static74.aClass218_5 == this;
	}

	@OriginalMember(owner = "client!naa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
