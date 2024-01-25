import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public final class Class295 {

	@OriginalMember(owner = "client!ria", name = "g", descriptor = "I")
	public final int anInt8334;

	@OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(II)V")
	public Class295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8334 = arg0;
	}

	@OriginalMember(owner = "client!ria", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
