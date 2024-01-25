import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public final class Class141 {

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
	public final int anInt4189;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(I)V")
	public Class141(@OriginalArg(0) int arg0) {
		this.anInt4189 = arg0;
	}

	@OriginalMember(owner = "client!hi", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
