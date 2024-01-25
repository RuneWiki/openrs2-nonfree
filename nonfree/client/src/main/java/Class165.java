import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public final class Class165 {

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
	public final int anInt4086;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(II)V")
	public Class165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4086 = arg1;
	}

	@OriginalMember(owner = "client!jv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
