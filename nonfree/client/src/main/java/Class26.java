import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public final class Class26 {

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "I")
	public final int anInt622;

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(I)V")
	public Class26(@OriginalArg(0) int arg0) {
		this.anInt622 = arg0;
	}

	@OriginalMember(owner = "client!baa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
