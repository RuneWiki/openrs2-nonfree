import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public final class Class203 {

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
	public final int anInt5698;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(I)V")
	public Class203(@OriginalArg(0) int arg0) {
		this.anInt5698 = arg0;
	}

	@OriginalMember(owner = "client!ld", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
