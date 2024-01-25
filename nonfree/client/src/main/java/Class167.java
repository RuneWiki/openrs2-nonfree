import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public final class Class167 {

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
	public final int anInt5826;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(I)V")
	public Class167(@OriginalArg(0) int arg0) {
		this.anInt5826 = arg0;
	}

	@OriginalMember(owner = "client!jt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
