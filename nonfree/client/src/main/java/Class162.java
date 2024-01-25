import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public final class Class162 {

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
	public final int anInt4493;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(II)V")
	public Class162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4493 = arg0;
	}

	@OriginalMember(owner = "client!hn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
