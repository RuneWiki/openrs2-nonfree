import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public final class Class180 {

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
	public final int anInt4831;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(II)V")
	public Class180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4831 = arg0;
	}

	@OriginalMember(owner = "client!ju", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
