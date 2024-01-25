import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public final class Class173 {

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "I")
	public final int anInt4936;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class173(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4936 = arg1;
	}

	@OriginalMember(owner = "client!ju", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
