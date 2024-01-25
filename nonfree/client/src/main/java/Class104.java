import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public final class Class104 {

	@OriginalMember(owner = "client!id", name = "e", descriptor = "I")
	public final int anInt3180;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I)V")
	public Class104(@OriginalArg(0) int arg0) {
		this.anInt3180 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
