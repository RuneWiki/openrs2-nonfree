import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public final class Class150 {

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
	public final int anInt4202;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(I)V")
	public Class150(@OriginalArg(0) int arg0) {
		this.anInt4202 = arg0;
	}

	@OriginalMember(owner = "client!jt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
