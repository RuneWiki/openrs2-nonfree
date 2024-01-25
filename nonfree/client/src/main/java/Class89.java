import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public final class Class89 {

	@OriginalMember(owner = "client!ew", name = "f", descriptor = "I")
	public final int anInt3518;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(I)V")
	public Class89(@OriginalArg(0) int arg0) {
		this.anInt3518 = arg0;
	}

	@OriginalMember(owner = "client!ew", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
