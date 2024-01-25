import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public final class Class339 {

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
	public final int anInt9396;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(I)V")
	public Class339(@OriginalArg(0) int arg0) {
		this.anInt9396 = arg0;
	}

	@OriginalMember(owner = "client!tn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
