import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public final class Class77 {

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
	public final int anInt2451;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(I)V")
	public Class77(@OriginalArg(0) int arg0) {
		this.anInt2451 = arg0;
	}

	@OriginalMember(owner = "client!fi", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
