import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public final class Class172 {

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
	public final int anInt4482;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(I)V")
	public Class172(@OriginalArg(0) int arg0) {
		this.anInt4482 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
