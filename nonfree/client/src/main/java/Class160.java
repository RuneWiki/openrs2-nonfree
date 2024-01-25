import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public final class Class160 {

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
	public final int anInt5547;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(I)V")
	public Class160(@OriginalArg(0) int arg0) {
		this.anInt5547 = arg0;
	}

	@OriginalMember(owner = "client!jm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
