import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public final class Class104 {

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
	public final int anInt3141;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(I)V")
	public Class104(@OriginalArg(0) int arg0) {
		this.anInt3141 = arg0;
	}

	@OriginalMember(owner = "client!ff", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
