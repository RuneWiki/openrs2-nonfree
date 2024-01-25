import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public final class Class179 {

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
	private final int anInt4442;

	@OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
	public final int anInt4448;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(II)V")
	public Class179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4442 = arg0;
		this.anInt4448 = arg1;
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)I")
	public int method3853() {
		return this.anInt4442;
	}

	@OriginalMember(owner = "client!ju", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
