import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public final class Class88 {

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
	public final int anInt2256;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(I)V")
	public Class88(@OriginalArg(0) int arg0) {
		this.anInt2256 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
